/* $Id: Ecore2KMPass2.java,v 1.14 2007-05-25 15:11:08 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : Ecore2KMPass2.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Jun 19, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.loader.ecore;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;

/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass2 extends EcoreVisitor {

	protected Ecore2KMPass1 visitorPass1;
	protected Ecore2KM exporter;
	protected EcoreUnit unit;
	protected Resource resource;
		
	/** 
	 * @param unit
	 * @param resource
	 * @param visitor
	 */
	public Ecore2KMPass2(Ecore2KMPass1 visitor, Ecore2KM exporter)
	{
		this.visitorPass1 = visitor;
		this.unit = visitorPass1.unit;
		this.resource = exporter.resource;
		this.exporter = exporter;
	}
		
	public void convertUnit()
	{
		// Visit all the EDatatypes: the instanceType property of a datatype/primitivetype
		// refer to a typedefinition that, so, must have been previously listed.
		for (EDataType node : visitorPass1.datatypes.keySet()) { accept(node); }
		// Visit all the EClasses (their substructure, i.e operations and properties)
		for (EObject node : visitorPass1.eclassifier_typedefinition_map.keySet()) { // do not visit again datatypes?
			if (node instanceof EClass) accept(node); 
		}
	}
	
	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EDataType)
	 */
	public Object visit(EDataType node) {
		
		PrimitiveType result = (PrimitiveType)visitorPass1.datatypes.get(node); 
		// Get the instance class name of node
		String type_name = ((EDataType)node).getInstanceClassName();
		
		if (node.getEAnnotation(KM2Ecore.ANNOTATION)!=null) {// IMPORTANT!
			type_name = (String)node.getEAnnotation(KM2Ecore.ANNOTATION).getDetails()
						.get(KM2Ecore.ANNOTATION_ALIAS_DETAILS);
		}//			 primitive_types_mapping : { javatype : kermetatype }
		else if (Ecore2KM.primitive_types_mapping.containsKey(type_name)) {
				type_name = (String)Ecore2KM.primitive_types_mapping.get(type_name);
			} // Find in alias // EDataType visit : handle alias
		// Try to find in the current unit if the given type_name can be found
		TypeDefinition type = null;
		if (type_name == null || type_name.equals(""))
		{
			unit.messages.addWarning("Instance class seems to be unset for EDatatype '" + 
					EcoreHelper.getQualifiedName((EDataType)node) + "' : replaced by Object", null);
			type = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();// get kermeta::language::structure::Object 
		}
		else
		{
			type = unit.typeDefinitionLookup(type_name);
			// FIXME : standard library is not browsable anymore?
			if (type == null) type = StdLibKermetaUnitHelper.getKermetaUnit().typeDefinitionLookup(type_name);
			// FIXME : If type is still null, replacing by the basic Object type of Kermeta. 
			// Not the best way to process. Idea: annotate Kermeta alias with an extern "instanceClassName"?
			if (type == null) {
				unit.messages.addWarning("cannot find instance class " + type_name + " for primitive type " + 
						EcoreHelper.getQualifiedName((EDataType)node) + " (replaced by Object)", null);
				type = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();// get kermeta::language::structure::Object 
			}
		}
		result.setInstanceType(createInstanceTypeForTypeDefinition(type));
		return result;
	}
	
	/**
	 * Construct the Class corresponding to given EClass:
	 *  - its super types
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node)
	{
		exporter.current_classdef = (ClassDefinition)visitorPass1.eclassifier_typedefinition_map.get(node);
		visitorPass1.isClassTypeOwner = true;

		// Visit the TypeParameter annotations
		// (they have to be set for type variable bindings process in Pass_3)
		EAnnotation typeVar_Annot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEPARAMETER);
		if(typeVar_Annot != null) {
			visitorPass1.visitTypeParameterAnnotation(typeVar_Annot);
		}

		// Set the super types
		for (Object next : ((EClass)node).getESuperTypes()) {
			EClassifier st = (EClassifier)next;
			Type t = visitorPass1.createTypeForEClassifier(st, node);
			if (t == null || !(t instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				throw new KM2ECoreConversionException(
						"Internal error of ecore2kermeta :" +
						" supertypes of class " + EcoreHelper.getQualifiedName((EClass)node) + " : "+ EcoreHelper.getQualifiedName(st) +" not found");
			}
			exporter.current_classdef.getSuperType().add(t);
		}

		return exporter.current_classdef;
	}
	
	/** Create a type for given type definition */
	public Type createInstanceTypeForTypeDefinition(TypeDefinition type) {
		Type iType = null;
		// Translation : if type is a DataType or an Enumeration (those
		// types implement both Type and TypeDefinition
        if (type instanceof Type) { iType = (Type)type; }
        else if (type instanceof ClassDefinition)
        { 
        	ClassDefinition cd = (ClassDefinition)type;
        	fr.irisa.triskell.kermeta.language.structure.Class fc = 
        		(fr.irisa.triskell.kermeta.language.structure.Class)visitorPass1.classes.get(cd);
        	if (fc == null) {
        		fc = unit.struct_factory.createClass();
        		fc.setTypeDefinition(cd);
        		visitorPass1.classes.put(cd, fc);
        	}
        	iType = fc;
        }
        else
        {	throw new Error("INTERNAL ERROR : type should be a ClassDefinition, not a " + type.getClass().getName());}
    	
        if (type==null) throw new KM2ECoreConversionException("Ecore2KM exception : instance type is null for '" + type.getName() + "'");
        return iType;
	}
}
