

/*$Id: Ecore2KMDatas.java,v 1.8 2008-06-13 13:38:44 cfaucher Exp $
* Project : org.kermeta.io
* File : 	Ecore2KMHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.ecore.ecore2km;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.ETypeParameter;

import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class Ecore2KMDatas {

	//////////////////////////////////////////
	//////////////////////////////////////////
	//		Type Definition Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////
	
	private Hashtable <EClassifier, TypeDefinition> eClassifier2typeDefinition = new Hashtable <EClassifier, TypeDefinition> ();
	private Hashtable <TypeDefinition, EClassifier> typeDefinition2eClassifier = new Hashtable <TypeDefinition, EClassifier> ();
	
	public void store(TypeDefinition typeDefinition, EClassifier eClassifier) {
		eClassifier2typeDefinition.put(eClassifier, typeDefinition);
		typeDefinition2eClassifier.put(typeDefinition, eClassifier);
	}
	
	public TypeDefinition getTypeDefinition(EClassifier eClassifier) {
		return eClassifier2typeDefinition.get(eClassifier);
	}
	
	public EClassifier getEClassifier(TypeDefinition typeDefinition) {
		return typeDefinition2eClassifier.get(typeDefinition);
	}
	
	public Set <TypeDefinition> getTypesDefinition() {
		return typeDefinition2eClassifier.keySet();
	}
	
	public Set <EClassifier> getEClassifiers() {
		return eClassifier2typeDefinition.keySet();
	}
	
	//////////////////////////////////////////////////
	//////////////////////////////////////////////////
	//		End of Class Definition Mechanism		//
	//////////////////////////////////////////////////
	//////////////////////////////////////////////////
	
	
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		Primitive Types Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////
	
	private Hashtable <EDataType, PrimitiveType> eDataType2primitiveType = new Hashtable <EDataType, PrimitiveType> ();
	private Hashtable <PrimitiveType, EDataType> primitiveType2eDataType = new Hashtable <PrimitiveType, EDataType> ();
	
	public void store(PrimitiveType primitiveType, EDataType eDataType) {
		eDataType2primitiveType.put(eDataType, primitiveType);
		primitiveType2eDataType.put(primitiveType, eDataType);
	}
	
	public PrimitiveType getPrimitiveType(EDataType eDataType) {
		return eDataType2primitiveType.get( eDataType );
	}
	
	public EDataType getEDataType(PrimitiveType primitiveType) {
		return primitiveType2eDataType.get( primitiveType );
	}
	
	public Set <EDataType> getEDataTypes() {
		return eDataType2primitiveType.keySet();
	}
	
	//////////////////////////////////////////////////
	//////////////////////////////////////////////////
	//		End of Primitive Types Mechanism		//
	//////////////////////////////////////////////////
	//////////////////////////////////////////////////
	
	
	//////////////////////////////////
	//////////////////////////////////
	//		Operation Mechanism		//
	//////////////////////////////////
	//////////////////////////////////
	
	private Hashtable <EOperation, Operation> eOperation2operation = new Hashtable <EOperation, Operation> ();
	private Hashtable <Operation, EOperation> operation2eOperation = new Hashtable <Operation, EOperation> ();
	
	public void store(Operation operation, EOperation eOperation) {
		eOperation2operation.put(eOperation, operation);
		operation2eOperation.put(operation, eOperation);
	}
	
	public Operation getOperation(EOperation eOperation) {
		return eOperation2operation.get( eOperation );
	}
	
	public EOperation getEOperation(Operation operation) {
		return operation2eOperation.get(operation);
	}
	
	public Set <Operation> getOperations() {
		return operation2eOperation.keySet();
	}
	
	public Set <EOperation> getEOperations() {
		return eOperation2operation.keySet();
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Operation Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////

	
	//////////////////////////////////////
	//////////////////////////////////////
	//		Properties Mechanism		//
	//////////////////////////////////////
	//////////////////////////////////////
	
	private Hashtable<String, Property> properties = new Hashtable<String, Property> ();
	
	public void store(String qualifiedName, Property property) {
		properties.put(qualifiedName, property);
	}
	
	public Property getProperty(String qualifiedName) {
		return properties.get(qualifiedName);
	}
	
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Property Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////
	
	
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	//		ObjectTypeVariable Mechanism		//
	//////////////////////////////////////////////
	//////////////////////////////////////////////
	
	/** Dictionary of object type variables : { ETypeParameter : ObjectTypeVariable } */
	protected Hashtable<ETypeParameter, ObjectTypeVariable> objectTypeVariables = new Hashtable<ETypeParameter, ObjectTypeVariable>();

	public void store(ETypeParameter typeParameter, ObjectTypeVariable otv) {
		objectTypeVariables.put(typeParameter, otv);
	}
	
	public ObjectTypeVariable getObjectTypeVariable(ETypeParameter typeParameter) {
		return objectTypeVariables.get(typeParameter);
	}	
	
	//////////////////////////////////////////////////
	//////////////////////////////////////////////////
	//		End of ObjectTypeVariable Mechanism		//
	//////////////////////////////////////////////////
	//////////////////////////////////////////////////
	
	
	public String getTypeName(String shortType) {		
		return primitive_types_mapping.get(shortType);
	}
	
	public boolean isAType(String shortType) {
		return primitive_types_mapping.containsKey(shortType);
	}
	
	protected Hashtable<String, String> primitive_types_mapping;
	
	final public List<String> value_types = new ArrayList<String>();
	
	/**
	 * this map is used to know which java class can be casted as a kermeta class 
	 */
	public Ecore2KMDatas() {
		primitive_types_mapping = new Hashtable<String, String>();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("java.lang.Integer", 	"kermeta::standard::Integer"); // Fixme : UnlimiteNatural not handled
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.String", 	"kermeta::standard::String");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
		primitive_types_mapping.put("java.lang.Object", 	"kermeta::standard::Object");
		primitive_types_mapping.put("java.lang.Double", 	"kermeta::standard::Real");
		primitive_types_mapping.put("double", 	            "kermeta::standard::Real");
		primitive_types_mapping.put("java.lang.Float", 	    "kermeta::standard::Real");
		primitive_types_mapping.put("float", 	            "kermeta::standard::Real");
		primitive_types_mapping.put("org.eclipse.emf.ecore.util.FeatureMap$Entry", 	"kermeta::ecore::EFeatureMapEntry");		
		primitive_types_mapping.put("javax.xml.namespace.QName", 	"kermeta::xmltype::QName");		

	
		value_types.add("kermeta::language::structure::String");
		value_types.add("kermeta::language::structure::Boolean");
		value_types.add("kermeta::language::structure::Integer");
		value_types.add("kermeta::language::structure::UnlimitedNatural");
		value_types.add("kermeta::language::structure::Real");
	}

}


