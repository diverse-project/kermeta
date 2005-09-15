/* $Id: ECore2KMPass.java,v 1.3 2005-09-15 12:40:33 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KermetaUnit.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 10 févr. 2005
 * Author : ffleurey
 */
package fr.irisa.triskell.kermeta.loader.emfatic;

import com.ibm.eclipse.emfatic.core.ast.EmfaticASTNodeVisitor;
import com.ibm.eclipse.emfatic.core.ast.EmfaticTokenNode;
import com.ibm.eclipse.emfatic.core.ast.Multiplicity;
import com.ibm.eclipse.emfatic.core.ast.MultiplicityExpr;
import com.ibm.eclipse.emfatic.core.ast.QualifiedID;
import com.ibm.eclipse.emfatic.core.ast.TypeRef;
import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 *
 */
public class ECore2KMPass extends EmfaticASTNodeVisitor {
	

	protected KermetaUnit builder;
	
	// the constructor
	public ECore2KMPass(KermetaUnit builder) {
		this.builder = builder;
	}
	
	public String getTextForID(EmfaticTokenNode node) {
		String result = node.getText();
		if (result.startsWith("~")) result = result.substring(1);
		return result;
	}
	
	
	protected String qualifiedIDAsString(QualifiedID node) {
		String result = "";
		ASTNode[] ids = node.getChildren();
		for(int i=0; i<ids.length; i++) {
			if (ids[i].getTypeName().equals("QidSeparator")) continue;
			result += getTextForID((EmfaticTokenNode)ids[i]);
			if (i != ids.length-1) result += "::";
		}
		return result;
	}
	
	protected fr.irisa.triskell.kermeta.structure.FPackage getOrCreatePackage(String qualified_name, Object node) {
		fr.irisa.triskell.kermeta.structure.FPackage result = builder.packageLookup(qualified_name);
		if (result != null) return result;
		if (qualified_name.indexOf("::")>=0) {
			String name = qualified_name.substring(qualified_name.lastIndexOf("::") + 2);
			String parent_name = qualified_name.substring(0, qualified_name.lastIndexOf("::"));
			FPackage parent = getOrCreatePackage(parent_name, node);
			result = builder.struct_factory.createFPackage();
			builder.storeTrace(result, node);
			result.setFName(name);
			parent.getFNestedPackage().add(result);
		}
		else {
			// this is a new root package
			result = builder.struct_factory.createFPackage();
			result.setFName(qualified_name);
			//TODO: result.setFUri(). What to put here ?
		}
		builder.packages.put(builder.getQualifiedName(result), result);
		return result;
	}
	
	protected int getUpper(TypeRef ref) {
		Multiplicity mul = ref.getMultiplicity();
		if (mul == null) return 1;
		MultiplicityExpr mexp = mul.getMultiplicityExpr();
		if (mexp.getLowerBound() == null) return -1;
		if (mexp.getUpperBound() == null) {
			if (mexp.getLowerBound().getText().equals("?")) return 1;
			if (mexp.getLowerBound().getText().equals("*")) return -1;
			if (mexp.getLowerBound().getText().equals("+")) return -1;
			// mexp.getLowerBound().getText() is an int_literal
			int lower = Integer.parseInt(mexp.getLowerBound().getText());
			return lower;
		}
		else {
			if (mexp.getUpperBound().getText().equals("?")) return -2; // Unspecified...
			if (mexp.getUpperBound().getText().equals("*")) return -1;
			if (mexp.getUpperBound().getText().equals("+")) return -1; // ???
			// mexp.getUpperBound().getText() is an int_literal
			int upper = Integer.parseInt(mexp.getUpperBound().getText());
			return upper;
		}
	}
	
	protected int getLower(TypeRef ref) {
		Multiplicity mul = ref.getMultiplicity();
		if (mul == null) return 0;
		MultiplicityExpr mexp = mul.getMultiplicityExpr();
		if (mexp.getLowerBound() == null) return 0;
		if (mexp.getLowerBound().getText().equals("?")) return 0;
		if (mexp.getLowerBound().getText().equals("*")) return 0;
		if (mexp.getLowerBound().getText().equals("+")) return 1;
		// mexp.getLowerBound().getText() is an int_literal
		int lower = Integer.parseInt(mexp.getLowerBound().getText());
		return lower;
	}
	
	protected FType getFTypeByID(QualifiedID qid) {
	    String name = qualifiedIDAsString(qid);
	    return getFTypeByID(name);
	}
	
	
	protected FType getFTypeByID(String name) {
	    
		if (name.equals("void")) {
			return builder.struct_factory.createFVoidType();
		}
			
	    FTypeDefinition typeDef = builder.getTypeDefinitionByName(name);
	    if (typeDef == null) {
	        builder.messages.addError("Cannot resolve type '"+name+"'" ,null);
			return null;
	    }
	    if (typeDef instanceof FType) return (FType)typeDef;
	    else {
	        FClassDefinition cd = (FClassDefinition)typeDef;
	        FClass result = builder.struct_factory.createFClass();
	        //result.setFName(cd.getFName());
	        result.setFClassDefinition(cd);
	        return result;
	    }
	}
	
}
