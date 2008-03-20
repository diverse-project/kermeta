package com.library.dao.spec;

import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.DAOException;

import java.sql.SQLException;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 16:45:25
 */
public interface PersonnelAccountDAOInterface {


    /**
     * Loads the user personnel account
     *
     * @return
     * @throws java.sql.SQLException
     */
    PersonnelAccountDTO loadUserPersonnelAccount(UserDTO userDTO) throws SQLException, DAOException;


     /**
     * Add new account and return the id
     *
     * @param personnelAccountDTO the account
     * @param userDTO            the user
     * @return the inserted account with the id
     * @throws SQLException if any sql problem
     */
    PersonnelAccountDTO insert(UserDTO userDTO, PersonnelAccountDTO personnelAccountDTO) throws SQLException;

    /**
     *
     * @param personnelAccountDTO the account
     * @throws SQLException if any sql problems
     */
    void update(PersonnelAccountDTO personnelAccountDTO) throws SQLException;

    /**
     * 
     * @param userDTO the user
     * @param personnelAccountDTO the account
     * @throws SQLException if any sql problems
     */
    void delete(UserDTO userDTO, PersonnelAccountDTO personnelAccountDTO) throws SQLException;




}
