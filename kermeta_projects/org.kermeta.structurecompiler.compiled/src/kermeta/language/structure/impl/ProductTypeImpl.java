/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductTypeImpl.java,v 1.8 2008-11-07 08:52:57 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.ProductType;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ProductTypeImpl#getTypeContainer <em>Type Container</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ProductTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductTypeImpl extends TypeContainerImpl implements ProductType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getProductType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer getTypeContainer() {
		if (eContainerFeatureID != StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer basicGetTypeContainer() {
		if (eContainerFeatureID != StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeContainer(
			TypeContainer newTypeContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTypeContainer,
				StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainer(TypeContainer newTypeContainer) {
		if (newTypeContainer != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER && newTypeContainer != null)) {
			if (EcoreUtil.isAncestor(this, newTypeContainer))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypeContainer != null)
				msgs = ((InternalEObject) newTypeContainer).eInverseAdd(this,
						StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE,
						TypeContainer.class, msgs);
			msgs = basicSetTypeContainer(newTypeContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER,
					newTypeContainer, newTypeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<Type>(Type.class, this,
					StructurePackage.PRODUCT_TYPE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTypeByIndex(Integer index) {

		kermeta.language.structure.Type result = null;

		result = null;

		java.lang.Boolean idIfCond_400 = false;
		idIfCond_400 = kermeta.standard.helper.IntegerWrapper.isLower(index,
				org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsSequence(
								this.getType()).size());

		if (idIfCond_400) {

			java.lang.Boolean idIfCond_401 = false;
			idIfCond_401 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Type> convertAsSequence(
											this.getType()).elementAt(index),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_401) {

				result = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.structure.Type> convertAsSequence(
												this.getType())
										.elementAt(index),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight();
			} else {

				result = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsSequence(
								this.getType()).elementAt(index);
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isMappedToJavaRawType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_369 = false;
		idIfCond_369 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_369) {

			java.lang.Boolean idIfCond_370 = false;
			idIfCond_370 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											this,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.ParameterizedType")))
									.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_370) {

				result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ParameterizedType")))
										.getTypeDefinition(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ClassDefinition")))
						.isMappedToJavaRawType();
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone) {
		kermeta.language.structure.Object result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

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

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isBooleanTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_371 = false;
		idIfCond_371 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this));

		if (idIfCond_371) {

			java.lang.Boolean idIfCond_372 = false;
			idIfCond_372 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_372) {

				result = kermeta.standard.helper.StringWrapper
						.equals(
								((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												this,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Class")))
										.getTypeDefinition().getName(),
								"Boolean");
			} else {

				java.lang.Boolean idIfCond_373 = false;
				idIfCond_373 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_373) {

					java.lang.Boolean idIfCond_374 = false;
					idIfCond_374 = kermeta.standard.helper.BooleanWrapper
							.or(
									kermeta.standard.helper.BooleanWrapper
											.or(
													kermeta.standard.helper.BooleanWrapper
															.or(
																	kermeta.standard.helper.StringWrapper
																			.equals(
																					((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asTypeSwitcher(
																									this,
																									org.kermeta.compil.runtime.ExecutionContext
																											.getInstance()
																											.getMetaClass(
																													"kermeta.language.structure.PrimitiveType")))
																							.createBehaviorJava(context),
																					"kermeta::standard::Boolean"),
																	kermeta.standard.helper.StringWrapper
																			.equals(
																					((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																							.asTypeSwitcher(
																									this,
																									org.kermeta.compil.runtime.ExecutionContext
																											.getInstance()
																											.getMetaClass(
																													"kermeta.language.structure.PrimitiveType")))
																							.createBehaviorJava(context),
																					"kermeta::language::structure::Boolean")),
													kermeta.standard.helper.StringWrapper
															.equals(
																	((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.asTypeSwitcher(
																					this,
																					org.kermeta.compil.runtime.ExecutionContext
																							.getInstance()
																							.getMetaClass(
																									"kermeta.language.structure.PrimitiveType")))
																			.createBehaviorJava(context),
																	"java.lang.Boolean")),
									kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	this,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.PrimitiveType")))
															.createBehaviorJava(context),
													"Boolean"));

					if (idIfCond_374) {

						result = true;
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
	public kermeta.language.structure.Class getClassFromPrimitiveType() {

		kermeta.language.structure.Class result = null;

		java.lang.Boolean idIfCond_375 = false;
		idIfCond_375 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_375) {

			kermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.PrimitiveType")));

			java.lang.Boolean idIfCond_376 = false;
			idIfCond_376 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(pt.getInstanceType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_376) {

				result = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								pt.getInstanceType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Class")));
			} else {

				result = pt.getInstanceType().getClassFromPrimitiveType();
			}

		} else {

			result = null;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isValueType() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Type theType = null;

		java.lang.Boolean idIfCond_377 = false;
		idIfCond_377 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_377) {

			theType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this.getClassFromPrimitiveType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Type")));
		} else {

			theType = this;
		}

		java.lang.Boolean idIfCond_378 = false;
		idIfCond_378 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						theType,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_378) {

			kermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							theType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ParameterizedType")));

			java.lang.Boolean idIfCond_379 = false;
			idIfCond_379 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							pt.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_379) {

				result = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								pt.getTypeDefinition(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ClassDefinition")))
						.isValueType();
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {

		java.lang.String result = null;

		result = null;

		java.lang.Boolean idIfCond_380 = false;
		idIfCond_380 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class"));

		if (idIfCond_380) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.getName();
		} else {

			java.lang.Boolean idIfCond_381 = false;
			idIfCond_381 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_381) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.getName();
			} else {

				java.lang.Boolean idIfCond_382 = false;
				idIfCond_382 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_382) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.getName();
				} else {

					java.lang.Boolean idIfCond_383 = false;
					idIfCond_383 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_383) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.getName();
					} else {

						java.lang.Boolean idIfCond_384 = false;
						idIfCond_384 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_384) {

							result = "VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_385 = false;
		//BIft:orElse

		java.lang.Boolean result_ft124 = null;

		java.lang.Boolean idIfCond_386 = false;
		idIfCond_386 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_386) {

			result_ft124 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp124 = null;

			result_ft124 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_385 = result_ft124;
		//EIft:orElse

		if (idIfCond_385) {

			result = "VoidType";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isNumericalTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_387 = false;
		idIfCond_387 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this));

		if (idIfCond_387) {

			java.lang.String tName = null;

			java.lang.Boolean idIfCond_388 = false;
			idIfCond_388 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_388) {

				tName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType")))
						.getTypeDefinition().getName();

				java.lang.Boolean idIfCond_389 = false;
				idIfCond_389 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Integer"),
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Real"));

				if (idIfCond_389) {

					result = true;
				}

			} else {

				java.lang.Boolean idIfCond_390 = false;
				idIfCond_390 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_390) {

					tName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.PrimitiveType")))
							.createBehaviorJava(context);

					java.lang.Boolean idIfCond_391 = false;
					idIfCond_391 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Integer"),
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Real"));

					if (idIfCond_391) {

						result = true;
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
	public String getTypeQName() {

		java.lang.String result = null;

		result = null;

		java.lang.Boolean idIfCond_392 = false;
		idIfCond_392 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class"));

		if (idIfCond_392) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.qualifiedName();
		} else {

			java.lang.Boolean idIfCond_393 = false;
			idIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_393) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.qualifiedName();
			} else {

				java.lang.Boolean idIfCond_394 = false;
				idIfCond_394 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_394) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.qualifiedName();
				} else {

					java.lang.Boolean idIfCond_395 = false;
					idIfCond_395 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_395) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.qualifiedName();
					} else {

						java.lang.Boolean idIfCond_396 = false;
						idIfCond_396 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_396) {

							result = "kermeta::language::structure::VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_397 = false;
		//BIft:orElse

		java.lang.Boolean result_ft125 = null;

		java.lang.Boolean idIfCond_398 = false;
		idIfCond_398 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_398) {

			result_ft125 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp125 = null;

			result_ft125 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.language.structure.Operation"))
					.isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_397 = result_ft125;
		//EIft:orElse

		if (idIfCond_397) {

			result = "kermeta::language::structure::VoidType";
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isPrimitiveType() {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSubTypeOf(Type object) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.TypeUtil
				.isSuperTypeOfSwitcher(object, this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSuperTypeOf(Type object) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.ExecutionContext
				.getInstance().<java.lang.Boolean> asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.TypeUtil
								.hasSubType(this, object));

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isInstance(kermeta.language.structure.Object element) {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(element, this);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isEDataType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_399 = false;
		idIfCond_399 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getEMFEDataTypeInstanceClassName(), "");

		if (idIfCond_399) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isEnumeration() {

		java.lang.Boolean result = null;

		result = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.Enumeration"));

		return result;

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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTypeContainer((TypeContainer) otherEnd, msgs);
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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			return basicSetTypeContainer(null, msgs);
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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			return eInternalContainer().eInverseRemove(this,
					StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE,
					TypeContainer.class, msgs);
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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			if (resolve)
				return getTypeContainer();
			return basicGetTypeContainer();
		case StructurePackage.PRODUCT_TYPE__TYPE:
			return getType();
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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) newValue);
			return;
		case StructurePackage.PRODUCT_TYPE__TYPE:
			getType().clear();
			getType().addAll((Collection<? extends Type>) newValue);
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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) null);
			return;
		case StructurePackage.PRODUCT_TYPE__TYPE:
			getType().clear();
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
		case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
			return basicGetTypeContainer() != null;
		case StructurePackage.PRODUCT_TYPE__TYPE:
			return type != null && !type.isEmpty();
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
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
			case StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER:
				return StructurePackage.TYPE__TYPE_CONTAINER;
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
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
			case StructurePackage.TYPE__TYPE_CONTAINER:
				return StructurePackage.PRODUCT_TYPE__TYPE_CONTAINER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductTypeImpl
