/* $Id: KMT2KMPass.java,v 1.22 2008-04-28 11:50:13 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Author : Franck Fleurey <ffleurey@irisa.fr>
 * Description :
 * 	This is the abstract class of the Visitor dedicated to the visit of a Kermeta 
 *  AST (AST nodes and generic visitor are defined in fr.irisa.triskell.ast
 *  package)
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.parser.gen.ast.ClassDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.CollectionType;
import fr.irisa.triskell.kermeta.parser.gen.ast.EnumDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaTokenNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.ModelTypeDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.Multiplicity;
import fr.irisa.triskell.kermeta.parser.gen.ast.MultiplicityExpr;
import fr.irisa.triskell.kermeta.parser.gen.ast.Operation;
import fr.irisa.triskell.kermeta.parser.gen.ast.PackageDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.Property;
import fr.irisa.triskell.kermeta.parser.gen.ast.QualifiedID;
import fr.irisa.triskell.kermeta.parser.gen.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.TypeRef;


/**
 * Abstract class that defines a set of methods aimed at easing the visit of
 * a Kermeta AST, and a references to the KermetaUnit that is "completed" after
 * the necessary visits (see KMT2KMPass 1 to 7). 
 */
public abstract class KMT2KMPass extends KermetaASTNodeVisitor {
	
	/**
	 * If used that monitor can stop the execution of the load.
	 * Usefull when working with concurrent thread or to save time.
	 */
	protected IProgressMonitor monitor;
    
    /**
     * Define the tag names of the tags to attach to the KMElements  */
    public static String PRE_TAGNAME = "pre";
    public static String POST_TAGNAME= "post";
    
	protected KermetaUnit builder;
	
//	protected AbstractKermetaUnitLoader loader = null;
	
	protected LoadingContext context = null;
	
	/**
	 * contain a list of nodes that are an aspect of another
	 */
	protected Collection<KermetaASTNode> aspectNodes = new HashSet<KermetaASTNode>();
	
	// the constructor
	public KMT2KMPass(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		this.builder = builder;
		this.context = context;
		this.monitor = monitor;
	}
	
	
	
	/**
	 * Returns a String corresponding to the AST node of type QualifiedID, as a list
	 * of terms separated by a "::" ("this::is::an::id"=> qualified id of "id").
	 * @param node the AST representation of a Qualified ID
	 * @return a String corresponding to the QualifiedID node.
	 */
	protected String qualifiedIDAsString(QualifiedID node) {
		StringBuffer result = new StringBuffer();
		ASTNode[] ids = node.getChildren();
		for(int i=0; i<ids.length; i++) {
			if (ids[i].getTypeName().equals("QidSeparator")) continue;
			result.append(getTextForID((KermetaTokenNode)ids[i]));
			if (i != ids.length-1) result.append("::");
		}
		return result.toString();
	}
	
	/**
	 * If qualified_name qualifies an existing package, we return the corresponding
	 * Package. Otherwise, we recursively get or create the package, and set at
	 * the same time its parents packages. At the same time, we store the relationship
	 * between the AST node and its kcore object in the tracers of KermetaUnit (see 
	 * KermetaUnit documentation) 
	 * @param qualifiedName the complete name of a package
	 * @param node the AST node to link to a Package
	 * @return the Package corresponding to <code>node</code>
	 */
	protected Package getOrCreatePackage(String qualifiedName, KermetaASTNode node) {
		//Package result = builder.packageLookup(qualifiedName);
		
		List<Package> packages = builder.getPackages(qualifiedName);
		
		if ( packages.size() != 0 )
			return packages.get(0);
		
		Package result = null;
		
		/*if (result != null) {
		    if (builder.getModelElementByNode(node) == null) builder.storeTrace(result, node);
		    return result;
		}*/
		if (qualifiedName.indexOf("::")>=0) {
			// String name = qualifiedName.substring(qualifiedName.lastIndexOf("::") + 2);
			String parent_name = qualifiedName.substring(0, qualifiedName.lastIndexOf("::"));
			Package parent = getOrCreatePackage(parent_name, node);
			result = builder.addInternalPackage(qualifiedName);
			parent.getNestedPackage().add(result);
		} else {
			result = builder.addInternalPackage(qualifiedName);
		}
		//builder.packages.put(NamedElementHelper.getQualifiedName(result), result);
		//if (node != null) builder.storeTrace(result, node);
		return result;
	}
	
	/**
	 * Returns the upper bound of the multiplicity for a type reference.
	 * @param ref
	 * @return the upper bound of a typeref
	 */
	protected int getUpper(TypeRef ref) {
		Multiplicity mul = ref.getMultiplicity();
		if (mul == null) return 1;
		MultiplicityExpr mexp = mul.getMultiplicityExpr();
		if ( mexp == null ) {
			builder.error("Incorrect multiplicity for upper.", ref);
			return 1;
		}
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
	
	/**
	 * Returns the lower bound of the multiplicity for a type reference.
	 * @param ref
	 * @return the lower bound of a typeref
	 */
	protected int getLower(TypeRef ref) {
		Multiplicity mul = ref.getMultiplicity();
		if (mul == null) return 0;
		MultiplicityExpr mexp = mul.getMultiplicityExpr();
		if ( mexp == null ) {
			builder.error("Incorrect multiplicity for lower.", ref);
			return 0;
		}
		if (mexp.getLowerBound() == null) return 0;
		if (mexp.getLowerBound().getText().equals("?")) return 0;
		if (mexp.getLowerBound().getText().equals("*")) return 0;
		if (mexp.getLowerBound().getText().equals("+")) return 1;
		// mexp.getLowerBound().getText() is an int_literal
		int lower = Integer.parseInt(mexp.getLowerBound().getText());
		return lower;
	}
	
	/**
	 * Returns true if type reference is unique (multiplicity is 1), false
	 * otherwise.
	 * @param ref
	 * @return true if <code>ref</code> is unique (multiplicity is 1), false
	 * otherwise
	 */
	protected boolean isUnique(TypeRef ref) {
		CollectionType t = ref.getCollectionType();
		if (t==null) return true; // by default it is an ordered set
		else return t.getText().equals("oset") || t.getText().equals("set");
	}
	
	/**
	 * Returns true if ref is ordered (specified as "{isOrdered}"), false otherwise.
	 * @param ref
	 * @return true if ref is ordered, false otherwise
	 */
	protected boolean isOrdered(TypeRef ref) {
		CollectionType t = ref.getCollectionType();
		if (t==null) return true; // by default it is an ordered set
		else return t.getText().equals("oset") || t.getText().equals("seq");
	}
	
	/**
	 * Returns the type corresponding to the type reference <code>ref</code>.
	 * @param ref
	 * @return the kcore type (FType) corresponding to the type reference <code>ref</code>.
	 */
	protected Type getFType(TypeRef ref) {
		Type result = KMT2KMTypeBuilder.process(context, ref.getReftype(), builder, monitor);
		return result;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	/**public boolean beginVisit(ClassDecl classDecl) {
		current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
		return super.beginVisit(classDecl);
	}*/
	

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.EnumDecl)
	 */
	public boolean beginVisit(EnumDecl enumDecl) {
		context.current_enum = (Enumeration)builder.getModelElementByNode(enumDecl);
		return super.beginVisit(enumDecl);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		context.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation)builder.getModelElementByNode(operation);
		return super.beginVisit(operation);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PackageDecl)
	 */
	public boolean beginVisit(PackageDecl packageDecl) {
		//rootPackage = getOrCreatePackage(qualifiedIDAsString(packageDecl.getName()), packageDecl);
		return super.beginVisit(packageDecl);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Property)
	 */
	public boolean beginVisit(Property property) {
		context.current_property = (fr.irisa.triskell.kermeta.language.structure.Property)builder.getModelElementByNode(property);
		return super.beginVisit(property);
	}
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.SubPackageDecl)
	 */
	public boolean beginVisit(SubPackageDecl subPackageDecl) {
		context.current_package = (Package)builder.getModelElementByNode(subPackageDecl);
		return super.beginVisit(subPackageDecl);
	}
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ModelTypeDecl)
	 */
	public boolean beginVisit(ModelTypeDecl modelTypeDecl) {
		context.current_modeltype = (ModelType)builder.getModelElementByNode(modelTypeDecl);
		return super.beginVisit(modelTypeDecl);
	}
	

	public boolean beginVisit(ClassDecl classDecl) {
		context.current_class = (ClassDefinition) builder.getModelElementByNode( classDecl );
		return super.beginVisit(classDecl);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		context.current_class = null;
		super.endVisit(classDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.EnumDecl)
	 */
	public void endVisit(EnumDecl enumDecl) {
		context.current_enum = null;
		super.endVisit(enumDecl);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		context.current_operation = null;
		super.endVisit(operation);
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Property)
	 */
	public void endVisit(Property property) {
		context.current_property = null;
		super.endVisit(property);
	}
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.SubPackageDecl)
	 */
	public void endVisit(SubPackageDecl subPackageDecl) {
		if (context.current_package != null)
			context.current_package = context.current_package.getNestingPackage();
		super.endVisit(subPackageDecl);
	}
	
	public void endVisit(ModelTypeDecl modelTypeDecl) {
		context.current_modeltype = null;
		super.endVisit(modelTypeDecl);
	}
	
	public String getTextForID(KermetaTokenNode node) {
		String result = node.getText();
		if (result.startsWith("~")) result = result.substring(1);
		return result;
	}
}
