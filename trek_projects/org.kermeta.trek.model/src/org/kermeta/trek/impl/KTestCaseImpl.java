/**
 * <copyright>
 * </copyright>
 *
 * $Id: KTestCaseImpl.java,v 1.4 2007-11-26 17:04:18 cfaucher Exp $
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

import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KTestCaseType;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.TrekPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KTest Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getVerifies <em>Verifies</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.kermeta.trek.impl.KTestCaseImpl#getResultId <em>Result Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KTestCaseImpl extends TrekModelElementImpl implements KTestCase {
	/**
	 * The cached value of the '{@link #getVerifies() <em>Verifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifies()
	 * @generated
	 * @ordered
	 */
	protected EList<KUseCase> verifies;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final KTestCaseType TYPE_EDEFAULT = KTestCaseType.UNIT_TEST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected KTestCaseType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultId() <em>Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultId() <em>Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultId()
	 * @generated
	 * @ordered
	 */
	protected String resultId = RESULT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrekPackage.Literals.KTEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KUseCase> getVerifies() {
		if (verifies == null) {
			verifies = new EObjectWithInverseResolvingEList.ManyInverse<KUseCase>(KUseCase.class, this, TrekPackage.KTEST_CASE__VERIFIES, TrekPackage.KUSE_CASE__VERIFIED_BY);
		}
		return verifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KTEST_CASE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KTestCaseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(KTestCaseType newType) {
		KTestCaseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KTEST_CASE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultId() {
		return resultId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultId(String newResultId) {
		String oldResultId = resultId;
		resultId = newResultId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrekPackage.KTEST_CASE__RESULT_ID, oldResultId, resultId));
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifies()).basicAdd(otherEnd, msgs);
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				return ((InternalEList<?>)getVerifies()).basicRemove(otherEnd, msgs);
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				return getVerifies();
			case TrekPackage.KTEST_CASE__URI:
				return getUri();
			case TrekPackage.KTEST_CASE__TYPE:
				return getType();
			case TrekPackage.KTEST_CASE__RESULT_ID:
				return getResultId();
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				getVerifies().clear();
				getVerifies().addAll((Collection<? extends KUseCase>)newValue);
				return;
			case TrekPackage.KTEST_CASE__URI:
				setUri((String)newValue);
				return;
			case TrekPackage.KTEST_CASE__TYPE:
				setType((KTestCaseType)newValue);
				return;
			case TrekPackage.KTEST_CASE__RESULT_ID:
				setResultId((String)newValue);
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				getVerifies().clear();
				return;
			case TrekPackage.KTEST_CASE__URI:
				setUri(URI_EDEFAULT);
				return;
			case TrekPackage.KTEST_CASE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TrekPackage.KTEST_CASE__RESULT_ID:
				setResultId(RESULT_ID_EDEFAULT);
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
			case TrekPackage.KTEST_CASE__VERIFIES:
				return verifies != null && !verifies.isEmpty();
			case TrekPackage.KTEST_CASE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case TrekPackage.KTEST_CASE__TYPE:
				return type != TYPE_EDEFAULT;
			case TrekPackage.KTEST_CASE__RESULT_ID:
				return RESULT_ID_EDEFAULT == null ? resultId != null : !RESULT_ID_EDEFAULT.equals(resultId);
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", type: ");
		result.append(type);
		result.append(", resultId: ");
		result.append(resultId);
		result.append(')');
		return result.toString();
	}

} //KTestCaseImpl
