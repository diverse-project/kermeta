/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.ComponentInstance;
import art2.ComponentType;
import art2.Dictionary;
import art2.Namespace;
import art2.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.ComponentInstanceImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link art2.impl.ComponentInstanceImpl#getHostedPorts <em>Hosted Ports</em>}</li>
 *   <li>{@link art2.impl.ComponentInstanceImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link art2.impl.ComponentInstanceImpl#getRequirePorts <em>Require Ports</em>}</li>
 *   <li>{@link art2.impl.ComponentInstanceImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends NamedElementImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType componentType;

	/**
	 * The cached value of the '{@link #getHostedPorts() <em>Hosted Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> hostedPorts;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected Dictionary dictionary;

	/**
	 * The cached value of the '{@link #getRequirePorts() <em>Require Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> requirePorts;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (ComponentType)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(ComponentType newComponentType) {
		ComponentType oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getHostedPorts() {
		if (hostedPorts == null) {
			hostedPorts = new EObjectContainmentEList<Port>(Port.class, this, Art2Package.COMPONENT_INSTANCE__HOSTED_PORTS);
		}
		return hostedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(Dictionary newDictionary, NotificationChain msgs) {
		Dictionary oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_INSTANCE__DICTIONARY, oldDictionary, newDictionary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(Dictionary newDictionary) {
		if (newDictionary != dictionary) {
			NotificationChain msgs = null;
			if (dictionary != null)
				msgs = ((InternalEObject)dictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2Package.COMPONENT_INSTANCE__DICTIONARY, null, msgs);
			if (newDictionary != null)
				msgs = ((InternalEObject)newDictionary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2Package.COMPONENT_INSTANCE__DICTIONARY, null, msgs);
			msgs = basicSetDictionary(newDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_INSTANCE__DICTIONARY, newDictionary, newDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getRequirePorts() {
		if (requirePorts == null) {
			requirePorts = new EObjectContainmentEList<Port>(Port.class, this, Art2Package.COMPONENT_INSTANCE__REQUIRE_PORTS);
		}
		return requirePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (Namespace)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.COMPONENT_INSTANCE__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_INSTANCE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.COMPONENT_INSTANCE__HOSTED_PORTS:
				return ((InternalEList<?>)getHostedPorts()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPONENT_INSTANCE__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case Art2Package.COMPONENT_INSTANCE__REQUIRE_PORTS:
				return ((InternalEList<?>)getRequirePorts()).basicRemove(otherEnd, msgs);
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
			case Art2Package.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case Art2Package.COMPONENT_INSTANCE__HOSTED_PORTS:
				return getHostedPorts();
			case Art2Package.COMPONENT_INSTANCE__DICTIONARY:
				return getDictionary();
			case Art2Package.COMPONENT_INSTANCE__REQUIRE_PORTS:
				return getRequirePorts();
			case Art2Package.COMPONENT_INSTANCE__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
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
			case Art2Package.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((ComponentType)newValue);
				return;
			case Art2Package.COMPONENT_INSTANCE__HOSTED_PORTS:
				getHostedPorts().clear();
				getHostedPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case Art2Package.COMPONENT_INSTANCE__DICTIONARY:
				setDictionary((Dictionary)newValue);
				return;
			case Art2Package.COMPONENT_INSTANCE__REQUIRE_PORTS:
				getRequirePorts().clear();
				getRequirePorts().addAll((Collection<? extends Port>)newValue);
				return;
			case Art2Package.COMPONENT_INSTANCE__NAMESPACE:
				setNamespace((Namespace)newValue);
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
			case Art2Package.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((ComponentType)null);
				return;
			case Art2Package.COMPONENT_INSTANCE__HOSTED_PORTS:
				getHostedPorts().clear();
				return;
			case Art2Package.COMPONENT_INSTANCE__DICTIONARY:
				setDictionary((Dictionary)null);
				return;
			case Art2Package.COMPONENT_INSTANCE__REQUIRE_PORTS:
				getRequirePorts().clear();
				return;
			case Art2Package.COMPONENT_INSTANCE__NAMESPACE:
				setNamespace((Namespace)null);
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
			case Art2Package.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return componentType != null;
			case Art2Package.COMPONENT_INSTANCE__HOSTED_PORTS:
				return hostedPorts != null && !hostedPorts.isEmpty();
			case Art2Package.COMPONENT_INSTANCE__DICTIONARY:
				return dictionary != null;
			case Art2Package.COMPONENT_INSTANCE__REQUIRE_PORTS:
				return requirePorts != null && !requirePorts.isEmpty();
			case Art2Package.COMPONENT_INSTANCE__NAMESPACE:
				return namespace != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstanceImpl
