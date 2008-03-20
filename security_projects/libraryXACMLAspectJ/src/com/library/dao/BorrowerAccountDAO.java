package com.library.dao;

import com.library.dao.dto.BorrowerAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.spec.BorrowerAccountDAOInterface;

import java.sql.*;
import java.util.Collection;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 17:04:16
 */
public class BorrowerAccountDAO extends DAO implements BorrowerAccountDAOInterface {

    // Connection
    private static Connection connectionDB;

    private static BorrowerAccountDAO ourInstance = new BorrowerAccountDAO();

    public static BorrowerAccountDAO getInstance() {
        return ourInstance;
    }

    private BorrowerAccountDAO() {

        // initilizes the connection to Database
        if (connectionDB == null)
            connectionDB = getConnection();

    }


    public BorrowerAccountDTO loadUserBorrowerAccount(UserDTO userDTO) throws DAOException, SQLException {
        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;
        BorrowerAccountDTO dto;

        try {

            // default value if false
            // prepares the query
            query = "SELECT * from borrower_account where id_user = " + userDTO.getId_user() + ";";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            // get the DTOs
            result = createsDTosFromResultSet(resultSet);

            // if the size is not equal to 1 rize an exception
            if (result.size() != 1)
                throw new DAOException("Borrow size not correct! equals to " + result.size() + " must be 1.");

            dto = (BorrowerAccountDTO) result.iterator().next();

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return dto;
    }
    
    public BorrowerAccountDTO insert(UserDTO userDTO, BorrowerAccountDTO borrowerAccountDTO) throws SQLException {
         Statement statement;
         String query;
         ResultSet resultSet;
         Date dateCreation;


         try {
             dateCreation = null;
             if(borrowerAccountDTO.getCreation_date() != null)
             dateCreation =  new Date(borrowerAccountDTO.getCreation_date().getTime());
             // default value if false
             // prepares the query
             query = "INSERT INTO borrower_account (creation_date, active, can_borrow, id_user) VALUES ('" +
                     dateCreation + "'," +
                     borrowerAccountDTO.getActive() + "," +
                     borrowerAccountDTO.getCan_borrow() + "," +
                     userDTO.getId_user() + ");";

             // DEBUG
             // System.out.println("Query = " + query);

             // run it
             statement = connectionDB.createStatement();
             statement.execute(query);

             // get the last id
             query = "SELECT MAX(id_borrower_account) FROM borrower_account";
             resultSet = statement.executeQuery(query);

             //update book id
             if (resultSet.next())
                 borrowerAccountDTO.setId_borrower_account(Integer.parseInt(resultSet.getString(1)));

             // closing
             statement.close();

         } catch (SQLException e) {
             // if any problem, the exception is sent to the caller
             throw e;
         }

         return borrowerAccountDTO;
     }

     public void update(BorrowerAccountDTO borrowerAccountDTO) throws SQLException {

         Statement statement;
         String query;

         try {

             // default value if false
             // prepares the query
             query = "UPDATE borrower_account SET " +
                     "active = " + borrowerAccountDTO.getActive() + "," +
                     "can_borrow = " + borrowerAccountDTO.getCan_borrow() + "," +
                     "creation_date = '" + new Date(borrowerAccountDTO.getCreation_date().getTime()) + "' " +
                     " where id_user = " + borrowerAccountDTO.getId_user();


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

     public void delete(UserDTO userDTO, BorrowerAccountDTO borrowerAccountDTO) throws SQLException {

         Statement statement;
         String query;

         try {

             // default value if false
             // prepares the query
             query = "DELETE FROM borrower_account " +
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
    


    protected DTO createDTOAtomic(ResultSet rs) throws SQLException {

        BorrowerAccountDTO dto = new BorrowerAccountDTO();
        dto.setId_borrower_account(Integer.parseInt(rs.getString("id_borrower_account")));
        dto.setActive(Integer.parseInt(rs.getString("active")));
        dto.setCan_borrow(Integer.parseInt(rs.getString("can_borrow")));
        dto.setId_user(Integer.parseInt(rs.getString("id_user")));
        dto.setCreation_date(rs.getDate("creation_date"));

        return dto;
    }


 

    // DEBUG  
    public static void main(String[] args) throws SQLException, DAOException {

        UserDAO userDAO = UserDAO.getInstance();
        BorrowerAccountDAO borrowerAccountDAO = getInstance();

        UserDTO userDTO = new UserDTO();
        userDTO.setLogin("tutu");
        userDTO.setPassword("Not2Hard");

        Boolean response = userDAO.checkLoginAndPassword(userDTO);

        System.out.println("response = " + response);

        userDAO.loadUserFromLoginAndPassword(userDTO);

        System.out.println("userDTO = " + userDTO);

        BorrowerAccountDTO borrowerAccountDTO = borrowerAccountDAO.loadUserBorrowerAccount(userDTO);

        System.out.println("borrowerAccountDTO = " + borrowerAccountDTO);

    }
}
