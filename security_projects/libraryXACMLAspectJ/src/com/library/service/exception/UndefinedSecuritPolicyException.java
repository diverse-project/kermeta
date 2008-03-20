package com.library.service.exception;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:46:15
 */
public class UndefinedSecuritPolicyException extends SecuritPolicyViolationException {

    private String message;


    public UndefinedSecuritPolicyException(String s) {
        super(s);
    }



}
