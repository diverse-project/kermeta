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

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.kermeta.language.structure.AbstractOperation;
import org.kermeta.language.structure.AbstractProperty;
import org.kermeta.language.structure.AdaptationBinding;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.DataType;
import org.kermeta.language.structure.DirectBinding;
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.EnumerationLiteral;
import org.kermeta.language.structure.FunctionType;
import org.kermeta.language.structure.GenericTypeDefinition;
import org.kermeta.language.structure.IsomorphicBinding;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Model;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.ModelTypeBinding;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.MultiplicityElement;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.NonIsomorphicBinding;
import org.kermeta.language.structure.ObjectTypeBinding;
import org.kermeta.language.structure.ObjectTypeVariable;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.ParameterizedType;
import org.kermeta.language.structure.PartialBinding;
import org.kermeta.language.structure.PartialIsomorphicBinding;
import org.kermeta.language.structure.PartialNonIsomorphicBinding;
import org.kermeta.language.structure.PrimitiveType;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.TotalBinding;
import org.kermeta.language.structure.TotalIsomorphicBinding;
import org.kermeta.language.structure.TotalNonIsomorphicBinding;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeDefinitionContainer;
import org.kermeta.language.structure.TypeMapping;
import org.kermeta.language.structure.TypeVariable;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.structure.TypedElement;
import org.kermeta.language.structure.Unresolved;
import org.kermeta.language.structure.UnresolvedInferredType;
import org.kermeta.language.structure.UnresolvedOperation;
import org.kermeta.language.structure.UnresolvedProperty;
import org.kermeta.language.structure.UnresolvedType;
import org.kermeta.language.structure.UnresolvedTypeDefinition;
import org.kermeta.language.structure.UnresolvedTypeVariable;
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
public class StructureSwitch<T> extends Switch<T> {
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
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	//@Override
	@Override
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
				if (result == null) result = caseTypeDefinitionContainer(package_);
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
				if (result == null) result = caseTypeDefinition(classDefinition);
				if (result == null) result = caseNamedElement(classDefinition);
				if (result == null) result = caseTypeContainer(classDefinition);
				if (result == null) result = caseKermetaModelElement(classDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODELING_UNIT: {
				ModelingUnit modelingUnit = (ModelingUnit)theEObject;
				T result = caseModelingUnit(modelingUnit);
				if (result == null) result = caseTypeDefinitionContainer(modelingUnit);
				if (result == null) result = caseNamedElement(modelingUnit);
				if (result == null) result = caseKermetaModelElement(modelingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TYPE_DEFINITION_CONTAINER: {
				TypeDefinitionContainer typeDefinitionContainer = (TypeDefinitionContainer)theEObject;
				T result = caseTypeDefinitionContainer(typeDefinitionContainer);
				if (result == null) result = caseNamedElement(typeDefinitionContainer);
				if (result == null) result = caseKermetaModelElement(typeDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.REQUIRE: {
				Require require = (Require)theEObject;
				T result = caseRequire(require);
				if (result == null) result = caseKermetaModelElement(require);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GENERIC_TYPE_DEFINITION: {
				GenericTypeDefinition genericTypeDefinition = (GenericTypeDefinition)theEObject;
				T result = caseGenericTypeDefinition(genericTypeDefinition);
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
			case StructurePackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseType(modelType);
				if (result == null) result = caseTypeDefinition(modelType);
				if (result == null) result = caseTypeDefinitionContainer(modelType);
				if (result == null) result = caseNamedElement(modelType);
				if (result == null) result = caseTypeContainer(modelType);
				if (result == null) result = caseKermetaModelElement(modelType);
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
				if (result == null) result = caseUnresolved(unresolvedType);
				if (result == null) result = caseTypeContainer(unresolvedType);
				if (result == null) result = caseKermetaModelElement(unresolvedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED: {
				Unresolved unresolved = (Unresolved)theEObject;
				T result = caseUnresolved(unresolved);
				if (result == null) result = caseKermetaModelElement(unresolved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_PROPERTY: {
				UnresolvedProperty unresolvedProperty = (UnresolvedProperty)theEObject;
				T result = caseUnresolvedProperty(unresolvedProperty);
				if (result == null) result = caseAbstractProperty(unresolvedProperty);
				if (result == null) result = caseUnresolved(unresolvedProperty);
				if (result == null) result = caseKermetaModelElement(unresolvedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_OPERATION: {
				UnresolvedOperation unresolvedOperation = (UnresolvedOperation)theEObject;
				T result = caseUnresolvedOperation(unresolvedOperation);
				if (result == null) result = caseAbstractOperation(unresolvedOperation);
				if (result == null) result = caseUnresolved(unresolvedOperation);
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
			case StructurePackage.TYPE_MAPPING: {
				TypeMapping typeMapping = (TypeMapping)theEObject;
				T result = caseTypeMapping(typeMapping);
				if (result == null) result = caseTypeContainer(typeMapping);
				if (result == null) result = caseKermetaModelElement(typeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_INFERRED_TYPE: {
				UnresolvedInferredType unresolvedInferredType = (UnresolvedInferredType)theEObject;
				T result = caseUnresolvedInferredType(unresolvedInferredType);
				if (result == null) result = caseUnresolved(unresolvedInferredType);
				if (result == null) result = caseType(unresolvedInferredType);
				if (result == null) result = caseKermetaModelElement(unresolvedInferredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_TYPE_VARIABLE: {
				UnresolvedTypeVariable unresolvedTypeVariable = (UnresolvedTypeVariable)theEObject;
				T result = caseUnresolvedTypeVariable(unresolvedTypeVariable);
				if (result == null) result = caseUnresolved(unresolvedTypeVariable);
				if (result == null) result = caseTypeVariable(unresolvedTypeVariable);
				if (result == null) result = caseTypeContainer(unresolvedTypeVariable);
				if (result == null) result = caseType(unresolvedTypeVariable);
				if (result == null) result = caseNamedElement(unresolvedTypeVariable);
				if (result == null) result = caseKermetaModelElement(unresolvedTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.UNRESOLVED_TYPE_DEFINITION: {
				UnresolvedTypeDefinition unresolvedTypeDefinition = (UnresolvedTypeDefinition)theEObject;
				T result = caseUnresolvedTypeDefinition(unresolvedTypeDefinition);
				if (result == null) result = caseUnresolved(unresolvedTypeDefinition);
				if (result == null) result = caseTypeDefinition(unresolvedTypeDefinition);
				if (result == null) result = caseNamedElement(unresolvedTypeDefinition);
				if (result == null) result = caseTypeContainer(unresolvedTypeDefinition);
				if (result == null) result = caseKermetaModelElement(unresolvedTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MODEL_TYPE_BINDING: {
				ModelTypeBinding modelTypeBinding = (ModelTypeBinding)theEObject;
				T result = caseModelTypeBinding(modelTypeBinding);
				if (result == null) result = caseKermetaModelElement(modelTypeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TOTAL_BINDING: {
				TotalBinding totalBinding = (TotalBinding)theEObject;
				T result = caseTotalBinding(totalBinding);
				if (result == null) result = caseModelTypeBinding(totalBinding);
				if (result == null) result = caseKermetaModelElement(totalBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARTIAL_BINDING: {
				PartialBinding partialBinding = (PartialBinding)theEObject;
				T result = casePartialBinding(partialBinding);
				if (result == null) result = caseModelTypeBinding(partialBinding);
				if (result == null) result = caseKermetaModelElement(partialBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ISOMORPHIC_BINDING: {
				IsomorphicBinding isomorphicBinding = (IsomorphicBinding)theEObject;
				T result = caseIsomorphicBinding(isomorphicBinding);
				if (result == null) result = caseModelTypeBinding(isomorphicBinding);
				if (result == null) result = caseKermetaModelElement(isomorphicBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.NON_ISOMORPHIC_BINDING: {
				NonIsomorphicBinding nonIsomorphicBinding = (NonIsomorphicBinding)theEObject;
				T result = caseNonIsomorphicBinding(nonIsomorphicBinding);
				if (result == null) result = caseModelTypeBinding(nonIsomorphicBinding);
				if (result == null) result = caseKermetaModelElement(nonIsomorphicBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TOTAL_ISOMORPHIC_BINDING: {
				TotalIsomorphicBinding totalIsomorphicBinding = (TotalIsomorphicBinding)theEObject;
				T result = caseTotalIsomorphicBinding(totalIsomorphicBinding);
				if (result == null) result = caseTotalBinding(totalIsomorphicBinding);
				if (result == null) result = caseIsomorphicBinding(totalIsomorphicBinding);
				if (result == null) result = caseModelTypeBinding(totalIsomorphicBinding);
				if (result == null) result = caseKermetaModelElement(totalIsomorphicBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARTIAL_ISOMORPHIC_BINDING: {
				PartialIsomorphicBinding partialIsomorphicBinding = (PartialIsomorphicBinding)theEObject;
				T result = casePartialIsomorphicBinding(partialIsomorphicBinding);
				if (result == null) result = casePartialBinding(partialIsomorphicBinding);
				if (result == null) result = caseIsomorphicBinding(partialIsomorphicBinding);
				if (result == null) result = caseModelTypeBinding(partialIsomorphicBinding);
				if (result == null) result = caseKermetaModelElement(partialIsomorphicBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TOTAL_NON_ISOMORPHIC_BINDING: {
				TotalNonIsomorphicBinding totalNonIsomorphicBinding = (TotalNonIsomorphicBinding)theEObject;
				T result = caseTotalNonIsomorphicBinding(totalNonIsomorphicBinding);
				if (result == null) result = caseTotalBinding(totalNonIsomorphicBinding);
				if (result == null) result = caseNonIsomorphicBinding(totalNonIsomorphicBinding);
				if (result == null) result = caseModelTypeBinding(totalNonIsomorphicBinding);
				if (result == null) result = caseKermetaModelElement(totalNonIsomorphicBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.PARTIAL_NON_ISOMORPHIC_BINDING: {
				PartialNonIsomorphicBinding partialNonIsomorphicBinding = (PartialNonIsomorphicBinding)theEObject;
				T result = casePartialNonIsomorphicBinding(partialNonIsomorphicBinding);
				if (result == null) result = casePartialBinding(partialNonIsomorphicBinding);
				if (result == null) result = caseNonIsomorphicBinding(partialNonIsomorphicBinding);
				if (result == null) result = caseModelTypeBinding(partialNonIsomorphicBinding);
				if (result == null) result = caseKermetaModelElement(partialNonIsomorphicBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OBJECT_TYPE_BINDING: {
				ObjectTypeBinding objectTypeBinding = (ObjectTypeBinding)theEObject;
				T result = caseObjectTypeBinding(objectTypeBinding);
				if (result == null) result = caseKermetaModelElement(objectTypeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.DIRECT_BINDING: {
				DirectBinding directBinding = (DirectBinding)theEObject;
				T result = caseDirectBinding(directBinding);
				if (result == null) result = caseObjectTypeBinding(directBinding);
				if (result == null) result = caseKermetaModelElement(directBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ADAPTATION_BINDING: {
				AdaptationBinding adaptationBinding = (AdaptationBinding)theEObject;
				T result = caseAdaptationBinding(adaptationBinding);
				if (result == null) result = caseObjectTypeBinding(adaptationBinding);
				if (result == null) result = caseKermetaModelElement(adaptationBinding);
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
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolved(Unresolved object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMapping(TypeMapping object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDefinition(UnresolvedTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTypeBinding(ModelTypeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalBinding(TotalBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialBinding(PartialBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isomorphic Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isomorphic Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsomorphicBinding(IsomorphicBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Isomorphic Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Isomorphic Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonIsomorphicBinding(NonIsomorphicBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Isomorphic Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Isomorphic Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalIsomorphicBinding(TotalIsomorphicBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Isomorphic Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Isomorphic Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialIsomorphicBinding(PartialIsomorphicBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Non Isomorphic Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Non Isomorphic Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalNonIsomorphicBinding(TotalNonIsomorphicBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Non Isomorphic Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Non Isomorphic Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialNonIsomorphicBinding(PartialNonIsomorphicBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeBinding(ObjectTypeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectBinding(DirectBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationBinding(AdaptationBinding object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StructureSwitch
