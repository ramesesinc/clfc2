package com.rameses.gov.etracs.rpt.report;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.reports.*;
import com.rameses.common.*;

abstract class AsyncReportController
{
    @Binding
    def binding
    
    @Service("ReportParameterService")
    def svcParams;
    
    @Service('DateService')
    def dtSvc
            
    @Service('LGUService')
    def lguSvc

    def clientContext = com.rameses.rcp.framework.ClientContext.currentContext;
    
    def mode;
    def entity = [:];
    def params = [:];
    def reportdata;
    
    def data;
    def asyncHandler;
    def has_result_preview = false; 
    
    
    abstract String getReportName();
    abstract void buildReportData(entity, asyncHandler);
    
    def getFormControl(){
        return null;
    }
    
    
    SubReport[] getSubReports(){
        return null;
    }
    
    Map getParameters(){
        return [:]
    }
    
    
    def initReport(){
        return 'default'
    }
    
    def init() {
        def parsedate = dtSvc.parseCurrentDate();
        entity.year = parsedate.year;
        entity.qtr  = parsedate.qtr;
        entity.month = getMonthsByQtr().find{it.index == parsedate.month}
        mode = 'init'
        return initReport();
    }
    
    
    
    def preview() {
        asyncHandler = [
            onError: {o-> 
                MsgBox.err(o.message); 
                back();
                binding.refresh(); 
            }, 
            onTimeout: {
                asyncHandler.retry(); 
            },
            onCancel: {
                binding.fireNavigation( back() );
            }, 
            onMessage: {o-> 
                if (o == com.rameses.common.AsyncHandler.EOF) {
                    if (!has_result_preview) {
                        back();
                        binding.refresh(); 
                    } 
                    
                } else if (o instanceof Throwable) { 
                    MsgBox.err(o.message); 
                    asyncHandler.cancel();
                    back();
                    binding.refresh();
                    
                } else {
                    data = o;     
                    has_result_preview = true; 
                    binding.fireNavigation( buildReport( data.reportdata ) ); 
                }
            } 
        ] as com.rameses.common.AbstractAsyncHandler 
        
        has_result_preview = false; 
        buildReportData(entity, asyncHandler); 
        mode = 'processing'; 
        return null; 
    } 
    
    /*
    def previewReport() {
        buildReport()
        mode = 'view';
        return 'preview'; 
    }
    */
    
    void print() {
        asyncHandler = [
            onError: {o-> 
                MsgBox.err(o.message); 
                back();
                binding.refresh(); 
            }, 
            onTimeout: {
                asyncHandler.retry(); 
            },
            onCancel: {
                back();
                binding.refresh(); 
            }, 
            onMessage: {o-> 
                if (o == com.rameses.common.AsyncHandler.EOF) {
                    if (!has_result_preview) {
                        back();
                        binding.refresh(); 
                    } 
                    
                } else if (o instanceof Throwable) { 
                    MsgBox.err(o.message); 
                    asyncHandler.cancel();
                    back();
                    binding.refresh(); 
                    
                } else {
                    data = o;                
                    has_result_preview = true; 
                    printReport( data.reportdata ); 
                    back();
                    binding.refresh(); 
                }
            } 
        ] as com.rameses.common.AbstractAsyncHandler 
        
        has_result_preview = false; 
        buildReportData(entity, asyncHandler); 
        mode = 'processing'; 
    } 
    
    /*
    
    void printReport( data ){
        buildReport( data ); 
        ReportUtil.print( report.report, true )
    }
    */
        
    
    def buildReport( data ) {
        reportdata = data; 
        params = svcParams.getStandardParameter() + getParameters(); 
        params.WATERMARK = getInputStream( 'lgu-watermark.png' )         
        params.LOGOLGU = getInputStream( 'lgu-logo.png' ) 
        report.viewReport();
        mode = 'view'; 
        return 'preview'; 
    }

    String getImagePath( def imagename ) {
        def appEnv = clientContext.appEnv; 
        def customfolder = appEnv['report.custom'];
        if (!customfolder) customfolder = appEnv['app.custom'];
        
        def path = 'images/' + imagename 
        if( customfolder ) { 
            def cpath = 'images/' + customfolder + '/' + imagename  
            if( clientContext.getResource(cpath) )  path = cpath 
        } 

        return path 
    }
    
    InputStream getInputStream( def imagename) {
        return clientContext.classLoader.getResourceAsStream( getImagePath( imagename ) );
    }
        
    def report = [
        getReportName : { return getReportName() }, 
        getReportData : { return reportdata },
        getSubReports : { return getSubReports() },
        getParameters : { 
            return  params 
        }
    ] as ReportModel;
    
    def back() {
        mode = 'init'
        return 'default' 
    }
    
    List getQuarters() {
        return [1,2,3,4]
    }
        
    List getMonthsByQtr() {
        return dtSvc.getMonthsByQtr( entity.qtr );
    }
    
    List getMonths(){
        return getMonthsByQtr();
    }
    
    List getClassifications(){
        return svc.getClassifications()
    }
    
    
    def getLgus(){
        def orgclass = OsirisContext.env.ORGCLASS
        def orgid = OsirisContext.env.ORGID

        if ('PROVINCE'.equalsIgnoreCase(orgclass)) {
            return lguSvc.lookupMunicipalities([:])
        }
        else if ('MUNICIPALITY'.equalsIgnoreCase(orgclass)) {
            return [lguSvc.lookupMunicipalityById(orgid)]
        }
        else if ('CITY'.equalsIgnoreCase(orgclass)) {
            return [lguSvc.lookupCityById(orgid)]
        }
        return []
    }

    def getBarangays(){
        if (! entity.lgu)
            return [];
        return lguSvc.lookupBarangaysByRootId(entity.lgu?.objid);
    }
    
    def cancel() {
        asyncHandler?.cancel(); 
        return back(); 
    } 
        
}