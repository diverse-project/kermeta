/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelImpl.java,v 1.6 2008-10-28 13:18:10 cfaucher Exp $
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
		return StructurePackage.eINSTANCE.getModel();
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
				.newObject("kermeta.standard.Set<kermeta.language.structure.Object>"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft115 = objectsToAdd
					.iterator();
			java.lang.Boolean idLoopCond_351 = false;
			while (!idLoopCond_351) {
				idLoopCond_351 = it_ft115.isOff();
				if (idLoopCond_351) {
				} else {

					//BIle:func
					kermeta.language.structure.Object obj_lbdExp115 = it_ft115
							.next();

					kermeta.language.structure.Object addedObject = this
							.addCompatible(obj_lbdExp115);

					java.lang.Boolean idIfCond_352 = false;
					idIfCond_352 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(addedObject));

					if (idIfCond_352) {

						result.add(obj_lbdExp115);
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

		kermeta.standard.Sequence<kermeta.language.structure.Object> result_ft116 = null;

		kermeta.language.structure.Object elem_ft116 = null;

		result_ft116 = ((kermeta.standard.Sequence<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Object>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsOrderedSet(
							this.getContents()).iterator();
			java.lang.Boolean idLoopCond_353 = false;
			while (!idLoopCond_353) {
				idLoopCond_353 = it_ft116.isOff();
				if (idLoopCond_353) {
				} else {

					elem_ft116 = it_ft116.next();

					java.lang.Boolean idIfCond_354 = false;
					//BIle:selector
					kermeta.language.structure.Object o_lbdExp116 = elem_ft116;

					idIfCond_354 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(typeName, o_lbdExp116);
					//EIle:selector

					if (idIfCond_354) {

						result_ft116.add(elem_ft116);
					}

				}
			}
		}

		//EIft:select
		result = result_ft116.asSet();

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
