/**
 * <copyright>
 * </copyright>
 *
 * $Id: OutImpl.java,v 1.12 2008-05-28 09:26:14 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#isIndependant <em>Independant</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutImpl extends EObjectImpl implements Out {
	/**
	 * The default value of the '{@link #isIndependant() <em>Independant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndependant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDEPENDANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndependant() <em>Independant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndependant()
	 * @generated
	 * @ordered
	 */
	protected boolean independant = INDEPENDANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected String extensionPoint = EXTENSION_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID != KpmPackage.OUT__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, KpmPackage.OUT__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID != KpmPackage.OUT__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, KpmPackage.RULE__OUTS, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.OUT__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndependant() {
		return independant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndependant(boolean newIndependant) {
		boolean oldIndependant = independant;
		independant = newIndependant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.OUT__INDEPENDANT, oldIndependant, independant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, KpmPackage.OUT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionPoint() {
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPoint(String newExtensionPoint) {
		String oldExtensionPoint = extensionPoint;
		extensionPoint = newExtensionPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.OUT__EXTENSION_POINT, oldExtensionPoint, extensionPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.OUT__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
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
			case KpmPackage.OUT__RULE:
				return basicSetRule(null, msgs);
			case KpmPackage.OUT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
		switch (eContainerFeatureID) {
			case KpmPackage.OUT__RULE:
				return eInternalContainer().eInverseRemove(this, KpmPackage.RULE__OUTS, Rule.class, msgs);
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
			case KpmPackage.OUT__RULE:
				return getRule();
			case KpmPackage.OUT__INDEPENDANT:
				return isIndependant() ? Boolean.TRUE : Boolean.FALSE;
			case KpmPackage.OUT__PARAMETERS:
				return getParameters();
			case KpmPackage.OUT__EXTENSION_POINT:
				return getExtensionPoint();
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
			case KpmPackage.OUT__RULE:
				setRule((Rule)newValue);
				return;
			case KpmPackage.OUT__INDEPENDANT:
				setIndependant(((Boolean)newValue).booleanValue());
				return;
			case KpmPackage.OUT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case KpmPackage.OUT__EXTENSION_POINT:
				setExtensionPoint((String)newValue);
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
			case KpmPackage.OUT__RULE:
				setRule((Rule)null);
				return;
			case KpmPackage.OUT__INDEPENDANT:
				setIndependant(INDEPENDANT_EDEFAULT);
				return;
			case KpmPackage.OUT__PARAMETERS:
				getParameters().clear();
				return;
			case KpmPackage.OUT__EXTENSION_POINT:
				setExtensionPoint(EXTENSION_POINT_EDEFAULT);
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
			case KpmPackage.OUT__RULE:
				return getRule() != null;
			case KpmPackage.OUT__INDEPENDANT:
				return independant != INDEPENDANT_EDEFAULT;
			case KpmPackage.OUT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case KpmPackage.OUT__EXTENSION_POINT:
				return EXTENSION_POINT_EDEFAULT == null ? extensionPoint != null : !EXTENSION_POINT_EDEFAULT.equals(extensionPoint);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (independant: ");
		result.append(independant);
		result.append(", extensionPoint: ");
		result.append(extensionPoint);
		result.append(')');
		return result.toString();
	}
	
} //OutImpl