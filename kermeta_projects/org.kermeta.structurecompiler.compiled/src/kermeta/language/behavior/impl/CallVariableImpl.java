/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CallVariableImpl.java,v 1.12 2009-02-10 17:51:50 cfaucher Exp $
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

		java.lang.Boolean idIfCond_90 = false;
		idIfCond_90 = kermeta.standard.helper.BooleanWrapper.and(
				kermeta.standard.helper.StringWrapper.equals(context
						.getTasks_stack().peek(), context
						.getFUNCTION_TYPE_COMPILATION_TASK()), this
						.isFunctionTypeVariable());

		if (idIfCond_90) {

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

			java.lang.Boolean idIfCond_91 = false;
			idIfCond_91 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isInstanceOfSwitcher(
							theLambdaExp.getStaticType(),
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.FunctionType"));

			if (idIfCond_91) {

				java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeSwitcher(
								theLambdaExp.getStaticType(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.FunctionType")))
						.getRight().createBehaviorJava(context);

				java.lang.Boolean idIfCond_92 = false;
				idIfCond_92 = kermeta.standard.helper.BooleanWrapper
						.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
										.getOperation()))
								.isVoidType(lambdaExp_returnType));

				if (idIfCond_92) {
				}

			}

			java.lang.Integer inc_param = 0;

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								theLambdaExp.getParameters()).iterator();
				java.lang.Boolean idLoopCond_93 = false;
				while (!idLoopCond_93) {
					idLoopCond_93 = it_ft12.isOff();
					if (idLoopCond_93) {
					} else {

						//BIle:func
						kermeta.language.behavior.LambdaParameter p_lbdExp12 = it_ft12
								.next();

						context.setFtSuffixActivation(false);

						java.lang.String type_param_ = context
								.getFtProductTypeStack().peek().getTypeByIndex(
										inc_param).createBehaviorJava(context);

						java.lang.Boolean idIfCond_94 = false;
						idIfCond_94 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
										.getOperation()))
								.isVoidType(type_param_);

						if (idIfCond_94) {

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
																		p_lbdExp12
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

			java.lang.Boolean idIfCond_95 = false;
			idIfCond_95 = kermeta.standard.helper.StringWrapper.equals(this
					.getName(), "stdio");

			if (idIfCond_95) {

				result = kermeta.standard.helper.StringWrapper
						.plus(result,
								"org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()");
			} else {

				java.lang.Boolean idIfCond_96 = false;
				idIfCond_96 = kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameter()),
						kermeta.standard.helper.BooleanWrapper.not(this
								.isParameterForOwningOperation()));

				if (idIfCond_96) {

					result = kermeta.standard.helper.StringWrapper
							.plus(
									kermeta.standard.helper.StringWrapper
											.plus(
													result,
													((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
															.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
																	.getIdentifierHelper()))
															.getMangledIdentifier(
																	this
																			.getName(),
																	context)),
									this.printSuffix(context));
				} else {

					java.lang.Boolean idIfCond_97 = false;
					idIfCond_97 = kermeta.standard.helper.BooleanWrapper
							.and(
									kermeta.standard.helper.BooleanWrapper
											.or(
													kermeta.standard.helper.BooleanWrapper
															.or(
																	this
																			.isParameterSingle(),
																	this
																			.isParameterForOwningOperationSingle()),
													this
															.isParameterManyAndForOwningOperation()),
									kermeta.standard.helper.BooleanWrapper
											.not(kermeta.standard.helper.BooleanWrapper
													.and(
															this
																	.isParameterSingle(),
															this
																	.isParameterForOwningOperationMany())));

					if (idIfCond_97) {

						result = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														result,
														((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
																.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
																		.getIdentifierHelper()))
																.getMangledIdentifier(
																		this
																				.getName(),
																		context)),
										this.printSuffix(context));
					} else {

						kermeta.language.structure.Parameter c_param = null;

						java.lang.Boolean idIfCond_98 = false;
						idIfCond_98 = this.isParameterForOwningOperation();

						if (idIfCond_98) {

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

						java.lang.Boolean idIfCond_99 = false;
						idIfCond_99 = this.isParameterMany();

						if (idIfCond_99) {

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

							java.lang.Boolean idIfCond_100 = false;
							idIfCond_100 = kermeta.standard.helper.BooleanWrapper
									.and(
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsUnique()),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_100) {

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

							java.lang.Boolean idIfCond_101 = false;
							idIfCond_101 = kermeta.standard.helper.BooleanWrapper
									.and(
											c_param.getIsUnique(),
											kermeta.standard.helper.BooleanWrapper
													.not(c_param.getIsOrdered()));

							if (idIfCond_101) {

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

							java.lang.Boolean idIfCond_102 = false;
							idIfCond_102 = kermeta.standard.helper.BooleanWrapper
									.and(c_param.getIsUnique(), c_param
											.getIsOrdered());

							if (idIfCond_102) {

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

							java.lang.Boolean idIfCond_103 = false;
							idIfCond_103 = kermeta.standard.helper.BooleanWrapper
									.and(kermeta.standard.helper.BooleanWrapper
											.not(c_param.getIsUnique()),
											c_param.getIsOrdered());

							if (idIfCond_103) {

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
																				.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE
																						.getIdentifierHelper()))
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

		java.lang.Boolean idIfCond_104 = false;
		idIfCond_104 = kermeta.standard.helper.BooleanWrapper.and(this
				.isParameterMany(), this.isParameterForOwningOperation());

		if (idIfCond_104) {

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

		java.lang.Boolean idIfCond_105 = false;
		idIfCond_105 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_105) {

			kermeta.language.behavior.Block tmp_block = null;

			tmp_block = (kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeOrVoid(
							this
									.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.Block")),
							"kermeta.language.behavior.Block");

			kermeta.language.behavior.Expression aStatement = null;

			java.lang.Boolean idIfCond_106 = false;
			idIfCond_106 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(tmp_block));

			if (idIfCond_106) {

				aStatement = this.getVariableDeclInBlock(tmp_block);
			}

			java.lang.Boolean idIfCond_107 = false;
			idIfCond_107 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(aStatement));

			if (idIfCond_107) {

				java.lang.Boolean idIfCond_108 = false;
				idIfCond_108 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								aStatement,
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_108) {

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

			java.lang.Boolean idIfCond_109 = false;
			idIfCond_109 = kermeta.standard.helper.BooleanWrapper.not(result);

			if (idIfCond_109) {

				kermeta.language.behavior.Loop tmp_loop = null;

				tmp_loop = (kermeta.language.behavior.Loop) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(
								this
										.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Loop")),
								"kermeta.language.behavior.Loop");

				kermeta.language.behavior.Expression aStatement_ = null;

				java.lang.Boolean idIfCond_110 = false;
				idIfCond_110 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(tmp_loop));

				if (idIfCond_110) {

					aStatement_ = this.getVariableDeclInLoop(tmp_loop);
				}

				java.lang.Boolean idIfCond_111 = false;
				idIfCond_111 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(aStatement_));

				if (idIfCond_111) {

					java.lang.Boolean idIfCond_112 = false;
					idIfCond_112 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									aStatement_,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_112) {

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

		java.lang.Boolean idIfCond_113 = false;
		idIfCond_113 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_113) {

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

		kermeta.language.behavior.Expression result_ft13 = null;

		kermeta.language.behavior.Expression elem_ft13 = null;

		result_ft13 = null;

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.behavior.Expression> convertAsOrderedSet(
							block.getStatement()).iterator();
			java.lang.Boolean idLoopCond_114 = false;
			while (!idLoopCond_114) {
				idLoopCond_114 = kermeta.standard.helper.BooleanWrapper.or(
						it_ft13.isOff(),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(result_ft13, null));
				if (idLoopCond_114) {
				} else {

					elem_ft13 = it_ft13.next();

					java.lang.Boolean idIfCond_115 = false;
					//BIle:detector
					kermeta.language.behavior.Expression s_lbdExp13 = elem_ft13;

					java.lang.Boolean idIfCond_116 = false;
					idIfCond_116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									s_lbdExp13,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_116) {

						idIfCond_115 = kermeta.standard.helper.StringWrapper
								.equals(
										((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
												.asTypeSwitcher(
														s_lbdExp13,
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.VariableDecl")))
												.getIdentifier(), this
												.getName());
					} else {

						idIfCond_115 = false;
					}

					//EIle:detector

					if (idIfCond_115) {

						result_ft13 = elem_ft13;
					}

				}
			}
		}

		//CE
		result = result_ft13;
		//EIft:detect

		java.lang.Boolean idIfCond_117 = false;
		idIfCond_117 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_117) {

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

		java.lang.Boolean idIfCond_118 = false;
		idIfCond_118 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.LambdaExpression"))));

		if (idIfCond_118) {

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

		java.lang.Boolean idIfCond_119 = false;
		idIfCond_119 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(lambdaExpression));

		if (idIfCond_119) {

			//BIft:detect

			kermeta.language.behavior.LambdaParameter result_ft14 = null;

			kermeta.language.behavior.LambdaParameter elem_ft14 = null;

			result_ft14 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.LambdaParameter> convertAsOrderedSet(
								lambdaExpression.getParameters()).iterator();
				java.lang.Boolean idLoopCond_120 = false;
				while (!idLoopCond_120) {
					idLoopCond_120 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft14.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft14,
													null));
					if (idLoopCond_120) {
					} else {

						elem_ft14 = it_ft14.next();

						java.lang.Boolean idIfCond_121 = false;
						//BIle:detector
						kermeta.language.behavior.LambdaParameter p_lbdExp14 = elem_ft14;

						idIfCond_121 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp14.getName(), this.getName());
						//EIle:detector

						if (idIfCond_121) {

							result_ft14 = elem_ft14;
						}

					}
				}
			}

			//CE
			result = result_ft14;
			//EIft:detect

			java.lang.Boolean idIfCond_122 = false;
			idIfCond_122 = kermeta.standard.helper.BooleanWrapper
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

			if (idIfCond_122) {

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
	public Parameter getCallFeatureCorrespondingParameter() {

		kermeta.language.structure.Parameter result = null;

		result = null;

		java.lang.Boolean idIfCond_123 = false;
		idIfCond_123 = this.isParameter();

		if (idIfCond_123) {

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

			kermeta.language.behavior.Expression result_ft15 = null;

			kermeta.language.behavior.Expression elem_ft15 = null;

			result_ft15 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_124 = false;
				while (!idLoopCond_124) {
					idLoopCond_124 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft15.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft15,
													null));
					if (idLoopCond_124) {
					} else {

						elem_ft15 = it_ft15.next();

						java.lang.Boolean idIfCond_125 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp15 = elem_ft15;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_125 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp15, this);
						//EIle:detector

						if (idIfCond_125) {

							result_ft15 = elem_ft15;
						}

					}
				}
			}

			//CE
			exp = result_ft15;
			//EIft:detect
			;

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
	public Boolean isDeclaredInAFunctionType() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_126 = false;
		idIfCond_126 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_126) {

			java.lang.Boolean idIfCond_127 = false;
			idIfCond_127 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_127) {

				kermeta.language.behavior.Block tmp_block = null;

				tmp_block = (kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(
								this
										.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Block")),
								"kermeta.language.behavior.Block");

				kermeta.language.behavior.Expression aStatement = null;

				java.lang.Boolean idIfCond_128 = false;
				idIfCond_128 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(tmp_block));

				if (idIfCond_128) {

					aStatement = this.getVariableDeclInBlock(tmp_block);
				}

				java.lang.Boolean idIfCond_129 = false;
				idIfCond_129 = kermeta.standard.helper.BooleanWrapper
						.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isVoidSwitcher(aStatement));

				if (idIfCond_129) {

					java.lang.Boolean idIfCond_130 = false;
					idIfCond_130 = org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isInstanceOfSwitcher(
									aStatement,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.behavior.VariableDecl"));

					if (idIfCond_130) {

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

				java.lang.Boolean idIfCond_131 = false;
				idIfCond_131 = kermeta.standard.helper.BooleanWrapper
						.not(result);

				if (idIfCond_131) {

					kermeta.language.behavior.Loop tmp_loop = null;

					tmp_loop = (kermeta.language.behavior.Loop) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeOrVoid(
									this
											.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Loop")),
									"kermeta.language.behavior.Loop");

					kermeta.language.behavior.Expression aStatement_ = null;

					java.lang.Boolean idIfCond_132 = false;
					idIfCond_132 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(tmp_loop));

					if (idIfCond_132) {

						aStatement_ = this.getVariableDeclInLoop(tmp_loop);
					}

					java.lang.Boolean idIfCond_133 = false;
					idIfCond_133 = kermeta.standard.helper.BooleanWrapper
							.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isVoidSwitcher(aStatement_));

					if (idIfCond_133) {

						java.lang.Boolean idIfCond_134 = false;
						idIfCond_134 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										aStatement_,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.VariableDecl"));

						if (idIfCond_134) {

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
	public Boolean isParameterForOwningOperation() {

		java.lang.Boolean result = null;

		result = false;

		java.lang.Boolean idIfCond_135 = false;
		idIfCond_135 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_135) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft16 = null;

			kermeta.language.structure.Parameter elem_ft16 = null;

			result_ft16 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_136 = false;
				while (!idLoopCond_136) {
					idLoopCond_136 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft16.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft16,
													null));
					if (idLoopCond_136) {
					} else {

						elem_ft16 = it_ft16.next();

						java.lang.Boolean idIfCond_137 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp16 = elem_ft16;

						idIfCond_137 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp16.getName(), this.getName());
						//EIle:detector

						if (idIfCond_137) {

							result_ft16 = elem_ft16;
						}

					}
				}
			}

			//EIft:detect
			result = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(result_ft16));
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

		java.lang.Boolean idIfCond_138 = false;
		idIfCond_138 = this.isParameter();

		if (idIfCond_138) {

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

			kermeta.language.behavior.Expression result_ft17 = null;

			kermeta.language.behavior.Expression elem_ft17 = null;

			result_ft17 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_139 = false;
				while (!idLoopCond_139) {
					idLoopCond_139 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft17.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft17,
													null));
					if (idLoopCond_139) {
					} else {

						elem_ft17 = it_ft17.next();

						java.lang.Boolean idIfCond_140 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp17 = elem_ft17;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_140 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp17, this);
						//EIle:detector

						if (idIfCond_140) {

							result_ft17 = elem_ft17;
						}

					}
				}
			}

			//CE
			exp = result_ft17;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_141 = false;
			idIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil
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

			if (idIfCond_141) {

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

		java.lang.Boolean idIfCond_142 = false;
		idIfCond_142 = this.isParameter();

		if (idIfCond_142) {

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

			kermeta.language.behavior.Expression result_ft18 = null;

			kermeta.language.behavior.Expression elem_ft18 = null;

			result_ft18 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.behavior.Expression> convertAsOrderedSet(
								cf_.getParameters()).iterator();
				java.lang.Boolean idLoopCond_143 = false;
				while (!idLoopCond_143) {
					idLoopCond_143 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft18.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft18,
													null));
					if (idLoopCond_143) {
					} else {

						elem_ft18 = it_ft18.next();

						java.lang.Boolean idIfCond_144 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp18 = elem_ft18;

						i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);

						idIfCond_144 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp18, this);
						//EIle:detector

						if (idIfCond_144) {

							result_ft18 = elem_ft18;
						}

					}
				}
			}

			//CE
			exp = result_ft18;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_145 = false;
			idIfCond_145 = kermeta.standard.helper.IntegerWrapper
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

			if (idIfCond_145) {

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

		java.lang.Boolean idIfCond_146 = false;
		idIfCond_146 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.retrieveCorrespondingParameter()));

		if (idIfCond_146) {

			java.lang.Boolean idIfCond_147 = false;
			idIfCond_147 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.isNotEqualSwitcher(this.retrieveCorrespondingParameter()
							.getUpper(), 1);

			if (idIfCond_147) {

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

		java.lang.Boolean idIfCond_148 = false;
		idIfCond_148 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(ftParam));

		if (idIfCond_148) {

			java.lang.Boolean idIfCond_149 = false;
			idIfCond_149 = ftParam.isFunctionType();

			if (idIfCond_149) {

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

		java.lang.Boolean idIfCond_150 = false;
		idIfCond_150 = this.isLambdaExpressionParameter();

		if (idIfCond_150) {

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

			java.lang.Boolean idIfCond_151 = false;
			idIfCond_151 = this.isDeclaredInAFunctionType();

			if (idIfCond_151) {

				java.lang.Boolean idIfCond_152 = false;
				idIfCond_152 = kermeta.standard.helper.BooleanWrapper
						.and(
								context.getAfterLbdExpActivation(),
								org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isNotEqualSwitcher(context
												.printFtSuffix(), ""));

				if (idIfCond_152) {

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

				java.lang.Boolean idIfCond_153 = false;
				idIfCond_153 = this.isDeclaredInLambdaExpression();

				if (idIfCond_153) {

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

		java.lang.Boolean idIfCond_154 = false;
		idIfCond_154 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation"))));

		if (idIfCond_154) {

			//BIft:detect

			kermeta.language.structure.Parameter result_ft19 = null;

			kermeta.language.structure.Parameter elem_ft19 = null;

			result_ft19 = null;

			{

				kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_155 = false;
				while (!idLoopCond_155) {
					idLoopCond_155 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft19.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft19,
													null));
					if (idLoopCond_155) {
					} else {

						elem_ft19 = it_ft19.next();

						java.lang.Boolean idIfCond_156 = false;
						//BIle:detector
						kermeta.language.structure.Parameter p_lbdExp19 = elem_ft19;

						idIfCond_156 = kermeta.standard.helper.StringWrapper
								.equals(p_lbdExp19.getName(), this.getName());
						//EIle:detector

						if (idIfCond_156) {

							result_ft19 = elem_ft19;
						}

					}
				}
			}

			//CE
			result = result_ft19;
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

		java.lang.Boolean idIfCond_157 = false;
		idIfCond_157 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(l));

		if (idIfCond_157) {

			java.lang.Boolean idIfCond_158 = false;
			idIfCond_158 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(l.getInitialization()));

			if (idIfCond_158) {

				java.lang.Boolean idIfCond_159 = false;
				idIfCond_159 = org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isInstanceOfSwitcher(
								l.getInitialization(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.behavior.VariableDecl"));

				if (idIfCond_159) {

					java.lang.Boolean idIfCond_160 = false;
					idIfCond_160 = kermeta.standard.helper.StringWrapper
							.equals(
									((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													l.getInitialization(),
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.behavior.VariableDecl")))
											.getIdentifier(), this.getName());

					if (idIfCond_160) {

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

		java.lang.Boolean idIfCond_161 = false;
		idIfCond_161 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_161) {

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

		java.lang.Boolean idIfCond_162 = false;
		idIfCond_162 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isInstanceOfSwitcher(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.containerSwitcher(this),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.behavior.CallFeature"));

		if (idIfCond_162) {

			kermeta.language.behavior.Expression exp = null;
			//BIft:detect

			kermeta.language.behavior.Expression result_ft20 = null;

			kermeta.language.behavior.Expression elem_ft20 = null;

			result_ft20 = null;

			{

				kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
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
				java.lang.Boolean idLoopCond_163 = false;
				while (!idLoopCond_163) {
					idLoopCond_163 = kermeta.standard.helper.BooleanWrapper
							.or(
									it_ft20.isOff(),
									org.kermeta.compil.runtime.helper.language.ObjectUtil
											.isNotEqualSwitcher(result_ft20,
													null));
					if (idLoopCond_163) {
					} else {

						elem_ft20 = it_ft20.next();

						java.lang.Boolean idIfCond_164 = false;
						//BIle:detector
						kermeta.language.behavior.Expression p_lbdExp20 = elem_ft20;

						idIfCond_164 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.equalsSwitcher(p_lbdExp20, this);
						//EIle:detector

						if (idIfCond_164) {

							result_ft20 = elem_ft20;
						}

					}
				}
			}

			//CE
			exp = result_ft20;
			//EIft:detect
			;

			java.lang.Boolean idIfCond_165 = false;
			idIfCond_165 = kermeta.standard.helper.BooleanWrapper
					.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
							.isVoidSwitcher(exp));

			if (idIfCond_165) {

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

		java.lang.Boolean idIfCond_166 = false;
		idIfCond_166 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(this.retrieveCorrespondingParameter()));

		if (idIfCond_166) {

			java.lang.Boolean idIfCond_167 = false;
			idIfCond_167 = kermeta.standard.helper.IntegerWrapper.equals(this
					.retrieveCorrespondingParameter().getUpper(), 1);

			if (idIfCond_167) {

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

		java.lang.Boolean idIfCond_168 = false;
		idIfCond_168 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(ftParam));

		if (idIfCond_168) {

			java.lang.Boolean idIfCond_169 = false;
			idIfCond_169 = ftParam.isFunctionType();

			if (idIfCond_169) {

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
