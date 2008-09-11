/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.2 2008-09-11 12:34:40 cfaucher Exp $
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

		java.lang.Boolean idIfCond_339 = false;
		idIfCond_339 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_339) {

			javaCode.append("{\n");
		}

		java.lang.Boolean idIfCond_340 = false;
		idIfCond_340 = this.containsRescue();

		if (idIfCond_340) {

			javaCode.append("try {");
		}

		java.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.language.behavior.Expression> convertAsOrderedSet(
						this.getStatement()).size();

		java.lang.Integer i_stm = 0;

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							this.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_341 = false;
			while (!idLoopCond_341) {
				idLoopCond_341 = it_ft93.isOff();
				if (idLoopCond_341) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp93 = it_ft93.next();

					//BIle:func
					kermeta.language.structure.Tag stm_lbdExp92 = o_lbdExp93;

					java.lang.String str_statement = kermeta.standard.helper.StringWrapper
							.replace(kermeta.standard.helper.StringWrapper
									.replace(stm_lbdExp92
											.createBehaviorJava(context),
											" == null", " == null"), ";", ";");

					kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
							.split(str_statement, context
									.getSEPARATOR_STATEMENT_FT());

					java.lang.Boolean idIfCond_342 = false;
					idIfCond_342 = kermeta.standard.helper.IntegerWrapper
							.equals(str_statement_splitted.size(), 2);

					if (idIfCond_342) {

						java.lang.String s1 = str_statement_splitted.first();

						java.lang.String s2 = str_statement_splitted.last();

						java.lang.Boolean idIfCond_343 = false;
						idIfCond_343 = kermeta.standard.helper.StringWrapper
								.contains(s2, context
										.getPREVIOUS_STATEMENT_FT());

						if (idIfCond_343) {

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

					java.lang.Boolean idIfCond_344 = false;
					idIfCond_344 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_344) {

						java.lang.Boolean idIfCond_345 = false;
						idIfCond_345 = kermeta.standard.helper.IntegerWrapper
								.isGreater(context.getLastStatementStack()
										.size(), 0);

						if (idIfCond_345) {

							javaCode.append(context.getLastStatementStack()
									.pop());
						}

						java.lang.Boolean idIfCond_346 = false;
						idIfCond_346 = stm_lbdExp92.mustBeAssigned();

						if (idIfCond_346) {

							java.lang.Boolean idIfCond_347 = false;
							idIfCond_347 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation"));

							if (idIfCond_347) {

								javaCode.append(context
										.getNOT_EVALUATED_MESSAGE());
							} else {

								java.lang.Boolean idIfCond_348 = false;
								idIfCond_348 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														stm_lbdExp92,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Expression")))
												.getStaticType().getTypeName());

								if (idIfCond_348) {

									javaCode.append(context
											.getNOT_EVALUATED_MESSAGE());
								} else {

									java.lang.Boolean idIfCond_349 = false;
									idIfCond_349 = kermeta.standard.helper.BooleanWrapper
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

									if (idIfCond_349) {

										javaCode.append(context
												.getNOT_EVALUATED_MESSAGE());
									} else {

										java.lang.Boolean idIfCond_350 = false;
										idIfCond_350 = kermeta.standard.helper.StringWrapper
												.equals(
														context
																.getResultLastStatementType(),
														((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asType(
																		stm_lbdExp92,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.Expression")))
																.getStaticType()
																.createBehaviorJava(
																		context));

										if (idIfCond_350) {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						} else {

							java.lang.Boolean idIfCond_351 = false;
							idIfCond_351 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															stm_lbdExp92,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallFeature")),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															context
																	.getResultLastStatementStack()
																	.size(), 0));

							if (idIfCond_351) {

								java.lang.Boolean idIfCond_352 = false;
								idIfCond_352 = kermeta.standard.helper.StringWrapper
										.equals(
												context
														.getResultLastStatementType(),
												((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																stm_lbdExp92,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.Expression")))
														.getStaticType()
														.createBehaviorJava(
																context));

								if (idIfCond_352) {

									java.lang.Boolean idIfCond_353 = false;
									idIfCond_353 = stm_lbdExp92
											.callsFunctionType();

									if (idIfCond_353) {

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

						java.lang.Boolean idIfCond_354 = false;
						idIfCond_354 = stm_lbdExp92.mustBeAssigned();

						if (idIfCond_354) {

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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							this.getStatement()).iterator();
			java.lang.Boolean idLoopCond_355 = false;
			while (!idLoopCond_355) {
				idLoopCond_355 = it_ft94.isOff();
				if (idLoopCond_355) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression s_lbdExp94 = it_ft94
							.next();

					//BIle:func
					kermeta.language.behavior.Expression stm_lbdExp92 = s_lbdExp94;

					java.lang.String str_statement = kermeta.standard.helper.StringWrapper
							.replace(kermeta.standard.helper.StringWrapper
									.replace(stm_lbdExp92
											.createBehaviorJava(context),
											" == null", " == null"), ";", ";");

					kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper
							.split(str_statement, context
									.getSEPARATOR_STATEMENT_FT());

					java.lang.Boolean idIfCond_356 = false;
					idIfCond_356 = kermeta.standard.helper.IntegerWrapper
							.equals(str_statement_splitted.size(), 2);

					if (idIfCond_356) {

						java.lang.String s1 = str_statement_splitted.first();

						java.lang.String s2 = str_statement_splitted.last();

						java.lang.Boolean idIfCond_357 = false;
						idIfCond_357 = kermeta.standard.helper.StringWrapper
								.contains(s2, context
										.getPREVIOUS_STATEMENT_FT());

						if (idIfCond_357) {

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

					java.lang.Boolean idIfCond_358 = false;
					idIfCond_358 = kermeta.standard.helper.IntegerWrapper
							.equals(i_stm,
									kermeta.standard.helper.IntegerWrapper
											.minus(nbrStm, 1));

					if (idIfCond_358) {

						java.lang.Boolean idIfCond_359 = false;
						idIfCond_359 = kermeta.standard.helper.IntegerWrapper
								.isGreater(context.getLastStatementStack()
										.size(), 0);

						if (idIfCond_359) {

							javaCode.append(context.getLastStatementStack()
									.pop());
						}

						java.lang.Boolean idIfCond_360 = false;
						idIfCond_360 = stm_lbdExp92.mustBeAssigned();

						if (idIfCond_360) {

							java.lang.Boolean idIfCond_361 = false;
							idIfCond_361 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOf(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation"));

							if (idIfCond_361) {

								javaCode.append(context
										.getNOT_EVALUATED_MESSAGE());
							} else {

								java.lang.Boolean idIfCond_362 = false;
								idIfCond_362 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
										.newObject("kermeta.language.structure.Operation"))
										.isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														stm_lbdExp92,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.Expression")))
												.getStaticType().getTypeName());

								if (idIfCond_362) {

									javaCode.append(context
											.getNOT_EVALUATED_MESSAGE());
								} else {

									java.lang.Boolean idIfCond_363 = false;
									idIfCond_363 = kermeta.standard.helper.BooleanWrapper
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

									if (idIfCond_363) {

										javaCode.append(context
												.getNOT_EVALUATED_MESSAGE());
									} else {

										java.lang.Boolean idIfCond_364 = false;
										idIfCond_364 = kermeta.standard.helper.StringWrapper
												.equals(
														context
																.getResultLastStatementType(),
														((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																.asType(
																		stm_lbdExp92,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.behavior.Expression")))
																.getStaticType()
																.createBehaviorJava(
																		context));

										if (idIfCond_364) {

											javaCode
													.append(context
															.getResultLastStatementId());
										}

									}

								}

							}

						} else {

							java.lang.Boolean idIfCond_365 = false;
							idIfCond_365 = kermeta.standard.helper.BooleanWrapper
									.and(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.isInstanceOf(
															stm_lbdExp92,
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.CallFeature")),
											kermeta.standard.helper.IntegerWrapper
													.isGreater(
															context
																	.getResultLastStatementStack()
																	.size(), 0));

							if (idIfCond_365) {

								java.lang.Boolean idIfCond_366 = false;
								idIfCond_366 = kermeta.standard.helper.StringWrapper
										.equals(
												context
														.getResultLastStatementType(),
												((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
														.asType(
																stm_lbdExp92,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.behavior.Expression")))
														.getStaticType()
														.createBehaviorJava(
																context));

								if (idIfCond_366) {

									java.lang.Boolean idIfCond_367 = false;
									idIfCond_367 = stm_lbdExp92
											.callsFunctionType();

									if (idIfCond_367) {

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

						java.lang.Boolean idIfCond_368 = false;
						idIfCond_368 = stm_lbdExp92.mustBeAssigned();

						if (idIfCond_368) {

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

		java.lang.Boolean idIfCond_369 = false;
		idIfCond_369 = this.containsRescue();

		if (idIfCond_369) {

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

				kermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Rescue> convertAsOrderedSet(
								this.getRescueBlock()).iterator();
				java.lang.Boolean idLoopCond_370 = false;
				while (!idLoopCond_370) {
					idLoopCond_370 = it_ft95.isOff();
					if (idLoopCond_370) {
					} else {

						//BIle:func
						kermeta.language.behavior.Rescue e_lbdExp95 = it_ft95
								.next();

						javaCode.append(e_lbdExp95.createBehaviorJava(context));
						//EIle:func

					}
				}
			}

			//EIft:each

			javaCode.append("\n}\n");

			context.getKRErrorStack().pop();
		} else {
		}

		java.lang.Boolean idIfCond_371 = false;
		idIfCond_371 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_371) {

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

		java.lang.Boolean idIfCond_372 = false;
		idIfCond_372 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_372) {

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
