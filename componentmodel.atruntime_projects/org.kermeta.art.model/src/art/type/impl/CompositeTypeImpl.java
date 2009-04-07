/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import art.instance.DelegationBinding;
import art.type.CompositeType;
import art.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.type.impl.CompositeTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link art.type.impl.CompositeTypeImpl#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeTypeImpl extends ComponentTypeImpl implements CompositeType {
	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeType> subTypes;
	/**
	 * The cached value of the '{@link #getDelegation() <em>Delegation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationBinding> delegation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.COMPOSITE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompositeType> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<CompositeType>(CompositeType.class, this, TypePackage.COMPOSITE_TYPE__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DelegationBinding> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectContainmentEList<DelegationBinding>(DelegationBinding.class, this, TypePackage.COMPOSITE_TYPE__DELEGATION);
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.COMPOSITE_TYPE__DELEGATION:
				return ((InternalEList<?>)getDelegation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypePackage.COMPOSITE_TYPE__SUB_TYPES:
				return getSubTypes();
			case TypePackage.COMPOSITE_TYPE__DELEGATION:
				return getDelegation();
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
			case TypePackage.COMPOSITE_TYPE__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends CompositeType>)newValue);
				return;
			case TypePackage.COMPOSITE_TYPE__DELEGATION:
				getDelegation().clear();
				getDelegation().addAll((Collection<? extends DelegationBinding>)newValue);
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
			case TypePackage.COMPOSITE_TYPE__SUB_TYPES:
				getSubTypes().clear();
				return;
			case TypePackage.COMPOSITE_TYPE__DELEGATION:
				getDelegation().clear();
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
			case TypePackage.COMPOSITE_TYPE__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
			case TypePackage.COMPOSITE_TYPE__DELEGATION:
				return delegation != null && !delegation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeTypeImpl
