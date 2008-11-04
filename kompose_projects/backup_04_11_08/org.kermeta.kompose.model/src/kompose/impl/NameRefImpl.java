/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameRefImpl.java,v 1.1.1.1 2008-11-04 08:27:29 mclavreu Exp $
 */
package kompose.impl;

import kompose.KomposePackage;
import kompose.NameRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kompose.impl.NameRefImpl#getQname <em>Qname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameRefImpl extends ElementRefImpl implements NameRef {
	/**
	 * The default value of the '{@link #getQname() <em>Qname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQname()
	 * @generated
	 * @ordered
	 */
	protected static final String QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQname() <em>Qname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQname()
	 * @generated
	 * @ordered
	 */
	protected String qname = QNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KomposePackage.Literals.NAME_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQname() {
		return qname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQname(String newQname) {
		String oldQname = qname;
		qname = newQname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KomposePackage.NAME_REF__QNAME, oldQname, qname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KomposePackage.NAME_REF__QNAME:
				return getQname();
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
			case KomposePackage.NAME_REF__QNAME:
				setQname((String)newValue);
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
			case KomposePackage.NAME_REF__QNAME:
				setQname(QNAME_EDEFAULT);
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
			case KomposePackage.NAME_REF__QNAME:
				return QNAME_EDEFAULT == null ? qname != null : !QNAME_EDEFAULT.equals(qname);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qname: ");
		result.append(qname);
		result.append(')');
		return result.toString();
	}

} //NameRefImpl
