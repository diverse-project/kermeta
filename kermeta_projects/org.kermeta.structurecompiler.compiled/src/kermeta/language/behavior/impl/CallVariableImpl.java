/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariableImpl.java,v 1.3 2008-09-22 14:46:52 cfaucher Exp $
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

		java.lang.Boolean idIfCond_215 = false;
		idIfCond_215 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.StringWrapper.equals(context
						.getTasks_stack().peek(), context
						.getFUNCTION_TYPE_COMPILATION_TASK()), this
						.isFunctionTypeVariable());

		if (idIfCond_215) {

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

			java.lang.Boolean idIfCond_216 = false;
			idIfCond_216 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_216) {

				java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight().createBehaviorJava(context);

				java.lang.Boolean idIfCond_217 = false;
				idIfCond_217 = kermeta.standard.helper.BooleanWrapper
						.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(lambdaExp_returnType));

				if (idIfCond_217) {
				}

			}

			java.lang.Integer inc_param = 0;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								theLambdaExp.getParameters()).iterator();
				java.lang.Boolean idLoopCond_218 = false;
				while (!idLoopCond_218) {
					idLoopCond_218 = it_ft38.isOff();
					if (idLoopCond_218) {
					} else {

						//BIle:func
						kermeta.language.behavior.LambdaParameter p_lbdExp38 = it_ft38
								.next();

						context.setFtSuffixActivation(false);

						java.lang.String type_param_ = context
								.getFtProductTypeStack().peek().getTypeByIndex(
										inc_param).createBehaviorJava(context);

						java.lang.Boolean idIfCond_219 = false;
						idIfCond_219 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(type_param_);

						if (idIfCond_219) {

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
																		p_lbdExp38
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

			java.lang.Boolean idIfCond_220 = false;
			idIfCond_220 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "stdio");

			if (idIfCond_220) {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						"org.kermeta.compil.runtime.helper.io.StdIOUtil");
			} else {

				java.lang.Boolean idIfCond_221 = false;
				idIfCond_221 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameter()),
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameterForOwningOperation()));

				if (idIfCond_221) {

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

					java.lang.Boolean idIfCond_222 = false;
					idIfCond_222 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.BooleanWrapper.or(this
									.isParameterSingle(), this
									.isParameterForOwningOperationSingle()),
							this.isParameterManyAndForOwningOperation());

					if (idIfCond_222) {

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

						java.lang.Boolean idIfCond_223 = false;
						idIfCond_223 = this.isParameterForOwningOperation();

						if (idIfCond_223) {

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

						java.lang.Boolean idIfCond_224 = false;
						idIfCond_224 = this.isParameterMany();

						if (idIfCond_224) {

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

							java.lang.Boolean idIfCond_225 = false;
							idIfCond_225 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_225) {

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

							java.lang.Boolean idIfCond_226 = false;
							idIfCond_226 = kermeta.standard.helper.BooleanWrapper
									.and(
											c_param.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_226) {

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

							java.lang.Boolean idIfCond_227 = false;
							idIfCond_227 = kermeta.standard.helper.BooleanWrapper
									.and(c_param.getIsUnique(), c_param
											.getIsOrdered());

							if (idIfCond_227) {

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

							java.lang.Boolean idIfCond_228 = false;
							idIfCond_228 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(c_param.getIsUnique()),
											c_param.getIsOrdered());

							if (idIfCond_228) {

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

		java.lang.Boolean idIfCond_229 = false;
		idIfCond_229 = kermeta.standard.helper.BooleanWrapper.and(this
				.isParameterMany(), this.isParameterForOwningOperation());

		if (idIfCond_229) {

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

		java.lang.Boolean idIfCond_230 = false;
		idIfCond_230 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_230) {

			kermeta.language.behavior.Block tmp_block = null;

			tmp_block = (kermeta.language.behavior.Block) this
					.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
							.getInstance().getMetaClass(
									"kermeta.language.behavior.Block"));

			kermeta.language.behavior.Expression aStatement = null;

			java.lang.Boolean idIfCond_231 = false;
			idIfCond_231 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(tmp_block));

			if (idIfCond_231) {

				aStatement = this.getVariableDeclInBlock(tmp_block);
			}

			java.lang.Boolean idIfCond_232 = false;
			idIfCond_232 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(aStatement));

			if (idIfCond_232) {

				java.lang.Boolean idIfCond_233 = false;
				idIfCond_233 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								aStatement,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_233) {

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

			java.lang.Boolean idIfCond_234 = false;
			idIfCond_234 = kermeta.standard.helper.BooleanWrapper.not(result);

			if (idIfCond_234) {

				kermeta.language.behavior.Loop tmp_loop = null;

				tmp_loop = (kermeta.language.behavior.Loop) this
						.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Loop"));

				kermeta.language.behavior.Expression aStatement_ = null;

				java.lang.Boolean idIfCond_235 = false;
				idIfCond_235 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(tmp_loop));

				if (idIfCond_235) {

					aStatement_ = this.getVariableDeclInLoop(tmp_loop);
				}

				java.lang.Boolean idIfCond_236 = false;
				idIfCond_236 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(aStatement_));

				if (idIfCond_236) {

					java.lang.Boolean idIfCond_237 = false;
					idIfCond_237 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									aStatement_,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_237) {

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
	public LambdaParameter getCorrespondingLambdaExpressionParameter() {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_238 = false;
		idIfCond_238 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_238) {

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
	public Boolean isLambdaExpressionParameter() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_239 = false;
		idIfCond_239 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_239) {

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
	public Expression getVariableDeclInBlock(Block block) {

		kermeta.language.behavior.Expression result = null;

		//BIft:detect

		kermeta.language.behavior.Expression result_ft39 = null;

		kermeta.language.behavior.Expression elem_ft39 = null;

		result_ft39 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							block.getStatement()).iterator();
			java.lang.Boolean idLoopCond_240 = false;
			while (!idLoopCond_240) {
				idLoopCond_240 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft39.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft39, null));
				if (idLoopCond_240) {
				} else {

					elem_ft39 = it_ft39.next();

					java.lang.Boolean idIfCond_241 = false;
					//BIle:detector
					kermeta.language.behavior.Expression s_lbdExp39 = elem_ft39;

					java.lang.Boolean idIfCond_242 = false;
					idIfCond_242 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									s_lbdExp39,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_242) {

						idIfCond_241 = kermeta.standard.helper.StringWrapper
								.equals(
										((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														s_lbdExp39,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.VariableDecl")))
												.getIdentifier(), this
												.getName());
					} else {

						idIfCond_241 = false;
					}

					//EIle:detector

					if (idIfCond_241) {

						result_ft39 = elem_ft39;
					}

				}
			}
		}

		//CE
		result = result_ft39;
		//EIft:detect

		java.lang.Boolean idIfCond_243 = false;
		idIfCond_243 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_243) {

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

		java.lang.Boolean idIfCond_244 = false;
		idIfCond_244 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(lambdaExpression));

		if (idIfCond_244) {

			//BIft:detect

			kermeta.language.behavior.LambdaParameter result_ft40 = null;

			kermeta.language.behavior.LambdaParameter elem_ft40 = null;

			result_ft40 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								lambdaExpression.getParameters()).iterator();
				java.lang.Boolean idLoopCond_245 = false;
				while (!idLoopCond_245) {
					idLoopCond_245 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft40.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft40, null));
					if (idLoopCond_245) {
					} else {

						elem_ft40 = it_ft40.next();

						java.lang.Boolean idIfCond_246 = false;
						//BIle:detector
						kermeta.language.behavior.LambdaParameter p_lbdExp40 = elem_ft40;

						idIfCond_246 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp40.getName(), this.getName());
						//EIle:detector

						if (idIfCond_246) {

							result_ft40 = elem_ft40;
						}

					}
				}
			}

			//CE
			result = result_ft40;
			//EIft:detect

			java.lang.Boolean idIfCond_247 = false;
			idIfCond_247 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_247) {

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
	public Boolean isDeclaredInAFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_248 = false;
		idIfCond_248 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_248) {

			java.lang.Boolean idIfCond_249 = false;
			idIfCond_249 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_249) {

				kermeta.language.behavior.Block tmp_block = null;

				tmp_block = (kermeta.language.behavior.Block) this
						.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.behavior.Block"));

				kermeta.language.behavior.Expression aStatement = null;

				java.lang.Boolean idIfCond_250 = false;
				idIfCond_250 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(tmp_block));

				if (idIfCond_250) {

					aStatement = this.getVariableDeclInBlock(tmp_block);
				}

				java.lang.Boolean idIfCond_251 = false;
				idIfCond_251 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(aStatement));

				if (idIfCond_251) {

					java.lang.Boolean idIfCond_252 = false;
					idIfCond_252 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_252) {

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

				java.lang.Boolean idIfCond_253 = false;
				idIfCond_253 = kermeta.standard.helper.BooleanWrapper
						.not(result);

				if (idIfCond_253) {

					kermeta.language.behavior.Loop tmp_loop = null;

					tmp_loop = (kermeta.language.behavior.Loop) this
							.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
									.getInstance().getMetaClass(
											"kermeta.language.behavior.Loop"));

					kermeta.language.behavior.Expression aStatement_ = null;

					java.lang.Boolean idIfCond_254 = false;
					idIfCond_254 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(tmp_loop));

					if (idIfCond_254) {

						aStatement_ = this.getVariableDeclInLoop(tmp_loop);
					}

					java.lang.Boolean idIfCond_255 = false;
					idIfCond_255 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(aStatement_));

					if (idIfCond_255) {

						java.lang.Boolean idIfCond_256 = false;
						idIfCond_256 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl"));

						if (idIfCond_256) {

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
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_257 = false;
		idIfCond_257 = this.isParameter();

		if (idIfCond_257) {

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

			kermeta.language.behavior.Expression result_ft41 = null;

			kermeta.language.behavior.Expression elem_ft41 = null;

			result_ft41 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_258 = false;
				while (!idLoopCond_258) {
					idLoopCond_258 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft41.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft41, null));
					if (idLoopCond_258) {
					} else {

						elem_ft41 = it_ft41.next();

						java.lang.Boolean idIfCond_259 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp41 = elem_ft41;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_259 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp41, this);
						//EIle:detector

						if (idIfCond_259) {

							result_ft41 = elem_ft41;
						}

					}
				}
			}

			//CE
			exp = result_ft41;
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
	public Boolean isParameterForOwningOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_260 = false;
		idIfCond_260 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_260) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft42 = null;

			kermeta.language.structure.Parameter elem_ft42 = null;

			result_ft42 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_261 = false;
				while (!idLoopCond_261) {
					idLoopCond_261 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft42.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft42, null));
					if (idLoopCond_261) {
					} else {

						elem_ft42 = it_ft42.next();

						java.lang.Boolean idIfCond_262 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp42 = elem_ft42;

						idIfCond_262 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp42.getName(), this.getName());
						//EIle:detector

						if (idIfCond_262) {

							result_ft42 = elem_ft42;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(result_ft42));
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

		java.lang.Boolean idIfCond_263 = false;
		idIfCond_263 = this.isParameter();

		if (idIfCond_263) {

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

			kermeta.language.behavior.Expression result_ft43 = null;

			kermeta.language.behavior.Expression elem_ft43 = null;

			result_ft43 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_264 = false;
				while (!idLoopCond_264) {
					idLoopCond_264 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft43.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft43, null));
					if (idLoopCond_264) {
					} else {

						elem_ft43 = it_ft43.next();

						java.lang.Boolean idIfCond_265 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp43 = elem_ft43;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_265 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp43, this);
						//EIle:detector

						if (idIfCond_265) {

							result_ft43 = elem_ft43;
						}

					}
				}
			}

			//CE
			exp = result_ft43;
			//EIft:detect

			java.lang.Boolean idIfCond_266 = false;
			idIfCond_266 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_266) {

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

		java.lang.Boolean idIfCond_267 = false;
		idIfCond_267 = this.isParameter();

		if (idIfCond_267) {

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

			kermeta.language.behavior.Expression result_ft44 = null;

			kermeta.language.behavior.Expression elem_ft44 = null;

			result_ft44 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_268 = false;
				while (!idLoopCond_268) {
					idLoopCond_268 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft44.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft44, null));
					if (idLoopCond_268) {
					} else {

						elem_ft44 = it_ft44.next();

						java.lang.Boolean idIfCond_269 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp44 = elem_ft44;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_269 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp44, this);
						//EIle:detector

						if (idIfCond_269) {

							result_ft44 = elem_ft44;
						}

					}
				}
			}

			//CE
			exp = result_ft44;
			//EIft:detect

			java.lang.Boolean idIfCond_270 = false;
			idIfCond_270 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_270) {

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

		java.lang.Boolean idIfCond_271 = false;
		idIfCond_271 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_271) {

			java.lang.Boolean idIfCond_272 = false;
			idIfCond_272 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(this.retrieveCorrespondingParameter()
							.getUpper(), 1);

			if (idIfCond_272) {

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

		java.lang.Boolean idIfCond_273 = false;
		idIfCond_273 = this.isLambdaExpressionParameter();

		if (idIfCond_273) {

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

			java.lang.Boolean idIfCond_274 = false;
			idIfCond_274 = this.isDeclaredInAFunctionType();

			if (idIfCond_274) {

				java.lang.Boolean idIfCond_275 = false;
				idIfCond_275 = kermeta.standard.helper.BooleanWrapper.and(
						context.getAfterLbdExpActivation(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(context.printFtSuffix(), ""));

				if (idIfCond_275) {

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

				java.lang.Boolean idIfCond_276 = false;
				idIfCond_276 = this.isDeclaredInLambdaExpression();

				if (idIfCond_276) {

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

		java.lang.Boolean idIfCond_277 = false;
		idIfCond_277 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_277) {

			java.lang.Boolean idIfCond_278 = false;
			idIfCond_278 = ftParam.isFunctionType();

			if (idIfCond_278) {

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

		java.lang.Boolean idIfCond_279 = false;
		idIfCond_279 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_279) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft45 = null;

			kermeta.language.structure.Parameter elem_ft45 = null;

			result_ft45 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_280 = false;
				while (!idLoopCond_280) {
					idLoopCond_280 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft45.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft45, null));
					if (idLoopCond_280) {
					} else {

						elem_ft45 = it_ft45.next();

						java.lang.Boolean idIfCond_281 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp45 = elem_ft45;

						idIfCond_281 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp45.getName(), this.getName());
						//EIle:detector

						if (idIfCond_281) {

							result_ft45 = elem_ft45;
						}

					}
				}
			}

			//CE
			result = result_ft45;
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

		java.lang.Boolean idIfCond_282 = false;
		idIfCond_282 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(l));

		if (idIfCond_282) {

			java.lang.Boolean idIfCond_283 = false;
			idIfCond_283 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(l.getInitialization()));

			if (idIfCond_283) {

				java.lang.Boolean idIfCond_284 = false;
				idIfCond_284 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								l.getInitialization(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_284) {

					java.lang.Boolean idIfCond_285 = false;
					idIfCond_285 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													l.getInitialization(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.VariableDecl")))
											.getIdentifier(), this.getName());

					if (idIfCond_285) {

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

		java.lang.Boolean idIfCond_286 = false;
		idIfCond_286 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_286) {

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

		java.lang.Boolean idIfCond_287 = false;
		idIfCond_287 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_287) {

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft46 = null;

			kermeta.language.behavior.Expression elem_ft46 = null;

			result_ft46 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_288 = false;
				while (!idLoopCond_288) {
					idLoopCond_288 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft46.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft46, null));
					if (idLoopCond_288) {
					} else {

						elem_ft46 = it_ft46.next();

						java.lang.Boolean idIfCond_289 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp46 = elem_ft46;

						idIfCond_289 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp46, this);
						//EIle:detector

						if (idIfCond_289) {

							result_ft46 = elem_ft46;
						}

					}
				}
			}

			//CE
			exp = result_ft46;
			//EIft:detect

			java.lang.Boolean idIfCond_290 = false;
			idIfCond_290 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(exp));

			if (idIfCond_290) {

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

		java.lang.Boolean idIfCond_291 = false;
		idIfCond_291 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_291) {

			java.lang.Boolean idIfCond_292 = false;
			idIfCond_292 = kermeta.standard.helper.IntegerWrapper.equals(this
					.retrieveCorrespondingParameter().getUpper(), 1);

			if (idIfCond_292) {

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

		java.lang.Boolean idIfCond_293 = false;
		idIfCond_293 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_293) {

			java.lang.Boolean idIfCond_294 = false;
			idIfCond_294 = ftParam.isFunctionType();

			if (idIfCond_294) {

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
