package com.library.dao;

import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.spec.PersonnelAccountDAOInterface;

import java.sql.*;
import java.util.Collection;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 17:05:40
 */
public class PersonnelAccountDAO extends DAO implements PersonnelAccountDAOInterface {

      // Connection
    private static Connection connectionDB;

    private static PersonnelAccountDAO ourInstance = new PersonnelAccountDAO();

    public static PersonnelAccountDAO getInstance() {
        return ourInstance;
    }

    private PersonnelAccountDAO() {

        // initilizes the connection to Database
        if (connectionDB == null)
            connectionDB = getConnection();

    }

    
     public PersonnelAccountDTO loadUserPersonnelAccount(UserDTO userDTO) throws SQLException, DAOException {
        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;
        PersonnelAccountDTO dto;

        try {

            // default value if false
            // prepares the query
            query = "SELECT * from personnel_account where id_user = " +  userDTO.getId_user() + ";";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            // get the DTOs
            result = createsDTosFromResultSet(resultSet);

            // if the size is not equal to 1 rize an exception
            if(result.size() != 1)
            throw new DAOException("Personnel account collection size not correct! equals to " + result.size() + " must be 1.");


            dto = (PersonnelAccountDTO) result.iterator().next();

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return dto;
    }


     public PersonnelAccountDTO insert(UserDTO userDTO, PersonnelAccountDTO personnelAccountDTO) throws SQLException {
        Statement statement;
         String query;
         ResultSet resultSet;


         try {

             // default value if false
             // prepares the query
             query = "INSERT INTO personnel_account (creation_date, active, can_consult, id_user) VALUES ('" +
                     new Date(personnelAccountDTO.getCreation_date().getTime()) + "'," +
                     personnelAccountDTO.getActive() + "," +
                     personnelAccountDTO.getCan_consult() + "," +
                     userDTO.getId_user() + ");";

             // DEBUG
             // System.out.println("Query = " + query);

             // run it
             statement = connectionDB.createStatement();
             statement.execute(query);

             // get the last id
             query = "SELECT MAX(id_personnel_account) FROM personnel_account";
             resultSet = statement.executeQuery(query);

             //update book id
             if (resultSet.next())
                 personnelAccountDTO.setId_personnel_account(Integer.parseInt(resultSet.getString(1)));

             // closing
             statement.close();

         } catch (SQLException e) {
             // if any problem, the exception is sent to the caller
             throw e;
         }

         return personnelAccountDTO;
    }

    public void update(PersonnelAccountDTO personnelAccountDTO) throws SQLException {
        Statement statement;
                String query;

                try {

                    // default value if false
                    // prepares the query
                    query = "UPDATE personnel_account SET " +
                            "active = " + personnelAccountDTO.getActive() + "," +
                            "can_consult = " + personnelAccountDTO.getCan_consult() + "," +
                            "creation_date = '" + new Date(personnelAccountDTO.getCreation_date().getTime()) + "'," +
                            "id_user = " + personnelAccountDTO.getId_user() + " " +
                            "WHERE id_personnel_account = " + personnelAccountDTO.getId_personnel_account() + ";";

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

    public void delete(UserDTO userDTO, PersonnelAccountDTO personnelAccountDTO) throws SQLException {
          Statement statement;
         String query;

         try {

             // default value if false
             // prepares the query
             query = "DELETE FROM personnel_account " +
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

        PersonnelAccountDTO dto = new PersonnelAccountDTO();

        dto.setId_personnel_account(Integer.parseInt(rs.getString("id_personnel_account")));
        dto.setActive(Integer.parseInt(rs.getString("active")));
        dto.setCan_consult(Integer.parseInt(rs.getString("can_consult")));
        dto.setId_user(Integer.parseInt(rs.getString("id_user")));
        dto.setCreation_date(rs.getDate("creation_date"));


        return dto;
    }



}
