/**
 * <copyright>
 * </copyright>
 *
 * $Id: HashtableImpl.java,v 1.2 2008-09-11 12:34:51 cfaucher Exp $
 */
package kermeta.utils.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.Set;

import kermeta.utils.Hashtable;
import kermeta.utils.UtilsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hashtable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HashtableImpl<K, V> extends ObjectImpl implements Hashtable<K, V> {
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
	public void clear() {

		org.kermeta.compil.runtime.helper.basetypes.MapUtil.clear(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V getValue(K key) {

		V result = null;

		result = (V) org.kermeta.compil.runtime.helper.basetypes.MapUtil.get(
				this, key);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean containsKey(K key) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(this.getValue(key), null);

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
	public Collection<V> values() {

		kermeta.standard.Collection<V> result = null;

		result = ((kermeta.standard.Bag<V>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<V>"));

		//BIft:each

		{

			kermeta.standard.Iterator<K> it_ft130 = this.keys().iterator();
			java.lang.Boolean idLoopCond_615 = false;
			while (!idLoopCond_615) {
				idLoopCond_615 = it_ft130.isOff();
				if (idLoopCond_615) {
				} else {

					//BIle:func
					K k_lbdExp130 = it_ft130.next();

					result.add(this.getValue(k_lbdExp130));
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
				.newObject("kermeta.standard.Set<K>"));

		{

			kermeta.standard.Iterator<K> it = this.keyIterator();
			java.lang.Boolean idLoopCond_616 = false;
			while (!idLoopCond_616) {
				idLoopCond_616 = it.isOff();
				if (idLoopCond_616) {
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

		result = (kermeta.standard.Iterator<K>) org.kermeta.compil.runtime.helper.basetypes.MapUtil
				.keysIterator(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<V> valueIterator() {

		kermeta.standard.Iterator<V> result = null;

		result = (kermeta.standard.Iterator<V>) org.kermeta.compil.runtime.helper.basetypes.MapUtil
				.valueIterator(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer size() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.MapUtil
				.size(this);

		return result;

	}

} //HashtableImpl
