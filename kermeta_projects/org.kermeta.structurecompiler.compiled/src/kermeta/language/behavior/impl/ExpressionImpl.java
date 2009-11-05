/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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

		java.lang.Boolean idIfCond_8 = false;
		idIfCond_8 = kermeta.standard.helper.BooleanWrapper.and(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getCompiledJavaExtern(), ""),
				kermeta.standard.helper.StringWrapper.equals(context
						.getCompiledJavaExtern(), ""));

		if (idIfCond_8) {

			context.setCompiledJavaExtern(this.getCompiledJavaExtern());

			java.lang.Boolean idIfCond_9 = false;
			idIfCond_9 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_9) {

				context
						.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper
								.split(
										kermeta.standard.helper.StringWrapper
												.replace(
														context
																.getCompiledJavaExtern(),
														"(", "%"), "%").first());
			}

			java.lang.Boolean idIfCond_10 = false;
			idIfCond_10 = kermeta.standard.helper.BooleanWrapper
					.or(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(context
													.getCurrent_valueType())),
							context.getStaticOperationMode());

			if (idIfCond_10) {

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

		java.lang.Boolean idIfCond_11 = false;
		idIfCond_11 = kermeta.standard.helper.BooleanWrapper.not(this
				.callsFunctionType());

		if (idIfCond_11) {

			java.lang.Boolean idIfCond_12 = false;
			idIfCond_12 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_12) {

				java.lang.Boolean idIfCond_13 = false;
				idIfCond_13 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.Assignment"));

				if (idIfCond_13) {

					kermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Assignment")));

					java.lang.Boolean idIfCond_14 = false;
					idIfCond_14 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(assignment.getTarget(), this);

					if (idIfCond_14) {

						result = "";
					} else {

						java.lang.Boolean idIfCond_15 = false;
						idIfCond_15 = assignment.getTarget()
								.isCallFeatureAsStaticProperty();

						if (idIfCond_15) {

							result = "";
						} else {

							java.lang.Boolean idIfCond_16 = false;
							idIfCond_16 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(assignment),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature"));

							if (idIfCond_16) {

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

		java.lang.Boolean idIfCond_17 = false;
		idIfCond_17 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_17) {

			result = true;
		}

		java.lang.Boolean idIfCond_18 = false;
		idIfCond_18 = this.isFunctionTypeVariable();

		if (idIfCond_18) {

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

		java.lang.Boolean idIfCond_19 = false;
		idIfCond_19 = kermeta.standard.helper.IntegerWrapper.equals(
				str_statement_splitted.size(), 2);

		if (idIfCond_19) {

			java.lang.String s1 = str_statement_splitted.first();

			java.lang.String s2 = str_statement_splitted.last();

			java.lang.Boolean idIfCond_20 = false;
			idIfCond_20 = kermeta.standard.helper.StringWrapper.contains(s2,
					context.getPREVIOUS_STATEMENT_FT());

			if (idIfCond_20) {

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

		java.lang.Boolean idIfCond_21 = false;
		//BIft:andThen

		java.lang.Boolean result_ft1 = null;

		java.lang.Boolean idIfCond_22 = false;
		idIfCond_22 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getIsLastExpression()));

		if (idIfCond_22) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object i_lbdExp1 = null;

			result_ft1 = this.getIsLastExpression();
			//EIle:right

		} else {

			result_ft1 = false;
		}

		//CEC
		idIfCond_21 = result_ft1;
		//EIft:andThen

		if (idIfCond_21) {

			java.lang.Boolean idIfCond_23 = false;
			idIfCond_23 = stm.mustBeAssigned();

			if (idIfCond_23) {

				java.lang.Boolean idIfCond_24 = false;
				idIfCond_24 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"));

				if (idIfCond_24) {

					javaCode.append(context.getNOT_EVALUATED_MESSAGE());
				} else {

					java.lang.Boolean idIfCond_25 = false;
					idIfCond_25 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
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

					if (idIfCond_25) {

						javaCode.append(context.getNOT_EVALUATED_MESSAGE());
					} else {

						java.lang.Boolean idIfCond_26 = false;
						idIfCond_26 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_26) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
						} else {

							java.lang.Boolean idIfCond_27 = false;
							idIfCond_27 = kermeta.standard.helper.StringWrapper
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

							if (idIfCond_27) {

								javaCode.append(context
										.getResultLastStatementId());
							}

						}

					}

				}

			} else {

				java.lang.Boolean idIfCond_28 = false;
				idIfCond_28 = kermeta.standard.helper.BooleanWrapper
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

				if (idIfCond_28) {

					java.lang.Boolean idIfCond_29 = false;
					idIfCond_29 = kermeta.standard.helper.StringWrapper
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

					if (idIfCond_29) {

						java.lang.Boolean idIfCond_30 = false;
						idIfCond_30 = stm.callsFunctionType();

						if (idIfCond_30) {

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

							java.lang.Boolean idIfCond_31 = false;
							idIfCond_31 = kermeta.standard.helper.StringWrapper
									.contains(
											str_statement,
											context
													.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

							if (idIfCond_31) {

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

			java.lang.Boolean idIfCond_32 = false;
			idIfCond_32 = stm.mustBeAssigned();

			if (idIfCond_32) {

				javaCode.append(context.getNOT_EVALUATED_MESSAGE());
			}

		}

		java.lang.Boolean idIfCond_33 = false;
		idIfCond_33 = kermeta.standard.helper.StringWrapper.contains(
				str_statement, context
						.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

		if (idIfCond_33) {

			java.lang.Boolean idIfCond_34 = false;
			idIfCond_34 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_34) {

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

		java.lang.Boolean idIfCond_35 = false;
		idIfCond_35 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallVariable"));

		if (idIfCond_35) {

			java.lang.Boolean idIfCond_36 = false;
			idIfCond_36 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable")))
					.isFunctionTypeVariable();

			if (idIfCond_36) {

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
