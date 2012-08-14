/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.language.structure.AdaptationBinding;
import org.kermeta.language.structure.AdaptationOperator;
import org.kermeta.language.structure.AdaptationParameter;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ComplexClassDefinitionBinding;
import org.kermeta.language.structure.ComplexEnumerationBinding;
import org.kermeta.language.structure.ComplexOperationBinding;
import org.kermeta.language.structure.ComplexParameterBinding;
import org.kermeta.language.structure.ComplexPropertyBinding;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.ConstraintLanguage;
import org.kermeta.language.structure.ConstraintType;
import org.kermeta.language.structure.EnumLiteralbinding;
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.EnumerationLiteral;
import org.kermeta.language.structure.FunctionType;
import org.kermeta.language.structure.Model;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.MultiplicityElement;
import org.kermeta.language.structure.ObjectTypeVariable;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.OperationAdaptationOperator;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.PrimitiveType;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.PropertyAdaptationOperator;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.SimpleBinding;
import org.kermeta.language.structure.SimpleClassDefinitionBinding;
import org.kermeta.language.structure.SimpleEnumerationBinding;
import org.kermeta.language.structure.SimpleOperationBinding;
import org.kermeta.language.structure.SimpleParameterBinding;
import org.kermeta.language.structure.SimplePropertyBinding;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeDefinitionContainer;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.structure.UnresolvedAdaptationOperator;
import org.kermeta.language.structure.UnresolvedInferredType;
import org.kermeta.language.structure.UnresolvedOperation;
import org.kermeta.language.structure.UnresolvedProperty;
import org.kermeta.language.structure.UnresolvedType;
import org.kermeta.language.structure.UnresolvedTypeVariable;
import org.kermeta.language.structure.UseAdaptationOperator;
import org.kermeta.language.structure.Using;
import org.kermeta.language.structure.VirtualType;
import org.kermeta.language.structure.VoidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureFactoryImpl extends EFactoryImpl implements StructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureFactory init() {
		try {
			StructureFactory theStructureFactory = (StructureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kermeta/2_0_0//org/kermeta/language/structure"); 
			if (theStructureFactory != null) {
				return theStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructurePackage.OPERATION: return createOperation();
			case StructurePackage.PROPERTY: return createProperty();
			case StructurePackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case StructurePackage.TYPE_VARIABLE_BINDING: return createTypeVariableBinding();
			case StructurePackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
			case StructurePackage.TYPE_DEFINITION: return createTypeDefinition();
			case StructurePackage.CLASS: return createClass();
			case StructurePackage.ENUMERATION: return createEnumeration();
			case StructurePackage.PACKAGE: return createPackage();
			case StructurePackage.PARAMETER: return createParameter();
			case StructurePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case StructurePackage.TAG: return createTag();
			case StructurePackage.CONSTRAINT: return createConstraint();
			case StructurePackage.CLASS_DEFINITION: return createClassDefinition();
			case StructurePackage.MODELING_UNIT: return createModelingUnit();
			case StructurePackage.TYPE_DEFINITION_CONTAINER: return createTypeDefinitionContainer();
			case StructurePackage.REQUIRE: return createRequire();
			case StructurePackage.OBJECT_TYPE_VARIABLE: return createObjectTypeVariable();
			case StructurePackage.MODEL_TYPE: return createModelType();
			case StructurePackage.MODEL_TYPE_VARIABLE: return createModelTypeVariable();
			case StructurePackage.VIRTUAL_TYPE: return createVirtualType();
			case StructurePackage.MODEL: return createModel();
			case StructurePackage.UNRESOLVED_TYPE: return createUnresolvedType();
			case StructurePackage.UNRESOLVED_PROPERTY: return createUnresolvedProperty();
			case StructurePackage.UNRESOLVED_OPERATION: return createUnresolvedOperation();
			case StructurePackage.USING: return createUsing();
			case StructurePackage.PRODUCT_TYPE: return createProductType();
			case StructurePackage.FUNCTION_TYPE: return createFunctionType();
			case StructurePackage.VOID_TYPE: return createVoidType();
			case StructurePackage.UNRESOLVED_INFERRED_TYPE: return createUnresolvedInferredType();
			case StructurePackage.UNRESOLVED_TYPE_VARIABLE: return createUnresolvedTypeVariable();
			case StructurePackage.SIMPLE_BINDING: return createSimpleBinding();
			case StructurePackage.ADAPTATION_BINDING: return createAdaptationBinding();
			case StructurePackage.SIMPLE_CLASS_DEFINITION_BINDING: return createSimpleClassDefinitionBinding();
			case StructurePackage.COMPLEX_CLASS_DEFINITION_BINDING: return createComplexClassDefinitionBinding();
			case StructurePackage.SIMPLE_ENUMERATION_BINDING: return createSimpleEnumerationBinding();
			case StructurePackage.COMPLEX_ENUMERATION_BINDING: return createComplexEnumerationBinding();
			case StructurePackage.SIMPLE_PROPERTY_BINDING: return createSimplePropertyBinding();
			case StructurePackage.COMPLEX_PROPERTY_BINDING: return createComplexPropertyBinding();
			case StructurePackage.SIMPLE_OPERATION_BINDING: return createSimpleOperationBinding();
			case StructurePackage.COMPLEX_OPERATION_BINDING: return createComplexOperationBinding();
			case StructurePackage.SIMPLE_PARAMETER_BINDING: return createSimpleParameterBinding();
			case StructurePackage.COMPLEX_PARAMETER_BINDING: return createComplexParameterBinding();
			case StructurePackage.ENUM_LITERALBINDING: return createEnumLiteralbinding();
			case StructurePackage.ADAPTATION_OPERATOR: return createAdaptationOperator();
			case StructurePackage.USE_ADAPTATION_OPERATOR: return createUseAdaptationOperator();
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR: return createPropertyAdaptationOperator();
			case StructurePackage.UNRESOLVED_ADAPTATION_OPERATOR: return createUnresolvedAdaptationOperator();
			case StructurePackage.ADAPTATION_PARAMETER: return createAdaptationParameter();
			case StructurePackage.OPERATION_ADAPTATION_OPERATOR: return createOperationAdaptationOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StructurePackage.CONSTRAINT_LANGUAGE:
				return createConstraintLanguageFromString(eDataType, initialValue);
			case StructurePackage.CONSTRAINT_TYPE:
				return createConstraintTypeFromString(eDataType, initialValue);
			case StructurePackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case StructurePackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case StructurePackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case StructurePackage.UNLIMITED_NATURAL:
				return createUnlimitedNaturalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StructurePackage.CONSTRAINT_LANGUAGE:
				return convertConstraintLanguageToString(eDataType, instanceValue);
			case StructurePackage.CONSTRAINT_TYPE:
				return convertConstraintTypeToString(eDataType, instanceValue);
			case StructurePackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case StructurePackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case StructurePackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case StructurePackage.UNLIMITED_NATURAL:
				return convertUnlimitedNaturalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVariableBinding createTypeVariableBinding() {
		TypeVariableBindingImpl typeVariableBinding = new TypeVariableBindingImpl();
		return typeVariableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement createMultiplicityElement() {
		MultiplicityElementImpl multiplicityElement = new MultiplicityElementImpl();
		return multiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.kermeta.language.structure.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.kermeta.language.structure.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition createClassDefinition() {
		ClassDefinitionImpl classDefinition = new ClassDefinitionImpl();
		return classDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnit createModelingUnit() {
		ModelingUnitImpl modelingUnit = new ModelingUnitImpl();
		return modelingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionContainer createTypeDefinitionContainer() {
		TypeDefinitionContainerImpl typeDefinitionContainer = new TypeDefinitionContainerImpl();
		return typeDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Require createRequire() {
		RequireImpl require = new RequireImpl();
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeVariable createObjectTypeVariable() {
		ObjectTypeVariableImpl objectTypeVariable = new ObjectTypeVariableImpl();
		return objectTypeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeVariable createModelTypeVariable() {
		ModelTypeVariableImpl modelTypeVariable = new ModelTypeVariableImpl();
		return modelTypeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualType createVirtualType() {
		VirtualTypeImpl virtualType = new VirtualTypeImpl();
		return virtualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedType createUnresolvedType() {
		UnresolvedTypeImpl unresolvedType = new UnresolvedTypeImpl();
		return unresolvedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedProperty createUnresolvedProperty() {
		UnresolvedPropertyImpl unresolvedProperty = new UnresolvedPropertyImpl();
		return unresolvedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedOperation createUnresolvedOperation() {
		UnresolvedOperationImpl unresolvedOperation = new UnresolvedOperationImpl();
		return unresolvedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Using createUsing() {
		UsingImpl using = new UsingImpl();
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedInferredType createUnresolvedInferredType() {
		UnresolvedInferredTypeImpl unresolvedInferredType = new UnresolvedInferredTypeImpl();
		return unresolvedInferredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedTypeVariable createUnresolvedTypeVariable() {
		UnresolvedTypeVariableImpl unresolvedTypeVariable = new UnresolvedTypeVariableImpl();
		return unresolvedTypeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleBinding createSimpleBinding() {
		SimpleBindingImpl simpleBinding = new SimpleBindingImpl();
		return simpleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationBinding createAdaptationBinding() {
		AdaptationBindingImpl adaptationBinding = new AdaptationBindingImpl();
		return adaptationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassDefinitionBinding createSimpleClassDefinitionBinding() {
		SimpleClassDefinitionBindingImpl simpleClassDefinitionBinding = new SimpleClassDefinitionBindingImpl();
		return simpleClassDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexClassDefinitionBinding createComplexClassDefinitionBinding() {
		ComplexClassDefinitionBindingImpl complexClassDefinitionBinding = new ComplexClassDefinitionBindingImpl();
		return complexClassDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEnumerationBinding createSimpleEnumerationBinding() {
		SimpleEnumerationBindingImpl simpleEnumerationBinding = new SimpleEnumerationBindingImpl();
		return simpleEnumerationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEnumerationBinding createComplexEnumerationBinding() {
		ComplexEnumerationBindingImpl complexEnumerationBinding = new ComplexEnumerationBindingImpl();
		return complexEnumerationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePropertyBinding createSimplePropertyBinding() {
		SimplePropertyBindingImpl simplePropertyBinding = new SimplePropertyBindingImpl();
		return simplePropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexPropertyBinding createComplexPropertyBinding() {
		ComplexPropertyBindingImpl complexPropertyBinding = new ComplexPropertyBindingImpl();
		return complexPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperationBinding createSimpleOperationBinding() {
		SimpleOperationBindingImpl simpleOperationBinding = new SimpleOperationBindingImpl();
		return simpleOperationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexOperationBinding createComplexOperationBinding() {
		ComplexOperationBindingImpl complexOperationBinding = new ComplexOperationBindingImpl();
		return complexOperationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParameterBinding createSimpleParameterBinding() {
		SimpleParameterBindingImpl simpleParameterBinding = new SimpleParameterBindingImpl();
		return simpleParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexParameterBinding createComplexParameterBinding() {
		ComplexParameterBindingImpl complexParameterBinding = new ComplexParameterBindingImpl();
		return complexParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralbinding createEnumLiteralbinding() {
		EnumLiteralbindingImpl enumLiteralbinding = new EnumLiteralbindingImpl();
		return enumLiteralbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationOperator createAdaptationOperator() {
		AdaptationOperatorImpl adaptationOperator = new AdaptationOperatorImpl();
		return adaptationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseAdaptationOperator createUseAdaptationOperator() {
		UseAdaptationOperatorImpl useAdaptationOperator = new UseAdaptationOperatorImpl();
		return useAdaptationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAdaptationOperator createPropertyAdaptationOperator() {
		PropertyAdaptationOperatorImpl propertyAdaptationOperator = new PropertyAdaptationOperatorImpl();
		return propertyAdaptationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedAdaptationOperator createUnresolvedAdaptationOperator() {
		UnresolvedAdaptationOperatorImpl unresolvedAdaptationOperator = new UnresolvedAdaptationOperatorImpl();
		return unresolvedAdaptationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationParameter createAdaptationParameter() {
		AdaptationParameterImpl adaptationParameter = new AdaptationParameterImpl();
		return adaptationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAdaptationOperator createOperationAdaptationOperator() {
		OperationAdaptationOperatorImpl operationAdaptationOperator = new OperationAdaptationOperatorImpl();
		return operationAdaptationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintLanguage createConstraintLanguageFromString(EDataType eDataType, String initialValue) {
		ConstraintLanguage result = ConstraintLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue) {
		ConstraintType result = ConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createUnlimitedNaturalFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedNaturalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurePackage getStructurePackage() {
		return (StructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructurePackage getPackage() {
		return StructurePackage.eINSTANCE;
	}

} //StructureFactoryImpl
