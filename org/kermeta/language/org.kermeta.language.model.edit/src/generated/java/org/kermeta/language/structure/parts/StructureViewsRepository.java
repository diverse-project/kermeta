/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.parts;

/**
 * @author Didier Vojtisek
 * 
 */
public class StructureViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * KermetaModelElement view descriptor
	 * 
	 */
	public static class KermetaModelElement {
		public static class Properties {
	
			
			public static String kTag = "structure::KermetaModelElement::properties::kTag";
			
			
			public static String kType = "structure::KermetaModelElement::properties::kType";
			
	
		}
	
	}

	/**
	 * Operation view descriptor
	 * 
	 */
	public static class Operation {
		public static class Properties {
	
			
			public static String kTag = "structure::Operation::properties::kTag";
			
			
			public static String kType = "structure::Operation::properties::kType";
			
			
			public static String name = "structure::Operation::properties::name";
			
			
			public static String type = "structure::Operation::properties::type";
			
			
			public static String isOrdered = "structure::Operation::properties::isOrdered";
			
			
			public static String isUnique = "structure::Operation::properties::isUnique";
			
			
			public static String lower = "structure::Operation::properties::lower";
			
			
			public static String upper = "structure::Operation::properties::upper";
			
			
			public static String isAbstract = "structure::Operation::properties::isAbstract";
			
			
			public static String raisedException = "structure::Operation::properties::raisedException";
			
			
			public static String superOperation = "structure::Operation::properties::superOperation";
			
			
			public static String owningClass = "structure::Operation::properties::owningClass";
			
			
			public static String typeParameter = "structure::Operation::properties::typeParameter";
			
	
		}
	
	}

	/**
	 * Property view descriptor
	 * 
	 */
	public static class Property {
		public static class Properties {
	
			
			public static String kTag = "structure::Property::properties::kTag";
			
			
			public static String kType = "structure::Property::properties::kType";
			
			
			public static String name = "structure::Property::properties::name";
			
			
			public static String type = "structure::Property::properties::type";
			
			
			public static String isOrdered = "structure::Property::properties::isOrdered";
			
			
			public static String isUnique = "structure::Property::properties::isUnique";
			
			
			public static String lower = "structure::Property::properties::lower";
			
			
			public static String upper = "structure::Property::properties::upper";
			
			
			public static String opposite = "structure::Property::properties::opposite";
			
			
			public static String isReadOnly = "structure::Property::properties::isReadOnly";
			
			
			public static String default_ = "structure::Property::properties::default";
			
			
			public static String isComposite = "structure::Property::properties::isComposite";
			
			
			public static String isDerived = "structure::Property::properties::isDerived";
			
			
			public static String isID = "structure::Property::properties::isID";
			
			
			public static String isGetterAbstract = "structure::Property::properties::isGetterAbstract";
			
			
			public static String isSetterAbstract = "structure::Property::properties::isSetterAbstract";
			
			
			public static String owningClass = "structure::Property::properties::owningClass";
			
	
		}
	
	}

	/**
	 * EnumerationLiteral view descriptor
	 * 
	 */
	public static class EnumerationLiteral {
		public static class Properties {
	
			
			public static String kTag = "structure::EnumerationLiteral::properties::kTag";
			
			
			public static String kType = "structure::EnumerationLiteral::properties::kType";
			
			
			public static String name = "structure::EnumerationLiteral::properties::name";
			
			
			public static String enumeration = "structure::EnumerationLiteral::properties::enumeration";
			
	
		}
	
	}

	/**
	 * TypeVariableBinding view descriptor
	 * 
	 */
	public static class TypeVariableBinding {
		public static class Properties {
	
			
			public static String kTag = "structure::TypeVariableBinding::properties::kTag";
			
			
			public static String kType = "structure::TypeVariableBinding::properties::kType";
			
			
			public static String variable = "structure::TypeVariableBinding::properties::variable";
			
			
			public static String type = "structure::TypeVariableBinding::properties::type";
			
	
		}
	
	}

	/**
	 * MultiplicityElement view descriptor
	 * 
	 */
	public static class MultiplicityElement {
		public static class Properties {
	
			
			public static String kTag = "structure::MultiplicityElement::properties::kTag";
			
			
			public static String kType = "structure::MultiplicityElement::properties::kType";
			
			
			public static String name = "structure::MultiplicityElement::properties::name";
			
			
			public static String type = "structure::MultiplicityElement::properties::type";
			
			
			public static String isOrdered = "structure::MultiplicityElement::properties::isOrdered";
			
			
			public static String isUnique = "structure::MultiplicityElement::properties::isUnique";
			
			
			public static String lower = "structure::MultiplicityElement::properties::lower";
			
			
			public static String upper = "structure::MultiplicityElement::properties::upper";
			
	
		}
	
	}

	/**
	 * TypeDefinition view descriptor
	 * 
	 */
	public static class TypeDefinition {
		public static class Properties {
	
			
			public static String kTag = "structure::TypeDefinition::properties::kTag";
			
			
			public static String kType = "structure::TypeDefinition::properties::kType";
			
			
			public static String name = "structure::TypeDefinition::properties::name";
			
			
			public static String superType = "structure::TypeDefinition::properties::superType";
			
			
			public static String isAspect = "structure::TypeDefinition::properties::isAspect";
			
	
		}
	
	}

	/**
	 * Class view descriptor
	 * 
	 */
	public static class Class_ {
		public static class Properties {
	
			
			public static String kTag = "structure::Class::properties::kTag";
			
			
			public static String kType = "structure::Class::properties::kType";
			
			
			public static String typeContainer = "structure::Class::properties::typeContainer";
			
			
			public static String typeDefinition = "structure::Class::properties::typeDefinition";
			
	
		}
	
	}

	/**
	 * Enumeration view descriptor
	 * 
	 */
	public static class Enumeration {
		public static class Properties {
	
			
			public static String kTag = "structure::Enumeration::properties::kTag";
			
			
			public static String kType = "structure::Enumeration::properties::kType";
			
			
			public static String typeContainer = "structure::Enumeration::properties::typeContainer";
			
			
			public static String name = "structure::Enumeration::properties::name";
			
			
			public static String superType = "structure::Enumeration::properties::superType";
			
			
			public static String isAspect = "structure::Enumeration::properties::isAspect";
			
	
		}
	
	}

	/**
	 * Package view descriptor
	 * 
	 */
	public static class Package_ {
		public static class Properties {
	
			
			public static String kTag = "structure::Package::properties::kTag";
			
			
			public static String kType = "structure::Package::properties::kType";
			
			
			public static String name = "structure::Package::properties::name";
			
			
			public static String nestingPackage = "structure::Package::properties::nestingPackage";
			
			
			public static String uri = "structure::Package::properties::uri";
			
	
		}
	
	}

	/**
	 * Parameter view descriptor
	 * 
	 */
	public static class Parameter {
		public static class Properties {
	
			
			public static String kTag = "structure::Parameter::properties::kTag";
			
			
			public static String kType = "structure::Parameter::properties::kType";
			
			
			public static String name = "structure::Parameter::properties::name";
			
			
			public static String type = "structure::Parameter::properties::type";
			
			
			public static String isOrdered = "structure::Parameter::properties::isOrdered";
			
			
			public static String isUnique = "structure::Parameter::properties::isUnique";
			
			
			public static String lower = "structure::Parameter::properties::lower";
			
			
			public static String upper = "structure::Parameter::properties::upper";
			
			
			public static String operation = "structure::Parameter::properties::operation";
			
	
		}
	
	}

	/**
	 * PrimitiveType view descriptor
	 * 
	 */
	public static class PrimitiveType {
		public static class Properties {
	
			
			public static String kTag = "structure::PrimitiveType::properties::kTag";
			
			
			public static String kType = "structure::PrimitiveType::properties::kType";
			
			
			public static String typeContainer = "structure::PrimitiveType::properties::typeContainer";
			
			
			public static String name = "structure::PrimitiveType::properties::name";
			
			
			public static String superType = "structure::PrimitiveType::properties::superType";
			
			
			public static String isAspect = "structure::PrimitiveType::properties::isAspect";
			
			
			public static String instanceType = "structure::PrimitiveType::properties::instanceType";
			
	
		}
	
	}

	/**
	 * Tag view descriptor
	 * 
	 */
	public static class Tag {
		public static class Properties {
	
			
			public static String kTag = "structure::Tag::properties::kTag";
			
			
			public static String kType = "structure::Tag::properties::kType";
			
			
			public static String name = "structure::Tag::properties::name";
			
			
			public static String value = "structure::Tag::properties::value";
			
			
			public static String object = "structure::Tag::properties::object";
			
	
		}
	
	}

	/**
	 * Constraint view descriptor
	 * 
	 */
	public static class Constraint {
		public static class Properties {
	
			
			public static String kTag = "structure::Constraint::properties::kTag";
			
			
			public static String kType = "structure::Constraint::properties::kType";
			
			
			public static String name = "structure::Constraint::properties::name";
			
			
			public static String stereotype = "structure::Constraint::properties::stereotype";
			
			
			public static String language = "structure::Constraint::properties::language";
			
			
			public static String invOwner = "structure::Constraint::properties::invOwner";
			
			
			public static String preOwner = "structure::Constraint::properties::preOwner";
			
			
			public static String postOwner = "structure::Constraint::properties::postOwner";
			
	
		}
	
	}

	/**
	 * ClassDefinition view descriptor
	 * 
	 */
	public static class ClassDefinition {
		public static class Properties {
	
			
			public static String kTag = "structure::ClassDefinition::properties::kTag";
			
			
			public static String kType = "structure::ClassDefinition::properties::kType";
			
			
			public static String name = "structure::ClassDefinition::properties::name";
			
			
			public static String superType = "structure::ClassDefinition::properties::superType";
			
			
			public static String isAspect = "structure::ClassDefinition::properties::isAspect";
			
			
			public static String typeParameter = "structure::ClassDefinition::properties::typeParameter";
			
			
			public static String isAbstract = "structure::ClassDefinition::properties::isAbstract";
			
			
			public static String isSingleton = "structure::ClassDefinition::properties::isSingleton";
			
	
		}
	
	}

	/**
	 * ModelingUnit view descriptor
	 * 
	 */
	public static class ModelingUnit {
		public static class Properties {
	
			
			public static String kTag = "structure::ModelingUnit::properties::kTag";
			
			
			public static String kType = "structure::ModelingUnit::properties::kType";
			
			
			public static String name = "structure::ModelingUnit::properties::name";
			
			
			public static String namespacePrefix = "structure::ModelingUnit::properties::namespacePrefix";
			
	
		}
	
	}

	/**
	 * TypeDefinitionContainer view descriptor
	 * 
	 */
	public static class TypeDefinitionContainer {
		public static class Properties {
	
			
			public static String kTag = "structure::TypeDefinitionContainer::properties::kTag";
			
			
			public static String kType = "structure::TypeDefinitionContainer::properties::kType";
			
			
			public static String name = "structure::TypeDefinitionContainer::properties::name";
			
	
		}
	
	}

	/**
	 * Require view descriptor
	 * 
	 */
	public static class Require {
		public static class Properties {
	
			
			public static String kTag = "structure::Require::properties::kTag";
			
			
			public static String kType = "structure::Require::properties::kType";
			
			
			public static String uri = "structure::Require::properties::uri";
			
	
		}
	
	}

	/**
	 * ObjectTypeVariable view descriptor
	 * 
	 */
	public static class ObjectTypeVariable {
		public static class Properties {
	
			
			public static String kTag = "structure::ObjectTypeVariable::properties::kTag";
			
			
			public static String kType = "structure::ObjectTypeVariable::properties::kType";
			
			
			public static String typeContainer = "structure::ObjectTypeVariable::properties::typeContainer";
			
			
			public static String name = "structure::ObjectTypeVariable::properties::name";
			
			
			public static String supertype = "structure::ObjectTypeVariable::properties::supertype";
			
	
		}
	
	}

	/**
	 * ModelType view descriptor
	 * 
	 */
	public static class ModelType {
		public static class Properties {
	
			
			public static String kTag = "structure::ModelType::properties::kTag";
			
			
			public static String kType = "structure::ModelType::properties::kType";
			
			
			public static String typeContainer = "structure::ModelType::properties::typeContainer";
			
			
			public static String name = "structure::ModelType::properties::name";
			
			
			public static String superType = "structure::ModelType::properties::superType";
			
			
			public static String isAspect = "structure::ModelType::properties::isAspect";
			
			
			public static String contents = "structure::ModelType::properties::contents";
			
	
		}
	
	}

	/**
	 * ModelTypeVariable view descriptor
	 * 
	 */
	public static class ModelTypeVariable {
		public static class Properties {
	
			
			public static String kTag = "structure::ModelTypeVariable::properties::kTag";
			
			
			public static String kType = "structure::ModelTypeVariable::properties::kType";
			
			
			public static String typeContainer = "structure::ModelTypeVariable::properties::typeContainer";
			
			
			public static String name = "structure::ModelTypeVariable::properties::name";
			
			
			public static String supertype = "structure::ModelTypeVariable::properties::supertype";
			
	
		}
	
	}

	/**
	 * VirtualType view descriptor
	 * 
	 */
	public static class VirtualType {
		public static class Properties {
	
			
			public static String kTag = "structure::VirtualType::properties::kTag";
			
			
			public static String kType = "structure::VirtualType::properties::kType";
			
			
			public static String typeContainer = "structure::VirtualType::properties::typeContainer";
			
			
			public static String name = "structure::VirtualType::properties::name";
			
			
			public static String supertype = "structure::VirtualType::properties::supertype";
			
			
			public static String classDefinition = "structure::VirtualType::properties::classDefinition";
			
			
			public static String modelType = "structure::VirtualType::properties::modelType";
			
	
		}
	
	}

	/**
	 * Model view descriptor
	 * 
	 */
	public static class Model {
		public static class Properties {
	
			
			public static String kTag = "structure::Model::properties::kTag";
			
			
			public static String kType = "structure::Model::properties::kType";
			
			
			public static String contents = "structure::Model::properties::contents";
			
	
		}
	
	}

	/**
	 * UnresolvedType view descriptor
	 * 
	 */
	public static class UnresolvedType {
		public static class Properties {
	
			
			public static String kTag = "structure::UnresolvedType::properties::kTag";
			
			
			public static String kType = "structure::UnresolvedType::properties::kType";
			
			
			public static String typeContainer = "structure::UnresolvedType::properties::typeContainer";
			
			
			public static String generics = "structure::UnresolvedType::properties::generics";
			
			
			public static String typeIdentifier = "structure::UnresolvedType::properties::typeIdentifier";
			
	
		}
	
	}

	/**
	 * UnresolvedProperty view descriptor
	 * 
	 */
	public static class UnresolvedProperty {
		public static class Properties {
	
			
			public static String kTag = "structure::UnresolvedProperty::properties::kTag";
			
			
			public static String kType = "structure::UnresolvedProperty::properties::kType";
			
			
			public static String propertyIdentifier = "structure::UnresolvedProperty::properties::propertyIdentifier";
			
	
		}
	
	}

	/**
	 * UnresolvedOperation view descriptor
	 * 
	 */
	public static class UnresolvedOperation {
		public static class Properties {
	
			
			public static String kTag = "structure::UnresolvedOperation::properties::kTag";
			
			
			public static String kType = "structure::UnresolvedOperation::properties::kType";
			
			
			public static String operationIdentifier = "structure::UnresolvedOperation::properties::operationIdentifier";
			
			
			public static String from = "structure::UnresolvedOperation::properties::from";
			
	
		}
	
	}

	/**
	 * Using view descriptor
	 * 
	 */
	public static class Using {
		public static class Properties {
	
			
			public static String kTag = "structure::Using::properties::kTag";
			
			
			public static String kType = "structure::Using::properties::kType";
			
			
			public static String fromQName = "structure::Using::properties::fromQName";
			
			
			public static String toName = "structure::Using::properties::toName";
			
	
		}
	
	}

	/**
	 * ProductType view descriptor
	 * 
	 */
	public static class ProductType {
		public static class Properties {
	
			
			public static String kTag = "structure::ProductType::properties::kTag";
			
			
			public static String kType = "structure::ProductType::properties::kType";
			
			
			public static String typeContainer = "structure::ProductType::properties::typeContainer";
			
			
			public static String type = "structure::ProductType::properties::type";
			
	
		}
	
	}

	/**
	 * FunctionType view descriptor
	 * 
	 */
	public static class FunctionType {
		public static class Properties {
	
			
			public static String kTag = "structure::FunctionType::properties::kTag";
			
			
			public static String kType = "structure::FunctionType::properties::kType";
			
			
			public static String typeContainer = "structure::FunctionType::properties::typeContainer";
			
			
			public static String left = "structure::FunctionType::properties::left";
			
			
			public static String right = "structure::FunctionType::properties::right";
			
	
		}
	
	}

	/**
	 * VoidType view descriptor
	 * 
	 */
	public static class VoidType {
		public static class Properties {
	
			
			public static String kTag = "structure::VoidType::properties::kTag";
			
			
			public static String kType = "structure::VoidType::properties::kType";
			
			
			public static String typeContainer = "structure::VoidType::properties::typeContainer";
			
	
		}
	
	}

	/**
	 * TypeMapping view descriptor
	 * 
	 */
	public static class TypeMapping {
		public static class Properties {
	
			
			public static String kTag = "structure::TypeMapping::properties::kTag";
			
			
			public static String kType = "structure::TypeMapping::properties::kType";
			
			
			public static String targetType = "structure::TypeMapping::properties::targetType";
			
			
			public static String sourceType = "structure::TypeMapping::properties::sourceType";
			
	
		}
	
	}

	/**
	 * UnresolvedInferredType view descriptor
	 * 
	 */
	public static class UnresolvedInferredType {
		public static class Properties {
	
			
			public static String kTag = "structure::UnresolvedInferredType::properties::kTag";
			
			
			public static String kType = "structure::UnresolvedInferredType::properties::kType";
			
			
			public static String typeContainer = "structure::UnresolvedInferredType::properties::typeContainer";
			
	
		}
	
	}

}
