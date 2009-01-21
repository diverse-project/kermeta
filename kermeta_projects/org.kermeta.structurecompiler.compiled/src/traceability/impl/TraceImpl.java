/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceImpl.java,v 1.10 2009-01-21 09:16:04 cfaucher Exp $
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

import traceability.Message;
import traceability.Reference;
import traceability.Trace;
import traceability.TraceModel;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.TraceImpl#getTraceMdl <em>Trace Mdl</em>}</li>
 *   <li>{@link traceability.impl.TraceImpl#getSourceReferences <em>Source References</em>}</li>
 *   <li>{@link traceability.impl.TraceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link traceability.impl.TraceImpl#getTargetReferences <em>Target References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends ObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getSourceReferences() <em>Source References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sourceReferences;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> description;

	/**
	 * The cached value of the '{@link #getTargetReferences() <em>Target References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> targetReferences;

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
	public TraceModel getTraceMdl() {
		if (eContainerFeatureID != TraceabilityPackage.TRACE__TRACE_MDL)
			return null;
		return (TraceModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel basicGetTraceMdl() {
		if (eContainerFeatureID != TraceabilityPackage.TRACE__TRACE_MDL)
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
				TraceabilityPackage.TRACE__TRACE_MDL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceMdl(TraceModel newTraceMdl) {
		if (newTraceMdl != eInternalContainer()
				|| (eContainerFeatureID != TraceabilityPackage.TRACE__TRACE_MDL && newTraceMdl != null)) {
			if (EcoreUtil.isAncestor(this, newTraceMdl))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTraceMdl != null)
				msgs = ((InternalEObject) newTraceMdl).eInverseAdd(this,
						TraceabilityPackage.TRACE_MODEL__TRACES,
						TraceModel.class, msgs);
			msgs = basicSetTraceMdl(newTraceMdl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.TRACE__TRACE_MDL, newTraceMdl,
					newTraceMdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSourceReferences() {
		if (sourceReferences == null) {
			sourceReferences = new EObjectWithInverseResolvingEList.ManyInverse<Reference>(
					Reference.class, this,
					TraceabilityPackage.TRACE__SOURCE_REFERENCES,
					TraceabilityPackage.REFERENCE__TARGET_TRACES);
		}
		return sourceReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getDescription() {
		if (description == null) {
			description = new EObjectWithInverseResolvingEList.ManyInverse<Message>(
					Message.class, this,
					TraceabilityPackage.TRACE__DESCRIPTION,
					TraceabilityPackage.MESSAGE__TRACES);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getTargetReferences() {
		if (targetReferences == null) {
			targetReferences = new EObjectWithInverseResolvingEList.ManyInverse<Reference>(
					Reference.class, this,
					TraceabilityPackage.TRACE__TARGET_REFERENCES,
					TraceabilityPackage.REFERENCE__SOURCE_TRACES);
		}
		return targetReferences;
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTraceMdl((TraceModel) otherEnd, msgs);
		case TraceabilityPackage.TRACE__SOURCE_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceReferences())
					.basicAdd(otherEnd, msgs);
		case TraceabilityPackage.TRACE__DESCRIPTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDescription())
					.basicAdd(otherEnd, msgs);
		case TraceabilityPackage.TRACE__TARGET_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetReferences())
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			return basicSetTraceMdl(null, msgs);
		case TraceabilityPackage.TRACE__SOURCE_REFERENCES:
			return ((InternalEList<?>) getSourceReferences()).basicRemove(
					otherEnd, msgs);
		case TraceabilityPackage.TRACE__DESCRIPTION:
			return ((InternalEList<?>) getDescription()).basicRemove(otherEnd,
					msgs);
		case TraceabilityPackage.TRACE__TARGET_REFERENCES:
			return ((InternalEList<?>) getTargetReferences()).basicRemove(
					otherEnd, msgs);
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			return eInternalContainer().eInverseRemove(this,
					TraceabilityPackage.TRACE_MODEL__TRACES, TraceModel.class,
					msgs);
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			if (resolve)
				return getTraceMdl();
			return basicGetTraceMdl();
		case TraceabilityPackage.TRACE__SOURCE_REFERENCES:
			return getSourceReferences();
		case TraceabilityPackage.TRACE__DESCRIPTION:
			return getDescription();
		case TraceabilityPackage.TRACE__TARGET_REFERENCES:
			return getTargetReferences();
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			setTraceMdl((TraceModel) newValue);
			return;
		case TraceabilityPackage.TRACE__SOURCE_REFERENCES:
			getSourceReferences().clear();
			getSourceReferences().addAll(
					(Collection<? extends Reference>) newValue);
			return;
		case TraceabilityPackage.TRACE__DESCRIPTION:
			getDescription().clear();
			getDescription().addAll((Collection<? extends Message>) newValue);
			return;
		case TraceabilityPackage.TRACE__TARGET_REFERENCES:
			getTargetReferences().clear();
			getTargetReferences().addAll(
					(Collection<? extends Reference>) newValue);
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			setTraceMdl((TraceModel) null);
			return;
		case TraceabilityPackage.TRACE__SOURCE_REFERENCES:
			getSourceReferences().clear();
			return;
		case TraceabilityPackage.TRACE__DESCRIPTION:
			getDescription().clear();
			return;
		case TraceabilityPackage.TRACE__TARGET_REFERENCES:
			getTargetReferences().clear();
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
		case TraceabilityPackage.TRACE__TRACE_MDL:
			return basicGetTraceMdl() != null;
		case TraceabilityPackage.TRACE__SOURCE_REFERENCES:
			return sourceReferences != null && !sourceReferences.isEmpty();
		case TraceabilityPackage.TRACE__DESCRIPTION:
			return description != null && !description.isEmpty();
		case TraceabilityPackage.TRACE__TARGET_REFERENCES:
			return targetReferences != null && !targetReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
