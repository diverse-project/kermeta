/**
 * <copyright>
 * </copyright>
 *
 * $Id: MessageImpl.java,v 1.6 2008-10-28 13:18:26 cfaucher Exp $
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
import traceability.Trace;
import traceability.TraceModel;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.MessageImpl#getTraceMdl <em>Trace Mdl</em>}</li>
 *   <li>{@link traceability.impl.MessageImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.impl.MessageImpl#getValue <em>Value</em>}</li>
 *   <li>{@link traceability.impl.MessageImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link traceability.impl.MessageImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends ObjectImpl implements Message {
	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel getTraceMdl() {
		if (eContainerFeatureID != TraceabilityPackage.MESSAGE__TRACE_MDL)
			return null;
		return (TraceModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel basicGetTraceMdl() {
		if (eContainerFeatureID != TraceabilityPackage.MESSAGE__TRACE_MDL)
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
				TraceabilityPackage.MESSAGE__TRACE_MDL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceMdl(TraceModel newTraceMdl) {
		if (newTraceMdl != eInternalContainer()
				|| (eContainerFeatureID != TraceabilityPackage.MESSAGE__TRACE_MDL && newTraceMdl != null)) {
			if (EcoreUtil.isAncestor(this, newTraceMdl))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTraceMdl != null)
				msgs = ((InternalEObject) newTraceMdl).eInverseAdd(this,
						TraceabilityPackage.TRACE_MODEL__MESSAGES,
						TraceModel.class, msgs);
			msgs = basicSetTraceMdl(newTraceMdl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.MESSAGE__TRACE_MDL, newTraceMdl,
					newTraceMdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectWithInverseResolvingEList.ManyInverse<Trace>(
					Trace.class, this, TraceabilityPackage.MESSAGE__TRACES,
					TraceabilityPackage.TRACE__DESCRIPTION);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.MESSAGE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.MESSAGE__LANGUAGE, oldLanguage,
					language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.MESSAGE__TYPE, oldType, type));
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTraceMdl((TraceModel) otherEnd, msgs);
		case TraceabilityPackage.MESSAGE__TRACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTraces())
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			return basicSetTraceMdl(null, msgs);
		case TraceabilityPackage.MESSAGE__TRACES:
			return ((InternalEList<?>) getTraces()).basicRemove(otherEnd, msgs);
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			return eInternalContainer().eInverseRemove(this,
					TraceabilityPackage.TRACE_MODEL__MESSAGES,
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			if (resolve)
				return getTraceMdl();
			return basicGetTraceMdl();
		case TraceabilityPackage.MESSAGE__TRACES:
			return getTraces();
		case TraceabilityPackage.MESSAGE__VALUE:
			return getValue();
		case TraceabilityPackage.MESSAGE__LANGUAGE:
			return getLanguage();
		case TraceabilityPackage.MESSAGE__TYPE:
			return getType();
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			setTraceMdl((TraceModel) newValue);
			return;
		case TraceabilityPackage.MESSAGE__TRACES:
			getTraces().clear();
			getTraces().addAll((Collection<? extends Trace>) newValue);
			return;
		case TraceabilityPackage.MESSAGE__VALUE:
			setValue((String) newValue);
			return;
		case TraceabilityPackage.MESSAGE__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case TraceabilityPackage.MESSAGE__TYPE:
			setType((String) newValue);
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			setTraceMdl((TraceModel) null);
			return;
		case TraceabilityPackage.MESSAGE__TRACES:
			getTraces().clear();
			return;
		case TraceabilityPackage.MESSAGE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case TraceabilityPackage.MESSAGE__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case TraceabilityPackage.MESSAGE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case TraceabilityPackage.MESSAGE__TRACE_MDL:
			return basicGetTraceMdl() != null;
		case TraceabilityPackage.MESSAGE__TRACES:
			return traces != null && !traces.isEmpty();
		case TraceabilityPackage.MESSAGE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT
					.equals(value);
		case TraceabilityPackage.MESSAGE__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null
					: !LANGUAGE_EDEFAULT.equals(language);
		case TraceabilityPackage.MESSAGE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", language: ");
		result.append(language);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
