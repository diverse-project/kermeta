/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives.impl;

import directives.Concat;
import directives.DirectivesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link directives.impl.ConcatImpl#getPropertyNames <em>Property Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcatImpl extends BinaryDirectiveImpl implements Concat {
	/**
	 * The cached value of the '{@link #getPropertyNames() <em>Property Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> propertyNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DirectivesPackage.Literals.CONCAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPropertyNames() {
		if (propertyNames == null) {
			propertyNames = new EDataTypeUniqueEList<String>(String.class, this, DirectivesPackage.CONCAT__PROPERTY_NAMES);
		}
		return propertyNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DirectivesPackage.CONCAT__PROPERTY_NAMES:
				return getPropertyNames();
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
			case DirectivesPackage.CONCAT__PROPERTY_NAMES:
				getPropertyNames().clear();
				getPropertyNames().addAll((Collection<? extends String>)newValue);
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
			case DirectivesPackage.CONCAT__PROPERTY_NAMES:
				getPropertyNames().clear();
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
			case DirectivesPackage.CONCAT__PROPERTY_NAMES:
				return propertyNames != null && !propertyNames.isEmpty();
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
		result.append(" (propertyNames: ");
		result.append(propertyNames);
		result.append(')');
		return result.toString();
	}

} //ConcatImpl
