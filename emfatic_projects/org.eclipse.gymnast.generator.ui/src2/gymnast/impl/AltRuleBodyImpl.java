/**
 * <copyright>
 * </copyright>
 *
 * $Id: AltRuleBodyImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.AltRuleBody;
import gymnast.AltSeq;
import gymnast.SimpleExpr;
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
 * An implementation of the model object '<em><b>Alt Rule Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.AltRuleBodyImpl#getPreSeq <em>Pre Seq</em>}</li>
 *   <li>{@link gymnast.impl.AltRuleBodyImpl#getAlts <em>Alts</em>}</li>
 *   <li>{@link gymnast.impl.AltRuleBodyImpl#getPostSeq <em>Post Seq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltRuleBodyImpl extends EObjectImpl implements AltRuleBody {
	/**
	 * The cached value of the '{@link #getPreSeq() <em>Pre Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSeq()
	 * @generated
	 * @ordered
	 */
	protected AltSeq preSeq = null;

	/**
	 * The cached value of the '{@link #getAlts() <em>Alts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlts()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleExpr> alts = null;

	/**
	 * The cached value of the '{@link #getPostSeq() <em>Post Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostSeq()
	 * @generated
	 * @ordered
	 */
	protected AltSeq postSeq = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltRuleBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.ALT_RULE_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSeq getPreSeq() {
		if (preSeq != null && preSeq.eIsProxy()) {
			InternalEObject oldPreSeq = (InternalEObject)preSeq;
			preSeq = (AltSeq)eResolveProxy(oldPreSeq);
			if (preSeq != oldPreSeq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.ALT_RULE_BODY__PRE_SEQ, oldPreSeq, preSeq));
			}
		}
		return preSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSeq basicGetPreSeq() {
		return preSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreSeq(AltSeq newPreSeq) {
		AltSeq oldPreSeq = preSeq;
		preSeq = newPreSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE_BODY__PRE_SEQ, oldPreSeq, preSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleExpr> getAlts() {
		if (alts == null) {
			alts = new EObjectResolvingEList<SimpleExpr>(SimpleExpr.class, this, gymnastPackage.ALT_RULE_BODY__ALTS);
		}
		return alts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSeq getPostSeq() {
		if (postSeq != null && postSeq.eIsProxy()) {
			InternalEObject oldPostSeq = (InternalEObject)postSeq;
			postSeq = (AltSeq)eResolveProxy(oldPostSeq);
			if (postSeq != oldPostSeq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.ALT_RULE_BODY__POST_SEQ, oldPostSeq, postSeq));
			}
		}
		return postSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSeq basicGetPostSeq() {
		return postSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostSeq(AltSeq newPostSeq) {
		AltSeq oldPostSeq = postSeq;
		postSeq = newPostSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.ALT_RULE_BODY__POST_SEQ, oldPostSeq, postSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.ALT_RULE_BODY__PRE_SEQ:
				if (resolve) return getPreSeq();
				return basicGetPreSeq();
			case gymnastPackage.ALT_RULE_BODY__ALTS:
				return getAlts();
			case gymnastPackage.ALT_RULE_BODY__POST_SEQ:
				if (resolve) return getPostSeq();
				return basicGetPostSeq();
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
			case gymnastPackage.ALT_RULE_BODY__PRE_SEQ:
				setPreSeq((AltSeq)newValue);
				return;
			case gymnastPackage.ALT_RULE_BODY__ALTS:
				getAlts().clear();
				getAlts().addAll((Collection<? extends SimpleExpr>)newValue);
				return;
			case gymnastPackage.ALT_RULE_BODY__POST_SEQ:
				setPostSeq((AltSeq)newValue);
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
			case gymnastPackage.ALT_RULE_BODY__PRE_SEQ:
				setPreSeq((AltSeq)null);
				return;
			case gymnastPackage.ALT_RULE_BODY__ALTS:
				getAlts().clear();
				return;
			case gymnastPackage.ALT_RULE_BODY__POST_SEQ:
				setPostSeq((AltSeq)null);
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
			case gymnastPackage.ALT_RULE_BODY__PRE_SEQ:
				return preSeq != null;
			case gymnastPackage.ALT_RULE_BODY__ALTS:
				return alts != null && !alts.isEmpty();
			case gymnastPackage.ALT_RULE_BODY__POST_SEQ:
				return postSeq != null;
		}
		return super.eIsSet(featureID);
	}

} //AltRuleBodyImpl
