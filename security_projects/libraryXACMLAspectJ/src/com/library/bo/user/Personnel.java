package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:13
 */
public class Personnel implements Role {


    PersonnelAccount personnelAccount;

    public Personnel() {
    }

    public Personnel(PersonnelAccount personnelAccount) {
        this.personnelAccount = personnelAccount;
    }
    

    public PersonnelAccount getPersonnelAccount() {
        return personnelAccount;
    }

    public void setPersonnelAccount(PersonnelAccount personnelAccount) {
        this.personnelAccount = personnelAccount;
    }

    public String getRoleName() {
        return "PERSONNEL";
    }
    
}
