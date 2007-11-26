/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUserStoryImpl.java,v 1.4 2007-11-26 17:04:18 cfaucher Exp $
 */
package org.kermeta.trek.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.trek.KUseCase;
import org.kermeta.trek.KUserStory;
import org.kermeta.trek.TrekPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KUser Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.trek.impl.KUserStoryImpl#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUserStoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KUserStoryImpl#getShortSummary <em>Short Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KUserStoryImpl extends TrekModelElementImpl implements KUserStory {
	/**
	 * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<KUseCase> coveredBy;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortSummary() <em>Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortSummary() <em>Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortSummary()
	 * @generated
	 * @ordered
	 */
	protected String shortSummary = SHORT_SUMMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KUserStoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrekPackage.Literals.KUSER_STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUseCase> getCoveredBy() {
		if (coveredBy == null) {
			coveredBy = new EObjectWithInverseResolvingEList.ManyInverse<KUseCase>(KUseCase.class, this, TrekPackage.KUSER_STORY__COVERED_BY, TrekPackage.KUSE_CASE__COVERS);
		}
		return coveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSER_STORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortSummary() {
		return shortSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortSummary(String newShortSummary) {
		String oldShortSummary = shortSummary;
		shortSummary = newShortSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KUSER_STORY__SHORT_SUMMARY, oldShortSummary, shortSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrekPackage.KUSER_STORY__COVERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoveredBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrekPackage.KUSER_STORY__COVERED_BY:
				return ((InternalEList<?>)getCoveredBy()).basicRemove(otherEnd, msgs);
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
			case TrekPackage.KUSER_STORY__COVERED_BY:
				return getCoveredBy();
			case TrekPackage.KUSER_STORY__ID:
				return getId();
			case TrekPackage.KUSER_STORY__SHORT_SUMMARY:
				return getShortSummary();
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
			case TrekPackage.KUSER_STORY__COVERED_BY:
				getCoveredBy().clear();
				getCoveredBy().addAll((Collection<? extends KUseCase>)newValue);
				return;
			case TrekPackage.KUSER_STORY__ID:
				setId((String)newValue);
				return;
			case TrekPackage.KUSER_STORY__SHORT_SUMMARY:
				setShortSummary((String)newValue);
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
			case TrekPackage.KUSER_STORY__COVERED_BY:
				getCoveredBy().clear();
				return;
			case TrekPackage.KUSER_STORY__ID:
				setId(ID_EDEFAULT);
				return;
			case TrekPackage.KUSER_STORY__SHORT_SUMMARY:
				setShortSummary(SHORT_SUMMARY_EDEFAULT);
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
			case TrekPackage.KUSER_STORY__COVERED_BY:
				return coveredBy != null && !coveredBy.isEmpty();
			case TrekPackage.KUSER_STORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TrekPackage.KUSER_STORY__SHORT_SUMMARY:
				return SHORT_SUMMARY_EDEFAULT == null ? shortSummary != null : !SHORT_SUMMARY_EDEFAULT.equals(shortSummary);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", shortSummary: ");
		result.append(shortSummary);
		result.append(')');
		return result.toString();
	}

} //KUserStoryImpl
