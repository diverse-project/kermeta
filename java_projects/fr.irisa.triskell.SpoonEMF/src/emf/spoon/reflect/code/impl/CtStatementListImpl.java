/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtStatementListImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.code.CtStatementList;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Statement List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtStatementListImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtStatementListImpl extends CtCodeElementImpl implements CtStatementList {
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
	protected CtStatementListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_STATEMENT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getStatements() {
		if (statements == null) {
			statements = new EObjectResolvingEList(CtStatement.class, this, CodePackage.CT_STATEMENT_LIST__STATEMENTS);
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
			case CodePackage.CT_STATEMENT_LIST__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_STATEMENT_LIST__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_STATEMENT_LIST__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_STATEMENT_LIST__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_STATEMENT_LIST__STATEMENTS:
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
			case CodePackage.CT_STATEMENT_LIST__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_STATEMENT_LIST__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_STATEMENT_LIST__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_STATEMENT_LIST__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_STATEMENT_LIST__STATEMENTS:
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
			case CodePackage.CT_STATEMENT_LIST__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_STATEMENT_LIST__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_STATEMENT_LIST__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_STATEMENT_LIST__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_STATEMENT_LIST__STATEMENTS:
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
			case CodePackage.CT_STATEMENT_LIST__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_STATEMENT_LIST__POSITION:
				return position != null;
			case CodePackage.CT_STATEMENT_LIST__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_STATEMENT_LIST__PARENT:
				return parent != null;
			case CodePackage.CT_STATEMENT_LIST__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtStatementListImpl