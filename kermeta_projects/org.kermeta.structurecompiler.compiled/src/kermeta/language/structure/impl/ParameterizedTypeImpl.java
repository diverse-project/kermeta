/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ParameterizedTypeImpl.java,v 1.11 2009-02-10 17:51:45 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeVariableBinding;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ParameterizedTypeImpl#getTypeParamBinding <em>Type Param Binding</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ParameterizedTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ParameterizedTypeImpl#getVirtualTypeBinding <em>Virtual Type Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterizedTypeImpl extends TypeImpl implements
		ParameterizedType {
	/**
	 * The cached value of the '{@link #getTypeParamBinding() <em>Type Param Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParamBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> typeParamBinding;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected GenericTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getVirtualTypeBinding() <em>Virtual Type Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualTypeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVariableBinding> virtualTypeBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getParameterizedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getTypeParamBinding() {
		if (typeParamBinding == null) {
			typeParamBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(
					TypeVariableBinding.class, this,
					StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING);
		}
		return typeParamBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject) typeDefinition;
			typeDefinition = (GenericTypeDefinition) eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION,
							oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(GenericTypeDefinition newTypeDefinition) {
		GenericTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION,
					oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVariableBinding> getVirtualTypeBinding() {
		if (virtualTypeBinding == null) {
			virtualTypeBinding = new EObjectContainmentEList.Resolving<TypeVariableBinding>(
					TypeVariableBinding.class, this,
					StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING);
		}
		return virtualTypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_665 = false;
		idIfCond_665 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getTypeDefinition()
						.getEMFInstanceClassName(), "");

		if (idIfCond_665) {

			result = this.getTypeDefinition().getEMFInstanceClassName();
		} else {

			result = kermeta.standard.helper.StringWrapper.replace(this
					.getTypeQName(), "::", ".");
		}

		java.lang.String str_tpb = "";

		java.lang.Integer i = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft138 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_666 = false;
			while (!idLoopCond_666) {
				idLoopCond_666 = it_ft138.isOff();
				if (idLoopCond_666) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp138 = it_ft138
							.next();

					java.lang.Boolean idIfCond_667 = false;
					idIfCond_667 = kermeta.standard.helper.BooleanWrapper
							.not(context.getFtSuffixActivation());

					if (idIfCond_667) {

						java.lang.Boolean idIfCond_668 = false;
						idIfCond_668 = kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(i, 1);

						if (idIfCond_668) {

							str_tpb = kermeta.standard.helper.StringWrapper
									.plus(str_tpb, ", ");
						}

						java.lang.Boolean idIfCond_669 = false;
						idIfCond_669 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(tpb_lbdExp138.getType()));

						if (idIfCond_669) {

							str_tpb = kermeta.standard.helper.StringWrapper
									.plus(str_tpb, tpb_lbdExp138.getType()
											.createBehaviorJava(context));
						} else {
						}

					} else {

						kermeta.language.structure.Type type_from_map = context
								.getFtMapTypeStack().peek().getValue(
										tpb_lbdExp138.getType());

						java.lang.Boolean idIfCond_670 = false;
						idIfCond_670 = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(type_from_map));

						if (idIfCond_670) {

							context.setFtSuffixActivation(false);

							str_tpb = kermeta.standard.helper.StringWrapper
									.plus(str_tpb, type_from_map
											.createBehaviorJava(context));

							context.setFtSuffixActivation(true);
						} else {

							java.lang.Boolean idIfCond_671 = false;
							idIfCond_671 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.equalsSwitcher(context
											.getFtProductTypeStack().peek()
											.getTypeByIndex(i), this);

							if (idIfCond_671) {

								result = "";
							}

							java.lang.Boolean idIfCond_672 = false;
							idIfCond_672 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(context
													.getFtProductTypeStack()
													.peek().getTypeByIndex(i)));

							if (idIfCond_672) {

								context.setFtSuffixActivation(false);

								str_tpb = kermeta.standard.helper.StringWrapper
										.plus(str_tpb, context
												.getFtProductTypeStack().peek()
												.getTypeByIndex(i)
												.createBehaviorJava(context));

								context.setFtSuffixActivation(true);
							}

						}

					}

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
					//EIle:func

				}
			}
		}

		//EIft:each

		java.lang.Boolean idIfCond_673 = false;
		idIfCond_673 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(str_tpb, "");

		if (idIfCond_673) {

			java.lang.Boolean idIfCond_674 = false;
			idIfCond_674 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(result, "");

			if (idIfCond_674) {

				result = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, "<"), str_tpb), ">");
			} else {

				result = str_tpb;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getClassDefinitionAsTyped() {

		kermeta.language.structure.ClassDefinition result = null;

		result = null;

		java.lang.Boolean idIfCond_675 = false;
		idIfCond_675 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this.getTypeDefinition(),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_675) {

			result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition")));
		}

		return result;

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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			return ((InternalEList<?>) getTypeParamBinding()).basicRemove(
					otherEnd, msgs);
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			return ((InternalEList<?>) getVirtualTypeBinding()).basicRemove(
					otherEnd, msgs);
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			return getTypeParamBinding();
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			if (resolve)
				return getTypeDefinition();
			return basicGetTypeDefinition();
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			return getVirtualTypeBinding();
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			getTypeParamBinding().clear();
			getTypeParamBinding().addAll(
					(Collection<? extends TypeVariableBinding>) newValue);
			return;
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			setTypeDefinition((GenericTypeDefinition) newValue);
			return;
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			getVirtualTypeBinding().clear();
			getVirtualTypeBinding().addAll(
					(Collection<? extends TypeVariableBinding>) newValue);
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			getTypeParamBinding().clear();
			return;
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			setTypeDefinition((GenericTypeDefinition) null);
			return;
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			getVirtualTypeBinding().clear();
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
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_PARAM_BINDING:
			return typeParamBinding != null && !typeParamBinding.isEmpty();
		case StructurePackage.PARAMETERIZED_TYPE__TYPE_DEFINITION:
			return typeDefinition != null;
		case StructurePackage.PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING:
			return virtualTypeBinding != null && !virtualTypeBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedTypeImpl
