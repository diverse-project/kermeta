/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
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

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft79 = objectsToAdd
					.iterator();
			java.lang.Boolean idLoopCond_278 = false;
			while (!idLoopCond_278) {
				idLoopCond_278 = it_ft79.isOff();
				if (idLoopCond_278) {
				} else {

					//Beginning of the Inlining of the lambda expression: func
					kermeta.language.structure.Object obj = it_ft79.next();

					kermeta.language.structure.Object addedObject = this
							.addCompatible(obj);

					java.lang.Boolean idIfCond_279 = false;
					idIfCond_279 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(addedObject));

					if (idIfCond_279) {

						result.add(obj);
					}

					//End of the Inlining of the lambda expression: func

				}
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

		kermeta.standard.Sequence<kermeta.language.structure.Object> result_ft80 = null;

		kermeta.language.structure.Object elem_ft80 = null;

		result_ft80 = ((kermeta.standard.Sequence<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Object>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Object> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Object> convertAsOrderedSet(
							this.getContents()).iterator();
			java.lang.Boolean idLoopCond_280 = false;
			while (!idLoopCond_280) {
				idLoopCond_280 = it_ft80.isOff();
				if (idLoopCond_280) {
				} else {

					elem_ft80 = it_ft80.next();

					java.lang.Boolean idIfCond_281 = false;
					//Beginning of the Inlining of the lambda expression: selector
					kermeta.language.structure.Object o = elem_ft80;

					idIfCond_281 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstance(typeName, o);
					//End of the Inlining of the lambda expression: selector

					if (idIfCond_281) {

						result_ft80.add(elem_ft80);
					}

				}
			}
		}

		//End of the Inlining of the function type: select
		result = result_ft80.asSet();

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
