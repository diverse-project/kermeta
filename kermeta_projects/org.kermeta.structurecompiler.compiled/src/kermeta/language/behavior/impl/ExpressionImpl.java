/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ExpressionImpl.java,v 1.12 2009-02-10 17:51:50 cfaucher Exp $
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
	public String endOfExpressionFixer() {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_54 = false;
		idIfCond_54 = kermeta.standard.helper.BooleanWrapper.not(this
				.callsFunctionType());

		if (idIfCond_54) {

			java.lang.Boolean idIfCond_55 = false;
			idIfCond_55 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_55) {

				java.lang.Boolean idIfCond_56 = false;
				idIfCond_56 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.Assignment"));

				if (idIfCond_56) {

					kermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.containerSwitcher(this),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Assignment")));

					java.lang.Boolean idIfCond_57 = false;
					idIfCond_57 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.equalsSwitcher(assignment.getTarget(), this);

					if (idIfCond_57) {

						result = "";
					} else {

						java.lang.Boolean idIfCond_58 = false;
						idIfCond_58 = assignment.getTarget()
								.isCallFeatureAsStaticProperty();

						if (idIfCond_58) {

							result = "";
						} else {

							java.lang.Boolean idIfCond_59 = false;
							idIfCond_59 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(assignment),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature"));

							if (idIfCond_59) {

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
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_60 = false;
		idIfCond_60 = kermeta.standard.helper.BooleanWrapper.and(
				org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isNotEqualSwitcher(this.getCompiledJavaExtern(), ""),
				kermeta.standard.helper.StringWrapper.equals(context
						.getCompiledJavaExtern(), ""));

		if (idIfCond_60) {

			context.setCompiledJavaExtern(this.getCompiledJavaExtern());

			java.lang.Boolean idIfCond_61 = false;
			idIfCond_61 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_61) {

				context
						.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper
								.split(
										kermeta.standard.helper.StringWrapper
												.replace(
														context
																.getCompiledJavaExtern(),
														"(", "%"), "%").first());
			}

			java.lang.Boolean idIfCond_62 = false;
			idIfCond_62 = kermeta.standard.helper.BooleanWrapper
					.or(
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(context
													.getCurrent_valueType())),
							context.getStaticOperationMode());

			if (idIfCond_62) {

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

		java.lang.Boolean idIfCond_63 = false;
		idIfCond_63 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_63) {

			result = true;
		}

		java.lang.Boolean idIfCond_64 = false;
		idIfCond_64 = this.isFunctionTypeVariable();

		if (idIfCond_64) {

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

		java.lang.Boolean idIfCond_65 = false;
		idIfCond_65 = kermeta.standard.helper.IntegerWrapper.equals(
				str_statement_splitted.size(), 2);

		if (idIfCond_65) {

			java.lang.String s1 = str_statement_splitted.first();

			java.lang.String s2 = str_statement_splitted.last();

			java.lang.Boolean idIfCond_66 = false;
			idIfCond_66 = kermeta.standard.helper.StringWrapper.contains(s2,
					context.getPREVIOUS_STATEMENT_FT());

			if (idIfCond_66) {

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

		java.lang.Boolean idIfCond_67 = false;
		//BIft:andThen

		java.lang.Boolean result_ft11 = null;

		java.lang.Boolean idIfCond_68 = false;
		idIfCond_68 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.getIsLastExpression()));

		if (idIfCond_68) {

			//BIle:right
			/*This variable should be never used*/kermeta.language.structure.Object i_lbdExp11 = null;

			result_ft11 = this.getIsLastExpression();
			//EIle:right

		} else {

			result_ft11 = false;
		}

		//CEC
		idIfCond_67 = result_ft11;
		//EIft:andThen

		if (idIfCond_67) {

			java.lang.Boolean idIfCond_69 = false;
			idIfCond_69 = stm.mustBeAssigned();

			if (idIfCond_69) {

				java.lang.Boolean idIfCond_70 = false;
				idIfCond_70 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.containerSwitcher(this),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"));

				if (idIfCond_70) {

					javaCode.append(context.getNOT_EVALUATED_MESSAGE());
				} else {

					java.lang.Boolean idIfCond_71 = false;
					idIfCond_71 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
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

					if (idIfCond_71) {

						javaCode.append(context.getNOT_EVALUATED_MESSAGE());
					} else {

						java.lang.Boolean idIfCond_72 = false;
						idIfCond_72 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_72) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
						} else {

							java.lang.Boolean idIfCond_73 = false;
							idIfCond_73 = kermeta.standard.helper.StringWrapper
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

							if (idIfCond_73) {

								javaCode.append(context
										.getResultLastStatementId());
							}

						}

					}

				}

			} else {

				java.lang.Boolean idIfCond_74 = false;
				idIfCond_74 = kermeta.standard.helper.BooleanWrapper
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

				if (idIfCond_74) {

					java.lang.Boolean idIfCond_75 = false;
					idIfCond_75 = kermeta.standard.helper.StringWrapper
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

					if (idIfCond_75) {

						java.lang.Boolean idIfCond_76 = false;
						idIfCond_76 = stm.callsFunctionType();

						if (idIfCond_76) {

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

							java.lang.Boolean idIfCond_77 = false;
							idIfCond_77 = kermeta.standard.helper.StringWrapper
									.contains(
											str_statement,
											context
													.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

							if (idIfCond_77) {

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

			java.lang.Boolean idIfCond_78 = false;
			idIfCond_78 = stm.mustBeAssigned();

			if (idIfCond_78) {

				javaCode.append(context.getNOT_EVALUATED_MESSAGE());
			}

		}

		java.lang.Boolean idIfCond_79 = false;
		idIfCond_79 = kermeta.standard.helper.StringWrapper.contains(
				str_statement, context
						.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

		if (idIfCond_79) {

			java.lang.Boolean idIfCond_80 = false;
			idIfCond_80 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_80) {

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

		java.lang.Boolean idIfCond_81 = false;
		idIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						this,
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallVariable"));

		if (idIfCond_81) {

			java.lang.Boolean idIfCond_82 = false;
			idIfCond_82 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallVariable")))
					.isFunctionTypeVariable();

			if (idIfCond_82) {

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
