/**
 * <copyright>
 * </copyright>
 *
 * $Id: SetImpl.java,v 1.2 2008-08-19 13:23:03 cfaucher Exp $
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

		kermeta.standard.Iterator<G> it = this.iterator();
		java.lang.Boolean idLoopCond_170 = false;
		while (!idLoopCond_170) {
			idLoopCond_170 = it.isOff();
			;
			if (idLoopCond_170) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_171 = false;
				idIfCond_171 = elements.contains(elem);

				if (idIfCond_171) {

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
	public Set<G> minus(Set<G> elements) {

		kermeta.standard.Set<G> result = null;

		result = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<G>"));

		G elem = null;

		kermeta.standard.Iterator<G> it = this.iterator();
		java.lang.Boolean idLoopCond_172 = false;
		while (!idLoopCond_172) {
			idLoopCond_172 = it.isOff();
			;
			if (idLoopCond_172) {
			} else {

				elem = it.next();

				java.lang.Boolean idIfCond_173 = false;
				idIfCond_173 = kermeta.standard.helper.BooleanWrapper
						.not(elements.contains(elem));

				if (idIfCond_173) {

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
	public void remove(G element) {

		G elem = null;
		//Beginning of the Inlining of the function type: detect

		G result_ft32 = null;

		G elem_ft32 = null;

		result_ft32 = null;

		kermeta.standard.Iterator<G> it_ft32 = this.iterator();
		java.lang.Boolean idLoopCond_174 = false;
		while (!idLoopCond_174) {
			idLoopCond_174 = kermeta.standard.helper.BooleanWrapper.or(it_ft32
					.isOff(),
					org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqual(result_ft32, null));
			;
			if (idLoopCond_174) {
			} else {

				elem_ft32 = it_ft32.next();

				java.lang.Boolean idIfCond_175 = false;
				//Beginning of the Inlining of the lambda expression: detector
				G e = elem_ft32;

				idIfCond_175 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.equals(e, element);
				//End of the Inlining of the lambda expression: detector

				if (idIfCond_175) {

					result_ft32 = elem_ft32;
				}

			}
		}

		//callElement
		elem = result_ft32;
		//End of the Inlining of the function type: detect

		java.lang.Boolean idIfCond_176 = false;
		idIfCond_176 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqual(elem, null);

		if (idIfCond_176) {

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

		java.lang.Boolean idIfCond_177 = false;
		idIfCond_177 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(element));

		if (idIfCond_177) {

			java.lang.Boolean idIfCond_178 = false;
			idIfCond_178 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstance(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.standard.Collection<G>"), element);

			if (idIfCond_178) {

				kermeta.standard.Collection<G> collection = null;

				collection = (kermeta.standard.Collection<G>) element;

				java.lang.Boolean idIfCond_179 = false;
				idIfCond_179 = kermeta.standard.helper.IntegerWrapper.equals(
						this.size(), collection.size());

				if (idIfCond_179) {

					G elem = null;

					java.lang.Boolean ok = true;

					kermeta.standard.Iterator<G> it = this.iterator();
					java.lang.Boolean idLoopCond_180 = false;
					while (!idLoopCond_180) {
						idLoopCond_180 = kermeta.standard.helper.BooleanWrapper
								.or(it.isOff(),
										kermeta.standard.helper.BooleanWrapper
												.not(ok));
						;
						if (idLoopCond_180) {
						} else {

							elem = it.next();

							java.lang.Boolean idIfCond_181 = false;
							idIfCond_181 = kermeta.standard.helper.BooleanWrapper
									.not(collection.contains(elem));

							if (idIfCond_181) {

								ok = false;
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
	public void add(G element) {

		java.lang.Boolean idIfCond_182 = false;
		idIfCond_182 = kermeta.standard.helper.BooleanWrapper.not(this
				.contains(element));

		if (idIfCond_182) {

			//Call of the super operation
			((kermeta.standard.Collection) this).add(element);
		}

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
	public Set<kermeta.language.structure.Object> flatten() {

		kermeta.standard.Set<kermeta.language.structure.Object> result = null;

		kermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Object>"));

		java.lang.Boolean idIfCond_183 = false;
		idIfCond_183 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isKindOf(
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass("G"),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.standard.Collection<kermeta.language.structure.Object>"));

		if (idIfCond_183) {

			kermeta.standard.Collection<kermeta.language.structure.Object> col = null;

			kermeta.language.structure.Object o = null;

			//Beginning of the Inlining of the function type: each

			kermeta.standard.Iterator<G> it_ft33 = this.iterator();
			java.lang.Boolean idLoopCond_184 = false;
			while (!idLoopCond_184) {
				idLoopCond_184 = it_ft33.isOff();
				;
				if (idLoopCond_184) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					G e = it_ft33.next();

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
