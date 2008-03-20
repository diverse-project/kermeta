package com.library.test.software;

import com.library.security.impl.context.ContextManager;
import com.library.security.service.SecurityPolicyService;
import com.library.service.BookService;
import com.library.service.ServiceBO;
import com.library.test.hwsecurity.servicetest.BookServiceSecTest;
import com.library.test.hwsecurity.servicetest.BorrowerAccountServiceSecTest;
import com.library.test.hwsecurity.servicetest.PersonnelAccountServiceSecTest;
import com.library.test.software.sevicetest.BookServiceTest;
import com.library.test.software.sevicetest.BorrowerAccountServiceTest;
import com.library.test.software.sevicetest.PersonnelAccountServiceTest;
import com.library.test.util.DataForTest;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.*;

/**
 * User: Tej
 * Date: 15 mars 2007
 * Time: 16:33:21
 */
public class FunctionalOracle {

    public static String InitialLogFileName = "AppDebugCorrectOutput.txt",
            AppLogFileName = "AppDebug.log";
    public static String policyFilePrefix = "mutants/lms-";
    public static String policyConf = "xacml_configuration.xml";


    public static void runOracle() {

        int nbMutants  = 100, nbKilled = 0,nbAlive = 0;

        // initializes test data
        DataForTest.initTestData();

        // load initial policy
        BookService.getInstance().switchSecurityPolicy(policyFilePrefix + 0 + ".xml", policyConf);


        // clear log file
        clearFile(AppLogFileName);

        // run the real security policy
        junit.textui.TestRunner.run(suite());

        // copy the file containing the traces informations
        copyFileContent(InitialLogFileName);

        // clear log file
        clearFile(AppLogFileName);

        boolean mutantAnalysisResult[] = new boolean[nbMutants + 1];
        String  mutantInfo[] = new String[nbMutants + 1];

        // the coll
        for (int i = 1; i <= nbMutants; i++) {

            System.out.println("The mutant number " + i + " , is being tested ");


            // prepare data
            DataForTest.initTestData();

            BookService.getInstance().switchSecurityPolicy(policyFilePrefix + i + ".xml", policyConf);
            junit.textui.TestRunner.run(suite());

            mutantAnalysisResult[i] = checkIfMutantKilled();
            mutantInfo[i] = ((SecurityPolicyService)ServiceBO.securitPolicyService).securityModel.mutantInfo;

            System.out.println("The mutant number " + i + " info : " + mutantInfo[i]);
            System.out.println("The mutant number " + i + " , was it killed ? " + mutantAnalysisResult[i]);

            // clear log file
            clearFile(AppLogFileName);

        }


        // mining the results - overall numbers of killed ans alive mutants
        for (int i = 1; i <= nbMutants; i++) {

            System.out.println("The mutant number " + i + " info : " + mutantInfo[i]);
            System.out.println("Mutant number " + i + " was killed? " + mutantAnalysisResult[i]);

            if(mutantAnalysisResult[i]) nbKilled++;
            else nbAlive ++;

        }

        // number of mutants  killed by operator

        int rerKilled = 0, rerAlive = 0, rttKilled = 0, rttAlive = 0,
                pprKilled = 0, pprAlive = 0, anrKilled = 0, anrAlive = 0;
        int rerScore = 0, rttScore = 0, pprScore = 0, anrScore = 0;

        for (int i = 1; i < mutantInfo.length; i++) {
            if(mutantInfo[i].contains("RER")) {
                if(mutantAnalysisResult[i]) rerKilled++;
                else rerAlive++;
            }
            else if(mutantInfo[i].contains("RTT")) {
                if(mutantAnalysisResult[i]) rttKilled++;
                else rttAlive++;
            }

            else if(mutantInfo[i].contains("PPR")) {
                if(mutantAnalysisResult[i]) pprKilled++;
                else pprAlive++;
            }

            else if(mutantInfo[i].contains("ANR")) {
                if(mutantAnalysisResult[i]) anrKilled++;
                else anrAlive++;
            }

        }



        // scores
        if(rerKilled + rerAlive > 0)
        rerScore = (rerKilled * 100) / rerKilled + rerAlive;

        if(rttKilled + rttAlive > 0)
        rttScore = (rttKilled * 100) / rttKilled + rttAlive;

        if(pprKilled + pprAlive > 0)
        pprScore = (pprKilled * 100) / pprKilled + pprAlive;

        if(anrKilled + anrAlive > 0)
        anrScore = (anrKilled * 100) / anrKilled + anrAlive;

        // print out results
        System.out.println(nbMutants + " where tested :\n\t * nb mutant killed : " + nbKilled
                + "\n\t * nb mutant alive : " + nbAlive);


        System.out.println("\t\tKilled\t\tAlive \t\tAll");

        System.out.println("RER\t\t" + rerKilled + " (" + rerScore + "%)\t\t\t" + rerAlive + "\t\t\t" + (rerKilled + rerAlive));
        System.out.println("RTT\t\t" + rttKilled + " (" + rttScore + "%)\t\t\t" + rttAlive + "\t\t\t" + (rttKilled + rttAlive));
        System.out.println("PPR\t\t" + pprKilled + " (" + pprScore + "%)\t\t\t" + pprAlive + "\t\t\t" + (pprKilled + pprAlive));
        System.out.println("ANR\t\t" + anrKilled + " (" + anrScore + "%)\t\t\t" + anrAlive + "\t\t\t" + (anrKilled + anrAlive));


    }


    private static void clearFile(String s) {

        // clear log file
        try {
            new PrintWriter(new FileWriter(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void copyFileContent(String s) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("AppDebug.log"));
            PrintWriter pw = new PrintWriter(new FileWriter(s));

            String line;
            line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();

            }

            br.close();
            pw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * check if the two files are different
     *
     * @return true if this mutant is killed and false it is not
     */
    public static boolean checkIfMutantKilled() {

        Boolean result = null;


        try {
            // open the two log file
            BufferedReader brInitial = new BufferedReader(new FileReader(InitialLogFileName));
            BufferedReader brMutant = new BufferedReader(new FileReader(AppLogFileName));

            String lnInitial, lnMutant;

            // read line by line and compare them, exit when they are diffrent
            lnInitial = brInitial.readLine();
            lnMutant = brMutant.readLine();
            result = lnInitial.equals(lnMutant);

            while (result && lnInitial != null && lnMutant != null) {
                lnInitial = brInitial.readLine();
                lnMutant = brMutant.readLine();

                if (lnInitial != null && lnMutant != null)
                    result = lnInitial.equals(lnMutant);
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return !result;

    }


    public static Test suite() {

        // init test set context configured by test
        ContextManager.doCalculateContext = false;

        TestSuite suite = new TestSuite();

        // adding functional test classes
        suite.addTestSuite(BookServiceTest.class);
        suite.addTestSuite(BorrowerAccountServiceTest.class);
        suite.addTestSuite(PersonnelAccountServiceTest.class);

        // adding functional test classes
        suite.addTestSuite(BookServiceSecTest.class);
        suite.addTestSuite(BorrowerAccountServiceSecTest.class);
        suite.addTestSuite(PersonnelAccountServiceSecTest.class);

        return suite;
    }

    public static void main(String[] args) {

        runOracle();
        


       
    }
}
