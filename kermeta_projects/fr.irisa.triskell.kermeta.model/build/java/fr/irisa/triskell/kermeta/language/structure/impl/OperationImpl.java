/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.behavior.Expression;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.OperationImpl#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MultiplicityElementImpl implements Operation {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList raisedException = null;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameter = null;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected EList pre = null;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList post = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body = null;

	/**
	 * The cached value of the '{@link #getSuperOperation() <em>Super Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation superOperation = null;

	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList typeParameter = null;

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
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList(Type.class, this, StructurePackage.OPERATION__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList(Parameter.class, this, StructurePackage.OPERATION__OWNED_PARAMETER, StructurePackage.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPre() {
		if (pre == null) {
			pre = new EObjectContainmentEList(Constraint.class, this, StructurePackage.OPERATION__PRE);
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPost() {
		if (post == null) {
			post = new EObjectContainmentEList(Constraint.class, this, StructurePackage.OPERATION__POST);
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
	public Operation getSuperOperation() {
		if (superOperation != null && superOperation.eIsProxy()) {
			Operation oldSuperOperation = superOperation;
			superOperation = (Operation)eResolveProxy((InternalEObject)superOperation);
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
	public Operation basicGetSuperOperation() {
		return superOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperOperation(Operation newSuperOperation) {
		Operation oldSuperOperation = superOperation;
		superOperation = newSuperOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__SUPER_OPERATION, oldSuperOperation, superOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getOwningClass() {
		if (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS) return null;
		return (ClassDefinition)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(ClassDefinition newOwningClass) {
		if (newOwningClass != eContainer || (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS && newOwningClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwningClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, ClassDefinition.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningClass, StructurePackage.OPERATION__OWNING_CLASS, msgs);
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
	public EList getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectResolvingEList(TypeVariable.class, this, StructurePackage.OPERATION__TYPE_PARAMETER);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.OPERATION__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				case StructurePackage.OPERATION__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameter()).basicAdd(otherEnd, msgs);
				case StructurePackage.OPERATION__OWNING_CLASS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, StructurePackage.OPERATION__OWNING_CLASS, msgs);
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
				case StructurePackage.OPERATION__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case StructurePackage.OPERATION__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				case StructurePackage.OPERATION__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameter()).basicRemove(otherEnd, msgs);
				case StructurePackage.OPERATION__PRE:
					return ((InternalEList)getPre()).basicRemove(otherEnd, msgs);
				case StructurePackage.OPERATION__POST:
					return ((InternalEList)getPost()).basicRemove(otherEnd, msgs);
				case StructurePackage.OPERATION__BODY:
					return basicSetBody(null, msgs);
				case StructurePackage.OPERATION__OWNING_CLASS:
					return eBasicSetContainer(null, StructurePackage.OPERATION__OWNING_CLASS, msgs);
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
				case StructurePackage.OPERATION__OWNING_CLASS:
					return eContainer.eInverseRemove(this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, ClassDefinition.class, msgs);
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
			case StructurePackage.OPERATION__TAG:
				return getTag();
			case StructurePackage.OPERATION__NAME:
				return getName();
			case StructurePackage.OPERATION__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case StructurePackage.OPERATION__IS_ORDERED:
				return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.OPERATION__IS_UNIQUE:
				return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.OPERATION__LOWER:
				return new Integer(getLower());
			case StructurePackage.OPERATION__UPPER:
				return new Integer(getUpper());
			case StructurePackage.OPERATION__IS_ABSTRACT:
				return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
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
			case StructurePackage.OPERATION__OWNING_CLASS:
				return getOwningClass();
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				return getTypeParameter();
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
			case StructurePackage.OPERATION__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case StructurePackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.OPERATION__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case StructurePackage.OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case StructurePackage.OPERATION__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.OPERATION__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.OPERATION__LOWER:
				setLower(((Integer)newValue).intValue());
				return;
			case StructurePackage.OPERATION__UPPER:
				setUpper(((Integer)newValue).intValue());
				return;
			case StructurePackage.OPERATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.OPERATION__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection)newValue);
				return;
			case StructurePackage.OPERATION__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection)newValue);
				return;
			case StructurePackage.OPERATION__PRE:
				getPre().clear();
				getPre().addAll((Collection)newValue);
				return;
			case StructurePackage.OPERATION__POST:
				getPost().clear();
				getPost().addAll((Collection)newValue);
				return;
			case StructurePackage.OPERATION__BODY:
				setBody((Expression)newValue);
				return;
			case StructurePackage.OPERATION__SUPER_OPERATION:
				setSuperOperation((Operation)newValue);
				return;
			case StructurePackage.OPERATION__OWNING_CLASS:
				setOwningClass((ClassDefinition)newValue);
				return;
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection)newValue);
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
			case StructurePackage.OPERATION__TAG:
				getTag().clear();
				return;
			case StructurePackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.OPERATION__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.OPERATION__TYPE:
				setType((Type)null);
				return;
			case StructurePackage.OPERATION__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case StructurePackage.OPERATION__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case StructurePackage.OPERATION__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case StructurePackage.OPERATION__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
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
				setSuperOperation((Operation)null);
				return;
			case StructurePackage.OPERATION__OWNING_CLASS:
				setOwningClass((ClassDefinition)null);
				return;
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				getTypeParameter().clear();
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
			case StructurePackage.OPERATION__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.OPERATION__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.OPERATION__TYPE:
				return type != null;
			case StructurePackage.OPERATION__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case StructurePackage.OPERATION__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case StructurePackage.OPERATION__LOWER:
				return lower != LOWER_EDEFAULT;
			case StructurePackage.OPERATION__UPPER:
				return upper != UPPER_EDEFAULT;
			case StructurePackage.OPERATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
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
			case StructurePackage.OPERATION__OWNING_CLASS:
				return getOwningClass() != null;
			case StructurePackage.OPERATION__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
