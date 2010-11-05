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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage
 * @generated
 */
public class Instance_relaxedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Instance_relaxedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance_relaxedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Instance_relaxedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instance_relaxedSwitch<Adapter> modelSwitch =
		new Instance_relaxedSwitch<Adapter>() {
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter casePrimitiveInstance(PrimitiveInstance object) {
				return createPrimitiveInstanceAdapter();
			}
			@Override
			public Adapter caseCompositeInstance(CompositeInstance object) {
				return createCompositeInstanceAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseTransmissionBinding(TransmissionBinding object) {
				return createTransmissionBindingAdapter();
			}
			@Override
			public Adapter caseDelegationBinding(DelegationBinding object) {
				return createDelegationBindingAdapter();
			}
			@Override
			public Adapter caseAttributeInstance(AttributeInstance object) {
				return createAttributeInstanceAdapter();
			}
			@Override
			public Adapter caseValuedAttribute(ValuedAttribute object) {
				return createValuedAttributeAdapter();
			}
			@Override
			public Adapter caseDictionaryValuedAttribute(DictionaryValuedAttribute object) {
				return createDictionaryValuedAttributeAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object) {
				return createEntryAdapter();
			}
			@Override
			public Adapter caseDefaultEntry(DefaultEntry object) {
				return createDefaultEntryAdapter();
			}
			@Override
			public Adapter caseOtherEntry(OtherEntry object) {
				return createOtherEntryAdapter();
			}
			@Override
			public Adapter caseAspectModelElement(AspectModelElement object) {
				return createAspectModelElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.PrimitiveInstance <em>Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.PrimitiveInstance
	 * @generated
	 */
	public Adapter createPrimitiveInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.CompositeInstance <em>Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.CompositeInstance
	 * @generated
	 */
	public Adapter createCompositeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.TransmissionBinding <em>Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.TransmissionBinding
	 * @generated
	 */
	public Adapter createTransmissionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.DelegationBinding <em>Delegation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.DelegationBinding
	 * @generated
	 */
	public Adapter createDelegationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.AttributeInstance <em>Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.AttributeInstance
	 * @generated
	 */
	public Adapter createAttributeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.ValuedAttribute <em>Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.ValuedAttribute
	 * @generated
	 */
	public Adapter createValuedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute <em>Dictionary Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.DictionaryValuedAttribute
	 * @generated
	 */
	public Adapter createDictionaryValuedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.DefaultEntry <em>Default Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.DefaultEntry
	 * @generated
	 */
	public Adapter createDefaultEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.instance_relaxed.OtherEntry <em>Other Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.instance_relaxed.OtherEntry
	 * @generated
	 */
	public Adapter createOtherEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.AspectModelElement <em>Aspect Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.AspectModelElement
	 * @generated
	 */
	public Adapter createAspectModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link art_relaxed.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see art_relaxed.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Instance_relaxedAdapterFactory
