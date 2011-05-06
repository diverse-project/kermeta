/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kompren.slicing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.kompren.slicing.OppositeCreation;
import org.kermeta.kompren.slicing.SlicedProperty;
import org.kermeta.kompren.slicing.SlicingPackage;
import org.kermeta.kompren.slicing.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliced Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedPropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedPropertyImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedPropertyImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.impl.SlicedPropertyImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicedPropertyImpl extends SlicedElementImpl implements SlicedProperty {
	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected OppositeCreation opposite;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected VarDecl src;

	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected VarDecl tgt;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicedPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlicingPackage.Literals.SLICED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeCreation getOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpposite(OppositeCreation newOpposite, NotificationChain msgs) {
		OppositeCreation oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__OPPOSITE, oldOpposite, newOpposite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(OppositeCreation newOpposite) {
		if (newOpposite != opposite) {
			NotificationChain msgs = null;
			if (opposite != null)
				msgs = ((InternalEObject)opposite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_PROPERTY__OPPOSITE, null, msgs);
			if (newOpposite != null)
				msgs = ((InternalEObject)newOpposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_PROPERTY__OPPOSITE, null, msgs);
			msgs = basicSetOpposite(newOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__OPPOSITE, newOpposite, newOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(VarDecl newSrc, NotificationChain msgs) {
		VarDecl oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__SRC, oldSrc, newSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(VarDecl newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_PROPERTY__SRC, null, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_PROPERTY__SRC, null, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl getTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(VarDecl newTgt, NotificationChain msgs) {
		VarDecl oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__TGT, oldTgt, newTgt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgt(VarDecl newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject)tgt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_PROPERTY__TGT, null, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject)newTgt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_PROPERTY__TGT, null, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (EStructuralFeature)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlicingPackage.SLICED_PROPERTY__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(EStructuralFeature newDomain) {
		EStructuralFeature oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_PROPERTY__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlicingPackage.SLICED_PROPERTY__OPPOSITE:
				return basicSetOpposite(null, msgs);
			case SlicingPackage.SLICED_PROPERTY__SRC:
				return basicSetSrc(null, msgs);
			case SlicingPackage.SLICED_PROPERTY__TGT:
				return basicSetTgt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlicingPackage.SLICED_PROPERTY__OPPOSITE:
				return getOpposite();
			case SlicingPackage.SLICED_PROPERTY__SRC:
				return getSrc();
			case SlicingPackage.SLICED_PROPERTY__TGT:
				return getTgt();
			case SlicingPackage.SLICED_PROPERTY__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlicingPackage.SLICED_PROPERTY__OPPOSITE:
				setOpposite((OppositeCreation)newValue);
				return;
			case SlicingPackage.SLICED_PROPERTY__SRC:
				setSrc((VarDecl)newValue);
				return;
			case SlicingPackage.SLICED_PROPERTY__TGT:
				setTgt((VarDecl)newValue);
				return;
			case SlicingPackage.SLICED_PROPERTY__DOMAIN:
				setDomain((EStructuralFeature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlicingPackage.SLICED_PROPERTY__OPPOSITE:
				setOpposite((OppositeCreation)null);
				return;
			case SlicingPackage.SLICED_PROPERTY__SRC:
				setSrc((VarDecl)null);
				return;
			case SlicingPackage.SLICED_PROPERTY__TGT:
				setTgt((VarDecl)null);
				return;
			case SlicingPackage.SLICED_PROPERTY__DOMAIN:
				setDomain((EStructuralFeature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlicingPackage.SLICED_PROPERTY__OPPOSITE:
				return opposite != null;
			case SlicingPackage.SLICED_PROPERTY__SRC:
				return src != null;
			case SlicingPackage.SLICED_PROPERTY__TGT:
				return tgt != null;
			case SlicingPackage.SLICED_PROPERTY__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //SlicedPropertyImpl
