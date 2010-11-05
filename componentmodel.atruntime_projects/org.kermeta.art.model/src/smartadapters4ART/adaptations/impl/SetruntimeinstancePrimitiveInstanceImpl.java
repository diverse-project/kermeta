/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations.impl;

import art_relaxed.instance_relaxed.CompositeInstance;
import art_relaxed.instance_relaxed.PrimitiveInstance;
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
import smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance;

import smartadapters4ART.impl.SetAdaptationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setruntimeinstance Primitive Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getPrimitiveInstanceToSet <em>Primitive Instance To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getReftype <em>Reftype</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getRefstate <em>Refstate</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getRefsuperComponent <em>Refsuper Component</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getRefattribute <em>Refattribute</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getRefbinding <em>Refbinding</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.impl.SetruntimeinstancePrimitiveInstanceImpl#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetruntimeinstancePrimitiveInstanceImpl extends SetAdaptationImpl implements SetruntimeinstancePrimitiveInstance {
	/**
	 * The cached value of the '{@link #getPrimitiveInstanceToSet() <em>Primitive Instance To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveInstanceToSet()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveInstance primitiveInstanceToSet;

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
	protected SetruntimeinstancePrimitiveInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInstance getPrimitiveInstanceToSet() {
		if (primitiveInstanceToSet != null && primitiveInstanceToSet.eIsProxy()) {
			InternalEObject oldPrimitiveInstanceToSet = (InternalEObject)primitiveInstanceToSet;
			primitiveInstanceToSet = (PrimitiveInstance)eResolveProxy(oldPrimitiveInstanceToSet);
			if (primitiveInstanceToSet != oldPrimitiveInstanceToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET, oldPrimitiveInstanceToSet, primitiveInstanceToSet));
			}
		}
		return primitiveInstanceToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInstance basicGetPrimitiveInstanceToSet() {
		return primitiveInstanceToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveInstanceToSet(PrimitiveInstance newPrimitiveInstanceToSet) {
		PrimitiveInstance oldPrimitiveInstanceToSet = primitiveInstanceToSet;
		primitiveInstanceToSet = newPrimitiveInstanceToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET, oldPrimitiveInstanceToSet, primitiveInstanceToSet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE, oldReftype, reftype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE, oldReftype, reftype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE, oldRefstate, refstate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT, oldRefsuperComponent, refsuperComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT, oldRefsuperComponent, refsuperComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedAttribute> getRefattribute() {
		if (refattribute == null) {
			refattribute = new EObjectResolvingEList<ValuedAttribute>(ValuedAttribute.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE);
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
			refbinding = new EObjectResolvingEList<TransmissionBinding>(TransmissionBinding.class, this, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME, oldRefname, refname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET:
				if (resolve) return getPrimitiveInstanceToSet();
				return basicGetPrimitiveInstanceToSet();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE:
				if (resolve) return getReftype();
				return basicGetReftype();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE:
				return getRefstate();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT:
				if (resolve) return getRefsuperComponent();
				return basicGetRefsuperComponent();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE:
				return getRefattribute();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING:
				return getRefbinding();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME:
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET:
				setPrimitiveInstanceToSet((PrimitiveInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE:
				setReftype((ComponentType)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE:
				setRefstate((String)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT:
				setRefsuperComponent((CompositeInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE:
				getRefattribute().clear();
				getRefattribute().addAll((Collection<? extends ValuedAttribute>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING:
				getRefbinding().clear();
				getRefbinding().addAll((Collection<? extends TransmissionBinding>)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME:
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET:
				setPrimitiveInstanceToSet((PrimitiveInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE:
				setReftype((ComponentType)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE:
				setRefstate(REFSTATE_EDEFAULT);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT:
				setRefsuperComponent((CompositeInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE:
				getRefattribute().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING:
				getRefbinding().clear();
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME:
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET:
				return primitiveInstanceToSet != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE:
				return reftype != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE:
				return REFSTATE_EDEFAULT == null ? refstate != null : !REFSTATE_EDEFAULT.equals(refstate);
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT:
				return refsuperComponent != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE:
				return refattribute != null && !refattribute.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING:
				return refbinding != null && !refbinding.isEmpty();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME:
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

} //SetruntimeinstancePrimitiveInstanceImpl
