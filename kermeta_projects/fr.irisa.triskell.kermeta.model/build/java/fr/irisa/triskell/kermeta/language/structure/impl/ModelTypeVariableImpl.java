/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelTypeVariableImpl.java,v 1.7 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ModelTypeVariableImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ModelTypeVariableImpl#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ModelTypeVariableImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ModelTypeVariableImpl#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ModelTypeVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ModelTypeVariableImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeVariableImpl extends VirtualTypeContainerImpl implements ModelTypeVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The cached value of the '{@link #getOwnedTags() <em>Owned Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> ownedTags;

	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> containedType;

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
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected Type supertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, StructurePackage.MODEL_TYPE_VARIABLE__TAG, StructurePackage.TAG__OBJECT);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getOwnedTags() {
		if (ownedTags == null) {
			ownedTags = new EObjectContainmentEList.Resolving<Tag>(Tag.class, this, StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS);
		}
		return ownedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer getTypeContainer() {
		if (eContainerFeatureID != StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER) return null;
		return (TypeContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer basicGetTypeContainer() {
		if (eContainerFeatureID != StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER) return null;
		return (TypeContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeContainer(TypeContainer newTypeContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTypeContainer, StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainer(TypeContainer newTypeContainer) {
		if (newTypeContainer != eInternalContainer() || (eContainerFeatureID != StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER && newTypeContainer != null)) {
			if (EcoreUtil.isAncestor(this, newTypeContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypeContainer != null)
				msgs = ((InternalEObject)newTypeContainer).eInverseAdd(this, StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE, TypeContainer.class, msgs);
			msgs = basicSetTypeContainer(newTypeContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER, newTypeContainer, newTypeContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getContainedType() {
		if (containedType == null) {
			containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(Type.class, this, StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject)supertype;
			supertype = (Type)eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE, oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(Type newSupertype) {
		Type oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE, oldSupertype, supertype));
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTag()).basicAdd(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTypeContainer((TypeContainer)otherEnd, msgs);
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS:
				return ((InternalEList<?>)getOwnedTags()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE:
				return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				return basicSetTypeContainer(null, msgs);
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE, TypeContainer.class, msgs);
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TAG:
				return getTag();
			case StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS:
				return getOwnedTags();
			case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				if (resolve) return getTypeContainer();
				return basicGetTypeContainer();
			case StructurePackage.MODEL_TYPE_VARIABLE__NAME:
				return getName();
			case StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS:
				getOwnedTags().clear();
				getOwnedTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				setTypeContainer((TypeContainer)newValue);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE:
				setSupertype((Type)newValue);
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TAG:
				getTag().clear();
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS:
				getOwnedTags().clear();
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				setTypeContainer((TypeContainer)null);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE:
				setSupertype((Type)null);
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
			case StructurePackage.MODEL_TYPE_VARIABLE__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS:
				return ownedTags != null && !ownedTags.isEmpty();
			case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER:
				return basicGetTypeContainer() != null;
			case StructurePackage.MODEL_TYPE_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE:
				return supertype != null;
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
		if (baseClass == fr.irisa.triskell.kermeta.language.structure.Object.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE_VARIABLE__TAG: return StructurePackage.OBJECT__TAG;
				case StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS: return StructurePackage.OBJECT__OWNED_TAGS;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER: return StructurePackage.TYPE__TYPE_CONTAINER;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE_VARIABLE__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeVariable.class) {
			switch (derivedFeatureID) {
				case StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE: return StructurePackage.TYPE_VARIABLE__SUPERTYPE;
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
		if (baseClass == fr.irisa.triskell.kermeta.language.structure.Object.class) {
			switch (baseFeatureID) {
				case StructurePackage.OBJECT__TAG: return StructurePackage.MODEL_TYPE_VARIABLE__TAG;
				case StructurePackage.OBJECT__OWNED_TAGS: return StructurePackage.MODEL_TYPE_VARIABLE__OWNED_TAGS;
				default: return -1;
			}
		}
		if (baseClass == TypeContainer.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.MODEL_TYPE_VARIABLE__CONTAINED_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE__TYPE_CONTAINER: return StructurePackage.MODEL_TYPE_VARIABLE__TYPE_CONTAINER;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.MODEL_TYPE_VARIABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == TypeVariable.class) {
			switch (baseFeatureID) {
				case StructurePackage.TYPE_VARIABLE__SUPERTYPE: return StructurePackage.MODEL_TYPE_VARIABLE__SUPERTYPE;
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
		result.append(')');
		return result.toString();
	}

} //ModelTypeVariableImpl