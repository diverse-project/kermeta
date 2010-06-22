/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect.impl;

import Art2Aspect.Art2AspectPackage;
import Art2Aspect.PatternNamedElement;
import Art2Aspect.PortTypePattern;
import Art2Aspect.PortTypeRefPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Art2Aspect.impl.PatternNamedElementImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link Art2Aspect.impl.PatternNamedElementImpl#getNamePattern <em>Name Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternNamedElementImpl extends ComponentPatternImpl implements PatternNamedElement {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected PortTypePattern ref;

	/**
	 * The default value of the '{@link #getNamePattern() <em>Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamePattern() <em>Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String namePattern = NAME_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Art2AspectPackage.Literals.PATTERN_NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypePattern getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (PortTypePattern)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypePattern basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(PortTypePattern newRef) {
		PortTypePattern oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamePattern() {
		return namePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePattern(String newNamePattern) {
		String oldNamePattern = namePattern;
		namePattern = newNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2AspectPackage.PATTERN_NAMED_ELEMENT__NAME_PATTERN, oldNamePattern, namePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__NAME_PATTERN:
				return getNamePattern();
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
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF:
				setRef((PortTypePattern)newValue);
				return;
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__NAME_PATTERN:
				setNamePattern((String)newValue);
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
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF:
				setRef((PortTypePattern)null);
				return;
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__NAME_PATTERN:
				setNamePattern(NAME_PATTERN_EDEFAULT);
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
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF:
				return ref != null;
			case Art2AspectPackage.PATTERN_NAMED_ELEMENT__NAME_PATTERN:
				return NAME_PATTERN_EDEFAULT == null ? namePattern != null : !NAME_PATTERN_EDEFAULT.equals(namePattern);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == PortTypeRefPattern.class) {
			switch (derivedFeatureID) {
				case Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF: return Art2AspectPackage.PORT_TYPE_REF_PATTERN__REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == PortTypeRefPattern.class) {
			switch (baseFeatureID) {
				case Art2AspectPackage.PORT_TYPE_REF_PATTERN__REF: return Art2AspectPackage.PATTERN_NAMED_ELEMENT__REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (namePattern: ");
		result.append(namePattern);
		result.append(')');
		return result.toString();
	}

} //PatternNamedElementImpl
