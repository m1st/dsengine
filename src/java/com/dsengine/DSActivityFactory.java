
package com.dsengine;

import javax.ejb.Singleton;

@Singleton
public class DSActivityFactory implements DSActivityFactoryLocal {
    
    @Override
    public DSActivityInterface getActivity(String activityName) {
        return null;
    }
}
