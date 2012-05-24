/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase.impl;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;

import fr.tm.elibel.smartqvt.qvt.emof.impl.EmofPackageImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;

import fr.tm.elibel.smartqvt.qvt.essentialocl.impl.EssentialoclPackageImpl;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.impl.ImperativeoclPackageImpl;

import fr.tm.elibel.smartqvt.qvt.primitivetypes.PrimitivetypesPackage;

import fr.tm.elibel.smartqvt.qvt.primitivetypes.impl.PrimitivetypesPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Domain;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Function;
import fr.tm.elibel.smartqvt.qvt.qvtbase.FunctionParameter;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Predicate;
import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbaseFactory;
import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Rule;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation;
import fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel;

import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;

import fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.impl.QvttemplatePackageImpl;

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
public class QvtbasePackageImpl extends EPackageImpl implements QvtbasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedModelEClass = null;

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
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QvtbasePackageImpl() {
		super(eNS_URI, QvtbaseFactory.eINSTANCE);
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
	public static QvtbasePackage init() {
		if (isInited) return (QvtbasePackage)EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI);

		// Obtain or create and register package
		QvtbasePackageImpl theQvtbasePackage = (QvtbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QvtbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QvtbasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EmofPackageImpl theEmofPackage = (EmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) instanceof EmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) : EmofPackage.eINSTANCE);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) : PrimitivetypesPackage.eINSTANCE);
		EssentialoclPackageImpl theEssentialoclPackage = (EssentialoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) instanceof EssentialoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) : EssentialoclPackage.eINSTANCE);
		ImperativeoclPackageImpl theImperativeoclPackage = (ImperativeoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) instanceof ImperativeoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) : ImperativeoclPackage.eINSTANCE);
		QvttemplatePackageImpl theQvttemplatePackage = (QvttemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) instanceof QvttemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) : QvttemplatePackage.eINSTANCE);
		QvtrelationPackageImpl theQvtrelationPackage = (QvtrelationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI) instanceof QvtrelationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI) : QvtrelationPackage.eINSTANCE);
		QvtcorePackageImpl theQvtcorePackage = (QvtcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI) instanceof QvtcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI) : QvtcorePackage.eINSTANCE);
		QvtoperationalPackageImpl theQvtoperationalPackage = (QvtoperationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI) instanceof QvtoperationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI) : QvtoperationalPackage.eINSTANCE);

		// Create package meta-data objects
		theQvtbasePackage.createPackageContents();
		theEmofPackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();
		theEssentialoclPackage.createPackageContents();
		theImperativeoclPackage.createPackageContents();
		theQvttemplatePackage.createPackageContents();
		theQvtrelationPackage.createPackageContents();
		theQvtcorePackage.createPackageContents();
		theQvtoperationalPackage.createPackageContents();

		// Initialize created meta-data
		theQvtbasePackage.initializePackageContents();
		theEmofPackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();
		theEssentialoclPackage.initializePackageContents();
		theImperativeoclPackage.initializePackageContents();
		theQvttemplatePackage.initializePackageContents();
		theQvtrelationPackage.initializePackageContents();
		theQvtcorePackage.initializePackageContents();
		theQvtoperationalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQvtbasePackage.freeze();

		return theQvtbasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IsCheckable() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IsEnforceable() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Rule() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TypedModel() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_QueryExpression() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_BindsTo() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Predicate() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_ConditionExpression() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Pattern() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Domain() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Overrides() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Transformation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Extends() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ModelParameter() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_OwnedTag() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Rule() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedModel() {
		return typedModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedModel_DependsOn() {
		return (EReference)typedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedModel_Transformation() {
		return (EReference)typedModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedModel_UsedPackage() {
		return (EReference)typedModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtbaseFactory getQvtbaseFactory() {
		return (QvtbaseFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__IS_CHECKABLE);
		createEAttribute(domainEClass, DOMAIN__IS_ENFORCEABLE);
		createEReference(domainEClass, DOMAIN__RULE);
		createEReference(domainEClass, DOMAIN__TYPED_MODEL);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__QUERY_EXPRESSION);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__BINDS_TO);
		createEReference(patternEClass, PATTERN__PREDICATE);

		predicateEClass = createEClass(PREDICATE);
		createEReference(predicateEClass, PREDICATE__CONDITION_EXPRESSION);
		createEReference(predicateEClass, PREDICATE__PATTERN);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__DOMAIN);
		createEReference(ruleEClass, RULE__OVERRIDES);
		createEReference(ruleEClass, RULE__TRANSFORMATION);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__EXTENDS);
		createEReference(transformationEClass, TRANSFORMATION__MODEL_PARAMETER);
		createEReference(transformationEClass, TRANSFORMATION__OWNED_TAG);
		createEReference(transformationEClass, TRANSFORMATION__RULE);

		typedModelEClass = createEClass(TYPED_MODEL);
		createEReference(typedModelEClass, TYPED_MODEL__DEPENDS_ON);
		createEReference(typedModelEClass, TYPED_MODEL__TRANSFORMATION);
		createEReference(typedModelEClass, TYPED_MODEL__USED_PACKAGE);
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
		EmofPackage theEmofPackage = (EmofPackage)EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		EssentialoclPackage theEssentialoclPackage = (EssentialoclPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI);

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(theEmofPackage.getNamedElement());
		functionEClass.getESuperTypes().add(theEmofPackage.getOperation());
		functionParameterEClass.getESuperTypes().add(theEssentialoclPackage.getVariable());
		functionParameterEClass.getESuperTypes().add(theEmofPackage.getParameter());
		patternEClass.getESuperTypes().add(theEmofPackage.getElement());
		predicateEClass.getESuperTypes().add(theEmofPackage.getElement());
		ruleEClass.getESuperTypes().add(theEmofPackage.getNamedElement());
		transformationEClass.getESuperTypes().add(theEmofPackage.getClass_());
		transformationEClass.getESuperTypes().add(theEmofPackage.getPackage());
		typedModelEClass.getESuperTypes().add(theEmofPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_IsCheckable(), thePrimitivetypesPackage.getBoolean(), "isCheckable", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_IsEnforceable(), thePrimitivetypesPackage.getBoolean(), "isEnforceable", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Rule(), this.getRule(), this.getRule_Domain(), "rule", null, 1, 1, Domain.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDomain_TypedModel(), this.getTypedModel(), null, "typedModel", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_QueryExpression(), theEssentialoclPackage.getOclExpression(), null, "queryExpression", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_BindsTo(), theEssentialoclPackage.getVariable(), null, "bindsTo", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_Predicate(), this.getPredicate(), this.getPredicate_Pattern(), "predicate", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicate_ConditionExpression(), theEssentialoclPackage.getOclExpression(), null, "conditionExpression", null, 1, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPredicate_Pattern(), this.getPattern(), this.getPattern_Predicate(), "pattern", null, 1, 1, Predicate.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Domain(), this.getDomain(), this.getDomain_Rule(), "domain", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_Overrides(), this.getRule(), null, "overrides", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRule_Transformation(), this.getTransformation(), this.getTransformation_Rule(), "transformation", null, 1, 1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Extends(), this.getTransformation(), null, "extends", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransformation_ModelParameter(), this.getTypedModel(), this.getTypedModel_Transformation(), "modelParameter", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransformation_OwnedTag(), theEmofPackage.getTag(), null, "ownedTag", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransformation_Rule(), this.getRule(), this.getRule_Transformation(), "rule", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typedModelEClass, TypedModel.class, "TypedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedModel_DependsOn(), this.getTypedModel(), null, "dependsOn", null, 0, -1, TypedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypedModel_Transformation(), this.getTransformation(), this.getTransformation_ModelParameter(), "transformation", null, 1, 1, TypedModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypedModel_UsedPackage(), theEmofPackage.getPackage(), null, "usedPackage", null, 1, -1, TypedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QvtbasePackageImpl
