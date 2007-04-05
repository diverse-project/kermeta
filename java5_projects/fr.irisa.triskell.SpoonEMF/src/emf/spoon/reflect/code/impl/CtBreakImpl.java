/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtBreakImpl.java,v 1.1 2007-04-05 12:52:08 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtBreak;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtBreakImpl#getLabelledStatement <em>Labelled Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtBreakImpl extends CtCFlowBreakImpl implements CtBreak {
	/**
	 * The cached value of the '{@link #getLabelledStatement() <em>Labelled Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelledStatement()
	 * @generated
	 * @ordered
	 */
	protected CtStatement labelledStatement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtBreakImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_BREAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement getLabelledStatement() {
		if (labelledStatement != null && labelledStatement.eIsProxy()) {
			InternalEObject oldLabelledStatement = (InternalEObject)labelledStatement;
			labelledStatement = (CtStatement)eResolveProxy(oldLabelledStatement);
			if (labelledStatement != oldLabelledStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_BREAK__LABELLED_STATEMENT, oldLabelledStatement, labelledStatement));
			}
		}
		return labelledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtStatement basicGetLabelledStatement() {
		return labelledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelledStatement(CtStatement newLabelledStatement) {
		CtStatement oldLabelledStatement = labelledStatement;
		labelledStatement = newLabelledStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_BREAK__LABELLED_STATEMENT, oldLabelledStatement, labelledStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_BREAK__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_BREAK__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_BREAK__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_BREAK__LABEL:
				return getLabel();
			case CodePackage.CT_BREAK__LABELLED_STATEMENT:
				if (resolve) return getLabelledStatement();
				return basicGetLabelledStatement();
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
			case CodePackage.CT_BREAK__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_BREAK__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_BREAK__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_BREAK__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_BREAK__LABELLED_STATEMENT:
				setLabelledStatement((CtStatement)newValue);
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
			case CodePackage.CT_BREAK__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_BREAK__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_BREAK__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_BREAK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_BREAK__LABELLED_STATEMENT:
				setLabelledStatement((CtStatement)null);
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
			case CodePackage.CT_BREAK__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_BREAK__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_BREAK__PARENT:
				return parent != null;
			case CodePackage.CT_BREAK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_BREAK__LABELLED_STATEMENT:
				return labelledStatement != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtBreakImpl