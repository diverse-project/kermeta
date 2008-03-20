package com.library.dao.spec;

import com.library.dao.DAOException;
import com.library.dao.dto.BorrowerAccountDTO;
import com.library.dao.dto.UserDTO;

import java.sql.SQLException;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 16:45:10
 */
public interface BorrowerAccountDAOInterface {


    /**
     * Loads the user borrower account
     *
     * @param userDTO the user
     * @return the borrowerAccount
     * @throws SQLException if any sql problem
     * @throws com.library.dao.DAOException if ant DAO problem (not entry found)
     */
    BorrowerAccountDTO loadUserBorrowerAccount(UserDTO userDTO) throws SQLException, DAOException;

    /**
     * Add new account and return the id
     *
     * @param borrowerAccountDTO the account
     * @param userDTO            the user
     * @return the inserted account with the id
     * @throws SQLException if any sql problem
     */
    BorrowerAccountDTO insert(UserDTO userDTO, BorrowerAccountDTO borrowerAccountDTO) throws SQLException;

    /**
     * Updates the borrower's account
     *
     * @param borrowerAccountDTO the borrower account
     * @throws SQLException if any sql problem
     */
    void update(BorrowerAccountDTO borrowerAccountDTO) throws SQLException;

    void delete(UserDTO userDTO, BorrowerAccountDTO borrowerAccountDTO) throws SQLException;


}
