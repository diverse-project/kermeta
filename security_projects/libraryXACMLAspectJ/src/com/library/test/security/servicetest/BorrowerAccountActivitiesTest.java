package com.library.test.security.servicetest;

import com.library.bo.user.BorrowerAccount;
import com.library.bo.user.User;
import com.library.bo.user.Borrower;
import com.library.dao.BorrowerAccountDAO;
import com.library.dao.DAOException;
import com.library.dao.dto.BorrowerAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.security.impl.LibrarySecurityModel;
import com.library.service.BorrowerAccountService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.test.security.SecurityPoliciesTest;
import com.library.test.security.spec.ActivityTestAbstract;

import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * User: Tej
 * Date: 8 mars 2007
 * Time: 12:44:35
 */
public class BorrowerAccountActivitiesTest extends ActivityTestAbstract {

    // local sec test data
    private BorrowerAccount borrowerAccount;

    // dao
    BorrowerAccountDAO borrowerAccountDAO;
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

        if (m.equals(LibrarySecurityModel.CONSULTBORROWERACCOUNT_METHOD[0])) {

            args = new Object[2];
            args[0] = rolesMap.get(role);
            args[1] = rolesMap.get(role);

        } else {

        args = new Object[3];

        args[0] = rolesMap.get(role);
        args[1] = borrowerAccount;
        args[2] = rolesMap.get(role);

        }
        return args;

    }

    protected void initData() {

        // log message
        SecurityPoliciesTest.log.info("Starting borrower account's service security test!");

        // init services
        serviceBO = new BorrowerAccountService();

        // dao
        borrowerAccountDAO = BorrowerAccountDAO.getInstance();

        UserService userService = UserService.getInstance();

        try {

            user = userService.logUser("tutu", "Not2Hard", UserService.BORROWER_LOGIN_MODE);
            // load book
            borrowerAccount = new BorrowerAccount();
            borrowerAccount.setFromDTO(borrowerAccountDAO.loadUserBorrowerAccount((UserDTO) user.getDTO()));

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

            BorrowerAccountDTO borrowerAccountDTO = (BorrowerAccountDTO) borrowerAccount.getDTO();
            borrowerAccountDTO.setId_user(user.getUserId());

            borrowerAccountDAO.delete((UserDTO) user.getDTO(),borrowerAccountDTO);

            borrowerAccount = new BorrowerAccount();
            borrowerAccount.setFromDTO(borrowerAccountDAO.insert((UserDTO) user.getDTO(),
                    (BorrowerAccountDTO) borrowerAccount.getDTO()));

            // put the account again
            ((Borrower) user.getRole()).setBorrowerAccount(borrowerAccount);

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
