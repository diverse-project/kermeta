/* $Id: TypeHelper.java,v 1.7 2008-02-14 07:13:18 uid21732 Exp $
 * Project   : Kermeta 
 * File      : TypeHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;

/**
 * this class proposes various helper functions that applies to Type in the Kermeta model
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
		} else if (type instanceof PrimitiveType) {
			PrimitiveType fPrimitiveType = (PrimitiveType) type;
			return ((ParameterizedType) fPrimitiveType.getInstanceType()).getTypeDefinition().getName();
		}
		return "";
	}
	 
		/**
		 * 
		 * Return the class definition of a type if this type is a Class or a Virtualtype.
		 * 
		 * @param type
		 * @return
		 */
		static public ClassDefinition getClassDefinition(Type type) {
			if ( type instanceof Class ) {
				return (ClassDefinition) ((Class) type).getTypeDefinition();
			} else if ( type instanceof VirtualType ) {
				return ((VirtualType) type).getClassDefinition();
			} else if ( type instanceof PrimitiveType ) {
				Object o = type;
				while ( ! (o instanceof Class) )
					o = ((PrimitiveType) o).getInstanceType();
				return (ClassDefinition) ((Class) o).getTypeDefinition();
			}
			return null;
		} 
	 
}
