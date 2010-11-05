/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed.impl;

import art_relaxed.group_relaxed.Group_relaxedPackage;
import art_relaxed.group_relaxed.TypeGroup;

import art_relaxed.impl.ModelElementImpl;

import art_relaxed.implem_relaxed.TypeImplementation;

import art_relaxed.type_relaxed.AbstractPort;
import art_relaxed.type_relaxed.Attribute;
import art_relaxed.type_relaxed.ComponentType;
import art_relaxed.type_relaxed.Type_relaxedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art_relaxed.type_relaxed.impl.ComponentTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.impl.ComponentTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.impl.ComponentTypeImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.impl.ComponentTypeImpl#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentTypeImpl extends ModelElementImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPort> port;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeGroup> groups;

	/**
	 * The cached value of the '{@link #getImplem() <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplem()
	 * @generated
	 * @ordered
	 */
	protected TypeImplementation implem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Type_relaxedPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPort> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<AbstractPort>(AbstractPort.class, this, Type_relaxedPackage.COMPONENT_TYPE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, Type_relaxedPackage.COMPONENT_TYPE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectWithInverseResolvingEList.ManyInverse<TypeGroup>(TypeGroup.class, this, Type_relaxedPackage.COMPONENT_TYPE__GROUPS, Group_relaxedPackage.TYPE_GROUP__TYPES);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeImplementation getImplem() {
		return implem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplem(TypeImplementation newImplem, NotificationChain msgs) {
		TypeImplementation oldImplem = implem;
		implem = newImplem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Type_relaxedPackage.COMPONENT_TYPE__IMPLEM, oldImplem, newImplem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplem(TypeImplementation newImplem) {
		if (newImplem != implem) {
			NotificationChain msgs = null;
			if (implem != null)
				msgs = ((InternalEObject)implem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Type_relaxedPackage.COMPONENT_TYPE__IMPLEM, null, msgs);
			if (newImplem != null)
				msgs = ((InternalEObject)newImplem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Type_relaxedPackage.COMPONENT_TYPE__IMPLEM, null, msgs);
			msgs = basicSetImplem(newImplem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Type_relaxedPackage.COMPONENT_TYPE__IMPLEM, newImplem, newImplem));
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
			case Type_relaxedPackage.COMPONENT_TYPE__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
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
			case Type_relaxedPackage.COMPONENT_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case Type_relaxedPackage.COMPONENT_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case Type_relaxedPackage.COMPONENT_TYPE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case Type_relaxedPackage.COMPONENT_TYPE__IMPLEM:
				return basicSetImplem(null, msgs);
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
			case Type_relaxedPackage.COMPONENT_TYPE__PORT:
				return getPort();
			case Type_relaxedPackage.COMPONENT_TYPE__ATTRIBUTE:
				return getAttribute();
			case Type_relaxedPackage.COMPONENT_TYPE__GROUPS:
				return getGroups();
			case Type_relaxedPackage.COMPONENT_TYPE__IMPLEM:
				return getImplem();
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
			case Type_relaxedPackage.COMPONENT_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends AbstractPort>)newValue);
				return;
			case Type_relaxedPackage.COMPONENT_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Type_relaxedPackage.COMPONENT_TYPE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends TypeGroup>)newValue);
				return;
			case Type_relaxedPackage.COMPONENT_TYPE__IMPLEM:
				setImplem((TypeImplementation)newValue);
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
			case Type_relaxedPackage.COMPONENT_TYPE__PORT:
				getPort().clear();
				return;
			case Type_relaxedPackage.COMPONENT_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Type_relaxedPackage.COMPONENT_TYPE__GROUPS:
				getGroups().clear();
				return;
			case Type_relaxedPackage.COMPONENT_TYPE__IMPLEM:
				setImplem((TypeImplementation)null);
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
			case Type_relaxedPackage.COMPONENT_TYPE__PORT:
				return port != null && !port.isEmpty();
			case Type_relaxedPackage.COMPONENT_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case Type_relaxedPackage.COMPONENT_TYPE__GROUPS:
				return groups != null && !groups.isEmpty();
			case Type_relaxedPackage.COMPONENT_TYPE__IMPLEM:
				return implem != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypeImpl
