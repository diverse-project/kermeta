package com.library.test.software.sevicetest.spec;

/**
 * User: tej
 * Date: 19 mars 2007
 * Time: 11:32:19
 */
public interface BookServiceTestSpec {

    /**
     * Test find book by keyword
     * keywork is part of the titled
     */
    void test1FindBookByKeyword();

    /**
     * test find book by state with all books states :
     * reserved/borrowed/beingfixed/ordered
     */
    void test1FindBookByState();

    /**
     * test with a teacher reserving/borrowing and giving Back a book
     */
    void testNormalScenarioTeacher();

    /**
     * test with a student reserving/borrowing and giving Back a book
     */
    void testNormalScenarioStudent();

    /**
     * test with a borrower reserving/borrowing and giving Back a book
     */
    void testNormalScenarioBorrower();

    /**
     * Test if a secretary can deliver , setdamaged fix then set repaired a book
     */
    void testNormalScenarioSecretary();

    /**
     * Test if a student can reserve/borrow and give Back a book
     */
    void testNormalScenarioAdmin();

    /**
     * Test if a director can reserve/borrow and give Back a book
     */
    void testNormalScenarioDirector();

    /**
     * Test when we try to borrow a book already borrowed
     */
    void testScenarioBorrowBorrowedBook();

    /**
     * Test when with have a user who borrows a book and give it back then another user borrow and
     * give back that book
     */
    void testBorrowScenario2Borrower();

    /**
     * Test when with have a user who reserves a book and then another one reserves that book
     * then they borrow one by one
     */
    void testBorrowScenario2Reservation();

    /**
     * Test when we try to give back a book that was borrow by another user
     */
    void testScenarioGiveBackBorrowedBook();


    /**
     * Test when we try to give back a book already borrowed by another user
     */
    void testScenarioBorrowBeingFixedBook();


    /**
     * Test when we try to give back a book that is being fixed (not available)
     */
    void testScenarioGiveBackBeingFixedBook();


    /**
     * Test when we try to reserve a book that is being fixed (not available)
     */
    void testScenarioReserveBeingFixedBook();


    /**
     * Test when we try to reserve a book with a user who already reserved that book
     */
    void testScenarioReserveReserved();


    /**
     * Test when we try to fix a book that was borrowed (not available)
     */
    void testScenarioFixBorrowedBook();


    /**
     * Test when with have a user who reserves a book and then another one reserves that book
     * and the last one try to borrow that book, normally he can't!
     */
    void testBorrowScenario2reserversNotAllowed();


    /**
     * Test if a borrower can borrow books during holidays (normally he can't!)
     *
     */
    void testBorrowInHolidaysWithBorrower();

    /**
     * Test if a student can borrow books during holidays
     *
     */
    void testBorrowInHolidaysWithStudent();

    /**
     * Test if a teacher can borrow books during holidays
     *
     */
    void testBorrowInHolidaysWithTeacher();




}
