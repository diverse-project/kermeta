/* $Id: KermetaUtils.java,v 1.10 2008-02-14 16:24:13 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : KermetaUtils.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey, cfaucher
 * Contributors : David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware
 * Technologies), Jacques Lescot (Anyware Technologies) - initial API and
 * implementation
 * This is an adapted copy of KermetaTools in Topcased ecore editor
 * ----------------------------------------------------------------------------
 */
package fr.irisa.triskell.kermeta.graphicaleditor.cd.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.loader.kmt.fixer.TypeContainementFixer;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

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
 */
public class KermetaUtils {
	
	/** Logger to get the error of this launcher */
    //final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.GraphicalEditor"); 

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
	public KermetaUnit loadStdLib() {
		try {
			return IOPlugin.getDefault().getEditionKermetaUnitStore().get(IOPlugin.getFrameWorkURI());
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
		for (Package it : pkg.getNestedPackage())
			result.addAll(it.getOwnedTypeDefinition());
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
			Iterator<Type> it = classdef.getSuperType().iterator();
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
	public Set<TypeDefinition> getStdLibTypeDefinitions() {
		return KermetaUnitHelper.getTypeDefinitions( standardUnit );
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
	
}
