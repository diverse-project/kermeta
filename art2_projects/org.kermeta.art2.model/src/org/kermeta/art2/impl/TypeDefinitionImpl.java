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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.kermeta.art2.Art2Package;
import org.kermeta.art2.DeployUnit;
import org.kermeta.art2.DictionaryType;
import org.kermeta.art2.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.TypeDefinitionImpl#getDeployUnit <em>Deploy Unit</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.TypeDefinitionImpl#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.TypeDefinitionImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.TypeDefinitionImpl#getRequiredLibs <em>Required Libs</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.TypeDefinitionImpl#getDictionaryType <em>Dictionary Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionImpl extends NamedElementImpl implements TypeDefinition {
	/**
	 * The cached value of the '{@link #getDeployUnit() <em>Deploy Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployUnit()
	 * @generated
	 * @ordered
	 */
	protected DeployUnit deployUnit;

	/**
	 * The default value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_BEAN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryBean()
	 * @generated
	 * @ordered
	 */
	protected String factoryBean = FACTORY_BEAN_EDEFAULT;
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
	 * The cached value of the '{@link #getRequiredLibs() <em>Required Libs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLibs()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployUnit> requiredLibs;

	/**
	 * The cached value of the '{@link #getDictionaryType() <em>Dictionary Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryType()
	 * @generated
	 * @ordered
	 */
	protected DictionaryType dictionaryType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployUnit getDeployUnit() {
		if (deployUnit != null && deployUnit.eIsProxy()) {
			InternalEObject oldDeployUnit = (InternalEObject)deployUnit;
			deployUnit = (DeployUnit)eResolveProxy(oldDeployUnit);
			if (deployUnit != oldDeployUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.TYPE_DEFINITION__DEPLOY_UNIT, oldDeployUnit, deployUnit));
			}
		}
		return deployUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployUnit basicGetDeployUnit() {
		return deployUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployUnit(DeployUnit newDeployUnit) {
		DeployUnit oldDeployUnit = deployUnit;
		deployUnit = newDeployUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.TYPE_DEFINITION__DEPLOY_UNIT, oldDeployUnit, deployUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryBean() {
		return factoryBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryBean(String newFactoryBean) {
		String oldFactoryBean = factoryBean;
		factoryBean = newFactoryBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.TYPE_DEFINITION__FACTORY_BEAN, oldFactoryBean, factoryBean));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.TYPE_DEFINITION__BEAN, oldBean, bean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getRequiredLibs() {
		if (requiredLibs == null) {
			requiredLibs = new EObjectResolvingEList<DeployUnit>(DeployUnit.class, this, Art2Package.TYPE_DEFINITION__REQUIRED_LIBS);
		}
		return requiredLibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType getDictionaryType() {
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionaryType(DictionaryType newDictionaryType, NotificationChain msgs) {
		DictionaryType oldDictionaryType = dictionaryType;
		dictionaryType = newDictionaryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE, oldDictionaryType, newDictionaryType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryType(DictionaryType newDictionaryType) {
		if (newDictionaryType != dictionaryType) {
			NotificationChain msgs = null;
			if (dictionaryType != null)
				msgs = ((InternalEObject)dictionaryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE, null, msgs);
			if (newDictionaryType != null)
				msgs = ((InternalEObject)newDictionaryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE, null, msgs);
			msgs = basicSetDictionaryType(newDictionaryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE, newDictionaryType, newDictionaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE:
				return basicSetDictionaryType(null, msgs);
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
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				if (resolve) return getDeployUnit();
				return basicGetDeployUnit();
			case Art2Package.TYPE_DEFINITION__FACTORY_BEAN:
				return getFactoryBean();
			case Art2Package.TYPE_DEFINITION__BEAN:
				return getBean();
			case Art2Package.TYPE_DEFINITION__REQUIRED_LIBS:
				return getRequiredLibs();
			case Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE:
				return getDictionaryType();
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
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				setDeployUnit((DeployUnit)newValue);
				return;
			case Art2Package.TYPE_DEFINITION__FACTORY_BEAN:
				setFactoryBean((String)newValue);
				return;
			case Art2Package.TYPE_DEFINITION__BEAN:
				setBean((String)newValue);
				return;
			case Art2Package.TYPE_DEFINITION__REQUIRED_LIBS:
				getRequiredLibs().clear();
				getRequiredLibs().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)newValue);
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
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				setDeployUnit((DeployUnit)null);
				return;
			case Art2Package.TYPE_DEFINITION__FACTORY_BEAN:
				setFactoryBean(FACTORY_BEAN_EDEFAULT);
				return;
			case Art2Package.TYPE_DEFINITION__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case Art2Package.TYPE_DEFINITION__REQUIRED_LIBS:
				getRequiredLibs().clear();
				return;
			case Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE:
				setDictionaryType((DictionaryType)null);
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
			case Art2Package.TYPE_DEFINITION__DEPLOY_UNIT:
				return deployUnit != null;
			case Art2Package.TYPE_DEFINITION__FACTORY_BEAN:
				return FACTORY_BEAN_EDEFAULT == null ? factoryBean != null : !FACTORY_BEAN_EDEFAULT.equals(factoryBean);
			case Art2Package.TYPE_DEFINITION__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case Art2Package.TYPE_DEFINITION__REQUIRED_LIBS:
				return requiredLibs != null && !requiredLibs.isEmpty();
			case Art2Package.TYPE_DEFINITION__DICTIONARY_TYPE:
				return dictionaryType != null;
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
		result.append(" (factoryBean: ");
		result.append(factoryBean);
		result.append(", bean: ");
		result.append(bean);
		result.append(')');
		return result.toString();
	}

} //TypeDefinitionImpl
