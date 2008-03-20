package com.library.test.software.sevicetest;

import com.library.bo.book.Book;
import com.library.bo.user.User;
import com.library.dao.BookDAO;
import com.library.dao.dto.BookDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;
import com.library.security.impl.context.ContextManager;
import com.library.service.BookService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.test.software.ServiceFunctionalTest;
import junit.framework.TestCase;

import java.sql.SQLException;
import java.util.Collection;

/**
 * User: tej
 * Date: 5 avr. 2007
 * Time: 15:59:51
 */
public class BookServiceCR1Test extends TestCase {

      private BookService bookService;
    private BookDAO bookDAO;
    private User student, teacher, borrower;
    private User admin, secretary, director;
    private Book book1;
    private String bookToBorrowKeyword = "Software security";
    private String bookForPersonnelKeyword = "DNS servers";


    public BookServiceCR1Test() {

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

    public void test1FindBookByKeyword() {

        Collection<Book> result;


        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);

            //-------------------- oracle --------------------------------- Start

            assertEquals("Test taille de la collection", result.size(), 1);
            assertEquals(result.iterator().next(), book1);
            //-------------------- oracle --------------------------------- End

            // try with a keyword not related to any book
            result = bookService.findBookByKeyword("ZZEEDDEERRFFDD");

            //-------------------- oracle --------------------------------- Start
            // assure there are no results
            assertTrue("Must be empty Looking for book with keyword  ZZEEDDEERRFFDD", result.isEmpty());
            //-------------------- oracle --------------------------------- End


        } catch (BSException e) {
            fail(e.getMessage());
        }


    }

    public void test1FindBookByState() {

        try {
            Collection<Book> result;
            Book bookExpected;

            result = bookService.findBookByState(Book.AVAILABLE);

            //-------------------- oracle --------------------------------- Start
            assertEquals("Test taille de la collection", result.size(), 1);
            assertEquals(result.iterator().next(), book1);
            //-------------------- oracle --------------------------------- End


            result = bookService.findBookByState(Book.RESERVED);

            // prepare expected data
            bookExpected = new Book();

            bookExpected.setTitle("Tibet and Taiwan vs China");
            bookExpected.setAuthor("The unknown soldier");
            bookExpected.setPublicationYear(1956);
            bookExpected.setBookId(2);
            bookExpected.setCurrentState(Book.statesMap.get(Book.RESERVED));

            //-------------------- oracle --------------------------------- Start
            assertEquals("Test taille de la collection", result.size(), 1);
            assertEquals(result.iterator().next(), bookExpected);
            //-------------------- oracle --------------------------------- End


            result = bookService.findBookByState(Book.ORDERED);

            // prepare expected data
            bookExpected = new Book();

            bookExpected.setTitle("How to shutdown DNS servers");
            bookExpected.setAuthor("Neo");
            bookExpected.setPublicationYear(2006);
            bookExpected.setBookId(3);
            bookExpected.setCurrentState(Book.statesMap.get(Book.ORDERED));

            //-------------------- oracle --------------------------------- Start
            assertEquals("Test taille de la collection", result.size(), 1);
            assertEquals(result.iterator().next(), bookExpected);
            //-------------------- oracle --------------------------------- End

            result = bookService.findBookByState(Book.BEINGFIXED);

            //-------------------- oracle --------------------------------- Start
            assertEquals("Test taille de la collection", result.size(), 0);
            //-------------------- oracle --------------------------------- End

            result = bookService.findBookByState(Book.BORROWED);

            //-------------------- oracle --------------------------------- Start
            assertEquals("Test taille de la collection", result.size(), 0);
            //-------------------- oracle --------------------------------- End



        } catch (BSException e) {
            fail(e.getMessage());
        }


    }


    public void testNormalScenarioTeacher() {

        // call do scenario with user
        doBorrowerScenarioWithUser(teacher);


    }


    public void testNormalScenarioDirector() {

        // call do scenario with user
        doPersonnelScenarioWithUser(director);

    }

    /**
     * Run scenario reserve/borrow/give back a book with user
     *
     * @param user the user used with the scenario
     */
    private void doBorrowerScenarioWithUser(User user) {

        Collection<DTO> bookDtos;
        Book bookReturned;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        // the book
        try {
            Collection<Book> result = bookService.findBookByKeyword(bookToBorrowKeyword);

            Book book = result.iterator().next();



            // now borrow
            bookService.borrowBook(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if borrowed and no longer reserved
            assertTrue(user.getBorrowed().contains(book));
            assertTrue(!user.getReservations().contains(book));

            // test if data was well stored in DB by calling DAO
            bookDtos = bookDAO.loadUserReservedBooks((UserDTO) user.getDTO());
            assertEquals(bookDtos.size(), 0);
            bookDtos = bookDAO.loadUserBorrowedBooks((UserDTO) user.getDTO());
            assertEquals(bookDtos.size(), 1);
            assertEquals(book, new Book(bookDtos.iterator().next()));

            // test book state must be borrowed by calling DAO
            bookDtos = bookDAO.seachBooksByKeyword(bookToBorrowKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(bookReturned.getCurrentStateString().equals(Book.BORROWED));

            //-------------------- oracle --------------------------------- End

            // now give back the book
            bookService.giveBackBook(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if the book is no longer borrowed
            assertTrue(!user.getReservations().contains(book));

            // test if data was well stored in DB by calling DAO
            bookDtos = bookDAO.loadUserReservedBooks((UserDTO) user.getDTO());
            assertEquals(bookDtos.size(), 0);
            bookDtos = bookDAO.loadUserBorrowedBooks((UserDTO) user.getDTO());
            assertEquals(bookDtos.size(), 0);

            // test book state must be available
            bookDtos = bookDAO.seachBooksByKeyword(bookToBorrowKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(bookReturned.getCurrentStateString().equals(Book.AVAILABLE));
            //-------------------- oracle --------------------------------- End


        } catch (BSException e) {
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());
        } catch (SQLException e) {
            fail(e.getMessage());

        }
    }


    /**
     * Run scenario deliver/setdamaged/fix then set repaired a book
     *
     * @param user the user used with the scenario
     */
    private void doPersonnelScenarioWithUser(User user) {
        Collection<DTO> bookDtos;
        Book bookReturned;

        // init context it is a maintenance day
        ContextManager.currentContext = ContextManager.maintenanceDay;

        try {

            Collection<Book> result = bookService.findBookByKeyword("DNS servers");

            Book book = result.iterator().next();

            // deliver
            bookService.deliverBook(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if available
            assertTrue(book.getCurrentStateString().equals(Book.AVAILABLE));

            // test book state must be ordered
            bookDtos = bookDAO.seachBooksByKeyword(bookForPersonnelKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(bookReturned.getCurrentStateString().equals(Book.AVAILABLE));

            //-------------------- oracle --------------------------------- End

            // now set damaged
            bookService.bookDamaged(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if the book is damaged
            assertTrue(book.isDamaged());

            // test if book is damaged
            bookDtos = bookDAO.seachBooksByKeyword(bookForPersonnelKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(bookReturned.isDamaged());

            //-------------------- oracle --------------------------------- End

            // now fix it
            bookService.fixBook(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if being fixed
            assertTrue(book.getCurrentStateString().equals(Book.BEINGFIXED));

            // test book state must be being fixed
            bookDtos = bookDAO.seachBooksByKeyword(bookForPersonnelKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(bookReturned.getCurrentStateString().equals(Book.BEINGFIXED));

            //-------------------- oracle --------------------------------- End

            // notify that the book is repaired
            bookService.bookRepaired(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if the book is NOT damaged
            assertTrue(!book.isDamaged());

            // test if book is NOT damaged
            bookDtos = bookDAO.seachBooksByKeyword(bookForPersonnelKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(!bookReturned.isDamaged());

            //-------------------- oracle --------------------------------- End

            // deliver the book
            bookService.deliverBook(user, book);

            //-------------------- oracle --------------------------------- Start

            // test if available
            assertTrue(book.getCurrentStateString().equals(Book.AVAILABLE));

            // test book state must available
            bookDtos = bookDAO.seachBooksByKeyword(bookForPersonnelKeyword);
            bookReturned = new Book(bookDtos.iterator().next());
            assertTrue(bookReturned.getCurrentStateString().equals(Book.AVAILABLE));

            //-------------------- oracle --------------------------------- End

            // reset book state to ordered so that we can reproduce the test
            book.setCurrentState(Book.statesMap.get(Book.ORDERED));

            BookDAO.getInstance().update(book.getDTO());


        } catch (BSException e) {
            testZRestoreTestData();
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            testZRestoreTestData();
            fail(e.getMessage());
        } catch (SQLException e) {
            testZRestoreTestData();
            fail(e.getMessage());

        }


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














    public void testBorrowInHolidaysWithBorrower() {
        doBorrowActivityInHolidaysWithUser(borrower);
    }

    public void testBorrowInHolidaysWithStudent() {
        doBorrowActivityInHolidaysWithUser(student);
    }

    public void testBorrowInHolidaysWithTeacher() {
     doBorrowActivityInHolidaysWithUser(teacher);
    }

    /**
     * Test if a user can borrow/reserve/give back a book during holidays normally he can't
     *
     *
     * @param user the user that will borrow
     */
    private void doBorrowActivityInHolidaysWithUser(User user) {


       Book book = null;

            // test borrow books in holidays
            try {

                // reserve the book in working days
                ContextManager.currentContext = ContextManager.workingday;
                bookService.reserveBook(user, book);

                // borrow book in halidays
                ContextManager.currentContext = ContextManager.holidays;
                bookService.borrowBook(user, book);

                // if we go here then failure
                fail("Book should not be borrowed by " + user.getRole().getRoleName() + " during halidays");


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

                bookService.borrowBook(user, book);
                bookService.giveBackBook(user, book);

            } catch (BSException e) {
                testZRestoreTestData();
                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {
                testZRestoreTestData();
                fail(e.getMessage());

            }

    }


}

