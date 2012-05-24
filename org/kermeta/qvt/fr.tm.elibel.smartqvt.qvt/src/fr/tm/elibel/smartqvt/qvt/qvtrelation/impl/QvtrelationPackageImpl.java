/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation.impl;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;

import fr.tm.elibel.smartqvt.qvt.emof.impl.EmofPackageImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;

import fr.tm.elibel.smartqvt.qvt.essentialocl.impl.EssentialoclPackageImpl;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.impl.ImperativeoclPackageImpl;

import fr.tm.elibel.smartqvt.qvt.primitivetypes.PrimitivetypesPackage;

import fr.tm.elibel.smartqvt.qvt.primitivetypes.impl.PrimitivetypesPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;

import fr.tm.elibel.smartqvt.qvt.qvtbase.impl.QvtbasePackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;

import fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.DomainPattern;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.Key;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationFactory;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation;

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
public class QvtrelationPackageImpl extends EPackageImpl implements QvtrelationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDomainAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalTransformationEClass = null;

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
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QvtrelationPackageImpl() {
		super(eNS_URI, QvtrelationFactory.eINSTANCE);
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
	public static QvtrelationPackage init() {
		if (isInited) return (QvtrelationPackage)EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI);

		// Obtain or create and register package
		QvtrelationPackageImpl theQvtrelationPackage = (QvtrelationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QvtrelationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QvtrelationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EmofPackageImpl theEmofPackage = (EmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) instanceof EmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) : EmofPackage.eINSTANCE);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) : PrimitivetypesPackage.eINSTANCE);
		EssentialoclPackageImpl theEssentialoclPackage = (EssentialoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) instanceof EssentialoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) : EssentialoclPackage.eINSTANCE);
		ImperativeoclPackageImpl theImperativeoclPackage = (ImperativeoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) instanceof ImperativeoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) : ImperativeoclPackage.eINSTANCE);
		QvtbasePackageImpl theQvtbasePackage = (QvtbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI) instanceof QvtbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI) : QvtbasePackage.eINSTANCE);
		QvttemplatePackageImpl theQvttemplatePackage = (QvttemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) instanceof QvttemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) : QvttemplatePackage.eINSTANCE);
		QvtcorePackageImpl theQvtcorePackage = (QvtcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI) instanceof QvtcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI) : QvtcorePackage.eINSTANCE);
		QvtoperationalPackageImpl theQvtoperationalPackage = (QvtoperationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI) instanceof QvtoperationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI) : QvtoperationalPackage.eINSTANCE);

		// Create package meta-data objects
		theQvtrelationPackage.createPackageContents();
		theEmofPackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();
		theEssentialoclPackage.createPackageContents();
		theImperativeoclPackage.createPackageContents();
		theQvtbasePackage.createPackageContents();
		theQvttemplatePackage.createPackageContents();
		theQvtcorePackage.createPackageContents();
		theQvtoperationalPackage.createPackageContents();

		// Initialize created meta-data
		theQvtrelationPackage.initializePackageContents();
		theEmofPackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();
		theEssentialoclPackage.initializePackageContents();
		theImperativeoclPackage.initializePackageContents();
		theQvtbasePackage.initializePackageContents();
		theQvttemplatePackage.initializePackageContents();
		theQvtcorePackage.initializePackageContents();
		theQvtoperationalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQvtrelationPackage.freeze();

		return theQvtrelationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPattern() {
		return domainPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainPattern_TemplateExpression() {
		return (EReference)domainPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKey_Identifies() {
		return (EReference)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKey_Part() {
		return (EReference)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKey_Transformation() {
		return (EReference)keyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_IsTopLevel() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OperationalImpl() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Variable() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_When() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Where() {
		return (EReference)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationCallExp() {
		return relationCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCallExp_Argument() {
		return (EReference)relationCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCallExp_ReferredRelation() {
		return (EReference)relationCallExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationDomain() {
		return relationDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDomain_DefaultAssignment() {
		return (EReference)relationDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDomain_Pattern() {
		return (EReference)relationDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDomain_RootVariable() {
		return (EReference)relationDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationDomainAssignment() {
		return relationDomainAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDomainAssignment_ValueExp() {
		return (EReference)relationDomainAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDomainAssignment_Variable() {
		return (EReference)relationDomainAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationImplementation() {
		return relationImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationImplementation_Impl() {
		return (EReference)relationImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationImplementation_InDirectionOf() {
		return (EReference)relationImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationImplementation_Relation() {
		return (EReference)relationImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalTransformation() {
		return relationalTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalTransformation_OwnedKey() {
		return (EReference)relationalTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtrelationFactory getQvtrelationFactory() {
		return (QvtrelationFactory)getEFactoryInstance();
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
		domainPatternEClass = createEClass(DOMAIN_PATTERN);
		createEReference(domainPatternEClass, DOMAIN_PATTERN__TEMPLATE_EXPRESSION);

		keyEClass = createEClass(KEY);
		createEReference(keyEClass, KEY__IDENTIFIES);
		createEReference(keyEClass, KEY__PART);
		createEReference(keyEClass, KEY__TRANSFORMATION);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__IS_TOP_LEVEL);
		createEReference(relationEClass, RELATION__OPERATIONAL_IMPL);
		createEReference(relationEClass, RELATION__VARIABLE);
		createEReference(relationEClass, RELATION__WHEN);
		createEReference(relationEClass, RELATION__WHERE);

		relationCallExpEClass = createEClass(RELATION_CALL_EXP);
		createEReference(relationCallExpEClass, RELATION_CALL_EXP__ARGUMENT);
		createEReference(relationCallExpEClass, RELATION_CALL_EXP__REFERRED_RELATION);

		relationDomainEClass = createEClass(RELATION_DOMAIN);
		createEReference(relationDomainEClass, RELATION_DOMAIN__DEFAULT_ASSIGNMENT);
		createEReference(relationDomainEClass, RELATION_DOMAIN__PATTERN);
		createEReference(relationDomainEClass, RELATION_DOMAIN__ROOT_VARIABLE);

		relationDomainAssignmentEClass = createEClass(RELATION_DOMAIN_ASSIGNMENT);
		createEReference(relationDomainAssignmentEClass, RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP);
		createEReference(relationDomainAssignmentEClass, RELATION_DOMAIN_ASSIGNMENT__VARIABLE);

		relationImplementationEClass = createEClass(RELATION_IMPLEMENTATION);
		createEReference(relationImplementationEClass, RELATION_IMPLEMENTATION__IMPL);
		createEReference(relationImplementationEClass, RELATION_IMPLEMENTATION__IN_DIRECTION_OF);
		createEReference(relationImplementationEClass, RELATION_IMPLEMENTATION__RELATION);

		relationalTransformationEClass = createEClass(RELATIONAL_TRANSFORMATION);
		createEReference(relationalTransformationEClass, RELATIONAL_TRANSFORMATION__OWNED_KEY);
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
		QvtbasePackage theQvtbasePackage = (QvtbasePackage)EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI);
		QvttemplatePackage theQvttemplatePackage = (QvttemplatePackage)EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI);
		EmofPackage theEmofPackage = (EmofPackage)EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		EssentialoclPackage theEssentialoclPackage = (EssentialoclPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI);

		// Add supertypes to classes
		domainPatternEClass.getESuperTypes().add(theQvtbasePackage.getPattern());
		keyEClass.getESuperTypes().add(theEmofPackage.getElement());
		relationEClass.getESuperTypes().add(theQvtbasePackage.getRule());
		relationCallExpEClass.getESuperTypes().add(theEssentialoclPackage.getOclExpression());
		relationDomainEClass.getESuperTypes().add(theQvtbasePackage.getDomain());
		relationDomainAssignmentEClass.getESuperTypes().add(theEmofPackage.getElement());
		relationImplementationEClass.getESuperTypes().add(theEmofPackage.getElement());
		relationalTransformationEClass.getESuperTypes().add(theQvtbasePackage.getTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(domainPatternEClass, DomainPattern.class, "DomainPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainPattern_TemplateExpression(), theQvttemplatePackage.getTemplateExp(), null, "templateExpression", null, 0, 1, DomainPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKey_Identifies(), theEmofPackage.getClass_(), null, "identifies", null, 1, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getKey_Part(), theEmofPackage.getProperty(), null, "part", null, 1, -1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getKey_Transformation(), this.getRelationalTransformation(), this.getRelationalTransformation_OwnedKey(), "transformation", null, 0, 1, Key.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_IsTopLevel(), thePrimitivetypesPackage.getBoolean(), "isTopLevel", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OperationalImpl(), this.getRelationImplementation(), this.getRelationImplementation_Relation(), "operationalImpl", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelation_Variable(), theEssentialoclPackage.getVariable(), null, "variable", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelation_When(), theQvtbasePackage.getPattern(), null, "when", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelation_Where(), theQvtbasePackage.getPattern(), null, "where", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationCallExpEClass, RelationCallExp.class, "RelationCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationCallExp_Argument(), theEssentialoclPackage.getOclExpression(), null, "argument", null, 2, -1, RelationCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationCallExp_ReferredRelation(), this.getRelation(), null, "referredRelation", null, 1, 1, RelationCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationDomainEClass, RelationDomain.class, "RelationDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationDomain_DefaultAssignment(), this.getRelationDomainAssignment(), null, "defaultAssignment", null, 0, -1, RelationDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationDomain_Pattern(), this.getDomainPattern(), null, "pattern", null, 1, 1, RelationDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationDomain_RootVariable(), theEssentialoclPackage.getVariable(), null, "rootVariable", null, 1, 1, RelationDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationDomainAssignmentEClass, RelationDomainAssignment.class, "RelationDomainAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationDomainAssignment_ValueExp(), theEssentialoclPackage.getOclExpression(), null, "valueExp", null, 1, 1, RelationDomainAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationDomainAssignment_Variable(), theEssentialoclPackage.getVariable(), null, "variable", null, 1, 1, RelationDomainAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationImplementationEClass, RelationImplementation.class, "RelationImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationImplementation_Impl(), theEmofPackage.getOperation(), null, "impl", null, 1, 1, RelationImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationImplementation_InDirectionOf(), theQvtbasePackage.getTypedModel(), null, "inDirectionOf", null, 1, 1, RelationImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationImplementation_Relation(), this.getRelation(), this.getRelation_OperationalImpl(), "relation", null, 1, 1, RelationImplementation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationalTransformationEClass, RelationalTransformation.class, "RelationalTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTransformation_OwnedKey(), this.getKey(), this.getKey_Transformation(), "ownedKey", null, 0, -1, RelationalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QvtrelationPackageImpl
