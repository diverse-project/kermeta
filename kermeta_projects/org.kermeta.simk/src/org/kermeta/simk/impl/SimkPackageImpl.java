/**
 * $Id: SimkPackageImpl.java,v 1.11 2008-08-26 09:14:29 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SimkPackageImpl.java,v 1.11 2008-08-26 09:14:29 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.simk.FunctionType;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMNamedElement;
import org.kermeta.simk.SMParameter;
import org.kermeta.simk.SMReturn;
import org.kermeta.simk.SMTypedElement;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkFactory;
import org.kermeta.simk.SimkPackage;
import org.kermeta.simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimkPackageImpl extends EPackageImpl implements SimkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simkModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smUsageEEnum = null;

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
	 * @see org.kermeta.simk.SimkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimkPackageImpl() {
		super(eNS_URI, SimkFactory.eINSTANCE);
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
	public static SimkPackage init() {
		if (isInited) return (SimkPackage)EPackage.Registry.INSTANCE.getEPackage(SimkPackage.eNS_URI);

		// Obtain or create and register package
		SimkPackageImpl theSimkPackage = (SimkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SimkPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimkPackage.createPackageContents();

		// Initialize created meta-data
		theSimkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimkPackage.freeze();

		return theSimkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIMKModel() {
		return simkModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSIMKModel_SMContexts() {
		return (EReference)simkModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSIMKModel_StaticMethods() {
		return (EReference)simkModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticMethod() {
		return staticMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_SMParameters() {
		return (EReference)staticMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_SMReturn() {
		return (EReference)staticMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_SMContext() {
		return (EReference)staticMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticMethod_Id() {
		return (EAttribute)staticMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticMethod_Body() {
		return (EAttribute)staticMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticMethod_Usages() {
		return (EAttribute)staticMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_ParentMethod() {
		return (EReference)staticMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_ParentReference() {
		return (EReference)staticMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_ParentAttribute() {
		return (EReference)staticMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMContext() {
		return smContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMContext_StaticMethods() {
		return (EReference)smContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMContext_SMClass() {
		return (EReference)smContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMContext_QualifiedNameFinalPackage() {
		return (EAttribute)smContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMClass() {
		return smClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMClass_Usages() {
		return (EAttribute)smClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMClass_Context() {
		return (EReference)smClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMNamedElement() {
		return smNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMNamedElement_Name() {
		return (EAttribute)smNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMParameter() {
		return smParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMTypedElement() {
		return smTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMTypedElement_Type() {
		return (EAttribute)smTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMReturn() {
		return smReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSMUsage() {
		return smUsageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimkFactory getSimkFactory() {
		return (SimkFactory)getEFactoryInstance();
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
		simkModelEClass = createEClass(SIMK_MODEL);
		createEReference(simkModelEClass, SIMK_MODEL__SM_CONTEXTS);
		createEReference(simkModelEClass, SIMK_MODEL__STATIC_METHODS);

		staticMethodEClass = createEClass(STATIC_METHOD);
		createEReference(staticMethodEClass, STATIC_METHOD__SM_PARAMETERS);
		createEReference(staticMethodEClass, STATIC_METHOD__SM_RETURN);
		createEReference(staticMethodEClass, STATIC_METHOD__SM_CONTEXT);
		createEAttribute(staticMethodEClass, STATIC_METHOD__ID);
		createEAttribute(staticMethodEClass, STATIC_METHOD__BODY);
		createEAttribute(staticMethodEClass, STATIC_METHOD__USAGES);
		createEReference(staticMethodEClass, STATIC_METHOD__PARENT_METHOD);
		createEReference(staticMethodEClass, STATIC_METHOD__PARENT_REFERENCE);
		createEReference(staticMethodEClass, STATIC_METHOD__PARENT_ATTRIBUTE);

		smContextEClass = createEClass(SM_CONTEXT);
		createEReference(smContextEClass, SM_CONTEXT__STATIC_METHODS);
		createEReference(smContextEClass, SM_CONTEXT__SM_CLASS);
		createEAttribute(smContextEClass, SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE);

		smClassEClass = createEClass(SM_CLASS);
		createEAttribute(smClassEClass, SM_CLASS__USAGES);
		createEReference(smClassEClass, SM_CLASS__CONTEXT);

		smNamedElementEClass = createEClass(SM_NAMED_ELEMENT);
		createEAttribute(smNamedElementEClass, SM_NAMED_ELEMENT__NAME);

		smParameterEClass = createEClass(SM_PARAMETER);

		smTypedElementEClass = createEClass(SM_TYPED_ELEMENT);
		createEAttribute(smTypedElementEClass, SM_TYPED_ELEMENT__TYPE);

		smReturnEClass = createEClass(SM_RETURN);

		// Create enums
		smUsageEEnum = createEEnum(SM_USAGE);
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
		simkModelEClass.getESuperTypes().add(this.getSMNamedElement());
		staticMethodEClass.getESuperTypes().add(this.getSMNamedElement());
		smClassEClass.getESuperTypes().add(this.getSMNamedElement());
		smParameterEClass.getESuperTypes().add(this.getSMNamedElement());
		smParameterEClass.getESuperTypes().add(this.getSMTypedElement());
		smReturnEClass.getESuperTypes().add(this.getSMTypedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(simkModelEClass, SIMKModel.class, "SIMKModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSIMKModel_SMContexts(), this.getSMContext(), null, "sMContexts", null, 0, -1, SIMKModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSIMKModel_StaticMethods(), this.getStaticMethod(), null, "staticMethods", null, 0, -1, SIMKModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(simkModelEClass, ecorePackage.getEInt(), "getNextId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(staticMethodEClass, StaticMethod.class, "StaticMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticMethod_SMParameters(), this.getSMParameter(), null, "sMParameters", null, 0, -1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_SMReturn(), this.getSMReturn(), null, "sMReturn", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_SMContext(), this.getSMContext(), this.getSMContext_StaticMethods(), "sMContext", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticMethod_Id(), ecorePackage.getEString(), "id", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticMethod_Body(), ecorePackage.getEString(), "body", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticMethod_Usages(), this.getSMUsage(), "usages", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_ParentMethod(), ecorePackage.getEOperation(), null, "parentMethod", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_ParentReference(), ecorePackage.getEReference(), null, "parentReference", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_ParentAttribute(), ecorePackage.getEAttribute(), null, "parentAttribute", null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(staticMethodEClass, ecorePackage.getEOperation(), "getParentMethodFromModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smContextEClass, SMContext.class, "SMContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMContext_StaticMethods(), this.getStaticMethod(), this.getStaticMethod_SMContext(), "staticMethods", null, 0, -1, SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMContext_SMClass(), this.getSMClass(), this.getSMClass_Context(), "sMClass", null, 0, 1, SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMContext_QualifiedNameFinalPackage(), ecorePackage.getEString(), "qualifiedNameFinalPackage", null, 0, 1, SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smClassEClass, SMClass.class, "SMClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMClass_Usages(), this.getSMUsage(), "usages", null, 0, 1, SMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMClass_Context(), this.getSMContext(), this.getSMContext_SMClass(), "context", null, 1, 1, SMClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(smClassEClass, ecorePackage.getEString(), "getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smNamedElementEClass, SMNamedElement.class, "SMNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smParameterEClass, SMParameter.class, "SMParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smTypedElementEClass, SMTypedElement.class, "SMTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMTypedElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, SMTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smReturnEClass, SMReturn.class, "SMReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(smUsageEEnum, SMUsage.class, "SMUsage");
		addEEnumLiteral(smUsageEEnum, SMUsage.RUNNER);
		addEEnumLiteral(smUsageEEnum, SMUsage.LAUNCHER);
		addEEnumLiteral(smUsageEEnum, SMUsage.DERIVED_PROPERTY);
		addEEnumLiteral(smUsageEEnum, SMUsage.PRE_CONDITION);
		addEEnumLiteral(smUsageEEnum, SMUsage.POST_CONDITION);
		addEEnumLiteral(smUsageEEnum, SMUsage.WRAPPER);

		// Create resource
		createResource(eNS_URI);
	}

} //SimkPackageImpl
