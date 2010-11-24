/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.kermeta.language.structure.StructurePackage;

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
 * <!-- begin-model-doc -->
 * Contains all the classes that define the behavior of Kermeta (i.e the model representation
 * of operation bodies). It is the definition, in kermeta language, of the behavior part of the kermeta 
 * metamodel, viewed as a model.
 * You can also find some information about the behavior package here : <a href="http://www.kermeta.org/documents/manual/html.single">KermetaManual</a>
 * <img src="platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_behavior_package.png">
 * <img src="platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_behavior_visitable_package.png">
 * <!-- end-model-doc -->
 * @see org.kermeta.language.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/2_0_0//org/kermeta/language/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org_kermeta_language_behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = org.kermeta.language.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.ExpressionImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__KTAG = StructurePackage.OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__KOWNED_TAGS = StructurePackage.OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__KTYPE = StructurePackage.OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CONTAINED_TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__STATIC_TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.AssignmentImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Cast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__IS_CAST = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.CallExpressionImpl <em>Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.CallExpressionImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallExpression()
	 * @generated
	 */
	int CALL_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.BlockImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 3;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rescue Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__RESCUE_BLOCK = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.CallVariableImpl <em>Call Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.CallVariableImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallVariable()
	 * @generated
	 */
	int CALL_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__KTAG = CALL_EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__KOWNED_TAGS = CALL_EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__KTYPE = CALL_EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__CONTAINED_TYPE = CALL_EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__STATIC_TYPE = CALL_EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__PARAMETERS = CALL_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__NAME = CALL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS = CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS;

	/**
	 * The feature id for the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE__IS_ATPRE = CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VARIABLE_FEATURE_COUNT = CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.CallFeatureImpl <em>Call Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.CallFeatureImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallFeature()
	 * @generated
	 */
	int CALL_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__KTAG = CALL_EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__KOWNED_TAGS = CALL_EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__KTYPE = CALL_EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__CONTAINED_TYPE = CALL_EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__STATIC_TYPE = CALL_EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__PARAMETERS = CALL_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__NAME = CALL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__STATIC_TYPE_VARIABLE_BINDINGS = CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__TARGET = CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__IS_ATPRE = CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__STATIC_PROPERTY = CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__STATIC_OPERATION = CALL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Static Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE__STATIC_ENUM_LITERAL = CALL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Call Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_FEATURE_COUNT = CALL_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.CallSuperOperationImpl <em>Call Super Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.CallSuperOperationImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallSuperOperation()
	 * @generated
	 */
	int CALL_SUPER_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__KTAG = CALL_EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__KOWNED_TAGS = CALL_EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__KTYPE = CALL_EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__CONTAINED_TYPE = CALL_EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__STATIC_TYPE = CALL_EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__PARAMETERS = CALL_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__NAME = CALL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION__STATIC_TYPE_VARIABLE_BINDINGS = CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS;

	/**
	 * The number of structural features of the '<em>Call Super Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SUPER_OPERATION_FEATURE_COUNT = CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.CallResultImpl <em>Call Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.CallResultImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallResult()
	 * @generated
	 */
	int CALL_RESULT = 7;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__KTAG = CALL_VARIABLE__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__KOWNED_TAGS = CALL_VARIABLE__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__KTYPE = CALL_VARIABLE__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__CONTAINED_TYPE = CALL_VARIABLE__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__STATIC_TYPE = CALL_VARIABLE__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__PARAMETERS = CALL_VARIABLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__NAME = CALL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__STATIC_TYPE_VARIABLE_BINDINGS = CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS;

	/**
	 * The feature id for the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT__IS_ATPRE = CALL_VARIABLE__IS_ATPRE;

	/**
	 * The number of structural features of the '<em>Call Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RESULT_FEATURE_COUNT = CALL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.CallValueImpl <em>Call Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.CallValueImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallValue()
	 * @generated
	 */
	int CALL_VALUE = 8;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__KTAG = CALL_EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__KOWNED_TAGS = CALL_EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__KTYPE = CALL_EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__CONTAINED_TYPE = CALL_EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__STATIC_TYPE = CALL_EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__PARAMETERS = CALL_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__NAME = CALL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Static Type Variable Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE__STATIC_TYPE_VARIABLE_BINDINGS = CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS;

	/**
	 * The number of structural features of the '<em>Call Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_VALUE_FEATURE_COUNT = CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.ConditionalImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 9;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Then Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__THEN_BODY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ELSE_BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.RaiseImpl <em>Raise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.RaiseImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getRaise()
	 * @generated
	 */
	int RAISE = 10;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.RescueImpl <em>Rescue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.RescueImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getRescue()
	 * @generated
	 */
	int RESCUE = 11;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE__KTAG = StructurePackage.OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE__KOWNED_TAGS = StructurePackage.OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE__KTYPE = StructurePackage.OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE__BODY = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE__EXCEPTION_TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE__EXCEPTION_NAME = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rescue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCUE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.TypeReferenceImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__KTAG = StructurePackage.MULTIPLICITY_ELEMENT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__KOWNED_TAGS = StructurePackage.MULTIPLICITY_ELEMENT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__KTYPE = StructurePackage.MULTIPLICITY_ELEMENT__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__CONTAINED_TYPE = StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__NAME = StructurePackage.MULTIPLICITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TYPE = StructurePackage.MULTIPLICITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__IS_ORDERED = StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__IS_UNIQUE = StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__LOWER = StructurePackage.MULTIPLICITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__UPPER = StructurePackage.MULTIPLICITY_ELEMENT__UPPER;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = StructurePackage.MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.LiteralImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 13;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.EmptyExpressionImpl <em>Empty Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.EmptyExpressionImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getEmptyExpression()
	 * @generated
	 */
	int EMPTY_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSION__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSION__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSION__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSION__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSION__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>Empty Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.JavaStaticCallImpl <em>Java Static Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.JavaStaticCallImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getJavaStaticCall()
	 * @generated
	 */
	int JAVA_STATIC_CALL = 15;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__JCLASS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jmethod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL__JMETHOD = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Static Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATIC_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.LambdaExpressionImpl <em>Lambda Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.LambdaExpressionImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLambdaExpression()
	 * @generated
	 */
	int LAMBDA_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lambda Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.LambdaParameterImpl <em>Lambda Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.LambdaParameterImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLambdaParameter()
	 * @generated
	 */
	int LAMBDA_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_PARAMETER__KTAG = StructurePackage.OBJECT__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_PARAMETER__KOWNED_TAGS = StructurePackage.OBJECT__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_PARAMETER__KTYPE = StructurePackage.OBJECT__KTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_PARAMETER__NAME = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_PARAMETER__TYPE = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lambda Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_PARAMETER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.IntegerLiteralImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__KTAG = LITERAL__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__KOWNED_TAGS = LITERAL__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__KTYPE = LITERAL__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__CONTAINED_TYPE = LITERAL__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__STATIC_TYPE = LITERAL__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.StringLiteralImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 19;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__KTAG = LITERAL__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__KOWNED_TAGS = LITERAL__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__KTYPE = LITERAL__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__CONTAINED_TYPE = LITERAL__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__STATIC_TYPE = LITERAL__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.BooleanLiteralImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__KTAG = LITERAL__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__KOWNED_TAGS = LITERAL__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__KTYPE = LITERAL__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__CONTAINED_TYPE = LITERAL__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__STATIC_TYPE = LITERAL__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.TypeLiteralImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getTypeLiteral()
	 * @generated
	 */
	int TYPE_LITERAL = 21;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__KTAG = LITERAL__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__KOWNED_TAGS = LITERAL__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__KTYPE = LITERAL__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__CONTAINED_TYPE = LITERAL__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__STATIC_TYPE = LITERAL__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Typeref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__TYPEREF = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.VoidLiteralImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getVoidLiteral()
	 * @generated
	 */
	int VOID_LITERAL = 22;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL__KTAG = LITERAL__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL__KOWNED_TAGS = LITERAL__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL__KTYPE = LITERAL__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL__CONTAINED_TYPE = LITERAL__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL__STATIC_TYPE = LITERAL__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>Void Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.LoopImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 23;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INITIALIZATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STOP_CONDITION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.SelfExpressionImpl <em>Self Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.SelfExpressionImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getSelfExpression()
	 * @generated
	 */
	int SELF_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXPRESSION__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXPRESSION__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXPRESSION__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXPRESSION__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXPRESSION__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The number of structural features of the '<em>Self Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.language.behavior.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.language.behavior.impl.VariableDeclImpl
	 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getVariableDecl()
	 * @generated
	 */
	int VARIABLE_DECL = 25;

	/**
	 * The feature id for the '<em><b>KTag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__KTAG = EXPRESSION__KTAG;

	/**
	 * The feature id for the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__KOWNED_TAGS = EXPRESSION__KOWNED_TAGS;

	/**
	 * The feature id for the '<em><b>KType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__KTYPE = EXPRESSION__KTYPE;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__CONTAINED_TYPE = EXPRESSION__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__STATIC_TYPE = EXPRESSION__STATIC_TYPE;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__INITIALIZATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.kermeta.language.behavior.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Assignment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.kermeta.language.behavior.Assignment#getTarget()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.kermeta.language.behavior.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.Assignment#getIsCast <em>Is Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cast</em>'.
	 * @see org.kermeta.language.behavior.Assignment#getIsCast()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_IsCast();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.kermeta.language.behavior.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.behavior.Expression#getStaticType <em>Static Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Type</em>'.
	 * @see org.kermeta.language.behavior.Expression#getStaticType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_StaticType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.CallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Expression</em>'.
	 * @see org.kermeta.language.behavior.CallExpression
	 * @generated
	 */
	EClass getCallExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.behavior.CallExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.kermeta.language.behavior.CallExpression#getParameters()
	 * @see #getCallExpression()
	 * @generated
	 */
	EReference getCallExpression_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.CallExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.language.behavior.CallExpression#getName()
	 * @see #getCallExpression()
	 * @generated
	 */
	EAttribute getCallExpression_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.language.behavior.CallExpression#getStaticTypeVariableBindings <em>Static Type Variable Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Static Type Variable Bindings</em>'.
	 * @see org.kermeta.language.behavior.CallExpression#getStaticTypeVariableBindings()
	 * @see #getCallExpression()
	 * @generated
	 */
	EReference getCallExpression_StaticTypeVariableBindings();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.kermeta.language.behavior.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.behavior.Block#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see org.kermeta.language.behavior.Block#getStatement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.behavior.Block#getRescueBlock <em>Rescue Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rescue Block</em>'.
	 * @see org.kermeta.language.behavior.Block#getRescueBlock()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_RescueBlock();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.CallVariable <em>Call Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Variable</em>'.
	 * @see org.kermeta.language.behavior.CallVariable
	 * @generated
	 */
	EClass getCallVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atpre</em>'.
	 * @see org.kermeta.language.behavior.CallVariable#getIsAtpre()
	 * @see #getCallVariable()
	 * @generated
	 */
	EAttribute getCallVariable_IsAtpre();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.CallFeature <em>Call Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Feature</em>'.
	 * @see org.kermeta.language.behavior.CallFeature
	 * @generated
	 */
	EClass getCallFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.CallFeature#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.kermeta.language.behavior.CallFeature#getTarget()
	 * @see #getCallFeature()
	 * @generated
	 */
	EReference getCallFeature_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.CallFeature#getIsAtpre <em>Is Atpre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atpre</em>'.
	 * @see org.kermeta.language.behavior.CallFeature#getIsAtpre()
	 * @see #getCallFeature()
	 * @generated
	 */
	EAttribute getCallFeature_IsAtpre();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.behavior.CallFeature#getStaticProperty <em>Static Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Property</em>'.
	 * @see org.kermeta.language.behavior.CallFeature#getStaticProperty()
	 * @see #getCallFeature()
	 * @generated
	 */
	EReference getCallFeature_StaticProperty();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.behavior.CallFeature#getStaticOperation <em>Static Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Operation</em>'.
	 * @see org.kermeta.language.behavior.CallFeature#getStaticOperation()
	 * @see #getCallFeature()
	 * @generated
	 */
	EReference getCallFeature_StaticOperation();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.language.behavior.CallFeature#getStaticEnumLiteral <em>Static Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Enum Literal</em>'.
	 * @see org.kermeta.language.behavior.CallFeature#getStaticEnumLiteral()
	 * @see #getCallFeature()
	 * @generated
	 */
	EReference getCallFeature_StaticEnumLiteral();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.CallSuperOperation <em>Call Super Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Super Operation</em>'.
	 * @see org.kermeta.language.behavior.CallSuperOperation
	 * @generated
	 */
	EClass getCallSuperOperation();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.CallResult <em>Call Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Result</em>'.
	 * @see org.kermeta.language.behavior.CallResult
	 * @generated
	 */
	EClass getCallResult();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.CallValue <em>Call Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Value</em>'.
	 * @see org.kermeta.language.behavior.CallValue
	 * @generated
	 */
	EClass getCallValue();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see org.kermeta.language.behavior.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Conditional#getThenBody <em>Then Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Body</em>'.
	 * @see org.kermeta.language.behavior.Conditional#getThenBody()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_ThenBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Conditional#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Body</em>'.
	 * @see org.kermeta.language.behavior.Conditional#getElseBody()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_ElseBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.kermeta.language.behavior.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Raise <em>Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise</em>'.
	 * @see org.kermeta.language.behavior.Raise
	 * @generated
	 */
	EClass getRaise();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Raise#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.kermeta.language.behavior.Raise#getExpression()
	 * @see #getRaise()
	 * @generated
	 */
	EReference getRaise_Expression();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Rescue <em>Rescue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescue</em>'.
	 * @see org.kermeta.language.behavior.Rescue
	 * @generated
	 */
	EClass getRescue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.behavior.Rescue#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.kermeta.language.behavior.Rescue#getBody()
	 * @see #getRescue()
	 * @generated
	 */
	EReference getRescue_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.kermeta.language.behavior.Rescue#getExceptionType()
	 * @see #getRescue()
	 * @generated
	 */
	EReference getRescue_ExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Name</em>'.
	 * @see org.kermeta.language.behavior.Rescue#getExceptionName()
	 * @see #getRescue()
	 * @generated
	 */
	EAttribute getRescue_ExceptionName();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.kermeta.language.behavior.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.kermeta.language.behavior.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.EmptyExpression <em>Empty Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Expression</em>'.
	 * @see org.kermeta.language.behavior.EmptyExpression
	 * @generated
	 */
	EClass getEmptyExpression();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.JavaStaticCall <em>Java Static Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Static Call</em>'.
	 * @see org.kermeta.language.behavior.JavaStaticCall
	 * @generated
	 */
	EClass getJavaStaticCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.behavior.JavaStaticCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.kermeta.language.behavior.JavaStaticCall#getParameters()
	 * @see #getJavaStaticCall()
	 * @generated
	 */
	EReference getJavaStaticCall_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.JavaStaticCall#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jclass</em>'.
	 * @see org.kermeta.language.behavior.JavaStaticCall#getJclass()
	 * @see #getJavaStaticCall()
	 * @generated
	 */
	EAttribute getJavaStaticCall_Jclass();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.JavaStaticCall#getJmethod <em>Jmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jmethod</em>'.
	 * @see org.kermeta.language.behavior.JavaStaticCall#getJmethod()
	 * @see #getJavaStaticCall()
	 * @generated
	 */
	EAttribute getJavaStaticCall_Jmethod();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.LambdaExpression <em>Lambda Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Expression</em>'.
	 * @see org.kermeta.language.behavior.LambdaExpression
	 * @generated
	 */
	EClass getLambdaExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.language.behavior.LambdaExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.kermeta.language.behavior.LambdaExpression#getParameters()
	 * @see #getLambdaExpression()
	 * @generated
	 */
	EReference getLambdaExpression_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.LambdaExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.kermeta.language.behavior.LambdaExpression#getBody()
	 * @see #getLambdaExpression()
	 * @generated
	 */
	EReference getLambdaExpression_Body();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.LambdaParameter <em>Lambda Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Parameter</em>'.
	 * @see org.kermeta.language.behavior.LambdaParameter
	 * @generated
	 */
	EClass getLambdaParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.LambdaParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.language.behavior.LambdaParameter#getName()
	 * @see #getLambdaParameter()
	 * @generated
	 */
	EAttribute getLambdaParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.LambdaParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.kermeta.language.behavior.LambdaParameter#getType()
	 * @see #getLambdaParameter()
	 * @generated
	 */
	EReference getLambdaParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.kermeta.language.behavior.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.language.behavior.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.kermeta.language.behavior.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.language.behavior.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.kermeta.language.behavior.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.language.behavior.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.TypeLiteral <em>Type Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Literal</em>'.
	 * @see org.kermeta.language.behavior.TypeLiteral
	 * @generated
	 */
	EClass getTypeLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typeref</em>'.
	 * @see org.kermeta.language.behavior.TypeLiteral#getTyperef()
	 * @see #getTypeLiteral()
	 * @generated
	 */
	EReference getTypeLiteral_Typeref();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.VoidLiteral <em>Void Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Literal</em>'.
	 * @see org.kermeta.language.behavior.VoidLiteral
	 * @generated
	 */
	EClass getVoidLiteral();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see org.kermeta.language.behavior.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see org.kermeta.language.behavior.Loop#getInitialization()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Initialization();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.kermeta.language.behavior.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Condition</em>'.
	 * @see org.kermeta.language.behavior.Loop#getStopCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_StopCondition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.SelfExpression <em>Self Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Expression</em>'.
	 * @see org.kermeta.language.behavior.SelfExpression
	 * @generated
	 */
	EClass getSelfExpression();

	/**
	 * Returns the meta object for class '{@link org.kermeta.language.behavior.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl</em>'.
	 * @see org.kermeta.language.behavior.VariableDecl
	 * @generated
	 */
	EClass getVariableDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see org.kermeta.language.behavior.VariableDecl#getInitialization()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Initialization();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.kermeta.language.behavior.VariableDecl#getIdentifier()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EAttribute getVariableDecl_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.language.behavior.VariableDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.kermeta.language.behavior.VariableDecl#getType()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

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
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.AssignmentImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__TARGET = eINSTANCE.getAssignment_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Is Cast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__IS_CAST = eINSTANCE.getAssignment_IsCast();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.ExpressionImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Static Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__STATIC_TYPE = eINSTANCE.getExpression_StaticType();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.CallExpressionImpl <em>Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.CallExpressionImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallExpression()
		 * @generated
		 */
		EClass CALL_EXPRESSION = eINSTANCE.getCallExpression();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPRESSION__PARAMETERS = eINSTANCE.getCallExpression_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_EXPRESSION__NAME = eINSTANCE.getCallExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Static Type Variable Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPRESSION__STATIC_TYPE_VARIABLE_BINDINGS = eINSTANCE.getCallExpression_StaticTypeVariableBindings();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.BlockImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

		/**
		 * The meta object literal for the '<em><b>Rescue Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__RESCUE_BLOCK = eINSTANCE.getBlock_RescueBlock();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.CallVariableImpl <em>Call Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.CallVariableImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallVariable()
		 * @generated
		 */
		EClass CALL_VARIABLE = eINSTANCE.getCallVariable();

		/**
		 * The meta object literal for the '<em><b>Is Atpre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_VARIABLE__IS_ATPRE = eINSTANCE.getCallVariable_IsAtpre();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.CallFeatureImpl <em>Call Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.CallFeatureImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallFeature()
		 * @generated
		 */
		EClass CALL_FEATURE = eINSTANCE.getCallFeature();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FEATURE__TARGET = eINSTANCE.getCallFeature_Target();

		/**
		 * The meta object literal for the '<em><b>Is Atpre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_FEATURE__IS_ATPRE = eINSTANCE.getCallFeature_IsAtpre();

		/**
		 * The meta object literal for the '<em><b>Static Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FEATURE__STATIC_PROPERTY = eINSTANCE.getCallFeature_StaticProperty();

		/**
		 * The meta object literal for the '<em><b>Static Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FEATURE__STATIC_OPERATION = eINSTANCE.getCallFeature_StaticOperation();

		/**
		 * The meta object literal for the '<em><b>Static Enum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_FEATURE__STATIC_ENUM_LITERAL = eINSTANCE.getCallFeature_StaticEnumLiteral();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.CallSuperOperationImpl <em>Call Super Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.CallSuperOperationImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallSuperOperation()
		 * @generated
		 */
		EClass CALL_SUPER_OPERATION = eINSTANCE.getCallSuperOperation();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.CallResultImpl <em>Call Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.CallResultImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallResult()
		 * @generated
		 */
		EClass CALL_RESULT = eINSTANCE.getCallResult();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.CallValueImpl <em>Call Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.CallValueImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getCallValue()
		 * @generated
		 */
		EClass CALL_VALUE = eINSTANCE.getCallValue();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.ConditionalImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Then Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__THEN_BODY = eINSTANCE.getConditional_ThenBody();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__ELSE_BODY = eINSTANCE.getConditional_ElseBody();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.RaiseImpl <em>Raise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.RaiseImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getRaise()
		 * @generated
		 */
		EClass RAISE = eINSTANCE.getRaise();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE__EXPRESSION = eINSTANCE.getRaise_Expression();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.RescueImpl <em>Rescue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.RescueImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getRescue()
		 * @generated
		 */
		EClass RESCUE = eINSTANCE.getRescue();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCUE__BODY = eINSTANCE.getRescue_Body();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCUE__EXCEPTION_TYPE = eINSTANCE.getRescue_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESCUE__EXCEPTION_NAME = eINSTANCE.getRescue_ExceptionName();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.TypeReferenceImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.LiteralImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.EmptyExpressionImpl <em>Empty Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.EmptyExpressionImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getEmptyExpression()
		 * @generated
		 */
		EClass EMPTY_EXPRESSION = eINSTANCE.getEmptyExpression();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.JavaStaticCallImpl <em>Java Static Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.JavaStaticCallImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getJavaStaticCall()
		 * @generated
		 */
		EClass JAVA_STATIC_CALL = eINSTANCE.getJavaStaticCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_STATIC_CALL__PARAMETERS = eINSTANCE.getJavaStaticCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>Jclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_STATIC_CALL__JCLASS = eINSTANCE.getJavaStaticCall_Jclass();

		/**
		 * The meta object literal for the '<em><b>Jmethod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_STATIC_CALL__JMETHOD = eINSTANCE.getJavaStaticCall_Jmethod();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.LambdaExpressionImpl <em>Lambda Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.LambdaExpressionImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLambdaExpression()
		 * @generated
		 */
		EClass LAMBDA_EXPRESSION = eINSTANCE.getLambdaExpression();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_EXPRESSION__PARAMETERS = eINSTANCE.getLambdaExpression_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_EXPRESSION__BODY = eINSTANCE.getLambdaExpression_Body();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.LambdaParameterImpl <em>Lambda Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.LambdaParameterImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLambdaParameter()
		 * @generated
		 */
		EClass LAMBDA_PARAMETER = eINSTANCE.getLambdaParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMBDA_PARAMETER__NAME = eINSTANCE.getLambdaParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_PARAMETER__TYPE = eINSTANCE.getLambdaParameter_Type();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.IntegerLiteralImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.StringLiteralImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.BooleanLiteralImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.TypeLiteralImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getTypeLiteral()
		 * @generated
		 */
		EClass TYPE_LITERAL = eINSTANCE.getTypeLiteral();

		/**
		 * The meta object literal for the '<em><b>Typeref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LITERAL__TYPEREF = eINSTANCE.getTypeLiteral_Typeref();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.VoidLiteralImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getVoidLiteral()
		 * @generated
		 */
		EClass VOID_LITERAL = eINSTANCE.getVoidLiteral();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.LoopImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__INITIALIZATION = eINSTANCE.getLoop_Initialization();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

		/**
		 * The meta object literal for the '<em><b>Stop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__STOP_CONDITION = eINSTANCE.getLoop_StopCondition();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.SelfExpressionImpl <em>Self Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.SelfExpressionImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getSelfExpression()
		 * @generated
		 */
		EClass SELF_EXPRESSION = eINSTANCE.getSelfExpression();

		/**
		 * The meta object literal for the '{@link org.kermeta.language.behavior.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.language.behavior.impl.VariableDeclImpl
		 * @see org.kermeta.language.behavior.impl.BehaviorPackageImpl#getVariableDecl()
		 * @generated
		 */
		EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__INITIALIZATION = eINSTANCE.getVariableDecl_Initialization();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECL__IDENTIFIER = eINSTANCE.getVariableDecl_Identifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

	}

} //BehaviorPackage
