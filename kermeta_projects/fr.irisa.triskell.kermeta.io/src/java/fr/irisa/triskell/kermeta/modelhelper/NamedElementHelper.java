/* $Id: NamedElementHelper.java,v 1.6 2008-04-28 11:50:17 ftanguy Exp $
 * Project   : Kermeta 
 * File      : NamedElementHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 25 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;


import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;

/**
 * this class proposes various helper functions that applies to NamedElement in the Kermeta model
 *
 */
public class NamedElementHelper {
	
	public static final String doublePointSeparator = "::";
	
	public static final String simplePointSeparator = ".";

	/**
	 * Get the fully qualified name of a NamedElement
	 * Apply a mangling if necessary (ie. add a leading ~ before keywords)
	 * This is usefull when dealing with textual syntax of kermeta
	 */
	public static String getMangledQualifiedName(NamedElement element) {
		return getMangledQualifiedName(element, doublePointSeparator);
	}
	
	/**
	 * Get the fully qualified name of a NamedElement
	 * Apply a mangling if necessary (ie. add a leading ~ before keywords)
	 * This is usefull when dealing with textual syntax of kermeta
	 */
	public static String getMangledQualifiedName(NamedElement element, String separator) {
		if (element == null) return "";
		if (element.eContainer() != null
				&& element.eContainer() instanceof NamedElement)
			return getMangledQualifiedName((NamedElement) element.eContainer(), separator) + separator
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
