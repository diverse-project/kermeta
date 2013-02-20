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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.behavior.Expression;

import org.kermeta.language.structure.ModelTransformation;
import org.kermeta.language.structure.ModelTypeDefinition;
import org.kermeta.language.structure.ModelTypeVariable;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTransformationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTransformationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTransformationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTransformationImpl#getOwningModelTypeDefinition <em>Owning Model Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTransformationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTransformationImpl#getIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTransformationImpl extends MultiplicityElementImpl implements ModelTransformation {
	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTypeVariable> typeParameters;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> rules;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTypeVariable> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectResolvingEList<ModelTypeVariable>(ModelTypeVariable.class, this, StructurePackage.MODEL_TRANSFORMATION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TRANSFORMATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.MODEL_TRANSFORMATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.MODEL_TRANSFORMATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TRANSFORMATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getRules() {
		if (rules == null) {
			rules = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.MODEL_TRANSFORMATION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeDefinition getOwningModelTypeDefinition() {
		if (eContainerFeatureID() != StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION) return null;
		return (ModelTypeDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningModelTypeDefinition(ModelTypeDefinition newOwningModelTypeDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningModelTypeDefinition, StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningModelTypeDefinition(ModelTypeDefinition newOwningModelTypeDefinition) {
		if (newOwningModelTypeDefinition != eInternalContainer() || (eContainerFeatureID() != StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION && newOwningModelTypeDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwningModelTypeDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningModelTypeDefinition != null)
				msgs = ((InternalEObject)newOwningModelTypeDefinition).eInverseAdd(this, StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS, ModelTypeDefinition.class, msgs);
			msgs = basicSetOwningModelTypeDefinition(newOwningModelTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION, newOwningModelTypeDefinition, newOwningModelTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TRANSFORMATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningModelTypeDefinition((ModelTypeDefinition)otherEnd, msgs);
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
			case StructurePackage.MODEL_TRANSFORMATION__BODY:
				return basicSetBody(null, msgs);
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				return basicSetOwningModelTypeDefinition(null, msgs);
			case StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				return eInternalContainer().eInverseRemove(this, StructurePackage.MODEL_TYPE_DEFINITION__OWNED_TRANSFORMATIONS, ModelTypeDefinition.class, msgs);
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
			case StructurePackage.MODEL_TRANSFORMATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case StructurePackage.MODEL_TRANSFORMATION__BODY:
				return getBody();
			case StructurePackage.MODEL_TRANSFORMATION__RULES:
				return getRules();
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				return getOwningModelTypeDefinition();
			case StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER:
				return getOwnedParameter();
			case StructurePackage.MODEL_TRANSFORMATION__IS_ABSTRACT:
				return getIsAbstract();
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
			case StructurePackage.MODEL_TRANSFORMATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends ModelTypeVariable>)newValue);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__BODY:
				setBody((Expression)newValue);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Operation>)newValue);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				setOwningModelTypeDefinition((ModelTypeDefinition)newValue);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
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
			case StructurePackage.MODEL_TRANSFORMATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case StructurePackage.MODEL_TRANSFORMATION__BODY:
				setBody((Expression)null);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__RULES:
				getRules().clear();
				return;
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				setOwningModelTypeDefinition((ModelTypeDefinition)null);
				return;
			case StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case StructurePackage.MODEL_TRANSFORMATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
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
			case StructurePackage.MODEL_TRANSFORMATION__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case StructurePackage.MODEL_TRANSFORMATION__BODY:
				return body != null;
			case StructurePackage.MODEL_TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
			case StructurePackage.MODEL_TRANSFORMATION__OWNING_MODEL_TYPE_DEFINITION:
				return getOwningModelTypeDefinition() != null;
			case StructurePackage.MODEL_TRANSFORMATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case StructurePackage.MODEL_TRANSFORMATION__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
		}
		return super.eIsSet(featureID);
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ModelTransformationImpl
