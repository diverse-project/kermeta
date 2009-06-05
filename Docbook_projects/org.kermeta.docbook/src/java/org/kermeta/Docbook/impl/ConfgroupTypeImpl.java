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

import org.kermeta.Docbook.ConfgroupType;
import org.kermeta.Docbook.DocbookPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confgroup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ConfgroupTypeImpl#getConftitle <em>Conftitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ConfgroupTypeImpl#getConfnum <em>Confnum</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ConfgroupTypeImpl#getConfsponsor <em>Confsponsor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfgroupTypeImpl extends EObjectImpl implements ConfgroupType {
	/**
	 * The default value of the '{@link #getConftitle() <em>Conftitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConftitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConftitle() <em>Conftitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConftitle()
	 * @generated
	 * @ordered
	 */
	protected String conftitle = CONFTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfnum() <em>Confnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfnum()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfnum() <em>Confnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfnum()
	 * @generated
	 * @ordered
	 */
	protected String confnum = CONFNUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfsponsor() <em>Confsponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfsponsor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFSPONSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfsponsor() <em>Confsponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfsponsor()
	 * @generated
	 * @ordered
	 */
	protected String confsponsor = CONFSPONSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfgroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.CONFGROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConftitle() {
		return conftitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConftitle(String newConftitle) {
		String oldConftitle = conftitle;
		conftitle = newConftitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CONFGROUP_TYPE__CONFTITLE, oldConftitle, conftitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfnum() {
		return confnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfnum(String newConfnum) {
		String oldConfnum = confnum;
		confnum = newConfnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CONFGROUP_TYPE__CONFNUM, oldConfnum, confnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfsponsor() {
		return confsponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfsponsor(String newConfsponsor) {
		String oldConfsponsor = confsponsor;
		confsponsor = newConfsponsor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.CONFGROUP_TYPE__CONFSPONSOR, oldConfsponsor, confsponsor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.CONFGROUP_TYPE__CONFTITLE:
				return getConftitle();
			case DocbookPackage.CONFGROUP_TYPE__CONFNUM:
				return getConfnum();
			case DocbookPackage.CONFGROUP_TYPE__CONFSPONSOR:
				return getConfsponsor();
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
			case DocbookPackage.CONFGROUP_TYPE__CONFTITLE:
				setConftitle((String)newValue);
				return;
			case DocbookPackage.CONFGROUP_TYPE__CONFNUM:
				setConfnum((String)newValue);
				return;
			case DocbookPackage.CONFGROUP_TYPE__CONFSPONSOR:
				setConfsponsor((String)newValue);
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
			case DocbookPackage.CONFGROUP_TYPE__CONFTITLE:
				setConftitle(CONFTITLE_EDEFAULT);
				return;
			case DocbookPackage.CONFGROUP_TYPE__CONFNUM:
				setConfnum(CONFNUM_EDEFAULT);
				return;
			case DocbookPackage.CONFGROUP_TYPE__CONFSPONSOR:
				setConfsponsor(CONFSPONSOR_EDEFAULT);
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
			case DocbookPackage.CONFGROUP_TYPE__CONFTITLE:
				return CONFTITLE_EDEFAULT == null ? conftitle != null : !CONFTITLE_EDEFAULT.equals(conftitle);
			case DocbookPackage.CONFGROUP_TYPE__CONFNUM:
				return CONFNUM_EDEFAULT == null ? confnum != null : !CONFNUM_EDEFAULT.equals(confnum);
			case DocbookPackage.CONFGROUP_TYPE__CONFSPONSOR:
				return CONFSPONSOR_EDEFAULT == null ? confsponsor != null : !CONFSPONSOR_EDEFAULT.equals(confsponsor);
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
		result.append(" (conftitle: ");
		result.append(conftitle);
		result.append(", confnum: ");
		result.append(confnum);
		result.append(", confsponsor: ");
		result.append(confsponsor);
		result.append(')');
		return result.toString();
	}

} //ConfgroupTypeImpl
