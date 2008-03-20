package com.library.bo.book;
/**
 * @author franck
 */

import com.library.bo.user.User;

public class Deliver extends BookEvent {


	public void execute(Book b, User user) throws InvalidActionException {
			b.getCurrentState().deliver(b);
	}

}
