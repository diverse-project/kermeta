/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.PropertyAdaptationOperator;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Adaptation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl#getAdder <em>Adder</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.PropertyAdaptationOperatorImpl#getRemover <em>Remover</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyAdaptationOperatorImpl extends AdaptationOperatorImpl implements PropertyAdaptationOperator {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Property target;

	/**
	 * The default value of the '{@link #getGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected String getter = GETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected String setter = SETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdder() <em>Adder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdder()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdder() <em>Adder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdder()
	 * @generated
	 * @ordered
	 */
	protected String adder = ADDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemover() <em>Remover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemover()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemover() <em>Remover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemover()
	 * @generated
	 * @ordered
	 */
	protected String remover = REMOVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAdaptationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PROPERTY_ADAPTATION_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Property)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.PROPERTY_ADAPTATION_OPERATOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Property newTarget) {
		Property oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY_ADAPTATION_OPERATOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(String newGetter) {
		String oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY_ADAPTATION_OPERATOR__GETTER, oldGetter, getter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetter() {
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetter(String newSetter) {
		String oldSetter = setter;
		setter = newSetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY_ADAPTATION_OPERATOR__SETTER, oldSetter, setter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdder() {
		return adder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdder(String newAdder) {
		String oldAdder = adder;
		adder = newAdder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY_ADAPTATION_OPERATOR__ADDER, oldAdder, adder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemover() {
		return remover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemover(String newRemover) {
		String oldRemover = remover;
		remover = newRemover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY_ADAPTATION_OPERATOR__REMOVER, oldRemover, remover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__GETTER:
				return getGetter();
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__SETTER:
				return getSetter();
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__ADDER:
				return getAdder();
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__REMOVER:
				return getRemover();
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
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__TARGET:
				setTarget((Property)newValue);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__GETTER:
				setGetter((String)newValue);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__SETTER:
				setSetter((String)newValue);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__ADDER:
				setAdder((String)newValue);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__REMOVER:
				setRemover((String)newValue);
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
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__TARGET:
				setTarget((Property)null);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__GETTER:
				setGetter(GETTER_EDEFAULT);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__SETTER:
				setSetter(SETTER_EDEFAULT);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__ADDER:
				setAdder(ADDER_EDEFAULT);
				return;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__REMOVER:
				setRemover(REMOVER_EDEFAULT);
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
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__TARGET:
				return target != null;
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__GETTER:
				return GETTER_EDEFAULT == null ? getter != null : !GETTER_EDEFAULT.equals(getter);
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__SETTER:
				return SETTER_EDEFAULT == null ? setter != null : !SETTER_EDEFAULT.equals(setter);
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__ADDER:
				return ADDER_EDEFAULT == null ? adder != null : !ADDER_EDEFAULT.equals(adder);
			case StructurePackage.PROPERTY_ADAPTATION_OPERATOR__REMOVER:
				return REMOVER_EDEFAULT == null ? remover != null : !REMOVER_EDEFAULT.equals(remover);
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
		result.append(" (getter: ");
		result.append(getter);
		result.append(", setter: ");
		result.append(setter);
		result.append(", adder: ");
		result.append(adder);
		result.append(", remover: ");
		result.append(remover);
		result.append(')');
		return result.toString();
	}

} //PropertyAdaptationOperatorImpl
