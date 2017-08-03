[getList]
SELECT 
	u.objid, 
	u.lastname, 
	u.firstname, 
	u.middlename, 
	u.jobtitle, 
	u.jobtitle AS title, 
	ug.role,
	ugm.objid as usergroupmemberid, 
	ugm.usergroup_objid,
	u.txncode  
FROM sys_usergroup_member ugm 
INNER JOIN sys_user u ON ugm.user_objid=u.objid 
INNER JOIN sys_usergroup ug ON ug.objid=ugm.usergroup_objid 
WHERE ug.role IN (${roles})  
AND u.lastname LIKE $P{searchtext}
ORDER BY u.lastname 

[findMember]
SELECT 
ug.* 
FROM sys_usergroup_member ugm
INNER JOIN sys_usergroup ug ON ug.objid=ugm.usergroup_objid 
WHERE ug.role=$P{usergroupid} and ugm.user_objid=$P{userid}  

[getMembersByRole]
SELECT DISTINCT 
	u.objid, u.username, u.txncode, u.name, 
	u.lastname, u.firstname, u.middlename
FROM ( 
	SELECT objid FROM sys_user WHERE lastname LIKE $P{searchtext} 
	UNION 
	SELECT objid FROM sys_user WHERE firstname LIKE $P{searchtext} 
	UNION 
	SELECT objid FROM sys_user WHERE username LIKE $P{searchtext} 	
)bt 
	INNER JOIN sys_user u ON bt.objid=u.objid 
	INNER JOIN sys_usergroup_member ugm ON u.objid=ugm.user_objid 
	INNER JOIN sys_usergroup ug ON ugm.usergroup_objid=ug.objid 
WHERE ug.role IN (${roles}) 
ORDER BY u.lastname, u.firstname, u.middlename 
