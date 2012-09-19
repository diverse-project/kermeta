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

import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.MetamodelBinding;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getOwnedBindings <em>Owned Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getOwnedMetamodels <em>Owned Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends TypeDefinitionImpl implements Metamodel {
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
	 * The cached value of the '{@link #getOwnedBindings() <em>Owned Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelBinding> ownedBindings;

	/**
	 * The cached value of the '{@link #getOwnedMetamodels() <em>Owned Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> ownedMetamodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.kermeta.language.structure.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<org.kermeta.language.structure.Package>(org.kermeta.language.structure.Package.class, this, StructurePackage.METAMODEL__PACKAGES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METAMODEL__NAMESPACE_PREFIX, oldNamespacePrefix, namespacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Require> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<Require>(Require.class, this, StructurePackage.METAMODEL__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetamodelBinding> getOwnedBindings() {
		if (ownedBindings == null) {
			ownedBindings = new EObjectContainmentEList<MetamodelBinding>(MetamodelBinding.class, this, StructurePackage.METAMODEL__OWNED_BINDINGS);
		}
		return ownedBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getOwnedMetamodels() {
		if (ownedMetamodels == null) {
			ownedMetamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, StructurePackage.METAMODEL__OWNED_METAMODELS);
		}
		return ownedMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.METAMODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL__OWNED_BINDINGS:
				return ((InternalEList<?>)getOwnedBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL__OWNED_METAMODELS:
				return ((InternalEList<?>)getOwnedMetamodels()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.METAMODEL__PACKAGES:
				return getPackages();
			case StructurePackage.METAMODEL__NAMESPACE_PREFIX:
				return getNamespacePrefix();
			case StructurePackage.METAMODEL__REQUIRES:
				return getRequires();
			case StructurePackage.METAMODEL__OWNED_BINDINGS:
				return getOwnedBindings();
			case StructurePackage.METAMODEL__OWNED_METAMODELS:
				return getOwnedMetamodels();
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
			case StructurePackage.METAMODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.kermeta.language.structure.Package>)newValue);
				return;
			case StructurePackage.METAMODEL__NAMESPACE_PREFIX:
				setNamespacePrefix((String)newValue);
				return;
			case StructurePackage.METAMODEL__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Require>)newValue);
				return;
			case StructurePackage.METAMODEL__OWNED_BINDINGS:
				getOwnedBindings().clear();
				getOwnedBindings().addAll((Collection<? extends MetamodelBinding>)newValue);
				return;
			case StructurePackage.METAMODEL__OWNED_METAMODELS:
				getOwnedMetamodels().clear();
				getOwnedMetamodels().addAll((Collection<? extends Metamodel>)newValue);
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
			case StructurePackage.METAMODEL__PACKAGES:
				getPackages().clear();
				return;
			case StructurePackage.METAMODEL__NAMESPACE_PREFIX:
				setNamespacePrefix(NAMESPACE_PREFIX_EDEFAULT);
				return;
			case StructurePackage.METAMODEL__REQUIRES:
				getRequires().clear();
				return;
			case StructurePackage.METAMODEL__OWNED_BINDINGS:
				getOwnedBindings().clear();
				return;
			case StructurePackage.METAMODEL__OWNED_METAMODELS:
				getOwnedMetamodels().clear();
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
			case StructurePackage.METAMODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case StructurePackage.METAMODEL__NAMESPACE_PREFIX:
				return NAMESPACE_PREFIX_EDEFAULT == null ? namespacePrefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespacePrefix);
			case StructurePackage.METAMODEL__REQUIRES:
				return requires != null && !requires.isEmpty();
			case StructurePackage.METAMODEL__OWNED_BINDINGS:
				return ownedBindings != null && !ownedBindings.isEmpty();
			case StructurePackage.METAMODEL__OWNED_METAMODELS:
				return ownedMetamodels != null && !ownedMetamodels.isEmpty();
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
		if (baseClass == ModelingUnit.class) {
			switch (derivedFeatureID) {
				case StructurePackage.METAMODEL__PACKAGES: return StructurePackage.MODELING_UNIT__PACKAGES;
				case StructurePackage.METAMODEL__NAMESPACE_PREFIX: return StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX;
				case StructurePackage.METAMODEL__REQUIRES: return StructurePackage.MODELING_UNIT__REQUIRES;
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
		if (baseClass == ModelingUnit.class) {
			switch (baseFeatureID) {
				case StructurePackage.MODELING_UNIT__PACKAGES: return StructurePackage.METAMODEL__PACKAGES;
				case StructurePackage.MODELING_UNIT__NAMESPACE_PREFIX: return StructurePackage.METAMODEL__NAMESPACE_PREFIX;
				case StructurePackage.MODELING_UNIT__REQUIRES: return StructurePackage.METAMODEL__REQUIRES;
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
		result.append(" (namespacePrefix: ");
		result.append(namespacePrefix);
		result.append(')');
		return result.toString();
	}

} //MetamodelImpl
