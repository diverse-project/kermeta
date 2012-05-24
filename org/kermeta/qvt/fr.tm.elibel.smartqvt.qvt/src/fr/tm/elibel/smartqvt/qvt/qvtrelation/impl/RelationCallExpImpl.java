/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation.impl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.essentialocl.impl.OclExpressionImpl;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation;
import fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationCallExp;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationCallExpImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.impl.RelationCallExpImpl#getReferredRelation <em>Referred Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationCallExpImpl extends OclExpressionImpl implements RelationCallExp {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList argument;

	/**
	 * The cached value of the '{@link #getReferredRelation() <em>Referred Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation referredRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationCallExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtrelationPackage.Literals.RELATION_CALL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList(OclExpression.class, this, QvtrelationPackage.RELATION_CALL_EXP__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getReferredRelation() {
		if (referredRelation != null && referredRelation.eIsProxy()) {
			InternalEObject oldReferredRelation = (InternalEObject)referredRelation;
			referredRelation = (Relation)eResolveProxy(oldReferredRelation);
			if (referredRelation != oldReferredRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtrelationPackage.RELATION_CALL_EXP__REFERRED_RELATION, oldReferredRelation, referredRelation));
			}
		}
		return referredRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetReferredRelation() {
		return referredRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredRelation(Relation newReferredRelation) {
		Relation oldReferredRelation = referredRelation;
		referredRelation = newReferredRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtrelationPackage.RELATION_CALL_EXP__REFERRED_RELATION, oldReferredRelation, referredRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtrelationPackage.RELATION_CALL_EXP__ARGUMENT:
				return ((InternalEList)getArgument()).basicRemove(otherEnd, msgs);
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
			case QvtrelationPackage.RELATION_CALL_EXP__ARGUMENT:
				return getArgument();
			case QvtrelationPackage.RELATION_CALL_EXP__REFERRED_RELATION:
				if (resolve) return getReferredRelation();
				return basicGetReferredRelation();
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
			case QvtrelationPackage.RELATION_CALL_EXP__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection)newValue);
				return;
			case QvtrelationPackage.RELATION_CALL_EXP__REFERRED_RELATION:
				setReferredRelation((Relation)newValue);
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
			case QvtrelationPackage.RELATION_CALL_EXP__ARGUMENT:
				getArgument().clear();
				return;
			case QvtrelationPackage.RELATION_CALL_EXP__REFERRED_RELATION:
				setReferredRelation((Relation)null);
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
			case QvtrelationPackage.RELATION_CALL_EXP__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case QvtrelationPackage.RELATION_CALL_EXP__REFERRED_RELATION:
				return referredRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationCallExpImpl
