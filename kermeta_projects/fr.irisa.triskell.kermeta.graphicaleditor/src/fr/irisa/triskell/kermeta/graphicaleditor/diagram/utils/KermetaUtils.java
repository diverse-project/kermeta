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
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.TypeContainementFixer;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FDataType;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FGenericTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
/*
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.TypeContainementFixer;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
*/
/**
 * This class is a singleton, that is only created once (it is a "static"
 * class, in the meaning that it never changes through the execution process
 * of Kermeta graphical editor). It hosts
 * - the KermetaUnit of the standard framework
 * - some visitors that are applied on the model edited by the user to make
 * it valid. Mainly, the TypeContainementFixer visitor. 
 *    Setting a "type" to an operation is not naturally done through the ecore reflexive editor:
 *    we have to define a child (Operation inherits FTypeContainer, which is composed of a set
 *    of children which type is FType)
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

	/** Standard unit */
	protected KermetaUnit standardUnit;
	/** 
	 * Type containment fixer :
	 *  Since many Typed elements (FOperation, FProperty) inherits FTypeContainer,
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
		return kermetaUtils;
	}
	
	/** Get all the type definitions that belong to the same package as the one to which
	 *  the given type believes. */
	public List<FTypeDefinition> getOwnedTypeDefinitions(FTypeDefinition typedef)
	{
		List<FTypeDefinition> result = new ArrayList<FTypeDefinition>();
		// By definition, a FTypeDefinition container is always of type FPackage
		FPackage pkg = getRootPackage((FPackage)typedef.eContainer());
		for (Iterator it = pkg.getFNestedPackage().iterator(); it.hasNext(); )
			result.addAll(((FPackage)it.next()).getFOwnedTypeDefinition());
		result.addAll(pkg.getFOwnedTypeDefinition());
		// Now add the Kermeta standard library classifiers
		result.addAll(getStdLibTypeDefinitions());
		return result;
	}
	
	/** 
	 * Get all the types corresponding to the type definitions that belong to the same package
	 * and subpackages as the one to which the given type definition believes.
	 * @param typedef the typedef from the package which we search the available types.
	 */
	public List<FType> getOwnedTypesForTypeDefinitions(FTypeDefinition typedef)
	{
		List<FType> result = new ArrayList<FType>();
		// By definition, a FTypeDefinition container is always of type FPackage
		FPackage pkg = getRootPackage((FPackage)typedef.eContainer());
		for (Iterator<FPackage> it = pkg.getFNestedPackage().iterator(); it.hasNext(); )
		{
			for (Iterator<FTypeDefinition> sit = it.next().getFOwnedTypeDefinition().iterator(); sit.hasNext(); )
				result.add(createFTypeForFTypeDefinition(sit.next()));
		}
		for (Iterator<FTypeDefinition> it = pkg.getFOwnedTypeDefinition().iterator(); it.hasNext();)
			result.add(createFTypeForFTypeDefinition(it.next()));
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
	public List<FType> getOwnedTypesVariables(FTypeDefinition typedef)
	{
		List<FType> result = new ArrayList<FType>();
		if (typedef instanceof FClassDefinition)
			result.addAll(((FClassDefinition)typedef).getFTypeParameter());
		return result;
	}
	
	/** Get all the type definitions that belong to the same package as the one to which
	 *  the given type believes. 
	 *  This method is similar to getOwnedTypeDefinitions, but we "re-write" it in order
	 *  to avoid useless loops.
	 *  Would be great if lambda expressions existed...
	 *  The available types include :
	 *   - Types that have TypeDefinitions (lowermost-inheriteds classes : FClassDefinition, FEnumeration, FPrimitiveType)
	 *   - FTypeVariable s
	 *   - FFunctionType s
	 *   - FProductType s
	 *   @param typedef the typedefinition from which we access the available context, i.e the list of
	 *   useable types.
	 *   TODO : when Additionnal resources will be available, we won't use this typedef param anymore,
	 *   but 
	 *  */
	public List<FType> getOwnedTypes(FTypeDefinition typedef)
	{
		List<FType> result = getOwnedTypesForTypeDefinitions(typedef);
		result.addAll(getOwnedTypesVariables(typedef));
		return result;
	}
	
	/** *
	 * Get the standard lib type definitions. 
	 * We need framework.ecore/
	 * @return
	 */
	public List<FTypeDefinition> getStdLibTypeDefinitions()
	{
		return standardUnit.getAllTypeDefinitions();
	}
	
	/** *
	 * Get the standard lib types corresponding to the standard lib type definitions.
	 * @return the FType version of FTypeDefinitions :-p
	 */
	public List<FType> getStdLibTypes()
	{
		List<FType> result = new ArrayList<FType>();
		for (Iterator<FTypeDefinition> it = getStdLibTypeDefinitions().iterator(); it.hasNext();)
			result.add(createFTypeForFTypeDefinition(it.next()));
		return result;
	}


	/** Returns a "printable name" for the given type */ 
	public String getLabelForFType(FType type)
	{
		String type_name = "";
		if (type instanceof FClass)
			type_name = ((FClass)type).getFTypeDefinition().getFName();
        	//type_name = KMTHelper.getQualifiedName(((FClass)type).getFTypeDefinition());
		else if (type instanceof FProductType) // TODO : map!
			type_name = type.toString();
		else if (type instanceof FDataType)
			type_name = ((FDataType)type).getFName();
		else if (type instanceof FVoidType)
			type_name = "Void";
        else
        {
        	type_name = type==null?"<Null>":type.toString();
        	//throw new Error("FTYPE : Not implemented error : createFTypeForFTypeDefinition -- Enumeration type is not handled yet. (" + type + ")");
        }
        return type_name;
	}
	
	public String getLabelForFTypeVariable(FTypeVariable var)
	{ 
		String supertype = var.getFSupertype()!=null?(":"+getLabelForFType(var.getFSupertype())):"";
		return var.getFName() + supertype; 
	}
	
	public FType createFTypeForFTypeDefinition(FTypeDefinition typedef)
	{
		FType type = null;
        if (typedef instanceof FClassDefinition)
        {
        	//type = StructureFactory.eINSTANCE.createFClass();
        	type = standardUnit.struct_factory.createFClass();
        	((FClass)type).setFTypeDefinition((FClassDefinition)typedef);
        	//type = ((FClassDefinition)_returnType).()
        }
        else if (typedef instanceof FPrimitiveType)
        {
        	type = StructureFactory.eINSTANCE.createFPrimitiveType();
        	((FPrimitiveType)type).setFInstanceType(null); // TODO
        	
        }
        else if (typedef instanceof FEnumeration)
        {
        	throw new Error("Not implemented error : createFTypeForFTypeDefinition -- Enumeration type is not handled yet. (" + typedef + ")");
        }
        return type;
	}
	
	/**
	 * RootPackage stands for the uppermost containing package of the given package. 
	 */
	private static FPackage getRootPackage(FPackage fpackage) {
		if (fpackage.getFNestingPackage()!=null) {
			return getRootPackage(fpackage.getFNestingPackage());
		}
		else return fpackage;
	}
	
	
	/**
	 * A method that loads the Kermeta standard library. This should be called only once, 
	 * when the editor is launched. Standard Lib is not intended to
	 * dynamically change, so we did not consider this eventuality.
	 *  */
	public KermetaUnit loadStdLib()
	{
	    
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
	public boolean isBaseType(FType type)
	{
		boolean isbasetype = false;
		if (type instanceof FClass)
		{
			FClass fclass = (FClass)type; 
			
			String classdef = fclass.getFTypeDefinition().getFName();
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
	public boolean isPrimitiveType(FType type)
	{
		return type instanceof FPrimitiveType;
	}
	
	/**
	 * Return true if the given type is linked to a type definition in the 
	 * standard framework (framework.km), false otherwise.
	 * This method also calls isPrimitiveType method.
	 * @param type
	 * @return
	 */
	public boolean isStandardType(FType type)
	{
		boolean isstandardtype = false;
		FTypeDefinition typedef = null;
		String typedef_qname = "";
		
		if (type instanceof FClass)
		{
			typedef = ((FClass)type).getFTypeDefinition();
			typedef_qname = KMTHelper.getQualifiedName(typedef);
		}
		else if (type instanceof FTypeDefinition) // case of FPrimitiveTypes!
		{
			typedef = (FTypeDefinition) type;
			typedef_qname = KMTHelper.getQualifiedName(typedef);
		}
		// FIXME : this does not seem to work!! seems to be 2 frameworks loaded in memory, but
		// where???
		if (getStdLibTypeDefinitions().contains(typedef)) System.err.println("Kikou");
		// Typedef is null when type is note FClass or not FTypeDefinition....
		if (typedef_qname!=null)
		{
			isstandardtype = standardUnit.getTypeDefinitionByName(typedef_qname)!=null;
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


}

