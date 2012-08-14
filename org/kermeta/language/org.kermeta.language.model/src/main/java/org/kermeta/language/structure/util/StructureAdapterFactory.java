/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.language.structure.AbstractOperation;
import org.kermeta.language.structure.AbstractProperty;
import org.kermeta.language.structure.AdaptationBinding;
import org.kermeta.language.structure.AdaptationOperator;
import org.kermeta.language.structure.AdaptationParameter;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ClassDefinitionBinding;
import org.kermeta.language.structure.ComplexClassDefinitionBinding;
import org.kermeta.language.structure.ComplexEnumerationBinding;
import org.kermeta.language.structure.ComplexOperationBinding;
import org.kermeta.language.structure.ComplexParameterBinding;
import org.kermeta.language.structure.ComplexPropertyBinding;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.DataType;
import org.kermeta.language.structure.EnumLiteralbinding;
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.EnumerationBinding;
import org.kermeta.language.structure.EnumerationLiteral;
import org.kermeta.language.structure.FunctionType;
import org.kermeta.language.structure.GenericTypeDefinition;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Model;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.ModelTypeBinding;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.MultiplicityElement;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.ObjectTypeVariable;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.OperationAdaptationOperator;
import org.kermeta.language.structure.OperationBinding;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.ParameterBinding;
import org.kermeta.language.structure.ParameterizedType;
import org.kermeta.language.structure.PrimitiveType;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.PropertyAdaptationOperator;
import org.kermeta.language.structure.PropertyBinding;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.SimpleBinding;
import org.kermeta.language.structure.SimpleClassDefinitionBinding;
import org.kermeta.language.structure.SimpleEnumerationBinding;
import org.kermeta.language.structure.SimpleOperationBinding;
import org.kermeta.language.structure.SimpleParameterBinding;
import org.kermeta.language.structure.SimplePropertyBinding;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeDefinitionContainer;
import org.kermeta.language.structure.TypeVariable;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.structure.TypedElement;
import org.kermeta.language.structure.Unresolved;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.language.structure.StructurePackage
 * @generated
 */
public class StructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureSwitch<Adapter> modelSwitch =
		new StructureSwitch<Adapter>() {
			@Override
			public Adapter caseKermetaModelElement(KermetaModelElement object) {
				return createKermetaModelElementAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeContainer(TypeContainer object) {
				return createTypeContainerAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseTypeVariableBinding(TypeVariableBinding object) {
				return createTypeVariableBindingAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseClass(org.kermeta.language.structure.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePackage(org.kermeta.language.structure.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseAbstractProperty(AbstractProperty object) {
				return createAbstractPropertyAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseClassDefinition(ClassDefinition object) {
				return createClassDefinitionAdapter();
			}
			@Override
			public Adapter caseModelingUnit(ModelingUnit object) {
				return createModelingUnitAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionContainer(TypeDefinitionContainer object) {
				return createTypeDefinitionContainerAdapter();
			}
			@Override
			public Adapter caseRequire(Require object) {
				return createRequireAdapter();
			}
			@Override
			public Adapter caseGenericTypeDefinition(GenericTypeDefinition object) {
				return createGenericTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseParameterizedType(ParameterizedType object) {
				return createParameterizedTypeAdapter();
			}
			@Override
			public Adapter caseTypeVariable(TypeVariable object) {
				return createTypeVariableAdapter();
			}
			@Override
			public Adapter caseObjectTypeVariable(ObjectTypeVariable object) {
				return createObjectTypeVariableAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseModelTypeVariable(ModelTypeVariable object) {
				return createModelTypeVariableAdapter();
			}
			@Override
			public Adapter caseVirtualType(VirtualType object) {
				return createVirtualTypeAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseAbstractOperation(AbstractOperation object) {
				return createAbstractOperationAdapter();
			}
			@Override
			public Adapter caseUnresolvedType(UnresolvedType object) {
				return createUnresolvedTypeAdapter();
			}
			@Override
			public Adapter caseUnresolved(Unresolved object) {
				return createUnresolvedAdapter();
			}
			@Override
			public Adapter caseUnresolvedProperty(UnresolvedProperty object) {
				return createUnresolvedPropertyAdapter();
			}
			@Override
			public Adapter caseUnresolvedOperation(UnresolvedOperation object) {
				return createUnresolvedOperationAdapter();
			}
			@Override
			public Adapter caseUsing(Using object) {
				return createUsingAdapter();
			}
			@Override
			public Adapter caseProductType(ProductType object) {
				return createProductTypeAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseUnresolvedInferredType(UnresolvedInferredType object) {
				return createUnresolvedInferredTypeAdapter();
			}
			@Override
			public Adapter caseUnresolvedTypeVariable(UnresolvedTypeVariable object) {
				return createUnresolvedTypeVariableAdapter();
			}
			@Override
			public Adapter caseModelTypeBinding(ModelTypeBinding object) {
				return createModelTypeBindingAdapter();
			}
			@Override
			public Adapter caseSimpleBinding(SimpleBinding object) {
				return createSimpleBindingAdapter();
			}
			@Override
			public Adapter caseAdaptationBinding(AdaptationBinding object) {
				return createAdaptationBindingAdapter();
			}
			@Override
			public Adapter caseClassDefinitionBinding(ClassDefinitionBinding object) {
				return createClassDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseSimpleClassDefinitionBinding(SimpleClassDefinitionBinding object) {
				return createSimpleClassDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseComplexClassDefinitionBinding(ComplexClassDefinitionBinding object) {
				return createComplexClassDefinitionBindingAdapter();
			}
			@Override
			public Adapter caseEnumerationBinding(EnumerationBinding object) {
				return createEnumerationBindingAdapter();
			}
			@Override
			public Adapter caseSimpleEnumerationBinding(SimpleEnumerationBinding object) {
				return createSimpleEnumerationBindingAdapter();
			}
			@Override
			public Adapter caseComplexEnumerationBinding(ComplexEnumerationBinding object) {
				return createComplexEnumerationBindingAdapter();
			}
			@Override
			public Adapter casePropertyBinding(PropertyBinding object) {
				return createPropertyBindingAdapter();
			}
			@Override
			public Adapter caseOperationBinding(OperationBinding object) {
				return createOperationBindingAdapter();
			}
			@Override
			public Adapter caseSimplePropertyBinding(SimplePropertyBinding object) {
				return createSimplePropertyBindingAdapter();
			}
			@Override
			public Adapter caseComplexPropertyBinding(ComplexPropertyBinding object) {
				return createComplexPropertyBindingAdapter();
			}
			@Override
			public Adapter caseSimpleOperationBinding(SimpleOperationBinding object) {
				return createSimpleOperationBindingAdapter();
			}
			@Override
			public Adapter caseComplexOperationBinding(ComplexOperationBinding object) {
				return createComplexOperationBindingAdapter();
			}
			@Override
			public Adapter caseParameterBinding(ParameterBinding object) {
				return createParameterBindingAdapter();
			}
			@Override
			public Adapter caseSimpleParameterBinding(SimpleParameterBinding object) {
				return createSimpleParameterBindingAdapter();
			}
			@Override
			public Adapter caseComplexParameterBinding(ComplexParameterBinding object) {
				return createComplexParameterBindingAdapter();
			}
			@Override
			public Adapter caseEnumLiteralbinding(EnumLiteralbinding object) {
				return createEnumLiteralbindingAdapter();
			}
			@Override
			public Adapter caseAdaptationOperator(AdaptationOperator object) {
				return createAdaptationOperatorAdapter();
			}
			@Override
			public Adapter caseUseAdaptationOperator(UseAdaptationOperator object) {
				return createUseAdaptationOperatorAdapter();
			}
			@Override
			public Adapter casePropertyAdaptationOperator(PropertyAdaptationOperator object) {
				return createPropertyAdaptationOperatorAdapter();
			}
			@Override
			public Adapter caseUnresolvedAdaptationOperator(UnresolvedAdaptationOperator object) {
				return createUnresolvedAdaptationOperatorAdapter();
			}
			@Override
			public Adapter caseAdaptationParameter(AdaptationParameter object) {
				return createAdaptationParameterAdapter();
			}
			@Override
			public Adapter caseOperationAdaptationOperator(OperationAdaptationOperator object) {
				return createOperationAdaptationOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.KermetaModelElement <em>Kermeta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.KermetaModelElement
	 * @generated
	 */
	public Adapter createKermetaModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.TypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.TypeContainer
	 * @generated
	 */
	public Adapter createTypeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.TypeVariableBinding <em>Type Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.TypeVariableBinding
	 * @generated
	 */
	public Adapter createTypeVariableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.AbstractProperty
	 * @generated
	 */
	public Adapter createAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ClassDefinition <em>Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ClassDefinition
	 * @generated
	 */
	public Adapter createClassDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ModelingUnit <em>Modeling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ModelingUnit
	 * @generated
	 */
	public Adapter createModelingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.TypeDefinitionContainer <em>Type Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.TypeDefinitionContainer
	 * @generated
	 */
	public Adapter createTypeDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Require
	 * @generated
	 */
	public Adapter createRequireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.GenericTypeDefinition <em>Generic Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.GenericTypeDefinition
	 * @generated
	 */
	public Adapter createGenericTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ParameterizedType <em>Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ParameterizedType
	 * @generated
	 */
	public Adapter createParameterizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.TypeVariable <em>Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.TypeVariable
	 * @generated
	 */
	public Adapter createTypeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ObjectTypeVariable <em>Object Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ObjectTypeVariable
	 * @generated
	 */
	public Adapter createObjectTypeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ModelTypeVariable <em>Model Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ModelTypeVariable
	 * @generated
	 */
	public Adapter createModelTypeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.VirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.VirtualType
	 * @generated
	 */
	public Adapter createVirtualTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.AbstractOperation <em>Abstract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.AbstractOperation
	 * @generated
	 */
	public Adapter createAbstractOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UnresolvedType <em>Unresolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UnresolvedType
	 * @generated
	 */
	public Adapter createUnresolvedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Unresolved <em>Unresolved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Unresolved
	 * @generated
	 */
	public Adapter createUnresolvedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UnresolvedProperty <em>Unresolved Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UnresolvedProperty
	 * @generated
	 */
	public Adapter createUnresolvedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UnresolvedOperation <em>Unresolved Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UnresolvedOperation
	 * @generated
	 */
	public Adapter createUnresolvedOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.Using <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.Using
	 * @generated
	 */
	public Adapter createUsingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ProductType
	 * @generated
	 */
	public Adapter createProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UnresolvedInferredType <em>Unresolved Inferred Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UnresolvedInferredType
	 * @generated
	 */
	public Adapter createUnresolvedInferredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UnresolvedTypeVariable <em>Unresolved Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UnresolvedTypeVariable
	 * @generated
	 */
	public Adapter createUnresolvedTypeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ModelTypeBinding <em>Model Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ModelTypeBinding
	 * @generated
	 */
	public Adapter createModelTypeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.SimpleBinding <em>Simple Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.SimpleBinding
	 * @generated
	 */
	public Adapter createSimpleBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.AdaptationBinding <em>Adaptation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.AdaptationBinding
	 * @generated
	 */
	public Adapter createAdaptationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ClassDefinitionBinding <em>Class Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ClassDefinitionBinding
	 * @generated
	 */
	public Adapter createClassDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.SimpleClassDefinitionBinding <em>Simple Class Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.SimpleClassDefinitionBinding
	 * @generated
	 */
	public Adapter createSimpleClassDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ComplexClassDefinitionBinding <em>Complex Class Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ComplexClassDefinitionBinding
	 * @generated
	 */
	public Adapter createComplexClassDefinitionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.EnumerationBinding <em>Enumeration Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.EnumerationBinding
	 * @generated
	 */
	public Adapter createEnumerationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.SimpleEnumerationBinding <em>Simple Enumeration Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.SimpleEnumerationBinding
	 * @generated
	 */
	public Adapter createSimpleEnumerationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ComplexEnumerationBinding <em>Complex Enumeration Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ComplexEnumerationBinding
	 * @generated
	 */
	public Adapter createComplexEnumerationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.PropertyBinding <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.PropertyBinding
	 * @generated
	 */
	public Adapter createPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.OperationBinding <em>Operation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.OperationBinding
	 * @generated
	 */
	public Adapter createOperationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.SimplePropertyBinding <em>Simple Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.SimplePropertyBinding
	 * @generated
	 */
	public Adapter createSimplePropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ComplexPropertyBinding <em>Complex Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ComplexPropertyBinding
	 * @generated
	 */
	public Adapter createComplexPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.SimpleOperationBinding <em>Simple Operation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.SimpleOperationBinding
	 * @generated
	 */
	public Adapter createSimpleOperationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ComplexOperationBinding <em>Complex Operation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ComplexOperationBinding
	 * @generated
	 */
	public Adapter createComplexOperationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ParameterBinding
	 * @generated
	 */
	public Adapter createParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.SimpleParameterBinding <em>Simple Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.SimpleParameterBinding
	 * @generated
	 */
	public Adapter createSimpleParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.ComplexParameterBinding <em>Complex Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.ComplexParameterBinding
	 * @generated
	 */
	public Adapter createComplexParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.EnumLiteralbinding <em>Enum Literalbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.EnumLiteralbinding
	 * @generated
	 */
	public Adapter createEnumLiteralbindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.AdaptationOperator <em>Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.AdaptationOperator
	 * @generated
	 */
	public Adapter createAdaptationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UseAdaptationOperator <em>Use Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UseAdaptationOperator
	 * @generated
	 */
	public Adapter createUseAdaptationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.PropertyAdaptationOperator <em>Property Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.PropertyAdaptationOperator
	 * @generated
	 */
	public Adapter createPropertyAdaptationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.UnresolvedAdaptationOperator <em>Unresolved Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.UnresolvedAdaptationOperator
	 * @generated
	 */
	public Adapter createUnresolvedAdaptationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.AdaptationParameter <em>Adaptation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.AdaptationParameter
	 * @generated
	 */
	public Adapter createAdaptationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.language.structure.OperationAdaptationOperator <em>Operation Adaptation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.language.structure.OperationAdaptationOperator
	 * @generated
	 */
	public Adapter createOperationAdaptationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StructureAdapterFactory
