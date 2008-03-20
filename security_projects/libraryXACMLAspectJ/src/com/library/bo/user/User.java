package com.library.bo.user;

import com.library.bo.book.Book;
import com.library.bo.BO;
import com.library.dao.dto.spec.DTO;
import com.library.dao.dto.UserDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * User: Tej
 * Date: 2 mars 2007
 * Time: 10:19:49
 */
public class User implements BO {
    private String login,password,name,mail,phone;
    private int userId;

    // roles
    public static final String PERSONNEL = "PERSONNEL", TEACHER = "TEACHER", STUDENT = "STUDENT", BORROWER = "BORROWER",
               ADMIN = "ADMIN" , SECRETARY = "SECRETARY", DIRECTOR = "DIRECTOR";

    
    private Role role;
    
    private ArrayList<Book> reservations,borrowed;



    public User(String name, String mail, String phone, Role role) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.role = role;

        reservations = new ArrayList<Book>();
        borrowed = new ArrayList<Book>();
    }

    public User()    {
       // empty constructor
    }

    public User(String login,String password,String name, String mail, String phone, Role role) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.login = login;
        this.password = password;

        this.role = role;

        reservations = new ArrayList<Book>();
        borrowed = new ArrayList<Book>();
    }

    public User(DTO dto)    {
        setFromDTO(dto);

        reservations = new ArrayList<Book>();
        borrowed = new ArrayList<Book>();
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

    public Role getRole() {
        return role;
    }


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

    public void setRole(Role role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<Book> getReservations() {
        return reservations;
    }

    public ArrayList<Book> getBorrowed() {
        return borrowed;
    }


    public void setFromDTO(DTO dto) {

        UserDTO userDTO = (UserDTO) dto;
        
        setLogin(userDTO.getLogin());
        setPassword(userDTO.getPassword());
        setName(userDTO.getName());
        setMail(userDTO.getMail());
        setPhone(userDTO.getPhone());
        setUserId(userDTO.getId_user());

    }


    public DTO getDTO() {
        UserDTO userDTO = new UserDTO();

        userDTO.setLogin(login);
        userDTO.setPassword(password);
        userDTO.setName(name);
        userDTO.setMail(mail);
        userDTO.setPhone(phone);
        userDTO.setId_user(userId);

        return userDTO;
    }

    public void setReservationsFromDTOs(Collection<DTO> dtos)   {

        // init the reservation list
        reservations = new ArrayList<Book>();

        //creates books and put them in reservations
        for (Iterator<DTO> iterator = dtos.iterator(); iterator.hasNext();) {
           reservations.add(new Book(iterator.next()));
        }

    }

    public void defineRole(String role) {



       if(role.equals(PERSONNEL))
            setRole(new Personnel());
       else if(role.equals(TEACHER))
            setRole(new Teacher());
       else if(role.equals(STUDENT))
            setRole(new Student());
       else if(role.equals(BORROWER))
            setRole(new Borrower());
       else if(role.equals(ADMIN))
            setRole(new Admin());
        else if(role.equals(DIRECTOR))
            setRole(new Director());
        else if(role.equals(SECRETARY))
            setRole(new Secretary());

    }


    public void setBorrowedFromDTOs(Collection<DTO> dtos)   {

        // init the reservation list
               borrowed = new ArrayList<Book>();

               //creates books and put them in reservations
               for (Iterator<DTO> iterator = dtos.iterator(); iterator.hasNext();) {
                  borrowed.add(new Book(iterator.next()));
               }

    }

}
