/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtGenericElementReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spoon.reflect.Factory;
import emf.spoon.reflect.reference.CtGenericElementReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Generic Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtGenericElementReferenceImpl#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtGenericElementReferenceImpl extends EObjectImpl implements CtGenericElementReference {
	/**
	 * The cached value of the '{@link #getActualTypeArguments() <em>Actual Type Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList actualTypeArguments = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtGenericElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_GENERIC_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getActualTypeArguments() {
		if (actualTypeArguments == null) {
			actualTypeArguments = new EObjectResolvingEList(CtTypeReference.class, this, ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS);
		}
		return actualTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return getActualTypeArguments();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				getActualTypeArguments().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReferencePackage.CT_GENERIC_ELEMENT_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return actualTypeArguments != null && !actualTypeArguments.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	


	Factory factory;
	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;	
	}
	
} //CtGenericElementReferenceImpl