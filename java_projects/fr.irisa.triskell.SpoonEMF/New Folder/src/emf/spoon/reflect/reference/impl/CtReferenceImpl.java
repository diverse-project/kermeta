/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.lang.annotation.Annotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import spoon.reflect.Factory;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtReferenceImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtReferenceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtReferenceImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtReferenceImpl extends EObjectImpl implements CtReference {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_REFERENCE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation[] getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList(Annotation.class, this, ReferencePackage.CT_REFERENCE__ANNOTATIONS);
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
	public CtElement getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (CtElement)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_REFERENCE__DECLARATION, oldDeclaration, declaration));
			}
		}
		return declaration;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
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
			case ReferencePackage.CT_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
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
			case ReferencePackage.CT_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
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
			case ReferencePackage.CT_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_REFERENCE__DECLARATION:
				return declaration != null;
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
		result.append(" (SimpleName: ");
		result.append(simpleName);
		result.append(", Annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}
	
	
	public Annotation getAnnotation(Class annotationType) {
		CtElement e = getDeclaration();
		if (e != null) {
			return (Annotation) e.getAnnotation(annotationType);
		}
		return null;
	}

	Factory factory;
	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;	
	}

} //CtReferenceImpl