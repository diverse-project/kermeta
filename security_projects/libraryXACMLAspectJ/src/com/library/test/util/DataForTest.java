package com.library.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * User: tej
 * Date: 20 mars 2007
 * Time: 13:56:35
 */
public class DataForTest {



    // constants
    public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    public static final String MYSQL_CON_STRING = "jdbc:mysql://localhost:3306/library";


    /**
     * Init test data in the data base
     * deletes all data and put clean data that will
     * be used for tests int the data base
     *
     *
     */
    public static void initTestData() {


         Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "CALL init_data();";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            Connection connectionDB;
            connectionDB = getConnection();
            statement = connectionDB.createStatement();
            statement.execute(query);

            // closing
            statement.close();

            System.out.println("OK");

        } catch (SQLException e) {
           e.printStackTrace();

        }
        


    }




    /**
     * Init the connection
     *
     * @return the connection
     */
    private static Connection getConnection() {

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


    public static void main(String[] args) {

        initTestData();
        



    }


}
