package com.library.test.software.sevicetest;

import com.library.bo.user.Borrower;
import com.library.bo.user.BorrowerAccount;
import com.library.bo.user.User;
import com.library.dao.BorrowerAccountDAO;
import com.library.dao.DAOException;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.BorrowerAccountDTO;
import com.library.dao.dto.spec.DTO;
import com.library.security.impl.context.ContextManager;
import com.library.service.BorrowerAccountService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.test.software.sevicetest.spec.FunctionalTestAbstract;
import com.library.test.software.sevicetest.spec.BorrowerAccountServiceTestSpec;

import java.sql.SQLException;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 14:41:24
 */
public class BorrowerAccountServiceTest extends FunctionalTestAbstract implements BorrowerAccountServiceTestSpec {


    //data
    User admin, secretary, director;
    User borrower;

    BorrowerAccount borrowerAccount;

    BorrowerAccountService borrowerAccountService;


    public BorrowerAccountServiceTest() {

        borrowerAccountService = BorrowerAccountService.getInstance();
        UserService userService = UserService.getInstance();

        try {

            admin = userService.logUser("sam", "Obe1kenobe", UserService.PERSONNEL_LOGIN_MODE);
            secretary = userService.logUser("momo", "TopCykrett", UserService.PERSONNEL_LOGIN_MODE);
            director = userService.logUser("tata", "Yube1", UserService.PERSONNEL_LOGIN_MODE);

            // the borrower account

            borrower = userService.logUser("tyty", "Tata", UserService.BORROWER_LOGIN_MODE);
            borrowerAccount = ((Borrower) borrower.getRole()).getBorrowerAccount();

            // the context is defined manually
            ContextManager.doCalculateContext = false;


        } catch (BSException e) {
            e.printStackTrace();
        }


    }

    public void testConsultForDirector() {

        consultScenarioWithUser(director);

    }


    public void testConsultForSecretary() {

        consultScenarioWithUser(secretary);

    }

   public void testConsultForAdmin() {

        consultScenarioWithUser(admin);

    }


    public void testScenarioWithAdmin() {


        try {

            // update the account
            borrowerAccount.setCanBorrow(false);
            borrowerAccountService.updateBorrowerAccount(borrower, borrowerAccount, admin);

            // find out if it was update
            User user = UserService.getInstance().logUser("tyty", "Tata", UserService.BORROWER_LOGIN_MODE);
            BorrowerAccount borrowerAccountResult = ((Borrower) user.getRole()).getBorrowerAccount();

            assertEquals(borrowerAccountResult, borrowerAccount);

            // delete the account
            borrowerAccountService.deleteBorrowerAccount(borrower, borrowerAccount, admin);

            // check that is was deleted
            try {
                BorrowerAccountDAO.getInstance().loadUserBorrowerAccount((UserDTO) user.getDTO());
                fail("the borrower account was not deleted");

            } catch (DAOException e) {
                // ok it did not find
            } catch (SQLException e) {
                fail(e.getMessage());

            }

            // insert account
            borrowerAccount.setCanBorrow(true);
            borrowerAccountService.createBorrowerAccount(borrower, borrowerAccount, admin);

            // find out if it was inserted
            user = UserService.getInstance().logUser("tyty", "Tata", UserService.BORROWER_LOGIN_MODE);
            borrowerAccountResult = ((Borrower) user.getRole()).getBorrowerAccount();


            assertEquals(borrowerAccountResult, borrowerAccount);


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());

        }


    }

    /**
     * Test the consult scenario with user
     *
     * @param user the user that wants to consult the borrower account
     */
    private void consultScenarioWithUser(User user) {

        try {
            BorrowerAccount borrowerAccountResult = borrowerAccountService.consultBorrowerAccount(borrower, user);

            assertEquals(borrowerAccountResult, borrowerAccount);

            // test if the returned result if correct


        } catch (BSException e) {
            fail(e.getMessage());

        } catch (SecuritPolicyViolationException e) {
            fail(e.getMessage());

        }


    }


    
    public void testZZRestoreTestData() {

        BorrowerAccountDAO borrowerAccountDAO;

        try {

            // restore data state before exit

            borrowerAccountDAO = BorrowerAccountDAO.getInstance(); 

            // delete the account and re create it
            borrowerAccountDAO.delete((UserDTO) borrower.getDTO(), (BorrowerAccountDTO) borrowerAccount.getDTO());

            // add the account now
            borrowerAccount.setCanBorrow(true);
            borrowerAccountDAO.insert((UserDTO) borrower.getDTO(), (BorrowerAccountDTO) borrowerAccount.getDTO());

            // retrieve the account data
            DTO dto  = borrowerAccountDAO.loadUserBorrowerAccount((UserDTO) borrower.getDTO());
            borrowerAccount.setFromDTO(dto);



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (DAOException e) {
            e.printStackTrace();
        }


    }


}
