package com.library.bo.book;
/**
 * @author Baudry - Fleurey
 *
 */


import com.library.bo.user.User;

public abstract class BookEvent {

	public abstract void execute(Book b, User user) throws InvalidActionException;

}
