/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations.impl;

import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.CompositeInstance;
import art_relaxed.instance_relaxed.TransmissionBinding;
import art_relaxed.instance_relaxed.ValuedAttribute;

import art_relaxed.type_relaxed.ComponentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smartadapters4ART.adaptations.AdaptationsPackage;
import smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance;

import smartadapters4ART.impl.SetAdaptationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setruntimeinstance Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getComponentInstanceToSet <em>Component Instance To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getReftype <em>Reftype</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getRefstate <em>Refstate</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getRefsuperComponent <em>Refsuper Component</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getRefattribute <em>Refattribute</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getRefbinding <em>Refbinding</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstanceComponentInstanceImpl#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetruntimeinstanceComponentInstanceImpl extends SetAdaptationImpl implements SetruntimeinstanceComponentInstance {
	/**
	 * The cached value of the '{@link #getComponentInstanceToSet() <em>Component Instance To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceToSet()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstanceToSet;

	/**
	 * The cached value of the '{@link #getReftype() <em>Reftype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReftype()
	 * @generated
	 * @ordered
	 */
	protected ComponentType reftype;

	/**
	 * The default value of the '{@link #getRefstate() <em>Refstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefstate()
	 * @generated
	 * @ordered
	 */
	protected static final String REFSTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefstate() <em>Refstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefstate()
	 * @generated
	 * @ordered
	 */
	protected String refstate = REFSTATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefsuperComponent() <em>Refsuper Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefsuperComponent()
	 * @generated
	 * @ordered
	 */
	protected CompositeInstance refsuperComponent;

	/**
	 * The cached value of the '{@link #getRefattribute() <em>Refattribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefattribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedAttribute> refattribute;

	/**
	 * The cached value of the '{@link #getRefbinding() <em>Refbinding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefbinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionBinding> refbinding;

	/**
	 * The default value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected static final String REFNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected String refname = REFNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetruntimeinstanceComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstanceToSet() {
		if (componentInstanceToSet != null && componentInstanceToSet.eIsProxy()) {
			InternalEObject oldComponentInstanceToSet = (InternalEObject)componentInstanceToSet;
			componentInstanceToSet = (ComponentInstance)eResolveProxy(oldComponentInstanceToSet);
			if (componentInstanceToSet != oldComponentInstanceToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET, oldComponentInstanceToSet, componentInstanceToSet));
			}
		}
		return componentInstanceToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstanceToSet() {
		return componentInstanceToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstanceToSet(ComponentInstance newComponentInstanceToSet) {
		ComponentInstance oldComponentInstanceToSet = componentInstanceToSet;
		componentInstanceToSet = newComponentInstanceToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET, oldComponentInstanceToSet, componentInstanceToSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getReftype() {
		if (reftype != null && reftype.eIsProxy()) {
			InternalEObject oldReftype = (InternalEObject)reftype;
			reftype = (ComponentType)eResolveProxy(oldReftype);
			if (reftype != oldReftype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE, oldReftype, reftype));
			}
		}
		return reftype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetReftype() {
		return reftype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReftype(ComponentType newReftype) {
		ComponentType oldReftype = reftype;
		reftype = newReftype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE, oldReftype, reftype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefstate() {
		return refstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefstate(String newRefstate) {
		String oldRefstate = refstate;
		refstate = newRefstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE, oldRefstate, refstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getRefsuperComponent() {
		if (refsuperComponent != null && refsuperComponent.eIsProxy()) {
			InternalEObject oldRefsuperComponent = (InternalEObject)refsuperComponent;
			refsuperComponent = (CompositeInstance)eResolveProxy(oldRefsuperComponent);
			if (refsuperComponent != oldRefsuperComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT, oldRefsuperComponent, refsuperComponent));
			}
		}
		return refsuperComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance basicGetRefsuperComponent() {
		return refsuperComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefsuperComponent(CompositeInstance newRefsuperComponent) {
		CompositeInstance oldRefsuperComponent = refsuperComponent;
		refsuperComponent = newRefsuperComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT, oldRefsuperComponent, refsuperComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedAttribute> getRefattribute() {
		if (refattribute == null) {
			refattribute = new EObjectResolvingEList<ValuedAttribute>(ValuedAttribute.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE);
		}
		return refattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionBinding> getRefbinding() {
		if (refbinding == null) {
			refbinding = new EObjectResolvingEList<TransmissionBinding>(TransmissionBinding.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING);
		}
		return refbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefname() {
		return refname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefname(String newRefname) {
		String oldRefname = refname;
		refname = newRefname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME, oldRefname, refname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET:
				if (resolve) return getComponentInstanceToSet();
				return basicGetComponentInstanceToSet();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE:
				if (resolve) return getReftype();
				return basicGetReftype();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE:
				return getRefstate();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT:
				if (resolve) return getRefsuperComponent();
				return basicGetRefsuperComponent();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE:
				return getRefattribute();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING:
				return getRefbinding();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME:
				return getRefname();
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET:
				setComponentInstanceToSet((ComponentInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE:
				setReftype((ComponentType)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE:
				setRefstate((String)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT:
				setRefsuperComponent((CompositeInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE:
				getRefattribute().clear();
				getRefattribute().addAll((Collection<? extends ValuedAttribute>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING:
				getRefbinding().clear();
				getRefbinding().addAll((Collection<? extends TransmissionBinding>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME:
				setRefname((String)newValue);
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET:
				setComponentInstanceToSet((ComponentInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE:
				setReftype((ComponentType)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE:
				setRefstate(REFSTATE_EDEFAULT);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT:
				setRefsuperComponent((CompositeInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE:
				getRefattribute().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING:
				getRefbinding().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME:
				setRefname(REFNAME_EDEFAULT);
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET:
				return componentInstanceToSet != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE:
				return reftype != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE:
				return REFSTATE_EDEFAULT == null ? refstate != null : !REFSTATE_EDEFAULT.equals(refstate);
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT:
				return refsuperComponent != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE:
				return refattribute != null && !refattribute.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING:
				return refbinding != null && !refbinding.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME:
				return REFNAME_EDEFAULT == null ? refname != null : !REFNAME_EDEFAULT.equals(refname);
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
		result.append(" (refstate: ");
		result.append(refstate);
		result.append(", refname: ");
		result.append(refname);
		result.append(')');
		return result.toString();
	}

} //SetruntimeinstanceComponentInstanceImpl
