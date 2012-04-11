/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.FinalClause;
import alfDsl.IfStatement;
import alfDsl.SequentialClauses;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.IfStatementImpl#getSequentialClausses <em>Sequential Clausses</em>}</li>
 *   <li>{@link alfDsl.impl.IfStatementImpl#getFinalClause <em>Final Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getSequentialClausses() <em>Sequential Clausses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequentialClausses()
	 * @generated
	 * @ordered
	 */
	protected SequentialClauses sequentialClausses;

	/**
	 * The cached value of the '{@link #getFinalClause() <em>Final Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalClause()
	 * @generated
	 * @ordered
	 */
	protected FinalClause finalClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialClauses getSequentialClausses() {
		return sequentialClausses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequentialClausses(SequentialClauses newSequentialClausses, NotificationChain msgs) {
		SequentialClauses oldSequentialClausses = sequentialClausses;
		sequentialClausses = newSequentialClausses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES, oldSequentialClausses, newSequentialClausses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequentialClausses(SequentialClauses newSequentialClausses) {
		if (newSequentialClausses != sequentialClausses) {
			NotificationChain msgs = null;
			if (sequentialClausses != null)
				msgs = ((InternalEObject)sequentialClausses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES, null, msgs);
			if (newSequentialClausses != null)
				msgs = ((InternalEObject)newSequentialClausses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES, null, msgs);
			msgs = basicSetSequentialClausses(newSequentialClausses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES, newSequentialClausses, newSequentialClausses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalClause getFinalClause() {
		return finalClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalClause(FinalClause newFinalClause, NotificationChain msgs) {
		FinalClause oldFinalClause = finalClause;
		finalClause = newFinalClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE, oldFinalClause, newFinalClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalClause(FinalClause newFinalClause) {
		if (newFinalClause != finalClause) {
			NotificationChain msgs = null;
			if (finalClause != null)
				msgs = ((InternalEObject)finalClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE, null, msgs);
			if (newFinalClause != null)
				msgs = ((InternalEObject)newFinalClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE, null, msgs);
			msgs = basicSetFinalClause(newFinalClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE, newFinalClause, newFinalClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES:
				return basicSetSequentialClausses(null, msgs);
			case AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE:
				return basicSetFinalClause(null, msgs);
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
			case AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES:
				return getSequentialClausses();
			case AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE:
				return getFinalClause();
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
			case AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES:
				setSequentialClausses((SequentialClauses)newValue);
				return;
			case AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE:
				setFinalClause((FinalClause)newValue);
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
			case AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES:
				setSequentialClausses((SequentialClauses)null);
				return;
			case AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE:
				setFinalClause((FinalClause)null);
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
			case AlfDslPackage.IF_STATEMENT__SEQUENTIAL_CLAUSSES:
				return sequentialClausses != null;
			case AlfDslPackage.IF_STATEMENT__FINAL_CLAUSE:
				return finalClause != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
