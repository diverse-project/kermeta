package com.library.service.spec;

import com.library.bo.user.User;
import com.library.bo.user.Role;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;

/**
 * User: Tej
 * Date: 6 mars 2007
 * Time: 10:47:40
 */
public interface UserServiceInterface {

    /**
     * create a new user
     * @param user the user to create
     * @param connectedUser the connected user
     * @return the created user
     * @throws com.library.service.exception.BSException
     */
    User createUser(User user,User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * create a role for the user
     * @param user the user to create
     * @param connectedUser the connected user
     * @param role the role to create
     * @throws com.library.service.exception.BSException
     */
    void createUserRole(User user, Role role,User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * create a new user
     * @param user the user to create
     * @param connectedUser the connected user
     * @throws com.library.service.exception.BSException
     */
    void deleteUser(User user,User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     * create a role for the user
     * @param user the user to create
     * @param connectedUser the connected user
     * @param role the role to delete
     * @throws com.library.service.exception.BSException
     */
    void deleteUserRole(User user, Role role,User connectedUser) throws BSException, SecuritPolicyViolationException;

    /**
     *
     * @param login  the user login
     * @param password  the user password
     * @param loginMode the login mode can be PERSONNEL or BORROWER
     * @return  the user
     * @throws BSException if problems occur
     */
    User logUser(String login,String password,String loginMode) throws BSException;

    
}
