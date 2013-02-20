/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational.impl;

import fr.tm.elibel.smartqvt.qvt.emof.EmofPackage;
import fr.tm.elibel.smartqvt.qvt.emof.Property;
import fr.tm.elibel.smartqvt.qvt.emof.Tag;
import fr.tm.elibel.smartqvt.qvt.emof.Type;

import fr.tm.elibel.smartqvt.qvt.emof.impl.ClassImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import fr.tm.elibel.smartqvt.qvt.qvtoperational.EntryOperation;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.Module;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.ModuleImport;
import fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getConfigProperty <em>Config Property</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getIsBlackbox <em>Is Blackbox</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getModuleImport <em>Module Import</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getOwnedTag <em>Owned Tag</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.impl.ModuleImpl#getUsedModelType <em>Used Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends ClassImpl implements Module {
	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList nestedPackage;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList ownedType;

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
	 * The cached value of the '{@link #getConfigProperty() <em>Config Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigProperty()
	 * @generated
	 * @ordered
	 */
	protected EList configProperty;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EntryOperation entry;

	/**
	 * The default value of the '{@link #getIsBlackbox() <em>Is Blackbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBlackbox()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BLACKBOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBlackbox() <em>Is Blackbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBlackbox()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBlackbox = IS_BLACKBOX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModuleImport() <em>Module Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleImport()
	 * @generated
	 * @ordered
	 */
	protected EList moduleImport;

	/**
	 * The cached value of the '{@link #getOwnedTag() <em>Owned Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTag()
	 * @generated
	 * @ordered
	 */
	protected EList ownedTag;

	/**
	 * The cached value of the '{@link #getOwnedVariable() <em>Owned Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList ownedVariable;

	/**
	 * The cached value of the '{@link #getUsedModelType() <em>Used Model Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedModelType()
	 * @generated
	 * @ordered
	 */
	protected EList usedModelType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectContainmentEList(fr.tm.elibel.smartqvt.qvt.emof.Package.class, this, QvtoperationalPackage.MODULE__NESTED_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentWithInverseEList(Type.class, this, QvtoperationalPackage.MODULE__OWNED_TYPE, EmofPackage.TYPE__PACKAGE);
		}
		return ownedType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfigProperty() {
		if (configProperty == null) {
			configProperty = new EObjectResolvingEList(Property.class, this, QvtoperationalPackage.MODULE__CONFIG_PROPERTY);
		}
		return configProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOperation getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (EntryOperation)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MODULE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOperation basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(EntryOperation newEntry) {
		EntryOperation oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBlackbox() {
		return isBlackbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBlackbox(Boolean newIsBlackbox) {
		Boolean oldIsBlackbox = isBlackbox;
		isBlackbox = newIsBlackbox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MODULE__IS_BLACKBOX, oldIsBlackbox, isBlackbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModuleImport() {
		if (moduleImport == null) {
			moduleImport = new EObjectContainmentWithInverseEList(ModuleImport.class, this, QvtoperationalPackage.MODULE__MODULE_IMPORT, QvtoperationalPackage.MODULE_IMPORT__MODULE);
		}
		return moduleImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedTag() {
		if (ownedTag == null) {
			ownedTag = new EObjectContainmentEList(Tag.class, this, QvtoperationalPackage.MODULE__OWNED_TAG);
		}
		return ownedTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedVariable() {
		if (ownedVariable == null) {
			ownedVariable = new EObjectContainmentEList(Variable.class, this, QvtoperationalPackage.MODULE__OWNED_VARIABLE);
		}
		return ownedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedModelType() {
		if (usedModelType == null) {
			usedModelType = new EObjectResolvingEList(ModelType.class, this, QvtoperationalPackage.MODULE__USED_MODEL_TYPE);
		}
		return usedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MODULE__OWNED_TYPE:
				return ((InternalEList)getOwnedType()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.MODULE__MODULE_IMPORT:
				return ((InternalEList)getModuleImport()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.MODULE__NESTED_PACKAGE:
				return ((InternalEList)getNestedPackage()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODULE__OWNED_TYPE:
				return ((InternalEList)getOwnedType()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODULE__MODULE_IMPORT:
				return ((InternalEList)getModuleImport()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODULE__OWNED_TAG:
				return ((InternalEList)getOwnedTag()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.MODULE__OWNED_VARIABLE:
				return ((InternalEList)getOwnedVariable()).basicRemove(otherEnd, msgs);
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
			case QvtoperationalPackage.MODULE__NESTED_PACKAGE:
				return getNestedPackage();
			case QvtoperationalPackage.MODULE__OWNED_TYPE:
				return getOwnedType();
			case QvtoperationalPackage.MODULE__URI:
				return getUri();
			case QvtoperationalPackage.MODULE__CONFIG_PROPERTY:
				return getConfigProperty();
			case QvtoperationalPackage.MODULE__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case QvtoperationalPackage.MODULE__IS_BLACKBOX:
				return getIsBlackbox();
			case QvtoperationalPackage.MODULE__MODULE_IMPORT:
				return getModuleImport();
			case QvtoperationalPackage.MODULE__OWNED_TAG:
				return getOwnedTag();
			case QvtoperationalPackage.MODULE__OWNED_VARIABLE:
				return getOwnedVariable();
			case QvtoperationalPackage.MODULE__USED_MODEL_TYPE:
				return getUsedModelType();
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
			case QvtoperationalPackage.MODULE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MODULE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MODULE__URI:
				setUri((String)newValue);
				return;
			case QvtoperationalPackage.MODULE__CONFIG_PROPERTY:
				getConfigProperty().clear();
				getConfigProperty().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MODULE__ENTRY:
				setEntry((EntryOperation)newValue);
				return;
			case QvtoperationalPackage.MODULE__IS_BLACKBOX:
				setIsBlackbox((Boolean)newValue);
				return;
			case QvtoperationalPackage.MODULE__MODULE_IMPORT:
				getModuleImport().clear();
				getModuleImport().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MODULE__OWNED_TAG:
				getOwnedTag().clear();
				getOwnedTag().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MODULE__OWNED_VARIABLE:
				getOwnedVariable().clear();
				getOwnedVariable().addAll((Collection)newValue);
				return;
			case QvtoperationalPackage.MODULE__USED_MODEL_TYPE:
				getUsedModelType().clear();
				getUsedModelType().addAll((Collection)newValue);
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
			case QvtoperationalPackage.MODULE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case QvtoperationalPackage.MODULE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case QvtoperationalPackage.MODULE__URI:
				setUri(URI_EDEFAULT);
				return;
			case QvtoperationalPackage.MODULE__CONFIG_PROPERTY:
				getConfigProperty().clear();
				return;
			case QvtoperationalPackage.MODULE__ENTRY:
				setEntry((EntryOperation)null);
				return;
			case QvtoperationalPackage.MODULE__IS_BLACKBOX:
				setIsBlackbox(IS_BLACKBOX_EDEFAULT);
				return;
			case QvtoperationalPackage.MODULE__MODULE_IMPORT:
				getModuleImport().clear();
				return;
			case QvtoperationalPackage.MODULE__OWNED_TAG:
				getOwnedTag().clear();
				return;
			case QvtoperationalPackage.MODULE__OWNED_VARIABLE:
				getOwnedVariable().clear();
				return;
			case QvtoperationalPackage.MODULE__USED_MODEL_TYPE:
				getUsedModelType().clear();
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
			case QvtoperationalPackage.MODULE__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case QvtoperationalPackage.MODULE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case QvtoperationalPackage.MODULE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case QvtoperationalPackage.MODULE__CONFIG_PROPERTY:
				return configProperty != null && !configProperty.isEmpty();
			case QvtoperationalPackage.MODULE__ENTRY:
				return entry != null;
			case QvtoperationalPackage.MODULE__IS_BLACKBOX:
				return IS_BLACKBOX_EDEFAULT == null ? isBlackbox != null : !IS_BLACKBOX_EDEFAULT.equals(isBlackbox);
			case QvtoperationalPackage.MODULE__MODULE_IMPORT:
				return moduleImport != null && !moduleImport.isEmpty();
			case QvtoperationalPackage.MODULE__OWNED_TAG:
				return ownedTag != null && !ownedTag.isEmpty();
			case QvtoperationalPackage.MODULE__OWNED_VARIABLE:
				return ownedVariable != null && !ownedVariable.isEmpty();
			case QvtoperationalPackage.MODULE__USED_MODEL_TYPE:
				return usedModelType != null && !usedModelType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == fr.tm.elibel.smartqvt.qvt.emof.Package.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.MODULE__NESTED_PACKAGE: return EmofPackage.PACKAGE__NESTED_PACKAGE;
				case QvtoperationalPackage.MODULE__OWNED_TYPE: return EmofPackage.PACKAGE__OWNED_TYPE;
				case QvtoperationalPackage.MODULE__URI: return EmofPackage.PACKAGE__URI;
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
		if (baseClass == fr.tm.elibel.smartqvt.qvt.emof.Package.class) {
			switch (baseFeatureID) {
				case EmofPackage.PACKAGE__NESTED_PACKAGE: return QvtoperationalPackage.MODULE__NESTED_PACKAGE;
				case EmofPackage.PACKAGE__OWNED_TYPE: return QvtoperationalPackage.MODULE__OWNED_TYPE;
				case EmofPackage.PACKAGE__URI: return QvtoperationalPackage.MODULE__URI;
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
		result.append(", isBlackbox: ");
		result.append(isBlackbox);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
