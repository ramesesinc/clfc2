[getReceivables]
SELECT br.*, 
  r.code AS account_code, 
  br.taxfeetype AS account_taxfeetype, 
  br.amount - br.amtpaid - br.discount AS total,
  app.appno, br.iyear AS [year] 
FROM business_receivable br 
  LEFT JOIN itemaccount r ON  r.objid=br.account_objid 
  LEFT JOIN business_application app ON app.objid=br.applicationid
WHERE ${filter} AND ((br.amount-br.amtpaid-br.discount) > 0) 
ORDER BY br.iyear DESC, br.lob_name DESC, r.code ASC

[getAllReceivables]
SELECT br.*, 
  r.code AS account_code, 
  br.taxfeetype AS account_taxfeetype, 
  br.amount - br.amtpaid - br.discount AS total,
  app.appno, br.iyear AS [year] 
FROM business_receivable br 
  LEFT JOIN itemaccount r ON  r.objid=br.account_objid 
  LEFT JOIN business_application app ON app.objid=br.applicationid
WHERE ${filter}  
ORDER BY br.lob_name DESC, r.code ASC

[getReceivablePayments]
SELECT bp.refno, bp.refdate, bi.amount, bi.surcharge, bi.interest, bi.qtr, bi.partial 
FROM business_payment_item bi
INNER JOIN business_payment bp ON bi.parentid=bp.objid
WHERE bi.receivableid=$P{receivableid}
ORDER BY bp.refdate DESC

[getAssessmentTaxFees]
SELECT a.* 
FROM (
   SELECT br.*, 
      bl.assessmenttype AS lob_assessmenttype, 
      ri.code AS account_code, 
      br.objid AS receivableid,       
      CASE (br.taxfeetype) 
         WHEN 'TAX' THEN 'Business Tax'
         WHEN 'REGFEE' THEN 'Regulatory Fee'
         ELSE 'Other Charge'
      END AS taxfeetypename,  
      CASE (br.taxfeetype) 
         WHEN 'TAX' THEN 0
         WHEN 'REGFEE' THEN 1
         ELSE 2
      END AS sortorder, 
      (br.amount - br.amtpaid ) AS amtdue,
      br.iyear AS [year]
   FROM business_receivable br
      LEFT JOIN business_application ba ON ba.objid=br.applicationid
      LEFT JOIN business_application_lob bl ON bl.applicationid=br.applicationid AND br.lob_objid=bl.lobid
      LEFT JOIN itemaccount ri ON ri.objid=br.account_objid
   WHERE ${filter}
) a
ORDER BY a.sortorder ASC 

#########################################
# used by BusinessCashReceiptService
#########################################
[getBilling]
SELECT a.* 
FROM (
  SELECT br.*, ba.apptype, ba.appno, ba.appyear, 
    bl.assessmenttype AS lob_assessmenttype,
    ri.code AS account_code, br.objid AS receivableid,
    CASE (br.taxfeetype) 
       WHEN 'TAX' THEN 'Business Tax'
       WHEN 'REGFEE' THEN 'Regulatory Fee'
       ELSE 'Other Charge'
    END AS taxfeetypename,  
    CASE 
       WHEN (br.taxfeetype='TAX' AND NOT(br.lob_objid IS NULL) ) THEN 0
       WHEN (br.taxfeetype='TAX' AND br.lob_objid IS NULL ) THEN 1
       WHEN (br.taxfeetype='REGFEE' AND NOT(br.lob_objid IS NULL) ) THEN 2
       WHEN (br.taxfeetype='REGFEE' AND br.lob_objid IS NULL ) THEN 3
       ELSE 4
    END AS sortorder, 
    br.iyear AS [year]
  FROM business_receivable br
    LEFT JOIN business_application ba ON ba.objid=br.applicationid
    LEFT JOIN business_application_lob bl ON bl.applicationid=br.applicationid AND br.lob_objid=bl.lobid
    LEFT JOIN itemaccount ri ON ri.objid=br.account_objid
  WHERE ${filter} AND (br.amount-br.amtpaid > 0) 
) a 
ORDER BY a.sortorder

[removeReceivables]
DELETE FROM business_receivable WHERE applicationid=$P{applicationid}

[findHasPaidReceivable]
SELECT COUNT(*) AS counter 
FROM business_receivable WHERE applicationid=$P{applicationid} AND amtpaid > 0

[updateReceivable]
UPDATE business_receivable SET amtpaid = amtpaid + $P{amount} WHERE objid = $P{receivableid}

[updateTaxCredit]
UPDATE business_receivable
SET taxcredit = taxcredit + $P{taxcredit} 
WHERE objid = $P{receivableid}

[getOpenReceivablesByBusiness]
SELECT 
   applicationid, appyear, businessid, appno, apptype, 
   SUM(balance) AS balance, businessname, address_text 
FROM (
      SELECT 
         br.applicationid, br.iyear AS appyear, 
         br.businessid, ba.appno,
         CASE 
            WHEN ba.objid IS NULL THEN b.apptype 
            ELSE ba.apptype 
         END AS apptype,
         ( amount - amtpaid - discount ) AS balance, 
         b.businessname, b.address_text
      FROM business_receivable br
         LEFT JOIN business_application ba ON br.applicationid=ba.objid
         INNER JOIN business b ON br.businessid=b.objid
      WHERE ${filter} 
         AND (br.amount-br.amtpaid-br.discount > 0)
)bt 
GROUP BY 
   applicationid, appyear, businessid, appno, 
   apptype, businessname, address_text 

[getOpenReceivablesByOwner]
SELECT 
  br.applicationid, br.iyear AS appyear, b.objid AS businessid, ba.appno,
  CASE WHEN ba.objid IS NULL THEN b.apptype ELSE ba.apptype END AS apptype,
  SUM( amount - amtpaid - discount ) AS balance, b.businessname, b.address_text 
FROM business_receivable br
  LEFT JOIN business_application ba ON ba.objid=br.applicationid
  INNER JOIN business b ON b.objid=br.businessid
WHERE b.owner_objid = $P{ownerid}
  AND (br.amount-br.amtpaid-br.discount > 0)
GROUP BY br.applicationid, br.iyear


[getBusinessListForBilling]
select xx.* from ( 
  select top 100 percent 
    a.objid, a.address_text, a.businessname, a.tradename, 
    a.owner_objid, a.owner_name, a.owner_address_text, a.bin, 
    xx.balance 
  from ( 
    select br.businessid, sum(br.amount-br.amtpaid) as balance 
    from business b 
      inner join business_application a on b.objid = a.business_objid 
      inner join business_receivable br on a.objid = br.applicationid 
    where 1=1 ${filter} 
      and a.state in ('PAYMENT','RELEASE','COMPLETED') 
    group by br.businessid 
    having sum(br.amount-br.amtpaid) > 0 
  )xx inner join business a on xx.businessid = a.objid 
  order by owner_name 
)xx


[getAppListForBilling]
select 
    a.objid AS applicationid, b.objid AS businessid, b.address_text,
    b.businessname, b.tradename, b.owner_objid, b.owner_name, 
    b.owner_address_text, b.bin, a.appno, a.apptype, 
    a.state AS appstate, a.appyear, xx.balance 
from ( 
  select 
      b.objid as businessid, a.objid as applicationid, 
      sum(br.amount-br.amtpaid) as balance 
    from business b 
      inner join business_application a on b.objid = a.business_objid 
      inner join business_receivable br on a.objid = br.applicationid 
    where b.objid = $P{businessid} 
      and a.state in ('PAYMENT','RELEASE','COMPLETED') 
      and a.apptype IN ('NEW','RENEW','RETIRE','ADDITIONAL') 
    group by b.objid, a.objid 
    having sum(br.amount-br.amtpaid) > 0 
)xx inner join business_application a on xx.applicationid = a.objid 
  inner join business b on a.business_objid = b.objid 


[findUnpaidBalance]
select sum(amount-amtpaid-discount) as balance 
from business_receivable 
where applicationid=$P{applicationid}
