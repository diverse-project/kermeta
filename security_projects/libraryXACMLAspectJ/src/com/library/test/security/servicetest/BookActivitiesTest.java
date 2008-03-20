package com.library.test.security.servicetest;

import com.library.bo.book.Book;
import com.library.bo.user.User;
import com.library.service.BookService;
import com.library.service.exception.BSException;
import com.library.dao.BookDAO;
import com.library.dao.dto.BookDTO;
import com.library.test.security.spec.ActivityTestAbstract;
import com.library.test.security.SecurityPoliciesTest;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Iterator;

/**
 * User: Tej
 * Date: 8 mars 2007
 * Time: 12:44:35
 */
public class BookActivitiesTest extends ActivityTestAbstract {

    // local sec test data
    private Book book;

    // dao
    BookDAO bookDAO;


    /**
     * Prepares the arguments
     * @param role the user role to create
     * @param m the method that will be invoked
     * @return an array containing the method parameters
     */
    protected Object[] prepareArguments(Class role, Method m)   {

        // book service methods take only 2 arguments
        Object[] args = new Object[2];

        args[0] = rolesMap.get(role);
        args[1] = book;

        return args;

    }

    protected void initData() {

        // log message
        SecurityPoliciesTest.log.info("Starting book service security test!");

        // init services
        serviceBO = new BookService();

        // dao
        bookDAO = BookDAO.getInstance();


        try {
            // load book
            book = ((BookService) serviceBO).findBookByKeyword("Software security").iterator().next();

        } catch (BSException e) {
            e.printStackTrace();
        }
    }

    protected void restoreTestDataState() {

        // set the book state to available
        book.setCurrentState(Book.statesMap.get(Book.AVAILABLE));

        // reset user reservations state
        User user;
        for (Iterator iterator = rolesMap.keySet().iterator(); iterator.hasNext();) {
            user = rolesMap.get(iterator.next());

            user.getReservations().clear();

        }

        try {
            bookDAO.deletetAllReservations((BookDTO) book.getDTO());
            bookDAO.deleteAllBorrow((BookDTO) book.getDTO());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    protected void setUp() throws Exception {
        super.setUp();
    }


    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
