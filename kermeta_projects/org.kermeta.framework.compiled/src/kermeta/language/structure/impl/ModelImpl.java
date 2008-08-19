/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelImpl.java,v 1.2 2008-08-19 13:23:06 cfaucher Exp $
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
				.newObject("kermeta.standard.Set<kermeta.language.structure.Object>"));

		//Beginning of the Inlining of the function type: each

		kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft41 = objectsToAdd
				.iterator();
		java.lang.Boolean idLoopCond_248 = false;
		while (!idLoopCond_248) {
			idLoopCond_248 = it_ft41.isOff();
			;
			if (idLoopCond_248) {
			} else {

				//Beginning of the Inlining of the lambda expression: func
				kermeta.language.structure.Object obj = it_ft41.next();

				kermeta.language.structure.Object addedObject = this
						.addCompatible(obj);

				java.lang.Boolean idIfCond_249 = false;
				idIfCond_249 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(addedObject));

				if (idIfCond_249) {

					result.add(obj);
				}

				//End of the Inlining of the lambda expression: func

			}
		}
		//End of the Inlining of the function type: each

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

		//Beginning of the Inlining of the function type: select

		kermeta.standard.Sequence<kermeta.language.structure.Object> result_ft42 = null;

		kermeta.language.structure.Object elem_ft42 = null;

		result_ft42 = ((kermeta.standard.Sequence<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Object>"));

		kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Object> convertAsOrderedSet(
						this.getContents()).iterator();
		java.lang.Boolean idLoopCond_250 = false;
		while (!idLoopCond_250) {
			idLoopCond_250 = it_ft42.isOff();
			;
			if (idLoopCond_250) {
			} else {

				elem_ft42 = it_ft42.next();

				java.lang.Boolean idIfCond_251 = false;
				//Beginning of the Inlining of the lambda expression: selector
				kermeta.language.structure.Object o = elem_ft42;

				idIfCond_251 = org.kermeta.compil.runtime.helper.language.TypeUtil
						.isInstance(typeName, o);
				//End of the Inlining of the lambda expression: selector

				if (idIfCond_251) {

					result_ft42.add(elem_ft42);
				}

			}
		}
		//End of the Inlining of the function type: select
		result = result_ft42.asSet();

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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.MODEL__CONTENTS:
			getContents().clear();
			getContents()
					.addAll(
							(java.util.Collection<? extends kermeta.language.structure.Object>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StructurePackage.MODEL__CONTENTS:
			getContents().clear();
			return;
		}
		super.eUnset(featureID);
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
