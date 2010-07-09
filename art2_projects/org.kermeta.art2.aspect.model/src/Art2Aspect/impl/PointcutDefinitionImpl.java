/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.Art2AspectPackage;
import Art2Aspect.ComponentTypePattern;
import Art2Aspect.NodePattern;
import Art2Aspect.PointcutDefinition;

import Art2Aspect.PortTypePattern;
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
 * An implementation of the model object '<em><b>Pointcut Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Art2Aspect.impl.PointcutDefinitionImpl#getComponentTypePatterns <em>Component Type Patterns</em>}</li>
 *   <li>{@link Art2Aspect.impl.PointcutDefinitionImpl#getNodePatterns <em>Node Patterns</em>}</li>
 *   <li>{@link Art2Aspect.impl.PointcutDefinitionImpl#getPortTypePatterns <em>Port Type Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointcutDefinitionImpl extends EObjectImpl implements PointcutDefinition {
	/**
	 * The cached value of the '{@link #getComponentTypePatterns() <em>Component Type Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList componentTypePatterns;

	/**
	 * The cached value of the '{@link #getNodePatterns() <em>Node Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList nodePatterns;

	/**
	 * The cached value of the '{@link #getPortTypePatterns() <em>Port Type Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList portTypePatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointcutDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Art2AspectPackage.Literals.POINTCUT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponentTypePatterns() {
		if (componentTypePatterns == null) {
			componentTypePatterns = new EObjectContainmentEList(ComponentTypePattern.class, this, Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS);
		}
		return componentTypePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNodePatterns() {
		if (nodePatterns == null) {
			nodePatterns = new EObjectContainmentEList(NodePattern.class, this, Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS);
		}
		return nodePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPortTypePatterns() {
		if (portTypePatterns == null) {
			portTypePatterns = new EObjectContainmentEList(PortTypePattern.class, this, Art2AspectPackage.POINTCUT_DEFINITION__PORT_TYPE_PATTERNS);
		}
		return portTypePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS:
				return ((InternalEList)getComponentTypePatterns()).basicRemove(otherEnd, msgs);
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				return ((InternalEList)getNodePatterns()).basicRemove(otherEnd, msgs);
			case Art2AspectPackage.POINTCUT_DEFINITION__PORT_TYPE_PATTERNS:
				return ((InternalEList)getPortTypePatterns()).basicRemove(otherEnd, msgs);
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
			case Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS:
				return getComponentTypePatterns();
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				return getNodePatterns();
			case Art2AspectPackage.POINTCUT_DEFINITION__PORT_TYPE_PATTERNS:
				return getPortTypePatterns();
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
			case Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS:
				getComponentTypePatterns().clear();
				getComponentTypePatterns().addAll((Collection)newValue);
				return;
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				getNodePatterns().clear();
				getNodePatterns().addAll((Collection)newValue);
				return;
			case Art2AspectPackage.POINTCUT_DEFINITION__PORT_TYPE_PATTERNS:
				getPortTypePatterns().clear();
				getPortTypePatterns().addAll((Collection)newValue);
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
			case Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS:
				getComponentTypePatterns().clear();
				return;
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				getNodePatterns().clear();
				return;
			case Art2AspectPackage.POINTCUT_DEFINITION__PORT_TYPE_PATTERNS:
				getPortTypePatterns().clear();
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
			case Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS:
				return componentTypePatterns != null && !componentTypePatterns.isEmpty();
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				return nodePatterns != null && !nodePatterns.isEmpty();
			case Art2AspectPackage.POINTCUT_DEFINITION__PORT_TYPE_PATTERNS:
				return portTypePatterns != null && !portTypePatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PointcutDefinitionImpl
