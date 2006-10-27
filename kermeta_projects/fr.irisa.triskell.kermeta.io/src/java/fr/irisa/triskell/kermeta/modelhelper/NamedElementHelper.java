/* $Id: NamedElementHelper.java,v 1.1 2006-10-27 08:26:16 dvojtise Exp $
 * Project   : Kermeta 
 * File      : NamedElementHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 25 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * this class proposes various helper functions that applies to ClassDefinition in the Kermeta model
 *
 */
public class NamedElementHelper {

	/**
	 * Get the fully qualified name of a NamedElement
	 * Apply a mangling if necessary (ie. add a leading ~ before keywords)
	 * This is usefull when dealing with textual syntax of kermeta
	 */
	public static String getMangledQualifiedName(NamedElement element) {
		if (element == null) return "";
		if (element.eContainer() != null
				&& element.eContainer() instanceof NamedElement)
			return getMangledQualifiedName((NamedElement) element.eContainer()) + "::"
					+ KMTHelper.getMangledIdentifier(element.getName());
		else
			return KMTHelper.getMangledIdentifier(element.getName());
	}
	/**
	 * Get the fully qualified name of a NamedElement
	 * (no mangling)
	 */
   public static String getQualifiedName(NamedElement element) {
		if (element == null) return "";
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement)
			return getQualifiedName( (NamedElement)element.eContainer() ) + "::" + element.getName();
		else return element.getName();
	}
}
