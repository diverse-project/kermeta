/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFRepositoryImpl.java,v 1.2 2008-08-19 13:23:01 cfaucher Exp $
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
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#getIgnoreLoadErrors <em>Ignore Load Errors</em>}</li>
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
	protected static final Boolean USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT = null;

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
	 * The default value of the '{@link #getIgnoreLoadErrors() <em>Ignore Load Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLoadErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_LOAD_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreLoadErrors() <em>Ignore Load Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreLoadErrors()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreLoadErrors = IGNORE_LOAD_ERRORS_EDEFAULT;

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
	public Boolean getIgnoreLoadErrors() {
		return ignoreLoadErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreLoadErrors(Boolean newIgnoreLoadErrors) {
		Boolean oldIgnoreLoadErrors = ignoreLoadErrors;
		ignoreLoadErrors = newIgnoreLoadErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS,
					oldIgnoreLoadErrors, ignoreLoadErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource(String uri, String mm_uri) {

		kermeta.persistence.Resource result = null;

		//Beginning of the Inlining of the function type: collect

		kermeta.standard.Sequence<java.lang.String> result_ft56 = null;

		result_ft56 = ((kermeta.standard.Sequence<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<java.lang.String>"));

		kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.persistence.Resource> convertAsSet(
						this.getResources()).iterator();
		java.lang.Boolean idLoopCond_287 = false;
		while (!idLoopCond_287) {
			idLoopCond_287 = it_ft56.isOff();
			;
			if (idLoopCond_287) {
			} else {

				java.lang.String result_lambda = null;
				//Beginning of the Inlining of the lambda expression: collector
				kermeta.persistence.Resource r = it_ft56.next();

				result_lambda = r.getUri();
				//End of the Inlining of the lambda expression: collector

				result_ft56.add(result_lambda);
			}
		}
		//End of the Inlining of the function type: collect
		java.lang.Boolean idIfCond_286 = false;
		idIfCond_286 = kermeta.standard.helper.BooleanWrapper.not(result_ft56
				.contains(uri));

		if (idIfCond_286) {

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
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
			return getIgnoreLoadErrors();
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
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
			setIgnoreLoadErrors((Boolean) newValue);
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
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
			setIgnoreLoadErrors(IGNORE_LOAD_ERRORS_EDEFAULT);
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
		case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
			return IGNORE_LOAD_ERRORS_EDEFAULT == null ? ignoreLoadErrors != null
					: !IGNORE_LOAD_ERRORS_EDEFAULT.equals(ignoreLoadErrors);
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
		result.append(", ignoreLoadErrors: ");
		result.append(ignoreLoadErrors);
		result.append(')');
		return result.toString();
	}

} //EMFRepositoryImpl
