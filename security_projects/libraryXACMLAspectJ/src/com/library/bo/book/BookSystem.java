/**
 * @author Baudry - Fleurey
 *
 */

package com.library.bo.book;

import com.library.bo.user.User;

import java.io.*;
import java.util.Hashtable;


public class BookSystem  {
	

	/**
	 * @uml.property  name="output"
	 */
	protected BufferedWriter output;
	/**
	 * @uml.property  name="bookMap"
	 * @uml.associationEnd  qualifier="com.library.bo.book:java.lang.String com.library.bo.book.Book"
	 */
	protected Hashtable<String,Book> bookMap;
	
	public BookSystem() {
		output = new BufferedWriter(new OutputStreamWriter(System.out));
		bookMap = new Hashtable<String,Book>();
	}
	
	public void addBook(Book b) {
		bookMap.put(b.getTitle(), b);
	}
	
	public Book getBook(String title) {
		return (Book) bookMap.get(title);
	}
	
	public void processCommand(String cmd, User user) {
		
		 java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(cmd);
		 
		 try {
			 String book, command = null;
			 book = tokenizer.nextToken(" ");
			 if (tokenizer.hasMoreTokens())
			 	command = tokenizer.nextToken(" ");
			 output.write(cmd + "\n");
			 output.flush();
			
			 Book b = (Book)bookMap.get(book);
			 if (b == null) {  output.write("invalid com.library.bo.book : " + book + "\n"); output.flush(); return; }
			 else if (command!= null) b.execute(command, user);
			 else output.write(b.getTitle() + "\n");
			 output.write("System> OK\n");
			 output.flush();
			 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidActionException e) {
			try {
				output.write("System> "+ e.getMessage() +"\n"); output.flush();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}
}
