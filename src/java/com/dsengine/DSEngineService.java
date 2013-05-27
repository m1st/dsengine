
package com.dsengine;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author m1st
 */
@WebService(serviceName = "DSEngineService")
public class DSEngineService {

    @WebMethod(operationName = "qqq")
    public String[] qqq() {
        //TODO write your implementation code here:
        return new String[]{"aaa", "bbb"};
    }
}
