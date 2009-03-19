/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAnnotationImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.spoon.reflect.declaration.CtAnnotation;
import emf.spoon.reflect.declaration.CtAnnotationElementValue;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationImpl#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationImpl#getActualAnnotation <em>Actual Annotation</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtAnnotationImpl#getElementsVal <em>Elements Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtAnnotationImpl extends CtElementImpl implements CtAnnotation {
	/**
	 * The cached value of the '{@link #getAnnotationType() <em>Annotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected CtTypeReference annotationType = null;

	/**
	 * The default value of the '{@link #getActualAnnotation() <em>Actual Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final Object ACTUAL_ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualAnnotation() <em>Actual Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Object actualAnnotation = ACTUAL_ANNOTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementsVal() <em>Elements Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsVal()
	 * @generated
	 * @ordered
	 */
	protected EList elementsVal = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference getAnnotationType() {
		if (annotationType != null && annotationType.eIsProxy()) {
			InternalEObject oldAnnotationType = (InternalEObject)annotationType;
			annotationType = (CtTypeReference)eResolveProxy(oldAnnotationType);
			if (annotationType != oldAnnotationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_ANNOTATION__ANNOTATION_TYPE, oldAnnotationType, annotationType));
			}
		}
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference basicGetAnnotationType() {
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationType(CtTypeReference newAnnotationType) {
		CtTypeReference oldAnnotationType = annotationType;
		annotationType = newAnnotationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ANNOTATION__ANNOTATION_TYPE, oldAnnotationType, annotationType));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getElementsVal() {
		if (elementsVal == null) {
			elementsVal = new EObjectContainmentEList(CtAnnotationElementValue.class, this, DeclarationPackage.CT_ANNOTATION__ELEMENTS_VAL);
		}
		return elementsVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CT_ANNOTATION__ELEMENTS_VAL:
				return ((InternalEList)getElementsVal()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_ANNOTATION__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_ANNOTATION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_ANNOTATION__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_ANNOTATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_ANNOTATION__ANNOTATION_TYPE:
				if (resolve) return getAnnotationType();
				return basicGetAnnotationType();
			case DeclarationPackage.CT_ANNOTATION__ACTUAL_ANNOTATION:
				return getActualAnnotation();
			case DeclarationPackage.CT_ANNOTATION__ELEMENTS_VAL:
				return getElementsVal();
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
			case DeclarationPackage.CT_ANNOTATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION__ANNOTATION_TYPE:
				setAnnotationType((CtTypeReference)newValue);
				return;
			case DeclarationPackage.CT_ANNOTATION__ELEMENTS_VAL:
				getElementsVal().clear();
				getElementsVal().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_ANNOTATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_ANNOTATION__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_ANNOTATION__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_ANNOTATION__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_ANNOTATION__ANNOTATION_TYPE:
				setAnnotationType((CtTypeReference)null);
				return;
			case DeclarationPackage.CT_ANNOTATION__ELEMENTS_VAL:
				getElementsVal().clear();
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
			case DeclarationPackage.CT_ANNOTATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_ANNOTATION__POSITION:
				return position != null;
			case DeclarationPackage.CT_ANNOTATION__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_ANNOTATION__PARENT:
				return parent != null;
			case DeclarationPackage.CT_ANNOTATION__ANNOTATION_TYPE:
				return annotationType != null;
			case DeclarationPackage.CT_ANNOTATION__ACTUAL_ANNOTATION:
				return ACTUAL_ANNOTATION_EDEFAULT == null ? actualAnnotation != null : !ACTUAL_ANNOTATION_EDEFAULT.equals(actualAnnotation);
			case DeclarationPackage.CT_ANNOTATION__ELEMENTS_VAL:
				return elementsVal != null && !elementsVal.isEmpty();
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
		result.append(" (ActualAnnotation: ");
		result.append(actualAnnotation);
		result.append(')');
		return result.toString();
	}

} //CtAnnotationImpl