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
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointcutDefinitionImpl extends EObjectImpl implements PointcutDefinition {
	/**
	 * The cached value of the '{@link #getComponentTypePatterns() <em>Component Type Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypePatterns()
	 * @generated
	 * @ordered
	 */
	protected ComponentTypePattern componentTypePatterns;

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
	public ComponentTypePattern getComponentTypePatterns() {
		return componentTypePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentTypePatterns(ComponentTypePattern newComponentTypePatterns, NotificationChain msgs) {
		ComponentTypePattern oldComponentTypePatterns = componentTypePatterns;
		componentTypePatterns = newComponentTypePatterns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS, oldComponentTypePatterns, newComponentTypePatterns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentTypePatterns(ComponentTypePattern newComponentTypePatterns) {
		if (newComponentTypePatterns != componentTypePatterns) {
			NotificationChain msgs = null;
			if (componentTypePatterns != null)
				msgs = ((InternalEObject)componentTypePatterns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS, null, msgs);
			if (newComponentTypePatterns != null)
				msgs = ((InternalEObject)newComponentTypePatterns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS, null, msgs);
			msgs = basicSetComponentTypePatterns(newComponentTypePatterns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS, newComponentTypePatterns, newComponentTypePatterns));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2AspectPackage.POINTCUT_DEFINITION__COMPONENT_TYPE_PATTERNS:
				return basicSetComponentTypePatterns(null, msgs);
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				return ((InternalEList)getNodePatterns()).basicRemove(otherEnd, msgs);
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
				setComponentTypePatterns((ComponentTypePattern)newValue);
				return;
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				getNodePatterns().clear();
				getNodePatterns().addAll((Collection)newValue);
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
				setComponentTypePatterns((ComponentTypePattern)null);
				return;
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				getNodePatterns().clear();
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
				return componentTypePatterns != null;
			case Art2AspectPackage.POINTCUT_DEFINITION__NODE_PATTERNS:
				return nodePatterns != null && !nodePatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PointcutDefinitionImpl
