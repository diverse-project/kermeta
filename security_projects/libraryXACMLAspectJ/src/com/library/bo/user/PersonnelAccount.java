package com.library.bo.user;

import com.library.bo.BO;
import com.library.dao.dto.PersonnelAccountDTO;
import com.library.dao.dto.spec.DTO;

import java.util.Date;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 11:24:53
 */
public class PersonnelAccount extends Account implements BO {

    private boolean isCanConsultBorrowerAccount;

    private int personnelAccountID;

    public PersonnelAccount(Date creationDate, boolean canConsultBorrowerAccount) {
        super(creationDate);
        isCanConsultBorrowerAccount = canConsultBorrowerAccount;
    }

    public PersonnelAccount(boolean active, Date creationDate, boolean canConsultBorrowerAccount) {
        super(active, creationDate);
        isCanConsultBorrowerAccount = canConsultBorrowerAccount;
    }

    public PersonnelAccount(boolean active, boolean canConsultBorrowerAccount) {
        super(active);
        isCanConsultBorrowerAccount = canConsultBorrowerAccount;
    }

    public PersonnelAccount(boolean canConsultBorrowerAccount) {
        isCanConsultBorrowerAccount = canConsultBorrowerAccount;
    }

    public PersonnelAccount() {
        isCanConsultBorrowerAccount = true;

    }

    public boolean isCanConsultBorrowerAccount() {
        return isCanConsultBorrowerAccount;
    }

    public void setCanConsultBorrowerAccount(boolean canConsultBorrowerAccount) {
        isCanConsultBorrowerAccount = canConsultBorrowerAccount;
    }


    public int getPersonnelAccountID() {
        return personnelAccountID;
    }

    public void setPersonnelAccountID(int personnelAccountID) {
        this.personnelAccountID = personnelAccountID;
    }

    public void setFromDTO(DTO dto) {
         PersonnelAccountDTO personnelAccountDTO;

        personnelAccountDTO = (PersonnelAccountDTO) dto;

        setActive(personnelAccountDTO.getActive() == 1);
        setCanConsultBorrowerAccount(personnelAccountDTO.getCan_consult() == 1);
        setPersonnelAccountID(personnelAccountDTO.getId_personnel_account());

        setCreationDate(personnelAccountDTO.getCreation_date());

    }

    public DTO getDTO() {
        PersonnelAccountDTO personnelAccountDTO;

        personnelAccountDTO = new PersonnelAccountDTO();
        personnelAccountDTO.setActive(isActive() ? 1: 0);
        personnelAccountDTO.setCan_consult(isCanConsultBorrowerAccount ? 1: 0);
        personnelAccountDTO.setCreation_date(getCreationDate());
        personnelAccountDTO.setId_personnel_account(personnelAccountID);

        return personnelAccountDTO;

    }


      public boolean equals(Object obj) {

        if(!(obj instanceof PersonnelAccount)) return false;

        return // personnelAccountID == ((PersonnelAccount) obj).getPersonnelAccountID() &&
               //isCanConsultBorrowerAccount == ((PersonnelAccount) obj).isCanConsultBorrowerAccount();
                    isActive == ((PersonnelAccount) obj).isActive;

    }
}
