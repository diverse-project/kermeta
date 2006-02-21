/* $Id: KMTHelper.java,v 1.3 2006-02-21 17:34:19 jsteel Exp $
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
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * Some helper methods usefull when dealing with kermeta text syntax
 */
public class KMTHelper {

	/**
	 * Get the fully qualified name of an FNamedElement
	 */
	public static String getQualifiedName(FNamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + getMangledIdentifier(element.getFName());
		else return element.getFName();
	}
	/**
	 * Get the fully qualified name of FType 
	 * as the concrete types usually inherit from FNamedElement
	 * or is a FClass. In the later case, returns the class definition qualified name
	 */
	public static String getTypeQualifiedName(FType type)
	{
		if(type instanceof FNamedElement){
			FNamedElement fNamedElement = (FNamedElement)type;

			return KMTHelper.getQualifiedName(fNamedElement); 	
		}
		else if (type instanceof FClass){
			FClass fClass = (FClass)type;
			return getQualifiedName(fClass.getFTypeDefinition());
		}
		return "";
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
