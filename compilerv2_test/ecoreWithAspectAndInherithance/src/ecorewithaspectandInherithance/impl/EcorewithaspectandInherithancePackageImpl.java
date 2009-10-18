/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance.impl;

import ecorewithaspectandInherithance.EcorewithaspectandInherithanceFactory;
import ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorewithaspectandInherithancePackageImpl extends EPackageImpl implements EcorewithaspectandInherithancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEClass = null;

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
	 * @see ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorewithaspectandInherithancePackageImpl() {
		super(eNS_URI, EcorewithaspectandInherithanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcorewithaspectandInherithancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorewithaspectandInherithancePackage init() {
		if (isInited) return (EcorewithaspectandInherithancePackage)EPackage.Registry.INSTANCE.getEPackage(EcorewithaspectandInherithancePackage.eNS_URI);

		// Obtain or create and register package
		EcorewithaspectandInherithancePackageImpl theEcorewithaspectandInherithancePackage = (EcorewithaspectandInherithancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorewithaspectandInherithancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorewithaspectandInherithancePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEcorewithaspectandInherithancePackage.createPackageContents();

		// Initialize created meta-data
		theEcorewithaspectandInherithancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorewithaspectandInherithancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorewithaspectandInherithancePackage.eNS_URI, theEcorewithaspectandInherithancePackage);
		return theEcorewithaspectandInherithancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Foo() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getB() {
		return bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getB_Bar() {
		return (EAttribute)bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorewithaspectandInherithanceFactory getEcorewithaspectandInherithanceFactory() {
		return (EcorewithaspectandInherithanceFactory)getEFactoryInstance();
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
		aEClass = createEClass(A);
		createEAttribute(aEClass, A__FOO);

		bEClass = createEClass(B);
		createEAttribute(bEClass, B__BAR);
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
		bEClass.getESuperTypes().add(this.getA());

		// Initialize classes and features; add operations and parameters
		initEClass(aEClass, ecorewithaspectandInherithance.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Foo(), ecorePackage.getEString(), "foo", null, 0, 1, ecorewithaspectandInherithance.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bEClass, ecorewithaspectandInherithance.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getB_Bar(), ecorePackage.getEInt(), "bar", null, 0, 1, ecorewithaspectandInherithance.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcorewithaspectandInherithancePackageImpl
