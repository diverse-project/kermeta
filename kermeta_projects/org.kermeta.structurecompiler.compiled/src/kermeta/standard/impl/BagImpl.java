/**
 * <copyright>
 * </copyright>
 *
 * $Id: BagImpl.java,v 1.9 2008-11-27 15:49:56 cfaucher Exp $
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

		java.lang.Boolean idLoopCond_808 = false;
		while (!idLoopCond_808) {
			idLoopCond_808 = it.isOff();
			if (idLoopCond_808) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_809 = false;
				idIfCond_809 = elements.contains(elem);

				if (idIfCond_809) {

					java.lang.Boolean idIfCond_810 = false;
					idIfCond_810 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_810) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_811 = false;
		while (!idLoopCond_811) {
			idLoopCond_811 = it.isOff();
			if (idLoopCond_811) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_812 = false;
				idIfCond_812 = this.contains(elem);

				if (idIfCond_812) {

					java.lang.Boolean idIfCond_813 = false;
					idIfCond_813 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_813) {

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

		java.lang.Boolean idIfCond_814 = false;
		idIfCond_814 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_814) {

			java.lang.Boolean idIfCond_815 = false;
			idIfCond_815 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_815) {

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
	public Bag<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Bag<kermeta.language.structure.Object> result = null;

		kermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Bag<kermeta.language.structure.Object>"));

		java.lang.Boolean idIfCond_816 = false;
		idIfCond_816 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_816) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft187 = this.iterator();
				java.lang.Boolean idLoopCond_817 = false;
				while (!idLoopCond_817) {
					idLoopCond_817 = it_ft187.isOff();
					if (idLoopCond_817) {
					} else {

						//BIle:func
						G e_lbdExp187 = it_ft187.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.standard.Collection<kermeta.language.structure.Object>> asTypeOrVoid(
										e_lbdExp187);

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
			java.lang.Boolean idLoopCond_818 = false;
			while (!idLoopCond_818) {
				idLoopCond_818 = it.isOff();
				if (idLoopCond_818) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_819 = false;
					idIfCond_819 = this.contains(elem);

					if (idIfCond_819) {

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

		G result_ft188 = null;

		G elem_ft188 = null;

		result_ft188 = null;

		{

			kermeta.standard.Iterator<G> it_ft188 = this.iterator();
			java.lang.Boolean idLoopCond_820 = false;
			while (!idLoopCond_820) {
				idLoopCond_820 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft188.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft188, null));
				if (idLoopCond_820) {
				} else {

					elem_ft188 = it_ft188.next();

					java.lang.Boolean idIfCond_821 = false;
					//BIle:detector
					G e_lbdExp188 = elem_ft188;

					idIfCond_821 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp188, element);
					//EIle:detector

					if (idIfCond_821) {

						result_ft188 = elem_ft188;
					}

				}
			}
		}

		//CE
		elem = result_ft188;
		//EIft:detect

		java.lang.Boolean idIfCond_822 = false;
		idIfCond_822 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_822) {

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

		G result_ft189 = null;

		G elem_ft189 = null;

		result_ft189 = null;

		{

			kermeta.standard.Iterator<G> it_ft189 = this.iterator();
			java.lang.Boolean idLoopCond_823 = false;
			while (!idLoopCond_823) {
				idLoopCond_823 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft189.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft189, null));
				if (idLoopCond_823) {
				} else {

					elem_ft189 = it_ft189.next();

					java.lang.Boolean idIfCond_824 = false;
					//BIle:detector
					G e_lbdExp189 = elem_ft189;

					idIfCond_824 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oidSwitcher(e_lbdExp189),
									elementOid);
					//EIle:detector

					if (idIfCond_824) {

						result_ft189 = elem_ft189;
					}

				}
			}
		}

		//CE
		elem = result_ft189;
		//EIft:detect

		java.lang.Boolean idIfCond_825 = false;
		idIfCond_825 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_825) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked(
							"post__13636717__doesntContainsElementAnymore")) {
				java.lang.Boolean result_post = false;

				//BIft:exists

				java.lang.Boolean result_ft190 = null;

				java.lang.Boolean test_ft190 = false;

				{

					kermeta.standard.Iterator<G> it_ft190 = this.iterator();
					java.lang.Boolean idLoopCond_826 = false;
					while (!idLoopCond_826) {
						idLoopCond_826 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft190.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(test_ft190,
														false));
						if (idLoopCond_826) {
						} else {

							java.lang.Boolean result_lambda_ft190 = null;
							//BIle:func
							G e_lbdExp190 = it_ft190.next();

							result_lambda_ft190 = kermeta.standard.helper.IntegerWrapper
									.equals(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.oidSwitcher(e_lbdExp190),
											elementOid);
							//EIle:func

							test_ft190 = kermeta.standard.helper.BooleanWrapper
									.or(test_ft190, result_lambda_ft190);
						}
					}
				}

				result_ft190 = test_ft190;
				//EIft:exists
				result_post = kermeta.standard.helper.BooleanWrapper
						.not(result_ft190);
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
