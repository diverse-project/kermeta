/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.CollectionType;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.ast.KermetaTokenNode;
import fr.irisa.triskell.kermeta.ast.Multiplicity;
import fr.irisa.triskell.kermeta.ast.MultiplicityExpr;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.PackageDecl;
import fr.irisa.triskell.kermeta.ast.Property;
import fr.irisa.triskell.kermeta.ast.QualifiedID;
import fr.irisa.triskell.kermeta.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.ast.TypeRef;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public abstract class KMT2KMPass extends KermetaASTNodeVisitor {
	
	protected KermetaUnit builder;
	
	// the constructor
	public KMT2KMPass(KermetaUnit builder) {
		this.builder = builder;
	}
	
	protected String qualifiedIDAsString(QualifiedID node) {
		String result = "";
		ASTNode[] ids = node.getChildren();
		for(int i=0; i<ids.length; i++) {
			if (ids[i].getTypeName().equals("QidSeparator")) continue;
			result += getTextForID((KermetaTokenNode)ids[i]);
			if (i != ids.length-1) result += "::";
		}
		return result;
	}
	
	protected FPackage getOrCreatePackage(String qualified_name, KermetaASTNode node) {
		FPackage result = builder.packageLookup(qualified_name);
		if (result != null) return result;
		if (qualified_name.indexOf("::")>=0) {
			String name = qualified_name.substring(qualified_name.lastIndexOf("::") + 2);
			String parent_name = qualified_name.substring(0, qualified_name.lastIndexOf("::"));
			FPackage parent = getOrCreatePackage(parent_name, node);
			result = builder.struct_factory.createFPackage();
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
		if (node != null) builder.storeTrace(result, node);
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
	
	protected boolean isUnique(TypeRef ref) {
		CollectionType t = ref.getCollectionType();
		if (t==null) return true; // by default it is an ordered set
		else return t.getText().equals("oset") || t.getText().equals("set");
	}
	
	protected boolean isOrdered(TypeRef ref) {
		CollectionType t = ref.getCollectionType();
		if (t==null) return true; // by default it is an ordered set
		else return t.getText().equals("oset") || t.getText().equals("seq");
	}
	
	protected FType getFType(TypeRef ref) {
		FType result = KMT2KMTypeBuilder.process(ref.getReftype(), builder);
		return result;
	}
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		builder.current_class = (FClassDefinition)builder.getModelElementByNode(classDecl);
		return super.beginVisit(classDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumDecl)
	 */
	public boolean beginVisit(EnumDecl enumDecl) {
		builder.current_enum = (FEnumeration)builder.getModelElementByNode(enumDecl);
		return super.beginVisit(enumDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		builder.current_operation = (FOperation)builder.getModelElementByNode(operation);
		return super.beginVisit(operation);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PackageDecl)
	 */
	public boolean beginVisit(PackageDecl packageDecl) {
		//builder.rootPackage = getOrCreatePackage(qualifiedIDAsString(packageDecl.getName()), packageDecl);
		return super.beginVisit(packageDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Property)
	 */
	public boolean beginVisit(Property property) {
		builder.current_property = (FProperty)builder.getModelElementByNode(property);
		return super.beginVisit(property);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.SubPackageDecl)
	 */
	public boolean beginVisit(SubPackageDecl subPackageDecl) {
		builder.current_package = (FPackage)builder.getModelElementByNode(subPackageDecl);
		return super.beginVisit(subPackageDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		builder.current_class = null;
		super.endVisit(classDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.EnumDecl)
	 */
	public void endVisit(EnumDecl enumDecl) {
		builder.current_enum = null;
		super.endVisit(enumDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		builder.current_operation = null;
		super.endVisit(operation);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Property)
	 */
	public void endVisit(Property property) {
		builder.current_property = null;
		super.endVisit(property);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.SubPackageDecl)
	 */
	public void endVisit(SubPackageDecl subPackageDecl) {
		if (builder.current_package != null)
			builder.current_package = builder.current_package.getFNestingPackage();
		super.endVisit(subPackageDecl);
	}
	
	public String getTextForID(KermetaTokenNode node) {
		String result = node.getText();
		if (result.startsWith("~")) result = result.substring(1);
		return result;
	}
}
