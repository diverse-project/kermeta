/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariableImpl.java,v 1.10 2008-11-27 15:49:56 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Block;
import kermeta.language.behavior.CallVariable;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.LambdaExpression;
import kermeta.language.behavior.LambdaParameter;
import kermeta.language.behavior.Loop;

import kermeta.language.structure.Parameter;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.CallVariableImpl#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallVariableImpl#getLambdaExpression <em>Lambda Expression</em>}</li>
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
	 * The cached value of the '{@link #getLambdaExpression() <em>Lambda Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaExpression()
	 * @generated
	 * @ordered
	 */
	protected LambdaExpression lambdaExpression;

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
	public LambdaExpression getLambdaExpression() {
		if (lambdaExpression != null && lambdaExpression.eIsProxy()) {
			InternalEObject oldLambdaExpression = (InternalEObject) lambdaExpression;
			lambdaExpression = (LambdaExpression) eResolveProxy(oldLambdaExpression);
			if (lambdaExpression != oldLambdaExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviorPackage.CALL_VARIABLE__LAMBDA_EXPRESSION,
							oldLambdaExpression, lambdaExpression));
			}
		}
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression basicGetLambdaExpression() {
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambdaExpression(LambdaExpression newLambdaExpression) {
		LambdaExpression oldLambdaExpression = lambdaExpression;
		lambdaExpression = newLambdaExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviorPackage.CALL_VARIABLE__LAMBDA_EXPRESSION,
					oldLambdaExpression, lambdaExpression));
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

		java.lang.Boolean idIfCond_514 = false;
		idIfCond_514 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.StringWrapper.equals(context
						.getTasks_stack().peek(), context
						.getFUNCTION_TYPE_COMPILATION_TASK()), this
						.isFunctionTypeVariable());

		if (idIfCond_514) {

			context.setFtSuffixActivation(false);

			kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this
									.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Operation")),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Operation")))
					.getLambdaExpression();

			this.setLambdaExpression(theLambdaExp);

			java.lang.String str_toInclude = "";

			java.lang.Boolean idIfCond_515 = false;
			idIfCond_515 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_515) {

				java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight().createBehaviorJava(context);

				java.lang.Boolean idIfCond_516 = false;
				idIfCond_516 = kermeta.standard.helper.BooleanWrapper
						.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(lambdaExp_returnType));

				if (idIfCond_516) {
				}

			}

			java.lang.Integer inc_param = 0;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								theLambdaExp.getParameters()).iterator();
				java.lang.Boolean idLoopCond_517 = false;
				while (!idLoopCond_517) {
					idLoopCond_517 = it_ft132.isOff();
					if (idLoopCond_517) {
					} else {

						//BIle:func
						kermeta.language.behavior.LambdaParameter p_lbdExp132 = it_ft132
								.next();

						context.setFtSuffixActivation(false);

						java.lang.String type_param_ = context
								.getFtProductTypeStack().peek().getTypeByIndex(
										inc_param).createBehaviorJava(context);

						java.lang.Boolean idIfCond_518 = false;
						idIfCond_518 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(type_param_);

						if (idIfCond_518) {

							type_param_ = "/*This variable should be never used*/ kermeta.language.structure.Object";
						}

						str_toInclude = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(
																		kermeta.standard.helper.StringWrapper
																				.plus(
																						kermeta.standard.helper.StringWrapper
																								.plus(
																										str_toInclude,
																										type_param_),
																						" "),
																		p_lbdExp132
																				.getName()),
														"_lbdExp"),
										((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														this
																.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation")),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.Operation")))
												.getCuid());

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

						inc_param = kermeta.standard.helper.IntegerWrapper
								.plus(inc_param, 1);
						//EIle:func

					}
				}
			}

			//EIft:each

			context.setAfterLbdExpActivation(false);

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(result,
									"//BIle:"), this.getName()), "\n");

			context.setFtSuffixActivation(false);

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result,
							str_toInclude), theLambdaExp.getBody()
							.createBehaviorJava(context));

			context.setFtSuffixActivation(true);

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(result,
									"//EIle:"), this.getName()), "\n");

			context.setAfterLbdExpActivation(true);
		} else {

			java.lang.Boolean idIfCond_519 = false;
			idIfCond_519 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "stdio");

			if (idIfCond_519) {

				result = kermeta.standard.helper.StringWrapper
						.plus(result,
								"org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()");
			} else {

				java.lang.Boolean idIfCond_520 = false;
				idIfCond_520 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameter()),
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameterForOwningOperation()));

				if (idIfCond_520) {

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
									this.printSuffix(context));
				} else {

					java.lang.Boolean idIfCond_521 = false;
					idIfCond_521 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.BooleanWrapper.or(this
									.isParameterSingle(), this
									.isParameterForOwningOperationSingle()),
							this.isParameterManyAndForOwningOperation());

					if (idIfCond_521) {

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
										this.printSuffix(context));
					} else {

						kermeta.language.structure.Parameter c_param = null;

						java.lang.Boolean idIfCond_522 = false;
						idIfCond_522 = this.isParameterForOwningOperation();

						if (idIfCond_522) {

							c_param = this.retrieveCorrespondingParameter();
						} else {

							c_param = this
									.getCallFeatureCorrespondingParameter();
						}

						java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeVariableBinding> convertAsOrderedSet(
										((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														this.getStaticType(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.Class")))
												.getTypeParamBinding()).first()
								.getType().createBehaviorJava(context);

						java.lang.Boolean idIfCond_523 = false;
						idIfCond_523 = this.isParameterMany();

						if (idIfCond_523) {

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

							java.lang.Boolean idIfCond_524 = false;
							idIfCond_524 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_524) {

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

							java.lang.Boolean idIfCond_525 = false;
							idIfCond_525 = kermeta.standard.helper.BooleanWrapper
									.and(
											c_param.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_525) {

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

							java.lang.Boolean idIfCond_526 = false;
							idIfCond_526 = kermeta.standard.helper.BooleanWrapper
									.and(c_param.getIsUnique(), c_param
											.getIsOrdered());

							if (idIfCond_526) {

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

							java.lang.Boolean idIfCond_527 = false;
							idIfCond_527 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(c_param.getIsUnique()),
											c_param.getIsOrdered());

							if (idIfCond_527) {

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
														this
																.printSuffix(context)),
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

		java.lang.Boolean idIfCond_528 = false;
		idIfCond_528 = kermeta.standard.helper.BooleanWrapper.and(this
				.isParameterMany(), this.isParameterForOwningOperation());

		if (idIfCond_528) {

			result = true;
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isDeclaredInLambdaExpression() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_529 = false;
		idIfCond_529 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_529) {

			kermeta.language.behavior.Block tmp_block = null;

			tmp_block = (kermeta.language.behavior.Block) org.kermeta.compil.runtime.ExecutionContext
					.getInstance()
					.<kermeta.language.behavior.Block> asTypeOrVoid(
							this
									.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Block")));

			kermeta.language.behavior.Expression aStatement = null;

			java.lang.Boolean idIfCond_530 = false;
			idIfCond_530 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(tmp_block));

			if (idIfCond_530) {

				aStatement = this.getVariableDeclInBlock(tmp_block);
			}

			java.lang.Boolean idIfCond_531 = false;
			idIfCond_531 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(aStatement));

			if (idIfCond_531) {

				java.lang.Boolean idIfCond_532 = false;
				idIfCond_532 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								aStatement,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_532) {

					kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl")));

					result = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(theVariableDecl
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.LambdaExpression"))));
				}

			}

			java.lang.Boolean idIfCond_533 = false;
			idIfCond_533 = kermeta.standard.helper.BooleanWrapper.not(result);

			if (idIfCond_533) {

				kermeta.language.behavior.Loop tmp_loop = null;

				tmp_loop = (kermeta.language.behavior.Loop) org.kermeta.compil.runtime.ExecutionContext
						.getInstance()
						.<kermeta.language.behavior.Loop> asTypeOrVoid(
								this
										.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Loop")));

				kermeta.language.behavior.Expression aStatement_ = null;

				java.lang.Boolean idIfCond_534 = false;
				idIfCond_534 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(tmp_loop));

				if (idIfCond_534) {

					aStatement_ = this.getVariableDeclInLoop(tmp_loop);
				}

				java.lang.Boolean idIfCond_535 = false;
				idIfCond_535 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(aStatement_));

				if (idIfCond_535) {

					java.lang.Boolean idIfCond_536 = false;
					idIfCond_536 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									aStatement_,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_536) {

						kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));

						result = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(theVariableDecl
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.LambdaExpression"))));
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
	public LambdaParameter getCorrespondingLambdaExpressionParameter() {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_537 = false;
		idIfCond_537 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_537) {

			result = this
					.getLambdaParameter(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									this
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.LambdaExpression")),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.LambdaExpression"))));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getVariableDeclInBlock(Block block) {

		kermeta.language.behavior.Expression result = null;

		//BIft:detect

		kermeta.language.behavior.Expression result_ft133 = null;

		kermeta.language.behavior.Expression elem_ft133 = null;

		result_ft133 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft133 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							block.getStatement()).iterator();
			java.lang.Boolean idLoopCond_538 = false;
			while (!idLoopCond_538) {
				idLoopCond_538 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft133.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft133, null));
				if (idLoopCond_538) {
				} else {

					elem_ft133 = it_ft133.next();

					java.lang.Boolean idIfCond_539 = false;
					//BIle:detector
					kermeta.language.behavior.Expression s_lbdExp133 = elem_ft133;

					java.lang.Boolean idIfCond_540 = false;
					idIfCond_540 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									s_lbdExp133,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_540) {

						idIfCond_539 = kermeta.standard.helper.StringWrapper
								.equals(
										((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														s_lbdExp133,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.VariableDecl")))
												.getIdentifier(), this
												.getName());
					} else {

						idIfCond_539 = false;
					}

					//EIle:detector

					if (idIfCond_539) {

						result_ft133 = elem_ft133;
					}

				}
			}
		}

		//CE
		result = result_ft133;
		//EIft:detect

		java.lang.Boolean idIfCond_541 = false;
		idIfCond_541 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(result),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(block
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.Block")))));

		if (idIfCond_541) {

			result = this
					.getVariableDeclInBlock(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									block
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Block")),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Block"))));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isLambdaExpressionParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_542 = false;
		idIfCond_542 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_542) {

			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(this
									.getLambdaParameter(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													this
															.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.behavior.LambdaExpression")),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.LambdaExpression"))))));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaParameter getLambdaParameter(LambdaExpression lambdaExpression) {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_543 = false;
		idIfCond_543 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(lambdaExpression));

		if (idIfCond_543) {

			//BIft:detect

			kermeta.language.behavior.LambdaParameter result_ft134 = null;

			kermeta.language.behavior.LambdaParameter elem_ft134 = null;

			result_ft134 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft134 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								lambdaExpression.getParameters()).iterator();
				java.lang.Boolean idLoopCond_544 = false;
				while (!idLoopCond_544) {
					idLoopCond_544 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft134.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft134,
													null));
					if (idLoopCond_544) {
					} else {

						elem_ft134 = it_ft134.next();

						java.lang.Boolean idIfCond_545 = false;
						//BIle:detector
						kermeta.language.behavior.LambdaParameter p_lbdExp134 = elem_ft134;

						idIfCond_545 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp134.getName(), this.getName());
						//EIle:detector

						if (idIfCond_545) {

							result_ft134 = elem_ft134;
						}

					}
				}
			}

			//CE
			result = result_ft134;
			//EIft:detect

			java.lang.Boolean idIfCond_546 = false;
			idIfCond_546 = kermeta.standard.helper.BooleanWrapper
					.and(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(result),
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoidSwitcher(lambdaExpression
													.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.LambdaExpression")))));

			if (idIfCond_546) {

				result = this
						.getLambdaParameter(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										lambdaExpression
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.LambdaExpression")),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.LambdaExpression"))));
			}

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isDeclaredInAFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_547 = false;
		idIfCond_547 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_547) {

			java.lang.Boolean idIfCond_548 = false;
			idIfCond_548 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							this
									.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Operation")),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.Operation")))
					.isFunctionType();

			if (idIfCond_548) {

				kermeta.language.behavior.Block tmp_block = null;

				tmp_block = (kermeta.language.behavior.Block) org.kermeta.compil.runtime.ExecutionContext
						.getInstance()
						.<kermeta.language.behavior.Block> asTypeOrVoid(
								this
										.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Block")));

				kermeta.language.behavior.Expression aStatement = null;

				java.lang.Boolean idIfCond_549 = false;
				idIfCond_549 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(tmp_block));

				if (idIfCond_549) {

					aStatement = this.getVariableDeclInBlock(tmp_block);
				}

				java.lang.Boolean idIfCond_550 = false;
				idIfCond_550 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(aStatement));

				if (idIfCond_550) {

					java.lang.Boolean idIfCond_551 = false;
					idIfCond_551 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_551) {

						kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										aStatement,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));

						result = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										theVariableDecl
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.Operation")))
								.isFunctionType();
					}

				}

				java.lang.Boolean idIfCond_552 = false;
				idIfCond_552 = kermeta.standard.helper.BooleanWrapper
						.not(result);

				if (idIfCond_552) {

					kermeta.language.behavior.Loop tmp_loop = null;

					tmp_loop = (kermeta.language.behavior.Loop) org.kermeta.compil.runtime.ExecutionContext
							.getInstance()
							.<kermeta.language.behavior.Loop> asTypeOrVoid(
									this
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Loop")));

					kermeta.language.behavior.Expression aStatement_ = null;

					java.lang.Boolean idIfCond_553 = false;
					idIfCond_553 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(tmp_loop));

					if (idIfCond_553) {

						aStatement_ = this.getVariableDeclInLoop(tmp_loop);
					}

					java.lang.Boolean idIfCond_554 = false;
					idIfCond_554 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(aStatement_));

					if (idIfCond_554) {

						java.lang.Boolean idIfCond_555 = false;
						idIfCond_555 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl"));

						if (idIfCond_555) {

							kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											aStatement_,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.VariableDecl")));

							result = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											theVariableDecl
													.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.Operation")),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.Operation")))
									.isFunctionType();
						}

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
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_556 = false;
		idIfCond_556 = this.isParameter();

		if (idIfCond_556) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft135 = null;

			kermeta.language.behavior.Expression elem_ft135 = null;

			result_ft135 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_557 = false;
				while (!idLoopCond_557) {
					idLoopCond_557 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft135.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft135,
													null));
					if (idLoopCond_557) {
					} else {

						elem_ft135 = it_ft135.next();

						java.lang.Boolean idIfCond_558 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp135 = elem_ft135;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_558 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp135, this);
						//EIle:detector

						if (idIfCond_558) {

							result_ft135 = elem_ft135;
						}

					}
				}
			}

			//CE
			exp = result_ft135;
			//EIft:detect

			result = ((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
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
	public Boolean isParameterForOwningOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_559 = false;
		idIfCond_559 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.containerSwitcher(this),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.CallFeature")),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(this
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.Operation")))));

		if (idIfCond_559) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft136 = null;

			kermeta.language.structure.Parameter elem_ft136 = null;

			result_ft136 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft136 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
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
				java.lang.Boolean idLoopCond_560 = false;
				while (!idLoopCond_560) {
					idLoopCond_560 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft136.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft136,
													null));
					if (idLoopCond_560) {
					} else {

						elem_ft136 = it_ft136.next();

						java.lang.Boolean idIfCond_561 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp136 = elem_ft136;

						idIfCond_561 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp136.getName(), this.getName());
						//EIle:detector

						if (idIfCond_561) {

							result_ft136 = elem_ft136;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(result_ft136));
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

		java.lang.Boolean idIfCond_562 = false;
		idIfCond_562 = this.isParameter();

		if (idIfCond_562) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft137 = null;

			kermeta.language.behavior.Expression elem_ft137 = null;

			result_ft137 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft137 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_563 = false;
				while (!idLoopCond_563) {
					idLoopCond_563 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft137.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft137,
													null));
					if (idLoopCond_563) {
					} else {

						elem_ft137 = it_ft137.next();

						java.lang.Boolean idIfCond_564 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp137 = elem_ft137;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_564 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp137, this);
						//EIle:detector

						if (idIfCond_564) {

							result_ft137 = elem_ft137;
						}

					}
				}
			}

			//CE
			exp = result_ft137;
			//EIft:detect

			java.lang.Boolean idIfCond_565 = false;
			idIfCond_565 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(
							((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
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

			if (idIfCond_565) {

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

		java.lang.Boolean idIfCond_566 = false;
		idIfCond_566 = this.isParameter();

		if (idIfCond_566) {

			kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.containerSwitcher(this),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.behavior.CallFeature")));

			java.lang.Integer i = kermeta.standard.helper.IntegerWrapper
					.uminus(1);

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft138 = null;

			kermeta.language.behavior.Expression elem_ft138 = null;

			result_ft138 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft138 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_567 = false;
				while (!idLoopCond_567) {
					idLoopCond_567 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft138.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft138,
													null));
					if (idLoopCond_567) {
					} else {

						elem_ft138 = it_ft138.next();

						java.lang.Boolean idIfCond_568 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp138 = elem_ft138;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_568 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp138, this);
						//EIle:detector

						if (idIfCond_568) {

							result_ft138 = elem_ft138;
						}

					}
				}
			}

			//CE
			exp = result_ft138;
			//EIft:detect

			java.lang.Boolean idIfCond_569 = false;
			idIfCond_569 = kermeta.standard.helper.IntegerWrapper
					.equals(
							((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
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

			if (idIfCond_569) {

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
	public Boolean isParameterForOwningOperationMany() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_570 = false;
		idIfCond_570 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.retrieveCorrespondingParameter()));

		if (idIfCond_570) {

			java.lang.Boolean idIfCond_571 = false;
			idIfCond_571 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.retrieveCorrespondingParameter()
							.getUpper(), 1);

			if (idIfCond_571) {

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
	public String printSuffix(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_572 = false;
		idIfCond_572 = this.isLambdaExpressionParameter();

		if (idIfCond_572) {

			result = kermeta.standard.helper.StringWrapper
					.plus(
							"_lbdExp",
							((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(this
															.getCorrespondingLambdaExpressionParameter()),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.LambdaExpression")))
									.getCuid());
		} else {

			java.lang.Boolean idIfCond_573 = false;
			idIfCond_573 = this.isDeclaredInAFunctionType();

			if (idIfCond_573) {

				java.lang.Boolean idIfCond_574 = false;
				idIfCond_574 = kermeta.standard.helper.BooleanWrapper
						.and(
								context.getAfterLbdExpActivation(),
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isNotEqualSwitcher(context
												.printFtSuffix(), ""));

				if (idIfCond_574) {

					result = context.printFtSuffix();
				} else {

					result = kermeta.standard.helper.StringWrapper
							.plus(
									"_ft",
									kermeta.standard.helper.StringWrapper
											.toString(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
													.asTypeSwitcher(
															this
																	.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation")),
															org.kermeta.compil.runtime.ExecutionContext
																	.getInstance()
																	.getMetaClass(
																			"kermeta.language.structure.Operation")))
													.getCuid()));
				}

			} else {

				java.lang.Boolean idIfCond_575 = false;
				idIfCond_575 = this.isDeclaredInLambdaExpression();

				if (idIfCond_575) {

					result = context.printFtSuffix();
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
	public Parameter getFunctionTypeParameter() {

		kermeta.language.structure.Parameter result = null;

		kermeta.language.structure.Parameter ftParam = this
				.retrieveCorrespondingParameter();

		java.lang.Boolean idIfCond_576 = false;
		idIfCond_576 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(ftParam));

		if (idIfCond_576) {

			java.lang.Boolean idIfCond_577 = false;
			idIfCond_577 = ftParam.isFunctionType();

			if (idIfCond_577) {

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

		java.lang.Boolean idIfCond_578 = false;
		idIfCond_578 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_578) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft139 = null;

			kermeta.language.structure.Parameter elem_ft139 = null;

			result_ft139 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft139 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Parameter> convertAsOrderedSet(
								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
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
				java.lang.Boolean idLoopCond_579 = false;
				while (!idLoopCond_579) {
					idLoopCond_579 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft139.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft139,
													null));
					if (idLoopCond_579) {
					} else {

						elem_ft139 = it_ft139.next();

						java.lang.Boolean idIfCond_580 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp139 = elem_ft139;

						idIfCond_580 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp139.getName(), this.getName());
						//EIle:detector

						if (idIfCond_580) {

							result_ft139 = elem_ft139;
						}

					}
				}
			}

			//CE
			result = result_ft139;
			//EIft:detect

		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getVariableDeclInLoop(Loop l) {

		kermeta.language.behavior.Expression result = null;

		result = null;

		java.lang.Boolean idIfCond_581 = false;
		idIfCond_581 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(l));

		if (idIfCond_581) {

			java.lang.Boolean idIfCond_582 = false;
			idIfCond_582 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(l.getInitialization()));

			if (idIfCond_582) {

				java.lang.Boolean idIfCond_583 = false;
				idIfCond_583 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								l.getInitialization(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_583) {

					java.lang.Boolean idIfCond_584 = false;
					idIfCond_584 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													l.getInitialization(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.VariableDecl")))
											.getIdentifier(), this.getName());

					if (idIfCond_584) {

						result = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asTypeSwitcher(
										l.getInitialization(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));
					}

				}

			}

		}

		java.lang.Boolean idIfCond_585 = false;
		idIfCond_585 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(result),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(l
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.Loop")))));

		if (idIfCond_585) {

			result = this
					.getVariableDeclInLoop(((kermeta.language.behavior.Loop) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									l
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Loop")),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Loop"))));
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

		java.lang.Boolean idIfCond_586 = false;
		idIfCond_586 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_586) {

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft140 = null;

			kermeta.language.behavior.Expression elem_ft140 = null;

			result_ft140 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft140 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.containerSwitcher(this),
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature")))
										.getParameters()).iterator();
				java.lang.Boolean idLoopCond_587 = false;
				while (!idLoopCond_587) {
					idLoopCond_587 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft140.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft140,
													null));
					if (idLoopCond_587) {
					} else {

						elem_ft140 = it_ft140.next();

						java.lang.Boolean idIfCond_588 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp140 = elem_ft140;

						idIfCond_588 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp140, this);
						//EIle:detector

						if (idIfCond_588) {

							result_ft140 = elem_ft140;
						}

					}
				}
			}

			//CE
			exp = result_ft140;
			//EIft:detect

			java.lang.Boolean idIfCond_589 = false;
			idIfCond_589 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(exp));

			if (idIfCond_589) {

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
	public Boolean isParameterForOwningOperationSingle() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_590 = false;
		idIfCond_590 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.retrieveCorrespondingParameter()));

		if (idIfCond_590) {

			java.lang.Boolean idIfCond_591 = false;
			idIfCond_591 = kermeta.standard.helper.IntegerWrapper.equals(this
					.retrieveCorrespondingParameter().getUpper(), 1);

			if (idIfCond_591) {

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
	public Boolean isFunctionTypeVariable() {

		java.lang.Boolean result = null;

		result = false;

		kermeta.language.structure.Parameter ftParam = this
				.retrieveCorrespondingParameter();

		java.lang.Boolean idIfCond_592 = false;
		idIfCond_592 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(ftParam));

		if (idIfCond_592) {

			java.lang.Boolean idIfCond_593 = false;
			idIfCond_593 = ftParam.isFunctionType();

			if (idIfCond_593) {

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
		case BehaviorPackage.CALL_VARIABLE__LAMBDA_EXPRESSION:
			if (resolve)
				return getLambdaExpression();
			return basicGetLambdaExpression();
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
		case BehaviorPackage.CALL_VARIABLE__LAMBDA_EXPRESSION:
			setLambdaExpression((LambdaExpression) newValue);
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
		case BehaviorPackage.CALL_VARIABLE__LAMBDA_EXPRESSION:
			setLambdaExpression((LambdaExpression) null);
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
		case BehaviorPackage.CALL_VARIABLE__LAMBDA_EXPRESSION:
			return lambdaExpression != null;
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
