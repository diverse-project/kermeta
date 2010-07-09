/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.Art2AspectPackage;
import Art2Aspect.ComponentTypePattern;
import Art2Aspect.PortTypePattern;
import Art2Aspect.PortTypeRefPattern;

import art2.ComponentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Art2Aspect.impl.ComponentTypePatternImpl#getRequiredPortTypeRefPatterns <em>Required Port Type Ref Patterns</em>}</li>
 *   <li>{@link Art2Aspect.impl.ComponentTypePatternImpl#getProvidedPortTypeRefPatterns <em>Provided Port Type Ref Patterns</em>}</li>
 *   <li>{@link Art2Aspect.impl.ComponentTypePatternImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypePatternImpl extends EObjectImpl implements ComponentTypePattern {
	/**
	 * The cached value of the '{@link #getRequiredPortTypeRefPatterns() <em>Required Port Type Ref Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPortTypeRefPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList requiredPortTypeRefPatterns;

	/**
	 * The cached value of the '{@link #getProvidedPortTypeRefPatterns() <em>Provided Port Type Ref Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortTypeRefPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList providedPortTypeRefPatterns;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Art2AspectPackage.Literals.COMPONENT_TYPE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequiredPortTypeRefPatterns() {
		if (requiredPortTypeRefPatterns == null) {
			requiredPortTypeRefPatterns = new EObjectContainmentEList(PortTypeRefPattern.class, this, Art2AspectPackage.COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS);
		}
		return requiredPortTypeRefPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProvidedPortTypeRefPatterns() {
		if (providedPortTypeRefPatterns == null) {
			providedPortTypeRefPatterns = new EObjectContainmentEList(PortTypeRefPattern.class, this, Art2AspectPackage.COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS);
		}
		return providedPortTypeRefPatterns;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2AspectPackage.COMPONENT_TYPE_PATTERN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Art2AspectPackage.COMPONENT_TYPE_PATTERN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS:
				return ((InternalEList)getRequiredPortTypeRefPatterns()).basicRemove(otherEnd, msgs);
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS:
				return ((InternalEList)getProvidedPortTypeRefPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS:
				return getRequiredPortTypeRefPatterns();
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS:
				return getProvidedPortTypeRefPatterns();
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS:
				getRequiredPortTypeRefPatterns().clear();
				getRequiredPortTypeRefPatterns().addAll((Collection)newValue);
				return;
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS:
				getProvidedPortTypeRefPatterns().clear();
				getProvidedPortTypeRefPatterns().addAll((Collection)newValue);
				return;
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__TYPE:
				setType((ComponentType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS:
				getRequiredPortTypeRefPatterns().clear();
				return;
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS:
				getProvidedPortTypeRefPatterns().clear();
				return;
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__TYPE:
				setType((ComponentType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__REQUIRED_PORT_TYPE_REF_PATTERNS:
				return requiredPortTypeRefPatterns != null && !requiredPortTypeRefPatterns.isEmpty();
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__PROVIDED_PORT_TYPE_REF_PATTERNS:
				return providedPortTypeRefPatterns != null && !providedPortTypeRefPatterns.isEmpty();
			case Art2AspectPackage.COMPONENT_TYPE_PATTERN__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypePatternImpl
