package com.library.bo.book;

import com.library.bo.user.User;


/**
 * @author franck
 *
 */
public abstract class BookState {
	
	
	public void reserve(Book b, User user) throws InvalidActionException {
		throw new InvalidActionException("State : " + this.getClass().getName() + " unable to reserve");
	}
	public void deliver(Book b) throws InvalidActionException {
		throw new InvalidActionException("State : " + this.getClass().getName() + " unable to deliver");
	}
	public void borrow(Book b, User user) throws InvalidActionException {
		throw new InvalidActionException("State : " + this.getClass().getName() + " unable to borrow");
	}
	public void giveBack(Book b) throws InvalidActionException {
		throw new InvalidActionException("State : " + this.getClass().getName() + " unable to giveBack");
	}
	public void fix(Book b) throws InvalidActionException {
		throw new InvalidActionException("State : " + this.getClass().getName() + " unable to fix");
	}

}
