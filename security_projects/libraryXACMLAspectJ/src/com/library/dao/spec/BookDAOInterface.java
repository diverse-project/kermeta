package com.library.dao.spec;

import com.library.dao.dto.BookDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;

import java.sql.SQLException;
import java.util.Collection;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 14:01:43
 */
public interface BookDAOInterface {

    /**
     * @param state the state name can be <AVAILABLE,BORROWED,REPAIRED,DAMAGED
     * @return list of books having the requested state
     */
    Collection<DTO> findBooksByState(String state) throws SQLException;


    /**
     * @param author used to find
     * @return list of author's books
     */
    Collection<DTO> seachBooksByKeyword(String author) throws SQLException;

    /**
     * Update the book values stored in the database
     *
     * @param dto
     * @throws SQLException
     */

    void update(DTO dto) throws SQLException;


    /**
     * insert the book values to the database, creates a new entry and set the book_id value
     *
     * @param dto
     * @throws SQLException
     */
    void insert(DTO dto) throws SQLException;

    /**
     * Loads reservations books about the user.
     *
     * @param userDTO
     * @return a collection of books
     * @throws SQLException if a sql problem happens
     */
    Collection<DTO> loadUserReservedBooks(UserDTO userDTO) throws SQLException;


    /**
     * Loads borrowed books about the user.
     *
     * @param userDTO the user
     * @return the list of borrowed books
     * @throws SQLException
     */
    Collection<DTO> loadUserBorrowedBooks(UserDTO userDTO) throws SQLException;

    /**
     * saves in DB the borrow of bookdto by userdto
     *
     * @param userDTO the user
     * @param bookDTO the book
     * @throws SQLException if sql problem
     */
    void insertBorrow(UserDTO userDTO, BookDTO bookDTO) throws SQLException;

    /**
     * saves in DB the reservation of bookdto by userdto
     *
     * @param userDTO the user
     * @param bookDTO the book
     * @throws SQLException if sql problem
     */
    void insertReservation(UserDTO userDTO, BookDTO bookDTO) throws SQLException;

    /**
     * deletes from DB the borrow of bookdto by userdto
     *
     * @param userDTO the user
     * @param bookDTO the book
     * @throws SQLException if sql problem
     */
    void deleteBorrow(UserDTO userDTO, BookDTO bookDTO) throws SQLException;


   /**
     * deletes from DB the borrow of bookdto
     *
     * @param bookDTO the book
     * @throws SQLException if sql problem
     */
    void deleteAllBorrow( BookDTO bookDTO) throws SQLException;



    /**
     * deletes from DB the reservation of bookdto by userdto
     *
     * @param userDTO the user
     * @param bookDTO the book
     * @throws SQLException if sql problem
     */
    void deletetReservation(UserDTO userDTO, BookDTO bookDTO) throws SQLException;

     /**
     * deletes from DB book reservations
     *
     * @param bookDTO the book
     * @throws SQLException if sql problem
     */
    void deletetAllReservations(BookDTO bookDTO) throws SQLException;


}
