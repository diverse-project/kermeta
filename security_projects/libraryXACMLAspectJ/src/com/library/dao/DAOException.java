package com.library.dao;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 17:37:52
 */
public class DAOException extends Throwable {

    String message;

    public String getMessage() {
        return message;
    }

    public DAOException(String s) {
        message = s;
    }
}
