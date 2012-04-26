/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org3.kermeta.alf.AcceptClause;
import org3.kermeta.alf.AcceptStatement;
import org3.kermeta.alf.AlfPackage;
import org3.kermeta.alf.CompoundAcceptStatementCompletion;
import org3.kermeta.alf.SimpleAcceptStatementCompletion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org3.kermeta.alf.impl.AcceptStatementImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link org3.kermeta.alf.impl.AcceptStatementImpl#getSimpleAccept <em>Simple Accept</em>}</li>
 *   <li>{@link org3.kermeta.alf.impl.AcceptStatementImpl#getCompoundAccept <em>Compound Accept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptStatementImpl extends StatementImpl implements AcceptStatement {
	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected AcceptClause clause;

	/**
	 * The cached value of the '{@link #getSimpleAccept() <em>Simple Accept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleAccept()
	 * @generated
	 * @ordered
	 */
	protected SimpleAcceptStatementCompletion simpleAccept;

	/**
	 * The cached value of the '{@link #getCompoundAccept() <em>Compound Accept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundAccept()
	 * @generated
	 * @ordered
	 */
	protected CompoundAcceptStatementCompletion compoundAccept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlfPackage.Literals.ACCEPT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptClause getClause() {
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClause(AcceptClause newClause, NotificationChain msgs) {
		AcceptClause oldClause = clause;
		clause = newClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.ACCEPT_STATEMENT__CLAUSE, oldClause, newClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClause(AcceptClause newClause) {
		if (newClause != clause) {
			NotificationChain msgs = null;
			if (clause != null)
				msgs = ((InternalEObject)clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCEPT_STATEMENT__CLAUSE, null, msgs);
			if (newClause != null)
				msgs = ((InternalEObject)newClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCEPT_STATEMENT__CLAUSE, null, msgs);
			msgs = basicSetClause(newClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.ACCEPT_STATEMENT__CLAUSE, newClause, newClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAcceptStatementCompletion getSimpleAccept() {
		return simpleAccept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleAccept(SimpleAcceptStatementCompletion newSimpleAccept, NotificationChain msgs) {
		SimpleAcceptStatementCompletion oldSimpleAccept = simpleAccept;
		simpleAccept = newSimpleAccept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT, oldSimpleAccept, newSimpleAccept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleAccept(SimpleAcceptStatementCompletion newSimpleAccept) {
		if (newSimpleAccept != simpleAccept) {
			NotificationChain msgs = null;
			if (simpleAccept != null)
				msgs = ((InternalEObject)simpleAccept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT, null, msgs);
			if (newSimpleAccept != null)
				msgs = ((InternalEObject)newSimpleAccept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT, null, msgs);
			msgs = basicSetSimpleAccept(newSimpleAccept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT, newSimpleAccept, newSimpleAccept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundAcceptStatementCompletion getCompoundAccept() {
		return compoundAccept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundAccept(CompoundAcceptStatementCompletion newCompoundAccept, NotificationChain msgs) {
		CompoundAcceptStatementCompletion oldCompoundAccept = compoundAccept;
		compoundAccept = newCompoundAccept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT, oldCompoundAccept, newCompoundAccept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundAccept(CompoundAcceptStatementCompletion newCompoundAccept) {
		if (newCompoundAccept != compoundAccept) {
			NotificationChain msgs = null;
			if (compoundAccept != null)
				msgs = ((InternalEObject)compoundAccept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT, null, msgs);
			if (newCompoundAccept != null)
				msgs = ((InternalEObject)newCompoundAccept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT, null, msgs);
			msgs = basicSetCompoundAccept(newCompoundAccept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT, newCompoundAccept, newCompoundAccept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfPackage.ACCEPT_STATEMENT__CLAUSE:
				return basicSetClause(null, msgs);
			case AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT:
				return basicSetSimpleAccept(null, msgs);
			case AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT:
				return basicSetCompoundAccept(null, msgs);
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
			case AlfPackage.ACCEPT_STATEMENT__CLAUSE:
				return getClause();
			case AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT:
				return getSimpleAccept();
			case AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT:
				return getCompoundAccept();
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
			case AlfPackage.ACCEPT_STATEMENT__CLAUSE:
				setClause((AcceptClause)newValue);
				return;
			case AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT:
				setSimpleAccept((SimpleAcceptStatementCompletion)newValue);
				return;
			case AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT:
				setCompoundAccept((CompoundAcceptStatementCompletion)newValue);
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
			case AlfPackage.ACCEPT_STATEMENT__CLAUSE:
				setClause((AcceptClause)null);
				return;
			case AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT:
				setSimpleAccept((SimpleAcceptStatementCompletion)null);
				return;
			case AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT:
				setCompoundAccept((CompoundAcceptStatementCompletion)null);
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
			case AlfPackage.ACCEPT_STATEMENT__CLAUSE:
				return clause != null;
			case AlfPackage.ACCEPT_STATEMENT__SIMPLE_ACCEPT:
				return simpleAccept != null;
			case AlfPackage.ACCEPT_STATEMENT__COMPOUND_ACCEPT:
				return compoundAccept != null;
		}
		return super.eIsSet(featureID);
	}

} //AcceptStatementImpl
