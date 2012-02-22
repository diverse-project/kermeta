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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.language.behavior.Expression;
import org.kermeta.language.structure.AbstractOperation;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Parameter;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeVariable;
import org.kermeta.language.structure.UnresolvedOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getOwnedUnresolvedOperations <em>Owned Unresolved Operations</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.OperationImpl#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MultiplicityElementImpl implements Operation {
	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

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
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

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
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> post;

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
	 * The cached value of the '{@link #getSuperOperation() <em>Super Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperOperation()
	 * @generated
	 * @ordered
	 */
	protected AbstractOperation superOperation;

	/**
	 * The cached value of the '{@link #getOwnedUnresolvedOperations() <em>Owned Unresolved Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUnresolvedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<UnresolvedOperation> ownedUnresolvedOperations;

	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariable> typeParameter;

	/**
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueName = UNIQUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.OPERATION__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, StructurePackage.OPERATION__OWNED_PARAMETER, StructurePackage.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPre() {
		if (pre == null) {
			pre = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, StructurePackage.OPERATION__PRE, StructurePackage.CONSTRAINT__PRE_OWNER);
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPost() {
		if (post == null) {
			post = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, StructurePackage.OPERATION__POST, StructurePackage.CONSTRAINT__POST_OWNER);
		}
		return post;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OPERATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OPERATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOperation getSuperOperation() {
		if (superOperation != null && superOperation.eIsProxy()) {
			InternalEObject oldSuperOperation = (InternalEObject)superOperation;
			superOperation = (AbstractOperation)eResolveProxy(oldSuperOperation);
			if (superOperation != oldSuperOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.OPERATION__SUPER_OPERATION, oldSuperOperation, superOperation));
			}
		}
		return superOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOperation basicGetSuperOperation() {
		return superOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperOperation(AbstractOperation newSuperOperation) {
		AbstractOperation oldSuperOperation = superOperation;
		superOperation = newSuperOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__SUPER_OPERATION, oldSuperOperation, superOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnresolvedOperation> getOwnedUnresolvedOperations() {
		if (ownedUnresolvedOperations == null) {
			ownedUnresolvedOperations = new EObjectContainmentEList<UnresolvedOperation>(UnresolvedOperation.class, this, StructurePackage.OPERATION__OWNED_UNRESOLVED_OPERATIONS);
		}
		return ownedUnresolvedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getOwningClass() {
		if (eContainerFeatureID() != StructurePackage.OPERATION__OWNING_CLASS) return null;
		return (ClassDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(ClassDefinition newOwningClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningClass, StructurePackage.OPERATION__OWNING_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(ClassDefinition newOwningClass) {
		if (newOwningClass != eInternalContainer() || (eContainerFeatureID() != StructurePackage.OPERATION__OWNING_CLASS && newOwningClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwningClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, ClassDefinition.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__OWNING_CLASS, newOwningClass, newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariable> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectResolvingEList<TypeVariable>(TypeVariable.class, this, StructurePackage.OPERATION__TYPE_PARAMETER);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getUniqueName() {
		if (uniqueName==null) {
			StringBuffer unique = new StringBuffer();
			unique.append(this.getName());
			unique.append(getOwnedParameter().size());
			for (Parameter aParameter : getOwnedParameter()) {
				unique.append(aParameter.getType());
			}
			setUniqueName(unique.toString());
		}
		return uniqueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueName(String newUniqueName) {
		String oldUniqueName = uniqueName;
		uniqueName = newUniqueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__UNIQUE_NAME, oldUniqueName, uniqueName));
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
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
			case StructurePackage.OPERATION__PRE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPre()).basicAdd(otherEnd, msgs);
			case StructurePackage.OPERATION__POST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPost()).basicAdd(otherEnd, msgs);
			case StructurePackage.OPERATION__OWNING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningClass((ClassDefinition)otherEnd, msgs);
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
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case StructurePackage.OPERATION__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case StructurePackage.OPERATION__POST:
				return ((InternalEList<?>)getPost()).basicRemove(otherEnd, msgs);
			case StructurePackage.OPERATION__BODY:
				return basicSetBody(null, msgs);
			case StructurePackage.OPERATION__OWNED_UNRESOLVED_OPERATIONS:
				return ((InternalEList<?>)getOwnedUnresolvedOperations()).basicRemove(otherEnd, msgs);
			case StructurePackage.OPERATION__OWNING_CLASS:
				return basicSetOwningClass(null, msgs);
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
			case StructurePackage.OPERATION__OWNING_CLASS:
				return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, ClassDefinition.class, msgs);
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
			case StructurePackage.OPERATION__IS_ABSTRACT:
				return getIsAbstract();
			case StructurePackage.OPERATION__RAISED_EXCEPTION:
				return getRaisedException();
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				return getOwnedParameter();
			case StructurePackage.OPERATION__PRE:
				return getPre();
			case StructurePackage.OPERATION__POST:
				return getPost();
			case StructurePackage.OPERATION__BODY:
				return getBody();
			case StructurePackage.OPERATION__SUPER_OPERATION:
				if (resolve) return getSuperOperation();
				return basicGetSuperOperation();
			case StructurePackage.OPERATION__OWNED_UNRESOLVED_OPERATIONS:
				return getOwnedUnresolvedOperations();
			case StructurePackage.OPERATION__OWNING_CLASS:
				return getOwningClass();
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				return getTypeParameter();
			case StructurePackage.OPERATION__UNIQUE_NAME:
				return getUniqueName();
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
			case StructurePackage.OPERATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case StructurePackage.OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
				return;
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case StructurePackage.OPERATION__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends Constraint>)newValue);
				return;
			case StructurePackage.OPERATION__POST:
				getPost().clear();
				getPost().addAll((Collection<? extends Constraint>)newValue);
				return;
			case StructurePackage.OPERATION__BODY:
				setBody((Expression)newValue);
				return;
			case StructurePackage.OPERATION__SUPER_OPERATION:
				setSuperOperation((AbstractOperation)newValue);
				return;
			case StructurePackage.OPERATION__OWNED_UNRESOLVED_OPERATIONS:
				getOwnedUnresolvedOperations().clear();
				getOwnedUnresolvedOperations().addAll((Collection<? extends UnresolvedOperation>)newValue);
				return;
			case StructurePackage.OPERATION__OWNING_CLASS:
				setOwningClass((ClassDefinition)newValue);
				return;
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection<? extends TypeVariable>)newValue);
				return;
			case StructurePackage.OPERATION__UNIQUE_NAME:
				setUniqueName((String)newValue);
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
			case StructurePackage.OPERATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case StructurePackage.OPERATION__PRE:
				getPre().clear();
				return;
			case StructurePackage.OPERATION__POST:
				getPost().clear();
				return;
			case StructurePackage.OPERATION__BODY:
				setBody((Expression)null);
				return;
			case StructurePackage.OPERATION__SUPER_OPERATION:
				setSuperOperation((AbstractOperation)null);
				return;
			case StructurePackage.OPERATION__OWNED_UNRESOLVED_OPERATIONS:
				getOwnedUnresolvedOperations().clear();
				return;
			case StructurePackage.OPERATION__OWNING_CLASS:
				setOwningClass((ClassDefinition)null);
				return;
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				getTypeParameter().clear();
				return;
			case StructurePackage.OPERATION__UNIQUE_NAME:
				setUniqueName(UNIQUE_NAME_EDEFAULT);
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
			case StructurePackage.OPERATION__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case StructurePackage.OPERATION__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case StructurePackage.OPERATION__PRE:
				return pre != null && !pre.isEmpty();
			case StructurePackage.OPERATION__POST:
				return post != null && !post.isEmpty();
			case StructurePackage.OPERATION__BODY:
				return body != null;
			case StructurePackage.OPERATION__SUPER_OPERATION:
				return superOperation != null;
			case StructurePackage.OPERATION__OWNED_UNRESOLVED_OPERATIONS:
				return ownedUnresolvedOperations != null && !ownedUnresolvedOperations.isEmpty();
			case StructurePackage.OPERATION__OWNING_CLASS:
				return getOwningClass() != null;
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
			case StructurePackage.OPERATION__UNIQUE_NAME:
				return UNIQUE_NAME_EDEFAULT == null ? uniqueName != null : !UNIQUE_NAME_EDEFAULT.equals(uniqueName);
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
		result.append(", uniqueName: ");
		result.append(uniqueName);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
