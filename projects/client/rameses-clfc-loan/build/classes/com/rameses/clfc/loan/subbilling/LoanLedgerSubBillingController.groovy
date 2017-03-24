package com.rameses.clfc.loan.subbilling;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.common.*;
import java.rmi.server.UID;

class LoanLedgerSubBillingController extends CRUDController
{   
    @Caller
    def caller;
    
    @Binding
    def binding;
        
    String serviceName = 'LoanLedgerSubBillingService';
    String entityName = 'ledgersubbilling';

    def collectorLookup = Inv.lookupOpener('route-collector:lookup', [
         onselect: { o->
             if (o.objid == entity?.prevcollector?.objid) {
                 throw new Exception('Cannot select previous collector as new collector.');
             }
             
             entity.collector = o;
             binding?.refresh();
         }
    ]);

    boolean allowApprove = false;
    boolean allowCreate = false;
    boolean allowDelete = false;
    boolean allowEdit = true;
    
    def billing;
    
    Map createEntity() {
        println 'create';
        if (entity) billing = entity;
        //def routes = service.getBillingRoutes([billingbillingid: billing.objid]);
        def routes = service.getBillingRoutes([routes: billing?.routes, billingid: billing?.objid]);
        def data = [ 
            objid           : 'LSA' + new UID(),
            billingid       : 'LSB' + new UID(),
            prevcollector   : billing?.collector,
            routes          : routes,
            billdate        : billing?.billdate,
            prevbillingid   : billing?.objid
        ];
        if (routes) {
            def r = routes[0];
            data.previtemid = r.itemid;
        }
        
        return data;
    }
    
    void beforeOpen( params ) {
        params.objid = entity?.subbillingid;
    }

    void afterOpen( data ) {
        allowEdit = true;
        if (!data.editable) {
            allowEdit = false;
        }
        binding?.refresh();
        listHandler?.reload();
    }
  
    void afterSave( data ) {
        caller?.setSubBiling(data?.objid);
        caller?.binding?.refresh('formActions');
        caller?.refreshList();
        /*
        if (!billing.subbillingid) {
            billing.subbillingid = data.objid;
            caller?.binding.refresh('formActions');
        }
        */
    }

    def listHandler = [
        fetchList: { 
            if (!entity.routes) entity.routes = [];
            return entity.routes;
        }
    ] as BasicListModel;
}