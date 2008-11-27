/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.9 2008-11-27 15:49:50 cfaucher Exp $
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
	public Set<Property> allAttributes() {

		kermeta.standard.Set<kermeta.language.structure.Property> result = null;

		kermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Property>"));

		//BIft:select

		kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft111 = null;

		kermeta.language.structure.Property elem_ft111 = null;

		result_ft111 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Sequence<kermeta.language.structure.Property>"));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsOrderedSet(
							this.getterOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_340 = false;
			while (!idLoopCond_340) {
				idLoopCond_340 = it_ft111.isOff();
				if (idLoopCond_340) {
				} else {

					elem_ft111 = it_ft111.next();

					java.lang.Boolean idIfCond_341 = false;
					//BIle:selector
					kermeta.language.structure.Property p_lbdExp111 = elem_ft111;

					idIfCond_341 = p_lbdExp111.getIsComposite();
					//EIle:selector

					if (idIfCond_341) {

						result_ft111.add(elem_ft111);
					}

				}
			}
		}

		//EIft:select
		properties.addAll(result_ft111);

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft112 = this
					.allSuperClasses().iterator();
			java.lang.Boolean idLoopCond_342 = false;
			while (!idLoopCond_342) {
				idLoopCond_342 = it_ft112.isOff();
				if (idLoopCond_342) {
				} else {

					//BIle:func
					kermeta.language.structure.Class s_lbdExp112 = it_ft112
							.next();

					//BIft:select

					kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft113 = null;

					kermeta.language.structure.Property elem_ft113 = null;

					result_ft113 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.standard.Sequence<kermeta.language.structure.Property>"));

					{

						kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft113 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Property> convertAsOrderedSet(
										s_lbdExp112.getterOwnedAttribute())
								.iterator();
						java.lang.Boolean idLoopCond_343 = false;
						while (!idLoopCond_343) {
							idLoopCond_343 = it_ft113.isOff();
							if (idLoopCond_343) {
							} else {

								elem_ft113 = it_ft113.next();

								java.lang.Boolean idIfCond_344 = false;
								//BIle:selector
								kermeta.language.structure.Property p_lbdExp113 = elem_ft113;

								idIfCond_344 = p_lbdExp113.getIsComposite();
								//EIle:selector

								if (idIfCond_344) {

									result_ft113.add(elem_ft113);
								}

							}
						}
					}

					//EIft:select
					properties.addAll(result_ft113);
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
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		kermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Class> convertAsOrderedSet(this
								.getterSuperClass()));

		kermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.Set<kermeta.language.structure.Class>"));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_345 = false;
		while (!idLoopCond_345) {
			idLoopCond_345 = superClasses.isEmpty();
			if (idLoopCond_345) {
			} else {

				allSuperClasses.addAll(superClasses);

				temp.clear();

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft114 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_346 = false;
					while (!idLoopCond_346) {
						idLoopCond_346 = it_ft114.isOff();
						if (idLoopCond_346) {
						} else {

							//BIle:func
							kermeta.language.structure.Class s_lbdExp114 = it_ft114
									.next();

							temp
									.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.Class> convertAsOrderedSet(s_lbdExp114
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

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.ClassUtil
								.equals(this, other));

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

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft115 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_347 = false;
			while (!idLoopCond_347) {
				idLoopCond_347 = it_ft115.isOff();
				if (idLoopCond_347) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp115 = it_ft115
							.next();

					ecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("ecore.EGenericType"));

					java.lang.Boolean idIfCond_348 = false;
					idIfCond_348 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									tpb_lbdExp115.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_348) {

						kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp115.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_349 = false;
						idIfCond_349 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(cd.getEcoreDataType());

						if (idIfCond_349) {

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
										tpb_lbdExp115.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setEcoreModelElement(typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp115.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setLinks(context);
					} else {

						java.lang.Boolean idIfCond_350 = false;
						idIfCond_350 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										tpb_lbdExp115.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_350) {

							kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											tpb_lbdExp115.getType(),
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

							java.lang.Boolean idIfCond_351 = false;
							idIfCond_351 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											tpb_lbdExp115.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.PrimitiveType"));

							if (idIfCond_351) {

								kermeta.language.structure.ClassDefinition cd = tpb_lbdExp115
										.getType().getClassFromPrimitiveType()
										.getClassDefinitionAsTyped();

								java.lang.Boolean idIfCond_352 = false;
								idIfCond_352 = tpb_lbdExp115.getType()
										.isEDataType();

								if (idIfCond_352) {

									typeArgument
											.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															tpb_lbdExp115
																	.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_353 = false;
									idIfCond_353 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(cd
													.getEcoreDataType());

									if (idIfCond_353) {

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

								java.lang.Boolean idIfCond_354 = false;
								idIfCond_354 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												tpb_lbdExp115.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.VoidType"));

								if (idIfCond_354) {
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
	public EList<Operation> getterOwnedOperation() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Operation> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						this.getTypeDefinition());

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

		kermeta.standard.OrderedSet<kermeta.language.structure.Class> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						this.getTypeDefinition());

		kermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<kermeta.language.structure.Class>"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft110 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							cDef.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_338 = false;
			while (!idLoopCond_338) {
				idLoopCond_338 = it_ft110.isOff();
				if (idLoopCond_338) {
				} else {

					//BIle:func
					kermeta.language.structure.Type elem_lbdExp110 = it_ft110
							.next();

					java.lang.Boolean idIfCond_339 = false;
					idIfCond_339 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									elem_lbdExp110);

					if (idIfCond_339) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.<kermeta.language.structure.Class> asTypeOrVoid(
										elem_lbdExp110);

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

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						this.getTypeDefinition());

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

		result = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						this.getTypeDefinition());

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getterOwnedAttribute() {

		kermeta.standard.OrderedSet<kermeta.language.structure.Property> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext
				.getInstance()
				.<kermeta.language.structure.ClassDefinition> asTypeOrVoid(
						this.getTypeDefinition());

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
