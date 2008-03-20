package com.library.service.spec;

import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.bo.book.Book;

import java.util.Collection;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:41:43
 */
public interface BookServiceInterface {

    /**
     * Borrow a book for the user, save in the database the state of the book
     *
     * @param user the user who want to borrow
     * @param book the book that will be borrowed
     * @throws BSException Business Exception throwed if any problem
     * @throws SecuritPolicyViolationException if any security access problem
     */
    void borrowBook(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;


    /**
     * reserve a book for the user, save in the database the state of the book
     *
     * @param user the user who want to reserve the book
     * @param book the book that will be reserved
     * @throws BSException Business Exception throwed if any problem
     * @throws SecuritPolicyViolationException  if any security access problem
     */
    void  reserveBook(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;


    /**
     * give back a book, save in the database the state of the book
     *
     * @param user the user who want to give back the book
     * @param book the book that will be returned
     * @throws BSException Business Exception throwed if any problem
     * @throws SecuritPolicyViolationException  if any security access problem
     */
    void  giveBackBook(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;


    /**
     * fix a book, save in the database the state of the book
     *
     * @param user the user that fixed the book
     * @param book the book that is fixed
     * @throws BSException Business Exception throwed if any problem
     * @throws SecuritPolicyViolationException  if any security access problem
     */
    void fixBook(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;


    /**
     * save in the database the state of the book (the book is damaged)
     *
     * @param user who reports that the book is damaged
     * @param book the book that is damaged
     * @throws BSException Business Exception throwed if any problem
     * @throws SecuritPolicyViolationException   if any security access problem
     */
    void bookDamaged(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;

    /* save in the database the state of the book (the book is repaired)
      *
      * @param user who reports that the book is damaged
      * @param book the book that is damaged
      * @throws BSException Business Exception throwed if any problem
      * @throws SecuritPolicyViolationException   if any security access problem
      */
     void bookRepaired(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;


    /**
     * A new book is delived to the library.
     * save in the database, the new book.
     *
     * @param user who delivered the book
     * @param book the delivered book
     * @throws BSException Business Exception throwed if any problem
     * @throws SecuritPolicyViolationException  if any security access problem
     */
    void deliverBook(com.library.bo.user.User user, com.library.bo.book.Book book) throws BSException, SecuritPolicyViolationException;


    /**
     * look for books that have the given state
     * @param state the state of book
     * @return list of books
     * @throws BSException if any problem
     */
    Collection<Book> findBookByState(String state) throws BSException;


    /**
     * look for books with titles containing the given keyword
     * @param keyword hte keyword
     * @return list of books
     * @throws BSException if any problem
     */
    Collection<Book> findBookByKeyword(String keyword) throws BSException;




}
