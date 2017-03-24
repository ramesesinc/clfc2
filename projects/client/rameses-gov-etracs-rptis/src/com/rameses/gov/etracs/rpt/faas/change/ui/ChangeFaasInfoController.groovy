package com.rameses.gov.etracs.rpt.faas.change.ui;
        
import com.rameses.rcp.annotations.* 
import com.rameses.rcp.common.* 
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*

public abstract class ChangeFaasInfoController 
{
    @Caller
    def caller;

    @Binding
    def binding;
    
    @Service('FAASChangeInfoService')
    def svc;
    
    def entity;
    def changeinfo;
    
    
    public def getModifiedEntity(){
        return [:]
    }
    
    public void updateEntityInfo(newinfo){
        
    }
    
    public abstract def getAction();
    
    void init(){
        changeinfo = [
            objid       : 'CI' + new java.rmi.server.UID(),
            faasid 	: entity.objid,
            rpid   	: entity.rp.objid,
            rpuid  	: entity.rpu.objid,
            action      : getAction(),
        ];
        
        changeinfo.newinfo = getModifiedEntity();
        changeinfo.previnfo = [:];
        changeinfo.previnfo.putAll(changeinfo.newinfo);
    }
    
    
    def save(){
        if (MsgBox.confirm('Save and apply changes?')){
            svc.updateInfo(changeinfo);
            updateEntityInfo(changeinfo.newinfo);
            caller.refreshForm();
            return '_close';
        }
        return null;
    }
}