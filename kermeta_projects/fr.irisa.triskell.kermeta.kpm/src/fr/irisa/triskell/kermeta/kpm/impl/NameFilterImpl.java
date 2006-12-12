/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameFilterImpl.java,v 1.1 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl#getRegexIn <em>Regex In</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl#getRegexOut <em>Regex Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameFilterImpl extends FilterImpl implements NameFilter {
	/**
	 * The default value of the '{@link #getRegexIn() <em>Regex In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexIn()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegexIn() <em>Regex In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexIn()
	 * @generated
	 * @ordered
	 */
	protected String regexIn = REGEX_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegexOut() <em>Regex Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexOut()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegexOut() <em>Regex Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexOut()
	 * @generated
	 * @ordered
	 */
	protected String regexOut = REGEX_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.NAME_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegexIn() {
		return regexIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexIn(String newRegexIn) {
		String oldRegexIn = regexIn;
		regexIn = newRegexIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.NAME_FILTER__REGEX_IN, oldRegexIn, regexIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegexOut() {
		return regexOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexOut(String newRegexOut) {
		String oldRegexOut = regexOut;
		regexOut = newRegexOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.NAME_FILTER__REGEX_OUT, oldRegexOut, regexOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.NAME_FILTER__REGEX_IN:
				return getRegexIn();
			case KpmPackage.NAME_FILTER__REGEX_OUT:
				return getRegexOut();
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
			case KpmPackage.NAME_FILTER__REGEX_IN:
				setRegexIn((String)newValue);
				return;
			case KpmPackage.NAME_FILTER__REGEX_OUT:
				setRegexOut((String)newValue);
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
			case KpmPackage.NAME_FILTER__REGEX_IN:
				setRegexIn(REGEX_IN_EDEFAULT);
				return;
			case KpmPackage.NAME_FILTER__REGEX_OUT:
				setRegexOut(REGEX_OUT_EDEFAULT);
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
			case KpmPackage.NAME_FILTER__REGEX_IN:
				return REGEX_IN_EDEFAULT == null ? regexIn != null : !REGEX_IN_EDEFAULT.equals(regexIn);
			case KpmPackage.NAME_FILTER__REGEX_OUT:
				return REGEX_OUT_EDEFAULT == null ? regexOut != null : !REGEX_OUT_EDEFAULT.equals(regexOut);
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
		result.append(" (regexIn: ");
		result.append(regexIn);
		result.append(", regexOut: ");
		result.append(regexOut);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean apply(Unit unit) {
		return unit.getPath().matches(regexIn);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean apply(IResource resource) {
		return resource.getFullPath().toString().matches(regexIn);
	}

} //NameFilterImpl