/* $Id: Interpreter.java,v 1.2 2005-03-17 16:28:08 jpthibau Exp $
* Project : Kermeta (First iteration)
* File : InterpreterAsMMClass.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 mars 2005
* Author : jpthibau
* Description : describe here file content
* TODO :
*     - write here your TODO actions
*  - ...
*/
package fr.irisa.triskell.kermeta.interpreter;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;

/**
 * @author jpthibau
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class Interpreter extends KermetaObject {
	
	public Hashtable allClasses;
	
	public Interpreter(KermetaObjectFactory factory, KermetaObject metaclass) {
		super(factory,metaclass);
		this.allClasses=new Hashtable();
	}
}


