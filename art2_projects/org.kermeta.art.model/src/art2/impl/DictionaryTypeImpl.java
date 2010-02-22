/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.DictionaryAttribute;
import art2.DictionaryType;
import art2.DictionaryValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.DictionaryTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link art2.impl.DictionaryTypeImpl#getDefaultValues <em>Default Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DictionaryTypeImpl extends EObjectImpl implements DictionaryType {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DictionaryAttribute> attributes;

	/**
	 * The cached value of the '{@link #getDefaultValues() <em>Default Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DictionaryValue> defaultValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.DICTIONARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DictionaryAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DictionaryAttribute>(DictionaryAttribute.class, this, Art2Package.DICTIONARY_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DictionaryValue> getDefaultValues() {
		if (defaultValues == null) {
			defaultValues = new EObjectContainmentEList<DictionaryValue>(DictionaryValue.class, this, Art2Package.DICTIONARY_TYPE__DEFAULT_VALUES);
		}
		return defaultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.DICTIONARY_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case Art2Package.DICTIONARY_TYPE__DEFAULT_VALUES:
				return ((InternalEList<?>)getDefaultValues()).basicRemove(otherEnd, msgs);
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
			case Art2Package.DICTIONARY_TYPE__ATTRIBUTES:
				return getAttributes();
			case Art2Package.DICTIONARY_TYPE__DEFAULT_VALUES:
				return getDefaultValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2Package.DICTIONARY_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DictionaryAttribute>)newValue);
				return;
			case Art2Package.DICTIONARY_TYPE__DEFAULT_VALUES:
				getDefaultValues().clear();
				getDefaultValues().addAll((Collection<? extends DictionaryValue>)newValue);
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
			case Art2Package.DICTIONARY_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case Art2Package.DICTIONARY_TYPE__DEFAULT_VALUES:
				getDefaultValues().clear();
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
			case Art2Package.DICTIONARY_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case Art2Package.DICTIONARY_TYPE__DEFAULT_VALUES:
				return defaultValues != null && !defaultValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DictionaryTypeImpl
