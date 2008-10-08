/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileImpl.java,v 1.4 2008-10-08 14:37:52 cfaucher Exp $
 */
package traceability.impl;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import traceability.File;
import traceability.TraceModel;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.FileImpl#getId <em>Id</em>}</li>
 *   <li>{@link traceability.impl.FileImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends ObjectImpl implements File {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.FILE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.FILE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile(TraceModel traceModel, String uri_toFind) {

		traceability.File result = null;

		traceability.File file = null;
		//BIft:detect

		traceability.File result_ft245 = null;

		traceability.File elem_ft245 = null;

		result_ft245 = null;

		{

			kermeta.standard.Iterator<traceability.File> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.File> convertAsOrderedSet(
							traceModel.getFiles()).iterator();
			java.lang.Boolean idLoopCond_1067 = false;
			while (!idLoopCond_1067) {
				idLoopCond_1067 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft245.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft245, null));
				if (idLoopCond_1067) {
				} else {

					elem_ft245 = it_ft245.next();

					java.lang.Boolean idIfCond_1068 = false;
					//BIle:detector
					traceability.File f_lbdExp245 = elem_ft245;

					idIfCond_1068 = kermeta.standard.helper.StringWrapper
							.equals(f_lbdExp245.getUri(), uri_toFind);
					//EIle:detector

					if (idIfCond_1068) {

						result_ft245 = elem_ft245;
					}

				}
			}
		}

		//CE
		file = result_ft245;
		//EIft:detect

		java.lang.Boolean idIfCond_1069 = false;
		idIfCond_1069 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(file);

		if (idIfCond_1069) {

			file = ((traceability.File) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("traceability.File"));

			file.setUri(uri_toFind);

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<traceability.File> convertAsOrderedSet(
							traceModel.getFiles()).add(file);

			file
					.setId(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<traceability.File> convertAsOrderedSet(
									traceModel.getFiles()).size());
		}

		result = file;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								"self.uri: ", this.getUri()), " - self.id: "),
				kermeta.standard.helper.IntegerWrapper.toString(this.getId()));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TraceabilityPackage.FILE__ID:
			return getId();
		case TraceabilityPackage.FILE__URI:
			return getUri();
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
		case TraceabilityPackage.FILE__ID:
			setId((Integer) newValue);
			return;
		case TraceabilityPackage.FILE__URI:
			setUri((String) newValue);
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
		case TraceabilityPackage.FILE__ID:
			setId(ID_EDEFAULT);
			return;
		case TraceabilityPackage.FILE__URI:
			setUri(URI_EDEFAULT);
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
		case TraceabilityPackage.FILE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TraceabilityPackage.FILE__URI:
			return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT
					.equals(uri);
		}
		return super.eIsSet(featureID);
	}

} //FileImpl
