/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.diagnostic.DiagnosticPackage;
import org.kermeta.diagnostic.InvariantProxy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.diagnostic.impl.InvariantProxyImpl#getMetaclassQualifiedName <em>Metaclass Qualified Name</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.impl.InvariantProxyImpl#getInvariantName <em>Invariant Name</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.impl.InvariantProxyImpl#getMmUri <em>Mm Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvariantProxyImpl extends InvariantImpl implements InvariantProxy {
	/**
	 * The default value of the '{@link #getMetaclassQualifiedName() <em>Metaclass Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclassQualifiedName() <em>Metaclass Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String metaclassQualifiedName = METACLASS_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvariantName() <em>Invariant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantName()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariantName() <em>Invariant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantName()
	 * @generated
	 * @ordered
	 */
	protected String invariantName = INVARIANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMmUri() <em>Mm Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMmUri()
	 * @generated
	 * @ordered
	 */
	protected static final String MM_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMmUri() <em>Mm Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMmUri()
	 * @generated
	 * @ordered
	 */
	protected String mmUri = MM_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagnosticPackage.Literals.INVARIANT_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaclassQualifiedName() {
		return metaclassQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclassQualifiedName(String newMetaclassQualifiedName) {
		String oldMetaclassQualifiedName = metaclassQualifiedName;
		metaclassQualifiedName = newMetaclassQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.INVARIANT_PROXY__METACLASS_QUALIFIED_NAME, oldMetaclassQualifiedName, metaclassQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariantName() {
		return invariantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantName(String newInvariantName) {
		String oldInvariantName = invariantName;
		invariantName = newInvariantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.INVARIANT_PROXY__INVARIANT_NAME, oldInvariantName, invariantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMmUri() {
		return mmUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMmUri(String newMmUri) {
		String oldMmUri = mmUri;
		mmUri = newMmUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.INVARIANT_PROXY__MM_URI, oldMmUri, mmUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagnosticPackage.INVARIANT_PROXY__METACLASS_QUALIFIED_NAME:
				return getMetaclassQualifiedName();
			case DiagnosticPackage.INVARIANT_PROXY__INVARIANT_NAME:
				return getInvariantName();
			case DiagnosticPackage.INVARIANT_PROXY__MM_URI:
				return getMmUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagnosticPackage.INVARIANT_PROXY__METACLASS_QUALIFIED_NAME:
				setMetaclassQualifiedName((String)newValue);
				return;
			case DiagnosticPackage.INVARIANT_PROXY__INVARIANT_NAME:
				setInvariantName((String)newValue);
				return;
			case DiagnosticPackage.INVARIANT_PROXY__MM_URI:
				setMmUri((String)newValue);
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
			case DiagnosticPackage.INVARIANT_PROXY__METACLASS_QUALIFIED_NAME:
				setMetaclassQualifiedName(METACLASS_QUALIFIED_NAME_EDEFAULT);
				return;
			case DiagnosticPackage.INVARIANT_PROXY__INVARIANT_NAME:
				setInvariantName(INVARIANT_NAME_EDEFAULT);
				return;
			case DiagnosticPackage.INVARIANT_PROXY__MM_URI:
				setMmUri(MM_URI_EDEFAULT);
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
			case DiagnosticPackage.INVARIANT_PROXY__METACLASS_QUALIFIED_NAME:
				return METACLASS_QUALIFIED_NAME_EDEFAULT == null ? metaclassQualifiedName != null : !METACLASS_QUALIFIED_NAME_EDEFAULT.equals(metaclassQualifiedName);
			case DiagnosticPackage.INVARIANT_PROXY__INVARIANT_NAME:
				return INVARIANT_NAME_EDEFAULT == null ? invariantName != null : !INVARIANT_NAME_EDEFAULT.equals(invariantName);
			case DiagnosticPackage.INVARIANT_PROXY__MM_URI:
				return MM_URI_EDEFAULT == null ? mmUri != null : !MM_URI_EDEFAULT.equals(mmUri);
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
		result.append(" (metaclassQualifiedName: ");
		result.append(metaclassQualifiedName);
		result.append(", invariantName: ");
		result.append(invariantName);
		result.append(", mmUri: ");
		result.append(mmUri);
		result.append(')');
		return result.toString();
	}

} //InvariantProxyImpl
