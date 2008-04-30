

/*$Id: KermetaModelHelper.java,v 1.9 2008-04-30 14:11:31 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	KermetaModelHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.model;

import java.util.Collection;
import java.util.List;

import org.kermeta.model.internal.ClassDefinitionHelper;
import org.kermeta.model.internal.ConstraintHelper;
import org.kermeta.model.internal.EnumerationHelper;
import org.kermeta.model.internal.EnumerationLiteralHelper;
import org.kermeta.model.internal.ModelTypeHelper;
import org.kermeta.model.internal.NamedElementHelper;
import org.kermeta.model.internal.ObjectTypeVariableHelper;
import org.kermeta.model.internal.OperationHelper;
import org.kermeta.model.internal.PackageHelper;
import org.kermeta.model.internal.ParameterHelper;
import org.kermeta.model.internal.PrimitiveTypeHelper;
import org.kermeta.model.internal.PropertyHelper;
import org.kermeta.model.internal.TagHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;


public class KermetaModelHelper {
	
	/*
	 * 
	 * Named Element
	 * 
	 */
	final static public NamedElementProxy NamedElement = new NamedElementProxy();
	
	static public class NamedElementProxy {
		
		/**
		 * 
		 * @see NamedElementHelper#qualifiedName(NamedElement)
		 * 
		 */
		public String qualifiedName(NamedElement element) {
			return NamedElementHelper.qualifiedName(element);
		}
		
		/**
		 * 
		 * @see NamedElementHelper#qualifiedName(NamedElement, String)
		 * 
		 */
		public String qualifiedName(NamedElement element, String separator) {
			return NamedElementHelper.qualifiedName(element, separator);
		}
		
	}
	
	
	/*
	 * 
	 * Primitive Type
	 * 
	 */
	final static public PrimitiveTypeProxy PrimitiveType = new PrimitiveTypeProxy();
	
	static public class PrimitiveTypeProxy extends NamedElementHelper {

		/**
		 *
		 * @see PrimitiveTypeHelper#create(String)
		 * 
		 */
		public PrimitiveType create(String name) {
			return PrimitiveTypeHelper.create(name);
		}
		
		/**
		 *
		 * @see PrimitiveTypeHelper#create(String, Type)
		 * 
		 */
		public PrimitiveType create(String name, Type type) {
			return PrimitiveTypeHelper.create(name, type);
		}

		/**
		 *
		 * @see PrimitiveTypeHelper#resolvePrimitiveType(PrimitiveType)
		 * 
		 */
		public Type resolvePrimitiveType(PrimitiveType inputType) {
			return PrimitiveTypeHelper.resolvePrimitiveType(inputType);
		}
	}
	
	
	/*
	 * 
	 * Package
	 * 
	 */
	final static public PackageProxy Package = new PackageProxy();
	
	static public class PackageProxy  extends NamedElementProxy {
		
		public Package create(String name) {
			return PackageHelper.create(name);
		}
		
		public Package create(String name, String uri) {
			return PackageHelper.create(name, uri);
		}
		
	}
	
	/*
	 * 
	 * ModelType
	 * 
	 */
	final static public ModelTypeProxy ModelType = new ModelTypeProxy();
	
	static public class ModelTypeProxy  extends NamedElementProxy {
		
		public ModelType create(String name) {
			return ModelTypeHelper.create(name);
		}

	}
	
	
	/*
	 * 
	 * Tag
	 * 
	 */
	final static public TagProxy Tag = new TagProxy();
	
	static public class TagProxy  extends NamedElementProxy {
		
		public String KERMETA_DOCUMENTATION = TagHelper.KERMETA_DOCUMENTATION;
		
		public Tag create(String qualifiedName) {
			return TagHelper.create(qualifiedName);
		}
		
		public Tag create(String qualifiedName, String value) {
			return TagHelper.create(qualifiedName, value);
		}
		
		public Tag getTag(Object o, String tagName) {
			return TagHelper.getTag(o, tagName);
		}
	}
	
	
	/*
	 * 
	 * ClassDefinition
	 * 
	 */
	final static public ClassDefinitionProxy ClassDefinition = new ClassDefinitionProxy();
	
	static public class ClassDefinitionProxy  extends NamedElementProxy {

		public ClassDefinition create(String name) {
			return ClassDefinitionHelper.create(name);
		}
		
		public ClassDefinition create(String name, boolean isAbstract) {
			return ClassDefinitionHelper.create(name, isAbstract);
		}
		
		public ClassDefinition create(String name, boolean isAbstract, boolean isAspect) {
			return ClassDefinitionHelper.create(name, isAbstract, isAspect);
		}
		
		public List<Operation> getSuperOperations(ClassDefinition base, String operationName) {
			return ClassDefinitionHelper.getSuperOperations(base, operationName);
		}
				
		public Operation getSuperOperation(ClassDefinition base, String superClassQualifiedName, String operationName) {
			return ClassDefinitionHelper.getSuperOperation(base, superClassQualifiedName, operationName);
		}
		
		public Collection<TypeDefinition> getContext(ClassDefinition c) {
			return ClassDefinitionHelper.getContext(c);
		}
		
		public Collection<TypeDefinition> getFullContext(ClassDefinition c) {
			return ClassDefinitionHelper.getFullContext(c);
		}
				
		public Property getPropertyByName(ClassDefinition c, String name) {
			return ClassDefinitionHelper.getPropertyByName(c, name);
		}
		
		public List<Property> getAllProperties(ClassDefinition cls) {
			return ClassDefinitionHelper.getAllProperties(cls);
		}
		
		public List<Property> getAllPropertiesWithOpposite(ClassDefinition cls) {
			return ClassDefinitionHelper.getAllPropertiesWithOpposite(cls);
		}
		
		public Operation getOperationByName(ClassDefinition c, String name) {
			return ClassDefinitionHelper.getOperationByName(c, name);
		}
		
		public List<Operation> getAllOperations(ClassDefinition cls) {
			return ClassDefinitionHelper.getAllOperations(cls);
		}
		
		public List<Constraint> getAllInvariants(ClassDefinition cls) {
			return ClassDefinitionHelper.getAllInvariants(cls);
		}
		
		public TypeVariable getTypeParameter(ClassDefinition cls, String name) {
			return ClassDefinitionHelper.getTypeParameter(cls, name);
		}
		
		public boolean isCollection(ClassDefinition c) {
			return ClassDefinitionHelper.isCollection(c);
		}
		
		public boolean isSuperTypeOf(ClassDefinition superclass, ClassDefinition clazz) {
			return ClassDefinitionHelper.isSuperTypeOf(superclass, clazz);			
		}

	}
	
	
	/*
	 * 
	 * Enumeration
	 * 
	 */
	final static public EnumerationProxy Enumeration = new EnumerationProxy();
	
	static public class EnumerationProxy  extends NamedElementProxy {
		
		public Enumeration create(String name) {
			return EnumerationHelper.create(name);
		}
		
		public EnumerationLiteral getLiteral(Enumeration enumeration, String name) {
			return EnumerationHelper.getLiteral(enumeration, name);
		}
		
	}
	
	
	/*
	 * 
	 * Constraint
	 * 
	 */
	final static public ConstraintProxy Constraint = new ConstraintProxy();
	
	static public class ConstraintProxy  extends NamedElementProxy {
		
		public Constraint createInvariant(String name) {
			return ConstraintHelper.createInvariant(name);
		}
		
		public Constraint createPostcondition(String name) {
			return ConstraintHelper.createPostcondition(name);
		}
		
		public Constraint createPrecondition(String name) {
			return ConstraintHelper.createPrecondition(name);
		}
		
	}

	
	/*
	 * 
	 * Operation
	 * 
	 */
	final static public OperationProxy Operation = new OperationProxy();
	
	static public class OperationProxy  extends NamedElementProxy {
		
		public Operation create(String name) {
			return OperationHelper.create(name);
		}
		
		public Operation create(String name, boolean isAbstract) {
			return OperationHelper.create(name, isAbstract);
		}
		
		public Parameter getParameter(Operation op, String parameterName) {
			return OperationHelper.getParameter(op, parameterName);
		}
		
		public TypeVariable getTypeVariable(Operation op, String name) {
			return OperationHelper.getTypeVariable(op, name);
		}
		
		public List<Operation> getSuperOperations(Operation op) {
			return OperationHelper.getSuperOperations(op);
		}
		public List<Constraint> getAllPreconditions(Operation op) {
			return OperationHelper.getAllPreconditions(op);
		}
		
		public List<Constraint> getAllPostconditions(Operation op) {
			return OperationHelper.getAllPostconditions(op);
		}
	}
	
	
	/*
	 * 
	 * Property
	 * 
	 */
	final static public PropertyProxy Property = new PropertyProxy();
	
	static public class PropertyProxy  extends NamedElementProxy {
		
		final public String ATTRIBUTE_KIND = "attribute";

		final public String REFERENCE_KIND = "reference";

		final public String PROPERTY_KIND = "property";
		
		public Property create(String name) {
			return PropertyHelper.create(name);
		}
		
		public Property createDerived(String name, boolean isReadOnly, boolean isGetterAbstract, boolean isSetterAbstract) {
			return PropertyHelper.createDerived(name, isReadOnly, isGetterAbstract, isSetterAbstract);
		}
		
	}
	
	
	/*
	 * 
	 * Parameter
	 * 
	 */
	final static public ParameterProxy Parameter = new ParameterProxy();
	
	static public class ParameterProxy  extends NamedElementProxy {
		
		public Parameter create(String name) {
			return ParameterHelper.create(name);
		}
		
	}


	/*
	 * 
	 * EnumerationLiteral
	 * 
	 */
	final static public EnumerationLiteralProxy EnumerationLiteral = new EnumerationLiteralProxy();
	
	static public class EnumerationLiteralProxy  extends NamedElementProxy {
		
		public EnumerationLiteral create(String name) {
			return EnumerationLiteralHelper.create(name);
		}
		
	}
	
	
	/*
	 * 
	 * ObjectTypeVariable
	 * 
	 */
	final static public ObjectTypeVariableProxy ObjectTypeVariable = new ObjectTypeVariableProxy();
	
	static public class ObjectTypeVariableProxy  extends NamedElementProxy {
		
		public ObjectTypeVariable create(String name) {
			return ObjectTypeVariableHelper.create(name);
		}
		
	}
}


