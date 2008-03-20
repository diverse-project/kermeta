package com.library.model;


import com.library.bo.book.Book;
import com.library.bo.user.User;

import com.library.service.exception.SecuritPolicyViolationException;

import com.library.service.BookService;
import com.library.security.impl.LibrarySecurityModel;
import com.library.security.impl.context.ContextManager;


public aspect BookPolicyAspect {
	
	
	pointcut borrowBookPC(User user,Book book) :
		target(BookService) && call(void borrowBook(User,Book)) 	&&  args(user,book);
	
	pointcut reserveBookPC(User user,Book book) :
		target(BookService) && call(void reserveBook(User,Book))	&&  args(user,book);
	
	pointcut giveBackBookPC(User user,Book book) :
		target(BookService) && call(void giveBackBook(User,Book))   &&  args(user,book);
	
	pointcut fixBookPC(User user,Book book) :
		target(BookService) && call(void fixBook(User,Book))		&&  args(user,book);
	
	pointcut bookDamagedPC(User user,Book book) :
		target(BookService) && call(void bookDamaged(User,Book))	&&  args(user,book);
	
	pointcut bookRepairedPC(User user,Book book) :
		target(BookService) && call(void bookRepaired(User,Book))   &&  args(user,book);
	
	pointcut deliverBookPC(User user,Book book) :
		target(BookService) && call(void deliverBook(User,Book))	&&  args(user,book);
	

	
	

	before(User user,Book book) throws SecuritPolicyViolationException : borrowBookPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.BORROWBOOK_METHOD , LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	before(User user,Book book) throws SecuritPolicyViolationException : reserveBookPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.RESERVEBOOK_METHOD , LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	before(User user,Book book) throws SecuritPolicyViolationException : giveBackBookPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.GIVEBACKBOOK_METHOD , LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	before(User user,Book book) throws SecuritPolicyViolationException : fixBookPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.FIXBOOK_METHOD, LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	before(User user,Book book) throws SecuritPolicyViolationException : bookDamagedPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.FIXBOOK_METHOD , LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	before(User user,Book book) throws SecuritPolicyViolationException : bookRepairedPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.FIXBOOK_METHOD , LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	before(User user,Book book) throws SecuritPolicyViolationException : deliverBookPC(user,book)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(user, LibrarySecurityModel.DELIVERBOOK_METHOD , LibrarySecurityModel.BOOK_VIEW, 
				ContextManager.getTemporalContext());
		
	}
	
	
	
	
	
	
    
    
}


