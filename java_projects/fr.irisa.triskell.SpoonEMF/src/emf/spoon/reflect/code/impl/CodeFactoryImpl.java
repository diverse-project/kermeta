/**
 * <copyright>
 * </copyright>
 *
 * $Id: CodeFactoryImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import emf.spoon.reflect.code.CodeFactory;
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
import emf.spoon.reflect.code.impl.ext.EmfArrayAccessImpl;
import emf.spoon.reflect.code.impl.ext.EmfAssertImpl;
import emf.spoon.reflect.code.impl.ext.EmfAssignmentImpl;
import emf.spoon.reflect.code.impl.ext.EmfBinaryOperatorImpl;
import emf.spoon.reflect.code.impl.ext.EmfBlockImpl;
import emf.spoon.reflect.code.impl.ext.EmfBreakImpl;
import emf.spoon.reflect.code.impl.ext.EmfCaseImpl;
import emf.spoon.reflect.code.impl.ext.EmfCatchImpl;
import emf.spoon.reflect.code.impl.ext.EmfConditionalImpl;
import emf.spoon.reflect.code.impl.ext.EmfContinueImpl;
import emf.spoon.reflect.code.impl.ext.EmfDoImpl;
import emf.spoon.reflect.code.impl.ext.EmfFieldAccessImpl;
import emf.spoon.reflect.code.impl.ext.EmfForEachImpl;
import emf.spoon.reflect.code.impl.ext.EmfForImpl;
import emf.spoon.reflect.code.impl.ext.EmfIfImpl;
import emf.spoon.reflect.code.impl.ext.EmfInvocationImpl;
import emf.spoon.reflect.code.impl.ext.EmfLiteralImpl;
import emf.spoon.reflect.code.impl.ext.EmfLocalVariableImpl;
import emf.spoon.reflect.code.impl.ext.EmfNewArrayImpl;
import emf.spoon.reflect.code.impl.ext.EmfNewClassImpl;
import emf.spoon.reflect.code.impl.ext.EmfOperatorAssignmentImpl;
import emf.spoon.reflect.code.impl.ext.EmfReturnImpl;
import emf.spoon.reflect.code.impl.ext.EmfStatementListImpl;
import emf.spoon.reflect.code.impl.ext.EmfSwitchImpl;
import emf.spoon.reflect.code.impl.ext.EmfSynchronizedImpl;
import emf.spoon.reflect.code.impl.ext.EmfThrowImpl;
import emf.spoon.reflect.code.impl.ext.EmfTryImpl;
import emf.spoon.reflect.code.impl.ext.EmfUnaryOperatorImpl;
import emf.spoon.reflect.code.impl.ext.EmfVariableAccessImpl;
import emf.spoon.reflect.code.impl.ext.EmfWhileImpl;
import emf.spoon.reflect.declaration.impl.DeclarationFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFactory init() {
		try {
			CodeFactory theCodeFactory = (CodeFactory)EPackage.Registry.INSTANCE.getEFactory("emf.spoon.reflect.code"); 
			if (theCodeFactory != null) {
				return theCodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodePackage.CT_ABSTRACT_INVOCATION: return createCtAbstractInvocation();
			case CodePackage.CT_ARRAY_ACCESS: return createCtArrayAccess();
			case CodePackage.CT_ASSERT: return createCtAssert();
			case CodePackage.CT_ASSIGNMENT: return createCtAssignment();
			case CodePackage.CT_BINARY_OPERATOR: return createCtBinaryOperator();
			case CodePackage.CT_BLOCK: return createCtBlock();
			case CodePackage.CT_BREAK: return createCtBreak();
			case CodePackage.CT_CFLOW_BREAK: return createCtCFlowBreak();
			case CodePackage.CT_CASE: return createCtCase();
			case CodePackage.CT_CATCH: return createCtCatch();
			case CodePackage.CT_CODE_ELEMENT: return createCtCodeElement();
			case CodePackage.CT_CONDITIONAL: return createCtConditional();
			case CodePackage.CT_CONTINUE: return createCtContinue();
			case CodePackage.CT_DO: return createCtDo();
			case CodePackage.CT_EXPRESSION: return createCtExpression();
			case CodePackage.CT_FIELD_ACCESS: return createCtFieldAccess();
			case CodePackage.CT_FOR: return createCtFor();
			case CodePackage.CT_FOR_EACH: return createCtForEach();
			case CodePackage.CT_IF: return createCtIf();
			case CodePackage.CT_INVOCATION: return createCtInvocation();
			case CodePackage.CT_LITERAL: return createCtLiteral();
			case CodePackage.CT_LOCAL_VARIABLE: return createCtLocalVariable();
			case CodePackage.CT_LOOP: return createCtLoop();
			case CodePackage.CT_NEW_ARRAY: return createCtNewArray();
			case CodePackage.CT_NEW_CLASS: return createCtNewClass();
			case CodePackage.CT_OPERATOR_ASSIGNMENT: return createCtOperatorAssignment();
			case CodePackage.CT_RETURN: return createCtReturn();
			case CodePackage.CT_STATEMENT: return createCtStatement();
			case CodePackage.CT_STATEMENT_LIST: return createCtStatementList();
			case CodePackage.CT_SWITCH: return createCtSwitch();
			case CodePackage.CT_SYNCHRONIZED: return createCtSynchronized();
			case CodePackage.CT_TARGETED_EXPRESSION: return createCtTargetedExpression();
			case CodePackage.CT_THROW: return createCtThrow();
			case CodePackage.CT_TRY: return createCtTry();
			case CodePackage.CT_UNARY_OPERATOR: return createCtUnaryOperator();
			case CodePackage.CT_VARIABLE_ACCESS: return createCtVariableAccess();
			case CodePackage.CT_WHILE: return createCtWhile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtAbstractInvocation createCtAbstractInvocation() {
		//CtAbstractInvocationImpl ctAbstractInvocation = new CtAbstractInvocationImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtArrayAccess createCtArrayAccess() {
		CtArrayAccessImpl ctArrayAccess = new EmfArrayAccessImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctArrayAccess);
		
		return ctArrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtAssert createCtAssert() {
		CtAssertImpl ctAssert = new EmfAssertImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctAssert);
		
		return ctAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtAssignment createCtAssignment() {
		CtAssignmentImpl ctAssignment = new EmfAssignmentImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctAssignment);
		
		return ctAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBinaryOperator createCtBinaryOperator() {
		CtBinaryOperatorImpl ctBinaryOperator = new EmfBinaryOperatorImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctBinaryOperator);
		
		return ctBinaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock createCtBlock() {
		CtBlockImpl ctBlock = new EmfBlockImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctBlock);
		return ctBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBreak createCtBreak() {
		CtBreakImpl ctBreak = new EmfBreakImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctBreak);
		return ctBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtCFlowBreak createCtCFlowBreak() {
		//CtCFlowBreakImpl ctCFlowBreak = new CtCFlowBreakImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtCase createCtCase() {
		CtCaseImpl ctCase = new EmfCaseImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctCase);
		return ctCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtCatch createCtCatch() {
		CtCatchImpl ctCatch = new EmfCatchImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctCatch);
		return ctCatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtCodeElement createCtCodeElement() {
		//CtCodeElementImpl ctCodeElement = new CtCodeElementImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtConditional createCtConditional() {
		CtConditionalImpl ctConditional = new EmfConditionalImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctConditional);
			return ctConditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtContinue createCtContinue() {
		CtContinueImpl ctContinue = new EmfContinueImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctContinue);
		return ctContinue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtDo createCtDo() {
		CtDoImpl ctDo = new EmfDoImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctDo);
		return ctDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression createCtExpression() {
		//CtExpressionImpl ctExpression = new CtExpressionImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtFieldAccess createCtFieldAccess() {
		CtFieldAccessImpl ctFieldAccess = new EmfFieldAccessImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctFieldAccess);
		
		return ctFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtFor createCtFor() {
		CtForImpl ctFor = new EmfForImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctFor);
		return ctFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtForEach createCtForEach() {
		CtForEachImpl ctForEach = new EmfForEachImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctForEach);
		return ctForEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtIf createCtIf() {
		CtIfImpl ctIf = new EmfIfImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctIf);
		return ctIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtInvocation createCtInvocation() {
		CtInvocationImpl ctInvocation = new EmfInvocationImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctInvocation);
		return ctInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLiteral createCtLiteral() {
		CtLiteralImpl ctLiteral = new EmfLiteralImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctLiteral);
		return ctLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariable createCtLocalVariable() {
		CtLocalVariableImpl ctLocalVariable = new EmfLocalVariableImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctLocalVariable);
		return ctLocalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLoop createCtLoop() {
		//CtLoopImpl ctLoop = new CtLoopImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtNewArray createCtNewArray() {
		CtNewArrayImpl ctNewArray = new EmfNewArrayImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctNewArray);
		return ctNewArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtNewClass createCtNewClass() {
		CtNewClassImpl ctNewClass = new EmfNewClassImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctNewClass);
		return ctNewClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtOperatorAssignment createCtOperatorAssignment() {
		CtOperatorAssignmentImpl ctOperatorAssignment = new EmfOperatorAssignmentImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctOperatorAssignment);
		return ctOperatorAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtReturn createCtReturn() {
		CtReturnImpl ctReturn = new EmfReturnImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctReturn);
		return ctReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement createCtStatement() {
		//CtStatementImpl ctStatement = new CtStatementImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatementList createCtStatementList() {
		CtStatementListImpl ctStatementList = new EmfStatementListImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctStatementList);
		return ctStatementList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSwitch createCtSwitch() {
		CtSwitchImpl ctSwitch = new EmfSwitchImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctSwitch);
		return ctSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSynchronized createCtSynchronized() {
		CtSynchronizedImpl ctSynchronized = new EmfSynchronizedImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctSynchronized);
		return ctSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTargetedExpression createCtTargetedExpression() {
		//CtTargetedExpressionImpl ctTargetedExpression = new CtTargetedExpressionImpl();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtThrow createCtThrow() {
		CtThrowImpl ctThrow = new EmfThrowImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctThrow);
		return ctThrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTry createCtTry() {
		CtTryImpl ctTry = new EmfTryImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctTry);
		return ctTry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtUnaryOperator createCtUnaryOperator() {
		CtUnaryOperatorImpl ctUnaryOperator = new EmfUnaryOperatorImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctUnaryOperator);
		return ctUnaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtVariableAccess createCtVariableAccess() {
		CtVariableAccessImpl ctVariableAccess = new EmfVariableAccessImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctVariableAccess);
		return ctVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtWhile createCtWhile() {
		CtWhileImpl ctWhile = new EmfWhileImpl();
		DeclarationFactoryImpl.setSpoonFactory(ctWhile);
		return ctWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodePackage getCodePackage() {
		return (CodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CodePackage getPackage() {
		return CodePackage.eINSTANCE;
	}

} //CodeFactoryImpl
