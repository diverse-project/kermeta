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
 *   <li>{@link Art2Aspect.impl.ComponentPatternImpl#getProvidedPortPatterns <em>Provided Port Patterns</em>}</li>
 *   <li>{@link Art2Aspect.impl.ComponentPatternImpl#getRequiredPortPatterns <em>Required Port Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentPatternImpl extends PatternNamedElementImpl implements ComponentPattern {
	/**
	 * The cached value of the '{@link #getProvidedPortPatterns() <em>Provided Port Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList providedPortPatterns;
	/**
	 * The cached value of the '{@link #getRequiredPortPatterns() <em>Required Port Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPortPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList requiredPortPatterns;
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
	public EList getProvidedPortPatterns() {
		if (providedPortPatterns == null) {
			providedPortPatterns = new EObjectContainmentEList(PortPattern.class, this, Art2AspectPackage.COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS);
		}
		return providedPortPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequiredPortPatterns() {
		if (requiredPortPatterns == null) {
			requiredPortPatterns = new EObjectContainmentEList(PortPattern.class, this, Art2AspectPackage.COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS);
		}
		return requiredPortPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2AspectPackage.COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS:
				return ((InternalEList)getProvidedPortPatterns()).basicRemove(otherEnd, msgs);
			case Art2AspectPackage.COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS:
				return ((InternalEList)getRequiredPortPatterns()).basicRemove(otherEnd, msgs);
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
			case Art2AspectPackage.COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS:
				return getProvidedPortPatterns();
			case Art2AspectPackage.COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS:
				return getRequiredPortPatterns();
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
			case Art2AspectPackage.COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS:
				getProvidedPortPatterns().clear();
				getProvidedPortPatterns().addAll((Collection)newValue);
				return;
			case Art2AspectPackage.COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS:
				getRequiredPortPatterns().clear();
				getRequiredPortPatterns().addAll((Collection)newValue);
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
			case Art2AspectPackage.COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS:
				getProvidedPortPatterns().clear();
				return;
			case Art2AspectPackage.COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS:
				getRequiredPortPatterns().clear();
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
			case Art2AspectPackage.COMPONENT_PATTERN__PROVIDED_PORT_PATTERNS:
				return providedPortPatterns != null && !providedPortPatterns.isEmpty();
			case Art2AspectPackage.COMPONENT_PATTERN__REQUIRED_PORT_PATTERNS:
				return requiredPortPatterns != null && !requiredPortPatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentPatternImpl
