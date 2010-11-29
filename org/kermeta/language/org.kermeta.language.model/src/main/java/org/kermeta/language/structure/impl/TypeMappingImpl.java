/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.structure.TypeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.TypeMappingImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.TypeMappingImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.TypeMappingImpl#getSourceType <em>Source Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMappingImpl extends TypeContainerImpl implements TypeMapping {
	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EObject mapping;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected Type targetType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.TYPE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(EObject newMapping, NotificationChain msgs) {
		EObject oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.TYPE_MAPPING__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(EObject newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.TYPE_MAPPING__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.TYPE_MAPPING__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.TYPE_MAPPING__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTargetType() {
		if (targetType != null && targetType.eIsProxy()) {
			InternalEObject oldTargetType = (InternalEObject)targetType;
			targetType = (Type)eResolveProxy(oldTargetType);
			if (targetType != oldTargetType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.TYPE_MAPPING__TARGET_TYPE, oldTargetType, targetType));
			}
		}
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(Type newTargetType) {
		Type oldTargetType = targetType;
		targetType = newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.TYPE_MAPPING__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getSourceType() {
		if (eContainerFeatureID() != StructurePackage.TYPE_MAPPING__SOURCE_TYPE) return null;
		return (TypeDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceType(TypeDefinition newSourceType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceType, StructurePackage.TYPE_MAPPING__SOURCE_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(TypeDefinition newSourceType) {
		if (newSourceType != eInternalContainer() || (eContainerFeatureID() != StructurePackage.TYPE_MAPPING__SOURCE_TYPE && newSourceType != null)) {
			if (EcoreUtil.isAncestor(this, newSourceType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceType != null)
				msgs = ((InternalEObject)newSourceType).eInverseAdd(this, StructurePackage.TYPE_DEFINITION__TYPE_MAPPINGS, TypeDefinition.class, msgs);
			msgs = basicSetSourceType(newSourceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.TYPE_MAPPING__SOURCE_TYPE, newSourceType, newSourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceType((TypeDefinition)otherEnd, msgs);
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
			case StructurePackage.TYPE_MAPPING__MAPPING:
				return basicSetMapping(null, msgs);
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				return basicSetSourceType(null, msgs);
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
		switch (eContainerFeatureID()) {
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				return eInternalContainer().eInverseRemove(this, StructurePackage.TYPE_DEFINITION__TYPE_MAPPINGS, TypeDefinition.class, msgs);
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
			case StructurePackage.TYPE_MAPPING__MAPPING:
				return getMapping();
			case StructurePackage.TYPE_MAPPING__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				return getSourceType();
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
			case StructurePackage.TYPE_MAPPING__MAPPING:
				setMapping((EObject)newValue);
				return;
			case StructurePackage.TYPE_MAPPING__TARGET_TYPE:
				setTargetType((Type)newValue);
				return;
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				setSourceType((TypeDefinition)newValue);
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
			case StructurePackage.TYPE_MAPPING__MAPPING:
				setMapping((EObject)null);
				return;
			case StructurePackage.TYPE_MAPPING__TARGET_TYPE:
				setTargetType((Type)null);
				return;
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				setSourceType((TypeDefinition)null);
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
			case StructurePackage.TYPE_MAPPING__MAPPING:
				return mapping != null;
			case StructurePackage.TYPE_MAPPING__TARGET_TYPE:
				return targetType != null;
			case StructurePackage.TYPE_MAPPING__SOURCE_TYPE:
				return getSourceType() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeMappingImpl
