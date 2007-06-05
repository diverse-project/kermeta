/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonRuleProductionImpl.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr.impl;

import fr.irisa.triskell.ktr.KtrPackage;
import fr.irisa.triskell.ktr.SingletonRuleProduction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Rule Production</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.ktr.impl.SingletonRuleProductionImpl#getIdExpr <em>Id Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingletonRuleProductionImpl extends RuleProductionImpl implements SingletonRuleProduction {
	/**
	 * The default value of the '{@link #getIdExpr() <em>Id Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdExpr() <em>Id Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExpr()
	 * @generated
	 * @ordered
	 */
	protected String idExpr = ID_EXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonRuleProductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KtrPackage.Literals.SINGLETON_RULE_PRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdExpr() {
		return idExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdExpr(String newIdExpr) {
		String oldIdExpr = idExpr;
		idExpr = newIdExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KtrPackage.SINGLETON_RULE_PRODUCTION__ID_EXPR, oldIdExpr, idExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KtrPackage.SINGLETON_RULE_PRODUCTION__ID_EXPR:
				return getIdExpr();
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
			case KtrPackage.SINGLETON_RULE_PRODUCTION__ID_EXPR:
				setIdExpr((String)newValue);
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
			case KtrPackage.SINGLETON_RULE_PRODUCTION__ID_EXPR:
				setIdExpr(ID_EXPR_EDEFAULT);
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
			case KtrPackage.SINGLETON_RULE_PRODUCTION__ID_EXPR:
				return ID_EXPR_EDEFAULT == null ? idExpr != null : !ID_EXPR_EDEFAULT.equals(idExpr);
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
		result.append(" (idExpr: ");
		result.append(idExpr);
		result.append(')');
		return result.toString();
	}

} //SingletonRuleProductionImpl