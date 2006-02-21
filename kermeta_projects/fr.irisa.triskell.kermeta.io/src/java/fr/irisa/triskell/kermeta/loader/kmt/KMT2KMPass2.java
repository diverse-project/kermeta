/* $Id: KMT2KMPass2.java,v 1.6 2006-02-21 17:34:18 jsteel Exp $
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
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FGenericTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FModelTypeDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinitionContainer;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;


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
	
	public FTypeDefinitionContainer current_package() {
		return (FTypeDefinitionContainer)pkgs.peek();
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
			builder.current_class = builder.struct_factory.createFClassDefinition();
			builder.current_class.setFName(getTextForID(node.getName()));
			current_package().getFOwnedTypeDefinition().add(builder.current_class);
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
		FTypeVariable tv = builder.struct_factory.createFTypeVariable();
		tv.setFName(name);
		// check that another param with the same name does not exist yet
		FGenericTypeDefinition context;
		if (builder.current_class != null) { // if we're inside a generic class def
			context = builder.current_class;
		} else { // otherwise we're inside a generic model type def
			context = (FModelTypeDefinition) current_package();
		}
		EList other_params = context.getFTypeParameter();
		for (int i=0; i<other_params.size(); i++) {
			if (((FTypeVariable)other_params.get(i)).getFName().equals(name)) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 2 : Parametric type definition '" + context.getFName() + "' already contains a parameter named '"+name+"'.",typeVarDecl));
				return false;
			}
		}
		// add the parameter to the class
		context.getFTypeParameter().add(tv);
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
			FEnumeration c = builder.struct_factory.createFEnumeration();
			c.setFName(getTextForID(node.getName()));
			current_package().getFOwnedTypeDefinition().add(c);
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
			FPrimitiveType c = builder.struct_factory.createFPrimitiveType();
			c.setFName(getTextForID(node.getName()));
			current_package().getFOwnedTypeDefinition().add(c);
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
			FModelTypeDefinition newMTypeDef = builder.struct_factory.createFModelTypeDefinition();
			newMTypeDef.setFName(getTextForID(node.getName()));
			current_package().getFOwnedTypeDefinition().add(newMTypeDef);
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
