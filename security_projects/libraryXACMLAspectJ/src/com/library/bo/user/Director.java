package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:35
 */
public class Director extends Personnel  {
    
    public Director(PersonnelAccount personnelAccount) {
        super(personnelAccount);
    }

    public Director()   {}

    public String getRoleName() {
        return "DIRECTOR";
    }
}
