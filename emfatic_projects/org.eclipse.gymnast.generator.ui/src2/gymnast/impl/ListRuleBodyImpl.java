/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListRuleBodyImpl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast.impl;

import gymnast.ListRuleBody;
import gymnast.SimpleExpr;
import gymnast.gymnastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Rule Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gymnast.impl.ListRuleBodyImpl#getListExpr <em>List Expr</em>}</li>
 *   <li>{@link gymnast.impl.ListRuleBodyImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link gymnast.impl.ListRuleBodyImpl#getListExpr2 <em>List Expr2</em>}</li>
 *   <li>{@link gymnast.impl.ListRuleBodyImpl#getListMark <em>List Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListRuleBodyImpl extends EObjectImpl implements ListRuleBody {
	/**
	 * The cached value of the '{@link #getListExpr() <em>List Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListExpr()
	 * @generated
	 * @ordered
	 */
	protected SimpleExpr listExpr = null;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected SimpleExpr separator = null;

	/**
	 * The cached value of the '{@link #getListExpr2() <em>List Expr2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListExpr2()
	 * @generated
	 * @ordered
	 */
	protected SimpleExpr listExpr2 = null;

	/**
	 * The default value of the '{@link #getListMark() <em>List Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMark()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListMark() <em>List Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMark()
	 * @generated
	 * @ordered
	 */
	protected String listMark = LIST_MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListRuleBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gymnastPackage.Literals.LIST_RULE_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr getListExpr() {
		if (listExpr != null && listExpr.eIsProxy()) {
			InternalEObject oldListExpr = (InternalEObject)listExpr;
			listExpr = (SimpleExpr)eResolveProxy(oldListExpr);
			if (listExpr != oldListExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.LIST_RULE_BODY__LIST_EXPR, oldListExpr, listExpr));
			}
		}
		return listExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr basicGetListExpr() {
		return listExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListExpr(SimpleExpr newListExpr) {
		SimpleExpr oldListExpr = listExpr;
		listExpr = newListExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.LIST_RULE_BODY__LIST_EXPR, oldListExpr, listExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr getSeparator() {
		if (separator != null && separator.eIsProxy()) {
			InternalEObject oldSeparator = (InternalEObject)separator;
			separator = (SimpleExpr)eResolveProxy(oldSeparator);
			if (separator != oldSeparator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.LIST_RULE_BODY__SEPARATOR, oldSeparator, separator));
			}
		}
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr basicGetSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(SimpleExpr newSeparator) {
		SimpleExpr oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.LIST_RULE_BODY__SEPARATOR, oldSeparator, separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr getListExpr2() {
		if (listExpr2 != null && listExpr2.eIsProxy()) {
			InternalEObject oldListExpr2 = (InternalEObject)listExpr2;
			listExpr2 = (SimpleExpr)eResolveProxy(oldListExpr2);
			if (listExpr2 != oldListExpr2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, gymnastPackage.LIST_RULE_BODY__LIST_EXPR2, oldListExpr2, listExpr2));
			}
		}
		return listExpr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleExpr basicGetListExpr2() {
		return listExpr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListExpr2(SimpleExpr newListExpr2) {
		SimpleExpr oldListExpr2 = listExpr2;
		listExpr2 = newListExpr2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.LIST_RULE_BODY__LIST_EXPR2, oldListExpr2, listExpr2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListMark() {
		return listMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListMark(String newListMark) {
		String oldListMark = listMark;
		listMark = newListMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gymnastPackage.LIST_RULE_BODY__LIST_MARK, oldListMark, listMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR:
				if (resolve) return getListExpr();
				return basicGetListExpr();
			case gymnastPackage.LIST_RULE_BODY__SEPARATOR:
				if (resolve) return getSeparator();
				return basicGetSeparator();
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR2:
				if (resolve) return getListExpr2();
				return basicGetListExpr2();
			case gymnastPackage.LIST_RULE_BODY__LIST_MARK:
				return getListMark();
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
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR:
				setListExpr((SimpleExpr)newValue);
				return;
			case gymnastPackage.LIST_RULE_BODY__SEPARATOR:
				setSeparator((SimpleExpr)newValue);
				return;
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR2:
				setListExpr2((SimpleExpr)newValue);
				return;
			case gymnastPackage.LIST_RULE_BODY__LIST_MARK:
				setListMark((String)newValue);
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
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR:
				setListExpr((SimpleExpr)null);
				return;
			case gymnastPackage.LIST_RULE_BODY__SEPARATOR:
				setSeparator((SimpleExpr)null);
				return;
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR2:
				setListExpr2((SimpleExpr)null);
				return;
			case gymnastPackage.LIST_RULE_BODY__LIST_MARK:
				setListMark(LIST_MARK_EDEFAULT);
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
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR:
				return listExpr != null;
			case gymnastPackage.LIST_RULE_BODY__SEPARATOR:
				return separator != null;
			case gymnastPackage.LIST_RULE_BODY__LIST_EXPR2:
				return listExpr2 != null;
			case gymnastPackage.LIST_RULE_BODY__LIST_MARK:
				return LIST_MARK_EDEFAULT == null ? listMark != null : !LIST_MARK_EDEFAULT.equals(listMark);
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
		result.append(" (listMark: ");
		result.append(listMark);
		result.append(')');
		return result.toString();
	}

} //ListRuleBodyImpl
