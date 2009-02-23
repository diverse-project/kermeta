/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CompilerHelperJavaImpl.java,v 1.12 2009-02-23 15:26:42 cfaucher Exp $
 */
package km2ecore.helper.kermeta.impl;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.MultiplicityElement;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.OrderedSet;
import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import km2ecore.helper.kermeta.CompilerHelperJava;
import km2ecore.helper.kermeta.KermetaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compiler Helper Java</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompilerHelperJavaImpl extends ObjectImpl implements
		CompilerHelperJava {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilerHelperJavaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KermetaPackage.Literals.COMPILER_HELPER_JAVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppComaSeparatedNodes(Set<Expression> expressions,
			KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Integer i = 0;

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft7 = expressions
					.iterator();
			java.lang.Boolean idLoopCond_28 = false;
			while (!idLoopCond_28) {
				idLoopCond_28 = it_ft7.isOff();
				if (idLoopCond_28) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression e_lbdExp7 = it_ft7
							.next();

					java.lang.Boolean idIfCond_29 = false;
					idIfCond_29 = kermeta.standard.helper.IntegerWrapper
							.equals(i, 1);

					if (idIfCond_29) {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, ", ");
					} else {

						i = 1;
					}

					java.lang.String str_param = "";

					java.lang.Boolean idIfCond_30 = false;
					idIfCond_30 = kermeta.standard.helper.BooleanWrapper
							.not(e_lbdExp7.isFunctionTypeVariable());

					if (idIfCond_30) {

						str_param = e_lbdExp7.createBehaviorJava(context);

						java.lang.Boolean idIfCond_31 = false;
						idIfCond_31 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isVoidSwitcher(context
																				.getCurrent_valueType())),
														context
																.getStaticOperationMode()),
										kermeta.standard.helper.StringWrapper
												.equals(str_param, "this"));

						if (idIfCond_31) {

							str_param = "self";
						}

						java.lang.Boolean idIfCond_32 = false;
						idIfCond_32 = kermeta.standard.helper.BooleanWrapper
								.and(
										kermeta.standard.helper.BooleanWrapper
												.and(
														kermeta.standard.helper.BooleanWrapper
																.and(
																		kermeta.standard.helper.BooleanWrapper
																				.and(
																						kermeta.standard.helper.BooleanWrapper
																								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isInstanceOfSwitcher(
																												e_lbdExp7,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallVariable"))),
																						kermeta.standard.helper.BooleanWrapper
																								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isInstanceOfSwitcher(
																												e_lbdExp7,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallFeature")))),
																		kermeta.standard.helper.BooleanWrapper
																				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.isInstanceOfSwitcher(
																								e_lbdExp7,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.behavior.CallResult")))),
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				e_lbdExp7,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.SelfExpression")))),
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.StringWrapper
																.equals(
																		e_lbdExp7
																				.getStaticType()
																				.getTypeQName(),
																		"kermeta::language::structure::Class"),
														kermeta.standard.helper.StringWrapper
																.equals(
																		e_lbdExp7
																				.getStaticType()
																				.getTypeQName(),
																		"kermeta::language::structure::Type")));

						if (idIfCond_32) {

							str_param = kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			context
																					.getJAVA_INSTANCE_EXECUTION_CONTEXT(),
																			".getMetaClass(\""),
															str_param), "\")");
						}

						java.lang.Boolean idIfCond_33 = false;
						idIfCond_33 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										e_lbdExp7,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Assignment"));

						if (idIfCond_33) {

							kermeta.language.behavior.Assignment assign_ = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											e_lbdExp7,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Assignment")));

							str_param = kermeta.standard.helper.StringWrapper
									.plus(kermeta.standard.helper.StringWrapper
											.plus(str_param, assign_
													.getValueTypeCastSuffix()),
											assign_.getCacheCastSuffix());
						} else {

							java.lang.Boolean idIfCond_34 = false;
							idIfCond_34 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											e_lbdExp7,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature"));

							if (idIfCond_34) {

								java.lang.Boolean idIfCond_35 = false;
								idIfCond_35 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												e_lbdExp7,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature")))
										.requireConversionValueTypeToObject(context);

								if (idIfCond_35) {

									str_param = kermeta.standard.helper.StringWrapper
											.plus(
													kermeta.standard.helper.StringWrapper
															.plus(
																	kermeta.standard.helper.StringWrapper
																			.plus(
																					context
																							.getOBJECT_UTIL_CLASS(),
																					".convertAsObject("),
																	str_param),
													")");
								}

							}

						}

					} else {

						java.lang.String type_label = "";

						kermeta.language.behavior.LambdaExpression theLambdaExp = context
								.getFtStack().peek();

						java.lang.Boolean idIfCond_36 = false;
						idIfCond_36 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(e_lbdExp7),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.behavior.CallFeature")),
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														theLambdaExp
																.getStaticType(),
														org.kermeta.compil.runtime.ExecutionContext
																.getInstance()
																.getMetaClass(
																		"kermeta.language.structure.FunctionType")));

						if (idIfCond_36) {

							java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											theLambdaExp.getStaticType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.FunctionType")))
									.getRight().createBehaviorJava(context);

							java.lang.Boolean idIfCond_37 = false;
							idIfCond_37 = kermeta.standard.helper.BooleanWrapper
									.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
													.getOperation()))
											.isVoidType(lambdaExp_returnType));

							if (idIfCond_37) {

								type_label = lambdaExp_returnType;
							}

						}

						java.lang.Boolean idIfCond_38 = false;
						idIfCond_38 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(type_label, "");

						if (idIfCond_38) {

							context
									.getResultLastStatementStack()
									.push(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"result_lambda",
																											context
																													.printFtSuffix()),
																							" = "),
																			context
																					.getTYPE_SEPARATOR()),
															type_label));

							((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(e_lbdExp7),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.Expression")))
									.setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper
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
																																	((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil
																																			.asTypeSwitcher(
																																					org.kermeta.compil.runtime.helper.language.ObjectUtil
																																							.containerSwitcher(e_lbdExp7),
																																					org.kermeta.compil.runtime.ExecutionContext
																																							.getInstance()
																																							.getMetaClass(
																																									"kermeta.language.behavior.Expression")))
																																			.getBeforeLambdaExpressionResult(),
																																	"\n"),
																													type_label),
																									" result_lambda"),
																					context
																							.printFtSuffix()),
																	" = null;\n"),
													e_lbdExp7
															.createBehaviorJava(context)));

							str_param = kermeta.standard.helper.StringWrapper
									.plus("result_lambda", context
											.printFtSuffix());

							context.getResultLastStatementStack().pop();
						} else {

							str_param = e_lbdExp7.createBehaviorJava(context);
						}

					}

					result = kermeta.standard.helper.StringWrapper.plus(result,
							str_param);
					//EIle:func

				}
			}
		}

		//EIft:each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppCRSeparatedNode(OrderedSet<Expression> expressions,
			KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft8 = expressions
					.iterator();
			java.lang.Boolean idLoopCond_39 = false;
			while (!idLoopCond_39) {
				idLoopCond_39 = it_ft8.isOff();
				if (idLoopCond_39) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression e_lbdExp8 = it_ft8
							.next();

					result = kermeta.standard.helper.StringWrapper.plus(result,
							e_lbdExp8.createBehaviorJava(context));
					//EIle:func

				}
			}
		}

		//EIft:each

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppTypeFromMultiplicityElement(MultiplicityElement elem,
			KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean idIfCond_40 = false;
		idIfCond_40 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem.getUpper(), 1);

		if (idIfCond_40) {

			java.lang.Boolean idIfCond_41 = false;
			idIfCond_41 = elem.getIsOrdered();

			if (idIfCond_41) {

				java.lang.Boolean idIfCond_42 = false;
				idIfCond_42 = elem.getIsUnique();

				if (idIfCond_42) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.OrderedSet");
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.Sequence");
				}

			} else {

				java.lang.Boolean idIfCond_43 = false;
				idIfCond_43 = elem.getIsUnique();

				if (idIfCond_43) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.Set");
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.Bag");
				}

			}

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(result,
									"<"), elem.getType().createBehaviorJava(
									context)), ">");
		} else {

			result = kermeta.standard.helper.StringWrapper.plus(result, elem
					.getType().createBehaviorJava(context));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppEmfLikeCreateFactory(String localType) {

		java.lang.String result = null;

		result = "";

		kermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper
				.split(localType, "\\.");

		java.lang.String allPackages_label = kermeta.standard.helper.StringWrapper
				.substring(
						localType,
						0,
						kermeta.standard.helper.IntegerWrapper
								.minus(
										kermeta.standard.helper.StringWrapper
												.size(localType),
										kermeta.standard.helper.StringWrapper
												.size(name_set
														.elementAt(kermeta.standard.helper.IntegerWrapper
																.minus(
																		name_set
																				.size(),
																		1)))));

		java.lang.Boolean idIfCond_44 = false;
		idIfCond_44 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(
				name_set.size(), 2);

		if (idIfCond_44) {

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							" = ",
																							allPackages_label),
																			kermeta.standard.helper.StringWrapper
																					.capName(name_set
																							.elementAt(kermeta.standard.helper.IntegerWrapper
																									.minus(
																											name_set
																													.size(),
																											2)))),
															"Factory.eINSTANCE.create"),
											name_set
													.elementAt(kermeta.standard.helper.IntegerWrapper
															.minus(name_set
																	.size(), 1))),
							"()");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ppEmfLikeGetEMF(String localType) {

		java.lang.String result = null;

		result = "";

		localType = kermeta.standard.helper.StringWrapper.split(localType, "<")
				.first();

		kermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper
				.split(localType, "\\.");

		java.lang.String allPackages_label = kermeta.standard.helper.StringWrapper
				.substring(
						localType,
						0,
						kermeta.standard.helper.IntegerWrapper
								.minus(
										kermeta.standard.helper.StringWrapper
												.size(localType),
										kermeta.standard.helper.StringWrapper
												.size(name_set
														.elementAt(kermeta.standard.helper.IntegerWrapper
																.minus(
																		name_set
																				.size(),
																		1)))));

		java.lang.Boolean idIfCond_45 = false;
		idIfCond_45 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(
				name_set.size(), 2);

		if (idIfCond_45) {

			java.lang.String class_label = name_set
					.elementAt(kermeta.standard.helper.IntegerWrapper.minus(
							name_set.size(), 1));

			java.lang.Boolean idIfCond_46 = false;
			idIfCond_46 = kermeta.standard.helper.StringWrapper.equals(
					class_label, "Class");

			if (idIfCond_46) {

				class_label = kermeta.standard.helper.StringWrapper.plus(
						class_label, "_");
			}

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			allPackages_label,
																			kermeta.standard.helper.StringWrapper
																					.capName(name_set
																							.elementAt(kermeta.standard.helper.IntegerWrapper
																									.minus(
																											name_set
																													.size(),
																											2)))),
															"Package.eINSTANCE.get"),
											class_label), "()");
		}

		return result;

	}

} //CompilerHelperJavaImpl
