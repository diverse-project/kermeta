/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import art.instance.DelegationBinding;
import art.instance.InstancePackage;
import art.type.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.instance.impl.DelegationBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link art.instance.impl.DelegationBindingImpl#getExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationBindingImpl extends BindingImpl implements DelegationBinding {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Port source;
	/**
	 * The cached value of the '{@link #getExported() <em>Exported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExported()
	 * @generated
	 * @ordered
	 */
	protected Port exported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DELEGATION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Port)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DELEGATION_BINDING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Port newSource) {
		Port oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DELEGATION_BINDING__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getExported() {
		if (exported != null && exported.eIsProxy()) {
			InternalEObject oldExported = (InternalEObject)exported;
			exported = (Port)eResolveProxy(oldExported);
			if (exported != oldExported) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DELEGATION_BINDING__EXPORTED, oldExported, exported));
			}
		}
		return exported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetExported() {
		return exported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExported(Port newExported) {
		Port oldExported = exported;
		exported = newExported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DELEGATION_BINDING__EXPORTED, oldExported, exported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DELEGATION_BINDING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InstancePackage.DELEGATION_BINDING__EXPORTED:
				if (resolve) return getExported();
				return basicGetExported();
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
			case InstancePackage.DELEGATION_BINDING__SOURCE:
				setSource((Port)newValue);
				return;
			case InstancePackage.DELEGATION_BINDING__EXPORTED:
				setExported((Port)newValue);
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
			case InstancePackage.DELEGATION_BINDING__SOURCE:
				setSource((Port)null);
				return;
			case InstancePackage.DELEGATION_BINDING__EXPORTED:
				setExported((Port)null);
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
			case InstancePackage.DELEGATION_BINDING__SOURCE:
				return source != null;
			case InstancePackage.DELEGATION_BINDING__EXPORTED:
				return exported != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	public String getClientName() {
		return getExported().getName();
	}

	/**
	 * @generated NOT
	 */
	public String getServerName() {
		return getSource().getName();
	}

} //DelegationBindingImpl
