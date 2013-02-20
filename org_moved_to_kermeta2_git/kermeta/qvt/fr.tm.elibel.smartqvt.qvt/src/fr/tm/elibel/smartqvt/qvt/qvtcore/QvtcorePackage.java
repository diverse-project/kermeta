/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;

import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcoreFactory
 * @model kind="package"
 * @generated
 */
public interface QvtcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvtcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/QVT/1.0/qvtcore.xml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvtcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvtcorePackage eINSTANCE = fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AreaImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getArea()
	 * @generated
	 */
	int AREA = 0;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BOTTOM_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Guard Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__GUARD_PATTERN = 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AssignmentImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__BOTTOM_PATTERN = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__IS_DEFAULT = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slot Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SLOT_EXPRESSION = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CorePatternImpl <em>Core Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CorePatternImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getCorePattern()
	 * @generated
	 */
	int CORE_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN__OWNED_COMMENT = QvtbasePackage.PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN__BINDS_TO = QvtbasePackage.PATTERN__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN__PREDICATE = QvtbasePackage.PATTERN__PREDICATE;

	/**
	 * The number of structural features of the '<em>Core Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_PATTERN_FEATURE_COUNT = QvtbasePackage.PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl <em>Bottom Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getBottomPattern()
	 * @generated
	 */
	int BOTTOM_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__OWNED_COMMENT = CORE_PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__BINDS_TO = CORE_PATTERN__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__PREDICATE = CORE_PATTERN__PREDICATE;

	/**
	 * The feature id for the '<em><b>Area</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__AREA = CORE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__ASSIGNMENT = CORE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enforcement Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__ENFORCEMENT_OPERATION = CORE_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realized Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN__REALIZED_VARIABLE = CORE_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bottom Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PATTERN_FEATURE_COUNT = CORE_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CoreDomainImpl <em>Core Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CoreDomainImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getCoreDomain()
	 * @generated
	 */
	int CORE_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__OWNED_COMMENT = QvtbasePackage.DOMAIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__NAME = QvtbasePackage.DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Is Checkable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__IS_CHECKABLE = QvtbasePackage.DOMAIN__IS_CHECKABLE;

	/**
	 * The feature id for the '<em><b>Is Enforceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__IS_ENFORCEABLE = QvtbasePackage.DOMAIN__IS_ENFORCEABLE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__RULE = QvtbasePackage.DOMAIN__RULE;

	/**
	 * The feature id for the '<em><b>Typed Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__TYPED_MODEL = QvtbasePackage.DOMAIN__TYPED_MODEL;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__BOTTOM_PATTERN = QvtbasePackage.DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN__GUARD_PATTERN = QvtbasePackage.DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Core Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DOMAIN_FEATURE_COUNT = QvtbasePackage.DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl <em>Enforcement Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getEnforcementOperation()
	 * @generated
	 */
	int ENFORCEMENT_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEMENT_OPERATION__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEMENT_OPERATION__BOTTOM_PATTERN = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enforcement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEMENT_OPERATION__ENFORCEMENT_MODE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Call Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEMENT_OPERATION__OPERATION_CALL_EXP = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enforcement Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEMENT_OPERATION_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.GuardPatternImpl <em>Guard Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.GuardPatternImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getGuardPattern()
	 * @generated
	 */
	int GUARD_PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_PATTERN__OWNED_COMMENT = CORE_PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_PATTERN__BINDS_TO = CORE_PATTERN__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_PATTERN__PREDICATE = CORE_PATTERN__PREDICATE;

	/**
	 * The feature id for the '<em><b>Area</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_PATTERN__AREA = CORE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_PATTERN_FEATURE_COUNT = CORE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OWNED_COMMENT = QvtbasePackage.RULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = QvtbasePackage.RULE__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DOMAIN = QvtbasePackage.RULE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OVERRIDES = QvtbasePackage.RULE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TRANSFORMATION = QvtbasePackage.RULE__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__BOTTOM_PATTERN = QvtbasePackage.RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__GUARD_PATTERN = QvtbasePackage.RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONTEXT = QvtbasePackage.RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__LOCAL = QvtbasePackage.RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__REFINEMENT = QvtbasePackage.RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SPECIFICATION = QvtbasePackage.RULE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = QvtbasePackage.RULE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.PropertyAssignmentImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getPropertyAssignment()
	 * @generated
	 */
	int PROPERTY_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__OWNED_COMMENT = ASSIGNMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__BOTTOM_PATTERN = ASSIGNMENT__BOTTOM_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__IS_DEFAULT = ASSIGNMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Slot Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__SLOT_EXPRESSION = ASSIGNMENT__SLOT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__VALUE = ASSIGNMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT__TARGET_PROPERTY = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.RealizedVariableImpl <em>Realized Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.RealizedVariableImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getRealizedVariable()
	 * @generated
	 */
	int REALIZED_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__OWNED_COMMENT = EssentialoclPackage.VARIABLE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__NAME = EssentialoclPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__TYPE = EssentialoclPackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__INIT_EXPRESSION = EssentialoclPackage.VARIABLE__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__LET_EXP = EssentialoclPackage.VARIABLE__LET_EXP;

	/**
	 * The feature id for the '<em><b>Represented Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__REPRESENTED_PARAMETER = EssentialoclPackage.VARIABLE__REPRESENTED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE__BOTTOM_PATTERN = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Realized Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_VARIABLE_FEATURE_COUNT = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.VariableAssignmentImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__OWNED_COMMENT = ASSIGNMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Bottom Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__BOTTOM_PATTERN = ASSIGNMENT__BOTTOM_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__IS_DEFAULT = ASSIGNMENT__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Slot Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__SLOT_EXPRESSION = ASSIGNMENT__SLOT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VALUE = ASSIGNMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__TARGET_VARIABLE = ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode <em>Enforcement Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getEnforcementMode()
	 * @generated
	 */
	int ENFORCEMENT_MODE = 11;


	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottom Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getBottomPattern()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_BottomPattern();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getGuardPattern <em>Guard Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getGuardPattern()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_GuardPattern();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bottom Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getBottomPattern()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_BottomPattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getIsDefault()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_IsDefault();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getSlotExpression <em>Slot Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slot Expression</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getSlotExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_SlotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bottom Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern
	 * @generated
	 */
	EClass getBottomPattern();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Area</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getArea()
	 * @see #getBottomPattern()
	 * @generated
	 */
	EReference getBottomPattern_Area();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getAssignment()
	 * @see #getBottomPattern()
	 * @generated
	 */
	EReference getBottomPattern_Assignment();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getEnforcementOperation <em>Enforcement Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enforcement Operation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getEnforcementOperation()
	 * @see #getBottomPattern()
	 * @generated
	 */
	EReference getBottomPattern_EnforcementOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getRealizedVariable <em>Realized Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realized Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getRealizedVariable()
	 * @see #getBottomPattern()
	 * @generated
	 */
	EReference getBottomPattern_RealizedVariable();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.CoreDomain <em>Core Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Domain</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.CoreDomain
	 * @generated
	 */
	EClass getCoreDomain();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.CorePattern <em>Core Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.CorePattern
	 * @generated
	 */
	EClass getCorePattern();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation <em>Enforcement Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enforcement Operation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation
	 * @generated
	 */
	EClass getEnforcementOperation();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bottom Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getBottomPattern()
	 * @see #getEnforcementOperation()
	 * @generated
	 */
	EReference getEnforcementOperation_BottomPattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getEnforcementMode <em>Enforcement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforcement Mode</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getEnforcementMode()
	 * @see #getEnforcementOperation()
	 * @generated
	 */
	EAttribute getEnforcementOperation_EnforcementMode();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getOperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Call Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getOperationCallExp()
	 * @see #getEnforcementOperation()
	 * @generated
	 */
	EReference getEnforcementOperation_OperationCallExp();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern <em>Guard Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern
	 * @generated
	 */
	EClass getGuardPattern();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Area</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern#getArea()
	 * @see #getGuardPattern()
	 * @generated
	 */
	EReference getGuardPattern_Area();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getContext()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getLocal()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Local();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getRefinement()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Refinement();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specification</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getSpecification()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Specification();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment <em>Property Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Assignment</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment
	 * @generated
	 */
	EClass getPropertyAssignment();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment#getTargetProperty <em>Target Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Property</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment#getTargetProperty()
	 * @see #getPropertyAssignment()
	 * @generated
	 */
	EReference getPropertyAssignment_TargetProperty();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable <em>Realized Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realized Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable
	 * @generated
	 */
	EClass getRealizedVariable();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bottom Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable#getBottomPattern()
	 * @see #getRealizedVariable()
	 * @generated
	 */
	EReference getRealizedVariable_BottomPattern();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment#getTargetVariable()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_TargetVariable();

	/**
	 * Returns the meta object for enum '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode <em>Enforcement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enforcement Mode</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode
	 * @generated
	 */
	EEnum getEnforcementMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QvtcoreFactory getQvtcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AreaImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Bottom Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__BOTTOM_PATTERN = eINSTANCE.getArea_BottomPattern();

		/**
		 * The meta object literal for the '<em><b>Guard Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__GUARD_PATTERN = eINSTANCE.getArea_GuardPattern();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.AssignmentImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Bottom Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__BOTTOM_PATTERN = eINSTANCE.getAssignment_BottomPattern();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__IS_DEFAULT = eINSTANCE.getAssignment_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Slot Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__SLOT_EXPRESSION = eINSTANCE.getAssignment_SlotExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl <em>Bottom Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getBottomPattern()
		 * @generated
		 */
		EClass BOTTOM_PATTERN = eINSTANCE.getBottomPattern();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTOM_PATTERN__AREA = eINSTANCE.getBottomPattern_Area();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTOM_PATTERN__ASSIGNMENT = eINSTANCE.getBottomPattern_Assignment();

		/**
		 * The meta object literal for the '<em><b>Enforcement Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTOM_PATTERN__ENFORCEMENT_OPERATION = eINSTANCE.getBottomPattern_EnforcementOperation();

		/**
		 * The meta object literal for the '<em><b>Realized Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTOM_PATTERN__REALIZED_VARIABLE = eINSTANCE.getBottomPattern_RealizedVariable();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CoreDomainImpl <em>Core Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CoreDomainImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getCoreDomain()
		 * @generated
		 */
		EClass CORE_DOMAIN = eINSTANCE.getCoreDomain();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CorePatternImpl <em>Core Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.CorePatternImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getCorePattern()
		 * @generated
		 */
		EClass CORE_PATTERN = eINSTANCE.getCorePattern();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl <em>Enforcement Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.EnforcementOperationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getEnforcementOperation()
		 * @generated
		 */
		EClass ENFORCEMENT_OPERATION = eINSTANCE.getEnforcementOperation();

		/**
		 * The meta object literal for the '<em><b>Bottom Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENFORCEMENT_OPERATION__BOTTOM_PATTERN = eINSTANCE.getEnforcementOperation_BottomPattern();

		/**
		 * The meta object literal for the '<em><b>Enforcement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENFORCEMENT_OPERATION__ENFORCEMENT_MODE = eINSTANCE.getEnforcementOperation_EnforcementMode();

		/**
		 * The meta object literal for the '<em><b>Operation Call Exp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENFORCEMENT_OPERATION__OPERATION_CALL_EXP = eINSTANCE.getEnforcementOperation_OperationCallExp();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.GuardPatternImpl <em>Guard Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.GuardPatternImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getGuardPattern()
		 * @generated
		 */
		EClass GUARD_PATTERN = eINSTANCE.getGuardPattern();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_PATTERN__AREA = eINSTANCE.getGuardPattern_Area();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__CONTEXT = eINSTANCE.getMapping_Context();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__LOCAL = eINSTANCE.getMapping_Local();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__REFINEMENT = eINSTANCE.getMapping_Refinement();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SPECIFICATION = eINSTANCE.getMapping_Specification();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.PropertyAssignmentImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getPropertyAssignment()
		 * @generated
		 */
		EClass PROPERTY_ASSIGNMENT = eINSTANCE.getPropertyAssignment();

		/**
		 * The meta object literal for the '<em><b>Target Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGNMENT__TARGET_PROPERTY = eINSTANCE.getPropertyAssignment_TargetProperty();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.RealizedVariableImpl <em>Realized Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.RealizedVariableImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getRealizedVariable()
		 * @generated
		 */
		EClass REALIZED_VARIABLE = eINSTANCE.getRealizedVariable();

		/**
		 * The meta object literal for the '<em><b>Bottom Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZED_VARIABLE__BOTTOM_PATTERN = eINSTANCE.getRealizedVariable_BottomPattern();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.VariableAssignmentImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__TARGET_VARIABLE = eINSTANCE.getVariableAssignment_TargetVariable();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode <em>Enforcement Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode
		 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcorePackageImpl#getEnforcementMode()
		 * @generated
		 */
		EEnum ENFORCEMENT_MODE = eINSTANCE.getEnforcementMode();

	}

} //QvtcorePackage
