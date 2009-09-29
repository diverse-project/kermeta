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

		java.lang.Boolean idLoopCond_245 = false;
		while (!idLoopCond_245) {
			idLoopCond_245 = it.isOff();
			if (idLoopCond_245) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_246 = false;
				idIfCond_246 = elements.contains(elem);

				if (idIfCond_246) {

					java.lang.Boolean idIfCond_247 = false;
					idIfCond_247 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_247) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_248 = false;
		while (!idLoopCond_248) {
			idLoopCond_248 = it.isOff();
			if (idLoopCond_248) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_249 = false;
				idIfCond_249 = this.contains(elem);

				if (idIfCond_249) {

					java.lang.Boolean idIfCond_250 = false;
					idIfCond_250 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_250) {

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
	public Set<G> asSet() {

		kermeta.standard.Set<G> result = null;

		kermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		s.addAll(this);

		result = s;

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

		java.lang.Boolean idIfCond_251 = false;
		idIfCond_251 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_251) {

			java.lang.Boolean idIfCond_252 = false;
			idIfCond_252 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.standard.Collection<G>"),
							element);

			if (idIfCond_252) {

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
	public Bag<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Bag<kermeta.language.structure.Object> result = null;

		kermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		java.lang.Boolean idIfCond_253 = false;
		idIfCond_253 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOfSwitcher(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_253) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//BIft:each

			{

				kermeta.standard.Iterator<G> it_ft66 = this.iterator();
				java.lang.Boolean idLoopCond_254 = false;
				while (!idLoopCond_254) {
					idLoopCond_254 = it_ft66.isOff();
					if (idLoopCond_254) {
					} else {

						//BIle:func
						G e_lbdExp66 = it_ft66.next();

						col = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(e_lbdExp66,
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
	public Set<G> intersectionWithSet(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		G elem = null;

		{

			kermeta.standard.Iterator<G> it = elements.iterator();
			java.lang.Boolean idLoopCond_255 = false;
			while (!idLoopCond_255) {
				idLoopCond_255 = it.isOff();
				if (idLoopCond_255) {
				} else {

					elem = it.next();

					java.lang.Boolean idIfCond_256 = false;
					idIfCond_256 = this.contains(elem);

					if (idIfCond_256) {

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

		G result_ft67 = null;

		G elem_ft67 = null;

		result_ft67 = null;

		{

			kermeta.standard.Iterator<G> it_ft67 = this.iterator();
			java.lang.Boolean idLoopCond_257 = false;
			while (!idLoopCond_257) {
				idLoopCond_257 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft67.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft67, null));
				if (idLoopCond_257) {
				} else {

					elem_ft67 = it_ft67.next();

					java.lang.Boolean idIfCond_258 = false;
					//BIle:detector
					G e_lbdExp67 = elem_ft67;

					idIfCond_258 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(e_lbdExp67, element);
					//EIle:detector

					if (idIfCond_258) {

						result_ft67 = elem_ft67;
					}

				}
			}
		}

		//CE
		elem = result_ft67;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_259 = false;
		idIfCond_259 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_259) {

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

		G result_ft68 = null;

		G elem_ft68 = null;

		result_ft68 = null;

		{

			kermeta.standard.Iterator<G> it_ft68 = this.iterator();
			java.lang.Boolean idLoopCond_260 = false;
			while (!idLoopCond_260) {
				idLoopCond_260 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft68.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft68, null));
				if (idLoopCond_260) {
				} else {

					elem_ft68 = it_ft68.next();

					java.lang.Boolean idIfCond_261 = false;
					//BIle:detector
					G e_lbdExp68 = elem_ft68;

					idIfCond_261 = kermeta.standard.helper.IntegerWrapper
							.equals(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.oidSwitcher(e_lbdExp68),
									elementOid);
					//EIle:detector

					if (idIfCond_261) {

						result_ft68 = elem_ft68;
					}

				}
			}
		}

		//CE
		elem = result_ft68;
		//EIft:detect
		;

		java.lang.Boolean idIfCond_262 = false;
		idIfCond_262 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem, null);

		if (idIfCond_262) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(
					this, elem);
		}

		//PostConditions Checking
		{
			if (org.kermeta.compil.runtime.ExecutionContext.getInstance()
					.mustBeChecked(
							"post__11827093__doesntContainsElementAnymore")) {
				java.lang.Boolean result_post = false;

				//BIft:exists

				java.lang.Boolean result_ft69 = null;

				java.lang.Boolean test_ft69 = false;

				{

					kermeta.standard.Iterator<G> it_ft69 = this.iterator();
					java.lang.Boolean idLoopCond_263 = false;
					while (!idLoopCond_263) {
						idLoopCond_263 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft69.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(test_ft69,
														false));
						if (idLoopCond_263) {
						} else {

							java.lang.Boolean result_lambda_ft69 = null;
							//BIle:func
							G e_lbdExp69 = it_ft69.next();

							result_lambda_ft69 = kermeta.standard.helper.IntegerWrapper
									.equals(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.oidSwitcher(e_lbdExp69),
											elementOid);
							//EIle:func

							test_ft69 = kermeta.standard.helper.BooleanWrapper
									.or(test_ft69, result_lambda_ft69);
						}
					}
				}

				result_ft69 = test_ft69;
				//EIft:exists
				result_post = kermeta.standard.helper.BooleanWrapper
						.not(result_ft69);
				if (!result_post) {
					kermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE
							.createConstraintViolatedPost();
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exp);
				}
			}
		}
	}

} //BagImpl
