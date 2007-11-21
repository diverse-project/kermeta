/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListRuleImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.ListRule;
import gymnast.ListRuleBody;
import gymnast.ListRuleDecl;
import gymnast.gymnastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.ListRuleImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.impl.ListRuleImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListRuleImpl extends EObjectImpl implements ListRule {
	/**
	 * The cached value of the '{@link #getDecl() <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecl()
	 * @generated
	 * @ordered
	 */
	protected ListRuleDecl decl = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected ListRuleBody body = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.LIST_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRuleDecl getDecl() {
		if (decl != null && decl.eIsProxy()) {
			InternalEObject oldDecl = (InternalEObject)decl;
			decl = (ListRuleDecl)eResolveProxy(oldDecl);
			if (decl != oldDecl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.LIST_RULE__DECL, oldDecl, decl));
			}
		}
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRuleDecl basicGetDecl() {
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecl(ListRuleDecl newDecl) {
		ListRuleDecl oldDecl = decl;
		decl = newDecl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.LIST_RULE__DECL, oldDecl, decl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRuleBody getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (ListRuleBody)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.LIST_RULE__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRuleBody basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ListRuleBody newBody) {
		ListRuleBody oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.LIST_RULE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.LIST_RULE__DECL:
				if (resolve) return getDecl();
				return basicGetDecl();
			case gymnastPackage.LIST_RULE__BODY:
				if (resolve) return getBody();
				return basicGetBody();
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
			case gymnastPackage.LIST_RULE__DECL:
				setDecl((ListRuleDecl)newValue);
				return;
			case gymnastPackage.LIST_RULE__BODY:
				setBody((ListRuleBody)newValue);
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
			case gymnastPackage.LIST_RULE__DECL:
				setDecl((ListRuleDecl)null);
				return;
			case gymnastPackage.LIST_RULE__BODY:
				setBody((ListRuleBody)null);
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
			case gymnastPackage.LIST_RULE__DECL:
				return decl != null;
			case gymnastPackage.LIST_RULE__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //ListRuleImpl
