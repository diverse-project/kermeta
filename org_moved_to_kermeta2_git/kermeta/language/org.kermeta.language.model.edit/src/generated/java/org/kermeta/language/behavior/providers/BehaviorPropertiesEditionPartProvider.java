/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.behavior.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.forms.AssignmentPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.BlockPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.BooleanLiteralPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallEnumLiteralPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallFeaturePropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallOperationPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallPropertyPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallResultPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallSuperOperationPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallTypeLiteralPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallValuePropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.CallVariablePropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.ConditionalPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.EmptyExpressionPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.IntegerLiteralPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.JavaStaticCallPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.LambdaExpressionPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.LambdaParameterPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.LoopPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.RaisePropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.RescuePropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.SelfExpressionPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.StringLiteralPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.TypeReferencePropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.UnresolvedCallPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.VariableDeclPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.forms.VoidLiteralPropertiesEditionPartForm;
import org.kermeta.language.behavior.parts.impl.AssignmentPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.BlockPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.BooleanLiteralPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallEnumLiteralPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallFeaturePropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallOperationPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallPropertyPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallResultPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallSuperOperationPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallTypeLiteralPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallValuePropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.CallVariablePropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.ConditionalPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.EmptyExpressionPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.IntegerLiteralPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.JavaStaticCallPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.LambdaExpressionPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.LambdaParameterPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.LoopPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.RaisePropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.RescuePropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.SelfExpressionPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.StringLiteralPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.TypeReferencePropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.UnresolvedCallPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.VariableDeclPropertiesEditionPartImpl;
import org.kermeta.language.behavior.parts.impl.VoidLiteralPropertiesEditionPartImpl;




/**
 * @author Didier Vojtisek
 * 
 */
public class BehaviorPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == BehaviorViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == BehaviorViewsRepository.Assignment.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new AssignmentPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new AssignmentPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.Block.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new BlockPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new BlockPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallVariable.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallVariablePropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallVariablePropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallFeature.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallFeaturePropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallFeaturePropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallSuperOperation.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallSuperOperationPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallSuperOperationPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallResult.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallResultPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallResultPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallValue.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallValuePropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallValuePropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.Conditional.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new ConditionalPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new ConditionalPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.Raise.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new RaisePropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new RaisePropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.Rescue.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new RescuePropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new RescuePropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.TypeReference.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new TypeReferencePropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new TypeReferencePropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.EmptyExpression.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new EmptyExpressionPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new EmptyExpressionPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.JavaStaticCall.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new JavaStaticCallPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new JavaStaticCallPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.LambdaExpression.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new LambdaExpressionPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new LambdaExpressionPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.LambdaParameter.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new LambdaParameterPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new LambdaParameterPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.IntegerLiteral.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new IntegerLiteralPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new IntegerLiteralPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.StringLiteral.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new StringLiteralPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new StringLiteralPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.BooleanLiteral.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new BooleanLiteralPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new BooleanLiteralPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallTypeLiteral.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallTypeLiteralPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallTypeLiteralPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.VoidLiteral.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new VoidLiteralPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new VoidLiteralPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.Loop.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new LoopPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new LoopPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.SelfExpression.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new SelfExpressionPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new SelfExpressionPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.VariableDecl.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new VariableDeclPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new VariableDeclPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.UnresolvedCall.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new UnresolvedCallPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new UnresolvedCallPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallOperation.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallOperationPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallOperationPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallProperty.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallPropertyPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallPropertyPropertiesEditionPartForm(component);
		}
		if (key == BehaviorViewsRepository.CallEnumLiteral.class) {
			if (kind == BehaviorViewsRepository.SWT_KIND)
				return new CallEnumLiteralPropertiesEditionPartImpl(component);
			if (kind == BehaviorViewsRepository.FORM_KIND)
				return new CallEnumLiteralPropertiesEditionPartForm(component);
		}
		return null;
	}

}
