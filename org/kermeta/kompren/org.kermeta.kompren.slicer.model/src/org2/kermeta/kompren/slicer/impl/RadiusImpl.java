/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org2.kermeta.kompren.slicer.Radius;
import org2.kermeta.kompren.slicer.SlicedClass;
import org2.kermeta.kompren.slicer.SlicerPackage;
import org2.kermeta.kompren.slicer.util.EcoreUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radius</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org2.kermeta.kompren.slicer.impl.RadiusImpl#getFocusedClasses <em>Focused Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadiusImpl extends EObjectImpl implements Radius {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA/IRISA\nTriskell Team";

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


	@Override
	public String toString() {
		final StringBuilder result = new StringBuilder("radius: ");

		if(!focusedClasses.isEmpty()) {
			result.append(EcoreUtils.INSTANCE.getQualifiedName(focusedClasses.get(0).getDomain(), "."));

			for(int i=1, size=focusedClasses.size(); i<size; i++)
				result.append(", ").append(EcoreUtils.INSTANCE.getQualifiedName(focusedClasses.get(i).getDomain(), "."));
		}

		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlicerPackage.Literals.RADIUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SlicedClass> getFocusedClasses() {
		if (focusedClasses == null) {
			focusedClasses = new EObjectResolvingEList<SlicedClass>(SlicedClass.class, this, SlicerPackage.RADIUS__FOCUSED_CLASSES);
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
			case SlicerPackage.RADIUS__FOCUSED_CLASSES:
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
			case SlicerPackage.RADIUS__FOCUSED_CLASSES:
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
			case SlicerPackage.RADIUS__FOCUSED_CLASSES:
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
			case SlicerPackage.RADIUS__FOCUSED_CLASSES:
				return focusedClasses != null && !focusedClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RadiusImpl
