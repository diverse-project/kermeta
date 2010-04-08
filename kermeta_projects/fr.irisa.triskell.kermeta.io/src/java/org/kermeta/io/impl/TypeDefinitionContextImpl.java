/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.io.impl;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.io.IoPackage;
import org.kermeta.io.TypeDefinitionContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.impl.TypeDefinitionContextImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.kermeta.io.impl.TypeDefinitionContextImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionContextImpl extends EObjectImpl implements TypeDefinitionContext {
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
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Map<Integer, EList<TypeDefinition>> context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.TYPE_DEFINITION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.TYPE_DEFINITION_CONTEXT__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Integer, EList<TypeDefinition>> getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Map<Integer, EList<TypeDefinition>> newContext) {
		Map<Integer, EList<TypeDefinition>> oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.TYPE_DEFINITION_CONTEXT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.TYPE_DEFINITION_CONTEXT__QUALIFIED_NAME:
				return getQualifiedName();
			case IoPackage.TYPE_DEFINITION_CONTEXT__CONTEXT:
				return getContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IoPackage.TYPE_DEFINITION_CONTEXT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case IoPackage.TYPE_DEFINITION_CONTEXT__CONTEXT:
				setContext((Map<Integer, EList<TypeDefinition>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IoPackage.TYPE_DEFINITION_CONTEXT__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case IoPackage.TYPE_DEFINITION_CONTEXT__CONTEXT:
				setContext((Map<Integer, EList<TypeDefinition>>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IoPackage.TYPE_DEFINITION_CONTEXT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case IoPackage.TYPE_DEFINITION_CONTEXT__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qualifiedName: ");
		result.append(qualifiedName);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //TypeDefinitionContextImpl
