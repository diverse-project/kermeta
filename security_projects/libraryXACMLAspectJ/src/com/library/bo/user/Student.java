package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:19
 */
public class Student extends Borrower {
    public Student(BorrowerAccount borrowerAccount) {
        super(borrowerAccount);
    }


    public Student() {
    }

    public String getRoleName() {
        return "STUDENT";
    }
}
