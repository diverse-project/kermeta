/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.DeployUnit;
import org.kermeta.art2.NodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.NodeTypeImpl#getBootstrap <em>Bootstrap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeTypeImpl extends TypeDefinitionImpl implements NodeType {
	/**
	 * The cached value of the '{@link #getBootstrap() <em>Bootstrap</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootstrap()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployUnit> bootstrap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getBootstrap() {
		if (bootstrap == null) {
			bootstrap = new EObjectResolvingEList<DeployUnit>(DeployUnit.class, this, Art2Package.NODE_TYPE__BOOTSTRAP);
		}
		return bootstrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.NODE_TYPE__BOOTSTRAP:
				return getBootstrap();
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
			case Art2Package.NODE_TYPE__BOOTSTRAP:
				getBootstrap().clear();
				getBootstrap().addAll((Collection<? extends DeployUnit>)newValue);
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
			case Art2Package.NODE_TYPE__BOOTSTRAP:
				getBootstrap().clear();
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
			case Art2Package.NODE_TYPE__BOOTSTRAP:
				return bootstrap != null && !bootstrap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeTypeImpl
