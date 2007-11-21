/* $Id: KMT2KMPass2.java,v 1.20 2007-11-21 14:06:31 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass2.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 2, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * Description :
 * 	Second pass for the construct kcore representation of 
 *  a Kermeta program, mainly construct packages and types.
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.ClassMemberDecls;
import fr.irisa.triskell.kermeta.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.ast.PackageDecl;
import fr.irisa.triskell.kermeta.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TagHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


/**
 * PASS 2 : Create Packages and types (classes and enums) objects
 * For class and enums it creates the objects, adds it in the package
 * and sets the name.
 * For parametric classes it creates the type variables and sets their names.
 */
public class KMT2KMPass2 extends KMT2KMPass {
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2KMPass2");
	
	protected Stack pkgs;
	
	/**
	 * @param builder
	 */
	public KMT2KMPass2(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
		pkgs = new Stack();
	}
	
	public TypeDefinitionContainer current_package() {
		return (TypeDefinitionContainer)pkgs.peek();
	}
	
	public boolean beginVisit(PackageDecl node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		//fr.irisa.triskell.kermeta.language.structure.Package p = getOrCreatePackage(qualifiedIDAsString(node.getName()), node);
		fr.irisa.triskell.kermeta.language.structure.Package p = builder.addInternalPackage( qualifiedIDAsString(node.getName()), KermetaASTHelper.getURI(node) );
		
		builder.storeTrace(p, node);
		pkgs.push( p );
		builder.addUsing( NamedElementHelper.getQualifiedName(p) );
		return true;
	}
	
	public boolean beginVisit(SubPackageDecl node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		String qname = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		fr.irisa.triskell.kermeta.language.structure.Package p = builder.addInternalPackage( qname );
		//pkgs.push(getOrCreatePackage(qname, node));
		pkgs.push(p);
		return super.beginVisit(node);
	}
	public void endVisit(SubPackageDecl arg0) {
		
		if ( monitor.isCanceled() )
			return;
		
		pkgs.pop();
		super.endVisit(arg0);
	}
	
	public boolean beginVisit(ClassDecl node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		String qualifiedName = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		TypeDefinition typeDef = builder.getTypeDefinitionByQualifiedName(qualifiedName, monitor);
		if (typeDef != null) {
			// special case of the weaving: if the new class has a decorator tag set to true then we can reopen the class
			// this will weave the classes directly at parsing time
			// DVK: may be we can have another approach that doesn't reopen the class, but weave the result in memory only
			//     so we can still have the separation
			if(KermetaASTHelper.isAnAspect(node)) {
				
				internalLog.debug("Aspect tag found : reopening the class " + node.getName().getText()+ " from " +builder.getUri());
				context.current_class = (ClassDefinition)typeDef;
				builder.storeTrace(context.current_class, node); // the trace is used to retreive this element in following passes
			
			} else if(TagHelper.findTagFromNameAndValue((ClassDefinition)typeDef,KermetaASTHelper.TAGNAME_ASPECT, "true")!= null){
				// previous class was an aspect we can reopen it
				internalLog.debug("no aspect tag found but previous definition was an aspect: reopening the class " + node.getName().getText()+ " from " +builder.getUri());
				context.current_class = (ClassDefinition)typeDef;
				builder.storeTrace(context.current_class, node); // the trace is used to retreive this element in following passes
				// since are now loading the base, the class shouldn't be tagged as aspect anymore 
				TagHelper.findTagFromNameAndValue(context.current_class,KermetaASTHelper.TAGNAME_ASPECT, "true").setValue("false");
			}
			else{
				// This is an error : the type already exists
				//builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qualifiedName + "' already exists.",node));
				builder.error("PASS 2 : A type definition for '" + qualifiedName + "' already exists.", node);
				super.beginVisit(node);
				return false;
			}
		}
		else {
			// first time we see this classdefinition
			internalLog.debug("class " + node.getName().getText()+ " from " +builder.getUri());
			
			context.current_class = StructureFactory.eINSTANCE.createClassDefinition();
			context.current_class.setName(getTextForID(node.getName()));
			builder.addTypeDefinition(context.current_class, current_package());
//			current_package().getOwnedTypeDefinition().add(context.current_class);
			builder.storeTrace(context.current_class, node);
			if(KermetaASTHelper.isAnAspect(node))
			{
				context.current_class.setIsAspect( true );
				TagHelper.createNonExistingTagFromNameAndValue(context.current_class, KermetaASTHelper.TAGNAME_ASPECT, "true");
			}
		}
		return super.beginVisit(node);
	}
	


	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeVarDecl)
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		
		if ( monitor.isCanceled() )
			return false;
		
		//if (builder.current_class == null) return false;
		// create the parameter
		String name = getTextForID(typeVarDecl.getName());
		ObjectTypeVariable tv = StructureFactory.eINSTANCE.createObjectTypeVariable();
		tv.setName(name);
		// check that another param with the same name does not exist yet
		GenericTypeDefinition typeDefinition = null;
		if (context.current_class != null) { // if we're inside a generic class def
			typeDefinition = context.current_class;
		} else {  
						
			// otherwise we're inside a generic model type def
//			context = (ModelTypeDefinition) current_package();
//			This should never happen!
		}
		EList other_params = typeDefinition.getTypeParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((ObjectTypeVariable)other_params.get(i)).getName().equals(name)) {
				//builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : Parametric type definition '" + context.getName() + "' already contains a parameter named '"+name+"'.",typeVarDecl));
				builder.error("PASS 2 : Parametric type definition '" + typeDefinition.getName() + "' already contains a parameter named '"+name+"'.");
				return false;
			}
		}
		// add the parameter to the class
		typeDefinition.getTypeParameter().add(tv);
		builder.storeTrace(tv, typeVarDecl);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassMemberDecls)
	 */
	public boolean beginVisit(ClassMemberDecls classMemberDecls) {
		// to avoid visiting the whole tree
		return false;
	}
	public boolean beginVisit(EnumDecl node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		String qualifiedName = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.getTypeDefinitionByName(qualifiedName, monitor) != null) {
			// This is an error : the type already exists
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qualifiedName + "' already exists.",node));
			builder.error("PASS 2 : A type definition for '" + qualifiedName + "' already exists.");
		}
		else {
			Enumeration c = StructureFactory.eINSTANCE.createEnumeration();
			c.setName(getTextForID(node.getName()));
			builder.addTypeDefinition(c, current_package());
			//current_package().getOwnedTypeDefinition().add(c);
			//builder.typeDefs.put(NamedElementHelper.getQualifiedName(c), c);
			builder.storeTrace(c, node);
		}
		return false;
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.DataTypeDecl)
	 */
	public boolean beginVisit(DataTypeDecl node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		String qualifiedName = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.getTypeDefinitionByName(qualifiedName, monitor) != null) {
			// This is an error : the type already exists
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qualifiedName + "' already exists.",node));
			builder.error("PASS 2 : A type definition for '" + qualifiedName + "' already exists.");
		}
		else {
			PrimitiveType c = KermetaModelHelper.PrimitiveType.create( getTextForID(node.getName()) );
			builder.addTypeDefinition(c, current_package());
//			current_package().getOwnedTypeDefinition().add(c);
			//builder.typeDefs.put(NamedElementHelper.getQualifiedName(c), c);
			builder.storeTrace(c, node);
		}
		return false;
	}
	
	
	public boolean beginVisit(ModelTypeDecl node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		String qualifiedName = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.getTypeDefinitionByName(qualifiedName, monitor) != null) {
			// This is an error : the type already exists
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qualifiedName + "' already exists.",node));
			builder.error("PASS 2 : A type definition for '" + qualifiedName + "' already exists.");
			return false;
		}
		else {
			ModelType newMT = StructureFactory.eINSTANCE.createModelType();
			newMT.setName(getTextForID(node.getName()));
			builder.addTypeDefinition(newMT, current_package());
			//current_package().getOwnedTypeDefinition().add(newMT);
			//builder.typeDefs.put(qualifiedName, newMT);
			builder.storeTrace(newMT, node);
//			ModelTypeDefinition newMTypeDef = builder.struct_factory.createModelTypeDefinition();
//			newMTypeDef.setName(getTextForID(node.getName()));
//			current_package().getOwnedTypeDefinition().add(newMTypeDef);
//			builder.typeDefs.put(qname, newMTypeDef);
//			builder.storeTrace(newMTypeDef, node);
			pkgs.push(newMT);
		}
		return super.beginVisit(node);
	}
	
	public void endVisit(ModelTypeDecl arg0) {
		
		if ( monitor.isCanceled() )
			return;
		
		pkgs.pop();
		super.endVisit(arg0);
	}

}
