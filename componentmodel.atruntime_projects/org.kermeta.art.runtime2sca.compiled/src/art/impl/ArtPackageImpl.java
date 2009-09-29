/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.impl;

import art.AddElement;
import art.ArtFactory;
import art.ArtPackage;
import art.CardinalityElement;
import art.DataType;
import art.ModelElement;
import art.NamedElement;
import art.RemoveElement;
import art.TypedElement;
import art.UpdateElement;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.InstancePackage;

import art.instance.impl.InstancePackageImpl;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.IoPackage;

import kermeta.io.impl.IoPackageImpl;

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import kermeta.xmltype.XmltypePackage;

import kermeta.xmltype.impl.XmltypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime2SCA.Runtime2SCAPackage;

import runtime2SCA.impl.Runtime2SCAPackageImpl;

import sca.ScaPackage;

import sca.impl.ScaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtPackageImpl extends EPackageImpl implements ArtPackage {
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
	private EClass addElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateElementEClass = null;

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
	 * @see art.ArtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArtPackageImpl() {
		super(eNS_URI, ArtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArtPackage init() {
		if (isInited)
			return (ArtPackage) EPackage.Registry.INSTANCE
					.getEPackage(ArtPackage.eNS_URI);

		// Obtain or create and register package
		ArtPackageImpl theArtPackage = (ArtPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new ArtPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI)
				: LanguagePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI)
				: StructurePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		ScaPackageImpl theScaPackage = (ScaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI) instanceof ScaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI)
				: ScaPackage.eINSTANCE);
		Runtime2SCAPackageImpl theRuntime2SCAPackage = (Runtime2SCAPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI) instanceof Runtime2SCAPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI)
				: Runtime2SCAPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI)
				: InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI)
				: TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI)
				: ImplemPackage.eINSTANCE);

		// Create package meta-data objects
		theArtPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theScaPackage.createPackageContents();
		theRuntime2SCAPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theArtPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theScaPackage.initializePackageContents();
		theRuntime2SCAPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArtPackage.eNS_URI, theArtPackage);
		return theArtPackage;
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
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
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
	public EReference getSystem_Services() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Root() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_DataTypes() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Types() {
		return (EReference) systemEClass.getEStructuralFeatures().get(3);
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
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddElement() {
		return addElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveElement() {
		return removeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateElement() {
		return updateElementEClass;
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
	public EAttribute getCardinalityElement_Upper() {
		return (EAttribute) cardinalityElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityElement_Lower() {
		return (EAttribute) cardinalityElementEClass.getEStructuralFeatures()
				.get(1);
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
	public ArtFactory getArtFactory() {
		return (ArtFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__SERVICES);
		createEReference(systemEClass, SYSTEM__ROOT);
		createEReference(systemEClass, SYSTEM__DATA_TYPES);
		createEReference(systemEClass, SYSTEM__TYPES);

		dataTypeEClass = createEClass(DATA_TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		addElementEClass = createEClass(ADD_ELEMENT);

		removeElementEClass = createEClass(REMOVE_ELEMENT);

		updateElementEClass = createEClass(UPDATE_ELEMENT);

		cardinalityElementEClass = createEClass(CARDINALITY_ELEMENT);
		createEAttribute(cardinalityElementEClass, CARDINALITY_ELEMENT__UPPER);
		createEAttribute(cardinalityElementEClass, CARDINALITY_ELEMENT__LOWER);

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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InstancePackage theInstancePackage = (InstancePackage) EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage) EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI);
		ImplemPackage theImplemPackage = (ImplemPackage) EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theInstancePackage);
		getESubpackages().add(theTypePackage);
		getESubpackages().add(theImplemPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes()
				.add(theStructurePackage.getObject());
		modelElementEClass.getESuperTypes().add(this.getNamedElement());
		systemEClass.getESuperTypes().add(this.getModelElement());
		dataTypeEClass.getESuperTypes().add(this.getModelElement());
		typedElementEClass.getESuperTypes().add(this.getModelElement());
		addElementEClass.getESuperTypes().add(theStructurePackage.getObject());
		removeElementEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		updateElementEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		cardinalityElementEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null,
				1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, art.System.class, "System", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Services(), theTypePackage.getService(), null,
				"services", null, 0, -1, art.System.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Root(), theInstancePackage
				.getCompositeInstance(), null, "root", null, 1, 1,
				art.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_DataTypes(), this.getDataType(), null,
				"dataTypes", null, 0, -1, art.System.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Types(), theTypePackage.getComponentType(),
				null, "types", null, 0, -1, art.System.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getDataType(), null,
				"type", null, 0, 1, TypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addElementEClass, AddElement.class, "AddElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeElementEClass, RemoveElement.class, "RemoveElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateElementEClass, UpdateElement.class, "UpdateElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityElementEClass, CardinalityElement.class,
				"CardinalityElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalityElement_Upper(), this.getInteger(),
				"upper", null, 0, 1, CardinalityElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinalityElement_Lower(), this.getInteger(),
				"lower", null, 0, 1, CardinalityElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";
		addAnnotation(this, source, new String[] { "ecoreUri", "http://art" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getNamedElement_Name(), source, new String[] { "ecore",
				"true" });
		addAnnotation(stringEDataType, source, new String[] { "alias",
				"kermeta::standard::String" });
		addAnnotation(stringEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(stringEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.String" });
		addAnnotation(stringEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(modelElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(systemEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getSystem_Services(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSystem_Root(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getSystem_DataTypes(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSystem_Types(), source,
				new String[] { "ecore", "true" });
		addAnnotation(dataTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(typedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getTypedElement_Type(), source, new String[] { "ecore",
				"true" });
		addAnnotation(booleanEDataType, source, new String[] { "alias",
				"kermeta::standard::Boolean" });
		addAnnotation(booleanEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(booleanEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Boolean" });
		addAnnotation(booleanEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(addElementEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(removeElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(updateElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(cardinalityElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getCardinalityElement_Upper(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getCardinalityElement_Lower(), source, new String[] {
				"ecore", "true" });
		addAnnotation(integerEDataType, source, new String[] { "alias",
				"kermeta::standard::Integer" });
		addAnnotation(integerEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(integerEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Integer" });
		addAnnotation(integerEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
	}

} //ArtPackageImpl
