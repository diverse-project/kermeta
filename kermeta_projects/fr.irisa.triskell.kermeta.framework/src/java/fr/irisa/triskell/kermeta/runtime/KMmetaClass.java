/* $Id: KMmetaClass.java,v 1.1 2005-03-14 18:01:18 jpthibau Exp $
* Project : Kermeta (First iteration)
* File : KMmetaClass.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mars 2005
* Author : jpthibau
* Description : describe here file content
* TODO :
*     - write here your TODO actions
*  - ...
*/
package fr.irisa.triskell.kermeta.runtime;

import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;

/**
 * @author jpthibau
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class KMmetaClass extends KermetaObject {

	public KMmetaClass(KermetaObjectFactory factory) {
		super(factory,null);
		this.setMetaclass(this);
	}

}
