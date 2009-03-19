/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtElementImpl.java,v 1.2 2007/02/20 09:08:18 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spoon.reflect.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.visitor.SignaturePrinter;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtAnnotation;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtElementImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtElementImpl#getDocComment <em>Doc Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class  CtElementImpl extends EObjectImpl implements CtElement {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList annotations = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected SourcePosition position = null;

	/**
	 * The default value of the '{@link #getDocComment() <em>Doc Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocComment()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocComment() <em>Doc Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocComment()
	 * @generated
	 * @ordered
	 */
	protected String docComment = DOC_COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getAnnotations() {
		
		if (annotations == null) {
			annotations = new EObjectResolvingEList(CtAnnotation.class, this, DeclarationPackage.CT_ELEMENT__ANNOTATIONS);
		}
		EmfSet s = new EmfSet(annotations);
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePosition getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (SourcePosition)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_ELEMENT__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePosition basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(SourcePosition newPosition) {
		SourcePosition oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ELEMENT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocComment() {
		return docComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocComment(String newDocComment) {
		String oldDocComment = docComment;
		docComment = newDocComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ELEMENT__DOC_COMMENT, oldDocComment, docComment));
	}

	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {

		//System.out.println(otherEnd);
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_ELEMENT__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_ELEMENT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_ELEMENT__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case DeclarationPackage.CT_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_ELEMENT__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_ELEMENT__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_ELEMENT__PARENT:
				setParent((CtElement)newValue);
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
			case DeclarationPackage.CT_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_ELEMENT__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_ELEMENT__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_ELEMENT__PARENT:
				setParent((CtElement)null);
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
			case DeclarationPackage.CT_ELEMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_ELEMENT__POSITION:
				return position != null;
			case DeclarationPackage.CT_ELEMENT__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_ELEMENT__PARENT:
				return parent != null;
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
		result.append(" (DocComment: ");
		result.append(docComment);
		result.append(')');
		return result.toString();
	}

	
	public <E extends spoon.reflect.declaration.CtElement> List<E> getAnnotatedChildren(
			Class<? extends Annotation> annotationType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Annotation getAnnotation(Class annotationType) {
		 for (Object o : annotations) {
			 spoon.reflect.declaration.CtAnnotation a = (spoon.reflect.declaration.CtAnnotation) o; 
			 if (a.getAnnotationType().toString().equals(
	                    annotationType.getName())) {
	                return ((spoon.reflect.declaration.CtAnnotation) a).getActualAnnotation();
	            }
	        }
	        return null;
	   }

	public <A extends Annotation> spoon.reflect.declaration.CtAnnotation<A> getAnnotation(
			spoon.reflect.reference.CtTypeReference<A> annotationType) {
		return this.getAnnotation((CtTypeReference)annotationType);
	}

	


	public void setAnnotations(
			Set<spoon.reflect.declaration.CtAnnotation<? extends Annotation>> annotation) {
		this.getAnnotations().clear();
		this.getAnnotations().addAll(annotation);
	}

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected CtElement parent = null;
	
	public void setParent(spoon.reflect.declaration.CtElement element) {
		this.parent = (CtElement) element;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtElement getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (CtElement)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_ELEMENT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}
	
	
	public spoon.reflect.declaration.CtElement getParent(Class parentType) {
		if (getParent() == null)
			return null;
		if (parentType.isAssignableFrom(getParent().getClass()))
			return  getParent();
		return (spoon.reflect.declaration.CtElement) getParent().getParent(parentType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtElement basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CtElement newParent) {
		CtElement oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_ELEMENT__PARENT, oldParent, parent));
	}
	


	

	Factory factory = null;
	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
	this.factory = factory;
	}

	public void setPosition(spoon.reflect.cu.SourcePosition position) {
		this.setPosition((SourcePosition)position);
		
	}

	
	public String getSignature() {
		SignaturePrinter pr = new SignaturePrinter();
		pr.scan(this);
		return pr.getSignature();
	}

	boolean implicit = false;

	public boolean isImplicit() {
		return implicit;
	}

	public void setImplicit(boolean implicit) {
		this.implicit = implicit;
	}
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {

		return msgs;
	}
	protected NotificationChain eDynamicInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	  {
	   // EStructuralFeature.Internal feature = (EStructuralFeature.Internal)eClass().getEStructuralFeature(featureID);
	   // return feature.getSettingDelegate().dynamicInverseRemove(this, eSettings(), featureID - eStaticFeatureCount(), otherEnd, msgs);
		return msgs;
	  }
	
				
	

} //CtElementImpl