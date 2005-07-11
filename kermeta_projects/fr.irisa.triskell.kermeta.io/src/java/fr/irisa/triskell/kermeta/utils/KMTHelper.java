/* $Id: KMTHelper.java,v 1.1 2005-07-11 15:34:20 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KMTHelper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 11 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Some helper methods usefull when dealing with kermeta text syntax 
 */
package fr.irisa.triskell.kermeta.utils;

import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.structure.FNamedElement;

/**
 * Some helper methods usefull when dealing with kermeta text syntax
 */
public class KMTHelper {

	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
	public static String getQualifiedName(FNamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + getMangledIdentifier(element.getFName());
		else return element.getFName();
	}
	
	/**
	 * 
	 * @param id
	 * @return the identifier eventually mangled in order to safely fit in the kermeta text syntax
	 */
	public static String getMangledIdentifier(String id) {
		if (id == null) return id;
		if (SimpleKWList.getInstance().isKeyword(id))
			return "~" + id;
		else return id;
	}
}
