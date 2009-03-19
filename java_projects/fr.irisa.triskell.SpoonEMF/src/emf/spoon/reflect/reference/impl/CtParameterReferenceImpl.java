/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtParameterReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.declaration.CtParameter;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtParameterReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtParameterReferenceImpl#getDeclaringExecutable <em>Declaring Executable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtParameterReferenceImpl extends CtVariableReferenceImpl implements CtParameterReference {
	/**
	 * The cached value of the '{@link #getDeclaringExecutable() <em>Declaring Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringExecutable()
	 * @generated
	 * @ordered
	 */
	protected CtExecutableReference declaringExecutable = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtParameterReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_PARAMETER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutableReference getDeclaringExecutable() {
		if (declaringExecutable != null && declaringExecutable.eIsProxy()) {
			InternalEObject oldDeclaringExecutable = (InternalEObject)declaringExecutable;
			declaringExecutable = (CtExecutableReference)eResolveProxy(oldDeclaringExecutable);
			if (declaringExecutable != oldDeclaringExecutable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE, oldDeclaringExecutable, declaringExecutable));
			}
		}
		return declaringExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutableReference basicGetDeclaringExecutable() {
		return declaringExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringExecutable(CtExecutableReference newDeclaringExecutable) {
		CtExecutableReference oldDeclaringExecutable = declaringExecutable;
		declaringExecutable = newDeclaringExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE, oldDeclaringExecutable, declaringExecutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_PARAMETER_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_PARAMETER_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_PARAMETER_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case ReferencePackage.CT_PARAMETER_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ReferencePackage.CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE:
				if (resolve) return getDeclaringExecutable();
				return basicGetDeclaringExecutable();
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
			case ReferencePackage.CT_PARAMETER_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case ReferencePackage.CT_PARAMETER_REFERENCE__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE:
				setDeclaringExecutable((CtExecutableReference)newValue);
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
			case ReferencePackage.CT_PARAMETER_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case ReferencePackage.CT_PARAMETER_REFERENCE__TYPE:
				setType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE:
				setDeclaringExecutable((CtExecutableReference)null);
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
			case ReferencePackage.CT_PARAMETER_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_PARAMETER_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_PARAMETER_REFERENCE__DECLARATION:
				return declaration != null;
			case ReferencePackage.CT_PARAMETER_REFERENCE__TYPE:
				return type != null;
			case ReferencePackage.CT_PARAMETER_REFERENCE__DECLARING_EXECUTABLE:
				return declaringExecutable != null;
		}
		return eDynamicIsSet(featureID);
	}

	public CtParameter getDeclaration(){
		return (CtParameter) super.getDeclaration();
	}
	
} //CtParameterReferenceImpl