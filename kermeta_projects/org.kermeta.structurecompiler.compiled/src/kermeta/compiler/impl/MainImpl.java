/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.9 2008-11-07 08:54:19 cfaucher Exp $
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

		operations.add("getFunctionType");

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

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								"Input model: ", modelInput), "\n"));

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft222 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_1001 = false;
			while (!idLoopCond_1001) {
				idLoopCond_1001 = it_ft222.isOff();
				if (idLoopCond_1001) {
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
						java.lang.Boolean idLoopCond_1002 = false;
						while (!idLoopCond_1002) {
							idLoopCond_1002 = it_ft224.isOff();
							if (idLoopCond_1002) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp224 = it_ft224
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp223 = o_lbdExp224;

								java.lang.Boolean idIfCond_1003 = false;
								idIfCond_1003 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp223,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1003) {

									java.lang.Boolean idIfCond_1004 = false;
									idIfCond_1004 = kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	cd_lbdExp223,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ClassDefinition")))
															.qualifiedName(),
													"kermeta::language::behavior::CallFeature");

									if (idIfCond_1004) {

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
															cd_ft225
																	.getOwnedTags())
													.iterator();
											java.lang.Boolean idLoopCond_1005 = false;
											while (!idLoopCond_1005) {
												idLoopCond_1005 = it_ft226
														.isOff();
												if (idLoopCond_1005) {
												} else {

													//BIle:func
													kermeta.language.structure.Tag o_lbdExp226 = it_ft226
															.next();

													//BIle:func
													kermeta.language.structure.Tag op_lbdExp225 = o_lbdExp226;

													java.lang.Boolean idIfCond_1006 = false;
													idIfCond_1006 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation"));

													if (idIfCond_1006) {

														java.lang.Boolean idIfCond_1007 = false;
														idIfCond_1007 = kermeta.standard.helper.BooleanWrapper
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

														if (idIfCond_1007) {

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

														java.lang.Boolean idIfCond_1008 = false;
														idIfCond_1008 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp225,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Property"));

														if (idIfCond_1008) {

															java.lang.Boolean idIfCond_1009 = false;
															idIfCond_1009 = kermeta.standard.helper.BooleanWrapper
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

															if (idIfCond_1009) {

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
											java.lang.Boolean idLoopCond_1010 = false;
											while (!idLoopCond_1010) {
												idLoopCond_1010 = it_ft227
														.isOff();
												if (idLoopCond_1010) {
												} else {

													//BIle:func
													kermeta.language.structure.Property o_lbdExp227 = it_ft227
															.next();

													//BIle:func
													kermeta.language.structure.Property op_lbdExp225 = o_lbdExp227;

													java.lang.Boolean idIfCond_1011 = false;
													idIfCond_1011 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
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

														java.lang.Boolean idIfCond_1013 = false;
														idIfCond_1013 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp225,
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
											java.lang.Boolean idLoopCond_1015 = false;
											while (!idLoopCond_1015) {
												idLoopCond_1015 = it_ft228
														.isOff();
												if (idLoopCond_1015) {
												} else {

													//BIle:func
													kermeta.language.structure.Operation o_lbdExp228 = it_ft228
															.next();

													//BIle:func
													kermeta.language.structure.Operation op_lbdExp225 = o_lbdExp228;

													java.lang.Boolean idIfCond_1016 = false;
													idIfCond_1016 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
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

														java.lang.Boolean idIfCond_1018 = false;
														idIfCond_1018 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp225,
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
											java.lang.Boolean idLoopCond_1020 = false;
											while (!idLoopCond_1020) {
												idLoopCond_1020 = it_ft229
														.isOff();
												if (idLoopCond_1020) {
												} else {

													//BIle:func
													kermeta.language.structure.Constraint i_lbdExp229 = it_ft229
															.next();

													//BIle:func
													kermeta.language.structure.Constraint op_lbdExp225 = i_lbdExp229;

													java.lang.Boolean idIfCond_1021 = false;
													idIfCond_1021 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
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

														java.lang.Boolean idIfCond_1023 = false;
														idIfCond_1023 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp225,
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
											java.lang.Boolean idLoopCond_1025 = false;
											while (!idLoopCond_1025) {
												idLoopCond_1025 = it_ft230
														.isOff();
												if (idLoopCond_1025) {
												} else {

													//BIle:func
													kermeta.language.structure.TypeVariable t_lbdExp230 = it_ft230
															.next();

													//BIle:func
													kermeta.language.structure.TypeVariable op_lbdExp225 = t_lbdExp230;

													java.lang.Boolean idIfCond_1026 = false;
													idIfCond_1026 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp225,
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

														java.lang.Boolean idIfCond_1028 = false;
														idIfCond_1028 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp225,
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
						java.lang.Boolean idLoopCond_1030 = false;
						while (!idLoopCond_1030) {
							idLoopCond_1030 = it_ft231.isOff();
							if (idLoopCond_1030) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp231 = it_ft231
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp223 = o_lbdExp231;

								java.lang.Boolean idIfCond_1031 = false;
								idIfCond_1031 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp223,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1031) {

									java.lang.Boolean idIfCond_1032 = false;
									idIfCond_1032 = kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	cd_lbdExp223,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ClassDefinition")))
															.qualifiedName(),
													"kermeta::language::behavior::CallFeature");

									if (idIfCond_1032) {

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
															cd_ft232
																	.getOwnedTags())
													.iterator();
											java.lang.Boolean idLoopCond_1033 = false;
											while (!idLoopCond_1033) {
												idLoopCond_1033 = it_ft233
														.isOff();
												if (idLoopCond_1033) {
												} else {

													//BIle:func
													kermeta.language.structure.Tag o_lbdExp233 = it_ft233
															.next();

													//BIle:func
													kermeta.language.structure.Tag op_lbdExp232 = o_lbdExp233;

													java.lang.Boolean idIfCond_1034 = false;
													idIfCond_1034 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation"));

													if (idIfCond_1034) {

														java.lang.Boolean idIfCond_1035 = false;
														idIfCond_1035 = kermeta.standard.helper.BooleanWrapper
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

														if (idIfCond_1035) {

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

														java.lang.Boolean idIfCond_1036 = false;
														idIfCond_1036 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp232,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Property"));

														if (idIfCond_1036) {

															java.lang.Boolean idIfCond_1037 = false;
															idIfCond_1037 = kermeta.standard.helper.BooleanWrapper
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

															if (idIfCond_1037) {

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
											java.lang.Boolean idLoopCond_1038 = false;
											while (!idLoopCond_1038) {
												idLoopCond_1038 = it_ft234
														.isOff();
												if (idLoopCond_1038) {
												} else {

													//BIle:func
													kermeta.language.structure.Property o_lbdExp234 = it_ft234
															.next();

													//BIle:func
													kermeta.language.structure.Property op_lbdExp232 = o_lbdExp234;

													java.lang.Boolean idIfCond_1039 = false;
													idIfCond_1039 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation"));

													if (idIfCond_1039) {

														java.lang.Boolean idIfCond_1040 = false;
														idIfCond_1040 = kermeta.standard.helper.BooleanWrapper
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

														if (idIfCond_1040) {

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

														java.lang.Boolean idIfCond_1041 = false;
														idIfCond_1041 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp232,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Property"));

														if (idIfCond_1041) {

															java.lang.Boolean idIfCond_1042 = false;
															idIfCond_1042 = kermeta.standard.helper.BooleanWrapper
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

															if (idIfCond_1042) {

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
											java.lang.Boolean idLoopCond_1043 = false;
											while (!idLoopCond_1043) {
												idLoopCond_1043 = it_ft235
														.isOff();
												if (idLoopCond_1043) {
												} else {

													//BIle:func
													kermeta.language.structure.Operation o_lbdExp235 = it_ft235
															.next();

													//BIle:func
													kermeta.language.structure.Operation op_lbdExp232 = o_lbdExp235;

													java.lang.Boolean idIfCond_1044 = false;
													idIfCond_1044 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation"));

													if (idIfCond_1044) {

														java.lang.Boolean idIfCond_1045 = false;
														idIfCond_1045 = kermeta.standard.helper.BooleanWrapper
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

														java.lang.Boolean idIfCond_1046 = false;
														idIfCond_1046 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp232,
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
											java.lang.Boolean idLoopCond_1048 = false;
											while (!idLoopCond_1048) {
												idLoopCond_1048 = it_ft236
														.isOff();
												if (idLoopCond_1048) {
												} else {

													//BIle:func
													kermeta.language.structure.Constraint i_lbdExp236 = it_ft236
															.next();

													//BIle:func
													kermeta.language.structure.Constraint op_lbdExp232 = i_lbdExp236;

													java.lang.Boolean idIfCond_1049 = false;
													idIfCond_1049 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
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

														if (idIfCond_1050) {

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

														java.lang.Boolean idIfCond_1051 = false;
														idIfCond_1051 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp232,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Property"));

														if (idIfCond_1051) {

															java.lang.Boolean idIfCond_1052 = false;
															idIfCond_1052 = kermeta.standard.helper.BooleanWrapper
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

															if (idIfCond_1052) {

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
											java.lang.Boolean idLoopCond_1053 = false;
											while (!idLoopCond_1053) {
												idLoopCond_1053 = it_ft237
														.isOff();
												if (idLoopCond_1053) {
												} else {

													//BIle:func
													kermeta.language.structure.TypeVariable t_lbdExp237 = it_ft237
															.next();

													//BIle:func
													kermeta.language.structure.TypeVariable op_lbdExp232 = t_lbdExp237;

													java.lang.Boolean idIfCond_1054 = false;
													idIfCond_1054 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp232,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation"));

													if (idIfCond_1054) {

														java.lang.Boolean idIfCond_1055 = false;
														idIfCond_1055 = kermeta.standard.helper.BooleanWrapper
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

														if (idIfCond_1055) {

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

														java.lang.Boolean idIfCond_1056 = false;
														idIfCond_1056 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp232,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Property"));

														if (idIfCond_1056) {

															java.lang.Boolean idIfCond_1057 = false;
															idIfCond_1057 = kermeta.standard.helper.BooleanWrapper
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

															if (idIfCond_1057) {

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
						java.lang.Boolean idLoopCond_1058 = false;
						while (!idLoopCond_1058) {
							idLoopCond_1058 = it_ft238.isOff();
							if (idLoopCond_1058) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp238 = it_ft238
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp223 = p_lbdExp238;

								java.lang.Boolean idIfCond_1059 = false;
								idIfCond_1059 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOfSwitcher(
												cd_lbdExp223,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_1059) {

									java.lang.Boolean idIfCond_1060 = false;
									idIfCond_1060 = kermeta.standard.helper.StringWrapper
											.equals(
													((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
															.asTypeSwitcher(
																	cd_lbdExp223,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.ClassDefinition")))
															.qualifiedName(),
													"kermeta::language::behavior::CallFeature");

									if (idIfCond_1060) {

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
															cd_ft239
																	.getOwnedTags())
													.iterator();
											java.lang.Boolean idLoopCond_1061 = false;
											while (!idLoopCond_1061) {
												idLoopCond_1061 = it_ft240
														.isOff();
												if (idLoopCond_1061) {
												} else {

													//BIle:func
													kermeta.language.structure.Tag o_lbdExp240 = it_ft240
															.next();

													//BIle:func
													kermeta.language.structure.Tag op_lbdExp239 = o_lbdExp240;

													java.lang.Boolean idIfCond_1062 = false;
													idIfCond_1062 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Operation"));

													if (idIfCond_1062) {

														java.lang.Boolean idIfCond_1063 = false;
														idIfCond_1063 = kermeta.standard.helper.BooleanWrapper
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

														java.lang.Boolean idIfCond_1064 = false;
														idIfCond_1064 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp239,
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
											java.lang.Boolean idLoopCond_1066 = false;
											while (!idLoopCond_1066) {
												idLoopCond_1066 = it_ft241
														.isOff();
												if (idLoopCond_1066) {
												} else {

													//BIle:func
													kermeta.language.structure.Property o_lbdExp241 = it_ft241
															.next();

													//BIle:func
													kermeta.language.structure.Property op_lbdExp239 = o_lbdExp241;

													java.lang.Boolean idIfCond_1067 = false;
													idIfCond_1067 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
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

														if (idIfCond_1068) {

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

														java.lang.Boolean idIfCond_1069 = false;
														idIfCond_1069 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp239,
																		org.kermeta.compil.runtime.ExecutionContext
																				.getInstance()
																				.getMetaClass(
																						"kermeta.language.structure.Property"));

														if (idIfCond_1069) {

															java.lang.Boolean idIfCond_1070 = false;
															idIfCond_1070 = kermeta.standard.helper.BooleanWrapper
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

															if (idIfCond_1070) {

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
											java.lang.Boolean idLoopCond_1071 = false;
											while (!idLoopCond_1071) {
												idLoopCond_1071 = it_ft242
														.isOff();
												if (idLoopCond_1071) {
												} else {

													//BIle:func
													kermeta.language.structure.Operation o_lbdExp242 = it_ft242
															.next();

													//BIle:func
													kermeta.language.structure.Operation op_lbdExp239 = o_lbdExp242;

													java.lang.Boolean idIfCond_1072 = false;
													idIfCond_1072 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
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

														java.lang.Boolean idIfCond_1074 = false;
														idIfCond_1074 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp239,
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
											java.lang.Boolean idLoopCond_1076 = false;
											while (!idLoopCond_1076) {
												idLoopCond_1076 = it_ft243
														.isOff();
												if (idLoopCond_1076) {
												} else {

													//BIle:func
													kermeta.language.structure.Constraint i_lbdExp243 = it_ft243
															.next();

													//BIle:func
													kermeta.language.structure.Constraint op_lbdExp239 = i_lbdExp243;

													java.lang.Boolean idIfCond_1077 = false;
													idIfCond_1077 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
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

														java.lang.Boolean idIfCond_1079 = false;
														idIfCond_1079 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp239,
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
											java.lang.Boolean idLoopCond_1081 = false;
											while (!idLoopCond_1081) {
												idLoopCond_1081 = it_ft244
														.isOff();
												if (idLoopCond_1081) {
												} else {

													//BIle:func
													kermeta.language.structure.TypeVariable t_lbdExp244 = it_ft244
															.next();

													//BIle:func
													kermeta.language.structure.TypeVariable op_lbdExp239 = t_lbdExp244;

													java.lang.Boolean idIfCond_1082 = false;
													idIfCond_1082 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOfSwitcher(
																	op_lbdExp239,
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

														java.lang.Boolean idIfCond_1084 = false;
														idIfCond_1084 = org.kermeta.compil.runtime.helper.language.ObjectUtil
																.isInstanceOfSwitcher(
																		op_lbdExp239,
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
	public TypeDefinition getTypeDefinitionByQualifiedName(String qn) {

		kermeta.language.structure.TypeDefinition result = null;

		kermeta.language.structure.TypeDefinition td = ((kermeta.language.structure.TypeDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.language.structure.TypeDefinition"));

		kermeta.language.structure.TypeDefinition td_tmp = this.getContext()
				.getMu().getTypeDefinitionByQualifiedName(qn);

		java.lang.Boolean idIfCond_1086 = false;
		idIfCond_1086 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(td_tmp));

		if (idIfCond_1086) {

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

		java.lang.Boolean idIfCond_1087 = false;
		idIfCond_1087 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_1087) {

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
				.getInstance()
				.writeln(
						kermeta.standard.helper.StringWrapper
								.plus(
										"KermetaCompiler - Starting up of the Ecore generation for the model: ",
										modelInput));

		this
				.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("km2ecore.KM2EcoreContext")));

		this.getContext().initialize(modelInput, traceInput);

		this.getContext().setMode(mode);

		this.getContext().getMu().applyPass1(this.getContext());

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"KermetaCompiler - Pass 1 is finished");

		java.lang.Boolean idIfCond_1088 = false;
		idIfCond_1088 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("onlyEcore"));

		if (idIfCond_1088) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_1089 = false;
		idIfCond_1089 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorKmt"));

		if (idIfCond_1089) {

			this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
		}

		java.lang.Boolean idIfCond_1090 = false;
		idIfCond_1090 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getContext().getMode(),
						km2ecore.CompilingMode.getByName("behaviorJava"));

		if (idIfCond_1090) {

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

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft245 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							this.getContext().getMu().getEntryPoints())
					.iterator();
			java.lang.Boolean idLoopCond_1091 = false;
			while (!idLoopCond_1091) {
				idLoopCond_1091 = it_ft245.isOff();
				if (idLoopCond_1091) {
				} else {

					//BIle:func
					ecore.EAnnotation e_lbdExp245 = it_ft245.next();

					ecore_resource.instances().add(e_lbdExp245);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft246 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_1092 = false;
			while (!idLoopCond_1092) {
				idLoopCond_1092 = it_ft246.isOff();
				if (idLoopCond_1092) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp246 = it_ft246.next();

					ecore_resource.instances().add(p_lbdExp246);
					//EIle:func

				}
			}
		}

		//EIft:each

		org.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(
				"Save the Ecore Model");

		ecore_resource.save();

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
