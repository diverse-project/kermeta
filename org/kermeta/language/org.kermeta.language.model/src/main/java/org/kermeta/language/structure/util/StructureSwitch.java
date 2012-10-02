/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.language.structure.AbstractOperation;
import org.kermeta.language.structure.AbstractProperty;
import org.kermeta.language.structure.AdaptationOperator;
import org.kermeta.language.structure.AdaptationParameter;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ClassDefinitionBinding;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.DataType;
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.EnumerationBinding;
import org.kermeta.language.structure.EnumerationLiteral;
import org.kermeta.language.structure.FilteredMetamodelReference;
import org.kermeta.language.structure.FunctionType;
import org.kermeta.language.structure.GenericTypeDefinition;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.MetamodelBinding;
import org.kermeta.language.structure.Model;
import org.kermeta.language.structure.ModelElementTypeDefinition;
import org.kermeta.language.structure.ModelElementTypeDefinitionContainer;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.MultiplicityElement;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.ObjectTypeVariable;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.OperationAdaptationOperator;
import org.kermeta.language.structure.OperationBinding;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.ParameterizedType;
import org.kermeta.language.structure.PrimitiveType;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.PropertyAdaptationOperator;
import org.kermeta.language.structure.PropertyBinding;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeVariable;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.structure.TypedElement;
import org.kermeta.language.structure.UnresolvedAdaptationOperator;
import org.kermeta.language.structure.UnresolvedInferredType;
import org.kermeta.language.structure.UnresolvedOperation;
import org.kermeta.language.structure.UnresolvedProperty;
import org.kermeta.language.structure.UnresolvedReference;
import org.kermeta.language.structure.UnresolvedType;
import org.kermeta.language.structure.UnresolvedTypeVariable;
import org.kermeta.language.structure.UseAdaptationOperator;
import org.kermeta.language.structure.Using;
import org.kermeta.language.structure.VirtualType;
import org.kermeta.language.structure.VoidType;

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
 * @see org.kermeta.language.structure.StructurePackage
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
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	//@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StructurePackage.KERMETA_MODEL_ELEMENT: {
				KermetaModelElement kermetaModelElement = (KermetaModelElement)theEObject;
				T result = caseKermetaModelElement(kermetaModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseMultiplicityElement(operation);
				if (result == null) result = caseAbstractOperation(operation);
				if (result == null) result = caseTypedElement(operation);
				if (result == null) result = caseTypeContainer(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseKermetaModelElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseAbstractProperty(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseTypeContainer(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseKermetaModelElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseKermetaModelElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_CONTAINER: {
				TypeContainer typeContainer = (TypeContainer)theEObject;
				T result = caseTypeContainer(typeContainer);
				if (result == null) result = caseKermetaModelElement(typeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = caseKermetaModelElement(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_VARIABLE_BINDING: {
				TypeVariableBinding typeVariableBinding = (TypeVariableBinding)theEObject;
				T result = caseTypeVariableBinding(typeVariableBinding);
				if (result == null) result = caseTypeContainer(typeVariableBinding);
				if (result == null) result = caseKermetaModelElement(typeVariableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseTypedElement(multiplicityElement);
				if (result == null) result = caseTypeContainer(multiplicityElement);
				if (result == null) result = caseNamedElement(multiplicityElement);
				if (result == null) result = caseKermetaModelElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseNamedElement(typeDefinition);
				if (result == null) result = caseTypeContainer(typeDefinition);
				if (result == null) result = caseKermetaModelElement(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CLASS: {
				org.kermeta.language.structure.Class class_ = (org.kermeta.language.structure.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseParameterizedType(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseKermetaModelElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseModelElementTypeDefinition(dataType);
				if (result == null) result = caseTypeDefinition(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseTypeContainer(dataType);
				if (result == null) result = caseKermetaModelElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseDataType(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseModelElementTypeDefinition(enumeration);
				if (result == null) result = caseTypeDefinition(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseTypeContainer(enumeration);
				if (result == null) result = caseKermetaModelElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseKermetaModelElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PACKAGE: {
				org.kermeta.language.structure.Package package_ = (org.kermeta.language.structure.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModelElementTypeDefinitionContainer(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseKermetaModelElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseTypeContainer(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseKermetaModelElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseModelElementTypeDefinition(primitiveType);
				if (result == null) result = caseTypeDefinition(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = caseTypeContainer(primitiveType);
				if (result == null) result = caseKermetaModelElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseTypeContainer(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseKermetaModelElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseKermetaModelElement(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ABSTRACT_PROPERTY: {
				AbstractProperty abstractProperty = (AbstractProperty)theEObject;
				T result = caseAbstractProperty(abstractProperty);
				if (result == null) result = caseKermetaModelElement(abstractProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseKermetaModelElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CLASS_DEFINITION: {
				ClassDefinition classDefinition = (ClassDefinition)theEObject;
				T result = caseClassDefinition(classDefinition);
				if (result == null) result = caseGenericTypeDefinition(classDefinition);
				if (result == null) result = caseModelElementTypeDefinition(classDefinition);
				if (result == null) result = caseTypeDefinition(classDefinition);
				if (result == null) result = caseNamedElement(classDefinition);
				if (result == null) result = caseTypeContainer(classDefinition);
				if (result == null) result = caseKermetaModelElement(classDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = caseTypeDefinition(metamodel);
				if (result == null) result = caseNamedElement(metamodel);
				if (result == null) result = caseTypeContainer(metamodel);
				if (result == null) result = caseKermetaModelElement(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION_CONTAINER: {
				ModelElementTypeDefinitionContainer modelElementTypeDefinitionContainer = (ModelElementTypeDefinitionContainer)theEObject;
				T result = caseModelElementTypeDefinitionContainer(modelElementTypeDefinitionContainer);
				if (result == null) result = caseNamedElement(modelElementTypeDefinitionContainer);
				if (result == null) result = caseKermetaModelElement(modelElementTypeDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GENERIC_TYPE_DEFINITION: {
				GenericTypeDefinition genericTypeDefinition = (GenericTypeDefinition)theEObject;
				T result = caseGenericTypeDefinition(genericTypeDefinition);
				if (result == null) result = caseModelElementTypeDefinition(genericTypeDefinition);
				if (result == null) result = caseTypeDefinition(genericTypeDefinition);
				if (result == null) result = caseNamedElement(genericTypeDefinition);
				if (result == null) result = caseTypeContainer(genericTypeDefinition);
				if (result == null) result = caseKermetaModelElement(genericTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARAMETERIZED_TYPE: {
				ParameterizedType parameterizedType = (ParameterizedType)theEObject;
				T result = caseParameterizedType(parameterizedType);
				if (result == null) result = caseType(parameterizedType);
				if (result == null) result = caseKermetaModelElement(parameterizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_VARIABLE: {
				TypeVariable typeVariable = (TypeVariable)theEObject;
				T result = caseTypeVariable(typeVariable);
				if (result == null) result = caseTypeContainer(typeVariable);
				if (result == null) result = caseType(typeVariable);
				if (result == null) result = caseNamedElement(typeVariable);
				if (result == null) result = caseKermetaModelElement(typeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OBJECT_TYPE_VARIABLE: {
				ObjectTypeVariable objectTypeVariable = (ObjectTypeVariable)theEObject;
				T result = caseObjectTypeVariable(objectTypeVariable);
				if (result == null) result = caseTypeVariable(objectTypeVariable);
				if (result == null) result = caseTypeContainer(objectTypeVariable);
				if (result == null) result = caseType(objectTypeVariable);
				if (result == null) result = caseNamedElement(objectTypeVariable);
				if (result == null) result = caseKermetaModelElement(objectTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_TYPE_VARIABLE: {
				ModelTypeVariable modelTypeVariable = (ModelTypeVariable)theEObject;
				T result = caseModelTypeVariable(modelTypeVariable);
				if (result == null) result = caseTypeVariable(modelTypeVariable);
				if (result == null) result = caseTypeContainer(modelTypeVariable);
				if (result == null) result = caseType(modelTypeVariable);
				if (result == null) result = caseNamedElement(modelTypeVariable);
				if (result == null) result = caseKermetaModelElement(modelTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VIRTUAL_TYPE: {
				VirtualType virtualType = (VirtualType)theEObject;
				T result = caseVirtualType(virtualType);
				if (result == null) result = caseObjectTypeVariable(virtualType);
				if (result == null) result = caseTypeVariable(virtualType);
				if (result == null) result = caseTypeContainer(virtualType);
				if (result == null) result = caseType(virtualType);
				if (result == null) result = caseNamedElement(virtualType);
				if (result == null) result = caseKermetaModelElement(virtualType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseKermetaModelElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ABSTRACT_OPERATION: {
				AbstractOperation abstractOperation = (AbstractOperation)theEObject;
				T result = caseAbstractOperation(abstractOperation);
				if (result == null) result = caseKermetaModelElement(abstractOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_TYPE: {
				UnresolvedType unresolvedType = (UnresolvedType)theEObject;
				T result = caseUnresolvedType(unresolvedType);
				if (result == null) result = caseType(unresolvedType);
				if (result == null) result = caseUnresolvedReference(unresolvedType);
				if (result == null) result = caseTypeContainer(unresolvedType);
				if (result == null) result = caseKermetaModelElement(unresolvedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_REFERENCE: {
				UnresolvedReference unresolvedReference = (UnresolvedReference)theEObject;
				T result = caseUnresolvedReference(unresolvedReference);
				if (result == null) result = caseKermetaModelElement(unresolvedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_PROPERTY: {
				UnresolvedProperty unresolvedProperty = (UnresolvedProperty)theEObject;
				T result = caseUnresolvedProperty(unresolvedProperty);
				if (result == null) result = caseAbstractProperty(unresolvedProperty);
				if (result == null) result = caseUnresolvedReference(unresolvedProperty);
				if (result == null) result = caseKermetaModelElement(unresolvedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_OPERATION: {
				UnresolvedOperation unresolvedOperation = (UnresolvedOperation)theEObject;
				T result = caseUnresolvedOperation(unresolvedOperation);
				if (result == null) result = caseAbstractOperation(unresolvedOperation);
				if (result == null) result = caseUnresolvedReference(unresolvedOperation);
				if (result == null) result = caseTypeContainer(unresolvedOperation);
				if (result == null) result = caseKermetaModelElement(unresolvedOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.USING: {
				Using using = (Using)theEObject;
				T result = caseUsing(using);
				if (result == null) result = caseKermetaModelElement(using);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PRODUCT_TYPE: {
				ProductType productType = (ProductType)theEObject;
				T result = caseProductType(productType);
				if (result == null) result = caseTypeContainer(productType);
				if (result == null) result = caseType(productType);
				if (result == null) result = caseKermetaModelElement(productType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseTypeContainer(functionType);
				if (result == null) result = caseType(functionType);
				if (result == null) result = caseKermetaModelElement(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				T result = caseVoidType(voidType);
				if (result == null) result = caseType(voidType);
				if (result == null) result = caseKermetaModelElement(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_INFERRED_TYPE: {
				UnresolvedInferredType unresolvedInferredType = (UnresolvedInferredType)theEObject;
				T result = caseUnresolvedInferredType(unresolvedInferredType);
				if (result == null) result = caseUnresolvedReference(unresolvedInferredType);
				if (result == null) result = caseType(unresolvedInferredType);
				if (result == null) result = caseKermetaModelElement(unresolvedInferredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_TYPE_VARIABLE: {
				UnresolvedTypeVariable unresolvedTypeVariable = (UnresolvedTypeVariable)theEObject;
				T result = caseUnresolvedTypeVariable(unresolvedTypeVariable);
				if (result == null) result = caseUnresolvedReference(unresolvedTypeVariable);
				if (result == null) result = caseTypeVariable(unresolvedTypeVariable);
				if (result == null) result = caseTypeContainer(unresolvedTypeVariable);
				if (result == null) result = caseType(unresolvedTypeVariable);
				if (result == null) result = caseNamedElement(unresolvedTypeVariable);
				if (result == null) result = caseKermetaModelElement(unresolvedTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.METAMODEL_BINDING: {
				MetamodelBinding metamodelBinding = (MetamodelBinding)theEObject;
				T result = caseMetamodelBinding(metamodelBinding);
				if (result == null) result = caseKermetaModelElement(metamodelBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CLASS_DEFINITION_BINDING: {
				ClassDefinitionBinding classDefinitionBinding = (ClassDefinitionBinding)theEObject;
				T result = caseClassDefinitionBinding(classDefinitionBinding);
				if (result == null) result = caseKermetaModelElement(classDefinitionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ENUMERATION_BINDING: {
				EnumerationBinding enumerationBinding = (EnumerationBinding)theEObject;
				T result = caseEnumerationBinding(enumerationBinding);
				if (result == null) result = caseKermetaModelElement(enumerationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PROPERTY_BINDING: {
				PropertyBinding propertyBinding = (PropertyBinding)theEObject;
				T result = casePropertyBinding(propertyBinding);
				if (result == null) result = caseKermetaModelElement(propertyBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OPERATION_BINDING: {
				OperationBinding operationBinding = (OperationBinding)theEObject;
				T result = caseOperationBinding(operationBinding);
				if (result == null) result = caseKermetaModelElement(operationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ADAPTATION_OPERATOR: {
				AdaptationOperator adaptationOperator = (AdaptationOperator)theEObject;
				T result = caseAdaptationOperator(adaptationOperator);
				if (result == null) result = caseNamedElement(adaptationOperator);
				if (result == null) result = caseKermetaModelElement(adaptationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.USE_ADAPTATION_OPERATOR: {
				UseAdaptationOperator useAdaptationOperator = (UseAdaptationOperator)theEObject;
				T result = caseUseAdaptationOperator(useAdaptationOperator);
				if (result == null) result = caseKermetaModelElement(useAdaptationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR: {
				PropertyAdaptationOperator propertyAdaptationOperator = (PropertyAdaptationOperator)theEObject;
				T result = casePropertyAdaptationOperator(propertyAdaptationOperator);
				if (result == null) result = caseAdaptationOperator(propertyAdaptationOperator);
				if (result == null) result = caseNamedElement(propertyAdaptationOperator);
				if (result == null) result = caseKermetaModelElement(propertyAdaptationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_ADAPTATION_OPERATOR: {
				UnresolvedAdaptationOperator unresolvedAdaptationOperator = (UnresolvedAdaptationOperator)theEObject;
				T result = caseUnresolvedAdaptationOperator(unresolvedAdaptationOperator);
				if (result == null) result = caseAdaptationOperator(unresolvedAdaptationOperator);
				if (result == null) result = caseUnresolvedReference(unresolvedAdaptationOperator);
				if (result == null) result = caseNamedElement(unresolvedAdaptationOperator);
				if (result == null) result = caseKermetaModelElement(unresolvedAdaptationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ADAPTATION_PARAMETER: {
				AdaptationParameter adaptationParameter = (AdaptationParameter)theEObject;
				T result = caseAdaptationParameter(adaptationParameter);
				if (result == null) result = caseTypedElement(adaptationParameter);
				if (result == null) result = caseTypeContainer(adaptationParameter);
				if (result == null) result = caseNamedElement(adaptationParameter);
				if (result == null) result = caseKermetaModelElement(adaptationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OPERATION_ADAPTATION_OPERATOR: {
				OperationAdaptationOperator operationAdaptationOperator = (OperationAdaptationOperator)theEObject;
				T result = caseOperationAdaptationOperator(operationAdaptationOperator);
				if (result == null) result = caseAdaptationOperator(operationAdaptationOperator);
				if (result == null) result = caseNamedElement(operationAdaptationOperator);
				if (result == null) result = caseKermetaModelElement(operationAdaptationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_ELEMENT_TYPE_DEFINITION: {
				ModelElementTypeDefinition modelElementTypeDefinition = (ModelElementTypeDefinition)theEObject;
				T result = caseModelElementTypeDefinition(modelElementTypeDefinition);
				if (result == null) result = caseTypeDefinition(modelElementTypeDefinition);
				if (result == null) result = caseNamedElement(modelElementTypeDefinition);
				if (result == null) result = caseTypeContainer(modelElementTypeDefinition);
				if (result == null) result = caseKermetaModelElement(modelElementTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseType(modelType);
				if (result == null) result = caseKermetaModelElement(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.FILTERED_METAMODEL_REFERENCE: {
				FilteredMetamodelReference filteredMetamodelReference = (FilteredMetamodelReference)theEObject;
				T result = caseFilteredMetamodelReference(filteredMetamodelReference);
				if (result == null) result = caseKermetaModelElement(filteredMetamodelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kermeta Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kermeta Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKermetaModelElement(KermetaModelElement object) {
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
	public T caseClass(org.kermeta.language.structure.Class object) {
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
	public T casePackage(org.kermeta.language.structure.Package object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractProperty(AbstractProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Type Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Type Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementTypeDefinitionContainer(ModelElementTypeDefinitionContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(Metamodel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Metamodel Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Metamodel Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredMetamodelReference(FilteredMetamodelReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOperation(AbstractOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedType(UnresolvedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedReference(UnresolvedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedProperty(UnresolvedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedOperation(UnresolvedOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Inferred Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Inferred Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedInferredType(UnresolvedInferredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeVariable(UnresolvedTypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelBinding(MetamodelBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Definition Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDefinitionBinding(ClassDefinitionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationBinding(EnumerationBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyBinding(PropertyBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationBinding(OperationBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationOperator(AdaptationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Adaptation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseAdaptationOperator(UseAdaptationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Adaptation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAdaptationOperator(PropertyAdaptationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Adaptation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedAdaptationOperator(UnresolvedAdaptationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationParameter(AdaptationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Adaptation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAdaptationOperator(OperationAdaptationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementTypeDefinition(ModelElementTypeDefinition object) {
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
	//@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StructureSwitch
