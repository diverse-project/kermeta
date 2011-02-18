/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UnresolvedOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedOperationImpl#getOperationIdentifier <em>Operation Identifier</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedOperationImpl#getFromClassName <em>From Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedOperationImpl extends AbstractOperationImpl implements UnresolvedOperation {
	/**
	 * The default value of the '{@link #getOperationIdentifier() <em>Operation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationIdentifier() <em>Operation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String operationIdentifier = OPERATION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromClassName() <em>From Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromClassName() <em>From Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClassName()
	 * @generated
	 * @ordered
	 */
	protected String fromClassName = FROM_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.UNRESOLVED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationIdentifier() {
		return operationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationIdentifier(String newOperationIdentifier) {
		String oldOperationIdentifier = operationIdentifier;
		operationIdentifier = newOperationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_OPERATION__OPERATION_IDENTIFIER, oldOperationIdentifier, operationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromClassName() {
		return fromClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromClassName(String newFromClassName) {
		String oldFromClassName = fromClassName;
		fromClassName = newFromClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_OPERATION__FROM_CLASS_NAME, oldFromClassName, fromClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_OPERATION__OPERATION_IDENTIFIER:
				return getOperationIdentifier();
			case StructurePackage.UNRESOLVED_OPERATION__FROM_CLASS_NAME:
				return getFromClassName();
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
			case StructurePackage.UNRESOLVED_OPERATION__OPERATION_IDENTIFIER:
				setOperationIdentifier((String)newValue);
				return;
			case StructurePackage.UNRESOLVED_OPERATION__FROM_CLASS_NAME:
				setFromClassName((String)newValue);
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
			case StructurePackage.UNRESOLVED_OPERATION__OPERATION_IDENTIFIER:
				setOperationIdentifier(OPERATION_IDENTIFIER_EDEFAULT);
				return;
			case StructurePackage.UNRESOLVED_OPERATION__FROM_CLASS_NAME:
				setFromClassName(FROM_CLASS_NAME_EDEFAULT);
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
			case StructurePackage.UNRESOLVED_OPERATION__OPERATION_IDENTIFIER:
				return OPERATION_IDENTIFIER_EDEFAULT == null ? operationIdentifier != null : !OPERATION_IDENTIFIER_EDEFAULT.equals(operationIdentifier);
			case StructurePackage.UNRESOLVED_OPERATION__FROM_CLASS_NAME:
				return FROM_CLASS_NAME_EDEFAULT == null ? fromClassName != null : !FROM_CLASS_NAME_EDEFAULT.equals(fromClassName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operationIdentifier: ");
		result.append(operationIdentifier);
		result.append(", fromClassName: ");
		result.append(fromClassName);
		result.append(')');
		return result.toString();
	}

} //UnresolvedOperationImpl
