/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.lang.annotation.Annotation;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtReference;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getActualClass <em>Actual Class</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getPrimitif <em>Primitif</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtTypeReferenceImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtTypeReferenceImpl<T> extends CtGenericElementReferenceImpl implements CtTypeReference<T> {
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
	protected CtElement declaration = null;

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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected CtPackageReference package_ = null;

	/**
	 * The default value of the '{@link #getActualClass() <em>Actual Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualClass()
	 * @generated
	 * @ordered
	 */
	protected static final Class ACTUAL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualClass() <em>Actual Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualClass()
	 * @generated
	 * @ordered
	 */
	//protected Class actualClass = ACTUAL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimitif() <em>Primitif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitif()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMITIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitif() <em>Primitif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitif()
	 * @generated
	 * @ordered
	 */
	protected Boolean primitif = PRIMITIF_EDEFAULT;

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
	protected CtTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_TYPE_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation[] getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList(Annotation.class, this, ReferencePackage.CT_TYPE_REFERENCE__ANNOTATIONS);
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
	public CtSimpleType getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (CtElement)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_TYPE_REFERENCE__DECLARATION, oldDeclaration, declaration));
			}
		}
		return (CtSimpleType) declaration;
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
	public CtTypeReference getDeclaringType() {
		if (declaringType != null && declaringType.eIsProxy()) {
			InternalEObject oldDeclaringType = (InternalEObject)declaringType;
			declaringType = (CtTypeReference)eResolveProxy(oldDeclaringType);
			if (declaringType != oldDeclaringType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_TYPE_REFERENCE__DECLARING_TYPE, oldDeclaringType, declaringType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_TYPE_REFERENCE__DECLARING_TYPE, oldDeclaringType, declaringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackageReference getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (CtPackageReference)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_TYPE_REFERENCE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackageReference basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(CtPackageReference newPackage) {
		CtPackageReference oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_TYPE_REFERENCE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class getActualClass() {
		if (isPrimitive()) {
			String simpleN = this.getSimpleName();
			if (simpleN.equals("boolean")) {
				return (Class<T>) boolean.class;
			} else if (simpleN.equals("byte")) {
				return (Class<T>) byte.class;
			} else if (simpleN.equals("double")) {
				return (Class<T>) double.class;
			} else if (simpleN.equals("int")) {
				return (Class<T>) int.class;
			} else if (simpleN.equals("short")) {
				return (Class<T>) short.class;
			} else if (simpleN.equals("char")) {
				return (Class<T>) char.class;
			} else if (simpleN.equals("long")) {
				return (Class<T>) long.class;
			} else if (simpleN.equals("float")) {
				return (Class<T>) float.class;
			} else if (simpleN.equals("void")) {
				return (Class<T>) void.class;
			}
		}
		try {
			return (Class<T>) Class.forName(getQualifiedName());
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrimitif() {
		if (this.getSimpleName()==null)
			return false;
		
		return (getSimpleName().equals("boolean")
				|| getSimpleName().equals("byte")
				|| getSimpleName().equals("double")
				|| getSimpleName().equals("int")
				|| getSimpleName().equals("short")
				|| getSimpleName().equals("char")
				|| getSimpleName().equals("long")
				|| getSimpleName().equals("float") || getSimpleName().equals(
				"void"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		if (getDeclaringType() != null) {
			return getDeclaringType().getQualifiedName()
					+ CtType.INNERTTYPE_SEPARATOR + getSimpleName();
		} else if (getPackage() != null) {
			return getPackage().getSimpleName() + CtPackage.PACKAGE_SEPARATOR
					+ getSimpleName();
		} else {
			return getSimpleName();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return getActualTypeArguments();
			case ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_TYPE_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case ReferencePackage.CT_TYPE_REFERENCE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case ReferencePackage.CT_TYPE_REFERENCE__ACTUAL_CLASS:
				return getActualClass();
			case ReferencePackage.CT_TYPE_REFERENCE__PRIMITIF:
				return getPrimitif();
			case ReferencePackage.CT_TYPE_REFERENCE__QUALIFIED_NAME:
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
			case ReferencePackage.CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				getActualTypeArguments().addAll((Collection)newValue);
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARING_TYPE:
				setDeclaringType((spoon.reflect.reference.CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__PACKAGE:
				setPackage((CtPackageReference)newValue);
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARATION:
				this.setDeclaration((CtSimpleType)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	private void setDeclaration(CtSimpleType type) {
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReferencePackage.CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARING_TYPE:
				setDeclaringType((spoon.reflect.reference.CtTypeReference)null);
				return;
			case ReferencePackage.CT_TYPE_REFERENCE__PACKAGE:
				setPackage((CtPackageReference)null);
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
			case ReferencePackage.CT_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return actualTypeArguments != null && !actualTypeArguments.isEmpty();
			case ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_TYPE_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARATION:
				return declaration != null;
			case ReferencePackage.CT_TYPE_REFERENCE__DECLARING_TYPE:
				return declaringType != null;
			case ReferencePackage.CT_TYPE_REFERENCE__PACKAGE:
				return package_ != null;
			case ReferencePackage.CT_TYPE_REFERENCE__ACTUAL_CLASS:
				return ACTUAL_CLASS_EDEFAULT == null ? getActualClass() != null : !ACTUAL_CLASS_EDEFAULT.equals(getActualClass());
			case ReferencePackage.CT_TYPE_REFERENCE__PRIMITIF:
				return PRIMITIF_EDEFAULT == null ? getPrimitif() != null : !PRIMITIF_EDEFAULT.equals(getPrimitif());
			case ReferencePackage.CT_TYPE_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
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
				case ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME: return ReferencePackage.CT_REFERENCE__SIMPLE_NAME;
				case ReferencePackage.CT_TYPE_REFERENCE__ANNOTATIONS: return ReferencePackage.CT_REFERENCE__ANNOTATIONS;
				case ReferencePackage.CT_TYPE_REFERENCE__DECLARATION: return ReferencePackage.CT_REFERENCE__DECLARATION;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.reference.CtTypeReference.class) {
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
				case ReferencePackage.CT_REFERENCE__SIMPLE_NAME: return ReferencePackage.CT_TYPE_REFERENCE__SIMPLE_NAME;
				case ReferencePackage.CT_REFERENCE__ANNOTATIONS: return ReferencePackage.CT_TYPE_REFERENCE__ANNOTATIONS;
				case ReferencePackage.CT_REFERENCE__DECLARATION: return ReferencePackage.CT_TYPE_REFERENCE__DECLARATION;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.reference.CtTypeReference.class) {
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
		result.append(')');
		return result.toString();
	}
} //CtTypeReferenceImpl