/**
 * <copyright>
 * </copyright>
 *
 * $Id: HashtableImpl.java,v 1.2 2008-08-19 13:22:58 cfaucher Exp $
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

		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<K> it_ft57 = this.keys().iterator();
		java.lang.Boolean idLoopCond_288 = false;
		while (!idLoopCond_288) {
			idLoopCond_288 = it_ft57.isOff();
			;
			if (idLoopCond_288) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				K k = it_ft57.next();

				result.add(this.getValue(k));
				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

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

		kermeta.standard.Iterator<K> it = this.keyIterator();
		java.lang.Boolean idLoopCond_289 = false;
		while (!idLoopCond_289) {
			idLoopCond_289 = it.isOff();
			;
			if (idLoopCond_289) {
			} else {

				result.add(it.next());
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
