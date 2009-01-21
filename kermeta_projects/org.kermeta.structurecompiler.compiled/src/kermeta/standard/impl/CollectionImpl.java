/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionImpl.java,v 1.10 2009-01-21 09:15:58 cfaucher Exp $
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
	public Integer count(G element) {

		java.lang.Integer result = null;

		//BIft:select

		kermeta.standard.Sequence<G> result_ft154 = null;

		G elem_ft154 = null;

		result_ft154 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<G> it_ft154 = this.iterator();
			java.lang.Boolean idLoopCond_687 = false;
			while (!idLoopCond_687) {
				idLoopCond_687 = it_ft154.isOff();
				if (idLoopCond_687) {
				} else {

					elem_ft154 = it_ft154.next();

					java.lang.Boolean idIfCond_688 = false;
					//BIle:selector
					G e_lbdExp154 = elem_ft154;

					idIfCond_688 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp154, element);
					//EIle:selector

					if (idIfCond_688) {

						result_ft154.add(elem_ft154);
					}

				}
			}
		}

		//EIft:select
		result = result_ft154.size();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(G element) {

		G elem = null;

		//BIft:detect

		G result_ft155 = null;

		G elem_ft155 = null;

		result_ft155 = null;

		{

			kermeta.standard.Iterator<G> it_ft155 = this.iterator();
			java.lang.Boolean idLoopCond_690 = false;
			while (!idLoopCond_690) {
				idLoopCond_690 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft155.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft155, null));
				if (idLoopCond_690) {
				} else {

					elem_ft155 = it_ft155.next();

					java.lang.Boolean idIfCond_691 = false;
					//BIle:detector
					G e_lbdExp155 = elem_ft155;

					idIfCond_691 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp155, element);
					//EIle:detector

					if (idIfCond_691) {

						result_ft155 = elem_ft155;
					}

				}
			}
		}

		//CE
		elem = result_ft155;
		//EIft:detect

		java.lang.Boolean idLoopCond_689 = false;
		while (!idLoopCond_689) {
			idLoopCond_689 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(elem, null);
			if (idLoopCond_689) {
			} else {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.remove(this, elem);

				//BIft:detect

				G result_ft156 = null;

				G elem_ft156 = null;

				result_ft156 = null;

				{

					kermeta.standard.Iterator<G> it_ft156 = this.iterator();
					java.lang.Boolean idLoopCond_692 = false;
					while (!idLoopCond_692) {
						idLoopCond_692 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft156.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft156, null));
						if (idLoopCond_692) {
						} else {

							elem_ft156 = it_ft156.next();

							java.lang.Boolean idIfCond_693 = false;
							//BIle:detector
							G e_lbdExp156 = elem_ft156;

							idIfCond_693 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.equalsSwitcher(e_lbdExp156, element);
							//EIle:detector

							if (idIfCond_693) {

								result_ft156 = elem_ft156;
							}

						}
					}
				}

				//CE
				elem = result_ft156;
				//EIft:detect

			}
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("post__22614__doesntContainsElementAnymore")) {
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

		java.lang.Boolean idIfCond_694 = false;
		idIfCond_694 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_694) {

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
			java.lang.Boolean idLoopCond_695 = false;
			while (!idLoopCond_695) {
				idLoopCond_695 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_695) {
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

		tmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(o, "kermeta.standard.Summable<G>");

		result = null;

		java.lang.Boolean idIfCond_696 = false;
		idIfCond_696 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(tmp, null);

		if (idIfCond_696) {

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft157 = this.iterator();
				java.lang.Boolean idLoopCond_697 = false;
				while (!idLoopCond_697) {
					idLoopCond_697 = it_ft157.isOff();
					if (idLoopCond_697) {
					} else {

						//BIle:func
						G elem_lbdExp157 = it_ft157.next();

						o = elem_lbdExp157;

						tmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(o, "kermeta.standard.Summable<G>");

						java.lang.Boolean idIfCond_698 = false;
						idIfCond_698 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(tmp, null);

						if (idIfCond_698) {

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
			java.lang.Boolean idLoopCond_699 = false;
			while (!idLoopCond_699) {
				idLoopCond_699 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), result);
				if (idLoopCond_699) {
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
	public Boolean excludesAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = true;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_700 = false;
			while (!idLoopCond_700) {
				idLoopCond_700 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_700) {
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

		java.lang.Boolean idIfCond_701 = false;
		idIfCond_701 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_701) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getEmptyCollection())));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getIterator()));

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

			kermeta.standard.Iterator<G> it_ft158 = elements.iterator();
			java.lang.Boolean idLoopCond_702 = false;
			while (!idLoopCond_702) {
				idLoopCond_702 = it_ft158.isOff();
				if (idLoopCond_702) {
				} else {

					//BIle:func
					G element_lbdExp158 = it_ft158.next();

					this.add(element_lbdExp158);
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

		result = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.size(this), "java.lang.Integer");

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
