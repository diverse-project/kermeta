package com.library.dao;

import com.library.dao.dto.BookDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.spec.UserDAOInterface;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 13:55:28
 */
public class UserDAO extends DAO implements UserDAOInterface {

    // Connection
    private static Connection connectionDB;

    // role modes
    public static final String PERSONNEL_LOGIN_MODE = "PERSONNEL", BORROWER_LOGIN_MODE = "BORROWER";

    private static UserDAO ourInstance = new UserDAO();

    public static UserDAO getInstance() {
        return ourInstance;
    }

    private UserDAO() {

        // initilizes the connection to Database
        if (connectionDB == null)
            connectionDB = getConnection();

    }


    public UserDTO insertUser(UserDTO userDTO) throws SQLException {
        Statement statement;
        String query;
        ResultSet resultSet;


        try {

            // default value if false
            // prepares the query
            query = "INSERT INTO users (login,password,name,mail,phone) VALUES ('" +
                    userDTO.getLogin() + "','" +
                    userDTO.getPassword() + "','" +
                    userDTO.getName() + "','" +
                    userDTO.getMail() + "','" +
                    userDTO.getPhone() +
                    "');";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            statement = connectionDB.createStatement();
            statement.execute(query);

            // get the last id
            query = "SELECT MAX(id_user) FROM users";
            resultSet = statement.executeQuery(query);

            //update book id
            if (resultSet.next())
                userDTO.setId_user(Integer.parseInt(resultSet.getString(1)));

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return userDTO;
    }

    public void updateUser(UserDTO userDTO) throws SQLException {

        Statement statement;
        String query;

        try {

            // default value if false
            // prepares the query
            query = "UPDATE users SET " +
                    "login = '" + userDTO.getLogin() + "'," +
                    "password = '" + userDTO.getPassword() + "'," +
                    "name = '" + userDTO.getName() + "','" +
                    "mail = '" + userDTO.getMail() + "','" +
                    "phone = '" + userDTO.getPhone() + "' " +
                    "WHERE id_user = " + userDTO.getId_user() + ";";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            statement = connectionDB.createStatement();
            statement.execute(query);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

    }

    public void deleteUser(UserDTO userDTO) throws SQLException {

        Statement statement;
        String query;

        try {

            // default value if false
            // prepares the query
            query = "DELETE FROM users " +
                    "WHERE id_user = " + userDTO.getId_user() + ";";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            statement = connectionDB.createStatement();
            statement.execute(query);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

    }

    public void insertUserRole(UserDTO userDTO, String role) throws SQLException {

        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "INSERT INTO roles (id_user,role) VALUES (" +
                    userDTO.getId_user() + ",'" +
                    role + "');";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            statement = connectionDB.createStatement();
            statement.execute(query);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }


    }

    public void deleteUserRole(UserDTO userDTO, String role) throws SQLException {

        Statement statement;
        String query;

        try {

            // default value if false
            // prepares the query
            query = "DELETE FROM roles " +
                    "WHERE id_user = " + userDTO.getId_user() + " AND " +
                    "role = '" + role + "';";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            statement = connectionDB.createStatement();
            statement.execute(query);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

    }

    public boolean checkLoginAndPassword(UserDTO userDTO) throws SQLException {

        Statement statement;
        String query;
        ResultSet resultSet;
        boolean testResult;

        try {

            // default value if false
            // prepares the query
            query = "SELECT * FROM users WHERE login ='" + userDTO.getLogin() + "' AND " + "password = '" +
                    userDTO.getPassword() + "';";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            // check if we found one
            testResult = resultSet.next();

            // DEBUG
            // System.out.println("Login succeded? " + testResult);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return testResult;

    }

    public UserDTO loadUserFromLoginAndPassword(UserDTO userDTO) throws SQLException, DAOException {
        Statement statement;
        String query;
        ResultSet resultSet;
        UserDTO userDTOResult;

        try {

            // default value if false
            // prepares the query
            query = "SELECT * FROM users WHERE login ='" + userDTO.getLogin() + "' AND " + "password = '" +
                    userDTO.getPassword() + "';";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            // check if we found one
            Collection<DTO> dtos = createsDTosFromResultSet(resultSet);

            // many users found there is a problem
            if (dtos.size() != 1)
                throw new DAOException("List of users size not correct! equals to " + dtos.size() + " must be 1.");

            userDTOResult = (UserDTO) dtos.iterator().next();

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return userDTOResult;

    }

    public Collection<DTO> loadUserReservingBook(BookDTO bookDTO) throws SQLException {
        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;

        try {

            // prepares the query
            query = "SELECT users.* FROM users,reservations WHERE users.id_user = reservations.id_user  AND "
                    + " reservations.id_book = " + bookDTO.getId_book() + ";";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            result = createsDTosFromResultSet(resultSet);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return result;
    }

    public DTO loadUserBorrowingBook(BookDTO bookDTO) throws SQLException, DAOException {
        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;
        UserDTO userDTO;

        try {

            // prepares the query
            query = "SELECT users.* FROM users,borrowed WHERE users.id_user = borrowed.id_user  AND "
                    + " borrowed.id_book = " + bookDTO.getId_book() + ";";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            result = createsDTosFromResultSet(resultSet);

            // if the size is not equal to 1 rize an exception
            if (result.size() != 1)
                throw new DAOException("Borrow size not correct! equals to " + result.size() + " must be 1.");

            userDTO = (UserDTO) result.iterator().next();

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return userDTO;
    }

    public String checkUserRoleMatche(UserDTO userDTO, String roleMode) throws SQLException, DAOException {
        Statement statement;
        String query, wherePart;
        ResultSet resultSet;
        String role;

        try {

            // built the query
            wherePart = "";
            if (roleMode.equals(PERSONNEL_LOGIN_MODE))
                wherePart = " (role = 'PERSONNEL' OR role='ADMIN' OR role='SECRETARY' OR role='DIRECTOR')";
            else if (roleMode.equals(BORROWER_LOGIN_MODE))
                wherePart = " (role = 'BORROWER' OR role='STUDENT' OR role='TEACHER')";

            // prepares the query
            query = "SELECT role FROM roles WHERE roles.id_user = " + userDTO.getId_user() + " AND " +
                    wherePart;

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            if (resultSet.next())
                role = resultSet.getString(1);
            else
                role = null;


        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }
        return role;
    }


    protected DTO createDTOAtomic(ResultSet rs) throws SQLException {

        UserDTO userDTO;
        userDTO = new UserDTO();
        userDTO.setLogin(rs.getString("login"));
        userDTO.setPassword(rs.getString("password"));
        userDTO.setName(rs.getString("name"));
        userDTO.setPhone(rs.getString("mail"));
        userDTO.setId_user(Integer.parseInt(rs.getString("id_user")));

        return userDTO;
    }
}
