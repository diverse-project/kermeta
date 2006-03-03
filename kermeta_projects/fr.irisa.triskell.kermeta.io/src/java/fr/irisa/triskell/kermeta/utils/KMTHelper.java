/* $Id: KMTHelper.java,v 1.4 2006-03-03 15:22:19 dvojtise Exp $
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
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * Some helper methods usefull when dealing with kermeta text syntax
 */
public class KMTHelper {

	/**
	 * Get the fully qualified name of an NamedElement
	 */
	public static String getQualifiedName(NamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement)
			return getQualifiedName( (NamedElement)element.eContainer() ) + "::" + getMangledIdentifier(element.getName());
		else return element.getName();
	}
	/**
	 * Get the fully qualified name of FType 
	 * as the concrete types usually inherit from NamedElement
	 * or is a FClass. In the later case, returns the class definition qualified name
	 */
	public static String getTypeQualifiedName(Type type)
	{
		if(type instanceof NamedElement){
			NamedElement fNamedElement = (NamedElement)type;

			return KMTHelper.getQualifiedName(fNamedElement); 	
		}
		else if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class){
			fr.irisa.triskell.kermeta.language.structure.Class fClass = (fr.irisa.triskell.kermeta.language.structure.Class)type;
			return getQualifiedName(fClass.getTypeDefinition());
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
