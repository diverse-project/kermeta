package com.library.bo.user;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:20:51
 */
public class Secretary extends Personnel  {
    public Secretary(PersonnelAccount personnelAccount) {
        super(personnelAccount);
    }

    public Secretary() {

    }

    public String getRoleName() {
        return "SECRETARY";
    }

}
