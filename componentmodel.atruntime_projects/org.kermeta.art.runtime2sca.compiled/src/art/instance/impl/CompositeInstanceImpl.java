/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance.impl;

import art.instance.ComponentInstance;
import art.instance.CompositeInstance;
import art.instance.DelegationBinding;
import art.instance.InstancePackage;

import art.type.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.instance.impl.CompositeInstanceImpl#getSubComponent <em>Sub Component</em>}</li>
 *   <li>{@link art.instance.impl.CompositeInstanceImpl#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeInstanceImpl extends ComponentInstanceImpl implements
		CompositeInstance {
	/**
	 * The cached value of the '{@link #getSubComponent() <em>Sub Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> subComponent;

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
	protected CompositeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPOSITE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getSubComponent() {
		if (subComponent == null) {
			subComponent = new EObjectContainmentWithInverseEList.Resolving<ComponentInstance>(
					ComponentInstance.class, this,
					InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT,
					InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT);
		}
		return subComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationBinding> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectContainmentEList.Resolving<DelegationBinding>(
					DelegationBinding.class, this,
					InstancePackage.COMPOSITE_INSTANCE__DELEGATION);
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperationEMF_renameAs() {

		kermeta.standard.OrderedSet<art.type.Operation> result = null;

		result = ((kermeta.standard.OrderedSet<art.type.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		//BIft:collect

		kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft101 = null;

		result_ft101 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.DelegationBinding> convertAsOrderedSet(
							this.getDelegation()).iterator();
			java.lang.Boolean idLoopCond_382 = false;
			while (!idLoopCond_382) {
				idLoopCond_382 = it_ft101.isOff();
				if (idLoopCond_382) {
				} else {

					art.instance.ComponentInstance result_lambda_ft101 = null;
					//BIle:collector
					art.instance.DelegationBinding d_lbdExp101 = it_ft101
							.next();

					result_lambda_ft101 = d_lbdExp101.getServerInstance();
					//EIle:collector

					result_ft101.add(result_lambda_ft101);
				}
			}
		}

		//EIft:collect
		//BIft:each

		{

			kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft100 = result_ft101
					.iterator();
			java.lang.Boolean idLoopCond_381 = false;
			while (!idLoopCond_381) {
				idLoopCond_381 = it_ft100.isOff();
				if (idLoopCond_381) {
				} else {

					//BIle:func
					art.instance.ComponentInstance c_lbdExp100 = it_ft100
							.next();

					result
							.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.type.Operation> convertAsOrderedSet(c_lbdExp100
											.getterOperation()));
					//EIle:func

				}
			}
		}

		//EIft:each

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubComponent())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT:
			return ((InternalEList<?>) getSubComponent()).basicRemove(otherEnd,
					msgs);
		case InstancePackage.COMPOSITE_INSTANCE__DELEGATION:
			return ((InternalEList<?>) getDelegation()).basicRemove(otherEnd,
					msgs);
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
		case InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT:
			return getSubComponent();
		case InstancePackage.COMPOSITE_INSTANCE__DELEGATION:
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
		case InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT:
			getSubComponent().clear();
			getSubComponent().addAll(
					(Collection<? extends ComponentInstance>) newValue);
			return;
		case InstancePackage.COMPOSITE_INSTANCE__DELEGATION:
			getDelegation().clear();
			getDelegation().addAll(
					(Collection<? extends DelegationBinding>) newValue);
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
		case InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT:
			getSubComponent().clear();
			return;
		case InstancePackage.COMPOSITE_INSTANCE__DELEGATION:
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
		case InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT:
			return subComponent != null && !subComponent.isEmpty();
		case InstancePackage.COMPOSITE_INSTANCE__DELEGATION:
			return delegation != null && !delegation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeInstanceImpl
