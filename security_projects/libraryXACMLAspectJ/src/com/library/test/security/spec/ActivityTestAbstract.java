package com.library.test.security.spec;

import com.library.bo.user.*;
import com.library.security.impl.context.ContextManager;
import com.library.security.model.Authorization;
import com.library.security.model.context.Context;
import com.library.security.service.SecurityPolicyService;
import com.library.service.ServiceBO;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.exception.UndefinedSecuritPolicyException;
import com.library.test.security.SecurityPoliciesTest;
import junit.framework.TestCase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * User: Tej
 * Date: 9 mars 2007
 * Time: 13:25:21
 */
public abstract class ActivityTestAbstract extends TestCase {


    // the service class
    protected ServiceBO serviceBO;

    // maps
    protected Map<Method[], Object> activitiesServiceMap;
    protected Map<Class, User> rolesMap;

    // Messages
    public static final String SUCCESS_MESSAGE = "Test succeeded",
            WARNING_MESSAGE = "A potential business fault : ",
            WARNING_MESSAGE_UNKNOWN = "Unknown exception : ",
            ERROR_MESSAGE_UNFEDINED = "Undefined security policy.",
            ERROR_MESSAGE_VIOLATION = "Security policy violation.";

    public static int mutantID = 2;

    public ActivityTestAbstract() {
        super();

        // init mutant id value
        // mutantID = SecurityTestOracle.getCurrentMutantID();


        // ServiceBO.securitPolicyService = null;
        ServiceBO.idSecurityPolicy = mutantID;

        // init user-role map
        initRoles();

        // init data
        initData();


    }


    /**
     * Prepares the arguments
     *
     * @param role the user role to create
     * @param m    the method that will be invoked
     * @return an array containing the method parameters
     */
    protected abstract Object[] prepareArguments(Class role, Method m);

    /**
     * Initializes the security test data
     */
    protected abstract void initData();

    /**
     *
     */
    protected abstract void restoreTestDataState();

    protected void initRoles() {

        //roles

        rolesMap = new HashMap<Class, User>();

        rolesMap.put(Borrower.class, new User("", "", "", "", "", new Borrower(new BorrowerAccount())));
        rolesMap.put(Student.class, new User("", "", "", "", "", new Student(new BorrowerAccount())));
        rolesMap.put(Teacher.class, new User("", "", "", "", "", new Teacher(new BorrowerAccount())));

        rolesMap.put(Personnel.class, new User("", "", "", "", "", new Personnel(new PersonnelAccount())));
        rolesMap.put(Admin.class, new User("", "", "", "", "", new Admin(new PersonnelAccount())));
        rolesMap.put(Director.class, new User("", "", "", "", "", new Director(new PersonnelAccount())));
        rolesMap.put(Secretary.class, new User("", "", "", "", "", new Secretary(new PersonnelAccount())));

    }

    /**
     * Tests the authorizations rules, and print (using the logger) the test result
     * the resturned message are :
     * Warning if there is a non security related problem
     * Error if a security error occured
     * Info
     */
    public void testAuthRules() {

        Collection<Authorization> auths;
        Method[] act;
        Authorization authorization;
        String testMessage;
        Object[] args;

        // info about the mutant
        SecurityPoliciesTest.log.warn(((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.mutantInfo);

        auths = SecurityPoliciesTest.librarySecurityModel.getAuthorisations();

        for (Iterator<Authorization> iterator = auths.iterator(); iterator.hasNext();) {
            authorization = iterator.next();

            // get the activity methods
            act = (Method[]) findKeyForObjectInMap(SecurityPoliciesTest.librarySecurityModel.activities,
                    authorization.getActivity().toUpperCase());

            // get class role
            Class roleClass = (Class) findKeyForObjectInMap(SecurityPoliciesTest.librarySecurityModel.roles,
                    authorization.getRole().toUpperCase());

            // set the context
            ContextManager.currentContext = (Context) findKeyForObjectInMap(SecurityPoliciesTest.librarySecurityModel.contexts,
                    authorization.getContext().toUpperCase());

            // get the service
            Class serviceClass = SecurityPoliciesTest.librarySecurityModel.activitiesServices.get(act);

            // test if it is a current service related rule and print the result
            if (serviceClass.equals(serviceBO.getClass())) {

                for (int i = 0; i < act.length; i++) {
                    args = prepareArguments(roleClass, act[i]);
                    testMessage = secTestOneActivity(act[i], args, authorization.isProhibition());


                    if (testMessage.startsWith(WARNING_MESSAGE) || testMessage.startsWith(WARNING_MESSAGE_UNKNOWN))
                        SecurityPoliciesTest.log.warn("RULE : " + authorization.toString() + ", test result : " + testMessage);

                    else if (testMessage.startsWith(ERROR_MESSAGE_UNFEDINED)
                            || testMessage.startsWith(ERROR_MESSAGE_VIOLATION))
                    {SecurityPoliciesTest.log.error("RULE : " + authorization.toString() + ", test result : " + testMessage);
                     fail("Mutant killed!");
                     }

                    else // success
                    SecurityPoliciesTest.log.info("RULE : " + authorization.toString() + ", test result : " + testMessage);




                    // retore data state in order to be able to continue test
                    restoreTestDataState();
                }
            }
        }


    }

    private String secTestOneActivity(Method m, Object[] args, boolean isProhibition) {

        String testMessage;

        try {
            // test of method
            m.invoke(serviceBO, args);

            // call succeeded here return a success message
            testMessage = SUCCESS_MESSAGE;

        } catch (InvocationTargetException e) {

            // an undefined security policy exception is thrown
            if (e.getTargetException() instanceof UndefinedSecuritPolicyException)
                testMessage = ERROR_MESSAGE_UNFEDINED;
            // a security violation exception is thrown
            else if (e.getTargetException() instanceof SecuritPolicyViolationException) {

                // if it is a prohibition then there is no problem the expected security exception was thrown
                if (isProhibition)
                    testMessage = SUCCESS_MESSAGE;
                else  // it is a permission no exception, security violation
                    testMessage = ERROR_MESSAGE_VIOLATION;


            } else if (e.getTargetException() instanceof BSException)
                // do nothing, only warn, a business related exception
                testMessage = WARNING_MESSAGE + e.getTargetException().getMessage();
            else // test problem
                testMessage = WARNING_MESSAGE_UNKNOWN + e.getTargetException().getMessage();

        } catch (IllegalAccessException e) {
            // a sec test implementation problem
            testMessage = WARNING_MESSAGE_UNKNOWN + e.getMessage();

        }

        return testMessage;
    }

    protected Object findKeyForObjectInMap(Map map, Object o) {

        Object key, entry;

        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
            key = iterator.next();

            entry = map.get(key);

            if (entry.equals(o)) return key;

        }

        // object not found not found
        return null;
    }

    /**
     * Show infos about security rules tested by the security tests
     */
    public void testZinfos() {


        int nbRulesTested = ((SecurityPolicyService) ServiceBO.securitPolicyService).colTestedRule.size();
        int totalNbRules = ((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.getAuthorisations().size()
                - ((SecurityPolicyService) ServiceBO.securitPolicyService).nbHighLevelRules;

        int nbPerm = ((SecurityPolicyService) ServiceBO.securitPolicyService).nbRulesTestedPerm;
        int nbProh = ((SecurityPolicyService) ServiceBO.securitPolicyService).nbRulesTestedProhibit;


        //show infos
        SecurityPoliciesTest.log.info(nbRulesTested + " security rules tested out of : " + totalNbRules);

        SecurityPoliciesTest.log.info(nbPerm + " permission security rules tested");
        SecurityPoliciesTest.log.info(nbProh + " prohibition security rules tested");

        // display not tested rules
        Collection<Integer> colIndexes = ((SecurityPolicyService) ServiceBO.securitPolicyService).colTestedRule;
        ArrayList<Authorization> colRules = (ArrayList<Authorization>) ((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.getAuthorisations();

        Authorization authorization;

        for (Iterator<Authorization> iterator = colRules.iterator(); iterator.hasNext();) {
            authorization = iterator.next();
            if(!colIndexes.contains(colRules.indexOf(authorization)))
                SecurityPoliciesTest.log.info("Rule not tested : " + authorization);


        }



    }
}
