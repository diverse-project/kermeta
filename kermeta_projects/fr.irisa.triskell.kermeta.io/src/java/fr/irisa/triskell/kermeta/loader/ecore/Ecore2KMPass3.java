/* $Id: Ecore2KMPass3.java,v 1.25 2007-07-20 15:08:11 ftanguy Exp $
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.Class;

/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass3 extends Ecore2KMPass {

	protected Resource resource;
		
	
	/** 
	 * @param unit
	 * @param resource
	 * @param visitor
	 */
	public Ecore2KMPass3(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled) {
		super(kermetaUnit, datas, isQuickFixEnabled);
	}
		
	/*public void convertUnit()
	{
		// Visit all the EDatatypes: the instanceType property of a datatype/primitivetype
		// refer to a typedefinition that, so, must have been previously listed.
		for (EDataType node : visitorPass1.datatypes.keySet()) { accept(node); }
		// Visit all the EClasses (their substructure, i.e operations and properties)
		for (EObject node : visitorPass1.eclassifier_typedefinition_map.keySet()) { // do not visit again datatypes?
			if (node instanceof EClass) accept(node); 
		}
	}*/
	
	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EDataType)
	 */
	public Object visit(EDataType node) {
		if ( node.getName().equals(KM2Ecore.KERMETA_TYPES) )
			return null;
		
		PrimitiveType result = datas.getPrimitiveType(node); 
		// Get the instance class name of node
		String type_name = ((EDataType)node).getInstanceClassName();
		
		if (node.getEAnnotation(KM2Ecore.ANNOTATION)!=null) {// IMPORTANT!
			type_name = (String)node.getEAnnotation(KM2Ecore.ANNOTATION).getDetails()
						.get(KM2Ecore.ANNOTATION_ALIAS_DETAILS);
		}//			 primitive_types_mapping : { javatype : kermetatype }
		else if (datas.isAType(type_name)) {
				type_name = datas.getTypeName(type_name);
			} // Find in alias // EDataType visit : handle alias
		// Try to find in the current unit if the given type_name can be found
		TypeDefinition type = null;
		if (type_name == null || type_name.equals(""))
		{
			kermetaUnit.warning("Instance class seems to be unset for EDatatype '" + 
					EcoreHelper.getQualifiedName((EDataType)node) + "' : replaced by Object", null);
			type = kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::Object");
				
//				StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();// get kermeta::language::structure::Object 
		}
		else
		{
			type = kermetaUnit.getTypeDefinitionByName(type_name);
			// FIXME : standard library is not browsable anymore?
			//if (type == null) type = StdLibKermetaUnitHelper.getKermetaUnit().typeDefinitionLookup(type_name);
			// FIXME : If type is still null, replacing by the basic Object type of Kermeta. 
			// Not the best way to process. Idea: annotate Kermeta alias with an extern "instanceClassName"?
			if (type == null) {
				kermetaUnit.warning("cannot find instance class " + type_name + " for primitive type " + 
						EcoreHelper.getQualifiedName((EDataType)node) + " (replaced by Object)", null);
				//type = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();// get kermeta::language::structure::Object 
			}
		}
		
		if ( type == null ) {
			kermetaUnit.warning("The type " + type_name + "is not handled by Kermeta. It has been mapped to Object");
			type = kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object");
			Type t = createInstanceTypeForTypeDefinition(type);
			result.setInstanceType(t);			
		} else {
			Type t = createInstanceTypeForTypeDefinition(type);
			result.setInstanceType(t);
		}
		return result;
	}
	
	/**
	 * Construct the Class corresponding to given EClass:
	 *  - its super types
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node)
	{
		currentClassDefinition = (ClassDefinition)datas.getTypeDefinition(node);
		//public boolean isClassTypeOwner = true;

		// Deprecated since EMF2.3, now Type Parameters are set during the PASS3
		// Visit the TypeParameter annotations
		// (they have to be set for type variable bindings process in Pass_3)
		/*EAnnotation typeVar_Annot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEPARAMETER);
		if(typeVar_Annot != null) {
			visitorPass1.visitTypeParameterAnnotation(typeVar_Annot);
		}*/

		// Set the super types
		// Deprecated: only one of the 2 way is required with EMF2.3, we have choosen the second one, because in Ecore "EGenericSuperTypes" is a composite reference
		// Way 1: super types are stored thanks to the "eSuperTypes" reference
		/*for (Object next : ((EClass)node).getESuperTypes()) {
			EClassifier st = (EClassifier)next;
			Type t = visitorPass1.createTypeForEClassifier(st, node);
			if (t == null || !(t instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				throw new KM2ECoreConversionException(
						"Internal error of ecore2kermeta :" +
						" supertypes of class " + EcoreHelper.getQualifiedName((EClass)node) + " : "+ EcoreHelper.getQualifiedName(st) +" not found");
			}
			exporter.current_classdef.getSuperType().add(t);
		}*/
		
		// Way 2: super types are stored thanks to the "eGenericSuperTypes" reference
		for (Object next : ((EClass)node).getEGenericSuperTypes()) {
			EGenericType gt = (EGenericType)next;
			EClassifier st = gt.getEClassifier();
			Type t = createTypeForEClassifier(st, node);
			if (t == null || !(t instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				throw new KM2ECoreConversionException(
						"Internal error of ecore2kermeta :" +
						" supertypes of class " + EcoreHelper.getQualifiedName((EClass)node) + " : "+ EcoreHelper.getQualifiedName(st) +" not found");
			}
			currentClassDefinition.getSuperType().add(t);
		}

		return currentClassDefinition;
	}
	
	
	/**
	 * Visit a TypeParameter ('kermeta.typeParameter') EAnnotation.
	 * Such EAnnotation is supposed to be attached to either an EClass or an EOperation.
	 * @param node
	 * @return
	 */
	public Object visitTypeParameterAnnotation(EAnnotation node) {
		List<TypeVariable> params = new ArrayList<TypeVariable>();
		
		for (Object next :  node.getDetails().keySet()) {
			String name = (String)next;
			TypeVariable tv = StructureFactory.eINSTANCE.createObjectTypeVariable(); 
			tv.setName(name);
			// detail can be " A : Anothertype" -> means that A must inherit Anothertype
			String detail = (String)node.getDetails().get(name); 
			if (detail.indexOf(":")>0) {
				detail = detail.replaceAll(" ", ""); // strip spaces
				String str_cdef = detail.substring(detail.indexOf(":")+1);
				ClassDefinition cdef = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(str_cdef);
				fr.irisa.triskell.kermeta.language.structure.Class type = 
					StructureFactory.eINSTANCE.createClass();
		        type.setTypeDefinition((ClassDefinition)cdef);
				tv.setSupertype(type);
			}
			params.add(tv);
		} 

		// for current_class - add the parameter to the class
		if(node.getEModelElement() instanceof EClass) {
			currentClassDefinition.getTypeParameter().addAll(params);
		}
		// for current_op
		else {
			currentOperation.getTypeParameter().addAll(params);
		}
		return null;
	}

}
