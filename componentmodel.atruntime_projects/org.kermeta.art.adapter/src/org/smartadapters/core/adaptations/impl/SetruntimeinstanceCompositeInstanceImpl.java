/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.smartadapters.core.adaptations.AdaptationsPackage;
import org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance;

import org.smartadapters.core.impl.setAdaptationImpl;

import pattern.art.instance.ComponentInstance;
import pattern.art.instance.CompositeInstance;
import pattern.art.instance.DelegationBinding;
import pattern.art.instance.TransmissionBinding;
import pattern.art.instance.ValuedAttribute;

import pattern.art.type.ComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setruntimeinstance Composite Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getCompositeInstanceToSet <em>Composite Instance To Set</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefsubComponent <em>Refsub Component</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefdelegation <em>Refdelegation</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getReftype <em>Reftype</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefstate <em>Refstate</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefsuperComponent <em>Refsuper Component</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefattribute <em>Refattribute</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefbinding <em>Refbinding</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceCompositeInstanceImpl#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetruntimeinstanceCompositeInstanceImpl extends setAdaptationImpl implements SetruntimeinstanceCompositeInstance {
	/**
	 * The cached value of the '{@link #getCompositeInstanceToSet() <em>Composite Instance To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeInstanceToSet()
	 * @generated
	 * @ordered
	 */
	protected CompositeInstance compositeInstanceToSet;

	/**
	 * The cached value of the '{@link #getRefsubComponent() <em>Refsub Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefsubComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> refsubComponent;

	/**
	 * The cached value of the '{@link #getRefdelegation() <em>Refdelegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefdelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationBinding> refdelegation;

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
	protected SetruntimeinstanceCompositeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getCompositeInstanceToSet() {
		if (compositeInstanceToSet != null && compositeInstanceToSet.eIsProxy()) {
			InternalEObject oldCompositeInstanceToSet = (InternalEObject)compositeInstanceToSet;
			compositeInstanceToSet = (CompositeInstance)eResolveProxy(oldCompositeInstanceToSet);
			if (compositeInstanceToSet != oldCompositeInstanceToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET, oldCompositeInstanceToSet, compositeInstanceToSet));
			}
		}
		return compositeInstanceToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance basicGetCompositeInstanceToSet() {
		return compositeInstanceToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeInstanceToSet(CompositeInstance newCompositeInstanceToSet) {
		CompositeInstance oldCompositeInstanceToSet = compositeInstanceToSet;
		compositeInstanceToSet = newCompositeInstanceToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET, oldCompositeInstanceToSet, compositeInstanceToSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getRefsubComponent() {
		if (refsubComponent == null) {
			refsubComponent = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT);
		}
		return refsubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationBinding> getRefdelegation() {
		if (refdelegation == null) {
			refdelegation = new EObjectResolvingEList<DelegationBinding>(DelegationBinding.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION);
		}
		return refdelegation;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE, oldReftype, reftype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE, oldReftype, reftype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE, oldRefstate, refstate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT, oldRefsuperComponent, refsuperComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT, oldRefsuperComponent, refsuperComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedAttribute> getRefattribute() {
		if (refattribute == null) {
			refattribute = new EObjectResolvingEList<ValuedAttribute>(ValuedAttribute.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE);
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
			refbinding = new EObjectResolvingEList<TransmissionBinding>(TransmissionBinding.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME, oldRefname, refname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET:
				if (resolve) return getCompositeInstanceToSet();
				return basicGetCompositeInstanceToSet();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT:
				return getRefsubComponent();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION:
				return getRefdelegation();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE:
				if (resolve) return getReftype();
				return basicGetReftype();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE:
				return getRefstate();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT:
				if (resolve) return getRefsuperComponent();
				return basicGetRefsuperComponent();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE:
				return getRefattribute();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING:
				return getRefbinding();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME:
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET:
				setCompositeInstanceToSet((CompositeInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT:
				getRefsubComponent().clear();
				getRefsubComponent().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION:
				getRefdelegation().clear();
				getRefdelegation().addAll((Collection<? extends DelegationBinding>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE:
				setReftype((ComponentType)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE:
				setRefstate((String)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT:
				setRefsuperComponent((CompositeInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE:
				getRefattribute().clear();
				getRefattribute().addAll((Collection<? extends ValuedAttribute>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING:
				getRefbinding().clear();
				getRefbinding().addAll((Collection<? extends TransmissionBinding>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME:
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET:
				setCompositeInstanceToSet((CompositeInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT:
				getRefsubComponent().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION:
				getRefdelegation().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE:
				setReftype((ComponentType)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE:
				setRefstate(REFSTATE_EDEFAULT);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT:
				setRefsuperComponent((CompositeInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE:
				getRefattribute().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING:
				getRefbinding().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME:
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET:
				return compositeInstanceToSet != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT:
				return refsubComponent != null && !refsubComponent.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION:
				return refdelegation != null && !refdelegation.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE:
				return reftype != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE:
				return REFSTATE_EDEFAULT == null ? refstate != null : !REFSTATE_EDEFAULT.equals(refstate);
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT:
				return refsuperComponent != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE:
				return refattribute != null && !refattribute.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING:
				return refbinding != null && !refbinding.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME:
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

} //SetruntimeinstanceCompositeInstanceImpl
