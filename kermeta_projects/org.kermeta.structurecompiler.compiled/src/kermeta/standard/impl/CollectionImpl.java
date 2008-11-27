/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionImpl.java,v 1.9 2008-11-27 15:49:56 cfaucher Exp $
 */
package kermeta.standard.impl;

import java.lang.Boolean;
import java.lang.Integer;

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

		G result_ft180 = null;

		G elem_ft180 = null;

		result_ft180 = null;

		{

			kermeta.standard.Iterator<G> it_ft180 = this.iterator();
			java.lang.Boolean idLoopCond_778 = false;
			while (!idLoopCond_778) {
				idLoopCond_778 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft180.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft180, null));
				if (idLoopCond_778) {
				} else {

					elem_ft180 = it_ft180.next();

					java.lang.Boolean idIfCond_779 = false;
					//BIle:detector
					G e_lbdExp180 = elem_ft180;

					idIfCond_779 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp180, element);
					//EIle:detector

					if (idIfCond_779) {

						result_ft180 = elem_ft180;
					}

				}
			}
		}

		//CE
		elem = result_ft180;
		//EIft:detect

		java.lang.Boolean idLoopCond_777 = false;
		while (!idLoopCond_777) {
			idLoopCond_777 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(elem, null);
			if (idLoopCond_777) {
			} else {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.remove(this, elem);

				//BIft:detect

				G result_ft181 = null;

				G elem_ft181 = null;

				result_ft181 = null;

				{

					kermeta.standard.Iterator<G> it_ft181 = this.iterator();
					java.lang.Boolean idLoopCond_780 = false;
					while (!idLoopCond_780) {
						idLoopCond_780 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft181.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft181, null));
						if (idLoopCond_780) {
						} else {

							elem_ft181 = it_ft181.next();

							java.lang.Boolean idIfCond_781 = false;
							//BIle:detector
							G e_lbdExp181 = elem_ft181;

							idIfCond_781 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.equalsSwitcher(e_lbdExp181, element);
							//EIle:detector

							if (idIfCond_781) {

								result_ft181 = elem_ft181;
							}

						}
					}
				}

				//CE
				elem = result_ft181;
				//EIft:detect

			}
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked(
							"post__13634816__doesntContainsElementAnymore")) {
				java.lang.Boolean result_post = false;

				result_post = kermeta.standard.helper.BooleanWrapper.not(this
						.contains(element));
				if (!result_post) {
					kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPost();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
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

		kermeta.standard.Sequence<G> result_ft182 = null;

		G elem_ft182 = null;

		result_ft182 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		{

			kermeta.standard.Iterator<G> it_ft182 = this.iterator();
			java.lang.Boolean idLoopCond_782 = false;
			while (!idLoopCond_782) {
				idLoopCond_782 = it_ft182.isOff();
				if (idLoopCond_782) {
				} else {

					elem_ft182 = it_ft182.next();

					java.lang.Boolean idIfCond_783 = false;
					//BIle:selector
					G e_lbdExp182 = elem_ft182;

					idIfCond_783 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp182, element);
					//EIle:selector

					if (idIfCond_783) {

						result_ft182.add(elem_ft182);
					}

				}
			}
		}

		//EIft:select
		result = result_ft182.size();

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

		java.lang.Boolean idIfCond_784 = false;
		idIfCond_784 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_784) {

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
			java.lang.Boolean idLoopCond_785 = false;
			while (!idLoopCond_785) {
				idLoopCond_785 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_785) {
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

		tmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<kermeta.standard.Summable<G>> asTypeOrVoid(o);

		result = null;

		java.lang.Boolean idIfCond_786 = false;
		idIfCond_786 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(tmp, null);

		if (idIfCond_786) {

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft183 = this.iterator();
				java.lang.Boolean idLoopCond_787 = false;
				while (!idLoopCond_787) {
					idLoopCond_787 = it_ft183.isOff();
					if (idLoopCond_787) {
					} else {

						//BIle:func
						G elem_lbdExp183 = it_ft183.next();

						o = elem_lbdExp183;

						tmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.standard.Summable<G>> asTypeOrVoid(o);

						java.lang.Boolean idIfCond_788 = false;
						idIfCond_788 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(tmp, null);

						if (idIfCond_788) {

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
			java.lang.Boolean idLoopCond_789 = false;
			while (!idLoopCond_789) {
				idLoopCond_789 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), result);
				if (idLoopCond_789) {
				} else {

					result = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(it.next(), element);
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
	public Boolean excludesAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = true;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_790 = false;
			while (!idLoopCond_790) {
				idLoopCond_790 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_790) {
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
	public void add(G element) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this,
				element);

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

		java.lang.Boolean idIfCond_791 = false;
		idIfCond_791 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_791) {

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

			kermeta.standard.Iterator<G> it_ft184 = elements.iterator();
			java.lang.Boolean idLoopCond_792 = false;
			while (!idLoopCond_792) {
				idLoopCond_792 = it_ft184.isOff();
				if (idLoopCond_792) {
				} else {

					//BIle:func
					G element_lbdExp184 = it_ft184.next();

					this.add(element_lbdExp184);
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

		result = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<java.lang.Integer> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.size(this));

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
