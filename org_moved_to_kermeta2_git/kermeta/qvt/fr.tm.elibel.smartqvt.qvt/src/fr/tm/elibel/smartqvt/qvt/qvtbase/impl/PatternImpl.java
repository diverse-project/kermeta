/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase.impl;

import fr.tm.elibel.smartqvt.qvt.emof.impl.ElementImpl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Predicate;
import fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.PatternImpl#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.impl.PatternImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends ElementImpl implements Pattern {
	/**
	 * The cached value of the '{@link #getBindsTo() <em>Binds To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsTo()
	 * @generated
	 * @ordered
	 */
	protected EList bindsTo;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected EList predicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtbasePackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBindsTo() {
		if (bindsTo == null) {
			bindsTo = new EObjectResolvingEList(Variable.class, this, QvtbasePackage.PATTERN__BINDS_TO);
		}
		return bindsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPredicate() {
		if (predicate == null) {
			predicate = new EObjectContainmentWithInverseEList(Predicate.class, this, QvtbasePackage.PATTERN__PREDICATE, QvtbasePackage.PREDICATE__PATTERN);
		}
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.PATTERN__PREDICATE:
				return ((InternalEList)getPredicate()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtbasePackage.PATTERN__PREDICATE:
				return ((InternalEList)getPredicate()).basicRemove(otherEnd, msgs);
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
			case QvtbasePackage.PATTERN__BINDS_TO:
				return getBindsTo();
			case QvtbasePackage.PATTERN__PREDICATE:
				return getPredicate();
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
			case QvtbasePackage.PATTERN__BINDS_TO:
				getBindsTo().clear();
				getBindsTo().addAll((Collection)newValue);
				return;
			case QvtbasePackage.PATTERN__PREDICATE:
				getPredicate().clear();
				getPredicate().addAll((Collection)newValue);
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
			case QvtbasePackage.PATTERN__BINDS_TO:
				getBindsTo().clear();
				return;
			case QvtbasePackage.PATTERN__PREDICATE:
				getPredicate().clear();
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
			case QvtbasePackage.PATTERN__BINDS_TO:
				return bindsTo != null && !bindsTo.isEmpty();
			case QvtbasePackage.PATTERN__PREDICATE:
				return predicate != null && !predicate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternImpl
