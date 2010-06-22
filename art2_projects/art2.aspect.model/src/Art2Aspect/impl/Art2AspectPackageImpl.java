/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.Art2AspectFactory;
import Art2Aspect.Art2AspectPackage;
import Art2Aspect.AspectDefinition;
import Art2Aspect.AspectRoot;
import Art2Aspect.BindingPattern;
import Art2Aspect.ComponentPattern;
import Art2Aspect.ComponentTypePattern;
import Art2Aspect.NodePattern;
import Art2Aspect.PatternNamedElement;
import Art2Aspect.PointcutDefinition;
import Art2Aspect.PortPattern;
import Art2Aspect.PortTypePattern;
import Art2Aspect.PortTypeRefPattern;

import art2.Art2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Art2AspectPackageImpl extends EPackageImpl implements Art2AspectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeRefPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternNamedElementEClass = null;

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
	 * @see Art2Aspect.Art2AspectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Art2AspectPackageImpl() {
		super(eNS_URI, Art2AspectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Art2AspectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Art2AspectPackage init() {
		if (isInited) return (Art2AspectPackage)EPackage.Registry.INSTANCE.getEPackage(Art2AspectPackage.eNS_URI);

		// Obtain or create and register package
		Art2AspectPackageImpl theArt2AspectPackage = (Art2AspectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Art2AspectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Art2AspectPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Art2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theArt2AspectPackage.createPackageContents();

		// Initialize created meta-data
		theArt2AspectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArt2AspectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Art2AspectPackage.eNS_URI, theArt2AspectPackage);
		return theArt2AspectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectRoot() {
		return aspectRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectRoot_Aspects() {
		return (EReference)aspectRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectDefinition() {
		return aspectDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectDefinition_Bindings() {
		return (EReference)aspectDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectDefinition_Pointcut() {
		return (EReference)aspectDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectDefinition_Advice() {
		return (EReference)aspectDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointcutDefinition() {
		return pointcutDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcutDefinition_ComponentTypePatterns() {
		return (EReference)pointcutDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcutDefinition_NodePatterns() {
		return (EReference)pointcutDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingPattern() {
		return bindingPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingPattern_Source() {
		return (EReference)bindingPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingPattern_Target() {
		return (EReference)bindingPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentTypePattern() {
		return componentTypePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentTypePattern_PortTypePatterns() {
		return (EReference)componentTypePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentTypePattern_PortPatterns() {
		return (EReference)componentTypePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentTypePattern_Type() {
		return (EReference)componentTypePatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodePattern() {
		return nodePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePattern_ComponentPatterns() {
		return (EReference)nodePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPattern() {
		return portPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPattern() {
		return componentPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPattern_PortPatterns() {
		return (EReference)componentPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortTypePattern() {
		return portTypePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortTypePattern_Type() {
		return (EReference)portTypePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortTypeRefPattern() {
		return portTypeRefPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortTypeRefPattern_Ref() {
		return (EReference)portTypeRefPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternNamedElement() {
		return patternNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternNamedElement_NamePattern() {
		return (EAttribute)patternNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2AspectFactory getArt2AspectFactory() {
		return (Art2AspectFactory)getEFactoryInstance();
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
		aspectRootEClass = createEClass(ASPECT_ROOT);
		createEReference(aspectRootEClass, ASPECT_ROOT__ASPECTS);

		aspectDefinitionEClass = createEClass(ASPECT_DEFINITION);
		createEReference(aspectDefinitionEClass, ASPECT_DEFINITION__BINDINGS);
		createEReference(aspectDefinitionEClass, ASPECT_DEFINITION__POINTCUT);
		createEReference(aspectDefinitionEClass, ASPECT_DEFINITION__ADVICE);

		pointcutDefinitionEClass = createEClass(POINTCUT_DEFINITION);
		createEReference(pointcutDefinitionEClass, POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS);
		createEReference(pointcutDefinitionEClass, POINTCUT_DEFINITION__NODE_PATTERNS);

		bindingPatternEClass = createEClass(BINDING_PATTERN);
		createEReference(bindingPatternEClass, BINDING_PATTERN__SOURCE);
		createEReference(bindingPatternEClass, BINDING_PATTERN__TARGET);

		componentTypePatternEClass = createEClass(COMPONENT_TYPE_PATTERN);
		createEReference(componentTypePatternEClass, COMPONENT_TYPE_PATTERN__PORT_TYPE_PATTERNS);
		createEReference(componentTypePatternEClass, COMPONENT_TYPE_PATTERN__PORT_PATTERNS);
		createEReference(componentTypePatternEClass, COMPONENT_TYPE_PATTERN__TYPE);

		nodePatternEClass = createEClass(NODE_PATTERN);
		createEReference(nodePatternEClass, NODE_PATTERN__COMPONENT_PATTERNS);

		portPatternEClass = createEClass(PORT_PATTERN);

		componentPatternEClass = createEClass(COMPONENT_PATTERN);
		createEReference(componentPatternEClass, COMPONENT_PATTERN__PORT_PATTERNS);

		portTypePatternEClass = createEClass(PORT_TYPE_PATTERN);
		createEReference(portTypePatternEClass, PORT_TYPE_PATTERN__TYPE);

		portTypeRefPatternEClass = createEClass(PORT_TYPE_REF_PATTERN);
		createEReference(portTypeRefPatternEClass, PORT_TYPE_REF_PATTERN__REF);

		patternNamedElementEClass = createEClass(PATTERN_NAMED_ELEMENT);
		createEAttribute(patternNamedElementEClass, PATTERN_NAMED_ELEMENT__NAME_PATTERN);
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

		// Add supertypes to classes
		patternNamedElementEClass.getESuperTypes().add(this.getComponentPattern());
		patternNamedElementEClass.getESuperTypes().add(this.getPortTypeRefPattern());

		// Initialize classes and features; add operations and parameters
		initEClass(aspectRootEClass, AspectRoot.class, "AspectRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspectRoot_Aspects(), this.getAspectDefinition(), null, "aspects", null, 0, -1, AspectRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectDefinitionEClass, AspectDefinition.class, "AspectDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspectDefinition_Bindings(), this.getBindingPattern(), null, "bindings", null, 0, -1, AspectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspectDefinition_Pointcut(), this.getPointcutDefinition(), null, "pointcut", null, 0, 1, AspectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspectDefinition_Advice(), theArt2Package.getContainerRoot(), null, "advice", null, 0, 1, AspectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointcutDefinitionEClass, PointcutDefinition.class, "PointcutDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointcutDefinition_ComponentTypePatterns(), this.getComponentTypePattern(), null, "componentTypePatterns", null, 0, 1, PointcutDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointcutDefinition_NodePatterns(), this.getNodePattern(), null, "nodePatterns", null, 0, -1, PointcutDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingPatternEClass, BindingPattern.class, "BindingPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingPattern_Source(), this.getPortPattern(), null, "source", null, 1, 1, BindingPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingPattern_Target(), theArt2Package.getPort(), null, "target", null, 1, 1, BindingPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypePatternEClass, ComponentTypePattern.class, "ComponentTypePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentTypePattern_PortTypePatterns(), this.getPortTypePattern(), null, "portTypePatterns", null, 0, -1, ComponentTypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentTypePattern_PortPatterns(), this.getPortTypeRefPattern(), null, "portPatterns", null, 0, -1, ComponentTypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentTypePattern_Type(), theArt2Package.getComponentType(), null, "type", null, 0, 1, ComponentTypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodePatternEClass, NodePattern.class, "NodePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodePattern_ComponentPatterns(), this.getComponentPattern(), null, "componentPatterns", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portPatternEClass, PortPattern.class, "PortPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPatternEClass, ComponentPattern.class, "ComponentPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPattern_PortPatterns(), this.getPortPattern(), null, "portPatterns", null, 0, -1, ComponentPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypePatternEClass, PortTypePattern.class, "PortTypePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortTypePattern_Type(), theArt2Package.getPortType(), null, "type", null, 0, 1, PortTypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypeRefPatternEClass, PortTypeRefPattern.class, "PortTypeRefPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortTypeRefPattern_Ref(), this.getPortTypePattern(), null, "ref", null, 1, 1, PortTypeRefPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternNamedElementEClass, PatternNamedElement.class, "PatternNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternNamedElement_NamePattern(), ecorePackage.getEString(), "namePattern", null, 0, 1, PatternNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Art2AspectPackageImpl
