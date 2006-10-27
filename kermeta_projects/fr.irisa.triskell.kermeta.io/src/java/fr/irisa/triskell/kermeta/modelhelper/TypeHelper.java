/* $Id: TypeHelper.java,v 1.1 2006-10-27 11:58:15 dvojtise Exp $
 * Project   : Kermeta 
 * File      : TypeHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;

/**
 * this class proposes various helper functions that applies to NamedElement in the Kermeta model
 *
 */
public class TypeHelper {

	/**
	 * Get the fully qualified name of Type as the concrete types usually
	 * inherit from NamedElement or is a FClass. In the later case, returns the
	 * class definition qualified name
	 */
	public static String getMangledQualifiedName(Type type) {
		if (type instanceof NamedElement) {
			NamedElement fNamedElement = (NamedElement) type;

			return NamedElementHelper.getMangledQualifiedName(fNamedElement);
		} else if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
			ClassImpl fClass = (ClassImpl) type;
			return NamedElementHelper.getMangledQualifiedName(fClass.getTypeDefinition());
		}
		return "";
	}
	
	/**
	 * Get the name of Type. 
	 * As the concrete types usually inherit from
	 * NamedElement or is a Class. In the later case, returns the class
	 * definition name
	 * Important note : It isn't clear that we have a name for all types, if so,
	 *  we eventually need to refactor the metamodel in order to put a derived attribute name on Type
	 *  we should also ensure to be able to calculate it for every types ...
	 */
	public static String getName(Type type) {
		if (type instanceof NamedElement) {
			NamedElement fNamedElement = (NamedElement) type;

			return fNamedElement.getName();
		} else if (type instanceof ParameterizedType) {
			ParameterizedType fClass = (ParameterizedType) type;
			return fClass.getTypeDefinition().getName();
		}
		return "";
	}
}
