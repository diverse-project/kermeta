/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeImpl.java,v 1.2 2007/02/20 09:08:18 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.ModifierKind;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.declaration.CtMethod;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.declaration.CtType;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtReference;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getINNERTTYPE_SEPARATOR <em>INNERTTYPE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getActualClass <em>Actual Class</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getAllFields <em>All Fields</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getTopLevel <em>Top Level</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getSuperinterfaces <em>Superinterfaces</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeImpl#getAllMethods <em>All Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtTypeImpl extends CtGenericElementImpl implements CtType {
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
	 * The default value of the '{@link #getINNERTTYPE_SEPARATOR() <em>INNERTTYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINNERTTYPE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String INNERTTYPE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getINNERTTYPE_SEPARATOR() <em>INNERTTYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINNERTTYPE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String innerttypE_SEPARATOR = INNERTTYPE_SEPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList fields = null;

	/**
	 * The cached value of the '{@link #getNestedTypes() <em>Nested Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList nestedTypes = null;

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
	protected Class actualClass = ACTUAL_CLASS_EDEFAULT;

	

	/**
	 * The cached value of the '{@link #getAllFields() <em>All Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFields()
	 * @generated
	 * @ordered
	 */
	//protected EList allFields = null;

	/**
	 * The default value of the '{@link #getTopLevel() <em>Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TOP_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopLevel() <em>Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevel()
	 * @generated
	 * @ordered
	 */
	protected Boolean topLevel = TOP_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected CtPackage package_ = null;

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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods = null;

	/**
	 * The cached value of the '{@link #getSuperinterfaces() <em>Superinterfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList superinterfaces = null;

	/**
	 * The cached value of the '{@link #getAllMethods() <em>All Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMethods()
	 * @generated
	 * @ordered
	 */
	protected EList allMethods = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList(ModifierKind.class, this, DeclarationPackage.CT_TYPE__MODIFIERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_TYPE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		public CtTypeReference getReference() {
			if (reference != null)
				return (CtTypeReference) reference;
			/*else {
				if ( getFactory() !=null)
				return (CtTypeReference) getFactory().Type().createReference(this);
			}*/
			return null;
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
	public String getINNERTTYPE_SEPARATOR() {
		return innerttypE_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINNERTTYPE_SEPARATOR(String newINNERTTYPE_SEPARATOR) {
		String oldINNERTTYPE_SEPARATOR = innerttypE_SEPARATOR;
		innerttypE_SEPARATOR = newINNERTTYPE_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR, oldINNERTTYPE_SEPARATOR, innerttypE_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getFields() {
		if (fields == null) {
			fields = new EObjectWithInverseResolvingEList(CtField.class, this, DeclarationPackage.CT_TYPE__FIELDS, DeclarationPackage.CT_FIELD__DECLARING_TYPE);
		}
		return new EmfSet(fields);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getNestedTypes() {
		if (nestedTypes == null) {
			nestedTypes = new EObjectWithInverseResolvingEList(CtSimpleType.class, this, DeclarationPackage.CT_TYPE__NESTED_TYPES, DeclarationPackage.CT_SIMPLE_TYPE__DECLARING_TYPE);
		}
		return  new EmfSet(nestedTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class getActualClass() {
		return actualClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSimpleType getDeclaringType() {
		if (parent instanceof CtSimpleType) {
			return (CtSimpleType) parent;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSimpleType basicGetDeclaringType() {
		return this.getDeclaringType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getAllFields() {
		return new EmfSet(this.getFields());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTopLevel() {
		return topLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage getPackage() {
		if (parent instanceof CtPackage) {
			return (CtPackage) parent;
		} else if (parent instanceof CtSimpleType) {
			return ((CtSimpleType) parent).getPackage();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		if (isTopLevel()){
			if (getPackage() != null
					&& !getPackage().getSimpleName().equals(
							CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
				return getPackage().getQualifiedName() + "." + getSimpleName();
			}
			return getSimpleName();
		}
		if (getDeclaringType() != null)
			return getDeclaringType().getQualifiedName() + INNERTTYPE_SEPARATOR
					+ getSimpleName();
		else
			return getSimpleName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getMethods() {
		if (methods == null) {
			methods = new EObjectResolvingEList(CtMethod.class, this, DeclarationPackage.CT_TYPE__METHODS);
		}
		return new EmfSet(methods);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getSuperinterfaces() {
		if (superinterfaces == null) {
			superinterfaces = new EObjectResolvingEList(CtTypeReference.class, this, DeclarationPackage.CT_TYPE__SUPERINTERFACES);
		}
		return new EmfSet(superinterfaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getAllMethods() {
		if (allMethods == null) {
			allMethods = new EObjectResolvingEList(CtMethod.class, this, DeclarationPackage.CT_TYPE__ALL_METHODS);
		}
		return new EmfSet(allMethods);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_TYPE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_TYPE__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_TYPE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_TYPE__FORMAL_TYPE_PARAMETERS:
				return getFormalTypeParameters();
			case DeclarationPackage.CT_TYPE__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_TYPE__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_TYPE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR:
				return getINNERTTYPE_SEPARATOR();
			case DeclarationPackage.CT_TYPE__FIELDS:
				return getFields();
			case DeclarationPackage.CT_TYPE__NESTED_TYPES:
				return getNestedTypes();
			case DeclarationPackage.CT_TYPE__ACTUAL_CLASS:
				return getActualClass();
			case DeclarationPackage.CT_TYPE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case DeclarationPackage.CT_TYPE__ALL_FIELDS:
				return getAllFields();
			case DeclarationPackage.CT_TYPE__TOP_LEVEL:
				return getTopLevel();
			case DeclarationPackage.CT_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case DeclarationPackage.CT_TYPE__QUALIFIED_NAME:
				return getQualifiedName();
			case DeclarationPackage.CT_TYPE__METHODS:
				return getMethods();
			case DeclarationPackage.CT_TYPE__SUPERINTERFACES:
				return getSuperinterfaces();
			case DeclarationPackage.CT_TYPE__ALL_METHODS:
				return getAllMethods();
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
			case DeclarationPackage.CT_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_TYPE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_TYPE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_TYPE__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_TYPE__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				getFormalTypeParameters().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_TYPE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_TYPE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR:
				setINNERTTYPE_SEPARATOR((String)newValue);
				return;
			case DeclarationPackage.CT_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_TYPE__NESTED_TYPES:
				getNestedTypes().clear();
				getNestedTypes().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_TYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_TYPE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_TYPE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_TYPE__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_TYPE__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				return;
			case DeclarationPackage.CT_TYPE__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_TYPE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR:
				setINNERTTYPE_SEPARATOR(INNERTTYPE_SEPARATOR_EDEFAULT);
				return;
			case DeclarationPackage.CT_TYPE__FIELDS:
				getFields().clear();
				return;
			case DeclarationPackage.CT_TYPE__NESTED_TYPES:
				getNestedTypes().clear();
				return;
			case DeclarationPackage.CT_TYPE__METHODS:
				getMethods().clear();
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
			case DeclarationPackage.CT_TYPE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_TYPE__POSITION:
				return position != null;
			case DeclarationPackage.CT_TYPE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_TYPE__PARENT:
				return parent != null;
			case DeclarationPackage.CT_TYPE__FORMAL_TYPE_PARAMETERS:
				return formalTypeParameters != null && !formalTypeParameters.isEmpty();
			case DeclarationPackage.CT_TYPE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_TYPE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_TYPE__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR:
				return INNERTTYPE_SEPARATOR_EDEFAULT == null ? innerttypE_SEPARATOR != null : !INNERTTYPE_SEPARATOR_EDEFAULT.equals(innerttypE_SEPARATOR);
			case DeclarationPackage.CT_TYPE__FIELDS:
				return !getFields().isEmpty();
			case DeclarationPackage.CT_TYPE__NESTED_TYPES:
				return !getNestedTypes().isEmpty();
			case DeclarationPackage.CT_TYPE__ACTUAL_CLASS:
				return ACTUAL_CLASS_EDEFAULT == null ? actualClass != null : !ACTUAL_CLASS_EDEFAULT.equals(actualClass);
			case DeclarationPackage.CT_TYPE__DECLARING_TYPE:
				return basicGetDeclaringType() != null;
			case DeclarationPackage.CT_TYPE__ALL_FIELDS:
				return !getAllFields().isEmpty();
			case DeclarationPackage.CT_TYPE__TOP_LEVEL:
				return TOP_LEVEL_EDEFAULT == null ? topLevel != null : !TOP_LEVEL_EDEFAULT.equals(topLevel);
			case DeclarationPackage.CT_TYPE__PACKAGE:
				return basicGetPackage() != null;
			case DeclarationPackage.CT_TYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case DeclarationPackage.CT_TYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case DeclarationPackage.CT_TYPE__SUPERINTERFACES:
				return superinterfaces != null && !superinterfaces.isEmpty();
			case DeclarationPackage.CT_TYPE__ALL_METHODS:
				return !getAllMethods().isEmpty();
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
				case DeclarationPackage.CT_TYPE__MODIFIERS: return DeclarationPackage.CT_MODIFIABLE__MODIFIERS;
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
				case DeclarationPackage.CT_TYPE__SIMPLE_NAME: return DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME;
				case DeclarationPackage.CT_TYPE__REFERENCE: return DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtSimpleType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CtSimpleType.class) {
			switch (derivedFeatureID) {
				case DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR: return DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR;
				case DeclarationPackage.CT_TYPE__FIELDS: return DeclarationPackage.CT_SIMPLE_TYPE__FIELDS;
				case DeclarationPackage.CT_TYPE__NESTED_TYPES: return DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES;
				case DeclarationPackage.CT_TYPE__ACTUAL_CLASS: return DeclarationPackage.CT_SIMPLE_TYPE__ACTUAL_CLASS;
				case DeclarationPackage.CT_TYPE__DECLARING_TYPE: return DeclarationPackage.CT_SIMPLE_TYPE__DECLARING_TYPE;
				case DeclarationPackage.CT_TYPE__ALL_FIELDS: return DeclarationPackage.CT_SIMPLE_TYPE__ALL_FIELDS;
				case DeclarationPackage.CT_TYPE__TOP_LEVEL: return DeclarationPackage.CT_SIMPLE_TYPE__TOP_LEVEL;
				case DeclarationPackage.CT_TYPE__PACKAGE: return DeclarationPackage.CT_SIMPLE_TYPE__PACKAGE;
				case DeclarationPackage.CT_TYPE__QUALIFIED_NAME: return DeclarationPackage.CT_SIMPLE_TYPE__QUALIFIED_NAME;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtType.class) {
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
				case DeclarationPackage.CT_MODIFIABLE__MODIFIERS: return DeclarationPackage.CT_TYPE__MODIFIERS;
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
				case DeclarationPackage.CT_NAMED_ELEMENT__SIMPLE_NAME: return DeclarationPackage.CT_TYPE__SIMPLE_NAME;
				case DeclarationPackage.CT_NAMED_ELEMENT__REFERENCE: return DeclarationPackage.CT_TYPE__REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtSimpleType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CtSimpleType.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR: return DeclarationPackage.CT_TYPE__INNERTTYPE_SEPARATOR;
				case DeclarationPackage.CT_SIMPLE_TYPE__FIELDS: return DeclarationPackage.CT_TYPE__FIELDS;
				case DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES: return DeclarationPackage.CT_TYPE__NESTED_TYPES;
				case DeclarationPackage.CT_SIMPLE_TYPE__ACTUAL_CLASS: return DeclarationPackage.CT_TYPE__ACTUAL_CLASS;
				case DeclarationPackage.CT_SIMPLE_TYPE__DECLARING_TYPE: return DeclarationPackage.CT_TYPE__DECLARING_TYPE;
				case DeclarationPackage.CT_SIMPLE_TYPE__ALL_FIELDS: return DeclarationPackage.CT_TYPE__ALL_FIELDS;
				case DeclarationPackage.CT_SIMPLE_TYPE__TOP_LEVEL: return DeclarationPackage.CT_TYPE__TOP_LEVEL;
				case DeclarationPackage.CT_SIMPLE_TYPE__PACKAGE: return DeclarationPackage.CT_TYPE__PACKAGE;
				case DeclarationPackage.CT_SIMPLE_TYPE__QUALIFIED_NAME: return DeclarationPackage.CT_TYPE__QUALIFIED_NAME;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtType.class) {
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
		result.append(", INNERTTYPE_SEPARATOR: ");
		result.append(innerttypE_SEPARATOR);
		result.append(", ActualClass: ");
		result.append(actualClass);
		result.append(", TopLevel: ");
		result.append(topLevel);
		result.append(')');
		return result.toString();
	}
} //CtTypeImpl