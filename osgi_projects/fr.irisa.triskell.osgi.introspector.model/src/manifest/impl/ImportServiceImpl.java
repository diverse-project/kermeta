/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportServiceImpl.java,v 1.5 2008-08-11 14:19:26 edaubert Exp $
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
 *   <li>{@link manifest.impl.ImportServiceImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.impl.ImportServiceImpl#getServiceReference <em>Service Reference</em>}</li>
 *   <li>{@link manifest.impl.ImportServiceImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportServiceImpl extends MANIFESTEntryImpl implements
		ImportService {
	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceReference() <em>Service Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceReference() <em>Service Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceReference()
	 * @generated
	 * @ordered
	 */
	protected String serviceReference = SERVICE_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_SERVICE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceReference() {
		return serviceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceReference(String newServiceReference) {
		String oldServiceReference = serviceReference;
		serviceReference = newServiceReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_SERVICE__SERVICE_REFERENCE, oldServiceReference, serviceReference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManifestPackage.IMPORT_SERVICE__SERVICE, oldService, service));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.IMPORT_SERVICE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.IMPORT_SERVICE__RESOLVED:
				return isResolved() ? Boolean.TRUE : Boolean.FALSE;
			case ManifestPackage.IMPORT_SERVICE__SERVICE_REFERENCE:
				return getServiceReference();
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
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
			case ManifestPackage.IMPORT_SERVICE__RESOLVED:
				setResolved(((Boolean)newValue).booleanValue());
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE_REFERENCE:
				setServiceReference((String)newValue);
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				setService((Service)newValue);
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
			case ManifestPackage.IMPORT_SERVICE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE_REFERENCE:
				setServiceReference(SERVICE_REFERENCE_EDEFAULT);
				return;
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				setService((Service)null);
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
			case ManifestPackage.IMPORT_SERVICE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case ManifestPackage.IMPORT_SERVICE__SERVICE_REFERENCE:
				return SERVICE_REFERENCE_EDEFAULT == null ? serviceReference != null : !SERVICE_REFERENCE_EDEFAULT.equals(serviceReference);
			case ManifestPackage.IMPORT_SERVICE__SERVICE:
				return service != null;
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
		result.append(" (resolved: ");
		result.append(resolved);
		result.append(", serviceReference: ");
		result.append(serviceReference);
		result.append(')');
		return result.toString();
	}

} // ImportServiceImpl
