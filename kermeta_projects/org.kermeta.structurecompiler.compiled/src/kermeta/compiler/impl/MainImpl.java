/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.3 2008-09-22 14:44:56 cfaucher Exp $
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

		operations.add("existsAnnotationGenModelImpl");

		operations.add("getTypeName");

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

		java.lang.String modelInput = null;

		java.lang.String output = null;

		java.lang.String traceInput = "";

		modelInput = "platform:/resource/org.kermeta.compiler.kmt/models/StructureCompiler.km";

		output = "platform:/resource/org.kermeta.compiler.kmt/models/StructureCompiler.ecore";

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

			kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft180 = this
					.getContext().getMu().getAllPackages().iterator();
			java.lang.Boolean idLoopCond_798 = false;
			while (!idLoopCond_798) {
				idLoopCond_798 = it_ft180.isOff();
				if (idLoopCond_798) {
				} else {

					//BIle:func
					kermeta.language.structure.Package p_lbdExp180 = it_ft180
							.next();

					//BIft:eachOwnedElement

					kermeta.language.structure.Package pack_ft181 = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
							.asType(
									p_lbdExp180,
									org.kermeta.compil.runtime.ExecutionContext
											.getInstance()
											.getMetaClass(
													"kermeta.language.structure.Package")));

					//BIft:each

					{

						kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft182 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Tag> convertAsOrderedSet(
										pack_ft181.getOwnedTags()).iterator();
						java.lang.Boolean idLoopCond_799 = false;
						while (!idLoopCond_799) {
							idLoopCond_799 = it_ft182.isOff();
							if (idLoopCond_799) {
							} else {

								//BIle:func
								kermeta.language.structure.Tag o_lbdExp182 = it_ft182
										.next();

								//BIle:func
								kermeta.language.structure.Tag cd_lbdExp181 = o_lbdExp182;

								java.lang.Boolean idIfCond_800 = false;
								idIfCond_800 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp181,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_800) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft183 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp181,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft184 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft183.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_801 = false;
										while (!idLoopCond_801) {
											idLoopCond_801 = it_ft184.isOff();
											if (idLoopCond_801) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp184 = it_ft184
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp183 = o_lbdExp184;

												java.lang.Boolean idIfCond_802 = false;
												idIfCond_802 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp183,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_802) {

													java.lang.Boolean idIfCond_803 = false;
													idIfCond_803 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_803) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp183,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp183
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_804 = false;
													idIfCond_804 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp183,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_804) {

														java.lang.Boolean idIfCond_805 = false;
														idIfCond_805 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp183,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp183,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_805) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp183,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp183,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft185 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft183
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_806 = false;
										while (!idLoopCond_806) {
											idLoopCond_806 = it_ft185.isOff();
											if (idLoopCond_806) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp185 = it_ft185
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp183 = o_lbdExp185;

												java.lang.Boolean idIfCond_807 = false;
												idIfCond_807 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp183,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_807) {

													java.lang.Boolean idIfCond_808 = false;
													idIfCond_808 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_808) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp183,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp183
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_809 = false;
													idIfCond_809 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp183,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_809) {

														java.lang.Boolean idIfCond_810 = false;
														idIfCond_810 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp183,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp183,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_810) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp183,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp183,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft186 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft183
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_811 = false;
										while (!idLoopCond_811) {
											idLoopCond_811 = it_ft186.isOff();
											if (idLoopCond_811) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp186 = it_ft186
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp183 = o_lbdExp186;

												java.lang.Boolean idIfCond_812 = false;
												idIfCond_812 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp183,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_812) {

													java.lang.Boolean idIfCond_813 = false;
													idIfCond_813 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_813) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp183,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp183
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_814 = false;
													idIfCond_814 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp183,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_814) {

														java.lang.Boolean idIfCond_815 = false;
														idIfCond_815 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp183,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp183,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_815) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp183,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp183,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft187 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft183.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_816 = false;
										while (!idLoopCond_816) {
											idLoopCond_816 = it_ft187.isOff();
											if (idLoopCond_816) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp187 = it_ft187
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp183 = i_lbdExp187;

												java.lang.Boolean idIfCond_817 = false;
												idIfCond_817 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp183,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_817) {

													java.lang.Boolean idIfCond_818 = false;
													idIfCond_818 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_818) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp183,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp183
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_819 = false;
													idIfCond_819 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp183,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_819) {

														java.lang.Boolean idIfCond_820 = false;
														idIfCond_820 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp183,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp183,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_820) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp183,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp183,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft188 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft183
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_821 = false;
										while (!idLoopCond_821) {
											idLoopCond_821 = it_ft188.isOff();
											if (idLoopCond_821) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp188 = it_ft188
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp183 = t_lbdExp188;

												java.lang.Boolean idIfCond_822 = false;
												idIfCond_822 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp183,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_822) {

													java.lang.Boolean idIfCond_823 = false;
													idIfCond_823 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp183,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_823) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp183,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp183
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_824 = false;
													idIfCond_824 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp183,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_824) {

														java.lang.Boolean idIfCond_825 = false;
														idIfCond_825 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp183,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp183,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_825) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp183,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp183,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

						kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft189 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.TypeDefinition> convertAsOrderedSet(
										pack_ft181.getOwnedTypeDefinition())
								.iterator();
						java.lang.Boolean idLoopCond_826 = false;
						while (!idLoopCond_826) {
							idLoopCond_826 = it_ft189.isOff();
							if (idLoopCond_826) {
							} else {

								//BIle:func
								kermeta.language.structure.TypeDefinition o_lbdExp189 = it_ft189
										.next();

								//BIle:func
								kermeta.language.structure.TypeDefinition cd_lbdExp181 = o_lbdExp189;

								java.lang.Boolean idIfCond_827 = false;
								idIfCond_827 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp181,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_827) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft190 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp181,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft191 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft190.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_828 = false;
										while (!idLoopCond_828) {
											idLoopCond_828 = it_ft191.isOff();
											if (idLoopCond_828) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp191 = it_ft191
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp190 = o_lbdExp191;

												java.lang.Boolean idIfCond_829 = false;
												idIfCond_829 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp190,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_829) {

													java.lang.Boolean idIfCond_830 = false;
													idIfCond_830 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_830) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp190,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp190
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_831 = false;
													idIfCond_831 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp190,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_831) {

														java.lang.Boolean idIfCond_832 = false;
														idIfCond_832 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp190,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp190,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_832) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp190,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp190,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft192 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft190
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_833 = false;
										while (!idLoopCond_833) {
											idLoopCond_833 = it_ft192.isOff();
											if (idLoopCond_833) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp192 = it_ft192
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp190 = o_lbdExp192;

												java.lang.Boolean idIfCond_834 = false;
												idIfCond_834 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp190,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_834) {

													java.lang.Boolean idIfCond_835 = false;
													idIfCond_835 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_835) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp190,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp190
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_836 = false;
													idIfCond_836 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp190,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_836) {

														java.lang.Boolean idIfCond_837 = false;
														idIfCond_837 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp190,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp190,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_837) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp190,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp190,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft193 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft190
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_838 = false;
										while (!idLoopCond_838) {
											idLoopCond_838 = it_ft193.isOff();
											if (idLoopCond_838) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp193 = it_ft193
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp190 = o_lbdExp193;

												java.lang.Boolean idIfCond_839 = false;
												idIfCond_839 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp190,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_839) {

													java.lang.Boolean idIfCond_840 = false;
													idIfCond_840 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_840) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp190,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp190
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_841 = false;
													idIfCond_841 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp190,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_841) {

														java.lang.Boolean idIfCond_842 = false;
														idIfCond_842 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp190,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp190,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_842) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp190,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp190,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft190.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_843 = false;
										while (!idLoopCond_843) {
											idLoopCond_843 = it_ft194.isOff();
											if (idLoopCond_843) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp194 = it_ft194
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp190 = i_lbdExp194;

												java.lang.Boolean idIfCond_844 = false;
												idIfCond_844 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp190,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_844) {

													java.lang.Boolean idIfCond_845 = false;
													idIfCond_845 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_845) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp190,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp190
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_846 = false;
													idIfCond_846 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp190,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_846) {

														java.lang.Boolean idIfCond_847 = false;
														idIfCond_847 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp190,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp190,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_847) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp190,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp190,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft190
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_848 = false;
										while (!idLoopCond_848) {
											idLoopCond_848 = it_ft195.isOff();
											if (idLoopCond_848) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp195 = it_ft195
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp190 = t_lbdExp195;

												java.lang.Boolean idIfCond_849 = false;
												idIfCond_849 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp190,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_849) {

													java.lang.Boolean idIfCond_850 = false;
													idIfCond_850 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp190,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_850) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp190,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp190
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_851 = false;
													idIfCond_851 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp190,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_851) {

														java.lang.Boolean idIfCond_852 = false;
														idIfCond_852 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp190,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp190,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_852) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp190,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp190,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

						kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.structure.Package> convertAsOrderedSet(
										pack_ft181.getNestedPackage())
								.iterator();
						java.lang.Boolean idLoopCond_853 = false;
						while (!idLoopCond_853) {
							idLoopCond_853 = it_ft196.isOff();
							if (idLoopCond_853) {
							} else {

								//BIle:func
								kermeta.language.structure.Package p_lbdExp196 = it_ft196
										.next();

								//BIle:func
								kermeta.language.structure.Package cd_lbdExp181 = p_lbdExp196;

								java.lang.Boolean idIfCond_854 = false;
								idIfCond_854 = org.kermeta.compil.runtime.helper.language.ObjectUtil
										.isInstanceOf(
												cd_lbdExp181,
												org.kermeta.compil.runtime.ExecutionContext
														.getInstance()
														.getMetaClass(
																"kermeta.language.structure.ClassDefinition"));

								if (idIfCond_854) {

									//BIft:eachOwnedElement

									kermeta.language.structure.ClassDefinition cd_ft197 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
											.asType(
													cd_lbdExp181,
													org.kermeta.compil.runtime.ExecutionContext
															.getInstance()
															.getMetaClass(
																	"kermeta.language.structure.ClassDefinition")));

									//BIft:each

									{

										kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Tag> convertAsOrderedSet(
														cd_ft197.getOwnedTags())
												.iterator();
										java.lang.Boolean idLoopCond_855 = false;
										while (!idLoopCond_855) {
											idLoopCond_855 = it_ft198.isOff();
											if (idLoopCond_855) {
											} else {

												//BIle:func
												kermeta.language.structure.Tag o_lbdExp198 = it_ft198
														.next();

												//BIle:func
												kermeta.language.structure.Tag op_lbdExp197 = o_lbdExp198;

												java.lang.Boolean idIfCond_856 = false;
												idIfCond_856 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp197,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_856) {

													java.lang.Boolean idIfCond_857 = false;
													idIfCond_857 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_857) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp197,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp197
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_858 = false;
													idIfCond_858 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp197,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_858) {

														java.lang.Boolean idIfCond_859 = false;
														idIfCond_859 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp197,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp197,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_859) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp197,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp197,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Property> convertAsOrderedSet(
														cd_ft197
																.getOwnedAttribute())
												.iterator();
										java.lang.Boolean idLoopCond_860 = false;
										while (!idLoopCond_860) {
											idLoopCond_860 = it_ft199.isOff();
											if (idLoopCond_860) {
											} else {

												//BIle:func
												kermeta.language.structure.Property o_lbdExp199 = it_ft199
														.next();

												//BIle:func
												kermeta.language.structure.Property op_lbdExp197 = o_lbdExp199;

												java.lang.Boolean idIfCond_861 = false;
												idIfCond_861 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp197,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_861) {

													java.lang.Boolean idIfCond_862 = false;
													idIfCond_862 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_862) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp197,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp197
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_863 = false;
													idIfCond_863 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp197,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_863) {

														java.lang.Boolean idIfCond_864 = false;
														idIfCond_864 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp197,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp197,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_864) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp197,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp197,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft200 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Operation> convertAsOrderedSet(
														cd_ft197
																.getOwnedOperation())
												.iterator();
										java.lang.Boolean idLoopCond_865 = false;
										while (!idLoopCond_865) {
											idLoopCond_865 = it_ft200.isOff();
											if (idLoopCond_865) {
											} else {

												//BIle:func
												kermeta.language.structure.Operation o_lbdExp200 = it_ft200
														.next();

												//BIle:func
												kermeta.language.structure.Operation op_lbdExp197 = o_lbdExp200;

												java.lang.Boolean idIfCond_866 = false;
												idIfCond_866 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp197,
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
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
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
																												op_lbdExp197,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp197
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_868 = false;
													idIfCond_868 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp197,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_868) {

														java.lang.Boolean idIfCond_869 = false;
														idIfCond_869 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp197,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp197,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_869) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp197,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp197,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft201 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Constraint> convertAsOrderedSet(
														cd_ft197.getInv())
												.iterator();
										java.lang.Boolean idLoopCond_870 = false;
										while (!idLoopCond_870) {
											idLoopCond_870 = it_ft201.isOff();
											if (idLoopCond_870) {
											} else {

												//BIle:func
												kermeta.language.structure.Constraint i_lbdExp201 = it_ft201
														.next();

												//BIle:func
												kermeta.language.structure.Constraint op_lbdExp197 = i_lbdExp201;

												java.lang.Boolean idIfCond_871 = false;
												idIfCond_871 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp197,
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
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
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
																												op_lbdExp197,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp197
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_873 = false;
													idIfCond_873 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp197,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_873) {

														java.lang.Boolean idIfCond_874 = false;
														idIfCond_874 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp197,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp197,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_874) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp197,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp197,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

										kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft202 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.TypeVariable> convertAsOrderedSet(
														cd_ft197
																.getTypeParameter())
												.iterator();
										java.lang.Boolean idLoopCond_875 = false;
										while (!idLoopCond_875) {
											idLoopCond_875 = it_ft202.isOff();
											if (idLoopCond_875) {
											} else {

												//BIle:func
												kermeta.language.structure.TypeVariable t_lbdExp202 = it_ft202
														.next();

												//BIle:func
												kermeta.language.structure.TypeVariable op_lbdExp197 = t_lbdExp202;

												java.lang.Boolean idIfCond_876 = false;
												idIfCond_876 = org.kermeta.compil.runtime.helper.language.ObjectUtil
														.isInstanceOf(
																op_lbdExp197,
																org.kermeta.compil.runtime.ExecutionContext
																		.getInstance()
																		.getMetaClass(
																				"kermeta.language.structure.Operation"));

												if (idIfCond_876) {

													java.lang.Boolean idIfCond_877 = false;
													idIfCond_877 = kermeta.standard.helper.BooleanWrapper
															.and(
																	kermeta.standard.helper.BooleanWrapper
																			.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.isFunctionType()),
																	operations
																			.contains(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																					.asType(
																							op_lbdExp197,
																							org.kermeta.compil.runtime.ExecutionContext
																									.getInstance()
																									.getMetaClass(
																											"kermeta.language.structure.Operation")))
																					.getName()));

													if (idIfCond_877) {

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(kermeta.standard.helper.StringWrapper
																		.plus(
																				kermeta.standard.helper.StringWrapper
																						.plus(
																								"================= ",
																								((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.asType(
																												op_lbdExp197,
																												org.kermeta.compil.runtime.ExecutionContext
																														.getInstance()
																														.getMetaClass(
																																"kermeta.language.structure.Operation")))
																										.qualifiedName()),
																				" ================="));

														java.lang.String javaSourceCode = op_lbdExp197
																.createBehaviorJava(this
																		.getContext());

														org.kermeta.compil.runtime.helper.io.StdIOUtil
																.writeln(javaSourceCode);
													}

												} else {

													java.lang.Boolean idIfCond_878 = false;
													idIfCond_878 = org.kermeta.compil.runtime.helper.language.ObjectUtil
															.isInstanceOf(
																	op_lbdExp197,
																	org.kermeta.compil.runtime.ExecutionContext
																			.getInstance()
																			.getMetaClass(
																					"kermeta.language.structure.Property"));

													if (idIfCond_878) {

														java.lang.Boolean idIfCond_879 = false;
														idIfCond_879 = kermeta.standard.helper.BooleanWrapper
																.and(
																		((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																				.asType(
																						op_lbdExp197,
																						org.kermeta.compil.runtime.ExecutionContext
																								.getInstance()
																								.getMetaClass(
																										"kermeta.language.structure.Property")))
																				.getIsDerived(),
																		operations
																				.contains(((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								op_lbdExp197,
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.Property")))
																						.getName()));

														if (idIfCond_879) {

															org.kermeta.compil.runtime.helper.io.StdIOUtil
																	.writeln(kermeta.standard.helper.StringWrapper
																			.plus(
																					kermeta.standard.helper.StringWrapper
																							.plus(
																									"================= ",
																									((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																											.asType(
																													op_lbdExp197,
																													org.kermeta.compil.runtime.ExecutionContext
																															.getInstance()
																															.getMetaClass(
																																	"kermeta.language.structure.Property")))
																											.qualifiedName()),
																					" ================="));

															java.lang.String javaSourceCode = ((kermeta.language.structure.Property) org.kermeta.compil.runtime.helper.language.ObjectUtil
																	.asType(
																			op_lbdExp197,
																			org.kermeta.compil.runtime.ExecutionContext
																					.getInstance()
																					.getMetaClass(
																							"kermeta.language.structure.Property")))
																	.getGetterBody()
																	.createBehaviorJava(
																			this
																					.getContext());

															org.kermeta.compil.runtime.helper.io.StdIOUtil
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

		org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("\nFinish");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String typeDefinitionToString(TypeDefinition td) {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_880 = false;
		idIfCond_880 = kermeta.standard.helper.BooleanWrapper
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

		if (idIfCond_880) {

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

		java.lang.Boolean idIfCond_881 = false;
		idIfCond_881 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoid(td_tmp));

		if (idIfCond_881) {

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

		java.lang.Boolean idIfCond_882 = false;
		idIfCond_882 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("onlyEcore"));

		if (idIfCond_882) {

			this.getContext().getMu().applyPass2(this.getContext());
		}

		java.lang.Boolean idIfCond_883 = false;
		idIfCond_883 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("behaviorKmt"));

		if (idIfCond_883) {

			this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
		}

		java.lang.Boolean idIfCond_884 = false;
		idIfCond_884 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equals(this.getContext().getMode(), km2ecore.CompilingMode
						.getByName("behaviorJava"));

		if (idIfCond_884) {

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

			kermeta.standard.Iterator<ecore.EAnnotation> it_ft203 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EAnnotation> convertAsOrderedSet(
							this.getContext().getMu().getEntryPoints())
					.iterator();
			java.lang.Boolean idLoopCond_885 = false;
			while (!idLoopCond_885) {
				idLoopCond_885 = it_ft203.isOff();
				if (idLoopCond_885) {
				} else {

					//BIle:func
					ecore.EAnnotation e_lbdExp203 = it_ft203.next();

					ecore_resource.instances().add(e_lbdExp203);
					//EIle:func

				}
			}
		}

		//EIft:each

		//BIft:each

		{

			kermeta.standard.Iterator<ecore.EPackage> it_ft204 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<ecore.EPackage> convertAsOrderedSet(
							this.getContext().getMu().getEcorePackages())
					.iterator();
			java.lang.Boolean idLoopCond_886 = false;
			while (!idLoopCond_886) {
				idLoopCond_886 = it_ft204.isOff();
				if (idLoopCond_886) {
				} else {

					//BIle:func
					ecore.EPackage p_lbdExp204 = it_ft204.next();

					ecore_resource.instances().add(p_lbdExp204);
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
	public void main(String modelInput, String traceInput, String output) {

		this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode
				.getByName("behaviorJava"));

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
