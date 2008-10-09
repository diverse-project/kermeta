/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariableImpl.java,v 1.5 2008-10-09 08:50:26 cfaucher Exp $
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

		java.lang.Boolean idIfCond_490 = false;
		idIfCond_490 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.StringWrapper.equals(context
						.getTasks_stack().peek(), context
						.getFUNCTION_TYPE_COMPILATION_TASK()), this
						.isFunctionTypeVariable());

		if (idIfCond_490) {

			context.setFtSuffixActivation(false);

			kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
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
					.getLambdaExpression();

			this.setLambdaExpression(theLambdaExp);

			java.lang.String str_toInclude = "";

			java.lang.Boolean idIfCond_491 = false;
			idIfCond_491 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_491) {

				java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight().createBehaviorJava(context);

				java.lang.Boolean idIfCond_492 = false;
				idIfCond_492 = kermeta.standard.helper.BooleanWrapper
						.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(lambdaExp_returnType));

				if (idIfCond_492) {
				}

			}

			java.lang.Integer inc_param = 0;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft147 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								theLambdaExp.getParameters()).iterator();
				java.lang.Boolean idLoopCond_493 = false;
				while (!idLoopCond_493) {
					idLoopCond_493 = it_ft147.isOff();
					if (idLoopCond_493) {
					} else {

						//BIle:func
						kermeta.language.behavior.LambdaParameter p_lbdExp147 = it_ft147
								.next();

						context.setFtSuffixActivation(false);

						java.lang.String type_param_ = context
								.getFtProductTypeStack().peek().getTypeByIndex(
										inc_param).createBehaviorJava(context);

						java.lang.Boolean idIfCond_494 = false;
						idIfCond_494 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(type_param_);

						if (idIfCond_494) {

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
																		p_lbdExp147
																				.getName()),
														"_lbdExp"),
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

			java.lang.Boolean idIfCond_495 = false;
			idIfCond_495 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "stdio");

			if (idIfCond_495) {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						"org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()");
			} else {

				java.lang.Boolean idIfCond_496 = false;
				idIfCond_496 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameter()),
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameterForOwningOperation()));

				if (idIfCond_496) {

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

					java.lang.Boolean idIfCond_497 = false;
					idIfCond_497 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.BooleanWrapper.or(this
									.isParameterSingle(), this
									.isParameterForOwningOperationSingle()),
							this.isParameterManyAndForOwningOperation());

					if (idIfCond_497) {

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

						java.lang.Boolean idIfCond_498 = false;
						idIfCond_498 = this.isParameterForOwningOperation();

						if (idIfCond_498) {

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
												.getTypeParamBinding()).first()
								.getType().createBehaviorJava(context);

						java.lang.Boolean idIfCond_499 = false;
						idIfCond_499 = this.isParameterMany();

						if (idIfCond_499) {

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

							java.lang.Boolean idIfCond_500 = false;
							idIfCond_500 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_500) {

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

							java.lang.Boolean idIfCond_501 = false;
							idIfCond_501 = kermeta.standard.helper.BooleanWrapper
									.and(
											c_param.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_501) {

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

							java.lang.Boolean idIfCond_502 = false;
							idIfCond_502 = kermeta.standard.helper.BooleanWrapper
									.and(c_param.getIsUnique(), c_param
											.getIsOrdered());

							if (idIfCond_502) {

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

							java.lang.Boolean idIfCond_503 = false;
							idIfCond_503 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(c_param.getIsUnique()),
											c_param.getIsOrdered());

							if (idIfCond_503) {

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

		java.lang.Boolean idIfCond_504 = false;
		idIfCond_504 = kermeta.standard.helper.BooleanWrapper.and(this
				.isParameterMany(), this.isParameterForOwningOperation());

		if (idIfCond_504) {

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

		java.lang.Boolean idIfCond_505 = false;
		idIfCond_505 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_505) {

			kermeta.language.behavior.Block tmp_block = null;

			tmp_block = (kermeta.language.behavior.Block) this
					.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.behavior.Block"));

			kermeta.language.behavior.Expression aStatement = null;

			java.lang.Boolean idIfCond_506 = false;
			idIfCond_506 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(tmp_block));

			if (idIfCond_506) {

				aStatement = this.getVariableDeclInBlock(tmp_block);
			}

			java.lang.Boolean idIfCond_507 = false;
			idIfCond_507 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(aStatement));

			if (idIfCond_507) {

				java.lang.Boolean idIfCond_508 = false;
				idIfCond_508 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								aStatement,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_508) {

					kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl")));

					result = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(theVariableDecl
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.LambdaExpression"))));
				}

			}

			java.lang.Boolean idIfCond_509 = false;
			idIfCond_509 = kermeta.standard.helper.BooleanWrapper.not(result);

			if (idIfCond_509) {

				kermeta.language.behavior.Loop tmp_loop = null;

				tmp_loop = (kermeta.language.behavior.Loop) this
						.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Loop"));

				kermeta.language.behavior.Expression aStatement_ = null;

				java.lang.Boolean idIfCond_510 = false;
				idIfCond_510 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(tmp_loop));

				if (idIfCond_510) {

					aStatement_ = this.getVariableDeclInLoop(tmp_loop);
				}

				java.lang.Boolean idIfCond_511 = false;
				idIfCond_511 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(aStatement_));

				if (idIfCond_511) {

					java.lang.Boolean idIfCond_512 = false;
					idIfCond_512 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									aStatement_,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_512) {

						kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));

						result = kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(theVariableDecl
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
	public Boolean isLambdaExpressionParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_513 = false;
		idIfCond_513 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_513) {

			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(this
									.getLambdaParameter(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
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
	public LambdaParameter getCorrespondingLambdaExpressionParameter() {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_514 = false;
		idIfCond_514 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_514) {

			result = this
					.getLambdaParameter(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
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

		kermeta.language.behavior.Expression result_ft148 = null;

		kermeta.language.behavior.Expression elem_ft148 = null;

		result_ft148 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft148 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							block.getStatement()).iterator();
			java.lang.Boolean idLoopCond_515 = false;
			while (!idLoopCond_515) {
				idLoopCond_515 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft148.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft148, null));
				if (idLoopCond_515) {
				} else {

					elem_ft148 = it_ft148.next();

					java.lang.Boolean idIfCond_516 = false;
					//BIle:detector
					kermeta.language.behavior.Expression s_lbdExp148 = elem_ft148;

					java.lang.Boolean idIfCond_517 = false;
					idIfCond_517 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									s_lbdExp148,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_517) {

						idIfCond_516 = kermeta.standard.helper.StringWrapper
								.equals(
										((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														s_lbdExp148,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.VariableDecl")))
												.getIdentifier(), this
												.getName());
					} else {

						idIfCond_516 = false;
					}

					//EIle:detector

					if (idIfCond_516) {

						result_ft148 = elem_ft148;
					}

				}
			}
		}

		//CE
		result = result_ft148;
		//EIft:detect

		java.lang.Boolean idIfCond_518 = false;
		idIfCond_518 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(result),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(block
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.Block")))));

		if (idIfCond_518) {

			result = this
					.getVariableDeclInBlock(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
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
	public LambdaParameter getLambdaParameter(LambdaExpression lambdaExpression) {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_519 = false;
		idIfCond_519 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(lambdaExpression));

		if (idIfCond_519) {

			//BIft:detect

			kermeta.language.behavior.LambdaParameter result_ft149 = null;

			kermeta.language.behavior.LambdaParameter elem_ft149 = null;

			result_ft149 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft149 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								lambdaExpression.getParameters()).iterator();
				java.lang.Boolean idLoopCond_520 = false;
				while (!idLoopCond_520) {
					idLoopCond_520 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft149.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft149, null));
					if (idLoopCond_520) {
					} else {

						elem_ft149 = it_ft149.next();

						java.lang.Boolean idIfCond_521 = false;
						//BIle:detector
						kermeta.language.behavior.LambdaParameter p_lbdExp149 = elem_ft149;

						idIfCond_521 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp149.getName(), this.getName());
						//EIle:detector

						if (idIfCond_521) {

							result_ft149 = elem_ft149;
						}

					}
				}
			}

			//CE
			result = result_ft149;
			//EIft:detect

			java.lang.Boolean idIfCond_522 = false;
			idIfCond_522 = kermeta.standard.helper.BooleanWrapper
					.and(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(result),
							kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isVoid(lambdaExpression
													.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.LambdaExpression")))));

			if (idIfCond_522) {

				result = this
						.getLambdaParameter(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
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
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_523 = false;
		idIfCond_523 = this.isParameter();

		if (idIfCond_523) {

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
			//BIft:detect

			kermeta.language.behavior.Expression result_ft150 = null;

			kermeta.language.behavior.Expression elem_ft150 = null;

			result_ft150 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft150 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_524 = false;
				while (!idLoopCond_524) {
					idLoopCond_524 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft150.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft150, null));
					if (idLoopCond_524) {
					} else {

						elem_ft150 = it_ft150.next();

						java.lang.Boolean idIfCond_525 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp150 = elem_ft150;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_525 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp150, this);
						//EIle:detector

						if (idIfCond_525) {

							result_ft150 = elem_ft150;
						}

					}
				}
			}

			//CE
			exp = result_ft150;
			//EIft:detect

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
	public Boolean isDeclaredInAFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_526 = false;
		idIfCond_526 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_526) {

			java.lang.Boolean idIfCond_527 = false;
			idIfCond_527 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
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
					.isFunctionType();

			if (idIfCond_527) {

				kermeta.language.behavior.Block tmp_block = null;

				tmp_block = (kermeta.language.behavior.Block) this
						.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Block"));

				kermeta.language.behavior.Expression aStatement = null;

				java.lang.Boolean idIfCond_528 = false;
				idIfCond_528 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(tmp_block));

				if (idIfCond_528) {

					aStatement = this.getVariableDeclInBlock(tmp_block);
				}

				java.lang.Boolean idIfCond_529 = false;
				idIfCond_529 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(aStatement));

				if (idIfCond_529) {

					java.lang.Boolean idIfCond_530 = false;
					idIfCond_530 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_530) {

						kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										aStatement,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));

						result = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
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

				java.lang.Boolean idIfCond_531 = false;
				idIfCond_531 = kermeta.standard.helper.BooleanWrapper
						.not(result);

				if (idIfCond_531) {

					kermeta.language.behavior.Loop tmp_loop = null;

					tmp_loop = (kermeta.language.behavior.Loop) this
							.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.behavior.Loop"));

					kermeta.language.behavior.Expression aStatement_ = null;

					java.lang.Boolean idIfCond_532 = false;
					idIfCond_532 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(tmp_loop));

					if (idIfCond_532) {

						aStatement_ = this.getVariableDeclInLoop(tmp_loop);
					}

					java.lang.Boolean idIfCond_533 = false;
					idIfCond_533 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(aStatement_));

					if (idIfCond_533) {

						java.lang.Boolean idIfCond_534 = false;
						idIfCond_534 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl"));

						if (idIfCond_534) {

							kermeta.language.behavior.VariableDecl theVariableDecl = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											aStatement_,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.VariableDecl")));

							result = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
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
	public Boolean isParameterForOwningOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_535 = false;
		idIfCond_535 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_535) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft151 = null;

			kermeta.language.structure.Parameter elem_ft151 = null;

			result_ft151 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft151 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_536 = false;
				while (!idLoopCond_536) {
					idLoopCond_536 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft151.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft151, null));
					if (idLoopCond_536) {
					} else {

						elem_ft151 = it_ft151.next();

						java.lang.Boolean idIfCond_537 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp151 = elem_ft151;

						idIfCond_537 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp151.getName(), this.getName());
						//EIle:detector

						if (idIfCond_537) {

							result_ft151 = elem_ft151;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(result_ft151));
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

		java.lang.Boolean idIfCond_538 = false;
		idIfCond_538 = this.isParameter();

		if (idIfCond_538) {

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
			//BIft:detect

			kermeta.language.behavior.Expression result_ft152 = null;

			kermeta.language.behavior.Expression elem_ft152 = null;

			result_ft152 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft152 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_539 = false;
				while (!idLoopCond_539) {
					idLoopCond_539 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft152.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft152, null));
					if (idLoopCond_539) {
					} else {

						elem_ft152 = it_ft152.next();

						java.lang.Boolean idIfCond_540 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp152 = elem_ft152;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_540 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp152, this);
						//EIle:detector

						if (idIfCond_540) {

							result_ft152 = elem_ft152;
						}

					}
				}
			}

			//CE
			exp = result_ft152;
			//EIft:detect

			java.lang.Boolean idIfCond_541 = false;
			idIfCond_541 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_541) {

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

		java.lang.Boolean idIfCond_542 = false;
		idIfCond_542 = this.isParameter();

		if (idIfCond_542) {

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
			//BIft:detect

			kermeta.language.behavior.Expression result_ft153 = null;

			kermeta.language.behavior.Expression elem_ft153 = null;

			result_ft153 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft153 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_543 = false;
				while (!idLoopCond_543) {
					idLoopCond_543 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft153.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft153, null));
					if (idLoopCond_543) {
					} else {

						elem_ft153 = it_ft153.next();

						java.lang.Boolean idIfCond_544 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp153 = elem_ft153;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_544 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp153, this);
						//EIle:detector

						if (idIfCond_544) {

							result_ft153 = elem_ft153;
						}

					}
				}
			}

			//CE
			exp = result_ft153;
			//EIft:detect

			java.lang.Boolean idIfCond_545 = false;
			idIfCond_545 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_545) {

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

		java.lang.Boolean idIfCond_546 = false;
		idIfCond_546 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_546) {

			java.lang.Boolean idIfCond_547 = false;
			idIfCond_547 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(this.retrieveCorrespondingParameter()
							.getUpper(), 1);

			if (idIfCond_547) {

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
	public Parameter getFunctionTypeParameter() {

		kermeta.language.structure.Parameter result = null;

		kermeta.language.structure.Parameter ftParam = this
				.retrieveCorrespondingParameter();

		java.lang.Boolean idIfCond_548 = false;
		idIfCond_548 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_548) {

			java.lang.Boolean idIfCond_549 = false;
			idIfCond_549 = ftParam.isFunctionType();

			if (idIfCond_549) {

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
	public String printSuffix(KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_550 = false;
		idIfCond_550 = this.isLambdaExpressionParameter();

		if (idIfCond_550) {

			result = kermeta.standard.helper.StringWrapper
					.plus(
							"_lbdExp",
							((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.container(this
															.getCorrespondingLambdaExpressionParameter()),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.LambdaExpression")))
									.getCuid());
		} else {

			java.lang.Boolean idIfCond_551 = false;
			idIfCond_551 = this.isDeclaredInAFunctionType();

			if (idIfCond_551) {

				java.lang.Boolean idIfCond_552 = false;
				idIfCond_552 = kermeta.standard.helper.BooleanWrapper.and(
						context.getAfterLbdExpActivation(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(context.printFtSuffix(), ""));

				if (idIfCond_552) {

					result = context.printFtSuffix();
				} else {

					result = kermeta.standard.helper.StringWrapper
							.plus(
									"_ft",
									kermeta.standard.helper.StringWrapper
											.toString(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
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
													.getCuid()));
				}

			} else {

				java.lang.Boolean idIfCond_553 = false;
				idIfCond_553 = this.isDeclaredInLambdaExpression();

				if (idIfCond_553) {

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
	public Parameter retrieveCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_554 = false;
		idIfCond_554 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_554) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft154 = null;

			kermeta.language.structure.Parameter elem_ft154 = null;

			result_ft154 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft154 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_555 = false;
				while (!idLoopCond_555) {
					idLoopCond_555 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft154.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft154, null));
					if (idLoopCond_555) {
					} else {

						elem_ft154 = it_ft154.next();

						java.lang.Boolean idIfCond_556 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp154 = elem_ft154;

						idIfCond_556 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp154.getName(), this.getName());
						//EIle:detector

						if (idIfCond_556) {

							result_ft154 = elem_ft154;
						}

					}
				}
			}

			//CE
			result = result_ft154;
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

		java.lang.Boolean idIfCond_557 = false;
		idIfCond_557 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(l));

		if (idIfCond_557) {

			java.lang.Boolean idIfCond_558 = false;
			idIfCond_558 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(l.getInitialization()));

			if (idIfCond_558) {

				java.lang.Boolean idIfCond_559 = false;
				idIfCond_559 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								l.getInitialization(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_559) {

					java.lang.Boolean idIfCond_560 = false;
					idIfCond_560 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													l.getInitialization(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.VariableDecl")))
											.getIdentifier(), this.getName());

					if (idIfCond_560) {

						result = ((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										l.getInitialization(),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl")));
					}

				}

			}

		}

		java.lang.Boolean idIfCond_561 = false;
		idIfCond_561 = kermeta.standard.helper.BooleanWrapper
				.and(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(result),
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(l
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.Loop")))));

		if (idIfCond_561) {

			result = this
					.getVariableDeclInLoop(((kermeta.language.behavior.Loop) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
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

		java.lang.Boolean idIfCond_562 = false;
		idIfCond_562 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_562) {

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft155 = null;

			kermeta.language.behavior.Expression elem_ft155 = null;

			result_ft155 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft155 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_563 = false;
				while (!idLoopCond_563) {
					idLoopCond_563 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft155.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft155, null));
					if (idLoopCond_563) {
					} else {

						elem_ft155 = it_ft155.next();

						java.lang.Boolean idIfCond_564 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp155 = elem_ft155;

						idIfCond_564 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp155, this);
						//EIle:detector

						if (idIfCond_564) {

							result_ft155 = elem_ft155;
						}

					}
				}
			}

			//CE
			exp = result_ft155;
			//EIft:detect

			java.lang.Boolean idIfCond_565 = false;
			idIfCond_565 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(exp));

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
	public Boolean isParameterForOwningOperationSingle() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_566 = false;
		idIfCond_566 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_566) {

			java.lang.Boolean idIfCond_567 = false;
			idIfCond_567 = kermeta.standard.helper.IntegerWrapper.equals(this
					.retrieveCorrespondingParameter().getUpper(), 1);

			if (idIfCond_567) {

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

		java.lang.Boolean idIfCond_568 = false;
		idIfCond_568 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_568) {

			java.lang.Boolean idIfCond_569 = false;
			idIfCond_569 = ftParam.isFunctionType();

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
