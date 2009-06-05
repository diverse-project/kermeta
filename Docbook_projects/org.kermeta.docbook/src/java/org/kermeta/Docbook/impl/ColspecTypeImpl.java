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

import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.DocbookPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colspec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ColspecTypeImpl#getColname <em>Colname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ColspecTypeImpl#getColwidth <em>Colwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColspecTypeImpl extends EObjectImpl implements ColspecType {
	/**
	 * The default value of the '{@link #getColname() <em>Colname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColname()
	 * @generated
	 * @ordered
	 */
	protected static final String COLNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColname() <em>Colname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColname()
	 * @generated
	 * @ordered
	 */
	protected String colname = COLNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColwidth() <em>Colwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String COLWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColwidth() <em>Colwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColwidth()
	 * @generated
	 * @ordered
	 */
	protected String colwidth = COLWIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColspecTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.COLSPEC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColname() {
		return colname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColname(String newColname) {
		String oldColname = colname;
		colname = newColname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.COLSPEC_TYPE__COLNAME, oldColname, colname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColwidth() {
		return colwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColwidth(String newColwidth) {
		String oldColwidth = colwidth;
		colwidth = newColwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.COLSPEC_TYPE__COLWIDTH, oldColwidth, colwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.COLSPEC_TYPE__COLNAME:
				return getColname();
			case DocbookPackage.COLSPEC_TYPE__COLWIDTH:
				return getColwidth();
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
			case DocbookPackage.COLSPEC_TYPE__COLNAME:
				setColname((String)newValue);
				return;
			case DocbookPackage.COLSPEC_TYPE__COLWIDTH:
				setColwidth((String)newValue);
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
			case DocbookPackage.COLSPEC_TYPE__COLNAME:
				setColname(COLNAME_EDEFAULT);
				return;
			case DocbookPackage.COLSPEC_TYPE__COLWIDTH:
				setColwidth(COLWIDTH_EDEFAULT);
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
			case DocbookPackage.COLSPEC_TYPE__COLNAME:
				return COLNAME_EDEFAULT == null ? colname != null : !COLNAME_EDEFAULT.equals(colname);
			case DocbookPackage.COLSPEC_TYPE__COLWIDTH:
				return COLWIDTH_EDEFAULT == null ? colwidth != null : !COLWIDTH_EDEFAULT.equals(colwidth);
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
		result.append(" (colname: ");
		result.append(colname);
		result.append(", colwidth: ");
		result.append(colwidth);
		result.append(')');
		return result.toString();
	}

} //ColspecTypeImpl
