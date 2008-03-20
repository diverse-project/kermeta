package com.library.model;

import com.library.security.impl.LibrarySecurityModel;
import com.library.service.BorrowerAccountService;
import com.library.service.exception.SecuritPolicyViolationException;
import com.library.bo.user.BorrowerAccount;
import com.library.bo.user.User;

public aspect BorrowerAccountPolicyAspect {
	
	pointcut createBorrowerAccountPC(User user,BorrowerAccount account, User connected) :
		target(BorrowerAccountService) && call(void createBorrowerAccount(User, BorrowerAccount, User)) &&  args(user,account,connected);

	pointcut modifyBorrowerAccountPC(User user,BorrowerAccount account, User connected) :
		target(BorrowerAccountService) && 
		(call(void updateBorrowerAccount(User, BorrowerAccount, User)) ||
				call(void deleteBorrowerAccount(User, BorrowerAccount, User))) &&
		args(user,account,connected);

	pointcut consultBorrowerAccountPC(User user, User connected) :
		target(BorrowerAccountService) && call(BorrowerAccount consultBorrowerAccount(User, User)) &&  args(user,connected);

	
	before(User user,BorrowerAccount account, User connected) throws SecuritPolicyViolationException : createBorrowerAccountPC(user,account,connected)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(connected, LibrarySecurityModel.CREATEACCOUNT_METHOD , LibrarySecurityModel.BORROWERACCOUNT_VIEW, 
				LibrarySecurityModel.DEFAULT_CONTEXT);
		
	}
	
	before(User user,BorrowerAccount account, User connected) throws SecuritPolicyViolationException : modifyBorrowerAccountPC(user,account,connected)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(connected, LibrarySecurityModel.MODIFYACCOUNT_METHOD , LibrarySecurityModel.BORROWERACCOUNT_VIEW, 
				LibrarySecurityModel.DEFAULT_CONTEXT);
		
	}
	
	
	before(User user, User connected) throws SecuritPolicyViolationException : consultBorrowerAccountPC(user,connected)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(connected, LibrarySecurityModel.CONSULTBORROWERACCOUNT_METHOD , LibrarySecurityModel.BORROWERACCOUNT_VIEW, 
				LibrarySecurityModel.DEFAULT_CONTEXT);
		
	}
	
}