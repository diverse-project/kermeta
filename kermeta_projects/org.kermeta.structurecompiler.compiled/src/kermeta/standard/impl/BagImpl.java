/**
 * <copyright>
 * </copyright>
 *
 * $Id: BagImpl.java,v 1.8 2008-11-07 08:53:32 cfaucher Exp $
 */
package kermeta.standard.impl;

import java.lang.Boolean;
import java.lang.Integer;

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

		java.lang.Boolean idLoopCond_860 = false;
		while (!idLoopCond_860) {
			idLoopCond_860 = it.isOff();
			if (idLoopCond_860) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_861 = false;
				idIfCond_861 = elements.contains(elem);

				if (idIfCond_861) {

					java.lang.Boolean idIfCond_862 = false;
					idIfCond_862 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_862) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_863 = false;
		while (!idLoopCond_863) {
			idLoopCond_863 = it.isOff();
			if (idLoopCond_863) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_864 = false;
				idIfCond_864 = this.contains(elem);

				if (idIfCond_864) {

					java.lang.Boolean idIfCond_865 = false;
					idIfCond_865 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_865) {

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

		java.lang.Boolean idIfCond_866 = false;
		idIfCond_866 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_866) {

			java.lang.Boolean idIfCond_867 = false;
			idIfCond_867 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_867) {

				kermeta.standard.Bag<G> collection = null;

				collection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.ExecutionContext
						.getInstance().<kermeta.standard.Bag<G>> asTypeOrVoid(
								element);

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
			java.lang.Boolean idLoopCond_868 = false;
			while (!idLoopCond_868) {
				idLoopCond_868 = it.isOff();
				if (idLoopCond_868) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_869 = false;
					idIfCond_869 = this.contains(elem);

					if (idIfCond_869) {

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

		java.lang.Boolean idIfCond_870 = false;
		idIfCond_870 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_870) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft192 = this.iterator();
				java.lang.Boolean idLoopCond_871 = false;
				while (!idLoopCond_871) {
					idLoopCond_871 = it_ft192.isOff();
					if (idLoopCond_871) {
					} else {

						//BIle:func
						G e_lbdExp192 = it_ft192.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
										e_lbdExp192);

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

		G result_ft193 = null;

		G elem_ft193 = null;

		result_ft193 = null;

		{

			kermeta.standard.Iterator<G> it_ft193 = this.iterator();
			java.lang.Boolean idLoopCond_872 = false;
			while (!idLoopCond_872) {
				idLoopCond_872 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft193.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft193, null));
				if (idLoopCond_872) {
				} else {

					elem_ft193 = it_ft193.next();

					java.lang.Boolean idIfCond_873 = false;
					//BIle:detector
					G e_lbdExp193 = elem_ft193;

					idIfCond_873 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp193, element);
					//EIle:detector

					if (idIfCond_873) {

						result_ft193 = elem_ft193;
					}

				}
			}
		}

		//CE
		elem = result_ft193;
		//EIft:detect

		java.lang.Boolean idIfCond_874 = false;
		idIfCond_874 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_874) {

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

		G result_ft194 = null;

		G elem_ft194 = null;

		result_ft194 = null;

		{

			kermeta.standard.Iterator<G> it_ft194 = this.iterator();
			java.lang.Boolean idLoopCond_875 = false;
			while (!idLoopCond_875) {
				idLoopCond_875 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft194.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft194, null));
				if (idLoopCond_875) {
				} else {

					elem_ft194 = it_ft194.next();

					java.lang.Boolean idIfCond_876 = false;
					//BIle:detector
					G e_lbdExp194 = elem_ft194;

					idIfCond_876 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oidSwitcher(e_lbdExp194),
									elementOid);
					//EIle:detector

					if (idIfCond_876) {

						result_ft194 = elem_ft194;
					}

				}
			}
		}

		//CE
		elem = result_ft194;
		//EIft:detect

		java.lang.Boolean idIfCond_877 = false;
		idIfCond_877 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_877) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked(
							"post__40066068__doesntContainsElementAnymore")) {
				java.lang.Boolean result_post = false;

				//BIft:exists

				java.lang.Boolean result_ft195 = null;

				java.lang.Boolean test_ft195 = false;

				{

					kermeta.standard.Iterator<G> it_ft195 = this.iterator();
					java.lang.Boolean idLoopCond_878 = false;
					while (!idLoopCond_878) {
						idLoopCond_878 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft195.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(test_ft195,
														false));
						if (idLoopCond_878) {
						} else {

							java.lang.Boolean result_lambda_ft195 = null;
							//BIle:func
							G e_lbdExp195 = it_ft195.next();

							result_lambda_ft195 = kermeta.standard.helper.IntegerWrapper
									.equals(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.oidSwitcher(e_lbdExp195),
											elementOid);
							//EIle:func

							test_ft195 = kermeta.standard.helper.BooleanWrapper
									.or(test_ft195, result_lambda_ft195);
						}
					}
				}

				result_ft195 = test_ft195;
				//EIft:exists
				result_post = kermeta.standard.helper.BooleanWrapper
						.not(result_ft195);
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
	public Set<G> asSet() {

		kermeta.standard.Set<G> result = null;

		kermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		s.addAll(this);

		result = s;

		return result;

	}

} //BagImpl
