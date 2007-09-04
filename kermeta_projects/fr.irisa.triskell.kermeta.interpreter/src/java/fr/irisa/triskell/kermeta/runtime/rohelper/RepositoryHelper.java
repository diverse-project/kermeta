/* $Id: RepositoryHelper.java,v 1.1 2007-09-04 14:33:24 dvojtise Exp $ 
 * Project : Kermeta (First iteration)
 * File : RepositoryHelper.java
 * License : EPL
 * Copyright : IRISA / INRIA
 * ----------------------------------------------------------------------------
 * Creation date : Aug, 2007
 * Authors : 
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 * 
 * helper on the Kermeta base type Repository 
 */

package fr.irisa.triskell.kermeta.runtime.rohelper;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class RepositoryHelper {
	
	/** This operation is an helper when used from java
	 * retrieves a resource from its URI
	 * Note this not exactly the same than the getResource as called from kermeta but it still useful
	 * return the Resource RuntimeObject or null if not found
	 */
	public static RuntimeObject getResource(RuntimeObject roRep, java.lang.String searchedResourceURI) {
	
		RuntimeObject resListRO = roRep.getProperties().get("resources");
		ArrayList<RuntimeObject> aResourceListRO = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resListRO);
		RuntimeObject foundResourceRO = null;
		// look for a resourceRO with the correct uri
		for(RuntimeObject aResourceRO : aResourceListRO) {
			RuntimeObject roString = (RuntimeObject)aResourceRO.getProperties().get("uri");
			if(searchedResourceURI.equals(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(roString))){
				foundResourceRO = aResourceRO;
			}
		}
	
		return foundResourceRO;
	}
}
