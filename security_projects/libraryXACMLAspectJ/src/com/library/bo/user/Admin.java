package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:42
 */
public class Admin extends Personnel {

    
    public Admin(PersonnelAccount personnelAccount) {
        super(personnelAccount);
    }


    public Admin() {
    }

    public String getRoleName() {
        return "ADMIN";
    }
}
