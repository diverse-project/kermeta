/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.12 2009-02-04 00:19:32 cfaucher Exp $
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
/*
		ecore_resource.instances().add(
				this.getContext().getMu().getEcoreModelElement());
*/
		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_976 = false;
			while (!idLoopCond_976) {
				idLoopCond_976 = it_ft219.isOff();
				if (idLoopCond_976) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp219 = it_ft219.next();

					ecore_resource.instances().add(p_lbdExp219);
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

			kermeta.standard.Iterator<ecore.EPackage> it_ft220 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_977 = false;
			while (!idLoopCond_977) {
				idLoopCond_977 = it_ft220.isOff();
				if (idLoopCond_977) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp220 = it_ft220.next();

					java.lang.String output_final = output;

					java.lang.Boolean idIfCond_978 = false;
					idIfCond_978 = kermeta.standard.helper.IntegerWrapper
							.isGreater(resourceBag.size(), 0);

					if (idIfCond_978) {

						output_final = kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														kermeta.standard.helper.StringWrapper
																.plus(output,
																		"__"),
														p_lbdExp220.getName()),
										".ecore");
					}

					kermeta.persistence.Resource ecore_resource = this
							.getContext().getOutputRepository().createResource(
									output_final,
									"http://www.eclipse.org/emf/2002/Ecore");

					ecore_resource.instances().add(p_lbdExp220);

					resourceBag.add(ecore_resource);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.persistence.Resource> it_ft221 = resourceBag
					.iterator();
			java.lang.Boolean idLoopCond_979 = false;
			while (!idLoopCond_979) {
				idLoopCond_979 = it_ft221.isOff();
				if (idLoopCond_979) {
				} else {

					//BIle:func
					kermeta.persistence.Resource res__lbdExp221 = it_ft221
							.next();

					res__lbdExp221.save();
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

		operations.add("parse");

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft222 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_980 = false;
			while (!idLoopCond_980) {
				idLoopCond_980 = it_ft222.isOff();
				if (idLoopCond_980) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp222 = it_ft222
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft223 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asTypeSwitcher(
									p_lbdExp222,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft224 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft223.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_981 = false;
						while (!idLoopCond_981) {
							idLoopCond_981 = it_ft224.isOff();
							if (idLoopCond_981) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp224 = it_ft224
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp223 = o_lbdExp224;

								java.lang.Boolean idIfCond_982 = false;
								idIfCond_982 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp223,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_982) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft225 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp223,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft226 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft225.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_983 = false;
										while (!idLoopCond_983) {
											idLoopCond_983 = it_ft226.isOff();
											if (idLoopCond_983) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp226 = it_ft226
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp225 = o_lbdExp226;

												java.lang.Boolean idIfCond_984 = false;
												idIfCond_984 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp225,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_984) {

													java.lang.Boolean idIfCond_985 = false;
													idIfCond_985 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_985) {

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
																														op_lbdExp225,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp225
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_986 = false;
													idIfCond_986 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_986) {

														java.lang.Boolean idIfCond_987 = false;
														idIfCond_987 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp225,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp225,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_987) {

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
																															op_lbdExp225,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp225,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft227 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft225
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_988 = false;
										while (!idLoopCond_988) {
											idLoopCond_988 = it_ft227.isOff();
											if (idLoopCond_988) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp227 = it_ft227
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp225 = o_lbdExp227;

												java.lang.Boolean idIfCond_989 = false;
												idIfCond_989 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp225,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_989) {

													java.lang.Boolean idIfCond_990 = false;
													idIfCond_990 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_990) {

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
																														op_lbdExp225,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp225
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_991 = false;
													idIfCond_991 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_991) {

														java.lang.Boolean idIfCond_992 = false;
														idIfCond_992 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp225,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp225,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_992) {

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
																															op_lbdExp225,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp225,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft228 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft225
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_993 = false;
										while (!idLoopCond_993) {
											idLoopCond_993 = it_ft228.isOff();
											if (idLoopCond_993) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp228 = it_ft228
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp225 = o_lbdExp228;

												java.lang.Boolean idIfCond_994 = false;
												idIfCond_994 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp225,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_994) {

													java.lang.Boolean idIfCond_995 = false;
													idIfCond_995 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_995) {

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
																														op_lbdExp225,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp225
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_996 = false;
													idIfCond_996 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_996) {

														java.lang.Boolean idIfCond_997 = false;
														idIfCond_997 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp225,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp225,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_997) {

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
																															op_lbdExp225,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp225,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft229 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft225.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_998 = false;
										while (!idLoopCond_998) {
											idLoopCond_998 = it_ft229.isOff();
											if (idLoopCond_998) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp229 = it_ft229
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp225 = i_lbdExp229;

												java.lang.Boolean idIfCond_999 = false;
												idIfCond_999 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp225,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_999) {

													java.lang.Boolean idIfCond_1000 = false;
													idIfCond_1000 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1000) {

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
																														op_lbdExp225,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp225
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1001 = false;
													idIfCond_1001 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1001) {

														java.lang.Boolean idIfCond_1002 = false;
														idIfCond_1002 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp225,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp225,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1002) {

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
																															op_lbdExp225,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp225,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft230 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft225
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1003 = false;
										while (!idLoopCond_1003) {
											idLoopCond_1003 = it_ft230.isOff();
											if (idLoopCond_1003) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp230 = it_ft230
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp225 = t_lbdExp230;

												java.lang.Boolean idIfCond_1004 = false;
												idIfCond_1004 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp225,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1004) {

													java.lang.Boolean idIfCond_1005 = false;
													idIfCond_1005 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp225,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1005) {

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
																														op_lbdExp225,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp225
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1006 = false;
													idIfCond_1006 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1006) {

														java.lang.Boolean idIfCond_1007 = false;
														idIfCond_1007 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp225,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp225,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1007) {

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
																															op_lbdExp225,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp225,
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

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft231 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft223.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_1008 = false;
						while (!idLoopCond_1008) {
							idLoopCond_1008 = it_ft231.isOff();
							if (idLoopCond_1008) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp231 = it_ft231
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp223 = o_lbdExp231;

								java.lang.Boolean idIfCond_1009 = false;
								idIfCond_1009 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp223,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1009) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft232 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp223,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft233 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft232.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1010 = false;
										while (!idLoopCond_1010) {
											idLoopCond_1010 = it_ft233.isOff();
											if (idLoopCond_1010) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp233 = it_ft233
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp232 = o_lbdExp233;

												java.lang.Boolean idIfCond_1011 = false;
												idIfCond_1011 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp232,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1011) {

													java.lang.Boolean idIfCond_1012 = false;
													idIfCond_1012 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1012) {

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
																														op_lbdExp232,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp232
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1013 = false;
													idIfCond_1013 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1013) {

														java.lang.Boolean idIfCond_1014 = false;
														idIfCond_1014 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp232,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp232,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1014) {

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
																															op_lbdExp232,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp232,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft234 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft232
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1015 = false;
										while (!idLoopCond_1015) {
											idLoopCond_1015 = it_ft234.isOff();
											if (idLoopCond_1015) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp234 = it_ft234
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp232 = o_lbdExp234;

												java.lang.Boolean idIfCond_1016 = false;
												idIfCond_1016 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp232,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1016) {

													java.lang.Boolean idIfCond_1017 = false;
													idIfCond_1017 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1017) {

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
																														op_lbdExp232,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp232
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1018 = false;
													idIfCond_1018 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1018) {

														java.lang.Boolean idIfCond_1019 = false;
														idIfCond_1019 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp232,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp232,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1019) {

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
																															op_lbdExp232,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp232,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft235 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft232
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1020 = false;
										while (!idLoopCond_1020) {
											idLoopCond_1020 = it_ft235.isOff();
											if (idLoopCond_1020) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp235 = it_ft235
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp232 = o_lbdExp235;

												java.lang.Boolean idIfCond_1021 = false;
												idIfCond_1021 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp232,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1021) {

													java.lang.Boolean idIfCond_1022 = false;
													idIfCond_1022 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1022) {

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
																														op_lbdExp232,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp232
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1023 = false;
													idIfCond_1023 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1023) {

														java.lang.Boolean idIfCond_1024 = false;
														idIfCond_1024 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp232,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp232,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1024) {

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
																															op_lbdExp232,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp232,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft236 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft232.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1025 = false;
										while (!idLoopCond_1025) {
											idLoopCond_1025 = it_ft236.isOff();
											if (idLoopCond_1025) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp236 = it_ft236
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp232 = i_lbdExp236;

												java.lang.Boolean idIfCond_1026 = false;
												idIfCond_1026 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp232,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1026) {

													java.lang.Boolean idIfCond_1027 = false;
													idIfCond_1027 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1027) {

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
																														op_lbdExp232,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp232
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1028 = false;
													idIfCond_1028 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1028) {

														java.lang.Boolean idIfCond_1029 = false;
														idIfCond_1029 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp232,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp232,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1029) {

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
																															op_lbdExp232,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp232,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft237 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft232
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1030 = false;
										while (!idLoopCond_1030) {
											idLoopCond_1030 = it_ft237.isOff();
											if (idLoopCond_1030) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp237 = it_ft237
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp232 = t_lbdExp237;

												java.lang.Boolean idIfCond_1031 = false;
												idIfCond_1031 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp232,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1031) {

													java.lang.Boolean idIfCond_1032 = false;
													idIfCond_1032 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp232,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1032) {

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
																														op_lbdExp232,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp232
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1033 = false;
													idIfCond_1033 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1033) {

														java.lang.Boolean idIfCond_1034 = false;
														idIfCond_1034 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp232,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp232,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1034) {

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
																															op_lbdExp232,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp232,
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

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft238 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft223.getNestedPackage())
								.iterator();
						java.lang.Boolean idLoopCond_1035 = false;
						while (!idLoopCond_1035) {
							idLoopCond_1035 = it_ft238.isOff();
							if (idLoopCond_1035) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp238 = it_ft238
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp223 = p_lbdExp238;

								java.lang.Boolean idIfCond_1036 = false;
								idIfCond_1036 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp223,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1036) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft239 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asTypeSwitcher(
													cd_lbdExp223,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft240 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft239.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_1037 = false;
										while (!idLoopCond_1037) {
											idLoopCond_1037 = it_ft240.isOff();
											if (idLoopCond_1037) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp240 = it_ft240
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp239 = o_lbdExp240;

												java.lang.Boolean idIfCond_1038 = false;
												idIfCond_1038 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp239,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1038) {

													java.lang.Boolean idIfCond_1039 = false;
													idIfCond_1039 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1039) {

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
																														op_lbdExp239,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp239
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1040 = false;
													idIfCond_1040 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1040) {

														java.lang.Boolean idIfCond_1041 = false;
														idIfCond_1041 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp239,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp239,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_1041) {

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
																															op_lbdExp239,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp239,
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft241 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft239
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_1042 = false;
										while (!idLoopCond_1042) {
											idLoopCond_1042 = it_ft241.isOff();
											if (idLoopCond_1042) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp241 = it_ft241
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp239 = o_lbdExp241;

												java.lang.Boolean idIfCond_1043 = false;
												idIfCond_1043 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp239,
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
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1044) {

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
																														op_lbdExp239,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp239
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1045 = false;
													idIfCond_1045 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1045) {

														java.lang.Boolean idIfCond_1046 = false;
														idIfCond_1046 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp239,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp239,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
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
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp239,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp239,
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft242 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft239
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_1047 = false;
										while (!idLoopCond_1047) {
											idLoopCond_1047 = it_ft242.isOff();
											if (idLoopCond_1047) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp242 = it_ft242
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp239 = o_lbdExp242;

												java.lang.Boolean idIfCond_1048 = false;
												idIfCond_1048 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp239,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1048) {

													java.lang.Boolean idIfCond_1049 = false;
													idIfCond_1049 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1049) {

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
																														op_lbdExp239,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp239
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1050 = false;
													idIfCond_1050 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1050) {

														java.lang.Boolean idIfCond_1051 = false;
														idIfCond_1051 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp239,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp239,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
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
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp239,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp239,
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft243 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft239.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_1052 = false;
										while (!idLoopCond_1052) {
											idLoopCond_1052 = it_ft243.isOff();
											if (idLoopCond_1052) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp243 = it_ft243
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp239 = i_lbdExp243;

												java.lang.Boolean idIfCond_1053 = false;
												idIfCond_1053 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp239,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1053) {

													java.lang.Boolean idIfCond_1054 = false;
													idIfCond_1054 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_1054) {

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
																														op_lbdExp239,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp239
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1055 = false;
													idIfCond_1055 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1055) {

														java.lang.Boolean idIfCond_1056 = false;
														idIfCond_1056 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp239,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp239,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
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
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp239,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp239,
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft244 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft239
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_1057 = false;
										while (!idLoopCond_1057) {
											idLoopCond_1057 = it_ft244.isOff();
											if (idLoopCond_1057) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp244 = it_ft244
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp239 = t_lbdExp244;

												java.lang.Boolean idIfCond_1058 = false;
												idIfCond_1058 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOfSwitcher(
																op_lbdExp239,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_1058) {

													java.lang.Boolean idIfCond_1059 = false;
													idIfCond_1059 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asTypeSwitcher(
																							op_lbdExp239,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
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
																										((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																												.asTypeSwitcher(
																														op_lbdExp239,
																														org.kermeta.compil.runtime.ExecutionContext
																																.getInstance()
																																.getMetaClass(
																																		"kermeta.language.structure.Operation")))
																												.qualifiedName()),
																						" ================="));

														java.lang.String javaSourceCode = op_lbdExp239
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.getInstance()
																.writeln(
																		javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_1060 = false;
													idIfCond_1060 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_1060) {

														java.lang.Boolean idIfCond_1061 = false;
														idIfCond_1061 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asTypeSwitcher(
																						op_lbdExp239,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asTypeSwitcher(
																								op_lbdExp239,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
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
																											((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																													.asTypeSwitcher(
																															op_lbdExp239,
																															org.kermeta.compil.runtime.ExecutionContext
																																	.getInstance()
																																	.getMetaClass(
																																			"kermeta.language.structure.Property")))
																													.qualifiedName()),
																							" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asTypeSwitcher(
																			op_lbdExp239,
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
	public TypeDefinition getTypeDefinitionByQualifiedName(String qn) {

		kermeta.language.structure.TypeDefinition result = null;

		kermeta.language.structure.TypeDefinition td = ((kermeta.language.structure.TypeDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
						.getTypeDefinition()));

		kermeta.language.structure.TypeDefinition td_tmp = this.getContext()
				.getMu().getTypeDefinitionByQualifiedName(qn);

		java.lang.Boolean idIfCond_1062 = false;
		idIfCond_1062 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(td_tmp));

		if (idIfCond_1062) {

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
	public String typeDefinitionToString(TypeDefinition td) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1063 = false;
		idIfCond_1063 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_1063) {

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

		java.lang.Boolean idIfCond_1064 = false;
		idIfCond_1064 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("onlyEcore"));

		if (idIfCond_1064) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_1065 = false;
		idIfCond_1065 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorKmt"));

		if (idIfCond_1065) {

			this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
		}

		java.lang.Boolean idIfCond_1066 = false;
		idIfCond_1066 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorJava"));

		if (idIfCond_1066) {

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

		java.lang.Boolean idIfCond_1067 = false;
		idIfCond_1067 = splitEcore;

		if (idIfCond_1067) {

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
