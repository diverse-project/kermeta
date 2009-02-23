/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ClassImpl.java,v 1.12 2009-02-23 15:26:40 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EGenericType;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Traceability;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassImpl#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ParameterizedTypeImpl implements
		kermeta.language.structure.Class {
	/**
	 * The cached value of the '{@link #getEcoreModelElement() <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreModelElement()
	 * @generated
	 * @ordered
	 */
	protected EGenericType ecoreModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getEcoreModelElement() {
		if (ecoreModelElement != null
				&& ((EObject) ecoreModelElement).eIsProxy()) {
			InternalEObject oldEcoreModelElement = (InternalEObject) ecoreModelElement;
			ecoreModelElement = (EGenericType) eResolveProxy(oldEcoreModelElement);
			if (ecoreModelElement != oldEcoreModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructurePackage.CLASS__ECORE_MODEL_ELEMENT,
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
	public EGenericType basicGetEcoreModelElement() {
		return ecoreModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreModelElement(EGenericType newEcoreModelElement) {
		EGenericType oldEcoreModelElement = ecoreModelElement;
		ecoreModelElement = newEcoreModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.CLASS__ECORE_MODEL_ELEMENT,
					oldEcoreModelElement, ecoreModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.cloneObject(this, objectToClone);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone) {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.deepCloneObject(this, objectToClone);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object _new() {

		kermeta.language.structure.Object result = null;

		result = org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(this.getTypeDefinition().qualifiedName().replace(
						"::", "."));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<Property> allAttributes() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		kermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft118 = null;

		kermeta.language.structure.Property elem_ft118 = null;

		result_ft118 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft118 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsSet(
							this.getterOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_344 = false;
			while (!idLoopCond_344) {
				idLoopCond_344 = it_ft118.isOff();
				if (idLoopCond_344) {
				} else {

					elem_ft118 = it_ft118.next();

					java.lang.Boolean idIfCond_345 = false;
					//BIle:selector
					kermeta.language.structure.Property p_lbdExp118 = elem_ft118;

					idIfCond_345 = p_lbdExp118.getIsComposite();
					//EIle:selector

					if (idIfCond_345) {

						result_ft118.add(elem_ft118);
					}

				}
			}
		}

		//EIft:select
		properties.addAll(result_ft118);

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft119 = this
					.allSuperClasses().iterator();
			java.lang.Boolean idLoopCond_346 = false;
			while (!idLoopCond_346) {
				idLoopCond_346 = it_ft119.isOff();
				if (idLoopCond_346) {
				} else {

					//BIle:func
					kermeta.language.structure.Class s_lbdExp119 = it_ft119
							.next();

					//BIft:select

					kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft120 = null;

					kermeta.language.structure.Property elem_ft120 = null;

					result_ft120 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft120 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Property> convertAsSet(
										s_lbdExp119.getterOwnedAttribute())
								.iterator();
						java.lang.Boolean idLoopCond_347 = false;
						while (!idLoopCond_347) {
							idLoopCond_347 = it_ft120.isOff();
							if (idLoopCond_347) {
							} else {

								elem_ft120 = it_ft120.next();

								java.lang.Boolean idIfCond_348 = false;
								//BIle:selector
								kermeta.language.structure.Property p_lbdExp120 = elem_ft120;

								idIfCond_348 = p_lbdExp120.getIsComposite();
								//EIle:selector

								if (idIfCond_348) {

									result_ft120.add(elem_ft120);
								}

							}
						}
					}

					//EIft:select
					properties.addAll(result_ft120);
					//EIle:func

				}
			}
		}

		//EIft:each

		result = properties;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<kermeta.language.structure.Class> allSuperClasses() {

		kermeta.standard.Set<kermeta.language.structure.Class> result = null;

		kermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		kermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Class> convertAsSet(this
								.getterSuperClass()));

		kermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_349 = false;
		while (!idLoopCond_349) {
			idLoopCond_349 = superClasses.isEmpty();
			if (idLoopCond_349) {
			} else {

				allSuperClasses.addAll(superClasses);

				temp.clear();

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft121 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_350 = false;
					while (!idLoopCond_350) {
						idLoopCond_350 = it_ft121.isOff();
						if (idLoopCond_350) {
						} else {

							//BIle:func
							kermeta.language.structure.Class s_lbdExp121 = it_ft121
									.next();

							temp
									.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.Class> convertAsSet(s_lbdExp121
													.getterSuperClass()));
							//EIle:func

						}
					}
				}

				//EIft:each

				superClasses.clear();

				superClasses.addAll(temp);
			}
		}

		result = allSuperClasses;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean equals(kermeta.language.structure.Object other) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ClassUtil
								.equals(this, other), "java.lang.Boolean");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = this.getTypeDefinition().getName();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinks(KM2EcoreContext context) {

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft122 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_351 = false;
			while (!idLoopCond_351) {
				idLoopCond_351 = it_ft122.isOff();
				if (idLoopCond_351) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp122 = it_ft122
							.next();

					ecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(ecore.EcorePackage.eINSTANCE
									.getEGenericType()));

					java.lang.Boolean idIfCond_352 = false;
					idIfCond_352 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									tpb_lbdExp122.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_352) {

						kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp122.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_353 = false;
						idIfCond_353 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(cd.getEcoreDataType());

						if (idIfCond_353) {

							typeArgument.setEClassifier(cd
									.getEcoreModelElement());
						} else {

							typeArgument.setEClassifier(cd.getEcoreDataType());
						}

						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<ecore.EGenericType> convertAsOrderedSet(
										this.getEcoreModelElement()
												.getETypeArguments()).add(
										typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp122.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setEcoreModelElement(typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp122.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setLinks(context);
					} else {

						java.lang.Boolean idIfCond_354 = false;
						idIfCond_354 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										tpb_lbdExp122.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_354) {

							kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											tpb_lbdExp122.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ObjectTypeVariable")));

							typeArgument.setETypeParameter(otv
									.getEcoreModelElement());

							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<ecore.EGenericType> convertAsOrderedSet(
											this.getEcoreModelElement()
													.getETypeArguments()).add(
											typeArgument);
						} else {

							java.lang.Boolean idIfCond_355 = false;
							idIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											tpb_lbdExp122.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.PrimitiveType"));

							if (idIfCond_355) {

								kermeta.language.structure.ClassDefinition cd = tpb_lbdExp122
										.getType().getClassFromPrimitiveType()
										.getClassDefinitionAsTyped();

								java.lang.Boolean idIfCond_356 = false;
								idIfCond_356 = tpb_lbdExp122.getType()
										.isEDataType();

								if (idIfCond_356) {

									typeArgument
											.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															tpb_lbdExp122
																	.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_357 = false;
									idIfCond_357 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(cd
													.getEcoreDataType());

									if (idIfCond_357) {

										typeArgument.setEClassifier(cd
												.getEcoreModelElement());
									} else {

										typeArgument.setEClassifier(cd
												.getEcoreDataType());
									}

								}

								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<ecore.EGenericType> convertAsOrderedSet(
												this.getEcoreModelElement()
														.getETypeArguments())
										.add(typeArgument);
							} else {

								java.lang.Boolean idIfCond_358 = false;
								idIfCond_358 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												tpb_lbdExp122.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.VoidType"));

								if (idIfCond_358) {
								}

							}

						}

					}

					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getterOwnedOperation() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Operation> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(this.getTypeDefinition(),
						"kermeta.language.structure.ClassDefinition");

		result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Operation> convertAsOrderedSet(cDef
						.getOwnedOperation());

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.language.structure.Class> getterSuperClass() {

		kermeta.standard.Set<kermeta.language.structure.Class> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(this.getTypeDefinition(),
						"kermeta.language.structure.ClassDefinition");

		kermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft117 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							cDef.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_342 = false;
			while (!idLoopCond_342) {
				idLoopCond_342 = it_ft117.isOff();
				if (idLoopCond_342) {
				} else {

					//BIle:func
					kermeta.language.structure.Type elem_lbdExp117 = it_ft117
							.next();

					java.lang.Boolean idIfCond_343 = false;
					idIfCond_343 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									elem_lbdExp117);

					if (idIfCond_343) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(elem_lbdExp117,
										"kermeta.language.structure.Class");

						supertypes.add(c);
					}

					//EIle:func

				}
			}
		}

		//EIft:each

		result = supertypes;

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getterIsAbstract() {

		java.lang.Boolean result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(this.getTypeDefinition(),
						"kermeta.language.structure.ClassDefinition");

		result = cDef.getIsAbstract();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getterName() {

		java.lang.String result = null;

		result = this.getTypeDefinition().getName();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinition getterClassDefinition() {

		kermeta.language.structure.ClassDefinition result = null;

		result = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(this.getTypeDefinition(),
						"kermeta.language.structure.ClassDefinition");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getterOwnedAttribute() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(this.getTypeDefinition(),
						"kermeta.language.structure.ClassDefinition");

		result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.structure.Property> convertAsOrderedSet(cDef
						.getOwnedAttribute());

		return org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.convertAsEList(result);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
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
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EGenericType) newValue);
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
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
			setEcoreModelElement((EGenericType) null);
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
		case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
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
			case StructurePackage.CLASS__ECORE_MODEL_ELEMENT:
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
				return StructurePackage.CLASS__ECORE_MODEL_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassImpl
