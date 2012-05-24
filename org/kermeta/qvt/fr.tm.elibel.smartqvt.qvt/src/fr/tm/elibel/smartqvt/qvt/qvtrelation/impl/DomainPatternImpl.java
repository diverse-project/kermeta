/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation.impl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.impl.PatternImpl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.DomainPattern;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;

import fr.tm.elibel.smartqvt.qvt.qvttemplate.TemplateExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.DomainPatternImpl#getTemplateExpression <em>Template Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainPatternImpl extends PatternImpl implements DomainPattern {
	/**
	 * The cached value of the '{@link #getTemplateExpression() <em>Template Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateExpression()
	 * @generated
	 * @ordered
	 */
	protected TemplateExp templateExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtrelationPackage.Literals.DOMAIN_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateExp getTemplateExpression() {
		return templateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateExpression(TemplateExp newTemplateExpression, NotificationChain msgs) {
		TemplateExp oldTemplateExpression = templateExpression;
		templateExpression = newTemplateExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION, oldTemplateExpression, newTemplateExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateExpression(TemplateExp newTemplateExpression) {
		if (newTemplateExpression != templateExpression) {
			NotificationChain msgs = null;
			if (templateExpression != null)
				msgs = ((InternalEObject)templateExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION, null, msgs);
			if (newTemplateExpression != null)
				msgs = ((InternalEObject)newTemplateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION, null, msgs);
			msgs = basicSetTemplateExpression(newTemplateExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION, newTemplateExpression, newTemplateExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION:
				return basicSetTemplateExpression(null, msgs);
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
			case QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION:
				return getTemplateExpression();
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
			case QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION:
				setTemplateExpression((TemplateExp)newValue);
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
			case QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION:
				setTemplateExpression((TemplateExp)null);
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
			case QvtrelationPackage.DOMAIN_PATTERN__TEMPLATE_EXPRESSION:
				return templateExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainPatternImpl
