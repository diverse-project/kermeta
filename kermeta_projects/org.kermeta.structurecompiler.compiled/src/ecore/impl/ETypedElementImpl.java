/**
 * <copyright>
 * </copyright>
 *
 * $Id: ETypedElementImpl.java,v 1.6 2008-10-16 13:17:42 cfaucher Exp $
 */
package ecore.impl;

import ecore.EClassifier;
import ecore.EGenericType;
import ecore.ETypedElement;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.ETypedElementImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ecore.impl.ETypedElementImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link ecore.impl.ETypedElementImpl#getEType <em>EType</em>}</li>
 *   <li>{@link ecore.impl.ETypedElementImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link ecore.impl.ETypedElementImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ecore.impl.ETypedElementImpl#getEGenericType <em>EGeneric Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ETypedElementImpl extends ENamedElementImpl implements
		ETypedElement {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eType;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEGenericType() <em>EGeneric Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericType()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eGenericType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ETYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ETYPED_ELEMENT__LOWER_BOUND, oldLowerBound,
					lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ETYPED_ELEMENT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject) eType;
			eType = (EClassifier) eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.ETYPED_ELEMENT__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEType(EClassifier newEType) {
		EClassifier oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ETYPED_ELEMENT__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ETYPED_ELEMENT__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ETYPED_ELEMENT__UPPER_BOUND, oldUpperBound,
					upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getEGenericType() {
		if (eGenericType != null && eGenericType.eIsProxy()) {
			InternalEObject oldEGenericType = (InternalEObject) eGenericType;
			eGenericType = (EGenericType) eResolveProxy(oldEGenericType);
			if (eGenericType != oldEGenericType) {
				InternalEObject newEGenericType = (InternalEObject) eGenericType;
				NotificationChain msgs = oldEGenericType.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
						null, null);
				if (newEGenericType.eInternalContainer() == null) {
					msgs = newEGenericType
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
							oldEGenericType, eGenericType));
			}
		}
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType basicGetEGenericType() {
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEGenericType(EGenericType newEGenericType,
			NotificationChain msgs) {
		EGenericType oldEGenericType = eGenericType;
		eGenericType = newEGenericType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
					oldEGenericType, newEGenericType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGenericType(EGenericType newEGenericType) {
		if (newEGenericType != eGenericType) {
			NotificationChain msgs = null;
			if (eGenericType != null)
				msgs = ((InternalEObject) eGenericType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
						null, msgs);
			if (newEGenericType != null)
				msgs = ((InternalEObject) newEGenericType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
						null, msgs);
			msgs = basicSetEGenericType(newEGenericType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE,
					newEGenericType, newEGenericType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getterMany() {

		java.lang.Boolean result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getterRequired() {

		java.lang.Boolean result = null;

		return result;

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
		case EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE:
			return basicSetEGenericType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			return new Integer(getLowerBound());
		case EcorePackage.ETYPED_ELEMENT__UNIQUE:
			return isUnique() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ETYPED_ELEMENT__ETYPE:
			if (resolve)
				return getEType();
			return basicGetEType();
		case EcorePackage.ETYPED_ELEMENT__ORDERED:
			return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
		case EcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			return new Integer(getUpperBound());
		case EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE:
			if (resolve)
				return getEGenericType();
			return basicGetEGenericType();
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
		case EcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			setLowerBound(((Integer) newValue).intValue());
			return;
		case EcorePackage.ETYPED_ELEMENT__UNIQUE:
			setUnique(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ETYPED_ELEMENT__ETYPE:
			setEType((EClassifier) newValue);
			return;
		case EcorePackage.ETYPED_ELEMENT__ORDERED:
			setOrdered(((Boolean) newValue).booleanValue());
			return;
		case EcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			setUpperBound(((Integer) newValue).intValue());
			return;
		case EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE:
			setEGenericType((EGenericType) newValue);
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
		case EcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			setLowerBound(LOWER_BOUND_EDEFAULT);
			return;
		case EcorePackage.ETYPED_ELEMENT__UNIQUE:
			setUnique(UNIQUE_EDEFAULT);
			return;
		case EcorePackage.ETYPED_ELEMENT__ETYPE:
			setEType((EClassifier) null);
			return;
		case EcorePackage.ETYPED_ELEMENT__ORDERED:
			setOrdered(ORDERED_EDEFAULT);
			return;
		case EcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			setUpperBound(UPPER_BOUND_EDEFAULT);
			return;
		case EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE:
			setEGenericType((EGenericType) null);
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
		case EcorePackage.ETYPED_ELEMENT__LOWER_BOUND:
			return lowerBound != LOWER_BOUND_EDEFAULT;
		case EcorePackage.ETYPED_ELEMENT__UNIQUE:
			return unique != UNIQUE_EDEFAULT;
		case EcorePackage.ETYPED_ELEMENT__ETYPE:
			return eType != null;
		case EcorePackage.ETYPED_ELEMENT__ORDERED:
			return ordered != ORDERED_EDEFAULT;
		case EcorePackage.ETYPED_ELEMENT__UPPER_BOUND:
			return upperBound != UPPER_BOUND_EDEFAULT;
		case EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE:
			return eGenericType != null;
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", unique: ");
		result.append(unique);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //ETypedElementImpl
