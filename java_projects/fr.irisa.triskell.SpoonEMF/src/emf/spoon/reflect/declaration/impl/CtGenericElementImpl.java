/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtGenericElementImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtGenericElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Generic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtGenericElementImpl#getFormalTypeParameters <em>Formal Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtGenericElementImpl extends CtElementImpl implements CtGenericElement {
	/**
	 * The cached value of the '{@link #getFormalTypeParameters() <em>Formal Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList formalTypeParameters = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtGenericElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_GENERIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getFormalTypeParameters() {
		if (formalTypeParameters == null) {
			formalTypeParameters = new EObjectResolvingEList(CtTypeReference.class, this, DeclarationPackage.CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS);
		}
		return formalTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_GENERIC_ELEMENT__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_GENERIC_ELEMENT__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_GENERIC_ELEMENT__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_GENERIC_ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS:
				return getFormalTypeParameters();
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
			case DeclarationPackage.CT_GENERIC_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				getFormalTypeParameters().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_GENERIC_ELEMENT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
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
			case DeclarationPackage.CT_GENERIC_ELEMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_GENERIC_ELEMENT__POSITION:
				return position != null;
			case DeclarationPackage.CT_GENERIC_ELEMENT__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_GENERIC_ELEMENT__PARENT:
				return parent != null;
			case DeclarationPackage.CT_GENERIC_ELEMENT__FORMAL_TYPE_PARAMETERS:
				return formalTypeParameters != null && !formalTypeParameters.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtGenericElementImpl