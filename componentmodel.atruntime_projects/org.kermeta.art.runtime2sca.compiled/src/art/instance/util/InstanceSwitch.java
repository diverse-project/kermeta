/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance.util;

import art.AddElement;
import art.ModelElement;
import art.NamedElement;
import art.RemoveElement;
import art.UpdateElement;

import art.instance.*;

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
 * @see art.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSwitch() {
		if (modelPackage == null) {
			modelPackage = InstancePackage.eINSTANCE;
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
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
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
		case InstancePackage.COMPONENT_INSTANCE: {
			ComponentInstance componentInstance = (ComponentInstance) theEObject;
			T result = caseComponentInstance(componentInstance);
			if (result == null)
				result = caseModelElement(componentInstance);
			if (result == null)
				result = caseAddElement(componentInstance);
			if (result == null)
				result = caseRemoveElement(componentInstance);
			if (result == null)
				result = caseUpdateElement(componentInstance);
			if (result == null)
				result = caseNamedElement(componentInstance);
			if (result == null)
				result = caseObject(componentInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InstancePackage.PRIMITIVE_INSTANCE: {
			PrimitiveInstance primitiveInstance = (PrimitiveInstance) theEObject;
			T result = casePrimitiveInstance(primitiveInstance);
			if (result == null)
				result = caseComponentInstance(primitiveInstance);
			if (result == null)
				result = caseModelElement(primitiveInstance);
			if (result == null)
				result = caseAddElement(primitiveInstance);
			if (result == null)
				result = caseRemoveElement(primitiveInstance);
			if (result == null)
				result = caseUpdateElement(primitiveInstance);
			if (result == null)
				result = caseNamedElement(primitiveInstance);
			if (result == null)
				result = caseObject(primitiveInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InstancePackage.COMPOSITE_INSTANCE: {
			CompositeInstance compositeInstance = (CompositeInstance) theEObject;
			T result = caseCompositeInstance(compositeInstance);
			if (result == null)
				result = caseComponentInstance(compositeInstance);
			if (result == null)
				result = caseModelElement(compositeInstance);
			if (result == null)
				result = caseAddElement(compositeInstance);
			if (result == null)
				result = caseRemoveElement(compositeInstance);
			if (result == null)
				result = caseUpdateElement(compositeInstance);
			if (result == null)
				result = caseNamedElement(compositeInstance);
			if (result == null)
				result = caseObject(compositeInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InstancePackage.VALUED_ATTRIBUTE: {
			ValuedAttribute valuedAttribute = (ValuedAttribute) theEObject;
			T result = caseValuedAttribute(valuedAttribute);
			if (result == null)
				result = caseUpdateElement(valuedAttribute);
			if (result == null)
				result = caseObject(valuedAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InstancePackage.BINDING: {
			Binding binding = (Binding) theEObject;
			T result = caseBinding(binding);
			if (result == null)
				result = caseAddElement(binding);
			if (result == null)
				result = caseRemoveElement(binding);
			if (result == null)
				result = caseUpdateElement(binding);
			if (result == null)
				result = caseObject(binding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InstancePackage.TRANSMISSION_BINDING: {
			TransmissionBinding transmissionBinding = (TransmissionBinding) theEObject;
			T result = caseTransmissionBinding(transmissionBinding);
			if (result == null)
				result = caseBinding(transmissionBinding);
			if (result == null)
				result = caseAddElement(transmissionBinding);
			if (result == null)
				result = caseRemoveElement(transmissionBinding);
			if (result == null)
				result = caseUpdateElement(transmissionBinding);
			if (result == null)
				result = caseObject(transmissionBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case InstancePackage.DELEGATION_BINDING: {
			DelegationBinding delegationBinding = (DelegationBinding) theEObject;
			T result = caseDelegationBinding(delegationBinding);
			if (result == null)
				result = caseBinding(delegationBinding);
			if (result == null)
				result = caseAddElement(delegationBinding);
			if (result == null)
				result = caseRemoveElement(delegationBinding);
			if (result == null)
				result = caseUpdateElement(delegationBinding);
			if (result == null)
				result = caseObject(delegationBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveInstance(PrimitiveInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeInstance(CompositeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valued Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuedAttribute(ValuedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionBinding(TransmissionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationBinding(DelegationBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(kermeta.language.structure.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddElement(AddElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveElement(RemoveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateElement(UpdateElement object) {
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

} //InstanceSwitch
