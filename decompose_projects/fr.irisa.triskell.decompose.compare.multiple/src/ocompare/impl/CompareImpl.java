/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompareImpl.java,v 1.1 2008-10-13 20:03:36 fmunoz Exp $
 */
package ocompare.impl;

import java.util.Collection;

import ocompare.Compare;
import ocompare.CompareElement;
import ocompare.OcomparePackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ocompare.impl.CompareImpl#getToCompare <em>To Compare</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareImpl extends EObjectImpl implements Compare {
	/**
	 * The cached value of the '{@link #getToCompare() <em>To Compare</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCompare()
	 * @generated
	 * @ordered
	 */
	protected EList<CompareElement> toCompare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcomparePackage.Literals.COMPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompareElement> getToCompare() {
		if (toCompare == null) {
			toCompare = new EObjectContainmentEList<CompareElement>(CompareElement.class, this, OcomparePackage.COMPARE__TO_COMPARE);
		}
		return toCompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcomparePackage.COMPARE__TO_COMPARE:
				return ((InternalEList<?>)getToCompare()).basicRemove(otherEnd, msgs);
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
			case OcomparePackage.COMPARE__TO_COMPARE:
				return getToCompare();
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
			case OcomparePackage.COMPARE__TO_COMPARE:
				getToCompare().clear();
				getToCompare().addAll((Collection<? extends CompareElement>)newValue);
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
			case OcomparePackage.COMPARE__TO_COMPARE:
				getToCompare().clear();
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
			case OcomparePackage.COMPARE__TO_COMPARE:
				return toCompare != null && !toCompare.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompareImpl
