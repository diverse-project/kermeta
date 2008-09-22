/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFRepositoryImpl.java,v 1.3 2008-09-22 14:48:25 cfaucher Exp $
 */
package kermeta.persistence.impl;

import kermeta.persistence.EMFRepository;
import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#getUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}</li>
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#getIgnoreLoadErrorUnknownMetaclass <em>Ignore Load Error Unknown Metaclass</em>}</li>
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#getIgnoreAllLoadErrors <em>Ignore All Load Errors</em>}</li>
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#getIgnoreLoadErrorUnknownProperty <em>Ignore Load Error Unknown Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFRepositoryImpl extends RepositoryImpl implements EMFRepository {
	/**
	 * The default value of the '{@link #getUseInterpreterInternalResources() <em>Use Interpreter Internal Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseInterpreterInternalResources()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseInterpreterInternalResources() <em>Use Interpreter Internal Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseInterpreterInternalResources()
	 * @generated
	 * @ordered
	 */
	protected Boolean useInterpreterInternalResources = USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreLoadErrorUnknownMetaclass() <em>Ignore Load Error Unknown Metaclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLoadErrorUnknownMetaclass()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_LOAD_ERROR_UNKNOWN_METACLASS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIgnoreLoadErrorUnknownMetaclass() <em>Ignore Load Error Unknown Metaclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLoadErrorUnknownMetaclass()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreLoadErrorUnknownMetaclass = IGNORE_LOAD_ERROR_UNKNOWN_METACLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreAllLoadErrors() <em>Ignore All Load Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreAllLoadErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_ALL_LOAD_ERRORS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIgnoreAllLoadErrors() <em>Ignore All Load Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreAllLoadErrors()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreAllLoadErrors = IGNORE_ALL_LOAD_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreLoadErrorUnknownProperty() <em>Ignore Load Error Unknown Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLoadErrorUnknownProperty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIgnoreLoadErrorUnknownProperty() <em>Ignore Load Error Unknown Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLoadErrorUnknownProperty()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreLoadErrorUnknownProperty = IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.EMF_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseInterpreterInternalResources() {
		return useInterpreterInternalResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseInterpreterInternalResources(
			Boolean newUseInterpreterInternalResources) {
		Boolean oldUseInterpreterInternalResources = useInterpreterInternalResources;
		useInterpreterInternalResources = newUseInterpreterInternalResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES,
					oldUseInterpreterInternalResources,
					useInterpreterInternalResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIgnoreLoadErrorUnknownMetaclass() {
		return ignoreLoadErrorUnknownMetaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreLoadErrorUnknownMetaclass(
			Boolean newIgnoreLoadErrorUnknownMetaclass) {
		Boolean oldIgnoreLoadErrorUnknownMetaclass = ignoreLoadErrorUnknownMetaclass;
		ignoreLoadErrorUnknownMetaclass = newIgnoreLoadErrorUnknownMetaclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_METACLASS,
					oldIgnoreLoadErrorUnknownMetaclass,
					ignoreLoadErrorUnknownMetaclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIgnoreAllLoadErrors() {
		return ignoreAllLoadErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreAllLoadErrors(Boolean newIgnoreAllLoadErrors) {
		Boolean oldIgnoreAllLoadErrors = ignoreAllLoadErrors;
		ignoreAllLoadErrors = newIgnoreAllLoadErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.EMF_REPOSITORY__IGNORE_ALL_LOAD_ERRORS,
					oldIgnoreAllLoadErrors, ignoreAllLoadErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIgnoreLoadErrorUnknownProperty() {
		return ignoreLoadErrorUnknownProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreLoadErrorUnknownProperty(
			Boolean newIgnoreLoadErrorUnknownProperty) {
		Boolean oldIgnoreLoadErrorUnknownProperty = ignoreLoadErrorUnknownProperty;
		ignoreLoadErrorUnknownProperty = newIgnoreLoadErrorUnknownProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY,
					oldIgnoreLoadErrorUnknownProperty,
					ignoreLoadErrorUnknownProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource(String uri, String mm_uri) {

		kermeta.persistence.Resource result = null;

		//BIft:collect

		kermeta.standard.Sequence<java.lang.String> result_ft229 = null;

		result_ft229 = ((kermeta.standard.Sequence<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<java.lang.String>"));

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft229 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.persistence.Resource> convertAsSet(
							this.getResources()).iterator();
			java.lang.Boolean idLoopCond_980 = false;
			while (!idLoopCond_980) {
				idLoopCond_980 = it_ft229.isOff();
				if (idLoopCond_980) {
				} else {

					java.lang.String result_lambda_ft229 = null;
					//BIle:collector
					kermeta.persistence.Resource r_lbdExp229 = it_ft229.next();

					result_lambda_ft229 = r_lbdExp229.getUri();
					//EIle:collector

					result_ft229.add(result_lambda_ft229);
				}
			}
		}

		//EIft:collect
		java.lang.Boolean idIfCond_979 = false;
		idIfCond_979 = kermeta.standard.helper.BooleanWrapper.not(result_ft229
				.contains(uri));

		if (idIfCond_979) {

			result = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.basetypes.RepositoryUtil
					.createResource(this, uri, mm_uri);
		} else {

			kermeta.exceptions.ResourceCreateException e = ((kermeta.exceptions.ResourceCreateException) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.exceptions.ResourceCreateException"));

			e
					.setMessage(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	"Trying to create a resource already existing at ",
																	uri), ".\n"),
									"Remove existing resource from repository first, or use \"getResource\" operation."));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						e);

		}

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
		case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
			return getUseInterpreterInternalResources();
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_METACLASS:
			return getIgnoreLoadErrorUnknownMetaclass();
		case PersistencePackage.EMF_REPOSITORY__IGNORE_ALL_LOAD_ERRORS:
			return getIgnoreAllLoadErrors();
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY:
			return getIgnoreLoadErrorUnknownProperty();
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
		case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
			setUseInterpreterInternalResources((Boolean) newValue);
			return;
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_METACLASS:
			setIgnoreLoadErrorUnknownMetaclass((Boolean) newValue);
			return;
		case PersistencePackage.EMF_REPOSITORY__IGNORE_ALL_LOAD_ERRORS:
			setIgnoreAllLoadErrors((Boolean) newValue);
			return;
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY:
			setIgnoreLoadErrorUnknownProperty((Boolean) newValue);
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
		case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
			setUseInterpreterInternalResources(USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT);
			return;
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_METACLASS:
			setIgnoreLoadErrorUnknownMetaclass(IGNORE_LOAD_ERROR_UNKNOWN_METACLASS_EDEFAULT);
			return;
		case PersistencePackage.EMF_REPOSITORY__IGNORE_ALL_LOAD_ERRORS:
			setIgnoreAllLoadErrors(IGNORE_ALL_LOAD_ERRORS_EDEFAULT);
			return;
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY:
			setIgnoreLoadErrorUnknownProperty(IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY_EDEFAULT);
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
		case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
			return USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT == null ? useInterpreterInternalResources != null
					: !USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT
							.equals(useInterpreterInternalResources);
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_METACLASS:
			return IGNORE_LOAD_ERROR_UNKNOWN_METACLASS_EDEFAULT == null ? ignoreLoadErrorUnknownMetaclass != null
					: !IGNORE_LOAD_ERROR_UNKNOWN_METACLASS_EDEFAULT
							.equals(ignoreLoadErrorUnknownMetaclass);
		case PersistencePackage.EMF_REPOSITORY__IGNORE_ALL_LOAD_ERRORS:
			return IGNORE_ALL_LOAD_ERRORS_EDEFAULT == null ? ignoreAllLoadErrors != null
					: !IGNORE_ALL_LOAD_ERRORS_EDEFAULT
							.equals(ignoreAllLoadErrors);
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY:
			return IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY_EDEFAULT == null ? ignoreLoadErrorUnknownProperty != null
					: !IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY_EDEFAULT
							.equals(ignoreLoadErrorUnknownProperty);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (useInterpreterInternalResources: ");
		result.append(useInterpreterInternalResources);
		result.append(", ignoreLoadErrorUnknownMetaclass: ");
		result.append(ignoreLoadErrorUnknownMetaclass);
		result.append(", ignoreAllLoadErrors: ");
		result.append(ignoreAllLoadErrors);
		result.append(", ignoreLoadErrorUnknownProperty: ");
		result.append(ignoreLoadErrorUnknownProperty);
		result.append(')');
		return result.toString();
	}

} //EMFRepositoryImpl
