package com.library.test.hwsecurity.servicetest;

import com.library.bo.book.Book;
import com.library.bo.user.User;
import com.library.dao.BookDAO;
import com.library.dao.dto.BookDTO;
import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;
import com.library.security.model.context.Context;
import com.library.service.BookService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.test.hwsecurity.servicetest.spec.BookServiceSecTestSpec;
import com.library.test.software.ServiceFunctionalTest;
import junit.framework.TestCase;

import java.sql.SQLException;
import java.util.Collection;

/**
 * User: tej
 * Date: 19 mars 2007
 * Time: 14:14:54
 */
public class BookServiceSecTest extends TestCase implements BookServiceSecTestSpec {


    private BookService bookService;
    private BookDAO bookDAO;
    private User student, teacher, borrower;
    private User personnel, admin, secretary, director;
    private Book book1;
    private String bookToBorrowKeyword = "Software security";
    private String bookForPersonnelKeyword = "DNS servers";


    public BookServiceSecTest() {

        // init service
        bookService = BookService.getInstance();
        bookDAO = BookDAO.getInstance();

        UserService userService = UserService.getInstance();

        try {
            // init users
            student = userService.logUser("tutu", "Not2Hard", UserService.BORROWER_LOGIN_MODE);
            teacher = userService.logUser("titi", "Z1forU", UserService.BORROWER_LOGIN_MODE);
            borrower = userService.logUser("bobo", "B14me", UserService.BORROWER_LOGIN_MODE);


            admin = userService.logUser("sam", "Obe1kenobe", UserService.PERSONNEL_LOGIN_MODE);
            secretary = userService.logUser("momo", "TopCykrett", UserService.PERSONNEL_LOGIN_MODE);
            director = userService.logUser("tata", "Yube1", UserService.PERSONNEL_LOGIN_MODE);
            personnel = userService.logUser("juju", "JI14one!", UserService.PERSONNEL_LOGIN_MODE);


            book1 = new Book();
            book1.setTitle(bookToBorrowKeyword);
            book1.setAuthor("McGraw");
            book1.setPublicationYear(2007);
            book1.setBookId(1);
            book1.setCurrentState(Book.statesMap.get(Book.AVAILABLE));

            // the context is defined manually
            ContextManager.doCalculateContext = false;

        } catch (BSException e) {
            e.printStackTrace();
        }


    }

    public void testIllegalScenarioTeacher() {

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(teacher, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(teacher, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(teacher, LibrarySecurityModel.DEFAULT_CONTEXT);

        // call do illegal scenario with user
        doIllegalPersonnelScenarioWithUser(teacher, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(teacher, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(teacher, ContextManager.maintenanceDay);
        doIllegalPersonnelScenarioWithUser(teacher, LibrarySecurityModel.DEFAULT_CONTEXT);

    }


    public void testIllegalScenarioStudent() {

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(student, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(student, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(student, LibrarySecurityModel.DEFAULT_CONTEXT);

        // call do illegal scenario with user
        doIllegalPersonnelScenarioWithUser(student, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(student, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(student, ContextManager.maintenanceDay);
        doIllegalPersonnelScenarioWithUser(student, LibrarySecurityModel.DEFAULT_CONTEXT);


    }

    public void testIllegalScenarioBorrower() {

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(borrower, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(borrower, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(borrower, LibrarySecurityModel.DEFAULT_CONTEXT);

        // call do illegal scenario with user
        doIllegalPersonnelScenarioWithUser(borrower, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(borrower, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(borrower, ContextManager.maintenanceDay);
        doIllegalPersonnelScenarioWithUser(borrower, LibrarySecurityModel.DEFAULT_CONTEXT);


    }


    public void testIllegalScenarioAdmin() {

        // call do illegal scenario with user
        doIllegalPersonnelScenarioWithUser(admin, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(admin, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(admin, LibrarySecurityModel.DEFAULT_CONTEXT);

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(admin, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(admin, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(admin, ContextManager.workingday);
        doIllgalBorrowerScenarioWithUser(admin, LibrarySecurityModel.DEFAULT_CONTEXT);


    }

    public void testIllegalScenarioDirector() {

        // call do illegal scenario with user
        doIllegalPersonnelScenarioWithUser(director, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(director, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(director, LibrarySecurityModel.DEFAULT_CONTEXT);

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(director, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(director, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(director, ContextManager.workingday);
        doIllgalBorrowerScenarioWithUser(director, LibrarySecurityModel.DEFAULT_CONTEXT);


    }

    public void testIllegalScenarioPersonnel() {

        // call do illegal scenario with user with all contexts
        doIllegalPersonnelScenarioWithUser(personnel, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(personnel, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(personnel, LibrarySecurityModel.DEFAULT_CONTEXT);
        doIllegalPersonnelScenarioWithUser(personnel, ContextManager.maintenanceDay);

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(personnel, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(personnel, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(personnel, ContextManager.workingday);
        doIllgalBorrowerScenarioWithUser(personnel, LibrarySecurityModel.DEFAULT_CONTEXT);


    }

    public void testIllegalScenarioSecretary() {

        // call do illegal scenario with user
        doIllegalPersonnelScenarioWithUser(secretary, ContextManager.holidays);
        doIllegalPersonnelScenarioWithUser(secretary, ContextManager.workingday);
        doIllegalPersonnelScenarioWithUser(secretary, LibrarySecurityModel.DEFAULT_CONTEXT);

        // call do illegal scenario with user
        doIllgalBorrowerScenarioWithUser(secretary, ContextManager.maintenanceDay);
        doIllgalBorrowerScenarioWithUser(secretary, ContextManager.holidays);
        doIllgalBorrowerScenarioWithUser(secretary, ContextManager.workingday);
        doIllgalBorrowerScenarioWithUser(secretary, LibrarySecurityModel.DEFAULT_CONTEXT);

    }


    public void testZRestoreTestData() {


        try {

            // restore data state before exit
            book1.setCurrentState(Book.statesMap.get(Book.AVAILABLE));

            // deletes all borrow and reservations
            bookDAO.deleteAllBorrow((BookDTO) book1.getDTO());
            bookDAO.deletetAllReservations((BookDTO) book1.getDTO());

            // updates the book
            bookDAO.update(book1.getDTO());

            Collection<Book> result = bookService.findBookByKeyword("DNS servers");

            Book book2 = result.iterator().next();

            book2.setCurrentState(Book.statesMap.get(Book.ORDERED));
            book2.setDamaged(false);

            // updates the book
            bookDAO.update(book2.getDTO());


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (BSException e) {
            e.printStackTrace();
        }


    }

    /**
     * runs illgal scenario reserve/borrow/give back a book with user in  holidays and in maintenance day
     *
     * @param user    the user used with the scenario
     * @param context the context of test can be : holidays/maintenance day/ working day
     */
    private void doIllgalBorrowerScenarioWithUser(User user, Context context) {


        Book book = null;

        try {

            // test reserve books in holidays
            try {
                // init book
                Collection<Book> result = bookService.findBookByKeyword(bookToBorrowKeyword);
                book = result.iterator().next();

                // init context it is a holidays
                ContextManager.currentContext = context;

                // reserve
                bookService.reserveBook(user, book);

                //-------------------- oracle --------------------------------- Start

                // if we go here then failure
                fail("Book should not be reserved by " + user.getRole().getRoleName() + " during " + context.getContextName());

                //-------------------- oracle --------------------------------- End

            } catch (BSException e) {
                //-------------------- oracle --------------------------------- Start
                fail(e.getMessage());
                //-------------------- oracle --------------------------------- End


            } catch (SecuritPolicyViolationException e) {

                //-------------------- oracle --------------------------------- Start

                ServiceFunctionalTest.log.info("Test successfully passed with user " + user.getRole().getRoleName() +
                        " refused to reserve book in holidays");

                //-------------------- oracle --------------------------------- End

            }

            // reserve the book in working days
            ContextManager.currentContext = ContextManager.workingday;
            bookService.reserveBook(borrower, book);


            // test borrow books in holidays
            try {


                // borrow book in halidays
                ContextManager.currentContext = context;
                bookService.borrowBook(user, book);

                // if we go here then failure
                fail("Book should not be borrowed by " + user.getRole().getRoleName() + " during " + context.getContextName());


            } catch (BSException e) {
                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                testZRestoreTestData();

                ServiceFunctionalTest.log.info("Test successfully passed with user " + user.getRole().getRoleName() +
                        " refused to borrow book in holidays");
            }

            // reserve the book in working days
            ContextManager.currentContext = ContextManager.workingday;
            bookService.borrowBook(borrower, book);

            // test giveBack books in holidays
            try {

                // borrow book in halidays
                ContextManager.currentContext = context;
                bookService.giveBackBook(user, book);

                // if we go here then failure
                fail("Book should not be given back by " + user.getRole().getRoleName() + " during  " + context.getContextName());


            } catch (BSException e) {
                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                testZRestoreTestData();

                ServiceFunctionalTest.log.info("Test successfully passed with user " + user.getRole().getRoleName() +
                        " refused to borrow book in holidays");
            }

            // restore test data here we give back the book in working day
            try {
                ContextManager.currentContext = ContextManager.workingday;
                bookService.giveBackBook(borrower, book);

            } catch (BSException e) {
                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                fail(e.getMessage());

            }

        } catch (BSException e) {
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());
        }


    }


    /**
     * Run a prohibited scenario deliver/setdamaged/fix then set repaired a book during non
     * authorized time
     *
     * @param user    the user used with the scenario
     * @param context the context of test can be : holidays/maintenance day/ working day
     */
    private void doIllegalPersonnelScenarioWithUser(User user, Context context) {

        try {

            // the book
            Collection<Book> result = bookService.findBookByKeyword(bookForPersonnelKeyword);
            Book book = result.iterator().next();
            //----------------- deliver oredred book --------------------------------------
            try {

                // set context to a context
                ContextManager.currentContext = context;

                // deliver
                bookService.deliverBook(user, book);

                // if we go here then failure
                fail("should not deliver ordered books " + user.getRole().getRoleName() + " during " + context.getContextName());

            } catch (BSException e) {

                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                // ok test succeeded
            }


            ContextManager.currentContext = ContextManager.maintenanceDay;
            bookService.deliverBook(secretary, book);

            //----------------- set book damaged  --------------------------------------

            try {

                // set context to a context
                ContextManager.currentContext = context;

                // deliver
                bookService.bookDamaged(user, book);

                // if we go here then failure
                fail("should not set book damaged " + user.getRole().getRoleName() + " during " + context.getContextName());

            } catch (BSException e) {

                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                // ok test succeeded
            }

            // now set damaged
            ContextManager.currentContext = ContextManager.maintenanceDay;
            bookService.bookDamaged(secretary, book);

            //----------------- fix book --------------------------------------

            try {

                // set context to a context
                ContextManager.currentContext = context;

                // deliver
                bookService.fixBook(user, book);

                // if we go here then failure
                fail("should not fix books " + user.getRole().getRoleName() + " during " + context.getContextName());

            } catch (BSException e) {

                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                // ok test succeeded
            }

            // now fix it
            ContextManager.currentContext = ContextManager.maintenanceDay;
            bookService.fixBook(secretary, book);

            //----------------- set book repaired --------------------------------------
            try {

                // set context to a context
                ContextManager.currentContext = context;

                // deliver
                bookService.bookRepaired(user, book);

                // if we go here then failure
                fail("should not repair books " + user.getRole().getRoleName() + " during " + context.getContextName());

            } catch (BSException e) {

                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                // ok test succeeded
            }

            // notify that the book is repaired
            ContextManager.currentContext = ContextManager.maintenanceDay;
            bookService.bookRepaired(secretary, book);

            //----------------- deliver repaired book --------------------------------------

            try {

                // set context to a context
                ContextManager.currentContext = context;

                // deliver
                bookService.deliverBook(user, book);

                // if we go here then failure
                fail("should not deliver repaired books " + user.getRole().getRoleName() + " during " + context.getContextName());

            } catch (BSException e) {

                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                // ok test succeeded
            }

            // deliver the book
            ContextManager.currentContext = ContextManager.maintenanceDay;
            bookService.deliverBook(secretary, book);

            // reset book state to ordered so that we can reproduce the test
            book.setCurrentState(Book.statesMap.get(Book.ORDERED));
            BookDAO.getInstance().update(book.getDTO());


        } catch (BSException e) {
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());
        } catch (SQLException e) {
            fail(e.getMessage());

        }
    }

}

