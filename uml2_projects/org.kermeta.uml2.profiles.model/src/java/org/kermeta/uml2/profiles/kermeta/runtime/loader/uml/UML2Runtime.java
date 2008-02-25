/*$Id: UML2Runtime.java,v 1.1 2008-02-25 16:53:36 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	UML2Runtime.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 12 févr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.uml2.profiles.kermeta.runtime.loader.uml;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.runtime.loader.emf.EMF2Runtime;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;

public class UML2Runtime extends EMF2Runtime {

	public UML2Runtime(EMFRuntimeUnit newunit, Resource newroot_resource) {
		super(newunit, newroot_resource);
	}

}
