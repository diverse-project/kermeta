/**
 * <copyright>
 * </copyright>
 *
 * $Id: KtrSwitch.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.util;

import fr.irisa.triskell.ktr.*;

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
 * @see fr.irisa.triskell.ktr.KtrPackage
 * @generated
 */
public class KtrSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KtrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KtrSwitch() {
		if (modelPackage == null) {
			modelPackage = KtrPackage.eINSTANCE;
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
			case KtrPackage.INTERPRETATION_PATTERN_MODEL: {
				InterpretationPatternModel interpretationPatternModel = (InterpretationPatternModel)theEObject;
				Object result = caseInterpretationPatternModel(interpretationPatternModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KtrPackage.INTERPRETATION_RULE: {
				InterpretationRule interpretationRule = (InterpretationRule)theEObject;
				Object result = caseInterpretationRule(interpretationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KtrPackage.RULE_VARIABLE: {
				RuleVariable ruleVariable = (RuleVariable)theEObject;
				Object result = caseRuleVariable(ruleVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KtrPackage.RULE_PATTERN: {
				RulePattern rulePattern = (RulePattern)theEObject;
				Object result = caseRulePattern(rulePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KtrPackage.RULE_PRODUCTION: {
				RuleProduction ruleProduction = (RuleProduction)theEObject;
				Object result = caseRuleProduction(ruleProduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KtrPackage.SINGLETON_RULE_PRODUCTION: {
				SingletonRuleProduction singletonRuleProduction = (SingletonRuleProduction)theEObject;
				Object result = caseSingletonRuleProduction(singletonRuleProduction);
				if (result == null) result = caseRuleProduction(singletonRuleProduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interpretation Pattern Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interpretation Pattern Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterpretationPatternModel(InterpretationPatternModel object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interpretation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interpretation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterpretationRule(InterpretationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rule Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rule Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRuleVariable(RuleVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rule Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRulePattern(RulePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rule Production</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rule Production</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRuleProduction(RuleProduction object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Singleton Rule Production</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Singleton Rule Production</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingletonRuleProduction(SingletonRuleProduction object) {
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

} //KtrSwitch
