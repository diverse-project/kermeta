/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.traceability.Message;
import org.kermeta.traceability.Reference;
import org.kermeta.traceability.Trace;
import org.kermeta.traceability.TraceModel;
import org.kermeta.traceability.TraceabilityPackage;
import org.kermeta.traceability.Traceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.traceability.impl.TraceImpl#getSourceElem <em>Source Elem</em>}</li>
 *   <li>{@link org.kermeta.traceability.impl.TraceImpl#getTargetElem <em>Target Elem</em>}</li>
 *   <li>{@link org.kermeta.traceability.impl.TraceImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends EObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getTargetElem() <em>Target Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElem()
	 * @generated
	 * @ordered
	 */
	protected Traceable targetElem;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EObject context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traceable getSourceElem() {
		if (eContainerFeatureID() != TraceabilityPackage.TRACE__SOURCE_ELEM) return null;
		return (Traceable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceElem(Traceable newSourceElem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceElem, TraceabilityPackage.TRACE__SOURCE_ELEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElem(Traceable newSourceElem) {
		if (newSourceElem != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.TRACE__SOURCE_ELEM && newSourceElem != null)) {
			if (EcoreUtil.isAncestor(this, newSourceElem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceElem != null)
				msgs = ((InternalEObject)newSourceElem).eInverseAdd(this, TraceabilityPackage.TRACEABLE__TARGET, Traceable.class, msgs);
			msgs = basicSetSourceElem(newSourceElem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE__SOURCE_ELEM, newSourceElem, newSourceElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traceable getTargetElem() {
		if (targetElem != null && targetElem.eIsProxy()) {
			InternalEObject oldTargetElem = (InternalEObject)targetElem;
			targetElem = (Traceable)eResolveProxy(oldTargetElem);
			if (targetElem != oldTargetElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TRACE__TARGET_ELEM, oldTargetElem, targetElem));
			}
		}
		return targetElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traceable basicGetTargetElem() {
		return targetElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetElem(Traceable newTargetElem, NotificationChain msgs) {
		Traceable oldTargetElem = targetElem;
		targetElem = newTargetElem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE__TARGET_ELEM, oldTargetElem, newTargetElem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElem(Traceable newTargetElem) {
		if (newTargetElem != targetElem) {
			NotificationChain msgs = null;
			if (targetElem != null)
				msgs = ((InternalEObject)targetElem).eInverseRemove(this, TraceabilityPackage.TRACEABLE__SOURCE, Traceable.class, msgs);
			if (newTargetElem != null)
				msgs = ((InternalEObject)newTargetElem).eInverseAdd(this, TraceabilityPackage.TRACEABLE__SOURCE, Traceable.class, msgs);
			msgs = basicSetTargetElem(newTargetElem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE__TARGET_ELEM, newTargetElem, newTargetElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TRACE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EObject newContext) {
		EObject oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceElem((Traceable)otherEnd, msgs);
			case TraceabilityPackage.TRACE__TARGET_ELEM:
				if (targetElem != null)
					msgs = ((InternalEObject)targetElem).eInverseRemove(this, TraceabilityPackage.TRACEABLE__SOURCE, Traceable.class, msgs);
				return basicSetTargetElem((Traceable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				return basicSetSourceElem(null, msgs);
			case TraceabilityPackage.TRACE__TARGET_ELEM:
				return basicSetTargetElem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.TRACEABLE__TARGET, Traceable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				return getSourceElem();
			case TraceabilityPackage.TRACE__TARGET_ELEM:
				if (resolve) return getTargetElem();
				return basicGetTargetElem();
			case TraceabilityPackage.TRACE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				setSourceElem((Traceable)newValue);
				return;
			case TraceabilityPackage.TRACE__TARGET_ELEM:
				setTargetElem((Traceable)newValue);
				return;
			case TraceabilityPackage.TRACE__CONTEXT:
				setContext((EObject)newValue);
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
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				setSourceElem((Traceable)null);
				return;
			case TraceabilityPackage.TRACE__TARGET_ELEM:
				setTargetElem((Traceable)null);
				return;
			case TraceabilityPackage.TRACE__CONTEXT:
				setContext((EObject)null);
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
			case TraceabilityPackage.TRACE__SOURCE_ELEM:
				return getSourceElem() != null;
			case TraceabilityPackage.TRACE__TARGET_ELEM:
				return targetElem != null;
			case TraceabilityPackage.TRACE__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
