/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: BagImpl.java,v 1.12 2009-02-23 15:26:47 cfaucher Exp $
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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		G elem = null;

		kermeta.standard.Iterator<G> it = this.iterator();

		java.lang.Boolean idLoopCond_897 = false;
		while (!idLoopCond_897) {
			idLoopCond_897 = it.isOff();
			if (idLoopCond_897) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_898 = false;
				idIfCond_898 = elements.contains(elem);

				if (idIfCond_898) {

					java.lang.Boolean idIfCond_899 = false;
					idIfCond_899 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_899) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_900 = false;
		while (!idLoopCond_900) {
			idLoopCond_900 = it.isOff();
			if (idLoopCond_900) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_901 = false;
				idIfCond_901 = this.contains(elem);

				if (idIfCond_901) {

					java.lang.Boolean idIfCond_902 = false;
					idIfCond_902 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_902) {

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

		java.lang.Boolean idIfCond_903 = false;
		idIfCond_903 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_903) {

			java.lang.Boolean idIfCond_904 = false;
			idIfCond_904 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_904) {

				kermeta.standard.Bag<G> collection = null;

				collection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(element, "kermeta.standard.Bag<G>");

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_905 = false;
			while (!idLoopCond_905) {
				idLoopCond_905 = it.isOff();
				if (idLoopCond_905) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_906 = false;
					idIfCond_906 = this.contains(elem);

					if (idIfCond_906) {

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		java.lang.Boolean idIfCond_907 = false;
		idIfCond_907 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_907) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft199 = this.iterator();
				java.lang.Boolean idLoopCond_908 = false;
				while (!idLoopCond_908) {
					idLoopCond_908 = it_ft199.isOff();
					if (idLoopCond_908) {
					} else {

						//BIle:func
						G e_lbdExp199 = it_ft199.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(e_lbdExp199,
										"kermeta.standard.Collection<kermeta.language.structure.Object>");

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

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

		G result_ft200 = null;

		G elem_ft200 = null;

		result_ft200 = null;

		{

			kermeta.standard.Iterator<G> it_ft200 = this.iterator();
			java.lang.Boolean idLoopCond_909 = false;
			while (!idLoopCond_909) {
				idLoopCond_909 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft200.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft200, null));
				if (idLoopCond_909) {
				} else {

					elem_ft200 = it_ft200.next();

					java.lang.Boolean idIfCond_910 = false;
					//BIle:detector
					G e_lbdExp200 = elem_ft200;

					idIfCond_910 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp200, element);
					//EIle:detector

					if (idIfCond_910) {

						result_ft200 = elem_ft200;
					}

				}
			}
		}

		//CE
		elem = result_ft200;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_911 = false;
		idIfCond_911 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_911) {

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

		G result_ft201 = null;

		G elem_ft201 = null;

		result_ft201 = null;

		{

			kermeta.standard.Iterator<G> it_ft201 = this.iterator();
			java.lang.Boolean idLoopCond_912 = false;
			while (!idLoopCond_912) {
				idLoopCond_912 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft201.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft201, null));
				if (idLoopCond_912) {
				} else {

					elem_ft201 = it_ft201.next();

					java.lang.Boolean idIfCond_913 = false;
					//BIle:detector
					G e_lbdExp201 = elem_ft201;

					idIfCond_913 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oidSwitcher(e_lbdExp201),
									elementOid);
					//EIle:detector

					if (idIfCond_913) {

						result_ft201 = elem_ft201;
					}

				}
			}
		}

		//CE
		elem = result_ft201;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_914 = false;
		idIfCond_914 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_914) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked("post__28553__doesntContainsElementAnymore")) {
				java.lang.Boolean result_post = false;

				//BIft:exists

				java.lang.Boolean result_ft202 = null;

				java.lang.Boolean test_ft202 = false;

				{

					kermeta.standard.Iterator<G> it_ft202 = this.iterator();
					java.lang.Boolean idLoopCond_915 = false;
					while (!idLoopCond_915) {
						idLoopCond_915 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft202.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(test_ft202,
														false));
						if (idLoopCond_915) {
						} else {

							java.lang.Boolean result_lambda_ft202 = null;
							//BIle:func
							G e_lbdExp202 = it_ft202.next();

							result_lambda_ft202 = kermeta.standard.helper.IntegerWrapper
									.equals(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.oidSwitcher(e_lbdExp202),
											elementOid);
							//EIle:func

							test_ft202 = kermeta.standard.helper.BooleanWrapper
									.or(test_ft202, result_lambda_ft202);
						}
					}
				}

				result_ft202 = test_ft202;
				//EIft:exists
				result_post = kermeta.standard.helper.BooleanWrapper
						.not(result_ft202);
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
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		s.addAll(this);

		result = s;

		return result;

	}

} //BagImpl
