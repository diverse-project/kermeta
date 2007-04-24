/**
 * <copyright>
 * </copyright>
 *
 * $Id: OutImpl.java,v 1.2 2007-04-24 12:39:38 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;


import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;


import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#getAction <em>Action</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl#isIndependant <em>Independant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutImpl extends AbstractEntityImpl implements Out {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = null;

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
	protected EClass eStaticClass() {
		return KpmPackage.Literals.OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.OUT__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.OUT__ACTION, oldAction, action));
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
	 * @generated NOT
	 */
	public void process(Unit unit, IProgressMonitor monitor, Map args) {
		
		if ( evaluate(unit) ) {
		
			IExtension extension = Platform.getExtensionRegistry().getExtension(getAction().getExtensionPoint());
		
			if ( extension != null ) {
				IConfigurationElement[] elements = extension.getConfigurationElements();
				try {
					IAction action = (IAction) elements[0].createExecutableExtension("class");
					action.execute(this, unit, monitor, args);
				} catch (CoreException exception) {
					exception.printStackTrace();
				}
			}
		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.OUT__RULE:
				return basicSetRule(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.OUT__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case KpmPackage.OUT__RULE:
				return getRule();
			case KpmPackage.OUT__INDEPENDANT:
				return isIndependant() ? Boolean.TRUE : Boolean.FALSE;
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
			case KpmPackage.OUT__ACTION:
				setAction((Action)newValue);
				return;
			case KpmPackage.OUT__RULE:
				setRule((Rule)newValue);
				return;
			case KpmPackage.OUT__INDEPENDANT:
				setIndependant(((Boolean)newValue).booleanValue());
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
			case KpmPackage.OUT__ACTION:
				setAction((Action)null);
				return;
			case KpmPackage.OUT__RULE:
				setRule((Rule)null);
				return;
			case KpmPackage.OUT__INDEPENDANT:
				setIndependant(INDEPENDANT_EDEFAULT);
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
			case KpmPackage.OUT__ACTION:
				return action != null;
			case KpmPackage.OUT__RULE:
				return getRule() != null;
			case KpmPackage.OUT__INDEPENDANT:
				return independant != INDEPENDANT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (independant: ");
		result.append(independant);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluate(Unit unit) {
		return getExpression().evaluateOut( unit );
	}
	
} //OutImpl