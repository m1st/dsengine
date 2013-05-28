
package com.dsengine;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(serviceName = "DSEngineService")
public class DSEngineService {
    
    @EJB
    DSActivityFactory activityFactory;

    @WebMethod
    public String[] executeActivity(String activityName) {
        DSActivityInterface act = activityFactory.getActivity(activityName);
        return new String[]{act.execute()};
    }
}
