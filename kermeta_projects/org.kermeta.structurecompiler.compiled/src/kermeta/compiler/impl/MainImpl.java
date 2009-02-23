/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: MainImpl.java,v 1.14 2009-02-23 15:27:04 cfaucher Exp $
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
				.getByName("onlyEcore"), false);

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

			kermeta.standard.Iterator<ecore.EPackage> it_ft228 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_1037 = false;
			while (!idLoopCond_1037) {
				idLoopCond_1037 = it_ft228.isOff();
				if (idLoopCond_1037) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp228 = it_ft228.next();

					ecore_resource.instances().add(p_lbdExp228);
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

			kermeta.standard.Iterator<ecore.EPackage> it_ft229 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_1038 = false;
			while (!idLoopCond_1038) {
				idLoopCond_1038 = it_ft229.isOff();
				if (idLoopCond_1038) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp229 = it_ft229.next();

					java.lang.String output_final = output;

					java.lang.Boolean idIfCond_1039 = false;
					idIfCond_1039 = kermeta.standard.helper.IntegerWrapper
							.isGreater(resourceBag.size(), 0);

					if (idIfCond_1039) {

						output_final = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(output,
																		"__"),
														p_lbdExp229.getName()),
										".ecore");
					}

					kermeta.persistence.Resource ecore_resource = this
							.getContext().getOutputRepository().createResource(
									output_final,
									"http://www.eclipse.org/emf/2002/Ecore");

					ecore_resource.instances().add(p_lbdExp229);

					resourceBag.add(ecore_resource);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft230 = resourceBag
					.iterator();
			java.lang.Boolean idLoopCond_1040 = false;
			while (!idLoopCond_1040) {
				idLoopCond_1040 = it_ft230.isOff();
				if (idLoopCond_1040) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res__lbdExp230 = it_ft230
							.next();

					res__lbdExp230.save();
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

		operations.add("createResource");

		operations.add("main");

		this.main_compilingOnlyOperations(modelInput, traceInput, output, mode,
				operations);

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft231 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_1041 = false;
			while (!idLoopCond_1041) {
				idLoopCond_1041 = it_ft231.isOff();
				if (idLoopCond_1041) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp231 = it_ft231
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft232 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									p_lbdExp231,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft233 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft232.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_1042 = false;
						while (!idLoopCond_1042) {
							idLoopCond_1042 = it_ft233.isOff();
							if (idLoopCond_1042) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp233 = it_ft233
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp232 = o_lbdExp233;

								java.lang.Boolean idIfCond_1043 = false;
								idIfCond_1043 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp232,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1043) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft234 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp232,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft235 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft234.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1044 = false;
										while (!idLoopCond_1044) {
											idLoopCond_1044 = it_ft235.isOff();
											if (idLoopCond_1044) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp235 = it_ft235
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp234 = o_lbdExp235;

												java.lang.Boolean idIfCond_1045 = false;
												idIfCond_1045 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp234,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1045) {

													java.lang.Boolean idIfCond_1046 = false;
													idIfCond_1046 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1046) {

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
																														op_lbdExp234,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp234
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1047 = false;
													idIfCond_1047 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp234,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1047) {

														java.lang.Boolean idIfCond_1048 = false;
														idIfCond_1048 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp234,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp234,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1048) {

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
																															op_lbdExp234,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp234,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft236 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft234
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1049 = false;
										while (!idLoopCond_1049) {
											idLoopCond_1049 = it_ft236.isOff();
											if (idLoopCond_1049) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp236 = it_ft236
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp234 = o_lbdExp236;

												java.lang.Boolean idIfCond_1050 = false;
												idIfCond_1050 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp234,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1050) {

													java.lang.Boolean idIfCond_1051 = false;
													idIfCond_1051 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

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
																														op_lbdExp234,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp234
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1052 = false;
													idIfCond_1052 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp234,
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
																						op_lbdExp234,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp234,
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
																															op_lbdExp234,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp234,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft237 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft234
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1054 = false;
										while (!idLoopCond_1054) {
											idLoopCond_1054 = it_ft237.isOff();
											if (idLoopCond_1054) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp237 = it_ft237
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp234 = o_lbdExp237;

												java.lang.Boolean idIfCond_1055 = false;
												idIfCond_1055 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp234,
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
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1056) {

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
																														op_lbdExp234,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp234
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1057 = false;
													idIfCond_1057 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp234,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1057) {

														java.lang.Boolean idIfCond_1058 = false;
														idIfCond_1058 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp234,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp234,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1058) {

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
																															op_lbdExp234,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp234,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft238 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft234.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1059 = false;
										while (!idLoopCond_1059) {
											idLoopCond_1059 = it_ft238.isOff();
											if (idLoopCond_1059) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp238 = it_ft238
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp234 = i_lbdExp238;

												java.lang.Boolean idIfCond_1060 = false;
												idIfCond_1060 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp234,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1060) {

													java.lang.Boolean idIfCond_1061 = false;
													idIfCond_1061 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1061) {

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
																														op_lbdExp234,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp234
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1062 = false;
													idIfCond_1062 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp234,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1062) {

														java.lang.Boolean idIfCond_1063 = false;
														idIfCond_1063 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp234,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp234,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1063) {

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
																															op_lbdExp234,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp234,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft239 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft234
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1064 = false;
										while (!idLoopCond_1064) {
											idLoopCond_1064 = it_ft239.isOff();
											if (idLoopCond_1064) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp239 = it_ft239
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp234 = t_lbdExp239;

												java.lang.Boolean idIfCond_1065 = false;
												idIfCond_1065 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp234,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1065) {

													java.lang.Boolean idIfCond_1066 = false;
													idIfCond_1066 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp234,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1066) {

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
																														op_lbdExp234,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp234
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1067 = false;
													idIfCond_1067 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp234,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1067) {

														java.lang.Boolean idIfCond_1068 = false;
														idIfCond_1068 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp234,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp234,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1068) {

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
																															op_lbdExp234,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp234,
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

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft240 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft232.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_1069 = false;
						while (!idLoopCond_1069) {
							idLoopCond_1069 = it_ft240.isOff();
							if (idLoopCond_1069) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp240 = it_ft240
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp232 = o_lbdExp240;

								java.lang.Boolean idIfCond_1070 = false;
								idIfCond_1070 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp232,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1070) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft241 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp232,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft241.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1071 = false;
										while (!idLoopCond_1071) {
											idLoopCond_1071 = it_ft242.isOff();
											if (idLoopCond_1071) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp242 = it_ft242
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp241 = o_lbdExp242;

												java.lang.Boolean idIfCond_1072 = false;
												idIfCond_1072 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp241,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1072) {

													java.lang.Boolean idIfCond_1073 = false;
													idIfCond_1073 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1073) {

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
																														op_lbdExp241,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp241
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1074 = false;
													idIfCond_1074 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp241,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1074) {

														java.lang.Boolean idIfCond_1075 = false;
														idIfCond_1075 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp241,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp241,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1075) {

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
																															op_lbdExp241,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp241,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft243 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft241
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1076 = false;
										while (!idLoopCond_1076) {
											idLoopCond_1076 = it_ft243.isOff();
											if (idLoopCond_1076) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp243 = it_ft243
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp241 = o_lbdExp243;

												java.lang.Boolean idIfCond_1077 = false;
												idIfCond_1077 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp241,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1077) {

													java.lang.Boolean idIfCond_1078 = false;
													idIfCond_1078 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1078) {

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
																														op_lbdExp241,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp241
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1079 = false;
													idIfCond_1079 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp241,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1079) {

														java.lang.Boolean idIfCond_1080 = false;
														idIfCond_1080 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp241,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp241,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1080) {

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
																															op_lbdExp241,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp241,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft241
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1081 = false;
										while (!idLoopCond_1081) {
											idLoopCond_1081 = it_ft244.isOff();
											if (idLoopCond_1081) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp244 = it_ft244
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp241 = o_lbdExp244;

												java.lang.Boolean idIfCond_1082 = false;
												idIfCond_1082 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp241,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1082) {

													java.lang.Boolean idIfCond_1083 = false;
													idIfCond_1083 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

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
																														op_lbdExp241,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp241
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1084 = false;
													idIfCond_1084 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp241,
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
																						op_lbdExp241,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp241,
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
																															op_lbdExp241,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp241,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft241.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1086 = false;
										while (!idLoopCond_1086) {
											idLoopCond_1086 = it_ft245.isOff();
											if (idLoopCond_1086) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp245 = it_ft245
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp241 = i_lbdExp245;

												java.lang.Boolean idIfCond_1087 = false;
												idIfCond_1087 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp241,
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
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1088) {

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
																														op_lbdExp241,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp241
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1089 = false;
													idIfCond_1089 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp241,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1089) {

														java.lang.Boolean idIfCond_1090 = false;
														idIfCond_1090 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp241,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp241,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1090) {

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
																															op_lbdExp241,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp241,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft241
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1091 = false;
										while (!idLoopCond_1091) {
											idLoopCond_1091 = it_ft246.isOff();
											if (idLoopCond_1091) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp246 = it_ft246
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp241 = t_lbdExp246;

												java.lang.Boolean idIfCond_1092 = false;
												idIfCond_1092 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp241,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1092) {

													java.lang.Boolean idIfCond_1093 = false;
													idIfCond_1093 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp241,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1093) {

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
																														op_lbdExp241,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp241
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1094 = false;
													idIfCond_1094 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp241,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1094) {

														java.lang.Boolean idIfCond_1095 = false;
														idIfCond_1095 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp241,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp241,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1095) {

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
																															op_lbdExp241,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp241,
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

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft247 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft232.getNestedPackage())
								.iterator();
						java.lang.Boolean idLoopCond_1096 = false;
						while (!idLoopCond_1096) {
							idLoopCond_1096 = it_ft247.isOff();
							if (idLoopCond_1096) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp247 = it_ft247
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp232 = p_lbdExp247;

								java.lang.Boolean idIfCond_1097 = false;
								idIfCond_1097 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp232,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1097) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft248 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp232,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft248.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1098 = false;
										while (!idLoopCond_1098) {
											idLoopCond_1098 = it_ft249.isOff();
											if (idLoopCond_1098) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp249 = it_ft249
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp248 = o_lbdExp249;

												java.lang.Boolean idIfCond_1099 = false;
												idIfCond_1099 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp248,
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
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1100) {

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
																														op_lbdExp248,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp248
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1101 = false;
													idIfCond_1101 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp248,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1101) {

														java.lang.Boolean idIfCond_1102 = false;
														idIfCond_1102 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp248,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp248,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1102) {

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
																															op_lbdExp248,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp248,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft250 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft248
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1103 = false;
										while (!idLoopCond_1103) {
											idLoopCond_1103 = it_ft250.isOff();
											if (idLoopCond_1103) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp250 = it_ft250
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp248 = o_lbdExp250;

												java.lang.Boolean idIfCond_1104 = false;
												idIfCond_1104 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp248,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1104) {

													java.lang.Boolean idIfCond_1105 = false;
													idIfCond_1105 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1105) {

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
																														op_lbdExp248,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp248
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1106 = false;
													idIfCond_1106 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp248,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1106) {

														java.lang.Boolean idIfCond_1107 = false;
														idIfCond_1107 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp248,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp248,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1107) {

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
																															op_lbdExp248,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp248,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft251 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft248
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1108 = false;
										while (!idLoopCond_1108) {
											idLoopCond_1108 = it_ft251.isOff();
											if (idLoopCond_1108) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp251 = it_ft251
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp248 = o_lbdExp251;

												java.lang.Boolean idIfCond_1109 = false;
												idIfCond_1109 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp248,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1109) {

													java.lang.Boolean idIfCond_1110 = false;
													idIfCond_1110 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1110) {

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
																														op_lbdExp248,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp248
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1111 = false;
													idIfCond_1111 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp248,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1111) {

														java.lang.Boolean idIfCond_1112 = false;
														idIfCond_1112 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp248,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp248,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1112) {

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
																															op_lbdExp248,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp248,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft252 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft248.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1113 = false;
										while (!idLoopCond_1113) {
											idLoopCond_1113 = it_ft252.isOff();
											if (idLoopCond_1113) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp252 = it_ft252
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp248 = i_lbdExp252;

												java.lang.Boolean idIfCond_1114 = false;
												idIfCond_1114 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp248,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1114) {

													java.lang.Boolean idIfCond_1115 = false;
													idIfCond_1115 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

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
																														op_lbdExp248,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp248
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1116 = false;
													idIfCond_1116 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp248,
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
																						op_lbdExp248,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp248,
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
																															op_lbdExp248,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp248,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft253 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft248
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1118 = false;
										while (!idLoopCond_1118) {
											idLoopCond_1118 = it_ft253.isOff();
											if (idLoopCond_1118) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp253 = it_ft253
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp248 = t_lbdExp253;

												java.lang.Boolean idIfCond_1119 = false;
												idIfCond_1119 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp248,
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
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp248,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1120) {

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
																														op_lbdExp248,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp248
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1121 = false;
													idIfCond_1121 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp248,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1121) {

														java.lang.Boolean idIfCond_1122 = false;
														idIfCond_1122 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp248,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp248,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1122) {

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
																															op_lbdExp248,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp248,
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
	public String typeDefinitionToString(TypeDefinition td) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1123 = false;
		idIfCond_1123 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_1123) {

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

		java.lang.Boolean idIfCond_1124 = false;
		idIfCond_1124 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(td_tmp));

		if (idIfCond_1124) {

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

		java.lang.Boolean idIfCond_1125 = false;
		idIfCond_1125 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("onlyEcore"));

		if (idIfCond_1125) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_1126 = false;
		idIfCond_1126 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorKmt"));

		if (idIfCond_1126) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getNotImplementedException())));

		}

		java.lang.Boolean idIfCond_1127 = false;
		idIfCond_1127 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorJava"));

		if (idIfCond_1127) {

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

		java.lang.Boolean idIfCond_1128 = false;
		idIfCond_1128 = splitEcore;

		if (idIfCond_1128) {

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
