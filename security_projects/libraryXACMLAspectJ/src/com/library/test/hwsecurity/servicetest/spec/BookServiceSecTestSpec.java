package com.library.test.hwsecurity.servicetest.spec;

/**
 * User: tej
 * Date: 21 mars 2007
 * Time: 11:05:56
 */
public interface BookServiceSecTestSpec {
    /**
     * verifies that teacher can not reserve/borrow and give Back a book during non working days
     */
    void testIllegalScenarioTeacher();

    /**
     * test if a student can not reserve/borrow and give Back a book during non working days
     */
    void testIllegalScenarioStudent();

    /**
     * test if a student can not reserve/borrow and give Back a book during non working days
     */
    void testIllegalScenarioBorrower();

    /**
     * verifies that an admin can not deliver , setdamaged fix then set repaired a book
     * during non authorized days
     */
    void testIllegalScenarioAdmin();

    /**
     * verifies that an admin can not deliver , setdamaged fix then set repaired a book
     * during non authorized days
     */
    void testIllegalScenarioDirector();

    /**
     * verifies that a personnel can not deliver , setdamaged fix then set repaired a book
     */
    void testIllegalScenarioPersonnel();

    /**
     * verifies that an admin can not deliver , setdamaged fix then set repaired a book
     * during non authorized days
     */
    void testIllegalScenarioSecretary();

    void testZRestoreTestData();
}
