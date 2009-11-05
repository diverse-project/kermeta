/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
	public void saveSingleEcore(String output) {

		kermeta.persistence.Resource ecore_resource = this.getContext()
				.getOutputRepository().createResource(output,
						"http://www.eclipse.org/emf/2002/Ecore");

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft236 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_1035 = false;
			while (!idLoopCond_1035) {
				idLoopCond_1035 = it_ft236.isOff();
				if (idLoopCond_1035) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp236 = it_ft236.next();

					ecore_resource.instances().add(p_lbdExp236);
					//EIle:func

				}
			}
		}

		//EIft:each

		ecore_resource.save();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_km2ecore_onlyEcore(String modelInput) {

		this.main_mode(modelInput, "", kermeta.standard.helper.StringWrapper
				.replaceExtension(modelInput, "ecore"), km2ecore.CompilingMode
				.getByName("onlyEcore"), false);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_km2ecore_behaviorJava(String modelInput) {

		this.main_mode(modelInput, "", kermeta.standard.helper.StringWrapper
				.replaceExtension(modelInput, "ecore"), km2ecore.CompilingMode
				.getByName("behaviorJava"), false);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveSplitEcore(String output) {

		kermeta.standard.Bag<kermeta.persistence.Resource> resourceBag = ((kermeta.standard.Bag<kermeta.persistence.Resource>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft237 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_1036 = false;
			while (!idLoopCond_1036) {
				idLoopCond_1036 = it_ft237.isOff();
				if (idLoopCond_1036) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp237 = it_ft237.next();

					java.lang.String output_final = output;

					java.lang.Boolean idIfCond_1037 = false;
					idIfCond_1037 = kermeta.standard.helper.IntegerWrapper
							.isGreater(resourceBag.size(), 0);

					if (idIfCond_1037) {

						output_final = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(output,
																		"__"),
														p_lbdExp237.getName()),
										".ecore");
					}

					kermeta.persistence.Resource ecore_resource = this
							.getContext().getOutputRepository().createResource(
									output_final,
									"http://www.eclipse.org/emf/2002/Ecore");

					ecore_resource.instances().add(p_lbdExp237);

					resourceBag.add(ecore_resource);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft238 = resourceBag
					.iterator();
			java.lang.Boolean idLoopCond_1038 = false;
			while (!idLoopCond_1038) {
				idLoopCond_1038 = it_ft238.isOff();
				if (idLoopCond_1038) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res__lbdExp238 = it_ft238
							.next();

					res__lbdExp238.save();
					//EIle:func

				}
			}
		}

		//EIft:each

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_mode3(String modelInput, String traceInput, String output,
			CompilingMode mode, Boolean splitEcore) {

		kermeta.standard.OrderedSet<java.lang.String> operations = ((kermeta.standard.OrderedSet<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.standard.StandardPackage.eINSTANCE
						.getOrderedSet()));

		this.main_compilingOnlyOperations(modelInput, traceInput, output, mode,
				operations);

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

		modelInput = "platform:/resource/org.kermeta.compiler.kmt/models/StructureCompiler.km";

		modelInput = "platform:/resource/org.kermeta.compiler.kmt/src/kermeta/StructureCompiler.km";

		output = kermeta.standard.helper.StringWrapper.replaceExtension(
				modelInput, "ecore");

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
				.getByName("behaviorJava"), false);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_km2ecore_4trek_tests(String modelInput, String traceInput,
			String output) {

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
				.getByName("behaviorJava"), false);

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
						.newObject(km2ecore.Km2ecorePackage.eINSTANCE
								.getKM2EcoreContext())));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								"Input model: ", modelInput), "\n"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft239 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_1039 = false;
			while (!idLoopCond_1039) {
				idLoopCond_1039 = it_ft239.isOff();
				if (idLoopCond_1039) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp239 = it_ft239
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft240 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									p_lbdExp239,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft240.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_1040 = false;
						while (!idLoopCond_1040) {
							idLoopCond_1040 = it_ft241.isOff();
							if (idLoopCond_1040) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp241 = it_ft241
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp240 = o_lbdExp241;

								java.lang.Boolean idIfCond_1041 = false;
								idIfCond_1041 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp240,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1041) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft242 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp240,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft243 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft242.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1042 = false;
										while (!idLoopCond_1042) {
											idLoopCond_1042 = it_ft243.isOff();
											if (idLoopCond_1042) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp243 = it_ft243
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp242 = o_lbdExp243;

												java.lang.Boolean idIfCond_1043 = false;
												idIfCond_1043 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp242,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1043) {

													java.lang.Boolean idIfCond_1044 = false;
													idIfCond_1044 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1044) {

														java.lang.Boolean idIfCond_1045 = false;
														idIfCond_1045 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp242,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1045) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp242
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1046 = false;
													idIfCond_1046 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp242,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1046) {

														java.lang.Boolean idIfCond_1047 = false;
														idIfCond_1047 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp242,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp242,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1047) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp242,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft242
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1048 = false;
										while (!idLoopCond_1048) {
											idLoopCond_1048 = it_ft244.isOff();
											if (idLoopCond_1048) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp244 = it_ft244
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp242 = o_lbdExp244;

												java.lang.Boolean idIfCond_1049 = false;
												idIfCond_1049 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp242,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1049) {

													java.lang.Boolean idIfCond_1050 = false;
													idIfCond_1050 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1050) {

														java.lang.Boolean idIfCond_1051 = false;
														idIfCond_1051 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp242,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1051) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp242
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1052 = false;
													idIfCond_1052 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp242,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1052) {

														java.lang.Boolean idIfCond_1053 = false;
														idIfCond_1053 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp242,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp242,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1053) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp242,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft242
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1054 = false;
										while (!idLoopCond_1054) {
											idLoopCond_1054 = it_ft245.isOff();
											if (idLoopCond_1054) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp245 = it_ft245
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp242 = o_lbdExp245;

												java.lang.Boolean idIfCond_1055 = false;
												idIfCond_1055 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp242,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1055) {

													java.lang.Boolean idIfCond_1056 = false;
													idIfCond_1056 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1056) {

														java.lang.Boolean idIfCond_1057 = false;
														idIfCond_1057 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp242,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1057) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp242
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1058 = false;
													idIfCond_1058 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp242,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1058) {

														java.lang.Boolean idIfCond_1059 = false;
														idIfCond_1059 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp242,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp242,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1059) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp242,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft242.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1060 = false;
										while (!idLoopCond_1060) {
											idLoopCond_1060 = it_ft246.isOff();
											if (idLoopCond_1060) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp246 = it_ft246
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp242 = i_lbdExp246;

												java.lang.Boolean idIfCond_1061 = false;
												idIfCond_1061 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp242,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1061) {

													java.lang.Boolean idIfCond_1062 = false;
													idIfCond_1062 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1062) {

														java.lang.Boolean idIfCond_1063 = false;
														idIfCond_1063 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp242,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1063) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp242
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1064 = false;
													idIfCond_1064 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp242,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1064) {

														java.lang.Boolean idIfCond_1065 = false;
														idIfCond_1065 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp242,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp242,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1065) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp242,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft242
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1066 = false;
										while (!idLoopCond_1066) {
											idLoopCond_1066 = it_ft247.isOff();
											if (idLoopCond_1066) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp247 = it_ft247
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp242 = t_lbdExp247;

												java.lang.Boolean idIfCond_1067 = false;
												idIfCond_1067 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp242,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1067) {

													java.lang.Boolean idIfCond_1068 = false;
													idIfCond_1068 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp242,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1068) {

														java.lang.Boolean idIfCond_1069 = false;
														idIfCond_1069 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp242,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1069) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp242
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1070 = false;
													idIfCond_1070 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp242,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1070) {

														java.lang.Boolean idIfCond_1071 = false;
														idIfCond_1071 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp242,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp242,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1071) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp242,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp242,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft248 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft240.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_1072 = false;
						while (!idLoopCond_1072) {
							idLoopCond_1072 = it_ft248.isOff();
							if (idLoopCond_1072) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp248 = it_ft248
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp240 = o_lbdExp248;

								java.lang.Boolean idIfCond_1073 = false;
								idIfCond_1073 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp240,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1073) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft249 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp240,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft249.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1074 = false;
										while (!idLoopCond_1074) {
											idLoopCond_1074 = it_ft250.isOff();
											if (idLoopCond_1074) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp250 = it_ft250
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp249 = o_lbdExp250;

												java.lang.Boolean idIfCond_1075 = false;
												idIfCond_1075 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp249,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1075) {

													java.lang.Boolean idIfCond_1076 = false;
													idIfCond_1076 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1076) {

														java.lang.Boolean idIfCond_1077 = false;
														idIfCond_1077 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp249,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1077) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp249
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1078 = false;
													idIfCond_1078 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp249,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1078) {

														java.lang.Boolean idIfCond_1079 = false;
														idIfCond_1079 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp249,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp249,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1079) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp249,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft249
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1080 = false;
										while (!idLoopCond_1080) {
											idLoopCond_1080 = it_ft251.isOff();
											if (idLoopCond_1080) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp251 = it_ft251
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp249 = o_lbdExp251;

												java.lang.Boolean idIfCond_1081 = false;
												idIfCond_1081 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp249,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1081) {

													java.lang.Boolean idIfCond_1082 = false;
													idIfCond_1082 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1082) {

														java.lang.Boolean idIfCond_1083 = false;
														idIfCond_1083 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp249,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1083) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp249
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1084 = false;
													idIfCond_1084 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp249,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1084) {

														java.lang.Boolean idIfCond_1085 = false;
														idIfCond_1085 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp249,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp249,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1085) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp249,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft249
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1086 = false;
										while (!idLoopCond_1086) {
											idLoopCond_1086 = it_ft252.isOff();
											if (idLoopCond_1086) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp252 = it_ft252
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp249 = o_lbdExp252;

												java.lang.Boolean idIfCond_1087 = false;
												idIfCond_1087 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp249,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1087) {

													java.lang.Boolean idIfCond_1088 = false;
													idIfCond_1088 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1088) {

														java.lang.Boolean idIfCond_1089 = false;
														idIfCond_1089 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp249,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1089) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp249
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1090 = false;
													idIfCond_1090 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp249,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1090) {

														java.lang.Boolean idIfCond_1091 = false;
														idIfCond_1091 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp249,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp249,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1091) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp249,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft249.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1092 = false;
										while (!idLoopCond_1092) {
											idLoopCond_1092 = it_ft253.isOff();
											if (idLoopCond_1092) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp253 = it_ft253
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp249 = i_lbdExp253;

												java.lang.Boolean idIfCond_1093 = false;
												idIfCond_1093 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp249,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1093) {

													java.lang.Boolean idIfCond_1094 = false;
													idIfCond_1094 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1094) {

														java.lang.Boolean idIfCond_1095 = false;
														idIfCond_1095 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp249,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1095) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp249
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1096 = false;
													idIfCond_1096 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp249,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1096) {

														java.lang.Boolean idIfCond_1097 = false;
														idIfCond_1097 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp249,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp249,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1097) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp249,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft254 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft249
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1098 = false;
										while (!idLoopCond_1098) {
											idLoopCond_1098 = it_ft254.isOff();
											if (idLoopCond_1098) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp254 = it_ft254
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp249 = t_lbdExp254;

												java.lang.Boolean idIfCond_1099 = false;
												idIfCond_1099 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp249,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1099) {

													java.lang.Boolean idIfCond_1100 = false;
													idIfCond_1100 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp249,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1100) {

														java.lang.Boolean idIfCond_1101 = false;
														idIfCond_1101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp249,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1101) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp249
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1102 = false;
													idIfCond_1102 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp249,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1102) {

														java.lang.Boolean idIfCond_1103 = false;
														idIfCond_1103 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp249,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp249,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1103) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp249,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp249,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft255 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft240.getNestedPackage())
								.iterator();
						java.lang.Boolean idLoopCond_1104 = false;
						while (!idLoopCond_1104) {
							idLoopCond_1104 = it_ft255.isOff();
							if (idLoopCond_1104) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp255 = it_ft255
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp240 = p_lbdExp255;

								java.lang.Boolean idIfCond_1105 = false;
								idIfCond_1105 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp240,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1105) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft256 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp240,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft257 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft256.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1106 = false;
										while (!idLoopCond_1106) {
											idLoopCond_1106 = it_ft257.isOff();
											if (idLoopCond_1106) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp257 = it_ft257
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp256 = o_lbdExp257;

												java.lang.Boolean idIfCond_1107 = false;
												idIfCond_1107 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp256,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1107) {

													java.lang.Boolean idIfCond_1108 = false;
													idIfCond_1108 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1108) {

														java.lang.Boolean idIfCond_1109 = false;
														idIfCond_1109 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp256,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1109) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp256
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1110 = false;
													idIfCond_1110 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp256,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1110) {

														java.lang.Boolean idIfCond_1111 = false;
														idIfCond_1111 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp256,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp256,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1111) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp256,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft258 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft256
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1112 = false;
										while (!idLoopCond_1112) {
											idLoopCond_1112 = it_ft258.isOff();
											if (idLoopCond_1112) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp258 = it_ft258
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp256 = o_lbdExp258;

												java.lang.Boolean idIfCond_1113 = false;
												idIfCond_1113 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp256,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1113) {

													java.lang.Boolean idIfCond_1114 = false;
													idIfCond_1114 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1114) {

														java.lang.Boolean idIfCond_1115 = false;
														idIfCond_1115 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp256,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1115) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp256
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1116 = false;
													idIfCond_1116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp256,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1116) {

														java.lang.Boolean idIfCond_1117 = false;
														idIfCond_1117 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp256,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp256,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1117) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp256,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft259 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft256
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1118 = false;
										while (!idLoopCond_1118) {
											idLoopCond_1118 = it_ft259.isOff();
											if (idLoopCond_1118) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp259 = it_ft259
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp256 = o_lbdExp259;

												java.lang.Boolean idIfCond_1119 = false;
												idIfCond_1119 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp256,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1119) {

													java.lang.Boolean idIfCond_1120 = false;
													idIfCond_1120 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1120) {

														java.lang.Boolean idIfCond_1121 = false;
														idIfCond_1121 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp256,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1121) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp256
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1122 = false;
													idIfCond_1122 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp256,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1122) {

														java.lang.Boolean idIfCond_1123 = false;
														idIfCond_1123 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp256,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp256,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1123) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp256,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft260 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft256.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1124 = false;
										while (!idLoopCond_1124) {
											idLoopCond_1124 = it_ft260.isOff();
											if (idLoopCond_1124) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp260 = it_ft260
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp256 = i_lbdExp260;

												java.lang.Boolean idIfCond_1125 = false;
												idIfCond_1125 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp256,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1125) {

													java.lang.Boolean idIfCond_1126 = false;
													idIfCond_1126 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1126) {

														java.lang.Boolean idIfCond_1127 = false;
														idIfCond_1127 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp256,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1127) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp256
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1128 = false;
													idIfCond_1128 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp256,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1128) {

														java.lang.Boolean idIfCond_1129 = false;
														idIfCond_1129 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp256,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp256,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1129) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp256,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft261 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft256
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1130 = false;
										while (!idLoopCond_1130) {
											idLoopCond_1130 = it_ft261.isOff();
											if (idLoopCond_1130) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp261 = it_ft261
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp256 = t_lbdExp261;

												java.lang.Boolean idIfCond_1131 = false;
												idIfCond_1131 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp256,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1131) {

													java.lang.Boolean idIfCond_1132 = false;
													idIfCond_1132 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp256,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1132) {

														java.lang.Boolean idIfCond_1133 = false;
														idIfCond_1133 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isVoidSwitcher(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																		.asTypeSwitcher(
																				op_lbdExp256,
																				org.kermeta.compil.runtime.ExecutionContext
																						.getInstance()
																						.getMetaClass(
																								"kermeta.language.structure.Operation")))
																		.getSuperOperation());

														if (idIfCond_1133) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = op_lbdExp256
																	.createBehaviorJava(this
																			.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
														} else {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Operation")))
																													.qualifiedName()),
																							" is an inherited method => compilation is not available by using this launcher ! ================="));
														}

													}

												} else {

													java.lang.Boolean idIfCond_1134 = false;
													idIfCond_1134 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp256,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1134) {

														java.lang.Boolean idIfCond_1135 = false;
														idIfCond_1135 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp256,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp256,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1135) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			kermeta.standard.helper.StringWrapper
																					.plus(
																							kermeta.standard.helper.StringWrapper
																									.plus(
																											"================= ",
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp256,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp256,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.getInstance()
																	.writeln(
																			javaSourceCode);
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

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"\nFinish");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String typeDefinitionToString(TypeDefinition td) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1136 = false;
		idIfCond_1136 = kermeta.standard.helper.BooleanWrapper
				.and(
						kermeta.standard.helper.BooleanWrapper
								.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isVoidSwitcher(td)),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.isInstanceOfSwitcher(
										td,
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition")));

		if (idIfCond_1136) {

			kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.asTypeSwitcher(
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
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getTypeDefinition()));

		kermeta.language.structure.TypeDefinition td_tmp = this.getContext()
				.getMu().getTypeDefinitionByQualifiedName(qn);

		java.lang.Boolean idIfCond_1137 = false;
		idIfCond_1137 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(td_tmp));

		if (idIfCond_1137) {

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
				.getByName("behaviorJava"), false);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_mode(String modelInput, String traceInput, String output,
			CompilingMode mode, Boolean splitEcore) {

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						kermeta.standard.helper.StringWrapper
								.plus(
										"KermetaCompiler - Starting up of the Ecore generation for the model: ",
										modelInput));

		this
				.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(km2ecore.Km2ecorePackage.eINSTANCE
								.getKM2EcoreContext())));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		this.getContext().getMu().applyPass1(this.getContext());

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"KermetaCompiler - Pass 1 is finished");

		java.lang.Boolean idIfCond_1138 = false;
		idIfCond_1138 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("onlyEcore"));

		if (idIfCond_1138) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_1139 = false;
		idIfCond_1139 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorKmt"));

		if (idIfCond_1139) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getNotImplementedException())));

		}

		java.lang.Boolean idIfCond_1140 = false;
		idIfCond_1140 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorJava"));

		if (idIfCond_1140) {

			this.getContext().getMu().preprocess(this.getContext());

			org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance()
					.writeln(
							kermeta.standard.helper.StringWrapper.plus(
									"KermetaCompiler - Pass 2 with the mode: ",
									this.getContext().getMode().getName()));

			this.getContext().getMu().applyPass2BehaviorJava(this.getContext());

			this.getContext().getMu().postprocess(this.getContext());
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"KermetaCompiler - Pass 2 is finished");

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"Save the Ecore Model");

		java.lang.Boolean idIfCond_1141 = false;
		idIfCond_1141 = splitEcore;

		if (idIfCond_1141) {

			this.saveSplitEcore(output);
		} else {

			this.saveSingleEcore(output);
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"The Ecore Model has been saved");

		this.getContext().getSimkModel().save(this.getContext());

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"Stats:\n\tconditional + loop: ",
										kermeta.standard.helper.IntegerWrapper
												.toString(this.getContext()
														.getInc_condStack())),
								"\n\tfunction type: "),
						kermeta.standard.helper.IntegerWrapper.toString(this
								.getContext().getInc_ftSuffix())));

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"Finish");

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
