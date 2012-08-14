/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;


import org.OrgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.impl.OrgPackageImpl;
import org.kermeta.KmPackage;
import org.kermeta.impl.KmPackageImpl;

import org.kermeta.language.LanguagePackage;

import org.kermeta.language.behavior.BehaviorPackage;

import org.kermeta.language.behavior.impl.BehaviorPackageImpl;

import org.kermeta.language.impl.LanguagePackageImpl;

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
import org.kermeta.language.structure.ConstraintLanguage;
import org.kermeta.language.structure.ConstraintType;
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
import org.kermeta.language.structure.StructureFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePackageImpl extends EPackageImpl implements StructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeVariableBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedInferredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDefinitionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleClassDefinitionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexClassDefinitionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEnumerationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEnumerationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexPropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleOperationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexOperationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralbindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useAdaptationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAdaptationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedAdaptationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAdaptationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.kermeta.language.structure.StructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurePackageImpl() {
		super(eNS_URI, StructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init() {
		if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OrgPackageImpl theOrgPackage = (OrgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) instanceof OrgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrgPackage.eNS_URI) : OrgPackage.eINSTANCE);
		KmPackageImpl theKmPackage = (KmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI) instanceof KmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI) : KmPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theOrgPackage.createPackageContents();
		theKmPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theOrgPackage.initializePackageContents();
		theKmPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI, theStructurePackage);
		return theStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaModelElement() {
		return kermetaModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaModelElement_KTag() {
		return (EReference)kermetaModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaModelElement_KOwnedTags() {
		return (EReference)kermetaModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermetaModelElement_KType() {
		return (EReference)kermetaModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAbstract() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RaisedException() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedParameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Pre() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Post() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Body() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_SuperOperation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedUnresolvedOperations() {
		return (EReference)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwningClass() {
		return (EReference)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_TypeParameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_UniqueName() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsReadOnly() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsID() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_GetterBody() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SetterBody() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsGetterAbstract() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsSetterAbstract() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwnedUnresolvedProperties() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningClass() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_TypeContainer() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeContainer() {
		return typeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainer_ContainedType() {
		return (EReference)typeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeVariableBinding() {
		return typeVariableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariableBinding_Variable() {
		return (EReference)typeVariableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariableBinding_Type() {
		return (EReference)typeVariableBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinition_IsAspect() {
		return (EAttribute)typeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_SuperType() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedAttribute() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsAbstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uri() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedAdaptationOperators() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType_InstanceType() {
		return (EReference)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Value() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Object() {
		return (EReference)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProperty() {
		return abstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Body() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Stereotype() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Language() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_InvOwner() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PreOwner() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PostOwner() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDefinition() {
		return classDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_Inv() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDefinition_IsAbstract() {
		return (EAttribute)classDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedAttribute() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedOperation() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDefinition_IsSingleton() {
		return (EAttribute)classDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDefinition_IsFinal() {
		return (EAttribute)classDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingUnit() {
		return modelingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Packages() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelingUnit_NamespacePrefix() {
		return (EAttribute)modelingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Requires() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionContainer() {
		return typeDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinitionContainer_OwnedTypeDefinition() {
		return (EReference)typeDefinitionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequire() {
		return requireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequire_Uri() {
		return (EAttribute)requireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTypeDefinition() {
		return genericTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTypeDefinition_TypeParameter() {
		return (EReference)genericTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedType() {
		return parameterizedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_VirtualTypeBinding() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_TypeParamBinding() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_TypeDefinition() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeVariable() {
		return typeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariable_Supertype() {
		return (EReference)typeVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeVariable() {
		return objectTypeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_OwnedBindings() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_OwnedPackages() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTypeVariable() {
		return modelTypeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypeVariable_VirtualType() {
		return (EReference)modelTypeVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualType() {
		return virtualTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_ClassDefinition() {
		return (EReference)virtualTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_ModelType() {
		return (EReference)virtualTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_TypeParamBinding() {
		return (EReference)virtualTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Contents() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOperation() {
		return abstractOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedType() {
		return unresolvedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnresolvedType_TypeIdentifier() {
		return (EAttribute)unresolvedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnresolvedType_Usings() {
		return (EReference)unresolvedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnresolvedType_Generics() {
		return (EReference)unresolvedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolved() {
		return unresolvedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedProperty() {
		return unresolvedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnresolvedProperty_PropertyIdentifier() {
		return (EAttribute)unresolvedPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedOperation() {
		return unresolvedOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnresolvedOperation_OperationIdentifier() {
		return (EAttribute)unresolvedOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnresolvedOperation_From() {
		return (EReference)unresolvedOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsing() {
		return usingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsing_FromQName() {
		return (EAttribute)usingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsing_ToName() {
		return (EAttribute)usingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductType_Type() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Left() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Right() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidType() {
		return voidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedInferredType() {
		return unresolvedInferredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedTypeVariable() {
		return unresolvedTypeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTypeBinding() {
		return modelTypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypeBinding_BoundModelType() {
		return (EReference)modelTypeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleBinding() {
		return simpleBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleBinding_OwnedClassDefinitionBindings() {
		return (EReference)simpleBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleBinding_OwnedEnumerationBindings() {
		return (EReference)simpleBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationBinding() {
		return adaptationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationBinding_OwnedClassDefinitionBindings() {
		return (EReference)adaptationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationBinding_OwnedEnumerationBindings() {
		return (EReference)adaptationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationBinding_UsedAdaptationOperators() {
		return (EReference)adaptationBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDefinitionBinding() {
		return classDefinitionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleClassDefinitionBinding() {
		return simpleClassDefinitionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClassDefinitionBinding_OwnedPropertyBindings() {
		return (EReference)simpleClassDefinitionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClassDefinitionBinding_OwnedOperationBindings() {
		return (EReference)simpleClassDefinitionBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClassDefinitionBinding_Source() {
		return (EReference)simpleClassDefinitionBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClassDefinitionBinding_Target() {
		return (EReference)simpleClassDefinitionBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexClassDefinitionBinding() {
		return complexClassDefinitionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexClassDefinitionBinding_OwnedPropertyBindings() {
		return (EReference)complexClassDefinitionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexClassDefinitionBinding_OwnedOperationBindings() {
		return (EReference)complexClassDefinitionBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexClassDefinitionBinding_Sources() {
		return (EReference)complexClassDefinitionBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexClassDefinitionBinding_Targets() {
		return (EReference)complexClassDefinitionBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationBinding() {
		return enumerationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationBinding_OwnedEnumLiteralBindings() {
		return (EReference)enumerationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleEnumerationBinding() {
		return simpleEnumerationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleEnumerationBinding_Source() {
		return (EReference)simpleEnumerationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleEnumerationBinding_Target() {
		return (EReference)simpleEnumerationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexEnumerationBinding() {
		return complexEnumerationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEnumerationBinding_Sources() {
		return (EReference)complexEnumerationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEnumerationBinding_Targets() {
		return (EReference)complexEnumerationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyBinding() {
		return propertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationBinding() {
		return operationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplePropertyBinding() {
		return simplePropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePropertyBinding_Source() {
		return (EReference)simplePropertyBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePropertyBinding_Target() {
		return (EReference)simplePropertyBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexPropertyBinding() {
		return complexPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexPropertyBinding_Sources() {
		return (EReference)complexPropertyBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexPropertyBinding_Targets() {
		return (EReference)complexPropertyBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleOperationBinding() {
		return simpleOperationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperationBinding_Source() {
		return (EReference)simpleOperationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperationBinding_Target() {
		return (EReference)simpleOperationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleOperationBinding_OwnedParameterBindings() {
		return (EReference)simpleOperationBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexOperationBinding() {
		return complexOperationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexOperationBinding_Sources() {
		return (EReference)complexOperationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexOperationBinding_Targets() {
		return (EReference)complexOperationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexOperationBinding_OwnedParameterBindings() {
		return (EReference)complexOperationBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBinding() {
		return parameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParameterBinding() {
		return simpleParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParameterBinding_Source() {
		return (EReference)simpleParameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParameterBinding_Target() {
		return (EReference)simpleParameterBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexParameterBinding() {
		return complexParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexParameterBinding_Sources() {
		return (EReference)complexParameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexParameterBinding_Targets() {
		return (EReference)complexParameterBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralbinding() {
		return enumLiteralbindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralbinding_Sources() {
		return (EReference)enumLiteralbindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralbinding_Targets() {
		return (EReference)enumLiteralbindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationOperator() {
		return adaptationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationOperator_Parameters() {
		return (EReference)adaptationOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseAdaptationOperator() {
		return useAdaptationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseAdaptationOperator_Parameters() {
		return (EReference)useAdaptationOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseAdaptationOperator_OwnedUnresolved() {
		return (EReference)useAdaptationOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseAdaptationOperator_UsedOperator() {
		return (EReference)useAdaptationOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAdaptationOperator() {
		return propertyAdaptationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAdaptationOperator_Target() {
		return (EReference)propertyAdaptationOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAdaptationOperator_Getter() {
		return (EAttribute)propertyAdaptationOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAdaptationOperator_Setter() {
		return (EAttribute)propertyAdaptationOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAdaptationOperator_Adder() {
		return (EAttribute)propertyAdaptationOperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAdaptationOperator_Remover() {
		return (EAttribute)propertyAdaptationOperatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedAdaptationOperator() {
		return unresolvedAdaptationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationParameter() {
		return adaptationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAdaptationOperator() {
		return operationAdaptationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationAdaptationOperator_Body() {
		return (EAttribute)operationAdaptationOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationAdaptationOperator_Target() {
		return (EReference)operationAdaptationOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintLanguage() {
		return constraintLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactory getStructureFactory() {
		return (StructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kermetaModelElementEClass = createEClass(KERMETA_MODEL_ELEMENT);
		createEReference(kermetaModelElementEClass, KERMETA_MODEL_ELEMENT__KTAG);
		createEReference(kermetaModelElementEClass, KERMETA_MODEL_ELEMENT__KOWNED_TAGS);
		createEReference(kermetaModelElementEClass, KERMETA_MODEL_ELEMENT__KTYPE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__IS_ABSTRACT);
		createEReference(operationEClass, OPERATION__RAISED_EXCEPTION);
		createEReference(operationEClass, OPERATION__OWNED_PARAMETER);
		createEReference(operationEClass, OPERATION__PRE);
		createEReference(operationEClass, OPERATION__POST);
		createEReference(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__SUPER_OPERATION);
		createEReference(operationEClass, OPERATION__OWNED_UNRESOLVED_OPERATIONS);
		createEReference(operationEClass, OPERATION__OWNING_CLASS);
		createEReference(operationEClass, OPERATION__TYPE_PARAMETER);
		createEAttribute(operationEClass, OPERATION__UNIQUE_NAME);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_READ_ONLY);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__GETTER_BODY);
		createEReference(propertyEClass, PROPERTY__SETTER_BODY);
		createEAttribute(propertyEClass, PROPERTY__IS_GETTER_ABSTRACT);
		createEAttribute(propertyEClass, PROPERTY__IS_SETTER_ABSTRACT);
		createEReference(propertyEClass, PROPERTY__OWNED_UNRESOLVED_PROPERTIES);
		createEReference(propertyEClass, PROPERTY__OWNING_CLASS);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__TYPE_CONTAINER);

		typeContainerEClass = createEClass(TYPE_CONTAINER);
		createEReference(typeContainerEClass, TYPE_CONTAINER__CONTAINED_TYPE);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);

		typeVariableBindingEClass = createEClass(TYPE_VARIABLE_BINDING);
		createEReference(typeVariableBindingEClass, TYPE_VARIABLE_BINDING__VARIABLE);
		createEReference(typeVariableBindingEClass, TYPE_VARIABLE_BINDING__TYPE);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__SUPER_TYPE);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__IS_ASPECT);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_ATTRIBUTE);
		createEReference(classEClass, CLASS__OWNED_OPERATION);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEAttribute(classEClass, CLASS__IS_ABSTRACT);
		createEAttribute(classEClass, CLASS__NAME);

		dataTypeEClass = createEClass(DATA_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__URI);
		createEReference(packageEClass, PACKAGE__OWNED_ADAPTATION_OPERATORS);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEReference(primitiveTypeEClass, PRIMITIVE_TYPE__INSTANCE_TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__VALUE);
		createEReference(tagEClass, TAG__OBJECT);

		abstractPropertyEClass = createEClass(ABSTRACT_PROPERTY);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__BODY);
		createEAttribute(constraintEClass, CONSTRAINT__STEREOTYPE);
		createEAttribute(constraintEClass, CONSTRAINT__LANGUAGE);
		createEReference(constraintEClass, CONSTRAINT__INV_OWNER);
		createEReference(constraintEClass, CONSTRAINT__PRE_OWNER);
		createEReference(constraintEClass, CONSTRAINT__POST_OWNER);

		classDefinitionEClass = createEClass(CLASS_DEFINITION);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__INV);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__IS_ABSTRACT);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__OWNED_ATTRIBUTE);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__OWNED_OPERATION);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__IS_SINGLETON);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__IS_FINAL);

		modelingUnitEClass = createEClass(MODELING_UNIT);
		createEReference(modelingUnitEClass, MODELING_UNIT__PACKAGES);
		createEAttribute(modelingUnitEClass, MODELING_UNIT__NAMESPACE_PREFIX);
		createEReference(modelingUnitEClass, MODELING_UNIT__REQUIRES);

		typeDefinitionContainerEClass = createEClass(TYPE_DEFINITION_CONTAINER);
		createEReference(typeDefinitionContainerEClass, TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);

		requireEClass = createEClass(REQUIRE);
		createEAttribute(requireEClass, REQUIRE__URI);

		genericTypeDefinitionEClass = createEClass(GENERIC_TYPE_DEFINITION);
		createEReference(genericTypeDefinitionEClass, GENERIC_TYPE_DEFINITION__TYPE_PARAMETER);

		parameterizedTypeEClass = createEClass(PARAMETERIZED_TYPE);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE_PARAM_BINDING);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE_DEFINITION);

		typeVariableEClass = createEClass(TYPE_VARIABLE);
		createEReference(typeVariableEClass, TYPE_VARIABLE__SUPERTYPE);

		objectTypeVariableEClass = createEClass(OBJECT_TYPE_VARIABLE);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__OWNED_BINDINGS);
		createEReference(modelTypeEClass, MODEL_TYPE__OWNED_PACKAGES);

		modelTypeVariableEClass = createEClass(MODEL_TYPE_VARIABLE);
		createEReference(modelTypeVariableEClass, MODEL_TYPE_VARIABLE__VIRTUAL_TYPE);

		virtualTypeEClass = createEClass(VIRTUAL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__CLASS_DEFINITION);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__MODEL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__TYPE_PARAM_BINDING);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONTENTS);

		abstractOperationEClass = createEClass(ABSTRACT_OPERATION);

		unresolvedTypeEClass = createEClass(UNRESOLVED_TYPE);
		createEReference(unresolvedTypeEClass, UNRESOLVED_TYPE__USINGS);
		createEReference(unresolvedTypeEClass, UNRESOLVED_TYPE__GENERICS);
		createEAttribute(unresolvedTypeEClass, UNRESOLVED_TYPE__TYPE_IDENTIFIER);

		unresolvedEClass = createEClass(UNRESOLVED);

		unresolvedPropertyEClass = createEClass(UNRESOLVED_PROPERTY);
		createEAttribute(unresolvedPropertyEClass, UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER);

		unresolvedOperationEClass = createEClass(UNRESOLVED_OPERATION);
		createEAttribute(unresolvedOperationEClass, UNRESOLVED_OPERATION__OPERATION_IDENTIFIER);
		createEReference(unresolvedOperationEClass, UNRESOLVED_OPERATION__FROM);

		usingEClass = createEClass(USING);
		createEAttribute(usingEClass, USING__FROM_QNAME);
		createEAttribute(usingEClass, USING__TO_NAME);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEReference(productTypeEClass, PRODUCT_TYPE__TYPE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__LEFT);
		createEReference(functionTypeEClass, FUNCTION_TYPE__RIGHT);

		voidTypeEClass = createEClass(VOID_TYPE);

		unresolvedInferredTypeEClass = createEClass(UNRESOLVED_INFERRED_TYPE);

		unresolvedTypeVariableEClass = createEClass(UNRESOLVED_TYPE_VARIABLE);

		modelTypeBindingEClass = createEClass(MODEL_TYPE_BINDING);
		createEReference(modelTypeBindingEClass, MODEL_TYPE_BINDING__BOUND_MODEL_TYPE);

		simpleBindingEClass = createEClass(SIMPLE_BINDING);
		createEReference(simpleBindingEClass, SIMPLE_BINDING__OWNED_CLASS_DEFINITION_BINDINGS);
		createEReference(simpleBindingEClass, SIMPLE_BINDING__OWNED_ENUMERATION_BINDINGS);

		adaptationBindingEClass = createEClass(ADAPTATION_BINDING);
		createEReference(adaptationBindingEClass, ADAPTATION_BINDING__OWNED_CLASS_DEFINITION_BINDINGS);
		createEReference(adaptationBindingEClass, ADAPTATION_BINDING__OWNED_ENUMERATION_BINDINGS);
		createEReference(adaptationBindingEClass, ADAPTATION_BINDING__USED_ADAPTATION_OPERATORS);

		classDefinitionBindingEClass = createEClass(CLASS_DEFINITION_BINDING);

		simpleClassDefinitionBindingEClass = createEClass(SIMPLE_CLASS_DEFINITION_BINDING);
		createEReference(simpleClassDefinitionBindingEClass, SIMPLE_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS);
		createEReference(simpleClassDefinitionBindingEClass, SIMPLE_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS);
		createEReference(simpleClassDefinitionBindingEClass, SIMPLE_CLASS_DEFINITION_BINDING__SOURCE);
		createEReference(simpleClassDefinitionBindingEClass, SIMPLE_CLASS_DEFINITION_BINDING__TARGET);

		complexClassDefinitionBindingEClass = createEClass(COMPLEX_CLASS_DEFINITION_BINDING);
		createEReference(complexClassDefinitionBindingEClass, COMPLEX_CLASS_DEFINITION_BINDING__OWNED_PROPERTY_BINDINGS);
		createEReference(complexClassDefinitionBindingEClass, COMPLEX_CLASS_DEFINITION_BINDING__OWNED_OPERATION_BINDINGS);
		createEReference(complexClassDefinitionBindingEClass, COMPLEX_CLASS_DEFINITION_BINDING__SOURCES);
		createEReference(complexClassDefinitionBindingEClass, COMPLEX_CLASS_DEFINITION_BINDING__TARGETS);

		enumerationBindingEClass = createEClass(ENUMERATION_BINDING);
		createEReference(enumerationBindingEClass, ENUMERATION_BINDING__OWNED_ENUM_LITERAL_BINDINGS);

		simpleEnumerationBindingEClass = createEClass(SIMPLE_ENUMERATION_BINDING);
		createEReference(simpleEnumerationBindingEClass, SIMPLE_ENUMERATION_BINDING__SOURCE);
		createEReference(simpleEnumerationBindingEClass, SIMPLE_ENUMERATION_BINDING__TARGET);

		complexEnumerationBindingEClass = createEClass(COMPLEX_ENUMERATION_BINDING);
		createEReference(complexEnumerationBindingEClass, COMPLEX_ENUMERATION_BINDING__SOURCES);
		createEReference(complexEnumerationBindingEClass, COMPLEX_ENUMERATION_BINDING__TARGETS);

		propertyBindingEClass = createEClass(PROPERTY_BINDING);

		operationBindingEClass = createEClass(OPERATION_BINDING);

		simplePropertyBindingEClass = createEClass(SIMPLE_PROPERTY_BINDING);
		createEReference(simplePropertyBindingEClass, SIMPLE_PROPERTY_BINDING__SOURCE);
		createEReference(simplePropertyBindingEClass, SIMPLE_PROPERTY_BINDING__TARGET);

		complexPropertyBindingEClass = createEClass(COMPLEX_PROPERTY_BINDING);
		createEReference(complexPropertyBindingEClass, COMPLEX_PROPERTY_BINDING__SOURCES);
		createEReference(complexPropertyBindingEClass, COMPLEX_PROPERTY_BINDING__TARGETS);

		simpleOperationBindingEClass = createEClass(SIMPLE_OPERATION_BINDING);
		createEReference(simpleOperationBindingEClass, SIMPLE_OPERATION_BINDING__SOURCE);
		createEReference(simpleOperationBindingEClass, SIMPLE_OPERATION_BINDING__TARGET);
		createEReference(simpleOperationBindingEClass, SIMPLE_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS);

		complexOperationBindingEClass = createEClass(COMPLEX_OPERATION_BINDING);
		createEReference(complexOperationBindingEClass, COMPLEX_OPERATION_BINDING__SOURCES);
		createEReference(complexOperationBindingEClass, COMPLEX_OPERATION_BINDING__TARGETS);
		createEReference(complexOperationBindingEClass, COMPLEX_OPERATION_BINDING__OWNED_PARAMETER_BINDINGS);

		parameterBindingEClass = createEClass(PARAMETER_BINDING);

		simpleParameterBindingEClass = createEClass(SIMPLE_PARAMETER_BINDING);
		createEReference(simpleParameterBindingEClass, SIMPLE_PARAMETER_BINDING__SOURCE);
		createEReference(simpleParameterBindingEClass, SIMPLE_PARAMETER_BINDING__TARGET);

		complexParameterBindingEClass = createEClass(COMPLEX_PARAMETER_BINDING);
		createEReference(complexParameterBindingEClass, COMPLEX_PARAMETER_BINDING__SOURCES);
		createEReference(complexParameterBindingEClass, COMPLEX_PARAMETER_BINDING__TARGETS);

		enumLiteralbindingEClass = createEClass(ENUM_LITERALBINDING);
		createEReference(enumLiteralbindingEClass, ENUM_LITERALBINDING__SOURCES);
		createEReference(enumLiteralbindingEClass, ENUM_LITERALBINDING__TARGETS);

		adaptationOperatorEClass = createEClass(ADAPTATION_OPERATOR);
		createEReference(adaptationOperatorEClass, ADAPTATION_OPERATOR__PARAMETERS);

		useAdaptationOperatorEClass = createEClass(USE_ADAPTATION_OPERATOR);
		createEReference(useAdaptationOperatorEClass, USE_ADAPTATION_OPERATOR__PARAMETERS);
		createEReference(useAdaptationOperatorEClass, USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED);
		createEReference(useAdaptationOperatorEClass, USE_ADAPTATION_OPERATOR__USED_OPERATOR);

		propertyAdaptationOperatorEClass = createEClass(PROPERTY_ADAPTATION_OPERATOR);
		createEReference(propertyAdaptationOperatorEClass, PROPERTY_ADAPTATION_OPERATOR__TARGET);
		createEAttribute(propertyAdaptationOperatorEClass, PROPERTY_ADAPTATION_OPERATOR__GETTER);
		createEAttribute(propertyAdaptationOperatorEClass, PROPERTY_ADAPTATION_OPERATOR__SETTER);
		createEAttribute(propertyAdaptationOperatorEClass, PROPERTY_ADAPTATION_OPERATOR__ADDER);
		createEAttribute(propertyAdaptationOperatorEClass, PROPERTY_ADAPTATION_OPERATOR__REMOVER);

		unresolvedAdaptationOperatorEClass = createEClass(UNRESOLVED_ADAPTATION_OPERATOR);

		adaptationParameterEClass = createEClass(ADAPTATION_PARAMETER);

		operationAdaptationOperatorEClass = createEClass(OPERATION_ADAPTATION_OPERATOR);
		createEAttribute(operationAdaptationOperatorEClass, OPERATION_ADAPTATION_OPERATOR__BODY);
		createEReference(operationAdaptationOperatorEClass, OPERATION_ADAPTATION_OPERATOR__TARGET);

		// Create enums
		constraintLanguageEEnum = createEEnum(CONSTRAINT_LANGUAGE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getMultiplicityElement());
		operationEClass.getESuperTypes().add(this.getAbstractOperation());
		propertyEClass.getESuperTypes().add(this.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(this.getAbstractProperty());
		typeEClass.getESuperTypes().add(this.getKermetaModelElement());
		typeContainerEClass.getESuperTypes().add(this.getKermetaModelElement());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		typeVariableBindingEClass.getESuperTypes().add(this.getTypeContainer());
		typeVariableBindingEClass.getESuperTypes().add(this.getKermetaModelElement());
		multiplicityElementEClass.getESuperTypes().add(this.getTypedElement());
		typeDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		typeDefinitionEClass.getESuperTypes().add(this.getTypeContainer());
		classEClass.getESuperTypes().add(this.getParameterizedType());
		dataTypeEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		namedElementEClass.getESuperTypes().add(this.getKermetaModelElement());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getTypeDefinitionContainer());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		typedElementEClass.getESuperTypes().add(this.getTypeContainer());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		tagEClass.getESuperTypes().add(this.getKermetaModelElement());
		abstractPropertyEClass.getESuperTypes().add(this.getKermetaModelElement());
		constraintEClass.getESuperTypes().add(this.getNamedElement());
		classDefinitionEClass.getESuperTypes().add(this.getGenericTypeDefinition());
		modelingUnitEClass.getESuperTypes().add(this.getTypeDefinitionContainer());
		modelingUnitEClass.getESuperTypes().add(this.getKermetaModelElement());
		typeDefinitionContainerEClass.getESuperTypes().add(this.getNamedElement());
		requireEClass.getESuperTypes().add(this.getKermetaModelElement());
		genericTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		parameterizedTypeEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getTypeContainer());
		typeVariableEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getNamedElement());
		objectTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		modelTypeEClass.getESuperTypes().add(this.getType());
		modelTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		modelTypeEClass.getESuperTypes().add(this.getTypeDefinitionContainer());
		modelTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		virtualTypeEClass.getESuperTypes().add(this.getObjectTypeVariable());
		modelEClass.getESuperTypes().add(this.getKermetaModelElement());
		abstractOperationEClass.getESuperTypes().add(this.getKermetaModelElement());
		unresolvedTypeEClass.getESuperTypes().add(this.getType());
		unresolvedTypeEClass.getESuperTypes().add(this.getUnresolved());
		unresolvedTypeEClass.getESuperTypes().add(this.getTypeContainer());
		unresolvedEClass.getESuperTypes().add(this.getKermetaModelElement());
		unresolvedPropertyEClass.getESuperTypes().add(this.getAbstractProperty());
		unresolvedPropertyEClass.getESuperTypes().add(this.getUnresolved());
		unresolvedOperationEClass.getESuperTypes().add(this.getAbstractOperation());
		unresolvedOperationEClass.getESuperTypes().add(this.getUnresolved());
		unresolvedOperationEClass.getESuperTypes().add(this.getTypeContainer());
		usingEClass.getESuperTypes().add(this.getKermetaModelElement());
		productTypeEClass.getESuperTypes().add(this.getTypeContainer());
		productTypeEClass.getESuperTypes().add(this.getType());
		functionTypeEClass.getESuperTypes().add(this.getTypeContainer());
		functionTypeEClass.getESuperTypes().add(this.getType());
		voidTypeEClass.getESuperTypes().add(this.getType());
		unresolvedInferredTypeEClass.getESuperTypes().add(this.getUnresolved());
		unresolvedInferredTypeEClass.getESuperTypes().add(this.getType());
		unresolvedTypeVariableEClass.getESuperTypes().add(this.getUnresolved());
		unresolvedTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		modelTypeBindingEClass.getESuperTypes().add(this.getKermetaModelElement());
		simpleBindingEClass.getESuperTypes().add(this.getModelTypeBinding());
		adaptationBindingEClass.getESuperTypes().add(this.getModelTypeBinding());
		classDefinitionBindingEClass.getESuperTypes().add(this.getKermetaModelElement());
		simpleClassDefinitionBindingEClass.getESuperTypes().add(this.getClassDefinitionBinding());
		complexClassDefinitionBindingEClass.getESuperTypes().add(this.getClassDefinitionBinding());
		simpleEnumerationBindingEClass.getESuperTypes().add(this.getEnumerationBinding());
		complexEnumerationBindingEClass.getESuperTypes().add(this.getEnumerationBinding());
		simplePropertyBindingEClass.getESuperTypes().add(this.getPropertyBinding());
		complexPropertyBindingEClass.getESuperTypes().add(this.getPropertyBinding());
		simpleOperationBindingEClass.getESuperTypes().add(this.getOperationBinding());
		complexOperationBindingEClass.getESuperTypes().add(this.getOperationBinding());
		simpleParameterBindingEClass.getESuperTypes().add(this.getParameterBinding());
		complexParameterBindingEClass.getESuperTypes().add(this.getParameterBinding());
		adaptationOperatorEClass.getESuperTypes().add(this.getNamedElement());
		propertyAdaptationOperatorEClass.getESuperTypes().add(this.getAdaptationOperator());
		unresolvedAdaptationOperatorEClass.getESuperTypes().add(this.getAdaptationOperator());
		unresolvedAdaptationOperatorEClass.getESuperTypes().add(this.getUnresolved());
		adaptationParameterEClass.getESuperTypes().add(this.getTypedElement());
		operationAdaptationOperatorEClass.getESuperTypes().add(this.getAdaptationOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(kermetaModelElementEClass, KermetaModelElement.class, "KermetaModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermetaModelElement_KTag(), this.getTag(), this.getTag_Object(), "kTag", null, 0, -1, KermetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaModelElement_KOwnedTags(), this.getTag(), null, "kOwnedTags", null, 0, -1, KermetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermetaModelElement_KType(), this.getType(), null, "kType", null, 1, 1, KermetaModelElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_IsAbstract(), this.getBoolean(), "isAbstract", "false", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RaisedException(), this.getType(), null, "raisedException", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedParameter(), this.getParameter(), this.getParameter_Operation(), "ownedParameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Pre(), this.getConstraint(), this.getConstraint_PreOwner(), "pre", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Post(), this.getConstraint(), this.getConstraint_PostOwner(), "post", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Body(), theBehaviorPackage.getExpression(), null, "body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_SuperOperation(), this.getAbstractOperation(), null, "superOperation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedUnresolvedOperations(), this.getUnresolvedOperation(), null, "ownedUnresolvedOperations", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwningClass(), this.getClassDefinition(), this.getClassDefinition_OwnedOperation(), "owningClass", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_TypeParameter(), this.getTypeVariable(), null, "typeParameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_UniqueName(), this.getString(), "uniqueName", null, 0, 1, Operation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Opposite(), this.getAbstractProperty(), null, "opposite", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Default(), this.getString(), "default", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsComposite(), this.getBoolean(), "isComposite", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), this.getBoolean(), "isDerived", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsID(), this.getBoolean(), "isID", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_GetterBody(), theBehaviorPackage.getExpression(), null, "getterBody", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_SetterBody(), theBehaviorPackage.getExpression(), null, "setterBody", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsGetterAbstract(), this.getBoolean(), "isGetterAbstract", "true", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsSetterAbstract(), this.getBoolean(), "isSetterAbstract", "true", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OwnedUnresolvedProperties(), this.getUnresolvedProperty(), null, "ownedUnresolvedProperties", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OwningClass(), this.getClassDefinition(), this.getClassDefinition_OwnedAttribute(), "owningClass", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_TypeContainer(), this.getTypeContainer(), this.getTypeContainer_ContainedType(), "typeContainer", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContainerEClass, TypeContainer.class, "TypeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeContainer_ContainedType(), this.getType(), this.getType_TypeContainer(), "containedType", null, 0, -1, TypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 0, 1, EnumerationLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeVariableBindingEClass, TypeVariableBinding.class, "TypeVariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariableBinding_Variable(), this.getTypeVariable(), null, "variable", null, 1, 1, TypeVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeVariableBinding_Type(), this.getType(), null, "type", null, 1, 1, TypeVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_IsOrdered(), this.getBoolean(), "isOrdered", "false", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), this.getBoolean(), "isUnique", "true", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), this.getInteger(), "lower", "0", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Upper(), this.getUnlimitedNatural(), "upper", "1", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinition_SuperType(), this.getType(), null, "superType", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTypeDefinition_IsAspect(), this.getBoolean(), "isAspect", "false", 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.kermeta.language.structure.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, org.kermeta.language.structure.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, org.kermeta.language.structure.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, org.kermeta.language.structure.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IsAbstract(), this.getBoolean(), "isAbstract", "false", 0, 1, org.kermeta.language.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Name(), this.getString(), "name", null, 0, 1, org.kermeta.language.structure.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.kermeta.language.structure.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, org.kermeta.language.structure.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, org.kermeta.language.structure.Package.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Uri(), this.getString(), "uri", null, 0, 1, org.kermeta.language.structure.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedAdaptationOperators(), this.getAdaptationOperator(), null, "ownedAdaptationOperators", null, 0, -1, org.kermeta.language.structure.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), this.getOperation_OwnedParameter(), "operation", null, 0, 1, Parameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveType_InstanceType(), this.getType(), null, "instanceType", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), this.getString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Value(), this.getString(), "value", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_Object(), this.getKermetaModelElement(), this.getKermetaModelElement_KTag(), "object", null, 1, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPropertyEClass, AbstractProperty.class, "AbstractProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Body(), theBehaviorPackage.getExpression(), null, "body", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstraint_Stereotype(), this.getConstraintType(), "stereotype", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Language(), this.getConstraintLanguage(), "language", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_InvOwner(), this.getClassDefinition(), this.getClassDefinition_Inv(), "invOwner", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_PreOwner(), this.getOperation(), this.getOperation_Pre(), "preOwner", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_PostOwner(), this.getOperation(), this.getOperation_Post(), "postOwner", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDefinitionEClass, ClassDefinition.class, "ClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDefinition_Inv(), this.getConstraint(), this.getConstraint_InvOwner(), "inv", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDefinition_IsAbstract(), this.getBoolean(), "isAbstract", "false", 0, 1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_OwnedAttribute(), this.getProperty(), this.getProperty_OwningClass(), "ownedAttribute", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassDefinition_OwnedOperation(), this.getOperation(), this.getOperation_OwningClass(), "ownedOperation", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getClassDefinition_OwnedOperation().getEKeys().add(this.getOperation_UniqueName());
		initEAttribute(getClassDefinition_IsSingleton(), this.getBoolean(), "isSingleton", "false", 0, 1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDefinition_IsFinal(), this.getBoolean(), "isFinal", "false", 0, 1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingUnitEClass, ModelingUnit.class, "ModelingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingUnit_Packages(), this.getPackage(), null, "packages", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelingUnit_NamespacePrefix(), this.getString(), "namespacePrefix", null, 0, 1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Requires(), this.getRequire(), null, "requires", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionContainerEClass, TypeDefinitionContainer.class, "TypeDefinitionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinitionContainer_OwnedTypeDefinition(), this.getTypeDefinition(), null, "ownedTypeDefinition", null, 0, -1, TypeDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequire_Uri(), this.getString(), "uri", null, 0, 1, Require.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericTypeDefinitionEClass, GenericTypeDefinition.class, "GenericTypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTypeDefinition_TypeParameter(), this.getTypeVariable(), null, "typeParameter", null, 0, -1, GenericTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedTypeEClass, ParameterizedType.class, "ParameterizedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedType_VirtualTypeBinding(), this.getTypeVariableBinding(), null, "virtualTypeBinding", null, 0, -1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_TypeParamBinding(), this.getTypeVariableBinding(), null, "typeParamBinding", null, 0, -1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_TypeDefinition(), this.getGenericTypeDefinition(), null, "typeDefinition", null, 1, 1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeVariableEClass, TypeVariable.class, "TypeVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariable_Supertype(), this.getType(), null, "supertype", null, 0, 1, TypeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeVariableEClass, ObjectTypeVariable.class, "ObjectTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_OwnedBindings(), this.getModelTypeBinding(), null, "ownedBindings", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_OwnedPackages(), this.getPackage(), null, "ownedPackages", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeVariableEClass, ModelTypeVariable.class, "ModelTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTypeVariable_VirtualType(), this.getVirtualType(), this.getVirtualType_ModelType(), "virtualType", null, 0, -1, ModelTypeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualTypeEClass, VirtualType.class, "VirtualType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualType_ClassDefinition(), this.getClassDefinition(), null, "classDefinition", null, 1, 1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualType_ModelType(), this.getModelTypeVariable(), this.getModelTypeVariable_VirtualType(), "modelType", null, 1, 1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualType_TypeParamBinding(), this.getTypeVariableBinding(), null, "typeParamBinding", null, 0, -1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Contents(), this.getKermetaModelElement(), null, "contents", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractOperationEClass, AbstractOperation.class, "AbstractOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unresolvedTypeEClass, UnresolvedType.class, "UnresolvedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnresolvedType_Usings(), this.getUsing(), null, "usings", null, 0, -1, UnresolvedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnresolvedType_Generics(), this.getType(), null, "generics", null, 0, -1, UnresolvedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnresolvedType_TypeIdentifier(), this.getString(), "typeIdentifier", null, 1, 1, UnresolvedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unresolvedEClass, Unresolved.class, "Unresolved", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unresolvedPropertyEClass, UnresolvedProperty.class, "UnresolvedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnresolvedProperty_PropertyIdentifier(), this.getString(), "propertyIdentifier", null, 1, 1, UnresolvedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unresolvedOperationEClass, UnresolvedOperation.class, "UnresolvedOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnresolvedOperation_OperationIdentifier(), this.getString(), "operationIdentifier", null, 1, 1, UnresolvedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnresolvedOperation_From(), this.getType(), null, "from", null, 0, 1, UnresolvedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usingEClass, Using.class, "Using", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsing_FromQName(), this.getString(), "fromQName", null, 1, 1, Using.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsing_ToName(), this.getString(), "toName", null, 0, 1, Using.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductType_Type(), this.getType(), null, "type", null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionType_Left(), this.getType(), null, "left", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Right(), this.getType(), null, "right", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unresolvedInferredTypeEClass, UnresolvedInferredType.class, "UnresolvedInferredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unresolvedTypeVariableEClass, UnresolvedTypeVariable.class, "UnresolvedTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTypeBindingEClass, ModelTypeBinding.class, "ModelTypeBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTypeBinding_BoundModelType(), this.getModelType(), null, "boundModelType", null, 1, 1, ModelTypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleBindingEClass, SimpleBinding.class, "SimpleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleBinding_OwnedClassDefinitionBindings(), this.getSimpleClassDefinitionBinding(), null, "ownedClassDefinitionBindings", null, 0, -1, SimpleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleBinding_OwnedEnumerationBindings(), this.getSimpleEnumerationBinding(), null, "ownedEnumerationBindings", null, 0, -1, SimpleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationBindingEClass, AdaptationBinding.class, "AdaptationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationBinding_OwnedClassDefinitionBindings(), this.getClassDefinitionBinding(), null, "ownedClassDefinitionBindings", null, 0, -1, AdaptationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationBinding_OwnedEnumerationBindings(), this.getEnumerationBinding(), null, "ownedEnumerationBindings", null, 0, -1, AdaptationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationBinding_UsedAdaptationOperators(), this.getUseAdaptationOperator(), null, "usedAdaptationOperators", null, 0, -1, AdaptationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDefinitionBindingEClass, ClassDefinitionBinding.class, "ClassDefinitionBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleClassDefinitionBindingEClass, SimpleClassDefinitionBinding.class, "SimpleClassDefinitionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleClassDefinitionBinding_OwnedPropertyBindings(), this.getSimplePropertyBinding(), null, "ownedPropertyBindings", null, 0, -1, SimpleClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClassDefinitionBinding_OwnedOperationBindings(), this.getSimpleOperationBinding(), null, "ownedOperationBindings", null, 0, -1, SimpleClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClassDefinitionBinding_Source(), this.getClassDefinition(), null, "source", null, 1, 1, SimpleClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClassDefinitionBinding_Target(), this.getClassDefinition(), null, "target", null, 1, 1, SimpleClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexClassDefinitionBindingEClass, ComplexClassDefinitionBinding.class, "ComplexClassDefinitionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexClassDefinitionBinding_OwnedPropertyBindings(), this.getPropertyBinding(), null, "ownedPropertyBindings", null, 0, -1, ComplexClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexClassDefinitionBinding_OwnedOperationBindings(), this.getOperationBinding(), null, "ownedOperationBindings", null, 0, -1, ComplexClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexClassDefinitionBinding_Sources(), this.getClassDefinition(), null, "sources", null, 1, -1, ComplexClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexClassDefinitionBinding_Targets(), this.getClassDefinition(), null, "targets", null, 1, -1, ComplexClassDefinitionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationBindingEClass, EnumerationBinding.class, "EnumerationBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationBinding_OwnedEnumLiteralBindings(), this.getEnumLiteralbinding(), null, "ownedEnumLiteralBindings", null, 0, -1, EnumerationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEnumerationBindingEClass, SimpleEnumerationBinding.class, "SimpleEnumerationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleEnumerationBinding_Source(), this.getEnumeration(), null, "source", null, 1, 1, SimpleEnumerationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleEnumerationBinding_Target(), this.getEnumeration(), null, "target", null, 1, 1, SimpleEnumerationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEnumerationBindingEClass, ComplexEnumerationBinding.class, "ComplexEnumerationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexEnumerationBinding_Sources(), this.getEnumeration(), null, "sources", null, 1, -1, ComplexEnumerationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexEnumerationBinding_Targets(), this.getEnumeration(), null, "targets", null, 1, -1, ComplexEnumerationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyBindingEClass, PropertyBinding.class, "PropertyBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationBindingEClass, OperationBinding.class, "OperationBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simplePropertyBindingEClass, SimplePropertyBinding.class, "SimplePropertyBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplePropertyBinding_Source(), this.getProperty(), null, "source", null, 1, 1, SimplePropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePropertyBinding_Target(), this.getProperty(), null, "target", null, 1, 1, SimplePropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexPropertyBindingEClass, ComplexPropertyBinding.class, "ComplexPropertyBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexPropertyBinding_Sources(), this.getProperty(), null, "sources", null, 1, -1, ComplexPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexPropertyBinding_Targets(), this.getProperty(), null, "targets", null, 1, -1, ComplexPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleOperationBindingEClass, SimpleOperationBinding.class, "SimpleOperationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleOperationBinding_Source(), this.getOperation(), null, "source", null, 1, 1, SimpleOperationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleOperationBinding_Target(), this.getOperation(), null, "target", null, 1, 1, SimpleOperationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleOperationBinding_OwnedParameterBindings(), this.getSimpleParameterBinding(), null, "ownedParameterBindings", null, 0, -1, SimpleOperationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexOperationBindingEClass, ComplexOperationBinding.class, "ComplexOperationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexOperationBinding_Sources(), this.getOperation(), null, "sources", null, 1, -1, ComplexOperationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexOperationBinding_Targets(), this.getOperation(), null, "targets", null, 1, -1, ComplexOperationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexOperationBinding_OwnedParameterBindings(), this.getParameterBinding(), null, "ownedParameterBindings", null, 0, -1, ComplexOperationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleParameterBindingEClass, SimpleParameterBinding.class, "SimpleParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParameterBinding_Source(), this.getParameter(), null, "source", null, 1, 1, SimpleParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParameterBinding_Target(), this.getParameter(), null, "target", null, 1, 1, SimpleParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexParameterBindingEClass, ComplexParameterBinding.class, "ComplexParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexParameterBinding_Sources(), this.getParameter(), null, "sources", null, 1, -1, ComplexParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexParameterBinding_Targets(), this.getParameter(), null, "targets", null, 1, -1, ComplexParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralbindingEClass, EnumLiteralbinding.class, "EnumLiteralbinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteralbinding_Sources(), this.getEnumerationLiteral(), null, "sources", null, 1, -1, EnumLiteralbinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumLiteralbinding_Targets(), this.getEnumerationLiteral(), null, "targets", null, 1, -1, EnumLiteralbinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationOperatorEClass, AdaptationOperator.class, "AdaptationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationOperator_Parameters(), this.getAdaptationParameter(), null, "parameters", null, 0, -1, AdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useAdaptationOperatorEClass, UseAdaptationOperator.class, "UseAdaptationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseAdaptationOperator_Parameters(), this.getKermetaModelElement(), null, "parameters", null, 0, -1, UseAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseAdaptationOperator_OwnedUnresolved(), this.getUnresolved(), null, "ownedUnresolved", null, 0, -1, UseAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseAdaptationOperator_UsedOperator(), this.getAdaptationOperator(), null, "usedOperator", null, 1, 1, UseAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAdaptationOperatorEClass, PropertyAdaptationOperator.class, "PropertyAdaptationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAdaptationOperator_Target(), this.getProperty(), null, "target", null, 1, 1, PropertyAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAdaptationOperator_Getter(), this.getString(), "getter", null, 1, 1, PropertyAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAdaptationOperator_Setter(), this.getString(), "setter", null, 0, 1, PropertyAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAdaptationOperator_Adder(), this.getString(), "adder", null, 0, 1, PropertyAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAdaptationOperator_Remover(), this.getString(), "remover", null, 0, 1, PropertyAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unresolvedAdaptationOperatorEClass, UnresolvedAdaptationOperator.class, "UnresolvedAdaptationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptationParameterEClass, AdaptationParameter.class, "AdaptationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationAdaptationOperatorEClass, OperationAdaptationOperator.class, "OperationAdaptationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationAdaptationOperator_Body(), this.getString(), "body", null, 0, 1, OperationAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationAdaptationOperator_Target(), this.getOperation(), null, "target", null, 1, 1, OperationAdaptationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constraintLanguageEEnum, ConstraintLanguage.class, "ConstraintLanguage");
		addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.KERMETA);
		addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.OCL);

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.INV);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.PRE);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.POST);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //StructurePackageImpl
