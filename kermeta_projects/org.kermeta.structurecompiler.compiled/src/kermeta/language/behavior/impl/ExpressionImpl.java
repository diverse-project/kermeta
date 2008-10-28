/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpressionImpl.java,v 1.6 2008-10-28 13:18:15 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Expression;

import kermeta.language.structure.Type;

import kermeta.language.structure.impl.TypeContainerImpl;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.ExpressionImpl#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.ExpressionImpl#getStaticType <em>Static Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends TypeContainerImpl implements Expression {
	/**
	 * The default value of the '{@link #getBeforeLambdaExpressionResult() <em>Before Lambda Expression Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeLambdaExpressionResult()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeforeLambdaExpressionResult() <em>Before Lambda Expression Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeLambdaExpressionResult()
	 * @generated
	 * @ordered
	 */
	protected String beforeLambdaExpressionResult = BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaticType() <em>Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticType()
	 * @generated
	 * @ordered
	 */
	protected Type staticType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeforeLambdaExpressionResult() {
		return beforeLambdaExpressionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeLambdaExpressionResult(
			String newBeforeLambdaExpressionResult) {
		String oldBeforeLambdaExpressionResult = beforeLambdaExpressionResult;
		beforeLambdaExpressionResult = newBeforeLambdaExpressionResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					BehaviorPackage.EXPRESSION__BEFORE_LAMBDA_EXPRESSION_RESULT,
					oldBeforeLambdaExpressionResult,
					beforeLambdaExpressionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getStaticType() {
		if (staticType != null && staticType.eIsProxy()) {
			InternalEObject oldStaticType = (InternalEObject) staticType;
			staticType = (Type) eResolveProxy(oldStaticType);
			if (staticType != oldStaticType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.EXPRESSION__STATIC_TYPE,
							oldStaticType, staticType));
			}
		}
		return staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetStaticType() {
		return staticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticType(Type newStaticType) {
		Type oldStaticType = staticType;
		staticType = newStaticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.EXPRESSION__STATIC_TYPE, oldStaticType,
					staticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String endOfExpressionFixer() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_378 = false;
		idIfCond_378 = kermeta.standard.helper.BooleanWrapper.not(this
				.callsFunctionType());

		if (idIfCond_378) {

			java.lang.Boolean idIfCond_379 = false;
			idIfCond_379 = kermeta.standard.helper.BooleanWrapper
					.or(
							kermeta.standard.helper.BooleanWrapper
									.or(
											kermeta.standard.helper.BooleanWrapper
													.or(
															kermeta.standard.helper.BooleanWrapper
																	.or(
																			kermeta.standard.helper.BooleanWrapper
																					.or(
																							kermeta.standard.helper.BooleanWrapper
																									.or(
																											kermeta.standard.helper.BooleanWrapper
																													.or(
																															kermeta.standard.helper.BooleanWrapper
																																	.or(
																																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																																					.isInstanceOfSwitcher(
																																							org.kermeta.compil.runtime.helper.language.ObjectUtil
																																									.containerSwitcher(this),
																																							org.kermeta.compil.runtime.ExecutionContext
																																									.getInstance()
																																									.getMetaClass(
																																											"kermeta.language.behavior.Conditional")),
																																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																																					.isInstanceOfSwitcher(
																																							org.kermeta.compil.runtime.helper.language.ObjectUtil
																																									.containerSwitcher(this),
																																							org.kermeta.compil.runtime.ExecutionContext
																																									.getInstance()
																																									.getMetaClass(
																																											"kermeta.language.behavior.Loop"))),
																															org.kermeta.compil.runtime.helper.language.ObjectUtil
																																	.isInstanceOfSwitcher(
																																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																																					.containerSwitcher(this),
																																			org.kermeta.compil.runtime.ExecutionContext
																																					.getInstance()
																																					.getMetaClass(
																																							"kermeta.language.behavior.Block"))),
																											org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.isInstanceOfSwitcher(
																															org.kermeta.compil.runtime.helper.language.ObjectUtil
																																	.containerSwitcher(this),
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.behavior.Rescue"))),
																							org.kermeta.compil.runtime.helper.language.ObjectUtil
																									.isInstanceOfSwitcher(
																											org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.containerSwitcher(this),
																											org.kermeta.compil.runtime.ExecutionContext
																													.getInstance()
																													.getMetaClass(
																															"kermeta.language.behavior.Assignment"))),
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.isInstanceOfSwitcher(
																							org.kermeta.compil.runtime.helper.language.ObjectUtil
																									.containerSwitcher(this),
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.behavior.VariableDecl"))),
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.isInstanceOfSwitcher(
																			org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.containerSwitcher(this),
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Operation"))),
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOfSwitcher(
															org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.containerSwitcher(this),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Property"))),
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Constraint")));

			if (idIfCond_379) {

				java.lang.Boolean idIfCond_380 = false;
				idIfCond_380 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.Assignment"));

				if (idIfCond_380) {

					kermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Assignment")));

					java.lang.Boolean idIfCond_381 = false;
					idIfCond_381 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(assignment.getTarget(), this);

					if (idIfCond_381) {

						result = "";
					} else {

						java.lang.Boolean idIfCond_382 = false;
						idIfCond_382 = assignment.getTarget()
								.isCallFeatureAsStaticProperty();

						if (idIfCond_382) {

							result = "";
						} else {

							java.lang.Boolean idIfCond_383 = false;
							idIfCond_383 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(assignment),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature"));

							if (idIfCond_383) {

								result = "";
							} else {

								result = ";";
							}

						}

					}

				} else {

					result = ";";
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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_384 = false;
		idIfCond_384 = kermeta.standard.helper.BooleanWrapper.and(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getCompiledJavaExtern(), ""),
				kermeta.standard.helper.StringWrapper.equals(context
						.getCompiledJavaExtern(), ""));

		if (idIfCond_384) {

			context.setCompiledJavaExtern(this.getCompiledJavaExtern());

			java.lang.Boolean idIfCond_385 = false;
			idIfCond_385 = kermeta.standard.helper.BooleanWrapper
					.or(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(this
													.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.FunctionType")))),
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(this
													.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.LambdaExpression")))));

			if (idIfCond_385) {

				context
						.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper
								.split(
										kermeta.standard.helper.StringWrapper
												.replace(
														context
																.getCompiledJavaExtern(),
														"(", "%"), "%").first());
			}

			java.lang.Boolean idIfCond_386 = false;
			idIfCond_386 = kermeta.standard.helper.BooleanWrapper
					.or(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(context
													.getCurrent_valueType())),
							context.getStaticOperationMode());

			if (idIfCond_386) {

				context
						.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper
								.replace(context.getCompiledJavaExtern(),
										"this", "self"));
			}

		}

		result = "";

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mustBeAssigned() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_387 = false;
		idIfCond_387 = kermeta.standard.helper.BooleanWrapper
				.or(
						kermeta.standard.helper.BooleanWrapper
								.or(
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.BooleanWrapper
																.or(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isInstanceOfSwitcher(
																						this,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.behavior.CallVariable")),
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isInstanceOfSwitcher(
																						this,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.behavior.Literal"))),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		this,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.SelfExpression"))),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														this,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.CallResult"))),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										this,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.VoidType")));

		if (idIfCond_387) {

			result = true;
		}

		java.lang.Boolean idIfCond_388 = false;
		idIfCond_388 = this.isFunctionTypeVariable();

		if (idIfCond_388) {

			result = false;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.utils.StringBuffer createExpression(KM2EcoreContext context,
			kermeta.utils.StringBuffer javaCode, Boolean lastExpression) {

		kermeta.utils.StringBuffer result = null;

		kermeta.language.behavior.Expression stm = this;

		java.lang.String str_statement = kermeta.standard.helper.StringWrapper
				.normalizeStatement(stm.createBehaviorJava(context));

		kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
				.split(str_statement, context.getSEPARATOR_STATEMENT_FT());

		java.lang.Boolean idIfCond_389 = false;
		idIfCond_389 = kermeta.standard.helper.IntegerWrapper.equals(
				str_statement_splitted.size(), 2);

		if (idIfCond_389) {

			java.lang.String s1 = str_statement_splitted.first();

			java.lang.String s2 = str_statement_splitted.last();

			java.lang.Boolean idIfCond_390 = false;
			idIfCond_390 = kermeta.standard.helper.StringWrapper.contains(s2,
					context.getPREVIOUS_STATEMENT_FT());

			if (idIfCond_390) {

				str_statement = kermeta.standard.helper.StringWrapper.replace(
						s2, context.getPREVIOUS_STATEMENT_FT(), s1);
			}

		}

		str_statement = kermeta.standard.helper.StringWrapper.replace(
				str_statement, kermeta.standard.helper.StringWrapper.plus(
						context.getSEPARATOR_STATEMENT_FT(), "//"), "//");

		str_statement = kermeta.standard.helper.StringWrapper.replace(
				str_statement, kermeta.standard.helper.StringWrapper.plus(
						context.getRETURN_EXPRESSION_TO_REPLACE(), "result"),
				"result");

		javaCode.append(context.getBeforeLambdaExpressionResult());

		context.setBeforeLambdaExpressionResult("");

		javaCode.append("\n\t");

		java.lang.Boolean idIfCond_391 = false;
		idIfCond_391 = lastExpression;

		if (idIfCond_391) {

			java.lang.Boolean idIfCond_392 = false;
			idIfCond_392 = stm.mustBeAssigned();

			if (idIfCond_392) {

				java.lang.Boolean idIfCond_393 = false;
				idIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"));

				if (idIfCond_393) {

					javaCode.append(context.getNOT_EVALUATED_MESSAGE());
				} else {

					java.lang.Boolean idIfCond_394 = false;
					idIfCond_394 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.language.structure.Operation"))
							.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											stm,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Expression")))
									.getStaticType().getTypeName());

					if (idIfCond_394) {

						javaCode.append(context.getNOT_EVALUATED_MESSAGE());
					} else {

						java.lang.Boolean idIfCond_395 = false;
						idIfCond_395 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.BooleanWrapper
																.or(
																		kermeta.standard.helper.BooleanWrapper
																				.or(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.isInstanceOfSwitcher(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.containerSwitcher(this)),
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"kermeta.language.behavior.Block")),
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.isInstanceOfSwitcher(
																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
																														.containerSwitcher(this)),
																										org.kermeta.compil.runtime.ExecutionContext
																												.getInstance()
																												.getMetaClass(
																														"kermeta.language.structure.Operation"))),
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.isInstanceOfSwitcher(
																						org.kermeta.compil.runtime.helper.language.ObjectUtil
																								.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.containerSwitcher(this)),
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property"))),
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this)),
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Constraint"))),
										kermeta.standard.helper.IntegerWrapper
												.equals(
														context
																.getResultLastStatementStack()
																.size(), 0));

						if (idIfCond_395) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
						} else {

							java.lang.Boolean idIfCond_396 = false;
							idIfCond_396 = kermeta.standard.helper.StringWrapper
									.equals(
											context
													.getResultLastStatementType(),
											((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															stm,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.Expression")))
													.getStaticType()
													.createBehaviorJava(context));

							if (idIfCond_396) {

								javaCode.append(context
										.getResultLastStatementId());
							}

						}

					}

				}

			} else {

				java.lang.Boolean idIfCond_397 = false;
				idIfCond_397 = kermeta.standard.helper.BooleanWrapper
						.and(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												stm,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature")),
								kermeta.standard.helper.IntegerWrapper
										.isGreater(context
												.getResultLastStatementStack()
												.size(), 0));

				if (idIfCond_397) {

					java.lang.Boolean idIfCond_398 = false;
					idIfCond_398 = kermeta.standard.helper.StringWrapper
							.equals(
									context.getResultLastStatementType(),
									((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													stm,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.Expression")))
											.getStaticType()
											.createBehaviorJava(context));

					if (idIfCond_398) {

						java.lang.Boolean idIfCond_399 = false;
						idIfCond_399 = stm.callsFunctionType();

						if (idIfCond_399) {

							str_statement = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			str_statement,
																			context
																					.getResultLastStatementId()),
															((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			stm,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.behavior.CallFeature")))
																	.getCalledFtResult()),
											";\n");
						} else {

							java.lang.Boolean idIfCond_400 = false;
							idIfCond_400 = kermeta.standard.helper.StringWrapper
									.contains(
											str_statement,
											context
													.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

							if (idIfCond_400) {

								str_statement = kermeta.standard.helper.StringWrapper
										.replace(
												str_statement,
												context
														.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(),
												context
														.getResultLastStatementId());
							} else {

								javaCode.append(context
										.getResultLastStatementId());
							}

						}

					}

				}

			}

		} else {

			java.lang.Boolean idIfCond_401 = false;
			idIfCond_401 = stm.mustBeAssigned();

			if (idIfCond_401) {

				javaCode.append(context.getNOT_EVALUATED_MESSAGE());
			}

		}

		java.lang.Boolean idIfCond_402 = false;
		idIfCond_402 = kermeta.standard.helper.StringWrapper.contains(
				str_statement, context
						.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

		if (idIfCond_402) {

			java.lang.Boolean idIfCond_403 = false;
			idIfCond_403 = kermeta.standard.helper.BooleanWrapper
					.not(kermeta.standard.helper.StringWrapper
							.contains(
									str_statement,
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	"(\"",
																	context
																			.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()),
													"\")")));

			if (idIfCond_403) {

				str_statement = kermeta.standard.helper.StringWrapper.replace(
						str_statement, context
								.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), "");
			}

		}

		javaCode.append(str_statement);

		result = javaCode;

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

		java.lang.Boolean idIfCond_404 = false;
		idIfCond_404 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallVariable"));

		if (idIfCond_404) {

			java.lang.Boolean idIfCond_405 = false;
			idIfCond_405 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable")))
					.isFunctionTypeVariable();

			if (idIfCond_405) {

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
		case BehaviorPackage.EXPRESSION__BEFORE_LAMBDA_EXPRESSION_RESULT:
			return getBeforeLambdaExpressionResult();
		case BehaviorPackage.EXPRESSION__STATIC_TYPE:
			if (resolve)
				return getStaticType();
			return basicGetStaticType();
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
		case BehaviorPackage.EXPRESSION__BEFORE_LAMBDA_EXPRESSION_RESULT:
			setBeforeLambdaExpressionResult((String) newValue);
			return;
		case BehaviorPackage.EXPRESSION__STATIC_TYPE:
			setStaticType((Type) newValue);
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
		case BehaviorPackage.EXPRESSION__BEFORE_LAMBDA_EXPRESSION_RESULT:
			setBeforeLambdaExpressionResult(BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT);
			return;
		case BehaviorPackage.EXPRESSION__STATIC_TYPE:
			setStaticType((Type) null);
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
		case BehaviorPackage.EXPRESSION__BEFORE_LAMBDA_EXPRESSION_RESULT:
			return BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT == null ? beforeLambdaExpressionResult != null
					: !BEFORE_LAMBDA_EXPRESSION_RESULT_EDEFAULT
							.equals(beforeLambdaExpressionResult);
		case BehaviorPackage.EXPRESSION__STATIC_TYPE:
			return staticType != null;
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
		result.append(" (beforeLambdaExpressionResult: ");
		result.append(beforeLambdaExpressionResult);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
