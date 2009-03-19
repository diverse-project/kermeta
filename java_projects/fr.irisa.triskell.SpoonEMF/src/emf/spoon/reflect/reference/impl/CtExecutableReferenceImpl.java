/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtExecutableReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spoon.reflect.reference.CtReference;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtExecutable;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Executable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getActualConstructor <em>Actual Constructor</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl#getActualMethod <em>Actual Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtExecutableReferenceImpl extends CtGenericElementReferenceImpl implements CtExecutableReference {
	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList annotations = null;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected CtExecutable declaration = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CtTypeReference type = null;

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
	 * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList parameterTypes = null;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATIC_EDEFAULT = null;

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
	 * The default value of the '{@link #getActualConstructor() <em>Actual Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final Constructor ACTUAL_CONSTRUCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualConstructor() <em>Actual Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualConstructor()
	 * @generated
	 * @ordered
	 */
	protected Constructor actualConstructor = ACTUAL_CONSTRUCTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualMethod() <em>Actual Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method ACTUAL_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualMethod() <em>Actual Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualMethod()
	 * @generated
	 * @ordered
	 */
	protected Method actualMethod = ACTUAL_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtExecutableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_EXECUTABLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleName() {
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleName(String newSimpleName) {
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation[] getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList(Annotation.class, this, ReferencePackage.CT_EXECUTABLE_REFERENCE__ANNOTATIONS);
		}
		Annotation[] a = new Annotation[annotations.size()];
		int i =0;
		for (Object o :annotations){
			a[i]= (Annotation) o;
			i++;

		}
		return  a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutable getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (CtExecutable)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARATION, oldDeclaration, declaration));
			}
		}
		return (CtExecutable) declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtElement basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CtTypeReference)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_EXECUTABLE_REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CtTypeReference newType) {
		CtTypeReference oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_EXECUTABLE_REFERENCE__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE, oldDeclaringType, declaringType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE, oldDeclaringType, declaringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParameterTypes() {
		if (parameterTypes == null) {
			parameterTypes = new EObjectResolvingEList(CtTypeReference.class, this, ReferencePackage.CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES);
		}
		return parameterTypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_EXECUTABLE_REFERENCE__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor getActualConstructor() {
		return actualConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getActualMethod() {
		return actualMethod;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return getActualTypeArguments();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES:
				return getParameterTypes();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__STATIC:
				return getStatic();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR:
				return getActualConstructor();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD:
				return getActualMethod();
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
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				getActualTypeArguments().addAll((Collection)newValue);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES:
				getParameterTypes().clear();
				getParameterTypes().addAll((Collection)newValue);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__STATIC:
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
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__TYPE:
				setType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES:
				getParameterTypes().clear();
				return;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__STATIC:
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
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return actualTypeArguments != null && !actualTypeArguments.isEmpty();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARATION:
				return declaration != null;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__TYPE:
				return type != null;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARING_TYPE:
				return declaringType != null;
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__PARAMETER_TYPES:
				return parameterTypes != null && !parameterTypes.isEmpty();
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__STATIC:
				return STATIC_EDEFAULT == null ? static_ != null : !STATIC_EDEFAULT.equals(static_);
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_CONSTRUCTOR:
				return ACTUAL_CONSTRUCTOR_EDEFAULT == null ? getActualConstructor() != null : !ACTUAL_CONSTRUCTOR_EDEFAULT.equals(getActualConstructor());
			case ReferencePackage.CT_EXECUTABLE_REFERENCE__ACTUAL_METHOD:
				return ACTUAL_METHOD_EDEFAULT == null ? getActualMethod() != null : !ACTUAL_METHOD_EDEFAULT.equals(getActualMethod());
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtReference.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.reference.CtReference.class) {
			switch (derivedFeatureID) {
				case ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME: return ReferencePackage.CT_REFERENCE__SIMPLE_NAME;
				case ReferencePackage.CT_EXECUTABLE_REFERENCE__ANNOTATIONS: return ReferencePackage.CT_REFERENCE__ANNOTATIONS;
				case ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARATION: return ReferencePackage.CT_REFERENCE__DECLARATION;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.reference.CtExecutableReference.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == CtReference.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.reference.CtReference.class) {
			switch (baseFeatureID) {
				case ReferencePackage.CT_REFERENCE__SIMPLE_NAME: return ReferencePackage.CT_EXECUTABLE_REFERENCE__SIMPLE_NAME;
				case ReferencePackage.CT_REFERENCE__ANNOTATIONS: return ReferencePackage.CT_EXECUTABLE_REFERENCE__ANNOTATIONS;
				case ReferencePackage.CT_REFERENCE__DECLARATION: return ReferencePackage.CT_EXECUTABLE_REFERENCE__DECLARATION;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.reference.CtExecutableReference.class) {
			switch (baseFeatureID) {
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
		result.append(" (SimpleName: ");
		result.append(simpleName);
		result.append(", Annotations: ");
		result.append(annotations);
		result.append(", Static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}
} //CtExecutableReferenceImpl