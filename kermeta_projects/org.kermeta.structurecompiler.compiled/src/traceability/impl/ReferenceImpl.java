/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceImpl.java,v 1.1 2008-09-04 15:40:38 cfaucher Exp $
 */
package traceability.impl;

import java.util.Collection;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import traceability.Reference;
import traceability.Trace;
import traceability.TraceModel;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.ReferenceImpl#getTargetTraces <em>Target Traces</em>}</li>
 *   <li>{@link traceability.impl.ReferenceImpl#getTraceMdl <em>Trace Mdl</em>}</li>
 *   <li>{@link traceability.impl.ReferenceImpl#getSourceTraces <em>Source Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReferenceImpl extends ObjectImpl implements Reference {
	/**
	 * The cached value of the '{@link #getTargetTraces() <em>Target Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> targetTraces;

	/**
	 * The cached value of the '{@link #getSourceTraces() <em>Source Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> sourceTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTargetTraces() {
		if (targetTraces == null) {
			targetTraces = new EObjectWithInverseResolvingEList.ManyInverse<Trace>(
					Trace.class, this,
					TraceabilityPackage.REFERENCE__TARGET_TRACES,
					TraceabilityPackage.TRACE__SOURCE_REFERENCES);
		}
		return targetTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel getTraceMdl() {
		if (eContainerFeatureID != TraceabilityPackage.REFERENCE__TRACE_MDL)
			return null;
		return (TraceModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel basicGetTraceMdl() {
		if (eContainerFeatureID != TraceabilityPackage.REFERENCE__TRACE_MDL)
			return null;
		return (TraceModel) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceMdl(TraceModel newTraceMdl,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTraceMdl,
				TraceabilityPackage.REFERENCE__TRACE_MDL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceMdl(TraceModel newTraceMdl) {
		if (newTraceMdl != eInternalContainer()
				|| (eContainerFeatureID != TraceabilityPackage.REFERENCE__TRACE_MDL && newTraceMdl != null)) {
			if (EcoreUtil.isAncestor(this, newTraceMdl))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTraceMdl != null)
				msgs = ((InternalEObject) newTraceMdl).eInverseAdd(this,
						TraceabilityPackage.TRACE_MODEL__REFERENCES,
						TraceModel.class, msgs);
			msgs = basicSetTraceMdl(newTraceMdl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.REFERENCE__TRACE_MDL, newTraceMdl,
					newTraceMdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getSourceTraces() {
		if (sourceTraces == null) {
			sourceTraces = new EObjectWithInverseResolvingEList.ManyInverse<Trace>(
					Trace.class, this,
					TraceabilityPackage.REFERENCE__SOURCE_TRACES,
					TraceabilityPackage.TRACE__TARGET_REFERENCES);
		}
		return sourceTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TraceabilityPackage.REFERENCE__TARGET_TRACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetTraces())
					.basicAdd(otherEnd, msgs);
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTraceMdl((TraceModel) otherEnd, msgs);
		case TraceabilityPackage.REFERENCE__SOURCE_TRACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceTraces())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TraceabilityPackage.REFERENCE__TARGET_TRACES:
			return ((InternalEList<?>) getTargetTraces()).basicRemove(otherEnd,
					msgs);
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			return basicSetTraceMdl(null, msgs);
		case TraceabilityPackage.REFERENCE__SOURCE_TRACES:
			return ((InternalEList<?>) getSourceTraces()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			return eInternalContainer().eInverseRemove(this,
					TraceabilityPackage.TRACE_MODEL__REFERENCES,
					TraceModel.class, msgs);
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
		case TraceabilityPackage.REFERENCE__TARGET_TRACES:
			return getTargetTraces();
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			if (resolve)
				return getTraceMdl();
			return basicGetTraceMdl();
		case TraceabilityPackage.REFERENCE__SOURCE_TRACES:
			return getSourceTraces();
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
		case TraceabilityPackage.REFERENCE__TARGET_TRACES:
			getTargetTraces().clear();
			getTargetTraces().addAll((Collection<? extends Trace>) newValue);
			return;
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			setTraceMdl((TraceModel) newValue);
			return;
		case TraceabilityPackage.REFERENCE__SOURCE_TRACES:
			getSourceTraces().clear();
			getSourceTraces().addAll((Collection<? extends Trace>) newValue);
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
		case TraceabilityPackage.REFERENCE__TARGET_TRACES:
			getTargetTraces().clear();
			return;
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			setTraceMdl((TraceModel) null);
			return;
		case TraceabilityPackage.REFERENCE__SOURCE_TRACES:
			getSourceTraces().clear();
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
		case TraceabilityPackage.REFERENCE__TARGET_TRACES:
			return targetTraces != null && !targetTraces.isEmpty();
		case TraceabilityPackage.REFERENCE__TRACE_MDL:
			return basicGetTraceMdl() != null;
		case TraceabilityPackage.REFERENCE__SOURCE_TRACES:
			return sourceTraces != null && !sourceTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
