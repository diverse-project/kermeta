/* $Id: Interpreter.java,v 1.3 2005-03-22 12:49:29 zdrey Exp $
* Project : Kermeta (First iteration)
* File : InterpreterAsMMClass.java
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

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;

/**
 */

public class Interpreter extends KermetaObject {
	
	public Hashtable allClasses;
	
	public Interpreter(RuntimeObjectFactory factory, KermetaObject metaclass) {
		super(factory,metaclass);
		this.allClasses=new Hashtable();
	}
}


