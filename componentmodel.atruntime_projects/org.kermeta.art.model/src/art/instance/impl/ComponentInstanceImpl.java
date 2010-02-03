/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance.impl;

import art.group.GroupPackage;
import art.group.InstanceGroup;

import art.impl.ModelElementImpl;

import art.implem.ComponentImplementation;

import art.instance.AttributeInstance;
import art.instance.ComponentInstance;
import art.instance.CompositeInstance;
import art.instance.InstancePackage;
import art.instance.TransmissionBinding;

import art.type.ComponentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getImplem <em>Implem</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentInstanceImpl extends ModelElementImpl implements ComponentInstance {

	/**
	 * @generated NOT
	 */
	public String getQualifiedName(){
		String qName = new String();

		ComponentInstance parent = this;
		while(parent != null){
			String parentName;
			if(parent.getName() == null || parent.getSuperComponent() == null)
				parentName = "root";
			else
				parentName = parent.getName();
			qName = parentName+"/"+qName;
			parent = parent.getSuperComponent();
		}
		return qName;
	}

	/**
	 * @generated NOT
	 */
	public boolean isCycling(){
		boolean isCycling = false;
		
		EList<ComponentInstance> servers = new BasicEList<ComponentInstance>();
		for(TransmissionBinding b : this.getBinding()){
			servers.add(b.getServerInstance());
		}
		
		int prevSize = 0;
		while(!(isCycling || prevSize == servers.size())){
			prevSize = servers.size();
			EList<ComponentInstance> tempServers = new BasicEList<ComponentInstance>();
			for(ComponentInstance c : servers){
				for(TransmissionBinding b : c.getBinding()){
					tempServers.add(b.getServerInstance());
				}
			}
			servers.addAll(tempServers);
			isCycling = servers.contains(this);
		}
		
		return isCycling;
	}
	
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeInstance> attribute;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionBinding> binding;

	/**
	 * The cached value of the '{@link #getImplem() <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplem()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation implem;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceGroup> groups;

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
		return InstancePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentType newType) {
		ComponentType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getSuperComponent() {
		if (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT) return null;
		return (CompositeInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperComponent(CompositeInstance newSuperComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperComponent, InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperComponent(CompositeInstance newSuperComponent) {
		if (newSuperComponent != eInternalContainer() || (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT && newSuperComponent != null)) {
			if (EcoreUtil.isAncestor(this, newSuperComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperComponent != null)
				msgs = ((InternalEObject)newSuperComponent).eInverseAdd(this, InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, CompositeInstance.class, msgs);
			msgs = basicSetSuperComponent(newSuperComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT, newSuperComponent, newSuperComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeInstance> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<AttributeInstance>(AttributeInstance.class, this, InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionBinding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<TransmissionBinding>(TransmissionBinding.class, this, InstancePackage.COMPONENT_INSTANCE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation getImplem() {
		return implem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplem(ComponentImplementation newImplem, NotificationChain msgs) {
		ComponentImplementation oldImplem = implem;
		implem = newImplem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__IMPLEM, oldImplem, newImplem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplem(ComponentImplementation newImplem) {
		if (newImplem != implem) {
			NotificationChain msgs = null;
			if (implem != null)
				msgs = ((InternalEObject)implem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.COMPONENT_INSTANCE__IMPLEM, null, msgs);
			if (newImplem != null)
				msgs = ((InternalEObject)newImplem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.COMPONENT_INSTANCE__IMPLEM, null, msgs);
			msgs = basicSetImplem(newImplem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__IMPLEM, newImplem, newImplem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectWithInverseResolvingEList.ManyInverse<InstanceGroup>(InstanceGroup.class, this, InstancePackage.COMPONENT_INSTANCE__GROUPS, GroupPackage.INSTANCE_GROUP__INSTANCES);
		}
		return groups;
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
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperComponent((CompositeInstance)otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__GROUPS:
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
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				return basicSetSuperComponent(null, msgs);
			case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
				return basicSetImplem(null, msgs);
			case InstancePackage.COMPONENT_INSTANCE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT, CompositeInstance.class, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case InstancePackage.COMPONENT_INSTANCE__STATE:
				return getState();
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				return getSuperComponent();
			case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
				return getAttribute();
			case InstancePackage.COMPONENT_INSTANCE__BINDING:
				return getBinding();
			case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
				return getImplem();
			case InstancePackage.COMPONENT_INSTANCE__GROUPS:
				return getGroups();
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
			case InstancePackage.COMPONENT_INSTANCE__TYPE:
				setType((ComponentType)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__STATE:
				setState((String)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				setSuperComponent((CompositeInstance)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends AttributeInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends TransmissionBinding>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
				setImplem((ComponentImplementation)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends InstanceGroup>)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE__TYPE:
				setType((ComponentType)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				setSuperComponent((CompositeInstance)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__BINDING:
				getBinding().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
				setImplem((ComponentImplementation)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__GROUPS:
				getGroups().clear();
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
			case InstancePackage.COMPONENT_INSTANCE__TYPE:
				return type != null;
			case InstancePackage.COMPONENT_INSTANCE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
				return getSuperComponent() != null;
			case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__BINDING:
				return binding != null && !binding.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
				return implem != null;
			case InstancePackage.COMPONENT_INSTANCE__GROUPS:
				return groups != null && !groups.isEmpty();
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
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
