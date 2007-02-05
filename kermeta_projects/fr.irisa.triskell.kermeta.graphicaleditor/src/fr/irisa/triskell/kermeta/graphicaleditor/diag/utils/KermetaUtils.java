/* $Id: KermetaUtils.java,v 1.11 2007-02-05 13:42:29 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : KermetaUtils.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey
 * Contributors : David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware
 * Technologies), Jacques Lescot (Anyware Technologies) - initial API and
 * implementation
 * This is an adapted copy of KermetaTools in Topcased ecore editor
 * ----------------------------------------------------------------------------
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diag.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.loader.TypeContainementFixer;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * This class is a singleton, that is only created once (it is a "static" class,
 * in the meaning that it never changes through the execution process of Kermeta
 * graphical editor). It hosts - the KermetaUnit of the standard framework -
 * some visitors that are applied on the model edited by the user to make it
 * valid. Mainly, the TypeContainementFixer visitor. Setting a "type" to an
 * operation is not naturally done through the ecore reflexive editor: we have
 * to define a child (Operation inherits TypeContainer, which is composed of a
 * set of children which type is Type)
 * 
 * IMPORTANT NOTE : Using types of framework.km is sometimes unsafe(?). Indeed,
 * since we load here the kermeta unit of the kermeta framework, we load in
 * memory all the related type definitions. But when we use an element of the
 * kermeta framework in the model that we are constructing, there seem to be
 * another framework present in memory. So all the tests that compare types of
 * the framework need to be done using the names of the types. (what a
 * pity...but I don't know yet how to get rid of that)
 * 
 * @generated NOT
 */
public class KermetaUtils {

	/** Logger to get the error of this launcher */
	// final static public Logger internalLog =
	// LogConfigurationHelper.getLogger("KMT.GraphicalEditor");
	/** Standard unit */
	protected KermetaUnit standardUnit;

	/**
	 * Type containment fixer : Since many Typed elements (Operation, Property)
	 * inherits TypeContainer, when setting a type to an operation, we have to
	 * set the contained type for those elements as well.
	 */
	protected TypeContainementFixer typeFixer;

	/** Use to display some elements on the graphical editor */
	protected KM2KMTPrettyPrinter prettyPrinter;

	protected static KermetaUtils kermetaUtils;

	/** Private constructor to prevent user to use it */
	private KermetaUtils() {
		super();
		standardUnit = loadStdLib();
		System.out.println("Debug - Standard Lib: " + standardUnit.toString());

		typeFixer = new TypeContainementFixer();
		prettyPrinter = new KM2KMTPrettyPrinter();
	}

	public static KermetaUtils getDefault() {
		if (kermetaUtils == null) {
			kermetaUtils = new KermetaUtils();
		}
		return kermetaUtils;
	}

	/**
	 * A method that loads the Kermeta standard library. This should be called
	 * only once, when the editor is launched. Standard Lib is not intended to
	 * dynamically change, so we did not consider this eventuality.
	 */
	public KermetaUnit loadStdLib() { // KermetaUnit.STD_LIB_URI =
		// "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
		return StdLibKermetaUnitHelper.getKermetaUnit();
	}

	/**
	 * @return Returns the typeFixer.
	 */
	public TypeContainementFixer getTypeFixer() {
		return typeFixer;
	}

	/**
	 * @return Returns the unit.
	 */
	public KermetaUnit getStandardUnit() {
		return standardUnit;
	}

	/**
	 * @return Returns the prettyPrinter.
	 */
	public KM2KMTPrettyPrinter getPrettyPrinter() {
		return prettyPrinter;
	}

	/**
	 * Get all the type definitions that belong to the same package as the one
	 * to which the given type believes.
	 */
	public List<TypeDefinition> getOwnedTypeDefinitions(TypeDefinition typedef) {
		List<TypeDefinition> result = new ArrayList<TypeDefinition>();
		// By definition, a TypeDefinition container is always of type Package
		Package pkg = getRootPackage((Package) typedef.eContainer());
		for (Iterator it = pkg.getNestedPackage().iterator(); it.hasNext();)
			result.addAll(((Package) it.next()).getOwnedTypeDefinition());
		result.addAll(pkg.getOwnedTypeDefinition());
		// Now add the Kermeta standard library classifiers
		result.addAll(getStdLibTypeDefinitions());
		return result;
	}

	/**
	 * Get all the type definitions that belong to the same package as the one
	 * to which the given type believes.
	 */
	public List<Type> getAllSuperTypes(ClassDefinition classdef) {
		List<Type> result = new ArrayList<Type>();
		if (classdef.getSuperType() != null
				|| !classdef.getSuperType().isEmpty()) {
			Iterator it = classdef.getSuperType().iterator();
			while (it.hasNext()) {
				Type next = (Type) it.next();
				if (next instanceof Class) {
					// Strong cast..
					ClassDefinition nexttypedef = (ClassDefinition) ((Class) next)
							.getTypeDefinition();
					result.add(next);
					result.addAll(getAllSuperTypes(nexttypedef));
				}
			}
		}
		return result;
	}

	/**
	 * Get all the types corresponding to the type definitions that belong to
	 * the same package and subpackages as the one to which the given type
	 * definition believes.
	 * 
	 * @param typedef
	 *            the typedef from the package which we search the available
	 *            types.
	 */
	public List<Type> getOwnedTypesForTypeDefinitions(TypeDefinition typedef) {
		List<Type> result = new ArrayList<Type>();
		// By definition, a TypeDefinition container is always of type Package
		Package pkg = getRootPackage((Package) typedef.eContainer());
		for (Iterator<Package> it = pkg.getNestedPackage().iterator(); it
				.hasNext();) {
			for (Iterator<TypeDefinition> sit = it.next()
					.getOwnedTypeDefinition().iterator(); sit.hasNext();) {
				Type t = createTypeForTypeDefinition(sit.next());
				if (t != null)
					result.add(t);
			}
		}
		for (Iterator<TypeDefinition> it = pkg.getOwnedTypeDefinition()
				.iterator(); it.hasNext();) {
			Type t = createTypeForTypeDefinition(it.next());
			if (t != null)
				result.add(t);
		}
		// Now add the Kermeta standard library classifiers
		result.addAll(getStdLibTypes());
		return result;
	}

	/**
	 * Get the type variables of the given type definition, that are also
	 * available types in the context of this type definition. (typevariable can
	 * be used as return types or param types!)
	 * 
	 * @param typedef
	 * @return the list of typeVariables
	 */
	public List<Type> getOwnedTypesVariables(TypeDefinition typedef) {
		List<Type> result = new ArrayList<Type>();
		if (typedef instanceof ClassDefinition)
			result.addAll(((ClassDefinition) typedef).getTypeParameter());
		return result;
	}

	/**
	 * Get all the type definitions that belong to the same package as the one
	 * to which the given type believes. This method is similar to
	 * getOwnedTypeDefinitions, but we "re-write" it in order to avoid useless
	 * loops. Would be great if lambda expressions existed... The available
	 * types include : - Types that have TypeDefinitions (lowermost-inheriteds
	 * classes : ClassDefinition, Enumeration, PrimitiveType) - TypeVariable s -
	 * FunctionType s - ProductType s
	 * 
	 * @param typedef
	 *            the typedefinition from which we access the available context,
	 *            i.e the list of useable types. TODO : when Additionnal
	 *            resources will be available, we won't use this typedef param
	 *            anymore, but
	 */
	public List<Type> getOwnedTypes(TypeDefinition typedef) {
		List<Type> result = getOwnedTypesForTypeDefinitions(typedef);
		result.addAll(getOwnedTypesVariables(typedef));
		return result;
	}

	/***************************************************************************
	 * Get the standard lib type definitions. We need framework.ecore/
	 * 
	 * @return
	 */
	public List<TypeDefinition> getStdLibTypeDefinitions() {
		// return new ArrayList<TypeDefinition>();
		return standardUnit.getAllTypeDefinitions();
	}

	/***************************************************************************
	 * Get the standard lib types corresponding to the standard lib type
	 * definitions.
	 * 
	 * @return the Type version of TypeDefinitions :-p
	 */
	public List<Type> getStdLibTypes() {
		List<Type> result = new ArrayList<Type>();
		for (Iterator<TypeDefinition> it = getStdLibTypeDefinitions()
				.iterator(); it.hasNext();) {
			Type t = createTypeForTypeDefinition(it.next());
			if (t != null)
				result.add(t);
		}
		return result;
	}

	/** Returns a "printable name" for the given type */
	public String getLabelForType(Type type) {
		String type_name = "";
		if (type instanceof Class)
			type_name = ((Class) type).getTypeDefinition().getName();
		// type_name =
		// KMTHelper.getQualifiedName(((Class)type).getTypeDefinition());
		else if (type instanceof ProductType) // TODO : map!
			type_name = type.toString();
		else if (type instanceof DataType)
			type_name = ((DataType) type).getName();
		else if (type instanceof VoidType)
			type_name = "Void";
		else {
			type_name = type == null ? "<Null>" : type.toString();
			// throw new Error("FTYPE : Not implemented error :
			// createTypeForTypeDefinition -- Enumeration type is not handled
			// yet. (" + type + ")");
		}
		// FIXME : getName return sometimes null, which is unconsistent
		return (type_name != null) ? type_name : "<Unset>";
	}

	public String getLabelForTypeVariable(TypeVariable var) {
		String supertype = var.getSupertype() != null ? (":" + getLabelForType(var
				.getSupertype()))
				: "";
		return var.getName() + supertype;
	}

	public Type createTypeForTypeDefinition(TypeDefinition typedef) {
		Type type = null;
		if (typedef instanceof ClassDefinition) {
			type = StructureFactory.eINSTANCE.createClass();
			((Class) type).setTypeDefinition((ClassDefinition) typedef);
		}
		return type;
	}

	/**
	 * RootPackage stands for the uppermost containing package of the given
	 * package.
	 */
	private static Package getRootPackage(Package fpackage) {
		if (fpackage.getNestingPackage() != null) {
			return getRootPackage(fpackage.getNestingPackage());
		} else
			return fpackage;
	}

	public Operation getOperationByName(String name, Class aClass) {
		List<Operation> ops = ((ClassDefinition) aClass.getTypeDefinition())
				.getOwnedOperation();
		for (Operation op : ops) {
			if (op.getName().equals(name))
				return op;
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
	public boolean isStandardType(Type type) {

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
	 * 
	 * @generated NOT
	 */
	public boolean isPrimitiveType(Type type) {

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
	public TypeDefinition getTypeDefinitionFromResourceSet(Resource resource, String qualifiedName) {
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
