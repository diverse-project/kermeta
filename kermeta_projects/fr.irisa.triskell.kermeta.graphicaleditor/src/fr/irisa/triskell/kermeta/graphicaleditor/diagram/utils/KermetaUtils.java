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
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
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
 * @generated NOT 
 */
public class KermetaUtils {

	/** Standard unit */
	protected KermetaUnit unit;
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
		unit = loadStdLib();
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
		return unit.getAllTypeDefinitions();
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
        else 
        {
        	type_name = type.toString();
        	//throw new Error("FTYPE : Not implemented error : createFTypeForFTypeDefinition -- Enumeration type is not handled yet. (" + type + ")");
        }
        return type_name;
	}
	
	public String getLabelForFTypeVariable(FTypeVariable var)
	{
		return var.getFName() + var.getFSupertype()!=null?getLabelForFType(var.getFSupertype()):""; 
	}
	
	public FType createFTypeForFTypeDefinition(FTypeDefinition typedef)
	{
		FType type = null;
        if (typedef instanceof FClassDefinition)
        {
        	System.err.println("-> " + typedef);
        	//type = StructureFactory.eINSTANCE.createFClass();
        	type = unit.struct_factory.createFClass();
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
	public KermetaUnit getUnit() {
		return unit;
	}

	/**
	 * @return Returns the prettyPrinter.
	 */
	public KM2KMTPrettyPrinter getPrettyPrinter() {
		return prettyPrinter;
	}

	
	


}

