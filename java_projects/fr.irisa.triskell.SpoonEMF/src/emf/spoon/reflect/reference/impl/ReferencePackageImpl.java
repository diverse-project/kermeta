/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencePackageImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import emf.spoon.SpoonPackage;
import emf.spoon.facade.FacadePackage;
import emf.spoon.facade.impl.FacadePackageImpl;
import emf.spoon.impl.SpoonPackageImpl;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.impl.CodePackageImpl;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.DeclarationPackageImpl;
import emf.spoon.reflect.reference.CtArrayTypeReference;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtFieldReference;
import emf.spoon.reflect.reference.CtGenericElementReference;
import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtParameterReference;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeParameterReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.CtVariableReference;
import emf.spoon.reflect.reference.ReferenceFactory;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencePackageImpl extends EPackageImpl implements ReferencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctArrayTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctExecutableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctFieldReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctGenericElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctLocalVariableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctPackageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctParameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTypeParameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctVariableReferenceEClass = null;

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
	 * @see emf.spoon.reflect.reference.ReferencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencePackageImpl() {
		super(eNS_URI, ReferenceFactory.eINSTANCE);
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
	public static ReferencePackage init() {
		if (isInited) return (ReferencePackage)EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI);

		// Obtain or create and register package
		ReferencePackageImpl theReferencePackage = (ReferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ReferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ReferencePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SpoonPackageImpl theSpoonPackage = (SpoonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) instanceof SpoonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) : SpoonPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);

		// Create package meta-data objects
		theReferencePackage.createPackageContents();
		theSpoonPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theFacadePackage.createPackageContents();

		// Initialize created meta-data
		theReferencePackage.initializePackageContents();
		theSpoonPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theFacadePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencePackage.freeze();

		return theReferencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtArrayTypeReference() {
		return ctArrayTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtArrayTypeReference_ComponentType() {
		return (EReference)ctArrayTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtExecutableReference() {
		return ctExecutableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutableReference_Type() {
		return (EReference)ctExecutableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutableReference_DeclaringType() {
		return (EReference)ctExecutableReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtExecutableReference_ParameterTypes() {
		return (EReference)ctExecutableReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtExecutableReference_Static() {
		return (EAttribute)ctExecutableReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtExecutableReference_ActualConstructor() {
		return (EAttribute)ctExecutableReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtExecutableReference_ActualMethod() {
		return (EAttribute)ctExecutableReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtFieldReference() {
		return ctFieldReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtFieldReference_DeclaringType() {
		return (EReference)ctFieldReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtFieldReference_Final() {
		return (EAttribute)ctFieldReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtFieldReference_Static() {
		return (EAttribute)ctFieldReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtFieldReference_ActualField() {
		return (EAttribute)ctFieldReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtFieldReference_QualifiedName() {
		return (EAttribute)ctFieldReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtGenericElementReference() {
		return ctGenericElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtGenericElementReference_ActualTypeArguments() {
		return (EReference)ctGenericElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtLocalVariableReference() {
		return ctLocalVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtPackageReference() {
		return ctPackageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtParameterReference() {
		return ctParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtParameterReference_DeclaringExecutable() {
		return (EReference)ctParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtReference() {
		return ctReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtReference_SimpleName() {
		return (EAttribute)ctReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtReference_Annotations() {
		return (EAttribute)ctReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtReference_Declaration() {
		return (EReference)ctReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtTypeParameterReference() {
		return ctTypeParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtTypeParameterReference_Upper() {
		return (EAttribute)ctTypeParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTypeParameterReference_Bounds() {
		return (EReference)ctTypeParameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtTypeReference() {
		return ctTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTypeReference_DeclaringType() {
		return (EReference)ctTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtTypeReference_Package() {
		return (EReference)ctTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtTypeReference_ActualClass() {
		return (EAttribute)ctTypeReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtTypeReference_Primitif() {
		return (EAttribute)ctTypeReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtTypeReference_QualifiedName() {
		return (EAttribute)ctTypeReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtVariableReference() {
		return ctVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtVariableReference_Type() {
		return (EReference)ctVariableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFactory getReferenceFactory() {
		return (ReferenceFactory)getEFactoryInstance();
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
		ctArrayTypeReferenceEClass = createEClass(CT_ARRAY_TYPE_REFERENCE);
		createEReference(ctArrayTypeReferenceEClass, CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE);

		ctExecutableReferenceEClass = createEClass(CT_EXECUTABLE_REFERENCE);
		createEReference(ctExecutableReferenceEClass, CT_EXECUTABLE_REFERENCE__TYPE);
		createEReference(ctExecutableReferenceEClass, CT_EXECUTABLE_REFERENCE__DECLARING_TYPE);
		createEReference(ctExecutableReferenceEClass, CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES);
		createEAttribute(ctExecutableReferenceEClass, CT_EXECUTABLE_REFERENCE__STATIC);
		createEAttribute(ctExecutableReferenceEClass, CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR);
		createEAttribute(ctExecutableReferenceEClass, CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD);

		ctFieldReferenceEClass = createEClass(CT_FIELD_REFERENCE);
		createEReference(ctFieldReferenceEClass, CT_FIELD_REFERENCE__DECLARING_TYPE);
		createEAttribute(ctFieldReferenceEClass, CT_FIELD_REFERENCE__FINAL);
		createEAttribute(ctFieldReferenceEClass, CT_FIELD_REFERENCE__STATIC);
		createEAttribute(ctFieldReferenceEClass, CT_FIELD_REFERENCE__ACTUAL_FIELD);
		createEAttribute(ctFieldReferenceEClass, CT_FIELD_REFERENCE__QUALIFIED_NAME);

		ctGenericElementReferenceEClass = createEClass(CT_GENERIC_ELEMENT_REFERENCE);
		createEReference(ctGenericElementReferenceEClass, CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS);

		ctLocalVariableReferenceEClass = createEClass(CT_LOCAL_VARIABLE_REFERENCE);

		ctPackageReferenceEClass = createEClass(CT_PACKAGE_REFERENCE);

		ctParameterReferenceEClass = createEClass(CT_PARAMETER_REFERENCE);
		createEReference(ctParameterReferenceEClass, CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE);

		ctReferenceEClass = createEClass(CT_REFERENCE);
		createEAttribute(ctReferenceEClass, CT_REFERENCE__SIMPLE_NAME);
		createEAttribute(ctReferenceEClass, CT_REFERENCE__ANNOTATIONS);
		createEReference(ctReferenceEClass, CT_REFERENCE__DECLARATION);

		ctTypeParameterReferenceEClass = createEClass(CT_TYPE_PARAMETER_REFERENCE);
		createEAttribute(ctTypeParameterReferenceEClass, CT_TYPE_PARAMETER_REFERENCE__UPPER);
		createEReference(ctTypeParameterReferenceEClass, CT_TYPE_PARAMETER_REFERENCE__BOUNDS);

		ctTypeReferenceEClass = createEClass(CT_TYPE_REFERENCE);
		createEReference(ctTypeReferenceEClass, CT_TYPE_REFERENCE__DECLARING_TYPE);
		createEReference(ctTypeReferenceEClass, CT_TYPE_REFERENCE__PACKAGE);
		createEAttribute(ctTypeReferenceEClass, CT_TYPE_REFERENCE__ACTUAL_CLASS);
		createEAttribute(ctTypeReferenceEClass, CT_TYPE_REFERENCE__PRIMITIF);
		createEAttribute(ctTypeReferenceEClass, CT_TYPE_REFERENCE__QUALIFIED_NAME);

		ctVariableReferenceEClass = createEClass(CT_VARIABLE_REFERENCE);
		createEReference(ctVariableReferenceEClass, CT_VARIABLE_REFERENCE__TYPE);
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
		FacadePackage theFacadePackage = (FacadePackage)EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);
		SpoonPackage theSpoonPackage = (SpoonPackage)EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI);
		DeclarationPackage theDeclarationPackage = (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);

		// Add supertypes to classes
		ctArrayTypeReferenceEClass.getESuperTypes().add(this.getCtTypeReference());
		ctArrayTypeReferenceEClass.getESuperTypes().add(theFacadePackage.getCtArrayTypeReference());
		ctExecutableReferenceEClass.getESuperTypes().add(this.getCtGenericElementReference());
		ctExecutableReferenceEClass.getESuperTypes().add(this.getCtReference());
		ctExecutableReferenceEClass.getESuperTypes().add(theFacadePackage.getCtExecutableReference());
		ctFieldReferenceEClass.getESuperTypes().add(this.getCtVariableReference());
		ctFieldReferenceEClass.getESuperTypes().add(theFacadePackage.getCtFieldReference());
		ctGenericElementReferenceEClass.getESuperTypes().add(theFacadePackage.getCtGenericElementReference());
		ctLocalVariableReferenceEClass.getESuperTypes().add(this.getCtVariableReference());
		ctLocalVariableReferenceEClass.getESuperTypes().add(theFacadePackage.getCtLocalVariableReference());
		ctPackageReferenceEClass.getESuperTypes().add(this.getCtReference());
		ctPackageReferenceEClass.getESuperTypes().add(theFacadePackage.getCtPackageReference());
		ctParameterReferenceEClass.getESuperTypes().add(this.getCtVariableReference());
		ctParameterReferenceEClass.getESuperTypes().add(theFacadePackage.getCtParameterReference());
		ctReferenceEClass.getESuperTypes().add(theFacadePackage.getCtReference());
		ctTypeParameterReferenceEClass.getESuperTypes().add(this.getCtTypeReference());
		ctTypeParameterReferenceEClass.getESuperTypes().add(theFacadePackage.getCtTypeParameterReference());
		ctTypeReferenceEClass.getESuperTypes().add(this.getCtGenericElementReference());
		ctTypeReferenceEClass.getESuperTypes().add(this.getCtReference());
		ctTypeReferenceEClass.getESuperTypes().add(theFacadePackage.getCtTypeReference());
		ctVariableReferenceEClass.getESuperTypes().add(this.getCtReference());
		ctVariableReferenceEClass.getESuperTypes().add(theFacadePackage.getCtVariableReference());

		// Initialize classes and features; add operations and parameters
		initEClass(ctArrayTypeReferenceEClass, CtArrayTypeReference.class, "CtArrayTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtArrayTypeReference_ComponentType(), this.getCtTypeReference(), null, "ComponentType", null, 0, 1, CtArrayTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctExecutableReferenceEClass, CtExecutableReference.class, "CtExecutableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtExecutableReference_Type(), this.getCtTypeReference(), null, "Type", null, 0, 1, CtExecutableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtExecutableReference_DeclaringType(), this.getCtTypeReference(), null, "DeclaringType", null, 0, 1, CtExecutableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtExecutableReference_ParameterTypes(), this.getCtTypeReference(), null, "ParameterTypes", null, 0, -1, CtExecutableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtExecutableReference_Static(), theSpoonPackage.getBoolean(), "Static", null, 0, 1, CtExecutableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtExecutableReference_ActualConstructor(), theSpoonPackage.getConstructor(), "ActualConstructor", null, 0, 1, CtExecutableReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtExecutableReference_ActualMethod(), theSpoonPackage.getMethod(), "ActualMethod", null, 0, 1, CtExecutableReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctFieldReferenceEClass, CtFieldReference.class, "CtFieldReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtFieldReference_DeclaringType(), this.getCtTypeReference(), null, "DeclaringType", null, 0, 1, CtFieldReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtFieldReference_Final(), theSpoonPackage.getBoolean(), "Final", null, 0, 1, CtFieldReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtFieldReference_Static(), theSpoonPackage.getBoolean(), "Static", null, 0, 1, CtFieldReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtFieldReference_ActualField(), theSpoonPackage.getField(), "ActualField", null, 0, 1, CtFieldReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtFieldReference_QualifiedName(), theSpoonPackage.getString(), "QualifiedName", null, 0, 1, CtFieldReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctGenericElementReferenceEClass, CtGenericElementReference.class, "CtGenericElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtGenericElementReference_ActualTypeArguments(), this.getCtTypeReference(), null, "ActualTypeArguments", null, 0, -1, CtGenericElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctLocalVariableReferenceEClass, CtLocalVariableReference.class, "CtLocalVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctPackageReferenceEClass, CtPackageReference.class, "CtPackageReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ctParameterReferenceEClass, CtParameterReference.class, "CtParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtParameterReference_DeclaringExecutable(), this.getCtExecutableReference(), null, "DeclaringExecutable", null, 0, 1, CtParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctReferenceEClass, CtReference.class, "CtReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtReference_SimpleName(), theSpoonPackage.getString(), "SimpleName", null, 0, 1, CtReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtReference_Annotations(), theSpoonPackage.getAnnotation(), "Annotations", null, 0, -1, CtReference.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtReference_Declaration(), theDeclarationPackage.getCtElement(), null, "Declaration", null, 0, 1, CtReference.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTypeParameterReferenceEClass, CtTypeParameterReference.class, "CtTypeParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtTypeParameterReference_Upper(), theSpoonPackage.getBoolean(), "Upper", null, 0, 1, CtTypeParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtTypeParameterReference_Bounds(), this.getCtTypeReference(), null, "Bounds", null, 0, -1, CtTypeParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctTypeReferenceEClass, CtTypeReference.class, "CtTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtTypeReference_DeclaringType(), this.getCtTypeReference(), null, "DeclaringType", null, 0, 1, CtTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtTypeReference_Package(), this.getCtPackageReference(), null, "Package", null, 0, 1, CtTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtTypeReference_ActualClass(), theSpoonPackage.getClass_(), "ActualClass", null, 0, 1, CtTypeReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtTypeReference_Primitif(), theSpoonPackage.getBoolean(), "Primitif", null, 0, 1, CtTypeReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtTypeReference_QualifiedName(), theSpoonPackage.getString(), "QualifiedName", null, 0, 1, CtTypeReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctVariableReferenceEClass, CtVariableReference.class, "CtVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtVariableReference_Type(), this.getCtTypeReference(), null, "Type", null, 0, 1, CtVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ReferencePackageImpl
