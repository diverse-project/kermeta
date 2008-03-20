package com.library.bo.book;
/**
 * @author franck
 */
import com.library.bo.user.User;


public class Fix extends BookEvent {


	public void execute(Book b, User user)  throws InvalidActionException {
		b.getCurrentState().fix(b);
	}

}
