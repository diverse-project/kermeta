/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.kp.Dependency;
import org.kermeta.kp.Expression;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpFactory;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.MixExpression;
import org.kermeta.kp.NamedElement;
import org.kermeta.kp.Option;
import org.kermeta.kp.Source;
import org.kermeta.kp.StringExpression;
import org.kermeta.kp.WeaveDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KpPackageImpl extends EPackageImpl implements KpPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass kermetaProjectEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass dependencyEClass = null;

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
	private EClass sourceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass weaveDirectiveEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass optionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass expressionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass stringExpressionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass mixExpressionEClass = null;

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
   * @see org.kermeta.kp.KpPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private KpPackageImpl() {
    super(eNS_URI, KpFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link KpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static KpPackage init() {
    if (isInited) return (KpPackage)EPackage.Registry.INSTANCE.getEPackage(KpPackage.eNS_URI);

    // Obtain or create and register package
    KpPackageImpl theKpPackage = (KpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KpPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKpPackage.createPackageContents();

    // Initialize created meta-data
    theKpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KpPackage.eNS_URI, theKpPackage);
    return theKpPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getKermetaProject() {
    return kermetaProjectEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_Dependencies() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_Sources() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_WeaveDirectives() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_Options() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKermetaProject_DefaultMainClass()
  {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKermetaProject_DefaultMainOperation()
  {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getKermetaProject_Group() {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(6);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDependency() {
    return dependencyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDependency_Url() {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_IgnoreByteCode()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_SourceOnly()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(2);
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
	public EClass getSource() {
    return sourceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSource_Url() {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_ByteCodeFromADependency()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getWeaveDirective() {
    return weaveDirectiveEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getWeaveDirective_Mix() {
    return (EReference)weaveDirectiveEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getWeaveDirective_Target() {
    return (EReference)weaveDirectiveEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getOption() {
    return optionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getOption_Value() {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getExpression() {
    return expressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getStringExpression() {
    return stringExpressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getStringExpression_Value() {
    return (EAttribute)stringExpressionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMixExpression() {
    return mixExpressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMixExpression_Left() {
    return (EReference)mixExpressionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMixExpression_Right() {
    return (EReference)mixExpressionEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KpFactory getKpFactory() {
    return (KpFactory)getEFactoryInstance();
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
    kermetaProjectEClass = createEClass(KERMETA_PROJECT);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__DEPENDENCIES);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__SOURCES);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__WEAVE_DIRECTIVES);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__OPTIONS);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__DEFAULT_MAIN_CLASS);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__DEFAULT_MAIN_OPERATION);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__GROUP);

    dependencyEClass = createEClass(DEPENDENCY);
    createEAttribute(dependencyEClass, DEPENDENCY__URL);
    createEAttribute(dependencyEClass, DEPENDENCY__IGNORE_BYTE_CODE);
    createEAttribute(dependencyEClass, DEPENDENCY__SOURCE_ONLY);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    sourceEClass = createEClass(SOURCE);
    createEAttribute(sourceEClass, SOURCE__URL);
    createEAttribute(sourceEClass, SOURCE__BYTE_CODE_FROM_ADEPENDENCY);

    weaveDirectiveEClass = createEClass(WEAVE_DIRECTIVE);
    createEReference(weaveDirectiveEClass, WEAVE_DIRECTIVE__MIX);
    createEReference(weaveDirectiveEClass, WEAVE_DIRECTIVE__TARGET);

    optionEClass = createEClass(OPTION);
    createEAttribute(optionEClass, OPTION__VALUE);

    expressionEClass = createEClass(EXPRESSION);

    stringExpressionEClass = createEClass(STRING_EXPRESSION);
    createEAttribute(stringExpressionEClass, STRING_EXPRESSION__VALUE);

    mixExpressionEClass = createEClass(MIX_EXPRESSION);
    createEReference(mixExpressionEClass, MIX_EXPRESSION__LEFT);
    createEReference(mixExpressionEClass, MIX_EXPRESSION__RIGHT);
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
    kermetaProjectEClass.getESuperTypes().add(this.getNamedElement());
    dependencyEClass.getESuperTypes().add(this.getNamedElement());
    weaveDirectiveEClass.getESuperTypes().add(this.getNamedElement());
    optionEClass.getESuperTypes().add(this.getNamedElement());
    stringExpressionEClass.getESuperTypes().add(this.getExpression());
    mixExpressionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(kermetaProjectEClass, KermetaProject.class, "KermetaProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKermetaProject_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_Sources(), this.getSource(), null, "sources", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_WeaveDirectives(), this.getWeaveDirective(), null, "weaveDirectives", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_Options(), this.getOption(), null, "options", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKermetaProject_DefaultMainClass(), ecorePackage.getEString(), "defaultMainClass", null, 0, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKermetaProject_DefaultMainOperation(), ecorePackage.getEString(), "defaultMainOperation", null, 0, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKermetaProject_Group(), ecorePackage.getEString(), "group", "default", 0, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependency_Url(), ecorePackage.getEString(), "url", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_IgnoreByteCode(), ecorePackage.getEBoolean(), "ignoreByteCode", "false", 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_SourceOnly(), ecorePackage.getEBoolean(), "sourceOnly", "false", 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSource_Url(), ecorePackage.getEString(), "url", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSource_ByteCodeFromADependency(), ecorePackage.getEBoolean(), "byteCodeFromADependency", "false", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weaveDirectiveEClass, WeaveDirective.class, "WeaveDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeaveDirective_Mix(), this.getExpression(), null, "mix", null, 1, 1, WeaveDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeaveDirective_Target(), this.getExpression(), null, "target", null, 1, 1, WeaveDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mixExpressionEClass, MixExpression.class, "MixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMixExpression_Left(), this.getExpression(), null, "left", null, 1, 1, MixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMixExpression_Right(), this.getExpression(), null, "right", null, 1, 1, MixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KpPackageImpl
