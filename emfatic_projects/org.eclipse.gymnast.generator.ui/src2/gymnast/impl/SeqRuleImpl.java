/**
 * <copyright>
 * </copyright>
 *
 * $Id: SeqRuleImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.Expr;
import gymnast.SeqRule;
import gymnast.SeqRuleDecl;
import gymnast.gymnastPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.SeqRuleImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.impl.SeqRuleImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeqRuleImpl extends EObjectImpl implements SeqRule {
	/**
	 * The cached value of the '{@link #getDecl() <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecl()
	 * @generated
	 * @ordered
	 */
	protected SeqRuleDecl decl = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Expr> body = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.SEQ_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqRuleDecl getDecl() {
		if (decl != null && decl.eIsProxy()) {
			InternalEObject oldDecl = (InternalEObject)decl;
			decl = (SeqRuleDecl)eResolveProxy(oldDecl);
			if (decl != oldDecl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.SEQ_RULE__DECL, oldDecl, decl));
			}
		}
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqRuleDecl basicGetDecl() {
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecl(SeqRuleDecl newDecl) {
		SeqRuleDecl oldDecl = decl;
		decl = newDecl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.SEQ_RULE__DECL, oldDecl, decl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expr> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Expr>(Expr.class, this, gymnastPackage.SEQ_RULE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.SEQ_RULE__DECL:
				if (resolve) return getDecl();
				return basicGetDecl();
			case gymnastPackage.SEQ_RULE__BODY:
				return getBody();
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
			case gymnastPackage.SEQ_RULE__DECL:
				setDecl((SeqRuleDecl)newValue);
				return;
			case gymnastPackage.SEQ_RULE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Expr>)newValue);
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
			case gymnastPackage.SEQ_RULE__DECL:
				setDecl((SeqRuleDecl)null);
				return;
			case gymnastPackage.SEQ_RULE__BODY:
				getBody().clear();
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
			case gymnastPackage.SEQ_RULE__DECL:
				return decl != null;
			case gymnastPackage.SEQ_RULE__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SeqRuleImpl
