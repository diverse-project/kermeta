package com.library.dao;

import com.library.dao.dto.spec.DTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 13:53:57
 */
public abstract class DAO {

    // constants
    public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    public static final String MYSQL_CON_STRING = "jdbc:mysql://localhost:3306/library";


    /**
     * Init the connection
     *
     * @return the connection
     */
    protected synchronized Connection getConnection() {

        Connection connection;

        // init
        connection = null;

        try {

            String password;
            // read from pass file
            BufferedReader br = new BufferedReader(new FileReader("pass"));
            password = br.readLine();
            br.close();

            //Register the JDBC driver for Database.
            Class.forName(MYSQL_DRIVER);

            // init conncetion
            connection = DriverManager.getConnection(MYSQL_CON_STRING, "root", password);

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
    

    protected Collection<DTO> createsDTosFromResultSet(ResultSet rs) throws SQLException {

        Collection<DTO> dtos = new ArrayList<DTO>();
        DTO dto;

        try {
            while (rs.next()) {

                dto = createDTOAtomic(rs);
                dtos.add(dto);

            }
        } catch (SQLException e) {
            throw e;
        }


        return dtos;
    }


    protected abstract DTO createDTOAtomic(ResultSet rs) throws SQLException;


}
