/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.10 2009-01-21 09:15:50 cfaucher Exp $
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

		kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft97 = null;

		kermeta.language.structure.Property elem_ft97 = null;

		result_ft97 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getSequence()));

		{

			kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Property> convertAsOrderedSet(
							this.getterOwnedAttribute()).iterator();
			java.lang.Boolean idLoopCond_234 = false;
			while (!idLoopCond_234) {
				idLoopCond_234 = it_ft97.isOff();
				if (idLoopCond_234) {
				} else {

					elem_ft97 = it_ft97.next();

					java.lang.Boolean idIfCond_235 = false;
					//BIle:selector
					kermeta.language.structure.Property p_lbdExp97 = elem_ft97;

					idIfCond_235 = p_lbdExp97.getIsComposite();
					//EIle:selector

					if (idIfCond_235) {

						result_ft97.add(elem_ft97);
					}

				}
			}
		}

		//EIft:select
		properties.addAll(result_ft97);

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft98 = this
					.allSuperClasses().iterator();
			java.lang.Boolean idLoopCond_236 = false;
			while (!idLoopCond_236) {
				idLoopCond_236 = it_ft98.isOff();
				if (idLoopCond_236) {
				} else {

					//BIle:func
					kermeta.language.structure.Class s_lbdExp98 = it_ft98
							.next();

					//BIft:select

					kermeta.standard.Sequence<kermeta.language.structure.Property> result_ft99 = null;

					kermeta.language.structure.Property elem_ft99 = null;

					result_ft99 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Property> convertAsOrderedSet(
										s_lbdExp98.getterOwnedAttribute())
								.iterator();
						java.lang.Boolean idLoopCond_237 = false;
						while (!idLoopCond_237) {
							idLoopCond_237 = it_ft99.isOff();
							if (idLoopCond_237) {
							} else {

								elem_ft99 = it_ft99.next();

								java.lang.Boolean idIfCond_238 = false;
								//BIle:selector
								kermeta.language.structure.Property p_lbdExp99 = elem_ft99;

								idIfCond_238 = p_lbdExp99.getIsComposite();
								//EIle:selector

								if (idIfCond_238) {

									result_ft99.add(elem_ft99);
								}

							}
						}
					}

					//EIft:select
					properties.addAll(result_ft99);
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
						.<kermeta.language.structure.Class> convertAsOrderedSet(this
								.getterSuperClass()));

		kermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));

		kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
		java.lang.Boolean idLoopCond_239 = false;
		while (!idLoopCond_239) {
			idLoopCond_239 = superClasses.isEmpty();
			if (idLoopCond_239) {
			} else {

				allSuperClasses.addAll(superClasses);

				temp.clear();

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Class> it_ft100 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_240 = false;
					while (!idLoopCond_240) {
						idLoopCond_240 = it_ft100.isOff();
						if (idLoopCond_240) {
						} else {

							//BIle:func
							kermeta.language.structure.Class s_lbdExp100 = it_ft100
									.next();

							temp
									.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
											.<kermeta.language.structure.Class> convertAsOrderedSet(s_lbdExp100
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

			kermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
							this.getTypeParamBinding()).iterator();
			java.lang.Boolean idLoopCond_241 = false;
			while (!idLoopCond_241) {
				idLoopCond_241 = it_ft101.isOff();
				if (idLoopCond_241) {
				} else {

					//BIle:func
					kermeta.language.structure.TypeVariableBinding tpb_lbdExp101 = it_ft101
							.next();

					ecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(ecore.EcorePackage.eINSTANCE
									.getEGenericType()));

					java.lang.Boolean idIfCond_242 = false;
					idIfCond_242 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									tpb_lbdExp101.getType(),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"));

					if (idIfCond_242) {

						kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp101.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.getClassDefinitionAsTyped();

						java.lang.Boolean idIfCond_243 = false;
						idIfCond_243 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(cd.getEcoreDataType());

						if (idIfCond_243) {

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
										tpb_lbdExp101.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setEcoreModelElement(typeArgument);

						((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										tpb_lbdExp101.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Class")))
								.setLinks(context);
					} else {

						java.lang.Boolean idIfCond_244 = false;
						idIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										tpb_lbdExp101.getType(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ObjectTypeVariable"));

						if (idIfCond_244) {

							kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											tpb_lbdExp101.getType(),
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

							java.lang.Boolean idIfCond_245 = false;
							idIfCond_245 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											tpb_lbdExp101.getType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.PrimitiveType"));

							if (idIfCond_245) {

								kermeta.language.structure.ClassDefinition cd = tpb_lbdExp101
										.getType().getClassFromPrimitiveType()
										.getClassDefinitionAsTyped();

								java.lang.Boolean idIfCond_246 = false;
								idIfCond_246 = tpb_lbdExp101.getType()
										.isEDataType();

								if (idIfCond_246) {

									typeArgument
											.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															tpb_lbdExp101
																	.getType(),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.PrimitiveType")))
													.getEcoreModelElement());
								} else {

									java.lang.Boolean idIfCond_247 = false;
									idIfCond_247 = org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(cd
													.getEcoreDataType());

									if (idIfCond_247) {

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

								java.lang.Boolean idIfCond_248 = false;
								idIfCond_248 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												tpb_lbdExp101.getType(),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.VoidType"));

								if (idIfCond_248) {
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

		kermeta.standard.Set<kermeta.language.structure.Operation> result = null;

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

		kermeta.standard.OrderedSet<kermeta.language.structure.Class> result = null;

		kermeta.language.structure.ClassDefinition cDef = null;

		cDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(this.getTypeDefinition(),
						"kermeta.language.structure.ClassDefinition");

		kermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Type> convertAsOrderedSet(
							cDef.getSuperType()).iterator();
			java.lang.Boolean idLoopCond_232 = false;
			while (!idLoopCond_232) {
				idLoopCond_232 = it_ft96.isOff();
				if (idLoopCond_232) {
				} else {

					//BIle:func
					kermeta.language.structure.Type elem_lbdExp96 = it_ft96
							.next();

					java.lang.Boolean idIfCond_233 = false;
					idIfCond_233 = org.kermeta.compil.runtime.helper.language.TypeUtil
							.isInstanceSwitcher(
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Class"),
									elem_lbdExp96);

					if (idIfCond_233) {

						kermeta.language.structure.Class c = null;

						c = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeOrVoid(elem_lbdExp96,
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

		kermeta.standard.OrderedSet<kermeta.language.structure.Property> result = null;

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
