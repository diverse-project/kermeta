/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtSwitchImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
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
import emf.spoon.reflect.code.CtSwitch;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtSwitchImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtSwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtSwitchImpl extends CtStatementImpl implements CtSwitch {
	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected CtExpression selector = null;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList cases = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getSelector() {
		if (selector != null && selector.eIsProxy()) {
			InternalEObject oldSelector = (InternalEObject)selector;
			selector = (CtExpression)eResolveProxy(oldSelector);
			if (selector != oldSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_SWITCH__SELECTOR, oldSelector, selector));
			}
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(CtExpression newSelector) {
		CtExpression oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_SWITCH__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCases() {
		if (cases == null) {
			cases = new EObjectResolvingEList(CtCase.class, this, CodePackage.CT_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_SWITCH__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_SWITCH__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_SWITCH__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_SWITCH__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_SWITCH__LABEL:
				return getLabel();
			case CodePackage.CT_SWITCH__SELECTOR:
				if (resolve) return getSelector();
				return basicGetSelector();
			case CodePackage.CT_SWITCH__CASES:
				return getCases();
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
			case CodePackage.CT_SWITCH__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_SWITCH__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_SWITCH__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_SWITCH__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_SWITCH__LABEL:
				setLabel((String)newValue);
				return;
			case CodePackage.CT_SWITCH__SELECTOR:
				setSelector((CtExpression)newValue);
				return;
			case CodePackage.CT_SWITCH__CASES:
				getCases().clear();
				getCases().addAll((Collection)newValue);
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
			case CodePackage.CT_SWITCH__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_SWITCH__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_SWITCH__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_SWITCH__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_SWITCH__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CodePackage.CT_SWITCH__SELECTOR:
				setSelector((CtExpression)null);
				return;
			case CodePackage.CT_SWITCH__CASES:
				getCases().clear();
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
			case CodePackage.CT_SWITCH__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_SWITCH__POSITION:
				return position != null;
			case CodePackage.CT_SWITCH__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_SWITCH__PARENT:
				return parent != null;
			case CodePackage.CT_SWITCH__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CodePackage.CT_SWITCH__SELECTOR:
				return selector != null;
			case CodePackage.CT_SWITCH__CASES:
				return cases != null && !cases.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CtSwitchImpl