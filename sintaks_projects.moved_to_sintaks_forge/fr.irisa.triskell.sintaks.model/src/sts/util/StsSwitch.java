/**
 * <copyright>
 * </copyright>
 *
 * $Id: StsSwitch.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import sts.*;

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
 * @see sts.StsPackage
 * @generated
 */
public class StsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StsSwitch() {
		if (modelPackage == null) {
			modelPackage = StsPackage.eINSTANCE;
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
			case StsPackage.RULE: {
				Rule rule = (Rule)theEObject;
				Object result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.ITERATION: {
				Iteration iteration = (Iteration)theEObject;
				Object result = caseIteration(iteration);
				if (result == null) result = caseRule(iteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				Object result = caseAlternative(alternative);
				if (result == null) result = caseRule(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				Object result = caseSequence(sequence);
				if (result == null) result = caseRule(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				Object result = caseTerminal(terminal);
				if (result == null) result = caseRule(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.VALUE: {
				Value value = (Value)theEObject;
				Object result = caseValue(value);
				if (result == null) result = caseRule(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.PRIMITIVE_VALUE: {
				PrimitiveValue primitiveValue = (PrimitiveValue)theEObject;
				Object result = casePrimitiveValue(primitiveValue);
				if (result == null) result = caseValue(primitiveValue);
				if (result == null) result = caseRule(primitiveValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.OBJECT_REFERENCE: {
				ObjectReference objectReference = (ObjectReference)theEObject;
				Object result = caseObjectReference(objectReference);
				if (result == null) result = caseValue(objectReference);
				if (result == null) result = caseRule(objectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				Object result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				Object result = caseTemplate(template);
				if (result == null) result = caseRule(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.POLYMORPHIC_COND: {
				PolymorphicCond polymorphicCond = (PolymorphicCond)theEObject;
				Object result = casePolymorphicCond(polymorphicCond);
				if (result == null) result = caseCondition(polymorphicCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.CUSTOM_COND: {
				CustomCond customCond = (CustomCond)theEObject;
				Object result = caseCustomCond(customCond);
				if (result == null) result = caseCondition(customCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				Object result = caseStringValue(stringValue);
				if (result == null) result = casePrimitiveValue(stringValue);
				if (result == null) result = caseValue(stringValue);
				if (result == null) result = caseRule(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				Object result = caseIntegerValue(integerValue);
				if (result == null) result = casePrimitiveValue(integerValue);
				if (result == null) result = caseValue(integerValue);
				if (result == null) result = caseRule(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.ROOT: {
				Root root = (Root)theEObject;
				Object result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.RULE_REF: {
				RuleRef ruleRef = (RuleRef)theEObject;
				Object result = caseRuleRef(ruleRef);
				if (result == null) result = caseValue(ruleRef);
				if (result == null) result = caseRule(ruleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.ADORNMENT: {
				Adornment adornment = (Adornment)theEObject;
				Object result = caseAdornment(adornment);
				if (result == null) result = caseTerminal(adornment);
				if (result == null) result = caseRule(adornment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				Object result = caseConstant(constant);
				if (result == null) result = caseValue(constant);
				if (result == null) result = caseRule(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StsPackage.URI_VALUE: {
				URIValue uriValue = (URIValue)theEObject;
				Object result = caseURIValue(uriValue);
				if (result == null) result = casePrimitiveValue(uriValue);
				if (result == null) result = caseValue(uriValue);
				if (result == null) result = caseRule(uriValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIteration(Iteration object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primitive Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primitive Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveValue(PrimitiveValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Object Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectReference(ObjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Polymorphic Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Polymorphic Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolymorphicCond(PolymorphicCond object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomCond(CustomCond object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Rule Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Rule Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRuleRef(RuleRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Adornment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Adornment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdornment(Adornment object) {
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
	 * Returns the result of interpretting the object as an instance of '<em>URI Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>URI Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseURIValue(URIValue object) {
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

} //StsSwitch
