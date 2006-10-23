/**
 * <copyright>
 * </copyright>
 *
 * $Id: RescueImpl.java,v 1.3 2006-10-23 15:40:50 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;

import fr.irisa.triskell.kermeta.language.structure.impl.ObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.RescueImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.RescueImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.impl.RescueImpl#getExceptionName <em>Exception Name</em>}</li>
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
	protected EList body = null;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference exceptionType = null;

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
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.RESCUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBody() {
		if (body == null) {
			body = new EObjectContainmentEList.Resolving(Expression.class, this, BehaviorPackage.RESCUE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getExceptionType() {
		if (exceptionType != null && exceptionType.eIsProxy()) {
			InternalEObject oldExceptionType = (InternalEObject)exceptionType;
			exceptionType = (TypeReference)eResolveProxy(oldExceptionType);
			if (exceptionType != oldExceptionType) {
				InternalEObject newExceptionType = (InternalEObject)exceptionType;
				NotificationChain msgs = oldExceptionType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.RESCUE__EXCEPTION_TYPE, null, null);
				if (newExceptionType.eInternalContainer() == null) {
					msgs = newExceptionType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.RESCUE__EXCEPTION_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.RESCUE__EXCEPTION_TYPE, oldExceptionType, exceptionType));
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
	public NotificationChain basicSetExceptionType(TypeReference newExceptionType, NotificationChain msgs) {
		TypeReference oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.RESCUE__EXCEPTION_TYPE, oldExceptionType, newExceptionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)exceptionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.RESCUE__EXCEPTION_TYPE, null, msgs);
			if (newExceptionType != null)
				msgs = ((InternalEObject)newExceptionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.RESCUE__EXCEPTION_TYPE, null, msgs);
			msgs = basicSetExceptionType(newExceptionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.RESCUE__EXCEPTION_TYPE, newExceptionType, newExceptionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.RESCUE__EXCEPTION_NAME, oldExceptionName, exceptionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.RESCUE__BODY:
				return ((InternalEList)getBody()).basicRemove(otherEnd, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.RESCUE__BODY:
				return getBody();
			case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
				if (resolve) return getExceptionType();
				return basicGetExceptionType();
			case BehaviorPackage.RESCUE__EXCEPTION_NAME:
				return getExceptionName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.RESCUE__BODY:
				getBody().clear();
				getBody().addAll((Collection)newValue);
				return;
			case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
				setExceptionType((TypeReference)newValue);
				return;
			case BehaviorPackage.RESCUE__EXCEPTION_NAME:
				setExceptionName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.RESCUE__BODY:
				getBody().clear();
				return;
			case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
				setExceptionType((TypeReference)null);
				return;
			case BehaviorPackage.RESCUE__EXCEPTION_NAME:
				setExceptionName(EXCEPTION_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.RESCUE__BODY:
				return body != null && !body.isEmpty();
			case BehaviorPackage.RESCUE__EXCEPTION_TYPE:
				return exceptionType != null;
			case BehaviorPackage.RESCUE__EXCEPTION_NAME:
				return EXCEPTION_NAME_EDEFAULT == null ? exceptionName != null : !EXCEPTION_NAME_EDEFAULT.equals(exceptionName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exceptionName: ");
		result.append(exceptionName);
		result.append(')');
		return result.toString();
	}

} //RescueImpl
