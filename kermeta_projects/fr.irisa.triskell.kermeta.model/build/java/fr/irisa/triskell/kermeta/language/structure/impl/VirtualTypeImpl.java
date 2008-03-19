/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualTypeImpl.java,v 1.5 2008-03-19 16:34:13 cfaucher Exp $
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.VirtualTypeImpl#getClassDefinition <em>Class Definition</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.VirtualTypeImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.VirtualTypeImpl#getTypeParamBinding <em>Type Param Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualTypeImpl extends ObjectTypeVariableImpl implements VirtualType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * The cached value of the '{@link #getClassDefinition() <em>Class Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDefinition()
	 * @generated
	 * @ordered
	 */
	protected ClassDefinition classDefinition;

	/**
	 * The cached value of the '{@link #getTypeParamBinding() <em>Type Param Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParamBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> typeParamBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.VIRTUAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getClassDefinition() {
		if (classDefinition != null && classDefinition.eIsProxy()) {
			InternalEObject oldClassDefinition = (InternalEObject)classDefinition;
			classDefinition = (ClassDefinition)eResolveProxy(oldClassDefinition);
			if (classDefinition != oldClassDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION, oldClassDefinition, classDefinition));
			}
		}
		return classDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition basicGetClassDefinition() {
		return classDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassDefinition(ClassDefinition newClassDefinition) {
		ClassDefinition oldClassDefinition = classDefinition;
		classDefinition = newClassDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION, oldClassDefinition, classDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeVariable getModelType() {
		if (eContainerFeatureID != StructurePackage.VIRTUAL_TYPE__MODEL_TYPE) return null;
		return (ModelTypeVariable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeVariable basicGetModelType() {
		if (eContainerFeatureID != StructurePackage.VIRTUAL_TYPE__MODEL_TYPE) return null;
		return (ModelTypeVariable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelType(ModelTypeVariable newModelType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelType, StructurePackage.VIRTUAL_TYPE__MODEL_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelType(ModelTypeVariable newModelType) {
		if (newModelType != eInternalContainer() || (eContainerFeatureID != StructurePackage.VIRTUAL_TYPE__MODEL_TYPE && newModelType != null)) {
			if (EcoreUtil.isAncestor(this, newModelType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelType != null)
				msgs = ((InternalEObject)newModelType).eInverseAdd(this, StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE, ModelTypeVariable.class, msgs);
			msgs = basicSetModelType(newModelType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VIRTUAL_TYPE__MODEL_TYPE, newModelType, newModelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getTypeParamBinding() {
		if (typeParamBinding == null) {
			typeParamBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(TypeVariableBinding.class, this, StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING);
		}
		return typeParamBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelType((ModelTypeVariable)otherEnd, msgs);
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
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				return basicSetModelType(null, msgs);
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				return ((InternalEList<?>)getTypeParamBinding()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				return eInternalContainer().eInverseRemove(this, StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE, ModelTypeVariable.class, msgs);
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
			case StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION:
				if (resolve) return getClassDefinition();
				return basicGetClassDefinition();
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				if (resolve) return getModelType();
				return basicGetModelType();
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				return getTypeParamBinding();
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
			case StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION:
				setClassDefinition((ClassDefinition)newValue);
				return;
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				setModelType((ModelTypeVariable)newValue);
				return;
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				getTypeParamBinding().clear();
				getTypeParamBinding().addAll((Collection<? extends TypeVariableBinding>)newValue);
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
			case StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION:
				setClassDefinition((ClassDefinition)null);
				return;
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				setModelType((ModelTypeVariable)null);
				return;
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				getTypeParamBinding().clear();
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
			case StructurePackage.VIRTUAL_TYPE__CLASS_DEFINITION:
				return classDefinition != null;
			case StructurePackage.VIRTUAL_TYPE__MODEL_TYPE:
				return basicGetModelType() != null;
			case StructurePackage.VIRTUAL_TYPE__TYPE_PARAM_BINDING:
				return typeParamBinding != null && !typeParamBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualTypeImpl