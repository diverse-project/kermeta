/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.LinkOperationTuple;
import org3.kermeta.alf.LinkOperationTupleElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Operation Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.LinkOperationTupleImpl#getLinkOperationTupleElement <em>Link Operation Tuple Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkOperationTupleImpl extends EObjectImpl implements LinkOperationTuple {
	/**
	 * The cached value of the '{@link #getLinkOperationTupleElement() <em>Link Operation Tuple Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkOperationTupleElement()
	 * @generated
	 * @ordered
	 */
	protected EList linkOperationTupleElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkOperationTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfPackage.Literals.LINK_OPERATION_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLinkOperationTupleElement() {
		if (linkOperationTupleElement == null) {
			linkOperationTupleElement = new EObjectContainmentEList(LinkOperationTupleElement.class, this, AlfPackage.LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT);
		}
		return linkOperationTupleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT:
				return ((InternalEList)getLinkOperationTupleElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfPackage.LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT:
				return getLinkOperationTupleElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlfPackage.LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT:
				getLinkOperationTupleElement().clear();
				getLinkOperationTupleElement().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlfPackage.LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT:
				getLinkOperationTupleElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlfPackage.LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT:
				return linkOperationTupleElement != null && !linkOperationTupleElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkOperationTupleImpl
