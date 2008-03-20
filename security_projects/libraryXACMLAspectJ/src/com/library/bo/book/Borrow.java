package com.library.bo.book;
/**
 * @author franck
 */


import com.library.bo.user.User;

public class Borrow extends BookEvent {


	public void execute(Book b, User user) throws InvalidActionException {
        if(user == null) new InvalidActionException("Missing com.library.bo.user parameter");


        b.getCurrentState().borrow(b, user);

	}

}
