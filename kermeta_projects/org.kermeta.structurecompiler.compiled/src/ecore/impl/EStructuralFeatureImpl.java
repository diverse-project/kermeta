/**
 * <copyright>
 * </copyright>
 *
 * $Id: EStructuralFeatureImpl.java,v 1.4 2008-09-22 14:44:20 cfaucher Exp $
 */
package ecore.impl;

import ecore.EStructuralFeature;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isTransient <em>Transient</em>}</li>
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
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

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
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

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
	protected static final boolean CHANGEABLE_EDEFAULT = false;

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
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE, oldVolatile,
					volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass getEContainingClass() {
		if (eContainerFeatureID != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)
			return null;
		return (ecore.EClass) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass basicGetEContainingClass() {
		if (eContainerFeatureID != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS)
			return null;
		return (ecore.EClass) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainingClass(
			ecore.EClass newEContainingClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEContainingClass,
				EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainingClass(ecore.EClass newEContainingClass) {
		if (newEContainingClass != eInternalContainer()
				|| (eContainerFeatureID != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS && newEContainingClass != null)) {
			if (EcoreUtil.isAncestor(this, newEContainingClass))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainingClass != null)
				msgs = ((InternalEObject) newEContainingClass).eInverseAdd(
						this, EcorePackage.ECLASS__ESTRUCTURAL_FEATURES,
						ecore.EClass.class, msgs);
			msgs = basicSetEContainingClass(newEContainingClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS,
					newEContainingClass, newEContainingClass));
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
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT, oldTransient,
					transient_));
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
			return basicSetEContainingClass((ecore.EClass) otherEnd, msgs);
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
			return basicSetEContainingClass(null, msgs);
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
		switch (eContainerFeatureID) {
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
			return isVolatile() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			if (resolve)
				return getEContainingClass();
			return basicGetEContainingClass();
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			return getDefaultValueLiteral();
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			return isTransient() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			return isUnsettable() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
			return isDerived() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			return isChangeable() ? Boolean.TRUE : Boolean.FALSE;
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
			setVolatile(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			setEContainingClass((ecore.EClass) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			setDefaultValueLiteral((String) newValue);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			setTransient(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			setUnsettable(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
			setDerived(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			setChangeable(((Boolean) newValue).booleanValue());
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
			setVolatile(VOLATILE_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			setEContainingClass((ecore.EClass) null);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
			return;
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			setTransient(TRANSIENT_EDEFAULT);
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
			return volatile_ != VOLATILE_EDEFAULT;
		case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
			return basicGetEContainingClass() != null;
		case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null
					: !DEFAULT_VALUE_LITERAL_EDEFAULT
							.equals(defaultValueLiteral);
		case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			return transient_ != TRANSIENT_EDEFAULT;
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
		result.append(" (volatile: ");
		result.append(volatile_);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(", transient: ");
		result.append(transient_);
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
