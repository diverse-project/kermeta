/* $Id$
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
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.TypeContainementFixer;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
/**
 * This class is a singleton, that is only created once (it is a "static"
 * class, in the meaning that it never changes through the execution process
 * of Kermeta graphical editor). It hosts
 * - the KermetaUnit of the standard framework
 * - some visitors that are applied on the model edited by the user to make
 * it valid. Mainly, the TypeContainementFixer visitor. 
 *    Setting a "type" to an operation is not naturally done through the ecore reflexive editor:
 *    we have to define a child (Operation inherits TypeContainer, which is composed of a set
 *    of children which type is Type)
 *    
 * IMPORTANT NOTE : 
 * Using types of framework.km is sometimes unsafe(?). Indeed, since we load here
 * the kermeta unit of the kermeta framework, we load in memory all the related type definitions.
 * But when we use an element of the kermeta framework in the model that we are constructing, there
 * seem to be another framework present in memory. So all the tests that compare types
 * of the framework need to be done using the names of the types. (what a pity...but I don't 
 * know yet how to get rid of that)
 * @generated NOT 
 */
public class KermetaUtils {

	/** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.GraphicalEditor"); 
    
	/** Standard unit */
	protected KermetaUnit standardUnit;
	/** 
	 * Type containment fixer :
	 *  Since many Typed elements (Operation, Property) inherits TypeContainer,
	 *  when setting a type to an operation, we have to set the contained type for
	 *  those elements as well.
	 */
	protected TypeContainementFixer typeFixer;
	/** Use to display some elements on the graphical editor */
	protected KM2KMTPrettyPrinter prettyPrinter;
	
	protected static KermetaUtils kermetaUtils;
	
	/** Private constructor to prevent user to use it */
	private KermetaUtils()
	{
		super();
		standardUnit = loadStdLib();
		typeFixer = new TypeContainementFixer();
		prettyPrinter = new KM2KMTPrettyPrinter();
	}
	
	public static KermetaUtils getDefault()
	{
		if (kermetaUtils == null)
		{
			kermetaUtils = new KermetaUtils();
			
		}
		kermetaUtils.prettyPrinter = new KM2KMTPrettyPrinter();
		return kermetaUtils;
	}
	
	/** Get all the type definitions that belong to the same package as the one to which
	 *  the given type believes. */
	public List<TypeDefinition> getOwnedTypeDefinitions(TypeDefinition typedef)
	{
		List<TypeDefinition> result = new ArrayList<TypeDefinition>();
		// By definition, a TypeDefinition container is always of type Package
		Package pkg = getRootPackage((Package)typedef.eContainer());
		for (Iterator it = pkg.getNestedPackage().iterator(); it.hasNext(); )
			result.addAll(((Package)it.next()).getOwnedTypeDefinition());
		result.addAll(pkg.getOwnedTypeDefinition());
		// Now add the Kermeta standard library classifiers
		result.addAll(getStdLibTypeDefinitions());
		return result;
	}
	
	/** Get all the type definitions that belong to the same package as the one to which
	 *  the given type believes. */
	public List<Type> getAllSuperTypes(ClassDefinition classdef)
	{
		List<Type> result = new ArrayList<Type>();
		if (classdef.getSuperType()!=null || !classdef.getSuperType().isEmpty())
		{	
			Iterator it = classdef.getSuperType().iterator();
			while (it.hasNext())
			{
				Type next = (Type)it.next();
				if (next instanceof fr.irisa.triskell.kermeta.language.structure.Class)
				{
					// Strong cast..
					ClassDefinition nexttypedef = (ClassDefinition)((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition();
					result.add(next);
					result.addAll(getAllSuperTypes(nexttypedef));
				}
			}
		}
		return result;
	}
	
	/** 
	 * Get all the types corresponding to the type definitions that belong to the same package
	 * and subpackages as the one to which the given type definition believes.
	 * @param typedef the typedef from the package which we search the available types.
	 */
	public List<Type> getOwnedTypesForTypeDefinitions(TypeDefinition typedef)
	{
		List<Type> result = new ArrayList<Type>();
		// By definition, a TypeDefinition container is always of type Package
		Package pkg = getRootPackage((Package)typedef.eContainer());
		for (Iterator<Package> it = pkg.getNestedPackage().iterator(); it.hasNext(); )
		{
			for (Iterator<TypeDefinition> sit = it.next().getOwnedTypeDefinition().iterator(); sit.hasNext(); )
			{
				Type t = createTypeForTypeDefinition(sit.next());
				if (t!=null) result.add(t);
			}
		}
		for (Iterator<TypeDefinition> it = pkg.getOwnedTypeDefinition().iterator(); it.hasNext();)
		{
			Type t = createTypeForTypeDefinition(it.next());
			if (t!=null) result.add(t);
		}
		// Now add the Kermeta standard library classifiers
		result.addAll(getStdLibTypes());
		return result;
	}
	
	/** 
	 * Get the type variables of the given type definition, that are also available
	 * types in the context of this type definition. (typevariable can be used as return types
	 * or param types!)
	 * @param typedef
	 * @return the list of typeVariables
	 */
	public List<Type> getOwnedTypesVariables(TypeDefinition typedef)
	{
		List<Type> result = new ArrayList<Type>();
		if (typedef instanceof ClassDefinition)
			result.addAll(((ClassDefinition)typedef).getTypeParameter());
		return result;
	}
	
	/** Get all the type definitions that belong to the same package as the one to which
	 *  the given type believes. 
	 *  This method is similar to getOwnedTypeDefinitions, but we "re-write" it in order
	 *  to avoid useless loops.
	 *  Would be great if lambda expressions existed...
	 *  The available types include :
	 *   - Types that have TypeDefinitions (lowermost-inheriteds classes : ClassDefinition, Enumeration, PrimitiveType)
	 *   - TypeVariable s
	 *   - FunctionType s
	 *   - ProductType s
	 *   @param typedef the typedefinition from which we access the available context, i.e the list of
	 *   useable types.
	 *   TODO : when Additionnal resources will be available, we won't use this typedef param anymore,
	 *   but 
	 *  */
	public List<Type> getOwnedTypes(TypeDefinition typedef)
	{
		List<Type> result = getOwnedTypesForTypeDefinitions(typedef);
		result.addAll(getOwnedTypesVariables(typedef));
		return result;
	}
	
	/** *
	 * Get the standard lib type definitions. 
	 * We need framework.ecore/
	 * @return
	 */
	public List<TypeDefinition> getStdLibTypeDefinitions()
	{
		//return new ArrayList<TypeDefinition>();
		return standardUnit.getAllTypeDefinitions();
	}
	
	/** *
	 * Get the standard lib types corresponding to the standard lib type definitions.
	 * @return the Type version of TypeDefinitions :-p
	 */
	public List<Type> getStdLibTypes()
	{
		List<Type> result = new ArrayList<Type>();
		for (Iterator<TypeDefinition> it = getStdLibTypeDefinitions().iterator(); it.hasNext();)
		{
			Type t = createTypeForTypeDefinition(it.next());
			if (t != null) result.add(t);
		}
		return result;
	}


	/** Returns a "printable name" for the given type */ 
	public String getLabelForType(Type type)
	{
		String type_name = "";
		if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class)
			type_name = ((fr.irisa.triskell.kermeta.language.structure.Class)type).getTypeDefinition().getName();
        	//type_name = KMTHelper.getQualifiedName(((fr.irisa.triskell.kermeta.language.structure.Class)type).getTypeDefinition());
		else if (type instanceof ProductType) // TODO : map!
			type_name = type.toString();
		else if (type instanceof DataType)
			type_name = ((DataType)type).getName();
		else if (type instanceof VoidType)
			type_name = "Void";
        else
        {
        	type_name = type==null?"<Null>":type.toString();
        	//throw new Error("FTYPE : Not implemented error : createTypeForTypeDefinition -- Enumeration type is not handled yet. (" + type + ")");
        }
		// FIXME : getName return sometimes null, which is unconsistent
		return (type_name!=null)?type_name:"<Unset>";
	}
	
	public String getLabelForTypeVariable(TypeVariable var)
	{ 
		String supertype = var.getSupertype()!=null?(":"+getLabelForType(var.getSupertype())):"";
		return var.getName() + supertype; 
	}
	
	public Type createTypeForTypeDefinition(TypeDefinition typedef)
	{
		Type type = null;
        if (typedef instanceof ClassDefinition)
        {
        	//type = StructureFactory.eINSTANCE.createfr.irisa.triskell.kermeta.language.structure.Class();
        	type = StructureFactory.eINSTANCE.createClass();
        	((fr.irisa.triskell.kermeta.language.structure.Class)type).setTypeDefinition((ClassDefinition)typedef);
        	//type = ((ClassDefinition)_returnType).()
        }
/*        else if (typedef instanceof PrimitiveType) // PrimitiveType inherits DataType which inherits TypeDefinition
        {
        	type = StructureFactory.eINSTANCE.createPrimitiveType();
        	((PrimitiveType)type).setInstanceType(null); // TODO
        	
        }
        else if (typedef instanceof Enumeration) // Enumeration inherits DataType which inherits TypeDefinition
        {
        	type = StructureFactory.eINSTANCE.createEnumeration();
        	//throw new Error("Not implemented error : createTypeForTypeDefinition -- Enumeration type is not handled yet. (" + typedef + ")");
        }*/
        return type;
	}
	
	/**
	 * RootPackage stands for the uppermost containing package of the given package. 
	 */
	private static Package getRootPackage(Package fpackage) {
		if (fpackage.getNestingPackage()!=null) {
			return getRootPackage(fpackage.getNestingPackage());
		}
		else return fpackage;
	}
	
	
	/**
	 * A method that loads the Kermeta standard library. This should be called only once, 
	 * when the editor is launched. Standard Lib is not intended to
	 * dynamically change, so we did not consider this eventuality.
	 */
	public KermetaUnit loadStdLib()
	{   //KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
	    KermetaUnitFactory.getDefaultLoader().unloadAll();
	    KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(KermetaUnit.STD_LIB_URI);
	    unit.load();
	    return unit;
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
	 * Return true if the given type is a base type, false otherwise
	 * Basetypes are the one as defined in fr.irisa.triskell.kermeta.interpreter project,
	 * that are linked to real java types, that is :
	 * 
	 * - Boolean 
	 * - Character
	 * - Collection
	 * - Integer
	 * - Iterator
	 * - Map
	 * - Numeric (Real?)
	 * - String
	 */
	public boolean isBaseType(Type type)
	{
		Boolean isbasetype = false;
		if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class)
		{
			fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)type; 
			
			String classdef = fclass.getTypeDefinition().getName();
			// Having the below types in another way then manual 
			String[] basetypes = new String[]
            {"Boolean", "Character", "Integer", "Iterator", "Map", "Numeric", "String" };
			String[] colltypes = new String[]
            {"Collection", "Set", "OrderedSet", "Sequence", "OrderedSequence", "Bag"};
			if (convertArrayToList(basetypes).contains(classdef)
				|| convertArrayToList(colltypes).contains(classdef)	)
				isbasetype = true;
		}
		return isbasetype;
	}
	
	/** 
	 * Return true if given type is a primitive type (in kermeta meaning, an alias),
	 * false otherwise
	 * @param type
	 * @return
	 */
	public boolean isPrimitiveType(Type type)
	{
		return type instanceof PrimitiveType;
	}
	
	/**
	 * Return true if the given type is linked to a type definition in the 
	 * standard framework (framework.km), false otherwise.
	 * This method also calls isPrimitiveType method.
	 * @param type
	 * @return
	 */
	public boolean isStandardType(Type type)
	{
		Boolean isstandardtype = false;
		TypeDefinition typedef = null;
		String typedef_qname = "";
		
		if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class)
		{
			typedef = ((fr.irisa.triskell.kermeta.language.structure.Class)type).getTypeDefinition();
			typedef_qname = KMTHelper.getQualifiedName(typedef);
		}
		else if (!(type instanceof VoidType))
		{
			// do not throw an error but just print a message in a dialog box
			// throw new Error("Not implemented exception : a model element has an unhandled type yet : " + type);
		}
		// FIXME : this does not seem to work!! seems to be 2 frameworks loaded in memory, but
		// where???
		//if (getStdLibTypeDefinitions().contains(typedef)) System.err.println("Found a typedef :"+ typedef.getName());
		// Typedef is null when type is note fr.irisa.triskell.kermeta.language.structure.Class or not TypeDefinition....
		if (typedef_qname!=null)
		{
			isstandardtype = standardUnit.getTypeDefinitionByName(typedef_qname)!=null ||
							 type instanceof VoidType ; // FIXME dirty patch
		}
		return isstandardtype;
	}
	
	public List convertArrayToList(Object[] array)
	{
		List result = new ArrayList();
		for (int i=0; i<array.length; i++)
			result.add(array[i]);
		return result;
	}
	
	/*
	 * Special methods used to handle some mappings between the Type concept and the TypeDefinitions
	 * concept.
	 * We have to think about which place would be most relevant?
	 * 
	 */
	public void addSuperTypeToClassDefinition(ClassDefinition classdef, TypeDefinition supertypedef )
	{
		Type toadd = findSuperTypeInClassDefinition(classdef, supertypedef);
		// FIXME : this test should be done in a more appropriate place 
		if (toadd == null) // Already controlled by the check methods in the policies
		{
			classdef.getContainedType().clear();
			classdef.getSuperType().add(createTypeForTypeDefinition(supertypedef));
			typeFixer.accept(classdef);
		}
	}
	
	/**
	 * 
	 * @param supertypedef
	 * @param classdef
	 * @return a Type element if type related to supertypedef is in the supertypes of classdef, null otherwise
	 */
	public Type findSuperTypeInClassDefinition(ClassDefinition classdef, TypeDefinition supertypedef)
	{
		Type result = null; 
		String supertypedefname = standardUnit.getQualifiedName(supertypedef);
		// reinit the typeFixing
		classdef.getContainedType().clear();
		Iterator<Type> it = classdef.getSuperType().iterator();
		while (it.hasNext() && result==null)
		{
			Type type = it.next();
			// fr.irisa.triskell.kermeta.language.structure.Class is the only type linked to a ClassDefinition, and we are looking for a type corresponding
			// to a ClassDefinition!
			if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class) 
			{
				//System.err.println("source:" + classdef.getName() + supertypedefname);
				if (standardUnit.getQualifiedName(((fr.irisa.triskell.kermeta.language.structure.Class)type).getTypeDefinition()).equals(supertypedefname))
					result = type;
			}
		}
		typeFixer.accept(classdef);
		return result;
	}
	
	/**
	 * We have to manage this operation using qualified names, there is no way to retrieve
	 * types to remove..
	 * @param supertype
	 * @param typedef
	 */
	public void removeSuperTypeFromClassDefinition(ClassDefinition classdef, TypeDefinition supertypedef)
	{
		Type toremove = findSuperTypeInClassDefinition(classdef, supertypedef);
		classdef.getSuperType().remove(toremove);
	}
	
	
	
	/**
	 * Equivalent to : classdef.contains(the_type_related_to_supertypedef)
	 * Used because graphical elements between which we
	 * are testing the inheritance relation are directly linked to ClassDefinition model elements.
	 */
	public boolean isContainedSuperTypeInClassDefinition(ClassDefinition classdef, TypeDefinition supertypedef)
	{
		return findSuperTypeInClassDefinition(classdef, supertypedef)!=null;
	}
	
	/**
	 * If a property of type targetdef already exists in the given srcdef, return true,
	 * otherwise false
	 * @param srcdef
	 * @param targetdef
	 * @return
	 * TODO : not implemented yet.
	 */
	public boolean existsPropertyBetweenClassDefinitions(ClassDefinition srcdef, ClassDefinition targetdef)
	{
		return false;
	}

	public Operation getOperationByName(String name, fr.irisa.triskell.kermeta.language.structure.Class claz) {
		List<Operation> ops = ((ClassDefinition)claz.getTypeDefinition()).getOwnedOperation();
		for (Operation op : ops) {
			if (op.getName().equals(name)) return op; 
		}
		return null;
	}
}

