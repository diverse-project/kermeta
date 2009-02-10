/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: RescueImpl.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.Rescue;
import kermeta.language.behavior.TypeReference;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rescue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.RescueImpl#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.RescueImpl#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.RescueImpl#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RescueImpl extends ObjectImpl implements Rescue {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> body;

	/**
	 * The default value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionName()
	 * @generated
	 * @ordered
	 */
	protected String exceptionName = EXCEPTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference exceptionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RescueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.RESCUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList.Resolving<Expression>(
					Expression.class, this, BehaviorPackage.RESCUE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionName() {
		return exceptionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionName(String newExceptionName) {
		String oldExceptionName = exceptionName;
		exceptionName = newExceptionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.RESCUE__EXCEPTION_NAME, oldExceptionName,
					exceptionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getExceptionType() {
		if (exceptionType != null && exceptionType.eIsProxy()) {
			InternalEObject oldExceptionType = (InternalEObject) exceptionType;
			exceptionType = (TypeReference) eResolveProxy(oldExceptionType);
			if (exceptionType != oldExceptionType) {
				InternalEObject newExceptionType = (InternalEObject) exceptionType;
				NotificationChain msgs = oldExceptionType.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.RESCUE__EXCEPTION_TYPE, null,
						null);
				if (newExceptionType.eInternalContainer() == null) {
					msgs = newExceptionType.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- BehaviorPackage.RESCUE__EXCEPTION_TYPE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.RESCUE__EXCEPTION_TYPE,
							oldExceptionType, exceptionType));
			}
		}
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionType(
			TypeReference newExceptionType, NotificationChain msgs) {
		TypeReference oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.RESCUE__EXCEPTION_TYPE,
					oldExceptionType, newExceptionType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(TypeReference newExceptionType) {
		if (newExceptionType != exceptionType) {
			NotificationChain msgs = null;
			if (exceptionType != null)
				msgs = ((InternalEObject) exceptionType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.RESCUE__EXCEPTION_TYPE, null,
						msgs);
			if (newExceptionType != null)
				msgs = ((InternalEObject) newExceptionType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.RESCUE__EXCEPTION_TYPE, null,
						msgs);
			msgs = basicSetExceptionType(newExceptionType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.RESCUE__EXCEPTION_TYPE, newExceptionType,
					newExceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		result = "";

		java.lang.Boolean idIfCond_318 = false;
		idIfCond_318 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getExceptionType()));

		if (idIfCond_318) {

			java.lang.String str_exceptionType = this.getExceptionType()
					.createBehaviorJava(context);

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															result,
																															"if( "),
																											context
																													.getVARIABLE_EXCEPTION_SWITCHER()),
																							"_"),
																			context
																					.getKRErrorStack()
																					.peek()),
															".getRealException() instanceof "),
											str_exceptionType), " ) {\n");

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(result,
									"caught_"), context.getKRErrorStack()
									.peek()), " = true;\n");

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											kermeta.standard.helper.StringWrapper
																													.plus(
																															kermeta.standard.helper.StringWrapper
																																	.plus(
																																			kermeta.standard.helper.StringWrapper
																																					.plus(
																																							kermeta.standard.helper.StringWrapper
																																									.plus(
																																											result,
																																											str_exceptionType),
																																							" "),
																																			this
																																					.getExceptionName()),
																															" = ("),
																											str_exceptionType),
																							") "),
																			context
																					.getVARIABLE_EXCEPTION_SWITCHER()),
															"_"), context
													.getKRErrorStack().peek()),
							".getRealException();\n");

			//BIft:eachOwnedElement

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft35 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Tag> convertAsOrderedSet(
								this.getOwnedTags()).iterator();
				java.lang.Boolean idLoopCond_319 = false;
				while (!idLoopCond_319) {
					idLoopCond_319 = it_ft35.isOff();
					if (idLoopCond_319) {
					} else {

						//BIle:func
						kermeta.language.structure.Tag o_lbdExp35 = it_ft35
								.next();

						//BIle:func
						kermeta.language.structure.Tag e_lbdExp34 = o_lbdExp35;

						result = kermeta.standard.helper.StringWrapper.plus(
								result, e_lbdExp34.createBehaviorJava(context));
						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft36 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								this.getBody()).iterator();
				java.lang.Boolean idLoopCond_320 = false;
				while (!idLoopCond_320) {
					idLoopCond_320 = it_ft36.isOff();
					if (idLoopCond_320) {
					} else {

						//BIle:func
						kermeta.language.behavior.Expression s_lbdExp36 = it_ft36
								.next();

						//BIle:func
						kermeta.language.behavior.Expression e_lbdExp34 = s_lbdExp36;

						result = kermeta.standard.helper.StringWrapper.plus(
								result, e_lbdExp34.createBehaviorJava(context));
						//EIle:func

						//EIle:func

					}
				}
			}

			//EIft:each

			//EIft:eachOwnedElement

			result = kermeta.standard.helper.StringWrapper.plus(result, "\n}");
		}

		return result;

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
		case BehaviorPackage.RESCUE__BODY:
			return ((InternalEList<?>) getBody()).basicRemove(otherEnd, msgs);
		case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
			return basicSetExceptionType(null, msgs);
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
		case BehaviorPackage.RESCUE__BODY:
			return getBody();
		case BehaviorPackage.RESCUE__EXCEPTION_NAME:
			return getExceptionName();
		case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
			if (resolve)
				return getExceptionType();
			return basicGetExceptionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviorPackage.RESCUE__BODY:
			getBody().clear();
			getBody().addAll((Collection<? extends Expression>) newValue);
			return;
		case BehaviorPackage.RESCUE__EXCEPTION_NAME:
			setExceptionName((String) newValue);
			return;
		case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
			setExceptionType((TypeReference) newValue);
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
		case BehaviorPackage.RESCUE__BODY:
			getBody().clear();
			return;
		case BehaviorPackage.RESCUE__EXCEPTION_NAME:
			setExceptionName(EXCEPTION_NAME_EDEFAULT);
			return;
		case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
			setExceptionType((TypeReference) null);
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
		case BehaviorPackage.RESCUE__BODY:
			return body != null && !body.isEmpty();
		case BehaviorPackage.RESCUE__EXCEPTION_NAME:
			return EXCEPTION_NAME_EDEFAULT == null ? exceptionName != null
					: !EXCEPTION_NAME_EDEFAULT.equals(exceptionName);
		case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
			return exceptionType != null;
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
		result.append(" (exceptionName: ");
		result.append(exceptionName);
		result.append(')');
		return result.toString();
	}

} //RescueImpl
