package com.library.test.hwsecurity.servicetest;

import com.library.bo.user.Borrower;
import com.library.bo.user.BorrowerAccount;
import com.library.bo.user.User;
import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;
import com.library.security.model.context.Context;
import com.library.service.BorrowerAccountService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.test.hwsecurity.servicetest.spec.BorrowerAccountServiceSecTestSpec;
import junit.framework.TestCase;

/**
 * User: tej
 * Date: 21 mars 2007
 * Time: 11:07:48
 */
public class BorrowerAccountServiceSecTest extends TestCase implements BorrowerAccountServiceSecTestSpec {


    private BorrowerAccountService borrowerAccountService;
    private User borrower4Test;
    private User student, teacher, borrower;
    private User personnel, admin, secretary, director;
    private BorrowerAccount borrowerAccount;


    public BorrowerAccountServiceSecTest() {

        // init service
        borrowerAccountService = BorrowerAccountService.getInstance();

        UserService userService = UserService.getInstance();

        try {
            // init users
            student = userService.logUser("tutu", "Not2Hard", UserService.BORROWER_LOGIN_MODE);
            teacher = userService.logUser("titi", "Z1forU", UserService.BORROWER_LOGIN_MODE);
            borrower = userService.logUser("bobo", "B14me", UserService.BORROWER_LOGIN_MODE);


            admin = userService.logUser("sam", "Obe1kenobe", UserService.PERSONNEL_LOGIN_MODE);
            secretary = userService.logUser("momo", "TopCykrett", UserService.PERSONNEL_LOGIN_MODE);
            director = userService.logUser("tata", "Yube1", UserService.PERSONNEL_LOGIN_MODE);
            personnel = userService.logUser("juju", "JI14one!", UserService.PERSONNEL_LOGIN_MODE);

            borrower4Test = userService.logUser("tyty", "Tata", UserService.BORROWER_LOGIN_MODE);
            borrowerAccount = ((Borrower) borrower4Test.getRole()).getBorrowerAccount();

            // the context is defined manually
            ContextManager.doCalculateContext = false;

        } catch (BSException e) {
            e.printStackTrace();
        }

    }

    
    public void testIllegalScenarioAdmin() {

        // call do illegal scenario with user with all contexts except default_context
        doTestIllegalScenarioWithUserAndContext(admin, ContextManager.holidays);
        doTestIllegalScenarioWithUserAndContext(admin, ContextManager.workingday);
        doTestIllegalScenarioWithUserAndContext(admin, ContextManager.maintenanceDay);

        // admin must not consult borrower account at any time
        doIllegalScenarioConsultAccount(admin, ContextManager.holidays);
        doIllegalScenarioConsultAccount(admin, ContextManager.workingday);
        doIllegalScenarioConsultAccount(admin, ContextManager.maintenanceDay);

    }

    public void testIllegalScenarioDirector() {


        doIllegalScenarioConsultAccount(director, ContextManager.maintenanceDay);

        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(director);

        // verify that user do not consult in all contexts except default one
        doIllegalScenarioConsultAccount(director, ContextManager.holidays);
        doIllegalScenarioConsultAccount(director, ContextManager.workingday);



    }

    public void testIllegalScenarioSecretary() {

        doIllegalScenarioConsultAccount(secretary, ContextManager.maintenanceDay);


        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(secretary);

        // verify that user do not consult in all contexts except default one
        doIllegalScenarioConsultAccount(secretary, ContextManager.holidays);
        doIllegalScenarioConsultAccount(secretary, ContextManager.workingday);

    }

    public void testIllegalScenarioPersonnel() {


        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(personnel);

        // verify that user do not consult in all contexts except default one
        doIllegalScenarioConsultAccount(personnel, ContextManager.holidays);
        doIllegalScenarioConsultAccount(personnel, ContextManager.workingday);
        doIllegalScenarioConsultAccount(personnel, ContextManager.maintenanceDay);


        

    }

    public void testIllegalScenarioBorrower() {


        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(borrower);

        // borrowers must not consult borrower account at any time
        doIllegalScenarioConsultAccount(borrower, ContextManager.holidays);
        doIllegalScenarioConsultAccount(borrower, ContextManager.workingday);
        doIllegalScenarioConsultAccount(borrower, ContextManager.maintenanceDay);

        LibrarySecurityModel.DEFAULT_CONTEXT = new Context("DEFAULT");
        doIllegalScenarioConsultAccount(borrower, LibrarySecurityModel.DEFAULT_CONTEXT);
        

    }

    public void testIllegalScenarioStudent() {
        
        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(student);

        // borrowers must not consult borrower account at any time
        doIllegalScenarioConsultAccount(student, ContextManager.holidays);
        doIllegalScenarioConsultAccount(student, ContextManager.workingday);
        doIllegalScenarioConsultAccount(student, ContextManager.maintenanceDay);

        LibrarySecurityModel.DEFAULT_CONTEXT = new Context("DEFAULT");
        doIllegalScenarioConsultAccount(teacher, LibrarySecurityModel.DEFAULT_CONTEXT);


    }

    public void testIllegalScenarioTeacher() {


        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(teacher);

        // borrowers must not consult borrower account at any time
        doIllegalScenarioConsultAccount(teacher, ContextManager.holidays);
        doIllegalScenarioConsultAccount(teacher, ContextManager.workingday);
        doIllegalScenarioConsultAccount(teacher, ContextManager.maintenanceDay);

        LibrarySecurityModel.DEFAULT_CONTEXT = new Context("DEFAULT");
        doIllegalScenarioConsultAccount(teacher, LibrarySecurityModel.DEFAULT_CONTEXT);
    }


    /**
     * test scenario with all contexts
     *
     * @param user the user who will perform the scenario
     */
    private void doIllegalScenarioForAllContexts(User user) {

        doTestIllegalScenarioWithUserAndContext(user, ContextManager.holidays);
        doTestIllegalScenarioWithUserAndContext(user, ContextManager.workingday);
        doTestIllegalScenarioWithUserAndContext(user, ContextManager.maintenanceDay);

        LibrarySecurityModel.DEFAULT_CONTEXT = new Context("DEFAULT");
        doTestIllegalScenarioWithUserAndContext(user, LibrarySecurityModel.DEFAULT_CONTEXT);
        

    }


    /**
     * @param user    the user who will perform the scenario
     * @param context the context in which the scenario takes place
     */
    private void doTestIllegalScenarioWithUserAndContext(User user, Context context) {


        try {

            // update the account
            // set context to a context
            LibrarySecurityModel.DEFAULT_CONTEXT = context;
            borrowerAccountService.updateBorrowerAccount(borrower4Test, borrowerAccount, user);

            // if we go here then failure
             fail("should not update borrower accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            // ok test succeeded
        }

        try {

            // delete the account
            // set context to a context
            LibrarySecurityModel.DEFAULT_CONTEXT = context;
            borrowerAccountService.deleteBorrowerAccount(borrower4Test, borrowerAccount, user);

             // if we go here then failure
             fail("should not delete borrower accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            // ok test succeeded
        }

        try {

            // create the account
            // set context to a context
            LibrarySecurityModel.DEFAULT_CONTEXT = context;
            borrowerAccountService.createBorrowerAccount(borrower4Test, borrowerAccount, user);

            // if we go here then failure
             fail("should not create borrower accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            // ok test succeeded
        }


    }

    private void doIllegalScenarioConsultAccount(User user, Context context) {

        try {

            // update the account
            // set context to a context
            LibrarySecurityModel.DEFAULT_CONTEXT = context;
            borrowerAccountService.consultBorrowerAccount(borrower4Test, user);

            // if we go here then failure
             fail("should not consult borrower accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            // ok test succeeded
        }


    }


    protected void tearDown() throws Exception {
        super.tearDown();

        LibrarySecurityModel.DEFAULT_CONTEXT = new Context("DEFAULT");



    }
}
