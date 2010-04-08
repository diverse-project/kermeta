

/*$Id: SetTypesPass.java,v 1.5 2008-03-05 07:56:06 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	SetTypesPass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.kermetaunitloader.kmt;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMT2KMTypeBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;
import fr.irisa.triskell.kermeta.parser.gen.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.Operation;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationBody;
import fr.irisa.triskell.kermeta.parser.gen.ast.Param;
import fr.irisa.triskell.kermeta.parser.gen.ast.Property;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeRef;
import fr.irisa.triskell.kermeta.parser.gen.ast.Typelst;

public class TypeSetter extends KermetaASTNodeVisitor {

	private KermetaUnit kermetaUnit;
	
	private LoadingContext context;
	
	public TypeSetter(KermetaUnit kermetaUnit, LoadingContext loadingContext) {
		this.kermetaUnit = kermetaUnit;
		this.context = loadingContext;
	}

	public void setTypes(CompUnit ast) {
		ast.accept(this);
	}

	private void reportTypeSettingError(NamedElement element, ASTNode node) {
		String message = "Unable to set the type of " + KermetaModelHelper.NamedElement.qualifiedName(element) + ". (Did you forgot a using statement ?)";
		//message += "\nThe type " + node.getText()toString() + " could not be found.";
		kermetaUnit.error(message, element);
	}
	
	private void setType(MultiplicityElement element, TypeRef typeRef) {
		Type type = null;
		if ( typeRef == null ) {
			ClassDefinition voidClassDefinition = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::Void");
			Class superclass = StructureFactory.eINSTANCE.createClass();
			superclass.setTypeDefinition(voidClassDefinition);
			type = superclass;
			element.setUpper(1);
		} else {
			type = KMT2KMTypeBuilder.process(context, typeRef.getReftype(), kermetaUnit, null);
			element.setIsOrdered( KermetaASTHelper.isOrdered(typeRef) );
			element.setIsUnique( KermetaASTHelper.isUnique(typeRef) );
			element.setUpper( KermetaASTHelper.getUpper(typeRef) );
			element.setLower( KermetaASTHelper.getLower(typeRef) );
		}
		// The element only contains type that are not Type Definition
		if ( type != null && ! (type instanceof TypeDefinition) && ! (type instanceof ModelTypeVariable) && ! (type instanceof ObjectTypeVariable) )
			element.getContainedType().add( type );
		setType(element, type, typeRef);
	}
	
	private void setType(TypedElement element, Type type, TypeRef node) {
		if ( type != null )
			element.setType(type);
		else
			reportTypeSettingError(element, node);
	}
	
	private void setType(PrimitiveType element, Type type, ASTNode node) {
		if ( type != null )
			element.setInstanceType(type);
		else
			reportTypeSettingError(element, node);
	}
	
	/*
	 * 
	 * Class Definition
	 * 
	 */
	@Override
	public boolean beginVisit(ClassDecl classDecl) {
		ClassDefinition classDefinition = (ClassDefinition) kermetaUnit.getModelElementByNode(classDecl);
		context.current_class = classDefinition;
		context.pushContext(kermetaUnit, classDefinition);
		/*
		 * 
		 * Setting the super types
		 * 
		 */
		Typelst supertypes = classDecl.getSuperTypes();
		if ( supertypes != null ) {
			for ( ASTNode node : supertypes.getChildren() ) {
				if ( node instanceof fr.irisa.triskell.kermeta.parser.gen.ast.Type ) {
					fr.irisa.triskell.kermeta.parser.gen.ast.Type typeNode = (fr.irisa.triskell.kermeta.parser.gen.ast.Type) node;
					Type supertype = KMT2KMTypeBuilder.process(context, typeNode, kermetaUnit, null);
					if ( supertype == null ) {
						String message = "Not able to set the super type of " + KermetaModelHelper.NamedElement.qualifiedName(classDefinition);
						kermetaUnit.error(message, node);
					} else
						classDefinition.getSuperType().add( supertype);
				}
			}
		} 
		// If we want aspect that are asymetric, just reactivate the next condition.
		//else if ( ! classDefinition.isIsAspect() ) {
		else {
			/*
			 * 
			 * By default, add Object as supertype.
			 * Avoiding to do that for the reflection definitions.
			 * 
			 */
			String qualifiedName = KermetaModelHelper.ClassDefinition.qualifiedName(classDefinition);
			if ( ! qualifiedName.equals("kermeta::language::structure::Object") 
					&& ! qualifiedName.equals("kermeta::language::structure::KMStructureVisitable")
					&& ! qualifiedName.equals("kermeta::language::behavior::KMExpressionVisitable")) {
				ClassDefinition supertypeDefinition = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object", null);
				if ( supertypeDefinition == null )
					kermetaUnit.error("Require of the framework is missing. Plesase use \"require kermeta\"", classDecl);
				else {
					Class superclass = StructureFactory.eINSTANCE.createClass();
					superclass.setTypeDefinition( supertypeDefinition );
					classDefinition.getSuperType().add( superclass );
				}
			}
		}
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(ClassDecl classDecl) {
		context.popContext();
		context.current_class = null;
	}
	
	/*
	 * 
	 * Operation
	 * 
	 */
	@Override
	public boolean beginVisit(Operation operation) {
		fr.irisa.triskell.kermeta.language.structure.Operation o = (fr.irisa.triskell.kermeta.language.structure.Operation) kermetaUnit.getModelElementByNode(operation);
		context.pushContext(o);
		/*
		 * 
		 * Setting the return type
		 * 
		 */
		setType(o, operation.getTypeRef());
		// Continue the visit
		return true;
	}
	
	@Override
	public void endVisit(Operation operation) {
		context.popContext();
		context.current_operation = null;
	}
	
	@Override
	public boolean beginVisit(Param param) {
		/*
		 * 
		 * Setting the type
		 * 
		 */
		Parameter parameter = (Parameter) kermetaUnit.getModelElementByNode(param);
		setType(parameter, param.getTypeRef());
		// No needs to go on
		return false;
	}
	
	@Override
	public boolean beginVisit(OperationBody operationBody) {
		// No needs to go on
		return false;
	}
	
	/*
	 * 
	 * Property
	 * 
	 */
	@Override
	public boolean beginVisit(Property property) {
		fr.irisa.triskell.kermeta.language.structure.Property p = (fr.irisa.triskell.kermeta.language.structure.Property) kermetaUnit.getModelElementByNode(property);
		setType(p, property.getTypeRef());
		/*
		 * 
		 * Setting the opposite.
		 * 
		 */
		if (property.getOppositeName() != null) {
			String opname = KermetaASTHelper.getTextForID(property.getOppositeName());
			// the type of such a property must a class which class definition contains a property
			// named opname and which type is current_property.owningClass
			if (!(p.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				kermetaUnit.error("Unexpected opposite - The type of a property that have an opposite should be a Class.", property.getOppositeName());
				return false;
			}
			ClassDefinition opposite_class = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)p.getType()).getTypeDefinition();
			fr.irisa.triskell.kermeta.language.structure.Property oppositeProperty = KermetaModelHelper.ClassDefinition.getPropertyByName(kermetaUnit, opposite_class, opname);
			if (oppositeProperty == null) {
				kermetaUnit.error("Unable to resolve opposite of property " + p.getName(), property.getOppositeName());
				return false;
			}
			p.setOpposite(oppositeProperty);
		}
		// No needs to go on
		return false;
	}
	
	/*
	 * 
	 * Data Type
	 * 
	 */
	@Override
	public boolean beginVisit(DataTypeDecl dataTypeDecl) {
		Type type = KMT2KMTypeBuilder.process(context, dataTypeDecl.getInstanceClass(), kermetaUnit, null);
		PrimitiveType primitiveType = (PrimitiveType) kermetaUnit.getModelElementByNode(dataTypeDecl);
		setType(primitiveType, type, dataTypeDecl.getInstanceClass());
		// No needs to go on
		return false;
	}

}


