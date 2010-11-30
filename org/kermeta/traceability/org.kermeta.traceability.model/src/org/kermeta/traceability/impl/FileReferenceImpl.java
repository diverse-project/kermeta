/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.traceability.FileReference;
import org.kermeta.traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.traceability.impl.FileReferenceImpl#getFileURI <em>File URI</em>}</li>
 *   <li>{@link org.kermeta.traceability.impl.FileReferenceImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FileReferenceImpl extends ReferenceImpl implements FileReference {
	/**
	 * The default value of the '{@link #getFileURI() <em>File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileURI()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileURI() <em>File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileURI()
	 * @generated
	 * @ordered
	 */
	protected String fileURI = FILE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.FILE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileURI() {
		return fileURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileURI(String newFileURI) {
		String oldFileURI = fileURI;
		fileURI = newFileURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.FILE_REFERENCE__FILE_URI, oldFileURI, fileURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.FILE_REFERENCE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.FILE_REFERENCE__FILE_URI:
				return getFileURI();
			case TraceabilityPackage.FILE_REFERENCE__TIME_STAMP:
				return getTimeStamp();
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
			case TraceabilityPackage.FILE_REFERENCE__FILE_URI:
				setFileURI((String)newValue);
				return;
			case TraceabilityPackage.FILE_REFERENCE__TIME_STAMP:
				setTimeStamp((Date)newValue);
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
			case TraceabilityPackage.FILE_REFERENCE__FILE_URI:
				setFileURI(FILE_URI_EDEFAULT);
				return;
			case TraceabilityPackage.FILE_REFERENCE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case TraceabilityPackage.FILE_REFERENCE__FILE_URI:
				return FILE_URI_EDEFAULT == null ? fileURI != null : !FILE_URI_EDEFAULT.equals(fileURI);
			case TraceabilityPackage.FILE_REFERENCE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
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
		result.append(" (fileURI: ");
		result.append(fileURI);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //FileReferenceImpl
