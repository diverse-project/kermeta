/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExceptionImpl.java,v 1.3 2008-09-22 14:45:46 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.exceptions.impl.ExceptionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link kermeta.exceptions.impl.ExceptionImpl#getNestedException <em>Nested Exception</em>}</li>
 *   <li>{@link kermeta.exceptions.impl.ExceptionImpl#getStackTrace <em>Stack Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionImpl extends ObjectImpl implements
		kermeta.exceptions.Exception {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedException() <em>Nested Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedException()
	 * @generated
	 * @ordered
	 */
	protected kermeta.exceptions.Exception nestedException;

	/**
	 * The default value of the '{@link #getStackTrace() <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackTrace() <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTrace()
	 * @generated
	 * @ordered
	 */
	protected String stackTrace = STACK_TRACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExceptionsPackage.EXCEPTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.exceptions.Exception getNestedException() {
		if (nestedException != null && nestedException.eIsProxy()) {
			InternalEObject oldNestedException = (InternalEObject) nestedException;
			nestedException = (kermeta.exceptions.Exception) eResolveProxy(oldNestedException);
			if (nestedException != oldNestedException) {
				InternalEObject newNestedException = (InternalEObject) nestedException;
				NotificationChain msgs = oldNestedException
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
								null, null);
				if (newNestedException.eInternalContainer() == null) {
					msgs = newNestedException
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
							oldNestedException, nestedException));
			}
		}
		return nestedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.exceptions.Exception basicGetNestedException() {
		return nestedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedException(
			kermeta.exceptions.Exception newNestedException,
			NotificationChain msgs) {
		kermeta.exceptions.Exception oldNestedException = nestedException;
		nestedException = newNestedException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
					oldNestedException, newNestedException);
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
	public void setNestedException(
			kermeta.exceptions.Exception newNestedException) {
		if (newNestedException != nestedException) {
			NotificationChain msgs = null;
			if (nestedException != null)
				msgs = ((InternalEObject) nestedException)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
								null, msgs);
			if (newNestedException != null)
				msgs = ((InternalEObject) newNestedException)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
								null, msgs);
			msgs = basicSetNestedException(newNestedException, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION,
					newNestedException, newNestedException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackTrace(String newStackTrace) {
		String oldStackTrace = stackTrace;
		stackTrace = newStackTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExceptionsPackage.EXCEPTION__STACK_TRACE, oldStackTrace,
					stackTrace));
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
		case ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION:
			return basicSetNestedException(null, msgs);
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
		case ExceptionsPackage.EXCEPTION__MESSAGE:
			return getMessage();
		case ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION:
			if (resolve)
				return getNestedException();
			return basicGetNestedException();
		case ExceptionsPackage.EXCEPTION__STACK_TRACE:
			return getStackTrace();
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
		case ExceptionsPackage.EXCEPTION__MESSAGE:
			setMessage((String) newValue);
			return;
		case ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION:
			setNestedException((kermeta.exceptions.Exception) newValue);
			return;
		case ExceptionsPackage.EXCEPTION__STACK_TRACE:
			setStackTrace((String) newValue);
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
		case ExceptionsPackage.EXCEPTION__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION:
			setNestedException((kermeta.exceptions.Exception) null);
			return;
		case ExceptionsPackage.EXCEPTION__STACK_TRACE:
			setStackTrace(STACK_TRACE_EDEFAULT);
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
		case ExceptionsPackage.EXCEPTION__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null
					: !MESSAGE_EDEFAULT.equals(message);
		case ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION:
			return nestedException != null;
		case ExceptionsPackage.EXCEPTION__STACK_TRACE:
			return STACK_TRACE_EDEFAULT == null ? stackTrace != null
					: !STACK_TRACE_EDEFAULT.equals(stackTrace);
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
		result.append(" (message: ");
		result.append(message);
		result.append(", stackTrace: ");
		result.append(stackTrace);
		result.append(')');
		return result.toString();
	}

} //ExceptionImpl
