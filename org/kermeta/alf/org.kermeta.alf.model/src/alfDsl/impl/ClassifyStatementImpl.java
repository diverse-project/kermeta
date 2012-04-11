/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl.impl;

import alfDsl.AlfDslPackage;
import alfDsl.ClassificationClause;
import alfDsl.ClassifyStatement;
import alfDsl.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classify Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alfDsl.impl.ClassifyStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link alfDsl.impl.ClassifyStatementImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifyStatementImpl extends StatementImpl implements ClassifyStatement {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected ClassificationClause clause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifyStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlfDslPackage.Literals.CLASSIFY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationClause getClause() {
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClause(ClassificationClause newClause, NotificationChain msgs) {
		ClassificationClause oldClause = clause;
		clause = newClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE, oldClause, newClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClause(ClassificationClause newClause) {
		if (newClause != clause) {
			NotificationChain msgs = null;
			if (clause != null)
				msgs = ((InternalEObject)clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE, null, msgs);
			if (newClause != null)
				msgs = ((InternalEObject)newClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE, null, msgs);
			msgs = basicSetClause(newClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE, newClause, newClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE:
				return basicSetClause(null, msgs);
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
			case AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION:
				return getExpression();
			case AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE:
				return getClause();
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
			case AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE:
				setClause((ClassificationClause)newValue);
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
			case AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE:
				setClause((ClassificationClause)null);
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
			case AlfDslPackage.CLASSIFY_STATEMENT__EXPRESSION:
				return expression != null;
			case AlfDslPackage.CLASSIFY_STATEMENT__CLAUSE:
				return clause != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassifyStatementImpl
