package com.library.service;

import com.library.security.service.SecurityPolicyServiceInterface;
import com.library.security.service.SecurityPolicyService;
import com.library.security.impl.LibrarySecurityModel;

/**
 * User: Tej
 * Date: 8 mars 2007
 * Time: 13:46:23
 */
public class ServiceBO {

    public static SecurityPolicyServiceInterface securitPolicyService;
    public static int idSecurityPolicy = 0;


    public ServiceBO() {
        // init the security service model if it is not already done
        if(securitPolicyService == null)
        {
            securitPolicyService = new SecurityPolicyService(new LibrarySecurityModel(idSecurityPolicy)); 
        }
    }

    /**
     *
     * changes the security policy
     *
     * @param idPolicy the id of the security policy
     */
    public void switchSecurityPolicy(String policyFile, String xacmlConfFile)  {
    	
    		// switch
    		securitPolicyService.switchXACMLPolicyFile(policyFile,xacmlConfFile);

            securitPolicyService = new SecurityPolicyService(new LibrarySecurityModel(xacmlConfFile,policyFile));

    }
}
