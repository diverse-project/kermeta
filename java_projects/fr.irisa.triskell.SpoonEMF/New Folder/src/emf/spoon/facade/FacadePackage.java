/**
 * <copyright>
 * </copyright>
 *
 * $Id: FacadePackage.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.facade;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see emf.spoon.facade.FacadeFactory
 * @model kind="package"
 * @generated
 */
public interface FacadePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "facade";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spoon#facade";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spoon.facade";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacadePackage eINSTANCE = emf.spoon.facade.impl.FacadePackageImpl.init();

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtArrayTypeReference <em>Ct Array Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtArrayTypeReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtArrayTypeReference()
	 * @generated
	 */
	int CT_ARRAY_TYPE_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Ct Array Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_TYPE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtExecutableReference <em>Ct Executable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtExecutableReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtExecutableReference()
	 * @generated
	 */
	int CT_EXECUTABLE_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Ct Executable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtFieldReference <em>Ct Field Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtFieldReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtFieldReference()
	 * @generated
	 */
	int CT_FIELD_REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Ct Field Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtGenericElementReference <em>Ct Generic Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtGenericElementReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtGenericElementReference()
	 * @generated
	 */
	int CT_GENERIC_ELEMENT_REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Ct Generic Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtLocalVariableReference <em>Ct Local Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtLocalVariableReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLocalVariableReference()
	 * @generated
	 */
	int CT_LOCAL_VARIABLE_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Ct Local Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtPackageReference <em>Ct Package Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtPackageReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtPackageReference()
	 * @generated
	 */
	int CT_PACKAGE_REFERENCE = 5;

	/**
	 * The number of structural features of the '<em>Ct Package Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtParameterReference <em>Ct Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtParameterReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtParameterReference()
	 * @generated
	 */
	int CT_PARAMETER_REFERENCE = 6;

	/**
	 * The number of structural features of the '<em>Ct Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtReference <em>Ct Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtReference()
	 * @generated
	 */
	int CT_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Ct Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtTypeParameterReference <em>Ct Type Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtTypeParameterReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypeParameterReference()
	 * @generated
	 */
	int CT_TYPE_PARAMETER_REFERENCE = 8;

	/**
	 * The number of structural features of the '<em>Ct Type Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtTypeReference <em>Ct Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtTypeReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypeReference()
	 * @generated
	 */
	int CT_TYPE_REFERENCE = 9;

	/**
	 * The number of structural features of the '<em>Ct Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.reference.CtVariableReference <em>Ct Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.reference.CtVariableReference
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtVariableReference()
	 * @generated
	 */
	int CT_VARIABLE_REFERENCE = 10;

	/**
	 * The number of structural features of the '<em>Ct Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtAbstractInvocation
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAbstractInvocation()
	 * @generated
	 */
	int CT_ABSTRACT_INVOCATION = 11;

	/**
	 * The number of structural features of the '<em>Ct Abstract Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ABSTRACT_INVOCATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtArrayAccess
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtArrayAccess()
	 * @generated
	 */
	int CT_ARRAY_ACCESS = 12;

	/**
	 * The number of structural features of the '<em>Ct Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ARRAY_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtAssert <em>Ct Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtAssert
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAssert()
	 * @generated
	 */
	int CT_ASSERT = 13;

	/**
	 * The number of structural features of the '<em>Ct Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSERT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtAssignment
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAssignment()
	 * @generated
	 */
	int CT_ASSIGNMENT = 14;

	/**
	 * The number of structural features of the '<em>Ct Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ASSIGNMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtBinaryOperator
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtBinaryOperator()
	 * @generated
	 */
	int CT_BINARY_OPERATOR = 15;

	/**
	 * The number of structural features of the '<em>Ct Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BINARY_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtBlock <em>Ct Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtBlock
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtBlock()
	 * @generated
	 */
	int CT_BLOCK = 16;

	/**
	 * The number of structural features of the '<em>Ct Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BLOCK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtBreak <em>Ct Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtBreak
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtBreak()
	 * @generated
	 */
	int CT_BREAK = 17;

	/**
	 * The number of structural features of the '<em>Ct Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_BREAK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtCFlowBreak
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCFlowBreak()
	 * @generated
	 */
	int CT_CFLOW_BREAK = 18;

	/**
	 * The number of structural features of the '<em>Ct CFlow Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CFLOW_BREAK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtCase <em>Ct Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtCase
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCase()
	 * @generated
	 */
	int CT_CASE = 19;

	/**
	 * The number of structural features of the '<em>Ct Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtCatch <em>Ct Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtCatch
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCatch()
	 * @generated
	 */
	int CT_CATCH = 20;

	/**
	 * The number of structural features of the '<em>Ct Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CATCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtCodeElement
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCodeElement()
	 * @generated
	 */
	int CT_CODE_ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>Ct Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CODE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtConditional <em>Ct Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtConditional
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtConditional()
	 * @generated
	 */
	int CT_CONDITIONAL = 22;

	/**
	 * The number of structural features of the '<em>Ct Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONDITIONAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtContinue <em>Ct Continue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtContinue
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtContinue()
	 * @generated
	 */
	int CT_CONTINUE = 23;

	/**
	 * The number of structural features of the '<em>Ct Continue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONTINUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtDo <em>Ct Do</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtDo
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtDo()
	 * @generated
	 */
	int CT_DO = 24;

	/**
	 * The number of structural features of the '<em>Ct Do</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_DO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtExpression <em>Ct Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtExpression
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtExpression()
	 * @generated
	 */
	int CT_EXPRESSION = 25;

	/**
	 * The number of structural features of the '<em>Ct Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtFieldAccess
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtFieldAccess()
	 * @generated
	 */
	int CT_FIELD_ACCESS = 26;

	/**
	 * The number of structural features of the '<em>Ct Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtFor <em>Ct For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtFor
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtFor()
	 * @generated
	 */
	int CT_FOR = 27;

	/**
	 * The number of structural features of the '<em>Ct For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtForEach <em>Ct For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtForEach
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtForEach()
	 * @generated
	 */
	int CT_FOR_EACH = 28;

	/**
	 * The number of structural features of the '<em>Ct For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FOR_EACH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtIf <em>Ct If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtIf
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtIf()
	 * @generated
	 */
	int CT_IF = 29;

	/**
	 * The number of structural features of the '<em>Ct If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_IF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtInvocation
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtInvocation()
	 * @generated
	 */
	int CT_INVOCATION = 30;

	/**
	 * The number of structural features of the '<em>Ct Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INVOCATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtLiteral <em>Ct Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtLiteral
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLiteral()
	 * @generated
	 */
	int CT_LITERAL = 31;

	/**
	 * The number of structural features of the '<em>Ct Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LITERAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtLocalVariable
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLocalVariable()
	 * @generated
	 */
	int CT_LOCAL_VARIABLE = 32;

	/**
	 * The number of structural features of the '<em>Ct Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOCAL_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtLoop <em>Ct Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtLoop
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLoop()
	 * @generated
	 */
	int CT_LOOP = 33;

	/**
	 * The number of structural features of the '<em>Ct Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_LOOP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtNewArray <em>Ct New Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtNewArray
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtNewArray()
	 * @generated
	 */
	int CT_NEW_ARRAY = 34;

	/**
	 * The number of structural features of the '<em>Ct New Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_ARRAY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtNewClass <em>Ct New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtNewClass
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtNewClass()
	 * @generated
	 */
	int CT_NEW_CLASS = 35;

	/**
	 * The number of structural features of the '<em>Ct New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NEW_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtOperatorAssignment
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtOperatorAssignment()
	 * @generated
	 */
	int CT_OPERATOR_ASSIGNMENT = 36;

	/**
	 * The number of structural features of the '<em>Ct Operator Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_OPERATOR_ASSIGNMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtReturn <em>Ct Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtReturn
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtReturn()
	 * @generated
	 */
	int CT_RETURN = 37;

	/**
	 * The number of structural features of the '<em>Ct Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_RETURN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtStatement <em>Ct Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtStatement
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtStatement()
	 * @generated
	 */
	int CT_STATEMENT = 38;

	/**
	 * The number of structural features of the '<em>Ct Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtStatementList
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtStatementList()
	 * @generated
	 */
	int CT_STATEMENT_LIST = 39;

	/**
	 * The number of structural features of the '<em>Ct Statement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_STATEMENT_LIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtSwitch <em>Ct Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtSwitch
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtSwitch()
	 * @generated
	 */
	int CT_SWITCH = 40;

	/**
	 * The number of structural features of the '<em>Ct Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SWITCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtSynchronized
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtSynchronized()
	 * @generated
	 */
	int CT_SYNCHRONIZED = 41;

	/**
	 * The number of structural features of the '<em>Ct Synchronized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SYNCHRONIZED_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtTargetedExpression
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTargetedExpression()
	 * @generated
	 */
	int CT_TARGETED_EXPRESSION = 42;

	/**
	 * The number of structural features of the '<em>Ct Targeted Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TARGETED_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtThrow <em>Ct Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtThrow
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtThrow()
	 * @generated
	 */
	int CT_THROW = 43;

	/**
	 * The number of structural features of the '<em>Ct Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_THROW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtTry <em>Ct Try</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtTry
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTry()
	 * @generated
	 */
	int CT_TRY = 44;

	/**
	 * The number of structural features of the '<em>Ct Try</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtUnaryOperator
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtUnaryOperator()
	 * @generated
	 */
	int CT_UNARY_OPERATOR = 45;

	/**
	 * The number of structural features of the '<em>Ct Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_UNARY_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtVariableAccess
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtVariableAccess()
	 * @generated
	 */
	int CT_VARIABLE_ACCESS = 46;

	/**
	 * The number of structural features of the '<em>Ct Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.code.CtWhile <em>Ct While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.code.CtWhile
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtWhile()
	 * @generated
	 */
	int CT_WHILE = 47;

	/**
	 * The number of structural features of the '<em>Ct While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_WHILE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtAnnotation
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAnnotation()
	 * @generated
	 */
	int CT_ANNOTATION = 48;

	/**
	 * The number of structural features of the '<em>Ct Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtAnnotationType
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAnnotationType()
	 * @generated
	 */
	int CT_ANNOTATION_TYPE = 49;

	/**
	 * The number of structural features of the '<em>Ct Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANNOTATION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtAnonymousExecutable
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAnonymousExecutable()
	 * @generated
	 */
	int CT_ANONYMOUS_EXECUTABLE = 50;

	/**
	 * The number of structural features of the '<em>Ct Anonymous Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ANONYMOUS_EXECUTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtClass <em>Ct Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtClass
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtClass()
	 * @generated
	 */
	int CT_CLASS = 51;

	/**
	 * The number of structural features of the '<em>Ct Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CLASS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtConstructor
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtConstructor()
	 * @generated
	 */
	int CT_CONSTRUCTOR = 52;

	/**
	 * The number of structural features of the '<em>Ct Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_CONSTRUCTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtElement <em>Ct Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtElement
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtElement()
	 * @generated
	 */
	int CT_ELEMENT = 53;

	/**
	 * The number of structural features of the '<em>Ct Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtEnum
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtEnum()
	 * @generated
	 */
	int CT_ENUM = 54;

	/**
	 * The number of structural features of the '<em>Ct Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_ENUM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtExecutable
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtExecutable()
	 * @generated
	 */
	int CT_EXECUTABLE = 55;

	/**
	 * The number of structural features of the '<em>Ct Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EXECUTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtField <em>Ct Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtField
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtField()
	 * @generated
	 */
	int CT_FIELD = 56;

	/**
	 * The number of structural features of the '<em>Ct Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_FIELD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtGenericElement
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtGenericElement()
	 * @generated
	 */
	int CT_GENERIC_ELEMENT = 57;

	/**
	 * The number of structural features of the '<em>Ct Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_GENERIC_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtInterface
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtInterface()
	 * @generated
	 */
	int CT_INTERFACE = 58;

	/**
	 * The number of structural features of the '<em>Ct Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtMethod <em>Ct Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtMethod
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtMethod()
	 * @generated
	 */
	int CT_METHOD = 59;

	/**
	 * The number of structural features of the '<em>Ct Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_METHOD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtModifiable
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtModifiable()
	 * @generated
	 */
	int CT_MODIFIABLE = 60;

	/**
	 * The number of structural features of the '<em>Ct Modifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_MODIFIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtNamedElement
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtNamedElement()
	 * @generated
	 */
	int CT_NAMED_ELEMENT = 61;

	/**
	 * The number of structural features of the '<em>Ct Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtPackage <em>Ct Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtPackage
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtPackage()
	 * @generated
	 */
	int CT_PACKAGE = 62;

	/**
	 * The number of structural features of the '<em>Ct Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PACKAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtParameter
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtParameter()
	 * @generated
	 */
	int CT_PARAMETER = 63;

	/**
	 * The number of structural features of the '<em>Ct Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtSimpleType
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtSimpleType()
	 * @generated
	 */
	int CT_SIMPLE_TYPE = 64;

	/**
	 * The number of structural features of the '<em>Ct Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_SIMPLE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtType <em>Ct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtType
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtType()
	 * @generated
	 */
	int CT_TYPE = 65;

	/**
	 * The number of structural features of the '<em>Ct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtTypeParameter
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypeParameter()
	 * @generated
	 */
	int CT_TYPE_PARAMETER = 66;

	/**
	 * The number of structural features of the '<em>Ct Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPE_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtTypedElement
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypedElement()
	 * @generated
	 */
	int CT_TYPED_ELEMENT = 67;

	/**
	 * The number of structural features of the '<em>Ct Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_TYPED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.CtVariable
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtVariable()
	 * @generated
	 */
	int CT_VARIABLE = 68;

	/**
	 * The number of structural features of the '<em>Ct Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spoon.reflect.declaration.SourcePosition <em>Source Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spoon.reflect.declaration.SourcePosition
	 * @see emf.spoon.facade.impl.FacadePackageImpl#getSourcePosition()
	 * @generated
	 */
	int SOURCE_POSITION = 69;

	/**
	 * The number of structural features of the '<em>Source Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_POSITION_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtArrayTypeReference <em>Ct Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Array Type Reference</em>'.
	 * @see spoon.reflect.reference.CtArrayTypeReference
	 * @model instanceClass="spoon.reflect.reference.CtArrayTypeReference"
	 * @generated
	 */
	EClass getCtArrayTypeReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtExecutableReference <em>Ct Executable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Executable Reference</em>'.
	 * @see spoon.reflect.reference.CtExecutableReference
	 * @model instanceClass="spoon.reflect.reference.CtExecutableReference"
	 * @generated
	 */
	EClass getCtExecutableReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtFieldReference <em>Ct Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Field Reference</em>'.
	 * @see spoon.reflect.reference.CtFieldReference
	 * @model instanceClass="spoon.reflect.reference.CtFieldReference"
	 * @generated
	 */
	EClass getCtFieldReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtGenericElementReference <em>Ct Generic Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Generic Element Reference</em>'.
	 * @see spoon.reflect.reference.CtGenericElementReference
	 * @model instanceClass="spoon.reflect.reference.CtGenericElementReference"
	 * @generated
	 */
	EClass getCtGenericElementReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtLocalVariableReference <em>Ct Local Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Local Variable Reference</em>'.
	 * @see spoon.reflect.reference.CtLocalVariableReference
	 * @model instanceClass="spoon.reflect.reference.CtLocalVariableReference"
	 * @generated
	 */
	EClass getCtLocalVariableReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtPackageReference <em>Ct Package Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Package Reference</em>'.
	 * @see spoon.reflect.reference.CtPackageReference
	 * @model instanceClass="spoon.reflect.reference.CtPackageReference"
	 * @generated
	 */
	EClass getCtPackageReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtParameterReference <em>Ct Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Parameter Reference</em>'.
	 * @see spoon.reflect.reference.CtParameterReference
	 * @model instanceClass="spoon.reflect.reference.CtParameterReference"
	 * @generated
	 */
	EClass getCtParameterReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtReference <em>Ct Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Reference</em>'.
	 * @see spoon.reflect.reference.CtReference
	 * @model instanceClass="spoon.reflect.reference.CtReference"
	 * @generated
	 */
	EClass getCtReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtTypeParameterReference <em>Ct Type Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type Parameter Reference</em>'.
	 * @see spoon.reflect.reference.CtTypeParameterReference
	 * @model instanceClass="spoon.reflect.reference.CtTypeParameterReference"
	 * @generated
	 */
	EClass getCtTypeParameterReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtTypeReference <em>Ct Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type Reference</em>'.
	 * @see spoon.reflect.reference.CtTypeReference
	 * @model instanceClass="spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	EClass getCtTypeReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.reference.CtVariableReference <em>Ct Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Variable Reference</em>'.
	 * @see spoon.reflect.reference.CtVariableReference
	 * @model instanceClass="spoon.reflect.reference.CtVariableReference"
	 * @generated
	 */
	EClass getCtVariableReference();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Abstract Invocation</em>'.
	 * @see spoon.reflect.code.CtAbstractInvocation
	 * @model instanceClass="spoon.reflect.code.CtAbstractInvocation"
	 * @generated
	 */
	EClass getCtAbstractInvocation();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Array Access</em>'.
	 * @see spoon.reflect.code.CtArrayAccess
	 * @model instanceClass="spoon.reflect.code.CtArrayAccess"
	 * @generated
	 */
	EClass getCtArrayAccess();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtAssert <em>Ct Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Assert</em>'.
	 * @see spoon.reflect.code.CtAssert
	 * @model instanceClass="spoon.reflect.code.CtAssert"
	 * @generated
	 */
	EClass getCtAssert();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Assignment</em>'.
	 * @see spoon.reflect.code.CtAssignment
	 * @model instanceClass="spoon.reflect.code.CtAssignment"
	 * @generated
	 */
	EClass getCtAssignment();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Binary Operator</em>'.
	 * @see spoon.reflect.code.CtBinaryOperator
	 * @model instanceClass="spoon.reflect.code.CtBinaryOperator"
	 * @generated
	 */
	EClass getCtBinaryOperator();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtBlock <em>Ct Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Block</em>'.
	 * @see spoon.reflect.code.CtBlock
	 * @model instanceClass="spoon.reflect.code.CtBlock"
	 * @generated
	 */
	EClass getCtBlock();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtBreak <em>Ct Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Break</em>'.
	 * @see spoon.reflect.code.CtBreak
	 * @model instanceClass="spoon.reflect.code.CtBreak"
	 * @generated
	 */
	EClass getCtBreak();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct CFlow Break</em>'.
	 * @see spoon.reflect.code.CtCFlowBreak
	 * @model instanceClass="spoon.reflect.code.CtCFlowBreak"
	 * @generated
	 */
	EClass getCtCFlowBreak();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtCase <em>Ct Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Case</em>'.
	 * @see spoon.reflect.code.CtCase
	 * @model instanceClass="spoon.reflect.code.CtCase"
	 * @generated
	 */
	EClass getCtCase();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtCatch <em>Ct Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Catch</em>'.
	 * @see spoon.reflect.code.CtCatch
	 * @model instanceClass="spoon.reflect.code.CtCatch"
	 * @generated
	 */
	EClass getCtCatch();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Code Element</em>'.
	 * @see spoon.reflect.code.CtCodeElement
	 * @model instanceClass="spoon.reflect.code.CtCodeElement"
	 * @generated
	 */
	EClass getCtCodeElement();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtConditional <em>Ct Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Conditional</em>'.
	 * @see spoon.reflect.code.CtConditional
	 * @model instanceClass="spoon.reflect.code.CtConditional"
	 * @generated
	 */
	EClass getCtConditional();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtContinue <em>Ct Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Continue</em>'.
	 * @see spoon.reflect.code.CtContinue
	 * @model instanceClass="spoon.reflect.code.CtContinue"
	 * @generated
	 */
	EClass getCtContinue();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtDo <em>Ct Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Do</em>'.
	 * @see spoon.reflect.code.CtDo
	 * @model instanceClass="spoon.reflect.code.CtDo"
	 * @generated
	 */
	EClass getCtDo();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtExpression <em>Ct Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Expression</em>'.
	 * @see spoon.reflect.code.CtExpression
	 * @model instanceClass="spoon.reflect.code.CtExpression"
	 * @generated
	 */
	EClass getCtExpression();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Field Access</em>'.
	 * @see spoon.reflect.code.CtFieldAccess
	 * @model instanceClass="spoon.reflect.code.CtFieldAccess"
	 * @generated
	 */
	EClass getCtFieldAccess();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtFor <em>Ct For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct For</em>'.
	 * @see spoon.reflect.code.CtFor
	 * @model instanceClass="spoon.reflect.code.CtFor"
	 * @generated
	 */
	EClass getCtFor();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtForEach <em>Ct For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct For Each</em>'.
	 * @see spoon.reflect.code.CtForEach
	 * @model instanceClass="spoon.reflect.code.CtForEach"
	 * @generated
	 */
	EClass getCtForEach();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtIf <em>Ct If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct If</em>'.
	 * @see spoon.reflect.code.CtIf
	 * @model instanceClass="spoon.reflect.code.CtIf"
	 * @generated
	 */
	EClass getCtIf();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Invocation</em>'.
	 * @see spoon.reflect.code.CtInvocation
	 * @model instanceClass="spoon.reflect.code.CtInvocation"
	 * @generated
	 */
	EClass getCtInvocation();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtLiteral <em>Ct Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Literal</em>'.
	 * @see spoon.reflect.code.CtLiteral
	 * @model instanceClass="spoon.reflect.code.CtLiteral"
	 * @generated
	 */
	EClass getCtLiteral();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Local Variable</em>'.
	 * @see spoon.reflect.code.CtLocalVariable
	 * @model instanceClass="spoon.reflect.code.CtLocalVariable"
	 * @generated
	 */
	EClass getCtLocalVariable();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtLoop <em>Ct Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Loop</em>'.
	 * @see spoon.reflect.code.CtLoop
	 * @model instanceClass="spoon.reflect.code.CtLoop"
	 * @generated
	 */
	EClass getCtLoop();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtNewArray <em>Ct New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct New Array</em>'.
	 * @see spoon.reflect.code.CtNewArray
	 * @model instanceClass="spoon.reflect.code.CtNewArray"
	 * @generated
	 */
	EClass getCtNewArray();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtNewClass <em>Ct New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct New Class</em>'.
	 * @see spoon.reflect.code.CtNewClass
	 * @model instanceClass="spoon.reflect.code.CtNewClass"
	 * @generated
	 */
	EClass getCtNewClass();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Operator Assignment</em>'.
	 * @see spoon.reflect.code.CtOperatorAssignment
	 * @model instanceClass="spoon.reflect.code.CtOperatorAssignment"
	 * @generated
	 */
	EClass getCtOperatorAssignment();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtReturn <em>Ct Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Return</em>'.
	 * @see spoon.reflect.code.CtReturn
	 * @model instanceClass="spoon.reflect.code.CtReturn"
	 * @generated
	 */
	EClass getCtReturn();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtStatement <em>Ct Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Statement</em>'.
	 * @see spoon.reflect.code.CtStatement
	 * @model instanceClass="spoon.reflect.code.CtStatement"
	 * @generated
	 */
	EClass getCtStatement();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Statement List</em>'.
	 * @see spoon.reflect.code.CtStatementList
	 * @model instanceClass="spoon.reflect.code.CtStatementList"
	 * @generated
	 */
	EClass getCtStatementList();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtSwitch <em>Ct Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Switch</em>'.
	 * @see spoon.reflect.code.CtSwitch
	 * @model instanceClass="spoon.reflect.code.CtSwitch"
	 * @generated
	 */
	EClass getCtSwitch();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Synchronized</em>'.
	 * @see spoon.reflect.code.CtSynchronized
	 * @model instanceClass="spoon.reflect.code.CtSynchronized"
	 * @generated
	 */
	EClass getCtSynchronized();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Targeted Expression</em>'.
	 * @see spoon.reflect.code.CtTargetedExpression
	 * @model instanceClass="spoon.reflect.code.CtTargetedExpression"
	 * @generated
	 */
	EClass getCtTargetedExpression();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtThrow <em>Ct Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Throw</em>'.
	 * @see spoon.reflect.code.CtThrow
	 * @model instanceClass="spoon.reflect.code.CtThrow"
	 * @generated
	 */
	EClass getCtThrow();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtTry <em>Ct Try</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Try</em>'.
	 * @see spoon.reflect.code.CtTry
	 * @model instanceClass="spoon.reflect.code.CtTry"
	 * @generated
	 */
	EClass getCtTry();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Unary Operator</em>'.
	 * @see spoon.reflect.code.CtUnaryOperator
	 * @model instanceClass="spoon.reflect.code.CtUnaryOperator"
	 * @generated
	 */
	EClass getCtUnaryOperator();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Variable Access</em>'.
	 * @see spoon.reflect.code.CtVariableAccess
	 * @model instanceClass="spoon.reflect.code.CtVariableAccess"
	 * @generated
	 */
	EClass getCtVariableAccess();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.code.CtWhile <em>Ct While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct While</em>'.
	 * @see spoon.reflect.code.CtWhile
	 * @model instanceClass="spoon.reflect.code.CtWhile"
	 * @generated
	 */
	EClass getCtWhile();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Annotation</em>'.
	 * @see spoon.reflect.declaration.CtAnnotation
	 * @model instanceClass="spoon.reflect.declaration.CtAnnotation"
	 * @generated
	 */
	EClass getCtAnnotation();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Annotation Type</em>'.
	 * @see spoon.reflect.declaration.CtAnnotationType
	 * @model instanceClass="spoon.reflect.declaration.CtAnnotationType"
	 * @generated
	 */
	EClass getCtAnnotationType();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Anonymous Executable</em>'.
	 * @see spoon.reflect.declaration.CtAnonymousExecutable
	 * @model instanceClass="spoon.reflect.declaration.CtAnonymousExecutable"
	 * @generated
	 */
	EClass getCtAnonymousExecutable();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Class</em>'.
	 * @see spoon.reflect.declaration.CtClass
	 * @model instanceClass="spoon.reflect.declaration.CtClass"
	 * @generated
	 */
	EClass getCtClass();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Constructor</em>'.
	 * @see spoon.reflect.declaration.CtConstructor
	 * @model instanceClass="spoon.reflect.declaration.CtConstructor"
	 * @generated
	 */
	EClass getCtConstructor();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Element</em>'.
	 * @see spoon.reflect.declaration.CtElement
	 * @model instanceClass="spoon.reflect.declaration.CtElement"
	 * @generated
	 */
	EClass getCtElement();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Enum</em>'.
	 * @see spoon.reflect.declaration.CtEnum
	 * @model instanceClass="spoon.reflect.declaration.CtEnum"
	 * @generated
	 */
	EClass getCtEnum();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Executable</em>'.
	 * @see spoon.reflect.declaration.CtExecutable
	 * @model instanceClass="spoon.reflect.declaration.CtExecutable"
	 * @generated
	 */
	EClass getCtExecutable();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtField <em>Ct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Field</em>'.
	 * @see spoon.reflect.declaration.CtField
	 * @model instanceClass="spoon.reflect.declaration.CtField"
	 * @generated
	 */
	EClass getCtField();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Generic Element</em>'.
	 * @see spoon.reflect.declaration.CtGenericElement
	 * @model instanceClass="spoon.reflect.declaration.CtGenericElement"
	 * @generated
	 */
	EClass getCtGenericElement();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Interface</em>'.
	 * @see spoon.reflect.declaration.CtInterface
	 * @model instanceClass="spoon.reflect.declaration.CtInterface"
	 * @generated
	 */
	EClass getCtInterface();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtMethod <em>Ct Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Method</em>'.
	 * @see spoon.reflect.declaration.CtMethod
	 * @model instanceClass="spoon.reflect.declaration.CtMethod"
	 * @generated
	 */
	EClass getCtMethod();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Modifiable</em>'.
	 * @see spoon.reflect.declaration.CtModifiable
	 * @model instanceClass="spoon.reflect.declaration.CtModifiable"
	 * @generated
	 */
	EClass getCtModifiable();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Named Element</em>'.
	 * @see spoon.reflect.declaration.CtNamedElement
	 * @model instanceClass="spoon.reflect.declaration.CtNamedElement"
	 * @generated
	 */
	EClass getCtNamedElement();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtPackage <em>Ct Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Package</em>'.
	 * @see spoon.reflect.declaration.CtPackage
	 * @model instanceClass="spoon.reflect.declaration.CtPackage"
	 * @generated
	 */
	EClass getCtPackage();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Parameter</em>'.
	 * @see spoon.reflect.declaration.CtParameter
	 * @model instanceClass="spoon.reflect.declaration.CtParameter"
	 * @generated
	 */
	EClass getCtParameter();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Simple Type</em>'.
	 * @see spoon.reflect.declaration.CtSimpleType
	 * @model instanceClass="spoon.reflect.declaration.CtSimpleType"
	 * @generated
	 */
	EClass getCtSimpleType();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtType <em>Ct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type</em>'.
	 * @see spoon.reflect.declaration.CtType
	 * @model instanceClass="spoon.reflect.declaration.CtType"
	 * @generated
	 */
	EClass getCtType();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Type Parameter</em>'.
	 * @see spoon.reflect.declaration.CtTypeParameter
	 * @model instanceClass="spoon.reflect.declaration.CtTypeParameter"
	 * @generated
	 */
	EClass getCtTypeParameter();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Typed Element</em>'.
	 * @see spoon.reflect.declaration.CtTypedElement
	 * @model instanceClass="spoon.reflect.declaration.CtTypedElement"
	 * @generated
	 */
	EClass getCtTypedElement();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ct Variable</em>'.
	 * @see spoon.reflect.declaration.CtVariable
	 * @model instanceClass="spoon.reflect.declaration.CtVariable"
	 * @generated
	 */
	EClass getCtVariable();

	/**
	 * Returns the meta object for class '{@link spoon.reflect.declaration.SourcePosition <em>Source Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Position</em>'.
	 * @see spoon.reflect.declaration.SourcePosition
	 * @model instanceClass="spoon.reflect.declaration.SourcePosition"
	 * @generated
	 */
	EClass getSourcePosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FacadeFactory getFacadeFactory();

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
		 * The meta object literal for the '{@link spoon.reflect.reference.CtArrayTypeReference <em>Ct Array Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtArrayTypeReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtArrayTypeReference()
		 * @generated
		 */
		EClass CT_ARRAY_TYPE_REFERENCE = eINSTANCE.getCtArrayTypeReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtExecutableReference <em>Ct Executable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtExecutableReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtExecutableReference()
		 * @generated
		 */
		EClass CT_EXECUTABLE_REFERENCE = eINSTANCE.getCtExecutableReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtFieldReference <em>Ct Field Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtFieldReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtFieldReference()
		 * @generated
		 */
		EClass CT_FIELD_REFERENCE = eINSTANCE.getCtFieldReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtGenericElementReference <em>Ct Generic Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtGenericElementReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtGenericElementReference()
		 * @generated
		 */
		EClass CT_GENERIC_ELEMENT_REFERENCE = eINSTANCE.getCtGenericElementReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtLocalVariableReference <em>Ct Local Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtLocalVariableReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLocalVariableReference()
		 * @generated
		 */
		EClass CT_LOCAL_VARIABLE_REFERENCE = eINSTANCE.getCtLocalVariableReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtPackageReference <em>Ct Package Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtPackageReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtPackageReference()
		 * @generated
		 */
		EClass CT_PACKAGE_REFERENCE = eINSTANCE.getCtPackageReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtParameterReference <em>Ct Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtParameterReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtParameterReference()
		 * @generated
		 */
		EClass CT_PARAMETER_REFERENCE = eINSTANCE.getCtParameterReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtReference <em>Ct Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtReference()
		 * @generated
		 */
		EClass CT_REFERENCE = eINSTANCE.getCtReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtTypeParameterReference <em>Ct Type Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtTypeParameterReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypeParameterReference()
		 * @generated
		 */
		EClass CT_TYPE_PARAMETER_REFERENCE = eINSTANCE.getCtTypeParameterReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtTypeReference <em>Ct Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtTypeReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypeReference()
		 * @generated
		 */
		EClass CT_TYPE_REFERENCE = eINSTANCE.getCtTypeReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.reference.CtVariableReference <em>Ct Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.reference.CtVariableReference
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtVariableReference()
		 * @generated
		 */
		EClass CT_VARIABLE_REFERENCE = eINSTANCE.getCtVariableReference();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtAbstractInvocation
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAbstractInvocation()
		 * @generated
		 */
		EClass CT_ABSTRACT_INVOCATION = eINSTANCE.getCtAbstractInvocation();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtArrayAccess
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtArrayAccess()
		 * @generated
		 */
		EClass CT_ARRAY_ACCESS = eINSTANCE.getCtArrayAccess();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtAssert <em>Ct Assert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtAssert
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAssert()
		 * @generated
		 */
		EClass CT_ASSERT = eINSTANCE.getCtAssert();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtAssignment
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAssignment()
		 * @generated
		 */
		EClass CT_ASSIGNMENT = eINSTANCE.getCtAssignment();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtBinaryOperator
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtBinaryOperator()
		 * @generated
		 */
		EClass CT_BINARY_OPERATOR = eINSTANCE.getCtBinaryOperator();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtBlock <em>Ct Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtBlock
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtBlock()
		 * @generated
		 */
		EClass CT_BLOCK = eINSTANCE.getCtBlock();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtBreak <em>Ct Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtBreak
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtBreak()
		 * @generated
		 */
		EClass CT_BREAK = eINSTANCE.getCtBreak();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtCFlowBreak
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCFlowBreak()
		 * @generated
		 */
		EClass CT_CFLOW_BREAK = eINSTANCE.getCtCFlowBreak();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtCase <em>Ct Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtCase
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCase()
		 * @generated
		 */
		EClass CT_CASE = eINSTANCE.getCtCase();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtCatch <em>Ct Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtCatch
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCatch()
		 * @generated
		 */
		EClass CT_CATCH = eINSTANCE.getCtCatch();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtCodeElement
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtCodeElement()
		 * @generated
		 */
		EClass CT_CODE_ELEMENT = eINSTANCE.getCtCodeElement();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtConditional <em>Ct Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtConditional
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtConditional()
		 * @generated
		 */
		EClass CT_CONDITIONAL = eINSTANCE.getCtConditional();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtContinue <em>Ct Continue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtContinue
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtContinue()
		 * @generated
		 */
		EClass CT_CONTINUE = eINSTANCE.getCtContinue();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtDo <em>Ct Do</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtDo
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtDo()
		 * @generated
		 */
		EClass CT_DO = eINSTANCE.getCtDo();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtExpression <em>Ct Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtExpression
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtExpression()
		 * @generated
		 */
		EClass CT_EXPRESSION = eINSTANCE.getCtExpression();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtFieldAccess
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtFieldAccess()
		 * @generated
		 */
		EClass CT_FIELD_ACCESS = eINSTANCE.getCtFieldAccess();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtFor <em>Ct For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtFor
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtFor()
		 * @generated
		 */
		EClass CT_FOR = eINSTANCE.getCtFor();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtForEach <em>Ct For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtForEach
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtForEach()
		 * @generated
		 */
		EClass CT_FOR_EACH = eINSTANCE.getCtForEach();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtIf <em>Ct If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtIf
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtIf()
		 * @generated
		 */
		EClass CT_IF = eINSTANCE.getCtIf();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtInvocation
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtInvocation()
		 * @generated
		 */
		EClass CT_INVOCATION = eINSTANCE.getCtInvocation();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtLiteral <em>Ct Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtLiteral
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLiteral()
		 * @generated
		 */
		EClass CT_LITERAL = eINSTANCE.getCtLiteral();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtLocalVariable
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLocalVariable()
		 * @generated
		 */
		EClass CT_LOCAL_VARIABLE = eINSTANCE.getCtLocalVariable();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtLoop <em>Ct Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtLoop
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtLoop()
		 * @generated
		 */
		EClass CT_LOOP = eINSTANCE.getCtLoop();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtNewArray <em>Ct New Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtNewArray
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtNewArray()
		 * @generated
		 */
		EClass CT_NEW_ARRAY = eINSTANCE.getCtNewArray();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtNewClass <em>Ct New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtNewClass
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtNewClass()
		 * @generated
		 */
		EClass CT_NEW_CLASS = eINSTANCE.getCtNewClass();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtOperatorAssignment
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtOperatorAssignment()
		 * @generated
		 */
		EClass CT_OPERATOR_ASSIGNMENT = eINSTANCE.getCtOperatorAssignment();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtReturn <em>Ct Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtReturn
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtReturn()
		 * @generated
		 */
		EClass CT_RETURN = eINSTANCE.getCtReturn();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtStatement <em>Ct Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtStatement
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtStatement()
		 * @generated
		 */
		EClass CT_STATEMENT = eINSTANCE.getCtStatement();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtStatementList
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtStatementList()
		 * @generated
		 */
		EClass CT_STATEMENT_LIST = eINSTANCE.getCtStatementList();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtSwitch <em>Ct Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtSwitch
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtSwitch()
		 * @generated
		 */
		EClass CT_SWITCH = eINSTANCE.getCtSwitch();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtSynchronized
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtSynchronized()
		 * @generated
		 */
		EClass CT_SYNCHRONIZED = eINSTANCE.getCtSynchronized();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtTargetedExpression
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTargetedExpression()
		 * @generated
		 */
		EClass CT_TARGETED_EXPRESSION = eINSTANCE.getCtTargetedExpression();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtThrow <em>Ct Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtThrow
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtThrow()
		 * @generated
		 */
		EClass CT_THROW = eINSTANCE.getCtThrow();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtTry <em>Ct Try</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtTry
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTry()
		 * @generated
		 */
		EClass CT_TRY = eINSTANCE.getCtTry();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtUnaryOperator
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtUnaryOperator()
		 * @generated
		 */
		EClass CT_UNARY_OPERATOR = eINSTANCE.getCtUnaryOperator();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtVariableAccess
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtVariableAccess()
		 * @generated
		 */
		EClass CT_VARIABLE_ACCESS = eINSTANCE.getCtVariableAccess();

		/**
		 * The meta object literal for the '{@link spoon.reflect.code.CtWhile <em>Ct While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.code.CtWhile
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtWhile()
		 * @generated
		 */
		EClass CT_WHILE = eINSTANCE.getCtWhile();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtAnnotation <em>Ct Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtAnnotation
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAnnotation()
		 * @generated
		 */
		EClass CT_ANNOTATION = eINSTANCE.getCtAnnotation();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtAnnotationType <em>Ct Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtAnnotationType
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAnnotationType()
		 * @generated
		 */
		EClass CT_ANNOTATION_TYPE = eINSTANCE.getCtAnnotationType();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtAnonymousExecutable <em>Ct Anonymous Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtAnonymousExecutable
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtAnonymousExecutable()
		 * @generated
		 */
		EClass CT_ANONYMOUS_EXECUTABLE = eINSTANCE.getCtAnonymousExecutable();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtClass <em>Ct Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtClass
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtClass()
		 * @generated
		 */
		EClass CT_CLASS = eINSTANCE.getCtClass();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtConstructor <em>Ct Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtConstructor
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtConstructor()
		 * @generated
		 */
		EClass CT_CONSTRUCTOR = eINSTANCE.getCtConstructor();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtElement <em>Ct Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtElement
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtElement()
		 * @generated
		 */
		EClass CT_ELEMENT = eINSTANCE.getCtElement();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtEnum <em>Ct Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtEnum
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtEnum()
		 * @generated
		 */
		EClass CT_ENUM = eINSTANCE.getCtEnum();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtExecutable <em>Ct Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtExecutable
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtExecutable()
		 * @generated
		 */
		EClass CT_EXECUTABLE = eINSTANCE.getCtExecutable();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtField <em>Ct Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtField
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtField()
		 * @generated
		 */
		EClass CT_FIELD = eINSTANCE.getCtField();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtGenericElement <em>Ct Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtGenericElement
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtGenericElement()
		 * @generated
		 */
		EClass CT_GENERIC_ELEMENT = eINSTANCE.getCtGenericElement();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtInterface <em>Ct Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtInterface
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtInterface()
		 * @generated
		 */
		EClass CT_INTERFACE = eINSTANCE.getCtInterface();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtMethod <em>Ct Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtMethod
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtMethod()
		 * @generated
		 */
		EClass CT_METHOD = eINSTANCE.getCtMethod();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtModifiable
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtModifiable()
		 * @generated
		 */
		EClass CT_MODIFIABLE = eINSTANCE.getCtModifiable();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtNamedElement
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtNamedElement()
		 * @generated
		 */
		EClass CT_NAMED_ELEMENT = eINSTANCE.getCtNamedElement();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtPackage <em>Ct Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtPackage
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtPackage()
		 * @generated
		 */
		EClass CT_PACKAGE = eINSTANCE.getCtPackage();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtParameter <em>Ct Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtParameter
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtParameter()
		 * @generated
		 */
		EClass CT_PARAMETER = eINSTANCE.getCtParameter();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtSimpleType <em>Ct Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtSimpleType
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtSimpleType()
		 * @generated
		 */
		EClass CT_SIMPLE_TYPE = eINSTANCE.getCtSimpleType();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtType <em>Ct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtType
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtType()
		 * @generated
		 */
		EClass CT_TYPE = eINSTANCE.getCtType();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtTypeParameter <em>Ct Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtTypeParameter
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypeParameter()
		 * @generated
		 */
		EClass CT_TYPE_PARAMETER = eINSTANCE.getCtTypeParameter();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtTypedElement
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtTypedElement()
		 * @generated
		 */
		EClass CT_TYPED_ELEMENT = eINSTANCE.getCtTypedElement();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.CtVariable
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getCtVariable()
		 * @generated
		 */
		EClass CT_VARIABLE = eINSTANCE.getCtVariable();

		/**
		 * The meta object literal for the '{@link spoon.reflect.declaration.SourcePosition <em>Source Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spoon.reflect.declaration.SourcePosition
		 * @see emf.spoon.facade.impl.FacadePackageImpl#getSourcePosition()
		 * @generated
		 */
		EClass SOURCE_POSITION = eINSTANCE.getSourcePosition();

	}

} //FacadePackage
