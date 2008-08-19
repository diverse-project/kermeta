/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedCollectionImpl.java,v 1.2 2008-08-19 13:23:03 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.standard.OrderedCollection;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OrderedCollectionImpl<G> extends CollectionImpl<G>
		implements OrderedCollection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.ORDERED_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAt(Integer index, G element) {

		java.lang.Boolean idIfCond_203 = false;
		idIfCond_203 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index, this
						.size()));

		if (idIfCond_203) {

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

		java.lang.Boolean idIfCond_204 = false;
		idIfCond_204 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_204) {

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

		java.lang.Boolean idIfCond_205 = false;
		idIfCond_205 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_205) {

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
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_206 = false;
		idIfCond_206 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_206) {

			java.lang.Boolean idIfCond_207 = false;
			idIfCond_207 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.OrderedCollection<G>"),
							element);

			if (idIfCond_207) {

				kermeta.standard.Collection<G> collection = null;

				collection = (kermeta.standard.Collection<G>) element;

				java.lang.Boolean idIfCond_208 = false;
				idIfCond_208 = kermeta.standard.helper.IntegerWrapper.equals(
						this.size(), collection.size());

				if (idIfCond_208) {

					kermeta.standard.Iterator<G> selfIterator = this.iterator();

					kermeta.standard.Iterator<G> collectionIterator = collection
							.iterator();

					java.lang.Boolean difference = false;

					kermeta.standard.helper.IntegerWrapper.equals(1, 1);
					java.lang.Boolean idLoopCond_209 = false;
					while (!idLoopCond_209) {
						idLoopCond_209 = kermeta.standard.helper.BooleanWrapper
								.or(kermeta.standard.helper.BooleanWrapper.or(
										selfIterator.isOff(),
										collectionIterator.isOff()), difference);
						;
						if (idLoopCond_209) {
						} else {

							java.lang.Boolean idIfCond_210 = false;
							idIfCond_210 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equals(selfIterator.next(),
													collectionIterator.next()));

							if (idIfCond_210) {

								difference = true;
							}

						}
					}

					isEqual = kermeta.standard.helper.BooleanWrapper
							.not(difference);
				}

			}

		}

		result = isEqual;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer indexOf(G element) {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_211 = false;
		idIfCond_211 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_211) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		java.lang.Integer i = 0;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean found = false;

		java.lang.Boolean idLoopCond_212 = false;
		while (!idLoopCond_212) {
			idLoopCond_212 = kermeta.standard.helper.BooleanWrapper.or(found,
					it.isOff());
			;
			if (idLoopCond_212) {
			} else {

				java.lang.Boolean idIfCond_213 = false;
				idIfCond_213 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(element, it.next());

				if (idIfCond_213) {

					found = true;
				} else {

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}

			}
		}

		java.lang.Boolean idIfCond_214 = false;
		idIfCond_214 = found;

		if (idIfCond_214) {

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

		java.lang.Boolean idIfCond_215 = false;
		idIfCond_215 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index,
						kermeta.standard.helper.IntegerWrapper.minus(this
								.size(), 1)));

		if (idIfCond_215) {

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

		java.lang.Boolean idIfCond_216 = false;
		idIfCond_216 = kermeta.standard.helper.IntegerWrapper.equals(this
				.size(), 0);

		if (idIfCond_216) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.EmptyCollection")));

		}

		result = this.elementAt(0);

		return result;

	}

} //OrderedCollectionImpl
