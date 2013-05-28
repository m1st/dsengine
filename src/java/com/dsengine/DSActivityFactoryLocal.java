/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsengine;

import javax.ejb.Local;

/**
 *
 * @author m1st
 */
@Local
public interface DSActivityFactoryLocal {
    
    public DSActivityInterface getActivity(String activityName);
}
