/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance.impl;

import art.impl.ModelElementImpl;

import art.implem.ComponentImplementation;

import art.instance.ComponentInstance;
import art.instance.CompositeInstance;
import art.instance.InstancePackage;
import art.instance.TransmissionBinding;
import art.instance.ValuedAttribute;

import art.type.ComponentType;
import art.type.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentInstanceImpl extends ModelElementImpl implements
		ComponentInstance {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionBinding> binding;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedAttribute> attribute;

	/**
	 * The cached value of the '{@link #getImplem() <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplem()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation implem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionBinding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList.Resolving<TransmissionBinding>(
					TransmissionBinding.class, this,
					InstancePackage.COMPONENT_INSTANCE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (ComponentType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InstancePackage.COMPONENT_INSTANCE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentType newType) {
		ComponentType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InstancePackage.COMPONENT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance getSuperComponent() {
		if (eContainerFeatureID != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT)
			return null;
		return (CompositeInstance) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance basicGetSuperComponent() {
		if (eContainerFeatureID != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT)
			return null;
		return (CompositeInstance) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperComponent(
			CompositeInstance newSuperComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperComponent,
				InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperComponent(CompositeInstance newSuperComponent) {
		if (newSuperComponent != eInternalContainer()
				|| (eContainerFeatureID != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT && newSuperComponent != null)) {
			if (EcoreUtil.isAncestor(this, newSuperComponent))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperComponent != null)
				msgs = ((InternalEObject) newSuperComponent).eInverseAdd(this,
						InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT,
						CompositeInstance.class, msgs);
			msgs = basicSetSuperComponent(newSuperComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT,
					newSuperComponent, newSuperComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InstancePackage.COMPONENT_INSTANCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedAttribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList.Resolving<ValuedAttribute>(
					ValuedAttribute.class, this,
					InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation getImplem() {
		if (implem != null && implem.eIsProxy()) {
			InternalEObject oldImplem = (InternalEObject) implem;
			implem = (ComponentImplementation) eResolveProxy(oldImplem);
			if (implem != oldImplem) {
				InternalEObject newImplem = (InternalEObject) implem;
				NotificationChain msgs = oldImplem.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- InstancePackage.COMPONENT_INSTANCE__IMPLEM,
						null, null);
				if (newImplem.eInternalContainer() == null) {
					msgs = newImplem.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- InstancePackage.COMPONENT_INSTANCE__IMPLEM, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							InstancePackage.COMPONENT_INSTANCE__IMPLEM,
							oldImplem, implem));
			}
		}
		return implem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation basicGetImplem() {
		return implem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplem(ComponentImplementation newImplem,
			NotificationChain msgs) {
		ComponentImplementation oldImplem = implem;
		implem = newImplem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					InstancePackage.COMPONENT_INSTANCE__IMPLEM, oldImplem,
					newImplem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplem(ComponentImplementation newImplem) {
		if (newImplem != implem) {
			NotificationChain msgs = null;
			if (implem != null)
				msgs = ((InternalEObject) implem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- InstancePackage.COMPONENT_INSTANCE__IMPLEM,
						null, msgs);
			if (newImplem != null)
				msgs = ((InternalEObject) newImplem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- InstancePackage.COMPONENT_INSTANCE__IMPLEM,
						null, msgs);
			msgs = basicSetImplem(newImplem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InstancePackage.COMPONENT_INSTANCE__IMPLEM, newImplem,
					newImplem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperationEMF_renameAs() {
		kermeta.standard.OrderedSet<art.type.Operation> result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getterOperation() {

		kermeta.standard.OrderedSet<art.type.Operation> result = null;

		result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<art.type.Operation> convertAsOrderedSet(this
						.getOperationEMF_renameAs());

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionBinding> getterGetAllBindings() {

		kermeta.standard.OrderedSet<art.instance.TransmissionBinding> result = null;

		kermeta.standard.OrderedSet<art.instance.TransmissionBinding> res = ((kermeta.standard.OrderedSet<art.instance.TransmissionBinding>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		res.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<art.instance.TransmissionBinding> convertAsOrderedSet(this
						.getBinding()));

		java.lang.Boolean idIfCond_361 = false;
		idIfCond_361 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"art.instance.CompositeInstance"));

		if (idIfCond_361) {

			//BIft:each

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<art.instance.ComponentInstance> convertAsOrderedSet(
								((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"art.instance.CompositeInstance")))
										.getSubComponent()).iterator();
				java.lang.Boolean idLoopCond_362 = false;
				while (!idLoopCond_362) {
					idLoopCond_362 = it_ft88.isOff();
					if (idLoopCond_362) {
					} else {

						//BIle:func
						art.instance.ComponentInstance sub_lbdExp88 = it_ft88
								.next();

						res
								.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<art.instance.TransmissionBinding> convertAsOrderedSet(sub_lbdExp88
												.getterGetAllBindings()));
						//EIle:func

					}
				}
			}

			//EIft:each

		}

		result = res;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getterOperationAsString() {

		kermeta.standard.Sequence<java.lang.String> result = null;

		result = null;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getterDependentComponents() {

		kermeta.standard.OrderedSet<art.instance.ComponentInstance> result = null;

		kermeta.standard.Set<art.instance.ComponentInstance> res = ((kermeta.standard.Set<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		art.instance.CompositeInstance composite = this.getSuperComponent();

		java.lang.Boolean idIfCond_363 = false;
		idIfCond_363 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(composite, null);

		if (idIfCond_363) {

			java.lang.Boolean idIfCond_364 = false;
			idIfCond_364 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"art.instance.CompositeInstance"));

			if (idIfCond_364) {

				res
						.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.ComponentInstance> convertAsOrderedSet(((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"art.instance.CompositeInstance")))
										.getSubComponent()));
			}

			//BIft:select

			kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft89 = null;

			art.instance.ComponentInstance elem_ft89 = null;

			result_ft89 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.standard.StandardPackage.eINSTANCE
							.getSequence()));

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<art.instance.ComponentInstance> convertAsOrderedSet(
								composite.getSubComponent()).iterator();
				java.lang.Boolean idLoopCond_365 = false;
				while (!idLoopCond_365) {
					idLoopCond_365 = it_ft89.isOff();
					if (idLoopCond_365) {
					} else {

						elem_ft89 = it_ft89.next();

						java.lang.Boolean idIfCond_366 = false;
						//BIle:selector
						art.instance.ComponentInstance c_lbdExp89 = elem_ft89;

						//BIft:exists

						java.lang.Boolean result_ft90 = null;

						java.lang.Boolean test_ft90 = false;

						{

							kermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.instance.TransmissionBinding> convertAsOrderedSet(
											c_lbdExp89.getBinding()).iterator();
							java.lang.Boolean idLoopCond_367 = false;
							while (!idLoopCond_367) {
								idLoopCond_367 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft90.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft90,
																false));
								if (idLoopCond_367) {
								} else {

									java.lang.Boolean result_lambda_ft90 = null;
									//BIle:func
									art.instance.TransmissionBinding b_lbdExp90 = it_ft90
											.next();

									result_lambda_ft90 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(b_lbdExp90
													.getServerInstance(), this);
									//EIle:func

									test_ft90 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft90, result_lambda_ft90);
								}
							}
						}

						result_ft90 = test_ft90;
						//EIft:exists
						idIfCond_366 = result_ft90;

						//EIle:selector

						if (idIfCond_366) {

							result_ft89.add(elem_ft89);
						}

					}
				}
			}

			//EIft:select
			res.addAll(result_ft89);

			//BIft:select

			kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft93 = null;

			art.instance.ComponentInstance elem_ft93 = null;

			result_ft93 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.standard.StandardPackage.eINSTANCE
							.getSequence()));

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<art.instance.ComponentInstance> convertAsOrderedSet(
								composite.getSubComponent()).iterator();
				java.lang.Boolean idLoopCond_371 = false;
				while (!idLoopCond_371) {
					idLoopCond_371 = it_ft93.isOff();
					if (idLoopCond_371) {
					} else {

						elem_ft93 = it_ft93.next();

						java.lang.Boolean idIfCond_372 = false;
						//BIle:selector
						art.instance.ComponentInstance c_lbdExp93 = elem_ft93;

						idIfCond_372 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										c_lbdExp93,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"art.instance.CompositeInstance"));
						//EIle:selector

						if (idIfCond_372) {

							result_ft93.add(elem_ft93);
						}

					}
				}
			}

			//EIft:select
			//BIft:select

			kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft91 = null;

			art.instance.ComponentInstance elem_ft91 = null;

			result_ft91 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.standard.StandardPackage.eINSTANCE
							.getSequence()));

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft91 = result_ft93
						.iterator();
				java.lang.Boolean idLoopCond_368 = false;
				while (!idLoopCond_368) {
					idLoopCond_368 = it_ft91.isOff();
					if (idLoopCond_368) {
					} else {

						elem_ft91 = it_ft91.next();

						java.lang.Boolean idIfCond_369 = false;
						//BIle:selector
						art.instance.ComponentInstance c_lbdExp91 = elem_ft91;

						//BIft:exists

						java.lang.Boolean result_ft92 = null;

						java.lang.Boolean test_ft92 = false;

						{

							kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.instance.DelegationBinding> convertAsOrderedSet(
											((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															c_lbdExp91,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"art.instance.CompositeInstance")))
													.getDelegation())
									.iterator();
							java.lang.Boolean idLoopCond_370 = false;
							while (!idLoopCond_370) {
								idLoopCond_370 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft92.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft92,
																false));
								if (idLoopCond_370) {
								} else {

									java.lang.Boolean result_lambda_ft92 = null;
									//BIle:func
									art.instance.DelegationBinding d_lbdExp92 = it_ft92
											.next();

									result_lambda_ft92 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(d_lbdExp92
													.getServerInstance(), this);
									//EIle:func

									test_ft92 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft92, result_lambda_ft92);
								}
							}
						}

						result_ft92 = test_ft92;
						//EIft:exists
						idIfCond_369 = result_ft92;

						//EIle:selector

						if (idIfCond_369) {

							result_ft91.add(elem_ft91);
						}

					}
				}
			}

			//EIft:select

		}

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperComponent((CompositeInstance) otherEnd, msgs);
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
		case InstancePackage.COMPONENT_INSTANCE__BINDING:
			return ((InternalEList<?>) getBinding())
					.basicRemove(otherEnd, msgs);
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			return basicSetSuperComponent(null, msgs);
		case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
			return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd,
					msgs);
		case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
			return basicSetImplem(null, msgs);
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
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			return eInternalContainer().eInverseRemove(this,
					InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT,
					CompositeInstance.class, msgs);
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
		case InstancePackage.COMPONENT_INSTANCE__BINDING:
			return getBinding();
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			if (resolve)
				return getSuperComponent();
			return basicGetSuperComponent();
		case InstancePackage.COMPONENT_INSTANCE__STATE:
			return getState();
		case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
			return getAttribute();
		case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
			if (resolve)
				return getImplem();
			return basicGetImplem();
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
		case InstancePackage.COMPONENT_INSTANCE__BINDING:
			getBinding().clear();
			getBinding().addAll(
					(Collection<? extends TransmissionBinding>) newValue);
			return;
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			setType((ComponentType) newValue);
			return;
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			setSuperComponent((CompositeInstance) newValue);
			return;
		case InstancePackage.COMPONENT_INSTANCE__STATE:
			setState((String) newValue);
			return;
		case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll(
					(Collection<? extends ValuedAttribute>) newValue);
			return;
		case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
			setImplem((ComponentImplementation) newValue);
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
		case InstancePackage.COMPONENT_INSTANCE__BINDING:
			getBinding().clear();
			return;
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			setType((ComponentType) null);
			return;
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			setSuperComponent((CompositeInstance) null);
			return;
		case InstancePackage.COMPONENT_INSTANCE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
			getAttribute().clear();
			return;
		case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
			setImplem((ComponentImplementation) null);
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
		case InstancePackage.COMPONENT_INSTANCE__BINDING:
			return binding != null && !binding.isEmpty();
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			return type != null;
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			return basicGetSuperComponent() != null;
		case InstancePackage.COMPONENT_INSTANCE__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT
					.equals(state);
		case InstancePackage.COMPONENT_INSTANCE__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case InstancePackage.COMPONENT_INSTANCE__IMPLEM:
			return implem != null;
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
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
