package com.library.bo.book;
/**
 * @author franck
 *
 */
public class InvalidActionException extends Exception {
	

	private static final long serialVersionUID = 1L;
	/**
	 * @uml.property  name="message"
	 */
	protected String message;
	
	public InvalidActionException(String msg) {
		message = msg;
	}	

	/**
	 * Returns the message.
	 * @return  String
	 * @uml.property  name="message"
	 */
	public String getMessage() {
		return message;
	}

}
