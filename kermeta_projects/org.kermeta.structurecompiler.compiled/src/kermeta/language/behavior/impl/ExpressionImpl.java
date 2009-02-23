/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ExpressionImpl.java,v 1.13 2009-02-23 15:26:46 cfaucher Exp $
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
 *   <li>{@link kermeta.language.behavior.impl.ExpressionImpl#getIsLastExpression <em>Is Last Expression</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.ExpressionImpl#getStaticType <em>Static Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionImpl extends TypeContainerImpl implements
		Expression {
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
	 * The default value of the '{@link #getIsLastExpression() <em>Is Last Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLastExpression()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LAST_EXPRESSION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsLastExpression() <em>Is Last Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLastExpression()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLastExpression = IS_LAST_EXPRESSION_EDEFAULT;

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
	public Boolean getIsLastExpression() {
		return isLastExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLastExpression(Boolean newIsLastExpression) {
		Boolean oldIsLastExpression = isLastExpression;
		isLastExpression = newIsLastExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.EXPRESSION__IS_LAST_EXPRESSION,
					oldIsLastExpression, isLastExpression));
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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_453 = false;
		idIfCond_453 = kermeta.standard.helper.BooleanWrapper.and(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getCompiledJavaExtern(), ""),
				kermeta.standard.helper.StringWrapper.equals(context
						.getCompiledJavaExtern(), ""));

		if (idIfCond_453) {

			context.setCompiledJavaExtern(this.getCompiledJavaExtern());

			java.lang.Boolean idIfCond_454 = false;
			idIfCond_454 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_454) {

				context
						.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper
								.split(
										kermeta.standard.helper.StringWrapper
												.replace(
														context
																.getCompiledJavaExtern(),
														"(", "%"), "%").first());
			}

			java.lang.Boolean idIfCond_455 = false;
			idIfCond_455 = kermeta.standard.helper.BooleanWrapper
					.or(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(context
													.getCurrent_valueType())),
							context.getStaticOperationMode());

			if (idIfCond_455) {

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
	public String endOfExpressionFixer() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_456 = false;
		idIfCond_456 = kermeta.standard.helper.BooleanWrapper.not(this
				.callsFunctionType());

		if (idIfCond_456) {

			java.lang.Boolean idIfCond_457 = false;
			idIfCond_457 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_457) {

				java.lang.Boolean idIfCond_458 = false;
				idIfCond_458 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.Assignment"));

				if (idIfCond_458) {

					kermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Assignment")));

					java.lang.Boolean idIfCond_459 = false;
					idIfCond_459 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(assignment.getTarget(), this);

					if (idIfCond_459) {

						result = "";
					} else {

						java.lang.Boolean idIfCond_460 = false;
						idIfCond_460 = assignment.getTarget()
								.isCallFeatureAsStaticProperty();

						if (idIfCond_460) {

							result = "";
						} else {

							java.lang.Boolean idIfCond_461 = false;
							idIfCond_461 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(assignment),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature"));

							if (idIfCond_461) {

								result = "";
							} else {

								result = kermeta.standard.helper.StringWrapper
										.plus(
												kermeta.standard.helper.StringWrapper
														.plus(
																((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.Assignment")))
																		.getValueTypeCastSuffix(),
																((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.containerSwitcher(this),
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.Assignment")))
																		.getCacheCastSuffix()),
												";");
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
	public Boolean mustBeAssigned() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_462 = false;
		idIfCond_462 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_462) {

			result = true;
		}

		java.lang.Boolean idIfCond_463 = false;
		idIfCond_463 = this.isFunctionTypeVariable();

		if (idIfCond_463) {

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
			kermeta.utils.StringBuffer javaCode) {

		kermeta.utils.StringBuffer result = null;

		kermeta.language.behavior.Expression stm = this;

		java.lang.String str_statement = kermeta.standard.helper.StringWrapper
				.normalizeStatement(stm.createBehaviorJava(context));

		kermeta.standard.Sequence<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
				.split(str_statement, context.getSEPARATOR_STATEMENT_FT());

		java.lang.Boolean idIfCond_464 = false;
		idIfCond_464 = kermeta.standard.helper.IntegerWrapper.equals(
				str_statement_splitted.size(), 2);

		if (idIfCond_464) {

			java.lang.String s1 = str_statement_splitted.first();

			java.lang.String s2 = str_statement_splitted.last();

			java.lang.Boolean idIfCond_465 = false;
			idIfCond_465 = kermeta.standard.helper.StringWrapper.contains(s2,
					context.getPREVIOUS_STATEMENT_FT());

			if (idIfCond_465) {

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

		java.lang.Boolean idIfCond_466 = false;
		//BIft:andThen

		java.lang.Boolean result_ft131 = null;

		java.lang.Boolean idIfCond_467 = false;
		idIfCond_467 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getIsLastExpression()));

		if (idIfCond_467) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object i_lbdExp131 = null;

			result_ft131 = this.getIsLastExpression();
			//EIle:right

		} else {

			result_ft131 = false;
		}

		//CEC
		idIfCond_466 = result_ft131;
		//EIft:andThen

		if (idIfCond_466) {

			java.lang.Boolean idIfCond_468 = false;
			idIfCond_468 = stm.mustBeAssigned();

			if (idIfCond_468) {

				java.lang.Boolean idIfCond_469 = false;
				idIfCond_469 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"));

				if (idIfCond_469) {

					javaCode.append(context.getNOT_EVALUATED_MESSAGE());
				} else {

					java.lang.Boolean idIfCond_470 = false;
					idIfCond_470 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
									.getOperation()))
							.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											stm,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Expression")))
									.getStaticType().getTypeName());

					if (idIfCond_470) {

						javaCode.append(context.getNOT_EVALUATED_MESSAGE());
					} else {

						java.lang.Boolean idIfCond_471 = false;
						idIfCond_471 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_471) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
						} else {

							java.lang.Boolean idIfCond_472 = false;
							idIfCond_472 = kermeta.standard.helper.StringWrapper
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

							if (idIfCond_472) {

								javaCode.append(context
										.getResultLastStatementId());
							}

						}

					}

				}

			} else {

				java.lang.Boolean idIfCond_473 = false;
				idIfCond_473 = kermeta.standard.helper.BooleanWrapper
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

				if (idIfCond_473) {

					java.lang.Boolean idIfCond_474 = false;
					idIfCond_474 = kermeta.standard.helper.StringWrapper
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

					if (idIfCond_474) {

						java.lang.Boolean idIfCond_475 = false;
						idIfCond_475 = stm.callsFunctionType();

						if (idIfCond_475) {

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

							java.lang.Boolean idIfCond_476 = false;
							idIfCond_476 = kermeta.standard.helper.StringWrapper
									.contains(
											str_statement,
											context
													.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

							if (idIfCond_476) {

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

			java.lang.Boolean idIfCond_477 = false;
			idIfCond_477 = stm.mustBeAssigned();

			if (idIfCond_477) {

				javaCode.append(context.getNOT_EVALUATED_MESSAGE());
			}

		}

		java.lang.Boolean idIfCond_478 = false;
		idIfCond_478 = kermeta.standard.helper.StringWrapper.contains(
				str_statement, context
						.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

		if (idIfCond_478) {

			java.lang.Boolean idIfCond_479 = false;
			idIfCond_479 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_479) {

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

		java.lang.Boolean idIfCond_480 = false;
		idIfCond_480 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallVariable"));

		if (idIfCond_480) {

			java.lang.Boolean idIfCond_481 = false;
			idIfCond_481 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable")))
					.isFunctionTypeVariable();

			if (idIfCond_481) {

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
		case BehaviorPackage.EXPRESSION__IS_LAST_EXPRESSION:
			return getIsLastExpression();
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
		case BehaviorPackage.EXPRESSION__IS_LAST_EXPRESSION:
			setIsLastExpression((Boolean) newValue);
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
		case BehaviorPackage.EXPRESSION__IS_LAST_EXPRESSION:
			setIsLastExpression(IS_LAST_EXPRESSION_EDEFAULT);
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
		case BehaviorPackage.EXPRESSION__IS_LAST_EXPRESSION:
			return IS_LAST_EXPRESSION_EDEFAULT == null ? isLastExpression != null
					: !IS_LAST_EXPRESSION_EDEFAULT.equals(isLastExpression);
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
		result.append(", isLastExpression: ");
		result.append(isLastExpression);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
