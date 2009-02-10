/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: MainImpl.java,v 1.13 2009-02-10 17:52:06 cfaucher Exp $
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

			kermeta.standard.Iterator<ecore.EPackage> it_ft156 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_719 = false;
			while (!idLoopCond_719) {
				idLoopCond_719 = it_ft156.isOff();
				if (idLoopCond_719) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp156 = it_ft156.next();

					ecore_resource.instances().add(p_lbdExp156);
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

			kermeta.standard.Iterator<ecore.EPackage> it_ft157 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_720 = false;
			while (!idLoopCond_720) {
				idLoopCond_720 = it_ft157.isOff();
				if (idLoopCond_720) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp157 = it_ft157.next();

					java.lang.String output_final = output;

					java.lang.Boolean idIfCond_721 = false;
					idIfCond_721 = kermeta.standard.helper.IntegerWrapper
							.isGreater(resourceBag.size(), 0);

					if (idIfCond_721) {

						output_final = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(output,
																		"__"),
														p_lbdExp157.getName()),
										".ecore");
					}

					kermeta.persistence.Resource ecore_resource = this
							.getContext().getOutputRepository().createResource(
									output_final,
									"http://www.eclipse.org/emf/2002/Ecore");

					ecore_resource.instances().add(p_lbdExp157);

					resourceBag.add(ecore_resource);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft158 = resourceBag
					.iterator();
			java.lang.Boolean idLoopCond_722 = false;
			while (!idLoopCond_722) {
				idLoopCond_722 = it_ft158.isOff();
				if (idLoopCond_722) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res__lbdExp158 = it_ft158
							.next();

					res__lbdExp158.save();
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

		operations.add("testAssignValueTypeInObject");

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
						.newObject(km2ecore.Km2ecorePackage.eINSTANCE
								.getKM2EcoreContext())));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						this
								.typeDefinitionToString(this
										.getTypeDefinitionByQualifiedName("kermeta::standard::Integer")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						this
								.typeDefinitionToString(this
										.getTypeDefinitionByQualifiedName("kermeta::standard::Boolean")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						this
								.typeDefinitionToString(this
										.getTypeDefinitionByQualifiedName("kermeta::standard::Real")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						this
								.typeDefinitionToString(this
										.getTypeDefinitionByQualifiedName("kermeta::standard::Character")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						this
								.typeDefinitionToString(this
										.getTypeDefinitionByQualifiedName("kermeta::standard::String")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.getInstance()
				.writeln(
						this
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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft159 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_723 = false;
			while (!idLoopCond_723) {
				idLoopCond_723 = it_ft159.isOff();
				if (idLoopCond_723) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp159 = it_ft159
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft160 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									p_lbdExp159,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft160.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_724 = false;
						while (!idLoopCond_724) {
							idLoopCond_724 = it_ft161.isOff();
							if (idLoopCond_724) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp161 = it_ft161
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp160 = o_lbdExp161;

								java.lang.Boolean idIfCond_725 = false;
								idIfCond_725 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp160,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_725) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft162 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp160,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft163 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft162.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_726 = false;
										while (!idLoopCond_726) {
											idLoopCond_726 = it_ft163.isOff();
											if (idLoopCond_726) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp163 = it_ft163
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp162 = o_lbdExp163;

												java.lang.Boolean idIfCond_727 = false;
												idIfCond_727 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp162,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_727) {

													java.lang.Boolean idIfCond_728 = false;
													idIfCond_728 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_728) {

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
																														op_lbdExp162,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp162
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_729 = false;
													idIfCond_729 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp162,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_729) {

														java.lang.Boolean idIfCond_730 = false;
														idIfCond_730 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp162,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp162,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_730) {

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
																															op_lbdExp162,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp162,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft164 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft162
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_731 = false;
										while (!idLoopCond_731) {
											idLoopCond_731 = it_ft164.isOff();
											if (idLoopCond_731) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp164 = it_ft164
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp162 = o_lbdExp164;

												java.lang.Boolean idIfCond_732 = false;
												idIfCond_732 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp162,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_732) {

													java.lang.Boolean idIfCond_733 = false;
													idIfCond_733 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_733) {

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
																														op_lbdExp162,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp162
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_734 = false;
													idIfCond_734 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp162,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_734) {

														java.lang.Boolean idIfCond_735 = false;
														idIfCond_735 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp162,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp162,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_735) {

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
																															op_lbdExp162,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp162,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft165 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft162
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_736 = false;
										while (!idLoopCond_736) {
											idLoopCond_736 = it_ft165.isOff();
											if (idLoopCond_736) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp165 = it_ft165
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp162 = o_lbdExp165;

												java.lang.Boolean idIfCond_737 = false;
												idIfCond_737 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp162,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_737) {

													java.lang.Boolean idIfCond_738 = false;
													idIfCond_738 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_738) {

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
																														op_lbdExp162,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp162
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_739 = false;
													idIfCond_739 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp162,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_739) {

														java.lang.Boolean idIfCond_740 = false;
														idIfCond_740 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp162,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp162,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_740) {

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
																															op_lbdExp162,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp162,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft166 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft162.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_741 = false;
										while (!idLoopCond_741) {
											idLoopCond_741 = it_ft166.isOff();
											if (idLoopCond_741) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp166 = it_ft166
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp162 = i_lbdExp166;

												java.lang.Boolean idIfCond_742 = false;
												idIfCond_742 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp162,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_742) {

													java.lang.Boolean idIfCond_743 = false;
													idIfCond_743 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_743) {

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
																														op_lbdExp162,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp162
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_744 = false;
													idIfCond_744 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp162,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_744) {

														java.lang.Boolean idIfCond_745 = false;
														idIfCond_745 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp162,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp162,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_745) {

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
																															op_lbdExp162,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp162,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft167 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft162
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_746 = false;
										while (!idLoopCond_746) {
											idLoopCond_746 = it_ft167.isOff();
											if (idLoopCond_746) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp167 = it_ft167
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp162 = t_lbdExp167;

												java.lang.Boolean idIfCond_747 = false;
												idIfCond_747 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp162,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_747) {

													java.lang.Boolean idIfCond_748 = false;
													idIfCond_748 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp162,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_748) {

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
																														op_lbdExp162,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp162
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_749 = false;
													idIfCond_749 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp162,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_749) {

														java.lang.Boolean idIfCond_750 = false;
														idIfCond_750 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp162,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp162,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_750) {

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
																															op_lbdExp162,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp162,
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

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft168 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft160.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_751 = false;
						while (!idLoopCond_751) {
							idLoopCond_751 = it_ft168.isOff();
							if (idLoopCond_751) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp168 = it_ft168
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp160 = o_lbdExp168;

								java.lang.Boolean idIfCond_752 = false;
								idIfCond_752 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp160,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_752) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft169 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp160,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft170 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft169.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_753 = false;
										while (!idLoopCond_753) {
											idLoopCond_753 = it_ft170.isOff();
											if (idLoopCond_753) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp170 = it_ft170
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp169 = o_lbdExp170;

												java.lang.Boolean idIfCond_754 = false;
												idIfCond_754 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp169,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_754) {

													java.lang.Boolean idIfCond_755 = false;
													idIfCond_755 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_755) {

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
																														op_lbdExp169,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp169
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_756 = false;
													idIfCond_756 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp169,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_756) {

														java.lang.Boolean idIfCond_757 = false;
														idIfCond_757 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp169,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp169,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_757) {

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
																															op_lbdExp169,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp169,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft171 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft169
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_758 = false;
										while (!idLoopCond_758) {
											idLoopCond_758 = it_ft171.isOff();
											if (idLoopCond_758) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp171 = it_ft171
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp169 = o_lbdExp171;

												java.lang.Boolean idIfCond_759 = false;
												idIfCond_759 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp169,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_759) {

													java.lang.Boolean idIfCond_760 = false;
													idIfCond_760 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_760) {

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
																														op_lbdExp169,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp169
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_761 = false;
													idIfCond_761 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp169,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_761) {

														java.lang.Boolean idIfCond_762 = false;
														idIfCond_762 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp169,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp169,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_762) {

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
																															op_lbdExp169,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp169,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft169
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_763 = false;
										while (!idLoopCond_763) {
											idLoopCond_763 = it_ft172.isOff();
											if (idLoopCond_763) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp172 = it_ft172
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp169 = o_lbdExp172;

												java.lang.Boolean idIfCond_764 = false;
												idIfCond_764 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp169,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_764) {

													java.lang.Boolean idIfCond_765 = false;
													idIfCond_765 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_765) {

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
																														op_lbdExp169,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp169
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_766 = false;
													idIfCond_766 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp169,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_766) {

														java.lang.Boolean idIfCond_767 = false;
														idIfCond_767 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp169,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp169,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_767) {

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
																															op_lbdExp169,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp169,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft173 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft169.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_768 = false;
										while (!idLoopCond_768) {
											idLoopCond_768 = it_ft173.isOff();
											if (idLoopCond_768) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp173 = it_ft173
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp169 = i_lbdExp173;

												java.lang.Boolean idIfCond_769 = false;
												idIfCond_769 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp169,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_769) {

													java.lang.Boolean idIfCond_770 = false;
													idIfCond_770 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_770) {

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
																														op_lbdExp169,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp169
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_771 = false;
													idIfCond_771 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp169,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_771) {

														java.lang.Boolean idIfCond_772 = false;
														idIfCond_772 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp169,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp169,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_772) {

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
																															op_lbdExp169,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp169,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft169
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_773 = false;
										while (!idLoopCond_773) {
											idLoopCond_773 = it_ft174.isOff();
											if (idLoopCond_773) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp174 = it_ft174
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp169 = t_lbdExp174;

												java.lang.Boolean idIfCond_774 = false;
												idIfCond_774 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp169,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_774) {

													java.lang.Boolean idIfCond_775 = false;
													idIfCond_775 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp169,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_775) {

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
																														op_lbdExp169,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp169
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_776 = false;
													idIfCond_776 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp169,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_776) {

														java.lang.Boolean idIfCond_777 = false;
														idIfCond_777 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp169,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp169,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_777) {

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
																															op_lbdExp169,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp169,
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

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft175 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft160.getNestedPackage())
								.iterator();
						java.lang.Boolean idLoopCond_778 = false;
						while (!idLoopCond_778) {
							idLoopCond_778 = it_ft175.isOff();
							if (idLoopCond_778) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp175 = it_ft175
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp160 = p_lbdExp175;

								java.lang.Boolean idIfCond_779 = false;
								idIfCond_779 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp160,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_779) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft176 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp160,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft177 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft176.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_780 = false;
										while (!idLoopCond_780) {
											idLoopCond_780 = it_ft177.isOff();
											if (idLoopCond_780) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp177 = it_ft177
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp176 = o_lbdExp177;

												java.lang.Boolean idIfCond_781 = false;
												idIfCond_781 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp176,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_781) {

													java.lang.Boolean idIfCond_782 = false;
													idIfCond_782 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_782) {

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
																														op_lbdExp176,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp176
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_783 = false;
													idIfCond_783 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp176,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_783) {

														java.lang.Boolean idIfCond_784 = false;
														idIfCond_784 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp176,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp176,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_784) {

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
																															op_lbdExp176,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp176,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft178 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft176
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_785 = false;
										while (!idLoopCond_785) {
											idLoopCond_785 = it_ft178.isOff();
											if (idLoopCond_785) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp178 = it_ft178
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp176 = o_lbdExp178;

												java.lang.Boolean idIfCond_786 = false;
												idIfCond_786 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp176,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_786) {

													java.lang.Boolean idIfCond_787 = false;
													idIfCond_787 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_787) {

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
																														op_lbdExp176,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp176
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_788 = false;
													idIfCond_788 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp176,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_788) {

														java.lang.Boolean idIfCond_789 = false;
														idIfCond_789 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp176,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp176,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_789) {

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
																															op_lbdExp176,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp176,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft179 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft176
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_790 = false;
										while (!idLoopCond_790) {
											idLoopCond_790 = it_ft179.isOff();
											if (idLoopCond_790) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp179 = it_ft179
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp176 = o_lbdExp179;

												java.lang.Boolean idIfCond_791 = false;
												idIfCond_791 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp176,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_791) {

													java.lang.Boolean idIfCond_792 = false;
													idIfCond_792 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_792) {

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
																														op_lbdExp176,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp176
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_793 = false;
													idIfCond_793 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp176,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_793) {

														java.lang.Boolean idIfCond_794 = false;
														idIfCond_794 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp176,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp176,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_794) {

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
																															op_lbdExp176,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp176,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft180 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft176.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_795 = false;
										while (!idLoopCond_795) {
											idLoopCond_795 = it_ft180.isOff();
											if (idLoopCond_795) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp180 = it_ft180
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp176 = i_lbdExp180;

												java.lang.Boolean idIfCond_796 = false;
												idIfCond_796 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp176,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_796) {

													java.lang.Boolean idIfCond_797 = false;
													idIfCond_797 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_797) {

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
																														op_lbdExp176,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp176
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_798 = false;
													idIfCond_798 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp176,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_798) {

														java.lang.Boolean idIfCond_799 = false;
														idIfCond_799 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp176,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp176,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_799) {

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
																															op_lbdExp176,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp176,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft181 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft176
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_800 = false;
										while (!idLoopCond_800) {
											idLoopCond_800 = it_ft181.isOff();
											if (idLoopCond_800) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp181 = it_ft181
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp176 = t_lbdExp181;

												java.lang.Boolean idIfCond_801 = false;
												idIfCond_801 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp176,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_801) {

													java.lang.Boolean idIfCond_802 = false;
													idIfCond_802 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp176,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_802) {

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
																														op_lbdExp176,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp176
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_803 = false;
													idIfCond_803 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp176,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_803) {

														java.lang.Boolean idIfCond_804 = false;
														idIfCond_804 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp176,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp176,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_804) {

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
																															op_lbdExp176,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp176,
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

		java.lang.Boolean idIfCond_805 = false;
		idIfCond_805 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_805) {

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

		java.lang.Boolean idIfCond_806 = false;
		idIfCond_806 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(td_tmp));

		if (idIfCond_806) {

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

		java.lang.Boolean idIfCond_807 = false;
		idIfCond_807 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("onlyEcore"));

		if (idIfCond_807) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_808 = false;
		idIfCond_808 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorKmt"));

		if (idIfCond_808) {

			this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
		}

		java.lang.Boolean idIfCond_809 = false;
		idIfCond_809 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorJava"));

		if (idIfCond_809) {

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

		java.lang.Boolean idIfCond_810 = false;
		idIfCond_810 = splitEcore;

		if (idIfCond_810) {

			this.saveSplitEcore(output);
		} else {

			this.saveSingleEcore(output);
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"The Ecore Model has been saved");

		this.getContext().save();

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
