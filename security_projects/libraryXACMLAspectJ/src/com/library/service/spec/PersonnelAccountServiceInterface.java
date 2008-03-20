package com.library.service.spec;

import com.library.bo.user.PersonnelAccount;
import com.library.bo.user.User;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;

/**
 * User: Tej
 * Date: 6 mars 2007
 * Time: 10:22:51
 */
public interface PersonnelAccountServiceInterface {

    /**
     * create a new personnel account
     * @param personnel the user
     * @param personnelAccount the account
     * @param connectedUser  the user who requests the action
     */
    void createPersonnelAccount(User personnel, PersonnelAccount personnelAccount, User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * update the personnel account
     * @param personnel the user
     * @param personnelAccount the account
     * @param connectedUser  the user who requests the action
     */
    void updatePersonnelAccount(User personnel, PersonnelAccount personnelAccount, User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * delete the personnel account
     * @param personnel the user
     * @param personnelAccount the account
     * @param connectedUser  the user who requests the action
     */
    void deletePersonnelAccount(User personnel, PersonnelAccount personnelAccount, User connectedUser) throws BSException, SecuritPolicyViolationException;
}
