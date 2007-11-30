/**
 * $Id: SimkSwitch.java,v 1.2 2007-11-30 14:11:24 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SimkSwitch.java,v 1.2 2007-11-30 14:11:24 cfaucher Exp $
 */
package org.kermeta.simk.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.kermeta.simk.*;

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
 * @see org.kermeta.simk.SimkPackage
 * @generated
 */
public class SimkSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimkSwitch() {
		if (modelPackage == null) {
			modelPackage = SimkPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimkPackage.SIMK_MODEL: {
				SIMKModel simkModel = (SIMKModel)theEObject;
				T result = caseSIMKModel(simkModel);
				if (result == null) result = caseSMNamedElement(simkModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.STATIC_METHOD: {
				StaticMethod staticMethod = (StaticMethod)theEObject;
				T result = caseStaticMethod(staticMethod);
				if (result == null) result = caseSMNamedElement(staticMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_CONTEXT: {
				SMContext smContext = (SMContext)theEObject;
				T result = caseSMContext(smContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_PACKAGE: {
				SMPackage smPackage = (SMPackage)theEObject;
				T result = caseSMPackage(smPackage);
				if (result == null) result = caseSMNamedElement(smPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_CLASS: {
				SMClass smClass = (SMClass)theEObject;
				T result = caseSMClass(smClass);
				if (result == null) result = caseSMNamedElement(smClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_NAMED_ELEMENT: {
				SMNamedElement smNamedElement = (SMNamedElement)theEObject;
				T result = caseSMNamedElement(smNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_PARAMETER: {
				SMParameter smParameter = (SMParameter)theEObject;
				T result = caseSMParameter(smParameter);
				if (result == null) result = caseSMNamedElement(smParameter);
				if (result == null) result = caseSMTypedElement(smParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_TYPED_ELEMENT: {
				SMTypedElement smTypedElement = (SMTypedElement)theEObject;
				T result = caseSMTypedElement(smTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimkPackage.SM_RETURN: {
				SMReturn smReturn = (SMReturn)theEObject;
				T result = caseSMReturn(smReturn);
				if (result == null) result = caseSMTypedElement(smReturn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIMK Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIMK Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIMKModel(SIMKModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticMethod(StaticMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMContext(SMContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMPackage(SMPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMClass(SMClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMNamedElement(SMNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMParameter(SMParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMTypedElement(SMTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SM Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SM Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMReturn(SMReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SimkSwitch
