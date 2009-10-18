/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance.impl;

import ecorewithaspectandInherithance.B;
import ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecorewithaspectandInherithance.impl.BImpl#getBar <em>Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BImpl extends AImpl implements B {
	/**
	 * The default value of the '{@link #getBar() <em>Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBar()
	 * @generated
	 * @ordered
	 */
	protected static final int BAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBar() <em>Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBar()
	 * @generated
	 * @ordered
	 */
	protected int bar = BAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorewithaspectandInherithancePackage.Literals.B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBar() {
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBar(int newBar) {
		int oldBar = bar;
		bar = newBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorewithaspectandInherithancePackage.B__BAR, oldBar, bar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorewithaspectandInherithancePackage.B__BAR:
				return getBar();
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
			case EcorewithaspectandInherithancePackage.B__BAR:
				setBar((Integer)newValue);
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
			case EcorewithaspectandInherithancePackage.B__BAR:
				setBar(BAR_EDEFAULT);
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
			case EcorewithaspectandInherithancePackage.B__BAR:
				return bar != BAR_EDEFAULT;
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
		result.append(" (bar: ");
		result.append(bar);
		result.append(')');
		return result.toString();
	}

} //BImpl
