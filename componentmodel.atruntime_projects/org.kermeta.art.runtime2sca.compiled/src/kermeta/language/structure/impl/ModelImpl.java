/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import kermeta.language.structure.Model;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;

import kermeta.standard.Collection;
import kermeta.standard.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ModelImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends ObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.language.structure.Object> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Object> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<kermeta.language.structure.Object>(
					kermeta.language.structure.Object.class, this,
					StructurePackage.MODEL__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object addCompatible(
			kermeta.language.structure.Object objectToAdd) {

		kermeta.language.structure.Object result = null;

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Object> convertAsOrderedSet(this
						.getContents());

		result = org.kermeta.compil.runtime.helper.language.ModelUtil
				.addCompatible(this, objectToAdd);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(kermeta.language.structure.Object obj) {

		org.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil
				.remove(contents, obj);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<kermeta.language.structure.Object> addAllCompatible(
			Collection<kermeta.language.structure.Object> objectsToAdd) {

		kermeta.standard.Collection<kermeta.language.structure.Object> result = null;

		result = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft61 = objectsToAdd
					.iterator();
			java.lang.Boolean idLoopCond_261 = false;
			while (!idLoopCond_261) {
				idLoopCond_261 = it_ft61.isOff();
				if (idLoopCond_261) {
				} else {

					//BIle:func
					kermeta.language.structure.Object obj_lbdExp61 = it_ft61
							.next();

					kermeta.language.structure.Object addedObject = this
							.addCompatible(obj_lbdExp61);

					java.lang.Boolean idIfCond_262 = false;
					idIfCond_262 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(addedObject));

					if (idIfCond_262) {

						result.add(obj_lbdExp61);
					}

					//EIle:func

				}
			}
		}

		//EIft:each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(kermeta.language.structure.Object obj) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Object> convertAsOrderedSet(this
						.getContents());

		org.kermeta.compil.runtime.helper.language.ModelUtil.add(this, obj);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<kermeta.language.structure.Object> filter(Type typeName) {

		kermeta.standard.Set<kermeta.language.structure.Object> result = null;

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Object> result_ft62 = null;

		kermeta.language.structure.Object elem_ft62 = null;

		result_ft62 = ((kermeta.standard.Sequence<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsOrderedSet(
							this.getContents()).iterator();
			java.lang.Boolean idLoopCond_263 = false;
			while (!idLoopCond_263) {
				idLoopCond_263 = it_ft62.isOff();
				if (idLoopCond_263) {
				} else {

					elem_ft62 = it_ft62.next();

					java.lang.Boolean idIfCond_264 = false;
					//BIle:selector
					kermeta.language.structure.Object o_lbdExp62 = elem_ft62;

					idIfCond_264 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(typeName, o_lbdExp62);
					//EIle:selector

					if (idIfCond_264) {

						result_ft62.add(elem_ft62);
					}

				}
			}
		}

		//EIft:select
		result = result_ft62.asSet();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.MODEL__CONTENTS:
			return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StructurePackage.MODEL__CONTENTS:
			return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
