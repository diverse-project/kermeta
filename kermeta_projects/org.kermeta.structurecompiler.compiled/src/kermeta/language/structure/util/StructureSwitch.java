/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructureSwitch.java,v 1.8 2008-11-07 08:54:03 cfaucher Exp $
 */
package kermeta.language.structure.util;

import java.util.List;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.DataType;
import kermeta.language.structure.Enumeration;
import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.Filter;
import kermeta.language.structure.FunctionType;
import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.LinkSetterForTypedElement;
import kermeta.language.structure.Model;
import kermeta.language.structure.ModelType;
import kermeta.language.structure.ModelTypeVariable;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.MultiplicityElement;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.ObjectTypeVariable;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Parameter;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.PrimitiveType;
import kermeta.language.structure.ProductType;
import kermeta.language.structure.Property;
import kermeta.language.structure.Require;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Traceability;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.TypeDefinitionContainer;
import kermeta.language.structure.TypeVariable;
import kermeta.language.structure.TypeVariableBinding;
import kermeta.language.structure.TypedElement;
import kermeta.language.structure.Using;
import kermeta.language.structure.VirtualType;
import kermeta.language.structure.VoidType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kermeta.language.structure.StructurePackage
 * @generated
 */
public class StructureSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSwitch() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StructurePackage.MODELING_UNIT: {
			ModelingUnit modelingUnit = (ModelingUnit) theEObject;
			T result = caseModelingUnit(modelingUnit);
			if (result == null)
				result = caseTraceability(modelingUnit);
			if (result == null)
				result = caseObject(modelingUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.REQUIRE: {
			Require require = (Require) theEObject;
			T result = caseRequire(require);
			if (result == null)
				result = caseObject(require);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.USING: {
			Using using = (Using) theEObject;
			T result = caseUsing(using);
			if (result == null)
				result = caseObject(using);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.PACKAGE: {
			kermeta.language.structure.Package package_ = (kermeta.language.structure.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseTraceability(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = caseTypeDefinitionContainer(package_);
			if (result == null)
				result = caseObject(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseTraceability(primitiveType);
			if (result == null)
				result = caseDataType(primitiveType);
			if (result == null)
				result = caseTypeContainer(primitiveType);
			if (result == null)
				result = caseObject(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = caseTypeDefinition(primitiveType);
			if (result == null)
				result = caseNamedElement(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.ENUMERATION: {
			Enumeration enumeration = (Enumeration) theEObject;
			T result = caseEnumeration(enumeration);
			if (result == null)
				result = caseTraceability(enumeration);
			if (result == null)
				result = caseDataType(enumeration);
			if (result == null)
				result = caseObject(enumeration);
			if (result == null)
				result = caseType(enumeration);
			if (result == null)
				result = caseTypeDefinition(enumeration);
			if (result == null)
				result = caseNamedElement(enumeration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.ENUMERATION_LITERAL: {
			EnumerationLiteral enumerationLiteral = (EnumerationLiteral) theEObject;
			T result = caseEnumerationLiteral(enumerationLiteral);
			if (result == null)
				result = caseTraceability(enumerationLiteral);
			if (result == null)
				result = caseNamedElement(enumerationLiteral);
			if (result == null)
				result = caseObject(enumerationLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.CLASS_DEFINITION: {
			ClassDefinition classDefinition = (ClassDefinition) theEObject;
			T result = caseClassDefinition(classDefinition);
			if (result == null)
				result = caseTraceability(classDefinition);
			if (result == null)
				result = caseGenericTypeDefinition(classDefinition);
			if (result == null)
				result = caseTypeContainer(classDefinition);
			if (result == null)
				result = caseObject(classDefinition);
			if (result == null)
				result = caseTypeDefinition(classDefinition);
			if (result == null)
				result = caseNamedElement(classDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseTraceability(operation);
			if (result == null)
				result = caseMultiplicityElement(operation);
			if (result == null)
				result = caseObject(operation);
			if (result == null)
				result = caseTypedElement(operation);
			if (result == null)
				result = caseTypeContainer(operation);
			if (result == null)
				result = caseNamedElement(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseTraceability(parameter);
			if (result == null)
				result = caseMultiplicityElement(parameter);
			if (result == null)
				result = caseObject(parameter);
			if (result == null)
				result = caseTypedElement(parameter);
			if (result == null)
				result = caseTypeContainer(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = caseTraceability(constraint);
			if (result == null)
				result = caseNamedElement(constraint);
			if (result == null)
				result = caseObject(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = caseTraceability(property);
			if (result == null)
				result = caseMultiplicityElement(property);
			if (result == null)
				result = caseObject(property);
			if (result == null)
				result = caseTypedElement(property);
			if (result == null)
				result = caseTypeContainer(property);
			if (result == null)
				result = caseNamedElement(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.OBJECT_TYPE_VARIABLE: {
			ObjectTypeVariable objectTypeVariable = (ObjectTypeVariable) theEObject;
			T result = caseObjectTypeVariable(objectTypeVariable);
			if (result == null)
				result = caseTraceability(objectTypeVariable);
			if (result == null)
				result = caseTypeVariable(objectTypeVariable);
			if (result == null)
				result = caseObject(objectTypeVariable);
			if (result == null)
				result = caseTypeContainer(objectTypeVariable);
			if (result == null)
				result = caseType(objectTypeVariable);
			if (result == null)
				result = caseNamedElement(objectTypeVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TAG: {
			Tag tag = (Tag) theEObject;
			T result = caseTag(tag);
			if (result == null)
				result = caseTraceability(tag);
			if (result == null)
				result = caseObject(tag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.OBJECT: {
			kermeta.language.structure.Object object = (kermeta.language.structure.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.PARAMETERIZED_TYPE: {
			ParameterizedType parameterizedType = (ParameterizedType) theEObject;
			T result = caseParameterizedType(parameterizedType);
			if (result == null)
				result = caseType(parameterizedType);
			if (result == null)
				result = caseObject(parameterizedType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.CLASS: {
			kermeta.language.structure.Class class_ = (kermeta.language.structure.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseTraceability(class_);
			if (result == null)
				result = caseParameterizedType(class_);
			if (result == null)
				result = caseObject(class_);
			if (result == null)
				result = caseType(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.MULTIPLICITY_ELEMENT: {
			MultiplicityElement multiplicityElement = (MultiplicityElement) theEObject;
			T result = caseMultiplicityElement(multiplicityElement);
			if (result == null)
				result = caseTypedElement(multiplicityElement);
			if (result == null)
				result = caseTypeContainer(multiplicityElement);
			if (result == null)
				result = caseNamedElement(multiplicityElement);
			if (result == null)
				result = caseObject(multiplicityElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TRACEABILITY: {
			Traceability<?> traceability = (Traceability<?>) theEObject;
			T result = caseTraceability(traceability);
			if (result == null)
				result = caseObject(traceability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.FUNCTION_TYPE: {
			FunctionType functionType = (FunctionType) theEObject;
			T result = caseFunctionType(functionType);
			if (result == null)
				result = caseTypeContainer(functionType);
			if (result == null)
				result = caseType(functionType);
			if (result == null)
				result = caseTraceability(functionType);
			if (result == null)
				result = caseObject(functionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseObject(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.VOID_TYPE: {
			VoidType voidType = (VoidType) theEObject;
			T result = caseVoidType(voidType);
			if (result == null)
				result = caseType(voidType);
			if (result == null)
				result = caseObject(voidType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.PRODUCT_TYPE: {
			ProductType productType = (ProductType) theEObject;
			T result = caseProductType(productType);
			if (result == null)
				result = caseTypeContainer(productType);
			if (result == null)
				result = caseType(productType);
			if (result == null)
				result = caseObject(productType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPE_CONTAINER: {
			TypeContainer typeContainer = (TypeContainer) theEObject;
			T result = caseTypeContainer(typeContainer);
			if (result == null)
				result = caseObject(typeContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPE_VARIABLE_BINDING: {
			TypeVariableBinding typeVariableBinding = (TypeVariableBinding) theEObject;
			T result = caseTypeVariableBinding(typeVariableBinding);
			if (result == null)
				result = caseTypeContainer(typeVariableBinding);
			if (result == null)
				result = caseObject(typeVariableBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = caseTypeContainer(typedElement);
			if (result == null)
				result = caseNamedElement(typedElement);
			if (result == null)
				result = caseObject(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPE_DEFINITION: {
			TypeDefinition typeDefinition = (TypeDefinition) theEObject;
			T result = caseTypeDefinition(typeDefinition);
			if (result == null)
				result = caseNamedElement(typeDefinition);
			if (result == null)
				result = caseObject(typeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseObject(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			T result = caseDataType(dataType);
			if (result == null)
				result = caseType(dataType);
			if (result == null)
				result = caseTypeDefinition(dataType);
			if (result == null)
				result = caseObject(dataType);
			if (result == null)
				result = caseNamedElement(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.GENERIC_TYPE_DEFINITION: {
			GenericTypeDefinition genericTypeDefinition = (GenericTypeDefinition) theEObject;
			T result = caseGenericTypeDefinition(genericTypeDefinition);
			if (result == null)
				result = caseTypeDefinition(genericTypeDefinition);
			if (result == null)
				result = caseNamedElement(genericTypeDefinition);
			if (result == null)
				result = caseObject(genericTypeDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPE_VARIABLE: {
			TypeVariable typeVariable = (TypeVariable) theEObject;
			T result = caseTypeVariable(typeVariable);
			if (result == null)
				result = caseTypeContainer(typeVariable);
			if (result == null)
				result = caseType(typeVariable);
			if (result == null)
				result = caseNamedElement(typeVariable);
			if (result == null)
				result = caseObject(typeVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.MODEL_TYPE: {
			ModelType modelType = (ModelType) theEObject;
			T result = caseModelType(modelType);
			if (result == null)
				result = caseType(modelType);
			if (result == null)
				result = caseTypeDefinition(modelType);
			if (result == null)
				result = caseObject(modelType);
			if (result == null)
				result = caseNamedElement(modelType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.MODEL_TYPE_VARIABLE: {
			ModelTypeVariable modelTypeVariable = (ModelTypeVariable) theEObject;
			T result = caseModelTypeVariable(modelTypeVariable);
			if (result == null)
				result = caseTypeVariable(modelTypeVariable);
			if (result == null)
				result = caseTypeContainer(modelTypeVariable);
			if (result == null)
				result = caseType(modelTypeVariable);
			if (result == null)
				result = caseNamedElement(modelTypeVariable);
			if (result == null)
				result = caseObject(modelTypeVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.VIRTUAL_TYPE: {
			VirtualType virtualType = (VirtualType) theEObject;
			T result = caseVirtualType(virtualType);
			if (result == null)
				result = caseObjectTypeVariable(virtualType);
			if (result == null)
				result = caseTraceability(virtualType);
			if (result == null)
				result = caseTypeVariable(virtualType);
			if (result == null)
				result = caseObject(virtualType);
			if (result == null)
				result = caseTypeContainer(virtualType);
			if (result == null)
				result = caseType(virtualType);
			if (result == null)
				result = caseNamedElement(virtualType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseObject(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.FILTER: {
			Filter filter = (Filter) theEObject;
			T result = caseFilter(filter);
			if (result == null)
				result = caseObject(filter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.TYPE_DEFINITION_CONTAINER: {
			TypeDefinitionContainer typeDefinitionContainer = (TypeDefinitionContainer) theEObject;
			T result = caseTypeDefinitionContainer(typeDefinitionContainer);
			if (result == null)
				result = caseNamedElement(typeDefinitionContainer);
			if (result == null)
				result = caseObject(typeDefinitionContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StructurePackage.LINK_SETTER_FOR_TYPED_ELEMENT: {
			LinkSetterForTypedElement linkSetterForTypedElement = (LinkSetterForTypedElement) theEObject;
			T result = caseLinkSetterForTypedElement(linkSetterForTypedElement);
			if (result == null)
				result = caseObject(linkSetterForTypedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingUnit(ModelingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequire(Require object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Using</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Using</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsing(Using object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(kermeta.language.structure.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDefinition(ClassDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeVariable(ObjectTypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(kermeta.language.structure.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType(ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(kermeta.language.structure.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <X> T caseTraceability(Traceability<X> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductType(ProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContainer(TypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVariableBinding(TypeVariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericTypeDefinition(GenericTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeVariable(TypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTypeVariable(ModelTypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualType(VirtualType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionContainer(TypeDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Setter For Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Setter For Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkSetterForTypedElement(LinkSetterForTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //StructureSwitch
