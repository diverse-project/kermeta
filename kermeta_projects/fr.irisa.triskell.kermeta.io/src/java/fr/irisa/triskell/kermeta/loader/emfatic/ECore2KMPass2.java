/*
 * Created on 10 févr. 2005
 *
 */
package fr.irisa.triskell.kermeta.loader.emfatic;

import java.util.Stack;


import com.ibm.eclipse.emfatic.core.ast.ClassDecl;
import com.ibm.eclipse.emfatic.core.ast.DataTypeDecl;
import com.ibm.eclipse.emfatic.core.ast.EnumDecl;
import com.ibm.eclipse.emfatic.core.ast.PackageDecl;
import com.ibm.eclipse.emfatic.core.ast.SubPackageDecl;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Package;



/**
 * @author franck
 *
 * PASS 2 create packages and collect types
 */
public class ECore2KMPass2 extends ECore2KMPass {    
    
	protected Stack pkgs;
	
	/**
	 * @param builder
	 */
	public ECore2KMPass2(KermetaUnit builder) {
		super(builder);
		pkgs = new Stack();
	}
	
	public Package current_package() {
		return (Package)pkgs.peek();
	}
	
	public boolean beginVisit(PackageDecl node) {
		builder.rootPackage = getOrCreatePackage(qualifiedIDAsString(node.getName()), node);
		builder.storeTrace(builder.rootPackage, node);
		pkgs.push(builder.rootPackage);
		return super.beginVisit(node);
	}
	
	public boolean beginVisit(SubPackageDecl node) {
		String qname = builder.getQualifiedName(current_package()) + "::" + getTextForID(node.getName());
		builder.storeTrace(getOrCreatePackage(qname, node), node);
		pkgs.push(getOrCreatePackage(qname, node));
		return super.beginVisit(node);
	}
	public void endVisit(SubPackageDecl arg0) {
		pkgs.pop();
		super.endVisit(arg0);
	}
    
	
	public boolean beginVisit(ClassDecl node) {
		//System.out.println("(Pre-)Create FClass " + getQualifiedName(node.getName().getText()));
		ClassDefinition c = builder.struct_factory.createClassDefinition();
		builder.storeTrace(c, node);
		c.setName(getTextForID(node.getName()));
		//TODO : check if the type already exists
		current_package().getOwnedTypeDefinition().add(c);
		builder.typeDefs.put(getQualifiedName(node.getName().getText()), c);
		return super.beginVisit(node);
	}
	public boolean beginVisit(DataTypeDecl node) {
		//System.out.println("(Pre-)Create PrimitiveType " + getQualifiedName(node.getName().getText()));
		DataType c = builder.struct_factory.createPrimitiveType();
		builder.storeTrace(c, node);
		c.setName(getTextForID(node.getName()));
//		TODO : check if the type already exists
		current_package().getOwnedTypeDefinition().add(c);
		builder.typeDefs.put(getQualifiedName(node.getName().getText()), c);
		return super.beginVisit(node);
	}
	public boolean beginVisit(EnumDecl node) {
		//System.out.println("(Pre-)Create Enumeration " + getQualifiedName(node.getName().getText()));
		Enumeration c = builder.struct_factory.createEnumeration();
		builder.storeTrace(c, node);
		c.setName(getTextForID(node.getName()));
//		TODO : check if the type already exists
		current_package().getOwnedTypeDefinition().add(c);
		builder.typeDefs.put(getQualifiedName(node.getName().getText()), c);
		return super.beginVisit(node);
	}
	
	protected String getQualifiedName(String name) {
		String result = "";
		for(int i=0; i<pkgs.size(); i++)
			result += ((Package)pkgs.get(i)).getName() + "::";
		return result + name;
	}
}
