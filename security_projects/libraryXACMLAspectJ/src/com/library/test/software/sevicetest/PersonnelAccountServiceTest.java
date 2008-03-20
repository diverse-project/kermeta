package com.library.test.software.sevicetest;

import com.library.bo.user.Personnel;
import com.library.bo.user.PersonnelAccount;
import com.library.bo.user.User;
import com.library.dao.DAOException;
import com.library.dao.PersonnelAccountDAO;
import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.security.impl.context.ContextManager;
import com.library.service.PersonnelAccountService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.test.software.sevicetest.spec.FunctionalTestAbstract;
import com.library.test.software.sevicetest.spec.PersonnelAccountServiceTestSpec;

import java.sql.SQLException;

/**
 * User: Tej
 * Date: 12 mars 2007
 * Time: 14:41:24
 */
public class PersonnelAccountServiceTest extends FunctionalTestAbstract implements PersonnelAccountServiceTestSpec {


    //data
    User admin;
    User personnel;

    PersonnelAccount personnelAccount;

    PersonnelAccountService personnelAccountService;


    public PersonnelAccountServiceTest() {

        personnelAccountService = PersonnelAccountService.getInstance();
        UserService userService = UserService.getInstance();

        try {

            admin = userService.logUser("sam", "Obe1kenobe", UserService.PERSONNEL_LOGIN_MODE);

            // the borrower account

            personnel = userService.logUser("tftf", "titiopop", UserService.PERSONNEL_LOGIN_MODE);
            personnelAccount = ((Personnel) personnel.getRole()).getPersonnelAccount();


            // the context is defined manually
            ContextManager.doCalculateContext = false;


        } catch (BSException e) {

            e.printStackTrace();
        }


    }







    public void testScenarioWithAdmin() {


        try {

            // update the account
            personnelAccount.setCanConsultBorrowerAccount(false);
            personnelAccountService.updatePersonnelAccount(personnel, personnelAccount, admin);

            // find out if it was update
            User user = UserService.getInstance().logUser("tftf", "titiopop", UserService.PERSONNEL_LOGIN_MODE);
            PersonnelAccount personnelAccountResult = ((Personnel) user.getRole()).getPersonnelAccount();

            assertEquals(personnelAccountResult, personnelAccount);

            // delete the account
            personnelAccountService.deletePersonnelAccount(personnel, personnelAccount, admin);

            // check that is was deleted
            try {
                PersonnelAccountDAO.getInstance().loadUserPersonnelAccount((UserDTO) user.getDTO());
                fail("the personnel account was not deleted");

            } catch (DAOException e) {
                // ok it did not find
            } catch (SQLException e) {
                fail(e.getMessage());

            }

            // insert account
            personnelAccount.setCanConsultBorrowerAccount(true);
            personnelAccountService.createPersonnelAccount(personnel,personnelAccount,admin);

             // find out if it was inserted
            user = UserService.getInstance().logUser("tftf", "titiopop", UserService.PERSONNEL_LOGIN_MODE);
            personnelAccountResult = ((Personnel) user.getRole()).getPersonnelAccount();

            assertEquals(personnelAccountResult, personnelAccount);


        } catch (BSException e) {
            testZRestoreTestData();
          fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            testZRestoreTestData();
            fail(e.getMessage());

        }


    }


       public void testZRestoreTestData() {

        PersonnelAccountDAO personnelAccountDAO;

        try {

            // restore data state before exit

            personnelAccountDAO = PersonnelAccountDAO.getInstance();

            // delete the account and re create it
            personnelAccountDAO.delete((UserDTO) personnel.getDTO(), (PersonnelAccountDTO) personnelAccount.getDTO());

            // add the account now
            personnelAccount.setCanConsultBorrowerAccount(true);
            personnelAccountDAO.insert((UserDTO) personnel.getDTO(), (PersonnelAccountDTO) personnelAccount.getDTO());


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }





}
