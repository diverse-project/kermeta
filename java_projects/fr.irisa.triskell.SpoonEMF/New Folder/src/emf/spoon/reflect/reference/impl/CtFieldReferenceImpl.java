/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtFieldReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.lang.reflect.Field;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.reference.CtFieldReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Field Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl#getActualField <em>Actual Field</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtFieldReferenceImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtFieldReferenceImpl extends CtVariableReferenceImpl implements CtFieldReference {
	/**
	 * The cached value of the '{@link #getDeclaringType() <em>Declaring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringType()
	 * @generated
	 * @ordered
	 */
	protected CtTypeReference declaringType = null;

	/**
	 * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected Boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualField() <em>Actual Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualField()
	 * @generated
	 * @ordered
	 */
	protected static final Field ACTUAL_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualField() <em>Actual Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualField()
	 * @generated
	 * @ordered
	 */
	//protected Field actualField = ACTUAL_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	//protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtFieldReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_FIELD_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference getDeclaringType() {
		if (declaringType != null && declaringType.eIsProxy()) {
			InternalEObject oldDeclaringType = (InternalEObject)declaringType;
			declaringType = (CtTypeReference)eResolveProxy(oldDeclaringType);
			if (declaringType != oldDeclaringType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_FIELD_REFERENCE__DECLARING_TYPE, oldDeclaringType, declaringType));
			}
		}
		return declaringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference basicGetDeclaringType() {
		return declaringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringType(CtTypeReference newDeclaringType) {
		CtTypeReference oldDeclaringType = declaringType;
		declaringType = newDeclaringType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_FIELD_REFERENCE__DECLARING_TYPE, oldDeclaringType, declaringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(Boolean newFinal) {
		Boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_FIELD_REFERENCE__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		Boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_FIELD_REFERENCE__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getActualField() {
		
				if (this.getDeclaringType() !=null && getDeclaringType().getActualClass()!=null)
					try{
						
					return getDeclaringType().getActualClass().getDeclaredField(
						getSimpleName());
					} catch (Exception e){
						//e.printStackTrace();
						return null;

					}
					
				else
					return null;
				//return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return getDeclaringType().getQualifiedName() + "#" + getSimpleName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_FIELD_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_FIELD_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_FIELD_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case ReferencePackage.CT_FIELD_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ReferencePackage.CT_FIELD_REFERENCE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case ReferencePackage.CT_FIELD_REFERENCE__FINAL:
				return getFinal();
			case ReferencePackage.CT_FIELD_REFERENCE__STATIC:
				return getStatic();
			case ReferencePackage.CT_FIELD_REFERENCE__ACTUAL_FIELD:
				return getActualField();
			case ReferencePackage.CT_FIELD_REFERENCE__QUALIFIED_NAME:
				return getQualifiedName();
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
			case ReferencePackage.CT_FIELD_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__STATIC:
				setStatic((Boolean)newValue);
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
			case ReferencePackage.CT_FIELD_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__TYPE:
				setType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case ReferencePackage.CT_FIELD_REFERENCE__STATIC:
				setStatic(STATIC_EDEFAULT);
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
			case ReferencePackage.CT_FIELD_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_FIELD_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_FIELD_REFERENCE__DECLARATION:
				return declaration != null;
			case ReferencePackage.CT_FIELD_REFERENCE__TYPE:
				return type != null;
			case ReferencePackage.CT_FIELD_REFERENCE__DECLARING_TYPE:
				return declaringType != null;
			case ReferencePackage.CT_FIELD_REFERENCE__FINAL:
				return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
			case ReferencePackage.CT_FIELD_REFERENCE__STATIC:
				return STATIC_EDEFAULT == null ? static_ != null : !STATIC_EDEFAULT.equals(static_);
			case ReferencePackage.CT_FIELD_REFERENCE__ACTUAL_FIELD:
				return ACTUAL_FIELD_EDEFAULT == null ? getActualField() != null : !ACTUAL_FIELD_EDEFAULT.equals(getActualField());
			case ReferencePackage.CT_FIELD_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
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
		result.append(" (Final: ");
		result.append(final_);
		result.append(", Static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

	
	public CtField getDeclaration(){
		return (CtField) super.getDeclaration();
	}

} //CtFieldReferenceImpl