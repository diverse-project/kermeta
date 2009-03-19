/**
 * <copyright>
 * </copyright>
 *
 * $Id: CodeFactory.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.code.CodePackage
 * @generated
 */
public interface CodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeFactory eINSTANCE = emf.spoon.reflect.code.impl.CodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ct Abstract Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Abstract Invocation</em>'.
	 * @generated
	 */
	CtAbstractInvocation createCtAbstractInvocation();

	/**
	 * Returns a new object of class '<em>Ct Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Array Access</em>'.
	 * @generated
	 */
	CtArrayAccess createCtArrayAccess();

	/**
	 * Returns a new object of class '<em>Ct Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Assert</em>'.
	 * @generated
	 */
	CtAssert createCtAssert();

	/**
	 * Returns a new object of class '<em>Ct Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Assignment</em>'.
	 * @generated
	 */
	CtAssignment createCtAssignment();

	/**
	 * Returns a new object of class '<em>Ct Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Binary Operator</em>'.
	 * @generated
	 */
	CtBinaryOperator createCtBinaryOperator();

	/**
	 * Returns a new object of class '<em>Ct Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Block</em>'.
	 * @generated
	 */
	CtBlock createCtBlock();

	/**
	 * Returns a new object of class '<em>Ct Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Break</em>'.
	 * @generated
	 */
	CtBreak createCtBreak();

	/**
	 * Returns a new object of class '<em>Ct CFlow Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct CFlow Break</em>'.
	 * @generated
	 */
	CtCFlowBreak createCtCFlowBreak();

	/**
	 * Returns a new object of class '<em>Ct Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Case</em>'.
	 * @generated
	 */
	CtCase createCtCase();

	/**
	 * Returns a new object of class '<em>Ct Catch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Catch</em>'.
	 * @generated
	 */
	CtCatch createCtCatch();

	/**
	 * Returns a new object of class '<em>Ct Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Code Element</em>'.
	 * @generated
	 */
	CtCodeElement createCtCodeElement();

	/**
	 * Returns a new object of class '<em>Ct Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Conditional</em>'.
	 * @generated
	 */
	CtConditional createCtConditional();

	/**
	 * Returns a new object of class '<em>Ct Continue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Continue</em>'.
	 * @generated
	 */
	CtContinue createCtContinue();

	/**
	 * Returns a new object of class '<em>Ct Do</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Do</em>'.
	 * @generated
	 */
	CtDo createCtDo();

	/**
	 * Returns a new object of class '<em>Ct Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Expression</em>'.
	 * @generated
	 */
	CtExpression createCtExpression();

	/**
	 * Returns a new object of class '<em>Ct Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Field Access</em>'.
	 * @generated
	 */
	CtFieldAccess createCtFieldAccess();

	/**
	 * Returns a new object of class '<em>Ct For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct For</em>'.
	 * @generated
	 */
	CtFor createCtFor();

	/**
	 * Returns a new object of class '<em>Ct For Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct For Each</em>'.
	 * @generated
	 */
	CtForEach createCtForEach();

	/**
	 * Returns a new object of class '<em>Ct If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct If</em>'.
	 * @generated
	 */
	CtIf createCtIf();

	/**
	 * Returns a new object of class '<em>Ct Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Invocation</em>'.
	 * @generated
	 */
	CtInvocation createCtInvocation();

	/**
	 * Returns a new object of class '<em>Ct Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Literal</em>'.
	 * @generated
	 */
	CtLiteral createCtLiteral();

	/**
	 * Returns a new object of class '<em>Ct Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Local Variable</em>'.
	 * @generated
	 */
	CtLocalVariable createCtLocalVariable();

	/**
	 * Returns a new object of class '<em>Ct Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Loop</em>'.
	 * @generated
	 */
	CtLoop createCtLoop();

	/**
	 * Returns a new object of class '<em>Ct New Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct New Array</em>'.
	 * @generated
	 */
	CtNewArray createCtNewArray();

	/**
	 * Returns a new object of class '<em>Ct New Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct New Class</em>'.
	 * @generated
	 */
	CtNewClass createCtNewClass();

	/**
	 * Returns a new object of class '<em>Ct Operator Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Operator Assignment</em>'.
	 * @generated
	 */
	CtOperatorAssignment createCtOperatorAssignment();

	/**
	 * Returns a new object of class '<em>Ct Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Return</em>'.
	 * @generated
	 */
	CtReturn createCtReturn();

	/**
	 * Returns a new object of class '<em>Ct Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Statement</em>'.
	 * @generated
	 */
	CtStatement createCtStatement();

	/**
	 * Returns a new object of class '<em>Ct Statement List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Statement List</em>'.
	 * @generated
	 */
	CtStatementList createCtStatementList();

	/**
	 * Returns a new object of class '<em>Ct Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Switch</em>'.
	 * @generated
	 */
	CtSwitch createCtSwitch();

	/**
	 * Returns a new object of class '<em>Ct Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Synchronized</em>'.
	 * @generated
	 */
	CtSynchronized createCtSynchronized();

	/**
	 * Returns a new object of class '<em>Ct Targeted Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Targeted Expression</em>'.
	 * @generated
	 */
	CtTargetedExpression createCtTargetedExpression();

	/**
	 * Returns a new object of class '<em>Ct Throw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Throw</em>'.
	 * @generated
	 */
	CtThrow createCtThrow();

	/**
	 * Returns a new object of class '<em>Ct Try</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Try</em>'.
	 * @generated
	 */
	CtTry createCtTry();

	/**
	 * Returns a new object of class '<em>Ct Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Unary Operator</em>'.
	 * @generated
	 */
	CtUnaryOperator createCtUnaryOperator();

	/**
	 * Returns a new object of class '<em>Ct Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Variable Access</em>'.
	 * @generated
	 */
	CtVariableAccess createCtVariableAccess();

	/**
	 * Returns a new object of class '<em>Ct While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct While</em>'.
	 * @generated
	 */
	CtWhile createCtWhile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodePackage getCodePackage();

} //CodeFactory
