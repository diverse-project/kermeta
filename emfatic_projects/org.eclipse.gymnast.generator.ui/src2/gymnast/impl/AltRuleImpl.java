/**
 * <copyright>
 * </copyright>
 *
 * $Id: AltRuleImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.AltRule;
import gymnast.AltRuleBody;
import gymnast.AltRuleDecl;
import gymnast.gymnastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.AltRuleImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.impl.AltRuleImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltRuleImpl extends EObjectImpl implements AltRule {
	/**
	 * The cached value of the '{@link #getDecl() <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecl()
	 * @generated
	 * @ordered
	 */
	protected AltRuleDecl decl = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected AltRuleBody body = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.ALT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleDecl getDecl() {
		if (decl != null && decl.eIsProxy()) {
			InternalEObject oldDecl = (InternalEObject)decl;
			decl = (AltRuleDecl)eResolveProxy(oldDecl);
			if (decl != oldDecl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.ALT_RULE__DECL, oldDecl, decl));
			}
		}
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleDecl basicGetDecl() {
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecl(AltRuleDecl newDecl) {
		AltRuleDecl oldDecl = decl;
		decl = newDecl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE__DECL, oldDecl, decl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleBody getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (AltRuleBody)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.ALT_RULE__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltRuleBody basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(AltRuleBody newBody) {
		AltRuleBody oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.ALT_RULE__DECL:
				if (resolve) return getDecl();
				return basicGetDecl();
			case gymnastPackage.ALT_RULE__BODY:
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
			case gymnastPackage.ALT_RULE__DECL:
				setDecl((AltRuleDecl)newValue);
				return;
			case gymnastPackage.ALT_RULE__BODY:
				setBody((AltRuleBody)newValue);
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
			case gymnastPackage.ALT_RULE__DECL:
				setDecl((AltRuleDecl)null);
				return;
			case gymnastPackage.ALT_RULE__BODY:
				setBody((AltRuleBody)null);
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
			case gymnastPackage.ALT_RULE__DECL:
				return decl != null;
			case gymnastPackage.ALT_RULE__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //AltRuleImpl
