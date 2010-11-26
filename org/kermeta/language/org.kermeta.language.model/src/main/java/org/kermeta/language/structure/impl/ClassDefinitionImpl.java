/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ClassDefinitionImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassDefinitionImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionImpl extends GenericTypeDefinitionImpl implements ClassDefinition {
	/**
	 * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInv()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> inv;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CLASS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getInv() {
		if (inv == null) {
			inv = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, StructurePackage.CLASS_DEFINITION__INV, StructurePackage.CONSTRAINT__INV_OWNER);
		}
		return inv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS_DEFINITION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, StructurePackage.PROPERTY__OWNING_CLASS);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, StructurePackage.OPERATION__OWNING_CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.CLASS_DEFINITION__INV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInv()).basicAdd(otherEnd, msgs);
			case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
			case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.CLASS_DEFINITION__INV:
				return ((InternalEList<?>)getInv()).basicRemove(otherEnd, msgs);
			case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.CLASS_DEFINITION__INV:
				return getInv();
			case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
				return getIsAbstract();
			case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
				return getOwnedOperation();
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
			case StructurePackage.CLASS_DEFINITION__INV:
				getInv().clear();
				getInv().addAll((Collection<? extends Constraint>)newValue);
				return;
			case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case StructurePackage.CLASS_DEFINITION__INV:
				getInv().clear();
				return;
			case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
				getOwnedOperation().clear();
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
			case StructurePackage.CLASS_DEFINITION__INV:
				return inv != null && !inv.isEmpty();
			case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassDefinitionImpl
