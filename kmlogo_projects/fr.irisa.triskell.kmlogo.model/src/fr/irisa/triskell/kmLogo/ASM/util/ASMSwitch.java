/**
 * <copyright>
 * </copyright>
 *
 * $Id: ASMSwitch.java,v 1.1 2007-05-30 13:23:35 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM.util;

import fr.irisa.triskell.kmLogo.ASM.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage
 * @generated
 */
public class ASMSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASMSwitch() {
		if (modelPackage == null) {
			modelPackage = ASMPackage.eINSTANCE;
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
			case ASMPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				Object result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PRIMITIVE: {
				Primitive primitive = (Primitive)theEObject;
				Object result = casePrimitive(primitive);
				if (result == null) result = caseInstruction(primitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.BACK: {
				Back back = (Back)theEObject;
				Object result = caseBack(back);
				if (result == null) result = casePrimitive(back);
				if (result == null) result = caseInstruction(back);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.FORWARD: {
				Forward forward = (Forward)theEObject;
				Object result = caseForward(forward);
				if (result == null) result = casePrimitive(forward);
				if (result == null) result = caseInstruction(forward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.LEFT: {
				Left left = (Left)theEObject;
				Object result = caseLeft(left);
				if (result == null) result = casePrimitive(left);
				if (result == null) result = caseInstruction(left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.RIGHT: {
				Right right = (Right)theEObject;
				Object result = caseRight(right);
				if (result == null) result = casePrimitive(right);
				if (result == null) result = caseInstruction(right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PEN_DOWN: {
				PenDown penDown = (PenDown)theEObject;
				Object result = casePenDown(penDown);
				if (result == null) result = casePrimitive(penDown);
				if (result == null) result = caseInstruction(penDown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PEN_UP: {
				PenUp penUp = (PenUp)theEObject;
				Object result = casePenUp(penUp);
				if (result == null) result = casePrimitive(penUp);
				if (result == null) result = caseInstruction(penUp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.CLEAR: {
				Clear clear = (Clear)theEObject;
				Object result = caseClear(clear);
				if (result == null) result = casePrimitive(clear);
				if (result == null) result = caseInstruction(clear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = caseInstruction(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.BINARY_EXP: {
				BinaryExp binaryExp = (BinaryExp)theEObject;
				Object result = caseBinaryExp(binaryExp);
				if (result == null) result = caseExpression(binaryExp);
				if (result == null) result = caseInstruction(binaryExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				Object result = caseConstant(constant);
				if (result == null) result = caseExpression(constant);
				if (result == null) result = caseInstruction(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PROC_CALL: {
				ProcCall procCall = (ProcCall)theEObject;
				Object result = caseProcCall(procCall);
				if (result == null) result = caseInstruction(procCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PROC_DECLARATION: {
				ProcDeclaration procDeclaration = (ProcDeclaration)theEObject;
				Object result = caseProcDeclaration(procDeclaration);
				if (result == null) result = caseInstruction(procDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.BLOCK: {
				Block block = (Block)theEObject;
				Object result = caseBlock(block);
				if (result == null) result = caseInstruction(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.IF: {
				If if_ = (If)theEObject;
				Object result = caseIf(if_);
				if (result == null) result = caseControlStructure(if_);
				if (result == null) result = caseInstruction(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.CONTROL_STRUCTURE: {
				ControlStructure controlStructure = (ControlStructure)theEObject;
				Object result = caseControlStructure(controlStructure);
				if (result == null) result = caseInstruction(controlStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.REPEAT: {
				Repeat repeat = (Repeat)theEObject;
				Object result = caseRepeat(repeat);
				if (result == null) result = caseControlStructure(repeat);
				if (result == null) result = caseInstruction(repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.WHILE: {
				While while_ = (While)theEObject;
				Object result = caseWhile(while_);
				if (result == null) result = caseControlStructure(while_);
				if (result == null) result = caseInstruction(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				Object result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASMPackage.PARAMETER_CALL: {
				ParameterCall parameterCall = (ParameterCall)theEObject;
				Object result = caseParameterCall(parameterCall);
				if (result == null) result = caseExpression(parameterCall);
				if (result == null) result = caseInstruction(parameterCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBack(Back object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Pen Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Pen Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePenDown(PenDown object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Pen Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Pen Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePenUp(PenUp object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Clear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Clear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClear(Clear object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Binary Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Binary Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBinaryExp(BinaryExp object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Proc Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Proc Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcCall(ProcCall object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Proc Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Proc Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcDeclaration(ProcDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Control Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Control Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlStructure(ControlStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterCall(ParameterCall object) {
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

} //ASMSwitch
