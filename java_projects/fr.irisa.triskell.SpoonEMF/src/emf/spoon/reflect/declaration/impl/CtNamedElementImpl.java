/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtNamedElementImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.ModifierKind;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtNamedElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtNamedElementImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtNamedElementImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtNamedElementImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtNamedElementImpl extends CtElementImpl implements CtNamedElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList(ModifierKind.class, this, DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtReference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (CtReference)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE, oldReference, reference));
			}
		}
		return reference;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_NAMED_ELEMENT__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_NAMED_ELEMENT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_NAMED_ELEMENT__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_NAMED_ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
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
			case DeclarationPackage.CT_NAMED_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME:
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
			case DeclarationPackage.CT_NAMED_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME:
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
			case DeclarationPackage.CT_NAMED_ELEMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_NAMED_ELEMENT__POSITION:
				return position != null;
			case DeclarationPackage.CT_NAMED_ELEMENT__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_NAMED_ELEMENT__PARENT:
				return parent != null;
			case DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE:
				return reference != null;
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
				case DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS: return DeclarationPackage.CT_MODIFIABLE__MODIFIERS;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtNamedElement.class) {
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
				case DeclarationPackage.CT_MODIFIABLE__MODIFIERS: return DeclarationPackage.CT_NAMED_ELEMENT__MODIFIERS;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtNamedElement.class) {
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

} //CtNamedElementImpl