/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.QualifiedNameList;
import alfDsl.QualifiedNameWithBinding;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Name List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.QualifiedNameListImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifiedNameListImpl extends EObjectImpl implements QualifiedNameList {
	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected EList qualifiedName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedNameListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.QUALIFIED_NAME_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQualifiedName() {
		if (qualifiedName == null) {
			qualifiedName = new EObjectContainmentEList(QualifiedNameWithBinding.class, this, AlfDslPackage.QUALIFIED_NAME_LIST__QUALIFIED_NAME);
		}
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.QUALIFIED_NAME_LIST__QUALIFIED_NAME:
				return ((InternalEList)getQualifiedName()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlfDslPackage.QUALIFIED_NAME_LIST__QUALIFIED_NAME:
				return getQualifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlfDslPackage.QUALIFIED_NAME_LIST__QUALIFIED_NAME:
				getQualifiedName().clear();
				getQualifiedName().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlfDslPackage.QUALIFIED_NAME_LIST__QUALIFIED_NAME:
				getQualifiedName().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlfDslPackage.QUALIFIED_NAME_LIST__QUALIFIED_NAME:
				return qualifiedName != null && !qualifiedName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualifiedNameListImpl
