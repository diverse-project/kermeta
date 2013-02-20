/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore.impl;

import fr.tm.elibel.smartqvt.qvt.qvtcore.Area;
import fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment;
import fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation;
import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;
import fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bottom Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl#getArea <em>Area</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl#getEnforcementOperation <em>Enforcement Operation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.BottomPatternImpl#getRealizedVariable <em>Realized Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BottomPatternImpl extends CorePatternImpl implements BottomPattern {
	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList assignment;

	/**
	 * The cached value of the '{@link #getEnforcementOperation() <em>Enforcement Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnforcementOperation()
	 * @generated
	 * @ordered
	 */
	protected EList enforcementOperation;

	/**
	 * The cached value of the '{@link #getRealizedVariable() <em>Realized Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList realizedVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BottomPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtcorePackage.Literals.BOTTOM_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area getArea() {
		if (eContainerFeatureID != QvtcorePackage.BOTTOM_PATTERN__AREA) return null;
		return (Area)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(Area newArea, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newArea, QvtcorePackage.BOTTOM_PATTERN__AREA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(Area newArea) {
		if (newArea != eInternalContainer() || (eContainerFeatureID != QvtcorePackage.BOTTOM_PATTERN__AREA && newArea != null)) {
			if (EcoreUtil.isAncestor(this, newArea))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArea != null)
				msgs = ((InternalEObject)newArea).eInverseAdd(this, QvtcorePackage.AREA__BOTTOM_PATTERN, Area.class, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.BOTTOM_PATTERN__AREA, newArea, newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssignment() {
		if (assignment == null) {
			assignment = new EObjectContainmentWithInverseEList(Assignment.class, this, QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT, QvtcorePackage.ASSIGNMENT__BOTTOM_PATTERN);
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnforcementOperation() {
		if (enforcementOperation == null) {
			enforcementOperation = new EObjectContainmentWithInverseEList(EnforcementOperation.class, this, QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION, QvtcorePackage.ENFORCEMENT_OPERATION__BOTTOM_PATTERN);
		}
		return enforcementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRealizedVariable() {
		if (realizedVariable == null) {
			realizedVariable = new EObjectContainmentWithInverseEList(RealizedVariable.class, this, QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE, QvtcorePackage.REALIZED_VARIABLE__BOTTOM_PATTERN);
		}
		return realizedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetArea((Area)otherEnd, msgs);
			case QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT:
				return ((InternalEList)getAssignment()).basicAdd(otherEnd, msgs);
			case QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION:
				return ((InternalEList)getEnforcementOperation()).basicAdd(otherEnd, msgs);
			case QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE:
				return ((InternalEList)getRealizedVariable()).basicAdd(otherEnd, msgs);
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
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				return basicSetArea(null, msgs);
			case QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT:
				return ((InternalEList)getAssignment()).basicRemove(otherEnd, msgs);
			case QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION:
				return ((InternalEList)getEnforcementOperation()).basicRemove(otherEnd, msgs);
			case QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE:
				return ((InternalEList)getRealizedVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				return eInternalContainer().eInverseRemove(this, QvtcorePackage.AREA__BOTTOM_PATTERN, Area.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				return getArea();
			case QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT:
				return getAssignment();
			case QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION:
				return getEnforcementOperation();
			case QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE:
				return getRealizedVariable();
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
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				setArea((Area)newValue);
				return;
			case QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT:
				getAssignment().clear();
				getAssignment().addAll((Collection)newValue);
				return;
			case QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION:
				getEnforcementOperation().clear();
				getEnforcementOperation().addAll((Collection)newValue);
				return;
			case QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE:
				getRealizedVariable().clear();
				getRealizedVariable().addAll((Collection)newValue);
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
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				setArea((Area)null);
				return;
			case QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT:
				getAssignment().clear();
				return;
			case QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION:
				getEnforcementOperation().clear();
				return;
			case QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE:
				getRealizedVariable().clear();
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
			case QvtcorePackage.BOTTOM_PATTERN__AREA:
				return getArea() != null;
			case QvtcorePackage.BOTTOM_PATTERN__ASSIGNMENT:
				return assignment != null && !assignment.isEmpty();
			case QvtcorePackage.BOTTOM_PATTERN__ENFORCEMENT_OPERATION:
				return enforcementOperation != null && !enforcementOperation.isEmpty();
			case QvtcorePackage.BOTTOM_PATTERN__REALIZED_VARIABLE:
				return realizedVariable != null && !realizedVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BottomPatternImpl
