/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.5 2008-10-09 08:50:25 cfaucher Exp $
 */
package kermeta.compiler.impl;

import kermeta.compiler.CompilerPackage;
import kermeta.compiler.Main;

import kermeta.language.structure.TypeDefinition;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.OrderedSet;

import km2ecore.CompilingMode;
import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.compiler.impl.MainImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends ObjectImpl implements Main {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected KM2EcoreContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KM2EcoreContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (KM2EcoreContext) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CompilerPackage.MAIN__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KM2EcoreContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(KM2EcoreContext newContext) {
		KM2EcoreContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CompilerPackage.MAIN__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_km2ecore_onlyEcore(String modelInput) {

		this.main_mode(modelInput, "", kermeta.standard.helper.StringWrapper
				.replaceExtension(modelInput, "ecore"), km2ecore.CompilingMode
				.getByName("onlyEcore"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_km2ecore_behaviorJava(String modelInput) {

		this.main_mode(modelInput, "", kermeta.standard.helper.StringWrapper
				.replaceExtension(modelInput, "ecore"), km2ecore.CompilingMode
				.getByName("behaviorJava"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_mode3(String modelInput, String traceInput, String output,
			CompilingMode mode) {

		kermeta.standard.OrderedSet<java.lang.String> operations = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.standard.OrderedSet<java.lang.String>"));

		operations.add("addAllTestCasesFrom");

		this.main_compilingOnlyOperations(modelInput, traceInput, output, mode,
				operations);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_mode2(String modelInput, String traceInput, String output,
			CompilingMode mode) {

		this
				.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.KM2EcoreContext")));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Integer")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Boolean")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Real")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Character")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::String")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Numeric")));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_inner() {

		java.lang.String modelInput = null;

		java.lang.String output = null;

		java.lang.String traceInput = "";

		modelInput = "platform:/resource/org.kermeta.compiler.kmt/models/compilertest.km";

		output = kermeta.standard.helper.StringWrapper.replaceExtension(
				modelInput, "ecore");

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
				.getByName("behaviorJava"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_compilingOnlyOperations(String modelInput,
			String traceInput, String output, CompilingMode mode,
			OrderedSet<String> operations) {

		this
				.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.KM2EcoreContext")));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								"Input model: ", modelInput), "\n"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft1 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_1 = false;
			while (!idLoopCond_1) {
				idLoopCond_1 = it_ft1.isOff();
				if (idLoopCond_1) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp1 = it_ft1
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft2 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									p_lbdExp1,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft2.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_2 = false;
						while (!idLoopCond_2) {
							idLoopCond_2 = it_ft3.isOff();
							if (idLoopCond_2) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp3 = it_ft3
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp2 = o_lbdExp3;

								java.lang.Boolean idIfCond_3 = false;
								idIfCond_3 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp2,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_3) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft4 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp2,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft5 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft4.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_4 = false;
										while (!idLoopCond_4) {
											idLoopCond_4 = it_ft5.isOff();
											if (idLoopCond_4) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp5 = it_ft5
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp4 = o_lbdExp5;

												java.lang.Boolean idIfCond_5 = false;
												idIfCond_5 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp4,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_5) {

													java.lang.Boolean idIfCond_6 = false;
													idIfCond_6 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_6) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp4,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp4
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_7 = false;
													idIfCond_7 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp4,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_7) {

														java.lang.Boolean idIfCond_8 = false;
														idIfCond_8 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp4,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp4,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_8) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp4,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp4,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft4
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_9 = false;
										while (!idLoopCond_9) {
											idLoopCond_9 = it_ft6.isOff();
											if (idLoopCond_9) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp6 = it_ft6
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp4 = o_lbdExp6;

												java.lang.Boolean idIfCond_10 = false;
												idIfCond_10 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp4,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_10) {

													java.lang.Boolean idIfCond_11 = false;
													idIfCond_11 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_11) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp4,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp4
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_12 = false;
													idIfCond_12 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp4,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_12) {

														java.lang.Boolean idIfCond_13 = false;
														idIfCond_13 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp4,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp4,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_13) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp4,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp4,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft7 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft4
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_14 = false;
										while (!idLoopCond_14) {
											idLoopCond_14 = it_ft7.isOff();
											if (idLoopCond_14) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp7 = it_ft7
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp4 = o_lbdExp7;

												java.lang.Boolean idIfCond_15 = false;
												idIfCond_15 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp4,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_15) {

													java.lang.Boolean idIfCond_16 = false;
													idIfCond_16 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_16) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp4,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp4
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_17 = false;
													idIfCond_17 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp4,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_17) {

														java.lang.Boolean idIfCond_18 = false;
														idIfCond_18 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp4,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp4,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_18) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp4,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp4,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft8 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft4.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_19 = false;
										while (!idLoopCond_19) {
											idLoopCond_19 = it_ft8.isOff();
											if (idLoopCond_19) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp8 = it_ft8
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp4 = i_lbdExp8;

												java.lang.Boolean idIfCond_20 = false;
												idIfCond_20 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp4,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_20) {

													java.lang.Boolean idIfCond_21 = false;
													idIfCond_21 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_21) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp4,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp4
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_22 = false;
													idIfCond_22 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp4,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_22) {

														java.lang.Boolean idIfCond_23 = false;
														idIfCond_23 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp4,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp4,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_23) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp4,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp4,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft9 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft4
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_24 = false;
										while (!idLoopCond_24) {
											idLoopCond_24 = it_ft9.isOff();
											if (idLoopCond_24) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp9 = it_ft9
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp4 = t_lbdExp9;

												java.lang.Boolean idIfCond_25 = false;
												idIfCond_25 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp4,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_25) {

													java.lang.Boolean idIfCond_26 = false;
													idIfCond_26 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp4,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_26) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp4,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp4
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_27 = false;
													idIfCond_27 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp4,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_27) {

														java.lang.Boolean idIfCond_28 = false;
														idIfCond_28 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp4,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp4,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_28) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp4,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp4,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//EIft:eachOwnedElement

								}

								//EIle:func

								//EIle:func

							}
						}
					}

					//EIft:each

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft10 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft2.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_29 = false;
						while (!idLoopCond_29) {
							idLoopCond_29 = it_ft10.isOff();
							if (idLoopCond_29) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp10 = it_ft10
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp2 = o_lbdExp10;

								java.lang.Boolean idIfCond_30 = false;
								idIfCond_30 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp2,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_30) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft11 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp2,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft11.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_31 = false;
										while (!idLoopCond_31) {
											idLoopCond_31 = it_ft12.isOff();
											if (idLoopCond_31) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp12 = it_ft12
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp11 = o_lbdExp12;

												java.lang.Boolean idIfCond_32 = false;
												idIfCond_32 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp11,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_32) {

													java.lang.Boolean idIfCond_33 = false;
													idIfCond_33 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_33) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp11,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp11
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_34 = false;
													idIfCond_34 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp11,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_34) {

														java.lang.Boolean idIfCond_35 = false;
														idIfCond_35 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp11,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp11,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_35) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp11,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp11,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft11
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_36 = false;
										while (!idLoopCond_36) {
											idLoopCond_36 = it_ft13.isOff();
											if (idLoopCond_36) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp13 = it_ft13
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp11 = o_lbdExp13;

												java.lang.Boolean idIfCond_37 = false;
												idIfCond_37 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp11,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_37) {

													java.lang.Boolean idIfCond_38 = false;
													idIfCond_38 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_38) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp11,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp11
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_39 = false;
													idIfCond_39 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp11,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_39) {

														java.lang.Boolean idIfCond_40 = false;
														idIfCond_40 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp11,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp11,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_40) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp11,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp11,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft14 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft11
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_41 = false;
										while (!idLoopCond_41) {
											idLoopCond_41 = it_ft14.isOff();
											if (idLoopCond_41) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp14 = it_ft14
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp11 = o_lbdExp14;

												java.lang.Boolean idIfCond_42 = false;
												idIfCond_42 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp11,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_42) {

													java.lang.Boolean idIfCond_43 = false;
													idIfCond_43 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_43) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp11,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp11
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_44 = false;
													idIfCond_44 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp11,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_44) {

														java.lang.Boolean idIfCond_45 = false;
														idIfCond_45 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp11,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp11,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_45) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp11,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp11,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft11.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_46 = false;
										while (!idLoopCond_46) {
											idLoopCond_46 = it_ft15.isOff();
											if (idLoopCond_46) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp15 = it_ft15
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp11 = i_lbdExp15;

												java.lang.Boolean idIfCond_47 = false;
												idIfCond_47 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp11,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_47) {

													java.lang.Boolean idIfCond_48 = false;
													idIfCond_48 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_48) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp11,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp11
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_49 = false;
													idIfCond_49 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp11,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_49) {

														java.lang.Boolean idIfCond_50 = false;
														idIfCond_50 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp11,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp11,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_50) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp11,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp11,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft11
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_51 = false;
										while (!idLoopCond_51) {
											idLoopCond_51 = it_ft16.isOff();
											if (idLoopCond_51) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp16 = it_ft16
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp11 = t_lbdExp16;

												java.lang.Boolean idIfCond_52 = false;
												idIfCond_52 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp11,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_52) {

													java.lang.Boolean idIfCond_53 = false;
													idIfCond_53 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp11,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_53) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp11,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp11
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_54 = false;
													idIfCond_54 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp11,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_54) {

														java.lang.Boolean idIfCond_55 = false;
														idIfCond_55 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp11,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp11,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_55) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp11,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp11,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//EIft:eachOwnedElement

								}

								//EIle:func

								//EIle:func

							}
						}
					}

					//EIft:each

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft2.getNestedPackage()).iterator();
						java.lang.Boolean idLoopCond_56 = false;
						while (!idLoopCond_56) {
							idLoopCond_56 = it_ft17.isOff();
							if (idLoopCond_56) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp17 = it_ft17
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp2 = p_lbdExp17;

								java.lang.Boolean idIfCond_57 = false;
								idIfCond_57 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp2,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_57) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft18 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp2,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft18.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_58 = false;
										while (!idLoopCond_58) {
											idLoopCond_58 = it_ft19.isOff();
											if (idLoopCond_58) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp19 = it_ft19
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp18 = o_lbdExp19;

												java.lang.Boolean idIfCond_59 = false;
												idIfCond_59 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp18,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_59) {

													java.lang.Boolean idIfCond_60 = false;
													idIfCond_60 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_60) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp18,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp18
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_61 = false;
													idIfCond_61 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp18,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_61) {

														java.lang.Boolean idIfCond_62 = false;
														idIfCond_62 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp18,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp18,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_62) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp18,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp18,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft18
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_63 = false;
										while (!idLoopCond_63) {
											idLoopCond_63 = it_ft20.isOff();
											if (idLoopCond_63) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp20 = it_ft20
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp18 = o_lbdExp20;

												java.lang.Boolean idIfCond_64 = false;
												idIfCond_64 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp18,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_64) {

													java.lang.Boolean idIfCond_65 = false;
													idIfCond_65 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_65) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp18,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp18
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_66 = false;
													idIfCond_66 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp18,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_66) {

														java.lang.Boolean idIfCond_67 = false;
														idIfCond_67 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp18,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp18,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_67) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp18,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp18,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft18
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_68 = false;
										while (!idLoopCond_68) {
											idLoopCond_68 = it_ft21.isOff();
											if (idLoopCond_68) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp21 = it_ft21
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp18 = o_lbdExp21;

												java.lang.Boolean idIfCond_69 = false;
												idIfCond_69 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp18,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_69) {

													java.lang.Boolean idIfCond_70 = false;
													idIfCond_70 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_70) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp18,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp18
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_71 = false;
													idIfCond_71 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp18,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_71) {

														java.lang.Boolean idIfCond_72 = false;
														idIfCond_72 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp18,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp18,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_72) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp18,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp18,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft18.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_73 = false;
										while (!idLoopCond_73) {
											idLoopCond_73 = it_ft22.isOff();
											if (idLoopCond_73) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp22 = it_ft22
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp18 = i_lbdExp22;

												java.lang.Boolean idIfCond_74 = false;
												idIfCond_74 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp18,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_74) {

													java.lang.Boolean idIfCond_75 = false;
													idIfCond_75 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_75) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp18,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp18
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_76 = false;
													idIfCond_76 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp18,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_76) {

														java.lang.Boolean idIfCond_77 = false;
														idIfCond_77 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp18,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp18,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_77) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp18,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp18,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft18
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_78 = false;
										while (!idLoopCond_78) {
											idLoopCond_78 = it_ft23.isOff();
											if (idLoopCond_78) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp23 = it_ft23
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp18 = t_lbdExp23;

												java.lang.Boolean idIfCond_79 = false;
												idIfCond_79 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp18,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_79) {

													java.lang.Boolean idIfCond_80 = false;
													idIfCond_80 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp18,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_80) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp18,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp18
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_81 = false;
													idIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp18,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_81) {

														java.lang.Boolean idIfCond_82 = false;
														idIfCond_82 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp18,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp18,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_82) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp18,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp18,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
																	.writeln(javaSourceCode);
														}

													}

												}

												//EIle:func

												//EIle:func

											}
										}
									}

									//EIft:each

									//EIft:eachOwnedElement

								}

								//EIle:func

								//EIle:func

							}
						}
					}

					//EIft:each

					//EIft:eachOwnedElement

					//EIle:func

				}
			}
		}

		//EIft:each

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln("\nFinish");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String typeDefinitionToString(TypeDefinition td) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_83 = false;
		idIfCond_83 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoid(td)),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOf(
										td,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition")));

		if (idIfCond_83) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asType(
							td,
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.language.structure.ClassDefinition")));

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(cd.getName(),
							" "), kermeta.standard.helper.BooleanWrapper
							.toString(cd.isValueType()));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDefinitionByQualifiedName(String qn) {

		kermeta.language.structure.TypeDefinition result = null;

		kermeta.language.structure.TypeDefinition td = ((kermeta.language.structure.TypeDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.TypeDefinition"));

		kermeta.language.structure.TypeDefinition td_tmp = this.getContext()
				.getMu().getTypeDefinitionByQualifiedName(qn);

		java.lang.Boolean idIfCond_84 = false;
		idIfCond_84 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(td_tmp));

		if (idIfCond_84) {

			td = td_tmp;
		}

		result = td;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main(String modelInput) {

		this.main_mode(modelInput, "", kermeta.standard.helper.StringWrapper
				.replaceExtension(modelInput, "ecore"), km2ecore.CompilingMode
				.getByName("behaviorJava"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_mode(String modelInput, String traceInput, String output,
			CompilingMode mode) {

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(kermeta.standard.helper.StringWrapper
						.plus(
								"KermetaCompiler - Starting up of the Ecore generation for the model: ",
								modelInput));

		this
				.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.KM2EcoreContext")));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		this.getContext().getMu().applyPass1(this.getContext());

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln("KermetaCompiler - Pass 1 is finished");

		java.lang.Boolean idIfCond_85 = false;
		idIfCond_85 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("onlyEcore"));

		if (idIfCond_85) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_86 = false;
		idIfCond_86 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("behaviorKmt"));

		if (idIfCond_86) {

			this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
		}

		java.lang.Boolean idIfCond_87 = false;
		idIfCond_87 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("behaviorJava"));

		if (idIfCond_87) {

			this.getContext().getMu().preprocess(this.getContext());

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln(kermeta.standard.helper.StringWrapper.plus(
							"KermetaCompiler - Pass 2 with the mode: ", this
									.getContext().getMode().getName()));

			this.getContext().getMu().applyPass2BehaviorJava(this.getContext());

			this.getContext().getMu().postprocess(this.getContext());
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln("KermetaCompiler - Pass 2 is finished");

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<java.lang.String> convertAsOrderedSet(
						this.getContext().getEcoreOutputs()).add(output);

		kermeta.persistence.Resource ecore_resource = this.getContext()
				.getOutputRepository().createResource(output,
						"http://www.eclipse.org/emf/2002/Ecore");

		ecore_resource.instances().add(
				this.getContext().getMu().getEcoreModelElement());

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							this.getContext().getMu().getEntryPoints())
					.iterator();
			java.lang.Boolean idLoopCond_88 = false;
			while (!idLoopCond_88) {
				idLoopCond_88 = it_ft24.isOff();
				if (idLoopCond_88) {
				} else {

					//BIle:func
					ecore.EAnnotation e_lbdExp24 = it_ft24.next();

					ecore_resource.instances().add(e_lbdExp24);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_89 = false;
			while (!idLoopCond_89) {
				idLoopCond_89 = it_ft25.isOff();
				if (idLoopCond_89) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp25 = it_ft25.next();

					ecore_resource.instances().add(p_lbdExp25);
					//EIle:func

				}
			}
		}

		//EIft:each

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln("Save the Ecore Model");

		ecore_resource.save();

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln("The Ecore Model has been saved");

		this.getContext().save();

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
				.writeln(kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"Stats:\n\tconditional + loop: ",
										kermeta.standard.helper.IntegerWrapper
												.toString(this.getContext()
														.getInc_condStack())),
								"\n\tfunction type: "),
						kermeta.standard.helper.IntegerWrapper.toString(this
								.getContext().getInc_ftSuffix())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln("Finish");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CompilerPackage.MAIN__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
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
		case CompilerPackage.MAIN__CONTEXT:
			setContext((KM2EcoreContext) newValue);
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
		case CompilerPackage.MAIN__CONTEXT:
			setContext((KM2EcoreContext) null);
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
		case CompilerPackage.MAIN__CONTEXT:
			return context != null;
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
