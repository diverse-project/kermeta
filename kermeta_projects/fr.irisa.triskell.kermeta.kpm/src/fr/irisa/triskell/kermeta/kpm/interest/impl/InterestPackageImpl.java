/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestPackageImpl.java,v 1.1 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest.impl;

import fr.irisa.triskell.kermeta.extension.Interest;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;

import fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl;

import fr.irisa.triskell.kermeta.kpm.interest.InterestEntry;
import fr.irisa.triskell.kermeta.kpm.interest.InterestFactory;
import fr.irisa.triskell.kermeta.kpm.interest.InterestHost;
import fr.irisa.triskell.kermeta.kpm.interest.InterestKey;
import fr.irisa.triskell.kermeta.kpm.interest.InterestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterestPackageImpl extends EPackageImpl implements InterestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interestKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interestEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interestHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interestEDataType = null;

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
	 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterestPackageImpl() {
		super(eNS_URI, InterestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterestPackage init() {
		if (isInited) return (InterestPackage)EPackage.Registry.INSTANCE.getEPackage(InterestPackage.eNS_URI);

		// Obtain or create and register package
		InterestPackageImpl theInterestPackage = (InterestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof InterestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new InterestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KpmPackageImpl theKpmPackage = (KpmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KpmPackage.eNS_URI) instanceof KpmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KpmPackage.eNS_URI) : KpmPackage.eINSTANCE);

		// Create package meta-data objects
		theInterestPackage.createPackageContents();
		theKpmPackage.createPackageContents();

		// Initialize created meta-data
		theInterestPackage.initializePackageContents();
		theKpmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterestPackage.freeze();

		return theInterestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterestKey() {
		return interestKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterestKey_DeclaringObject() {
		return (EAttribute)interestKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterestKey_Unit() {
		return (EReference)interestKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterestEntry() {
		return interestEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterestEntry_Key() {
		return (EReference)interestEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterestEntry_Value() {
		return (EAttribute)interestEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterestHost() {
		return interestHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterestHost_Entries() {
		return (EReference)interestHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterest() {
		return interestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestFactory getInterestFactory() {
		return (InterestFactory)getEFactoryInstance();
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
		interestKeyEClass = createEClass(INTEREST_KEY);
		createEAttribute(interestKeyEClass, INTEREST_KEY__DECLARING_OBJECT);
		createEReference(interestKeyEClass, INTEREST_KEY__UNIT);

		interestEntryEClass = createEClass(INTEREST_ENTRY);
		createEReference(interestEntryEClass, INTEREST_ENTRY__KEY);
		createEAttribute(interestEntryEClass, INTEREST_ENTRY__VALUE);

		interestHostEClass = createEClass(INTEREST_HOST);
		createEReference(interestHostEClass, INTEREST_HOST__ENTRIES);

		// Create data types
		interestEDataType = createEDataType(INTEREST);
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
		KpmPackage theKpmPackage = (KpmPackage)EPackage.Registry.INSTANCE.getEPackage(KpmPackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(interestKeyEClass, InterestKey.class, "InterestKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterestKey_DeclaringObject(), this.getInterest(), "declaringObject", null, 1, 1, InterestKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterestKey_Unit(), theKpmPackage.getUnit(), null, "unit", null, 1, 1, InterestKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interestEntryEClass, InterestEntry.class, "InterestEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterestEntry_Key(), this.getInterestKey(), null, "key", null, 1, 1, InterestEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterestEntry_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, InterestEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interestHostEClass, InterestHost.class, "InterestHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterestHost_Entries(), this.getInterestEntry(), null, "entries", null, 0, -1, InterestHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(interestHostEClass, null, "declareInterest");
		addEParameter(op, this.getInterest(), "declaringObject", 0, 1);
		addEParameter(op, theKpmPackage.getUnit(), "key", 0, 1);

		op = addEOperation(interestHostEClass, null, "declareInterest");
		addEParameter(op, this.getInterest(), "declaringObject", 0, 1);
		addEParameter(op, theKpmPackage.getUnit(), "key", 0, 1);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1);

		op = addEOperation(interestHostEClass, this.getInterestEntry(), "findInterestEntry", 0, 1);
		addEParameter(op, theKpmPackage.getUnit(), "key", 0, 1);
		addEParameter(op, this.getInterest(), "declaringObject", 0, 1);

		op = addEOperation(interestHostEClass, null, "update");
		addEParameter(op, theKpmPackage.getUnit(), "key", 0, 1);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 0, 1);

		op = addEOperation(interestHostEClass, null, "undeclareInterest");
		addEParameter(op, this.getInterest(), "declaringObject", 0, 1);
		addEParameter(op, theKpmPackage.getUnit(), "key", 0, 1);

		op = addEOperation(interestHostEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1);
		addEParameter(op, theKpmPackage.getUnit(), "key", 0, 1);

		// Initialize data types
		initEDataType(interestEDataType, Interest.class, "Interest", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InterestPackageImpl
