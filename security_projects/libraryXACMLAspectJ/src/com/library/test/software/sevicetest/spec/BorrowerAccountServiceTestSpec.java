package com.library.test.software.sevicetest.spec;

/**
 * User: tej
 * Date: 22 mars 2007
 * Time: 09:54:43
 */
public interface BorrowerAccountServiceTestSpec {
    /**
     * test consult for director
     */
    void testConsultForDirector();

    /**
     * test consult for secretary
     */
    void testConsultForSecretary();

    /**
     * Run scenario update/delete/create a borrowed account with admin user
     */
    void testScenarioWithAdmin();
}
