/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.smartadapters.core.Adaptation;

import org.smartadapters.core.adaptations.*;

import org.smartadapters.core.setAdaptation;

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
 * @see org.smartadapters.core.adaptations.AdaptationsPackage
 * @generated
 */
public class AdaptationsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationsSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptationsPackage.eINSTANCE;
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
			case AdaptationsPackage.SETRUNTIME_SYSTEM: {
				SetruntimeSystem setruntimeSystem = (SetruntimeSystem)theEObject;
				T result = caseSetruntimeSystem(setruntimeSystem);
				if (result == null) result = casesetAdaptation(setruntimeSystem);
				if (result == null) result = caseAdaptation(setruntimeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE: {
				SetruntimeinstanceComponentInstance setruntimeinstanceComponentInstance = (SetruntimeinstanceComponentInstance)theEObject;
				T result = caseSetruntimeinstanceComponentInstance(setruntimeinstanceComponentInstance);
				if (result == null) result = casesetAdaptation(setruntimeinstanceComponentInstance);
				if (result == null) result = caseAdaptation(setruntimeinstanceComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE: {
				SetruntimeinstancePrimitiveInstance setruntimeinstancePrimitiveInstance = (SetruntimeinstancePrimitiveInstance)theEObject;
				T result = caseSetruntimeinstancePrimitiveInstance(setruntimeinstancePrimitiveInstance);
				if (result == null) result = casesetAdaptation(setruntimeinstancePrimitiveInstance);
				if (result == null) result = caseAdaptation(setruntimeinstancePrimitiveInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE: {
				SetruntimeinstanceCompositeInstance setruntimeinstanceCompositeInstance = (SetruntimeinstanceCompositeInstance)theEObject;
				T result = caseSetruntimeinstanceCompositeInstance(setruntimeinstanceCompositeInstance);
				if (result == null) result = casesetAdaptation(setruntimeinstanceCompositeInstance);
				if (result == null) result = caseAdaptation(setruntimeinstanceCompositeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING: {
				SetruntimeinstanceTransmissionBinding setruntimeinstanceTransmissionBinding = (SetruntimeinstanceTransmissionBinding)theEObject;
				T result = caseSetruntimeinstanceTransmissionBinding(setruntimeinstanceTransmissionBinding);
				if (result == null) result = casesetAdaptation(setruntimeinstanceTransmissionBinding);
				if (result == null) result = caseAdaptation(setruntimeinstanceTransmissionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setruntime System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setruntime System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetruntimeSystem(SetruntimeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setruntimeinstance Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setruntimeinstance Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetruntimeinstanceComponentInstance(SetruntimeinstanceComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setruntimeinstance Primitive Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setruntimeinstance Primitive Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetruntimeinstancePrimitiveInstance(SetruntimeinstancePrimitiveInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setruntimeinstance Composite Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setruntimeinstance Composite Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetruntimeinstanceCompositeInstance(SetruntimeinstanceCompositeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setruntimeinstance Transmission Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setruntimeinstance Transmission Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetruntimeinstanceTransmissionBinding(SetruntimeinstanceTransmissionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptation(Adaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>set Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>set Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesetAdaptation(setAdaptation object) {
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

} //AdaptationsSwitch
