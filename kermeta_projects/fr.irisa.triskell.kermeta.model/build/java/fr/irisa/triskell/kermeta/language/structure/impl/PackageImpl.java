/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PackageImpl#getOwnedTypeDefinition <em>Owned Type Definition</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.PackageImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements fr.irisa.triskell.kermeta.language.structure.Package {
	/**
	 * The cached value of the '{@link #getOwnedTypeDefinition() <em>Owned Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList ownedTypeDefinition = null;

	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList nestedPackage = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedTypeDefinition() {
		if (ownedTypeDefinition == null) {
			ownedTypeDefinition = new EObjectContainmentEList(TypeDefinition.class, this, StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION);
		}
		return ownedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentWithInverseEList(fr.irisa.triskell.kermeta.language.structure.Package.class, this, StructurePackage.PACKAGE__NESTED_PACKAGE, StructurePackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.irisa.triskell.kermeta.language.structure.Package getNestingPackage() {
		if (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE) return null;
		return (fr.irisa.triskell.kermeta.language.structure.Package)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(fr.irisa.triskell.kermeta.language.structure.Package newNestingPackage) {
		if (newNestingPackage != eContainer || (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE && newNestingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newNestingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEObject)newNestingPackage).eInverseAdd(this, StructurePackage.PACKAGE__NESTED_PACKAGE, fr.irisa.triskell.kermeta.language.structure.Package.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newNestingPackage, StructurePackage.PACKAGE__NESTING_PACKAGE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PACKAGE__NESTING_PACKAGE, newNestingPackage, newNestingPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PACKAGE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.PACKAGE__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				case StructurePackage.PACKAGE__NESTED_PACKAGE:
					return ((InternalEList)getNestedPackage()).basicAdd(otherEnd, msgs);
				case StructurePackage.PACKAGE__NESTING_PACKAGE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, StructurePackage.PACKAGE__NESTING_PACKAGE, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.PACKAGE__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
					return ((InternalEList)getOwnedTypeDefinition()).basicRemove(otherEnd, msgs);
				case StructurePackage.PACKAGE__NESTED_PACKAGE:
					return ((InternalEList)getNestedPackage()).basicRemove(otherEnd, msgs);
				case StructurePackage.PACKAGE__NESTING_PACKAGE:
					return eBasicSetContainer(null, StructurePackage.PACKAGE__NESTING_PACKAGE, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case StructurePackage.PACKAGE__NESTING_PACKAGE:
					return eContainer.eInverseRemove(this, StructurePackage.PACKAGE__NESTED_PACKAGE, fr.irisa.triskell.kermeta.language.structure.Package.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.PACKAGE__TAG:
				return getTag();
			case StructurePackage.PACKAGE__NAME:
				return getName();
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				return getOwnedTypeDefinition();
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				return getNestingPackage();
			case StructurePackage.PACKAGE__URI:
				return getUri();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.PACKAGE__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case StructurePackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				getOwnedTypeDefinition().clear();
				getOwnedTypeDefinition().addAll((Collection)newValue);
				return;
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection)newValue);
				return;
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((fr.irisa.triskell.kermeta.language.structure.Package)newValue);
				return;
			case StructurePackage.PACKAGE__URI:
				setUri((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.PACKAGE__TAG:
				getTag().clear();
				return;
			case StructurePackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				getOwnedTypeDefinition().clear();
				return;
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((fr.irisa.triskell.kermeta.language.structure.Package)null);
				return;
			case StructurePackage.PACKAGE__URI:
				setUri(URI_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.PACKAGE__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				return ownedTypeDefinition != null && !ownedTypeDefinition.isEmpty();
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				return getNestingPackage() != null;
			case StructurePackage.PACKAGE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypeDefinitionContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION: return StructurePackage.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == TypeDefinitionContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION: return StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
