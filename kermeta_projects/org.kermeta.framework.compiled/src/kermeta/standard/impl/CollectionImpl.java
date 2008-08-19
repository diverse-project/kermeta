/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionImpl.java,v 1.2 2008-08-19 13:23:03 cfaucher Exp $
 */
package kermeta.standard.impl;

import java.util.ArrayList;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.standard.impl.CollectionImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CollectionImpl<G> extends ObjectImpl implements
		Collection<G> {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<G> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<G> getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(ArrayList<G> newValues) {
		ArrayList<G> oldValues = values;
		values = newValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StandardPackage.COLLECTION__VALUES, oldValues, values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(G element) {

		G elem = null;

		elem = null;
		//Beginning of the Inlining of the function type: detect

		G result_ft27 = null;

		G elem_ft27 = null;

		result_ft27 = null;

		kermeta.standard.Iterator<G> it_ft27 = this.iterator();
		java.lang.Boolean idLoopCond_155 = false;
		while (!idLoopCond_155) {
			idLoopCond_155 = kermeta.standard.helper.BooleanWrapper.or(it_ft27
					.isOff(),
					org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(result_ft27, null));
			;
			if (idLoopCond_155) {
			} else {

				elem_ft27 = it_ft27.next();

				java.lang.Boolean idIfCond_156 = false;
				//Beginning of the Inlining of the lambda expression: detector
				G e = elem_ft27;

				idIfCond_156 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(e, element);
				//End of the Inlining of the lambda expression: detector

				if (idIfCond_156) {

					result_ft27 = elem_ft27;
				}

			}
		}
		//End of the Inlining of the function type: detect

		java.lang.Boolean idLoopCond_154 = false;
		while (!idLoopCond_154) {
			idLoopCond_154 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equals(elem, null);
			;
			if (idLoopCond_154) {
			} else {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.remove(this, elem);

				elem = null;
				//Beginning of the Inlining of the function type: detect

				G result_ft28 = null;

				G elem_ft28 = null;

				result_ft28 = null;

				kermeta.standard.Iterator<G> it_ft28 = this.iterator();
				java.lang.Boolean idLoopCond_157 = false;
				while (!idLoopCond_157) {
					idLoopCond_157 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft28.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft28, null));
					;
					if (idLoopCond_157) {
					} else {

						elem_ft28 = it_ft28.next();

						java.lang.Boolean idIfCond_158 = false;
						//Beginning of the Inlining of the lambda expression: detector
						G e = elem_ft28;

						idIfCond_158 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(e, element);
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_158) {

							result_ft28 = elem_ft28;
						}

					}
				}
				//End of the Inlining of the function type: detect

			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer count(G element) {

		java.lang.Integer result = null;

		//Beginning of the Inlining of the function type: select

		kermeta.standard.Sequence<G> result_ft29 = null;

		G elem_ft29 = null;

		result_ft29 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		kermeta.standard.Iterator<G> it_ft29 = this.iterator();
		java.lang.Boolean idLoopCond_159 = false;
		while (!idLoopCond_159) {
			idLoopCond_159 = it_ft29.isOff();
			;
			if (idLoopCond_159) {
			} else {

				elem_ft29 = it_ft29.next();

				java.lang.Boolean idIfCond_160 = false;
				//Beginning of the Inlining of the lambda expression: selector
				G e = elem_ft29;

				idIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(e, element);
				//End of the Inlining of the lambda expression: selector

				if (idIfCond_160) {

					result_ft29.add(elem_ft29);
				}

			}
		}
		//End of the Inlining of the function type: select
		result = result_ft29.size();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean excludes(G element) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G one() {

		G result = null;

		java.lang.Boolean idIfCond_161 = false;
		idIfCond_161 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_161) {

			result = null;
		} else {

			kermeta.standard.Iterator<G> it = this.iterator();

			result = it.next();
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean containsAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = true;

		kermeta.standard.Iterator<G> it = elements.iterator();
		java.lang.Boolean idLoopCond_162 = false;
		while (!idLoopCond_162) {
			idLoopCond_162 = kermeta.standard.helper.BooleanWrapper.or(it
					.isOff(), kermeta.standard.helper.BooleanWrapper
					.not(result));
			;
			if (idLoopCond_162) {
			} else {

				result = this.contains(it.next());
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G sum() {

		G result = null;

		G res = null;

		kermeta.standard.Summable<G> tmp = null;

		G o = null;

		o = this.one();

		tmp = (kermeta.standard.Summable<G>) o;

		result = null;

		java.lang.Boolean idIfCond_163 = false;
		idIfCond_163 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(tmp, null);

		if (idIfCond_163) {

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<G> it_ft30 = this.iterator();
			java.lang.Boolean idLoopCond_164 = false;
			while (!idLoopCond_164) {
				idLoopCond_164 = it_ft30.isOff();
				;
				if (idLoopCond_164) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					G elem = it_ft30.next();

					o = elem;

					tmp = (kermeta.standard.Summable<G>) o;

					java.lang.Boolean idIfCond_165 = false;
					idIfCond_165 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(tmp, null);

					if (idIfCond_165) {

						res = tmp.plus(res);
					}

					//End of the Inlining of the lambda expression: func

				}
			}
			//End of the Inlining of the function type: each

		}

		result = res;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean contains(G element) {

		java.lang.Boolean result = null;

		result = false;

		kermeta.standard.Iterator<G> it = this.iterator();
		java.lang.Boolean idLoopCond_166 = false;
		while (!idLoopCond_166) {
			idLoopCond_166 = kermeta.standard.helper.BooleanWrapper.or(it
					.isOff(), result);
			;
			if (idLoopCond_166) {
			} else {

				result = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(it.next(), element);
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(G element) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this,
				element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> asSequence() {
		kermeta.standard.Sequence<G> result = null;
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean includes(G element) {

		java.lang.Boolean result = null;

		result = this.contains(element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean excludesAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = true;

		kermeta.standard.Iterator<G> it = elements.iterator();
		java.lang.Boolean idLoopCond_167 = false;
		while (!idLoopCond_167) {
			idLoopCond_167 = kermeta.standard.helper.BooleanWrapper.or(it
					.isOff(), kermeta.standard.helper.BooleanWrapper
					.not(result));
			;
			if (idLoopCond_167) {
			} else {

				result = kermeta.standard.helper.BooleanWrapper.not(this
						.contains(it.next()));
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.clear(this);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isEmpty() {

		java.lang.Boolean result = null;

		result = this.empty();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> asBag() {
		kermeta.standard.Bag<G> result = null;
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G any() {

		G result = null;

		java.lang.Boolean idIfCond_168 = false;
		idIfCond_168 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_168) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		kermeta.standard.Iterator<G> it = this.iterator();

		result = it.next();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean empty() {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNotEmpty() {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.BooleanWrapper.not(this.empty());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<G> iterator() {

		kermeta.standard.Iterator<G> result = null;

		result = ((kermeta.standard.Iterator<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Iterator<G>"));

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.iterator(
				this, result);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAll(Collection<G> elements) {

		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<G> it_ft31 = elements.iterator();
		java.lang.Boolean idLoopCond_169 = false;
		while (!idLoopCond_169) {
			idLoopCond_169 = it_ft31.isOff();
			;
			if (idLoopCond_169) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				G element = it_ft31.next();

				this.add(element);
				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean includesAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = this.containsAll(elements);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer size() {

		java.lang.Integer result = null;

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.size(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<G> asOrderedSet() {
		kermeta.standard.OrderedSet<G> result = null;
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> asSet() {
		kermeta.standard.Set<G> result = null;
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
		case StandardPackage.COLLECTION__VALUES:
			return getValues();
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
		case StandardPackage.COLLECTION__VALUES:
			setValues((ArrayList<G>) newValue);
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
		case StandardPackage.COLLECTION__VALUES:
			setValues((ArrayList<G>) null);
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
		case StandardPackage.COLLECTION__VALUES:
			return values != null;
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
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //CollectionImpl
