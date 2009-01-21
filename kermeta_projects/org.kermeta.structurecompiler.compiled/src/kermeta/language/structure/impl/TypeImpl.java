/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeImpl.java,v 1.10 2009-01-21 09:15:50 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.TypeImpl#getTypeContainer <em>Type Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends ObjectImpl implements Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer getTypeContainer() {
		if (eContainerFeatureID != StructurePackage.TYPE__TYPE_CONTAINER)
			return null;
		return (TypeContainer) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainer basicGetTypeContainer() {
		if (eContainerFeatureID != StructurePackage.TYPE__TYPE_CONTAINER)
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
				StructurePackage.TYPE__TYPE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainer(TypeContainer newTypeContainer) {
		if (newTypeContainer != eInternalContainer()
				|| (eContainerFeatureID != StructurePackage.TYPE__TYPE_CONTAINER && newTypeContainer != null)) {
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
					StructurePackage.TYPE__TYPE_CONTAINER, newTypeContainer,
					newTypeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isMappedToJavaRawType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_291 = false;
		idIfCond_291 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_291) {

			java.lang.Boolean idIfCond_292 = false;
			idIfCond_292 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_292) {

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
	public kermeta.language.structure.Class getClassFromPrimitiveType() {

		kermeta.language.structure.Class result = null;

		java.lang.Boolean idIfCond_293 = false;
		idIfCond_293 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_293) {

			kermeta.language.structure.PrimitiveType pt = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.PrimitiveType")));

			java.lang.Boolean idIfCond_294 = false;
			idIfCond_294 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(pt.getInstanceType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_294) {

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
	public Boolean isBooleanTypeDef(KM2EcoreContext context) {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_295 = false;
		idIfCond_295 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this));

		if (idIfCond_295) {

			java.lang.Boolean idIfCond_296 = false;
			idIfCond_296 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_296) {

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

				java.lang.Boolean idIfCond_297 = false;
				idIfCond_297 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_297) {

					java.lang.Boolean idIfCond_298 = false;
					idIfCond_298 = kermeta.standard.helper.BooleanWrapper
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

					if (idIfCond_298) {

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
	public Boolean isValueType() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Type theType = null;

		java.lang.Boolean idIfCond_299 = false;
		idIfCond_299 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.PrimitiveType"));

		if (idIfCond_299) {

			theType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this.getClassFromPrimitiveType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Type")));
		} else {

			theType = this;
		}

		java.lang.Boolean idIfCond_300 = false;
		idIfCond_300 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						theType,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ParameterizedType"));

		if (idIfCond_300) {

			kermeta.language.structure.ParameterizedType pt = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							theType,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ParameterizedType")));

			java.lang.Boolean idIfCond_301 = false;
			idIfCond_301 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							pt.getTypeDefinition(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition"));

			if (idIfCond_301) {

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

		java.lang.Boolean idIfCond_302 = false;
		idIfCond_302 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class"));

		if (idIfCond_302) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.getName();
		} else {

			java.lang.Boolean idIfCond_303 = false;
			idIfCond_303 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_303) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.getName();
			} else {

				java.lang.Boolean idIfCond_304 = false;
				idIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_304) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.getName();
				} else {

					java.lang.Boolean idIfCond_305 = false;
					idIfCond_305 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_305) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.getName();
					} else {

						java.lang.Boolean idIfCond_306 = false;
						idIfCond_306 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_306) {

							result = "VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_307 = false;
		//BIft:orElse

		java.lang.Boolean result_ft109 = null;

		java.lang.Boolean idIfCond_308 = false;
		idIfCond_308 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_308) {

			result_ft109 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp109 = null;

			result_ft109 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
							.getOperation())).isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_307 = result_ft109;
		//EIft:orElse

		if (idIfCond_307) {

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

		java.lang.Boolean idIfCond_309 = false;
		idIfCond_309 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this));

		if (idIfCond_309) {

			java.lang.String tName = null;

			java.lang.Boolean idIfCond_310 = false;
			idIfCond_310 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class"));

			if (idIfCond_310) {

				tName = ((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ParameterizedType")))
						.getTypeDefinition().getName();

				java.lang.Boolean idIfCond_311 = false;
				idIfCond_311 = kermeta.standard.helper.BooleanWrapper.or(
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Integer"),
						kermeta.standard.helper.StringWrapper.equals(tName,
								"Real"));

				if (idIfCond_311) {

					result = true;
				}

			} else {

				java.lang.Boolean idIfCond_312 = false;
				idIfCond_312 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_312) {

					tName = ((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.PrimitiveType")))
							.createBehaviorJava(context);

					java.lang.Boolean idIfCond_313 = false;
					idIfCond_313 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Integer"),
							kermeta.standard.helper.StringWrapper.equals(tName,
									"Real"));

					if (idIfCond_313) {

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

		java.lang.Boolean idIfCond_314 = false;
		idIfCond_314 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Class"));

		if (idIfCond_314) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.structure.Class")))
					.getClassDefinitionAsTyped();

			result = cd.qualifiedName();
		} else {

			java.lang.Boolean idIfCond_315 = false;
			idIfCond_315 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ObjectTypeVariable"));

			if (idIfCond_315) {

				kermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ObjectTypeVariable")));

				result = otv.qualifiedName();
			} else {

				java.lang.Boolean idIfCond_316 = false;
				idIfCond_316 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								this,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.PrimitiveType"));

				if (idIfCond_316) {

					kermeta.language.structure.ClassDefinition cd = this
							.getClassFromPrimitiveType()
							.getClassDefinitionAsTyped();

					result = cd.qualifiedName();
				} else {

					java.lang.Boolean idIfCond_317 = false;
					idIfCond_317 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									this,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Enumeration"));

					if (idIfCond_317) {

						result = ((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Enumeration")))
								.qualifiedName();
					} else {

						java.lang.Boolean idIfCond_318 = false;
						idIfCond_318 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType"));

						if (idIfCond_318) {

							result = "kermeta::language::structure::VoidType";
						}

					}

				}

			}

		}

		java.lang.Boolean idIfCond_319 = false;
		//BIft:orElse

		java.lang.Boolean result_ft110 = null;

		java.lang.Boolean idIfCond_320 = false;
		idIfCond_320 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(result);

		if (idIfCond_320) {

			result_ft110 = true;
		} else {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object v_lbdExp110 = null;

			result_ft110 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
							.getOperation())).isVoidType(result);
			//EIle:right

		}

		//CEC
		idIfCond_319 = result_ft110;
		//EIft:orElse

		if (idIfCond_319) {

			result = "kermeta::language::structure::VoidType";
		}

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
	public Boolean isSuperTypeOf(Type object) {

		java.lang.Boolean result = null;

		result = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeOrVoid(
						org.kermeta.compil.runtime.helper.language.TypeUtil
								.hasSubType(this, object), "java.lang.Boolean");

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

		java.lang.Boolean idIfCond_321 = false;
		idIfCond_321 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getEMFEDataTypeInstanceClassName(), "");

		if (idIfCond_321) {

			result = true;
		}

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
		case StructurePackage.TYPE__TYPE_CONTAINER:
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
		case StructurePackage.TYPE__TYPE_CONTAINER:
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
		case StructurePackage.TYPE__TYPE_CONTAINER:
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
		case StructurePackage.TYPE__TYPE_CONTAINER:
			if (resolve)
				return getTypeContainer();
			return basicGetTypeContainer();
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
		case StructurePackage.TYPE__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) newValue);
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
		case StructurePackage.TYPE__TYPE_CONTAINER:
			setTypeContainer((TypeContainer) null);
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
		case StructurePackage.TYPE__TYPE_CONTAINER:
			return basicGetTypeContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
