/* $Id: InitializationError.java,v 1.4 2008-04-30 08:07:22 dvojtise Exp $
* Project : Kermeta interpreter
* File : InitializationError.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 avr. 2008
* Authors : 
* 	François Tanguy
* Description :
*/
package org.kermeta.interpreter.api;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.io.ErrorMessage;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

final public class InitializationError extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> _errors = new ArrayList<String>();
	
	public InitializationError(KermetaUnit kermetaUnit) {
		super( getMessage(kermetaUnit) );
		for ( ErrorMessage e : KermetaUnitHelper.getAllErrors(kermetaUnit) )
			_errors.add( e.getValue() );
		
	}
	
	public List<String> getErrors() {
		return _errors;
	}
	
	public String getErrorsAsString() {
		String result = "";
		for (String s : _errors)
			result += s + "\n";
		return result;
	}
	
	static private String getMessage(KermetaUnit kermetaUnit) {
		List<ErrorMessage> errors = KermetaUnitHelper.getAllErrors(kermetaUnit);
		if(errors.size() > 0)
			return "The program cannot be launched because of "+ KermetaUnitHelper.getAllErrors(kermetaUnit).size()+" errors. \nFirst error is : " + errors.get(0).getValue();
		else
			return "The program cannot be launched because of "+ KermetaUnitHelper.getAllErrors(kermetaUnit).size()+" error.";
	}
	
	
}
