/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore.impl;

import ecore.EClassifier;
import ecore.EPackage;
import ecore.ETypeParameter;
import ecore.EcorePackage;

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
 * An implementation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EClassifierImpl#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link ecore.impl.EClassifierImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link ecore.impl.EClassifierImpl#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecore.impl.EClassifierImpl#getInstanceTypeName <em>Instance Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EClassifierImpl extends ENamedElementImpl implements
		EClassifier {
	/**
	 * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected String instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getETypeParameters() <em>EType Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypeParameter> eTypeParameters;

	/**
	 * The default value of the '{@link #getInstanceTypeName() <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceTypeName() <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected String instanceTypeName = INSTANCE_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ECLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		return instanceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClassName(String newInstanceClassName) {
		String oldInstanceClassName = instanceClassName;
		instanceClassName = newInstanceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME,
					oldInstanceClassName, instanceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEPackage() {
		if (eContainerFeatureID() != EcorePackage.ECLASSIFIER__EPACKAGE)
			return null;
		return (EPackage) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetEPackage() {
		if (eContainerFeatureID() != EcorePackage.ECLASSIFIER__EPACKAGE)
			return null;
		return (EPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypeParameter> getETypeParameters() {
		if (eTypeParameters == null) {
			eTypeParameters = new EObjectContainmentEList.Resolving<ETypeParameter>(
					ETypeParameter.class, this,
					EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS);
		}
		return eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceTypeName() {
		return instanceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceTypeName(String newInstanceTypeName) {
		String oldInstanceTypeName = instanceTypeName;
		instanceTypeName = newInstanceTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME,
					oldInstanceTypeName, instanceTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstance(Object object) {
		java.lang.Boolean result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClassifierID() {
		java.lang.Integer result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getterInstanceClass() {

		java.lang.Class result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getterDefaultValue() {

		java.lang.Object result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.ECLASSIFIER__EPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return eBasicSetContainer(otherEnd,
					EcorePackage.ECLASSIFIER__EPACKAGE, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.ECLASSIFIER__EPACKAGE:
			return eBasicSetContainer(null, EcorePackage.ECLASSIFIER__EPACKAGE,
					msgs);
		case EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS:
			return ((InternalEList<?>) getETypeParameters()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EcorePackage.ECLASSIFIER__EPACKAGE:
			return eInternalContainer().eInverseRemove(this,
					EcorePackage.EPACKAGE__ECLASSIFIERS, EPackage.class, msgs);
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
		case EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
			return getInstanceClassName();
		case EcorePackage.ECLASSIFIER__EPACKAGE:
			if (resolve)
				return getEPackage();
			return basicGetEPackage();
		case EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS:
			return getETypeParameters();
		case EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
			return getInstanceTypeName();
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
		case EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
			setInstanceClassName((String) newValue);
			return;
		case EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS:
			getETypeParameters().clear();
			getETypeParameters().addAll(
					(Collection<? extends ETypeParameter>) newValue);
			return;
		case EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
			setInstanceTypeName((String) newValue);
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
		case EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
			setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
			return;
		case EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS:
			getETypeParameters().clear();
			return;
		case EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
			setInstanceTypeName(INSTANCE_TYPE_NAME_EDEFAULT);
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
		case EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME:
			return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null
					: !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
		case EcorePackage.ECLASSIFIER__EPACKAGE:
			return basicGetEPackage() != null;
		case EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS:
			return eTypeParameters != null && !eTypeParameters.isEmpty();
		case EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME:
			return INSTANCE_TYPE_NAME_EDEFAULT == null ? instanceTypeName != null
					: !INSTANCE_TYPE_NAME_EDEFAULT.equals(instanceTypeName);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (instanceClassName: ");
		result.append(instanceClassName);
		result.append(", instanceTypeName: ");
		result.append(instanceTypeName);
		result.append(')');
		return result.toString();
	}

} //EClassifierImpl
