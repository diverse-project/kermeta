/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.ComponentType;
import art2.DictionaryType;
import art2.PortType;
import art2.PortTypeRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.ComponentTypeImpl#getHostedPortTypes <em>Hosted Port Types</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getRequirePortTypes <em>Require Port Types</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getPortTypeRefs <em>Port Type Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends DeployUnitImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getHostedPortTypes() <em>Hosted Port Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> hostedPortTypes;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected DictionaryType dictionary;

	/**
	 * The cached value of the '{@link #getRequirePortTypes() <em>Require Port Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirePortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> requirePortTypes;

	/**
	 * The default value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected String bean = BEAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortTypeRefs() <em>Port Type Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypeRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> portTypeRefs;

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
		return Art2Package.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getHostedPortTypes() {
		if (hostedPortTypes == null) {
			hostedPortTypes = new EObjectContainmentEList<PortType>(PortType.class, this, Art2Package.COMPONENT_TYPE__HOSTED_PORT_TYPES);
		}
		return hostedPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(DictionaryType newDictionary, NotificationChain msgs) {
		DictionaryType oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__DICTIONARY, oldDictionary, newDictionary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(DictionaryType newDictionary) {
		if (newDictionary != dictionary) {
			NotificationChain msgs = null;
			if (dictionary != null)
				msgs = ((InternalEObject)dictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2Package.COMPONENT_TYPE__DICTIONARY, null, msgs);
			if (newDictionary != null)
				msgs = ((InternalEObject)newDictionary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2Package.COMPONENT_TYPE__DICTIONARY, null, msgs);
			msgs = basicSetDictionary(newDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__DICTIONARY, newDictionary, newDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getRequirePortTypes() {
		if (requirePortTypes == null) {
			requirePortTypes = new EObjectResolvingEList<PortType>(PortType.class, this, Art2Package.COMPONENT_TYPE__REQUIRE_PORT_TYPES);
		}
		return requirePortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBean() {
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(String newBean) {
		String oldBean = bean;
		bean = newBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__BEAN, oldBean, bean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getPortTypeRefs() {
		if (portTypeRefs == null) {
			portTypeRefs = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, Art2Package.COMPONENT_TYPE__PORT_TYPE_REFS);
		}
		return portTypeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.COMPONENT_TYPE__HOSTED_PORT_TYPES:
				return ((InternalEList<?>)getHostedPortTypes()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPONENT_TYPE__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case Art2Package.COMPONENT_TYPE__PORT_TYPE_REFS:
				return ((InternalEList<?>)getPortTypeRefs()).basicRemove(otherEnd, msgs);
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
			case Art2Package.COMPONENT_TYPE__HOSTED_PORT_TYPES:
				return getHostedPortTypes();
			case Art2Package.COMPONENT_TYPE__DICTIONARY:
				return getDictionary();
			case Art2Package.COMPONENT_TYPE__REQUIRE_PORT_TYPES:
				return getRequirePortTypes();
			case Art2Package.COMPONENT_TYPE__BEAN:
				return getBean();
			case Art2Package.COMPONENT_TYPE__PORT_TYPE_REFS:
				return getPortTypeRefs();
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
			case Art2Package.COMPONENT_TYPE__HOSTED_PORT_TYPES:
				getHostedPortTypes().clear();
				getHostedPortTypes().addAll((Collection<? extends PortType>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__DICTIONARY:
				setDictionary((DictionaryType)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__REQUIRE_PORT_TYPES:
				getRequirePortTypes().clear();
				getRequirePortTypes().addAll((Collection<? extends PortType>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__BEAN:
				setBean((String)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__PORT_TYPE_REFS:
				getPortTypeRefs().clear();
				getPortTypeRefs().addAll((Collection<? extends PortTypeRef>)newValue);
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
			case Art2Package.COMPONENT_TYPE__HOSTED_PORT_TYPES:
				getHostedPortTypes().clear();
				return;
			case Art2Package.COMPONENT_TYPE__DICTIONARY:
				setDictionary((DictionaryType)null);
				return;
			case Art2Package.COMPONENT_TYPE__REQUIRE_PORT_TYPES:
				getRequirePortTypes().clear();
				return;
			case Art2Package.COMPONENT_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case Art2Package.COMPONENT_TYPE__PORT_TYPE_REFS:
				getPortTypeRefs().clear();
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
			case Art2Package.COMPONENT_TYPE__HOSTED_PORT_TYPES:
				return hostedPortTypes != null && !hostedPortTypes.isEmpty();
			case Art2Package.COMPONENT_TYPE__DICTIONARY:
				return dictionary != null;
			case Art2Package.COMPONENT_TYPE__REQUIRE_PORT_TYPES:
				return requirePortTypes != null && !requirePortTypes.isEmpty();
			case Art2Package.COMPONENT_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case Art2Package.COMPONENT_TYPE__PORT_TYPE_REFS:
				return portTypeRefs != null && !portTypeRefs.isEmpty();
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
		result.append(" (bean: ");
		result.append(bean);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
