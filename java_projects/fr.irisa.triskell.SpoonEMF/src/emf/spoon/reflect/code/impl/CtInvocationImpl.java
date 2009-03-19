/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtInvocationImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
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
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTargetedExpression;
import spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtInvocation;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtInvocationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtInvocationImpl#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtInvocationImpl#getTypeCasts <em>Type Casts</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtInvocationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtInvocationImpl extends CtAbstractInvocationImpl implements CtInvocation {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CtExpression target = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_INVOCATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_INVOCATION__LABEL, oldLabel, label));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_INVOCATION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_INVOCATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTypeCasts() {
		if (typeCasts == null) {
			typeCasts = new EObjectResolvingEList(CtTypeReference.class, this, CodePackage.CT_INVOCATION__TYPE_CASTS);
		}
		return typeCasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CtExpression)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_INVOCATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(CtExpression newTarget) {
		CtExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_INVOCATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_INVOCATION__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_INVOCATION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_INVOCATION__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_INVOCATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_INVOCATION__EXECUTABLE:
				if (resolve) return getExecutable();
				return basicGetExecutable();
			case CodePackage.CT_INVOCATION__ARGUMENTS:
				return getArguments();
			case CodePackage.CT_INVOCATION__LABEL:
				return getLabel();
			case CodePackage.CT_INVOCATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_INVOCATION__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_INVOCATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CodePackage.CT_INVOCATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_INVOCATION__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_INVOCATION__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_INVOCATION__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_INVOCATION__EXECUTABLE:
				setExecutable((CtExecutableReference)newValue);
				return;
			case CodePackage.CT_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection)newValue);
				return;
			case CodePackage.CT_INVOCATION__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_INVOCATION__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_INVOCATION__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_INVOCATION__TARGET:
				setTarget((CtExpression)newValue);
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
			case CodePackage.CT_INVOCATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_INVOCATION__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_INVOCATION__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_INVOCATION__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_INVOCATION__EXECUTABLE:
				setExecutable((CtExecutableReference)null);
				return;
			case CodePackage.CT_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case CodePackage.CT_INVOCATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_INVOCATION__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_INVOCATION__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_INVOCATION__TARGET:
				setTarget((CtExpression)null);
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
			case CodePackage.CT_INVOCATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_INVOCATION__POSITION:
				return position != null;
			case CodePackage.CT_INVOCATION__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_INVOCATION__PARENT:
				return parent != null;
			case CodePackage.CT_INVOCATION__EXECUTABLE:
				return executable != null;
			case CodePackage.CT_INVOCATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case CodePackage.CT_INVOCATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_INVOCATION__TYPE:
				return type != null;
			case CodePackage.CT_INVOCATION__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_INVOCATION__TARGET:
				return target != null;
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
		if (baseClass == CtStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_INVOCATION__LABEL: return CodePackage.CT_STATEMENT__LABEL;
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
				case CodePackage.CT_INVOCATION__TYPE: return DeclarationPackage.CT_TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CtExpression.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_INVOCATION__TYPE_CASTS: return CodePackage.CT_EXPRESSION__TYPE_CASTS;
				default: return -1;
			}
		}
		if (baseClass == CtTargetedExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtTargetedExpression.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_INVOCATION__TARGET: return CodePackage.CT_TARGETED_EXPRESSION__TARGET;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtInvocation.class) {
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
		if (baseClass == CtStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtStatement.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_STATEMENT__LABEL: return CodePackage.CT_INVOCATION__LABEL;
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
				case DeclarationPackage.CT_TYPED_ELEMENT__TYPE: return CodePackage.CT_INVOCATION__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CtExpression.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_EXPRESSION__TYPE_CASTS: return CodePackage.CT_INVOCATION__TYPE_CASTS;
				default: return -1;
			}
		}
		if (baseClass == CtTargetedExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtTargetedExpression.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_TARGETED_EXPRESSION__TARGET: return CodePackage.CT_INVOCATION__TARGET;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtInvocation.class) {
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

} //CtInvocationImpl