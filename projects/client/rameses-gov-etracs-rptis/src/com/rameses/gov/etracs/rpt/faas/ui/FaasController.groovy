package com.rameses.gov.etracs.rpt.faas.ui;
        
import com.rameses.rcp.annotations.* 
import com.rameses.rcp.common.* 
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*
import com.rameses.gov.etracs.rpt.util.*;

public class FaasController 
{
    @Binding
    def binding;
    
    @Invoker
    def invoker;
    
    @Service('FAASService')
    def service;
    
    @Service('RPUService')
    def rpuSvc;
    
    @Service('Var')
    def var;
    
    def MODE_CREATE = 'create';
    def MODE_EDIT   = 'edit';
    def MODE_READ   = 'read';
    
    def entity;
    def mode = 'read';
    def rpuopener;
    def callbacks;
    
    def taskstate;
    def assignee;    
    
        
    String entityName = 'faas';
    
    void recalc(){
        if (rpuopener.handle)
            rpuopener.handle.recalculate();
    }
    
    public String getRpuOpenerName(){
        return 'rpu' + entity.rpu.rputype
    }
    
    public String getTitle(){
        def t = getFaasType();    
        if (mode == MODE_CREATE){
            t += '(New)';
        }
        else{
            if (entity.state == 'CANCELLED'){
                t += '  Cancelled By TD No. ' + entity.cancelledbytdnos 
                t += '  Reason: ' + entity.cancelreason 
                t += '  Date: ' + entity.canceldate 
            }
        }
        return t;
    }
    
    @FormTitle
    @FormId
    public String getFormId(){
        return 'FAAS : ' + (entity.tdno ? entity.tdno : entity.utdno);
    }
    
    
    void create(){
        loadRpuOpener();
        mode = MODE_CREATE;
    }
    
    void open(){
        entity.putAll(service.openFaas(entity));
        afterOpen();
        if (taskstate) entity.taskstate = taskstate;
        if (assignee) entity.assignee = assignee;
        loadRpuOpener();
        mode = MODE_READ;
    }
    
    void cancel(){
        entity.putAll(service.openFaas(entity));
        if (taskstate) entity.taskstate = taskstate;
        if (assignee) entity.assignee = assignee;
        
        mode = MODE_READ;
    }

    void afterOpen(){}
    
    
    void loadRpuOpener(){
        if (! callbacks){
            callbacks = [
                allowEdit         : allowEditCallback,
                allowEditPinInfo  : allowEditPinInfoCallback,
                allowEditPrevInfo : allowEditPrevInfoCallback,
                allowEditOwner    : allowEditOwnerCallback,
                showActions       : showActionsCallback,
            ]
        }
        rpuopener = InvokerUtil.lookupOpener(rpuOpenerName + ':open', [
                entity    : entity,
                callbacks : callbacks,
        ]);
    }
    
    /*-----------------------------------------------------
     * 
     * DOCUMENT SUPPORT 
     *
     *----------------------------------------------------*/
    void edit(){
        mode = MODE_EDIT;
    }
    
    
    void cancelEdit(){
        entity.putAll(service.openFaas(entity));
        if (taskstate) entity.taskstate = taskstate;
        if (assignee) entity.assignee = assignee;
        mode = MODE_READ;
    }
    
    
    void save(){
        if (mode == MODE_CREATE)
            entity.putAll(service.createFaas(entity));
        else 
            entity.putAll(service.updateFaas(entity));
        mode = MODE_READ;
    }
    
    
    def delete(){
        if (MsgBox.confirm('Delete FAAS?')){
            service.deleteFaas(entity);
            return '_close';
        }
        return null;
    }

    def getLookupTaxpayer(){
        return InvokerUtil.lookupOpener('entity:lookup',[
            onselect : { 
                updateOwnershipInfo(it);
            },
            onempty  : { 
                entity.taxpayer = null;
                entity.owner    = null;
            } 
        ])
    }
    
    void updateOwnershipInfo(taxpayer){
        def address = taxpayer.address.text 
        entity.taxpayer = taxpayer;
        entity.taxpayer.address = address
        entity.owner = [name:taxpayer.name, address:address];
        if (isFormalizeOwnerName(taxpayer)){
            entity.owner.name = service.formalizeOwnerInfo(taxpayer.objid);
        }
        if ( RPTUtil.toBoolean(entity.datacapture, true)){
            entity.prevowner = entity.owner.name;
        }
        binding.refresh('entity.taxpayer.*|entity.owner.*|entity.prevowner.*');
    }
    
    boolean isFormalizeOwnerName(taxpayer){
        if (taxpayer.type != 'INDIVIDUAL')
            return false;
        return RPTUtil.isTrue(var.get('faas_formalize_owner_name'));
    }
    
    def popupChangeInfo(def inv) {
        def popupMenu = new PopupMenuOpener();
        def list = InvokerUtil.lookupOpeners( inv.properties.category, [entity:entity] );
        list.each{
            popupMenu.add( it );
        }
        return popupMenu;
    }
    
    
    /*===============================================
     *
     * EDITABILITY SUPPORT
     *
     *===============================================*/
        
    public boolean getAllowEditOwner() {
        return allowEditOwnerCallback();
    }
    
    def allowEditOwnerCallback = {
        return RPTUtil.toBoolean(entity.txntype.allowEditOwner, false);
    }
    
    def allowEditCallback = {
        if ( mode == MODE_READ) return false;
        if ( entity.state == 'CURRENT' ) return false;
        if ( entity.state == 'CANCELLED' ) return false;
        return true;
    }
    
    boolean getAllowEdit(){
        return allowEditCallback();
    }
    
    def allowEditPinInfoCallback = {
        if ( mode == MODE_READ) return false;
        if( rpu.rputype != 'land' ) return false;
        return getAllowEditPin()
    }
    
    boolean getAllowEditPinInfo(){
        return allowEditPinInfoCallback();
    }
    
    def allowEditPrevInfoCallback = {
        if ( mode == MODE_READ) return false;
        if( entity.state == 'CURRENT' ) return false
        if( entity.state == 'CANCELLED' ) return false
        if( util.toBoolean(entity.datacapture, false) == true) return false 
        return true 
    }
    
    boolean getAllowEditPrevInfo(){
        return getAllowEditPrevInfoCallback();
    }
    
    
    def showActionsCallback = {
        if (entity.taskstate && entity.taskstate.matches('assign.*')) return false;
        if (entity.taskstate && !entity.taskstate.matches('examiner|receiver|appraiser|taxmapper')) return false;
        if (entity.state.matches('CURRENT|CANCELLED')) return false;
        if (OsirisContext.env.USERID != entity.assignee.objid) return false;
        if (mode != MODE_READ) return false;
        return true;
    }
    
    boolean getShowActions(){
        return showActionsCallback();
    }
        
    
    
    /*===============================================
     *
     * Support Methods
     *
     *===============================================*/
     
     List getRestrictions(){
         return LOV.RPT_FAAS_RESTRICTIONS*.key
     }
     
     
     List getQuarters() { 
         return [1,2,3,4];
     }
     
     
     def closeForm(){
         return '_close'
     }
     
    def getShowAnnotation(){
        return entity.annotated
    }
    
    def getExemptions(){
        return rpuSvc.getExemptionTypes();
    }
    
    def getFaasType(){
        def t = '';
        if (entity.rpu.rputype == 'land')
            t += 'FAAS Land ';
        else if (entity.rpu.rputype == 'bldg')
            t += 'FAAS Building ';
        else if (entity.rpu.rputype == 'mach')
            t += 'FAAS Machine ';
        else if (entity.rpu.rputype == 'planttree')
            t += 'FAAS Plant/Tree ';
        else
            t += 'FAAS Miscellaneous ';
        return t;
    }
     
    
    
    @PropertyChangeListener
    def listener = [
        'entity.administrator.*' : {
            if ( RPTUtil.toBoolean(entity.datacapture, true)){
                entity.prevadministrator = entity.administrator?.name
            }
        },
    ]
    
    
    void refreshForm(){
        binding.refresh('entity.*|rpuopener');
    }
     
}