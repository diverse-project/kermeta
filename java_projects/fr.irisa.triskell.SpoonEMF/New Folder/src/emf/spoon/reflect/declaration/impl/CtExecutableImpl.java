/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtExecutableImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.ModifierKind;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtExecutable;
import emf.spoon.reflect.declaration.CtParameter;
import emf.spoon.reflect.declaration.CtType;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtExecutableReference;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Executable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getEXECUTABLE_SEPARATOR <em>EXECUTABLE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getBody <em>Body</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getThrownTypes <em>Thrown Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtExecutableImpl#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtExecutableImpl<T> extends CtGenericElementImpl implements CtExecutable<T> {
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
	 * The default value of the '{@link #getEXECUTABLE_SEPARATOR() <em>EXECUTABLE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXECUTABLE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTABLE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEXECUTABLE_SEPARATOR() <em>EXECUTABLE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEXECUTABLE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String executablE_SEPARATOR = EXECUTABLE_SEPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected CtBlock body = null;

	/**
	 * The cached value of the '{@link #getThrownTypes() <em>Thrown Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownTypes()
	 * @generated
	 * @ordered
	 */
	protected EList thrownTypes = null;

	/**
	 * The cached value of the '{@link #getDeclaringType() <em>Declaring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringType()
	 * @generated
	 * @ordered
	 */
	//protected CtType declaringType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtExecutableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_EXECUTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList(ModifierKind.class, this, DeclarationPackage.CT_EXECUTABLE__MODIFIERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExecutableReference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (CtReference)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_EXECUTABLE__REFERENCE, oldReference, reference));
			}
		}
		return (CtExecutableReference) reference;
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
	public String getEXECUTABLE_SEPARATOR() {
		return executablE_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEXECUTABLE_SEPARATOR(String newEXECUTABLE_SEPARATOR) {
		String oldEXECUTABLE_SEPARATOR = executablE_SEPARATOR;
		executablE_SEPARATOR = newEXECUTABLE_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_EXECUTABLE__EXECUTABLE_SEPARATOR, oldEXECUTABLE_SEPARATOR, executablE_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getParameters() {
		if (parameters == null) {
			parameters = new EObjectWithInverseResolvingEList(CtParameter.class, this, DeclarationPackage.CT_EXECUTABLE__PARAMETERS, DeclarationPackage.CT_PARAMETER__PARENT);
		}
		return new EmfSet(parameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (CtBlock)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_EXECUTABLE__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtBlock basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(CtBlock newBody) {
		CtBlock oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_EXECUTABLE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getThrownTypes() {
		if (thrownTypes == null) {
			thrownTypes = new EObjectResolvingEList(CtTypeReference.class, this, DeclarationPackage.CT_EXECUTABLE__THROWN_TYPES);
		}
		return new EmfSet(thrownTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtType getDeclaringType() {
		return (CtType) this.getParent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtType basicGetDeclaringType() {
		return this.getDeclaringType();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_EXECUTABLE__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_EXECUTABLE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_EXECUTABLE__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_EXECUTABLE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS:
				return getFormalTypeParameters();
			case DeclarationPackage.CT_EXECUTABLE__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_EXECUTABLE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_EXECUTABLE__EXECUTABLE_SEPARATOR:
				return getEXECUTABLE_SEPARATOR();
			case DeclarationPackage.CT_EXECUTABLE__PARAMETERS:
				return getParameters();
			case DeclarationPackage.CT_EXECUTABLE__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case DeclarationPackage.CT_EXECUTABLE__THROWN_TYPES:
				return getThrownTypes();
			case DeclarationPackage.CT_EXECUTABLE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
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
			case DeclarationPackage.CT_EXECUTABLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				getFormalTypeParameters().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__EXECUTABLE_SEPARATOR:
				setEXECUTABLE_SEPARATOR((String)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__BODY:
				setBody((CtBlock)newValue);
				return;
			case DeclarationPackage.CT_EXECUTABLE__THROWN_TYPES:
				getThrownTypes().clear();
				getThrownTypes().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_EXECUTABLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_EXECUTABLE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_EXECUTABLE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_EXECUTABLE__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				return;
			case DeclarationPackage.CT_EXECUTABLE__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_EXECUTABLE__EXECUTABLE_SEPARATOR:
				setEXECUTABLE_SEPARATOR(EXECUTABLE_SEPARATOR_EDEFAULT);
				return;
			case DeclarationPackage.CT_EXECUTABLE__PARAMETERS:
				getParameters().clear();
				return;
			case DeclarationPackage.CT_EXECUTABLE__BODY:
				setBody((CtBlock)null);
				return;
			case DeclarationPackage.CT_EXECUTABLE__THROWN_TYPES:
				getThrownTypes().clear();
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
			case DeclarationPackage.CT_EXECUTABLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_EXECUTABLE__POSITION:
				return position != null;
			case DeclarationPackage.CT_EXECUTABLE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_EXECUTABLE__PARENT:
				return parent != null;
			case DeclarationPackage.CT_EXECUTABLE__FORMAL_TYPE_PARAMETERS:
				return formalTypeParameters != null && !formalTypeParameters.isEmpty();
			case DeclarationPackage.CT_EXECUTABLE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_EXECUTABLE__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_EXECUTABLE__EXECUTABLE_SEPARATOR:
				return EXECUTABLE_SEPARATOR_EDEFAULT == null ? executablE_SEPARATOR != null : !EXECUTABLE_SEPARATOR_EDEFAULT.equals(executablE_SEPARATOR);
			case DeclarationPackage.CT_EXECUTABLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DeclarationPackage.CT_EXECUTABLE__BODY:
				return body != null;
			case DeclarationPackage.CT_EXECUTABLE__THROWN_TYPES:
				return thrownTypes != null && !thrownTypes.isEmpty();
			case DeclarationPackage.CT_EXECUTABLE__DECLARING_TYPE:
				return basicGetDeclaringType() != null;
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
				case DeclarationPackage.CT_EXECUTABLE__MODIFIERS: return DeclarationPackage.CT_MODIFIABLE__MODIFIERS;
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
				case DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME: return DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME;
				case DeclarationPackage.CT_EXECUTABLE__REFERENCE: return DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtExecutable.class) {
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
				case DeclarationPackage.CT_MODIFIABLE__MODIFIERS: return DeclarationPackage.CT_EXECUTABLE__MODIFIERS;
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
				case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME: return DeclarationPackage.CT_EXECUTABLE__SIMPLE_NAME;
				case DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE: return DeclarationPackage.CT_EXECUTABLE__REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtExecutable.class) {
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
		result.append(", EXECUTABLE_SEPARATOR: ");
		result.append(executablE_SEPARATOR);
		result.append(')');
		return result.toString();
	}
} //CtExecutableImpl