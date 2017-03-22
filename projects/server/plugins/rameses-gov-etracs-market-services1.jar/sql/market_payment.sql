[getList]
SELECT * FROM market_payment WHERE acctid=$P{acctid}

[getPaymentDetails]
SELECT a.*, a.rate-a.amtpaid AS balance FROM
(SELECT mi.imonth, mi.iyear, 
SUM(mi.amtpaid) AS amtpaid, 
SUM(mi.surchargepaid) AS surchargepaid,  
SUM(mi.interestpaid) AS interestpaid,
MAX(m.rate) AS rate
FROM market_payment_item mi 
INNER JOIN market_payment mp ON mi.parentid=mp.objid
INNER JOIN marketaccount m ON mp.acctid=m.objid
WHERE mp.acctid = $P{acctid}
GROUP BY mp.acctid, mi.iyear, mi.imonth) a 

[getPaymentDetailsByDate]
SELECT mi.* 
FROM market_payment_item mi 
INNER JOIN market_payment mp ON mi.parentid=mp.objid
WHERE mp.acctid=$P{acctid}
AND mp.txndate >= $P{fromdate}
