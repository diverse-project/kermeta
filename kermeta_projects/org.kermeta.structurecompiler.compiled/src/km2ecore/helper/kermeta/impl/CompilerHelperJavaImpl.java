/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJavaImpl.java,v 1.10 2009-01-21 09:15:52 cfaucher Exp $
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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft247 = expressions
					.iterator();
			java.lang.Boolean idLoopCond_1081 = false;
			while (!idLoopCond_1081) {
				idLoopCond_1081 = it_ft247.isOff();
				if (idLoopCond_1081) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression e_lbdExp247 = it_ft247
							.next();

					java.lang.Boolean idIfCond_1082 = false;
					idIfCond_1082 = kermeta.standard.helper.IntegerWrapper
							.equals(i, 1);

					if (idIfCond_1082) {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, ", ");
					} else {

						i = 1;
					}

					java.lang.String str_param = "";

					java.lang.Boolean idIfCond_1083 = false;
					idIfCond_1083 = kermeta.standard.helper.BooleanWrapper
							.not(e_lbdExp247.isFunctionTypeVariable());

					if (idIfCond_1083) {

						str_param = e_lbdExp247.createBehaviorJava(context);

						java.lang.Boolean idIfCond_1084 = false;
						idIfCond_1084 = kermeta.standard.helper.BooleanWrapper
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

						if (idIfCond_1084) {

							str_param = "self";
						}

						java.lang.Boolean idIfCond_1085 = false;
						idIfCond_1085 = kermeta.standard.helper.BooleanWrapper
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
																												e_lbdExp247,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallVariable"))),
																						kermeta.standard.helper.BooleanWrapper
																								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.isInstanceOfSwitcher(
																												e_lbdExp247,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.behavior.CallFeature")))),
																		kermeta.standard.helper.BooleanWrapper
																				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.isInstanceOfSwitcher(
																								e_lbdExp247,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.behavior.CallResult")))),
														kermeta.standard.helper.BooleanWrapper
																.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.isInstanceOfSwitcher(
																				e_lbdExp247,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.behavior.SelfExpression")))),
										kermeta.standard.helper.BooleanWrapper
												.or(
														kermeta.standard.helper.StringWrapper
																.equals(
																		e_lbdExp247
																				.getStaticType()
																				.getTypeQName(),
																		"kermeta::language::structure::Class"),
														kermeta.standard.helper.StringWrapper
																.equals(
																		e_lbdExp247
																				.getStaticType()
																				.getTypeQName(),
																		"kermeta::language::structure::Type")));

						if (idIfCond_1085) {

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

					} else {

						java.lang.String type_label = "";

						kermeta.language.behavior.LambdaExpression theLambdaExp = context
								.getFtStack().peek();

						java.lang.Boolean idIfCond_1086 = false;
						idIfCond_1086 = kermeta.standard.helper.BooleanWrapper
								.and(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.isInstanceOfSwitcher(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.containerSwitcher(e_lbdExp247),
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

						if (idIfCond_1086) {

							java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											theLambdaExp.getStaticType(),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"kermeta.language.structure.FunctionType")))
									.getRight().createBehaviorJava(context);

							java.lang.Boolean idIfCond_1087 = false;
							idIfCond_1087 = kermeta.standard.helper.BooleanWrapper
									.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil
											.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
													.getOperation()))
											.isVoidType(lambdaExp_returnType));

							if (idIfCond_1087) {

								type_label = lambdaExp_returnType;
							}

						}

						java.lang.Boolean idIfCond_1088 = false;
						idIfCond_1088 = org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isNotEqualSwitcher(type_label, "");

						if (idIfCond_1088) {

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
													.containerSwitcher(e_lbdExp247),
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
																																							.containerSwitcher(e_lbdExp247),
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
													e_lbdExp247
															.createBehaviorJava(context)));

							str_param = kermeta.standard.helper.StringWrapper
									.plus("result_lambda", context
											.printFtSuffix());

							context.getResultLastStatementStack().pop();
						} else {

							str_param = e_lbdExp247.createBehaviorJava(context);
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

			kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft248 = expressions
					.iterator();
			java.lang.Boolean idLoopCond_1089 = false;
			while (!idLoopCond_1089) {
				idLoopCond_1089 = it_ft248.isOff();
				if (idLoopCond_1089) {
				} else {

					//BIle:func
					kermeta.language.behavior.Expression e_lbdExp248 = it_ft248
							.next();

					result = kermeta.standard.helper.StringWrapper.plus(result,
							e_lbdExp248.createBehaviorJava(context));
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

		java.lang.Boolean idIfCond_1090 = false;
		idIfCond_1090 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(elem.getUpper(), 1);

		if (idIfCond_1090) {

			java.lang.Boolean idIfCond_1091 = false;
			idIfCond_1091 = elem.getIsOrdered();

			if (idIfCond_1091) {

				java.lang.Boolean idIfCond_1092 = false;
				idIfCond_1092 = elem.getIsUnique();

				if (idIfCond_1092) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.OrderedSet");
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"kermeta.standard.Sequence");
				}

			} else {

				java.lang.Boolean idIfCond_1093 = false;
				idIfCond_1093 = elem.getIsUnique();

				if (idIfCond_1093) {

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

		java.lang.Boolean idIfCond_1094 = false;
		idIfCond_1094 = kermeta.standard.helper.IntegerWrapper
				.isGreaterOrEqual(name_set.size(), 2);

		if (idIfCond_1094) {

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

		java.lang.Boolean idIfCond_1095 = false;
		idIfCond_1095 = kermeta.standard.helper.IntegerWrapper
				.isGreaterOrEqual(name_set.size(), 2);

		if (idIfCond_1095) {

			java.lang.String class_label = name_set
					.elementAt(kermeta.standard.helper.IntegerWrapper.minus(
							name_set.size(), 1));

			java.lang.Boolean idIfCond_1096 = false;
			idIfCond_1096 = kermeta.standard.helper.StringWrapper.equals(
					class_label, "Class");

			if (idIfCond_1096) {

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
