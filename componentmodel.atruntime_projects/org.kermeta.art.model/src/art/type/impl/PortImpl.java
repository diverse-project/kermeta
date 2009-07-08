/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import art.impl.CardinalityElementImpl;
import art.implem.PortImplementation;
import art.type.Port;
import art.type.Service;
import art.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.type.impl.PortImpl#getIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link art.type.impl.PortImpl#getService <em>Service</em>}</li>
 *   <li>{@link art.type.impl.PortImpl#getRole <em>Role</em>}</li>
 *   <li>{@link art.type.impl.PortImpl#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends CardinalityElementImpl implements Port {
	/**
	 * The default value of the '{@link #getIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_OPTIONAL_EDEFAULT = Boolean.TRUE;
	/**
	 * The cached value of the '{@link #getIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOptional()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOptional = IS_OPTIONAL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplem() <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplem()
	 * @generated
	 * @ordered
	 */
	protected PortImplementation implem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(Boolean newIsOptional) {
		Boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PORT__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.PORT__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PORT__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PORT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortImplementation getImplem() {
		return implem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplem(PortImplementation newImplem, NotificationChain msgs) {
		PortImplementation oldImplem = implem;
		implem = newImplem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.PORT__IMPLEM, oldImplem, newImplem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplem(PortImplementation newImplem) {
		if (newImplem != implem) {
			NotificationChain msgs = null;
			if (implem != null)
				msgs = ((InternalEObject)implem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.PORT__IMPLEM, null, msgs);
			if (newImplem != null)
				msgs = ((InternalEObject)newImplem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.PORT__IMPLEM, null, msgs);
			msgs = basicSetImplem(newImplem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PORT__IMPLEM, newImplem, newImplem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.PORT__IMPLEM:
				return basicSetImplem(null, msgs);
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
			case TypePackage.PORT__IS_OPTIONAL:
				return getIsOptional();
			case TypePackage.PORT__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case TypePackage.PORT__ROLE:
				return getRole();
			case TypePackage.PORT__IMPLEM:
				return getImplem();
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
			case TypePackage.PORT__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case TypePackage.PORT__SERVICE:
				setService((Service)newValue);
				return;
			case TypePackage.PORT__ROLE:
				setRole((String)newValue);
				return;
			case TypePackage.PORT__IMPLEM:
				setImplem((PortImplementation)newValue);
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
			case TypePackage.PORT__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case TypePackage.PORT__SERVICE:
				setService((Service)null);
				return;
			case TypePackage.PORT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case TypePackage.PORT__IMPLEM:
				setImplem((PortImplementation)null);
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
			case TypePackage.PORT__IS_OPTIONAL:
				return IS_OPTIONAL_EDEFAULT == null ? isOptional != null : !IS_OPTIONAL_EDEFAULT.equals(isOptional);
			case TypePackage.PORT__SERVICE:
				return service != null;
			case TypePackage.PORT__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case TypePackage.PORT__IMPLEM:
				return implem != null;
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
		result.append(" (isOptional: ");
		result.append(isOptional);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //PortImpl
