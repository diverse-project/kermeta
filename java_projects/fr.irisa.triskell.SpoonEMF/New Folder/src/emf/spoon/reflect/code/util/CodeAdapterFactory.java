/**
 * <copyright>
 * </copyright>
 *
 * $Id: CodeAdapterFactory.java,v 1.1 2007/02/14 20:38:06 barais Exp $
 */
package emf.spoon.reflect.code.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.CtVariable;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtAbstractInvocation;
import emf.spoon.reflect.code.CtArrayAccess;
import emf.spoon.reflect.code.CtAssert;
import emf.spoon.reflect.code.CtAssignment;
import emf.spoon.reflect.code.CtBinaryOperator;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.code.CtBreak;
import emf.spoon.reflect.code.CtCFlowBreak;
import emf.spoon.reflect.code.CtCase;
import emf.spoon.reflect.code.CtCatch;
import emf.spoon.reflect.code.CtCodeElement;
import emf.spoon.reflect.code.CtConditional;
import emf.spoon.reflect.code.CtContinue;
import emf.spoon.reflect.code.CtDo;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtFieldAccess;
import emf.spoon.reflect.code.CtFor;
import emf.spoon.reflect.code.CtForEach;
import emf.spoon.reflect.code.CtIf;
import emf.spoon.reflect.code.CtInvocation;
import emf.spoon.reflect.code.CtLiteral;
import emf.spoon.reflect.code.CtLocalVariable;
import emf.spoon.reflect.code.CtLoop;
import emf.spoon.reflect.code.CtNewArray;
import emf.spoon.reflect.code.CtNewClass;
import emf.spoon.reflect.code.CtOperatorAssignment;
import emf.spoon.reflect.code.CtReturn;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.code.CtStatementList;
import emf.spoon.reflect.code.CtSwitch;
import emf.spoon.reflect.code.CtSynchronized;
import emf.spoon.reflect.code.CtTargetedExpression;
import emf.spoon.reflect.code.CtThrow;
import emf.spoon.reflect.code.CtTry;
import emf.spoon.reflect.code.CtUnaryOperator;
import emf.spoon.reflect.code.CtVariableAccess;
import emf.spoon.reflect.code.CtWhile;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.code.CodePackage
 * @generated
 */
public class CodeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CodePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSwitch modelSwitch =
		new CodeSwitch() {
			public Object caseCtAbstractInvocation(CtAbstractInvocation object) {
				return createCtAbstractInvocationAdapter();
			}
			public Object caseCtArrayAccess(CtArrayAccess object) {
				return createCtArrayAccessAdapter();
			}
			public Object caseCtAssert(CtAssert object) {
				return createCtAssertAdapter();
			}
			public Object caseCtAssignment(CtAssignment object) {
				return createCtAssignmentAdapter();
			}
			public Object caseCtBinaryOperator(CtBinaryOperator object) {
				return createCtBinaryOperatorAdapter();
			}
			public Object caseCtBlock(CtBlock object) {
				return createCtBlockAdapter();
			}
			public Object caseCtBreak(CtBreak object) {
				return createCtBreakAdapter();
			}
			public Object caseCtCFlowBreak(CtCFlowBreak object) {
				return createCtCFlowBreakAdapter();
			}
			public Object caseCtCase(CtCase object) {
				return createCtCaseAdapter();
			}
			public Object caseCtCatch(CtCatch object) {
				return createCtCatchAdapter();
			}
			public Object caseCtCodeElement(CtCodeElement object) {
				return createCtCodeElementAdapter();
			}
			public Object caseCtConditional(CtConditional object) {
				return createCtConditionalAdapter();
			}
			public Object caseCtContinue(CtContinue object) {
				return createCtContinueAdapter();
			}
			public Object caseCtDo(CtDo object) {
				return createCtDoAdapter();
			}
			public Object caseCtExpression(CtExpression object) {
				return createCtExpressionAdapter();
			}
			public Object caseCtFieldAccess(CtFieldAccess object) {
				return createCtFieldAccessAdapter();
			}
			public Object caseCtFor(CtFor object) {
				return createCtForAdapter();
			}
			public Object caseCtForEach(CtForEach object) {
				return createCtForEachAdapter();
			}
			public Object caseCtIf(CtIf object) {
				return createCtIfAdapter();
			}
			public Object caseCtInvocation(CtInvocation object) {
				return createCtInvocationAdapter();
			}
			public Object caseCtLiteral(CtLiteral object) {
				return createCtLiteralAdapter();
			}
			public Object caseCtLocalVariable(CtLocalVariable object) {
				return createCtLocalVariableAdapter();
			}
			public Object caseCtLoop(CtLoop object) {
				return createCtLoopAdapter();
			}
			public Object caseCtNewArray(CtNewArray object) {
				return createCtNewArrayAdapter();
			}
			public Object caseCtNewClass(CtNewClass object) {
				return createCtNewClassAdapter();
			}
			public Object caseCtOperatorAssignment(CtOperatorAssignment object) {
				return createCtOperatorAssignmentAdapter();
			}
			public Object caseCtReturn(CtReturn object) {
				return createCtReturnAdapter();
			}
			public Object caseCtStatement(CtStatement object) {
				return createCtStatementAdapter();
			}
			public Object caseCtStatementList(CtStatementList object) {
				return createCtStatementListAdapter();
			}
			public Object caseCtSwitch(CtSwitch object) {
				return createCtSwitchAdapter();
			}
			public Object caseCtSynchronized(CtSynchronized object) {
				return createCtSynchronizedAdapter();
			}
			public Object caseCtTargetedExpression(CtTargetedExpression object) {
				return createCtTargetedExpressionAdapter();
			}
			public Object caseCtThrow(CtThrow object) {
				return createCtThrowAdapter();
			}
			public Object caseCtTry(CtTry object) {
				return createCtTryAdapter();
			}
			public Object caseCtUnaryOperator(CtUnaryOperator object) {
				return createCtUnaryOperatorAdapter();
			}
			public Object caseCtVariableAccess(CtVariableAccess object) {
				return createCtVariableAccessAdapter();
			}
			public Object caseCtWhile(CtWhile object) {
				return createCtWhileAdapter();
			}
			public Object caseCtElement(CtElement object) {
				return createCtElementAdapter();
			}
			public Object caseDeclaration_CtElement(emf.spoon.reflect.declaration.CtElement object) {
				return createDeclaration_CtElementAdapter();
			}
			public Object caseFacade_CtAbstractInvocation(spoon.reflect.code.CtAbstractInvocation object) {
				return createFacade_CtAbstractInvocationAdapter();
			}
			public Object caseFacade_CtCodeElement(spoon.reflect.code.CtCodeElement object) {
				return createFacade_CtCodeElementAdapter();
			}
			public Object caseCtTypedElement(CtTypedElement object) {
				return createCtTypedElementAdapter();
			}
			public Object caseDeclaration_CtTypedElement(emf.spoon.reflect.declaration.CtTypedElement object) {
				return createDeclaration_CtTypedElementAdapter();
			}
			public Object caseFacade_CtExpression(spoon.reflect.code.CtExpression object) {
				return createFacade_CtExpressionAdapter();
			}
			public Object caseFacade_CtTargetedExpression(spoon.reflect.code.CtTargetedExpression object) {
				return createFacade_CtTargetedExpressionAdapter();
			}
			public Object caseFacade_CtArrayAccess(spoon.reflect.code.CtArrayAccess object) {
				return createFacade_CtArrayAccessAdapter();
			}
			public Object caseFacade_CtStatement(spoon.reflect.code.CtStatement object) {
				return createFacade_CtStatementAdapter();
			}
			public Object caseFacade_CtAssert(spoon.reflect.code.CtAssert object) {
				return createFacade_CtAssertAdapter();
			}
			public Object caseFacade_CtAssignment(spoon.reflect.code.CtAssignment object) {
				return createFacade_CtAssignmentAdapter();
			}
			public Object caseFacade_CtBinaryOperator(spoon.reflect.code.CtBinaryOperator object) {
				return createFacade_CtBinaryOperatorAdapter();
			}
			public Object caseFacade_CtBlock(spoon.reflect.code.CtBlock object) {
				return createFacade_CtBlockAdapter();
			}
			public Object caseFacade_CtCFlowBreak(spoon.reflect.code.CtCFlowBreak object) {
				return createFacade_CtCFlowBreakAdapter();
			}
			public Object caseFacade_CtBreak(spoon.reflect.code.CtBreak object) {
				return createFacade_CtBreakAdapter();
			}
			public Object caseFacade_CtCase(spoon.reflect.code.CtCase object) {
				return createFacade_CtCaseAdapter();
			}
			public Object caseFacade_CtCatch(spoon.reflect.code.CtCatch object) {
				return createFacade_CtCatchAdapter();
			}
			public Object caseFacade_CtConditional(spoon.reflect.code.CtConditional object) {
				return createFacade_CtConditionalAdapter();
			}
			public Object caseFacade_CtContinue(spoon.reflect.code.CtContinue object) {
				return createFacade_CtContinueAdapter();
			}
			public Object caseFacade_CtLoop(spoon.reflect.code.CtLoop object) {
				return createFacade_CtLoopAdapter();
			}
			public Object caseFacade_CtDo(spoon.reflect.code.CtDo object) {
				return createFacade_CtDoAdapter();
			}
			public Object caseFacade_CtVariableAccess(spoon.reflect.code.CtVariableAccess object) {
				return createFacade_CtVariableAccessAdapter();
			}
			public Object caseFacade_CtFieldAccess(spoon.reflect.code.CtFieldAccess object) {
				return createFacade_CtFieldAccessAdapter();
			}
			public Object caseFacade_CtFor(spoon.reflect.code.CtFor object) {
				return createFacade_CtForAdapter();
			}
			public Object caseFacade_CtForEach(spoon.reflect.code.CtForEach object) {
				return createFacade_CtForEachAdapter();
			}
			public Object caseFacade_CtIf(spoon.reflect.code.CtIf object) {
				return createFacade_CtIfAdapter();
			}
			public Object caseFacade_CtInvocation(spoon.reflect.code.CtInvocation object) {
				return createFacade_CtInvocationAdapter();
			}
			public Object caseFacade_CtLiteral(spoon.reflect.code.CtLiteral object) {
				return createFacade_CtLiteralAdapter();
			}
			public Object caseCtModifiable(CtModifiable object) {
				return createCtModifiableAdapter();
			}
			public Object caseDeclaration_CtModifiable(emf.spoon.reflect.declaration.CtModifiable object) {
				return createDeclaration_CtModifiableAdapter();
			}
			public Object caseCtNamedElement(CtNamedElement object) {
				return createCtNamedElementAdapter();
			}
			public Object caseDeclaration_CtNamedElement(emf.spoon.reflect.declaration.CtNamedElement object) {
				return createDeclaration_CtNamedElementAdapter();
			}
			public Object caseCtVariable(CtVariable object) {
				return createCtVariableAdapter();
			}
			public Object caseDeclaration_CtVariable(emf.spoon.reflect.declaration.CtVariable object) {
				return createDeclaration_CtVariableAdapter();
			}
			public Object caseFacade_CtLocalVariable(spoon.reflect.code.CtLocalVariable object) {
				return createFacade_CtLocalVariableAdapter();
			}
			public Object caseFacade_CtNewArray(spoon.reflect.code.CtNewArray object) {
				return createFacade_CtNewArrayAdapter();
			}
			public Object caseFacade_CtNewClass(spoon.reflect.code.CtNewClass object) {
				return createFacade_CtNewClassAdapter();
			}
			public Object caseFacade_CtOperatorAssignment(spoon.reflect.code.CtOperatorAssignment object) {
				return createFacade_CtOperatorAssignmentAdapter();
			}
			public Object caseFacade_CtReturn(spoon.reflect.code.CtReturn object) {
				return createFacade_CtReturnAdapter();
			}
			public Object caseFacade_CtStatementList(spoon.reflect.code.CtStatementList object) {
				return createFacade_CtStatementListAdapter();
			}
			public Object caseFacade_CtSwitch(spoon.reflect.code.CtSwitch object) {
				return createFacade_CtSwitchAdapter();
			}
			public Object caseFacade_CtSynchronized(spoon.reflect.code.CtSynchronized object) {
				return createFacade_CtSynchronizedAdapter();
			}
			public Object caseFacade_CtThrow(spoon.reflect.code.CtThrow object) {
				return createFacade_CtThrowAdapter();
			}
			public Object caseFacade_CtTry(spoon.reflect.code.CtTry object) {
				return createFacade_CtTryAdapter();
			}
			public Object caseFacade_CtUnaryOperator(spoon.reflect.code.CtUnaryOperator object) {
				return createFacade_CtUnaryOperatorAdapter();
			}
			public Object caseFacade_CtWhile(spoon.reflect.code.CtWhile object) {
				return createFacade_CtWhileAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtAbstractInvocation
	 * @generated
	 */
	public Adapter createCtAbstractInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtArrayAccess
	 * @generated
	 */
	public Adapter createCtArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtAssert <em>Ct Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtAssert
	 * @generated
	 */
	public Adapter createCtAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtAssignment
	 * @generated
	 */
	public Adapter createCtAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtBinaryOperator
	 * @generated
	 */
	public Adapter createCtBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtBlock <em>Ct Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtBlock
	 * @generated
	 */
	public Adapter createCtBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtBreak <em>Ct Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtBreak
	 * @generated
	 */
	public Adapter createCtBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtCFlowBreak
	 * @generated
	 */
	public Adapter createCtCFlowBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtCase <em>Ct Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtCase
	 * @generated
	 */
	public Adapter createCtCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtCatch <em>Ct Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtCatch
	 * @generated
	 */
	public Adapter createCtCatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtCodeElement
	 * @generated
	 */
	public Adapter createCtCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtConditional <em>Ct Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtConditional
	 * @generated
	 */
	public Adapter createCtConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtContinue <em>Ct Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtContinue
	 * @generated
	 */
	public Adapter createCtContinueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtDo <em>Ct Do</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtDo
	 * @generated
	 */
	public Adapter createCtDoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtExpression <em>Ct Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtExpression
	 * @generated
	 */
	public Adapter createCtExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtFieldAccess
	 * @generated
	 */
	public Adapter createCtFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtFor <em>Ct For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtFor
	 * @generated
	 */
	public Adapter createCtForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtForEach <em>Ct For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtForEach
	 * @generated
	 */
	public Adapter createCtForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtIf <em>Ct If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtIf
	 * @generated
	 */
	public Adapter createCtIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtInvocation
	 * @generated
	 */
	public Adapter createCtInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtLiteral <em>Ct Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtLiteral
	 * @generated
	 */
	public Adapter createCtLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtLocalVariable
	 * @generated
	 */
	public Adapter createCtLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtLoop <em>Ct Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtLoop
	 * @generated
	 */
	public Adapter createCtLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtNewArray <em>Ct New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtNewArray
	 * @generated
	 */
	public Adapter createCtNewArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtNewClass <em>Ct New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtNewClass
	 * @generated
	 */
	public Adapter createCtNewClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtOperatorAssignment
	 * @generated
	 */
	public Adapter createCtOperatorAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtReturn <em>Ct Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtReturn
	 * @generated
	 */
	public Adapter createCtReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtStatement <em>Ct Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtStatement
	 * @generated
	 */
	public Adapter createCtStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtStatementList
	 * @generated
	 */
	public Adapter createCtStatementListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtSwitch <em>Ct Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtSwitch
	 * @generated
	 */
	public Adapter createCtSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtSynchronized
	 * @generated
	 */
	public Adapter createCtSynchronizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtTargetedExpression
	 * @generated
	 */
	public Adapter createCtTargetedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtThrow <em>Ct Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtThrow
	 * @generated
	 */
	public Adapter createCtThrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtTry <em>Ct Try</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtTry
	 * @generated
	 */
	public Adapter createCtTryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtUnaryOperator
	 * @generated
	 */
	public Adapter createCtUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtVariableAccess
	 * @generated
	 */
	public Adapter createCtVariableAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.code.CtWhile <em>Ct While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.code.CtWhile
	 * @generated
	 */
	public Adapter createCtWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtElement
	 * @generated
	 */
	public Adapter createCtElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtElement <em>Ct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtElement
	 * @generated
	 */
	public Adapter createDeclaration_CtElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtAbstractInvocation <em>Ct Abstract Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtAbstractInvocation
	 * @generated
	 */
	public Adapter createFacade_CtAbstractInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCodeElement <em>Ct Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCodeElement
	 * @generated
	 */
	public Adapter createFacade_CtCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtTypedElement
	 * @generated
	 */
	public Adapter createCtTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtTypedElement <em>Ct Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtTypedElement
	 * @generated
	 */
	public Adapter createDeclaration_CtTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtExpression <em>Ct Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtExpression
	 * @generated
	 */
	public Adapter createFacade_CtExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtTargetedExpression <em>Ct Targeted Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtTargetedExpression
	 * @generated
	 */
	public Adapter createFacade_CtTargetedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtArrayAccess <em>Ct Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtArrayAccess
	 * @generated
	 */
	public Adapter createFacade_CtArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtStatement <em>Ct Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtStatement
	 * @generated
	 */
	public Adapter createFacade_CtStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtAssert <em>Ct Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtAssert
	 * @generated
	 */
	public Adapter createFacade_CtAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtAssignment <em>Ct Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtAssignment
	 * @generated
	 */
	public Adapter createFacade_CtAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtBinaryOperator <em>Ct Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtBinaryOperator
	 * @generated
	 */
	public Adapter createFacade_CtBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtBlock <em>Ct Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtBlock
	 * @generated
	 */
	public Adapter createFacade_CtBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCFlowBreak <em>Ct CFlow Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCFlowBreak
	 * @generated
	 */
	public Adapter createFacade_CtCFlowBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtBreak <em>Ct Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtBreak
	 * @generated
	 */
	public Adapter createFacade_CtBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCase <em>Ct Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCase
	 * @generated
	 */
	public Adapter createFacade_CtCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtCatch <em>Ct Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtCatch
	 * @generated
	 */
	public Adapter createFacade_CtCatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtConditional <em>Ct Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtConditional
	 * @generated
	 */
	public Adapter createFacade_CtConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtContinue <em>Ct Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtContinue
	 * @generated
	 */
	public Adapter createFacade_CtContinueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtLoop <em>Ct Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtLoop
	 * @generated
	 */
	public Adapter createFacade_CtLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtDo <em>Ct Do</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtDo
	 * @generated
	 */
	public Adapter createFacade_CtDoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtVariableAccess <em>Ct Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtVariableAccess
	 * @generated
	 */
	public Adapter createFacade_CtVariableAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtFieldAccess <em>Ct Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtFieldAccess
	 * @generated
	 */
	public Adapter createFacade_CtFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtFor <em>Ct For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtFor
	 * @generated
	 */
	public Adapter createFacade_CtForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtForEach <em>Ct For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtForEach
	 * @generated
	 */
	public Adapter createFacade_CtForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtIf <em>Ct If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtIf
	 * @generated
	 */
	public Adapter createFacade_CtIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtInvocation <em>Ct Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtInvocation
	 * @generated
	 */
	public Adapter createFacade_CtInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtLiteral <em>Ct Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtLiteral
	 * @generated
	 */
	public Adapter createFacade_CtLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtModifiable
	 * @generated
	 */
	public Adapter createCtModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtModifiable <em>Ct Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtModifiable
	 * @generated
	 */
	public Adapter createDeclaration_CtModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtNamedElement
	 * @generated
	 */
	public Adapter createCtNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtNamedElement <em>Ct Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtNamedElement
	 * @generated
	 */
	public Adapter createDeclaration_CtNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.declaration.CtVariable
	 * @generated
	 */
	public Adapter createCtVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.spoon.reflect.declaration.CtVariable <em>Ct Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.spoon.reflect.declaration.CtVariable
	 * @generated
	 */
	public Adapter createDeclaration_CtVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtLocalVariable <em>Ct Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtLocalVariable
	 * @generated
	 */
	public Adapter createFacade_CtLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtNewArray <em>Ct New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtNewArray
	 * @generated
	 */
	public Adapter createFacade_CtNewArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtNewClass <em>Ct New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtNewClass
	 * @generated
	 */
	public Adapter createFacade_CtNewClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtOperatorAssignment <em>Ct Operator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtOperatorAssignment
	 * @generated
	 */
	public Adapter createFacade_CtOperatorAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtReturn <em>Ct Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtReturn
	 * @generated
	 */
	public Adapter createFacade_CtReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtStatementList <em>Ct Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtStatementList
	 * @generated
	 */
	public Adapter createFacade_CtStatementListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtSwitch <em>Ct Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtSwitch
	 * @generated
	 */
	public Adapter createFacade_CtSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtSynchronized <em>Ct Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtSynchronized
	 * @generated
	 */
	public Adapter createFacade_CtSynchronizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtThrow <em>Ct Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtThrow
	 * @generated
	 */
	public Adapter createFacade_CtThrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtTry <em>Ct Try</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtTry
	 * @generated
	 */
	public Adapter createFacade_CtTryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtUnaryOperator <em>Ct Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtUnaryOperator
	 * @generated
	 */
	public Adapter createFacade_CtUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spoon.reflect.code.CtWhile <em>Ct While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spoon.reflect.code.CtWhile
	 * @generated
	 */
	public Adapter createFacade_CtWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CodeAdapterFactory
