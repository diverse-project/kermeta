/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.NamedTemplateBinding;
import alfDsl.QualifiedNameWithBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.NamedTemplateBindingImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link alfDsl.impl.NamedTemplateBindingImpl#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedTemplateBindingImpl extends EObjectImpl implements NamedTemplateBinding {
	/**
	 * The default value of the '{@link #getFormal() <em>Formal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormal() <em>Formal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal()
	 * @generated
	 * @ordered
	 */
	protected String formal = FORMAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected QualifiedNameWithBinding actual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedTemplateBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.NAMED_TEMPLATE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormal() {
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(String newFormal) {
		String oldFormal = formal;
		formal = newFormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.NAMED_TEMPLATE_BINDING__FORMAL, oldFormal, formal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedNameWithBinding getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(QualifiedNameWithBinding newActual, NotificationChain msgs) {
		QualifiedNameWithBinding oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL, oldActual, newActual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual(QualifiedNameWithBinding newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL, newActual, newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL:
				return basicSetActual(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__FORMAL:
				return getFormal();
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL:
				return getActual();
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
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__FORMAL:
				setFormal((String)newValue);
				return;
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL:
				setActual((QualifiedNameWithBinding)newValue);
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
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__FORMAL:
				setFormal(FORMAL_EDEFAULT);
				return;
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL:
				setActual((QualifiedNameWithBinding)null);
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
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__FORMAL:
				return FORMAL_EDEFAULT == null ? formal != null : !FORMAL_EDEFAULT.equals(formal);
			case AlfDslPackage.NAMED_TEMPLATE_BINDING__ACTUAL:
				return actual != null;
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
		result.append(" (formal: ");
		result.append(formal);
		result.append(')');
		return result.toString();
	}

} //NamedTemplateBindingImpl
