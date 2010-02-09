/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pattern.art.ArtPatternFactory;
import pattern.art.ArtPatternPackage;
import pattern.art.CardinalityElement;
import pattern.art.DataType;
import pattern.art.ModelElement;
import pattern.art.NamedElement;
import pattern.art.TypedElement;

import pattern.art.group.GroupPackage;

import pattern.art.group.impl.GroupPackageImpl;

import pattern.art.implem.ImplemPackage;

import pattern.art.implem.impl.ImplemPackageImpl;

import pattern.art.instance.InstancePackage;

import pattern.art.instance.impl.InstancePackageImpl;

import pattern.art.type.TypePackage;

import pattern.art.type.impl.TypePackageImpl;

import patternframework.PatternframeworkPackage;

import patternframework.impl.PatternframeworkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtPatternPackageImpl extends EPackageImpl implements ArtPatternPackage {
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
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

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
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityElementEClass = null;

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
	 * @see pattern.art.ArtPatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArtPatternPackageImpl() {
		super(eNS_URI, ArtPatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArtPatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArtPatternPackage init() {
		if (isInited) return (ArtPatternPackage)EPackage.Registry.INSTANCE.getEPackage(ArtPatternPackage.eNS_URI);

		// Obtain or create and register package
		ArtPatternPackageImpl theArtPatternPackage = (ArtPatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArtPatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArtPatternPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) : ImplemPackage.eINSTANCE);
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) instanceof GroupPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) : GroupPackage.eINSTANCE);
		PatternframeworkPackageImpl thePatternframeworkPackage = (PatternframeworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI) instanceof PatternframeworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI) : PatternframeworkPackage.eINSTANCE);

		// Create package meta-data objects
		theArtPatternPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();
		theGroupPackage.createPackageContents();
		thePatternframeworkPackage.createPackageContents();

		// Initialize created meta-data
		theArtPatternPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();
		theGroupPackage.initializePackageContents();
		thePatternframeworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArtPatternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArtPatternPackage.eNS_URI, theArtPatternPackage);
		return theArtPatternPackage;
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
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Root() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Services() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Types() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_DataTypes() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Groups() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
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
	public EClass getCardinalityElement() {
		return cardinalityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityElement_Lower() {
		return (EAttribute)cardinalityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityElement_Upper() {
		return (EAttribute)cardinalityElementEClass.getEStructuralFeatures().get(1);
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
	public ArtPatternFactory getArtPatternFactory() {
		return (ArtPatternFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ROOT);
		createEReference(systemEClass, SYSTEM__SERVICES);
		createEReference(systemEClass, SYSTEM__TYPES);
		createEReference(systemEClass, SYSTEM__DATA_TYPES);
		createEReference(systemEClass, SYSTEM__GROUPS);

		dataTypeEClass = createEClass(DATA_TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		cardinalityElementEClass = createEClass(CARDINALITY_ELEMENT);
		createEAttribute(cardinalityElementEClass, CARDINALITY_ELEMENT__LOWER);
		createEAttribute(cardinalityElementEClass, CARDINALITY_ELEMENT__UPPER);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		ImplemPackage theImplemPackage = (ImplemPackage)EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI);
		GroupPackage theGroupPackage = (GroupPackage)EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI);
		PatternframeworkPackage thePatternframeworkPackage = (PatternframeworkPackage)EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theInstancePackage);
		getESubpackages().add(theTypePackage);
		getESubpackages().add(theImplemPackage);
		getESubpackages().add(theGroupPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(thePatternframeworkPackage.getPObject());
		modelElementEClass.getESuperTypes().add(this.getNamedElement());
		systemEClass.getESuperTypes().add(this.getModelElement());
		dataTypeEClass.getESuperTypes().add(this.getModelElement());
		typedElementEClass.getESuperTypes().add(this.getModelElement());
		cardinalityElementEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, pattern.art.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Root(), theInstancePackage.getCompositeInstance(), null, "root", null, 0, 1, pattern.art.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Services(), theTypePackage.getService(), null, "services", null, 0, -1, pattern.art.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Types(), theTypePackage.getComponentType(), null, "types", null, 0, -1, pattern.art.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, pattern.art.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Groups(), theGroupPackage.getGroup(), null, "groups", null, 0, -1, pattern.art.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getDataType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityElementEClass, CardinalityElement.class, "CardinalityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityElement_Lower(), this.getInteger(), "lower", null, 0, 1, CardinalityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinalityElement_Upper(), this.getInteger(), "upper", null, 0, 1, CardinalityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ArtPatternPackageImpl
