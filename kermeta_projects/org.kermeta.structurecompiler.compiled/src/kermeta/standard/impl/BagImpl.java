/**
 * <copyright>
 * </copyright>
 *
 * $Id: BagImpl.java,v 1.4 2008-10-08 14:37:46 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BagImpl<G> extends CollectionImpl<G> implements Bag<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.BAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> intersection(Bag<G> elements) {

		kermeta.standard.Bag<G> result = null;

		result = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<G>"));

		G elem = null;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean idLoopCond_765 = false;
		while (!idLoopCond_765) {
			idLoopCond_765 = it.isOff();
			if (idLoopCond_765) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_766 = false;
				idIfCond_766 = elements.contains(elem);

				if (idIfCond_766) {

					java.lang.Boolean idIfCond_767 = false;
					idIfCond_767 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_767) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_768 = false;
		while (!idLoopCond_768) {
			idLoopCond_768 = it.isOff();
			if (idLoopCond_768) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_769 = false;
				idIfCond_769 = this.contains(elem);

				if (idIfCond_769) {

					java.lang.Boolean idIfCond_770 = false;
					idIfCond_770 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_770) {

						result.add(elem);
					}

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
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_771 = false;
		idIfCond_771 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_771) {

			java.lang.Boolean idIfCond_772 = false;
			idIfCond_772 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.Collection<G>"), element);

			if (idIfCond_772) {

				kermeta.standard.Bag<G> collection = null;

				collection = (kermeta.standard.Bag<G>) element;

				kermeta.standard.Set<G> selfAsSet = this.asSet();

				isEqual = selfAsSet.equals(collection.asSet());
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
	public Sequence<G> asSequence() {

		kermeta.standard.Sequence<G> result = null;

		kermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		s.addAll(this);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence<G> concatenate(Sequence<G> less, Sequence<G> pivot,
			Sequence<G> greater) {

		kermeta.standard.Sequence<G> result = null;

		result = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<G>"));

		result.addAll(less);

		result.addAll(pivot);

		result.addAll(greater);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> excluding(G object) {

		kermeta.standard.Bag<G> result = null;

		kermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<G>"));

		s.addAll(this);

		s.remove(object);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> intersectionWithSet(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_773 = false;
			while (!idLoopCond_773) {
				idLoopCond_773 = it.isOff();
				if (idLoopCond_773) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_774 = false;
					idIfCond_774 = this.contains(elem);

					if (idIfCond_774) {

						result.add(elem);
					}

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
	public Bag<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Bag<kermeta.language.structure.Object> result = null;

		kermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<kermeta.language.structure.Object>"));

		java.lang.Boolean idIfCond_775 = false;
		idIfCond_775 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOf(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_775) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft180 = this.iterator();
				java.lang.Boolean idLoopCond_776 = false;
				while (!idLoopCond_776) {
					idLoopCond_776 = it_ft180.isOff();
					if (idLoopCond_776) {
					} else {

						//BIle:func
						G e_lbdExp180 = it_ft180.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) e_lbdExp180;

						res.addAll(col);
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
	public OrderedSet<G> asOrderedSet() {

		kermeta.standard.OrderedSet<G> result = null;

		kermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<G>"));

		s.addAll(this);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> including(G object) {

		kermeta.standard.Bag<G> result = null;

		kermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<G>"));

		s.addAll(this);

		s.add(object);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> asBag() {

		kermeta.standard.Bag<G> result = null;

		kermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<G>"));

		s.addAll(this);

		result = s;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> union(Collection<G> elements) {

		kermeta.standard.Bag<G> result = null;

		result = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<G>"));

		result.addAll(this);

		result.addAll(elements);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeOne(G element) {

		G elem = null;
		//BIft:detect

		G result_ft181 = null;

		G elem_ft181 = null;

		result_ft181 = null;

		{

			kermeta.standard.Iterator<G> it_ft181 = this.iterator();
			java.lang.Boolean idLoopCond_777 = false;
			while (!idLoopCond_777) {
				idLoopCond_777 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft181.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft181, null));
				if (idLoopCond_777) {
				} else {

					elem_ft181 = it_ft181.next();

					java.lang.Boolean idIfCond_778 = false;
					//BIle:detector
					G e_lbdExp181 = elem_ft181;

					idIfCond_778 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp181, element);
					//EIle:detector

					if (idIfCond_778) {

						result_ft181 = elem_ft181;
					}

				}
			}
		}

		//CE
		elem = result_ft181;
		//EIft:detect

		java.lang.Boolean idIfCond_779 = false;
		idIfCond_779 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_779) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFromOid(Integer elementOid) {

		G elem = null;
		//BIft:detect

		G result_ft182 = null;

		G elem_ft182 = null;

		result_ft182 = null;

		{

			kermeta.standard.Iterator<G> it_ft182 = this.iterator();
			java.lang.Boolean idLoopCond_780 = false;
			while (!idLoopCond_780) {
				idLoopCond_780 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft182.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft182, null));
				if (idLoopCond_780) {
				} else {

					elem_ft182 = it_ft182.next();

					java.lang.Boolean idIfCond_781 = false;
					//BIle:detector
					G e_lbdExp182 = elem_ft182;

					idIfCond_781 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oid(e_lbdExp182), elementOid);
					//EIle:detector

					if (idIfCond_781) {

						result_ft182 = elem_ft182;
					}

				}
			}
		}

		//CE
		elem = result_ft182;
		//EIft:detect

		java.lang.Boolean idIfCond_782 = false;
		idIfCond_782 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_782) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> asSet() {

		kermeta.standard.Set<G> result = null;

		kermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		s.addAll(this);

		result = s;

		return result;

	}

} //BagImpl
