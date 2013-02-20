/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore.impl;

import fr.tm.elibel.smartqvt.qvt.qvtbase.impl.RuleImpl;

import fr.tm.elibel.smartqvt.qvt.qvtcore.Area;
import fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern;
import fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping;
import fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl#getBottomPattern <em>Bottom Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl#getGuardPattern <em>Guard Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.impl.MappingImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends RuleImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getBottomPattern() <em>Bottom Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomPattern()
	 * @generated
	 * @ordered
	 */
	protected BottomPattern bottomPattern;

	/**
	 * The cached value of the '{@link #getGuardPattern() <em>Guard Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardPattern()
	 * @generated
	 * @ordered
	 */
	protected GuardPattern guardPattern;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected EList local;

	/**
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList refinement;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QvtcorePackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BottomPattern getBottomPattern() {
		return bottomPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottomPattern(BottomPattern newBottomPattern, NotificationChain msgs) {
		BottomPattern oldBottomPattern = bottomPattern;
		bottomPattern = newBottomPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtcorePackage.MAPPING__BOTTOM_PATTERN, oldBottomPattern, newBottomPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomPattern(BottomPattern newBottomPattern) {
		if (newBottomPattern != bottomPattern) {
			NotificationChain msgs = null;
			if (bottomPattern != null)
				msgs = ((InternalEObject)bottomPattern).eInverseRemove(this, QvtcorePackage.BOTTOM_PATTERN__AREA, BottomPattern.class, msgs);
			if (newBottomPattern != null)
				msgs = ((InternalEObject)newBottomPattern).eInverseAdd(this, QvtcorePackage.BOTTOM_PATTERN__AREA, BottomPattern.class, msgs);
			msgs = basicSetBottomPattern(newBottomPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.MAPPING__BOTTOM_PATTERN, newBottomPattern, newBottomPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardPattern getGuardPattern() {
		return guardPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardPattern(GuardPattern newGuardPattern, NotificationChain msgs) {
		GuardPattern oldGuardPattern = guardPattern;
		guardPattern = newGuardPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtcorePackage.MAPPING__GUARD_PATTERN, oldGuardPattern, newGuardPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardPattern(GuardPattern newGuardPattern) {
		if (newGuardPattern != guardPattern) {
			NotificationChain msgs = null;
			if (guardPattern != null)
				msgs = ((InternalEObject)guardPattern).eInverseRemove(this, QvtcorePackage.GUARD_PATTERN__AREA, GuardPattern.class, msgs);
			if (newGuardPattern != null)
				msgs = ((InternalEObject)newGuardPattern).eInverseAdd(this, QvtcorePackage.GUARD_PATTERN__AREA, GuardPattern.class, msgs);
			msgs = basicSetGuardPattern(newGuardPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.MAPPING__GUARD_PATTERN, newGuardPattern, newGuardPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getContext() {
		if (eContainerFeatureID != QvtcorePackage.MAPPING__CONTEXT) return null;
		return (Mapping)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Mapping newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, QvtcorePackage.MAPPING__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Mapping newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID != QvtcorePackage.MAPPING__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, QvtcorePackage.MAPPING__LOCAL, Mapping.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtcorePackage.MAPPING__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocal() {
		if (local == null) {
			local = new EObjectContainmentWithInverseEList(Mapping.class, this, QvtcorePackage.MAPPING__LOCAL, QvtcorePackage.MAPPING__CONTEXT);
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefinement() {
		if (refinement == null) {
			refinement = new EObjectWithInverseResolvingEList.ManyInverse(Mapping.class, this, QvtcorePackage.MAPPING__REFINEMENT, QvtcorePackage.MAPPING__SPECIFICATION);
		}
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpecification() {
		if (specification == null) {
			specification = new EObjectWithInverseResolvingEList.ManyInverse(Mapping.class, this, QvtcorePackage.MAPPING__SPECIFICATION, QvtcorePackage.MAPPING__REFINEMENT);
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtcorePackage.MAPPING__BOTTOM_PATTERN:
				if (bottomPattern != null)
					msgs = ((InternalEObject)bottomPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtcorePackage.MAPPING__BOTTOM_PATTERN, null, msgs);
				return basicSetBottomPattern((BottomPattern)otherEnd, msgs);
			case QvtcorePackage.MAPPING__GUARD_PATTERN:
				if (guardPattern != null)
					msgs = ((InternalEObject)guardPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtcorePackage.MAPPING__GUARD_PATTERN, null, msgs);
				return basicSetGuardPattern((GuardPattern)otherEnd, msgs);
			case QvtcorePackage.MAPPING__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((Mapping)otherEnd, msgs);
			case QvtcorePackage.MAPPING__LOCAL:
				return ((InternalEList)getLocal()).basicAdd(otherEnd, msgs);
			case QvtcorePackage.MAPPING__REFINEMENT:
				return ((InternalEList)getRefinement()).basicAdd(otherEnd, msgs);
			case QvtcorePackage.MAPPING__SPECIFICATION:
				return ((InternalEList)getSpecification()).basicAdd(otherEnd, msgs);
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
			case QvtcorePackage.MAPPING__BOTTOM_PATTERN:
				return basicSetBottomPattern(null, msgs);
			case QvtcorePackage.MAPPING__GUARD_PATTERN:
				return basicSetGuardPattern(null, msgs);
			case QvtcorePackage.MAPPING__CONTEXT:
				return basicSetContext(null, msgs);
			case QvtcorePackage.MAPPING__LOCAL:
				return ((InternalEList)getLocal()).basicRemove(otherEnd, msgs);
			case QvtcorePackage.MAPPING__REFINEMENT:
				return ((InternalEList)getRefinement()).basicRemove(otherEnd, msgs);
			case QvtcorePackage.MAPPING__SPECIFICATION:
				return ((InternalEList)getSpecification()).basicRemove(otherEnd, msgs);
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
			case QvtcorePackage.MAPPING__CONTEXT:
				return eInternalContainer().eInverseRemove(this, QvtcorePackage.MAPPING__LOCAL, Mapping.class, msgs);
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
			case QvtcorePackage.MAPPING__BOTTOM_PATTERN:
				return getBottomPattern();
			case QvtcorePackage.MAPPING__GUARD_PATTERN:
				return getGuardPattern();
			case QvtcorePackage.MAPPING__CONTEXT:
				return getContext();
			case QvtcorePackage.MAPPING__LOCAL:
				return getLocal();
			case QvtcorePackage.MAPPING__REFINEMENT:
				return getRefinement();
			case QvtcorePackage.MAPPING__SPECIFICATION:
				return getSpecification();
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
			case QvtcorePackage.MAPPING__BOTTOM_PATTERN:
				setBottomPattern((BottomPattern)newValue);
				return;
			case QvtcorePackage.MAPPING__GUARD_PATTERN:
				setGuardPattern((GuardPattern)newValue);
				return;
			case QvtcorePackage.MAPPING__CONTEXT:
				setContext((Mapping)newValue);
				return;
			case QvtcorePackage.MAPPING__LOCAL:
				getLocal().clear();
				getLocal().addAll((Collection)newValue);
				return;
			case QvtcorePackage.MAPPING__REFINEMENT:
				getRefinement().clear();
				getRefinement().addAll((Collection)newValue);
				return;
			case QvtcorePackage.MAPPING__SPECIFICATION:
				getSpecification().clear();
				getSpecification().addAll((Collection)newValue);
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
			case QvtcorePackage.MAPPING__BOTTOM_PATTERN:
				setBottomPattern((BottomPattern)null);
				return;
			case QvtcorePackage.MAPPING__GUARD_PATTERN:
				setGuardPattern((GuardPattern)null);
				return;
			case QvtcorePackage.MAPPING__CONTEXT:
				setContext((Mapping)null);
				return;
			case QvtcorePackage.MAPPING__LOCAL:
				getLocal().clear();
				return;
			case QvtcorePackage.MAPPING__REFINEMENT:
				getRefinement().clear();
				return;
			case QvtcorePackage.MAPPING__SPECIFICATION:
				getSpecification().clear();
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
			case QvtcorePackage.MAPPING__BOTTOM_PATTERN:
				return bottomPattern != null;
			case QvtcorePackage.MAPPING__GUARD_PATTERN:
				return guardPattern != null;
			case QvtcorePackage.MAPPING__CONTEXT:
				return getContext() != null;
			case QvtcorePackage.MAPPING__LOCAL:
				return local != null && !local.isEmpty();
			case QvtcorePackage.MAPPING__REFINEMENT:
				return refinement != null && !refinement.isEmpty();
			case QvtcorePackage.MAPPING__SPECIFICATION:
				return specification != null && !specification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Area.class) {
			switch (derivedFeatureID) {
				case QvtcorePackage.MAPPING__BOTTOM_PATTERN: return QvtcorePackage.AREA__BOTTOM_PATTERN;
				case QvtcorePackage.MAPPING__GUARD_PATTERN: return QvtcorePackage.AREA__GUARD_PATTERN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Area.class) {
			switch (baseFeatureID) {
				case QvtcorePackage.AREA__BOTTOM_PATTERN: return QvtcorePackage.MAPPING__BOTTOM_PATTERN;
				case QvtcorePackage.AREA__GUARD_PATTERN: return QvtcorePackage.MAPPING__GUARD_PATTERN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MappingImpl
