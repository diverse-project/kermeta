package com.library.dao;

/**
 * User: Tej
 * Date: 21 f�vr. 2007
 * Time: 14:42:00
 */

import com.library.dao.dto.BookDTO;
import com.library.dao.dto.UserDTO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.spec.BookDAOInterface;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

/**
 * DB service is a singleton class
 * It provide access to the DataBase Library.
 * Many services are provided :
 * - login check
 * - book related services
 * etc ...
 */
public class BookDAO extends DAO implements BookDAOInterface {

    // Connection
    private static Connection connectionDB;

    private static BookDAO ourInstance = new BookDAO();

    public static BookDAO getInstance() {
        return ourInstance;
    }

    private BookDAO() {

        // initilizes the connection to Database
        if (connectionDB == null)
            connectionDB = getConnection();

    }


    public Collection<DTO> findBooksByState(String state) throws SQLException {

        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;

        try {

            // default value if false
            // prepares the query
            query = "SELECT * FROM books WHERE state = '" + state + "'";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            // check if we found one
            result = createsDTosFromResultSet(resultSet);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return result;
    }


    public Collection<DTO> seachBooksByKeyword(String keyword) throws SQLException {

        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;

        try {

            // default value if false
            // prepares the query
            query = "SELECT * FROM books WHERE title LIKE '%" + keyword + "%';";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it and get results
            statement = connectionDB.createStatement();
            resultSet = statement.executeQuery(query);

            // check if we found one
            result = createsDTosFromResultSet(resultSet);

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }

        return result;
    }

    public void update(DTO dto) throws SQLException {

        Statement statement;
        String query;
        BookDTO bookDTO;

        try {

            // default value if false
            // prepares the query
            bookDTO = (BookDTO) dto;
            query = "UPDATE books SET " +
                    "title = '" + bookDTO.getTitle() + "'," +
                    "author = '" + bookDTO.getAuthor() + "'," +
                    "pub_year = " + bookDTO.getPub_year() + "," +
                    "pages = " + bookDTO.getPages() + "," +
                    "state = '" + bookDTO.getState() + "', " +
                    "damaged = " + bookDTO.getDamaged() + " " +
                    "WHERE id_book = " + bookDTO.getId_book() + ";";

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

    public void insert(DTO dto) throws SQLException {

        Statement statement;
        String query;
        ResultSet resultSet;
        BookDTO bookDTO;


        try {

            // default value if false
            // prepares the query
            bookDTO = (BookDTO) dto;
            query = "INSERT INTO books (title, author, pub_year, pages, state) VALUES ('" +
                    bookDTO.getTitle() + "','" +
                    bookDTO.getAuthor() + "'," +
                    bookDTO.getPub_year() + "," +
                    bookDTO.getPages() + ",'" +
                    bookDTO.getState() + "');";

            // DEBUG
            // System.out.println("Query = " + query);

            // run it
            statement = connectionDB.createStatement();
            statement.execute(query);

            // get the last id
            query = "SELECT MAX(id_book) FROM books";
            resultSet = statement.executeQuery(query);

            //update book id
            if (resultSet.next())
                bookDTO.setId_book(Integer.parseInt(resultSet.getString(1)));

            // closing
            statement.close();

        } catch (SQLException e) {
            // if any problem, the exception is sent to the caller
            throw e;
        }


    }

    public Collection<DTO> loadUserReservedBooks(UserDTO userDTO) throws SQLException {
        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;

        try {

            // prepares the query
            query = "SELECT books.* FROM books,reservations WHERE books.id_book = reservations.id_book  AND "
                    + " reservations.id_user = " + userDTO.getId_user() + ";";

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

    public Collection<DTO> loadUserBorrowedBooks(UserDTO userDTO) throws SQLException {
        Statement statement;
        String query;
        ResultSet resultSet;
        Collection<DTO> result;

        try {

            // prepares the query
            query = "SELECT books.* FROM books,borrowed WHERE books.id_book = borrowed.id_book  AND "
                    + " borrowed.id_user = " + userDTO.getId_user() + ";";

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

    public void insertBorrow(UserDTO userDTO, BookDTO bookDTO) throws SQLException {

        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "INSERT INTO borrowed (id_user,id_book) VALUES (" + userDTO.getId_user()
                    + "," + bookDTO.getId_book() + ");";

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

    public void insertReservation(UserDTO userDTO, BookDTO bookDTO) throws SQLException {
        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "INSERT INTO reservations (id_book,id_user) VALUES (" + bookDTO.getId_book() +
                    "," + userDTO.getId_user() + ");";

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

    public void deleteBorrow(UserDTO userDTO, BookDTO bookDTO) throws SQLException {
        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "DELETE FROM borrowed WHERE id_book = " + bookDTO.getId_book() + " AND id_user = " +
                    userDTO.getId_user() + ";";

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

    public void deleteAllBorrow(BookDTO bookDTO) throws SQLException {
        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "DELETE FROM borrowed WHERE id_book = " + bookDTO.getId_book() + ";";

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

    public void deletetReservation(UserDTO userDTO, BookDTO bookDTO) throws SQLException {
        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "DELETE FROM reservations WHERE id_book = " + bookDTO.getId_book() + " AND id_user = " +
                    userDTO.getId_user() + ";";

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

    public void deletetAllReservations(BookDTO bookDTO) throws SQLException {

        Statement statement;
        String query;


        try {

            // default value if false
            // prepares the query
            query = "DELETE FROM reservations WHERE id_book = " + bookDTO.getId_book() + ";";

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
        BookDTO dto = new BookDTO();

        dto.setId_book(Integer.parseInt(rs.getString("id_book")));
        dto.setTitle(rs.getString("title"));
        dto.setAuthor(rs.getString("author"));
        dto.setPub_year(Integer.parseInt(rs.getString("pub_year")));
        dto.setPages(Integer.parseInt(rs.getString("pages")));
        dto.setState(rs.getString("state"));
        dto.setDamaged(Integer.parseInt(rs.getString("damaged")));

        return dto;
    }


    public static void main(String[] args) throws SQLException {
        BookDAO bookDAO = getInstance();

        Collection<DTO> result = bookDAO.findBooksByState(BookDTO.AVAILABLE_STATE);
        System.out.println(result.toString());

        BookDTO bookDTO = (BookDTO) result.iterator().next();

        bookDTO.setPages(350);
        bookDAO.update(bookDTO);

        result = bookDAO.findBooksByState(BookDTO.AVAILABLE_STATE);
        System.out.println(result.toString());

        BookDTO newBook = new BookDTO();
        newBook.setTitle("How to shutdown DNS servers");
        newBook.setAuthor("Neo");
        newBook.setPages(149);
        newBook.setPub_year(2006);
        newBook.setState(BookDTO.ORDERED_STATE);

        // bookDAO.insert(newBook);

        result = bookDAO.findBooksByState(BookDTO.ORDERED_STATE);
        System.out.println(result.toString());


    }


}
