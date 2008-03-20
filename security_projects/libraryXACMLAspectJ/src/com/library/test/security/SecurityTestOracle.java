package com.library.test.security;

import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;
import com.library.test.security.servicetest.BookActivitiesTest;
import com.library.test.security.servicetest.BorrowerAccountActivitiesTest;
import com.library.test.security.servicetest.PersonnelAccountActivitiesTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 09:59:40
 */
public class SecurityTestOracle {

    private static int NB_MUTANT = 10;
    private static int currentMutantID = 1;
    public static int nbTestDone = 0;

    public static Logger log = Logger.getLogger(SecurityPoliciesTest.class);

    /**
     * run one test
     *
     * @return a test containing one run
     */
    public static Test oneTestsuite() {

        // init log
        // PropertyConfigurator.configure("logger.prop");
        BasicConfigurator.configure();
        log.setLevel(Level.ALL);

        // init test set context configured by test
        ContextManager.doCalculateContext = false;

        // security policy is used

        SecurityPoliciesTest.librarySecurityModel = new LibrarySecurityModel();

        TestSuite suite = new TestSuite();

        // adding security test classes
        suite.addTestSuite(BookActivitiesTest.class);
        suite.addTestSuite(BorrowerAccountActivitiesTest.class);
        suite.addTestSuite(PersonnelAccountActivitiesTest.class);


        return suite;
    }

    public static Test suite() {

        TestSuite suite = new TestSuite();


        int nbMutant = NB_MUTANT;
        while (nbMutant > 1) {
            suite.addTest(oneTestsuite());
            nbMutant--;


        }

        return suite;
    }

    /**
     * Calculate the current mutant id.
     * The id change when on test suite is done (3 tests are finished)
     *
     * @return the current mutant id
     */
    public static int getCurrentMutantID() {

        if (nbTestDone == 3) {

            currentMutantID++;
            nbTestDone = 0;
        }

        nbTestDone++;


        return currentMutantID;


    }

    public static void main(String[] args) {


        try {
            String cmd = "\"C:\\Program Files\\Java\\jdk1.5.0_11\\bin\\java\"" +
                    " -classpath \"C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\charsets.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\deploy.jar;C:\\Program Files\\Java\\jdk1.5.0_11" +
                    "\\jre\\lib\\javaws.jar;C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\jce.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\jsse.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\plugin.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\rt.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\ext\\dnsns.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\ext\\localedata.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\ext\\sunjce_provider.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\jre\\lib\\ext\\sunpkcs11.jar;" +
                    "C:\\eclipse_workspace\\Library\\bin\\test\\Library;" +
                    "C:\\eclipse_workspace\\Library\\bin\\production\\Library;C:\\mysql-connector-java-3.0.17-ga-bin.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\lib\\junit-4.1.jar;" +
                    "C:\\Program Files\\Java\\jdk1.5.0_11\\lib\\log4j-1.2.14.jar;" +
                    "C:\\Program Files\\JetBrains\\IntelliJ IDEA 6.0\\lib\\idea_rt.jar\"" +
                    " com.library.test.security.SecurityPoliciesTest";

            int i = 1;
            while (i < 10) {
                Runtime.getRuntime().exec(cmd + i);
                i++;

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }

}
