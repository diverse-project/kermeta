/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageImpl.java,v 1.8 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * The cached value of the '{@link #getOwnedTypeDefinition() <em>Owned Type Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> ownedTypeDefinition;

	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<fr.irisa.triskell.kermeta.language.structure.Package> nestedPackage;

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
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getOwnedTypeDefinition() {
		if (ownedTypeDefinition == null) {
			ownedTypeDefinition = new EObjectContainmentEList.Resolving<TypeDefinition>(TypeDefinition.class, this, StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION);
		}
		return ownedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fr.irisa.triskell.kermeta.language.structure.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentWithInverseEList.Resolving<fr.irisa.triskell.kermeta.language.structure.Package>(fr.irisa.triskell.kermeta.language.structure.Package.class, this, StructurePackage.PACKAGE__NESTED_PACKAGE, StructurePackage.PACKAGE__NESTING_PACKAGE);
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
		return (fr.irisa.triskell.kermeta.language.structure.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.irisa.triskell.kermeta.language.structure.Package basicGetNestingPackage() {
		if (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE) return null;
		return (fr.irisa.triskell.kermeta.language.structure.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(fr.irisa.triskell.kermeta.language.structure.Package newNestingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingPackage, StructurePackage.PACKAGE__NESTING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(fr.irisa.triskell.kermeta.language.structure.Package newNestingPackage) {
		if (newNestingPackage != eInternalContainer() || (eContainerFeatureID != StructurePackage.PACKAGE__NESTING_PACKAGE && newNestingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newNestingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEObject)newNestingPackage).eInverseAdd(this, StructurePackage.PACKAGE__NESTED_PACKAGE, fr.irisa.triskell.kermeta.language.structure.Package.class, msgs);
			msgs = basicSetNestingPackage(newNestingPackage, msgs);
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
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPackage()).basicAdd(otherEnd, msgs);
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingPackage((fr.irisa.triskell.kermeta.language.structure.Package)otherEnd, msgs);
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
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				return ((InternalEList<?>)getOwnedTypeDefinition()).basicRemove(otherEnd, msgs);
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				return basicSetNestingPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, StructurePackage.PACKAGE__NESTED_PACKAGE, fr.irisa.triskell.kermeta.language.structure.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				return getOwnedTypeDefinition();
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case StructurePackage.PACKAGE__URI:
				return getUri();
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
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				getOwnedTypeDefinition().clear();
				getOwnedTypeDefinition().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends fr.irisa.triskell.kermeta.language.structure.Package>)newValue);
				return;
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((fr.irisa.triskell.kermeta.language.structure.Package)newValue);
				return;
			case StructurePackage.PACKAGE__URI:
				setUri((String)newValue);
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
			case StructurePackage.PACKAGE__OWNED_TYPE_DEFINITION:
				return ownedTypeDefinition != null && !ownedTypeDefinition.isEmpty();
			case StructurePackage.PACKAGE__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case StructurePackage.PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case StructurePackage.PACKAGE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl