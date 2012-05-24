/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore.impl;

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

import fr.tm.elibel.smartqvt.qvt.qvtcore.Area;
import fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment;
import fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.CoreDomain;
import fr.tm.elibel.smartqvt.qvt.qvtcore.CorePattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode;
import fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation;
import fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping;
import fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment;
import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcoreFactory;
import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;
import fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable;
import fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.impl.QvttemplatePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QvtcorePackageImpl extends EPackageImpl implements QvtcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bottomPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enforcementOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enforcementModeEEnum = null;

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
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QvtcorePackageImpl() {
		super(eNS_URI, QvtcoreFactory.eINSTANCE);
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
	public static QvtcorePackage init() {
		if (isInited) return (QvtcorePackage)EPackage.Registry.INSTANCE.getEPackage(QvtcorePackage.eNS_URI);

		// Obtain or create and register package
		QvtcorePackageImpl theQvtcorePackage = (QvtcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QvtcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QvtcorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EmofPackageImpl theEmofPackage = (EmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) instanceof EmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmofPackage.eNS_URI) : EmofPackage.eINSTANCE);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) : PrimitivetypesPackage.eINSTANCE);
		EssentialoclPackageImpl theEssentialoclPackage = (EssentialoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) instanceof EssentialoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EssentialoclPackage.eNS_URI) : EssentialoclPackage.eINSTANCE);
		ImperativeoclPackageImpl theImperativeoclPackage = (ImperativeoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) instanceof ImperativeoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImperativeoclPackage.eNS_URI) : ImperativeoclPackage.eINSTANCE);
		QvtbasePackageImpl theQvtbasePackage = (QvtbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI) instanceof QvtbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI) : QvtbasePackage.eINSTANCE);
		QvttemplatePackageImpl theQvttemplatePackage = (QvttemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) instanceof QvttemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvttemplatePackage.eNS_URI) : QvttemplatePackage.eINSTANCE);
		QvtrelationPackageImpl theQvtrelationPackage = (QvtrelationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI) instanceof QvtrelationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtrelationPackage.eNS_URI) : QvtrelationPackage.eINSTANCE);
		QvtoperationalPackageImpl theQvtoperationalPackage = (QvtoperationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI) instanceof QvtoperationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QvtoperationalPackage.eNS_URI) : QvtoperationalPackage.eINSTANCE);

		// Create package meta-data objects
		theQvtcorePackage.createPackageContents();
		theEmofPackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();
		theEssentialoclPackage.createPackageContents();
		theImperativeoclPackage.createPackageContents();
		theQvtbasePackage.createPackageContents();
		theQvttemplatePackage.createPackageContents();
		theQvtrelationPackage.createPackageContents();
		theQvtoperationalPackage.createPackageContents();

		// Initialize created meta-data
		theQvtcorePackage.initializePackageContents();
		theEmofPackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();
		theEssentialoclPackage.initializePackageContents();
		theImperativeoclPackage.initializePackageContents();
		theQvtbasePackage.initializePackageContents();
		theQvttemplatePackage.initializePackageContents();
		theQvtrelationPackage.initializePackageContents();
		theQvtoperationalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQvtcorePackage.freeze();

		return theQvtcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_BottomPattern() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_GuardPattern() {
		return (EReference)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_BottomPattern() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_IsDefault() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_SlotExpression() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Value() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBottomPattern() {
		return bottomPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottomPattern_Area() {
		return (EReference)bottomPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottomPattern_Assignment() {
		return (EReference)bottomPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottomPattern_EnforcementOperation() {
		return (EReference)bottomPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottomPattern_RealizedVariable() {
		return (EReference)bottomPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreDomain() {
		return coreDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorePattern() {
		return corePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnforcementOperation() {
		return enforcementOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnforcementOperation_BottomPattern() {
		return (EReference)enforcementOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnforcementOperation_EnforcementMode() {
		return (EAttribute)enforcementOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnforcementOperation_OperationCallExp() {
		return (EReference)enforcementOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardPattern() {
		return guardPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardPattern_Area() {
		return (EReference)guardPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Context() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Local() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Refinement() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Specification() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAssignment() {
		return propertyAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAssignment_TargetProperty() {
		return (EReference)propertyAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizedVariable() {
		return realizedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizedVariable_BottomPattern() {
		return (EReference)realizedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_TargetVariable() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnforcementMode() {
		return enforcementModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtcoreFactory getQvtcoreFactory() {
		return (QvtcoreFactory)getEFactoryInstance();
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
		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__BOTTOM_PATTERN);
		createEReference(areaEClass, AREA__GUARD_PATTERN);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__BOTTOM_PATTERN);
		createEAttribute(assignmentEClass, ASSIGNMENT__IS_DEFAULT);
		createEReference(assignmentEClass, ASSIGNMENT__SLOT_EXPRESSION);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		bottomPatternEClass = createEClass(BOTTOM_PATTERN);
		createEReference(bottomPatternEClass, BOTTOM_PATTERN__AREA);
		createEReference(bottomPatternEClass, BOTTOM_PATTERN__ASSIGNMENT);
		createEReference(bottomPatternEClass, BOTTOM_PATTERN__ENFORCEMENT_OPERATION);
		createEReference(bottomPatternEClass, BOTTOM_PATTERN__REALIZED_VARIABLE);

		coreDomainEClass = createEClass(CORE_DOMAIN);

		corePatternEClass = createEClass(CORE_PATTERN);

		enforcementOperationEClass = createEClass(ENFORCEMENT_OPERATION);
		createEReference(enforcementOperationEClass, ENFORCEMENT_OPERATION__BOTTOM_PATTERN);
		createEAttribute(enforcementOperationEClass, ENFORCEMENT_OPERATION__ENFORCEMENT_MODE);
		createEReference(enforcementOperationEClass, ENFORCEMENT_OPERATION__OPERATION_CALL_EXP);

		guardPatternEClass = createEClass(GUARD_PATTERN);
		createEReference(guardPatternEClass, GUARD_PATTERN__AREA);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__CONTEXT);
		createEReference(mappingEClass, MAPPING__LOCAL);
		createEReference(mappingEClass, MAPPING__REFINEMENT);
		createEReference(mappingEClass, MAPPING__SPECIFICATION);

		propertyAssignmentEClass = createEClass(PROPERTY_ASSIGNMENT);
		createEReference(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__TARGET_PROPERTY);

		realizedVariableEClass = createEClass(REALIZED_VARIABLE);
		createEReference(realizedVariableEClass, REALIZED_VARIABLE__BOTTOM_PATTERN);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__TARGET_VARIABLE);

		// Create enums
		enforcementModeEEnum = createEEnum(ENFORCEMENT_MODE);
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
		QvtbasePackage theQvtbasePackage = (QvtbasePackage)EPackage.Registry.INSTANCE.getEPackage(QvtbasePackage.eNS_URI);

		// Add supertypes to classes
		assignmentEClass.getESuperTypes().add(theEmofPackage.getElement());
		bottomPatternEClass.getESuperTypes().add(this.getCorePattern());
		coreDomainEClass.getESuperTypes().add(theQvtbasePackage.getDomain());
		coreDomainEClass.getESuperTypes().add(this.getArea());
		corePatternEClass.getESuperTypes().add(theQvtbasePackage.getPattern());
		enforcementOperationEClass.getESuperTypes().add(theEmofPackage.getElement());
		guardPatternEClass.getESuperTypes().add(this.getCorePattern());
		mappingEClass.getESuperTypes().add(theQvtbasePackage.getRule());
		mappingEClass.getESuperTypes().add(this.getArea());
		propertyAssignmentEClass.getESuperTypes().add(this.getAssignment());
		realizedVariableEClass.getESuperTypes().add(theEssentialoclPackage.getVariable());
		variableAssignmentEClass.getESuperTypes().add(this.getAssignment());

		// Initialize classes and features; add operations and parameters
		initEClass(areaEClass, Area.class, "Area", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_BottomPattern(), this.getBottomPattern(), this.getBottomPattern_Area(), "bottomPattern", null, 1, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArea_GuardPattern(), this.getGuardPattern(), this.getGuardPattern_Area(), "guardPattern", null, 1, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_BottomPattern(), this.getBottomPattern(), this.getBottomPattern_Assignment(), "bottomPattern", null, 1, 1, Assignment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssignment_IsDefault(), thePrimitivetypesPackage.getBoolean(), "isDefault", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_SlotExpression(), theEssentialoclPackage.getOclExpression(), null, "slotExpression", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignment_Value(), theEssentialoclPackage.getOclExpression(), null, "value", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bottomPatternEClass, BottomPattern.class, "BottomPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBottomPattern_Area(), this.getArea(), this.getArea_BottomPattern(), "area", null, 1, 1, BottomPattern.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBottomPattern_Assignment(), this.getAssignment(), this.getAssignment_BottomPattern(), "assignment", null, 0, -1, BottomPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBottomPattern_EnforcementOperation(), this.getEnforcementOperation(), this.getEnforcementOperation_BottomPattern(), "enforcementOperation", null, 0, -1, BottomPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBottomPattern_RealizedVariable(), this.getRealizedVariable(), this.getRealizedVariable_BottomPattern(), "realizedVariable", null, 0, -1, BottomPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(coreDomainEClass, CoreDomain.class, "CoreDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(corePatternEClass, CorePattern.class, "CorePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enforcementOperationEClass, EnforcementOperation.class, "EnforcementOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnforcementOperation_BottomPattern(), this.getBottomPattern(), this.getBottomPattern_EnforcementOperation(), "bottomPattern", null, 1, 1, EnforcementOperation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnforcementOperation_EnforcementMode(), this.getEnforcementMode(), "enforcementMode", null, 0, 1, EnforcementOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnforcementOperation_OperationCallExp(), theEssentialoclPackage.getOperationCallExp(), null, "operationCallExp", null, 1, 1, EnforcementOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guardPatternEClass, GuardPattern.class, "GuardPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardPattern_Area(), this.getArea(), this.getArea_GuardPattern(), "area", null, 1, 1, GuardPattern.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Context(), this.getMapping(), this.getMapping_Local(), "context", null, 0, 1, Mapping.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapping_Local(), this.getMapping(), this.getMapping_Context(), "local", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapping_Refinement(), this.getMapping(), this.getMapping_Specification(), "refinement", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapping_Specification(), this.getMapping(), this.getMapping_Refinement(), "specification", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyAssignmentEClass, PropertyAssignment.class, "PropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAssignment_TargetProperty(), theEmofPackage.getProperty(), null, "targetProperty", null, 1, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realizedVariableEClass, RealizedVariable.class, "RealizedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizedVariable_BottomPattern(), this.getBottomPattern(), this.getBottomPattern_RealizedVariable(), "bottomPattern", null, 1, 1, RealizedVariable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_TargetVariable(), theEssentialoclPackage.getVariable(), null, "targetVariable", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enforcementModeEEnum, EnforcementMode.class, "EnforcementMode");
		addEEnumLiteral(enforcementModeEEnum, EnforcementMode.CREATION_LITERAL);
		addEEnumLiteral(enforcementModeEEnum, EnforcementMode.DELETION_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //QvtcorePackageImpl
