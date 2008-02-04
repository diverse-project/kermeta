/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestPackageImpl.java,v 1.1 2008-02-04 10:40:24 ftanguy Exp $
 */
package org.kermeta.model.interest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.kermeta.interest.InterestedObject;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.model.interest.Concern;
import org.kermeta.model.interest.InterestFactory;
import org.kermeta.model.interest.InterestHost;
import org.kermeta.model.interest.InterestPackage;
import org.kermeta.model.interest.WorriedObject;

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
	private EClass interestHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worriedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idNotFoundExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interestedObjectEDataType = null;

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
	 * @see org.kermeta.model.interest.InterestPackage#eNS_URI
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

		// Create package meta-data objects
		theInterestPackage.createPackageContents();

		// Initialize created meta-data
		theInterestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterestPackage.freeze();

		return theInterestPackage;
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
	public EReference getInterestHost_Concerns() {
		return (EReference)interestHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcern_Id() {
		return (EAttribute)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcern_Listeners() {
		return (EReference)concernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorriedObject() {
		return worriedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorriedObject_Target() {
		return (EAttribute)worriedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdNotFoundException() {
		return idNotFoundExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterestedObject() {
		return interestedObjectEDataType;
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
		interestHostEClass = createEClass(INTEREST_HOST);
		createEReference(interestHostEClass, INTEREST_HOST__CONCERNS);

		concernEClass = createEClass(CONCERN);
		createEAttribute(concernEClass, CONCERN__ID);
		createEReference(concernEClass, CONCERN__LISTENERS);

		worriedObjectEClass = createEClass(WORRIED_OBJECT);
		createEAttribute(worriedObjectEClass, WORRIED_OBJECT__TARGET);

		// Create data types
		idNotFoundExceptionEDataType = createEDataType(ID_NOT_FOUND_EXCEPTION);
		interestedObjectEDataType = createEDataType(INTERESTED_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(interestHostEClass, InterestHost.class, "InterestHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterestHost_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, InterestHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(interestHostEClass, null, "updateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIdNotFoundException());

		op = addEOperation(interestHostEClass, null, "beConcernedAbout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterestedObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interestHostEClass, null, "beUnconcernedAbout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterestedObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interestHostEClass, this.getConcern(), "getConcern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcern_Id(), ecorePackage.getEString(), "id", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_Listeners(), this.getWorriedObject(), null, "listeners", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(concernEClass, null, "updateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concernEClass, null, "beConcernedAbout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterestedObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concernEClass, null, "beUnconcernedAbout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterestedObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(concernEClass, this.getWorriedObject(), "getWorriedObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(worriedObjectEClass, WorriedObject.class, "WorriedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorriedObject_Target(), this.getInterestedObject(), "target", null, 1, 1, WorriedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(worriedObjectEClass, null, "updateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(idNotFoundExceptionEDataType, IdNotFoundException.class, "IdNotFoundException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interestedObjectEDataType, InterestedObject.class, "InterestedObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InterestPackageImpl
