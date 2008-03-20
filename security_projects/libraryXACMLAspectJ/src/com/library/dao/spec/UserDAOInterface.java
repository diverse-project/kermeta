package com.library.dao.spec;

import com.library.dao.dto.UserDTO;
import com.library.dao.dto.BookDTO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.DAOException;

import java.sql.SQLException;
import java.util.Collection;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 16:39:28
 */
public interface UserDAOInterface {


    UserDTO insertUser(UserDTO userDTO) throws SQLException;

    void updateUser(UserDTO userDTO) throws SQLException;

    void deleteUser(UserDTO userDTO) throws SQLException;

    void insertUserRole(UserDTO userDTO,String role) throws SQLException;

    void deleteUserRole(UserDTO userDTO,String role) throws SQLException;

    /**
     * Checks if login and password are in the dataBase
     *
     * @param userDTO the user DTO that contain all needed infos
     * @return true if success false if not
     * @throws java.sql.SQLException if there is any DB problem
     */
    boolean checkLoginAndPassword(UserDTO userDTO) throws SQLException;


    /**
     *
     * Loads the information about the user.
     *
     * @param userDTO the user dto login and password are the only needed fields
     * @return a user dto that matches login and password (must be unique
     * @throws SQLException if sql related exception occurs
     * @throws DAOException if many lines are found
     */
    UserDTO loadUserFromLoginAndPassword(UserDTO userDTO) throws SQLException, DAOException;

       /**
     * Loads users that reserved the book about the user.
     *
     * @return a collection of users
     * @throws SQLException if a sql problem happens
     */
    Collection<DTO> loadUserReservingBook(BookDTO bookDTO) throws SQLException;


    /**
     * Loads borrowed books about the user.
     *
     * @return a user who borrowed the book
     * @throws SQLException if a sql problem happens
     */
    DTO loadUserBorrowingBook(BookDTO bookDTO) throws SQLException, DAOException;


    /**
     *
     * @param userDTO the user
     * @param roleMode the role can be BORROWER or PERSONNEL
     * @return true if an entry is found false else
     * @throws SQLException if any sql exception
     */
    String checkUserRoleMatche(UserDTO userDTO,String roleMode) throws SQLException, DAOException;







}
