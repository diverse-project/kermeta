/**
 * <copyright>
 * </copyright>
 *
 * $Id: BagImpl.java,v 1.3 2008-09-22 14:48:28 cfaucher Exp $
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

		java.lang.Boolean idLoopCond_64 = false;
		while (!idLoopCond_64) {
			idLoopCond_64 = it.isOff();
			if (idLoopCond_64) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_65 = false;
				idIfCond_65 = elements.contains(elem);

				if (idIfCond_65) {

					java.lang.Boolean idIfCond_66 = false;
					idIfCond_66 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_66) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_67 = false;
		while (!idLoopCond_67) {
			idLoopCond_67 = it.isOff();
			if (idLoopCond_67) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_68 = false;
				idIfCond_68 = this.contains(elem);

				if (idIfCond_68) {

					java.lang.Boolean idIfCond_69 = false;
					idIfCond_69 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_69) {

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

		java.lang.Boolean idIfCond_70 = false;
		idIfCond_70 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_70) {

			java.lang.Boolean idIfCond_71 = false;
			idIfCond_71 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.Collection<G>"), element);

			if (idIfCond_71) {

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
			java.lang.Boolean idLoopCond_72 = false;
			while (!idLoopCond_72) {
				idLoopCond_72 = it.isOff();
				if (idLoopCond_72) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_73 = false;
					idIfCond_73 = this.contains(elem);

					if (idIfCond_73) {

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

		java.lang.Boolean idIfCond_74 = false;
		idIfCond_74 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOf(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_74) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft15 = this.iterator();
				java.lang.Boolean idLoopCond_75 = false;
				while (!idLoopCond_75) {
					idLoopCond_75 = it_ft15.isOff();
					if (idLoopCond_75) {
					} else {

						//BIle:func
						G e_lbdExp15 = it_ft15.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) e_lbdExp15;

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

		G result_ft16 = null;

		G elem_ft16 = null;

		result_ft16 = null;

		{

			kermeta.standard.Iterator<G> it_ft16 = this.iterator();
			java.lang.Boolean idLoopCond_76 = false;
			while (!idLoopCond_76) {
				idLoopCond_76 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft16.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft16, null));
				if (idLoopCond_76) {
				} else {

					elem_ft16 = it_ft16.next();

					java.lang.Boolean idIfCond_77 = false;
					//BIle:detector
					G e_lbdExp16 = elem_ft16;

					idIfCond_77 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equals(e_lbdExp16, element);
					//EIle:detector

					if (idIfCond_77) {

						result_ft16 = elem_ft16;
					}

				}
			}
		}

		//CE
		elem = result_ft16;
		//EIft:detect

		java.lang.Boolean idIfCond_78 = false;
		idIfCond_78 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_78) {

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

		G result_ft17 = null;

		G elem_ft17 = null;

		result_ft17 = null;

		{

			kermeta.standard.Iterator<G> it_ft17 = this.iterator();
			java.lang.Boolean idLoopCond_79 = false;
			while (!idLoopCond_79) {
				idLoopCond_79 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft17.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft17, null));
				if (idLoopCond_79) {
				} else {

					elem_ft17 = it_ft17.next();

					java.lang.Boolean idIfCond_80 = false;
					//BIle:detector
					G e_lbdExp17 = elem_ft17;

					idIfCond_80 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oid(e_lbdExp17), elementOid);
					//EIle:detector

					if (idIfCond_80) {

						result_ft17 = elem_ft17;
					}

				}
			}
		}

		//CE
		elem = result_ft17;
		//EIft:detect

		java.lang.Boolean idIfCond_81 = false;
		idIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_81) {

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
