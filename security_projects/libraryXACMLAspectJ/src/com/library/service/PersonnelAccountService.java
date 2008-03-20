package com.library.service;

import com.library.bo.user.PersonnelAccount;
import com.library.bo.user.User;
import com.library.dao.PersonnelAccountDAO;
import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.spec.PersonnelAccountServiceInterface;
import com.library.security.impl.LibrarySecurityModel;

import java.sql.SQLException;

/**
 * User: Tej
 * Date: 6 mars 2007
 * Time: 10:21:15
 */
public class PersonnelAccountService  extends ServiceBO  implements PersonnelAccountServiceInterface {


    private static PersonnelAccountService ourInstance = new PersonnelAccountService();

    private PersonnelAccountDAO personnelAccountDAO;

    public static PersonnelAccountService getInstance() {
        return ourInstance;
    }

    public PersonnelAccountService() {

        super();
        // initializes the DAO
        if (personnelAccountDAO == null)
            personnelAccountDAO = PersonnelAccountDAO.getInstance();

    }

    public void createPersonnelAccount(User personnel, PersonnelAccount personnelAccount, User connectedUser) throws BSException, SecuritPolicyViolationException {
        // check security policy
        //ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
        //        LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        // create DTOs
        PersonnelAccountDTO personnelAccountDTO;

        personnelAccountDTO = (PersonnelAccountDTO) personnelAccount.getDTO();
        personnelAccountDTO.setId_user(personnel.getUserId());


        try {
            personnelAccountDAO.insert((UserDTO) personnel.getDTO(), personnelAccountDTO);

            // set the new created id
            personnelAccount.setPersonnelAccountID(personnelAccountDTO.getId_personnel_account());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }
    }

    public void updatePersonnelAccount(User personnel, PersonnelAccount personnelAccount, User connectedUser) throws BSException, SecuritPolicyViolationException {
       // check security policy
       // ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
       //         LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        // create DTOs
        PersonnelAccountDTO personnelAccountDTO;

        personnelAccountDTO = (PersonnelAccountDTO) personnelAccount.getDTO();
        personnelAccountDTO.setId_user(personnel.getUserId());

        try {
            //updating
            personnelAccountDAO.update(personnelAccountDTO);

        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

    }

    public void deletePersonnelAccount(User personnel, PersonnelAccount personnelAccount, User connectedUser) throws BSException, SecuritPolicyViolationException {
        
        // check security policy
        //ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
        //        LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        // create DTOs
        PersonnelAccountDTO personnelAccountDTO;

        personnelAccountDTO = (PersonnelAccountDTO) personnelAccount.getDTO();
        personnelAccountDTO.setId_user(personnel.getUserId());

        try {
            //updating
            personnelAccountDAO.delete((UserDTO) personnel.getDTO(), personnelAccountDTO);

        } catch (SQLException e) {
            throw new BSException(e.getMessage());
        }
    }
}
