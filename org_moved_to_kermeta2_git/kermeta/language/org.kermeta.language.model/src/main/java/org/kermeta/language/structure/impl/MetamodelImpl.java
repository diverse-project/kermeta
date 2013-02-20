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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.language.structure.FilteredMetamodelReference;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.ModelTypeDefinition;
import org.kermeta.language.structure.ModelTypeDefinitionContainer;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getOwnedModelTypeDefinitions <em>Owned Model Type Definitions</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#getReferencedMetamodels <em>Referenced Metamodels</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.MetamodelImpl#isIsResolved <em>Is Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends KermetaModelElementImpl implements Metamodel {
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
	 * The cached value of the '{@link #getOwnedModelTypeDefinitions() <em>Owned Model Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTypeDefinition> ownedModelTypeDefinitions;

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
	 * The cached value of the '{@link #getReferencedMetamodels() <em>Referenced Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<FilteredMetamodelReference> referencedMetamodels;

	/**
	 * The default value of the '{@link #isIsResolved() <em>Is Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsResolved() <em>Is Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean isResolved = IS_RESOLVED_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METAMODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METAMODEL__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilteredMetamodelReference> getReferencedMetamodels() {
		if (referencedMetamodels == null) {
			referencedMetamodels = new EObjectContainmentEList<FilteredMetamodelReference>(FilteredMetamodelReference.class, this, StructurePackage.METAMODEL__REFERENCED_METAMODELS);
		}
		return referencedMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsResolved() {
		return isResolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsResolved(boolean newIsResolved) {
		boolean oldIsResolved = isResolved;
		isResolved = newIsResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.METAMODEL__IS_RESOLVED, oldIsResolved, isResolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTypeDefinition> getOwnedModelTypeDefinitions() {
		if (ownedModelTypeDefinitions == null) {
			ownedModelTypeDefinitions = new EObjectContainmentEList<ModelTypeDefinition>(ModelTypeDefinition.class, this, StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS);
		}
		return ownedModelTypeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS:
				return ((InternalEList<?>)getOwnedModelTypeDefinitions()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case StructurePackage.METAMODEL__REFERENCED_METAMODELS:
				return ((InternalEList<?>)getReferencedMetamodels()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.METAMODEL__NAME:
				return getName();
			case StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS:
				return getOwnedModelTypeDefinitions();
			case StructurePackage.METAMODEL__PACKAGES:
				return getPackages();
			case StructurePackage.METAMODEL__URI:
				return getUri();
			case StructurePackage.METAMODEL__REFERENCED_METAMODELS:
				return getReferencedMetamodels();
			case StructurePackage.METAMODEL__IS_RESOLVED:
				return isIsResolved();
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
			case StructurePackage.METAMODEL__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS:
				getOwnedModelTypeDefinitions().clear();
				getOwnedModelTypeDefinitions().addAll((Collection<? extends ModelTypeDefinition>)newValue);
				return;
			case StructurePackage.METAMODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.kermeta.language.structure.Package>)newValue);
				return;
			case StructurePackage.METAMODEL__URI:
				setUri((String)newValue);
				return;
			case StructurePackage.METAMODEL__REFERENCED_METAMODELS:
				getReferencedMetamodels().clear();
				getReferencedMetamodels().addAll((Collection<? extends FilteredMetamodelReference>)newValue);
				return;
			case StructurePackage.METAMODEL__IS_RESOLVED:
				setIsResolved((Boolean)newValue);
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
			case StructurePackage.METAMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS:
				getOwnedModelTypeDefinitions().clear();
				return;
			case StructurePackage.METAMODEL__PACKAGES:
				getPackages().clear();
				return;
			case StructurePackage.METAMODEL__URI:
				setUri(URI_EDEFAULT);
				return;
			case StructurePackage.METAMODEL__REFERENCED_METAMODELS:
				getReferencedMetamodels().clear();
				return;
			case StructurePackage.METAMODEL__IS_RESOLVED:
				setIsResolved(IS_RESOLVED_EDEFAULT);
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
			case StructurePackage.METAMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS:
				return ownedModelTypeDefinitions != null && !ownedModelTypeDefinitions.isEmpty();
			case StructurePackage.METAMODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case StructurePackage.METAMODEL__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case StructurePackage.METAMODEL__REFERENCED_METAMODELS:
				return referencedMetamodels != null && !referencedMetamodels.isEmpty();
			case StructurePackage.METAMODEL__IS_RESOLVED:
				return isResolved != IS_RESOLVED_EDEFAULT;
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
				case StructurePackage.METAMODEL__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ModelTypeDefinitionContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS: return StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS;
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
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.METAMODEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == ModelTypeDefinitionContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS: return StructurePackage.METAMODEL__OWNED_MODEL_TYPE_DEFINITIONS;
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
		result.append(", uri: ");
		result.append(uri);
		result.append(", isResolved: ");
		result.append(isResolved);
		result.append(')');
		return result.toString();
	}

} //MetamodelImpl
