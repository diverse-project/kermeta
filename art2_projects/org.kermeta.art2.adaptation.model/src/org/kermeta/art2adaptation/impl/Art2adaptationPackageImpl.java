/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.art2.Art2Package;

import org.kermeta.art2adaptation.AdaptationModel;
import org.kermeta.art2adaptation.AdaptationPrimitive;
import org.kermeta.art2adaptation.AddBinding;
import org.kermeta.art2adaptation.AddInstance;
import org.kermeta.art2adaptation.AddThirdParty;
import org.kermeta.art2adaptation.AddType;
import org.kermeta.art2adaptation.Art2adaptationFactory;
import org.kermeta.art2adaptation.Art2adaptationPackage;
import org.kermeta.art2adaptation.BindingAdaptation;
import org.kermeta.art2adaptation.InstanceAdaptation;
import org.kermeta.art2adaptation.RemoveBinding;
import org.kermeta.art2adaptation.RemoveInstance;
import org.kermeta.art2adaptation.RemoveThirdParty;
import org.kermeta.art2adaptation.RemoveType;
import org.kermeta.art2adaptation.ThirdPartyAdaptation;
import org.kermeta.art2adaptation.TypeAdaptation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Art2adaptationPackageImpl extends EPackageImpl implements Art2adaptationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdPartyAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addThirdPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeThirdPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeBindingEClass = null;

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
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Art2adaptationPackageImpl() {
		super(eNS_URI, Art2adaptationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Art2adaptationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Art2adaptationPackage init() {
		if (isInited) return (Art2adaptationPackage)EPackage.Registry.INSTANCE.getEPackage(Art2adaptationPackage.eNS_URI);

		// Obtain or create and register package
		Art2adaptationPackageImpl theArt2adaptationPackage = (Art2adaptationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Art2adaptationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Art2adaptationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Art2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theArt2adaptationPackage.createPackageContents();

		// Initialize created meta-data
		theArt2adaptationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArt2adaptationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Art2adaptationPackage.eNS_URI, theArt2adaptationPackage);
		return theArt2adaptationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationPrimitive() {
		return adaptationPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationModel() {
		return adaptationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationModel_Adaptations() {
		return (EReference)adaptationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAdaptation() {
		return typeAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAdaptation_Ref() {
		return (EReference)typeAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceAdaptation() {
		return instanceAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceAdaptation_Ref() {
		return (EReference)instanceAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddType() {
		return addTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveType() {
		return removeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddInstance() {
		return addInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveInstance() {
		return removeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThirdPartyAdaptation() {
		return thirdPartyAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThirdPartyAdaptation_Ref() {
		return (EReference)thirdPartyAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddThirdParty() {
		return addThirdPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveThirdParty() {
		return removeThirdPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingAdaptation() {
		return bindingAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAdaptation_Ref() {
		return (EReference)bindingAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddBinding() {
		return addBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveBinding() {
		return removeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2adaptationFactory getArt2adaptationFactory() {
		return (Art2adaptationFactory)getEFactoryInstance();
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
		adaptationPrimitiveEClass = createEClass(ADAPTATION_PRIMITIVE);

		adaptationModelEClass = createEClass(ADAPTATION_MODEL);
		createEReference(adaptationModelEClass, ADAPTATION_MODEL__ADAPTATIONS);

		typeAdaptationEClass = createEClass(TYPE_ADAPTATION);
		createEReference(typeAdaptationEClass, TYPE_ADAPTATION__REF);

		instanceAdaptationEClass = createEClass(INSTANCE_ADAPTATION);
		createEReference(instanceAdaptationEClass, INSTANCE_ADAPTATION__REF);

		addTypeEClass = createEClass(ADD_TYPE);

		removeTypeEClass = createEClass(REMOVE_TYPE);

		addInstanceEClass = createEClass(ADD_INSTANCE);

		removeInstanceEClass = createEClass(REMOVE_INSTANCE);

		thirdPartyAdaptationEClass = createEClass(THIRD_PARTY_ADAPTATION);
		createEReference(thirdPartyAdaptationEClass, THIRD_PARTY_ADAPTATION__REF);

		addThirdPartyEClass = createEClass(ADD_THIRD_PARTY);

		removeThirdPartyEClass = createEClass(REMOVE_THIRD_PARTY);

		bindingAdaptationEClass = createEClass(BINDING_ADAPTATION);
		createEReference(bindingAdaptationEClass, BINDING_ADAPTATION__REF);

		addBindingEClass = createEClass(ADD_BINDING);

		removeBindingEClass = createEClass(REMOVE_BINDING);
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
		Art2Package theArt2Package = (Art2Package)EPackage.Registry.INSTANCE.getEPackage(Art2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeAdaptationEClass.getESuperTypes().add(this.getAdaptationPrimitive());
		instanceAdaptationEClass.getESuperTypes().add(this.getAdaptationPrimitive());
		addTypeEClass.getESuperTypes().add(this.getTypeAdaptation());
		removeTypeEClass.getESuperTypes().add(this.getTypeAdaptation());
		addInstanceEClass.getESuperTypes().add(this.getInstanceAdaptation());
		removeInstanceEClass.getESuperTypes().add(this.getInstanceAdaptation());
		thirdPartyAdaptationEClass.getESuperTypes().add(this.getAdaptationPrimitive());
		addThirdPartyEClass.getESuperTypes().add(this.getThirdPartyAdaptation());
		removeThirdPartyEClass.getESuperTypes().add(this.getThirdPartyAdaptation());
		bindingAdaptationEClass.getESuperTypes().add(this.getAdaptationPrimitive());
		addBindingEClass.getESuperTypes().add(this.getBindingAdaptation());
		removeBindingEClass.getESuperTypes().add(this.getBindingAdaptation());

		// Initialize classes and features; add operations and parameters
		initEClass(adaptationPrimitiveEClass, AdaptationPrimitive.class, "AdaptationPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptationModelEClass, AdaptationModel.class, "AdaptationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationModel_Adaptations(), this.getAdaptationPrimitive(), null, "adaptations", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeAdaptationEClass, TypeAdaptation.class, "TypeAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeAdaptation_Ref(), theArt2Package.getTypeDefinition(), null, "ref", null, 1, 1, TypeAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceAdaptationEClass, InstanceAdaptation.class, "InstanceAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceAdaptation_Ref(), theArt2Package.getInstance(), null, "ref", null, 1, 1, InstanceAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addTypeEClass, AddType.class, "AddType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeTypeEClass, RemoveType.class, "RemoveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addInstanceEClass, AddInstance.class, "AddInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeInstanceEClass, RemoveInstance.class, "RemoveInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thirdPartyAdaptationEClass, ThirdPartyAdaptation.class, "ThirdPartyAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThirdPartyAdaptation_Ref(), theArt2Package.getDeployUnit(), null, "ref", null, 1, 1, ThirdPartyAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addThirdPartyEClass, AddThirdParty.class, "AddThirdParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeThirdPartyEClass, RemoveThirdParty.class, "RemoveThirdParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingAdaptationEClass, BindingAdaptation.class, "BindingAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingAdaptation_Ref(), theArt2Package.getMBinding(), null, "ref", null, 1, 1, BindingAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addBindingEClass, AddBinding.class, "AddBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeBindingEClass, RemoveBinding.class, "RemoveBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Art2adaptationPackageImpl
