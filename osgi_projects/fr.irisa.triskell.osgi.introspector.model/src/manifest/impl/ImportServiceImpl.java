/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportServiceImpl.java,v 1.3 2008-07-31 13:43:53 edaubert Exp $
 */
package manifest.impl;

import manifest.ImportService;
import manifest.ManifestPackage;

import manifest.Service;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Import Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link manifest.impl.ImportServiceImpl#isResolve <em>Resolve</em>}</li>
 *   <li>{@link manifest.impl.ImportServiceImpl#getService <em>Service</em>}</li>
 *   <li>{@link manifest.impl.ImportServiceImpl#getServiceElement <em>Service Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportServiceImpl extends MANIFESTEntryImpl implements
		ImportService {
	/**
	 * The default value of the '{@link #isResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isResolve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isResolve()
	 * @generated
	 * @ordered
	 */
	protected boolean resolve = RESOLVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected String service = SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceElement() <em>Service Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceElement()
	 * @generated
	 * @ordered
	 */
	protected Service serviceElement;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ImportServiceImpl() {
		super();
		this.setEntryName(Constants.IMPORT_SERVICE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.IMPORT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(String newService) {
		String oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_SERVICE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getServiceElement() {
		if (serviceElement != null && serviceElement.eIsProxy()) {
			InternalEObject oldServiceElement = (InternalEObject)serviceElement;
			serviceElement = (Service)eResolveProxy(oldServiceElement);
			if (serviceElement != oldServiceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.IMPORT_SERVICE__SERVICE_ELEMENT, oldServiceElement, serviceElement));
			}
		}
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetServiceElement() {
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceElement(Service newServiceElement) {
		Service oldServiceElement = serviceElement;
		serviceElement = newServiceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_SERVICE__SERVICE_ELEMENT, oldServiceElement, serviceElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolve() {
		return resolve;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolve(boolean newResolve) {
		boolean oldResolve = resolve;
		resolve = newResolve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_SERVICE__RESOLVE, oldResolve, resolve));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.IMPORT_SERVICE__RESOLVE:
				return isResolve() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				return getService();
			case ManifestPackage.IMPORT_SERVICE__SERVICE_ELEMENT:
				if (resolve) return getServiceElement();
				return basicGetServiceElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManifestPackage.IMPORT_SERVICE__RESOLVE:
				setResolve(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				setService((String)newValue);
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE_ELEMENT:
				setServiceElement((Service)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManifestPackage.IMPORT_SERVICE__RESOLVE:
				setResolve(RESOLVE_EDEFAULT);
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE_ELEMENT:
				setServiceElement((Service)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManifestPackage.IMPORT_SERVICE__RESOLVE:
				return resolve != RESOLVE_EDEFAULT;
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				return SERVICE_EDEFAULT == null ? service != null : !SERVICE_EDEFAULT.equals(service);
			case ManifestPackage.IMPORT_SERVICE__SERVICE_ELEMENT:
				return serviceElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resolve: ");
		result.append(resolve);
		result.append(", service: ");
		result.append(service);
		result.append(')');
		return result.toString();
	}

} // ImportServiceImpl
