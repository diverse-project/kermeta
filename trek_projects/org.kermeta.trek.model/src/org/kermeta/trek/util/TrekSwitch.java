/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekSwitch.java,v 1.4 2007-11-26 17:04:19 cfaucher Exp $
 */
package org.kermeta.trek.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.kermeta.trek.*;

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
 * @see org.kermeta.trek.TrekPackage
 * @generated
 */
public class TrekSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TrekPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrekSwitch() {
		if (modelPackage == null) {
			modelPackage = TrekPackage.eINSTANCE;
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
			case TrekPackage.USE_KASE_MODEL: {
				UseKaseModel useKaseModel = (UseKaseModel)theEObject;
				T result = caseUseKaseModel(useKaseModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrekPackage.KUSE_CASE: {
				KUseCase kUseCase = (KUseCase)theEObject;
				T result = caseKUseCase(kUseCase);
				if (result == null) result = caseTrekModelElement(kUseCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrekPackage.KTEST_CASE: {
				KTestCase kTestCase = (KTestCase)theEObject;
				T result = caseKTestCase(kTestCase);
				if (result == null) result = caseTrekModelElement(kTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrekPackage.KUSER_STORY: {
				KUserStory kUserStory = (KUserStory)theEObject;
				T result = caseKUserStory(kUserStory);
				if (result == null) result = caseTrekModelElement(kUserStory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrekPackage.KTAG_ELEMENT: {
				KTagElement kTagElement = (KTagElement)theEObject;
				T result = caseKTagElement(kTagElement);
				if (result == null) result = caseTrekModelElement(kTagElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrekPackage.TREK_MODEL_ELEMENT: {
				TrekModelElement trekModelElement = (TrekModelElement)theEObject;
				T result = caseTrekModelElement(trekModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrekPackage.KSTATUS: {
				KStatus kStatus = (KStatus)theEObject;
				T result = caseKStatus(kStatus);
				if (result == null) result = caseTrekModelElement(kStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Kase Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Kase Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseKaseModel(UseKaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KUse Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KUse Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKUseCase(KUseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KTest Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KTest Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKTestCase(KTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KUser Story</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KUser Story</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKUserStory(KUserStory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KTag Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KTag Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKTagElement(KTagElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrekModelElement(TrekModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KStatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KStatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKStatus(KStatus object) {
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

} //TrekSwitch
