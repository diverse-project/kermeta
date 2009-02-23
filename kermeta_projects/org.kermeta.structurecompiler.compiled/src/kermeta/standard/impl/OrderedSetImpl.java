/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: OrderedSetImpl.java,v 1.12 2009-02-23 15:26:47 cfaucher Exp $
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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

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

		java.lang.Boolean idIfCond_930 = false;
		idIfCond_930 = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		if (idIfCond_930) {

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

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

		java.lang.Boolean idIfCond_931 = false;
		idIfCond_931 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(index,
						0), kermeta.standard.helper.IntegerWrapper
						.isLowerOrEqual(index, this.size()));

		if (idIfCond_931) {

			kermeta.standard.Iterator<G> it = this.iterator();

			{

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);
				java.lang.Boolean idLoopCond_932 = false;
				while (!idLoopCond_932) {
					idLoopCond_932 = kermeta.standard.helper.IntegerWrapper
							.equals(i, index);
					if (idLoopCond_932) {
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
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getIndexOutOfBound())));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		java.lang.Boolean idIfCond_933 = false;
		idIfCond_933 = kermeta.standard.helper.BooleanWrapper
				.and(kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(min, 0),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								max, this.size())),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								min, max));

		if (idIfCond_933) {

			kermeta.standard.Iterator<G> it = this.iterator();

			java.lang.Integer i = 0;

			java.lang.Boolean idLoopCond_934 = false;
			while (!idLoopCond_934) {
				idLoopCond_934 = kermeta.standard.helper.IntegerWrapper.equals(
						i, min);
				if (idLoopCond_934) {
				} else {

					it.next();

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}

			java.lang.Boolean idLoopCond_935 = false;
			while (!idLoopCond_935) {
				idLoopCond_935 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.IntegerWrapper.plus(max, 1));
				if (idLoopCond_935) {
				} else {

					result.add(it.next());

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		} else {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getIndexOutOfBound())));

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAt(Integer index) {

		java.lang.Boolean idIfCond_916 = false;
		idIfCond_916 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_916) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getIndexOutOfBound())));

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

		java.lang.Boolean idIfCond_918 = false;
		idIfCond_918 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_918) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getEmptyCollection())));

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

		java.lang.Boolean idIfCond_924 = false;
		idIfCond_924 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_924) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getEmptyCollection())));

		}

		java.lang.Integer i = 0;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean found = false;

		java.lang.Boolean idLoopCond_925 = false;
		while (!idLoopCond_925) {
			idLoopCond_925 = kermeta.standard.helper.BooleanWrapper.or(found,
					it.isOff());
			if (idLoopCond_925) {
			} else {

				java.lang.Boolean idIfCond_926 = false;
				idIfCond_926 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(element, it.next());

				if (idIfCond_926) {

					found = true;
				} else {

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}

			}
		}

		java.lang.Boolean idIfCond_927 = false;
		idIfCond_927 = found;

		if (idIfCond_927) {

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

		java.lang.Boolean idIfCond_928 = false;
		idIfCond_928 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_928) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getIndexOutOfBound())));

		}

		result = (G) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil
								.elementAt(this, index), "G");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G first() {

		G result = null;

		java.lang.Boolean idIfCond_929 = false;
		idIfCond_929 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_929) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getEmptyCollection())));

		}

		result = this.elementAt(0);

		return result;

	}

} //OrderedSetImpl
