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
import art2.ExtraFonctionalProperty;
import art2.IntegrationPattern;
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
 *   <li>{@link art2.impl.ComponentTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getNeededPortTypes <em>Needed Port Types</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getIntegrationPatterns <em>Integration Patterns</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link art2.impl.ComponentTypeImpl#getOfferedPortTypes <em>Offered Port Types</em>}</li>
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
	 * The cached value of the '{@link #getNeededPortTypes() <em>Needed Port Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> neededPortTypes;

	/**
	 * The cached value of the '{@link #getIntegrationPatterns() <em>Integration Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationPattern> integrationPatterns;

	/**
	 * The cached value of the '{@link #getExtraFonctionalProperties() <em>Extra Fonctional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraFonctionalProperties()
	 * @generated
	 * @ordered
	 */
	protected ExtraFonctionalProperty extraFonctionalProperties;

	/**
	 * The cached value of the '{@link #getOfferedPortTypes() <em>Offered Port Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> offeredPortTypes;

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
	public EList<PortTypeRef> getNeededPortTypes() {
		if (neededPortTypes == null) {
			neededPortTypes = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, Art2Package.COMPONENT_TYPE__NEEDED_PORT_TYPES);
		}
		return neededPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrationPattern> getIntegrationPatterns() {
		if (integrationPatterns == null) {
			integrationPatterns = new EObjectContainmentEList<IntegrationPattern>(IntegrationPattern.class, this, Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS);
		}
		return integrationPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraFonctionalProperty getExtraFonctionalProperties() {
		return extraFonctionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraFonctionalProperties(ExtraFonctionalProperty newExtraFonctionalProperties, NotificationChain msgs) {
		ExtraFonctionalProperty oldExtraFonctionalProperties = extraFonctionalProperties;
		extraFonctionalProperties = newExtraFonctionalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, oldExtraFonctionalProperties, newExtraFonctionalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraFonctionalProperties(ExtraFonctionalProperty newExtraFonctionalProperties) {
		if (newExtraFonctionalProperties != extraFonctionalProperties) {
			NotificationChain msgs = null;
			if (extraFonctionalProperties != null)
				msgs = ((InternalEObject)extraFonctionalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, null, msgs);
			if (newExtraFonctionalProperties != null)
				msgs = ((InternalEObject)newExtraFonctionalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, null, msgs);
			msgs = basicSetExtraFonctionalProperties(newExtraFonctionalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES, newExtraFonctionalProperties, newExtraFonctionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeRef> getOfferedPortTypes() {
		if (offeredPortTypes == null) {
			offeredPortTypes = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, Art2Package.COMPONENT_TYPE__OFFERED_PORT_TYPES);
		}
		return offeredPortTypes;
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
			case Art2Package.COMPONENT_TYPE__NEEDED_PORT_TYPES:
				return ((InternalEList<?>)getNeededPortTypes()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return ((InternalEList<?>)getIntegrationPatterns()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return basicSetExtraFonctionalProperties(null, msgs);
			case Art2Package.COMPONENT_TYPE__OFFERED_PORT_TYPES:
				return ((InternalEList<?>)getOfferedPortTypes()).basicRemove(otherEnd, msgs);
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
			case Art2Package.COMPONENT_TYPE__BEAN:
				return getBean();
			case Art2Package.COMPONENT_TYPE__NEEDED_PORT_TYPES:
				return getNeededPortTypes();
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return getIntegrationPatterns();
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return getExtraFonctionalProperties();
			case Art2Package.COMPONENT_TYPE__OFFERED_PORT_TYPES:
				return getOfferedPortTypes();
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
			case Art2Package.COMPONENT_TYPE__BEAN:
				setBean((String)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__NEEDED_PORT_TYPES:
				getNeededPortTypes().clear();
				getNeededPortTypes().addAll((Collection<? extends PortTypeRef>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				getIntegrationPatterns().clear();
				getIntegrationPatterns().addAll((Collection<? extends IntegrationPattern>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				setExtraFonctionalProperties((ExtraFonctionalProperty)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__OFFERED_PORT_TYPES:
				getOfferedPortTypes().clear();
				getOfferedPortTypes().addAll((Collection<? extends PortTypeRef>)newValue);
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
			case Art2Package.COMPONENT_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case Art2Package.COMPONENT_TYPE__NEEDED_PORT_TYPES:
				getNeededPortTypes().clear();
				return;
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				getIntegrationPatterns().clear();
				return;
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				setExtraFonctionalProperties((ExtraFonctionalProperty)null);
				return;
			case Art2Package.COMPONENT_TYPE__OFFERED_PORT_TYPES:
				getOfferedPortTypes().clear();
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
			case Art2Package.COMPONENT_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case Art2Package.COMPONENT_TYPE__NEEDED_PORT_TYPES:
				return neededPortTypes != null && !neededPortTypes.isEmpty();
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return integrationPatterns != null && !integrationPatterns.isEmpty();
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return extraFonctionalProperties != null;
			case Art2Package.COMPONENT_TYPE__OFFERED_PORT_TYPES:
				return offeredPortTypes != null && !offeredPortTypes.isEmpty();
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
