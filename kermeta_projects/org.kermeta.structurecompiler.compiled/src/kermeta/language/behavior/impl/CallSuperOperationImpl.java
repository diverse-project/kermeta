/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CallSuperOperationImpl.java,v 1.13 2009-02-23 15:26:46 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallSuperOperation;

import kermeta.language.structure.Operation;

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
				.asTypeSwitcher(
						this
								.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.Operation")),
						org.kermeta.compil.runtime.ExecutionContext
								.getInstance().getMetaClass(
										"kermeta.language.structure.Operation")));

		java.lang.String fromOperation_cd = kermeta.standard.helper.StringWrapper
				.replace(owningOperation.getSuperOperation().getOwningClass()
						.qualifiedName(), "::", ".");

		result = "";

		ecore.EClass extended_class = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
				.asTypeSwitcher(
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

		ecore.EClass super_class = owningOperation.getSuperOperation()
				.getOwningClass().getEcoreModelElement();

		java.lang.Boolean idIfCond_672 = false;
		idIfCond_672 = kermeta.standard.helper.BooleanWrapper
				.not(owningOperation.isFunctionType());

		if (idIfCond_672) {

			java.lang.Boolean idIfCond_673 = false;
			idIfCond_673 = kermeta.standard.helper.BooleanWrapper
					.and(
							((km2ecore.helper.ecore.ModelAnalizer) org.kermeta.compil.runtime.helper.language.ClassUtil
									.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE
											.getModelAnalizer())).isExtendedBy(
									extended_class, super_class),
							kermeta.standard.helper.BooleanWrapper.not(context
									.getStaticOperationMode()));

			if (idIfCond_673) {

				result = kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										result, "super."), owningOperation
										.getFinalName(context)), "(");
			} else {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						this.getCallStaticSignature(owningOperation, context));
			}

			this.setBeforeLambdaExpressionResult("");

			result = kermeta.standard.helper.StringWrapper
					.plus(
							kermeta.standard.helper.StringWrapper
									.plus(
											result,
											((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil
													.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE
															.getCompilerHelperJava()))
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
		} else {

			org.kermeta.compil.runtime.helper.io.StdIOUtil
					.getInstance()
					.writeln(
							kermeta.standard.helper.StringWrapper
									.plus(
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			"A callSuperFunctionType has been detected: ",
																			owningOperation
																					.qualifiedName()),
															" - signature: "),
											this.getCallStaticSignature(
													owningOperation, context)));
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallStaticSignature(Operation owningOperation,
			KM2EcoreContext context) {

		java.lang.String result = null;

		result = "";

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
																																.asTypeSwitcher(
																																		org.kermeta.compil.runtime.helper.language.ObjectUtil
																																				.containerSwitcher(owningOperation
																																						.getSuperOperation()
																																						.getOwningClass()),
																																		org.kermeta.compil.runtime.ExecutionContext
																																				.getInstance()
																																				.getMetaClass(
																																						"kermeta.language.structure.Package")))
																																.qualifiedName(),
																														"::",
																														".")),
																						".helper."),
																		owningOperation
																				.getSuperOperation()
																				.getOwningClass()
																				.getName()),
														"Super.super_"),
										owningOperation.getSuperOperation()
												.getFinalName(context)), "(");

		java.lang.Boolean idIfCond_674 = false;
		idIfCond_674 = context.getStaticOperationMode();

		if (idIfCond_674) {

			result = kermeta.standard.helper.StringWrapper.plus(result, "self");
		} else {

			result = kermeta.standard.helper.StringWrapper.plus(result, "this");
		}

		java.lang.Boolean idIfCond_675 = false;
		idIfCond_675 = kermeta.standard.helper.IntegerWrapper
				.isGreater(
						org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<kermeta.language.behavior.Expression> convertAsOrderedSet(
										this.getParameters()).size(), 0);

		if (idIfCond_675) {

			result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
		}

		java.lang.Boolean idIfCond_676 = false;
		idIfCond_676 = context.getStaticOperationMode();

		if (idIfCond_676) {

			((kermeta.language.structure.ModelingUnit) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.language.structure.StructurePackage.eINSTANCE
							.getModelingUnit())).compileStaticOperation(
					owningOperation.getSuperOperation(), context);
		} else {

			org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Operation> convertAsOrderedSet(
							context.getMu()
									.getSuperOperationsToCompileInHelper())
					.add(owningOperation.getSuperOperation());
		}

		return result;

	}

} //CallSuperOperationImpl
