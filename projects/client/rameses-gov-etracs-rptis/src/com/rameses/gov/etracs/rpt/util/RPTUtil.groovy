package com.rameses.gov.etracs.rpt.util;

import java.math.BigDecimal;

class RPTUtil
{
    
    
    public static def sum( list, field  ) {
        def total = list."$field".sum()
        if (total == null) total = 0.0
        return total
    }

    
    public static def generateId(prefix){
        return prefix + new java.rmi.server.UID();
    }
    
    public static void required( caption, value ) {
        def msg = caption + ' is required.'
        if ( value == null ) throw new Exception(msg)
        if ( !(value instanceof Number)  && !value) throw new Exception( msg )
    }
    
    public static boolean isTrue(value){
        return toBoolean(value, false) == true
    }
    
    public static boolean toBoolean(value, defvalue){
        if (value == null) 
        return defvalue;

        if (value instanceof Boolean) 
        return value;

        if ('1/y/yes/t/true'.indexOf(value.toString()) >= 0 ) 
        return true;
        
        return false;
    }
    
    public static def toDecimal(value){
        if (value instanceof BigDecimal ) 
        return value;
        return new BigDecimal(value.toString())
    }
    
    public static def toInteger(value){
        if (value instanceof Integer)
        return value;
        def bd = new BigDecimal(value.toString())
        return bd.intValue();
    }
    
    
    public static void buildPin(entity, varSvc){       
        def newpin = new StringBuilder();

        def provcity = entity.barangay?.provcity;
        def munidistrict = entity.barangay?.munidistrict;

        if( provcity ) {
            newpin = provcity.indexno + '-';
        }
        else {
            newpin = '000-';
        }

        if( munidistrict ) {
            newpin += munidistrict.indexno + '-';
        }
        else {
            newpin += '00-';
        }


        if( entity.barangay && entity.barangay.oldindexno == null) {
            entity.barangay.oldindexno = entity.barangay.indexno ;
        }

        if( entity.barangay && entity.pintype == 'new') {
            newpin += entity.barangay?.indexno + '-';
        }
        else if( entity.barangay && entity.pintype == 'old') {
            newpin += entity.barangay?.oldindexno + '-';
        }
        else {
            newpin += ( entity.pintype == 'new' ? '0000' : '000') + '-';
        }        
        
        def ssection = '';
        def sparcel = '';

        def sectionlen = getSectionLength(varSvc?.get('pin_section_length'), entity.pintype)
        def parcellen = getParcelLength(varSvc?.get('pin_parcel_length'), entity.pintype)
        
        if (entity.pintype == 'old'){
            sectionlen = 2;
            parcellen = 3;
        }
        
        if( entity.isection > 0 ) {
            ssection = entity.isection.toString();
            ssection = ssection.padLeft(sectionlen,'0');
            entity.section = ssection;
            newpin += ssection + '-';
        }
        else {
            ssection = ssection.padLeft(sectionlen,'0');
            newpin += ssection + '-';
        }

        
        if( entity.iparcel > 0 ) {
            sparcel = entity.iparcel.toString();
            sparcel = sparcel.padLeft(parcellen,'0')
            entity.parcel = sparcel;
            newpin += sparcel;
        }
        else {
            sparcel = sparcel.padLeft(parcellen,'0')
            newpin += sparcel ;
        }
        if (entity.rputype != 'land'){
            if (validSuffix(entity))
                newpin += '-' + entity.suffix;
        }

        if (entity.claimno){
            newpin += '-' + entity.claimno
        }
        
        entity.pin= newpin;
        entity.fullpin = newpin;

    }
    
    static int getParcelLength(parcellen, pintype){
        int len = 3; //default old 
        try{
            len = new java.math.BigDecimal(parcellen).intValue();
        }
        catch(e){
            if (pintype.equalsIgnoreCase('new'))
            len = 2;
        }
        return len;
    }
    
    
        
    static int getSectionLength(sectionlen, pintype){
        int len = 2; //default old 
        try{
            len = new java.math.BigDecimal(sectionlen).intValue();
        }
        catch(e){
            e.printStackTrace();
            if (pintype.equalsIgnoreCase('new'))
            len = 3;
        }
        return len;
    }
    
    static boolean validSuffix(entity){
        def valid = false;
        if (entity.rputype == 'land')
        valid = true;
        else if (entity.rputype == 'bldg' && entity.suffix >= 1001 && entity.suffix <= 1999)
        valid = true;
        else if (entity.rputype == 'mach' && entity.suffix >= 2001 && entity.suffix <= 2999)
        valid = true;
        else if (entity.rputype == 'planttree' && entity.suffix >= 3001 && entity.suffix <= 3999)
        valid = true;
        else if (entity.rputype == 'misc' && ((entity.suffix >= 5001 && entity.suffix <= 5999) || (entity.suffix >= 7001 && entity.suffix <= 7999)))
        valid = true;
        
        return valid;
    }
}