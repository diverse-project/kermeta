/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallSuperOperationImpl.java,v 1.2 2008-09-11 12:34:40 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallSuperOperation;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Super Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CallSuperOperationImpl extends CallExpressionImpl implements
		CallSuperOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallSuperOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_SUPER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBehaviorJava(KM2EcoreContext context) {

		java.lang.String result = null;

		super.createBehaviorJava(context);

		kermeta.language.structure.Operation owningOperation = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(
						this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation")),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Operation")));

		java.lang.String fromOperation_cd = kermeta.standard.helper.StringWrapper
				.replace(
						((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.asType(
										org.kermeta.compil.runtime.helper.language.ObjectUtil
												.container(owningOperation
														.getSuperOperation()),
										org.kermeta.compil.runtime.ExecutionContext
												.getInstance()
												.getMetaClass(
														"kermeta.language.structure.ClassDefinition")))
								.qualifiedName(), "::", "\\.");

		result = "";

		ecore.EClass extended_class = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(
						this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ClassDefinition")),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition")))
				.getEcoreModelElement();

		ecore.EClass super_class = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asType(
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(owningOperation.getSuperOperation()),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance()
								.getMetaClass(
										"kermeta.language.structure.ClassDefinition")))
				.getEcoreModelElement();

		java.lang.Boolean idIfCond_538 = false;
		idIfCond_538 = owningOperation.isFunctionType();

		if (idIfCond_538) {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.writeln(kermeta.standard.helper.StringWrapper.plus(
							"A callSuperFunctionType has been detected: ",
							owningOperation.qualifiedName()));
		} else {

			java.lang.Boolean idIfCond_539 = false;
			idIfCond_539 = kermeta.standard.helper.BooleanWrapper
					.and(
							((km2ecore.helper.ecore.ModelAnalizer) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject("km2ecore.helper.ecore.ModelAnalizer"))
									.isExtendedBy(extended_class, super_class),
							kermeta.standard.helper.BooleanWrapper.not(context
									.getStaticOperationMode()));

			if (idIfCond_539) {

				result = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, "super."), owningOperation
										.getName()), "(");
			} else {

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
																								kermeta.standard.helper.StringWrapper
																										.plus(
																												result,
																												kermeta.standard.helper.StringWrapper
																														.replace(
																																((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil
																																		.asType(
																																				org.kermeta.compil.runtime.helper.language.ObjectUtil
																																						.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																																								.asType(
																																										org.kermeta.compil.runtime.helper.language.ObjectUtil
																																												.container(owningOperation
																																														.getSuperOperation()),
																																										org.kermeta.compil.runtime.ExecutionContext
																																												.getInstance()
																																												.getMetaClass(
																																														"kermeta.language.structure.ClassDefinition")))),
																																				org.kermeta.compil.runtime.ExecutionContext
																																						.getInstance()
																																						.getMetaClass(
																																								"kermeta.language.structure.Package")))
																																		.qualifiedName(),
																																"::",
																																"\\.")),
																								".helper."),
																				((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
																						.asType(
																								org.kermeta.compil.runtime.helper.language.ObjectUtil
																										.container(owningOperation
																												.getSuperOperation()),
																								org.kermeta.compil.runtime.ExecutionContext
																										.getInstance()
																										.getMetaClass(
																												"kermeta.language.structure.ClassDefinition")))
																						.getName()),
																"Super.super_"),
												((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil
														.newObject("km2ecore.helper.java.IdentifierHelper"))
														.getMangledIdentifier(
																owningOperation
																		.getSuperOperation()
																		.getFinalName(),
																context)), "(");

				java.lang.Boolean idIfCond_540 = false;
				idIfCond_540 = context.getStaticOperationMode();

				if (idIfCond_540) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"self");
				} else {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							"this");
				}

				java.lang.Boolean idIfCond_541 = false;
				idIfCond_541 = kermeta.standard.helper.IntegerWrapper
						.isGreater(
								org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
										.<kermeta.language.behavior.Expression> convertAsOrderedSet(
												this.getParameters()).size(), 0);

				if (idIfCond_541) {

					result = kermeta.standard.helper.StringWrapper.plus(result,
							", ");
				}

				java.lang.Boolean idIfCond_542 = false;
				idIfCond_542 = context.getStaticOperationMode();

				if (idIfCond_542) {

					((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.language.structure.ModelingUnit"))
							.compileStaticOperation(owningOperation
									.getSuperOperation(), context);
				} else {

					org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
							.<kermeta.language.structure.Operation> convertAsOrderedSet(
									context
											.getMu()
											.getSuperOperationsToCompileInHelper())
							.add(owningOperation.getSuperOperation());
				}

			}

			this.setBeforeLambdaExpressionResult("");

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											result,
											((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject("km2ecore.helper.kermeta.CompilerHelperJava"))
													.ppComaSeparatedNodes(
															org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
																	.<kermeta.language.behavior.Expression> convertAsOrderedSet(this
																			.getParameters()),
															context)), ")");

			context.setBeforeLambdaExpressionResult(this
					.getBeforeLambdaExpressionResult());

			this.setBeforeLambdaExpressionResult("");

			result = kermeta.standard.helper.StringWrapper.plus(result, this
					.endOfExpressionFixer());
		}

		return result;

	}

} //CallSuperOperationImpl
