package com.library.service.exception;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:46:15
 */
public class SecuritPolicyViolationException extends Exception {

    private String message;

    public SecuritPolicyViolationException(String s) {

        message = s;
    }


    public String getMessage() {
       return  message;
    }
}
