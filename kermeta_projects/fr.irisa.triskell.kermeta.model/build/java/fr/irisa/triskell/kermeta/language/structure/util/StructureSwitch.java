/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructureSwitch.java,v 1.7 2007-07-03 12:12:47 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.util;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Model;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VirtualTypeContainer;
import fr.irisa.triskell.kermeta.language.structure.VoidType;

import java.util.List;

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
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage
 * @generated
 */
public class StructureSwitch {
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
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StructurePackage.CLASS: {
				fr.irisa.triskell.kermeta.language.structure.Class class_ = (fr.irisa.triskell.kermeta.language.structure.Class)theEObject;
				Object result = caseClass(class_);
				if (result == null) result = caseParameterizedType(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseObject(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OBJECT: {
				fr.irisa.triskell.kermeta.language.structure.Object object = (fr.irisa.triskell.kermeta.language.structure.Object)theEObject;
				Object result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL: {
				Model model = (Model)theEObject;
				Object result = caseModel(model);
				if (result == null) result = caseObject(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				Object result = caseModelType(modelType);
				if (result == null) result = caseType(modelType);
				if (result == null) result = caseTypeDefinition(modelType);
				if (result == null) result = caseObject(modelType);
				if (result == null) result = caseNamedElement(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				Object result = caseOperation(operation);
				if (result == null) result = caseMultiplicityElement(operation);
				if (result == null) result = caseTypedElement(operation);
				if (result == null) result = caseTypeContainer(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseObject(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PROPERTY: {
				Property property = (Property)theEObject;
				Object result = caseProperty(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseTypeContainer(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseObject(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE: {
				Type type = (Type)theEObject;
				Object result = caseType(type);
				if (result == null) result = caseObject(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_CONTAINER: {
				TypeContainer typeContainer = (TypeContainer)theEObject;
				Object result = caseTypeContainer(typeContainer);
				if (result == null) result = caseObject(typeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				Object result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = caseObject(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_VARIABLE_BINDING: {
				TypeVariableBinding typeVariableBinding = (TypeVariableBinding)theEObject;
				Object result = caseTypeVariableBinding(typeVariableBinding);
				if (result == null) result = caseTypeContainer(typeVariableBinding);
				if (result == null) result = caseObject(typeVariableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				Object result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseTypedElement(multiplicityElement);
				if (result == null) result = caseTypeContainer(multiplicityElement);
				if (result == null) result = caseNamedElement(multiplicityElement);
				if (result == null) result = caseObject(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				Object result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseNamedElement(typeDefinition);
				if (result == null) result = caseObject(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				Object result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseTypeDefinition(dataType);
				if (result == null) result = caseObject(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				Object result = caseEnumeration(enumeration);
				if (result == null) result = caseDataType(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseTypeDefinition(enumeration);
				if (result == null) result = caseObject(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = caseObject(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PACKAGE: {
				fr.irisa.triskell.kermeta.language.structure.Package package_ = (fr.irisa.triskell.kermeta.language.structure.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseTypeDefinitionContainer(package_);
				if (result == null) result = caseObject(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				Object result = caseParameter(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseTypeContainer(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseObject(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				Object result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataType(primitiveType);
				if (result == null) result = caseTypeContainer(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseTypeDefinition(primitiveType);
				if (result == null) result = caseObject(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				Object result = caseTypedElement(typedElement);
				if (result == null) result = caseTypeContainer(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseObject(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TAG: {
				Tag tag = (Tag)theEObject;
				Object result = caseTag(tag);
				if (result == null) result = caseObject(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				Object result = caseConstraint(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseObject(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CLASS_DEFINITION: {
				ClassDefinition classDefinition = (ClassDefinition)theEObject;
				Object result = caseClassDefinition(classDefinition);
				if (result == null) result = caseGenericTypeDefinition(classDefinition);
				if (result == null) result = caseTypeContainer(classDefinition);
				if (result == null) result = caseTypeDefinition(classDefinition);
				if (result == null) result = caseObject(classDefinition);
				if (result == null) result = caseNamedElement(classDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GENERIC_TYPE_DEFINITION: {
				GenericTypeDefinition genericTypeDefinition = (GenericTypeDefinition)theEObject;
				Object result = caseGenericTypeDefinition(genericTypeDefinition);
				if (result == null) result = caseTypeDefinition(genericTypeDefinition);
				if (result == null) result = caseNamedElement(genericTypeDefinition);
				if (result == null) result = caseObject(genericTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARAMETERIZED_TYPE: {
				ParameterizedType parameterizedType = (ParameterizedType)theEObject;
				Object result = caseParameterizedType(parameterizedType);
				if (result == null) result = caseType(parameterizedType);
				if (result == null) result = caseObject(parameterizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_VARIABLE: {
				TypeVariable typeVariable = (TypeVariable)theEObject;
				Object result = caseTypeVariable(typeVariable);
				if (result == null) result = caseTypeContainer(typeVariable);
				if (result == null) result = caseType(typeVariable);
				if (result == null) result = caseNamedElement(typeVariable);
				if (result == null) result = caseObject(typeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OBJECT_TYPE_VARIABLE: {
				ObjectTypeVariable objectTypeVariable = (ObjectTypeVariable)theEObject;
				Object result = caseObjectTypeVariable(objectTypeVariable);
				if (result == null) result = caseTypeVariable(objectTypeVariable);
				if (result == null) result = caseTypeContainer(objectTypeVariable);
				if (result == null) result = caseType(objectTypeVariable);
				if (result == null) result = caseNamedElement(objectTypeVariable);
				if (result == null) result = caseObject(objectTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VIRTUAL_TYPE_CONTAINER: {
				VirtualTypeContainer virtualTypeContainer = (VirtualTypeContainer)theEObject;
				Object result = caseVirtualTypeContainer(virtualTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_TYPE_VARIABLE: {
				ModelTypeVariable modelTypeVariable = (ModelTypeVariable)theEObject;
				Object result = caseModelTypeVariable(modelTypeVariable);
				if (result == null) result = caseVirtualTypeContainer(modelTypeVariable);
				if (result == null) result = caseTypeVariable(modelTypeVariable);
				if (result == null) result = caseTypeContainer(modelTypeVariable);
				if (result == null) result = caseType(modelTypeVariable);
				if (result == null) result = caseNamedElement(modelTypeVariable);
				if (result == null) result = caseObject(modelTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VIRTUAL_TYPE: {
				VirtualType virtualType = (VirtualType)theEObject;
				Object result = caseVirtualType(virtualType);
				if (result == null) result = caseObjectTypeVariable(virtualType);
				if (result == null) result = caseTypeVariable(virtualType);
				if (result == null) result = caseTypeContainer(virtualType);
				if (result == null) result = caseType(virtualType);
				if (result == null) result = caseNamedElement(virtualType);
				if (result == null) result = caseObject(virtualType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PRODUCT_TYPE: {
				ProductType productType = (ProductType)theEObject;
				Object result = caseProductType(productType);
				if (result == null) result = caseTypeContainer(productType);
				if (result == null) result = caseType(productType);
				if (result == null) result = caseObject(productType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				Object result = caseFunctionType(functionType);
				if (result == null) result = caseTypeContainer(functionType);
				if (result == null) result = caseType(functionType);
				if (result == null) result = caseObject(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				Object result = caseVoidType(voidType);
				if (result == null) result = caseType(voidType);
				if (result == null) result = caseObject(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_DEFINITION_CONTAINER: {
				TypeDefinitionContainer typeDefinitionContainer = (TypeDefinitionContainer)theEObject;
				Object result = caseTypeDefinitionContainer(typeDefinitionContainer);
				if (result == null) result = caseNamedElement(typeDefinitionContainer);
				if (result == null) result = caseObject(typeDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClass(fr.irisa.triskell.kermeta.language.structure.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObject(fr.irisa.triskell.kermeta.language.structure.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeContainer(TypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeVariableBinding(TypeVariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(fr.irisa.triskell.kermeta.language.structure.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Class Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassDefinition(ClassDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Generic Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Generic Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGenericTypeDefinition(GenericTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterizedType(ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeVariable(TypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectTypeVariable(ObjectTypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Virtual Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Virtual Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVirtualTypeContainer(VirtualTypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Model Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Model Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelTypeVariable(ModelTypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Virtual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Virtual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVirtualType(VirtualType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProductType(ProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeDefinitionContainer(TypeDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //StructureSwitch
