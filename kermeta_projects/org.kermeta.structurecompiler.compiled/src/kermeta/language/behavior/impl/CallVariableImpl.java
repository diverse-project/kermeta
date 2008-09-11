/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariableImpl.java,v 1.2 2008-09-11 12:34:40 cfaucher Exp $
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

		java.lang.Boolean idIfCond_390 = false;
		idIfCond_390 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.StringWrapper.equals(context
						.getTasks_stack().peek(), "FunctionType_Compilation"),
				this.isFunctionTypeVariable());

		if (idIfCond_390) {

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

			java.lang.Boolean idIfCond_391 = false;
			idIfCond_391 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOf(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_391) {

				java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asType(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight().createBehaviorJava(context);

				java.lang.Boolean idIfCond_392 = false;
				idIfCond_392 = kermeta.standard.helper.BooleanWrapper
						.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.language.structure.Operation"))
								.isVoidType(lambdaExp_returnType));

				if (idIfCond_392) {
				}

			}

			java.lang.Integer inc_param = 0;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								theLambdaExp.getParameters()).iterator();
				java.lang.Boolean idLoopCond_393 = false;
				while (!idLoopCond_393) {
					idLoopCond_393 = it_ft96.isOff();
					if (idLoopCond_393) {
					} else {

						//BIle:func
						kermeta.language.behavior.LambdaParameter p_lbdExp96 = it_ft96
								.next();

						context.setFtSuffixActivation(false);

						java.lang.String type_param_ = context
								.getFtProductTypeStack().peek().getTypeByIndex(
										inc_param).createBehaviorJava(context);

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
																		p_lbdExp96
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
		} else {

			java.lang.Boolean idIfCond_394 = false;
			idIfCond_394 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "stdio");

			if (idIfCond_394) {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						"org.kermeta.compil.runtime.helper.io.StdIOUtil");
			} else {

				java.lang.Boolean idIfCond_395 = false;
				idIfCond_395 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameter()),
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameterForOwningOperation()));

				if (idIfCond_395) {

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

					java.lang.Boolean idIfCond_396 = false;
					idIfCond_396 = kermeta.standard.helper.BooleanWrapper.or(
							kermeta.standard.helper.BooleanWrapper.or(this
									.isParameterSingle(), this
									.isParameterForOwningOperationSingle()),
							this.isParameterManyAndForOwningOperation());

					if (idIfCond_396) {

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

						java.lang.Boolean idIfCond_397 = false;
						idIfCond_397 = this.isParameterForOwningOperation();

						if (idIfCond_397) {

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

						java.lang.Boolean idIfCond_398 = false;
						idIfCond_398 = this.isParameterMany();

						if (idIfCond_398) {

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

							java.lang.Boolean idIfCond_399 = false;
							idIfCond_399 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_399) {

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

							java.lang.Boolean idIfCond_400 = false;
							idIfCond_400 = kermeta.standard.helper.BooleanWrapper
									.and(
											c_param.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_400) {

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

							java.lang.Boolean idIfCond_401 = false;
							idIfCond_401 = kermeta.standard.helper.BooleanWrapper
									.and(c_param.getIsUnique(), c_param
											.getIsOrdered());

							if (idIfCond_401) {

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

							java.lang.Boolean idIfCond_402 = false;
							idIfCond_402 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(c_param.getIsUnique()),
											c_param.getIsOrdered());

							if (idIfCond_402) {

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

		java.lang.Boolean idIfCond_403 = false;
		idIfCond_403 = kermeta.standard.helper.BooleanWrapper.and(this
				.isParameterMany(), this.isParameterForOwningOperation());

		if (idIfCond_403) {

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

		java.lang.Boolean idIfCond_404 = false;
		idIfCond_404 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_404) {

			kermeta.language.behavior.Expression aStatement = this
					.getVariableDeclInBlock(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									this
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Block")),
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Block"))));

			java.lang.Boolean idIfCond_405 = false;
			idIfCond_405 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(aStatement));

			if (idIfCond_405) {

				java.lang.Boolean idIfCond_406 = false;
				idIfCond_406 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								aStatement,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_406) {

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

			java.lang.Boolean idIfCond_407 = false;
			idIfCond_407 = kermeta.standard.helper.BooleanWrapper.not(result);

			if (idIfCond_407) {

				kermeta.language.behavior.Expression aStatement_ = this
						.getVariableDeclInLoop(((kermeta.language.behavior.Loop) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.Loop")),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Loop"))));

				java.lang.Boolean idIfCond_408 = false;
				idIfCond_408 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(aStatement_));

				if (idIfCond_408) {

					java.lang.Boolean idIfCond_409 = false;
					idIfCond_409 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									aStatement_,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_409) {

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
	public Expression getVariableDeclInBlock(Block block) {

		kermeta.language.behavior.Expression result = null;

		result = null;
		//BIft:detect

		kermeta.language.behavior.Expression result_ft97 = null;

		kermeta.language.behavior.Expression elem_ft97 = null;

		result_ft97 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							block.getStatement()).iterator();
			java.lang.Boolean idLoopCond_410 = false;
			while (!idLoopCond_410) {
				idLoopCond_410 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft97.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqual(result_ft97, null));
				if (idLoopCond_410) {
				} else {

					elem_ft97 = it_ft97.next();

					java.lang.Boolean idIfCond_411 = false;
					//BIle:detector
					kermeta.language.behavior.Expression s_lbdExp97 = elem_ft97;

					java.lang.Boolean idIfCond_412 = false;
					idIfCond_412 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									s_lbdExp97,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_412) {

						idIfCond_411 = kermeta.standard.helper.StringWrapper
								.equals(
										((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asType(
														s_lbdExp97,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.VariableDecl")))
												.getIdentifier(), this
												.getName());
					} else {

						idIfCond_411 = false;
					}

					//EIle:detector

					if (idIfCond_411) {

						result_ft97 = elem_ft97;
					}

				}
			}
		}

		//EIft:detect

		java.lang.Boolean idIfCond_413 = false;
		idIfCond_413 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_413) {

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
	public LambdaParameter getCorrespondingLambdaExpressionParameter() {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_414 = false;
		idIfCond_414 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_414) {

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

		java.lang.Boolean idIfCond_415 = false;
		idIfCond_415 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_415) {

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
	public LambdaParameter getLambdaParameter(LambdaExpression lambdaExpression) {

		kermeta.language.behavior.LambdaParameter result = null;

		result = null;

		java.lang.Boolean idIfCond_416 = false;
		idIfCond_416 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(lambdaExpression));

		if (idIfCond_416) {

			result = null;
			//BIft:detect

			kermeta.language.behavior.LambdaParameter result_ft98 = null;

			kermeta.language.behavior.LambdaParameter elem_ft98 = null;

			result_ft98 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft98 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								lambdaExpression.getParameters()).iterator();
				java.lang.Boolean idLoopCond_417 = false;
				while (!idLoopCond_417) {
					idLoopCond_417 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft98.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft98, null));
					if (idLoopCond_417) {
					} else {

						elem_ft98 = it_ft98.next();

						java.lang.Boolean idIfCond_418 = false;
						//BIle:detector
						kermeta.language.behavior.LambdaParameter p_lbdExp98 = elem_ft98;

						idIfCond_418 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp98.getName(), this.getName());
						//EIle:detector

						if (idIfCond_418) {

							result_ft98 = elem_ft98;
						}

					}
				}
			}

			//EIft:detect

			java.lang.Boolean idIfCond_419 = false;
			idIfCond_419 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_419) {

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

		java.lang.Boolean idIfCond_420 = false;
		idIfCond_420 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_420) {

			java.lang.Boolean idIfCond_421 = false;
			idIfCond_421 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_421) {

				kermeta.language.behavior.Expression aStatement = this
						.getVariableDeclInBlock(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										this
												.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.Block")),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Block"))));

				java.lang.Boolean idIfCond_422 = false;
				idIfCond_422 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoid(aStatement));

				if (idIfCond_422) {

					java.lang.Boolean idIfCond_423 = false;
					idIfCond_423 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOf(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_423) {

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

				java.lang.Boolean idIfCond_424 = false;
				idIfCond_424 = kermeta.standard.helper.BooleanWrapper
						.not(result);

				if (idIfCond_424) {

					kermeta.language.behavior.Expression aStatement_ = this
							.getVariableDeclInLoop(((kermeta.language.behavior.Loop) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asType(
											this
													.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.Loop")),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Loop"))));

					java.lang.Boolean idIfCond_425 = false;
					idIfCond_425 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoid(aStatement_));

					if (idIfCond_425) {

						java.lang.Boolean idIfCond_426 = false;
						idIfCond_426 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl"));

						if (idIfCond_426) {

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

		java.lang.Boolean idIfCond_427 = false;
		idIfCond_427 = this.isParameter();

		if (idIfCond_427) {

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

			kermeta.language.behavior.Expression result_ft99 = null;

			kermeta.language.behavior.Expression elem_ft99 = null;

			result_ft99 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_428 = false;
				while (!idLoopCond_428) {
					idLoopCond_428 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft99.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft99, null));
					if (idLoopCond_428) {
					} else {

						elem_ft99 = it_ft99.next();

						java.lang.Boolean idIfCond_429 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp99 = elem_ft99;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_429 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp99, this);
						//EIle:detector

						if (idIfCond_429) {

							result_ft99 = elem_ft99;
						}

					}
				}
			}

			//CE
			exp = result_ft99;
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

		java.lang.Boolean idIfCond_430 = false;
		idIfCond_430 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_430) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft100 = null;

			kermeta.language.structure.Parameter elem_ft100 = null;

			result_ft100 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_431 = false;
				while (!idLoopCond_431) {
					idLoopCond_431 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft100.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft100, null));
					if (idLoopCond_431) {
					} else {

						elem_ft100 = it_ft100.next();

						java.lang.Boolean idIfCond_432 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp100 = elem_ft100;

						idIfCond_432 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp100.getName(), this.getName());
						//EIle:detector

						if (idIfCond_432) {

							result_ft100 = elem_ft100;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(result_ft100));
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

		java.lang.Boolean idIfCond_433 = false;
		idIfCond_433 = this.isParameter();

		if (idIfCond_433) {

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

			kermeta.language.behavior.Expression result_ft101 = null;

			kermeta.language.behavior.Expression elem_ft101 = null;

			result_ft101 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_434 = false;
				while (!idLoopCond_434) {
					idLoopCond_434 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft101.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft101, null));
					if (idLoopCond_434) {
					} else {

						elem_ft101 = it_ft101.next();

						java.lang.Boolean idIfCond_435 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp101 = elem_ft101;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_435 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp101, this);
						//EIle:detector

						if (idIfCond_435) {

							result_ft101 = elem_ft101;
						}

					}
				}
			}

			//CE
			exp = result_ft101;
			//EIft:detect

			java.lang.Boolean idIfCond_436 = false;
			idIfCond_436 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_436) {

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

		java.lang.Boolean idIfCond_437 = false;
		idIfCond_437 = this.isParameter();

		if (idIfCond_437) {

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

			kermeta.language.behavior.Expression result_ft102 = null;

			kermeta.language.behavior.Expression elem_ft102 = null;

			result_ft102 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_438 = false;
				while (!idLoopCond_438) {
					idLoopCond_438 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft102.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft102, null));
					if (idLoopCond_438) {
					} else {

						elem_ft102 = it_ft102.next();

						java.lang.Boolean idIfCond_439 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp102 = elem_ft102;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_439 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp102, this);
						//EIle:detector

						if (idIfCond_439) {

							result_ft102 = elem_ft102;
						}

					}
				}
			}

			//CE
			exp = result_ft102;
			//EIft:detect

			java.lang.Boolean idIfCond_440 = false;
			idIfCond_440 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_440) {

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

		java.lang.Boolean idIfCond_441 = false;
		idIfCond_441 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_441) {

			java.lang.Boolean idIfCond_442 = false;
			idIfCond_442 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqual(this.retrieveCorrespondingParameter()
							.getUpper(), 1);

			if (idIfCond_442) {

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

		java.lang.Boolean idIfCond_443 = false;
		idIfCond_443 = this.isLambdaExpressionParameter();

		if (idIfCond_443) {

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

			java.lang.Boolean idIfCond_444 = false;
			idIfCond_444 = this.isDeclaredInAFunctionType();

			if (idIfCond_444) {

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
			} else {

				java.lang.Boolean idIfCond_445 = false;
				idIfCond_445 = this.isDeclaredInLambdaExpression();

				if (idIfCond_445) {

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

		java.lang.Boolean idIfCond_446 = false;
		idIfCond_446 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_446) {

			java.lang.Boolean idIfCond_447 = false;
			idIfCond_447 = ftParam.isFunctionType();

			if (idIfCond_447) {

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

		java.lang.Boolean idIfCond_448 = false;
		idIfCond_448 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_448) {

			result = null;
			//BIft:detect

			kermeta.language.structure.Parameter result_ft103 = null;

			kermeta.language.structure.Parameter elem_ft103 = null;

			result_ft103 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_449 = false;
				while (!idLoopCond_449) {
					idLoopCond_449 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft103.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft103, null));
					if (idLoopCond_449) {
					} else {

						elem_ft103 = it_ft103.next();

						java.lang.Boolean idIfCond_450 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp103 = elem_ft103;

						idIfCond_450 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp103.getName(), this.getName());
						//EIle:detector

						if (idIfCond_450) {

							result_ft103 = elem_ft103;
						}

					}
				}
			}

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

		java.lang.Boolean idIfCond_451 = false;
		idIfCond_451 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(l));

		if (idIfCond_451) {

			java.lang.Boolean idIfCond_452 = false;
			idIfCond_452 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(l.getInitialization()));

			if (idIfCond_452) {

				java.lang.Boolean idIfCond_453 = false;
				idIfCond_453 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOf(
								l.getInitialization(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_453) {

					java.lang.Boolean idIfCond_454 = false;
					idIfCond_454 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													l.getInitialization(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.VariableDecl")))
											.getIdentifier(), this.getName());

					if (idIfCond_454) {

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

		java.lang.Boolean idIfCond_455 = false;
		idIfCond_455 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_455) {

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

		java.lang.Boolean idIfCond_456 = false;
		idIfCond_456 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOf(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_456) {

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft104 = null;

			kermeta.language.behavior.Expression elem_ft104 = null;

			result_ft104 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_457 = false;
				while (!idLoopCond_457) {
					idLoopCond_457 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft104.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqual(result_ft104, null));
					if (idLoopCond_457) {
					} else {

						elem_ft104 = it_ft104.next();

						java.lang.Boolean idIfCond_458 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp104 = elem_ft104;

						idIfCond_458 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equals(p_lbdExp104, this);
						//EIle:detector

						if (idIfCond_458) {

							result_ft104 = elem_ft104;
						}

					}
				}
			}

			//CE
			exp = result_ft104;
			//EIft:detect

			java.lang.Boolean idIfCond_459 = false;
			idIfCond_459 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoid(exp));

			if (idIfCond_459) {

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

		java.lang.Boolean idIfCond_460 = false;
		idIfCond_460 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(this.retrieveCorrespondingParameter()));

		if (idIfCond_460) {

			java.lang.Boolean idIfCond_461 = false;
			idIfCond_461 = kermeta.standard.helper.IntegerWrapper.equals(this
					.retrieveCorrespondingParameter().getUpper(), 1);

			if (idIfCond_461) {

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

		java.lang.Boolean idIfCond_462 = false;
		idIfCond_462 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(ftParam));

		if (idIfCond_462) {

			java.lang.Boolean idIfCond_463 = false;
			idIfCond_463 = ftParam.isFunctionType();

			if (idIfCond_463) {

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
