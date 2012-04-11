/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.NonEmptyStatementSequence;
import alfDsl.SwitchCase;
import alfDsl.SwitchClause;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.SwitchClauseImpl#getSwitchCase <em>Switch Case</em>}</li>
 *   <li>{@link alfDsl.impl.SwitchClauseImpl#getStatementSequence <em>Statement Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchClauseImpl extends EObjectImpl implements SwitchClause {
	/**
	 * The cached value of the '{@link #getSwitchCase() <em>Switch Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchCase()
	 * @generated
	 * @ordered
	 */
	protected EList switchCase;

	/**
	 * The cached value of the '{@link #getStatementSequence() <em>Statement Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSequence()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyStatementSequence statementSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.SWITCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSwitchCase() {
		if (switchCase == null) {
			switchCase = new EObjectContainmentEList(SwitchCase.class, this, AlfDslPackage.SWITCH_CLAUSE__SWITCH_CASE);
		}
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyStatementSequence getStatementSequence() {
		return statementSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatementSequence(NonEmptyStatementSequence newStatementSequence, NotificationChain msgs) {
		NonEmptyStatementSequence oldStatementSequence = statementSequence;
		statementSequence = newStatementSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE, oldStatementSequence, newStatementSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementSequence(NonEmptyStatementSequence newStatementSequence) {
		if (newStatementSequence != statementSequence) {
			NotificationChain msgs = null;
			if (statementSequence != null)
				msgs = ((InternalEObject)statementSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE, null, msgs);
			if (newStatementSequence != null)
				msgs = ((InternalEObject)newStatementSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE, null, msgs);
			msgs = basicSetStatementSequence(newStatementSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE, newStatementSequence, newStatementSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.SWITCH_CLAUSE__SWITCH_CASE:
				return ((InternalEList)getSwitchCase()).basicRemove(otherEnd, msgs);
			case AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE:
				return basicSetStatementSequence(null, msgs);
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
			case AlfDslPackage.SWITCH_CLAUSE__SWITCH_CASE:
				return getSwitchCase();
			case AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE:
				return getStatementSequence();
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
			case AlfDslPackage.SWITCH_CLAUSE__SWITCH_CASE:
				getSwitchCase().clear();
				getSwitchCase().addAll((Collection)newValue);
				return;
			case AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE:
				setStatementSequence((NonEmptyStatementSequence)newValue);
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
			case AlfDslPackage.SWITCH_CLAUSE__SWITCH_CASE:
				getSwitchCase().clear();
				return;
			case AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE:
				setStatementSequence((NonEmptyStatementSequence)null);
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
			case AlfDslPackage.SWITCH_CLAUSE__SWITCH_CASE:
				return switchCase != null && !switchCase.isEmpty();
			case AlfDslPackage.SWITCH_CLAUSE__STATEMENT_SEQUENCE:
				return statementSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchClauseImpl
