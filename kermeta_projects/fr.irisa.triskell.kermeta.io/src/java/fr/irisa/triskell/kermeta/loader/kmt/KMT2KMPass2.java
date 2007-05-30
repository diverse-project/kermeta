/* $Id: KMT2KMPass2.java,v 1.12 2007-05-30 11:28:45 jsteel Exp $
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
import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.ClassMemberDecls;
import fr.irisa.triskell.kermeta.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.KermetaASTHelper;
import fr.irisa.triskell.kermeta.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.ast.PackageDecl;
import fr.irisa.triskell.kermeta.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
//import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
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
	public KMT2KMPass2(KermetaUnit builder) {
		super(builder);
		pkgs = new Stack();
	}
	
	public TypeDefinitionContainer current_package() {
		return (TypeDefinitionContainer)pkgs.peek();
	}
	
	public boolean beginVisit(PackageDecl node) {
		builder.rootPackage = getOrCreatePackage(qualifiedIDAsString(node.getName()), node);
		pkgs.push(builder.rootPackage);
		return false;
	}
	
	public boolean beginVisit(SubPackageDecl node) {
		String qname = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		pkgs.push(getOrCreatePackage(qname, node));
		return super.beginVisit(node);
	}
	public void endVisit(SubPackageDecl arg0) {
		pkgs.pop();
		super.endVisit(arg0);
	}
	
	public boolean beginVisit(ClassDecl node) {
		String qname = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		TypeDefinition typeDef = builder.typeDefinitionLookup(qname);
		if (typeDef != null) {
			// special case of the weaving: if the new class has a decorator tag set to true then we can reopen the class
			// this will weave the classes directly at parsing time
			// DVK: may be we can have another approach that doesn't reopen the class, but weave the result in memory only
			//     so we can still have the separation
			if(KermetaASTHelper.isAnAspect(node))
			{
				internalLog.debug("Aspect tag found : reopening the class " + node.getName().getText()+ " from " +builder.getUri());
				builder.current_class = (ClassDefinition)typeDef;
				builder.storeTrace(builder.current_class, node); // the trace is used to retreive this element in following passes
			}
			else if(TagHelper.findTagFromNameAndValue((ClassDefinition)typeDef,KermetaASTHelper.TAGNAME_ASPECT, "true")!= null){
				// previous class was an aspect we can reopen it
				internalLog.debug("no aspect tag found but previous definition was an aspect: reopening the class " + node.getName().getText()+ " from " +builder.getUri());
				builder.current_class = (ClassDefinition)typeDef;
				builder.storeTrace(builder.current_class, node); // the trace is used to retreive this element in following passes
				// since are now loading the base, the class shouldn't be tagged as aspect anymore 
				TagHelper.findTagFromNameAndValue(builder.current_class,KermetaASTHelper.TAGNAME_ASPECT, "true").setValue("false");
			}
			else{
				// This is an error : the type already exists
				builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
				super.beginVisit(node);
				return false;
			}
		}
		else {
			// first time we see this classdefinition
			internalLog.debug("class " + node.getName().getText()+ " from " +builder.getUri());
			
			builder.current_class = builder.struct_factory.createClassDefinition();
			builder.current_class.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(builder.current_class);
			builder.typeDefs.put(qname, builder.current_class);
			builder.storeTrace(builder.current_class, node);
			if(KermetaASTHelper.isAnAspect(node))
			{
				TagHelper.createNonExistingTagFromNameAndValue(builder.current_class, KermetaASTHelper.TAGNAME_ASPECT, "true");
			}
		}
		return super.beginVisit(node);
	}
	


	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.TypeVarDecl)
	 */
	public boolean beginVisit(TypeVarDecl typeVarDecl) {
		//if (builder.current_class == null) return false;
		// create the parameter
		String name = getTextForID(typeVarDecl.getName());
		ObjectTypeVariable tv = builder.struct_factory.createObjectTypeVariable();
		tv.setName(name);
		// check that another param with the same name does not exist yet
		GenericTypeDefinition context = null;
		if (builder.current_class != null) { // if we're inside a generic class def
			context = builder.current_class;
		} else { // otherwise we're inside a generic model type def
//			context = (ModelTypeDefinition) current_package();
//			This should never happen!
		}
		EList other_params = context.getTypeParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((ObjectTypeVariable)other_params.get(i)).getName().equals(name)) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : Parametric type definition '" + context.getName() + "' already contains a parameter named '"+name+"'.",typeVarDecl));
				return false;
			}
		}
		// add the parameter to the class
		context.getTypeParameter().add(tv);
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
		String qname = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
		}
		else {
			Enumeration c = builder.struct_factory.createEnumeration();
			c.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(c);
			builder.typeDefs.put(NamedElementHelper.getQualifiedName(c), c);
			builder.storeTrace(c, node);
		}
		return false;
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.DataTypeDecl)
	 */
	public boolean beginVisit(DataTypeDecl node) {
		String qname = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
		}
		else {
			PrimitiveType c = builder.struct_factory.createPrimitiveType();
			c.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(c);
			builder.typeDefs.put(NamedElementHelper.getQualifiedName(c), c);
			builder.storeTrace(c, node);
		}
		return false;
	}
	
	
	public boolean beginVisit(ModelTypeDecl node) {
		String qname = NamedElementHelper.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
			return false;
		}
		else {
			ModelType newMT = builder.struct_factory.createModelType();
			newMT.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(newMT);
			builder.typeDefs.put(qname, newMT);
			builder.storeTrace(newMT, node);
//			ModelTypeDefinition newMTypeDef = builder.struct_factory.createModelTypeDefinition();
//			newMTypeDef.setName(getTextForID(node.getName()));
//			current_package().getOwnedTypeDefinition().add(newMTypeDef);
//			builder.typeDefs.put(qname, newMTypeDef);
//			builder.storeTrace(newMTypeDef, node);
//			pkgs.push(newMTypeDef);
		}
		return super.beginVisit(node);
	}
	
	public void endVisit(ModelTypeDecl arg0) {
//		pkgs.pop();
		super.endVisit(arg0);
	}

}
