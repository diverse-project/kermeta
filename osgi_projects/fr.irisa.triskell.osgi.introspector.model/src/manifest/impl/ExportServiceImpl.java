/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportServiceImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import manifest.ExportService;
import manifest.ManifestPackage;
import manifest.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Export Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.ExportServiceImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExportServiceImpl extends MANIFESTEntryImpl implements
		ExportService {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ExportServiceImpl() {
		super();
		this.setEntryName(Constants.EXPORT_SERVICE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.EXPORT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Service getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService,
			NotificationChain msgs) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ManifestPackage.EXPORT_SERVICE__SERVICE,
					oldService, newService);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject) service).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.EXPORT_SERVICE__SERVICE,
						null, msgs);
			if (newService != null)
				msgs = ((InternalEObject) newService).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.EXPORT_SERVICE__SERVICE,
						null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.EXPORT_SERVICE__SERVICE, newService,
					newService));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ManifestPackage.EXPORT_SERVICE__SERVICE:
			return basicSetService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.EXPORT_SERVICE__SERVICE:
			return getService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ManifestPackage.EXPORT_SERVICE__SERVICE:
			setService((Service) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ManifestPackage.EXPORT_SERVICE__SERVICE:
			setService((Service) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ManifestPackage.EXPORT_SERVICE__SERVICE:
			return service != null;
		}
		return super.eIsSet(featureID);
	}

} // ExportServiceImpl
