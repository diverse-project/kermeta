/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.OrderedlistType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orderedlist Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.OrderedlistTypeImpl#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.OrderedlistTypeImpl#getInheritnum <em>Inheritnum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderedlistTypeImpl extends EObjectImpl implements OrderedlistType {
	/**
	 * The default value of the '{@link #getContinuation() <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTINUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinuation() <em>Continuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuation()
	 * @generated
	 * @ordered
	 */
	protected String continuation = CONTINUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritnum() <em>Inheritnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritnum()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERITNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritnum() <em>Inheritnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritnum()
	 * @generated
	 * @ordered
	 */
	protected String inheritnum = INHERITNUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedlistTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.ORDEREDLIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContinuation() {
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuation(String newContinuation) {
		String oldContinuation = continuation;
		continuation = newContinuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ORDEREDLIST_TYPE__CONTINUATION, oldContinuation, continuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInheritnum() {
		return inheritnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritnum(String newInheritnum) {
		String oldInheritnum = inheritnum;
		inheritnum = newInheritnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ORDEREDLIST_TYPE__INHERITNUM, oldInheritnum, inheritnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.ORDEREDLIST_TYPE__CONTINUATION:
				return getContinuation();
			case DocbookPackage.ORDEREDLIST_TYPE__INHERITNUM:
				return getInheritnum();
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
			case DocbookPackage.ORDEREDLIST_TYPE__CONTINUATION:
				setContinuation((String)newValue);
				return;
			case DocbookPackage.ORDEREDLIST_TYPE__INHERITNUM:
				setInheritnum((String)newValue);
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
			case DocbookPackage.ORDEREDLIST_TYPE__CONTINUATION:
				setContinuation(CONTINUATION_EDEFAULT);
				return;
			case DocbookPackage.ORDEREDLIST_TYPE__INHERITNUM:
				setInheritnum(INHERITNUM_EDEFAULT);
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
			case DocbookPackage.ORDEREDLIST_TYPE__CONTINUATION:
				return CONTINUATION_EDEFAULT == null ? continuation != null : !CONTINUATION_EDEFAULT.equals(continuation);
			case DocbookPackage.ORDEREDLIST_TYPE__INHERITNUM:
				return INHERITNUM_EDEFAULT == null ? inheritnum != null : !INHERITNUM_EDEFAULT.equals(inheritnum);
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
		result.append(" (continuation: ");
		result.append(continuation);
		result.append(", inheritnum: ");
		result.append(inheritnum);
		result.append(')');
		return result.toString();
	}

} //OrderedlistTypeImpl
