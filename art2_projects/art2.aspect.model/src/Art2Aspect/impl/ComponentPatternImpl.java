/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.Art2AspectPackage;
import Art2Aspect.ComponentPattern;
import Art2Aspect.PortPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Art2Aspect.impl.ComponentPatternImpl#getPortPatterns <em>Port Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentPatternImpl extends EObjectImpl implements ComponentPattern {
	/**
	 * The cached value of the '{@link #getPortPatterns() <em>Port Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList portPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Art2AspectPackage.Literals.COMPONENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPortPatterns() {
		if (portPatterns == null) {
			portPatterns = new EObjectContainmentEList(PortPattern.class, this, Art2AspectPackage.COMPONENT_PATTERN__PORT_PATTERNS);
		}
		return portPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_PATTERN__PORT_PATTERNS:
				return ((InternalEList)getPortPatterns()).basicRemove(otherEnd, msgs);
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
			case Art2AspectPackage.COMPONENT_PATTERN__PORT_PATTERNS:
				return getPortPatterns();
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
			case Art2AspectPackage.COMPONENT_PATTERN__PORT_PATTERNS:
				getPortPatterns().clear();
				getPortPatterns().addAll((Collection)newValue);
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
			case Art2AspectPackage.COMPONENT_PATTERN__PORT_PATTERNS:
				getPortPatterns().clear();
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
			case Art2AspectPackage.COMPONENT_PATTERN__PORT_PATTERNS:
				return portPatterns != null && !portPatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentPatternImpl
