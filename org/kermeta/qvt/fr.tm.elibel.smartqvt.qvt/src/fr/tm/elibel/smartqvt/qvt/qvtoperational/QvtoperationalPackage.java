/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;

import fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage;

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
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalFactory
 * @model kind="package"
 * @generated
 */
public interface QvtoperationalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvtoperational";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/QVT/1.0/qvtoperational.xml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvtoperational";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvtoperationalPackage eINSTANCE = fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeOperationImpl <em>Imperative Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeOperationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getImperativeOperation()
	 * @generated
	 */
	int IMPERATIVE_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OWNED_COMMENT = EmofPackage.OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__NAME = EmofPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__TYPE = EmofPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_ORDERED = EmofPackage.OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_UNIQUE = EmofPackage.OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__LOWER = EmofPackage.OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__UPPER = EmofPackage.OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__CLASS = EmofPackage.OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OWNED_PARAMETER = EmofPackage.OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__RAISED_EXCEPTION = EmofPackage.OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__BODY = EmofPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__CONTEXT = EmofPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__IS_BLACKBOX = EmofPackage.OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__OVERRIDDEN = EmofPackage.OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION__RESULT = EmofPackage.OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Imperative Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_FEATURE_COUNT = EmofPackage.OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationBodyImpl <em>Operation Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationBodyImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getOperationBody()
	 * @generated
	 */
	int OPERATION_BODY = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__CONTENT = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__OPERATION = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__VARIABLE = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorBodyImpl <em>Constructor Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorBodyImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getConstructorBody()
	 * @generated
	 */
	int CONSTRUCTOR_BODY = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__OWNED_COMMENT = OPERATION_BODY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__CONTENT = OPERATION_BODY__CONTENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__OPERATION = OPERATION_BODY__OPERATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY__VARIABLE = OPERATION_BODY__VARIABLE;

	/**
	 * The number of structural features of the '<em>Constructor Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_BODY_FEATURE_COUNT = OPERATION_BODY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ContextualPropertyImpl <em>Contextual Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ContextualPropertyImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getContextualProperty()
	 * @generated
	 */
	int CONTEXTUAL_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OWNED_COMMENT = EmofPackage.PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__NAME = EmofPackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__TYPE = EmofPackage.PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_ORDERED = EmofPackage.PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_UNIQUE = EmofPackage.PROPERTY__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__LOWER = EmofPackage.PROPERTY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__UPPER = EmofPackage.PROPERTY__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CLASS = EmofPackage.PROPERTY__CLASS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__DEFAULT = EmofPackage.PROPERTY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_COMPOSITE = EmofPackage.PROPERTY__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_DERIVED = EmofPackage.PROPERTY__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_ID = EmofPackage.PROPERTY__IS_ID;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__IS_READ_ONLY = EmofPackage.PROPERTY__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OPPOSITE = EmofPackage.PROPERTY__OPPOSITE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__CONTEXT = EmofPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__INIT_EXPRESSION = EmofPackage.PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY__OVERRIDDEN = EmofPackage.PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contextual Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_FEATURE_COUNT = EmofPackage.PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.EntryOperationImpl <em>Entry Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.EntryOperationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getEntryOperation()
	 * @generated
	 */
	int ENTRY_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The number of structural features of the '<em>Entry Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.HelperImpl <em>Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.HelperImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getHelper()
	 * @generated
	 */
	int HELPER = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__IS_QUERY = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeCallExpImpl <em>Imperative Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeCallExpImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getImperativeCallExp()
	 * @generated
	 */
	int IMPERATIVE_CALL_EXP = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__OWNED_COMMENT = EssentialoclPackage.OPERATION_CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__NAME = EssentialoclPackage.OPERATION_CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__TYPE = EssentialoclPackage.OPERATION_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__SOURCE = EssentialoclPackage.OPERATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__ARGUMENT = EssentialoclPackage.OPERATION_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__REFERRED_OPERATION = EssentialoclPackage.OPERATION_CALL_EXP__REFERRED_OPERATION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP__IS_VIRTUAL = EssentialoclPackage.OPERATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imperative Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_CALL_EXP_FEATURE_COUNT = EssentialoclPackage.OPERATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = EmofPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PACKAGE = EmofPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NESTED_PACKAGE = EmofPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_TYPE = EmofPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__URI = EmofPackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONFIG_PROPERTY = EmofPackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ENTRY = EmofPackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_BLACKBOX = EmofPackage.CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_IMPORT = EmofPackage.CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_TAG = EmofPackage.CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_VARIABLE = EmofPackage.CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__USED_MODEL_TYPE = EmofPackage.CLASS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.LibraryImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PACKAGE = MODULE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IS_ABSTRACT = MODULE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_ATTRIBUTE = MODULE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_OPERATION = MODULE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SUPER_CLASS = MODULE__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingBodyImpl <em>Mapping Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingBodyImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingBody()
	 * @generated
	 */
	int MAPPING_BODY = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__OWNED_COMMENT = OPERATION_BODY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__CONTENT = OPERATION_BODY__CONTENT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__OPERATION = OPERATION_BODY__OPERATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__VARIABLE = OPERATION_BODY__VARIABLE;

	/**
	 * The feature id for the '<em><b>End Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__END_SECTION = OPERATION_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY__INIT_SECTION = OPERATION_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_FEATURE_COUNT = OPERATION_BODY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingCallExpImpl <em>Mapping Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingCallExpImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingCallExp()
	 * @generated
	 */
	int MAPPING_CALL_EXP = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__OWNED_COMMENT = IMPERATIVE_CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__NAME = IMPERATIVE_CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__TYPE = IMPERATIVE_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__SOURCE = IMPERATIVE_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__ARGUMENT = IMPERATIVE_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__REFERRED_OPERATION = IMPERATIVE_CALL_EXP__REFERRED_OPERATION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__IS_VIRTUAL = IMPERATIVE_CALL_EXP__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP__IS_STRICT = IMPERATIVE_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_FEATURE_COUNT = IMPERATIVE_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl <em>Mapping Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingOperation()
	 * @generated
	 */
	int MAPPING_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_COMMENT = IMPERATIVE_OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__NAME = IMPERATIVE_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__TYPE = IMPERATIVE_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_ORDERED = IMPERATIVE_OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_UNIQUE = IMPERATIVE_OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__LOWER = IMPERATIVE_OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__UPPER = IMPERATIVE_OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CLASS = IMPERATIVE_OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OWNED_PARAMETER = IMPERATIVE_OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__RAISED_EXCEPTION = IMPERATIVE_OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__BODY = IMPERATIVE_OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__CONTEXT = IMPERATIVE_OPERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__IS_BLACKBOX = IMPERATIVE_OPERATION__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__OVERRIDDEN = IMPERATIVE_OPERATION__OVERRIDDEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__RESULT = IMPERATIVE_OPERATION__RESULT;

	/**
	 * The feature id for the '<em><b>Disjunct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__DISJUNCT = IMPERATIVE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__INHERITED = IMPERATIVE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__MERGED = IMPERATIVE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__REFINED_RELATION = IMPERATIVE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__WHEN = IMPERATIVE_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION__WHERE = IMPERATIVE_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mapping Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_FEATURE_COUNT = IMPERATIVE_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.VarParameterImpl <em>Var Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.VarParameterImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getVarParameter()
	 * @generated
	 */
	int VAR_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__OWNED_COMMENT = EssentialoclPackage.VARIABLE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__NAME = EssentialoclPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__TYPE = EssentialoclPackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__INIT_EXPRESSION = EssentialoclPackage.VARIABLE__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__LET_EXP = EssentialoclPackage.VARIABLE__LET_EXP;

	/**
	 * The feature id for the '<em><b>Represented Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__REPRESENTED_PARAMETER = EssentialoclPackage.VARIABLE__REPRESENTED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__IS_ORDERED = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__IS_UNIQUE = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__LOWER = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__UPPER = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__OPERATION = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__CTX_OWNER = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__KIND = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER__RES_OWNER = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Var Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_PARAMETER_FEATURE_COUNT = EssentialoclPackage.VARIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingParameterImpl <em>Mapping Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingParameterImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingParameter()
	 * @generated
	 */
	int MAPPING_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__OWNED_COMMENT = VAR_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__NAME = VAR_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__TYPE = VAR_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__INIT_EXPRESSION = VAR_PARAMETER__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__LET_EXP = VAR_PARAMETER__LET_EXP;

	/**
	 * The feature id for the '<em><b>Represented Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__REPRESENTED_PARAMETER = VAR_PARAMETER__REPRESENTED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__IS_ORDERED = VAR_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__IS_UNIQUE = VAR_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__LOWER = VAR_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__UPPER = VAR_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__OPERATION = VAR_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__CTX_OWNER = VAR_PARAMETER__CTX_OWNER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__KIND = VAR_PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__RES_OWNER = VAR_PARAMETER__RES_OWNER;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__EXTENT = VAR_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER__REFERRED_DOMAIN = VAR_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETER_FEATURE_COUNT = VAR_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelParameterImpl <em>Model Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelParameterImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModelParameter()
	 * @generated
	 */
	int MODEL_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__OWNED_COMMENT = VAR_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__NAME = VAR_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__TYPE = VAR_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__INIT_EXPRESSION = VAR_PARAMETER__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__LET_EXP = VAR_PARAMETER__LET_EXP;

	/**
	 * The feature id for the '<em><b>Represented Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__REPRESENTED_PARAMETER = VAR_PARAMETER__REPRESENTED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__IS_ORDERED = VAR_PARAMETER__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__IS_UNIQUE = VAR_PARAMETER__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__LOWER = VAR_PARAMETER__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__UPPER = VAR_PARAMETER__UPPER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__OPERATION = VAR_PARAMETER__OPERATION;

	/**
	 * The feature id for the '<em><b>Ctx Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__CTX_OWNER = VAR_PARAMETER__CTX_OWNER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__KIND = VAR_PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Res Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER__RES_OWNER = VAR_PARAMETER__RES_OWNER;

	/**
	 * The number of structural features of the '<em>Model Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAMETER_FEATURE_COUNT = VAR_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelTypeImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = EmofPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PACKAGE = EmofPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Additional Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ADDITIONAL_CONDITION = EmofPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conformance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFORMANCE_KIND = EmofPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__METAMODEL = EmofPackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImportImpl <em>Module Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImportImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModuleImport()
	 * @generated
	 */
	int MODULE_IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__BINDING = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__IMPORTED_MODULE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__KIND = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT__MODULE = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ObjectExpImpl <em>Object Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ObjectExpImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getObjectExp()
	 * @generated
	 */
	int OBJECT_EXP = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__OWNED_COMMENT = ImperativeoclPackage.INSTANTIATION_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__NAME = ImperativeoclPackage.INSTANTIATION_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__TYPE = ImperativeoclPackage.INSTANTIATION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__ARGUMENT = ImperativeoclPackage.INSTANTIATION_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__EXTENT = ImperativeoclPackage.INSTANTIATION_EXP__EXTENT;

	/**
	 * The feature id for the '<em><b>Instantiated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__INSTANTIATED_CLASS = ImperativeoclPackage.INSTANTIATION_EXP__INSTANTIATED_CLASS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__BODY = ImperativeoclPackage.INSTANTIATION_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP__REFERRED_OBJECT = ImperativeoclPackage.INSTANTIATION_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_FEATURE_COUNT = ImperativeoclPackage.INSTANTIATION_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationalTransformationImpl <em>Operational Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationalTransformationImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getOperationalTransformation()
	 * @generated
	 */
	int OPERATIONAL_TRANSFORMATION = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_COMMENT = MODULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__PACKAGE = MODULE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__IS_ABSTRACT = MODULE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_ATTRIBUTE = MODULE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_OPERATION = MODULE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__SUPER_CLASS = MODULE__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__NESTED_PACKAGE = MODULE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_TYPE = MODULE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__URI = MODULE__URI;

	/**
	 * The feature id for the '<em><b>Config Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__CONFIG_PROPERTY = MODULE__CONFIG_PROPERTY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__ENTRY = MODULE__ENTRY;

	/**
	 * The feature id for the '<em><b>Is Blackbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__IS_BLACKBOX = MODULE__IS_BLACKBOX;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODULE_IMPORT = MODULE__MODULE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_TAG = MODULE__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__OWNED_VARIABLE = MODULE__OWNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Used Model Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__USED_MODEL_TYPE = MODULE__USED_MODEL_TYPE;

	/**
	 * The feature id for the '<em><b>Intermediate Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intermediate Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__REFINED = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION__RELATION = MODULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_TRANSFORMATION_FEATURE_COUNT = MODULE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveExpImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getResolveExp()
	 * @generated
	 */
	int RESOLVE_EXP = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__OWNED_COMMENT = EssentialoclPackage.CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__NAME = EssentialoclPackage.CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__TYPE = EssentialoclPackage.CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__SOURCE = EssentialoclPackage.CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__CONDITION = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__IS_DEFERRED = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__IS_INVERSE = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__ONE = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP__TARGET = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resolve Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_FEATURE_COUNT = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveInExpImpl <em>Resolve In Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveInExpImpl
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getResolveInExp()
	 * @generated
	 */
	int RESOLVE_IN_EXP = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__OWNED_COMMENT = RESOLVE_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__NAME = RESOLVE_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__TYPE = RESOLVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__SOURCE = RESOLVE_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__CONDITION = RESOLVE_EXP__CONDITION;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IS_DEFERRED = RESOLVE_EXP__IS_DEFERRED;

	/**
	 * The feature id for the '<em><b>Is Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IS_INVERSE = RESOLVE_EXP__IS_INVERSE;

	/**
	 * The feature id for the '<em><b>One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__ONE = RESOLVE_EXP__ONE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__TARGET = RESOLVE_EXP__TARGET;

	/**
	 * The feature id for the '<em><b>In Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP__IN_MAPPING = RESOLVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolve In Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_IN_EXP_FEATURE_COUNT = RESOLVE_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 22;

	/**
	 * The meta object id for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind <em>Import Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getImportKind()
	 * @generated
	 */
	int IMPORT_KIND = 23;


	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ConstructorBody <em>Constructor Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Body</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ConstructorBody
	 * @generated
	 */
	EClass getConstructorBody();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty <em>Contextual Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Property</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty
	 * @generated
	 */
	EClass getContextualProperty();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getContext()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_Context();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getInitExpression()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_InitExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getOverridden <em>Overridden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overridden</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getOverridden()
	 * @see #getContextualProperty()
	 * @generated
	 */
	EReference getContextualProperty_Overridden();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation <em>Entry Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Operation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation
	 * @generated
	 */
	EClass getEntryOperation();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper
	 * @generated
	 */
	EClass getHelper();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Helper#getIsQuery()
	 * @see #getHelper()
	 * @generated
	 */
	EAttribute getHelper_IsQuery();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp <em>Imperative Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Call Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp
	 * @generated
	 */
	EClass getImperativeCallExp();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp#getIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeCallExp#getIsVirtual()
	 * @see #getImperativeCallExp()
	 * @generated
	 */
	EAttribute getImperativeCallExp_IsVirtual();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation <em>Imperative Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Operation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation
	 * @generated
	 */
	EClass getImperativeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getBody()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Body();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getContext()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Context();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getIsBlackbox <em>Is Blackbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blackbox</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getIsBlackbox()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EAttribute getImperativeOperation_IsBlackbox();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getOverridden <em>Overridden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overridden</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getOverridden()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Overridden();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImperativeOperation#getResult()
	 * @see #getImperativeOperation()
	 * @generated
	 */
	EReference getImperativeOperation_Result();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody <em>Mapping Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Body</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody
	 * @generated
	 */
	EClass getMappingBody();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody#getEndSection <em>End Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Section</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody#getEndSection()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_EndSection();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody#getInitSection <em>Init Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Section</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingBody#getInitSection()
	 * @see #getMappingBody()
	 * @generated
	 */
	EReference getMappingBody_InitSection();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp <em>Mapping Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Call Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp
	 * @generated
	 */
	EClass getMappingCallExp();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp#getIsStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp#getIsStrict()
	 * @see #getMappingCallExp()
	 * @generated
	 */
	EAttribute getMappingCallExp_IsStrict();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation <em>Mapping Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Operation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation
	 * @generated
	 */
	EClass getMappingOperation();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getDisjunct <em>Disjunct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjunct</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getDisjunct()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Disjunct();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getInherited()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Inherited();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getMerged <em>Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merged</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getMerged()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Merged();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Relation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getRefinedRelation()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_RefinedRelation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhen()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_When();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhere()
	 * @see #getMappingOperation()
	 * @generated
	 */
	EReference getMappingOperation_Where();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter <em>Mapping Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Parameter</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter
	 * @generated
	 */
	EClass getMappingParameter();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter#getExtent()
	 * @see #getMappingParameter()
	 * @generated
	 */
	EReference getMappingParameter_Extent();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter#getReferredDomain <em>Referred Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Domain</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingParameter#getReferredDomain()
	 * @see #getMappingParameter()
	 * @generated
	 */
	EReference getMappingParameter_ReferredDomain();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Parameter</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelParameter
	 * @generated
	 */
	EClass getModelParameter();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getAdditionalCondition <em>Additional Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Condition</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getAdditionalCondition()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_AdditionalCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformance Kind</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getConformanceKind()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ConformanceKind();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getMetamodel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Metamodel();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getConfigProperty <em>Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Property</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getConfigProperty()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ConfigProperty();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getEntry()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Entry();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getIsBlackbox <em>Is Blackbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blackbox</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getIsBlackbox()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsBlackbox();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Import</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getModuleImport()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleImport();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getOwnedTag <em>Owned Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tag</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getOwnedTag()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OwnedTag();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getOwnedVariable <em>Owned Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getOwnedVariable()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OwnedVariable();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getUsedModelType <em>Used Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Model Type</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.Module#getUsedModelType()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_UsedModelType();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Import</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport
	 * @generated
	 */
	EClass getModuleImport();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getBinding()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Binding();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getImportedModule <em>Imported Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Module</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getImportedModule()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_ImportedModule();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getKind()
	 * @see #getModuleImport()
	 * @generated
	 */
	EAttribute getModuleImport_Kind();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport#getModule()
	 * @see #getModuleImport()
	 * @generated
	 */
	EReference getModuleImport_Module();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp <em>Object Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp
	 * @generated
	 */
	EClass getObjectExp();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp#getBody()
	 * @see #getObjectExp()
	 * @generated
	 */
	EReference getObjectExp_Body();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp#getReferredObject <em>Referred Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Object</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ObjectExp#getReferredObject()
	 * @see #getObjectExp()
	 * @generated
	 */
	EReference getObjectExp_ReferredObject();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Body</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody
	 * @generated
	 */
	EClass getOperationBody();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody#getContent()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Content();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody#getOperation()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationBody#getVariable()
	 * @see #getOperationBody()
	 * @generated
	 */
	EReference getOperationBody_Variable();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation <em>Operational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Transformation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation
	 * @generated
	 */
	EClass getOperationalTransformation();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getIntermediateClass <em>Intermediate Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Class</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getIntermediateClass()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_IntermediateClass();

	/**
	 * Returns the meta object for the reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getIntermediateProperty <em>Intermediate Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intermediate Property</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getIntermediateProperty()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_IntermediateProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getModelParameter <em>Model Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Parameter</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getModelParameter()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_ModelParameter();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getRefined()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Refined();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.OperationalTransformation#getRelation()
	 * @see #getOperationalTransformation()
	 * @generated
	 */
	EReference getOperationalTransformation_Relation();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp <em>Resolve Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp
	 * @generated
	 */
	EClass getResolveExp();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getCondition()
	 * @see #getResolveExp()
	 * @generated
	 */
	EReference getResolveExp_Condition();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getIsDeferred <em>Is Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deferred</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getIsDeferred()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_IsDeferred();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getIsInverse <em>Is Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getIsInverse()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_IsInverse();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getOne <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getOne()
	 * @see #getResolveExp()
	 * @generated
	 */
	EAttribute getResolveExp_One();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveExp#getTarget()
	 * @see #getResolveExp()
	 * @generated
	 */
	EReference getResolveExp_Target();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp <em>Resolve In Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve In Exp</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp
	 * @generated
	 */
	EClass getResolveInExp();

	/**
	 * Returns the meta object for the reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp#getInMapping <em>In Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Mapping</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ResolveInExp#getInMapping()
	 * @see #getResolveInExp()
	 * @generated
	 */
	EReference getResolveInExp_InMapping();

	/**
	 * Returns the meta object for class '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter <em>Var Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Parameter</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter
	 * @generated
	 */
	EClass getVarParameter();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter#getCtxOwner <em>Ctx Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx Owner</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter#getCtxOwner()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_CtxOwner();

	/**
	 * Returns the meta object for the attribute '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter#getKind()
	 * @see #getVarParameter()
	 * @generated
	 */
	EAttribute getVarParameter_Kind();

	/**
	 * Returns the meta object for the container reference '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter#getResOwner <em>Res Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Res Owner</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.VarParameter#getResOwner()
	 * @see #getVarParameter()
	 * @generated
	 */
	EReference getVarParameter_ResOwner();

	/**
	 * Returns the meta object for enum '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the meta object for enum '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind <em>Import Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Kind</em>'.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind
	 * @generated
	 */
	EEnum getImportKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QvtoperationalFactory getQvtoperationalFactory();

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
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorBodyImpl <em>Constructor Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ConstructorBodyImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getConstructorBody()
		 * @generated
		 */
		EClass CONSTRUCTOR_BODY = eINSTANCE.getConstructorBody();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ContextualPropertyImpl <em>Contextual Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ContextualPropertyImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getContextualProperty()
		 * @generated
		 */
		EClass CONTEXTUAL_PROPERTY = eINSTANCE.getContextualProperty();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_PROPERTY__CONTEXT = eINSTANCE.getContextualProperty_Context();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_PROPERTY__INIT_EXPRESSION = eINSTANCE.getContextualProperty_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Overridden</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_PROPERTY__OVERRIDDEN = eINSTANCE.getContextualProperty_Overridden();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.EntryOperationImpl <em>Entry Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.EntryOperationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getEntryOperation()
		 * @generated
		 */
		EClass ENTRY_OPERATION = eINSTANCE.getEntryOperation();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.HelperImpl <em>Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.HelperImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getHelper()
		 * @generated
		 */
		EClass HELPER = eINSTANCE.getHelper();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER__IS_QUERY = eINSTANCE.getHelper_IsQuery();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeCallExpImpl <em>Imperative Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeCallExpImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getImperativeCallExp()
		 * @generated
		 */
		EClass IMPERATIVE_CALL_EXP = eINSTANCE.getImperativeCallExp();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERATIVE_CALL_EXP__IS_VIRTUAL = eINSTANCE.getImperativeCallExp_IsVirtual();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeOperationImpl <em>Imperative Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ImperativeOperationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getImperativeOperation()
		 * @generated
		 */
		EClass IMPERATIVE_OPERATION = eINSTANCE.getImperativeOperation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__BODY = eINSTANCE.getImperativeOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__CONTEXT = eINSTANCE.getImperativeOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Is Blackbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERATIVE_OPERATION__IS_BLACKBOX = eINSTANCE.getImperativeOperation_IsBlackbox();

		/**
		 * The meta object literal for the '<em><b>Overridden</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__OVERRIDDEN = eINSTANCE.getImperativeOperation_Overridden();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION__RESULT = eINSTANCE.getImperativeOperation_Result();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.LibraryImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingBodyImpl <em>Mapping Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingBodyImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingBody()
		 * @generated
		 */
		EClass MAPPING_BODY = eINSTANCE.getMappingBody();

		/**
		 * The meta object literal for the '<em><b>End Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__END_SECTION = eINSTANCE.getMappingBody_EndSection();

		/**
		 * The meta object literal for the '<em><b>Init Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY__INIT_SECTION = eINSTANCE.getMappingBody_InitSection();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingCallExpImpl <em>Mapping Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingCallExpImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingCallExp()
		 * @generated
		 */
		EClass MAPPING_CALL_EXP = eINSTANCE.getMappingCallExp();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_CALL_EXP__IS_STRICT = eINSTANCE.getMappingCallExp_IsStrict();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl <em>Mapping Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingOperationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingOperation()
		 * @generated
		 */
		EClass MAPPING_OPERATION = eINSTANCE.getMappingOperation();

		/**
		 * The meta object literal for the '<em><b>Disjunct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__DISJUNCT = eINSTANCE.getMappingOperation_Disjunct();

		/**
		 * The meta object literal for the '<em><b>Inherited</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__INHERITED = eINSTANCE.getMappingOperation_Inherited();

		/**
		 * The meta object literal for the '<em><b>Merged</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__MERGED = eINSTANCE.getMappingOperation_Merged();

		/**
		 * The meta object literal for the '<em><b>Refined Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__REFINED_RELATION = eINSTANCE.getMappingOperation_RefinedRelation();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__WHEN = eINSTANCE.getMappingOperation_When();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION__WHERE = eINSTANCE.getMappingOperation_Where();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingParameterImpl <em>Mapping Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.MappingParameterImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getMappingParameter()
		 * @generated
		 */
		EClass MAPPING_PARAMETER = eINSTANCE.getMappingParameter();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PARAMETER__EXTENT = eINSTANCE.getMappingParameter_Extent();

		/**
		 * The meta object literal for the '<em><b>Referred Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_PARAMETER__REFERRED_DOMAIN = eINSTANCE.getMappingParameter_ReferredDomain();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelParameterImpl <em>Model Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelParameterImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModelParameter()
		 * @generated
		 */
		EClass MODEL_PARAMETER = eINSTANCE.getModelParameter();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModelTypeImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Additional Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__ADDITIONAL_CONDITION = eINSTANCE.getModelType_AdditionalCondition();

		/**
		 * The meta object literal for the '<em><b>Conformance Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__CONFORMANCE_KIND = eINSTANCE.getModelType_ConformanceKind();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__METAMODEL = eINSTANCE.getModelType_Metamodel();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Config Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONFIG_PROPERTY = eINSTANCE.getModule_ConfigProperty();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ENTRY = eINSTANCE.getModule_Entry();

		/**
		 * The meta object literal for the '<em><b>Is Blackbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_BLACKBOX = eINSTANCE.getModule_IsBlackbox();

		/**
		 * The meta object literal for the '<em><b>Module Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_IMPORT = eINSTANCE.getModule_ModuleImport();

		/**
		 * The meta object literal for the '<em><b>Owned Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OWNED_TAG = eINSTANCE.getModule_OwnedTag();

		/**
		 * The meta object literal for the '<em><b>Owned Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OWNED_VARIABLE = eINSTANCE.getModule_OwnedVariable();

		/**
		 * The meta object literal for the '<em><b>Used Model Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__USED_MODEL_TYPE = eINSTANCE.getModule_UsedModelType();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImportImpl <em>Module Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImportImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getModuleImport()
		 * @generated
		 */
		EClass MODULE_IMPORT = eINSTANCE.getModuleImport();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__BINDING = eINSTANCE.getModuleImport_Binding();

		/**
		 * The meta object literal for the '<em><b>Imported Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__IMPORTED_MODULE = eINSTANCE.getModuleImport_ImportedModule();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_IMPORT__KIND = eINSTANCE.getModuleImport_Kind();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPORT__MODULE = eINSTANCE.getModuleImport_Module();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ObjectExpImpl <em>Object Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ObjectExpImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getObjectExp()
		 * @generated
		 */
		EClass OBJECT_EXP = eINSTANCE.getObjectExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP__BODY = eINSTANCE.getObjectExp_Body();

		/**
		 * The meta object literal for the '<em><b>Referred Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP__REFERRED_OBJECT = eINSTANCE.getObjectExp_ReferredObject();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationBodyImpl <em>Operation Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationBodyImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getOperationBody()
		 * @generated
		 */
		EClass OPERATION_BODY = eINSTANCE.getOperationBody();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__CONTENT = eINSTANCE.getOperationBody_Content();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__OPERATION = eINSTANCE.getOperationBody_Operation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY__VARIABLE = eINSTANCE.getOperationBody_Variable();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationalTransformationImpl <em>Operational Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.OperationalTransformationImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getOperationalTransformation()
		 * @generated
		 */
		EClass OPERATIONAL_TRANSFORMATION = eINSTANCE.getOperationalTransformation();

		/**
		 * The meta object literal for the '<em><b>Intermediate Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__INTERMEDIATE_CLASS = eINSTANCE.getOperationalTransformation_IntermediateClass();

		/**
		 * The meta object literal for the '<em><b>Intermediate Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__INTERMEDIATE_PROPERTY = eINSTANCE.getOperationalTransformation_IntermediateProperty();

		/**
		 * The meta object literal for the '<em><b>Model Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__MODEL_PARAMETER = eINSTANCE.getOperationalTransformation_ModelParameter();

		/**
		 * The meta object literal for the '<em><b>Refined</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__REFINED = eINSTANCE.getOperationalTransformation_Refined();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_TRANSFORMATION__RELATION = eINSTANCE.getOperationalTransformation_Relation();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveExpImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getResolveExp()
		 * @generated
		 */
		EClass RESOLVE_EXP = eINSTANCE.getResolveExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP__CONDITION = eINSTANCE.getResolveExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Is Deferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__IS_DEFERRED = eINSTANCE.getResolveExp_IsDeferred();

		/**
		 * The meta object literal for the '<em><b>Is Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__IS_INVERSE = eINSTANCE.getResolveExp_IsInverse();

		/**
		 * The meta object literal for the '<em><b>One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP__ONE = eINSTANCE.getResolveExp_One();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP__TARGET = eINSTANCE.getResolveExp_Target();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveInExpImpl <em>Resolve In Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ResolveInExpImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getResolveInExp()
		 * @generated
		 */
		EClass RESOLVE_IN_EXP = eINSTANCE.getResolveInExp();

		/**
		 * The meta object literal for the '<em><b>In Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_IN_EXP__IN_MAPPING = eINSTANCE.getResolveInExp_InMapping();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.VarParameterImpl <em>Var Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.VarParameterImpl
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getVarParameter()
		 * @generated
		 */
		EClass VAR_PARAMETER = eINSTANCE.getVarParameter();

		/**
		 * The meta object literal for the '<em><b>Ctx Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__CTX_OWNER = eINSTANCE.getVarParameter_CtxOwner();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_PARAMETER__KIND = eINSTANCE.getVarParameter_Kind();

		/**
		 * The meta object literal for the '<em><b>Res Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_PARAMETER__RES_OWNER = eINSTANCE.getVarParameter_ResOwner();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.DirectionKind
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

		/**
		 * The meta object literal for the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind <em>Import Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.ImportKind
		 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.QvtoperationalPackageImpl#getImportKind()
		 * @generated
		 */
		EEnum IMPORT_KIND = eINSTANCE.getImportKind();

	}

} //QvtoperationalPackage
