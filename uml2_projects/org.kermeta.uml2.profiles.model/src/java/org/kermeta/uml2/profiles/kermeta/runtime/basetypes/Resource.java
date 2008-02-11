/*$Id: Resource.java,v 1.1 2008-02-11 16:48:35 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	Resource.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 févr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.uml2.profiles.kermeta.runtime.basetypes;

import org.kermeta.uml2.profiles.kermeta.runtime.loader.uml.UMLRuntimeUnitFactory;

import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitLoader;

/**
 * Wrapper for the UMLResource object
 * provides the static operations that will be called from Kermeta
 *
 */
public class Resource extends fr.irisa.triskell.kermeta.runtime.basetypes.Resource {

	/**
	 * add  the factory needed to be able to deal with "UML" Resources 
	 */
	public static void addUMLRuntimeUnitFactory()
	{
		if(!RuntimeUnitLoader.getDefaultLoader().factories.containsKey("UML")){
			RuntimeUnitLoader.getDefaultLoader().factories.put("UML", new UMLRuntimeUnitFactory());
		}
	}
}
