package com.library.service;

import com.library.bo.user.BorrowerAccount;
import com.library.bo.user.User;
import com.library.dao.BorrowerAccountDAO;
import com.library.dao.DAOException;
import com.library.dao.dto.BorrowerAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.security.impl.LibrarySecurityModel;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.spec.BorrowerAccountServiceInterface;

import java.sql.SQLException;

/**
 * User: Tej
 * Date: 6 mars 2007
 * Time: 10:21:03
 */
public class BorrowerAccountService extends ServiceBO  implements BorrowerAccountServiceInterface {

   private static BorrowerAccountService ourInstance = new BorrowerAccountService();

    private BorrowerAccountDAO borrowerAccountDAO;

    public static BorrowerAccountService getInstance() {
        return ourInstance;
    }

    public BorrowerAccountService() {

        super();
        // initializes the DAO
        if (borrowerAccountDAO == null)
            borrowerAccountDAO = BorrowerAccountDAO.getInstance();

    }

    
    public void createBorrowerAccount(User borrower, BorrowerAccount borrowerAccount, User connectedUser) throws BSException, SecuritPolicyViolationException {
        // ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.CREATEACCOUNT_METHOD,
        //        LibrarySecurityModel.BORROWERACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        // create DTOs
        BorrowerAccountDTO borrowerAccountDTO;

        borrowerAccountDTO = (BorrowerAccountDTO) borrowerAccount.getDTO();
        borrowerAccountDTO.setId_user(borrower.getUserId());

        try {
            borrowerAccountDAO.insert((UserDTO) borrower.getDTO(),borrowerAccountDTO);

            // set the new created id
            borrowerAccount.setBorrowerAccountID(borrowerAccountDTO.getId_borrower_account());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());
            
        }
    }

    public void updateBorrowerAccount(User borrower, BorrowerAccount borrowerAccount, User connectedUser) throws BSException, SecuritPolicyViolationException {
        //   ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MODIFYACCOUNT_METHOD,
        //        LibrarySecurityModel.BORROWERACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        // create DTOs
        BorrowerAccountDTO borrowerAccountDTO;

        borrowerAccountDTO = (BorrowerAccountDTO) borrowerAccount.getDTO();
        borrowerAccountDTO.setId_user(borrower.getUserId());

        try {
            //updating
            borrowerAccountDAO.update(borrowerAccountDTO);

        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }
    }

    public void deleteBorrowerAccount(User borrower, BorrowerAccount borrowerAccount, User connectedUser) throws BSException, SecuritPolicyViolationException {

        // check security policy
        //ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MODIFYACCOUNT_METHOD,
        //        LibrarySecurityModel.BORROWERACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        // create DTOs
        BorrowerAccountDTO borrowerAccountDTO;

        borrowerAccountDTO = (BorrowerAccountDTO) borrowerAccount.getDTO();
        borrowerAccountDTO.setId_user(borrower.getUserId());


        try {

            // deleting
            borrowerAccountDAO.delete((UserDTO) borrower.getDTO(),borrowerAccountDTO);


        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }
    }

    public BorrowerAccount consultBorrowerAccount(User borrower, User connectedUser) throws BSException, SecuritPolicyViolationException {
          // check security policy
        // ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.CONSULTBORROWERACCOUNT_METHOD,
        //         LibrarySecurityModel.BORROWERACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        BorrowerAccountDTO borrowerAccountDTO;
        BorrowerAccount ba;


        try {
            borrowerAccountDTO = borrowerAccountDAO.loadUserBorrowerAccount((UserDTO) borrower.getDTO());

            ba = new BorrowerAccount();
            ba.setFromDTO(borrowerAccountDTO);

        } catch (DAOException e) {
            throw new BSException(e.getMessage());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

        return ba;
    }

}
