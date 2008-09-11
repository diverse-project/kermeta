/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.2 2008-09-11 12:34:55 cfaucher Exp $
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
	public void main_km2ecore_onlyEcore(String modelInput, String traceInput,
			String output) {

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
				.getByName("onlyEcore"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_km2ecore_behaviorJava(String modelInput,
			String traceInput, String output) {

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
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

		operations.add("matchStep2");

		operations.add("testSeqStack");

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

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Integer")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Boolean")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Real")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::Character")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(this
						.typeDefinitionToString(this
								.getTypeDefinitionByQualifiedName("kermeta::standard::String")));

		org.kermeta.compil.runtime.helper.io.StdIOUtil
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

		java.lang.String modelInput = "platform:/resource/org.kermeta.compiler.kmt/models/StructureCompiler.km";

		java.lang.String output = "platform:/resource/org.kermeta.compiler.kmt/models/StructureCompiler.ecore";

		java.lang.String traceInput = "";

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

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln(kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								"Input model: ", modelInput), "\n"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft170 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_850 = false;
			while (!idLoopCond_850) {
				idLoopCond_850 = it_ft170.isOff();
				if (idLoopCond_850) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp170 = it_ft170
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft171 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									p_lbdExp170,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft171.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_851 = false;
						while (!idLoopCond_851) {
							idLoopCond_851 = it_ft172.isOff();
							if (idLoopCond_851) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp172 = it_ft172
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp171 = o_lbdExp172;

								java.lang.Boolean idIfCond_852 = false;
								idIfCond_852 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp171,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_852) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft173 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp171,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft173.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_853 = false;
										while (!idLoopCond_853) {
											idLoopCond_853 = it_ft174.isOff();
											if (idLoopCond_853) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp174 = it_ft174
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp173 = o_lbdExp174;

												java.lang.Boolean idIfCond_854 = false;
												idIfCond_854 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp173,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_854) {

													java.lang.Boolean idIfCond_855 = false;
													idIfCond_855 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_855) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp173,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp173
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft175 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft173
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_856 = false;
										while (!idLoopCond_856) {
											idLoopCond_856 = it_ft175.isOff();
											if (idLoopCond_856) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp175 = it_ft175
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp173 = o_lbdExp175;

												java.lang.Boolean idIfCond_857 = false;
												idIfCond_857 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp173,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_857) {

													java.lang.Boolean idIfCond_858 = false;
													idIfCond_858 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_858) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp173,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp173
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft176 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft173
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_859 = false;
										while (!idLoopCond_859) {
											idLoopCond_859 = it_ft176.isOff();
											if (idLoopCond_859) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp176 = it_ft176
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp173 = o_lbdExp176;

												java.lang.Boolean idIfCond_860 = false;
												idIfCond_860 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp173,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_860) {

													java.lang.Boolean idIfCond_861 = false;
													idIfCond_861 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_861) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp173,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp173
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft177 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft173.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_862 = false;
										while (!idLoopCond_862) {
											idLoopCond_862 = it_ft177.isOff();
											if (idLoopCond_862) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp177 = it_ft177
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp173 = i_lbdExp177;

												java.lang.Boolean idIfCond_863 = false;
												idIfCond_863 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp173,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_863) {

													java.lang.Boolean idIfCond_864 = false;
													idIfCond_864 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_864) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp173,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp173
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft178 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft173
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_865 = false;
										while (!idLoopCond_865) {
											idLoopCond_865 = it_ft178.isOff();
											if (idLoopCond_865) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp178 = it_ft178
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp173 = t_lbdExp178;

												java.lang.Boolean idIfCond_866 = false;
												idIfCond_866 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp173,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_866) {

													java.lang.Boolean idIfCond_867 = false;
													idIfCond_867 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp173,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_867) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp173,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp173
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft179 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft171.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_868 = false;
						while (!idLoopCond_868) {
							idLoopCond_868 = it_ft179.isOff();
							if (idLoopCond_868) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp179 = it_ft179
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp171 = o_lbdExp179;

								java.lang.Boolean idIfCond_869 = false;
								idIfCond_869 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp171,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_869) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft180 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp171,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft181 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft180.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_870 = false;
										while (!idLoopCond_870) {
											idLoopCond_870 = it_ft181.isOff();
											if (idLoopCond_870) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp181 = it_ft181
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp180 = o_lbdExp181;

												java.lang.Boolean idIfCond_871 = false;
												idIfCond_871 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp180,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_871) {

													java.lang.Boolean idIfCond_872 = false;
													idIfCond_872 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_872) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp180,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp180
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft182 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft180
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_873 = false;
										while (!idLoopCond_873) {
											idLoopCond_873 = it_ft182.isOff();
											if (idLoopCond_873) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp182 = it_ft182
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp180 = o_lbdExp182;

												java.lang.Boolean idIfCond_874 = false;
												idIfCond_874 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp180,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_874) {

													java.lang.Boolean idIfCond_875 = false;
													idIfCond_875 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_875) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp180,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp180
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft183 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft180
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_876 = false;
										while (!idLoopCond_876) {
											idLoopCond_876 = it_ft183.isOff();
											if (idLoopCond_876) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp183 = it_ft183
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp180 = o_lbdExp183;

												java.lang.Boolean idIfCond_877 = false;
												idIfCond_877 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp180,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_877) {

													java.lang.Boolean idIfCond_878 = false;
													idIfCond_878 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_878) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp180,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp180
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft184 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft180.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_879 = false;
										while (!idLoopCond_879) {
											idLoopCond_879 = it_ft184.isOff();
											if (idLoopCond_879) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp184 = it_ft184
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp180 = i_lbdExp184;

												java.lang.Boolean idIfCond_880 = false;
												idIfCond_880 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp180,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_880) {

													java.lang.Boolean idIfCond_881 = false;
													idIfCond_881 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_881) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp180,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp180
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft185 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft180
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_882 = false;
										while (!idLoopCond_882) {
											idLoopCond_882 = it_ft185.isOff();
											if (idLoopCond_882) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp185 = it_ft185
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp180 = t_lbdExp185;

												java.lang.Boolean idIfCond_883 = false;
												idIfCond_883 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp180,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_883) {

													java.lang.Boolean idIfCond_884 = false;
													idIfCond_884 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp180,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_884) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp180,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp180
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft186 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft171.getNestedPackage())
								.iterator();
						java.lang.Boolean idLoopCond_885 = false;
						while (!idLoopCond_885) {
							idLoopCond_885 = it_ft186.isOff();
							if (idLoopCond_885) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp186 = it_ft186
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp171 = p_lbdExp186;

								java.lang.Boolean idIfCond_886 = false;
								idIfCond_886 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp171,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_886) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft187 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp171,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft188 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft187.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_887 = false;
										while (!idLoopCond_887) {
											idLoopCond_887 = it_ft188.isOff();
											if (idLoopCond_887) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp188 = it_ft188
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp187 = o_lbdExp188;

												java.lang.Boolean idIfCond_888 = false;
												idIfCond_888 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp187,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_888) {

													java.lang.Boolean idIfCond_889 = false;
													idIfCond_889 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_889) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp187,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp187
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft189 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft187
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_890 = false;
										while (!idLoopCond_890) {
											idLoopCond_890 = it_ft189.isOff();
											if (idLoopCond_890) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp189 = it_ft189
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp187 = o_lbdExp189;

												java.lang.Boolean idIfCond_891 = false;
												idIfCond_891 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp187,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_891) {

													java.lang.Boolean idIfCond_892 = false;
													idIfCond_892 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_892) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp187,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp187
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft190 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft187
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_893 = false;
										while (!idLoopCond_893) {
											idLoopCond_893 = it_ft190.isOff();
											if (idLoopCond_893) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp190 = it_ft190
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp187 = o_lbdExp190;

												java.lang.Boolean idIfCond_894 = false;
												idIfCond_894 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp187,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_894) {

													java.lang.Boolean idIfCond_895 = false;
													idIfCond_895 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_895) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp187,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp187
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft191 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft187.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_896 = false;
										while (!idLoopCond_896) {
											idLoopCond_896 = it_ft191.isOff();
											if (idLoopCond_896) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp191 = it_ft191
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp187 = i_lbdExp191;

												java.lang.Boolean idIfCond_897 = false;
												idIfCond_897 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp187,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_897) {

													java.lang.Boolean idIfCond_898 = false;
													idIfCond_898 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_898) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp187,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp187
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft192 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft187
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_899 = false;
										while (!idLoopCond_899) {
											idLoopCond_899 = it_ft192.isOff();
											if (idLoopCond_899) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp192 = it_ft192
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp187 = t_lbdExp192;

												java.lang.Boolean idIfCond_900 = false;
												idIfCond_900 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp187,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_900) {

													java.lang.Boolean idIfCond_901 = false;
													idIfCond_901 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp187,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_901) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp187,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp187
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
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

		org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("\nFinish");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String typeDefinitionToString(TypeDefinition td) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_902 = false;
		idIfCond_902 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_902) {

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

		java.lang.Boolean idIfCond_903 = false;
		idIfCond_903 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(td_tmp));

		if (idIfCond_903) {

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
	public void main(String modelInput, String traceInput, String output) {

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
				.getByName("behaviorJava"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main_mode(String modelInput, String traceInput, String output,
			CompilingMode mode) {

		org.kermeta.compil.runtime.helper.io.StdIOUtil
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

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln("KermetaCompiler - Pass 1 is finished");

		java.lang.Boolean idIfCond_904 = false;
		idIfCond_904 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("onlyEcore"));

		if (idIfCond_904) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_905 = false;
		idIfCond_905 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("behaviorKmt"));

		if (idIfCond_905) {

			this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
		}

		java.lang.Boolean idIfCond_906 = false;
		idIfCond_906 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("behaviorJava"));

		if (idIfCond_906) {

			this.getContext().getMu().preprocess(this.getContext());

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln(kermeta.standard.helper.StringWrapper.plus(
							"KermetaCompiler - Pass 2 with the mode: ", this
									.getContext().getMode().getName()));

			this.getContext().getMu().applyPass2BehaviorJava(this.getContext());

			this.getContext().getMu().postprocess(this.getContext());
		}

		org.kermeta.compil.runtime.helper.io.StdIOUtil
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

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft193 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							this.getContext().getMu().getEntryPoints())
					.iterator();
			java.lang.Boolean idLoopCond_907 = false;
			while (!idLoopCond_907) {
				idLoopCond_907 = it_ft193.isOff();
				if (idLoopCond_907) {
				} else {

					//BIle:func
					ecore.EAnnotation e_lbdExp193 = it_ft193.next();

					ecore_resource.instances().add(e_lbdExp193);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_908 = false;
			while (!idLoopCond_908) {
				idLoopCond_908 = it_ft194.isOff();
				if (idLoopCond_908) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp194 = it_ft194.next();

					ecore_resource.instances().add(p_lbdExp194);
					//EIle:func

				}
			}
		}

		//EIft:each

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln("Save the Ecore Model");

		ecore_resource.save();

		org.kermeta.compil.runtime.helper.io.StdIOUtil
				.writeln("The Ecore Model has been saved");

		this.getContext().save();

		org.kermeta.compil.runtime.helper.io.StdIOUtil
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

		org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("Finish");

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
