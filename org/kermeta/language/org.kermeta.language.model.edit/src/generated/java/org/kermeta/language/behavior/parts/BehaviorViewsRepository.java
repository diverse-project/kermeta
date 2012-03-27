/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.behavior.parts;

/**
 * @author Didier Vojtisek
 * 
 */
public class BehaviorViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Assignment view descriptor
	 * 
	 */
	public static class Assignment {
		public static class Properties {
	
			
			public static String kTag = "behavior::Assignment::properties::kTag";
			
			
			public static String kType = "behavior::Assignment::properties::kType";
			
			
			public static String staticType = "behavior::Assignment::properties::staticType";
			
			
			public static String isCast = "behavior::Assignment::properties::isCast";
			
	
		}
	
	}

	/**
	 * Block view descriptor
	 * 
	 */
	public static class Block {
		public static class Properties {
	
			
			public static String kTag = "behavior::Block::properties::kTag";
			
			
			public static String kType = "behavior::Block::properties::kType";
			
			
			public static String staticType = "behavior::Block::properties::staticType";
			
	
		}
	
	}

	/**
	 * CallVariable view descriptor
	 * 
	 */
	public static class CallVariable {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallVariable::properties::kTag";
			
			
			public static String kType = "behavior::CallVariable::properties::kType";
			
			
			public static String staticType = "behavior::CallVariable::properties::staticType";
			
			
			public static String name = "behavior::CallVariable::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallVariable::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::CallVariable::properties::isAtpre";
			
	
		}
	
	}

	/**
	 * CallFeature view descriptor
	 * 
	 */
	public static class CallFeature {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallFeature::properties::kTag";
			
			
			public static String kType = "behavior::CallFeature::properties::kType";
			
			
			public static String staticType = "behavior::CallFeature::properties::staticType";
			
			
			public static String name = "behavior::CallFeature::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallFeature::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::CallFeature::properties::isAtpre";
			
	
		}
	
	}

	/**
	 * CallSuperOperation view descriptor
	 * 
	 */
	public static class CallSuperOperation {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallSuperOperation::properties::kTag";
			
			
			public static String kType = "behavior::CallSuperOperation::properties::kType";
			
			
			public static String staticType = "behavior::CallSuperOperation::properties::staticType";
			
			
			public static String name = "behavior::CallSuperOperation::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallSuperOperation::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::CallSuperOperation::properties::isAtpre";
			
			
			public static String staticOperation = "behavior::CallSuperOperation::properties::staticOperation";
			
	
		}
	
	}

	/**
	 * CallResult view descriptor
	 * 
	 */
	public static class CallResult {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallResult::properties::kTag";
			
			
			public static String kType = "behavior::CallResult::properties::kType";
			
			
			public static String staticType = "behavior::CallResult::properties::staticType";
			
			
			public static String name = "behavior::CallResult::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallResult::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::CallResult::properties::isAtpre";
			
	
		}
	
	}

	/**
	 * CallValue view descriptor
	 * 
	 */
	public static class CallValue {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallValue::properties::kTag";
			
			
			public static String kType = "behavior::CallValue::properties::kType";
			
			
			public static String staticType = "behavior::CallValue::properties::staticType";
			
			
			public static String name = "behavior::CallValue::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallValue::properties::staticTypeVariableBindings";
			
	
		}
	
	}

	/**
	 * Conditional view descriptor
	 * 
	 */
	public static class Conditional {
		public static class Properties {
	
			
			public static String kTag = "behavior::Conditional::properties::kTag";
			
			
			public static String kType = "behavior::Conditional::properties::kType";
			
			
			public static String staticType = "behavior::Conditional::properties::staticType";
			
	
		}
	
	}

	/**
	 * Raise view descriptor
	 * 
	 */
	public static class Raise {
		public static class Properties {
	
			
			public static String kTag = "behavior::Raise::properties::kTag";
			
			
			public static String kType = "behavior::Raise::properties::kType";
			
			
			public static String staticType = "behavior::Raise::properties::staticType";
			
	
		}
	
	}

	/**
	 * Rescue view descriptor
	 * 
	 */
	public static class Rescue {
		public static class Properties {
	
			
			public static String kTag = "behavior::Rescue::properties::kTag";
			
			
			public static String kType = "behavior::Rescue::properties::kType";
			
			
			public static String exceptionName = "behavior::Rescue::properties::exceptionName";
			
	
		}
	
	}

	/**
	 * TypeReference view descriptor
	 * 
	 */
	public static class TypeReference {
		public static class Properties {
	
			
			public static String kTag = "behavior::TypeReference::properties::kTag";
			
			
			public static String kType = "behavior::TypeReference::properties::kType";
			
			
			public static String name = "behavior::TypeReference::properties::name";
			
			
			public static String type = "behavior::TypeReference::properties::type";
			
			
			public static String isOrdered = "behavior::TypeReference::properties::isOrdered";
			
			
			public static String isUnique = "behavior::TypeReference::properties::isUnique";
			
			
			public static String lower = "behavior::TypeReference::properties::lower";
			
			
			public static String upper = "behavior::TypeReference::properties::upper";
			
	
		}
	
	}

	/**
	 * EmptyExpression view descriptor
	 * 
	 */
	public static class EmptyExpression {
		public static class Properties {
	
			
			public static String kTag = "behavior::EmptyExpression::properties::kTag";
			
			
			public static String kType = "behavior::EmptyExpression::properties::kType";
			
			
			public static String staticType = "behavior::EmptyExpression::properties::staticType";
			
	
		}
	
	}

	/**
	 * JavaStaticCall view descriptor
	 * 
	 */
	public static class JavaStaticCall {
		public static class Properties {
	
			
			public static String kTag = "behavior::JavaStaticCall::properties::kTag";
			
			
			public static String kType = "behavior::JavaStaticCall::properties::kType";
			
			
			public static String staticType = "behavior::JavaStaticCall::properties::staticType";
			
			
			public static String jclass = "behavior::JavaStaticCall::properties::jclass";
			
			
			public static String jmethod = "behavior::JavaStaticCall::properties::jmethod";
			
	
		}
	
	}

	/**
	 * LambdaExpression view descriptor
	 * 
	 */
	public static class LambdaExpression {
		public static class Properties {
	
			
			public static String kTag = "behavior::LambdaExpression::properties::kTag";
			
			
			public static String kType = "behavior::LambdaExpression::properties::kType";
			
			
			public static String staticType = "behavior::LambdaExpression::properties::staticType";
			
	
		}
	
	}

	/**
	 * LambdaParameter view descriptor
	 * 
	 */
	public static class LambdaParameter {
		public static class Properties {
	
			
			public static String kTag = "behavior::LambdaParameter::properties::kTag";
			
			
			public static String kType = "behavior::LambdaParameter::properties::kType";
			
			
			public static String name = "behavior::LambdaParameter::properties::name";
			
	
		}
	
	}

	/**
	 * IntegerLiteral view descriptor
	 * 
	 */
	public static class IntegerLiteral {
		public static class Properties {
	
			
			public static String kTag = "behavior::IntegerLiteral::properties::kTag";
			
			
			public static String kType = "behavior::IntegerLiteral::properties::kType";
			
			
			public static String staticType = "behavior::IntegerLiteral::properties::staticType";
			
			
			public static String value = "behavior::IntegerLiteral::properties::value";
			
	
		}
	
	}

	/**
	 * StringLiteral view descriptor
	 * 
	 */
	public static class StringLiteral {
		public static class Properties {
	
			
			public static String kTag = "behavior::StringLiteral::properties::kTag";
			
			
			public static String kType = "behavior::StringLiteral::properties::kType";
			
			
			public static String staticType = "behavior::StringLiteral::properties::staticType";
			
			
			public static String value = "behavior::StringLiteral::properties::value";
			
	
		}
	
	}

	/**
	 * BooleanLiteral view descriptor
	 * 
	 */
	public static class BooleanLiteral {
		public static class Properties {
	
			
			public static String kTag = "behavior::BooleanLiteral::properties::kTag";
			
			
			public static String kType = "behavior::BooleanLiteral::properties::kType";
			
			
			public static String staticType = "behavior::BooleanLiteral::properties::staticType";
			
			
			public static String value = "behavior::BooleanLiteral::properties::value";
			
	
		}
	
	}

	/**
	 * CallTypeLiteral view descriptor
	 * 
	 */
	public static class CallTypeLiteral {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallTypeLiteral::properties::kTag";
			
			
			public static String kType = "behavior::CallTypeLiteral::properties::kType";
			
			
			public static String staticType = "behavior::CallTypeLiteral::properties::staticType";
			
	
		}
	
	}

	/**
	 * VoidLiteral view descriptor
	 * 
	 */
	public static class VoidLiteral {
		public static class Properties {
	
			
			public static String kTag = "behavior::VoidLiteral::properties::kTag";
			
			
			public static String kType = "behavior::VoidLiteral::properties::kType";
			
			
			public static String staticType = "behavior::VoidLiteral::properties::staticType";
			
	
		}
	
	}

	/**
	 * Loop view descriptor
	 * 
	 */
	public static class Loop {
		public static class Properties {
	
			
			public static String kTag = "behavior::Loop::properties::kTag";
			
			
			public static String kType = "behavior::Loop::properties::kType";
			
			
			public static String staticType = "behavior::Loop::properties::staticType";
			
	
		}
	
	}

	/**
	 * SelfExpression view descriptor
	 * 
	 */
	public static class SelfExpression {
		public static class Properties {
	
			
			public static String kTag = "behavior::SelfExpression::properties::kTag";
			
			
			public static String kType = "behavior::SelfExpression::properties::kType";
			
			
			public static String staticType = "behavior::SelfExpression::properties::staticType";
			
	
		}
	
	}

	/**
	 * VariableDecl view descriptor
	 * 
	 */
	public static class VariableDecl {
		public static class Properties {
	
			
			public static String kTag = "behavior::VariableDecl::properties::kTag";
			
			
			public static String kType = "behavior::VariableDecl::properties::kType";
			
			
			public static String staticType = "behavior::VariableDecl::properties::staticType";
			
			
			public static String identifier = "behavior::VariableDecl::properties::identifier";
			
	
		}
	
	}

	/**
	 * UnresolvedCall view descriptor
	 * 
	 */
	public static class UnresolvedCall {
		public static class Properties {
	
			
			public static String kTag = "behavior::UnresolvedCall::properties::kTag";
			
			
			public static String kType = "behavior::UnresolvedCall::properties::kType";
			
			
			public static String staticType = "behavior::UnresolvedCall::properties::staticType";
			
			
			public static String name = "behavior::UnresolvedCall::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::UnresolvedCall::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::UnresolvedCall::properties::isAtpre";
			
			
			public static String targetParent = "behavior::UnresolvedCall::properties::targetParent";
			
			
			public static String generics = "behavior::UnresolvedCall::properties::generics";
			
			
			public static String isCalledWithParenthesis = "behavior::UnresolvedCall::properties::isCalledWithParenthesis";
			
	
		}
	
	}

	/**
	 * CallOperation view descriptor
	 * 
	 */
	public static class CallOperation {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallOperation::properties::kTag";
			
			
			public static String kType = "behavior::CallOperation::properties::kType";
			
			
			public static String staticType = "behavior::CallOperation::properties::staticType";
			
			
			public static String name = "behavior::CallOperation::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallOperation::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::CallOperation::properties::isAtpre";
			
			
			public static String staticOperation = "behavior::CallOperation::properties::staticOperation";
			
	
		}
	
	}

	/**
	 * CallProperty view descriptor
	 * 
	 */
	public static class CallProperty {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallProperty::properties::kTag";
			
			
			public static String kType = "behavior::CallProperty::properties::kType";
			
			
			public static String staticType = "behavior::CallProperty::properties::staticType";
			
			
			public static String name = "behavior::CallProperty::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallProperty::properties::staticTypeVariableBindings";
			
			
			public static String isAtpre = "behavior::CallProperty::properties::isAtpre";
			
			
			public static String staticProperty = "behavior::CallProperty::properties::staticProperty";
			
	
		}
	
	}

	/**
	 * CallEnumLiteral view descriptor
	 * 
	 */
	public static class CallEnumLiteral {
		public static class Properties {
	
			
			public static String kTag = "behavior::CallEnumLiteral::properties::kTag";
			
			
			public static String kType = "behavior::CallEnumLiteral::properties::kType";
			
			
			public static String staticType = "behavior::CallEnumLiteral::properties::staticType";
			
			
			public static String name = "behavior::CallEnumLiteral::properties::name";
			
			
			public static String staticTypeVariableBindings = "behavior::CallEnumLiteral::properties::staticTypeVariableBindings";
			
			
			public static String staticEnumLiteral = "behavior::CallEnumLiteral::properties::staticEnumLiteral";
			
	
		}
	
	}

}
