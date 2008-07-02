/**
 * <copyright>
 * </copyright>
 *
 * $Id: DanglingDiagnosticImpl.java,v 1.1 2008-07-02 09:43:43 ftanguy Exp $
 */
package kermeta.persistence.impl;

import kermeta.language.structure.Property;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.persistence.DanglingDiagnostic;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dangling Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.DanglingDiagnosticImpl#getReferencingElement <em>Referencing Element</em>}</li>
 *   <li>{@link kermeta.persistence.impl.DanglingDiagnosticImpl#getDanglingElement <em>Dangling Element</em>}</li>
 *   <li>{@link kermeta.persistence.impl.DanglingDiagnosticImpl#getReferencingProperty <em>Referencing Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DanglingDiagnosticImpl extends ObjectImpl implements DanglingDiagnostic {
	/**
	 * The cached value of the '{@link #getReferencingElement() <em>Referencing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingElement()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object referencingElement;

	/**
	 * The cached value of the '{@link #getDanglingElement() <em>Dangling Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDanglingElement()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object danglingElement;

	/**
	 * The cached value of the '{@link #getReferencingProperty() <em>Referencing Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingProperty()
	 * @generated
	 * @ordered
	 */
	protected Property referencingProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DanglingDiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.DANGLING_DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getReferencingElement() {
		if (referencingElement != null && referencingElement.eIsProxy()) {
			InternalEObject oldReferencingElement = (InternalEObject)referencingElement;
			referencingElement = (kermeta.language.structure.Object)eResolveProxy(oldReferencingElement);
			if (referencingElement != oldReferencingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT, oldReferencingElement, referencingElement));
			}
		}
		return referencingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetReferencingElement() {
		return referencingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencingElement(kermeta.language.structure.Object newReferencingElement) {
		kermeta.language.structure.Object oldReferencingElement = referencingElement;
		referencingElement = newReferencingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT, oldReferencingElement, referencingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getDanglingElement() {
		if (danglingElement != null && danglingElement.eIsProxy()) {
			InternalEObject oldDanglingElement = (InternalEObject)danglingElement;
			danglingElement = (kermeta.language.structure.Object)eResolveProxy(oldDanglingElement);
			if (danglingElement != oldDanglingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.DANGLING_DIAGNOSTIC__DANGLING_ELEMENT, oldDanglingElement, danglingElement));
			}
		}
		return danglingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetDanglingElement() {
		return danglingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDanglingElement(kermeta.language.structure.Object newDanglingElement) {
		kermeta.language.structure.Object oldDanglingElement = danglingElement;
		danglingElement = newDanglingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DANGLING_DIAGNOSTIC__DANGLING_ELEMENT, oldDanglingElement, danglingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getReferencingProperty() {
		if (referencingProperty != null && referencingProperty.eIsProxy()) {
			InternalEObject oldReferencingProperty = (InternalEObject)referencingProperty;
			referencingProperty = (Property)eResolveProxy(oldReferencingProperty);
			if (referencingProperty != oldReferencingProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY, oldReferencingProperty, referencingProperty));
			}
		}
		return referencingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetReferencingProperty() {
		return referencingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencingProperty(Property newReferencingProperty) {
		Property oldReferencingProperty = referencingProperty;
		referencingProperty = newReferencingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY, oldReferencingProperty, referencingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT:
				if (resolve) return getReferencingElement();
				return basicGetReferencingElement();
			case PersistencePackage.DANGLING_DIAGNOSTIC__DANGLING_ELEMENT:
				if (resolve) return getDanglingElement();
				return basicGetDanglingElement();
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY:
				if (resolve) return getReferencingProperty();
				return basicGetReferencingProperty();
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
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT:
				setReferencingElement((kermeta.language.structure.Object)newValue);
				return;
			case PersistencePackage.DANGLING_DIAGNOSTIC__DANGLING_ELEMENT:
				setDanglingElement((kermeta.language.structure.Object)newValue);
				return;
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY:
				setReferencingProperty((Property)newValue);
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
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT:
				setReferencingElement((kermeta.language.structure.Object)null);
				return;
			case PersistencePackage.DANGLING_DIAGNOSTIC__DANGLING_ELEMENT:
				setDanglingElement((kermeta.language.structure.Object)null);
				return;
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY:
				setReferencingProperty((Property)null);
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
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT:
				return referencingElement != null;
			case PersistencePackage.DANGLING_DIAGNOSTIC__DANGLING_ELEMENT:
				return danglingElement != null;
			case PersistencePackage.DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY:
				return referencingProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //DanglingDiagnosticImpl
