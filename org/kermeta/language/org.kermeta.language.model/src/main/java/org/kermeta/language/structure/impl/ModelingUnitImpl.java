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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelingUnitImpl extends KermetaModelElementImpl implements ModelingUnit {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.kermeta.language.structure.Package> packages;

	/**
	 * The default value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespacePrefix()
	 * @generated
	 * @ordered
	 */
	protected String namespacePrefix = NAMESPACE_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Require> requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODELING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODELING_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.kermeta.language.structure.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<org.kermeta.language.structure.Package>(org.kermeta.language.structure.Package.class, this, StructurePackage.MODELING_UNIT__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespacePrefix() {
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespacePrefix(String newNamespacePrefix) {
		String oldNamespacePrefix = namespacePrefix;
		namespacePrefix = newNamespacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Require> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<Require>(Require.class, this, StructurePackage.MODELING_UNIT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODELING_UNIT__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODELING_UNIT__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODELING_UNIT__NAME:
				return getName();
			case StructurePackage.MODELING_UNIT__PACKAGES:
				return getPackages();
			case StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX:
				return getNamespacePrefix();
			case StructurePackage.MODELING_UNIT__REQUIRES:
				return getRequires();
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
			case StructurePackage.MODELING_UNIT__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.MODELING_UNIT__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.kermeta.language.structure.Package>)newValue);
				return;
			case StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX:
				setNamespacePrefix((String)newValue);
				return;
			case StructurePackage.MODELING_UNIT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Require>)newValue);
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
			case StructurePackage.MODELING_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.MODELING_UNIT__PACKAGES:
				getPackages().clear();
				return;
			case StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX:
				setNamespacePrefix(NAMESPACE_PREFIX_EDEFAULT);
				return;
			case StructurePackage.MODELING_UNIT__REQUIRES:
				getRequires().clear();
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
			case StructurePackage.MODELING_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.MODELING_UNIT__PACKAGES:
				return packages != null && !packages.isEmpty();
			case StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX:
				return NAMESPACE_PREFIX_EDEFAULT == null ? namespacePrefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespacePrefix);
			case StructurePackage.MODELING_UNIT__REQUIRES:
				return requires != null && !requires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODELING_UNIT__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.MODELING_UNIT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", namespacePrefix: ");
		result.append(namespacePrefix);
		result.append(')');
		return result.toString();
	}

} //ModelingUnitImpl
