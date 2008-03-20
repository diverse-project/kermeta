package com.library.dao.dto;

import com.library.dao.dto.spec.DTO;

import java.util.Date;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 16:46:18
 */
public class PersonnelAccountDTO implements DTO {
    private int id_personnel_account,active,can_consult,id_user;

    private Date creation_date;


    public PersonnelAccountDTO() {
    }

    public int getId_personnel_account() {
        return id_personnel_account;
    }

    public void setId_personnel_account(int id_personnel_account) {
        this.id_personnel_account = id_personnel_account;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCan_consult() {
        return can_consult;
    }

    public void setCan_consult(int can_consult) {
        this.can_consult = can_consult;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }


    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
