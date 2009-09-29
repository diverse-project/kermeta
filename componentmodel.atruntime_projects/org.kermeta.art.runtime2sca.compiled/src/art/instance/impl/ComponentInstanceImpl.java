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
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link art.instance.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
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
	public CompositeInstance getSuperComponent() {
		if (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT)
			return null;
		return (CompositeInstance) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance basicGetSuperComponent() {
		if (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT)
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
				|| (eContainerFeatureID() != InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT && newSuperComponent != null)) {
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
	public EList<TransmissionBinding> getterGetAllBindings() {

		kermeta.standard.OrderedSet<art.instance.TransmissionBinding> result = null;

		kermeta.standard.OrderedSet<art.instance.TransmissionBinding> res = ((kermeta.standard.OrderedSet<art.instance.TransmissionBinding>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		res.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<art.instance.TransmissionBinding> convertAsOrderedSet(this
						.getBinding()));

		java.lang.Boolean idIfCond_392 = false;
		idIfCond_392 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"art.instance.CompositeInstance"));

		if (idIfCond_392) {

			//BIft:each

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<art.instance.ComponentInstance> convertAsOrderedSet(
								((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"art.instance.CompositeInstance")))
										.getSubComponent()).iterator();
				java.lang.Boolean idLoopCond_393 = false;
				while (!idLoopCond_393) {
					idLoopCond_393 = it_ft103.isOff();
					if (idLoopCond_393) {
					} else {

						//BIle:func
						art.instance.ComponentInstance sub_lbdExp103 = it_ft103
								.next();

						res
								.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<art.instance.TransmissionBinding> convertAsOrderedSet(sub_lbdExp103
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

		java.lang.Boolean idIfCond_394 = false;
		idIfCond_394 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(composite, null);

		if (idIfCond_394) {

			java.lang.Boolean idIfCond_395 = false;
			idIfCond_395 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"art.instance.CompositeInstance"));

			if (idIfCond_395) {

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

			kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft104 = null;

			art.instance.ComponentInstance elem_ft104 = null;

			result_ft104 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.standard.StandardPackage.eINSTANCE
							.getSequence()));

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<art.instance.ComponentInstance> convertAsOrderedSet(
								composite.getSubComponent()).iterator();
				java.lang.Boolean idLoopCond_396 = false;
				while (!idLoopCond_396) {
					idLoopCond_396 = it_ft104.isOff();
					if (idLoopCond_396) {
					} else {

						elem_ft104 = it_ft104.next();

						java.lang.Boolean idIfCond_397 = false;
						//BIle:selector
						art.instance.ComponentInstance c_lbdExp104 = elem_ft104;

						//BIft:exists

						java.lang.Boolean result_ft105 = null;

						java.lang.Boolean test_ft105 = false;

						{

							kermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.instance.TransmissionBinding> convertAsOrderedSet(
											c_lbdExp104.getBinding())
									.iterator();
							java.lang.Boolean idLoopCond_398 = false;
							while (!idLoopCond_398) {
								idLoopCond_398 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft105.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft105,
																false));
								if (idLoopCond_398) {
								} else {

									java.lang.Boolean result_lambda_ft105 = null;
									//BIle:func
									art.instance.TransmissionBinding b_lbdExp105 = it_ft105
											.next();

									result_lambda_ft105 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(b_lbdExp105
													.getServerInstance(), this);
									//EIle:func

									test_ft105 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft105, result_lambda_ft105);
								}
							}
						}

						result_ft105 = test_ft105;
						//EIft:exists
						idIfCond_397 = result_ft105;

						//EIle:selector

						if (idIfCond_397) {

							result_ft104.add(elem_ft104);
						}

					}
				}
			}

			//EIft:select
			res.addAll(result_ft104);

			//BIft:select

			kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft108 = null;

			art.instance.ComponentInstance elem_ft108 = null;

			result_ft108 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.standard.StandardPackage.eINSTANCE
							.getSequence()));

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft108 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<art.instance.ComponentInstance> convertAsOrderedSet(
								composite.getSubComponent()).iterator();
				java.lang.Boolean idLoopCond_402 = false;
				while (!idLoopCond_402) {
					idLoopCond_402 = it_ft108.isOff();
					if (idLoopCond_402) {
					} else {

						elem_ft108 = it_ft108.next();

						java.lang.Boolean idIfCond_403 = false;
						//BIle:selector
						art.instance.ComponentInstance c_lbdExp108 = elem_ft108;

						idIfCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										c_lbdExp108,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"art.instance.CompositeInstance"));
						//EIle:selector

						if (idIfCond_403) {

							result_ft108.add(elem_ft108);
						}

					}
				}
			}

			//EIft:select
			//BIft:select

			kermeta.standard.Sequence<art.instance.ComponentInstance> result_ft106 = null;

			art.instance.ComponentInstance elem_ft106 = null;

			result_ft106 = ((kermeta.standard.Sequence<art.instance.ComponentInstance>) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.standard.StandardPackage.eINSTANCE
							.getSequence()));

			{

				kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft106 = result_ft108
						.iterator();
				java.lang.Boolean idLoopCond_399 = false;
				while (!idLoopCond_399) {
					idLoopCond_399 = it_ft106.isOff();
					if (idLoopCond_399) {
					} else {

						elem_ft106 = it_ft106.next();

						java.lang.Boolean idIfCond_400 = false;
						//BIle:selector
						art.instance.ComponentInstance c_lbdExp106 = elem_ft106;

						//BIft:exists

						java.lang.Boolean result_ft107 = null;

						java.lang.Boolean test_ft107 = false;

						{

							kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<art.instance.DelegationBinding> convertAsOrderedSet(
											((art.instance.CompositeInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															c_lbdExp106,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"art.instance.CompositeInstance")))
													.getDelegation())
									.iterator();
							java.lang.Boolean idLoopCond_401 = false;
							while (!idLoopCond_401) {
								idLoopCond_401 = kermeta.standard.helper.BooleanWrapper
										.or(
												it_ft107.isOff(),
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isNotEqualSwitcher(
																test_ft107,
																false));
								if (idLoopCond_401) {
								} else {

									java.lang.Boolean result_lambda_ft107 = null;
									//BIle:func
									art.instance.DelegationBinding d_lbdExp107 = it_ft107
											.next();

									result_lambda_ft107 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(d_lbdExp107
													.getServerInstance(), this);
									//EIle:func

									test_ft107 = kermeta.standard.helper.BooleanWrapper
											.or(test_ft107, result_lambda_ft107);
								}
							}
						}

						result_ft107 = test_ft107;
						//EIft:exists
						idIfCond_400 = result_ft107;

						//EIle:selector

						if (idIfCond_400) {

							result_ft106.add(elem_ft106);
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
		switch (eContainerFeatureID()) {
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
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			if (resolve)
				return getSuperComponent();
			return basicGetSuperComponent();
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			setSuperComponent((CompositeInstance) newValue);
			return;
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			setType((ComponentType) newValue);
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
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			setSuperComponent((CompositeInstance) null);
			return;
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			setType((ComponentType) null);
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
		case InstancePackage.COMPONENT_INSTANCE__SUPER_COMPONENT:
			return basicGetSuperComponent() != null;
		case InstancePackage.COMPONENT_INSTANCE__TYPE:
			return type != null;
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
