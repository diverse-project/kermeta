/* $Id: TypeHelper.java,v 1.9 2008-04-28 11:50:17 ftanguy Exp $
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
import java.util.List;

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
	 * returns true if this type inherits from ValueType
	 * @param type
	 * @return
	 */
	public static boolean isValueType(Type type ){
		if (type instanceof Class) {
			List<Type> tlist = ClassHelper.allSuperTypes((Class) type);
			for(Type t : tlist){
				if(getMangledQualifiedName(t).equals("kermeta::standard::ValueType"))
					return true;
			}
		}
		return false;
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

	/**
	 * Returns a "printable name" for the given type
	 * 
	 * @param type
	 * @return
	 */
	 static public String getLabelForType(Type type) {
		StringBuffer type_name = new StringBuffer();
		if (type instanceof Class){
			type_name.append(((Class) type).getTypeDefinition().getName());
			//String type_name2 = KMTHelper.getQualifiedName(((Class)type).getTypeDefinition());
		}
		else if (type instanceof TypeVariable){
			type_name.append(((TypeVariable)type).getName());
		}
		else if (type instanceof FunctionType) {
			type_name.append("<" + getLabelForType(((FunctionType) type).getLeft()) + "->" +getLabelForType(((FunctionType) type).getRight())+ ">");
		}
		else if (type instanceof ProductType) {
			type_name.append("[");
			boolean first_pt = true;
			for(Object pt_type : ((ProductType) type).getType()) {
				if(first_pt) {
					first_pt = false;
				} else {
					type_name.append(",");
				}
				type_name.append(getLabelForType((Type) pt_type));
			}
			type_name.append("]");	
		}
		else if (type instanceof DataType)
			type_name.append(((DataType) type).getName());
		else if (type instanceof VoidType)
			type_name.append("Void");
		else {
			type_name.append(type == null ? "<Null>" : type.toString());
			// throw new Error("FTYPE : Not implemented error :
			// createTypeForTypeDefinition -- Enumeration type is not handled
			// yet. (" + type + ")");
		}
		// FIXME : getName return sometimes null, which is unconsistent
		return (type_name.length() != 0) ? type_name.toString() : "<Unset>";
	}
}