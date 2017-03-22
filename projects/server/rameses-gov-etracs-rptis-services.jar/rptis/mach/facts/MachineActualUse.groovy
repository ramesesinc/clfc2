package rptis.mach.facts;

import rptis.facts.*;
import java.math.*;

public class MachineActualUse {
    String actualuseid 
    Double basemarketvalue
    Double marketvalue
    Double assesslevel
    Double assessedvalue

    //data reference
    def entity    

    public MachineActualUse(){}

    public MachineActualUse(mu){
        this.actualuseid  = mu.actualuse.objid 
        this.entity       = mu 

        setBasemarketvalue(mu.basemarketvalue)
        setMarketvalue(mu.marketvalue)
        setAssesslevel(mu.assesslevel)
        setAssessedvalue(mu.assessedvalue)
    }

    void setBasemarketvalue( basemarketvalue ){
        this.basemarketvalue = basemarketvalue
        entity.basemarketvalue = new BigDecimal(basemarketvalue+'')
    }

    void setMarketvalue( marketvalue ){
        this.marketvalue = marketvalue
        entity.marketvalue = new BigDecimal(marketvalue+'')
    }

    void setAssesslevel( assesslevel ){
        this.assesslevel = assesslevel
        entity.assesslevel = new BigDecimal(assesslevel+'')
    }

    void setAssessedvalue( assessedvalue ){
        this.assessedvalue = assessedvalue
        entity.assessedvalue = new BigDecimal(assessedvalue+'')
    }

}

