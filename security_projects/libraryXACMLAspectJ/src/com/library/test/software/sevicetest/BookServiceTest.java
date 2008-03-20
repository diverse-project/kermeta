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
import com.library.test.software.sevicetest.spec.BookServiceTestSpec;
import com.library.test.software.sevicetest.spec.FunctionalTestAbstract;
import com.library.test.software.ServiceFunctionalTest;

import java.sql.SQLException;
import java.util.Collection;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 12:45:56
 */
public class BookServiceTest extends FunctionalTestAbstract implements BookServiceTestSpec {

    private BookService bookService;
    private BookDAO bookDAO;
    private User student, teacher, borrower;
    private User admin, secretary, director;
    private Book book1;
    private String bookToBorrowKeyword = "Software security";
    private String bookForPersonnelKeyword = "DNS servers";


    public BookServiceTest() {

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


    public void testNormalScenarioStudent() {

        // call do scenario with user
        doBorrowerScenarioWithUser(student);

    }

    public void testNormalScenarioBorrower() {
        // call do scenario with user
        doBorrowerScenarioWithUser(borrower);
    }


    public void testNormalScenarioSecretary() {

        // call do scenario with user
        doPersonnelScenarioWithUser(secretary);

    }


    public void testNormalScenarioAdmin() {

        // call do scenario with user
        doPersonnelScenarioWithUser(admin);

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


    public void testScenarioBorrowBorrowedBook() {

        Book book = null;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        // the book
        Collection<Book> result;
        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);


            book = result.iterator().next();

            // now borrow
            bookService.borrowBook(student, book);

            // tries to borrow with that book by teacher
            bookService.borrowBook(teacher, book);

            // if its goes here then fail
            fail("Book is supposed to be borrowed! cannot be borrowed twice!");


        } catch (BSException e) {
            // ok test succeeded give back the book
            try {
                bookService.giveBackBook(student, book);
            } catch (BSException e1) {
                fail(e1.getMessage());
            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }

        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());
        }


    }

    public void testBorrowScenario2Borrower() {


        Book book;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        try {

            // the book

            Collection<Book> result;
            result = bookService.findBookByKeyword(bookToBorrowKeyword);

            book = result.iterator().next();

            // teacher borrow and give back
            bookService.borrowBook(teacher, book);
            bookService.giveBackBook(teacher, book);

            // student borrow and give back
            bookService.borrowBook(student, book);
            bookService.giveBackBook(student, book);


        } catch (BSException e) {
            testZRestoreTestData();
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            testZRestoreTestData();
            fail(e.getMessage());
        }


    }

    public void testBorrowScenario2Reservation() {

        Book book;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        try {

            // the book

            Collection<Book> result;
            result = bookService.findBookByKeyword(bookToBorrowKeyword);

            book = result.iterator().next();

            // teacher reserve borrow and give back
            bookService.reserveBook(teacher, book);
            bookService.borrowBook(teacher, book);
            bookService.giveBackBook(teacher, book);

            // student reserve borrow and give back
            bookService.reserveBook(student, book);
            bookService.borrowBook(student, book);
            bookService.giveBackBook(student, book);


        } catch (BSException e) {
            testZRestoreTestData();
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            testZRestoreTestData();
            fail(e.getMessage());
        }


    }

    public void testScenarioGiveBackBorrowedBook() {

        Book book = null;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        // the book
        Collection<Book> result;
        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);


            book = result.iterator().next();

            // now borrow
            bookService.borrowBook(student, book);

            // tries to borrow with that book by teacher
            bookService.giveBackBook(teacher, book);

            // if its goes here then fail
            fail("Book is supposed to be borrowed! cannot be given back by another user!");


        } catch (BSException e) {

            // ok test succeeded give back the book
            try {
                bookService.giveBackBook(student, book);
            } catch (BSException e1) {
                fail(e1.getMessage());
            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }


        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());

        }

    }

    public void testScenarioBorrowBeingFixedBook() {

        Book book = null;

        // init context it is a maintenance day
        ContextManager.currentContext = ContextManager.maintenanceDay;

        // the book
        Collection<Book> result;
        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);


            book = result.iterator().next();

            // set the book is being fixed
            bookService.bookDamaged(secretary, book);
            bookService.fixBook(secretary, book);

            // init context it is a working day
            ContextManager.currentContext = ContextManager.workingday;

            // now try to borrow it
            bookService.borrowBook(student, book);

            // if its goes here then fail
            fail("Book is being fixed! cannot be borrowed!");


        } catch (BSException e) {

            // ok test succeeded repair and deliver the book
            try {

                // set context it is a maintenance day
                ContextManager.currentContext = ContextManager.maintenanceDay;

                bookService.bookRepaired(secretary, book);
                bookService.deliverBook(secretary, book);
            } catch (BSException e1) {
                fail(e1.getMessage());
            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }

        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());

        }
    }

    public void testScenarioGiveBackBeingFixedBook() {

        Book book = null;

        // init context it is a maintenance day
        ContextManager.currentContext = ContextManager.maintenanceDay;

        // the book
        Collection<Book> result;
        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);


            book = result.iterator().next();

            // set the book is being fixed
            bookService.bookDamaged(secretary, book);
            bookService.fixBook(secretary, book);

            // init context it is a working day
            ContextManager.currentContext = ContextManager.workingday;

            // now try to give back the book
            bookService.giveBackBook(student, book);

            // if its goes here then fail
            fail("Book is being fixed! cannot be give back! It is absurd");


        } catch (BSException e) {

            // ok test succeeded repair and deliver the book
            try {

                // set context it is a maintenance day
                ContextManager.currentContext = ContextManager.maintenanceDay;


                bookService.bookRepaired(secretary, book);
                bookService.deliverBook(secretary, book);


            } catch (BSException e1) {
                fail(e1.getMessage());
            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }

        } catch (SecuritPolicyViolationException e) {
            e.printStackTrace();
        }


    }

    public void testScenarioReserveBeingFixedBook() {

        Book book;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.maintenanceDay;

        // the book
        Collection<Book> result;
        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);


            book = result.iterator().next();

            // set the book is being fixed
            bookService.bookDamaged(secretary, book);
            bookService.fixBook(secretary, book);

            // init context it is a working day
            ContextManager.currentContext = ContextManager.workingday;

            // now try to reserve it
            bookService.reserveBook(student, book);

            // set context it is a maintenance day
            ContextManager.currentContext = ContextManager.maintenanceDay;

            // test succeeded

            // restore book state
            bookService.bookRepaired(secretary, book);
            bookService.deliverBook(secretary, book);

            ContextManager.currentContext = ContextManager.workingday;
            bookService.borrowBook(student, book);
            bookService.giveBackBook(student, book);


        } catch (BSException e) {

            // if its goes here then fail
            fail(" a book can be reserved even when it is being fixed");


        } catch (SecuritPolicyViolationException e) {
            e.printStackTrace();
        }

    }

    public void testScenarioReserveReserved() {

        Book book = null;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        // the book
        Collection<Book> result;
        try {
            result = bookService.findBookByKeyword(bookToBorrowKeyword);


            book = result.iterator().next();

            // reserve it for the first time
            bookService.reserveBook(teacher, book);

            // reserve it again
            bookService.reserveBook(teacher, book);

            // if it goes here then fail
            fail("A book cannot be reserved twice!");


        } catch (BSException e) {

            try {
                bookService.borrowBook(teacher, book);
                bookService.giveBackBook(teacher, book);

            } catch (BSException e1) {
                fail(e1.getMessage());

            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }


        } catch (SecuritPolicyViolationException e) {
            e.printStackTrace();
        }


    }

    public void testScenarioFixBorrowedBook() {

        Book book = null;
        Collection<Book> result;

        // init context it is a maintenance day
        ContextManager.currentContext = ContextManager.maintenanceDay;

        try {

            // the book
            result = bookService.findBookByKeyword(bookToBorrowKeyword);
            book = result.iterator().next();

            // set damaged
            bookService.bookDamaged(secretary, book);

            // set context it is a working day
            ContextManager.currentContext = ContextManager.workingday;

            // borrow a book
            bookService.borrowBook(teacher, book);

            // try to fix it in a maintenance day
            ContextManager.currentContext = ContextManager.maintenanceDay;
            bookService.fixBook(secretary, book);

            // if it goes here then fail
            fail("How can you fix a book that is in the borrower house now!");


        } catch (BSException e) {

            try {

                // restore book initial state

                ContextManager.currentContext = ContextManager.workingday;
                bookService.giveBackBook(teacher, book);

                ContextManager.currentContext = ContextManager.maintenanceDay;

                bookService.fixBook(secretary, book);
                bookService.bookRepaired(secretary, book);
                bookService.deliverBook(secretary, book);


            } catch (BSException e1) {
                fail(e1.getMessage());

            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }


        } catch (SecuritPolicyViolationException e) {
            e.printStackTrace();
        }


    }

    public void testBorrowScenario2reserversNotAllowed() {


        Book book = null;

        // init context it is a working day
        ContextManager.currentContext = ContextManager.workingday;

        try {

            // the book

            Collection<Book> result;
            result = bookService.findBookByKeyword(bookToBorrowKeyword);

            book = result.iterator().next();

            // teacher then  reserve the book
            bookService.reserveBook(teacher, book);
            bookService.reserveBook(student, book);

            // student try to borrow the book it is not allowed
            bookService.borrowBook(student, book);

            fail(" the student was not the first to reserve the book he cannot borrow it before the teacher");


        } catch (BSException e) {
            // ok the test succeeded here


                // restore book initial state
            try {
                bookService.borrowBook(teacher, book);
                bookService.giveBackBook(teacher, book);

                bookService.borrowBook(student, book);
                bookService.giveBackBook(student, book);


            } catch (BSException e1) {
                fail(e1.getMessage());

            } catch (SecuritPolicyViolationException e1) {
                fail(e1.getMessage());

            }


        } catch (SecuritPolicyViolationException e) {
            // failure
            fail(e.getMessage());
        }
    }

    public void testBorrowInHolidaysWithBorrower() {
        doBorrowInHolidaysWithUser(borrower);
    }

    public void testBorrowInHolidaysWithStudent() {
        doBorrowInHolidaysWithUser(student);
    }

    public void testBorrowInHolidaysWithTeacher() {
     doBorrowInHolidaysWithUser(teacher);
    }

    /**
     * Test if a user can borrow/reserve/give back a book during holidays normally he can't
     *
     *
     * @param user the user that will borrow
     */
    private void doBorrowInHolidaysWithUser(User user) {


       Book book = null;

            // test reserve books in holidays
            try {
                // init book
                Collection<Book> result = bookService.findBookByKeyword(bookToBorrowKeyword);
                book = result.iterator().next();

                // init context it is a holidays
                ContextManager.currentContext = ContextManager.holidays;

                // reserve
                bookService.reserveBook(user, book);

                //-------------------- oracle --------------------------------- Start

                // if we go here then failure
                fail("Book should not be reserved by " + user.getRole().getRoleName() + " during halidays");

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

            // test giveBack books in holidays
            try {

                // reserve the book in working days
                ContextManager.currentContext = ContextManager.workingday;
                bookService.borrowBook(user, book);

                // borrow book in halidays
                ContextManager.currentContext = ContextManager.holidays;
                bookService.giveBackBook(user, book);

                // if we go here then failure
                fail("Book should not be given back by " + user.getRole().getRoleName() + " during halidays");


            } catch (BSException e) {
                fail(e.getMessage());

            } catch (SecuritPolicyViolationException e) {

                ServiceFunctionalTest.log.info("Test successfully passed with user " + user.getRole().getRoleName() +
                        " refused to borrow book in holidays");
            }

            // restore test data here we give back the book in working day
            try {
                ContextManager.currentContext = ContextManager.workingday;
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