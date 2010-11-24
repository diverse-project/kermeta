

/*$Id: NamedElementHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	NamedElementHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.language.helpers;

import org.kermeta.language.structure.NamedElement;

public class NamedElementHelper {

	final static private String DEFAULT_SEPARATOR = "::";
	
	/** 
	 * This is a helper class containing static operations, cannot create instance of it
	 */
	private NamedElementHelper(){		
	}
	
	/**
	 * 
	 * @param element
	 * @return
	 */
	static public String qualifiedName(NamedElement element) {
		return qualifiedName(element, DEFAULT_SEPARATOR);
	}
	
	/**
	 * 
	 * @param element
	 * @param separator string that separates two elements' name
	 * @return
	 */
	static public String qualifiedName(NamedElement element, String separator) {
		if (element == null) return "";
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement){
			return qualifiedName( (NamedElement)element.eContainer() ) + "::" + element.getName();
		}
		else { return element.getName();}
	}
	
}


