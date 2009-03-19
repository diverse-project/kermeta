/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeParameterImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtTypeParameter;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtTypeParameterImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtTypeParameterImpl extends CtElementImpl implements CtTypeParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected EList bounds = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtTypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_TYPE_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBounds() {
		if (bounds == null) {
			bounds = new EObjectResolvingEList(CtTypeReference.class, this, DeclarationPackage.CT_TYPE_PARAMETER__BOUNDS);
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_TYPE_PARAMETER__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_TYPE_PARAMETER__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_TYPE_PARAMETER__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_TYPE_PARAMETER__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_TYPE_PARAMETER__NAME:
				return getName();
			case DeclarationPackage.CT_TYPE_PARAMETER__BOUNDS:
				return getBounds();
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
			case DeclarationPackage.CT_TYPE_PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
				getBounds().addAll((Collection)newValue);
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
			case DeclarationPackage.CT_TYPE_PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
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
			case DeclarationPackage.CT_TYPE_PARAMETER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_TYPE_PARAMETER__POSITION:
				return position != null;
			case DeclarationPackage.CT_TYPE_PARAMETER__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_TYPE_PARAMETER__PARENT:
				return parent != null;
			case DeclarationPackage.CT_TYPE_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeclarationPackage.CT_TYPE_PARAMETER__BOUNDS:
				return bounds != null && !bounds.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CtTypeParameterImpl