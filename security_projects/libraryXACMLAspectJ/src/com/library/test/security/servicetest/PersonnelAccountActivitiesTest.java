package com.library.test.security.servicetest;

import com.library.bo.user.Personnel;
import com.library.bo.user.PersonnelAccount;
import com.library.bo.user.User;
import com.library.dao.DAOException;
import com.library.dao.PersonnelAccountDAO;
import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.service.PersonnelAccountService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.test.security.SecurityPoliciesTest;
import com.library.test.security.spec.ActivityTestAbstract;

import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 08:36:48
 */
public class PersonnelAccountActivitiesTest extends ActivityTestAbstract {

    // local sec test data
    private PersonnelAccount personnelAccount;

    // dao
    PersonnelAccountDAO personnelAccountDAO;
    User user;


    /**
     * Prepares the arguments
     *
     * @param role the user role to create
     * @param m    the method that will be invoked
     * @return an array containing the method parameters
     */
    protected Object[] prepareArguments(Class role, Method m) {

        Object[] args;

        // borrowe account service methods take only 3 arguments except consult method



        args = new Object[3];

        args[0] = rolesMap.get(role);
        args[1] = personnelAccount;
        args[2] = rolesMap.get(role);


        return args;

    }

    protected void initData() {

        // log message
        SecurityPoliciesTest.log.info("Starting personnel account service security test!");

        // init services
        serviceBO = new PersonnelAccountService();

        // dao
        personnelAccountDAO = PersonnelAccountDAO.getInstance();

        UserService userService = UserService.getInstance();

        try {

            user = userService.logUser("momo", "TopCykrett", UserService.PERSONNEL_LOGIN_MODE);
            // load book
            personnelAccount = new PersonnelAccount();
            personnelAccount.setFromDTO(personnelAccountDAO.loadUserPersonnelAccount((UserDTO) user.getDTO()));

        } catch (BSException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (DAOException e) {
            e.printStackTrace();

        }
    }

    protected void restoreTestDataState() {

        // reset user account
        try {

            PersonnelAccountDTO personnelAccountDTO = (PersonnelAccountDTO) personnelAccount.getDTO();
            personnelAccountDTO.setId_user(user.getUserId());

            personnelAccountDAO.delete((UserDTO) user.getDTO(),personnelAccountDTO);

            personnelAccount = new PersonnelAccount();
            personnelAccount.setFromDTO(personnelAccountDAO.insert((UserDTO) user.getDTO(),
                    (PersonnelAccountDTO) personnelAccount.getDTO()));

            // put the account again
            ((Personnel) user.getRole()).setPersonnelAccount(personnelAccount);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    protected void setUp() throws Exception {
        super.setUp();
    }


    protected void tearDown() throws Exception {
        super.tearDown();
    }


}