package com.rameses.clfc.android.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rameses.db.android.DBContext;

public class DBRemarksService extends AbstractDBMapper 
{
	public String getTableName() { return "remarks"; }
	
	public boolean hasUnpostedRemarks() throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE state='PENDING' and forupload=1 LIMIT 1";
			return (ctx.getCount(sql, new Object[]{}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasUnpostedRemarksByCollector(String id) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE state = 'PENDING' AND collector_objid=? LIMIT 1";
			return (ctx.getCount(sql, new Object[]{id}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasUnpostedRemarksByCollectorAndItemid(String id, String itemid) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE state = 'PENDING' ";
			sql += "AND collector_objid = '" + id + "' ";
			sql += "AND itemid = '" + itemid + "' ";
			sql += "LIMIT 1";
			return (ctx.getCount(sql, new Object[]{}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasUnpostedRemarksById(String id) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE state='PENDING' AND objid=? LIMIT 1";
			return (ctx.getCount(sql, new Object[]{id}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasRemarksByItem(String itemid) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE itemid=?";
			return (ctx.getCount(sql, new Object[]{itemid}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasRemarksById(String id) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE objid=? LIMIT 1";
			return (ctx.getCount(sql, new Object[]{id}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasRemarksByRoutecode(String routecode) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE routecode=? LIMIT 1";
			return (ctx.getCount(sql, new Object[]{routecode}) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}	
	
	public Map findRemarksById(String id) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT * FROM "+getTableName()+" WHERE objid=?";
			return ctx.find(sql, new Object[]{id});
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public List<Map> getForUploadRemarks(int limit) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT * FROM " + getTableName() + " WHERE forupload=1 AND state='PENDING'";
			if (limit > 0) sql += " LIMIT " + limit;
			return ctx.getList(sql, new Object[]{});
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public List<Map> getForUploadRemarks() throws Exception {
		return getForUploadRemarks(0);
	}
	
	public List<Map> getRemarksForDateResolving() throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT * FROM " + getTableName() + " WHERE dtposted IS NULL";
			return ctx.getList(sql, new HashMap());
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public boolean hasRemarksForDateResolving() throws Exception {
		DBContext ctx= createDBContext();
		try {
			String sql = "SELECT objid FROM " + getTableName() + " WHERE dtposted IS NULL LIMIT 1";
			return (ctx.getCount(sql, new HashMap()) > 0);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public List<Map> getPendingRemarks(int limit) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT * FROM "+getTableName()+" WHERE state='PENDING' ";
			if (limit > 0) sql += "LIMIT "+limit;
			return ctx.getList(sql, new Object[]{});
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}		
	}
	
	public List<Map> getPendingRemarks() throws Exception {
		return getPendingRemarks(0);
	} 
	
	public List<Map> getRemarksByItem(String itemid) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "SELECT * FROM " + getTableName() + " WHERE itemid=?";
			return ctx.getList(sql, new Object[]{itemid});
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
	
	public void closeRemarks(String id) throws Exception {
		DBContext ctx = createDBContext();
		try {
			String sql = "UPDATE " + getTableName() + " SET state = 'CLOSE' WHERE objid = '" + id + "'";
			ctx.execute(sql);
		} catch (Exception e) {
			throw e;
		} finally {
			if (isCloseable()) ctx.close();
		}
	}
}
