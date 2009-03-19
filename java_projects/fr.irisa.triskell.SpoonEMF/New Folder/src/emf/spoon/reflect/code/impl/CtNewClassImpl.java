/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtNewClassImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtNewClass;
import emf.spoon.reflect.declaration.CtClass;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct New Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtNewClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtNewClassImpl#getTypeCasts <em>Type Casts</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtNewClassImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtNewClassImpl#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtNewClassImpl extends CtAbstractInvocationImpl implements CtNewClass {
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
	 * The cached value of the '{@link #getTypeCasts() <em>Type Casts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCasts()
	 * @generated
	 * @ordered
	 */
	protected EList typeCasts = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnonymousClass() <em>Anonymous Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClass()
	 * @generated
	 * @ordered
	 */
	protected CtClass anonymousClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtNewClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_NEW_CLASS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_NEW_CLASS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_NEW_CLASS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTypeCasts() {
		if (typeCasts == null) {
			typeCasts = new EObjectResolvingEList(CtTypeReference.class, this, CodePackage.CT_NEW_CLASS__TYPE_CASTS);
		}
		return typeCasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_NEW_CLASS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtClass getAnonymousClass() {
		if (anonymousClass != null && anonymousClass.eIsProxy()) {
			InternalEObject oldAnonymousClass = (InternalEObject)anonymousClass;
			anonymousClass = (CtClass)eResolveProxy(oldAnonymousClass);
			if (anonymousClass != oldAnonymousClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_NEW_CLASS__ANONYMOUS_CLASS, oldAnonymousClass, anonymousClass));
			}
		}
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtClass basicGetAnonymousClass() {
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClass(CtClass newAnonymousClass) {
		CtClass oldAnonymousClass = anonymousClass;
		anonymousClass = newAnonymousClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_NEW_CLASS__ANONYMOUS_CLASS, oldAnonymousClass, anonymousClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_NEW_CLASS__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_NEW_CLASS__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_NEW_CLASS__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_NEW_CLASS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_NEW_CLASS__EXECUTABLE:
				if (resolve) return getExecutable();
				return basicGetExecutable();
			case CodePackage.CT_NEW_CLASS__ARGUMENTS:
				return getArguments();
			case CodePackage.CT_NEW_CLASS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_NEW_CLASS__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_NEW_CLASS__LABEL:
				return getLabel();
			case CodePackage.CT_NEW_CLASS__ANONYMOUS_CLASS:
				if (resolve) return getAnonymousClass();
				return basicGetAnonymousClass();
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
			case CodePackage.CT_NEW_CLASS__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__EXECUTABLE:
				setExecutable((CtExecutableReference)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_NEW_CLASS__ANONYMOUS_CLASS:
				setAnonymousClass((CtClass)newValue);
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
			case CodePackage.CT_NEW_CLASS__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_NEW_CLASS__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_NEW_CLASS__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_NEW_CLASS__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_NEW_CLASS__EXECUTABLE:
				setExecutable((CtExecutableReference)null);
				return;
			case CodePackage.CT_NEW_CLASS__ARGUMENTS:
				getArguments().clear();
				return;
			case CodePackage.CT_NEW_CLASS__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_NEW_CLASS__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_NEW_CLASS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_NEW_CLASS__ANONYMOUS_CLASS:
				setAnonymousClass((CtClass)null);
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
			case CodePackage.CT_NEW_CLASS__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_NEW_CLASS__POSITION:
				return position != null;
			case CodePackage.CT_NEW_CLASS__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_NEW_CLASS__PARENT:
				return parent != null;
			case CodePackage.CT_NEW_CLASS__EXECUTABLE:
				return executable != null;
			case CodePackage.CT_NEW_CLASS__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case CodePackage.CT_NEW_CLASS__TYPE:
				return type != null;
			case CodePackage.CT_NEW_CLASS__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_NEW_CLASS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_NEW_CLASS__ANONYMOUS_CLASS:
				return anonymousClass != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtCodeElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtCodeElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CtTypedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtTypedElement.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_NEW_CLASS__TYPE: return DeclarationPackage.CT_TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == CtExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtExpression.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_NEW_CLASS__TYPE_CASTS: return CodePackage.CT_EXPRESSION__TYPE_CASTS;
				default: return -1;
			}
		}
		if (baseClass == CtStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_NEW_CLASS__LABEL: return CodePackage.CT_STATEMENT__LABEL;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtNewClass.class) {
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
		if (baseClass == CtCodeElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtCodeElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CtTypedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtTypedElement.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_TYPED_ELEMENT__TYPE: return CodePackage.CT_NEW_CLASS__TYPE;
				default: return -1;
			}
		}
		if (baseClass == CtExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtExpression.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_EXPRESSION__TYPE_CASTS: return CodePackage.CT_NEW_CLASS__TYPE_CASTS;
				default: return -1;
			}
		}
		if (baseClass == CtStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_STATEMENT__LABEL: return CodePackage.CT_NEW_CLASS__LABEL;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtNewClass.class) {
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
		result.append(" (Label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //CtNewClassImpl