package com.library.service.exception;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:43:52
 */
public class BSException extends Exception {

    String message;

    public BSException(String message)    {

     this.message = message;
    }


    
    public String getMessage() {
        return message;
    }
}
