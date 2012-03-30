/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org2.kermeta.kompren.slicing.SlicedClass;
import org2.kermeta.kompren.slicing.SlicingPackage;
import org2.kermeta.kompren.slicing.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sliced Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org2.kermeta.kompren.slicing.impl.SlicedClassImpl#getCtx <em>Ctx</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicing.impl.SlicedClassImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlicedClassImpl extends SlicedElementImpl implements SlicedClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * The cached value of the '{@link #getCtx() <em>Ctx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtx()
	 * @generated
	 * @ordered
	 */
	protected VarDecl ctx;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EClass domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlicedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlicingPackage.Literals.SLICED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl getCtx() {
		return ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtx(VarDecl newCtx, NotificationChain msgs) {
		VarDecl oldCtx = ctx;
		ctx = newCtx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_CLASS__CTX, oldCtx, newCtx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtx(VarDecl newCtx) {
		if (newCtx != ctx) {
			NotificationChain msgs = null;
			if (ctx != null)
				msgs = ((InternalEObject)ctx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_CLASS__CTX, null, msgs);
			if (newCtx != null)
				msgs = ((InternalEObject)newCtx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlicingPackage.SLICED_CLASS__CTX, null, msgs);
			msgs = basicSetCtx(newCtx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_CLASS__CTX, newCtx, newCtx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (EClass)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlicingPackage.SLICED_CLASS__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(EClass newDomain) {
		EClass oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlicingPackage.SLICED_CLASS__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlicingPackage.SLICED_CLASS__CTX:
				return basicSetCtx(null, msgs);
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
			case SlicingPackage.SLICED_CLASS__CTX:
				return getCtx();
			case SlicingPackage.SLICED_CLASS__DOMAIN:
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
			case SlicingPackage.SLICED_CLASS__CTX:
				setCtx((VarDecl)newValue);
				return;
			case SlicingPackage.SLICED_CLASS__DOMAIN:
				setDomain((EClass)newValue);
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
			case SlicingPackage.SLICED_CLASS__CTX:
				setCtx((VarDecl)null);
				return;
			case SlicingPackage.SLICED_CLASS__DOMAIN:
				setDomain((EClass)null);
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
			case SlicingPackage.SLICED_CLASS__CTX:
				return ctx != null;
			case SlicingPackage.SLICED_CLASS__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //SlicedClassImpl
