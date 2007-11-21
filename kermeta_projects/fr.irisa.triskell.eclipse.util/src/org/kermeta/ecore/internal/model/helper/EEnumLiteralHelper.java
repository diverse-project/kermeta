

/*$Id: EEnumLiteralHelper.java,v 1.1 2007-11-21 14:00:18 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	EEnumLiteralHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.ecore.internal.model.helper;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EcoreFactory;

public class EEnumLiteralHelper {

	/**
	 * 
	 * Creates a literal with the given name and the given value.
	 * 
	 * @param name the name of the literal.
	 * @param value the value of the literal.
	 * @return an instance of EEnumLiteral
	 */
	static public EEnumLiteral create(String name, int value) {
		EEnumLiteral literal = EcoreFactory.eINSTANCE.createEEnumLiteral();
		literal.setName(name);
		literal.setValue(value);
		return literal;
	}
	
	/**
	 * 
	 * Creates a literal with the given name and the given value.
	 * 
	 * @param name the name of the literal.
	 * @param value the value of the literal.
	 * @return an instance of of EEnumLiteral
	 */
	static public EEnumLiteral create(String name, String value) {
		EEnumLiteral literal = EcoreFactory.eINSTANCE.createEEnumLiteral();
		literal.setName(name);
		literal.setLiteral(value);
		return literal;
	}
	
}


