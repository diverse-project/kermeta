package com.library.bo.user;

import com.library.bo.BO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.dto.BorrowerAccountDTO;

import java.util.Date;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 11:13:13
 */
public class BorrowerAccount extends Account implements BO {

    private boolean isCanBorrow;

    private int borrowerAccountID;

    public BorrowerAccount(boolean active, boolean canBorrow) {

        super(active);
        isCanBorrow = canBorrow;
    }


    public BorrowerAccount(boolean active, boolean canBorrow, Date creationDate) {
        super(active,creationDate);
        isCanBorrow = canBorrow;
    }


    public BorrowerAccount(boolean canBorrow) {
        isCanBorrow = canBorrow;
    }


    public BorrowerAccount() {
        isCanBorrow = true;
    }

        public BorrowerAccount(DTO dto) {
            setFromDTO(dto);
    }

    public boolean isCanBorrow() {
        return isCanBorrow;
    }

    public void setCanBorrow(boolean canBorrow) {
        isCanBorrow = canBorrow;
    }


    public int getBorrowerAccountID() {
        return borrowerAccountID;
    }

    public void setBorrowerAccountID(int borrowerAccountID) {
        this.borrowerAccountID = borrowerAccountID;
    }

    public void setFromDTO(DTO dto) {
         BorrowerAccountDTO borrowerAccountDTO;

        borrowerAccountDTO = (BorrowerAccountDTO) dto;

        setActive(borrowerAccountDTO.getActive() == 1);
        setCanBorrow(borrowerAccountDTO.getCan_borrow() == 1);
        setBorrowerAccountID(borrowerAccountDTO.getId_borrower_account());
        setCreationDate(borrowerAccountDTO.getCreation_date());


    }

    public DTO getDTO() {
        BorrowerAccountDTO borrowerAccountDTO;

        borrowerAccountDTO = new BorrowerAccountDTO();
        borrowerAccountDTO.setActive(isActive() ? 1: 0);
        borrowerAccountDTO.setCan_borrow(isCanBorrow() ? 1: 0);
        borrowerAccountDTO.setCreation_date(getCreationDate());

        borrowerAccountDTO.setId_borrower_account(getBorrowerAccountID());


        return borrowerAccountDTO;

    }


    public boolean equals(Object obj) {

        if(!(obj instanceof BorrowerAccount)) return false;

        
        return this.getCreationDate().equals(((BorrowerAccount) obj).getCreationDate()) &&
               isCanBorrow == ((BorrowerAccount) obj).isCanBorrow();

    }


    public String toString() {
        return " Borrower Account : can borrow " + isCanBorrow + " Date of creation " + creationDate +
                " is active = " + isActive;
    }
}
