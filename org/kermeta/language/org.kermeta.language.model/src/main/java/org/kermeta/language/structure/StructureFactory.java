/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.language.structure.StructurePackage
 * @generated
 */
public interface StructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureFactory eINSTANCE = org.kermeta.language.structure.impl.StructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Type Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Variable Binding</em>'.
	 * @generated
	 */
	TypeVariableBinding createTypeVariableBinding();

	/**
	 * Returns a new object of class '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Element</em>'.
	 * @generated
	 */
	MultiplicityElement createMultiplicityElement();

	/**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
	TypeDefinition createTypeDefinition();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Definition</em>'.
	 * @generated
	 */
	ClassDefinition createClassDefinition();

	/**
	 * Returns a new object of class '<em>Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Unit</em>'.
	 * @generated
	 */
	ModelingUnit createModelingUnit();

	/**
	 * Returns a new object of class '<em>Type Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition Container</em>'.
	 * @generated
	 */
	TypeDefinitionContainer createTypeDefinitionContainer();

	/**
	 * Returns a new object of class '<em>Require</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require</em>'.
	 * @generated
	 */
	Require createRequire();

	/**
	 * Returns a new object of class '<em>Object Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Type Variable</em>'.
	 * @generated
	 */
	ObjectTypeVariable createObjectTypeVariable();

	/**
	 * Returns a new object of class '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Type</em>'.
	 * @generated
	 */
	ModelType createModelType();

	/**
	 * Returns a new object of class '<em>Model Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Type Variable</em>'.
	 * @generated
	 */
	ModelTypeVariable createModelTypeVariable();

	/**
	 * Returns a new object of class '<em>Virtual Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Type</em>'.
	 * @generated
	 */
	VirtualType createVirtualType();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Unresolved Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type</em>'.
	 * @generated
	 */
	UnresolvedType createUnresolvedType();

	/**
	 * Returns a new object of class '<em>Unresolved Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Property</em>'.
	 * @generated
	 */
	UnresolvedProperty createUnresolvedProperty();

	/**
	 * Returns a new object of class '<em>Unresolved Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Operation</em>'.
	 * @generated
	 */
	UnresolvedOperation createUnresolvedOperation();

	/**
	 * Returns a new object of class '<em>Using</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Using</em>'.
	 * @generated
	 */
	Using createUsing();

	/**
	 * Returns a new object of class '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Type</em>'.
	 * @generated
	 */
	ProductType createProductType();

	/**
	 * Returns a new object of class '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Type</em>'.
	 * @generated
	 */
	FunctionType createFunctionType();

	/**
	 * Returns a new object of class '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type</em>'.
	 * @generated
	 */
	VoidType createVoidType();

	/**
	 * Returns a new object of class '<em>Unresolved Inferred Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Inferred Type</em>'.
	 * @generated
	 */
	UnresolvedInferredType createUnresolvedInferredType();

	/**
	 * Returns a new object of class '<em>Unresolved Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Variable</em>'.
	 * @generated
	 */
	UnresolvedTypeVariable createUnresolvedTypeVariable();

	/**
	 * Returns a new object of class '<em>Simple Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Binding</em>'.
	 * @generated
	 */
	SimpleBinding createSimpleBinding();

	/**
	 * Returns a new object of class '<em>Adaptation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Binding</em>'.
	 * @generated
	 */
	AdaptationBinding createAdaptationBinding();

	/**
	 * Returns a new object of class '<em>Simple Class Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Class Definition Binding</em>'.
	 * @generated
	 */
	SimpleClassDefinitionBinding createSimpleClassDefinitionBinding();

	/**
	 * Returns a new object of class '<em>Complex Class Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Class Definition Binding</em>'.
	 * @generated
	 */
	ComplexClassDefinitionBinding createComplexClassDefinitionBinding();

	/**
	 * Returns a new object of class '<em>Simple Enumeration Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Enumeration Binding</em>'.
	 * @generated
	 */
	SimpleEnumerationBinding createSimpleEnumerationBinding();

	/**
	 * Returns a new object of class '<em>Complex Enumeration Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Enumeration Binding</em>'.
	 * @generated
	 */
	ComplexEnumerationBinding createComplexEnumerationBinding();

	/**
	 * Returns a new object of class '<em>Simple Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Property Binding</em>'.
	 * @generated
	 */
	SimplePropertyBinding createSimplePropertyBinding();

	/**
	 * Returns a new object of class '<em>Complex Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Property Binding</em>'.
	 * @generated
	 */
	ComplexPropertyBinding createComplexPropertyBinding();

	/**
	 * Returns a new object of class '<em>Simple Operation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Operation Binding</em>'.
	 * @generated
	 */
	SimpleOperationBinding createSimpleOperationBinding();

	/**
	 * Returns a new object of class '<em>Complex Operation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Operation Binding</em>'.
	 * @generated
	 */
	ComplexOperationBinding createComplexOperationBinding();

	/**
	 * Returns a new object of class '<em>Simple Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Parameter Binding</em>'.
	 * @generated
	 */
	SimpleParameterBinding createSimpleParameterBinding();

	/**
	 * Returns a new object of class '<em>Complex Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Parameter Binding</em>'.
	 * @generated
	 */
	ComplexParameterBinding createComplexParameterBinding();

	/**
	 * Returns a new object of class '<em>Enum Literalbinding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literalbinding</em>'.
	 * @generated
	 */
	EnumLiteralbinding createEnumLiteralbinding();

	/**
	 * Returns a new object of class '<em>Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Operator</em>'.
	 * @generated
	 */
	AdaptationOperator createAdaptationOperator();

	/**
	 * Returns a new object of class '<em>Use Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Adaptation Operator</em>'.
	 * @generated
	 */
	UseAdaptationOperator createUseAdaptationOperator();

	/**
	 * Returns a new object of class '<em>Property Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Adaptation Operator</em>'.
	 * @generated
	 */
	PropertyAdaptationOperator createPropertyAdaptationOperator();

	/**
	 * Returns a new object of class '<em>Unresolved Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Adaptation Operator</em>'.
	 * @generated
	 */
	UnresolvedAdaptationOperator createUnresolvedAdaptationOperator();

	/**
	 * Returns a new object of class '<em>Adaptation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Parameter</em>'.
	 * @generated
	 */
	AdaptationParameter createAdaptationParameter();

	/**
	 * Returns a new object of class '<em>Operation Adaptation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Adaptation Operator</em>'.
	 * @generated
	 */
	OperationAdaptationOperator createOperationAdaptationOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructurePackage getStructurePackage();

} //StructureFactory
