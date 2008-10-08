/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.4 2008-10-08 14:37:39 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Block;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.Rescue;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.BlockImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.BlockImpl#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends ExpressionImpl implements Block {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> statement;

	/**
	 * The cached value of the '{@link #getRescueBlock() <em>Rescue Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescueBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Rescue> rescueBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList.Resolving<Expression>(
					Expression.class, this, BehaviorPackage.BLOCK__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rescue> getRescueBlock() {
		if (rescueBlock == null) {
			rescueBlock = new EObjectContainmentEList.Resolving<Rescue>(
					Rescue.class, this, BehaviorPackage.BLOCK__RESCUE_BLOCK);
		}
		return rescueBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.utils.StringBuffer"));

		java.lang.Boolean idIfCond_437 = false;
		idIfCond_437 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.container(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation"))),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.container(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_437) {

			javaCode.append("{\n");
		}

		java.lang.Boolean idIfCond_438 = false;
		idIfCond_438 = this.containsRescue();

		if (idIfCond_438) {

			javaCode.append("try {");
		}

		java.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.behavior.Expression> convertAsOrderedSet(
						this.getStatement()).size();

		java.lang.Integer i_stm = 0;

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft141 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_439 = false;
			while (!idLoopCond_439) {
				idLoopCond_439 = it_ft141.isOff();
				if (idLoopCond_439) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp141 = it_ft141
							.next();

					//BIle:func
					kermeta.language.structure.Tag stm_lbdExp140 = o_lbdExp141;

					java.lang.String str_statement = kermeta.standard.helper.StringWrapper
							.normalizeStatement(stm_lbdExp140
									.createBehaviorJava(context));

					kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
							.split(str_statement, context
									.getSEPARATOR_STATEMENT_FT());

					java.lang.Boolean idIfCond_440 = false;
					idIfCond_440 = kermeta.standard.helper.IntegerWrapper
							.equals(str_statement_splitted.size(), 2);

					if (idIfCond_440) {

						java.lang.String s1 = str_statement_splitted.first();

						java.lang.String s2 = str_statement_splitted.last();

						java.lang.Boolean idIfCond_441 = false;
						idIfCond_441 = kermeta.standard.helper.StringWrapper
								.contains(s2, context
										.getPREVIOUS_STATEMENT_FT());

						if (idIfCond_441) {

							str_statement = kermeta.standard.helper.StringWrapper
									.replace(s2, context
											.getPREVIOUS_STATEMENT_FT(), s1);
						}

					}

					str_statement = kermeta.standard.helper.StringWrapper
							.replace(
									str_statement,
									kermeta.standard.helper.StringWrapper
											.plus(
													context
															.getSEPARATOR_STATEMENT_FT(),
													"//"), "//");

					str_statement = kermeta.standard.helper.StringWrapper
							.replace(
									str_statement,
									kermeta.standard.helper.StringWrapper
											.plus(
													context
															.getRETURN_EXPRESSION_TO_REPLACE(),
													"result"), "result");

					javaCode.append(context.getBeforeLambdaExpressionResult());

					context.setBeforeLambdaExpressionResult("");

					javaCode.append("\n\t");

					java.lang.Boolean idIfCond_442 = false;
					idIfCond_442 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_442) {

						java.lang.Boolean idIfCond_443 = false;
						idIfCond_443 = stm_lbdExp140.mustBeAssigned();

						if (idIfCond_443) {

							java.lang.Boolean idIfCond_444 = false;
							idIfCond_444 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation"));

							if (idIfCond_444) {

								javaCode.append(context
										.getNOT_EVALUATED_MESSAGE());
							} else {

								java.lang.Boolean idIfCond_445 = false;
								idIfCond_445 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														stm_lbdExp140,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Expression")))
												.getStaticType().getTypeName());

								if (idIfCond_445) {

									javaCode.append(context
											.getNOT_EVALUATED_MESSAGE());
								} else {

									java.lang.Boolean idIfCond_446 = false;
									idIfCond_446 = kermeta.standard.helper.BooleanWrapper
											.and(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.container(org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.container(this)),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.behavior.Block")),
													kermeta.standard.helper.IntegerWrapper
															.equals(
																	context
																			.getResultLastStatementStack()
																			.size(),
																	0));

									if (idIfCond_446) {

										javaCode.append(context
												.getNOT_EVALUATED_MESSAGE());
									} else {

										java.lang.Boolean idIfCond_447 = false;
										idIfCond_447 = kermeta.standard.helper.StringWrapper
												.equals(
														context
																.getResultLastStatementType(),
														((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asType(
																		stm_lbdExp140,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.Expression")))
																.getStaticType()
																.createBehaviorJava(
																		context));

										if (idIfCond_447) {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						} else {

							java.lang.Boolean idIfCond_448 = false;
							idIfCond_448 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															stm_lbdExp140,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallFeature")),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															context
																	.getResultLastStatementStack()
																	.size(), 0));

							if (idIfCond_448) {

								java.lang.Boolean idIfCond_449 = false;
								idIfCond_449 = kermeta.standard.helper.StringWrapper
										.equals(
												context
														.getResultLastStatementType(),
												((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																stm_lbdExp140,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.Expression")))
														.getStaticType()
														.createBehaviorJava(
																context));

								if (idIfCond_449) {

									java.lang.Boolean idIfCond_450 = false;
									idIfCond_450 = stm_lbdExp140
											.callsFunctionType();

									if (idIfCond_450) {

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
																				.asType(
																						stm_lbdExp140,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.behavior.CallFeature")))
																				.getCalledFtResult()),
														";\n");
									} else {

										java.lang.Boolean idIfCond_451 = false;
										idIfCond_451 = kermeta.standard.helper.StringWrapper
												.contains(
														str_statement,
														context
																.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

										if (idIfCond_451) {

											str_statement = kermeta.standard.helper.StringWrapper
													.replace(
															str_statement,
															context
																	.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(),
															context
																	.getResultLastStatementId());
										} else {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						}

					} else {

						java.lang.Boolean idIfCond_452 = false;
						idIfCond_452 = stm_lbdExp140.mustBeAssigned();

						if (idIfCond_452) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
						}

					}

					java.lang.Boolean idIfCond_453 = false;
					idIfCond_453 = kermeta.standard.helper.StringWrapper
							.contains(str_statement, context
									.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

					if (idIfCond_453) {

						java.lang.Boolean idIfCond_454 = false;
						idIfCond_454 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_454) {

							str_statement = kermeta.standard.helper.StringWrapper
									.replace(
											str_statement,
											context
													.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(),
											"");
						}

					}

					javaCode.append(str_statement);

					javaCode.append("\n");

					i_stm = kermeta.standard.helper.IntegerWrapper.plus(i_stm,
							1);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft142 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getStatement()).iterator();
			java.lang.Boolean idLoopCond_455 = false;
			while (!idLoopCond_455) {
				idLoopCond_455 = it_ft142.isOff();
				if (idLoopCond_455) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression s_lbdExp142 = it_ft142
							.next();

					//BIle:func
					kermeta.language.behavior.Expression stm_lbdExp140 = s_lbdExp142;

					java.lang.String str_statement = kermeta.standard.helper.StringWrapper
							.normalizeStatement(stm_lbdExp140
									.createBehaviorJava(context));

					kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
							.split(str_statement, context
									.getSEPARATOR_STATEMENT_FT());

					java.lang.Boolean idIfCond_456 = false;
					idIfCond_456 = kermeta.standard.helper.IntegerWrapper
							.equals(str_statement_splitted.size(), 2);

					if (idIfCond_456) {

						java.lang.String s1 = str_statement_splitted.first();

						java.lang.String s2 = str_statement_splitted.last();

						java.lang.Boolean idIfCond_457 = false;
						idIfCond_457 = kermeta.standard.helper.StringWrapper
								.contains(s2, context
										.getPREVIOUS_STATEMENT_FT());

						if (idIfCond_457) {

							str_statement = kermeta.standard.helper.StringWrapper
									.replace(s2, context
											.getPREVIOUS_STATEMENT_FT(), s1);
						}

					}

					str_statement = kermeta.standard.helper.StringWrapper
							.replace(
									str_statement,
									kermeta.standard.helper.StringWrapper
											.plus(
													context
															.getSEPARATOR_STATEMENT_FT(),
													"//"), "//");

					str_statement = kermeta.standard.helper.StringWrapper
							.replace(
									str_statement,
									kermeta.standard.helper.StringWrapper
											.plus(
													context
															.getRETURN_EXPRESSION_TO_REPLACE(),
													"result"), "result");

					javaCode.append(context.getBeforeLambdaExpressionResult());

					context.setBeforeLambdaExpressionResult("");

					javaCode.append("\n\t");

					java.lang.Boolean idIfCond_458 = false;
					idIfCond_458 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_458) {

						java.lang.Boolean idIfCond_459 = false;
						idIfCond_459 = stm_lbdExp140.mustBeAssigned();

						if (idIfCond_459) {

							java.lang.Boolean idIfCond_460 = false;
							idIfCond_460 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation"));

							if (idIfCond_460) {

								javaCode.append(context
										.getNOT_EVALUATED_MESSAGE());
							} else {

								java.lang.Boolean idIfCond_461 = false;
								idIfCond_461 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														stm_lbdExp140,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Expression")))
												.getStaticType().getTypeName());

								if (idIfCond_461) {

									javaCode.append(context
											.getNOT_EVALUATED_MESSAGE());
								} else {

									java.lang.Boolean idIfCond_462 = false;
									idIfCond_462 = kermeta.standard.helper.BooleanWrapper
											.and(
													org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	org.kermeta.compil.runtime.helper.language.ObjectUtil
																			.container(org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.container(this)),
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.behavior.Block")),
													kermeta.standard.helper.IntegerWrapper
															.equals(
																	context
																			.getResultLastStatementStack()
																			.size(),
																	0));

									if (idIfCond_462) {

										javaCode.append(context
												.getNOT_EVALUATED_MESSAGE());
									} else {

										java.lang.Boolean idIfCond_463 = false;
										idIfCond_463 = kermeta.standard.helper.StringWrapper
												.equals(
														context
																.getResultLastStatementType(),
														((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asType(
																		stm_lbdExp140,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.Expression")))
																.getStaticType()
																.createBehaviorJava(
																		context));

										if (idIfCond_463) {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						} else {

							java.lang.Boolean idIfCond_464 = false;
							idIfCond_464 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															stm_lbdExp140,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallFeature")),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															context
																	.getResultLastStatementStack()
																	.size(), 0));

							if (idIfCond_464) {

								java.lang.Boolean idIfCond_465 = false;
								idIfCond_465 = kermeta.standard.helper.StringWrapper
										.equals(
												context
														.getResultLastStatementType(),
												((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																stm_lbdExp140,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.Expression")))
														.getStaticType()
														.createBehaviorJava(
																context));

								if (idIfCond_465) {

									java.lang.Boolean idIfCond_466 = false;
									idIfCond_466 = stm_lbdExp140
											.callsFunctionType();

									if (idIfCond_466) {

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
																				.asType(
																						stm_lbdExp140,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.behavior.CallFeature")))
																				.getCalledFtResult()),
														";\n");
									} else {

										java.lang.Boolean idIfCond_467 = false;
										idIfCond_467 = kermeta.standard.helper.StringWrapper
												.contains(
														str_statement,
														context
																.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

										if (idIfCond_467) {

											str_statement = kermeta.standard.helper.StringWrapper
													.replace(
															str_statement,
															context
																	.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(),
															context
																	.getResultLastStatementId());
										} else {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						}

					} else {

						java.lang.Boolean idIfCond_468 = false;
						idIfCond_468 = stm_lbdExp140.mustBeAssigned();

						if (idIfCond_468) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
						}

					}

					java.lang.Boolean idIfCond_469 = false;
					idIfCond_469 = kermeta.standard.helper.StringWrapper
							.contains(str_statement, context
									.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());

					if (idIfCond_469) {

						java.lang.Boolean idIfCond_470 = false;
						idIfCond_470 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_470) {

							str_statement = kermeta.standard.helper.StringWrapper
									.replace(
											str_statement,
											context
													.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(),
											"");
						}

					}

					javaCode.append(str_statement);

					javaCode.append("\n");

					i_stm = kermeta.standard.helper.IntegerWrapper.plus(i_stm,
							1);
					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

		java.lang.Boolean idIfCond_471 = false;
		idIfCond_471 = this.containsRescue();

		if (idIfCond_471) {

			context.pushKRErrorStack();

			javaCode
					.append(kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									kermeta.standard.helper.StringWrapper
																											.plus(
																													"} catch( ",
																													context
																															.getJAVA_CLASS_EXCEPTION_SWITCHER()),
																									" "),
																					context
																							.getVARIABLE_EXCEPTION_SWITCHER()),
																	"_"),
													context.getKRErrorStack()
															.peek()), " ) {\n"));

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft143 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Rescue> convertAsOrderedSet(
								this.getRescueBlock()).iterator();
				java.lang.Boolean idLoopCond_472 = false;
				while (!idLoopCond_472) {
					idLoopCond_472 = it_ft143.isOff();
					if (idLoopCond_472) {
					} else {

						//BIle:func
						kermeta.language.behavior.Rescue e_lbdExp143 = it_ft143
								.next();

						javaCode
								.append(e_lbdExp143.createBehaviorJava(context));
						//EIle:func

					}
				}
			}

			//EIft:each

			javaCode.append("\n}\n");

			context.getKRErrorStack().pop();
		}

		java.lang.Boolean idIfCond_473 = false;
		idIfCond_473 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.container(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation"))),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.container(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_473) {

			javaCode.append("}");
		}

		result = javaCode.toString();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean containsRescue() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_474 = false;
		idIfCond_474 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.behavior.Rescue> convertAsOrderedSet(this
														.getRescueBlock()))),
						kermeta.standard.helper.IntegerWrapper
								.isGreater(
										org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.behavior.Rescue> convertAsOrderedSet(
														this.getRescueBlock())
												.size(), 0));

		if (idIfCond_474) {

			result = true;
		}

		return result;

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
		case BehaviorPackage.BLOCK__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd,
					msgs);
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			return ((InternalEList<?>) getRescueBlock()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviorPackage.BLOCK__STATEMENT:
			return getStatement();
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			return getRescueBlock();
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
		case BehaviorPackage.BLOCK__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Expression>) newValue);
			return;
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			getRescueBlock().clear();
			getRescueBlock().addAll((Collection<? extends Rescue>) newValue);
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
		case BehaviorPackage.BLOCK__STATEMENT:
			getStatement().clear();
			return;
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			getRescueBlock().clear();
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
		case BehaviorPackage.BLOCK__STATEMENT:
			return statement != null && !statement.isEmpty();
		case BehaviorPackage.BLOCK__RESCUE_BLOCK:
			return rescueBlock != null && !rescueBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
