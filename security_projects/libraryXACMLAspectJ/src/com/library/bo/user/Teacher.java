package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:27
 */
public class Teacher extends Borrower {
    public Teacher(BorrowerAccount borrowerAccount) {
        super(borrowerAccount);
    }


    public Teacher() {
    }

    public String getRoleName() {
        return "TEACHER";
    }
}
