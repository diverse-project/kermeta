/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLocalVariableImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.declaration.ModifierKind;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtLocalVariable;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtLocalVariableReference;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtLocalVariableImpl#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtLocalVariableImpl extends CtStatementImpl implements CtLocalVariable {
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList modifiers = null;

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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected CtReference reference = null;

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
	 * The cached value of the '{@link #getDefaultExpression() <em>Default Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression defaultExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtLocalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_LOCAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList(ModifierKind.class, this, CodePackage.CT_LOCAL_VARIABLE__MODIFIERS);
		}
		return new EmfSet(modifiers);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtLocalVariableReference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (CtReference)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_LOCAL_VARIABLE__REFERENCE, oldReference, reference));
			}
		}
		return (CtLocalVariableReference) reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtReference basicGetReference() {
		return reference;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_LOCAL_VARIABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_LOCAL_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getDefaultExpression() {
		if (defaultExpression != null && defaultExpression.eIsProxy()) {
			InternalEObject oldDefaultExpression = (InternalEObject)defaultExpression;
			defaultExpression = (CtExpression)eResolveProxy(oldDefaultExpression);
			if (defaultExpression != oldDefaultExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION, oldDefaultExpression, defaultExpression));
			}
		}
		return defaultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetDefaultExpression() {
		return defaultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExpression(CtExpression newDefaultExpression) {
		CtExpression oldDefaultExpression = defaultExpression;
		defaultExpression = newDefaultExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION, oldDefaultExpression, defaultExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_LOCAL_VARIABLE__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_LOCAL_VARIABLE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_LOCAL_VARIABLE__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_LOCAL_VARIABLE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_LOCAL_VARIABLE__LABEL:
				return getLabel();
			case CodePackage.CT_LOCAL_VARIABLE__MODIFIERS:
				return getModifiers();
			case CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME:
				return getSimpleName();
			case CodePackage.CT_LOCAL_VARIABLE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case CodePackage.CT_LOCAL_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION:
				if (resolve) return getDefaultExpression();
				return basicGetDefaultExpression();
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
			case CodePackage.CT_LOCAL_VARIABLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION:
				setDefaultExpression((CtExpression)newValue);
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
			case CodePackage.CT_LOCAL_VARIABLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_LOCAL_VARIABLE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__MODIFIERS:
				getModifiers().clear();
				return;
			case CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION:
				setDefaultExpression((CtExpression)null);
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
			case CodePackage.CT_LOCAL_VARIABLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_LOCAL_VARIABLE__POSITION:
				return position != null;
			case CodePackage.CT_LOCAL_VARIABLE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_LOCAL_VARIABLE__PARENT:
				return parent != null;
			case CodePackage.CT_LOCAL_VARIABLE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_LOCAL_VARIABLE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case CodePackage.CT_LOCAL_VARIABLE__REFERENCE:
				return reference != null;
			case CodePackage.CT_LOCAL_VARIABLE__TYPE:
				return type != null;
			case CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION:
				return defaultExpression != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtModifiable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtModifiable.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_LOCAL_VARIABLE__MODIFIERS: return DeclarationPackage.CT_MODIFIABLE__MODIFIERS;
				default: return -1;
			}
		}
		if (baseClass == CtNamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtNamedElement.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME: return DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME;
				case CodePackage.CT_LOCAL_VARIABLE__REFERENCE: return DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE;
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
				case CodePackage.CT_LOCAL_VARIABLE__TYPE: return DeclarationPackage.CT_TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == CtVariable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtVariable.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION: return DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtLocalVariable.class) {
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
		if (baseClass == CtModifiable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtModifiable.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_MODIFIABLE__MODIFIERS: return CodePackage.CT_LOCAL_VARIABLE__MODIFIERS;
				default: return -1;
			}
		}
		if (baseClass == CtNamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtNamedElement.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME: return CodePackage.CT_LOCAL_VARIABLE__SIMPLE_NAME;
				case DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE: return CodePackage.CT_LOCAL_VARIABLE__REFERENCE;
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
				case DeclarationPackage.CT_TYPED_ELEMENT__TYPE: return CodePackage.CT_LOCAL_VARIABLE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == CtVariable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtVariable.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION: return CodePackage.CT_LOCAL_VARIABLE__DEFAULT_EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtLocalVariable.class) {
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
		result.append(" (Modifiers: ");
		result.append(modifiers);
		result.append(", SimpleName: ");
		result.append(simpleName);
		result.append(')');
		return result.toString();
	}

} //CtLocalVariableImpl