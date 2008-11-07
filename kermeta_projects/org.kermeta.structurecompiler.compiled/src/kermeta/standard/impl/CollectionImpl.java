/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionImpl.java,v 1.8 2008-11-07 08:53:31 cfaucher Exp $
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

		G result_ft185 = null;

		G elem_ft185 = null;

		result_ft185 = null;

		{

			kermeta.standard.Iterator<G> it_ft185 = this.iterator();
			java.lang.Boolean idLoopCond_830 = false;
			while (!idLoopCond_830) {
				idLoopCond_830 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft185.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft185, null));
				if (idLoopCond_830) {
				} else {

					elem_ft185 = it_ft185.next();

					java.lang.Boolean idIfCond_831 = false;
					//BIle:detector
					G e_lbdExp185 = elem_ft185;

					idIfCond_831 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp185, element);
					//EIle:detector

					if (idIfCond_831) {

						result_ft185 = elem_ft185;
					}

				}
			}
		}

		//CE
		elem = result_ft185;
		//EIft:detect

		java.lang.Boolean idLoopCond_829 = false;
		while (!idLoopCond_829) {
			idLoopCond_829 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(elem, null);
			if (idLoopCond_829) {
			} else {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.remove(this, elem);

				//BIft:detect

				G result_ft186 = null;

				G elem_ft186 = null;

				result_ft186 = null;

				{

					kermeta.standard.Iterator<G> it_ft186 = this.iterator();
					java.lang.Boolean idLoopCond_832 = false;
					while (!idLoopCond_832) {
						idLoopCond_832 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft186.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft186, null));
						if (idLoopCond_832) {
						} else {

							elem_ft186 = it_ft186.next();

							java.lang.Boolean idIfCond_833 = false;
							//BIle:detector
							G e_lbdExp186 = elem_ft186;

							idIfCond_833 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.equalsSwitcher(e_lbdExp186, element);
							//EIle:detector

							if (idIfCond_833) {

								result_ft186 = elem_ft186;
							}

						}
					}
				}

				//CE
				elem = result_ft186;
				//EIft:detect

			}
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked(
							"post__40064167__doesntContainsElementAnymore")) {
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

		kermeta.standard.Sequence<G> result_ft187 = null;

		G elem_ft187 = null;

		result_ft187 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		{

			kermeta.standard.Iterator<G> it_ft187 = this.iterator();
			java.lang.Boolean idLoopCond_834 = false;
			while (!idLoopCond_834) {
				idLoopCond_834 = it_ft187.isOff();
				if (idLoopCond_834) {
				} else {

					elem_ft187 = it_ft187.next();

					java.lang.Boolean idIfCond_835 = false;
					//BIle:selector
					G e_lbdExp187 = elem_ft187;

					idIfCond_835 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp187, element);
					//EIle:selector

					if (idIfCond_835) {

						result_ft187.add(elem_ft187);
					}

				}
			}
		}

		//EIft:select
		result = result_ft187.size();

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

		java.lang.Boolean idIfCond_836 = false;
		idIfCond_836 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_836) {

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
			java.lang.Boolean idLoopCond_837 = false;
			while (!idLoopCond_837) {
				idLoopCond_837 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_837) {
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

		java.lang.Boolean idIfCond_838 = false;
		idIfCond_838 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(tmp, null);

		if (idIfCond_838) {

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft188 = this.iterator();
				java.lang.Boolean idLoopCond_839 = false;
				while (!idLoopCond_839) {
					idLoopCond_839 = it_ft188.isOff();
					if (idLoopCond_839) {
					} else {

						//BIle:func
						G elem_lbdExp188 = it_ft188.next();

						o = elem_lbdExp188;

						tmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.standard.Summable<G>> asTypeOrVoid(o);

						java.lang.Boolean idIfCond_840 = false;
						idIfCond_840 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(tmp, null);

						if (idIfCond_840) {

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
			java.lang.Boolean idLoopCond_841 = false;
			while (!idLoopCond_841) {
				idLoopCond_841 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), result);
				if (idLoopCond_841) {
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
	public Boolean excludesAll(Collection<G> elements) {

		java.lang.Boolean result = null;

		result = true;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_842 = false;
			while (!idLoopCond_842) {
				idLoopCond_842 = kermeta.standard.helper.BooleanWrapper.or(it
						.isOff(), kermeta.standard.helper.BooleanWrapper
						.not(result));
				if (idLoopCond_842) {
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

		java.lang.Boolean idIfCond_843 = false;
		idIfCond_843 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_843) {

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

			kermeta.standard.Iterator<G> it_ft189 = elements.iterator();
			java.lang.Boolean idLoopCond_844 = false;
			while (!idLoopCond_844) {
				idLoopCond_844 = it_ft189.isOff();
				if (idLoopCond_844) {
				} else {

					//BIle:func
					G element_lbdExp189 = it_ft189.next();

					this.add(element_lbdExp189);
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
