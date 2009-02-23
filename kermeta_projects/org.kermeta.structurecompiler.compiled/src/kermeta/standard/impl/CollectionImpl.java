/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CollectionImpl.java,v 1.12 2009-02-23 15:26:47 cfaucher Exp $
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

		G result_ft192 = null;

		G elem_ft192 = null;

		result_ft192 = null;

		{

			kermeta.standard.Iterator<G> it_ft192 = this.iterator();
			java.lang.Boolean idLoopCond_867 = false;
			while (!idLoopCond_867) {
				idLoopCond_867 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft192.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft192, null));
				if (idLoopCond_867) {
				} else {

					elem_ft192 = it_ft192.next();

					java.lang.Boolean idIfCond_868 = false;
					//BIle:detector
					G e_lbdExp192 = elem_ft192;

					idIfCond_868 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp192, element);
					//EIle:detector

					if (idIfCond_868) {

						result_ft192 = elem_ft192;
					}

				}
			}
		}

		//CE
		elem = result_ft192;
		//EIft:detect

		java.lang.Boolean idLoopCond_866 = false;
		while (!idLoopCond_866) {
			idLoopCond_866 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(elem, null);
			if (idLoopCond_866) {
			} else {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.remove(this, elem);

				//BIft:detect

				G result_ft193 = null;

				G elem_ft193 = null;

				result_ft193 = null;

				{

					kermeta.standard.Iterator<G> it_ft193 = this.iterator();
					java.lang.Boolean idLoopCond_869 = false;
					while (!idLoopCond_869) {
						idLoopCond_869 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft193.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft193, null));
						if (idLoopCond_869) {
						} else {

							elem_ft193 = it_ft193.next();

							java.lang.Boolean idIfCond_870 = false;
							//BIle:detector
							G e_lbdExp193 = elem_ft193;

							idIfCond_870 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.equalsSwitcher(e_lbdExp193, element);
							//EIle:detector

							if (idIfCond_870) {

								result_ft193 = elem_ft193;
							}

						}
					}
				}

				//CE
				elem = result_ft193;
				//EIft:detect

			}
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("post__26652__doesntContainsElementAnymore")) {
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

		kermeta.standard.Sequence<G> result_ft194 = null;

		G elem_ft194 = null;

		result_ft194 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<G> it_ft194 = this.iterator();
			java.lang.Boolean idLoopCond_871 = false;
			while (!idLoopCond_871) {
				idLoopCond_871 = it_ft194.isOff();
				if (idLoopCond_871) {
				} else {

					elem_ft194 = it_ft194.next();

					java.lang.Boolean idIfCond_872 = false;
					//BIle:selector
					G e_lbdExp194 = elem_ft194;

					idIfCond_872 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp194, element);
					//EIle:selector

					if (idIfCond_872) {

						result_ft194.add(elem_ft194);
					}

				}
			}
		}

		//EIft:select
		result = result_ft194.size();

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

		java.lang.Boolean idIfCond_873 = false;
		idIfCond_873 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_873) {

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
			java.lang.Boolean idLoopCond_874 = false;
			while (!idLoopCond_874) {
				idLoopCond_874 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_874) {
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

		java.lang.Boolean idIfCond_875 = false;
		idIfCond_875 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(tmp, null);

		if (idIfCond_875) {

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft195 = this.iterator();
				java.lang.Boolean idLoopCond_876 = false;
				while (!idLoopCond_876) {
					idLoopCond_876 = it_ft195.isOff();
					if (idLoopCond_876) {
					} else {

						//BIle:func
						G elem_lbdExp195 = it_ft195.next();

						o = elem_lbdExp195;

						tmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(o, "kermeta.standard.Summable<G>");

						java.lang.Boolean idIfCond_877 = false;
						idIfCond_877 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(tmp, null);

						if (idIfCond_877) {

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
			java.lang.Boolean idLoopCond_878 = false;
			while (!idLoopCond_878) {
				idLoopCond_878 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), result);
				if (idLoopCond_878) {
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
			java.lang.Boolean idLoopCond_879 = false;
			while (!idLoopCond_879) {
				idLoopCond_879 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_879) {
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
	public Sequence<G> asSequence() {
		kermeta.standard.Sequence<G> result = null;

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

		java.lang.Boolean idIfCond_880 = false;
		idIfCond_880 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_880) {

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

			kermeta.standard.Iterator<G> it_ft196 = elements.iterator();
			java.lang.Boolean idLoopCond_881 = false;
			while (!idLoopCond_881) {
				idLoopCond_881 = it_ft196.isOff();
				if (idLoopCond_881) {
				} else {

					//BIle:func
					G element_lbdExp196 = it_ft196.next();

					this.add(element_lbdExp196);
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
