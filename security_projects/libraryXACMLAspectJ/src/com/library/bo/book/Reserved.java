package com.library.bo.book;

import com.library.bo.user.User;


/**
 * @author franck
 */

public class Reserved extends BookState {

	/**
	 * @see BookState#reserve(Book,User)
	 */
	public void reserve(Book b, User user) {
		b.addRes(user);
	}


	public void borrow(Book b, User user) {
		b.rmRes(user);
		b.setCurrentState(new Borrowed());
	}

}
