/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import ecore.ETypeParameter;

import kermeta.language.structure.ObjectTypeVariable;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ObjectTypeVariableImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTypeVariableImpl extends TypeVariableImpl implements
		ObjectTypeVariable {
	/**
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected ETypeParameter ecoreModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getObjectTypeVariable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (ETypeParameter) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT,
							oldEcoreModelElement, ecoreModelElement));
			}
		}
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(ETypeParameter newEcoreModelElement) {
		ETypeParameter oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = this.getName();

		java.lang.Boolean idIfCond_538 = false;
		idIfCond_538 = context.getFtSuffixActivation();

		if (idIfCond_538) {

			kermeta.language.structure.Type type_from_map = context
					.getFtMapTypeStack().peek().getValue(this);

			java.lang.Boolean idIfCond_539 = false;
			idIfCond_539 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(type_from_map));

			if (idIfCond_539) {

				org.kermeta.compil.runtime.helper.io.StdIOUtil
						.getInstance()
						.writeln(
								kermeta.standard.helper.StringWrapper
										.plus(
												"Please contact the Kermeta Development team, if you are in this case [ObjectTypeVariable::createBehaviorJava - not type_from_map.isVoid()] ",
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.toStringSwitcher(this)));

				context.setFtSuffixActivation(false);

				result = type_from_map.createBehaviorJava(context);

				context.setFtSuffixActivation(true);
			} else {

				java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
						.uminus(1);

				kermeta.language.structure.Object obj = null;
				//BIft:detect

				kermeta.language.structure.TypeVariable result_ft103 = null;

				kermeta.language.structure.TypeVariable elem_ft103 = null;

				result_ft103 = null;

				{

					kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
									((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.containerSwitcher(this),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")))
											.getTypeParameter()).iterator();
					java.lang.Boolean idLoopCond_540 = false;
					while (!idLoopCond_540) {
						idLoopCond_540 = kermeta.standard.helper.BooleanWrapper
								.or(
										it_ft103.isOff(),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isNotEqualSwitcher(
														result_ft103, null));
						if (idLoopCond_540) {
						} else {

							elem_ft103 = it_ft103.next();

							java.lang.Boolean idIfCond_541 = false;
							//BIle:detector
							kermeta.language.structure.TypeVariable otv_lbdExp103 = elem_ft103;

							java.lang.Boolean idIfCond_542 = false;
							idIfCond_542 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											otv_lbdExp103,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ObjectTypeVariable"));

							if (idIfCond_542) {

								i = kermeta.standard.helper.IntegerWrapper
										.plus(i, 1);

								idIfCond_541 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.equalsSwitcher(this, otv_lbdExp103);
							}

							//EIle:detector

							if (idIfCond_541) {

								result_ft103 = elem_ft103;
							}

						}
					}
				}

				//CE
				obj = result_ft103;
				//EIft:detect
				;

				java.lang.Boolean idIfCond_543 = false;
				idIfCond_543 = kermeta.standard.helper.BooleanWrapper
						.and(
								kermeta.standard.helper.BooleanWrapper
										.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isVoidSwitcher(obj)),
								kermeta.standard.helper.IntegerWrapper
										.isGreaterOrEqual(i, 0));

				if (idIfCond_543) {

					java.lang.Boolean idIfCond_544 = false;
					idIfCond_544 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isNotEqualSwitcher(context.getFtProductTypeStack()
									.peek().getTypeByIndex(i), this);

					if (idIfCond_544) {

						result = context.getFtProductTypeStack().peek()
								.getTypeByIndex(i).createBehaviorJava(context);
					}

				}

			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyPass1(KM2EcoreContext context) {

		ecore.ETypeParameter ecoreTypeParameter = this
				.createEcoreModelElement(context);

		kermeta.language.structure.Object container = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.containerSwitcher(this);

		java.lang.Boolean idIfCond_545 = false;
		idIfCond_545 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						container,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition"));

		if (idIfCond_545) {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.ETypeParameter> convertAsOrderedSet(
							((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											container,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ClassDefinition")))
									.getEcoreModelElement()
									.getETypeParameters()).add(
							ecoreTypeParameter);
		} else {

			java.lang.Boolean idIfCond_546 = false;
			idIfCond_546 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							container,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Operation"));

			if (idIfCond_546) {

				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<ecore.ETypeParameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												container,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))
										.getEcoreModelElement()
										.getETypeParameters()).add(
								ecoreTypeParameter);
			}

		}

		this.setEcoreModelElement(ecoreTypeParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createEcoreModelElement(KM2EcoreContext context) {

		ecore.ETypeParameter result = null;

		ecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(ecore.EcorePackage.eINSTANCE.getETypeParameter()));

		ecoreTypeParameter
				.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
								.getIdentifierHelper())).getMangledIdentifier(
						this.getName(), context));

		result = ecoreTypeParameter;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			if (resolve)
				return getEcoreModelElement();
			return basicGetEcoreModelElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((ETypeParameter) newValue);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((ETypeParameter) null);
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
		case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
			return ecoreModelElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceability.class) {
			switch (derivedFeatureID) {
			case StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT:
				return StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceability.class) {
			switch (baseFeatureID) {
			case StructurePackage.TRACEABILITY__ECORE_MODEL_ELEMENT:
				return StructurePackage.OBJECT_TYPE_VARIABLE__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ObjectTypeVariableImpl
