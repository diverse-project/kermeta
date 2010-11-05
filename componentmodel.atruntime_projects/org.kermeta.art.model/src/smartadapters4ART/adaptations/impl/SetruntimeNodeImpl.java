/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations.impl;

import art_relaxed.distrib_relaxed.Node;

import art_relaxed.instance_relaxed.ComponentInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smartadapters4ART.adaptations.AdaptationsPackage;
import smartadapters4ART.adaptations.SetruntimeNode;

import smartadapters4ART.impl.SetAdaptationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setruntime Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeNodeImpl#getNodeToSet <em>Node To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeNodeImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetruntimeNodeImpl extends SetAdaptationImpl implements SetruntimeNode {
	/**
	 * The cached value of the '{@link #getNodeToSet() <em>Node To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeToSet()
	 * @generated
	 * @ordered
	 */
	protected Node nodeToSet;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetruntimeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptationsPackage.Literals.SETRUNTIME_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeToSet() {
		if (nodeToSet != null && nodeToSet.eIsProxy()) {
			InternalEObject oldNodeToSet = (InternalEObject)nodeToSet;
			nodeToSet = (Node)eResolveProxy(oldNodeToSet);
			if (nodeToSet != oldNodeToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET, oldNodeToSet, nodeToSet));
			}
		}
		return nodeToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeToSet() {
		return nodeToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeToSet(Node newNodeToSet) {
		Node oldNodeToSet = nodeToSet;
		nodeToSet = newNodeToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET, oldNodeToSet, nodeToSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET:
				if (resolve) return getNodeToSet();
				return basicGetNodeToSet();
			case AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS:
				return getComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET:
				setNodeToSet((Node)newValue);
				return;
			case AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET:
				setNodeToSet((Node)null);
				return;
			case AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS:
				getComponents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET:
				return nodeToSet != null;
			case AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SetruntimeNodeImpl
