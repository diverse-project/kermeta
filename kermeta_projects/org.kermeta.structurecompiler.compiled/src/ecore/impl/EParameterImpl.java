/**
 * <copyright>
 * </copyright>
 *
 * $Id: EParameterImpl.java,v 1.2 2008-09-08 19:28:31 cfaucher Exp $
 */
package ecore.impl;

import ecore.EOperation;
import ecore.EParameter;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EParameterImpl#getEOperation <em>EOperation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EParameterImpl extends ETypedElementImpl implements EParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEOperation() {
		if (eContainerFeatureID != EcorePackage.EPARAMETER__EOPERATION)
			return null;
		return (EOperation) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetEOperation() {
		if (eContainerFeatureID != EcorePackage.EPARAMETER__EOPERATION)
			return null;
		return (EOperation) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEOperation(EOperation newEOperation,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEOperation,
				EcorePackage.EPARAMETER__EOPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOperation(EOperation newEOperation) {
		if (newEOperation != eInternalContainer()
				|| (eContainerFeatureID != EcorePackage.EPARAMETER__EOPERATION && newEOperation != null)) {
			if (EcoreUtil.isAncestor(this, newEOperation))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEOperation != null)
				msgs = ((InternalEObject) newEOperation).eInverseAdd(this,
						EcorePackage.EOPERATION__EPARAMETERS, EOperation.class,
						msgs);
			msgs = basicSetEOperation(newEOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcorePackage.EPARAMETER__EOPERATION, newEOperation,
					newEOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcorePackage.EPARAMETER__EOPERATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEOperation((EOperation) otherEnd, msgs);
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
		case EcorePackage.EPARAMETER__EOPERATION:
			return basicSetEOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case EcorePackage.EPARAMETER__EOPERATION:
			return eInternalContainer().eInverseRemove(this,
					EcorePackage.EOPERATION__EPARAMETERS, EOperation.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcorePackage.EPARAMETER__EOPERATION:
			if (resolve)
				return getEOperation();
			return basicGetEOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcorePackage.EPARAMETER__EOPERATION:
			setEOperation((EOperation) newValue);
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
		case EcorePackage.EPARAMETER__EOPERATION:
			setEOperation((EOperation) null);
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
		case EcorePackage.EPARAMETER__EOPERATION:
			return basicGetEOperation() != null;
		}
		return super.eIsSet(featureID);
	}

} //EParameterImpl
