package com.library.security.impl;

import com.library.bo.book.Book;
import com.library.bo.user.*;
import com.library.security.impl.context.ContextManager;
import com.library.security.model.SecurityModel;
import com.library.security.model.context.Context;
import com.library.security.service.SecurityPolicyService;
import com.library.service.BookService;
import com.library.service.BorrowerAccountService;
import com.library.service.PersonnelAccountService;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 13:03:33
 */
public class LibrarySecurityModel extends SecurityModel {

    //Constants

    //Roles
    public static final String BORROWER = "BORROWER",
            STUDENT = "STUDENT",
            TEACHER = "TEACHER",
            PERSONNEL = "PERSONNEL",
            SECRETARY = "SECRETARY",
            DIRECTOR = "DIRECTOR",
            ADMINISTRATOR = "ADMINISTRATOR";


    //Activities
    public static final String BORROWERACTIVITY = "BORROWERACTIVITY",
            BORROWBOOK = "BORROWBOOK",
            RESERVEBOOK = "RESERVEBOOK",
            GIVEBACKBOOK = "GIVEBACKBOOK",
            ADMINACTIVITY = "ADMINACTIVITY",
            MANAGEACCESS = "MANAGEACCESS",
            CREATEACCOUNT = "CREATEACCOUNT",
            MODIFYACCOUNT = "MODIFYACCOUNT",
            PERSONNELACTIVITY = "PERSONNELACTIVITY",
            DELIVERBOOK = "DELIVERBOOK",
            FIXBOOK = "FIXBOOK",
            CONSULTBORROWERACCOUNT = "CONSULTBORROWERACCOUNT";


    //Views
    public static final String BOOK = "BOOK",
            ACCOUNT = "ACCOUNT",
            BORROWERACCOUNT = "BORROWERACCOUNT",
            PERSONNELACCOUNT = "PERSONNELACCOUNT";


    // Contexts
    public static final String DEFAULT = "DEFAULT",
            HOLIDAYS = "HOLIDAYS",
            WORKINGDAYS = "WORKINGDAYS",
            MAINTENANCEDAY = "MAINTENANCEDAY";

    // application objects roles,activities,contexts and views
    public static Class
            BORROWER_CLASS,
            STUDENT_CLASS,
            TEACHER_CLASS,
            PERSONNEL_CLASS,
            SECRETARY_CLASS,
            DIRECTOR_CLASS,
            ADMINISTRATOR_CLASS;

    //activities
    public static Method[] BORROWERACTIVITY_METHOD,
            BORROWBOOK_METHOD,
            RESERVEBOOK_METHOD,
            GIVEBACKBOOK_METHOD,
            ADMINACTIVITY_METHOD,
            MANAGEACCESS_METHOD,
            CREATEACCOUNT_METHOD,
            MODIFYACCOUNT_METHOD,
            PERSONNELACTIVITY_METHOD,
            DELIVERBOOK_METHOD,
            FIXBOOK_METHOD,
            CONSULTBORROWERACCOUNT_METHOD;
    //views
    public static Class
            BOOK_VIEW,
            ACCOUNT_VIEW,
            BORROWERACCOUNT_VIEW,
            PERSONNELACCOUNT_VIEW;

    // contexts
    public static Context DEFAULT_CONTEXT,
            HOLIDAYS_CONTEXT,
            WORKINGDAYS_CONTEXT,
            MAINTENANCEDAY_CONTEXT;


    public LibrarySecurityModel() {
        this(DEFAULT_SECURITY_POLICY_ID);

    }

    /**
     *
     * @param xacmlConfFile XACML conf File
     */
    public LibrarySecurityModel(String xacmlConfFile, String xacmlPolicyFile) {
        super(xacmlConfFile,xacmlPolicyFile);
        
        // init and make mapping
        initMapping();
        defineSecurityModelMapping();

       
    }


    public LibrarySecurityModel(int secId) {
        super(secId);

        // init and make mapping
        initMapping();
        defineSecurityModelMapping();

    }

    public void defineSecurityModelMapping() {
        //roles
        roles = new HashMap<Class, String>();

        roles.put(BORROWER_CLASS, BORROWER);
        roles.put(STUDENT_CLASS, STUDENT);
        roles.put(TEACHER_CLASS, TEACHER);

        roles.put(PERSONNEL_CLASS, PERSONNEL);
        roles.put(SECRETARY_CLASS, SECRETARY);
        roles.put(ADMINISTRATOR_CLASS, ADMINISTRATOR);
        roles.put(DIRECTOR_CLASS, DIRECTOR);

        // activities
        activities = new HashMap<Method[], String>();

        activities.put(BORROWERACTIVITY_METHOD, BORROWERACTIVITY);
        activities.put(BORROWBOOK_METHOD, BORROWBOOK);
        activities.put(RESERVEBOOK_METHOD, RESERVEBOOK);
        activities.put(GIVEBACKBOOK_METHOD, GIVEBACKBOOK);
        activities.put(FIXBOOK_METHOD, FIXBOOK);
        activities.put(DELIVERBOOK_METHOD, DELIVERBOOK);

        // modifyAccess activity
        activities.put(MANAGEACCESS_METHOD, MANAGEACCESS);
        activities.put(CONSULTBORROWERACCOUNT_METHOD, CONSULTBORROWERACCOUNT);
        activities.put(CREATEACCOUNT_METHOD, CREATEACCOUNT);
        activities.put(MODIFYACCOUNT_METHOD, MODIFYACCOUNT);

        // views
        views = new HashMap<Class, String>();

        views.put(BOOK_VIEW, BOOK);
        views.put(BORROWERACCOUNT_VIEW, BORROWERACCOUNT);
        views.put(PERSONNELACCOUNT_VIEW, PERSONNELACCOUNT);

        // contexts
        contexts = new HashMap<Context, String>();

        contexts.put(DEFAULT_CONTEXT, DEFAULT);
        contexts.put(HOLIDAYS_CONTEXT, HOLIDAYS);
        contexts.put(WORKINGDAYS_CONTEXT, WORKINGDAYS);
        contexts.put(MAINTENANCEDAY_CONTEXT, MAINTENANCEDAY);


    }

    public void initMapping() {
        //roles
        BORROWER_CLASS = Borrower.class;
        STUDENT_CLASS = Student.class;
        TEACHER_CLASS = Teacher.class;

        PERSONNEL_CLASS = Personnel.class;
        SECRETARY_CLASS = Secretary.class;
        DIRECTOR_CLASS = Director.class;
        ADMINISTRATOR_CLASS = Admin.class;

        // activities

        // activities services
        Class bookService, personnelAccountService, borrowerAccountService;

        bookService = BookService.class;
        personnelAccountService = PersonnelAccountService.class;
        borrowerAccountService = BorrowerAccountService.class;

        try {

            // borrower activities
            RESERVEBOOK_METHOD = new Method[]{bookService.getMethod("reserveBook", User.class, Book.class)};
            GIVEBACKBOOK_METHOD = new Method[]{bookService.getMethod("giveBackBook", User.class, Book.class)};
            BORROWBOOK_METHOD = new Method[]{bookService.getMethod("borrowBook", User.class, Book.class)};
            DELIVERBOOK_METHOD = new Method[]{bookService.getMethod("deliverBook", User.class, Book.class)};
            FIXBOOK_METHOD = new Method[]{bookService.getMethod("fixBook", User.class, Book.class)};

            BORROWERACTIVITY_METHOD = new Method[]{bookService.getMethod("reserveBook", User.class, Book.class),
                    bookService.getMethod("giveBackBook", User.class, Book.class),
                    bookService.getMethod("borrowBook", User.class, Book.class)
            };

            // Access activity
            MANAGEACCESS_METHOD = new Method[]{personnelAccountService.getMethod
                    ("createPersonnelAccount", User.class, PersonnelAccount.class, User.class),
                    personnelAccountService.getMethod
                            ("updatePersonnelAccount", User.class, PersonnelAccount.class, User.class),
                    personnelAccountService.getMethod
                            ("deletePersonnelAccount", User.class, PersonnelAccount.class, User.class)};

            MODIFYACCOUNT_METHOD = new Method[]{borrowerAccountService.getMethod
                    ("createBorrowerAccount", User.class, BorrowerAccount.class, User.class),
                    borrowerAccountService.getMethod
                            ("updateBorrowerAccount", User.class, BorrowerAccount.class, User.class),
                    borrowerAccountService.getMethod
                            ("deleteBorrowerAccount", User.class, BorrowerAccount.class, User.class)};

            CREATEACCOUNT_METHOD = new Method[]{borrowerAccountService.getMethod
                    ("createBorrowerAccount", User.class, BorrowerAccount.class, User.class)};

            // consult
            CONSULTBORROWERACCOUNT_METHOD = new Method[]{borrowerAccountService.getMethod
                    ("consultBorrowerAccount", User.class, User.class)};

            ADMINACTIVITY_METHOD = new Method[]{borrowerAccountService.getMethod
                    ("createBorrowerAccount", User.class, BorrowerAccount.class, User.class),
                    borrowerAccountService.getMethod
                            ("updateBorrowerAccount", User.class, BorrowerAccount.class, User.class),
                    borrowerAccountService.getMethod
                            ("deleteBorrowerAccount", User.class, BorrowerAccount.class, User.class),
                    borrowerAccountService.getMethod
                            ("createBorrowerAccount", User.class, BorrowerAccount.class, User.class),
                    borrowerAccountService.getMethod
                            ("consultBorrowerAccount", User.class, User.class)
            };


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //views
        BOOK_VIEW = Book.class;
        ACCOUNT_VIEW = Account.class;
        BORROWERACCOUNT_VIEW = BorrowerAccount.class;
        PERSONNELACCOUNT_VIEW = PersonnelAccount.class;

        // contexts
        DEFAULT_CONTEXT = new Context("DEFAULT");
        WORKINGDAYS_CONTEXT = ContextManager.workingday;
        MAINTENANCEDAY_CONTEXT = ContextManager.maintenanceDay;
        HOLIDAYS_CONTEXT = ContextManager.holidays;

        // map the activities to the services that handle them

        activitiesServices = new HashMap<Method[], Class>();

        activitiesServices.put(RESERVEBOOK_METHOD, BookService.class);
        activitiesServices.put(GIVEBACKBOOK_METHOD, BookService.class);
        activitiesServices.put(BORROWBOOK_METHOD, BookService.class);
        activitiesServices.put(FIXBOOK_METHOD, BookService.class);
        activitiesServices.put(DELIVERBOOK_METHOD, BookService.class);
        activitiesServices.put(BORROWERACTIVITY_METHOD, BookService.class);

        activitiesServices.put(MANAGEACCESS_METHOD, PersonnelAccountService.class);

        activitiesServices.put(MODIFYACCOUNT_METHOD, BorrowerAccountService.class);
        activitiesServices.put(CREATEACCOUNT_METHOD, BorrowerAccountService.class);
        activitiesServices.put(CONSULTBORROWERACCOUNT_METHOD, BorrowerAccountService.class);
        activitiesServices.put(ADMINACTIVITY_METHOD, PersonnelAccountService.class);

    }
    
    
  

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
    	


    	/*
        SecurityModel model = new LibrarySecurityModel();

        model.initMapping();
        model.defineSecurityModelMapping();

        System.out.println("mmm = " + model.activities.get(BORROWBOOK_METHOD));


        SecurityPolicyService securityPolicyService = new SecurityPolicyService(model);



        String result = securityPolicyService.checkSecurityPolicy(STUDENT_CLASS, BORROWBOOK_METHOD, BOOK_VIEW, HOLIDAYS_CONTEXT);

        System.out.println("Result With DB = " + result);

        LibrarySecurityModel modelXACML = new LibrarySecurityModel("xacml_configuration.xml");

        model.initMapping();
        model.defineSecurityModelMapping();

        String resultXACML = modelXACML.evaluateQueryAndGetResult(STUDENT,BORROWBOOK,BOOK,WORKINGDAYS);

        System.out.println("Result With DB = " + resultXACML);

    	 */





    }
}
