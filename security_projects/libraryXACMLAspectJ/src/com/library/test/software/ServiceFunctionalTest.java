package com.library.test.software;

import com.library.security.impl.context.ContextManager;
import com.library.test.software.sevicetest.BookServiceTest;
import com.library.test.software.sevicetest.BorrowerAccountServiceTest;
import com.library.test.software.sevicetest.PersonnelAccountServiceTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 15:09:40
 */
public class ServiceFunctionalTest {

    public static Logger log;

    static {
        // init log
      //  try {
            // log = Logger.getLogger("test");

            // Logger.getRootLogger().addAppender(new FileAppender(new SimpleLayout(), "testDebug.log"));
            // Logger.getRootLogger().addAppender(new ConsoleAppender());

            log = Logger.getRootLogger();

      //  } catch (IOException e) {
      //      e.printStackTrace();
      //  }

    }



    public static Test suite() {

        // init test set context configured by test
        ContextManager.doCalculateContext = false;


        TestSuite suite = new TestSuite();

        // adding functional test classes
        suite.addTestSuite(BookServiceTest.class);
        suite.addTestSuite(BorrowerAccountServiceTest.class);
        suite.addTestSuite(PersonnelAccountServiceTest.class);


        return suite;
    }

    public static void main(String[] args) {

        junit.textui.TestRunner.run(suite());


        junit.textui.TestRunner.run(suite());


    }


}
