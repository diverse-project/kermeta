package com.library.service.spec;

import com.library.bo.user.User;
import com.library.bo.user.BorrowerAccount;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;

/**
 * User: Tej
 * Date: 6 mars 2007
 * Time: 10:21:34
 */
public interface BorrowerAccountServiceInterface {

    /**
     * create a new borrower account
     * @param borrower the user borrower
     * @param borrowerAccount the account
     * @param connectedUser  the user who requests the action
     */
    void createBorrowerAccount(User borrower, BorrowerAccount borrowerAccount, User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * update the borrower account
     * @param borrower the user borrower
     * @param borrowerAccount the account
     * @param connectedUser  the user who requests the action
     */
    void updateBorrowerAccount(User borrower, BorrowerAccount borrowerAccount, User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * delete the borrower account
     * @param borrower the user borrower
     * @param borrowerAccount the account
     * @param connectedUser  the user who requests the action
     */
    void deleteBorrowerAccount(User borrower, BorrowerAccount borrowerAccount, User connectedUser) throws BSException, SecuritPolicyViolationException;


    /**
     * consult the borrower account
     * @param borrower the user borrower
     * @param connectedUser  the user who requests the action
     * @throws BSException
     */
    BorrowerAccount consultBorrowerAccount(User borrower,User connectedUser) throws BSException, SecuritPolicyViolationException;

}
