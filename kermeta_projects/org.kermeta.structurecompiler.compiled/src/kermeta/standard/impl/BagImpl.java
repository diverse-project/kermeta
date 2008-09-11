/**
 * <copyright>
 * </copyright>
 *
 * $Id: BagImpl.java,v 1.2 2008-09-11 12:34:51 cfaucher Exp $
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

		java.lang.Boolean idLoopCond_756 = false;
		while (!idLoopCond_756) {
			idLoopCond_756 = it.isOff();
			if (idLoopCond_756) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_757 = false;
				idIfCond_757 = elements.contains(elem);

				if (idIfCond_757) {

					java.lang.Boolean idIfCond_758 = false;
					idIfCond_758 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_758) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_759 = false;
		while (!idLoopCond_759) {
			idLoopCond_759 = it.isOff();
			if (idLoopCond_759) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_760 = false;
				idIfCond_760 = this.contains(elem);

				if (idIfCond_760) {

					java.lang.Boolean idIfCond_761 = false;
					idIfCond_761 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_761) {

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

		java.lang.Boolean idIfCond_762 = false;
		idIfCond_762 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_762) {

			java.lang.Boolean idIfCond_763 = false;
			idIfCond_763 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.Collection<G>"), element);

			if (idIfCond_763) {

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
	public Bag<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Bag<kermeta.language.structure.Object> result = null;

		kermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<kermeta.language.structure.Object>"));

		java.lang.Boolean idIfCond_764 = false;
		idIfCond_764 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOf(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_764) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft155 = this.iterator();
				java.lang.Boolean idLoopCond_765 = false;
				while (!idLoopCond_765) {
					idLoopCond_765 = it_ft155.isOff();
					if (idLoopCond_765) {
					} else {

						//BIle:func
						G e_lbdExp155 = it_ft155.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) e_lbdExp155;

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
	public Set<G> intersectionWithSet(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_766 = false;
			while (!idLoopCond_766) {
				idLoopCond_766 = it.isOff();
				if (idLoopCond_766) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_767 = false;
					idIfCond_767 = this.contains(elem);

					if (idIfCond_767) {

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

		G result_ft156 = null;

		G elem_ft156 = null;

		result_ft156 = null;

		{

			kermeta.standard.Iterator<G> it_ft156 = this.iterator();
			java.lang.Boolean idLoopCond_768 = false;
			while (!idLoopCond_768) {
				idLoopCond_768 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft156.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft156, null));
				if (idLoopCond_768) {
				} else {

					elem_ft156 = it_ft156.next();

					java.lang.Boolean idIfCond_769 = false;
					//BIle:detector
					G e_lbdExp156 = elem_ft156;

					idIfCond_769 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp156, element);
					//EIle:detector

					if (idIfCond_769) {

						result_ft156 = elem_ft156;
					}

				}
			}
		}

		//CE
		elem = result_ft156;
		//EIft:detect

		java.lang.Boolean idIfCond_770 = false;
		idIfCond_770 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_770) {

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

		G result_ft157 = null;

		G elem_ft157 = null;

		result_ft157 = null;

		{

			kermeta.standard.Iterator<G> it_ft157 = this.iterator();
			java.lang.Boolean idLoopCond_771 = false;
			while (!idLoopCond_771) {
				idLoopCond_771 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft157.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft157, null));
				if (idLoopCond_771) {
				} else {

					elem_ft157 = it_ft157.next();

					java.lang.Boolean idIfCond_772 = false;
					//BIle:detector
					G e_lbdExp157 = elem_ft157;

					idIfCond_772 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oid(e_lbdExp157), elementOid);
					//EIle:detector

					if (idIfCond_772) {

						result_ft157 = elem_ft157;
					}

				}
			}
		}

		//CE
		elem = result_ft157;
		//EIft:detect

		java.lang.Boolean idIfCond_773 = false;
		idIfCond_773 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_773) {

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
