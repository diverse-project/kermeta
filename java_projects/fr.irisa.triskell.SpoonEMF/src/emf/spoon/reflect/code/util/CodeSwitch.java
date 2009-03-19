/**
 * <copyright>
 * </copyright>
 *
 * $Id: CodeSwitch.java,v 1.1 2007/02/14 20:38:06 barais Exp $
 */
package emf.spoon.reflect.code.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.code.CodePackage
 * @generated
 */
public class CodeSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSwitch() {
		if (modelPackage == null) {
			modelPackage = CodePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CodePackage.CT_ABSTRACT_INVOCATION: {
				CtAbstractInvocation ctAbstractInvocation = (CtAbstractInvocation)theEObject;
				Object result = caseCtAbstractInvocation(ctAbstractInvocation);
				if (result == null) result = caseDeclaration_CtElement(ctAbstractInvocation);
				if (result == null) result = caseFacade_CtAbstractInvocation(ctAbstractInvocation);
				if (result == null) result = caseCtElement(ctAbstractInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_ARRAY_ACCESS: {
				CtArrayAccess ctArrayAccess = (CtArrayAccess)theEObject;
				Object result = caseCtArrayAccess(ctArrayAccess);
				if (result == null) result = caseCtTargetedExpression(ctArrayAccess);
				if (result == null) result = caseFacade_CtArrayAccess(ctArrayAccess);
				if (result == null) result = caseCtExpression(ctArrayAccess);
				if (result == null) result = caseFacade_CtTargetedExpression(ctArrayAccess);
				if (result == null) result = caseCtCodeElement(ctArrayAccess);
				if (result == null) result = caseDeclaration_CtTypedElement(ctArrayAccess);
				if (result == null) result = caseFacade_CtExpression(ctArrayAccess);
				if (result == null) result = caseDeclaration_CtElement(ctArrayAccess);
				if (result == null) result = caseFacade_CtCodeElement(ctArrayAccess);
				if (result == null) result = caseCtTypedElement(ctArrayAccess);
				if (result == null) result = caseCtElement(ctArrayAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_ASSERT: {
				CtAssert ctAssert = (CtAssert)theEObject;
				Object result = caseCtAssert(ctAssert);
				if (result == null) result = caseCtStatement(ctAssert);
				if (result == null) result = caseFacade_CtAssert(ctAssert);
				if (result == null) result = caseCtCodeElement(ctAssert);
				if (result == null) result = caseFacade_CtStatement(ctAssert);
				if (result == null) result = caseDeclaration_CtElement(ctAssert);
				if (result == null) result = caseFacade_CtCodeElement(ctAssert);
				if (result == null) result = caseCtElement(ctAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_ASSIGNMENT: {
				CtAssignment ctAssignment = (CtAssignment)theEObject;
				Object result = caseCtAssignment(ctAssignment);
				if (result == null) result = caseCtExpression(ctAssignment);
				if (result == null) result = caseCtStatement(ctAssignment);
				if (result == null) result = caseFacade_CtAssignment(ctAssignment);
				if (result == null) result = caseCtCodeElement(ctAssignment);
				if (result == null) result = caseDeclaration_CtTypedElement(ctAssignment);
				if (result == null) result = caseFacade_CtExpression(ctAssignment);
				if (result == null) result = caseFacade_CtStatement(ctAssignment);
				if (result == null) result = caseDeclaration_CtElement(ctAssignment);
				if (result == null) result = caseFacade_CtCodeElement(ctAssignment);
				if (result == null) result = caseCtTypedElement(ctAssignment);
				if (result == null) result = caseCtElement(ctAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_BINARY_OPERATOR: {
				CtBinaryOperator ctBinaryOperator = (CtBinaryOperator)theEObject;
				Object result = caseCtBinaryOperator(ctBinaryOperator);
				if (result == null) result = caseCtExpression(ctBinaryOperator);
				if (result == null) result = caseFacade_CtBinaryOperator(ctBinaryOperator);
				if (result == null) result = caseCtCodeElement(ctBinaryOperator);
				if (result == null) result = caseDeclaration_CtTypedElement(ctBinaryOperator);
				if (result == null) result = caseFacade_CtExpression(ctBinaryOperator);
				if (result == null) result = caseDeclaration_CtElement(ctBinaryOperator);
				if (result == null) result = caseFacade_CtCodeElement(ctBinaryOperator);
				if (result == null) result = caseCtTypedElement(ctBinaryOperator);
				if (result == null) result = caseCtElement(ctBinaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_BLOCK: {
				CtBlock ctBlock = (CtBlock)theEObject;
				Object result = caseCtBlock(ctBlock);
				if (result == null) result = caseCtStatement(ctBlock);
				if (result == null) result = caseFacade_CtBlock(ctBlock);
				if (result == null) result = caseCtCodeElement(ctBlock);
				if (result == null) result = caseFacade_CtStatement(ctBlock);
				if (result == null) result = caseDeclaration_CtElement(ctBlock);
				if (result == null) result = caseFacade_CtCodeElement(ctBlock);
				if (result == null) result = caseCtElement(ctBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_BREAK: {
				CtBreak ctBreak = (CtBreak)theEObject;
				Object result = caseCtBreak(ctBreak);
				if (result == null) result = caseCtCFlowBreak(ctBreak);
				if (result == null) result = caseFacade_CtBreak(ctBreak);
				if (result == null) result = caseCtStatement(ctBreak);
				if (result == null) result = caseFacade_CtCFlowBreak(ctBreak);
				if (result == null) result = caseCtCodeElement(ctBreak);
				if (result == null) result = caseFacade_CtStatement(ctBreak);
				if (result == null) result = caseDeclaration_CtElement(ctBreak);
				if (result == null) result = caseFacade_CtCodeElement(ctBreak);
				if (result == null) result = caseCtElement(ctBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_CFLOW_BREAK: {
				CtCFlowBreak ctCFlowBreak = (CtCFlowBreak)theEObject;
				Object result = caseCtCFlowBreak(ctCFlowBreak);
				if (result == null) result = caseCtStatement(ctCFlowBreak);
				if (result == null) result = caseFacade_CtCFlowBreak(ctCFlowBreak);
				if (result == null) result = caseCtCodeElement(ctCFlowBreak);
				if (result == null) result = caseFacade_CtStatement(ctCFlowBreak);
				if (result == null) result = caseDeclaration_CtElement(ctCFlowBreak);
				if (result == null) result = caseFacade_CtCodeElement(ctCFlowBreak);
				if (result == null) result = caseCtElement(ctCFlowBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_CASE: {
				CtCase ctCase = (CtCase)theEObject;
				Object result = caseCtCase(ctCase);
				if (result == null) result = caseCtStatement(ctCase);
				if (result == null) result = caseFacade_CtCase(ctCase);
				if (result == null) result = caseCtCodeElement(ctCase);
				if (result == null) result = caseFacade_CtStatement(ctCase);
				if (result == null) result = caseDeclaration_CtElement(ctCase);
				if (result == null) result = caseFacade_CtCodeElement(ctCase);
				if (result == null) result = caseCtElement(ctCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_CATCH: {
				CtCatch ctCatch = (CtCatch)theEObject;
				Object result = caseCtCatch(ctCatch);
				if (result == null) result = caseCtCodeElement(ctCatch);
				if (result == null) result = caseFacade_CtCatch(ctCatch);
				if (result == null) result = caseDeclaration_CtElement(ctCatch);
				if (result == null) result = caseFacade_CtCodeElement(ctCatch);
				if (result == null) result = caseCtElement(ctCatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_CODE_ELEMENT: {
				CtCodeElement ctCodeElement = (CtCodeElement)theEObject;
				Object result = caseCtCodeElement(ctCodeElement);
				if (result == null) result = caseDeclaration_CtElement(ctCodeElement);
				if (result == null) result = caseFacade_CtCodeElement(ctCodeElement);
				if (result == null) result = caseCtElement(ctCodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_CONDITIONAL: {
				CtConditional ctConditional = (CtConditional)theEObject;
				Object result = caseCtConditional(ctConditional);
				if (result == null) result = caseCtExpression(ctConditional);
				if (result == null) result = caseFacade_CtConditional(ctConditional);
				if (result == null) result = caseCtCodeElement(ctConditional);
				if (result == null) result = caseDeclaration_CtTypedElement(ctConditional);
				if (result == null) result = caseFacade_CtExpression(ctConditional);
				if (result == null) result = caseDeclaration_CtElement(ctConditional);
				if (result == null) result = caseFacade_CtCodeElement(ctConditional);
				if (result == null) result = caseCtTypedElement(ctConditional);
				if (result == null) result = caseCtElement(ctConditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_CONTINUE: {
				CtContinue ctContinue = (CtContinue)theEObject;
				Object result = caseCtContinue(ctContinue);
				if (result == null) result = caseCtCFlowBreak(ctContinue);
				if (result == null) result = caseFacade_CtContinue(ctContinue);
				if (result == null) result = caseCtStatement(ctContinue);
				if (result == null) result = caseFacade_CtCFlowBreak(ctContinue);
				if (result == null) result = caseCtCodeElement(ctContinue);
				if (result == null) result = caseFacade_CtStatement(ctContinue);
				if (result == null) result = caseDeclaration_CtElement(ctContinue);
				if (result == null) result = caseFacade_CtCodeElement(ctContinue);
				if (result == null) result = caseCtElement(ctContinue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_DO: {
				CtDo ctDo = (CtDo)theEObject;
				Object result = caseCtDo(ctDo);
				if (result == null) result = caseCtLoop(ctDo);
				if (result == null) result = caseFacade_CtDo(ctDo);
				if (result == null) result = caseCtStatement(ctDo);
				if (result == null) result = caseFacade_CtLoop(ctDo);
				if (result == null) result = caseCtCodeElement(ctDo);
				if (result == null) result = caseFacade_CtStatement(ctDo);
				if (result == null) result = caseDeclaration_CtElement(ctDo);
				if (result == null) result = caseFacade_CtCodeElement(ctDo);
				if (result == null) result = caseCtElement(ctDo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_EXPRESSION: {
				CtExpression ctExpression = (CtExpression)theEObject;
				Object result = caseCtExpression(ctExpression);
				if (result == null) result = caseCtCodeElement(ctExpression);
				if (result == null) result = caseDeclaration_CtTypedElement(ctExpression);
				if (result == null) result = caseFacade_CtExpression(ctExpression);
				if (result == null) result = caseDeclaration_CtElement(ctExpression);
				if (result == null) result = caseFacade_CtCodeElement(ctExpression);
				if (result == null) result = caseCtTypedElement(ctExpression);
				if (result == null) result = caseCtElement(ctExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_FIELD_ACCESS: {
				CtFieldAccess ctFieldAccess = (CtFieldAccess)theEObject;
				Object result = caseCtFieldAccess(ctFieldAccess);
				if (result == null) result = caseCtTargetedExpression(ctFieldAccess);
				if (result == null) result = caseCtVariableAccess(ctFieldAccess);
				if (result == null) result = caseFacade_CtFieldAccess(ctFieldAccess);
				if (result == null) result = caseCtExpression(ctFieldAccess);
				if (result == null) result = caseFacade_CtTargetedExpression(ctFieldAccess);
				if (result == null) result = caseFacade_CtVariableAccess(ctFieldAccess);
				if (result == null) result = caseCtCodeElement(ctFieldAccess);
				if (result == null) result = caseDeclaration_CtTypedElement(ctFieldAccess);
				if (result == null) result = caseFacade_CtExpression(ctFieldAccess);
				if (result == null) result = caseDeclaration_CtElement(ctFieldAccess);
				if (result == null) result = caseFacade_CtCodeElement(ctFieldAccess);
				if (result == null) result = caseCtTypedElement(ctFieldAccess);
				if (result == null) result = caseCtElement(ctFieldAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_FOR: {
				CtFor ctFor = (CtFor)theEObject;
				Object result = caseCtFor(ctFor);
				if (result == null) result = caseCtLoop(ctFor);
				if (result == null) result = caseFacade_CtFor(ctFor);
				if (result == null) result = caseCtStatement(ctFor);
				if (result == null) result = caseFacade_CtLoop(ctFor);
				if (result == null) result = caseCtCodeElement(ctFor);
				if (result == null) result = caseFacade_CtStatement(ctFor);
				if (result == null) result = caseDeclaration_CtElement(ctFor);
				if (result == null) result = caseFacade_CtCodeElement(ctFor);
				if (result == null) result = caseCtElement(ctFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_FOR_EACH: {
				CtForEach ctForEach = (CtForEach)theEObject;
				Object result = caseCtForEach(ctForEach);
				if (result == null) result = caseCtLoop(ctForEach);
				if (result == null) result = caseFacade_CtForEach(ctForEach);
				if (result == null) result = caseCtStatement(ctForEach);
				if (result == null) result = caseFacade_CtLoop(ctForEach);
				if (result == null) result = caseCtCodeElement(ctForEach);
				if (result == null) result = caseFacade_CtStatement(ctForEach);
				if (result == null) result = caseDeclaration_CtElement(ctForEach);
				if (result == null) result = caseFacade_CtCodeElement(ctForEach);
				if (result == null) result = caseCtElement(ctForEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_IF: {
				CtIf ctIf = (CtIf)theEObject;
				Object result = caseCtIf(ctIf);
				if (result == null) result = caseCtStatement(ctIf);
				if (result == null) result = caseFacade_CtIf(ctIf);
				if (result == null) result = caseCtCodeElement(ctIf);
				if (result == null) result = caseFacade_CtStatement(ctIf);
				if (result == null) result = caseDeclaration_CtElement(ctIf);
				if (result == null) result = caseFacade_CtCodeElement(ctIf);
				if (result == null) result = caseCtElement(ctIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_INVOCATION: {
				CtInvocation ctInvocation = (CtInvocation)theEObject;
				Object result = caseCtInvocation(ctInvocation);
				if (result == null) result = caseCtAbstractInvocation(ctInvocation);
				if (result == null) result = caseCtStatement(ctInvocation);
				if (result == null) result = caseCtTargetedExpression(ctInvocation);
				if (result == null) result = caseFacade_CtInvocation(ctInvocation);
				if (result == null) result = caseDeclaration_CtElement(ctInvocation);
				if (result == null) result = caseFacade_CtAbstractInvocation(ctInvocation);
				if (result == null) result = caseCtCodeElement(ctInvocation);
				if (result == null) result = caseFacade_CtStatement(ctInvocation);
				if (result == null) result = caseCtExpression(ctInvocation);
				if (result == null) result = caseFacade_CtTargetedExpression(ctInvocation);
				if (result == null) result = caseCtElement(ctInvocation);
				if (result == null) result = caseFacade_CtCodeElement(ctInvocation);
				if (result == null) result = caseDeclaration_CtTypedElement(ctInvocation);
				if (result == null) result = caseFacade_CtExpression(ctInvocation);
				if (result == null) result = caseCtTypedElement(ctInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_LITERAL: {
				CtLiteral ctLiteral = (CtLiteral)theEObject;
				Object result = caseCtLiteral(ctLiteral);
				if (result == null) result = caseCtExpression(ctLiteral);
				if (result == null) result = caseFacade_CtLiteral(ctLiteral);
				if (result == null) result = caseCtCodeElement(ctLiteral);
				if (result == null) result = caseDeclaration_CtTypedElement(ctLiteral);
				if (result == null) result = caseFacade_CtExpression(ctLiteral);
				if (result == null) result = caseDeclaration_CtElement(ctLiteral);
				if (result == null) result = caseFacade_CtCodeElement(ctLiteral);
				if (result == null) result = caseCtTypedElement(ctLiteral);
				if (result == null) result = caseCtElement(ctLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_LOCAL_VARIABLE: {
				CtLocalVariable ctLocalVariable = (CtLocalVariable)theEObject;
				Object result = caseCtLocalVariable(ctLocalVariable);
				if (result == null) result = caseCtStatement(ctLocalVariable);
				if (result == null) result = caseDeclaration_CtVariable(ctLocalVariable);
				if (result == null) result = caseFacade_CtLocalVariable(ctLocalVariable);
				if (result == null) result = caseCtCodeElement(ctLocalVariable);
				if (result == null) result = caseFacade_CtStatement(ctLocalVariable);
				if (result == null) result = caseDeclaration_CtNamedElement(ctLocalVariable);
				if (result == null) result = caseDeclaration_CtTypedElement(ctLocalVariable);
				if (result == null) result = caseCtVariable(ctLocalVariable);
				if (result == null) result = caseDeclaration_CtElement(ctLocalVariable);
				if (result == null) result = caseFacade_CtCodeElement(ctLocalVariable);
				if (result == null) result = caseDeclaration_CtModifiable(ctLocalVariable);
				if (result == null) result = caseCtNamedElement(ctLocalVariable);
				if (result == null) result = caseCtTypedElement(ctLocalVariable);
				if (result == null) result = caseCtElement(ctLocalVariable);
				if (result == null) result = caseCtModifiable(ctLocalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_LOOP: {
				CtLoop ctLoop = (CtLoop)theEObject;
				Object result = caseCtLoop(ctLoop);
				if (result == null) result = caseCtStatement(ctLoop);
				if (result == null) result = caseFacade_CtLoop(ctLoop);
				if (result == null) result = caseCtCodeElement(ctLoop);
				if (result == null) result = caseFacade_CtStatement(ctLoop);
				if (result == null) result = caseDeclaration_CtElement(ctLoop);
				if (result == null) result = caseFacade_CtCodeElement(ctLoop);
				if (result == null) result = caseCtElement(ctLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_NEW_ARRAY: {
				CtNewArray ctNewArray = (CtNewArray)theEObject;
				Object result = caseCtNewArray(ctNewArray);
				if (result == null) result = caseCtExpression(ctNewArray);
				if (result == null) result = caseFacade_CtNewArray(ctNewArray);
				if (result == null) result = caseCtCodeElement(ctNewArray);
				if (result == null) result = caseDeclaration_CtTypedElement(ctNewArray);
				if (result == null) result = caseFacade_CtExpression(ctNewArray);
				if (result == null) result = caseDeclaration_CtElement(ctNewArray);
				if (result == null) result = caseFacade_CtCodeElement(ctNewArray);
				if (result == null) result = caseCtTypedElement(ctNewArray);
				if (result == null) result = caseCtElement(ctNewArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_NEW_CLASS: {
				CtNewClass ctNewClass = (CtNewClass)theEObject;
				Object result = caseCtNewClass(ctNewClass);
				if (result == null) result = caseCtAbstractInvocation(ctNewClass);
				if (result == null) result = caseCtExpression(ctNewClass);
				if (result == null) result = caseCtStatement(ctNewClass);
				if (result == null) result = caseFacade_CtNewClass(ctNewClass);
				if (result == null) result = caseDeclaration_CtElement(ctNewClass);
				if (result == null) result = caseFacade_CtAbstractInvocation(ctNewClass);
				if (result == null) result = caseCtCodeElement(ctNewClass);
				if (result == null) result = caseDeclaration_CtTypedElement(ctNewClass);
				if (result == null) result = caseFacade_CtExpression(ctNewClass);
				if (result == null) result = caseFacade_CtStatement(ctNewClass);
				if (result == null) result = caseCtElement(ctNewClass);
				if (result == null) result = caseFacade_CtCodeElement(ctNewClass);
				if (result == null) result = caseCtTypedElement(ctNewClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_OPERATOR_ASSIGNMENT: {
				CtOperatorAssignment ctOperatorAssignment = (CtOperatorAssignment)theEObject;
				Object result = caseCtOperatorAssignment(ctOperatorAssignment);
				if (result == null) result = caseCtAssignment(ctOperatorAssignment);
				if (result == null) result = caseFacade_CtOperatorAssignment(ctOperatorAssignment);
				if (result == null) result = caseCtExpression(ctOperatorAssignment);
				if (result == null) result = caseCtStatement(ctOperatorAssignment);
				if (result == null) result = caseFacade_CtAssignment(ctOperatorAssignment);
				if (result == null) result = caseCtCodeElement(ctOperatorAssignment);
				if (result == null) result = caseDeclaration_CtTypedElement(ctOperatorAssignment);
				if (result == null) result = caseFacade_CtExpression(ctOperatorAssignment);
				if (result == null) result = caseFacade_CtStatement(ctOperatorAssignment);
				if (result == null) result = caseDeclaration_CtElement(ctOperatorAssignment);
				if (result == null) result = caseFacade_CtCodeElement(ctOperatorAssignment);
				if (result == null) result = caseCtTypedElement(ctOperatorAssignment);
				if (result == null) result = caseCtElement(ctOperatorAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_RETURN: {
				CtReturn ctReturn = (CtReturn)theEObject;
				Object result = caseCtReturn(ctReturn);
				if (result == null) result = caseCtCFlowBreak(ctReturn);
				if (result == null) result = caseFacade_CtReturn(ctReturn);
				if (result == null) result = caseCtStatement(ctReturn);
				if (result == null) result = caseFacade_CtCFlowBreak(ctReturn);
				if (result == null) result = caseCtCodeElement(ctReturn);
				if (result == null) result = caseFacade_CtStatement(ctReturn);
				if (result == null) result = caseDeclaration_CtElement(ctReturn);
				if (result == null) result = caseFacade_CtCodeElement(ctReturn);
				if (result == null) result = caseCtElement(ctReturn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_STATEMENT: {
				CtStatement ctStatement = (CtStatement)theEObject;
				Object result = caseCtStatement(ctStatement);
				if (result == null) result = caseCtCodeElement(ctStatement);
				if (result == null) result = caseFacade_CtStatement(ctStatement);
				if (result == null) result = caseDeclaration_CtElement(ctStatement);
				if (result == null) result = caseFacade_CtCodeElement(ctStatement);
				if (result == null) result = caseCtElement(ctStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_STATEMENT_LIST: {
				CtStatementList ctStatementList = (CtStatementList)theEObject;
				Object result = caseCtStatementList(ctStatementList);
				if (result == null) result = caseCtCodeElement(ctStatementList);
				if (result == null) result = caseFacade_CtStatementList(ctStatementList);
				if (result == null) result = caseDeclaration_CtElement(ctStatementList);
				if (result == null) result = caseFacade_CtCodeElement(ctStatementList);
				if (result == null) result = caseCtElement(ctStatementList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_SWITCH: {
				CtSwitch ctSwitch = (CtSwitch)theEObject;
				Object result = caseCtSwitch(ctSwitch);
				if (result == null) result = caseCtStatement(ctSwitch);
				if (result == null) result = caseFacade_CtSwitch(ctSwitch);
				if (result == null) result = caseCtCodeElement(ctSwitch);
				if (result == null) result = caseFacade_CtStatement(ctSwitch);
				if (result == null) result = caseDeclaration_CtElement(ctSwitch);
				if (result == null) result = caseFacade_CtCodeElement(ctSwitch);
				if (result == null) result = caseCtElement(ctSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_SYNCHRONIZED: {
				CtSynchronized ctSynchronized = (CtSynchronized)theEObject;
				Object result = caseCtSynchronized(ctSynchronized);
				if (result == null) result = caseCtStatement(ctSynchronized);
				if (result == null) result = caseFacade_CtSynchronized(ctSynchronized);
				if (result == null) result = caseCtCodeElement(ctSynchronized);
				if (result == null) result = caseFacade_CtStatement(ctSynchronized);
				if (result == null) result = caseDeclaration_CtElement(ctSynchronized);
				if (result == null) result = caseFacade_CtCodeElement(ctSynchronized);
				if (result == null) result = caseCtElement(ctSynchronized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_TARGETED_EXPRESSION: {
				CtTargetedExpression ctTargetedExpression = (CtTargetedExpression)theEObject;
				Object result = caseCtTargetedExpression(ctTargetedExpression);
				if (result == null) result = caseCtExpression(ctTargetedExpression);
				if (result == null) result = caseFacade_CtTargetedExpression(ctTargetedExpression);
				if (result == null) result = caseCtCodeElement(ctTargetedExpression);
				if (result == null) result = caseDeclaration_CtTypedElement(ctTargetedExpression);
				if (result == null) result = caseFacade_CtExpression(ctTargetedExpression);
				if (result == null) result = caseDeclaration_CtElement(ctTargetedExpression);
				if (result == null) result = caseFacade_CtCodeElement(ctTargetedExpression);
				if (result == null) result = caseCtTypedElement(ctTargetedExpression);
				if (result == null) result = caseCtElement(ctTargetedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_THROW: {
				CtThrow ctThrow = (CtThrow)theEObject;
				Object result = caseCtThrow(ctThrow);
				if (result == null) result = caseCtCFlowBreak(ctThrow);
				if (result == null) result = caseFacade_CtThrow(ctThrow);
				if (result == null) result = caseCtStatement(ctThrow);
				if (result == null) result = caseFacade_CtCFlowBreak(ctThrow);
				if (result == null) result = caseCtCodeElement(ctThrow);
				if (result == null) result = caseFacade_CtStatement(ctThrow);
				if (result == null) result = caseDeclaration_CtElement(ctThrow);
				if (result == null) result = caseFacade_CtCodeElement(ctThrow);
				if (result == null) result = caseCtElement(ctThrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_TRY: {
				CtTry ctTry = (CtTry)theEObject;
				Object result = caseCtTry(ctTry);
				if (result == null) result = caseCtStatement(ctTry);
				if (result == null) result = caseFacade_CtTry(ctTry);
				if (result == null) result = caseCtCodeElement(ctTry);
				if (result == null) result = caseFacade_CtStatement(ctTry);
				if (result == null) result = caseDeclaration_CtElement(ctTry);
				if (result == null) result = caseFacade_CtCodeElement(ctTry);
				if (result == null) result = caseCtElement(ctTry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_UNARY_OPERATOR: {
				CtUnaryOperator ctUnaryOperator = (CtUnaryOperator)theEObject;
				Object result = caseCtUnaryOperator(ctUnaryOperator);
				if (result == null) result = caseCtExpression(ctUnaryOperator);
				if (result == null) result = caseCtStatement(ctUnaryOperator);
				if (result == null) result = caseFacade_CtUnaryOperator(ctUnaryOperator);
				if (result == null) result = caseCtCodeElement(ctUnaryOperator);
				if (result == null) result = caseDeclaration_CtTypedElement(ctUnaryOperator);
				if (result == null) result = caseFacade_CtExpression(ctUnaryOperator);
				if (result == null) result = caseFacade_CtStatement(ctUnaryOperator);
				if (result == null) result = caseDeclaration_CtElement(ctUnaryOperator);
				if (result == null) result = caseFacade_CtCodeElement(ctUnaryOperator);
				if (result == null) result = caseCtTypedElement(ctUnaryOperator);
				if (result == null) result = caseCtElement(ctUnaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_VARIABLE_ACCESS: {
				CtVariableAccess ctVariableAccess = (CtVariableAccess)theEObject;
				Object result = caseCtVariableAccess(ctVariableAccess);
				if (result == null) result = caseCtExpression(ctVariableAccess);
				if (result == null) result = caseFacade_CtVariableAccess(ctVariableAccess);
				if (result == null) result = caseCtCodeElement(ctVariableAccess);
				if (result == null) result = caseDeclaration_CtTypedElement(ctVariableAccess);
				if (result == null) result = caseFacade_CtExpression(ctVariableAccess);
				if (result == null) result = caseDeclaration_CtElement(ctVariableAccess);
				if (result == null) result = caseFacade_CtCodeElement(ctVariableAccess);
				if (result == null) result = caseCtTypedElement(ctVariableAccess);
				if (result == null) result = caseCtElement(ctVariableAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CT_WHILE: {
				CtWhile ctWhile = (CtWhile)theEObject;
				Object result = caseCtWhile(ctWhile);
				if (result == null) result = caseCtLoop(ctWhile);
				if (result == null) result = caseFacade_CtWhile(ctWhile);
				if (result == null) result = caseCtStatement(ctWhile);
				if (result == null) result = caseFacade_CtLoop(ctWhile);
				if (result == null) result = caseCtCodeElement(ctWhile);
				if (result == null) result = caseFacade_CtStatement(ctWhile);
				if (result == null) result = caseDeclaration_CtElement(ctWhile);
				if (result == null) result = caseFacade_CtCodeElement(ctWhile);
				if (result == null) result = caseCtElement(ctWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Abstract Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Abstract Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtAbstractInvocation(CtAbstractInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Array Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtArrayAccess(CtArrayAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtAssert(CtAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtAssignment(CtAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtBinaryOperator(CtBinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtBlock(CtBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtBreak(CtBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct CFlow Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct CFlow Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtCFlowBreak(CtCFlowBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtCase(CtCase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtCatch(CtCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtCodeElement(CtCodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtConditional(CtConditional object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Continue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtContinue(CtContinue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Do</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Do</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtDo(CtDo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtExpression(CtExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Field Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtFieldAccess(CtFieldAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtFor(CtFor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtForEach(CtForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtIf(CtIf object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtInvocation(CtInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtLiteral(CtLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtLocalVariable(CtLocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtLoop(CtLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct New Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct New Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtNewArray(CtNewArray object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct New Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct New Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtNewClass(CtNewClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Operator Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Operator Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtOperatorAssignment(CtOperatorAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtReturn(CtReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtStatement(CtStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Statement List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Statement List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtStatementList(CtStatementList object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtSwitch(CtSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Synchronized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtSynchronized(CtSynchronized object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Targeted Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Targeted Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTargetedExpression(CtTargetedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtThrow(CtThrow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Try</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Try</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTry(CtTry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtUnaryOperator(CtUnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtVariableAccess(CtVariableAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtWhile(CtWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtElement(CtElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeclaration_CtElement(emf.spoon.reflect.declaration.CtElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Abstract Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Abstract Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtAbstractInvocation(spoon.reflect.code.CtAbstractInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtCodeElement(spoon.reflect.code.CtCodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtTypedElement(CtTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeclaration_CtTypedElement(emf.spoon.reflect.declaration.CtTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtExpression(spoon.reflect.code.CtExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Targeted Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Targeted Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtTargetedExpression(spoon.reflect.code.CtTargetedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Array Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtArrayAccess(spoon.reflect.code.CtArrayAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtStatement(spoon.reflect.code.CtStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtAssert(spoon.reflect.code.CtAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtAssignment(spoon.reflect.code.CtAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtBinaryOperator(spoon.reflect.code.CtBinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtBlock(spoon.reflect.code.CtBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct CFlow Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct CFlow Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtCFlowBreak(spoon.reflect.code.CtCFlowBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtBreak(spoon.reflect.code.CtBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtCase(spoon.reflect.code.CtCase object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtCatch(spoon.reflect.code.CtCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtConditional(spoon.reflect.code.CtConditional object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Continue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtContinue(spoon.reflect.code.CtContinue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtLoop(spoon.reflect.code.CtLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Do</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Do</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtDo(spoon.reflect.code.CtDo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtVariableAccess(spoon.reflect.code.CtVariableAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Field Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtFieldAccess(spoon.reflect.code.CtFieldAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtFor(spoon.reflect.code.CtFor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtForEach(spoon.reflect.code.CtForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtIf(spoon.reflect.code.CtIf object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtInvocation(spoon.reflect.code.CtInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtLiteral(spoon.reflect.code.CtLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtModifiable(CtModifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeclaration_CtModifiable(emf.spoon.reflect.declaration.CtModifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtNamedElement(CtNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeclaration_CtNamedElement(emf.spoon.reflect.declaration.CtNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCtVariable(CtVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeclaration_CtVariable(emf.spoon.reflect.declaration.CtVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtLocalVariable(spoon.reflect.code.CtLocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct New Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct New Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtNewArray(spoon.reflect.code.CtNewArray object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct New Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct New Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtNewClass(spoon.reflect.code.CtNewClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Operator Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Operator Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtOperatorAssignment(spoon.reflect.code.CtOperatorAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtReturn(spoon.reflect.code.CtReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Statement List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Statement List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtStatementList(spoon.reflect.code.CtStatementList object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtSwitch(spoon.reflect.code.CtSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Synchronized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtSynchronized(spoon.reflect.code.CtSynchronized object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtThrow(spoon.reflect.code.CtThrow object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Try</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Try</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtTry(spoon.reflect.code.CtTry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtUnaryOperator(spoon.reflect.code.CtUnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ct While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ct While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFacade_CtWhile(spoon.reflect.code.CtWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //CodeSwitch
