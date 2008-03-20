package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:06
 */
public class Borrower implements Role {


    private BorrowerAccount borrowerAccount;


    public Borrower(BorrowerAccount borrowerAccount) {
        this.borrowerAccount = borrowerAccount;


    }

    public Borrower() {


       }


    public BorrowerAccount getBorrowerAccount() {
        return borrowerAccount;
    }

    public void setBorrowerAccount(BorrowerAccount borrowerAccount) {
        this.borrowerAccount = borrowerAccount;
    }

    public String getRoleName() {
        return "BORROWER";
    }
}
