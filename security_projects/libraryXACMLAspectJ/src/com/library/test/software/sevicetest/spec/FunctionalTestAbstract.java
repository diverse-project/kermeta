package com.library.test.software.sevicetest.spec;


import junit.framework.TestCase;
import com.library.service.ServiceBO;
import com.library.security.service.SecurityPolicyService;
import com.library.security.model.Authorization;
import com.library.test.software.ServiceFunctionalTest;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 16:30:45
 */
public class FunctionalTestAbstract extends TestCase {


    /**
     * Show infos about security rules tested by the functional test
     */
    public void testZinfos() {



    	/*
        int nbRulesTested = ((SecurityPolicyService) ServiceBO.securitPolicyService).colTestedRule.size();
        int totalNbRules = ((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.getAuthorisations().size()
                - ((SecurityPolicyService) ServiceBO.securitPolicyService).nbHighLevelRules;

        int nbPerm = ((SecurityPolicyService) ServiceBO.securitPolicyService).nbRulesTestedPerm;
        int nbProh = ((SecurityPolicyService) ServiceBO.securitPolicyService).nbRulesTestedProhibit;


        //show infos
        // for debug
        
        ServiceFunctionalTest.log.info(nbRulesTested + " security rules tested out of : " + totalNbRules);

        ServiceFunctionalTest.log.info(nbPerm + " permission security rules tested");
        ServiceFunctionalTest.log.info(nbProh + " prohibition security rules tested");

         // display not tested rules
        Collection<Integer> colIndexes = ((SecurityPolicyService) ServiceBO.securitPolicyService).colTestedRule;
        ArrayList<Authorization> colRules = (ArrayList<Authorization>) ((SecurityPolicyService) ServiceBO.securitPolicyService).securityModel.getAuthorisations();

        Authorization authorization;

        for (Iterator<Authorization> iterator = colRules.iterator(); iterator.hasNext();) {
            authorization = iterator.next();
            if(!colIndexes.contains(colRules.indexOf(authorization)))
                ServiceFunctionalTest.log.info("Rule not tested : " + authorization);


        }
    	 */

    }
}
