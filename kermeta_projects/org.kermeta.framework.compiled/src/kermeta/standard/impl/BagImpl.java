/**
 * <copyright>
 * </copyright>
 *
 * $Id: BagImpl.java,v 1.2 2008-08-19 13:23:03 cfaucher Exp $
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

		java.lang.Boolean idLoopCond_185 = false;
		while (!idLoopCond_185) {
			idLoopCond_185 = it.isOff();
			;
			if (idLoopCond_185) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_186 = false;
				idIfCond_186 = elements.contains(elem);

				if (idIfCond_186) {

					java.lang.Boolean idIfCond_187 = false;
					idIfCond_187 = kermeta.standard.helper.IntegerWrapper
							.isLowerOrEqual(this.count(elem), elements
									.count(elem));

					if (idIfCond_187) {

						result.add(elem);
					}

				}

			}
		}

		it = elements.iterator();

		java.lang.Boolean idLoopCond_188 = false;
		while (!idLoopCond_188) {
			idLoopCond_188 = it.isOff();
			;
			if (idLoopCond_188) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_189 = false;
				idIfCond_189 = this.contains(elem);

				if (idIfCond_189) {

					java.lang.Boolean idIfCond_190 = false;
					idIfCond_190 = kermeta.standard.helper.IntegerWrapper
							.isLower(elements.count(elem), this.count(elem));

					if (idIfCond_190) {

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

		java.lang.Boolean idIfCond_191 = false;
		idIfCond_191 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_191) {

			java.lang.Boolean idIfCond_192 = false;
			idIfCond_192 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.Collection<G>"), element);

			if (idIfCond_192) {

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

		kermeta.standard.Iterator<G> it = elements.iterator();
		java.lang.Boolean idLoopCond_193 = false;
		while (!idLoopCond_193) {
			idLoopCond_193 = it.isOff();
			;
			if (idLoopCond_193) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_194 = false;
				idIfCond_194 = this.contains(elem);

				if (idIfCond_194) {

					result.add(elem);
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

		java.lang.Boolean idIfCond_195 = false;
		idIfCond_195 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOf(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_195) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<G> it_ft34 = this.iterator();
			java.lang.Boolean idLoopCond_196 = false;
			while (!idLoopCond_196) {
				idLoopCond_196 = it_ft34.isOff();
				;
				if (idLoopCond_196) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					G e = it_ft34.next();

					col = (kermeta.standard.Collection<kermeta.language.structure.Object>) e;

					res.addAll(col);
					//End of the Inlining of the lambda expression: func

				}
			}
			//End of the Inlining of the function type: each

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
		//Beginning of the Inlining of the function type: detect

		G result_ft35 = null;

		G elem_ft35 = null;

		result_ft35 = null;

		kermeta.standard.Iterator<G> it_ft35 = this.iterator();
		java.lang.Boolean idLoopCond_197 = false;
		while (!idLoopCond_197) {
			idLoopCond_197 = kermeta.standard.helper.BooleanWrapper.or(it_ft35
					.isOff(),
					org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(result_ft35, null));
			;
			if (idLoopCond_197) {
			} else {

				elem_ft35 = it_ft35.next();

				java.lang.Boolean idIfCond_198 = false;
				//Beginning of the Inlining of the lambda expression: detector
				G e = elem_ft35;

				idIfCond_198 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(e, element);
				//End of the Inlining of the lambda expression: detector

				if (idIfCond_198) {

					result_ft35 = elem_ft35;
				}

			}
		}

		//callElement
		elem = result_ft35;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_199 = false;
		idIfCond_199 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_199) {

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
		//Beginning of the Inlining of the function type: detect

		G result_ft36 = null;

		G elem_ft36 = null;

		result_ft36 = null;

		kermeta.standard.Iterator<G> it_ft36 = this.iterator();
		java.lang.Boolean idLoopCond_200 = false;
		while (!idLoopCond_200) {
			idLoopCond_200 = kermeta.standard.helper.BooleanWrapper.or(it_ft36
					.isOff(),
					org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(result_ft36, null));
			;
			if (idLoopCond_200) {
			} else {

				elem_ft36 = it_ft36.next();

				java.lang.Boolean idIfCond_201 = false;
				//Beginning of the Inlining of the lambda expression: detector
				G e = elem_ft36;

				idIfCond_201 = kermeta.standard.helper.IntegerWrapper.equals(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.oid(e), elementOid);
				//End of the Inlining of the lambda expression: detector

				if (idIfCond_201) {

					result_ft36 = elem_ft36;
				}

			}
		}

		//callElement
		elem = result_ft36;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_202 = false;
		idIfCond_202 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_202) {

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
