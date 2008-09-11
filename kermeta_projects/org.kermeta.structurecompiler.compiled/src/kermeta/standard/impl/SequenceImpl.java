/**
 * <copyright>
 * </copyright>
 *
 * $Id: SequenceImpl.java,v 1.2 2008-09-11 12:34:51 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.standard.Sequence;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SequenceImpl<G> extends BagImpl<G> implements Sequence<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> subSequence(Integer min, Integer max) {

		kermeta.standard.Sequence<G> result = null;

		result = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		java.lang.Boolean idIfCond_794 = false;
		idIfCond_794 = kermeta.standard.helper.BooleanWrapper
				.and(kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(min, 0),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								max, this.size())),
						kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(
								min, max));

		if (idIfCond_794) {

			kermeta.standard.Iterator<G> it = this.iterator();

			java.lang.Integer i = 0;

			java.lang.Boolean idLoopCond_795 = false;
			while (!idLoopCond_795) {
				idLoopCond_795 = kermeta.standard.helper.IntegerWrapper.equals(
						i, min);
				if (idLoopCond_795) {
				} else {

					it.next();

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}

			java.lang.Boolean idLoopCond_796 = false;
			while (!idLoopCond_796) {
				idLoopCond_796 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.IntegerWrapper.plus(max, 1));
				if (idLoopCond_796) {
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
	public Sequence<G> append(G element) {

		kermeta.standard.Sequence<G> result = null;

		result = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		result.addAll(this);

		result.add(element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> insertAt(Integer index, G element) {

		kermeta.standard.Sequence<G> result = null;

		result = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		result.addAll(this);

		result.addAt(index, element);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> preppend(G element) {

		kermeta.standard.Sequence<G> result = null;

		result = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

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

		java.lang.Boolean idIfCond_797 = false;
		idIfCond_797 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(index,
						0), kermeta.standard.helper.IntegerWrapper
						.isLowerOrEqual(index, this.size()));

		if (idIfCond_797) {

			kermeta.standard.Iterator<G> it = this.iterator();

			{

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);
				java.lang.Boolean idLoopCond_798 = false;
				while (!idLoopCond_798) {
					idLoopCond_798 = kermeta.standard.helper.IntegerWrapper
							.equals(i, index);
					if (idLoopCond_798) {
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
	public void addAt(Integer index, G element) {

		java.lang.Boolean idIfCond_774 = false;
		idIfCond_774 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index, this
						.size()));

		if (idIfCond_774) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.IndexOutOfBound")));

		}

		org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil
				.addAt(this, index, element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAt(Integer index) {

		java.lang.Boolean idIfCond_775 = false;
		idIfCond_775 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_775) {

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

		java.lang.Boolean idIfCond_776 = false;
		idIfCond_776 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_776) {

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

		java.lang.Boolean idIfCond_782 = false;
		idIfCond_782 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_782) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		java.lang.Integer i = 0;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean found = false;

		java.lang.Boolean idLoopCond_783 = false;
		while (!idLoopCond_783) {
			idLoopCond_783 = kermeta.standard.helper.BooleanWrapper.or(found,
					it.isOff());
			if (idLoopCond_783) {
			} else {

				java.lang.Boolean idIfCond_784 = false;
				idIfCond_784 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(element, it.next());

				if (idIfCond_784) {

					found = true;
				} else {

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}

			}
		}

		java.lang.Boolean idIfCond_785 = false;
		idIfCond_785 = found;

		if (idIfCond_785) {

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

		java.lang.Boolean idIfCond_786 = false;
		idIfCond_786 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_786) {

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

		java.lang.Boolean idIfCond_787 = false;
		idIfCond_787 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_787) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		result = this.elementAt(0);

		return result;

	}

} //SequenceImpl
