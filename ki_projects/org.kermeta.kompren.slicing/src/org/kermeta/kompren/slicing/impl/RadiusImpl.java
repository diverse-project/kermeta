/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kompren.slicing.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.kompren.slicing.Radius;
import org.kermeta.kompren.slicing.SlicedClass;
import org.kermeta.kompren.slicing.SlicingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radius</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kompren.slicing.impl.RadiusImpl#getFocusedClasses <em>Focused Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadiusImpl extends EObjectImpl implements Radius {
	/**
	 * The cached value of the '{@link #getFocusedClasses() <em>Focused Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<SlicedClass> focusedClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadiusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlicingPackage.Literals.RADIUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlicedClass> getFocusedClasses() {
		if (focusedClasses == null) {
			focusedClasses = new EObjectResolvingEList<SlicedClass>(SlicedClass.class, this, SlicingPackage.RADIUS__FOCUSED_CLASSES);
		}
		return focusedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlicingPackage.RADIUS__FOCUSED_CLASSES:
				return getFocusedClasses();
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
			case SlicingPackage.RADIUS__FOCUSED_CLASSES:
				getFocusedClasses().clear();
				getFocusedClasses().addAll((Collection<? extends SlicedClass>)newValue);
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
			case SlicingPackage.RADIUS__FOCUSED_CLASSES:
				getFocusedClasses().clear();
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
			case SlicingPackage.RADIUS__FOCUSED_CLASSES:
				return focusedClasses != null && !focusedClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RadiusImpl
