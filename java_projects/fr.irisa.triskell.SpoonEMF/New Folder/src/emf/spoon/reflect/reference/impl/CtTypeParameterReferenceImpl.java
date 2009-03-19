/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeParameterReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtTypeParameterReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Type Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtTypeParameterReferenceImpl extends CtTypeReferenceImpl<Object> implements CtTypeParameterReference {
	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UPPER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Boolean upper = UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected EList bounds = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtTypeParameterReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_TYPE_PARAMETER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Boolean newUpper) {
		Boolean oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBounds() {
		if (bounds == null) {
			bounds = new EObjectResolvingEList(CtTypeReference.class, this, ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__BOUNDS);
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return getActualTypeArguments();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ACTUAL_CLASS:
				return getActualClass();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__PRIMITIF:
				return getPrimitif();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__QUALIFIED_NAME:
				return getQualifiedName();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__UPPER:
				return getUpper();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__BOUNDS:
				return getBounds();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				getActualTypeArguments().addAll((Collection)newValue);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__PACKAGE:
				setPackage((CtPackageReference)newValue);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__UPPER:
				setUpper((Boolean)newValue);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__BOUNDS:
				getBounds().clear();
				getBounds().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__PACKAGE:
				setPackage((CtPackageReference)null);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__BOUNDS:
				getBounds().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return !getActualTypeArguments().isEmpty();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__DECLARATION:
				return declaration != null;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__DECLARING_TYPE:
				return declaringType != null;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__PACKAGE:
				return package_ != null;
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__ACTUAL_CLASS:
				return ACTUAL_CLASS_EDEFAULT == null ? getActualClass() != null : !ACTUAL_CLASS_EDEFAULT.equals(getActualClass());
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__PRIMITIF:
				return PRIMITIF_EDEFAULT == null ? getPrimitif() != null : !PRIMITIF_EDEFAULT.equals(getPrimitif());
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case ReferencePackage.CT_TYPE_PARAMETER_REFERENCE__BOUNDS:
				return bounds != null && !bounds.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Upper: ");
		result.append(upper);
		result.append(')');
		return result.toString();
	}


} //CtTypeParameterReferenceImpl