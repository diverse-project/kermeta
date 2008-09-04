/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariableImpl.java,v 1.1 2008-09-04 15:40:25 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallVariable;

import kermeta.language.structure.Parameter;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.CallVariableImpl#getIsAtpre <em>Is Atpre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallVariableImpl extends CallExpressionImpl implements
		CallVariable {
	/**
	 * The default value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtpre()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ATPRE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtpre()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAtpre = IS_ATPRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAtpre() {
		return isAtpre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtpre(Boolean newIsAtpre) {
		Boolean oldIsAtpre = isAtpre;
		isAtpre = newIsAtpre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_VARIABLE__IS_ATPRE, oldIsAtpre,
					isAtpre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterForOwningOperationMany() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_388 = false;
		idIfCond_388 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_388) {

			java.lang.Boolean idIfCond_389 = false;
			idIfCond_389 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(this.retrieveCorrespondingParameter()
							.getUpper(), 1);

			if (idIfCond_389) {

				result = true;
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

		super.createBehaviorJava(context);

		result = "";

		java.lang.Boolean idIfCond_390 = false;
		idIfCond_390 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.StringWrapper.equals(context
						.getTasks_stack().peek(), "FunctionType_Compilation"),
				kermeta.standard.helper.StringWrapper.equals(context
						.getCurrent_param_ft(), this.getName()));

		if (idIfCond_390) {

			context.getTasks_stack().pop();

			context.setFtSuffixActivation(false);

			kermeta.language.behavior.LambdaExpression theLambdaExp = context
					.getFtStack().pop();

			java.lang.String str_toInclude = "";

			java.lang.Boolean idIfCond_391 = false;
			idIfCond_391 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_391) {

				java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight().createBehaviorJava(context);

				java.lang.Boolean idIfCond_392 = false;
				idIfCond_392 = kermeta.standard.helper.BooleanWrapper
						.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(lambdaExp_returnType));

				if (idIfCond_392) {
				}

			}

			java.lang.Integer inc_param = 0;

			//Beginning of the Inlining of the function type: each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								theLambdaExp.getParameters()).iterator();
				java.lang.Boolean idLoopCond_393 = false;
				while (!idLoopCond_393) {
					idLoopCond_393 = it_ft91.isOff();
					if (idLoopCond_393) {
					} else {

						//Beginning of the Inlining of the lambda expression: func
						kermeta.language.behavior.LambdaParameter p = it_ft91
								.next();

						java.lang.String type_param_ = context
								.getFtProductTypeStack().peek().getTypeByIndex(
										inc_param).createBehaviorJava(context);

						str_toInclude = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		str_toInclude,
																		type_param_),
														" "), p.getName());

						context.setFtSuffixActivation(true);

						str_toInclude = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		str_toInclude,
																		" = "),
														org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																.<kermeta.language.behavior.Expression> convertAsOrderedSet(
																		this
																				.getParameters())
																.elementAt(
																		inc_param)
																.createBehaviorJava(
																		context)),
										";\n");

						context.setFtSuffixActivation(false);

						inc_param = kermeta.standard.helper.IntegerWrapper
								.plus(inc_param, 1);
						//End of the Inlining of the lambda expression: func

					}
				}
			}

			//End of the Inlining of the function type: each

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(result,
															"//Beginning of the Inlining of the lambda expression: "),
											this.getName()), "\n");

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result,
							str_toInclude), theLambdaExp.getBody()
							.createBehaviorJava(context));

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(result,
															"//End of the Inlining of the lambda expression: "),
											this.getName()), "\n");

			context.setFtSuffixActivation(true);
		} else {

			java.lang.Boolean idIfCond_394 = false;
			idIfCond_394 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "stdio");

			if (idIfCond_394) {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						"org.kermeta.compil.runtime.helper.io.StdIOUtil");
			} else {

				java.lang.Boolean idIfCond_395 = false;
				idIfCond_395 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameter()),
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameterForOwningOperation()));

				if (idIfCond_395) {

					result = kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													result,
													((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject("km2ecore.helper.java.IdentifierHelper"))
															.getMangledIdentifier(
																	this
																			.getName(),
																	context)),
									context.printFtSuffix());
				} else {

					java.lang.Boolean idIfCond_396 = false;
					idIfCond_396 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.BooleanWrapper.or(this
									.isParameterSingle(), this
									.isParameterForOwningOperationSingle()),
							this.isParameterManyAndForOwningOperation());

					if (idIfCond_396) {

						result = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														result,
														((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject("km2ecore.helper.java.IdentifierHelper"))
																.getMangledIdentifier(
																		this
																				.getName(),
																		context)),
										context.printFtSuffix());
					} else {

						kermeta.language.structure.Parameter c_param = null;

						java.lang.Boolean idIfCond_397 = false;
						idIfCond_397 = this.isParameterForOwningOperation();

						if (idIfCond_397) {

							c_param = this.retrieveCorrespondingParameter();
						} else {

							c_param = this
									.getCallFeatureCorrespondingParameter();
						}

						java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
										((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														this.getStaticType(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.Class")))
												.getTypeParamBinding()).one()
								.getType().createBehaviorJava(context);

						java.lang.Boolean idIfCond_398 = false;
						idIfCond_398 = this.isParameterMany();

						if (idIfCond_398) {

							result = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							context
																									.getCOLLECTION_UTIL_CLASS(),
																							".<"),
																			type_binding),
															">convertAsEList("),
											result);
						} else {

							java.lang.Boolean idIfCond_399 = false;
							idIfCond_399 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_399) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsBag("),
												result);
							}

							java.lang.Boolean idIfCond_400 = false;
							idIfCond_400 = kermeta.standard.helper.BooleanWrapper
									.and(
											c_param.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_400) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsSet("),
												result);
							}

							java.lang.Boolean idIfCond_401 = false;
							idIfCond_401 = kermeta.standard.helper.BooleanWrapper
									.and(c_param.getIsUnique(), c_param
											.getIsOrdered());

							if (idIfCond_401) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsOrderedSet("),
												result);
							}

							java.lang.Boolean idIfCond_402 = false;
							idIfCond_402 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(c_param.getIsUnique()),
											c_param.getIsOrdered());

							if (idIfCond_402) {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								context
																										.getCOLLECTION_UTIL_CLASS(),
																								".<"),
																				type_binding),
																">convertAsSequence("),
												result);
							}

						}

						result = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		result,
																		((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
																				.newObject("km2ecore.helper.java.IdentifierHelper"))
																				.getMangledIdentifier(
																						this
																								.getName(),
																						context)),
														context.printFtSuffix()),
										")");
					}

				}

			}

			result = kermeta.standard.helper.StringWrapper.plus(result, this
					.endOfExpressionFixer());
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterManyAndForOwningOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_403 = false;
		idIfCond_403 = kermeta.standard.helper.BooleanWrapper.and(this
				.isParameterMany(), this.isParameterForOwningOperation());

		if (idIfCond_403) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getFunctionTypeParameter() {

		kermeta.language.structure.Parameter result = null;

		kermeta.language.structure.Parameter ftParam = this
				.retrieveCorrespondingParameter();

		java.lang.Boolean idIfCond_404 = false;
		idIfCond_404 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_404) {

			java.lang.Boolean idIfCond_405 = false;
			idIfCond_405 = ftParam.isFunctionType();

			if (idIfCond_405) {

				result = ftParam;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter retrieveCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_406 = false;
		idIfCond_406 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_406) {

			result = null;
			//Beginning of the Inlining of the function type: detect

			kermeta.language.structure.Parameter result_ft92 = null;

			kermeta.language.structure.Parameter elem_ft92 = null;

			result_ft92 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												this
														.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.Operation")),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))
										.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_407 = false;
				while (!idLoopCond_407) {
					idLoopCond_407 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft92.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft92, null));
					if (idLoopCond_407) {
					} else {

						elem_ft92 = it_ft92.next();

						java.lang.Boolean idIfCond_408 = false;
						//Beginning of the Inlining of the lambda expression: detector
						kermeta.language.structure.Parameter p = elem_ft92;

						idIfCond_408 = kermeta.standard.helper.StringWrapper
								.equals(p.getName(), this.getName());
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_408) {

							result_ft92 = elem_ft92;
						}

					}
				}
			}

			//End of the Inlining of the function type: detect

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_409 = false;
		idIfCond_409 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_409) {

			kermeta.language.behavior.Expression exp = null;
			//Beginning of the Inlining of the function type: detect

			kermeta.language.behavior.Expression result_ft93 = null;

			kermeta.language.behavior.Expression elem_ft93 = null;

			result_ft93 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.container(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature")))
										.getParameters()).iterator();
				java.lang.Boolean idLoopCond_410 = false;
				while (!idLoopCond_410) {
					idLoopCond_410 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft93.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft93, null));
					if (idLoopCond_410) {
					} else {

						elem_ft93 = it_ft93.next();

						java.lang.Boolean idIfCond_411 = false;
						//Beginning of the Inlining of the lambda expression: detector
						kermeta.language.behavior.Expression p = elem_ft93;

						idIfCond_411 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p, this);
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_411) {

							result_ft93 = elem_ft93;
						}

					}
				}
			}

			//callElement
			exp = result_ft93;
			//End of the Inlining of the function type: detect

			java.lang.Boolean idIfCond_412 = false;
			idIfCond_412 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(exp));

			if (idIfCond_412) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_413 = false;
		idIfCond_413 = this.isParameter();

		if (idIfCond_413) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.container(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//Beginning of the Inlining of the function type: detect

			kermeta.language.behavior.Expression result_ft94 = null;

			kermeta.language.behavior.Expression elem_ft94 = null;

			result_ft94 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_414 = false;
				while (!idLoopCond_414) {
					idLoopCond_414 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft94.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft94, null));
					if (idLoopCond_414) {
					} else {

						elem_ft94 = it_ft94.next();

						java.lang.Boolean idIfCond_415 = false;
						//Beginning of the Inlining of the lambda expression: detector
						kermeta.language.behavior.Expression p = elem_ft94;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_415 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p, this);
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_415) {

							result_ft94 = elem_ft94;
						}

					}
				}
			}

			//callElement
			exp = result_ft94;
			//End of the Inlining of the function type: detect

			result = ((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
									.<kermeta.language.structure.Parameter> convertAsOrderedSet(
											cf_.getStaticOperation()
													.getOwnedParameter())
									.elementAt(i),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Parameter")));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterForOwningOperationSingle() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_416 = false;
		idIfCond_416 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_416) {

			java.lang.Boolean idIfCond_417 = false;
			idIfCond_417 = kermeta.standard.helper.IntegerWrapper.equals(this
					.retrieveCorrespondingParameter().getUpper(), 1);

			if (idIfCond_417) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterForOwningOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_418 = false;
		idIfCond_418 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.container(this),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.CallFeature")),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(this
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))));

		if (idIfCond_418) {

			//Beginning of the Inlining of the function type: detect

			kermeta.language.structure.Parameter result_ft95 = null;

			kermeta.language.structure.Parameter elem_ft95 = null;

			result_ft95 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asType(
												this
														.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.Operation")),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))
										.getOwnedParameter()).iterator();
				java.lang.Boolean idLoopCond_419 = false;
				while (!idLoopCond_419) {
					idLoopCond_419 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft95.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft95, null));
					if (idLoopCond_419) {
					} else {

						elem_ft95 = it_ft95.next();

						java.lang.Boolean idIfCond_420 = false;
						//Beginning of the Inlining of the lambda expression: detector
						kermeta.language.structure.Parameter p = elem_ft95;

						idIfCond_420 = kermeta.standard.helper.StringWrapper
								.equals(p.getName(), this.getName());
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_420) {

							result_ft95 = elem_ft95;
						}

					}
				}
			}

			//End of the Inlining of the function type: detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(result_ft95));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isFunctionTypeVariable() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Parameter ftParam = this
				.retrieveCorrespondingParameter();

		java.lang.Boolean idIfCond_421 = false;
		idIfCond_421 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_421) {

			java.lang.Boolean idIfCond_422 = false;
			idIfCond_422 = ftParam.isFunctionType();

			if (idIfCond_422) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterMany() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_423 = false;
		idIfCond_423 = this.isParameter();

		if (idIfCond_423) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.container(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//Beginning of the Inlining of the function type: detect

			kermeta.language.behavior.Expression result_ft96 = null;

			kermeta.language.behavior.Expression elem_ft96 = null;

			result_ft96 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_424 = false;
				while (!idLoopCond_424) {
					idLoopCond_424 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft96.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft96, null));
					if (idLoopCond_424) {
					} else {

						elem_ft96 = it_ft96.next();

						java.lang.Boolean idIfCond_425 = false;
						//Beginning of the Inlining of the lambda expression: detector
						kermeta.language.behavior.Expression p = elem_ft96;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_425 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p, this);
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_425) {

							result_ft96 = elem_ft96;
						}

					}
				}
			}

			//callElement
			exp = result_ft96;
			//End of the Inlining of the function type: detect

			java.lang.Boolean idIfCond_426 = false;
			idIfCond_426 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(
							((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Parameter> convertAsOrderedSet(
															cf_
																	.getStaticOperation()
																	.getOwnedParameter())
													.elementAt(i),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Parameter")))
									.getUpper(), 1);

			if (idIfCond_426) {

				result = true;
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isParameterSingle() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_427 = false;
		idIfCond_427 = this.isParameter();

		if (idIfCond_427) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.container(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//Beginning of the Inlining of the function type: detect

			kermeta.language.behavior.Expression result_ft97 = null;

			kermeta.language.behavior.Expression elem_ft97 = null;

			result_ft97 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_428 = false;
				while (!idLoopCond_428) {
					idLoopCond_428 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft97.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft97, null));
					if (idLoopCond_428) {
					} else {

						elem_ft97 = it_ft97.next();

						java.lang.Boolean idIfCond_429 = false;
						//Beginning of the Inlining of the lambda expression: detector
						kermeta.language.behavior.Expression p = elem_ft97;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_429 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p, this);
						//End of the Inlining of the lambda expression: detector

						if (idIfCond_429) {

							result_ft97 = elem_ft97;
						}

					}
				}
			}

			//callElement
			exp = result_ft97;
			//End of the Inlining of the function type: detect

			java.lang.Boolean idIfCond_430 = false;
			idIfCond_430 = kermeta.standard.helper.IntegerWrapper
					.equals(
							((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
													.<kermeta.language.structure.Parameter> convertAsOrderedSet(
															cf_
																	.getStaticOperation()
																	.getOwnedParameter())
													.elementAt(i),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Parameter")))
									.getUpper(), 1);

			if (idIfCond_430) {

				result = true;
			}

		}

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
		case BehaviorPackage.CALL_VARIABLE__IS_ATPRE:
			return getIsAtpre();
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
		case BehaviorPackage.CALL_VARIABLE__IS_ATPRE:
			setIsAtpre((Boolean) newValue);
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
		case BehaviorPackage.CALL_VARIABLE__IS_ATPRE:
			setIsAtpre(IS_ATPRE_EDEFAULT);
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
		case BehaviorPackage.CALL_VARIABLE__IS_ATPRE:
			return IS_ATPRE_EDEFAULT == null ? isAtpre != null
					: !IS_ATPRE_EDEFAULT.equals(isAtpre);
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
		result.append(" (isAtpre: ");
		result.append(isAtpre);
		result.append(')');
		return result.toString();
	}

} //CallVariableImpl
