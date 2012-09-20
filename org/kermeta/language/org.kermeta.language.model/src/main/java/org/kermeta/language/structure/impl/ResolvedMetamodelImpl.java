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
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.ResolvedMetamodel;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ResolvedMetamodelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ResolvedMetamodelImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ResolvedMetamodelImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ResolvedMetamodelImpl#getOwnedBindings <em>Owned Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ResolvedMetamodelImpl#getOwnedMetamodels <em>Owned Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolvedMetamodelImpl extends TypeDefinitionImpl implements ResolvedMetamodel {
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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

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
	protected EList<ResolvedMetamodel> ownedMetamodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolvedMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.RESOLVED_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.kermeta.language.structure.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<org.kermeta.language.structure.Package>(org.kermeta.language.structure.Package.class, this, StructurePackage.RESOLVED_METAMODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.RESOLVED_METAMODEL__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Require> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<Require>(Require.class, this, StructurePackage.RESOLVED_METAMODEL__REQUIRES);
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
			ownedBindings = new EObjectContainmentEList<MetamodelBinding>(MetamodelBinding.class, this, StructurePackage.RESOLVED_METAMODEL__OWNED_BINDINGS);
		}
		return ownedBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResolvedMetamodel> getOwnedMetamodels() {
		if (ownedMetamodels == null) {
			ownedMetamodels = new EObjectContainmentEList<ResolvedMetamodel>(ResolvedMetamodel.class, this, StructurePackage.RESOLVED_METAMODEL__OWNED_METAMODELS);
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
			case StructurePackage.RESOLVED_METAMODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case StructurePackage.RESOLVED_METAMODEL__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case StructurePackage.RESOLVED_METAMODEL__OWNED_BINDINGS:
				return ((InternalEList<?>)getOwnedBindings()).basicRemove(otherEnd, msgs);
			case StructurePackage.RESOLVED_METAMODEL__OWNED_METAMODELS:
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
			case StructurePackage.RESOLVED_METAMODEL__PACKAGES:
				return getPackages();
			case StructurePackage.RESOLVED_METAMODEL__URI:
				return getUri();
			case StructurePackage.RESOLVED_METAMODEL__REQUIRES:
				return getRequires();
			case StructurePackage.RESOLVED_METAMODEL__OWNED_BINDINGS:
				return getOwnedBindings();
			case StructurePackage.RESOLVED_METAMODEL__OWNED_METAMODELS:
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
			case StructurePackage.RESOLVED_METAMODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.kermeta.language.structure.Package>)newValue);
				return;
			case StructurePackage.RESOLVED_METAMODEL__URI:
				setUri((String)newValue);
				return;
			case StructurePackage.RESOLVED_METAMODEL__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Require>)newValue);
				return;
			case StructurePackage.RESOLVED_METAMODEL__OWNED_BINDINGS:
				getOwnedBindings().clear();
				getOwnedBindings().addAll((Collection<? extends MetamodelBinding>)newValue);
				return;
			case StructurePackage.RESOLVED_METAMODEL__OWNED_METAMODELS:
				getOwnedMetamodels().clear();
				getOwnedMetamodels().addAll((Collection<? extends ResolvedMetamodel>)newValue);
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
			case StructurePackage.RESOLVED_METAMODEL__PACKAGES:
				getPackages().clear();
				return;
			case StructurePackage.RESOLVED_METAMODEL__URI:
				setUri(URI_EDEFAULT);
				return;
			case StructurePackage.RESOLVED_METAMODEL__REQUIRES:
				getRequires().clear();
				return;
			case StructurePackage.RESOLVED_METAMODEL__OWNED_BINDINGS:
				getOwnedBindings().clear();
				return;
			case StructurePackage.RESOLVED_METAMODEL__OWNED_METAMODELS:
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
			case StructurePackage.RESOLVED_METAMODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case StructurePackage.RESOLVED_METAMODEL__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case StructurePackage.RESOLVED_METAMODEL__REQUIRES:
				return requires != null && !requires.isEmpty();
			case StructurePackage.RESOLVED_METAMODEL__OWNED_BINDINGS:
				return ownedBindings != null && !ownedBindings.isEmpty();
			case StructurePackage.RESOLVED_METAMODEL__OWNED_METAMODELS:
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
		if (baseClass == Metamodel.class) {
			switch (derivedFeatureID) {
				case StructurePackage.RESOLVED_METAMODEL__PACKAGES: return StructurePackage.METAMODEL__PACKAGES;
				case StructurePackage.RESOLVED_METAMODEL__URI: return StructurePackage.METAMODEL__URI;
				case StructurePackage.RESOLVED_METAMODEL__REQUIRES: return StructurePackage.METAMODEL__REQUIRES;
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
		if (baseClass == Metamodel.class) {
			switch (baseFeatureID) {
				case StructurePackage.METAMODEL__PACKAGES: return StructurePackage.RESOLVED_METAMODEL__PACKAGES;
				case StructurePackage.METAMODEL__URI: return StructurePackage.RESOLVED_METAMODEL__URI;
				case StructurePackage.METAMODEL__REQUIRES: return StructurePackage.RESOLVED_METAMODEL__REQUIRES;
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ResolvedMetamodelImpl
