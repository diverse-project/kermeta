/* $Id: InterpreterAsMMClass.java,v 1.1 2005-03-11 08:36:08 jpthibau Exp $
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

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;

/**
 * @author jpthibau
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/***
 * Interpreter is a KermetaObject with accessible properties :
 * - stacked contexts;
 * - args passed by the launcher from user provided string arguments
 *
 * It also acts as the metametaclass that instanciate all Kermeta metaclasses
 * required to load any kermeta program (or model).
 */
public class InterpreterAsMMClass extends KermetaObject {

	public InterpreterAsMMClass(KermetaObjectFactory factory) {
		super(factory,null);
	}
}
