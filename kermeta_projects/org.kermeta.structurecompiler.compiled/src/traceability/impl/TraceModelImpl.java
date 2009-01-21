/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceModelImpl.java,v 1.10 2009-01-21 09:16:03 cfaucher Exp $
 */
package traceability.impl;

import java.util.Collection;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import traceability.File;
import traceability.Message;
import traceability.Reference;
import traceability.Trace;
import traceability.TraceModel;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.TraceModelImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link traceability.impl.TraceModelImpl#getReferences <em>References</em>}</li>
 *   <li>{@link traceability.impl.TraceModelImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.impl.TraceModelImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceModelImpl extends ObjectImpl implements TraceModel {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList.Resolving<File>(File.class,
					this, TraceabilityPackage.TRACE_MODEL__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentWithInverseEList.Resolving<Reference>(
					Reference.class, this,
					TraceabilityPackage.TRACE_MODEL__REFERENCES,
					TraceabilityPackage.REFERENCE__TRACE_MDL);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentWithInverseEList.Resolving<Trace>(
					Trace.class, this, TraceabilityPackage.TRACE_MODEL__TRACES,
					TraceabilityPackage.TRACE__TRACE_MDL);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList.Resolving<Message>(
					Message.class, this,
					TraceabilityPackage.TRACE_MODEL__MESSAGES,
					TraceabilityPackage.MESSAGE__TRACE_MDL);
		}
		return messages;
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
		case TraceabilityPackage.TRACE_MODEL__REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferences())
					.basicAdd(otherEnd, msgs);
		case TraceabilityPackage.TRACE_MODEL__TRACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTraces())
					.basicAdd(otherEnd, msgs);
		case TraceabilityPackage.TRACE_MODEL__MESSAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMessages())
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
		case TraceabilityPackage.TRACE_MODEL__FILES:
			return ((InternalEList<?>) getFiles()).basicRemove(otherEnd, msgs);
		case TraceabilityPackage.TRACE_MODEL__REFERENCES:
			return ((InternalEList<?>) getReferences()).basicRemove(otherEnd,
					msgs);
		case TraceabilityPackage.TRACE_MODEL__TRACES:
			return ((InternalEList<?>) getTraces()).basicRemove(otherEnd, msgs);
		case TraceabilityPackage.TRACE_MODEL__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TraceabilityPackage.TRACE_MODEL__FILES:
			return getFiles();
		case TraceabilityPackage.TRACE_MODEL__REFERENCES:
			return getReferences();
		case TraceabilityPackage.TRACE_MODEL__TRACES:
			return getTraces();
		case TraceabilityPackage.TRACE_MODEL__MESSAGES:
			return getMessages();
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
		case TraceabilityPackage.TRACE_MODEL__FILES:
			getFiles().clear();
			getFiles().addAll((Collection<? extends File>) newValue);
			return;
		case TraceabilityPackage.TRACE_MODEL__REFERENCES:
			getReferences().clear();
			getReferences().addAll((Collection<? extends Reference>) newValue);
			return;
		case TraceabilityPackage.TRACE_MODEL__TRACES:
			getTraces().clear();
			getTraces().addAll((Collection<? extends Trace>) newValue);
			return;
		case TraceabilityPackage.TRACE_MODEL__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
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
		case TraceabilityPackage.TRACE_MODEL__FILES:
			getFiles().clear();
			return;
		case TraceabilityPackage.TRACE_MODEL__REFERENCES:
			getReferences().clear();
			return;
		case TraceabilityPackage.TRACE_MODEL__TRACES:
			getTraces().clear();
			return;
		case TraceabilityPackage.TRACE_MODEL__MESSAGES:
			getMessages().clear();
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
		case TraceabilityPackage.TRACE_MODEL__FILES:
			return files != null && !files.isEmpty();
		case TraceabilityPackage.TRACE_MODEL__REFERENCES:
			return references != null && !references.isEmpty();
		case TraceabilityPackage.TRACE_MODEL__TRACES:
			return traces != null && !traces.isEmpty();
		case TraceabilityPackage.TRACE_MODEL__MESSAGES:
			return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceModelImpl
