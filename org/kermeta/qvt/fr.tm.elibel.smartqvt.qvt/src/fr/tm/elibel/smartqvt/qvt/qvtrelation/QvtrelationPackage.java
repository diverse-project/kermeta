/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;

import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationFactory
 * @model kind="package"
 * @generated
 */
public interface QvtrelationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvtrelation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/QVT/1.0/qvtrelation.xml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvtrelation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvtrelationPackage eINSTANCE = fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.DomainPatternImpl <em>Domain Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.DomainPatternImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getDomainPattern()
	 * @generated
	 */
	int DOMAIN_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__OWNED_COMMENT = QvtbasePackage.PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__BINDS_TO = QvtbasePackage.PATTERN__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__PREDICATE = QvtbasePackage.PATTERN__PREDICATE;

	/**
	 * The feature id for the '<em><b>Template Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__TEMPLATE_EXPRESSION = QvtbasePackage.PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN_FEATURE_COUNT = QvtbasePackage.PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.KeyImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Identifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__IDENTIFIES = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__PART = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__TRANSFORMATION = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNED_COMMENT = QvtbasePackage.RULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = QvtbasePackage.RULE__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DOMAIN = QvtbasePackage.RULE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OVERRIDES = QvtbasePackage.RULE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TRANSFORMATION = QvtbasePackage.RULE__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Is Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_TOP_LEVEL = QvtbasePackage.RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Impl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPERATIONAL_IMPL = QvtbasePackage.RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VARIABLE = QvtbasePackage.RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__WHEN = QvtbasePackage.RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__WHERE = QvtbasePackage.RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = QvtbasePackage.RULE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationCallExpImpl <em>Relation Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationCallExpImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationCallExp()
	 * @generated
	 */
	int RELATION_CALL_EXP = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__OWNED_COMMENT = EssentialoclPackage.OCL_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__NAME = EssentialoclPackage.OCL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__TYPE = EssentialoclPackage.OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__ARGUMENT = EssentialoclPackage.OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__REFERRED_RELATION = EssentialoclPackage.OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP_FEATURE_COUNT = EssentialoclPackage.OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainImpl <em>Relation Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationDomain()
	 * @generated
	 */
	int RELATION_DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__OWNED_COMMENT = QvtbasePackage.DOMAIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__NAME = QvtbasePackage.DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Is Checkable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__IS_CHECKABLE = QvtbasePackage.DOMAIN__IS_CHECKABLE;

	/**
	 * The feature id for the '<em><b>Is Enforceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__IS_ENFORCEABLE = QvtbasePackage.DOMAIN__IS_ENFORCEABLE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__RULE = QvtbasePackage.DOMAIN__RULE;

	/**
	 * The feature id for the '<em><b>Typed Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__TYPED_MODEL = QvtbasePackage.DOMAIN__TYPED_MODEL;

	/**
	 * The feature id for the '<em><b>Default Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__DEFAULT_ASSIGNMENT = QvtbasePackage.DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__PATTERN = QvtbasePackage.DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__ROOT_VARIABLE = QvtbasePackage.DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_FEATURE_COUNT = QvtbasePackage.DOMAIN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainAssignmentImpl <em>Relation Domain Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainAssignmentImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationDomainAssignment()
	 * @generated
	 */
	int RELATION_DOMAIN_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Value Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__VARIABLE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Domain Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImplementationImpl <em>Relation Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImplementationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationImplementation()
	 * @generated
	 */
	int RELATION_IMPLEMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__IMPL = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Direction Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__IN_DIRECTION_OF = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__RELATION = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationalTransformationImpl <em>Relational Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationalTransformationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationalTransformation()
	 * @generated
	 */
	int RELATIONAL_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_COMMENT = QvtbasePackage.TRANSFORMATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__NAME = QvtbasePackage.TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__PACKAGE = QvtbasePackage.TRANSFORMATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__IS_ABSTRACT = QvtbasePackage.TRANSFORMATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_ATTRIBUTE = QvtbasePackage.TRANSFORMATION__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_OPERATION = QvtbasePackage.TRANSFORMATION__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__SUPER_CLASS = QvtbasePackage.TRANSFORMATION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__NESTED_PACKAGE = QvtbasePackage.TRANSFORMATION__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_TYPE = QvtbasePackage.TRANSFORMATION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__URI = QvtbasePackage.TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__EXTENDS = QvtbasePackage.TRANSFORMATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Model Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__MODEL_PARAMETER = QvtbasePackage.TRANSFORMATION__MODEL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_TAG = QvtbasePackage.TRANSFORMATION__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__RULE = QvtbasePackage.TRANSFORMATION__RULE;

	/**
	 * The feature id for the '<em><b>Owned Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_KEY = QvtbasePackage.TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION_FEATURE_COUNT = QvtbasePackage.TRANSFORMATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.DomainPattern <em>Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.DomainPattern
	 * @generated
	 */
	EClass getDomainPattern();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.DomainPattern#getTemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Expression</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.DomainPattern#getTemplateExpression()
	 * @see #getDomainPattern()
	 * @generated
	 */
	EReference getDomainPattern_TemplateExpression();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getIdentifies <em>Identifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifies</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getIdentifies()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Identifies();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getPart()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Part();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getTransformation()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Transformation();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getIsTopLevel <em>Is Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Top Level</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getIsTopLevel()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsTopLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getOperationalImpl <em>Operational Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operational Impl</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getOperationalImpl()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OperationalImpl();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getVariable()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhen()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_When();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhere()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Where();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp <em>Relation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Call Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp
	 * @generated
	 */
	EClass getRelationCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp#getArgument()
	 * @see #getRelationCallExp()
	 * @generated
	 */
	EReference getRelationCallExp_Argument();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp#getReferredRelation <em>Referred Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Relation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp#getReferredRelation()
	 * @see #getRelationCallExp()
	 * @generated
	 */
	EReference getRelationCallExp_ReferredRelation();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain <em>Relation Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Domain</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain
	 * @generated
	 */
	EClass getRelationDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getDefaultAssignment <em>Default Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Assignment</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getDefaultAssignment()
	 * @see #getRelationDomain()
	 * @generated
	 */
	EReference getRelationDomain_DefaultAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getPattern()
	 * @see #getRelationDomain()
	 * @generated
	 */
	EReference getRelationDomain_Pattern();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getRootVariable <em>Root Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getRootVariable()
	 * @see #getRelationDomain()
	 * @generated
	 */
	EReference getRelationDomain_RootVariable();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment <em>Relation Domain Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Domain Assignment</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment
	 * @generated
	 */
	EClass getRelationDomainAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment#getValueExp <em>Value Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment#getValueExp()
	 * @see #getRelationDomainAssignment()
	 * @generated
	 */
	EReference getRelationDomainAssignment_ValueExp();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment#getVariable()
	 * @see #getRelationDomainAssignment()
	 * @generated
	 */
	EReference getRelationDomainAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation <em>Relation Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Implementation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation
	 * @generated
	 */
	EClass getRelationImplementation();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getImpl()
	 * @see #getRelationImplementation()
	 * @generated
	 */
	EReference getRelationImplementation_Impl();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getInDirectionOf <em>In Direction Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Direction Of</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getInDirectionOf()
	 * @see #getRelationImplementation()
	 * @generated
	 */
	EReference getRelationImplementation_InDirectionOf();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getRelation()
	 * @see #getRelationImplementation()
	 * @generated
	 */
	EReference getRelationImplementation_Relation();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation <em>Relational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Transformation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation
	 * @generated
	 */
	EClass getRelationalTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation#getOwnedKey <em>Owned Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Key</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation#getOwnedKey()
	 * @see #getRelationalTransformation()
	 * @generated
	 */
	EReference getRelationalTransformation_OwnedKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QvtrelationFactory getQvtrelationFactory();

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
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.DomainPatternImpl <em>Domain Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.DomainPatternImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getDomainPattern()
		 * @generated
		 */
		EClass DOMAIN_PATTERN = eINSTANCE.getDomainPattern();

		/**
		 * The meta object literal for the '<em><b>Template Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PATTERN__TEMPLATE_EXPRESSION = eINSTANCE.getDomainPattern_TemplateExpression();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.KeyImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Identifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__IDENTIFIES = eINSTANCE.getKey_Identifies();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__PART = eINSTANCE.getKey_Part();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__TRANSFORMATION = eINSTANCE.getKey_Transformation();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Is Top Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_TOP_LEVEL = eINSTANCE.getRelation_IsTopLevel();

		/**
		 * The meta object literal for the '<em><b>Operational Impl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPERATIONAL_IMPL = eINSTANCE.getRelation_OperationalImpl();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__VARIABLE = eINSTANCE.getRelation_Variable();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__WHEN = eINSTANCE.getRelation_When();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__WHERE = eINSTANCE.getRelation_Where();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationCallExpImpl <em>Relation Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationCallExpImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationCallExp()
		 * @generated
		 */
		EClass RELATION_CALL_EXP = eINSTANCE.getRelationCallExp();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CALL_EXP__ARGUMENT = eINSTANCE.getRelationCallExp_Argument();

		/**
		 * The meta object literal for the '<em><b>Referred Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CALL_EXP__REFERRED_RELATION = eINSTANCE.getRelationCallExp_ReferredRelation();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainImpl <em>Relation Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationDomain()
		 * @generated
		 */
		EClass RELATION_DOMAIN = eINSTANCE.getRelationDomain();

		/**
		 * The meta object literal for the '<em><b>Default Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN__DEFAULT_ASSIGNMENT = eINSTANCE.getRelationDomain_DefaultAssignment();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN__PATTERN = eINSTANCE.getRelationDomain_Pattern();

		/**
		 * The meta object literal for the '<em><b>Root Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN__ROOT_VARIABLE = eINSTANCE.getRelationDomain_RootVariable();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainAssignmentImpl <em>Relation Domain Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationDomainAssignmentImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationDomainAssignment()
		 * @generated
		 */
		EClass RELATION_DOMAIN_ASSIGNMENT = eINSTANCE.getRelationDomainAssignment();

		/**
		 * The meta object literal for the '<em><b>Value Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP = eINSTANCE.getRelationDomainAssignment_ValueExp();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN_ASSIGNMENT__VARIABLE = eINSTANCE.getRelationDomainAssignment_Variable();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImplementationImpl <em>Relation Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationImplementationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationImplementation()
		 * @generated
		 */
		EClass RELATION_IMPLEMENTATION = eINSTANCE.getRelationImplementation();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_IMPLEMENTATION__IMPL = eINSTANCE.getRelationImplementation_Impl();

		/**
		 * The meta object literal for the '<em><b>In Direction Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_IMPLEMENTATION__IN_DIRECTION_OF = eINSTANCE.getRelationImplementation_InDirectionOf();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_IMPLEMENTATION__RELATION = eINSTANCE.getRelationImplementation_Relation();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationalTransformationImpl <em>Relational Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationalTransformationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.QvtrelationPackageImpl#getRelationalTransformation()
		 * @generated
		 */
		EClass RELATIONAL_TRANSFORMATION = eINSTANCE.getRelationalTransformation();

		/**
		 * The meta object literal for the '<em><b>Owned Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_TRANSFORMATION__OWNED_KEY = eINSTANCE.getRelationalTransformation_OwnedKey();

	}

} //QvtrelationPackage
