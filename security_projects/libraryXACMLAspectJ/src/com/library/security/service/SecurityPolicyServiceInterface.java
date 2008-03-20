package com.library.security.service;

import com.library.security.model.context.Context;

/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 10:42:29
 */
public interface SecurityPolicyServiceInterface {

  



    /**
     * Check the security policy, given the role,activity and view
     * @param role the role parameter (a class that reresents the role)
     * @param activity the requested activity
     * @param view the view that representes the scope of the activity
     * @param context the context of the action
     * @return the authorisation type
     */
    String checkSecurityPolicy(Class role,Object activity,Class view, Context context);


    
    /**
     * Modifies the XACMl configuration file by putting a new value for the policy file 
     * 
     * 
     * @param policyFile The the XACML policy file to put in the configuration file 
     * @param xacmlConfFile
     */
    void switchXACMLPolicyFile(String policyFile , String xacmlConfFile);

}
