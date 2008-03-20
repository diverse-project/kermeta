package com.library.dao.dto;

import com.library.dao.dto.spec.DTO;

/**
 * User: Tej
 * Date: 21 fevr. 2007
 * Time: 15:12:51
 * UserDTO contains infos about login
 * used in the DAO layer to interact with the DAO
 */
public class UserDTO implements DTO {

    private String login, password, name, mail, phone;
    private int id_user;

    public UserDTO() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * main constructor
     *
     * @param user     login name
     * @param password password
     */
    public UserDTO(String user, String password) {
        this.login = user;
        this.password = password;
    }

    // accessors and modifiers
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
