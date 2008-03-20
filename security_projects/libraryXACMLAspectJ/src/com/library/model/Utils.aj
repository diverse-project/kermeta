package com.library.model;

import java.lang.reflect.Method;

import com.library.bo.user.User;
import com.library.security.model.context.Context;
import com.library.security.service.SecurityPolicyService;
import com.library.service.ServiceBO;
import com.library.service.ServiceUtils;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.exception.UndefinedSecuritPolicyException;

public aspect Utils {

	
	
	public static void checkSecurity(User user, Method[] activity, Class view, Context context) throws SecuritPolicyViolationException {

        String result;

        // call the security service
        result = ServiceBO.securitPolicyService.checkSecurityPolicy(user.getRole().getClass(), activity, view, context);

        // it is prohibited
        if (result.equals(SecurityPolicyService.PROHIBITION_AUTH)) {

        	ServiceUtils.log.warn("Requested action prohibited " + activity[0] + " By the user " + user.getRole().getRoleName());
            throw new SecuritPolicyViolationException("Security policy violation. The requested activity is prohibited");
            
            
            
        }

        // it is undefined
        if (result.equals(SecurityPolicyService.UNDEFINED_AUTH)) {

            // DEFAULT PROHIBITION _____________________
            // log.warn("Requested action prohibited " + activity[0] + " By the user " + user.getRole().getRoleName());

        	ServiceUtils.log.warn("Requested action undefined behaviour " + activity[0] + " By the user " + user.getRole().getRoleName());
            throw new UndefinedSecuritPolicyException("undefined security policy behaviour." +
                    " The response to the requested request activity is undefined.");
        }

        // log that the security succeeded
        ServiceUtils.log.info("Permission granted for the requested action " + activity[0] + " By the user " + user.getRole().getRoleName());


    }
    
	
	
}
