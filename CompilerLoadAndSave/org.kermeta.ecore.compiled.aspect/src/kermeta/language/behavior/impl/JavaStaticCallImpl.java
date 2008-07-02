/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaStaticCallImpl.java,v 1.1 2008-07-02 09:43:46 ftanguy Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.JavaStaticCall;

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
 * An implementation of the model object '<em><b>Java Static Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.JavaStaticCallImpl#getJmethod <em>Jmethod</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.JavaStaticCallImpl#getJclass <em>Jclass</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.JavaStaticCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaStaticCallImpl extends ExpressionImpl implements JavaStaticCall {
	/**
	 * The default value of the '{@link #getJmethod() <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected static final String JMETHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJmethod() <em>Jmethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected String jmethod = JMETHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getJclass() <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected static final String JCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJclass() <em>Jclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected String jclass = JCLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaStaticCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.JAVA_STATIC_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJmethod() {
		return jmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmethod(String newJmethod) {
		String oldJmethod = jmethod;
		jmethod = newJmethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.JAVA_STATIC_CALL__JMETHOD, oldJmethod, jmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJclass() {
		return jclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJclass(String newJclass) {
		String oldJclass = jclass;
		jclass = newJclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.JAVA_STATIC_CALL__JCLASS, oldJclass, jclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Expression>(Expression.class, this, BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				return getJmethod();
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				return getJclass();
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				return getParameters();
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
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				setJmethod((String)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				setJclass((String)newValue);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Expression>)newValue);
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
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				setJmethod(JMETHOD_EDEFAULT);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				setJclass(JCLASS_EDEFAULT);
				return;
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				getParameters().clear();
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
			case BehaviorPackage.JAVA_STATIC_CALL__JMETHOD:
				return JMETHOD_EDEFAULT == null ? jmethod != null : !JMETHOD_EDEFAULT.equals(jmethod);
			case BehaviorPackage.JAVA_STATIC_CALL__JCLASS:
				return JCLASS_EDEFAULT == null ? jclass != null : !JCLASS_EDEFAULT.equals(jclass);
			case BehaviorPackage.JAVA_STATIC_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (jmethod: ");
		result.append(jmethod);
		result.append(", jclass: ");
		result.append(jclass);
		result.append(')');
		return result.toString();
	}

} //JavaStaticCallImpl
