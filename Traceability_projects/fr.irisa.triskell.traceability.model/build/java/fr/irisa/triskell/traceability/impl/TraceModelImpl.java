/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceModelImpl.java,v 1.1 2007-05-03 07:40:06 dvojtise Exp $
 */
package fr.irisa.triskell.traceability.impl;

import fr.irisa.triskell.traceability.Message;
import fr.irisa.triskell.traceability.Reference;
import fr.irisa.triskell.traceability.Trace;
import fr.irisa.triskell.traceability.TraceModel;
import fr.irisa.triskell.traceability.TraceabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.traceability.impl.TraceModelImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.impl.TraceModelImpl#getReferences <em>References</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.impl.TraceModelImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceModelImpl extends EObjectImpl implements TraceModel {
	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList traces = null;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList references = null;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList messages = null;

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
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentWithInverseEList(Trace.class, this, TraceabilityPackage.TRACE_MODEL__TRACES, TraceabilityPackage.TRACE__TRACE_MDL);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferences() {
		if (references == null) {
			references = new EObjectContainmentWithInverseEList(Reference.class, this, TraceabilityPackage.TRACE_MODEL__REFERENCES, TraceabilityPackage.REFERENCE__TRACE_MDL);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList(Message.class, this, TraceabilityPackage.TRACE_MODEL__MESSAGES, TraceabilityPackage.MESSAGE__TRACE_MDL);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.TRACE_MODEL__TRACES:
				return ((InternalEList)getTraces()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__REFERENCES:
				return ((InternalEList)getReferences()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__MESSAGES:
				return ((InternalEList)getMessages()).basicAdd(otherEnd, msgs);
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
			case TraceabilityPackage.TRACE_MODEL__TRACES:
				return ((InternalEList)getTraces()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__REFERENCES:
				return ((InternalEList)getReferences()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__MESSAGES:
				return ((InternalEList)getMessages()).basicRemove(otherEnd, msgs);
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
			case TraceabilityPackage.TRACE_MODEL__TRACES:
				return getTraces();
			case TraceabilityPackage.TRACE_MODEL__REFERENCES:
				return getReferences();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityPackage.TRACE_MODEL__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection)newValue);
				return;
			case TraceabilityPackage.TRACE_MODEL__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection)newValue);
				return;
			case TraceabilityPackage.TRACE_MODEL__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection)newValue);
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
			case TraceabilityPackage.TRACE_MODEL__TRACES:
				getTraces().clear();
				return;
			case TraceabilityPackage.TRACE_MODEL__REFERENCES:
				getReferences().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TraceabilityPackage.TRACE_MODEL__TRACES:
				return traces != null && !traces.isEmpty();
			case TraceabilityPackage.TRACE_MODEL__REFERENCES:
				return references != null && !references.isEmpty();
			case TraceabilityPackage.TRACE_MODEL__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceModelImpl