/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl.impl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp;
import fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage;
import fr.tm.elibel.smartqvt.qvt.imperativeocl.TryExp;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.impl.TryExpImpl#getExceptClause <em>Except Clause</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.impl.TryExpImpl#getTryBody <em>Try Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryExpImpl extends ImperativeExpressionImpl implements TryExp {
	/**
	 * The cached value of the '{@link #getExceptClause() <em>Except Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptClause()
	 * @generated
	 * @ordered
	 */
	protected EList exceptClause;

	/**
	 * The cached value of the '{@link #getTryBody() <em>Try Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTryBody()
	 * @generated
	 * @ordered
	 */
	protected EList tryBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImperativeoclPackage.Literals.TRY_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExceptClause() {
		if (exceptClause == null) {
			exceptClause = new EObjectContainmentEList(CatchExp.class, this, ImperativeoclPackage.TRY_EXP__EXCEPT_CLAUSE);
		}
		return exceptClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTryBody() {
		if (tryBody == null) {
			tryBody = new EObjectContainmentEList(OclExpression.class, this, ImperativeoclPackage.TRY_EXP__TRY_BODY);
		}
		return tryBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeoclPackage.TRY_EXP__EXCEPT_CLAUSE:
				return ((InternalEList)getExceptClause()).basicRemove(otherEnd, msgs);
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				return ((InternalEList)getTryBody()).basicRemove(otherEnd, msgs);
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
			case ImperativeoclPackage.TRY_EXP__EXCEPT_CLAUSE:
				return getExceptClause();
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				return getTryBody();
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
			case ImperativeoclPackage.TRY_EXP__EXCEPT_CLAUSE:
				getExceptClause().clear();
				getExceptClause().addAll((Collection)newValue);
				return;
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				getTryBody().clear();
				getTryBody().addAll((Collection)newValue);
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
			case ImperativeoclPackage.TRY_EXP__EXCEPT_CLAUSE:
				getExceptClause().clear();
				return;
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				getTryBody().clear();
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
			case ImperativeoclPackage.TRY_EXP__EXCEPT_CLAUSE:
				return exceptClause != null && !exceptClause.isEmpty();
			case ImperativeoclPackage.TRY_EXP__TRY_BODY:
				return tryBody != null && !tryBody.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryExpImpl
