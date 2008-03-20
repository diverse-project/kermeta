package com.library.service;

import com.library.bo.user.User;
import com.library.security.model.context.Context;
import com.library.security.service.SecurityPolicyService;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.exception.UndefinedSecuritPolicyException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.lang.reflect.Method;

/**
 * User: Tej
 * Date: 8 mars 2007
 * Time: 10:30:48
 */
public class ServiceUtils {

    public static Logger log;


    static {
        // init log
        PropertyConfigurator.configure("logger.prop");
        log = Logger.getRootLogger();
    }

    /**
     * Check the security policy
     *
     * @param user     the user who requested the activity
     * @param activity the action
     * @param view     the current view (the action's scope)
     * @param context  the current context temporal context or default one)
     * @throws SecuritPolicyViolationException
     *          if there is a prohibition or undefined policy for those parameters
     * @throws com.library.service.exception.UndefinedSecuritPolicyException
     *       if there is a prohibition or undefined policy for those parameters
     */
    public static void checkSecurity(User user, Method[] activity, Class view, Context context) throws SecuritPolicyViolationException {

        String result;

        // call the security service
        result = ServiceBO.securitPolicyService.checkSecurityPolicy(user.getRole().getClass(), activity, view, context);

        // it is prohibited
        if (result.equals(SecurityPolicyService.PROHIBITION_AUTH)) {

            log.warn("Requested action prohibited " + activity[0] + " By the user " + user.getRole().getRoleName());
            throw new SecuritPolicyViolationException("Security policy violation. The requested activity is prohibited");

        }

        // it is undefined
        if (result.equals(SecurityPolicyService.UNDEFINED_AUTH)) {

            // DEFAULT PROHIBITION _____________________
            // log.warn("Requested action prohibited " + activity[0] + " By the user " + user.getRole().getRoleName());

            log.warn("Requested action undefined behaviour " + activity[0] + " By the user " + user.getRole().getRoleName());
            throw new UndefinedSecuritPolicyException("undefined security policy behaviour." +
                    " The response to the requested request activity is undefined.");
        }

        // log that the security succeeded
        log.info("Permission granted for the requested action " + activity[0] + " By the user " + user.getRole().getRoleName());


    }
}
