/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.utils.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.Set;

import kermeta.utils.Hashtable;
import kermeta.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hashtable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.utils.impl.HashtableImpl#getWrappedHashtable <em>Wrapped Hashtable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashtableImpl<K, V> extends ObjectImpl implements Hashtable<K, V> {
	/**
	 * The cached value of the '{@link #getWrappedHashtable() <em>Wrapped Hashtable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedHashtable()
	 * @generated
	 * @ordered
	 */
	protected java.util.Hashtable<K, V> wrappedHashtable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashtableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.HASHTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Hashtable<K, V> getWrappedHashtable() {
		return wrappedHashtable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedHashtable(
			java.util.Hashtable<K, V> newWrappedHashtable) {
		java.util.Hashtable<K, V> oldWrappedHashtable = wrappedHashtable;
		wrappedHashtable = newWrappedHashtable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UtilsPackage.HASHTABLE__WRAPPED_HASHTABLE,
					oldWrappedHashtable, wrappedHashtable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V getValue(K key) {

		V result = null;

		result = (V) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.MapUtil
								.get(this, key), "V");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {

		org.kermeta.compil.runtime.helper.basetypes.MapUtil.clear(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean containsKey(K key) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getValue(key), null);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<V> values() {

		kermeta.standard.Collection<V> result = null;

		result = ((kermeta.standard.Bag<V>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		//BIft:each

		{

			kermeta.standard.Iterator<K> it_ft203 = this.keys().iterator();
			java.lang.Boolean idLoopCond_916 = false;
			while (!idLoopCond_916) {
				idLoopCond_916 = it_ft203.isOff();
				if (idLoopCond_916) {
				} else {

					//BIle:func
					K k_lbdExp203 = it_ft203.next();

					result.add(this.getValue(k_lbdExp203));
					//EIle:func

				}
			}
		}

		//EIft:each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void put(K key, V value) {

		org.kermeta.compil.runtime.helper.basetypes.MapUtil.put(this, key,
				value);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(K key) {

		org.kermeta.compil.runtime.helper.basetypes.MapUtil.remove(this, key);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<K> keys() {

		kermeta.standard.Set<K> result = null;

		result = ((kermeta.standard.Set<K>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		{

			kermeta.standard.Iterator<K> it = this.keyIterator();
			java.lang.Boolean idLoopCond_917 = false;
			while (!idLoopCond_917) {
				idLoopCond_917 = it.isOff();
				if (idLoopCond_917) {
				} else {

					result.add(it.next());
				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<K> keyIterator() {

		kermeta.standard.Iterator<K> result = null;

		result = (kermeta.standard.Iterator<K>) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.MapUtil
								.keysIterator(this),
						"kermeta.standard.Iterator<K>");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<V> valueIterator() {

		kermeta.standard.Iterator<V> result = null;

		result = (kermeta.standard.Iterator<V>) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.MapUtil
								.valueIterator(this),
						"kermeta.standard.Iterator<V>");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer size() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.MapUtil
								.size(this), "java.lang.Integer");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UtilsPackage.HASHTABLE__WRAPPED_HASHTABLE:
			return getWrappedHashtable();
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
		case UtilsPackage.HASHTABLE__WRAPPED_HASHTABLE:
			setWrappedHashtable((java.util.Hashtable<K, V>) newValue);
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
		case UtilsPackage.HASHTABLE__WRAPPED_HASHTABLE:
			setWrappedHashtable((java.util.Hashtable<K, V>) null);
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
		case UtilsPackage.HASHTABLE__WRAPPED_HASHTABLE:
			return wrappedHashtable != null;
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
		result.append(" (wrappedHashtable: ");
		result.append(wrappedHashtable);
		result.append(')');
		return result.toString();
	}

} //HashtableImpl
