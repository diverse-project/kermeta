/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.DeployUnit;
import org.kermeta.art2.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.TypeDefinitionImpl#getDeployUnit <em>Deploy Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionImpl extends NamedElementImpl implements TypeDefinition {
	/**
	 * The cached value of the '{@link #getDeployUnit() <em>Deploy Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployUnit()
	 * @generated
	 * @ordered
	 */
	protected DeployUnit deployUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployUnit getDeployUnit() {
		if (deployUnit != null && deployUnit.eIsProxy()) {
			InternalEObject oldDeployUnit = (InternalEObject)deployUnit;
			deployUnit = (DeployUnit)eResolveProxy(oldDeployUnit);
			if (deployUnit != oldDeployUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.TYPE_DEFINITION__DEPLOY_UNIT, oldDeployUnit, deployUnit));
			}
		}
		return deployUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployUnit basicGetDeployUnit() {
		return deployUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployUnit(DeployUnit newDeployUnit) {
		DeployUnit oldDeployUnit = deployUnit;
		deployUnit = newDeployUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.TYPE_DEFINITION__DEPLOY_UNIT, oldDeployUnit, deployUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				if (resolve) return getDeployUnit();
				return basicGetDeployUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				setDeployUnit((DeployUnit)newValue);
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
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				setDeployUnit((DeployUnit)null);
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
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				return deployUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeDefinitionImpl
