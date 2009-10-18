/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance.impl;

import ecorewithaspectandInherithance.A;
import ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecorewithaspectandInherithance.impl.AImpl#getFoo <em>Foo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AImpl extends EObjectImpl implements A {
	/**
	 * The default value of the '{@link #getFoo() <em>Foo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoo()
	 * @generated
	 * @ordered
	 */
	protected static final String FOO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoo() <em>Foo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoo()
	 * @generated
	 * @ordered
	 */
	protected String foo = FOO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorewithaspectandInherithancePackage.Literals.A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFoo() {
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoo(String newFoo) {
		String oldFoo = foo;
		foo = newFoo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorewithaspectandInherithancePackage.A__FOO, oldFoo, foo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorewithaspectandInherithancePackage.A__FOO:
				return getFoo();
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
			case EcorewithaspectandInherithancePackage.A__FOO:
				setFoo((String)newValue);
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
			case EcorewithaspectandInherithancePackage.A__FOO:
				setFoo(FOO_EDEFAULT);
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
			case EcorewithaspectandInherithancePackage.A__FOO:
				return FOO_EDEFAULT == null ? foo != null : !FOO_EDEFAULT.equals(foo);
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
		result.append(" (foo: ");
		result.append(foo);
		result.append(')');
		return result.toString();
	}

} //AImpl
