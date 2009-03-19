/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtContinueImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtContinue;
import emf.spoon.reflect.code.CtStatement;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Continue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtContinueImpl#getLabelledStatement <em>Labelled Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtContinueImpl extends CtCFlowBreakImpl implements CtContinue {
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
	protected CtContinueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_CONTINUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_CONTINUE__LABELLED_STATEMENT, oldLabelledStatement, labelledStatement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_CONTINUE__LABELLED_STATEMENT, oldLabelledStatement, labelledStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_CONTINUE__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_CONTINUE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_CONTINUE__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_CONTINUE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_CONTINUE__LABEL:
				return getLabel();
			case CodePackage.CT_CONTINUE__LABELLED_STATEMENT:
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
			case CodePackage.CT_CONTINUE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_CONTINUE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_CONTINUE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_CONTINUE__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_CONTINUE__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_CONTINUE__LABELLED_STATEMENT:
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
			case CodePackage.CT_CONTINUE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_CONTINUE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_CONTINUE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_CONTINUE__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_CONTINUE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_CONTINUE__LABELLED_STATEMENT:
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
			case CodePackage.CT_CONTINUE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_CONTINUE__POSITION:
				return position != null;
			case CodePackage.CT_CONTINUE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_CONTINUE__PARENT:
				return parent != null;
			case CodePackage.CT_CONTINUE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_CONTINUE__LABELLED_STATEMENT:
				return labelledStatement != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CtContinueImpl