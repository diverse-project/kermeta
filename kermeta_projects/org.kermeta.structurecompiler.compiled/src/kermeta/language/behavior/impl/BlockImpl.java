/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.3 2008-09-22 14:46:52 cfaucher Exp $
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

		java.lang.Boolean idIfCond_410 = false;
		idIfCond_410 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_410) {

			javaCode.append("{\n");
		}

		java.lang.Boolean idIfCond_411 = false;
		idIfCond_411 = this.containsRescue();

		if (idIfCond_411) {

			javaCode.append("try {");
		}

		java.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.behavior.Expression> convertAsOrderedSet(
						this.getStatement()).size();

		java.lang.Integer i_stm = 0;

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_412 = false;
			while (!idLoopCond_412) {
				idLoopCond_412 = it_ft62.isOff();
				if (idLoopCond_412) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp62 = it_ft62.next();

					//BIle:func
					kermeta.language.structure.Tag stm_lbdExp61 = o_lbdExp62;

					java.lang.String str_statement = kermeta.standard.helper.StringWrapper
							.normalizeStatement(stm_lbdExp61
									.createBehaviorJava(context));

					kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
							.split(str_statement, context
									.getSEPARATOR_STATEMENT_FT());

					java.lang.Boolean idIfCond_413 = false;
					idIfCond_413 = kermeta.standard.helper.IntegerWrapper
							.equals(str_statement_splitted.size(), 2);

					if (idIfCond_413) {

						java.lang.String s1 = str_statement_splitted.first();

						java.lang.String s2 = str_statement_splitted.last();

						java.lang.Boolean idIfCond_414 = false;
						idIfCond_414 = kermeta.standard.helper.StringWrapper
								.contains(s2, context
										.getPREVIOUS_STATEMENT_FT());

						if (idIfCond_414) {

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

					java.lang.Boolean idIfCond_415 = false;
					idIfCond_415 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_415) {

						java.lang.Boolean idIfCond_416 = false;
						idIfCond_416 = kermeta.standard.helper.IntegerWrapper
								.isGreater(context.getLastStatementStack()
										.size(), 0);

						if (idIfCond_416) {

							javaCode.append(context.getLastStatementStack()
									.pop());
						}

						java.lang.Boolean idIfCond_417 = false;
						idIfCond_417 = stm_lbdExp61.mustBeAssigned();

						if (idIfCond_417) {

							java.lang.Boolean idIfCond_418 = false;
							idIfCond_418 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation"));

							if (idIfCond_418) {

								javaCode.append(context
										.getNOT_EVALUATED_MESSAGE());
							} else {

								java.lang.Boolean idIfCond_419 = false;
								idIfCond_419 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														stm_lbdExp61,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Expression")))
												.getStaticType().getTypeName());

								if (idIfCond_419) {

									javaCode.append(context
											.getNOT_EVALUATED_MESSAGE());
								} else {

									java.lang.Boolean idIfCond_420 = false;
									idIfCond_420 = kermeta.standard.helper.BooleanWrapper
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

									if (idIfCond_420) {

										javaCode.append(context
												.getNOT_EVALUATED_MESSAGE());
									} else {

										java.lang.Boolean idIfCond_421 = false;
										idIfCond_421 = kermeta.standard.helper.StringWrapper
												.equals(
														context
																.getResultLastStatementType(),
														((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asType(
																		stm_lbdExp61,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.Expression")))
																.getStaticType()
																.createBehaviorJava(
																		context));

										if (idIfCond_421) {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						} else {

							java.lang.Boolean idIfCond_422 = false;
							idIfCond_422 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															stm_lbdExp61,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallFeature")),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															context
																	.getResultLastStatementStack()
																	.size(), 0));

							if (idIfCond_422) {

								java.lang.Boolean idIfCond_423 = false;
								idIfCond_423 = kermeta.standard.helper.StringWrapper
										.equals(
												context
														.getResultLastStatementType(),
												((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																stm_lbdExp61,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.Expression")))
														.getStaticType()
														.createBehaviorJava(
																context));

								if (idIfCond_423) {

									java.lang.Boolean idIfCond_424 = false;
									idIfCond_424 = stm_lbdExp61
											.callsFunctionType();

									if (idIfCond_424) {

										str_statement = kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						str_statement,
																						context
																								.getResultLastStatementId()),
																		context
																				.getResultOfLastFt()),
														";\n");
									} else {

										javaCode.append(context
												.getResultLastStatementId());
									}

								}

							}

						}

					} else {

						java.lang.Boolean idIfCond_425 = false;
						idIfCond_425 = stm_lbdExp61.mustBeAssigned();

						if (idIfCond_425) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getStatement()).iterator();
			java.lang.Boolean idLoopCond_426 = false;
			while (!idLoopCond_426) {
				idLoopCond_426 = it_ft63.isOff();
				if (idLoopCond_426) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression s_lbdExp63 = it_ft63
							.next();

					//BIle:func
					kermeta.language.behavior.Expression stm_lbdExp61 = s_lbdExp63;

					java.lang.String str_statement = kermeta.standard.helper.StringWrapper
							.normalizeStatement(stm_lbdExp61
									.createBehaviorJava(context));

					kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
							.split(str_statement, context
									.getSEPARATOR_STATEMENT_FT());

					java.lang.Boolean idIfCond_427 = false;
					idIfCond_427 = kermeta.standard.helper.IntegerWrapper
							.equals(str_statement_splitted.size(), 2);

					if (idIfCond_427) {

						java.lang.String s1 = str_statement_splitted.first();

						java.lang.String s2 = str_statement_splitted.last();

						java.lang.Boolean idIfCond_428 = false;
						idIfCond_428 = kermeta.standard.helper.StringWrapper
								.contains(s2, context
										.getPREVIOUS_STATEMENT_FT());

						if (idIfCond_428) {

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

					java.lang.Boolean idIfCond_429 = false;
					idIfCond_429 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_429) {

						java.lang.Boolean idIfCond_430 = false;
						idIfCond_430 = kermeta.standard.helper.IntegerWrapper
								.isGreater(context.getLastStatementStack()
										.size(), 0);

						if (idIfCond_430) {

							javaCode.append(context.getLastStatementStack()
									.pop());
						}

						java.lang.Boolean idIfCond_431 = false;
						idIfCond_431 = stm_lbdExp61.mustBeAssigned();

						if (idIfCond_431) {

							java.lang.Boolean idIfCond_432 = false;
							idIfCond_432 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation"));

							if (idIfCond_432) {

								javaCode.append(context
										.getNOT_EVALUATED_MESSAGE());
							} else {

								java.lang.Boolean idIfCond_433 = false;
								idIfCond_433 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														stm_lbdExp61,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Expression")))
												.getStaticType().getTypeName());

								if (idIfCond_433) {

									javaCode.append(context
											.getNOT_EVALUATED_MESSAGE());
								} else {

									java.lang.Boolean idIfCond_434 = false;
									idIfCond_434 = kermeta.standard.helper.BooleanWrapper
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

									if (idIfCond_434) {

										javaCode.append(context
												.getNOT_EVALUATED_MESSAGE());
									} else {

										java.lang.Boolean idIfCond_435 = false;
										idIfCond_435 = kermeta.standard.helper.StringWrapper
												.equals(
														context
																.getResultLastStatementType(),
														((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asType(
																		stm_lbdExp61,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.Expression")))
																.getStaticType()
																.createBehaviorJava(
																		context));

										if (idIfCond_435) {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						} else {

							java.lang.Boolean idIfCond_436 = false;
							idIfCond_436 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															stm_lbdExp61,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallFeature")),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															context
																	.getResultLastStatementStack()
																	.size(), 0));

							if (idIfCond_436) {

								java.lang.Boolean idIfCond_437 = false;
								idIfCond_437 = kermeta.standard.helper.StringWrapper
										.equals(
												context
														.getResultLastStatementType(),
												((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																stm_lbdExp61,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.Expression")))
														.getStaticType()
														.createBehaviorJava(
																context));

								if (idIfCond_437) {

									java.lang.Boolean idIfCond_438 = false;
									idIfCond_438 = stm_lbdExp61
											.callsFunctionType();

									if (idIfCond_438) {

										str_statement = kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						str_statement,
																						context
																								.getResultLastStatementId()),
																		context
																				.getResultOfLastFt()),
														";\n");
									} else {

										javaCode.append(context
												.getResultLastStatementId());
									}

								}

							}

						}

					} else {

						java.lang.Boolean idIfCond_439 = false;
						idIfCond_439 = stm_lbdExp61.mustBeAssigned();

						if (idIfCond_439) {

							javaCode.append(context.getNOT_EVALUATED_MESSAGE());
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

		java.lang.Boolean idIfCond_440 = false;
		idIfCond_440 = this.containsRescue();

		if (idIfCond_440) {

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

				kermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Rescue> convertAsOrderedSet(
								this.getRescueBlock()).iterator();
				java.lang.Boolean idLoopCond_441 = false;
				while (!idLoopCond_441) {
					idLoopCond_441 = it_ft64.isOff();
					if (idLoopCond_441) {
					} else {

						//BIle:func
						kermeta.language.behavior.Rescue e_lbdExp64 = it_ft64
								.next();

						javaCode.append(e_lbdExp64.createBehaviorJava(context));
						//EIle:func

					}
				}
			}

			//EIft:each

			javaCode.append("\n}\n");

			context.getKRErrorStack().pop();
		} else {
		}

		java.lang.Boolean idIfCond_442 = false;
		idIfCond_442 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_442) {

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

		java.lang.Boolean idIfCond_443 = false;
		idIfCond_443 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_443) {

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
