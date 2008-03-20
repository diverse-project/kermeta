package com.library.bo.user;

import java.util.Date;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 11:19:15
 */
public class Account {
    

    public Account(Date creationDate) {
        this.creationDate = creationDate;
        isActive = true;
    }

    public Account(boolean active, Date creationDate) {
        isActive = active;
        this.creationDate = creationDate;
    }

    public Account(boolean active) {
        isActive = active;
        this.creationDate = new Date();
    }

    public Account() {
        creationDate = new Date();
        isActive = true;

    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    protected boolean isActive;
    protected Date creationDate;

}
