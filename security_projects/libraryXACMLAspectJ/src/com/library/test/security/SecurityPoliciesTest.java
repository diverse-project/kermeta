package com.library.test.security;

import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;
import com.library.test.security.servicetest.BookActivitiesTest;
import com.library.test.security.servicetest.BorrowerAccountActivitiesTest;
import com.library.test.security.servicetest.PersonnelAccountActivitiesTest;
import com.library.test.security.spec.ActivityTestAbstract;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * User: Tej
 * Date: 9 mars 2007
 * Time: 08:34:53
 */
public class SecurityPoliciesTest {

    public static LibrarySecurityModel librarySecurityModel;

    public static Logger log = Logger.getLogger(SecurityPoliciesTest.class);

    static {

          // init log
        // PropertyConfigurator.configure("logger.prop");
        BasicConfigurator.configure();
        log.setLevel(Level.WARN);


    }


    public static Test suite() {




        // init test set context configured by test 
        ContextManager.doCalculateContext = false;

        // security policy is used

        librarySecurityModel = new LibrarySecurityModel();

        TestSuite suite = new TestSuite();

        // adding security test classes
        suite.addTestSuite(BookActivitiesTest.class);
        suite.addTestSuite(BorrowerAccountActivitiesTest.class);
        suite.addTestSuite(PersonnelAccountActivitiesTest.class);

        return suite;
    }

       public static void main(String[] args) {

        ActivityTestAbstract.mutantID = Integer.parseInt(args[0]);

        junit.textui.TestRunner.run(suite());
    }


}
