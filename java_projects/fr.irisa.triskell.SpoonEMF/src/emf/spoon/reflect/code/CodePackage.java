/**
 * <copyright>
 * </copyright>
 *
 * $Id: CodePackage.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import emf.spoon.reflect.declaration.DeclarationPackage;

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
 * @see emf.spoon.reflect.code.CodeFactory
 * @model kind="package"
 * @generated
 */
public interface CodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "code";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spoon#reflect.code";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spoon.reflect.code";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackage eINSTANCE = emf.spoon.reflect.code.impl.CodePackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtAbstractInvocationImpl <em>Ct Abstract Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtAbstractInvocationImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtAbstractInvocation()
	 * @generated
	 */
	int CT_ABSTRACT_INVOCATION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION__ANNOTATIONS = DeclarationPackage.CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION__POSITION = DeclarationPackage.CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION__DOC_COMMENT = DeclarationPackage.CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION__PARENT = DeclarationPackage.CT_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION__EXECUTABLE = DeclarationPackage.CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION__ARGUMENTS = DeclarationPackage.CT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Abstract Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION_FEATURE_COUNT = DeclarationPackage.CT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtCodeElementImpl <em>Ct Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtCodeElementImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCodeElement()
	 * @generated
	 */
	int CT_CODE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CODE_ELEMENT__ANNOTATIONS = DeclarationPackage.CT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CODE_ELEMENT__POSITION = DeclarationPackage.CT_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CODE_ELEMENT__DOC_COMMENT = DeclarationPackage.CT_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CODE_ELEMENT__PARENT = DeclarationPackage.CT_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Ct Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CODE_ELEMENT_FEATURE_COUNT = DeclarationPackage.CT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtExpressionImpl <em>Ct Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtExpressionImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtExpression()
	 * @generated
	 */
	int CT_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION__ANNOTATIONS = CT_CODE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION__POSITION = CT_CODE_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION__DOC_COMMENT = CT_CODE_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION__PARENT = CT_CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION__TYPE = CT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION__TYPE_CASTS = CT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION_FEATURE_COUNT = CT_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtTargetedExpressionImpl <em>Ct Targeted Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtTargetedExpressionImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtTargetedExpression()
	 * @generated
	 */
	int CT_TARGETED_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION__TARGET = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Targeted Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtArrayAccessImpl <em>Ct Array Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtArrayAccessImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtArrayAccess()
	 * @generated
	 */
	int CT_ARRAY_ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__ANNOTATIONS = CT_TARGETED_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__POSITION = CT_TARGETED_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__DOC_COMMENT = CT_TARGETED_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__PARENT = CT_TARGETED_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__TYPE = CT_TARGETED_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__TYPE_CASTS = CT_TARGETED_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__TARGET = CT_TARGETED_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Index Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS__INDEX_EXPRESSION = CT_TARGETED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS_FEATURE_COUNT = CT_TARGETED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtStatementImpl <em>Ct Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtStatementImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtStatement()
	 * @generated
	 */
	int CT_STATEMENT = 27;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT__ANNOTATIONS = CT_CODE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT__POSITION = CT_CODE_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT__DOC_COMMENT = CT_CODE_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT__PARENT = CT_CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT__LABEL = CT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_FEATURE_COUNT = CT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtAssertImpl <em>Ct Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtAssertImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtAssert()
	 * @generated
	 */
	int CT_ASSERT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__EXPRESSION = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assert Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT__ASSERT_EXPRESSION = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtAssignmentImpl <em>Ct Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtAssignmentImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtAssignment()
	 * @generated
	 */
	int CT_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__LABEL = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__ASSIGNMENT = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT__ASSIGNED = CT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtBinaryOperatorImpl <em>Ct Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtBinaryOperatorImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtBinaryOperator()
	 * @generated
	 */
	int CT_BINARY_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__KIND = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Hand Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Hand Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR__LEFT_HAND_OPERAND = CT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtBlockImpl <em>Ct Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtBlockImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtBlock()
	 * @generated
	 */
	int CT_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK__STATEMENTS = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtCFlowBreakImpl <em>Ct CFlow Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtCFlowBreakImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCFlowBreak()
	 * @generated
	 */
	int CT_CFLOW_BREAK = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Ct CFlow Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtBreakImpl <em>Ct Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtBreakImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtBreak()
	 * @generated
	 */
	int CT_BREAK = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK__ANNOTATIONS = CT_CFLOW_BREAK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK__POSITION = CT_CFLOW_BREAK__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK__DOC_COMMENT = CT_CFLOW_BREAK__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK__PARENT = CT_CFLOW_BREAK__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK__LABEL = CT_CFLOW_BREAK__LABEL;

	/**
	 * The feature id for the '<em><b>Labelled Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK__LABELLED_STATEMENT = CT_CFLOW_BREAK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK_FEATURE_COUNT = CT_CFLOW_BREAK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtCaseImpl <em>Ct Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtCaseImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCase()
	 * @generated
	 */
	int CT_CASE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Case Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__CASE_EXPRESSION = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE__STATEMENTS = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtCatchImpl <em>Ct Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtCatchImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCatch()
	 * @generated
	 */
	int CT_CATCH = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH__ANNOTATIONS = CT_CODE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH__POSITION = CT_CODE_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH__DOC_COMMENT = CT_CODE_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH__PARENT = CT_CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH__BODY = CT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH__PARAMETER = CT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH_FEATURE_COUNT = CT_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtConditionalImpl <em>Ct Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtConditionalImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtConditional()
	 * @generated
	 */
	int CT_CONDITIONAL = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__ELSE_EXPRESSION = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__CONDITION = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL__THEN_EXPRESSION = CT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtContinueImpl <em>Ct Continue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtContinueImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtContinue()
	 * @generated
	 */
	int CT_CONTINUE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE__ANNOTATIONS = CT_CFLOW_BREAK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE__POSITION = CT_CFLOW_BREAK__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE__DOC_COMMENT = CT_CFLOW_BREAK__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE__PARENT = CT_CFLOW_BREAK__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE__LABEL = CT_CFLOW_BREAK__LABEL;

	/**
	 * The feature id for the '<em><b>Labelled Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE__LABELLED_STATEMENT = CT_CFLOW_BREAK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Continue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE_FEATURE_COUNT = CT_CFLOW_BREAK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtLoopImpl <em>Ct Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtLoopImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtLoop()
	 * @generated
	 */
	int CT_LOOP = 22;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP__BODY = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtDoImpl <em>Ct Do</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtDoImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtDo()
	 * @generated
	 */
	int CT_DO = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__ANNOTATIONS = CT_LOOP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__POSITION = CT_LOOP__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__DOC_COMMENT = CT_LOOP__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__PARENT = CT_LOOP__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__LABEL = CT_LOOP__LABEL;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__BODY = CT_LOOP__BODY;

	/**
	 * The feature id for the '<em><b>Looping Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO__LOOPING_EXPRESSION = CT_LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Do</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO_FEATURE_COUNT = CT_LOOP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtFieldAccessImpl <em>Ct Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtFieldAccessImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtFieldAccess()
	 * @generated
	 */
	int CT_FIELD_ACCESS = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__ANNOTATIONS = CT_TARGETED_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__POSITION = CT_TARGETED_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__DOC_COMMENT = CT_TARGETED_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__PARENT = CT_TARGETED_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__TYPE = CT_TARGETED_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__TYPE_CASTS = CT_TARGETED_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__TARGET = CT_TARGETED_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS__VARIABLE = CT_TARGETED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS_FEATURE_COUNT = CT_TARGETED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtForImpl <em>Ct For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtForImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtFor()
	 * @generated
	 */
	int CT_FOR = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__ANNOTATIONS = CT_LOOP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__POSITION = CT_LOOP__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__DOC_COMMENT = CT_LOOP__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__PARENT = CT_LOOP__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__LABEL = CT_LOOP__LABEL;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__BODY = CT_LOOP__BODY;

	/**
	 * The feature id for the '<em><b>For Init</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__FOR_INIT = CT_LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__FOR_UPDATE = CT_LOOP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR__EXPRESSION = CT_LOOP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_FEATURE_COUNT = CT_LOOP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtForEachImpl <em>Ct For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtForEachImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtForEach()
	 * @generated
	 */
	int CT_FOR_EACH = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__ANNOTATIONS = CT_LOOP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__POSITION = CT_LOOP__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__DOC_COMMENT = CT_LOOP__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__PARENT = CT_LOOP__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__LABEL = CT_LOOP__LABEL;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__BODY = CT_LOOP__BODY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__EXPRESSION = CT_LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH__VARIABLE = CT_LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH_FEATURE_COUNT = CT_LOOP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtIfImpl <em>Ct If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtIfImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtIf()
	 * @generated
	 */
	int CT_IF = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Then Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__THEN_STATEMENT = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__CONDITION = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF__ELSE_STATEMENT = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtInvocationImpl <em>Ct Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtInvocationImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtInvocation()
	 * @generated
	 */
	int CT_INVOCATION = 19;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__ANNOTATIONS = CT_ABSTRACT_INVOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__POSITION = CT_ABSTRACT_INVOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__DOC_COMMENT = CT_ABSTRACT_INVOCATION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__PARENT = CT_ABSTRACT_INVOCATION__PARENT;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__EXECUTABLE = CT_ABSTRACT_INVOCATION__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__ARGUMENTS = CT_ABSTRACT_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__LABEL = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__TYPE = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__TYPE_CASTS = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION__TARGET = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ct Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION_FEATURE_COUNT = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtLiteralImpl <em>Ct Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtLiteralImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtLiteral()
	 * @generated
	 */
	int CT_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL__VALUE = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl <em>Ct Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtLocalVariableImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtLocalVariable()
	 * @generated
	 */
	int CT_LOCAL_VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__MODIFIERS = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__SIMPLE_NAME = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__REFERENCE = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__TYPE = CT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION = CT_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ct Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtNewArrayImpl <em>Ct New Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtNewArrayImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtNewArray()
	 * @generated
	 */
	int CT_NEW_ARRAY = 23;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Dimension Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__DIMENSION_EXPRESSIONS = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY__ELEMENTS = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct New Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtNewClassImpl <em>Ct New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtNewClassImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtNewClass()
	 * @generated
	 */
	int CT_NEW_CLASS = 24;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__ANNOTATIONS = CT_ABSTRACT_INVOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__POSITION = CT_ABSTRACT_INVOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__DOC_COMMENT = CT_ABSTRACT_INVOCATION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__PARENT = CT_ABSTRACT_INVOCATION__PARENT;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__EXECUTABLE = CT_ABSTRACT_INVOCATION__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__ARGUMENTS = CT_ABSTRACT_INVOCATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__TYPE = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__TYPE_CASTS = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__LABEL = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anonymous Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS__ANONYMOUS_CLASS = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ct New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS_FEATURE_COUNT = CT_ABSTRACT_INVOCATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtOperatorAssignmentImpl <em>Ct Operator Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtOperatorAssignmentImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtOperatorAssignment()
	 * @generated
	 */
	int CT_OPERATOR_ASSIGNMENT = 25;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__ANNOTATIONS = CT_ASSIGNMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__POSITION = CT_ASSIGNMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__DOC_COMMENT = CT_ASSIGNMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__PARENT = CT_ASSIGNMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__TYPE = CT_ASSIGNMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__TYPE_CASTS = CT_ASSIGNMENT__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__LABEL = CT_ASSIGNMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__ASSIGNMENT = CT_ASSIGNMENT__ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Assigned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__ASSIGNED = CT_ASSIGNMENT__ASSIGNED;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT__KIND = CT_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Operator Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT_FEATURE_COUNT = CT_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtReturnImpl <em>Ct Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtReturnImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtReturn()
	 * @generated
	 */
	int CT_RETURN = 26;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN__ANNOTATIONS = CT_CFLOW_BREAK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN__POSITION = CT_CFLOW_BREAK__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN__DOC_COMMENT = CT_CFLOW_BREAK__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN__PARENT = CT_CFLOW_BREAK__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN__LABEL = CT_CFLOW_BREAK__LABEL;

	/**
	 * The feature id for the '<em><b>Returned Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN__RETURNED_EXPRESSION = CT_CFLOW_BREAK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN_FEATURE_COUNT = CT_CFLOW_BREAK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtStatementListImpl <em>Ct Statement List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtStatementListImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtStatementList()
	 * @generated
	 */
	int CT_STATEMENT_LIST = 28;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST__ANNOTATIONS = CT_CODE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST__POSITION = CT_CODE_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST__DOC_COMMENT = CT_CODE_ELEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST__PARENT = CT_CODE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST__STATEMENTS = CT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Statement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST_FEATURE_COUNT = CT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtSwitchImpl <em>Ct Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtSwitchImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtSwitch()
	 * @generated
	 */
	int CT_SWITCH = 29;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__SELECTOR = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH__CASES = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtSynchronizedImpl <em>Ct Synchronized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtSynchronizedImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtSynchronized()
	 * @generated
	 */
	int CT_SYNCHRONIZED = 30;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__BLOCK = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED__EXPRESSION = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ct Synchronized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtThrowImpl <em>Ct Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtThrowImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtThrow()
	 * @generated
	 */
	int CT_THROW = 32;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW__ANNOTATIONS = CT_CFLOW_BREAK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW__POSITION = CT_CFLOW_BREAK__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW__DOC_COMMENT = CT_CFLOW_BREAK__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW__PARENT = CT_CFLOW_BREAK__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW__LABEL = CT_CFLOW_BREAK__LABEL;

	/**
	 * The feature id for the '<em><b>Thrown Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW__THROWN_EXPRESSION = CT_CFLOW_BREAK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW_FEATURE_COUNT = CT_CFLOW_BREAK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtTryImpl <em>Ct Try</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtTryImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtTry()
	 * @generated
	 */
	int CT_TRY = 33;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__ANNOTATIONS = CT_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__POSITION = CT_STATEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__DOC_COMMENT = CT_STATEMENT__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__PARENT = CT_STATEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__LABEL = CT_STATEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Finalizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__FINALIZER = CT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__BODY = CT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catchers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY__CATCHERS = CT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Try</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY_FEATURE_COUNT = CT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtUnaryOperatorImpl <em>Ct Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtUnaryOperatorImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtUnaryOperator()
	 * @generated
	 */
	int CT_UNARY_OPERATOR = 34;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__LABEL = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__OPERAND = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR__KIND = CT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ct Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtVariableAccessImpl <em>Ct Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtVariableAccessImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtVariableAccess()
	 * @generated
	 */
	int CT_VARIABLE_ACCESS = 35;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__ANNOTATIONS = CT_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__POSITION = CT_EXPRESSION__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__DOC_COMMENT = CT_EXPRESSION__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__PARENT = CT_EXPRESSION__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__TYPE = CT_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Casts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__TYPE_CASTS = CT_EXPRESSION__TYPE_CASTS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS__VARIABLE = CT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS_FEATURE_COUNT = CT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.spoon.reflect.code.impl.CtWhileImpl <em>Ct While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.spoon.reflect.code.impl.CtWhileImpl
	 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtWhile()
	 * @generated
	 */
	int CT_WHILE = 36;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__ANNOTATIONS = CT_LOOP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__POSITION = CT_LOOP__POSITION;

	/**
	 * The feature id for the '<em><b>Doc Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__DOC_COMMENT = CT_LOOP__DOC_COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__PARENT = CT_LOOP__PARENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__LABEL = CT_LOOP__LABEL;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__BODY = CT_LOOP__BODY;

	/**
	 * The feature id for the '<em><b>Looping Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE__LOOPING_EXPRESSION = CT_LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ct While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE_FEATURE_COUNT = CT_LOOP_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Abstract Invocation</em>'.
	 * @see emf.spoon.reflect.code.CtAbstractInvocation
	 * @generated
	 */
	EClass getCtAbstractInvocation();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtAbstractInvocation#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executable</em>'.
	 * @see emf.spoon.reflect.code.CtAbstractInvocation#getExecutable()
	 * @see #getCtAbstractInvocation()
	 * @generated
	 */
	EReference getCtAbstractInvocation_Executable();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtAbstractInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see emf.spoon.reflect.code.CtAbstractInvocation#getArguments()
	 * @see #getCtAbstractInvocation()
	 * @generated
	 */
	EReference getCtAbstractInvocation_Arguments();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Array Access</em>'.
	 * @see emf.spoon.reflect.code.CtArrayAccess
	 * @generated
	 */
	EClass getCtArrayAccess();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtArrayAccess#getIndexExpression <em>Index Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Expression</em>'.
	 * @see emf.spoon.reflect.code.CtArrayAccess#getIndexExpression()
	 * @see #getCtArrayAccess()
	 * @generated
	 */
	EReference getCtArrayAccess_IndexExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtAssert <em>Ct Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Assert</em>'.
	 * @see emf.spoon.reflect.code.CtAssert
	 * @generated
	 */
	EClass getCtAssert();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtAssert#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see emf.spoon.reflect.code.CtAssert#getExpression()
	 * @see #getCtAssert()
	 * @generated
	 */
	EReference getCtAssert_Expression();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtAssert#getAssertExpression <em>Assert Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assert Expression</em>'.
	 * @see emf.spoon.reflect.code.CtAssert#getAssertExpression()
	 * @see #getCtAssert()
	 * @generated
	 */
	EReference getCtAssert_AssertExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Assignment</em>'.
	 * @see emf.spoon.reflect.code.CtAssignment
	 * @generated
	 */
	EClass getCtAssignment();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtAssignment#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignment</em>'.
	 * @see emf.spoon.reflect.code.CtAssignment#getAssignment()
	 * @see #getCtAssignment()
	 * @generated
	 */
	EReference getCtAssignment_Assignment();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtAssignment#getAssigned <em>Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned</em>'.
	 * @see emf.spoon.reflect.code.CtAssignment#getAssigned()
	 * @see #getCtAssignment()
	 * @generated
	 */
	EReference getCtAssignment_Assigned();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Binary Operator</em>'.
	 * @see emf.spoon.reflect.code.CtBinaryOperator
	 * @generated
	 */
	EClass getCtBinaryOperator();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.code.CtBinaryOperator#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see emf.spoon.reflect.code.CtBinaryOperator#getKind()
	 * @see #getCtBinaryOperator()
	 * @generated
	 */
	EAttribute getCtBinaryOperator_Kind();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtBinaryOperator#getRightHandOperand <em>Right Hand Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Hand Operand</em>'.
	 * @see emf.spoon.reflect.code.CtBinaryOperator#getRightHandOperand()
	 * @see #getCtBinaryOperator()
	 * @generated
	 */
	EReference getCtBinaryOperator_RightHandOperand();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtBinaryOperator#getLeftHandOperand <em>Left Hand Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Hand Operand</em>'.
	 * @see emf.spoon.reflect.code.CtBinaryOperator#getLeftHandOperand()
	 * @see #getCtBinaryOperator()
	 * @generated
	 */
	EReference getCtBinaryOperator_LeftHandOperand();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtBlock <em>Ct Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Block</em>'.
	 * @see emf.spoon.reflect.code.CtBlock
	 * @generated
	 */
	EClass getCtBlock();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statements</em>'.
	 * @see emf.spoon.reflect.code.CtBlock#getStatements()
	 * @see #getCtBlock()
	 * @generated
	 */
	EReference getCtBlock_Statements();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtBreak <em>Ct Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Break</em>'.
	 * @see emf.spoon.reflect.code.CtBreak
	 * @generated
	 */
	EClass getCtBreak();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtBreak#getLabelledStatement <em>Labelled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labelled Statement</em>'.
	 * @see emf.spoon.reflect.code.CtBreak#getLabelledStatement()
	 * @see #getCtBreak()
	 * @generated
	 */
	EReference getCtBreak_LabelledStatement();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct CFlow Break</em>'.
	 * @see emf.spoon.reflect.code.CtCFlowBreak
	 * @generated
	 */
	EClass getCtCFlowBreak();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtCase <em>Ct Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Case</em>'.
	 * @see emf.spoon.reflect.code.CtCase
	 * @generated
	 */
	EClass getCtCase();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtCase#getCaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Case Expression</em>'.
	 * @see emf.spoon.reflect.code.CtCase#getCaseExpression()
	 * @see #getCtCase()
	 * @generated
	 */
	EReference getCtCase_CaseExpression();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtCase#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statements</em>'.
	 * @see emf.spoon.reflect.code.CtCase#getStatements()
	 * @see #getCtCase()
	 * @generated
	 */
	EReference getCtCase_Statements();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtCatch <em>Ct Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Catch</em>'.
	 * @see emf.spoon.reflect.code.CtCatch
	 * @generated
	 */
	EClass getCtCatch();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtCatch#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see emf.spoon.reflect.code.CtCatch#getBody()
	 * @see #getCtCatch()
	 * @generated
	 */
	EReference getCtCatch_Body();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtCatch#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see emf.spoon.reflect.code.CtCatch#getParameter()
	 * @see #getCtCatch()
	 * @generated
	 */
	EReference getCtCatch_Parameter();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Code Element</em>'.
	 * @see emf.spoon.reflect.code.CtCodeElement
	 * @generated
	 */
	EClass getCtCodeElement();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtConditional <em>Ct Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Conditional</em>'.
	 * @see emf.spoon.reflect.code.CtConditional
	 * @generated
	 */
	EClass getCtConditional();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtConditional#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Expression</em>'.
	 * @see emf.spoon.reflect.code.CtConditional#getElseExpression()
	 * @see #getCtConditional()
	 * @generated
	 */
	EReference getCtConditional_ElseExpression();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtConditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see emf.spoon.reflect.code.CtConditional#getCondition()
	 * @see #getCtConditional()
	 * @generated
	 */
	EReference getCtConditional_Condition();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtConditional#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Expression</em>'.
	 * @see emf.spoon.reflect.code.CtConditional#getThenExpression()
	 * @see #getCtConditional()
	 * @generated
	 */
	EReference getCtConditional_ThenExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtContinue <em>Ct Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Continue</em>'.
	 * @see emf.spoon.reflect.code.CtContinue
	 * @generated
	 */
	EClass getCtContinue();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtContinue#getLabelledStatement <em>Labelled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labelled Statement</em>'.
	 * @see emf.spoon.reflect.code.CtContinue#getLabelledStatement()
	 * @see #getCtContinue()
	 * @generated
	 */
	EReference getCtContinue_LabelledStatement();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtDo <em>Ct Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Do</em>'.
	 * @see emf.spoon.reflect.code.CtDo
	 * @generated
	 */
	EClass getCtDo();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtDo#getLoopingExpression <em>Looping Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Looping Expression</em>'.
	 * @see emf.spoon.reflect.code.CtDo#getLoopingExpression()
	 * @see #getCtDo()
	 * @generated
	 */
	EReference getCtDo_LoopingExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Field Access</em>'.
	 * @see emf.spoon.reflect.code.CtFieldAccess
	 * @generated
	 */
	EClass getCtFieldAccess();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtFor <em>Ct For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct For</em>'.
	 * @see emf.spoon.reflect.code.CtFor
	 * @generated
	 */
	EClass getCtFor();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtFor#getForInit <em>For Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For Init</em>'.
	 * @see emf.spoon.reflect.code.CtFor#getForInit()
	 * @see #getCtFor()
	 * @generated
	 */
	EReference getCtFor_ForInit();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtFor#getForUpdate <em>For Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For Update</em>'.
	 * @see emf.spoon.reflect.code.CtFor#getForUpdate()
	 * @see #getCtFor()
	 * @generated
	 */
	EReference getCtFor_ForUpdate();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtFor#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see emf.spoon.reflect.code.CtFor#getExpression()
	 * @see #getCtFor()
	 * @generated
	 */
	EReference getCtFor_Expression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtExpression <em>Ct Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Expression</em>'.
	 * @see emf.spoon.reflect.code.CtExpression
	 * @generated
	 */
	EClass getCtExpression();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtExpression#getTypeCasts <em>Type Casts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Casts</em>'.
	 * @see emf.spoon.reflect.code.CtExpression#getTypeCasts()
	 * @see #getCtExpression()
	 * @generated
	 */
	EReference getCtExpression_TypeCasts();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtForEach <em>Ct For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct For Each</em>'.
	 * @see emf.spoon.reflect.code.CtForEach
	 * @generated
	 */
	EClass getCtForEach();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtForEach#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see emf.spoon.reflect.code.CtForEach#getExpression()
	 * @see #getCtForEach()
	 * @generated
	 */
	EReference getCtForEach_Expression();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtForEach#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see emf.spoon.reflect.code.CtForEach#getVariable()
	 * @see #getCtForEach()
	 * @generated
	 */
	EReference getCtForEach_Variable();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtIf <em>Ct If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct If</em>'.
	 * @see emf.spoon.reflect.code.CtIf
	 * @generated
	 */
	EClass getCtIf();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtIf#getThenStatement <em>Then Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Statement</em>'.
	 * @see emf.spoon.reflect.code.CtIf#getThenStatement()
	 * @see #getCtIf()
	 * @generated
	 */
	EReference getCtIf_ThenStatement();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see emf.spoon.reflect.code.CtIf#getCondition()
	 * @see #getCtIf()
	 * @generated
	 */
	EReference getCtIf_Condition();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtIf#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Statement</em>'.
	 * @see emf.spoon.reflect.code.CtIf#getElseStatement()
	 * @see #getCtIf()
	 * @generated
	 */
	EReference getCtIf_ElseStatement();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Invocation</em>'.
	 * @see emf.spoon.reflect.code.CtInvocation
	 * @generated
	 */
	EClass getCtInvocation();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtLiteral <em>Ct Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Literal</em>'.
	 * @see emf.spoon.reflect.code.CtLiteral
	 * @generated
	 */
	EClass getCtLiteral();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.code.CtLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see emf.spoon.reflect.code.CtLiteral#getValue()
	 * @see #getCtLiteral()
	 * @generated
	 */
	EAttribute getCtLiteral_Value();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Local Variable</em>'.
	 * @see emf.spoon.reflect.code.CtLocalVariable
	 * @generated
	 */
	EClass getCtLocalVariable();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtLoop <em>Ct Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Loop</em>'.
	 * @see emf.spoon.reflect.code.CtLoop
	 * @generated
	 */
	EClass getCtLoop();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtLoop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see emf.spoon.reflect.code.CtLoop#getBody()
	 * @see #getCtLoop()
	 * @generated
	 */
	EReference getCtLoop_Body();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtNewArray <em>Ct New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct New Array</em>'.
	 * @see emf.spoon.reflect.code.CtNewArray
	 * @generated
	 */
	EClass getCtNewArray();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtNewArray#getDimensionExpressions <em>Dimension Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimension Expressions</em>'.
	 * @see emf.spoon.reflect.code.CtNewArray#getDimensionExpressions()
	 * @see #getCtNewArray()
	 * @generated
	 */
	EReference getCtNewArray_DimensionExpressions();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtNewArray#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see emf.spoon.reflect.code.CtNewArray#getElements()
	 * @see #getCtNewArray()
	 * @generated
	 */
	EReference getCtNewArray_Elements();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtNewClass <em>Ct New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct New Class</em>'.
	 * @see emf.spoon.reflect.code.CtNewClass
	 * @generated
	 */
	EClass getCtNewClass();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtNewClass#getAnonymousClass <em>Anonymous Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anonymous Class</em>'.
	 * @see emf.spoon.reflect.code.CtNewClass#getAnonymousClass()
	 * @see #getCtNewClass()
	 * @generated
	 */
	EReference getCtNewClass_AnonymousClass();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Operator Assignment</em>'.
	 * @see emf.spoon.reflect.code.CtOperatorAssignment
	 * @generated
	 */
	EClass getCtOperatorAssignment();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.code.CtOperatorAssignment#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see emf.spoon.reflect.code.CtOperatorAssignment#getKind()
	 * @see #getCtOperatorAssignment()
	 * @generated
	 */
	EAttribute getCtOperatorAssignment_Kind();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtReturn <em>Ct Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Return</em>'.
	 * @see emf.spoon.reflect.code.CtReturn
	 * @generated
	 */
	EClass getCtReturn();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtReturn#getReturnedExpression <em>Returned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returned Expression</em>'.
	 * @see emf.spoon.reflect.code.CtReturn#getReturnedExpression()
	 * @see #getCtReturn()
	 * @generated
	 */
	EReference getCtReturn_ReturnedExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtStatement <em>Ct Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Statement</em>'.
	 * @see emf.spoon.reflect.code.CtStatement
	 * @generated
	 */
	EClass getCtStatement();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.code.CtStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see emf.spoon.reflect.code.CtStatement#getLabel()
	 * @see #getCtStatement()
	 * @generated
	 */
	EAttribute getCtStatement_Label();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Statement List</em>'.
	 * @see emf.spoon.reflect.code.CtStatementList
	 * @generated
	 */
	EClass getCtStatementList();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtStatementList#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statements</em>'.
	 * @see emf.spoon.reflect.code.CtStatementList#getStatements()
	 * @see #getCtStatementList()
	 * @generated
	 */
	EReference getCtStatementList_Statements();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtSwitch <em>Ct Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Switch</em>'.
	 * @see emf.spoon.reflect.code.CtSwitch
	 * @generated
	 */
	EClass getCtSwitch();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtSwitch#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector</em>'.
	 * @see emf.spoon.reflect.code.CtSwitch#getSelector()
	 * @see #getCtSwitch()
	 * @generated
	 */
	EReference getCtSwitch_Selector();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtSwitch#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cases</em>'.
	 * @see emf.spoon.reflect.code.CtSwitch#getCases()
	 * @see #getCtSwitch()
	 * @generated
	 */
	EReference getCtSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Synchronized</em>'.
	 * @see emf.spoon.reflect.code.CtSynchronized
	 * @generated
	 */
	EClass getCtSynchronized();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtSynchronized#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see emf.spoon.reflect.code.CtSynchronized#getBlock()
	 * @see #getCtSynchronized()
	 * @generated
	 */
	EReference getCtSynchronized_Block();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtSynchronized#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see emf.spoon.reflect.code.CtSynchronized#getExpression()
	 * @see #getCtSynchronized()
	 * @generated
	 */
	EReference getCtSynchronized_Expression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Targeted Expression</em>'.
	 * @see emf.spoon.reflect.code.CtTargetedExpression
	 * @generated
	 */
	EClass getCtTargetedExpression();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtTargetedExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see emf.spoon.reflect.code.CtTargetedExpression#getTarget()
	 * @see #getCtTargetedExpression()
	 * @generated
	 */
	EReference getCtTargetedExpression_Target();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtThrow <em>Ct Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Throw</em>'.
	 * @see emf.spoon.reflect.code.CtThrow
	 * @generated
	 */
	EClass getCtThrow();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtThrow#getThrownExpression <em>Thrown Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thrown Expression</em>'.
	 * @see emf.spoon.reflect.code.CtThrow#getThrownExpression()
	 * @see #getCtThrow()
	 * @generated
	 */
	EReference getCtThrow_ThrownExpression();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtTry <em>Ct Try</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Try</em>'.
	 * @see emf.spoon.reflect.code.CtTry
	 * @generated
	 */
	EClass getCtTry();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtTry#getFinalizer <em>Finalizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finalizer</em>'.
	 * @see emf.spoon.reflect.code.CtTry#getFinalizer()
	 * @see #getCtTry()
	 * @generated
	 */
	EReference getCtTry_Finalizer();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtTry#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see emf.spoon.reflect.code.CtTry#getBody()
	 * @see #getCtTry()
	 * @generated
	 */
	EReference getCtTry_Body();

	/**
	 * Returns the meta object for the reference list '{@link emf.spoon.reflect.code.CtTry#getCatchers <em>Catchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Catchers</em>'.
	 * @see emf.spoon.reflect.code.CtTry#getCatchers()
	 * @see #getCtTry()
	 * @generated
	 */
	EReference getCtTry_Catchers();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Unary Operator</em>'.
	 * @see emf.spoon.reflect.code.CtUnaryOperator
	 * @generated
	 */
	EClass getCtUnaryOperator();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtUnaryOperator#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see emf.spoon.reflect.code.CtUnaryOperator#getOperand()
	 * @see #getCtUnaryOperator()
	 * @generated
	 */
	EReference getCtUnaryOperator_Operand();

	/**
	 * Returns the meta object for the attribute '{@link emf.spoon.reflect.code.CtUnaryOperator#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see emf.spoon.reflect.code.CtUnaryOperator#getKind()
	 * @see #getCtUnaryOperator()
	 * @generated
	 */
	EAttribute getCtUnaryOperator_Kind();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Variable Access</em>'.
	 * @see emf.spoon.reflect.code.CtVariableAccess
	 * @generated
	 */
	EClass getCtVariableAccess();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtVariableAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see emf.spoon.reflect.code.CtVariableAccess#getVariable()
	 * @see #getCtVariableAccess()
	 * @generated
	 */
	EReference getCtVariableAccess_Variable();

	/**
	 * Returns the meta object for class '{@link emf.spoon.reflect.code.CtWhile <em>Ct While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct While</em>'.
	 * @see emf.spoon.reflect.code.CtWhile
	 * @generated
	 */
	EClass getCtWhile();

	/**
	 * Returns the meta object for the reference '{@link emf.spoon.reflect.code.CtWhile#getLoopingExpression <em>Looping Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Looping Expression</em>'.
	 * @see emf.spoon.reflect.code.CtWhile#getLoopingExpression()
	 * @see #getCtWhile()
	 * @generated
	 */
	EReference getCtWhile_LoopingExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeFactory getCodeFactory();

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
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtAbstractInvocationImpl <em>Ct Abstract Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtAbstractInvocationImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtAbstractInvocation()
		 * @generated
		 */
		EClass CT_ABSTRACT_INVOCATION = eINSTANCE.getCtAbstractInvocation();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ABSTRACT_INVOCATION__EXECUTABLE = eINSTANCE.getCtAbstractInvocation_Executable();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ABSTRACT_INVOCATION__ARGUMENTS = eINSTANCE.getCtAbstractInvocation_Arguments();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtArrayAccessImpl <em>Ct Array Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtArrayAccessImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtArrayAccess()
		 * @generated
		 */
		EClass CT_ARRAY_ACCESS = eINSTANCE.getCtArrayAccess();

		/**
		 * The meta object literal for the '<em><b>Index Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ARRAY_ACCESS__INDEX_EXPRESSION = eINSTANCE.getCtArrayAccess_IndexExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtAssertImpl <em>Ct Assert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtAssertImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtAssert()
		 * @generated
		 */
		EClass CT_ASSERT = eINSTANCE.getCtAssert();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ASSERT__EXPRESSION = eINSTANCE.getCtAssert_Expression();

		/**
		 * The meta object literal for the '<em><b>Assert Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ASSERT__ASSERT_EXPRESSION = eINSTANCE.getCtAssert_AssertExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtAssignmentImpl <em>Ct Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtAssignmentImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtAssignment()
		 * @generated
		 */
		EClass CT_ASSIGNMENT = eINSTANCE.getCtAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ASSIGNMENT__ASSIGNMENT = eINSTANCE.getCtAssignment_Assignment();

		/**
		 * The meta object literal for the '<em><b>Assigned</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_ASSIGNMENT__ASSIGNED = eINSTANCE.getCtAssignment_Assigned();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtBinaryOperatorImpl <em>Ct Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtBinaryOperatorImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtBinaryOperator()
		 * @generated
		 */
		EClass CT_BINARY_OPERATOR = eINSTANCE.getCtBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_BINARY_OPERATOR__KIND = eINSTANCE.getCtBinaryOperator_Kind();

		/**
		 * The meta object literal for the '<em><b>Right Hand Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_BINARY_OPERATOR__RIGHT_HAND_OPERAND = eINSTANCE.getCtBinaryOperator_RightHandOperand();

		/**
		 * The meta object literal for the '<em><b>Left Hand Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_BINARY_OPERATOR__LEFT_HAND_OPERAND = eINSTANCE.getCtBinaryOperator_LeftHandOperand();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtBlockImpl <em>Ct Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtBlockImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtBlock()
		 * @generated
		 */
		EClass CT_BLOCK = eINSTANCE.getCtBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_BLOCK__STATEMENTS = eINSTANCE.getCtBlock_Statements();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtBreakImpl <em>Ct Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtBreakImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtBreak()
		 * @generated
		 */
		EClass CT_BREAK = eINSTANCE.getCtBreak();

		/**
		 * The meta object literal for the '<em><b>Labelled Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_BREAK__LABELLED_STATEMENT = eINSTANCE.getCtBreak_LabelledStatement();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtCFlowBreakImpl <em>Ct CFlow Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtCFlowBreakImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCFlowBreak()
		 * @generated
		 */
		EClass CT_CFLOW_BREAK = eINSTANCE.getCtCFlowBreak();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtCaseImpl <em>Ct Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtCaseImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCase()
		 * @generated
		 */
		EClass CT_CASE = eINSTANCE.getCtCase();

		/**
		 * The meta object literal for the '<em><b>Case Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CASE__CASE_EXPRESSION = eINSTANCE.getCtCase_CaseExpression();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CASE__STATEMENTS = eINSTANCE.getCtCase_Statements();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtCatchImpl <em>Ct Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtCatchImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCatch()
		 * @generated
		 */
		EClass CT_CATCH = eINSTANCE.getCtCatch();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CATCH__BODY = eINSTANCE.getCtCatch_Body();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CATCH__PARAMETER = eINSTANCE.getCtCatch_Parameter();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtCodeElementImpl <em>Ct Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtCodeElementImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtCodeElement()
		 * @generated
		 */
		EClass CT_CODE_ELEMENT = eINSTANCE.getCtCodeElement();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtConditionalImpl <em>Ct Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtConditionalImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtConditional()
		 * @generated
		 */
		EClass CT_CONDITIONAL = eINSTANCE.getCtConditional();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CONDITIONAL__ELSE_EXPRESSION = eINSTANCE.getCtConditional_ElseExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CONDITIONAL__CONDITION = eINSTANCE.getCtConditional_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CONDITIONAL__THEN_EXPRESSION = eINSTANCE.getCtConditional_ThenExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtContinueImpl <em>Ct Continue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtContinueImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtContinue()
		 * @generated
		 */
		EClass CT_CONTINUE = eINSTANCE.getCtContinue();

		/**
		 * The meta object literal for the '<em><b>Labelled Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_CONTINUE__LABELLED_STATEMENT = eINSTANCE.getCtContinue_LabelledStatement();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtDoImpl <em>Ct Do</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtDoImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtDo()
		 * @generated
		 */
		EClass CT_DO = eINSTANCE.getCtDo();

		/**
		 * The meta object literal for the '<em><b>Looping Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_DO__LOOPING_EXPRESSION = eINSTANCE.getCtDo_LoopingExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtFieldAccessImpl <em>Ct Field Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtFieldAccessImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtFieldAccess()
		 * @generated
		 */
		EClass CT_FIELD_ACCESS = eINSTANCE.getCtFieldAccess();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtForImpl <em>Ct For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtForImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtFor()
		 * @generated
		 */
		EClass CT_FOR = eINSTANCE.getCtFor();

		/**
		 * The meta object literal for the '<em><b>For Init</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FOR__FOR_INIT = eINSTANCE.getCtFor_ForInit();

		/**
		 * The meta object literal for the '<em><b>For Update</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FOR__FOR_UPDATE = eINSTANCE.getCtFor_ForUpdate();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FOR__EXPRESSION = eINSTANCE.getCtFor_Expression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtExpressionImpl <em>Ct Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtExpressionImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtExpression()
		 * @generated
		 */
		EClass CT_EXPRESSION = eINSTANCE.getCtExpression();

		/**
		 * The meta object literal for the '<em><b>Type Casts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_EXPRESSION__TYPE_CASTS = eINSTANCE.getCtExpression_TypeCasts();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtForEachImpl <em>Ct For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtForEachImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtForEach()
		 * @generated
		 */
		EClass CT_FOR_EACH = eINSTANCE.getCtForEach();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FOR_EACH__EXPRESSION = eINSTANCE.getCtForEach_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_FOR_EACH__VARIABLE = eINSTANCE.getCtForEach_Variable();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtIfImpl <em>Ct If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtIfImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtIf()
		 * @generated
		 */
		EClass CT_IF = eINSTANCE.getCtIf();

		/**
		 * The meta object literal for the '<em><b>Then Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_IF__THEN_STATEMENT = eINSTANCE.getCtIf_ThenStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_IF__CONDITION = eINSTANCE.getCtIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_IF__ELSE_STATEMENT = eINSTANCE.getCtIf_ElseStatement();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtInvocationImpl <em>Ct Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtInvocationImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtInvocation()
		 * @generated
		 */
		EClass CT_INVOCATION = eINSTANCE.getCtInvocation();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtLiteralImpl <em>Ct Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtLiteralImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtLiteral()
		 * @generated
		 */
		EClass CT_LITERAL = eINSTANCE.getCtLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_LITERAL__VALUE = eINSTANCE.getCtLiteral_Value();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl <em>Ct Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtLocalVariableImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtLocalVariable()
		 * @generated
		 */
		EClass CT_LOCAL_VARIABLE = eINSTANCE.getCtLocalVariable();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtLoopImpl <em>Ct Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtLoopImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtLoop()
		 * @generated
		 */
		EClass CT_LOOP = eINSTANCE.getCtLoop();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_LOOP__BODY = eINSTANCE.getCtLoop_Body();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtNewArrayImpl <em>Ct New Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtNewArrayImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtNewArray()
		 * @generated
		 */
		EClass CT_NEW_ARRAY = eINSTANCE.getCtNewArray();

		/**
		 * The meta object literal for the '<em><b>Dimension Expressions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_NEW_ARRAY__DIMENSION_EXPRESSIONS = eINSTANCE.getCtNewArray_DimensionExpressions();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_NEW_ARRAY__ELEMENTS = eINSTANCE.getCtNewArray_Elements();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtNewClassImpl <em>Ct New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtNewClassImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtNewClass()
		 * @generated
		 */
		EClass CT_NEW_CLASS = eINSTANCE.getCtNewClass();

		/**
		 * The meta object literal for the '<em><b>Anonymous Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_NEW_CLASS__ANONYMOUS_CLASS = eINSTANCE.getCtNewClass_AnonymousClass();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtOperatorAssignmentImpl <em>Ct Operator Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtOperatorAssignmentImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtOperatorAssignment()
		 * @generated
		 */
		EClass CT_OPERATOR_ASSIGNMENT = eINSTANCE.getCtOperatorAssignment();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_OPERATOR_ASSIGNMENT__KIND = eINSTANCE.getCtOperatorAssignment_Kind();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtReturnImpl <em>Ct Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtReturnImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtReturn()
		 * @generated
		 */
		EClass CT_RETURN = eINSTANCE.getCtReturn();

		/**
		 * The meta object literal for the '<em><b>Returned Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_RETURN__RETURNED_EXPRESSION = eINSTANCE.getCtReturn_ReturnedExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtStatementImpl <em>Ct Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtStatementImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtStatement()
		 * @generated
		 */
		EClass CT_STATEMENT = eINSTANCE.getCtStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_STATEMENT__LABEL = eINSTANCE.getCtStatement_Label();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtStatementListImpl <em>Ct Statement List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtStatementListImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtStatementList()
		 * @generated
		 */
		EClass CT_STATEMENT_LIST = eINSTANCE.getCtStatementList();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_STATEMENT_LIST__STATEMENTS = eINSTANCE.getCtStatementList_Statements();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtSwitchImpl <em>Ct Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtSwitchImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtSwitch()
		 * @generated
		 */
		EClass CT_SWITCH = eINSTANCE.getCtSwitch();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SWITCH__SELECTOR = eINSTANCE.getCtSwitch_Selector();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SWITCH__CASES = eINSTANCE.getCtSwitch_Cases();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtSynchronizedImpl <em>Ct Synchronized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtSynchronizedImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtSynchronized()
		 * @generated
		 */
		EClass CT_SYNCHRONIZED = eINSTANCE.getCtSynchronized();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SYNCHRONIZED__BLOCK = eINSTANCE.getCtSynchronized_Block();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_SYNCHRONIZED__EXPRESSION = eINSTANCE.getCtSynchronized_Expression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtTargetedExpressionImpl <em>Ct Targeted Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtTargetedExpressionImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtTargetedExpression()
		 * @generated
		 */
		EClass CT_TARGETED_EXPRESSION = eINSTANCE.getCtTargetedExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TARGETED_EXPRESSION__TARGET = eINSTANCE.getCtTargetedExpression_Target();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtThrowImpl <em>Ct Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtThrowImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtThrow()
		 * @generated
		 */
		EClass CT_THROW = eINSTANCE.getCtThrow();

		/**
		 * The meta object literal for the '<em><b>Thrown Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_THROW__THROWN_EXPRESSION = eINSTANCE.getCtThrow_ThrownExpression();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtTryImpl <em>Ct Try</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtTryImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtTry()
		 * @generated
		 */
		EClass CT_TRY = eINSTANCE.getCtTry();

		/**
		 * The meta object literal for the '<em><b>Finalizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TRY__FINALIZER = eINSTANCE.getCtTry_Finalizer();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TRY__BODY = eINSTANCE.getCtTry_Body();

		/**
		 * The meta object literal for the '<em><b>Catchers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_TRY__CATCHERS = eINSTANCE.getCtTry_Catchers();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtUnaryOperatorImpl <em>Ct Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtUnaryOperatorImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtUnaryOperator()
		 * @generated
		 */
		EClass CT_UNARY_OPERATOR = eINSTANCE.getCtUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_UNARY_OPERATOR__OPERAND = eINSTANCE.getCtUnaryOperator_Operand();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CT_UNARY_OPERATOR__KIND = eINSTANCE.getCtUnaryOperator_Kind();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtVariableAccessImpl <em>Ct Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtVariableAccessImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtVariableAccess()
		 * @generated
		 */
		EClass CT_VARIABLE_ACCESS = eINSTANCE.getCtVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_VARIABLE_ACCESS__VARIABLE = eINSTANCE.getCtVariableAccess_Variable();

		/**
		 * The meta object literal for the '{@link emf.spoon.reflect.code.impl.CtWhileImpl <em>Ct While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.spoon.reflect.code.impl.CtWhileImpl
		 * @see emf.spoon.reflect.code.impl.CodePackageImpl#getCtWhile()
		 * @generated
		 */
		EClass CT_WHILE = eINSTANCE.getCtWhile();

		/**
		 * The meta object literal for the '<em><b>Looping Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CT_WHILE__LOOPING_EXPRESSION = eINSTANCE.getCtWhile_LoopingExpression();

	}

} //CodePackage
