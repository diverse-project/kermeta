/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionImpl.java,v 1.4 2007-07-03 12:37:33 dtouzet Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.TypeDefinitionImpl#isIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.TypeDefinitionImpl#getBaseAspects <em>Base Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionImpl extends NamedElementImpl implements TypeDefinition {
	/**
	 * The default value of the '{@link #isIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASPECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAspect() <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAspect()
	 * @generated
	 * @ordered
	 */
	protected boolean isAspect = IS_ASPECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseAspects() <em>Base Aspects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAspects()
	 * @generated
	 * @ordered
	 */
	protected EList baseAspects = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StructurePackage.Literals.TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAspect() {
		return isAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAspect(boolean newIsAspect) {
		boolean oldIsAspect = isAspect;
		isAspect = newIsAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.TYPE_DEFINITION__IS_ASPECT, oldIsAspect, isAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBaseAspects() {
		if (baseAspects == null) {
			baseAspects = new EObjectResolvingEList(TypeDefinition.class, this, StructurePackage.TYPE_DEFINITION__BASE_ASPECTS);
		}
		return baseAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				return isIsAspect() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.TYPE_DEFINITION__BASE_ASPECTS:
				return getBaseAspects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				setIsAspect(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.TYPE_DEFINITION__BASE_ASPECTS:
				getBaseAspects().clear();
				getBaseAspects().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				setIsAspect(IS_ASPECT_EDEFAULT);
				return;
			case StructurePackage.TYPE_DEFINITION__BASE_ASPECTS:
				getBaseAspects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructurePackage.TYPE_DEFINITION__IS_ASPECT:
				return isAspect != IS_ASPECT_EDEFAULT;
			case StructurePackage.TYPE_DEFINITION__BASE_ASPECTS:
				return baseAspects != null && !baseAspects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAspect: ");
		result.append(isAspect);
		result.append(')');
		return result.toString();
	}

} //TypeDefinitionImpl
