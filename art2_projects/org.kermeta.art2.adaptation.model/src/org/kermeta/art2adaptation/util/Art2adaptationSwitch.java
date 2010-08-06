/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.kermeta.art2adaptation.*;

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
 * @see org.kermeta.art2adaptation.Art2adaptationPackage
 * @generated
 */
public class Art2adaptationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Art2adaptationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2adaptationSwitch() {
		if (modelPackage == null) {
			modelPackage = Art2adaptationPackage.eINSTANCE;
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
			case Art2adaptationPackage.ADAPTATION_PRIMITIVE: {
				AdaptationPrimitive adaptationPrimitive = (AdaptationPrimitive)theEObject;
				T result = caseAdaptationPrimitive(adaptationPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADAPTATION_MODEL: {
				AdaptationModel adaptationModel = (AdaptationModel)theEObject;
				T result = caseAdaptationModel(adaptationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.COMPONENT_TYPE_ADAPTATION: {
				ComponentTypeAdaptation componentTypeAdaptation = (ComponentTypeAdaptation)theEObject;
				T result = caseComponentTypeAdaptation(componentTypeAdaptation);
				if (result == null) result = caseAdaptationPrimitive(componentTypeAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.COMPONENT_INSTANCE_ADAPTATION: {
				ComponentInstanceAdaptation componentInstanceAdaptation = (ComponentInstanceAdaptation)theEObject;
				T result = caseComponentInstanceAdaptation(componentInstanceAdaptation);
				if (result == null) result = caseAdaptationPrimitive(componentInstanceAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_COMPONENT_TYPE: {
				AddComponentType addComponentType = (AddComponentType)theEObject;
				T result = caseAddComponentType(addComponentType);
				if (result == null) result = caseComponentTypeAdaptation(addComponentType);
				if (result == null) result = caseAdaptationPrimitive(addComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_COMPONENT_TYPE: {
				RemoveComponentType removeComponentType = (RemoveComponentType)theEObject;
				T result = caseRemoveComponentType(removeComponentType);
				if (result == null) result = caseComponentTypeAdaptation(removeComponentType);
				if (result == null) result = caseAdaptationPrimitive(removeComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_COMPONENT_INSTANCE: {
				AddComponentInstance addComponentInstance = (AddComponentInstance)theEObject;
				T result = caseAddComponentInstance(addComponentInstance);
				if (result == null) result = caseComponentInstanceAdaptation(addComponentInstance);
				if (result == null) result = caseAdaptationPrimitive(addComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_COMPONENT_INSTANCE: {
				RemoveComponentInstance removeComponentInstance = (RemoveComponentInstance)theEObject;
				T result = caseRemoveComponentInstance(removeComponentInstance);
				if (result == null) result = caseComponentInstanceAdaptation(removeComponentInstance);
				if (result == null) result = caseAdaptationPrimitive(removeComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.THIRD_PARTY_ADAPTATION: {
				ThirdPartyAdaptation thirdPartyAdaptation = (ThirdPartyAdaptation)theEObject;
				T result = caseThirdPartyAdaptation(thirdPartyAdaptation);
				if (result == null) result = caseAdaptationPrimitive(thirdPartyAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_THIRD_PARTY: {
				AddThirdParty addThirdParty = (AddThirdParty)theEObject;
				T result = caseAddThirdParty(addThirdParty);
				if (result == null) result = caseThirdPartyAdaptation(addThirdParty);
				if (result == null) result = caseAdaptationPrimitive(addThirdParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_THIRD_PARTY: {
				RemoveThirdParty removeThirdParty = (RemoveThirdParty)theEObject;
				T result = caseRemoveThirdParty(removeThirdParty);
				if (result == null) result = caseThirdPartyAdaptation(removeThirdParty);
				if (result == null) result = caseAdaptationPrimitive(removeThirdParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationPrimitive(AdaptationPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationModel(AdaptationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentTypeAdaptation(ComponentTypeAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstanceAdaptation(ComponentInstanceAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddComponentType(AddComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveComponentType(RemoveComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddComponentInstance(AddComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveComponentInstance(RemoveComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Third Party Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Third Party Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThirdPartyAdaptation(ThirdPartyAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Third Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Third Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddThirdParty(AddThirdParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Third Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Third Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveThirdParty(RemoveThirdParty object) {
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

} //Art2adaptationSwitch
