/* $Id: KMT2KMPass2.java,v 1.7 2006-03-03 15:22:18 dvojtise Exp $
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

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.ClassMemberDecls;
import fr.irisa.triskell.kermeta.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.ast.PackageDecl;
import fr.irisa.triskell.kermeta.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.ast.TypeVarDecl;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;


/**
 * PASS 2 : Create Packages and types (classes and enums) objects
 * For class and enums it creates the objects, adds it in the package
 * and sets the name.
 * For parametric classes it creates the type variables and sets their names.
 */
public class KMT2KMPass2 extends KMT2KMPass {
	
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
		String qname = builder.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		pkgs.push(getOrCreatePackage(qname, node));
		return super.beginVisit(node);
	}
	public void endVisit(SubPackageDecl arg0) {
		pkgs.pop();
		super.endVisit(arg0);
	}
	
	public boolean beginVisit(ClassDecl node) {
		String qname = builder.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
			return false;
		}
		else {
			builder.current_class = builder.struct_factory.createClassDefinition();
			builder.current_class.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(builder.current_class);
			builder.typeDefs.put(qname, builder.current_class);
			builder.storeTrace(builder.current_class, node);
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
		TypeVariable tv = builder.struct_factory.createTypeVariable();
		tv.setName(name);
		// check that another param with the same name does not exist yet
		GenericTypeDefinition context;
		if (builder.current_class != null) { // if we're inside a generic class def
			context = builder.current_class;
		} else { // otherwise we're inside a generic model type def
			context = (ModelTypeDefinition) current_package();
		}
		EList other_params = context.getTypeParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((TypeVariable)other_params.get(i)).getName().equals(name)) {
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
		String qname = builder.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
		}
		else {
			Enumeration c = builder.struct_factory.createEnumeration();
			c.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(c);
			builder.typeDefs.put(builder.getQualifiedName(c), c);
			builder.storeTrace(c, node);
		}
		return false;
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.DataTypeDecl)
	 */
	public boolean beginVisit(DataTypeDecl node) {
		String qname = builder.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
		}
		else {
			PrimitiveType c = builder.struct_factory.createPrimitiveType();
			c.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(c);
			builder.typeDefs.put(builder.getQualifiedName(c), c);
			builder.storeTrace(c, node);
		}
		return false;
	}
	
	
	public boolean beginVisit(ModelTypeDecl node) {
		String qname = builder.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		if (builder.typeDefinitionLookup(qname) != null) {
			// This is an error : the type already exists
			builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : A type definition for '" + qname + "' already exists.",node));
			return false;
		}
		else {
			ModelTypeDefinition newMTypeDef = builder.struct_factory.createModelTypeDefinition();
			newMTypeDef.setName(getTextForID(node.getName()));
			current_package().getOwnedTypeDefinition().add(newMTypeDef);
			builder.typeDefs.put(qname, newMTypeDef);
			builder.storeTrace(newMTypeDef, node);
			pkgs.push(newMTypeDef);
		}
		return super.beginVisit(node);
	}
	
	public void endVisit(ModelTypeDecl arg0) {
		pkgs.pop();
		super.endVisit(arg0);
	}

}
