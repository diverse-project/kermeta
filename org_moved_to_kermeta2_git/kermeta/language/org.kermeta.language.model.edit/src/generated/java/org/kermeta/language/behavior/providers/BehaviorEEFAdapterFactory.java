/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.behavior.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.kermeta.language.behavior.util.BehaviorAdapterFactory;
import org.kermeta.language.structure.providers.KermetaModelElementPropertiesEditionProvider;
import org.kermeta.language.structure.providers.MultiplicityElementPropertiesEditionProvider;


/**
 * @author Didier Vojtisek
 * 
 */
public class BehaviorEEFAdapterFactory extends BehaviorAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createKermetaModelElementAdapter()
	 * 
	 */
	public Adapter createKermetaModelElementAdapter() {
		return new KermetaModelElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createAssignmentAdapter()
	 * 
	 */
	public Adapter createAssignmentAdapter() {
		return new AssignmentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createBlockAdapter()
	 * 
	 */
	public Adapter createBlockAdapter() {
		return new BlockPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallVariableAdapter()
	 * 
	 */
	public Adapter createCallVariableAdapter() {
		return new CallVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallFeatureAdapter()
	 * 
	 */
	public Adapter createCallFeatureAdapter() {
		return new CallFeaturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallOperationAdapter()
	 * 
	 */
	public Adapter createCallOperationAdapter() {
		return new CallOperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallSuperOperationAdapter()
	 * 
	 */
	public Adapter createCallSuperOperationAdapter() {
		return new CallSuperOperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallResultAdapter()
	 * 
	 */
	public Adapter createCallResultAdapter() {
		return new CallResultPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallValueAdapter()
	 * 
	 */
	public Adapter createCallValueAdapter() {
		return new CallValuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createConditionalAdapter()
	 * 
	 */
	public Adapter createConditionalAdapter() {
		return new ConditionalPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createRaiseAdapter()
	 * 
	 */
	public Adapter createRaiseAdapter() {
		return new RaisePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createRescueAdapter()
	 * 
	 */
	public Adapter createRescueAdapter() {
		return new RescuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createMultiplicityElementAdapter()
	 * 
	 */
	public Adapter createMultiplicityElementAdapter() {
		return new MultiplicityElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createTypeReferenceAdapter()
	 * 
	 */
	public Adapter createTypeReferenceAdapter() {
		return new TypeReferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createEmptyExpressionAdapter()
	 * 
	 */
	public Adapter createEmptyExpressionAdapter() {
		return new EmptyExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createJavaStaticCallAdapter()
	 * 
	 */
	public Adapter createJavaStaticCallAdapter() {
		return new JavaStaticCallPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createLambdaExpressionAdapter()
	 * 
	 */
	public Adapter createLambdaExpressionAdapter() {
		return new LambdaExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createLambdaParameterAdapter()
	 * 
	 */
	public Adapter createLambdaParameterAdapter() {
		return new LambdaParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createIntegerLiteralAdapter()
	 * 
	 */
	public Adapter createIntegerLiteralAdapter() {
		return new IntegerLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createStringLiteralAdapter()
	 * 
	 */
	public Adapter createStringLiteralAdapter() {
		return new StringLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createBooleanLiteralAdapter()
	 * 
	 */
	public Adapter createBooleanLiteralAdapter() {
		return new BooleanLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallTypeLiteralAdapter()
	 * 
	 */
	public Adapter createCallTypeLiteralAdapter() {
		return new CallTypeLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createVoidLiteralAdapter()
	 * 
	 */
	public Adapter createVoidLiteralAdapter() {
		return new VoidLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createLoopAdapter()
	 * 
	 */
	public Adapter createLoopAdapter() {
		return new LoopPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createSelfExpressionAdapter()
	 * 
	 */
	public Adapter createSelfExpressionAdapter() {
		return new SelfExpressionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createVariableDeclAdapter()
	 * 
	 */
	public Adapter createVariableDeclAdapter() {
		return new VariableDeclPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createUnresolvedCallAdapter()
	 * 
	 */
	public Adapter createUnresolvedCallAdapter() {
		return new UnresolvedCallPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallPropertyAdapter()
	 * 
	 */
	public Adapter createCallPropertyAdapter() {
		return new CallPropertyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.behavior.util.BehaviorAdapterFactory#createCallEnumLiteralAdapter()
	 * 
	 */
	public Adapter createCallEnumLiteralAdapter() {
		return new CallEnumLiteralPropertiesEditionProvider();
	}

}
