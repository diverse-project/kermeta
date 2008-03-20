/**
 * @author Baudry - Fleurey
 *
 */

package com.library.bo.book;

import com.library.bo.BO;
import com.library.bo.user.User;
import com.library.dao.dto.BookDTO;
import com.library.dao.dto.spec.DTO;

import java.util.*;

/**
 * @author Tej
 */
public class Book implements BO {


    private String title;
    protected String author;
    protected int NbPages, PublicationYear, bookId;
    protected boolean damaged;


    protected ArrayList<User> reservations;
    protected static Hashtable<String, BookEvent> commandsMap;

    public static Hashtable<String, BookState> statesMap;
    protected static Hashtable<Class, String> statesNamesMap;


    protected BookState currentState;

    // constants string commmands
    public static final String RESERVE = "RESERVE",
            FIX = "FIX",
            RETURN = "RETURN",
            BORROW = "BORROW",
            DELIVER = "DELIVER",
            SETDAMAGED = "SETDAMAGED",
            SETREPAIRED = "SETREPAIRED";

    // constants string commmands
    public static final String ORDERED = "ORDERED",
            BEINGFIXED = "BEINGFIXED",
            RESERVED = "RESERVED",
            BORROWED = "BORROWED",
            AVAILABLE = "AVAILABLE";

    static {
        if (commandsMap == null) {
            commandsMap = new Hashtable<String, BookEvent>();
            commandsMap.put(RESERVE, new Reserve());
            commandsMap.put(FIX, new Fix());
            commandsMap.put(RETURN, new GiveBack());
            commandsMap.put(BORROW, new Borrow());
            commandsMap.put(DELIVER, new Deliver());
            commandsMap.put(SETDAMAGED, new SetDamaged());
            commandsMap.put(SETREPAIRED, new SetRepaired());
        }

        if (statesMap == null) {

            statesMap = new Hashtable<String, BookState>();

            statesMap.put(ORDERED, new Ordered());
            statesMap.put(BEINGFIXED, new BeingFixed());
            statesMap.put(RESERVED, new Reserved());
            statesMap.put(BORROWED, new Borrowed());
            statesMap.put(AVAILABLE, new Available());

            statesNamesMap = new Hashtable<Class, String>();

            statesNamesMap.put(Ordered.class, ORDERED);
            statesNamesMap.put(BeingFixed.class, BEINGFIXED);
            statesNamesMap.put(Reserved.class, RESERVED);
            statesNamesMap.put(Borrowed.class, BORROWED);
            statesNamesMap.put(Available.class, AVAILABLE);


        }


    }


    protected BookEvent getCmd(String c) {

        return commandsMap.get(c);
    }

    public Book() {
        currentState = new Ordered();
        damaged = false;
        reservations = new ArrayList<User>();
    }

    public Book(DTO dto) {

        setFromDTO(dto);
        reservations = new ArrayList<User>();

    }

    public void execute(String cmd, User user) throws InvalidActionException {

        BookEvent be;
        if ((be = getCmd(cmd)) != null)
            be.execute(this, user);
        else
            throw new InvalidActionException("Invalid command : " + cmd);

    }

    /**
     * Returns the currentState.
     *
     * @return BookState
     * @uml.property name="currentState"
     */
    public BookState getCurrentState() {
        return currentState;
    }

    /**
     * Returns the currentState.
     *
     * @return BookState
     * @uml.property name="currentState"
     */
    public String getCurrentStateString() {
        return statesNamesMap.get(currentState.getClass());
    }

    /**
     * Sets the currentState.
     *
     * @param currentState The currentState to set
     * @uml.property name="currentState"
     */
    public void setCurrentState(BookState currentState) {
        this.currentState = currentState;
    }

    /**
     * Returns the title.
     *
     * @return String
     * @uml.property name="title"
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the damaged.
     *
     * @return boolean
     * @uml.property name="damaged"
     */
    public boolean isDamaged() {
        return damaged;
    }

    /**
     * Returns the nb_res.
     *
     * @return int
     */
    public int getNbRes() {
        return reservations.size();
    }

    /**
     * Sets the damaged.
     *
     * @param damaged The damaged to set
     * @uml.property name="damaged"
     */
    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public boolean hasRes(User user) {
        return reservations.contains(user);
    }

    public void addRes(User user) {
        if (!reservations.contains(user)) reservations.add(user);
    }

    public void rmRes(User user) {
        if (reservations.contains(user)) reservations.remove(user);
    }


    public String toString() {
        return getTitle();
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNbPages() {
        return NbPages;
    }

    public void setNbPages(int nbPages) {
        NbPages = nbPages;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public void setFromDTO(DTO dto) {
        BookDTO bookDTO = (BookDTO) dto;

        // set infos
        setTitle(bookDTO.getTitle());
        setAuthor(bookDTO.getAuthor());
        setPublicationYear(bookDTO.getPub_year());
        setNbPages(bookDTO.getPages());
        setBookId(bookDTO.getId_book());
        setDamaged(bookDTO.getDamaged() == 1);

        setCurrentState(statesMap.get(bookDTO.getState()));

    }

    public DTO getDTO() {

        BookDTO bookDTO = new BookDTO();
        bookDTO.setTitle(getTitle());
        bookDTO.setAuthor(getAuthor());
        bookDTO.setPub_year(getPublicationYear());
        bookDTO.setId_book(getBookId());
        bookDTO.setState(statesNamesMap.get(getCurrentState().getClass()));
        bookDTO.setDamaged(isDamaged() ? 1 : 0);

        return bookDTO;
    }

    public void setReservationsFromDTOs(Collection<DTO> dtos) {

        // init the reservation list
        reservations = new ArrayList<User>();

        //creates books and put them in reservations
        for (Iterator<DTO> iterator = dtos.iterator(); iterator.hasNext();) {
            reservations.add(new User(iterator.next()));
        }

    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;

        return bookId == ((Book) obj).getBookId() &&
                title.equals(((Book) obj).getTitle()) &&
                author.equals(((Book) obj).getAuthor());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<User> getReservations() {
        return reservations;
    }
}
