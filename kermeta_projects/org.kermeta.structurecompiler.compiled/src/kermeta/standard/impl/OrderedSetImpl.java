/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedSetImpl.java,v 1.6 2008-10-28 13:18:17 cfaucher Exp $
 */
package kermeta.standard.impl;

import java.lang.Boolean;
import java.lang.Integer;

import kermeta.standard.OrderedSet;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OrderedSetImpl<G> extends SetImpl<G> implements OrderedSet<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.ORDERED_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<G> append(G element) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<G>"));

		result.addAll(this);

		result.add(element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<G> insertAt(Integer index, G subject) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<G>"));

		result.addAll(this);

		result.addAt(index, subject);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAt(Integer index, G element) {

		java.lang.Boolean idIfCond_837 = false;
		idIfCond_837 = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		if (idIfCond_837) {

			kermeta.standard.helper.OrderedCollectionSuper.super_addAt(this,
					index, element);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = kermeta.standard.helper.OrderedCollectionSuper.super_equals(
				this, element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<G> preppend(G element) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<G>"));

		result.add(element);

		result.addAll(this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G at(Integer index) {

		G result = null;

		java.lang.Boolean idIfCond_838 = false;
		idIfCond_838 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(index,
						0), kermeta.standard.helper.IntegerWrapper
						.isLowerOrEqual(index, this.size()));

		if (idIfCond_838) {

			kermeta.standard.Iterator<G> it = this.iterator();

			{

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);
				java.lang.Boolean idLoopCond_839 = false;
				while (!idLoopCond_839) {
					idLoopCond_839 = kermeta.standard.helper.IntegerWrapper
							.equals(i, index);
					if (idLoopCond_839) {
					} else {

						result = it.next();

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					}
				}
			}

		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IndexOutOfBound")));

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(G element) {

		super.add(element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSet<G> subSet(Integer min, Integer max) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<G>"));

		java.lang.Boolean idIfCond_840 = false;
		idIfCond_840 = kermeta.standard.helper.BooleanWrapper
				.and(kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(min, 0),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								max, this.size())),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								min, max));

		if (idIfCond_840) {

			kermeta.standard.Iterator<G> it = this.iterator();

			java.lang.Integer i = 0;

			java.lang.Boolean idLoopCond_841 = false;
			while (!idLoopCond_841) {
				idLoopCond_841 = kermeta.standard.helper.IntegerWrapper.equals(
						i, min);
				if (idLoopCond_841) {
				} else {

					it.next();

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}

			java.lang.Boolean idLoopCond_842 = false;
			while (!idLoopCond_842) {
				idLoopCond_842 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.IntegerWrapper.plus(max, 1));
				if (idLoopCond_842) {
				} else {

					result.add(it.next());

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IndexOutOfBound")));

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAt(Integer index) {

		java.lang.Boolean idIfCond_824 = false;
		idIfCond_824 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_824) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IndexOutOfBound")));

		}

		org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil
				.removeAt(this, index);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G last() {

		G result = null;

		java.lang.Boolean idIfCond_825 = false;
		idIfCond_825 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_825) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		result = this.elementAt(kermeta.standard.helper.IntegerWrapper.minus(
				this.size(), 1));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer indexOf(G element) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_831 = false;
		idIfCond_831 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_831) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		java.lang.Integer i = 0;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean found = false;

		java.lang.Boolean idLoopCond_832 = false;
		while (!idLoopCond_832) {
			idLoopCond_832 = kermeta.standard.helper.BooleanWrapper.or(found,
					it.isOff());
			if (idLoopCond_832) {
			} else {

				java.lang.Boolean idIfCond_833 = false;
				idIfCond_833 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(element, it.next());

				if (idIfCond_833) {

					found = true;
				} else {

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}

			}
		}

		java.lang.Boolean idIfCond_834 = false;
		idIfCond_834 = found;

		if (idIfCond_834) {

			result = i;
		} else {

			result = kermeta.standard.helper.IntegerWrapper.uminus(1);
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G elementAt(Integer index) {

		G result = null;

		java.lang.Boolean idIfCond_835 = false;
		idIfCond_835 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_835) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IndexOutOfBound")));

		}

		result = (G) org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil
				.elementAt(this, index);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G first() {

		G result = null;

		java.lang.Boolean idIfCond_836 = false;
		idIfCond_836 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_836) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		result = this.elementAt(0);

		return result;

	}

} //OrderedSetImpl
