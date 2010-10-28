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
			case Art2adaptationPackage.TYPE_ADAPTATION: {
				TypeAdaptation typeAdaptation = (TypeAdaptation)theEObject;
				T result = caseTypeAdaptation(typeAdaptation);
				if (result == null) result = caseAdaptationPrimitive(typeAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.INSTANCE_ADAPTATION: {
				InstanceAdaptation instanceAdaptation = (InstanceAdaptation)theEObject;
				T result = caseInstanceAdaptation(instanceAdaptation);
				if (result == null) result = caseAdaptationPrimitive(instanceAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_TYPE: {
				AddType addType = (AddType)theEObject;
				T result = caseAddType(addType);
				if (result == null) result = caseTypeAdaptation(addType);
				if (result == null) result = caseAdaptationPrimitive(addType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_TYPE: {
				RemoveType removeType = (RemoveType)theEObject;
				T result = caseRemoveType(removeType);
				if (result == null) result = caseTypeAdaptation(removeType);
				if (result == null) result = caseAdaptationPrimitive(removeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_INSTANCE: {
				AddInstance addInstance = (AddInstance)theEObject;
				T result = caseAddInstance(addInstance);
				if (result == null) result = caseInstanceAdaptation(addInstance);
				if (result == null) result = caseAdaptationPrimitive(addInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_INSTANCE: {
				RemoveInstance removeInstance = (RemoveInstance)theEObject;
				T result = caseRemoveInstance(removeInstance);
				if (result == null) result = caseInstanceAdaptation(removeInstance);
				if (result == null) result = caseAdaptationPrimitive(removeInstance);
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
			case Art2adaptationPackage.BINDING_ADAPTATION: {
				BindingAdaptation bindingAdaptation = (BindingAdaptation)theEObject;
				T result = caseBindingAdaptation(bindingAdaptation);
				if (result == null) result = caseAdaptationPrimitive(bindingAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_BINDING: {
				AddBinding addBinding = (AddBinding)theEObject;
				T result = caseAddBinding(addBinding);
				if (result == null) result = caseBindingAdaptation(addBinding);
				if (result == null) result = caseAdaptationPrimitive(addBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_BINDING: {
				RemoveBinding removeBinding = (RemoveBinding)theEObject;
				T result = caseRemoveBinding(removeBinding);
				if (result == null) result = caseBindingAdaptation(removeBinding);
				if (result == null) result = caseAdaptationPrimitive(removeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION: {
				FragmentBindingAdaptation fragmentBindingAdaptation = (FragmentBindingAdaptation)theEObject;
				T result = caseFragmentBindingAdaptation(fragmentBindingAdaptation);
				if (result == null) result = caseAdaptationPrimitive(fragmentBindingAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_FRAGMENT_BINDING: {
				AddFragmentBinding addFragmentBinding = (AddFragmentBinding)theEObject;
				T result = caseAddFragmentBinding(addFragmentBinding);
				if (result == null) result = caseFragmentBindingAdaptation(addFragmentBinding);
				if (result == null) result = caseAdaptationPrimitive(addFragmentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_FRAGMENT_BINDING: {
				RemoveFragmentBinding removeFragmentBinding = (RemoveFragmentBinding)theEObject;
				T result = caseRemoveFragmentBinding(removeFragmentBinding);
				if (result == null) result = caseFragmentBindingAdaptation(removeFragmentBinding);
				if (result == null) result = caseAdaptationPrimitive(removeFragmentBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.UPDATE_INSTANCE: {
				UpdateInstance updateInstance = (UpdateInstance)theEObject;
				T result = caseUpdateInstance(updateInstance);
				if (result == null) result = caseInstanceAdaptation(updateInstance);
				if (result == null) result = caseAdaptationPrimitive(updateInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.UPDATE_DICTIONARY_INSTANCE: {
				UpdateDictionaryInstance updateDictionaryInstance = (UpdateDictionaryInstance)theEObject;
				T result = caseUpdateDictionaryInstance(updateDictionaryInstance);
				if (result == null) result = caseInstanceAdaptation(updateDictionaryInstance);
				if (result == null) result = caseAdaptationPrimitive(updateDictionaryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = caseTypeAdaptation(updateType);
				if (result == null) result = caseAdaptationPrimitive(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.DEPLOY_UNIT_ADAPTATION: {
				DeployUnitAdaptation deployUnitAdaptation = (DeployUnitAdaptation)theEObject;
				T result = caseDeployUnitAdaptation(deployUnitAdaptation);
				if (result == null) result = caseAdaptationPrimitive(deployUnitAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.ADD_DEPLOY_UNIT: {
				AddDeployUnit addDeployUnit = (AddDeployUnit)theEObject;
				T result = caseAddDeployUnit(addDeployUnit);
				if (result == null) result = caseDeployUnitAdaptation(addDeployUnit);
				if (result == null) result = caseAdaptationPrimitive(addDeployUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.REMOVE_DEPLOY_UNIT: {
				RemoveDeployUnit removeDeployUnit = (RemoveDeployUnit)theEObject;
				T result = caseRemoveDeployUnit(removeDeployUnit);
				if (result == null) result = caseDeployUnitAdaptation(removeDeployUnit);
				if (result == null) result = caseAdaptationPrimitive(removeDeployUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.UPDATE_DEPLOY_UNIT: {
				UpdateDeployUnit updateDeployUnit = (UpdateDeployUnit)theEObject;
				T result = caseUpdateDeployUnit(updateDeployUnit);
				if (result == null) result = caseDeployUnitAdaptation(updateDeployUnit);
				if (result == null) result = caseAdaptationPrimitive(updateDeployUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Art2adaptationPackage.UPDATE_BINDING: {
				UpdateBinding updateBinding = (UpdateBinding)theEObject;
				T result = caseUpdateBinding(updateBinding);
				if (result == null) result = caseBindingAdaptation(updateBinding);
				if (result == null) result = caseAdaptationPrimitive(updateBinding);
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAdaptation(TypeAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceAdaptation(InstanceAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddType(AddType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveType(RemoveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddInstance(AddInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveInstance(RemoveInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Binding Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingAdaptation(BindingAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddBinding(AddBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveBinding(RemoveBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Binding Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Binding Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentBindingAdaptation(FragmentBindingAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Fragment Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Fragment Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddFragmentBinding(AddFragmentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Fragment Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Fragment Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveFragmentBinding(RemoveFragmentBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateInstance(UpdateInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Dictionary Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Dictionary Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateDictionaryInstance(UpdateDictionaryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deploy Unit Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deploy Unit Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployUnitAdaptation(DeployUnitAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Deploy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Deploy Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddDeployUnit(AddDeployUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Deploy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Deploy Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveDeployUnit(RemoveDeployUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Deploy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Deploy Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateDeployUnit(UpdateDeployUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateBinding(UpdateBinding object) {
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
