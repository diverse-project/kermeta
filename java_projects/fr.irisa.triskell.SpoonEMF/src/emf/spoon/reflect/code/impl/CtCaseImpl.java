/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtCaseImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtCase;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtCaseImpl#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtCaseImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtCaseImpl extends CtStatementImpl implements CtCase {
	/**
	 * The cached value of the '{@link #getCaseExpression() <em>Case Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression caseExpression = null;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList statements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getCaseExpression() {
		if (caseExpression != null && caseExpression.eIsProxy()) {
			InternalEObject oldCaseExpression = (InternalEObject)caseExpression;
			caseExpression = (CtExpression)eResolveProxy(oldCaseExpression);
			if (caseExpression != oldCaseExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CASE__CASE_EXPRESSION, oldCaseExpression, caseExpression));
			}
		}
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetCaseExpression() {
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseExpression(CtExpression newCaseExpression) {
		CtExpression oldCaseExpression = caseExpression;
		caseExpression = newCaseExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CASE__CASE_EXPRESSION, oldCaseExpression, caseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getStatements() {
		if (statements == null) {
			statements = new EObjectResolvingEList(CtStatement.class, this, CodePackage.CT_CASE__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_CASE__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_CASE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_CASE__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_CASE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_CASE__LABEL:
				return getLabel();
			case CodePackage.CT_CASE__CASE_EXPRESSION:
				if (resolve) return getCaseExpression();
				return basicGetCaseExpression();
			case CodePackage.CT_CASE__STATEMENTS:
				return getStatements();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.CT_CASE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_CASE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_CASE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_CASE__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_CASE__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_CASE__CASE_EXPRESSION:
				setCaseExpression((CtExpression)newValue);
				return;
			case CodePackage.CT_CASE__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodePackage.CT_CASE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_CASE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_CASE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_CASE__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_CASE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_CASE__CASE_EXPRESSION:
				setCaseExpression((CtExpression)null);
				return;
			case CodePackage.CT_CASE__STATEMENTS:
				getStatements().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodePackage.CT_CASE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_CASE__POSITION:
				return position != null;
			case CodePackage.CT_CASE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_CASE__PARENT:
				return parent != null;
			case CodePackage.CT_CASE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_CASE__CASE_EXPRESSION:
				return caseExpression != null;
			case CodePackage.CT_CASE__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtCaseImpl