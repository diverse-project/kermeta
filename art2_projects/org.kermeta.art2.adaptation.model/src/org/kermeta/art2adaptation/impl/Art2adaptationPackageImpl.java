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
import org.kermeta.art2adaptation.AddComponentInstance;
import org.kermeta.art2adaptation.AddComponentType;
import org.kermeta.art2adaptation.Art2adaptationFactory;
import org.kermeta.art2adaptation.Art2adaptationPackage;
import org.kermeta.art2adaptation.ComponentInstanceAdaptation;
import org.kermeta.art2adaptation.ComponentTypeAdaptation;
import org.kermeta.art2adaptation.RemoveComponentInstance;
import org.kermeta.art2adaptation.RemoveComponentType;

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
	private EClass componentTypeAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeComponentInstanceEClass = null;

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
	public EClass getComponentTypeAdaptation() {
		return componentTypeAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentTypeAdaptation_Ref() {
		return (EReference)componentTypeAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstanceAdaptation() {
		return componentInstanceAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceAdaptation_Ref() {
		return (EReference)componentInstanceAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddComponentType() {
		return addComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveComponentType() {
		return removeComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddComponentInstance() {
		return addComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveComponentInstance() {
		return removeComponentInstanceEClass;
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

		componentTypeAdaptationEClass = createEClass(COMPONENT_TYPE_ADAPTATION);
		createEReference(componentTypeAdaptationEClass, COMPONENT_TYPE_ADAPTATION__REF);

		componentInstanceAdaptationEClass = createEClass(COMPONENT_INSTANCE_ADAPTATION);
		createEReference(componentInstanceAdaptationEClass, COMPONENT_INSTANCE_ADAPTATION__REF);

		addComponentTypeEClass = createEClass(ADD_COMPONENT_TYPE);

		removeComponentTypeEClass = createEClass(REMOVE_COMPONENT_TYPE);

		addComponentInstanceEClass = createEClass(ADD_COMPONENT_INSTANCE);

		removeComponentInstanceEClass = createEClass(REMOVE_COMPONENT_INSTANCE);
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
		componentTypeAdaptationEClass.getESuperTypes().add(this.getAdaptationPrimitive());
		componentInstanceAdaptationEClass.getESuperTypes().add(this.getAdaptationPrimitive());
		addComponentTypeEClass.getESuperTypes().add(this.getComponentTypeAdaptation());
		removeComponentTypeEClass.getESuperTypes().add(this.getComponentTypeAdaptation());
		addComponentInstanceEClass.getESuperTypes().add(this.getComponentInstanceAdaptation());
		removeComponentInstanceEClass.getESuperTypes().add(this.getComponentInstanceAdaptation());

		// Initialize classes and features; add operations and parameters
		initEClass(adaptationPrimitiveEClass, AdaptationPrimitive.class, "AdaptationPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptationModelEClass, AdaptationModel.class, "AdaptationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationModel_Adaptations(), this.getAdaptationPrimitive(), null, "adaptations", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeAdaptationEClass, ComponentTypeAdaptation.class, "ComponentTypeAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentTypeAdaptation_Ref(), theArt2Package.getComponentType(), null, "ref", null, 1, 1, ComponentTypeAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceAdaptationEClass, ComponentInstanceAdaptation.class, "ComponentInstanceAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceAdaptation_Ref(), theArt2Package.getComponentInstance(), null, "ref", null, 1, 1, ComponentInstanceAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addComponentTypeEClass, AddComponentType.class, "AddComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeComponentTypeEClass, RemoveComponentType.class, "RemoveComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addComponentInstanceEClass, AddComponentInstance.class, "AddComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeComponentInstanceEClass, RemoveComponentInstance.class, "RemoveComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Art2adaptationPackageImpl
