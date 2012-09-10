/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.AdaptationOperator;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Unresolved;
import org.kermeta.language.structure.UseAdaptationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Adaptation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UseAdaptationOperatorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UseAdaptationOperatorImpl#getOwnedUnresolved <em>Owned Unresolved</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UseAdaptationOperatorImpl#getUsedOperator <em>Used Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseAdaptationOperatorImpl extends KermetaModelElementImpl implements UseAdaptationOperator {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<KermetaModelElement> parameters;

	/**
	 * The cached value of the '{@link #getOwnedUnresolved() <em>Owned Unresolved</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUnresolved()
	 * @generated
	 * @ordered
	 */
	protected EList<Unresolved> ownedUnresolved;

	/**
	 * The cached value of the '{@link #getUsedOperator() <em>Used Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedOperator()
	 * @generated
	 * @ordered
	 */
	protected AdaptationOperator usedOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseAdaptationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.USE_ADAPTATION_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KermetaModelElement> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<KermetaModelElement>(KermetaModelElement.class, this, StructurePackage.USE_ADAPTATION_OPERATOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unresolved> getOwnedUnresolved() {
		if (ownedUnresolved == null) {
			ownedUnresolved = new EObjectContainmentEList<Unresolved>(Unresolved.class, this, StructurePackage.USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED);
		}
		return ownedUnresolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationOperator getUsedOperator() {
		if (usedOperator != null && usedOperator.eIsProxy()) {
			InternalEObject oldUsedOperator = (InternalEObject)usedOperator;
			usedOperator = (AdaptationOperator)eResolveProxy(oldUsedOperator);
			if (usedOperator != oldUsedOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.USE_ADAPTATION_OPERATOR__USED_OPERATOR, oldUsedOperator, usedOperator));
			}
		}
		return usedOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationOperator basicGetUsedOperator() {
		return usedOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedOperator(AdaptationOperator newUsedOperator) {
		AdaptationOperator oldUsedOperator = usedOperator;
		usedOperator = newUsedOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.USE_ADAPTATION_OPERATOR__USED_OPERATOR, oldUsedOperator, usedOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED:
				return ((InternalEList<?>)getOwnedUnresolved()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.USE_ADAPTATION_OPERATOR__PARAMETERS:
				return getParameters();
			case StructurePackage.USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED:
				return getOwnedUnresolved();
			case StructurePackage.USE_ADAPTATION_OPERATOR__USED_OPERATOR:
				if (resolve) return getUsedOperator();
				return basicGetUsedOperator();
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
			case StructurePackage.USE_ADAPTATION_OPERATOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends KermetaModelElement>)newValue);
				return;
			case StructurePackage.USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED:
				getOwnedUnresolved().clear();
				getOwnedUnresolved().addAll((Collection<? extends Unresolved>)newValue);
				return;
			case StructurePackage.USE_ADAPTATION_OPERATOR__USED_OPERATOR:
				setUsedOperator((AdaptationOperator)newValue);
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
			case StructurePackage.USE_ADAPTATION_OPERATOR__PARAMETERS:
				getParameters().clear();
				return;
			case StructurePackage.USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED:
				getOwnedUnresolved().clear();
				return;
			case StructurePackage.USE_ADAPTATION_OPERATOR__USED_OPERATOR:
				setUsedOperator((AdaptationOperator)null);
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
			case StructurePackage.USE_ADAPTATION_OPERATOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StructurePackage.USE_ADAPTATION_OPERATOR__OWNED_UNRESOLVED:
				return ownedUnresolved != null && !ownedUnresolved.isEmpty();
			case StructurePackage.USE_ADAPTATION_OPERATOR__USED_OPERATOR:
				return usedOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //UseAdaptationOperatorImpl
