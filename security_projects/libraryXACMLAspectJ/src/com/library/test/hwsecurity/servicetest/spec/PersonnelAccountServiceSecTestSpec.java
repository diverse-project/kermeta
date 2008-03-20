package com.library.test.hwsecurity.servicetest.spec;

/**
 * User: tej
 * Date: 21 mars 2007
 * Time: 11:08:28
 */
public interface PersonnelAccountServiceSecTestSpec {

    /**
      * verifies that an admin can not create or modify user accounts
      * during non authorized context
      */
     void testIllegalScenarioAdmin();

     /**
      * verifies that an director can not create or modify user accounts
      */
     void testIllegalScenarioDirector();

     /**
      * verifies that a secretary can not create or modify user accounts
      *
      */
     void testIllegalScenarioSecretary();


      /**
       * verifies that personnel can not create or modify user account
       */
      void testIllegalScenarioPersonnel();


      /**
       * verifies that borrowers can not create or modify user account
       */
      void testIllegalScenarioBorrower();

          /**
       * verifies that students can not create or modify user account
       */
      void testIllegalScenarioStudent();

          /**
       * verifies that teachers can not create or modify user account
       */
      void testIllegalScenarioTeacher();




}
