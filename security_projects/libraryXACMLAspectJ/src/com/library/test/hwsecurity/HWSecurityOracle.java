package com.library.test.hwsecurity;

import com.library.security.impl.context.ContextManager;
import com.library.security.service.SecurityPolicyService;
import com.library.service.BookService;
import com.library.service.ServiceBO;
import com.library.test.hwsecurity.servicetest.BookServiceSecTest;
import com.library.test.hwsecurity.servicetest.BorrowerAccountServiceSecTest;
import com.library.test.hwsecurity.servicetest.PersonnelAccountServiceSecTest;
import com.library.test.software.sevicetest.BorrowerAccountServiceTest;
import com.library.test.software.sevicetest.PersonnelAccountServiceTest;
import com.library.test.software.sevicetest.BookServiceTest;
import com.library.test.util.DataForTest;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * User: tej
 * Date: 21 mars 2007
 * Time: 09:47:31
 */
public class HWSecurityOracle {


    public static String InitialLogFileName = "AppDebugCorrectOutput.txt",
            AppLogFileName = "AppDebug.log";


    public static void runOracle() {

        int nbMutants = 371, nbKilled = 0, nbAlive = 0;
        Map<String, Integer> mapNbMutants, mapNbMutantsAlive, mapNbMutantsKilled;

        Map<String, Integer> mapNbMutantsWithConf, mapNbMutantsAliveWithConf, mapNbMutantsKilledWithConf;
        Map<String, Integer> mapNbMutantsNoConf, mapNbMutantsAliveNoConf, mapNbMutantsKilledNoConf;

        // init maps
        mapNbMutants = new HashMap<String, Integer>();
        mapNbMutantsAlive = new HashMap<String, Integer>();
        mapNbMutantsKilled = new HashMap<String, Integer>();

        mapNbMutantsWithConf = new HashMap<String, Integer>();
        mapNbMutantsNoConf = new HashMap<String, Integer>();
        mapNbMutantsAliveWithConf = new HashMap<String, Integer>();
        mapNbMutantsAliveNoConf = new HashMap<String, Integer>();
        mapNbMutantsKilledWithConf = new HashMap<String, Integer>();
        mapNbMutantsKilledNoConf = new HashMap<String, Integer>();

        // init strings for print infos
        String addRuleOperator = "AddRuleOperator", parameterChangingOpertor = "ParameterChangingOpertorRule",
                typeChangingOperator = "TypeChangingOperator", hierarchyChangingOperator = "HierarchyChangingOperatorRule";
        String[] rulesName = new String[]{addRuleOperator, parameterChangingOpertor, typeChangingOperator, hierarchyChangingOperator};
        String[] tabs = new String[]{"\t\t\t\t", "\t\t", "", ""};

        // init the test list
        // Test test = suite();

        // init test data
        DataForTest.initTestData();

        // clear log file
        clearFile(AppLogFileName);

        // run the real security policy
        junit.textui.TestRunner.run(suite());

        // copy the file conaing the traces informations
        copyFileContent(InitialLogFileName);

        // clear log file
        clearFile(AppLogFileName);

        boolean mutantAnalysisResult[] = new boolean[nbMutants + 1];
        String mutantInfo[] = new String[nbMutants + 1];
        boolean isWithConflicts;

        // the coll
        for (int i = 1; i <= nbMutants; i++) {

            System.out.println("The mutant number " + i + " , is being tested ");

            // prepare data
            DataForTest.initTestData();

            // MODIFIED TO USE XACML
            // BookService.getInstance().switchSecurityPolicy(i);
            junit.textui.TestRunner.run(suite());

            mutantAnalysisResult[i] = checkIfMutantKilled();
            mutantInfo[i] = ((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.mutantInfo;
            isWithConflicts = ((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.isMutantWithConflicts;


            System.out.println("The mutant number " + i + " info : " + mutantInfo[i]);
            System.out.println("The mutant number " + i + " , was it killed ? " + mutantAnalysisResult[i]);

            // for infos about types and number of mutation operators and for each one distinguich
            // between those with conflicts fixed and those with no conflicts
            for (String aRulesName : rulesName) {
                if (mutantInfo[i].contains(aRulesName)) {
                    if (!mapNbMutants.containsKey(aRulesName)) {

                        mapNbMutants.put(aRulesName, 0);
                        mapNbMutantsKilled.put(aRulesName, 0);
                        mapNbMutantsAlive.put(aRulesName, 0);
                        mapNbMutantsWithConf.put(aRulesName, 0);
                        mapNbMutantsNoConf.put(aRulesName, 0);
                        mapNbMutantsKilledWithConf.put(aRulesName, 0);
                        mapNbMutantsKilledNoConf.put(aRulesName, 0);
                        mapNbMutantsAliveWithConf.put(aRulesName, 0);
                        mapNbMutantsAliveNoConf.put(aRulesName, 0);

                    }

                    mapNbMutants.put(aRulesName, mapNbMutants.get(aRulesName) + 1);


                    if (isWithConflicts)
                        mapNbMutantsWithConf.put(aRulesName, mapNbMutantsWithConf.get(aRulesName) + 1);
                    else
                        mapNbMutantsNoConf.put(aRulesName, mapNbMutantsNoConf.get(aRulesName) + 1);

                    // mutant killed
                    if (mutantAnalysisResult[i]) {
                        mapNbMutantsKilled.put(aRulesName, mapNbMutantsKilled.get(aRulesName) + 1);

                        if (isWithConflicts)
                            mapNbMutantsKilledWithConf.put(aRulesName, mapNbMutantsKilledWithConf.get(aRulesName) + 1);
                        else
                            mapNbMutantsKilledNoConf.put(aRulesName, mapNbMutantsKilledNoConf.get(aRulesName) + 1);

                    }
                    // still alive
                    else {
                        mapNbMutantsAlive.put(aRulesName, mapNbMutantsAlive.get(aRulesName) + 1);

                        if (isWithConflicts)
                            mapNbMutantsAliveWithConf.put(aRulesName, mapNbMutantsAliveWithConf.get(aRulesName) + 1);
                        else
                            mapNbMutantsAliveNoConf.put(aRulesName, mapNbMutantsAliveNoConf.get(aRulesName) + 1);
                    }

                }
            }

            // clear log file
            clearFile(AppLogFileName);

        }

        for (
                int i = 1;
                i <= nbMutants; i++)

        {


            System.out.println("The mutant number " + i + " info : " + mutantInfo[i]);
            System.out.println("Mutant number " + i + " was killed? " + mutantAnalysisResult[i]);

            if (mutantAnalysisResult[i]) nbKilled++;
            else nbAlive++;

        }

        System.out.println(nbMutants + " where tested :\n\t * nb mutant killed : " + nbKilled
                + "\n\t * nb mutant alive : " + nbAlive);

        System.out.println("More details :");

        System.out.println("Operator\t\t\t\t\t\tKilled[With conf,noconf]\t\t\tAlive[With conf,noconf]\t\t\t\tAll[With conf,noconf]");


        int k = 0;
        for (String operatorName : mapNbMutants.keySet()) {

            System.out.print(operatorName + "\t\t\t" + tabs[k]);
            System.out.print(mapNbMutantsKilled.get(operatorName) + "[" + mapNbMutantsKilledWithConf.get(operatorName) +
                    "," + mapNbMutantsKilledNoConf.get(operatorName) + "]\t\t\t" + tabs[0]);

            System.out.print(mapNbMutantsAlive.get(operatorName) + "[" + mapNbMutantsAliveWithConf.get(operatorName) +
                    "," + mapNbMutantsAliveNoConf.get(operatorName) + "]\t\t\t" + tabs[1]);

            System.out.println(mapNbMutants.get(operatorName) + "[" + mapNbMutantsWithConf.get(operatorName) +
                    "," + mapNbMutantsNoConf.get(operatorName) + "]" + tabs[2]);

            k++;

        }

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
     * check if the two files are difrents
     *
     * @return true if the mutant is killed and false it is not
     */
    public static boolean checkIfMutantKilled() {

        Boolean result = false;

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

              if(!result)   {
                System.out.println("ln initial : " + lnInitial);
                System.out.println("ln mutant : " + lnMutant);

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

        // adding  test classes
        suite.addTestSuite(BookServiceTest.class);
        suite.addTestSuite(BorrowerAccountServiceTest.class);
        suite.addTestSuite(PersonnelAccountServiceTest.class);

        // adding security policy test
        suite.addTestSuite(BookServiceSecTest.class);
        suite.addTestSuite(BorrowerAccountServiceSecTest.class);
        suite.addTestSuite(PersonnelAccountServiceSecTest.class);

        return suite;
    }

    public static void main(String[] args) {

        // launch the oracle
        runOracle();

    }


}
