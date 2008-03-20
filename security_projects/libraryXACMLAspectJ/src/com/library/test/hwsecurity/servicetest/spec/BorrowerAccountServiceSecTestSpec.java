package com.library.test.hwsecurity.servicetest.spec;

/**
 * User: tej
 * Date: 21 mars 2007
 * Time: 11:08:54
 */
public interface BorrowerAccountServiceSecTestSpec {


    /**
     * verifies that an admin can not create or modify borrower account
     * during non authorized context
     */
    void testIllegalScenarioAdmin();

    /**
     * verifies that an director can not create or modify borrower account
     */
    void testIllegalScenarioDirector();

    /**
     * verifies that a secretary can not create or modify borrower account
     */
    void testIllegalScenarioSecretary();


    /**
     * verifies that personnel can not create or modify borrower account
     */
    void testIllegalScenarioPersonnel();


    /**
     * verifies that borrowers can not create or modify borrower account
     */
    void testIllegalScenarioBorrower();

        /**
     * verifies that students can not create or modify borrower account
     */
    void testIllegalScenarioStudent();

        /**
     * verifies that teachers can not create or modify borrower account
     */
    void testIllegalScenarioTeacher();




}
