package com.library.service;

import com.library.bo.user.*;
import com.library.bo.book.Book;
import com.library.dao.*;
import com.library.dao.dto.BorrowerAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.spec.DTO;
import com.library.service.exception.BSException;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.service.spec.UserServiceInterface;
import com.library.security.impl.LibrarySecurityModel;

import java.sql.SQLException;
import java.util.Collection;

/**
 * User: Tej
 * Date: 6 mars 2007
 * Time: 10:47:20
 */
public class UserService extends ServiceBO  implements UserServiceInterface {

    private static UserService ourInstance = new UserService();

    // personnel
    public static String PERSONNEL_LOGIN_MODE = "PERSONNEL",BORROWER_LOGIN_MODE = "BORROWER";

    private UserDAO userDAO;
    private BorrowerAccountDAO borrowerAccountDAO;
    private PersonnelAccountDAO personnelAccountDAO;
    private BookDAO bookDAO;




    public static UserService getInstance() {
        return ourInstance;
    }

    private UserService() {


        super();
        
        // initilizes DAOs
        if (userDAO == null)
            userDAO = UserDAO.getInstance();

        if (borrowerAccountDAO == null)
            borrowerAccountDAO = BorrowerAccountDAO.getInstance();

        if (personnelAccountDAO == null)
            personnelAccountDAO = PersonnelAccountDAO.getInstance();

          if (bookDAO == null)
            bookDAO = BookDAO.getInstance();

    }
    
    public User createUser(User user, User connectedUser) throws BSException, SecuritPolicyViolationException {
        // check security policy
        ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
                LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        
        UserDTO userDTO;


        try {

            // create DTOs
            userDTO = (UserDTO) user.getDTO();

            userDAO.insertUser(userDTO);

            // set the new created id
            user.setUserId(userDTO.getId_user());
        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }
        
        return user;
    }

    public void createUserRole(User user, Role role, User connectedUser) throws BSException, SecuritPolicyViolationException {
        // check security policy
        ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
                LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

        UserDTO userDTO;


        try {

            // create DTOs
            userDTO = (UserDTO) user.getDTO();

            userDAO.insertUserRole(userDTO,role.getRoleName());


            // set the new created id
            user.setRole(role);

        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }

    }

    public void deleteUser(User user, User connectedUser) throws BSException, SecuritPolicyViolationException {
        // check security policy
        ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
                LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);
        
         UserDTO userDTO;

        try {

            // create DTOs
            userDTO = (UserDTO) user.getDTO();

            userDAO.deleteUser(userDTO);

        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }


    }

    public void deleteUserRole(User user, Role role, User connectedUser) throws BSException, SecuritPolicyViolationException {
      // check security policy
        ServiceUtils.checkSecurity(connectedUser, LibrarySecurityModel.MANAGEACCESS_METHOD,
                LibrarySecurityModel.PERSONNELACCOUNT_VIEW, LibrarySecurityModel.DEFAULT_CONTEXT);

         UserDTO userDTO;

        try {

            // create DTOs
            userDTO = (UserDTO) user.getDTO();

            userDAO.deleteUserRole(userDTO,role.getRoleName());

        } catch (SQLException e) {
            throw new BSException(e.getMessage());

        }
        


    }

    public User logUser(String login, String password, String loginMode) throws BSException {


        UserDTO userDTO;
        User user;

       try {

           // create DTOs
           userDTO = new UserDTO();
           userDTO.setLogin(login);
           userDTO.setPassword(password);

           boolean result = userDAO.checkLoginAndPassword(userDTO);

           if(!result) // wrong pass ans login
           return null;

           // retrieve the user infos
          userDTO = userDAO.loadUserFromLoginAndPassword(userDTO);

          user = new User(userDTO);

          // now load the role
          String userRole = userDAO.checkUserRoleMatche(userDTO,loginMode);

           if(userRole != null) {
           // load the account

            // load borrower infos
            if(loginMode.equals(BORROWER_LOGIN_MODE)) {

                BorrowerAccountDTO borrowerAccount = borrowerAccountDAO.loadUserBorrowerAccount(userDTO);

                BorrowerAccount ba = new BorrowerAccount();
                ba.setFromDTO(borrowerAccount);
                user.defineRole(userRole);
                ((Borrower) user.getRole()).setBorrowerAccount(ba);

                // load borrowed and reserved books
                Collection<DTO> bors = bookDAO.loadUserBorrowedBooks(userDTO);
                user.setBorrowedFromDTOs(bors);
                Collection<DTO> res = bookDAO.loadUserReservedBooks(userDTO);
                user.setReservationsFromDTOs(res);
            }

            else if(loginMode.equals(PERSONNEL_LOGIN_MODE)) {

                // load the account
                PersonnelAccountDTO personnelAccountDTO = personnelAccountDAO.loadUserPersonnelAccount(userDTO);

                PersonnelAccount pa = new PersonnelAccount();
                pa.setFromDTO(personnelAccountDTO);

                //set the role
                user.defineRole(userRole);


                ((Personnel) user.getRole()).setPersonnelAccount(pa);

            }

           }

           else {

                throw new BSException("The user '" + login + "' cannot connect with mode '" + loginMode + "'");

           }

       } catch (SQLException e) {
           throw new BSException(e.getMessage());

       } catch (DAOException e) {
           throw new BSException(e.getMessage());
       
       }
        
      return user;
    }

    public static void main(String[] args) throws BSException, SecuritPolicyViolationException {

        UserService service = getInstance();


        User user = service.logUser("tutu","Not2Hard",UserService.BORROWER_LOGIN_MODE);


        /*
        PersonnelAccountService perService = PersonnelAccountService.getInstance();
        User userToCreate = new User("momo","TopCykrett","Max","max@max.net", "0204056878",null);
        service.createUser(userToCreate,user);
        Director director = new Director();
        service.createUserRole(userToCreate,director,user);
        PersonnelAccount perAcc = new PersonnelAccount();
        perService.createPersonnelAccount(userToCreate,perAcc,user);
        perAcc.setCanConsultBorrowerAccount(false);
        perService.updatePersonnelAccount(userToCreate,perAcc,user);
        perService.deletePersonnelAccount(userToCreate,perAcc,user);
        service.deleteUserRole(userToCreate,director,user);
        service.deleteUser(userToCreate,user);
        */

        BookService bookService = BookService.getInstance();
        Collection<Book> books =  bookService.findBookByState(Book.BORROWED);
        Book book = books.iterator().next();

        bookService.borrowBook(user,book);



        System.out.println("Done");

        // borrow a book
        

    }
}
