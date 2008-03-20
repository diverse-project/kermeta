package com.library.service;

import com.library.bo.book.Book;
import com.library.bo.book.InvalidActionException;
import com.library.bo.user.User;
import com.library.dao.BookDAO;
import com.library.dao.UserDAO;
import com.library.dao.dto.BookDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;
import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.spec.BookServiceInterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 08:26:34
 */
public class
        BookService extends ServiceBO implements BookServiceInterface {

    private static BookService ourInstance = new BookService();

    private BookDAO bookDAO;
    private UserDAO userDAO;




    public static BookService getInstance() {
        return ourInstance;
    }

    public BookService() {

        super();

        // initializes the DAOs
        if (bookDAO == null)
            bookDAO = BookDAO.getInstance();

        if (userDAO == null)
            userDAO = UserDAO.getInstance();


    }


    public synchronized void borrowBook(User user, Book book) throws BSException, SecuritPolicyViolationException {
     //   ServiceUtils.checkSecurity(user, LibrarySecurityModel.BORROWBOOK_METHOD,
     //           LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());

        UserDTO userDTO;
        BookDTO bookDTO;

        try {
            // check if the book was reserved that the one who borrows is is the one who reserves
            // the book

            if(!book.getReservations().isEmpty())   {

                if(!user.equals(book.getReservations().iterator().next()))
                        throw new BSException("The user who wants to borrow the book is not the one who reserve it.");

            }


            // borrow the book for the user
            book.execute(Book.BORROW, user);

            // remove the book from reserved
            user.getReservations().remove(book);

            // register the borrowed book in the collection of user's borrowed
            user.getBorrowed().add(book);

            // update book
            updateBook(book);


            // remove the reservation and add the borrow
            userDTO = (UserDTO) user.getDTO();
            bookDTO = (BookDTO) book.getDTO();
            bookDAO.deletetReservation(userDTO, bookDTO);
            bookDAO.insertBorrow(userDTO, bookDTO);

        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

    }

    public synchronized void reserveBook(User user, Book book) throws BSException, SecuritPolicyViolationException {
       // ServiceUtils.checkSecurity(user, LibrarySecurityModel.RESERVEBOOK_METHOD,
       //         LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());

        UserDTO userDTO;
        BookDTO bookDTO;

        try {

            // only reserve if the book was not reserved by the user
            if (user.getReservations().contains(book)) {
                throw new BSException("Book already reserved by the user.");

            }

            // borrow the book for the user
            book.execute(Book.RESERVE, user);

            // register the borrowed book in the collection of user's reservations
            user.getReservations().add(book);

            // add the reservation
            userDTO = (UserDTO) user.getDTO();
            bookDTO = (BookDTO) book.getDTO();
            bookDAO.insertReservation(userDTO, bookDTO);

            updateBook(book);

        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }


    }

    public synchronized void giveBackBook(User user, Book book) throws BSException, SecuritPolicyViolationException {
      //  ServiceUtils.checkSecurity(user, LibrarySecurityModel.GIVEBACKBOOK_METHOD,
      //          LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());

        UserDTO userDTO;
        BookDTO bookDTO;

        try {

            // test if the user has borrowed the book
            if (!user.getBorrowed().contains(book)) {
                throw new BSException("The user did not borrow the book.");

            }

            // return back the book
            book.execute(Book.RETURN, user);

            // remove the borrowed book in the collection of user's borrowed
            user.getBorrowed().remove(book);

            // update DB
            userDTO = (UserDTO) user.getDTO();
            bookDTO = (BookDTO) book.getDTO();
            bookDAO.deleteBorrow(userDTO, bookDTO);

            updateBook(book);


        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

    }

    public synchronized void fixBook(User user, Book book) throws BSException, SecuritPolicyViolationException {
      //  ServiceUtils.checkSecurity(user, LibrarySecurityModel.FIXBOOK_METHOD,
      //          LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());

        try {
            // the user fixes the book
            book.execute(Book.FIX, user);
            updateBook(book);


        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        }


    }

    public synchronized void bookDamaged(User user, Book book) throws BSException, SecuritPolicyViolationException {
     //   ServiceUtils.checkSecurity(user, LibrarySecurityModel.FIXBOOK_METHOD,
     //          LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());
        

        try {
            // borrow the book for the user
            book.execute(Book.SETDAMAGED, user);
            updateBook(book);


        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        }


    }


    public void bookRepaired(User user, Book book) throws BSException, SecuritPolicyViolationException {
        //      ServiceUtils.checkSecurity(user, LibrarySecurityModel.FIXBOOK_METHOD,
        //        LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());
        

        try {
            // user notify that the book is now repaired
            book.execute(Book.SETREPAIRED, user);
            updateBook(book);


        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        }
    }

    public synchronized void deliverBook(User user, Book book) throws BSException, SecuritPolicyViolationException {
       //   ServiceUtils.checkSecurity(user, LibrarySecurityModel.DELIVERBOOK_METHOD,
       //         LibrarySecurityModel.BOOK_VIEW, ContextManager.getTemporalContext());

        try {
            // the user deliver the book
            book.execute(Book.DELIVER, user);
            updateBook(book);


        } catch (InvalidActionException e) {
            throw new BSException(e.getMessage());
        }
    }

    public Collection<Book> findBookByState(String state) throws BSException {

        if (!state.equals(Book.AVAILABLE) && !state.equals(Book.BORROWED) && !state.equals(Book.BEINGFIXED)
                && !state.equals(Book.ORDERED) && !state.equals(Book.RESERVED))
            throw new IllegalArgumentException("Wrong state : " + state);

        Collection<DTO> dtos;
        Collection<Book> books;
        Book book;


        try {
            // call dao to find books
            dtos = bookDAO.findBooksByState(state);

            // put the result in the collection
            books = new ArrayList<Book>();

            for (Iterator<DTO> iterator = dtos.iterator(); iterator.hasNext();) {
                book = new Book(iterator.next());
                loadBookReservations(book);
                books.add(book);

            }


        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

        return books;

    }

    public Collection<Book> findBookByKeyword(String keyword) throws BSException {
        if (keyword == null)
            throw new IllegalArgumentException("Wrong argument. Null keyword");


        Collection<DTO> dtos;
        Collection<Book> books;
        Book book;


        try {
            // call dao to find books
            dtos = bookDAO.seachBooksByKeyword(keyword);

            // put the result in the collection
            books = new ArrayList<Book>();

            for (Iterator<DTO> iterator = dtos.iterator(); iterator.hasNext();) {
                book = new Book(iterator.next());
                loadBookReservations(book);
                books.add(book);

            }

        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

        return books;
    }

    private synchronized void updateBook(Book book) throws BSException {

        try {
            // update the book
            bookDAO.update(book.getDTO());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());
        }

    }

    private void loadBookReservations(Book book) throws BSException {

        BookDTO bookDTO;

        try {

            // call dao
            bookDTO = (BookDTO) book.getDTO();
            Collection<DTO> dtos = userDAO.loadUserReservingBook(bookDTO);

            // load reservations
            book.setReservationsFromDTOs(dtos);


        } catch (SQLException e) {
            throw new BSException(e.getMessage());
        }
    }


          /*
    public static void main(String[] args) throws SQLException, BSException, SecuritPolicyViolationException {

        // init the service
        BookService bs = getInstance();
        UserService us = UserService.getInstance();

        // init the account and the user
        BorrowerAccount ba = new BorrowerAccount();
        Student st = new Student(ba);

        User me = us.logUser("momo","TopCykrett",UserService.PERSONNEL_LOGIN_MODE);

        // load a book
        BookDAO dao = BookDAO.getInstance();
        // dao.findBooksByState(BookDTO.AVAILABLE_STATE);

        Collection<DTO> result = dao.findBooksByState(BookDTO.BORROWED_STATE);
        BookDTO bookDTO = (BookDTO) result.iterator().next();

        Book book = new Book();
        book.setFromDTO(bookDTO);
        bs.deliverBook(me, book);

    }   */



}
