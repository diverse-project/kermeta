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
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FDataType;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FPackage;



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
	
	public FPackage current_package() {
		return (FPackage)pkgs.peek();
	}
	
	public boolean beginVisit(PackageDecl node) {
		builder.rootPackage = getOrCreatePackage(qualifiedIDAsString(node.getName()), node);
		pkgs.push(builder.rootPackage);
		return super.beginVisit(node);
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
		//System.out.println("(Pre-)Create FClass " + getQualifiedName(node.getName().getText()));
		FClassDefinition c = builder.struct_factory.createFClassDefinition();
		builder.storeTrace(c, node);
		c.setFName(getTextForID(node.getName()));
		//TODO : check if the type already exists
		current_package().getFOwnedTypeDefinition().add(c);
		builder.typeDefs.put(getQualifiedName(node.getName().getText()), c);
		return super.beginVisit(node);
	}
	public boolean beginVisit(DataTypeDecl node) {
		//System.out.println("(Pre-)Create FPrimitiveType " + getQualifiedName(node.getName().getText()));
		FDataType c = builder.struct_factory.createFPrimitiveType();
		builder.storeTrace(c, node);
		c.setFName(getTextForID(node.getName()));
//		TODO : check if the type already exists
		current_package().getFOwnedTypeDefinition().add(c);
		builder.typeDefs.put(getQualifiedName(node.getName().getText()), c);
		return super.beginVisit(node);
	}
	public boolean beginVisit(EnumDecl node) {
		//System.out.println("(Pre-)Create FEnumeration " + getQualifiedName(node.getName().getText()));
		FEnumeration c = builder.struct_factory.createFEnumeration();
		builder.storeTrace(c, node);
		c.setFName(getTextForID(node.getName()));
//		TODO : check if the type already exists
		current_package().getFOwnedTypeDefinition().add(c);
		builder.typeDefs.put(getQualifiedName(node.getName().getText()), c);
		return super.beginVisit(node);
	}
	
	protected String getQualifiedName(String name) {
		String result = "";
		for(int i=0; i<pkgs.size(); i++)
			result += ((FPackage)pkgs.get(i)).getFName() + "::";
		return result + name;
	}
}
