/* $Id: TRUE.java,v 1.2 2005-03-21 10:41:15 jpthibau Exp $
* Project : Kermeta (First iteration)
* File : KMDummyObject.java
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
package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * @author jpthibau
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TRUE extends RuntimeObject {
	
	public static TRUE INSTANCE=new TRUE();
	
	private TRUE() {
		super("TRUE UNIQUE INSTANCE");
	}

}
