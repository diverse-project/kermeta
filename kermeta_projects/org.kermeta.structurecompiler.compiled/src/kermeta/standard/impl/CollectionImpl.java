/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionImpl.java,v 1.3 2008-09-22 14:48:29 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

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
	protected EList<G> values;

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
	public EList<G> getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(EList<G> newValues) {
		EList<G> oldValues = values;
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

		//BIft:detect

		G result_ft8 = null;

		G elem_ft8 = null;

		result_ft8 = null;

		{

			kermeta.standard.Iterator<G> it_ft8 = this.iterator();
			java.lang.Boolean idLoopCond_34 = false;
			while (!idLoopCond_34) {
				idLoopCond_34 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft8.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft8, null));
				if (idLoopCond_34) {
				} else {

					elem_ft8 = it_ft8.next();

					java.lang.Boolean idIfCond_35 = false;
					//BIle:detector
					G e_lbdExp8 = elem_ft8;

					idIfCond_35 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp8, element);
					//EIle:detector

					if (idIfCond_35) {

						result_ft8 = elem_ft8;
					}

				}
			}
		}

		//CE
		elem = result_ft8;
		//EIft:detect

		java.lang.Boolean idLoopCond_33 = false;
		while (!idLoopCond_33) {
			idLoopCond_33 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equals(elem, null);
			if (idLoopCond_33) {
			} else {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.remove(this, elem);

				//BIft:detect

				G result_ft9 = null;

				G elem_ft9 = null;

				result_ft9 = null;

				{

					kermeta.standard.Iterator<G> it_ft9 = this.iterator();
					java.lang.Boolean idLoopCond_36 = false;
					while (!idLoopCond_36) {
						idLoopCond_36 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft9.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqual(result_ft9, null));
						if (idLoopCond_36) {
						} else {

							elem_ft9 = it_ft9.next();

							java.lang.Boolean idIfCond_37 = false;
							//BIle:detector
							G e_lbdExp9 = elem_ft9;

							idIfCond_37 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.equals(e_lbdExp9, element);
							//EIle:detector

							if (idIfCond_37) {

								result_ft9 = elem_ft9;
							}

						}
					}
				}

				//CE
				elem = result_ft9;
				//EIft:detect

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

		//BIft:select

		kermeta.standard.Sequence<G> result_ft10 = null;

		G elem_ft10 = null;

		result_ft10 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		{

			kermeta.standard.Iterator<G> it_ft10 = this.iterator();
			java.lang.Boolean idLoopCond_38 = false;
			while (!idLoopCond_38) {
				idLoopCond_38 = it_ft10.isOff();
				if (idLoopCond_38) {
				} else {

					elem_ft10 = it_ft10.next();

					java.lang.Boolean idIfCond_39 = false;
					//BIle:selector
					G e_lbdExp10 = elem_ft10;

					idIfCond_39 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp10, element);
					//EIle:selector

					if (idIfCond_39) {

						result_ft10.add(elem_ft10);
					}

				}
			}
		}

		//EIft:select
		result = result_ft10.size();

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

		java.lang.Boolean idIfCond_40 = false;
		idIfCond_40 = kermeta.standard.helper.IntegerWrapper.equals(
				this.size(), 0);

		if (idIfCond_40) {

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

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_41 = false;
			while (!idLoopCond_41) {
				idLoopCond_41 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_41) {
				} else {

					result = this.contains(it.next());
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
	public G sum() {

		G result = null;

		G res = null;

		kermeta.standard.Summable<G> tmp = null;

		G o = null;

		o = this.one();

		tmp = (kermeta.standard.Summable<G>) o;

		result = null;

		java.lang.Boolean idIfCond_42 = false;
		idIfCond_42 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(tmp, null);

		if (idIfCond_42) {

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft11 = this.iterator();
				java.lang.Boolean idLoopCond_43 = false;
				while (!idLoopCond_43) {
					idLoopCond_43 = it_ft11.isOff();
					if (idLoopCond_43) {
					} else {

						//BIle:func
						G elem_lbdExp11 = it_ft11.next();

						o = elem_lbdExp11;

						tmp = (kermeta.standard.Summable<G>) o;

						java.lang.Boolean idIfCond_44 = false;
						idIfCond_44 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(tmp, null);

						if (idIfCond_44) {

							res = tmp.plus(res);
						}

						//EIle:func

					}
				}
			}

			//EIft:each

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

		{

			kermeta.standard.Iterator<G> it = this.iterator();
			java.lang.Boolean idLoopCond_45 = false;
			while (!idLoopCond_45) {
				idLoopCond_45 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), result);
				if (idLoopCond_45) {
				} else {

					result = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(it.next(), element);
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
	public Boolean excludesAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = true;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_46 = false;
			while (!idLoopCond_46) {
				idLoopCond_46 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_46) {
				} else {

					result = kermeta.standard.helper.BooleanWrapper.not(this
							.contains(it.next()));
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
	public void add(G element) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this,
				element);

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

		java.lang.Boolean idIfCond_47 = false;
		idIfCond_47 = kermeta.standard.helper.IntegerWrapper.equals(
				this.size(), 0);

		if (idIfCond_47) {

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

		//BIft:each

		{

			kermeta.standard.Iterator<G> it_ft12 = elements.iterator();
			java.lang.Boolean idLoopCond_48 = false;
			while (!idLoopCond_48) {
				idLoopCond_48 = it_ft12.isOff();
				if (idLoopCond_48) {
				} else {

					//BIle:func
					G element_lbdExp12 = it_ft12.next();

					this.add(element_lbdExp12);
					//EIle:func

				}
			}
		}

		//EIft:each

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
			setValues((EList<G>) newValue);
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
			setValues((EList<G>) null);
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
