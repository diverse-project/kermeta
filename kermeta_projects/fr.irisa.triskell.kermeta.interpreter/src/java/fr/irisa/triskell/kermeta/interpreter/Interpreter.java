/* $Id: Interpreter.java,v 1.4 2005-03-22 12:50:42 zdrey Exp $
* Project : Kermeta (First iteration)
* File : Interpreter.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 mars 2005
* Author : 
* 	Jean-Philippe Thibaut <jpthibau@irisa.fr>
* Description : describe here file content
*/
package fr.irisa.triskell.kermeta.interpreter;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

/**
 */

public class Interpreter extends RuntimeObject {
	
	public Hashtable allClasses;
	
	public Interpreter(RuntimeObjectFactory factory, RuntimeObject metaclass) {
		super(factory,metaclass);
		this.allClasses=new Hashtable();
	}
}


