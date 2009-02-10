/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: LambdaExpressionImpl.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.LambdaExpression;
import kermeta.language.behavior.LambdaParameter;

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
 * An implementation of the model object '<em><b>Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.LambdaExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.LambdaExpressionImpl#getCuid <em>Cuid</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.LambdaExpressionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LambdaExpressionImpl extends ExpressionImpl implements
		LambdaExpression {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * The default value of the '{@link #getCuid() <em>Cuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuid()
	 * @generated
	 * @ordered
	 */
	protected static final String CUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuid() <em>Cuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuid()
	 * @generated
	 * @ordered
	 */
	protected String cuid = CUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<LambdaParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.LAMBDA_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject) body;
			body = (Expression) eResolveProxy(oldBody);
			if (body != oldBody) {
				InternalEObject newBody = (InternalEObject) body;
				NotificationChain msgs = oldBody.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.LAMBDA_EXPRESSION__BODY,
						null, null);
				if (newBody.eInternalContainer() == null) {
					msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- BehaviorPackage.LAMBDA_EXPRESSION__BODY, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.LAMBDA_EXPRESSION__BODY, oldBody,
							body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody,
			NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, BehaviorPackage.LAMBDA_EXPRESSION__BODY,
					oldBody, newBody);
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
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.LAMBDA_EXPRESSION__BODY,
						null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- BehaviorPackage.LAMBDA_EXPRESSION__BODY,
						null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.LAMBDA_EXPRESSION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCuid() {
		return cuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuid(String newCuid) {
		String oldCuid = cuid;
		cuid = newCuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.LAMBDA_EXPRESSION__CUID, oldCuid, cuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LambdaParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<LambdaParameter>(
					LambdaParameter.class, this,
					BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS);
		}
		return parameters;
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
		case BehaviorPackage.LAMBDA_EXPRESSION__BODY:
			return basicSetBody(null, msgs);
		case BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
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
		case BehaviorPackage.LAMBDA_EXPRESSION__BODY:
			if (resolve)
				return getBody();
			return basicGetBody();
		case BehaviorPackage.LAMBDA_EXPRESSION__CUID:
			return getCuid();
		case BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS:
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
		case BehaviorPackage.LAMBDA_EXPRESSION__BODY:
			setBody((Expression) newValue);
			return;
		case BehaviorPackage.LAMBDA_EXPRESSION__CUID:
			setCuid((String) newValue);
			return;
		case BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll(
					(Collection<? extends LambdaParameter>) newValue);
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
		case BehaviorPackage.LAMBDA_EXPRESSION__BODY:
			setBody((Expression) null);
			return;
		case BehaviorPackage.LAMBDA_EXPRESSION__CUID:
			setCuid(CUID_EDEFAULT);
			return;
		case BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS:
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
		case BehaviorPackage.LAMBDA_EXPRESSION__BODY:
			return body != null;
		case BehaviorPackage.LAMBDA_EXPRESSION__CUID:
			return CUID_EDEFAULT == null ? cuid != null : !CUID_EDEFAULT
					.equals(cuid);
		case BehaviorPackage.LAMBDA_EXPRESSION__PARAMETERS:
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cuid: ");
		result.append(cuid);
		result.append(')');
		return result.toString();
	}

} //LambdaExpressionImpl
