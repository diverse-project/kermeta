/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

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

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.ComponentType;
import org.kermeta.art2.DeployUnit;
import org.kermeta.art2.DictionaryType;
import org.kermeta.art2.ExtraFonctionalProperty;
import org.kermeta.art2.IntegrationPattern;
import org.kermeta.art2.PortTypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeImpl#getIntegrationPatterns <em>Integration Patterns</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeImpl#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeImpl#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeImpl#getStopMethod <em>Stop Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends TypeDefinitionImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> required;

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
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<PortTypeRef> provided;

	/**
	 * The default value of the '{@link #getStartMethod() <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String START_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMethod() <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMethod()
	 * @generated
	 * @ordered
	 */
	protected String startMethod = START_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopMethod() <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopMethod() <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopMethod()
	 * @generated
	 * @ordered
	 */
	protected String stopMethod = STOP_METHOD_EDEFAULT;

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
	public EList<PortTypeRef> getRequired() {
		if (required == null) {
			required = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, Art2Package.COMPONENT_TYPE__REQUIRED);
		}
		return required;
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
	public EList<PortTypeRef> getProvided() {
		if (provided == null) {
			provided = new EObjectContainmentEList<PortTypeRef>(PortTypeRef.class, this, Art2Package.COMPONENT_TYPE__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartMethod() {
		return startMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMethod(String newStartMethod) {
		String oldStartMethod = startMethod;
		startMethod = newStartMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__START_METHOD, oldStartMethod, startMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopMethod() {
		return stopMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopMethod(String newStopMethod) {
		String oldStopMethod = stopMethod;
		stopMethod = newStopMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.COMPONENT_TYPE__STOP_METHOD, oldStopMethod, stopMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.COMPONENT_TYPE__REQUIRED:
				return ((InternalEList<?>)getRequired()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return ((InternalEList<?>)getIntegrationPatterns()).basicRemove(otherEnd, msgs);
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return basicSetExtraFonctionalProperties(null, msgs);
			case Art2Package.COMPONENT_TYPE__PROVIDED:
				return ((InternalEList<?>)getProvided()).basicRemove(otherEnd, msgs);
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
			case Art2Package.COMPONENT_TYPE__REQUIRED:
				return getRequired();
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return getIntegrationPatterns();
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return getExtraFonctionalProperties();
			case Art2Package.COMPONENT_TYPE__PROVIDED:
				return getProvided();
			case Art2Package.COMPONENT_TYPE__START_METHOD:
				return getStartMethod();
			case Art2Package.COMPONENT_TYPE__STOP_METHOD:
				return getStopMethod();
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
			case Art2Package.COMPONENT_TYPE__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends PortTypeRef>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				getIntegrationPatterns().clear();
				getIntegrationPatterns().addAll((Collection<? extends IntegrationPattern>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				setExtraFonctionalProperties((ExtraFonctionalProperty)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends PortTypeRef>)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__START_METHOD:
				setStartMethod((String)newValue);
				return;
			case Art2Package.COMPONENT_TYPE__STOP_METHOD:
				setStopMethod((String)newValue);
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
			case Art2Package.COMPONENT_TYPE__REQUIRED:
				getRequired().clear();
				return;
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				getIntegrationPatterns().clear();
				return;
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				setExtraFonctionalProperties((ExtraFonctionalProperty)null);
				return;
			case Art2Package.COMPONENT_TYPE__PROVIDED:
				getProvided().clear();
				return;
			case Art2Package.COMPONENT_TYPE__START_METHOD:
				setStartMethod(START_METHOD_EDEFAULT);
				return;
			case Art2Package.COMPONENT_TYPE__STOP_METHOD:
				setStopMethod(STOP_METHOD_EDEFAULT);
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
			case Art2Package.COMPONENT_TYPE__REQUIRED:
				return required != null && !required.isEmpty();
			case Art2Package.COMPONENT_TYPE__INTEGRATION_PATTERNS:
				return integrationPatterns != null && !integrationPatterns.isEmpty();
			case Art2Package.COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES:
				return extraFonctionalProperties != null;
			case Art2Package.COMPONENT_TYPE__PROVIDED:
				return provided != null && !provided.isEmpty();
			case Art2Package.COMPONENT_TYPE__START_METHOD:
				return START_METHOD_EDEFAULT == null ? startMethod != null : !START_METHOD_EDEFAULT.equals(startMethod);
			case Art2Package.COMPONENT_TYPE__STOP_METHOD:
				return STOP_METHOD_EDEFAULT == null ? stopMethod != null : !STOP_METHOD_EDEFAULT.equals(stopMethod);
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
		result.append(" (startMethod: ");
		result.append(startMethod);
		result.append(", stopMethod: ");
		result.append(stopMethod);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
