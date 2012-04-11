/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.LinkOperationExpression;
import alfDsl.LinkOperationKind;
import alfDsl.LinkOperationTuple;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Operation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.LinkOperationExpressionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link alfDsl.impl.LinkOperationExpressionImpl#getTuple <em>Tuple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkOperationExpressionImpl extends SuffixExpressionImpl implements LinkOperationExpression {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final LinkOperationKind KIND_EDEFAULT = LinkOperationKind.CREATE_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LinkOperationKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTuple() <em>Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuple()
	 * @generated
	 * @ordered
	 */
	protected LinkOperationTuple tuple;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkOperationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.LINK_OPERATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkOperationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(LinkOperationKind newKind) {
		LinkOperationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_EXPRESSION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkOperationTuple getTuple() {
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTuple(LinkOperationTuple newTuple, NotificationChain msgs) {
		LinkOperationTuple oldTuple = tuple;
		tuple = newTuple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE, oldTuple, newTuple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuple(LinkOperationTuple newTuple) {
		if (newTuple != tuple) {
			NotificationChain msgs = null;
			if (tuple != null)
				msgs = ((InternalEObject)tuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE, null, msgs);
			if (newTuple != null)
				msgs = ((InternalEObject)newTuple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE, null, msgs);
			msgs = basicSetTuple(newTuple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE, newTuple, newTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE:
				return basicSetTuple(null, msgs);
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
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__KIND:
				return getKind();
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE:
				return getTuple();
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
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__KIND:
				setKind((LinkOperationKind)newValue);
				return;
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE:
				setTuple((LinkOperationTuple)newValue);
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
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE:
				setTuple((LinkOperationTuple)null);
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
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__KIND:
				return kind != KIND_EDEFAULT;
			case AlfDslPackage.LINK_OPERATION_EXPRESSION__TUPLE:
				return tuple != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //LinkOperationExpressionImpl
