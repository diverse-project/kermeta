/**
 * <copyright>
 * </copyright>
 *
 * $Id: SetImpl.java,v 1.9 2008-11-27 15:49:56 cfaucher Exp $
 */
package kermeta.standard.impl;

import java.lang.Boolean;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SetImpl<G> extends CollectionImpl<G> implements Set<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<G> intersection(Collection<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = this.iterator();
			java.lang.Boolean idLoopCond_793 = false;
			while (!idLoopCond_793) {
				idLoopCond_793 = it.isOff();
				if (idLoopCond_793) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_794 = false;
					idIfCond_794 = elements.contains(elem);

					if (idIfCond_794) {

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
	public Set<G> minus(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = this.iterator();
			java.lang.Boolean idLoopCond_795 = false;
			while (!idLoopCond_795) {
				idLoopCond_795 = it.isOff();
				if (idLoopCond_795) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_796 = false;
					idIfCond_796 = kermeta.standard.helper.BooleanWrapper
							.not(elements.contains(elem));

					if (idIfCond_796) {

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
	public void remove(G element) {

		G elem = null;
		//BIft:detect

		G result_ft185 = null;

		G elem_ft185 = null;

		result_ft185 = null;

		{

			kermeta.standard.Iterator<G> it_ft185 = this.iterator();
			java.lang.Boolean idLoopCond_797 = false;
			while (!idLoopCond_797) {
				idLoopCond_797 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft185.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft185, null));
				if (idLoopCond_797) {
				} else {

					elem_ft185 = it_ft185.next();

					java.lang.Boolean idIfCond_798 = false;
					//BIle:detector
					G e_lbdExp185 = elem_ft185;

					idIfCond_798 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp185, element);
					//EIle:detector

					if (idIfCond_798) {

						result_ft185 = elem_ft185;
					}

				}
			}
		}

		//CE
		elem = result_ft185;
		//EIft:detect

		java.lang.Boolean idIfCond_799 = false;
		idIfCond_799 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_799) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_800 = false;
		idIfCond_800 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_800) {

			java.lang.Boolean idIfCond_801 = false;
			idIfCond_801 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_801) {

				kermeta.standard.Collection<G> collection = null;

				collection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.ExecutionContext
						.getInstance()
						.<kermeta.standard.Collection<G>> asTypeOrVoid(element);

				java.lang.Boolean idIfCond_802 = false;
				idIfCond_802 = kermeta.standard.helper.IntegerWrapper.equals(
						this.size(), collection.size());

				if (idIfCond_802) {

					G elem = null;

					java.lang.Boolean ok = true;

					{

						kermeta.standard.Iterator<G> it = this.iterator();
						java.lang.Boolean idLoopCond_803 = false;
						while (!idLoopCond_803) {
							idLoopCond_803 = kermeta.standard.helper.BooleanWrapper
									.or(
											it.isOff(),
											kermeta.standard.helper.BooleanWrapper
													.not(ok));
							if (idLoopCond_803) {
							} else {

								elem = it.next();

								java.lang.Boolean idIfCond_804 = false;
								idIfCond_804 = kermeta.standard.helper.BooleanWrapper
										.not(collection.contains(elem));

								if (idIfCond_804) {

									ok = false;
								}

							}
						}
					}

					isEqual = ok;
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
	public void add(G element) {

		java.lang.Boolean idIfCond_805 = false;
		idIfCond_805 = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		if (idIfCond_805) {

			super.add(element);
		}

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
	public OrderedSet<G> concatenate(OrderedSet<G> less, OrderedSet<G> pivot,
			OrderedSet<G> greater) {

		kermeta.standard.OrderedSet<G> result = null;

		result = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<G>"));

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
	public Set<G> symmetricDifference(Set<G> s) {

		kermeta.standard.Set<G> result = null;

		kermeta.standard.Set<G> res = s.minus(this);

		result = this.minus(s);

		result.addAll(res);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Set<kermeta.language.structure.Object> result = null;

		kermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Object>"));

		java.lang.Boolean idIfCond_806 = false;
		idIfCond_806 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_806) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft186 = this.iterator();
				java.lang.Boolean idLoopCond_807 = false;
				while (!idLoopCond_807) {
					idLoopCond_807 = it_ft186.isOff();
					if (idLoopCond_807) {
					} else {

						//BIle:func
						G e_lbdExp186 = it_ft186.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
										e_lbdExp186);

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
	public Set<G> union(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		result.addAll(this);

		result.addAll(elements);

		return result;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag<G> unionWithBag(Bag<G> elements) {

		kermeta.standard.Bag<G> result = null;

		result = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<G>"));

		result.addAll(this);

		result.addAll(elements);

		return result;

	}

} //SetImpl
