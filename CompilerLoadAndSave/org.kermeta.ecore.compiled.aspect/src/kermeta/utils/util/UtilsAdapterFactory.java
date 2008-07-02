/**
 * <copyright>
 * </copyright>
 *
 * $Id: UtilsAdapterFactory.java,v 1.1 2008-07-02 09:44:04 ftanguy Exp $
 */
package kermeta.utils.util;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.OrderedCollection;
import kermeta.standard.Sequence;

import kermeta.utils.Hashtable;
import kermeta.utils.Stack;
import kermeta.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.utils.UtilsPackage
 * @generated
 */
public class UtilsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UtilsPackage.eINSTANCE;
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
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilsSwitch<Adapter> modelSwitch =
		new UtilsSwitch<Adapter>() {
			@Override
			public <K, V> Adapter caseHashtable(Hashtable<K, V> object) {
				return createHashtableAdapter();
			}
			@Override
			public Adapter caseStringBuffer(kermeta.utils.StringBuffer object) {
				return createStringBufferAdapter();
			}
			@Override
			public <G> Adapter caseStack(Stack<G> object) {
				return createStackAdapter();
			}
			@Override
			public Adapter caseObject(kermeta.language.structure.Object object) {
				return createObjectAdapter();
			}
			@Override
			public <G> Adapter caseCollection(Collection<G> object) {
				return createCollectionAdapter();
			}
			@Override
			public <G> Adapter caseBag(Bag<G> object) {
				return createBagAdapter();
			}
			@Override
			public <G> Adapter caseOrderedCollection(OrderedCollection<G> object) {
				return createOrderedCollectionAdapter();
			}
			@Override
			public <G> Adapter caseSequence(Sequence<G> object) {
				return createSequenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link kermeta.utils.Hashtable <em>Hashtable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.utils.Hashtable
	 * @generated
	 */
	public Adapter createHashtableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.utils.StringBuffer <em>String Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.utils.StringBuffer
	 * @generated
	 */
	public Adapter createStringBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.utils.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.utils.Stack
	 * @generated
	 */
	public Adapter createStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.language.structure.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.language.structure.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.standard.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.standard.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.standard.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.standard.Bag
	 * @generated
	 */
	public Adapter createBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.standard.OrderedCollection <em>Ordered Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.standard.OrderedCollection
	 * @generated
	 */
	public Adapter createOrderedCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.standard.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.standard.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
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

} //UtilsAdapterFactory
