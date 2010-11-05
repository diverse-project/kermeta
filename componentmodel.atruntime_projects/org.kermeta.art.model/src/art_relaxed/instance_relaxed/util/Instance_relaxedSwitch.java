/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed.util;

import art_relaxed.AspectModelElement;
import art_relaxed.ModelElement;
import art_relaxed.NamedElement;

import art_relaxed.instance_relaxed.*;

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
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage
 * @generated
 */
public class Instance_relaxedSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Instance_relaxedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance_relaxedSwitch() {
		if (modelPackage == null) {
			modelPackage = Instance_relaxedPackage.eINSTANCE;
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
			case Instance_relaxedPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseModelElement(componentInstance);
				if (result == null) result = caseNamedElement(componentInstance);
				if (result == null) result = caseAspectModelElement(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.PRIMITIVE_INSTANCE: {
				PrimitiveInstance primitiveInstance = (PrimitiveInstance)theEObject;
				T result = casePrimitiveInstance(primitiveInstance);
				if (result == null) result = caseComponentInstance(primitiveInstance);
				if (result == null) result = caseModelElement(primitiveInstance);
				if (result == null) result = caseNamedElement(primitiveInstance);
				if (result == null) result = caseAspectModelElement(primitiveInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.COMPOSITE_INSTANCE: {
				CompositeInstance compositeInstance = (CompositeInstance)theEObject;
				T result = caseCompositeInstance(compositeInstance);
				if (result == null) result = caseComponentInstance(compositeInstance);
				if (result == null) result = caseModelElement(compositeInstance);
				if (result == null) result = caseNamedElement(compositeInstance);
				if (result == null) result = caseAspectModelElement(compositeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseAspectModelElement(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.TRANSMISSION_BINDING: {
				TransmissionBinding transmissionBinding = (TransmissionBinding)theEObject;
				T result = caseTransmissionBinding(transmissionBinding);
				if (result == null) result = caseBinding(transmissionBinding);
				if (result == null) result = caseAspectModelElement(transmissionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.DELEGATION_BINDING: {
				DelegationBinding delegationBinding = (DelegationBinding)theEObject;
				T result = caseDelegationBinding(delegationBinding);
				if (result == null) result = caseBinding(delegationBinding);
				if (result == null) result = caseAspectModelElement(delegationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.ATTRIBUTE_INSTANCE: {
				AttributeInstance attributeInstance = (AttributeInstance)theEObject;
				T result = caseAttributeInstance(attributeInstance);
				if (result == null) result = caseAspectModelElement(attributeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.VALUED_ATTRIBUTE: {
				ValuedAttribute valuedAttribute = (ValuedAttribute)theEObject;
				T result = caseValuedAttribute(valuedAttribute);
				if (result == null) result = caseAttributeInstance(valuedAttribute);
				if (result == null) result = caseAspectModelElement(valuedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE: {
				DictionaryValuedAttribute dictionaryValuedAttribute = (DictionaryValuedAttribute)theEObject;
				T result = caseDictionaryValuedAttribute(dictionaryValuedAttribute);
				if (result == null) result = caseAttributeInstance(dictionaryValuedAttribute);
				if (result == null) result = caseAspectModelElement(dictionaryValuedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = caseAspectModelElement(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.DEFAULT_ENTRY: {
				DefaultEntry defaultEntry = (DefaultEntry)theEObject;
				T result = caseDefaultEntry(defaultEntry);
				if (result == null) result = caseEntry(defaultEntry);
				if (result == null) result = caseAspectModelElement(defaultEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Instance_relaxedPackage.OTHER_ENTRY: {
				OtherEntry otherEntry = (OtherEntry)theEObject;
				T result = caseOtherEntry(otherEntry);
				if (result == null) result = caseEntry(otherEntry);
				if (result == null) result = caseAspectModelElement(otherEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeInstance(AttributeInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary Valued Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionaryValuedAttribute(DictionaryValuedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultEntry(DefaultEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherEntry(OtherEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectModelElement(AspectModelElement object) {
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

} //Instance_relaxedSwitch
