/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft275 = expressions
					.iterator();
			java.lang.Boolean idLoopCond_1185 = false;
			while (!idLoopCond_1185) {
				idLoopCond_1185 = it_ft275.isOff();
				if (idLoopCond_1185) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression e_lbdExp275 = it_ft275
							.next();

					java.lang.Boolean idIfCond_1186 = false;
					idIfCond_1186 = kermeta.standard.helper.IntegerWrapper
							.equals(i, 1);

					if (idIfCond_1186) {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, ", ");
					} else {

						i = 1;
					}

					java.lang.String str_param = "";

					java.lang.Boolean idIfCond_1187 = false;
					idIfCond_1187 = kermeta.standard.helper.BooleanWrapper
							.not(e_lbdExp275.isFunctionTypeVariable());

					if (idIfCond_1187) {

						str_param = e_lbdExp275.createBehaviorJava(context);

						java.lang.Boolean idIfCond_1188 = false;
						idIfCond_1188 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_1188) {

							str_param = "self";
						}

						java.lang.Boolean idIfCond_1189 = false;
						idIfCond_1189 = kermeta.standard.helper.BooleanWrapper
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
																												e_lbdExp275,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallVariable"))),
																						kermeta.standard.helper.BooleanWrapper
																								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isInstanceOfSwitcher(
																												e_lbdExp275,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallFeature")))),
																		kermeta.standard.helper.BooleanWrapper
																				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.isInstanceOfSwitcher(
																								e_lbdExp275,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.behavior.CallResult")))),
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				e_lbdExp275,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.SelfExpression")))),
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.StringWrapper
																.equals(
																		e_lbdExp275
																				.getStaticType()
																				.getTypeQName(),
																		"kermeta::language::structure::Class"),
														kermeta.standard.helper.StringWrapper
																.equals(
																		e_lbdExp275
																				.getStaticType()
																				.getTypeQName(),
																		"kermeta::language::structure::Type")));

						if (idIfCond_1189) {

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

						java.lang.Boolean idIfCond_1190 = false;
						idIfCond_1190 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										e_lbdExp275,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.behavior.Assignment"));

						if (idIfCond_1190) {

							kermeta.language.behavior.Assignment assign_ = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											e_lbdExp275,
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

							java.lang.Boolean idIfCond_1191 = false;
							idIfCond_1191 = org.kermeta.compil.runtime.helper.language.ObjectUtil
									.isInstanceOfSwitcher(
											e_lbdExp275,
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.behavior.CallFeature"));

							if (idIfCond_1191) {

								java.lang.Boolean idIfCond_1192 = false;
								idIfCond_1192 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeSwitcher(
												e_lbdExp275,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.behavior.CallFeature")))
										.requireConversionValueTypeToObject(context);

								if (idIfCond_1192) {

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

						java.lang.Boolean idIfCond_1193 = false;
						idIfCond_1193 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(e_lbdExp275),
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

						if (idIfCond_1193) {

							java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											theLambdaExp.getStaticType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.FunctionType")))
									.getRight().createBehaviorJava(context);

							java.lang.Boolean idIfCond_1194 = false;
							idIfCond_1194 = kermeta.standard.helper.BooleanWrapper
									.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
													.getOperation()))
											.isVoidType(lambdaExp_returnType));

							if (idIfCond_1194) {

								type_label = lambdaExp_returnType;
							}

						}

						java.lang.Boolean idIfCond_1195 = false;
						idIfCond_1195 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(type_label, "");

						if (idIfCond_1195) {

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
													.containerSwitcher(e_lbdExp275),
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
																																							.containerSwitcher(e_lbdExp275),
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
													e_lbdExp275
															.createBehaviorJava(context)));

							str_param = kermeta.standard.helper.StringWrapper
									.plus("result_lambda", context
											.printFtSuffix());

							context.getResultLastStatementStack().pop();
						} else {

							str_param = e_lbdExp275.createBehaviorJava(context);
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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft276 = expressions
					.iterator();
			java.lang.Boolean idLoopCond_1196 = false;
			while (!idLoopCond_1196) {
				idLoopCond_1196 = it_ft276.isOff();
				if (idLoopCond_1196) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression e_lbdExp276 = it_ft276
							.next();

					result = kermeta.standard.helper.StringWrapper.plus(result,
							e_lbdExp276.createBehaviorJava(context));
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

		java.lang.Boolean idIfCond_1197 = false;
		idIfCond_1197 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem.getUpper(), 1);

		if (idIfCond_1197) {

			java.lang.Boolean idIfCond_1198 = false;
			idIfCond_1198 = elem.getIsOrdered();

			if (idIfCond_1198) {

				java.lang.Boolean idIfCond_1199 = false;
				idIfCond_1199 = elem.getIsUnique();

				if (idIfCond_1199) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.OrderedSet");
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.Sequence");
				}

			} else {

				java.lang.Boolean idIfCond_1200 = false;
				idIfCond_1200 = elem.getIsUnique();

				if (idIfCond_1200) {

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

		java.lang.Boolean idIfCond_1201 = false;
		idIfCond_1201 = kermeta.standard.helper.IntegerWrapper
				.isGreaterOrEqual(name_set.size(), 2);

		if (idIfCond_1201) {

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

		java.lang.Boolean idIfCond_1202 = false;
		idIfCond_1202 = kermeta.standard.helper.IntegerWrapper
				.isGreaterOrEqual(name_set.size(), 2);

		if (idIfCond_1202) {

			java.lang.String class_label = name_set
					.elementAt(kermeta.standard.helper.IntegerWrapper.minus(
							name_set.size(), 1));

			java.lang.Boolean idIfCond_1203 = false;
			idIfCond_1203 = kermeta.standard.helper.StringWrapper.equals(
					class_label, "Class");

			if (idIfCond_1203) {

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
