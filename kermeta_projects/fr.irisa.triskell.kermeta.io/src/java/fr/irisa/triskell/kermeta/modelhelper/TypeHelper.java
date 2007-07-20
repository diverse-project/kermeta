/* $Id: TypeHelper.java,v 1.4 2007-07-20 15:08:10 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
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
		} else if (type instanceof PrimitiveType) {
			PrimitiveType fPrimitiveType = (PrimitiveType) type;
			return ((ParameterizedType) fPrimitiveType.getInstanceType()).getTypeDefinition().getName();
		}
		return "";
	}
	
	/**
	 * Return true if the given type is linked to a type definition in the
	 * standard framework (framework.km), false otherwise. This method also
	 * calls isPrimitiveType method.
	 * 
	 * @param type
	 * @return
	 */
	public static boolean isStandardType(Type type) {

		// FIXME : it is possible to improve the retrieval method of the
		// ClassDefinition
		// corresponding with "kermeta::standard::ValueType", may be with a
		// cache (a class variable)
		if (type instanceof Class) {
			TypeDefinition valueTypeTypeDef = getTypeDefinitionFromResourceSet(type.eResource(),"kermeta::standard::ValueType");

			if (((Class) type).getTypeDefinition().getTypeParameter().size() == 0) {
				
				// FIXME CF: the uses of the method isSuperClassOfByName is very ugly, it is a temp patch related to the restore connection in the graphical editor
				if (!ClassDefinitionHelper.isSuperClassOfByName(
						(ClassDefinition) valueTypeTypeDef,
						(ClassDefinition) ((Class) type).getTypeDefinition())) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * Return true if given type is a primitive type (in kermeta meaning, an
	 * alias), false otherwise
	 * 
	 * @param type
	 * @return
	 */
	public static boolean isPrimitiveType(Type type) {

		if (type instanceof Class) {
			
			TypeDefinition primitiveTypeTypeDef = getTypeDefinitionFromResourceSet(type.eResource(),"kermeta::standard::PrimitiveType");

			if (((Class) type).getTypeDefinition().getTypeParameter().size() == 0) {
				
				// FIXME CF: the uses of the method isSuperClassOfByName is very ugly, it is a temp patch related to the restore connection in the graphical editor
				if (!ClassDefinitionHelper.isSuperClassOfByName(
						(ClassDefinition) primitiveTypeTypeDef,
						(ClassDefinition) ((Class) type).getTypeDefinition())) {
					return false;
				}
			}
		}

		return true;

		// return type instanceof PrimitiveType;
	}
	
	/**
	 * @param resource EMF Resource
	 * @param qualifiedName Qualified name of the searched TypeDefinition
	 * Get the TypeDefinition by QualifiedName from a loaded framework.km in an EMF ResourceSet
	 * @return
	 * 
	 * @generated NOT
	 */
	public static TypeDefinition getTypeDefinitionFromResourceSet(Resource resource, String qualifiedName) {
		TypeDefinition typeDef = null;
		boolean hasFound = false;
		for (Iterator it = resource.getResourceSet()
				.getAllContents(); it.hasNext() && hasFound == false;) {
			Object aResourceElt = (Object) it.next();
			if (aResourceElt instanceof ClassDefinition) {
				ClassDefinition aClassDef = (ClassDefinition) aResourceElt;
				if (NamedElementHelper.getQualifiedName(aClassDef).equals(qualifiedName)) {
					typeDef = aClassDef;
					hasFound = true;
				}
			}
		}
		return typeDef;
	}
}
