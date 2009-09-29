/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
	public void add(G element) {

		super.add(element);

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
	public void addAt(Integer index, G element) {

		java.lang.Boolean idIfCond_211 = false;
		idIfCond_211 = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		if (idIfCond_211) {

			kermeta.standard.helper.OrderedCollectionSuper.super_addAt(this,
					index, element);
		}

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
	public G at(Integer index) {

		G result = null;

		java.lang.Boolean idIfCond_212 = false;
		idIfCond_212 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(index,
						0), kermeta.standard.helper.IntegerWrapper
						.isLowerOrEqual(index, this.size()));

		if (idIfCond_212) {

			kermeta.standard.Iterator<G> it = this.iterator();

			{

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);
				java.lang.Boolean idLoopCond_213 = false;
				while (!idLoopCond_213) {
					idLoopCond_213 = kermeta.standard.helper.IntegerWrapper
							.equals(i, index);
					if (idLoopCond_213) {
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
	public OrderedSet<G> subSet(Integer min, Integer max) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		java.lang.Boolean idIfCond_214 = false;
		idIfCond_214 = kermeta.standard.helper.BooleanWrapper
				.and(kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(min, 0),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								max, this.size())),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								min, max));

		if (idIfCond_214) {

			kermeta.standard.Iterator<G> it = this.iterator();

			java.lang.Integer i = 0;

			java.lang.Boolean idLoopCond_215 = false;
			while (!idLoopCond_215) {
				idLoopCond_215 = kermeta.standard.helper.IntegerWrapper.equals(
						i, min);
				if (idLoopCond_215) {
				} else {

					it.next();

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}

			java.lang.Boolean idLoopCond_216 = false;
			while (!idLoopCond_216) {
				idLoopCond_216 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.IntegerWrapper.plus(max, 1));
				if (idLoopCond_216) {
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

		java.lang.Boolean idIfCond_197 = false;
		idIfCond_197 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_197) {

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
	public G elementAt(Integer index) {

		G result = null;

		java.lang.Boolean idIfCond_199 = false;
		idIfCond_199 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_199) {

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
	public G last() {

		G result = null;

		java.lang.Boolean idIfCond_200 = false;
		idIfCond_200 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_200) {

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

		java.lang.Boolean idIfCond_206 = false;
		idIfCond_206 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_206) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getEmptyCollection())));

		}

		java.lang.Integer i = 0;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean found = false;

		java.lang.Boolean idLoopCond_207 = false;
		while (!idLoopCond_207) {
			idLoopCond_207 = kermeta.standard.helper.BooleanWrapper.or(found,
					it.isOff());
			if (idLoopCond_207) {
			} else {

				java.lang.Boolean idIfCond_208 = false;
				idIfCond_208 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equalsSwitcher(element, it.next());

				if (idIfCond_208) {

					found = true;
				} else {

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}

			}
		}

		java.lang.Boolean idIfCond_209 = false;
		idIfCond_209 = found;

		if (idIfCond_209) {

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
	public G first() {

		G result = null;

		java.lang.Boolean idIfCond_210 = false;
		idIfCond_210 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_210) {

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
