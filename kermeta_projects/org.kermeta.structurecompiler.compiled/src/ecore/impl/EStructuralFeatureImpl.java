/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore.impl;

import ecore.EStructuralFeature;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#is_volatile <em>volatile</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#is_transient <em>transient</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EStructuralFeatureImpl extends ETypedElementImpl
		implements EStructuralFeature {
	/**
	 * The default value of the '{@link #is_volatile() <em>volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_volatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is_volatile() <em>volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_volatile()
	 * @generated
	 * @ordered
	 */
	protected boolean _volatile = _VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #is_transient() <em>transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_transient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is_transient() <em>transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is_transient()
	 * @generated
	 * @ordered
	 */
	protected boolean _transient = _TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSETTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected boolean unsettable = UNSETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ESTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is_volatile() {
		return _volatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_volatile(boolean new_volatile) {
		boolean old_volatile = _volatile;
		_volatile = new_volatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE, old_volatile,
					_volatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueLiteral() {
		return defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		String oldDefaultValueLiteral = defaultValueLiteral;
		defaultValueLiteral = newDefaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL,
					oldDefaultValueLiteral, defaultValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass getEContainingClass() {
		if (eContainerFeatureID() != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)
			return null;
		return (ecore.EClass) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass basicGetEContainingClass() {
		if (eContainerFeatureID() != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)
			return null;
		return (ecore.EClass) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is_transient() {
		return _transient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_transient(boolean new_transient) {
		boolean old_transient = _transient;
		_transient = new_transient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT, old_transient,
					_transient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnsettable() {
		return unsettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsettable(boolean newUnsettable) {
		boolean oldUnsettable = unsettable;
		unsettable = newUnsettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE,
					oldUnsettable, unsettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__DERIVED, oldDerived,
					derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeable(boolean newChangeable) {
		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE,
					oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeatureID() {
		java.lang.Integer result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getContainerClass() {
		java.lang.Class result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getterDefaultValue() {

		java.lang.Object result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return eBasicSetContainer(otherEnd,
					EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return eBasicSetContainer(null,
					EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return eInternalContainer().eInverseRemove(this,
					EcorePackage.ECLASS__ESTRUCTURAL_FEATURES,
					ecore.EClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
			return is_volatile();
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			return getDefaultValueLiteral();
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			if (resolve)
				return getEContainingClass();
			return basicGetEContainingClass();
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			return is_transient();
		case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			return isUnsettable();
		case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
			return isDerived();
		case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			return isChangeable();
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
		case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
			set_volatile((Boolean) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			setDefaultValueLiteral((String) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			set_transient((Boolean) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			setUnsettable((Boolean) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
			setDerived((Boolean) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			setChangeable((Boolean) newValue);
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
		case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
			set_volatile(_VOLATILE_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			set_transient(_TRANSIENT_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			setUnsettable(UNSETTABLE_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
			setDerived(DERIVED_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			setChangeable(CHANGEABLE_EDEFAULT);
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
		case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
			return _volatile != _VOLATILE_EDEFAULT;
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null
					: !DEFAULT_VALUE_LITERAL_EDEFAULT
							.equals(defaultValueLiteral);
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return basicGetEContainingClass() != null;
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			return _transient != _TRANSIENT_EDEFAULT;
		case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			return unsettable != UNSETTABLE_EDEFAULT;
		case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
			return derived != DERIVED_EDEFAULT;
		case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			return changeable != CHANGEABLE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_volatile: ");
		result.append(_volatile);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(", _transient: ");
		result.append(_transient);
		result.append(", unsettable: ");
		result.append(unsettable);
		result.append(", derived: ");
		result.append(derived);
		result.append(", changeable: ");
		result.append(changeable);
		result.append(')');
		return result.toString();
	}

} //EStructuralFeatureImpl
