package com.library.test.hwsecurity.servicetest;

import com.library.bo.user.Personnel;
import com.library.bo.user.PersonnelAccount;
import com.library.bo.user.User;
import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;
import com.library.security.model.context.Context;
import com.library.service.PersonnelAccountService;
import com.library.service.UserService;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.test.hwsecurity.servicetest.spec.PersonnelAccountServiceSecTestSpec;
import junit.framework.TestCase;

/**
 * User: tej
 * Date: 21 mars 2007
 * Time: 11:08:13
 */
public class PersonnelAccountServiceSecTest extends TestCase implements PersonnelAccountServiceSecTestSpec {

    private PersonnelAccountService personnelAccountService;
    private User personnel4Test;
    private User student, teacher, borrower;
    private User personnel, admin, secretary, director;
    private PersonnelAccount personnelAccount;


    public PersonnelAccountServiceSecTest() {

        // init service
        personnelAccountService = PersonnelAccountService.getInstance();

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

            personnel4Test = userService.logUser("tftf", "titiopop", UserService.PERSONNEL_LOGIN_MODE);
            personnelAccount = ((Personnel) personnel.getRole()).getPersonnelAccount();

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

    }

    public void testIllegalScenarioDirector() {

        // call do illegal scenario with user with all contexts
        // doIllegalScenarioForAllContexts(director);
    }

    public void testIllegalScenarioSecretary() {

        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(secretary);

    }

    public void testIllegalScenarioPersonnel() {

        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(personnel);
    }

    public void testIllegalScenarioBorrower() {
        // call do illegal scenario with user with all contexts
        // doIllegalScenarioForAllContexts(borrower);

    }

    public void testIllegalScenarioStudent() {
        // call do illegal scenario with user with all contexts
        // doIllegalScenarioForAllContexts(student);

    }

    public void testIllegalScenarioTeacher() {
        // call do illegal scenario with user with all contexts
        doIllegalScenarioForAllContexts(teacher);

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
            personnelAccountService.updatePersonnelAccount(personnel4Test, personnelAccount, user);

            // if we go here then failure
            fail("should not update personnel accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            // ok test succeeded
        }

        try {

            // delete the account
            // set context to a context
            LibrarySecurityModel.DEFAULT_CONTEXT = context;
            personnelAccountService.deletePersonnelAccount(personnel4Test, personnelAccount, user);

            // if we go here then failure
            fail("should not delete personnel accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


        } catch (BSException e) {
            fail(e.getMessage());
        } catch (SecuritPolicyViolationException e) {
            // ok test succeeded
        }

        try {

            // create the account
            // set context to a context
            LibrarySecurityModel.DEFAULT_CONTEXT = context;
            personnelAccountService.createPersonnelAccount(personnel4Test, personnelAccount, user);

            // if we go here then failure
            fail("should not create personnel accounts " + user.getRole().getRoleName() + " during " + context.getContextName());


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

    

