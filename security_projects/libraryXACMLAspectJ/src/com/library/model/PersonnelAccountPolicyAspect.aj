package com.library.model;

import com.library.bo.user.PersonnelAccount;
import com.library.bo.user.User;
import com.library.security.impl.LibrarySecurityModel;
import com.library.service.PersonnelAccountService;
import com.library.service.exception.SecuritPolicyViolationException;

public aspect PersonnelAccountPolicyAspect {
	
	
	pointcut modifyPersonnelAccountPC(User user,PersonnelAccount account, User connected) :
		target(PersonnelAccountService) && 
		(call(void createPersonnelAccount(User, PersonnelAccount, User)) ||
				call(void updatePersonnelAccount(User, PersonnelAccount, User)) ||
				call(void deletePersonnelAccount(User, PersonnelAccount, User))) &&
		args(user,account,connected);

	
	before(User user,PersonnelAccount account, User connected) throws SecuritPolicyViolationException : modifyPersonnelAccountPC(user,account,connected)  {

		// call security policy service to check for security rule
		Utils.checkSecurity(connected, LibrarySecurityModel.MANAGEACCESS_METHOD , LibrarySecurityModel.PERSONNELACCOUNT_VIEW, 
				LibrarySecurityModel.DEFAULT_CONTEXT);
		
	}
	
	
	
}
	
	
	
	


