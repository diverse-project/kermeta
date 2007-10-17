/* $Id: KM2JavaPrettyPrinter.java,v 1.1 2007-10-17 08:56:19 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : KM2JavaPrettyPrinter.java
 * License   : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 *  Didier Vojtisek	dvojtise@irisa.fr
 *  Cyril Faucher	cfaucher@irisa.fr
 */
package org.kermeta.compiler.exporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.checker.KermetaUnitChecker;
import org.kermeta.compiler.util.CompilerUtil;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass7;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.ast.helper.KMTHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;


/**
 * PrettyPrinter that prints a Kermeta program in its concrete syntax. 
 * ie. Prints a kermeta model into a human-readable form (which is KMT)
 */
public class KM2JavaPrettyPrinter extends KermetaOptimizedVisitor {

	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	
	/**
	 * Boolean variable used to manage the prefix printing
	 */
	protected boolean alreadyPrefixed = false;
	
	/** If the visitor (i.e This printer:)) is currently visiting a typedefinition, this
	 *  boolean is set to true (this allows the visitor to print differently some things
	 *  according to the context inside which it is (i.e typeDefintion or not typeDefinition) */
	protected boolean typedef = true;
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KM2JAVA");
	
	
	public KM2JavaPrettyPrinter() {
	}
		
	public void ppPackage(Package p, File file) {
		try {
			FileWriter w = new FileWriter(file);
			w.write(ppPackage(p));
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String ppPackage(Package p) {
		root_pname = NamedElementHelper.getMangledQualifiedName(p, NamedElementHelper.simplePointSeparator);
		String result = "package " + root_pname + ";\n\n";
		for(int i=0; i<imports.size();i++)
			result += "require \"" + imports.get(i) + "\"\n";
		if (imports.size()>0) result += "\n";
		for(int i=0; i<usings.size();i++) result += "using " + usings.get(i) + "\n";
		if (usings.size()>0) result += "\n";
		current_pname = root_pname;
		typedef = true;
		result += ppCRSeparatedNode(p.getOwnedTypeDefinition());
		typedef = false;
		result += ppCRSeparatedNode(p.getNestedPackage());
		
		// temporary handle of orphan tags
		//result +=
		return result;
	}
	
	// It seems that this method is never called !!!!
	public String ppPackageContents(Package p) {
		root_pname = NamedElementHelper.getMangledQualifiedName(p, NamedElementHelper.simplePointSeparator);
		String result = "";
		current_pname = root_pname;
		typedef = true;
		result += ppCRSeparatedNode(p.getOwnedTypeDefinition());
		typedef = false;
		result += ppCRSeparatedNode(p.getNestedPackage());
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Constraint)
	 */
	public Object visitConstraint(Constraint node) {
		String result = ppTags(node.getTag());
		
		if(alreadyPrefixed)
			result += node.getStereotype().toString();
		else
			result += getPrefix() + node.getStereotype().toString();

		result += node.getName()!=null ? " "+node.getName():"";
		result += " is\n";
		if (node.getBody() != null) {
			pushPrefix();
			result += getPrefix() + this.accept(node.getBody());
			popPrefix();
		}
		else {
			pushPrefix();
			result += getPrefix() + "//TODO: implement constraint\n"; 
			result += getPrefix() + "raise kermeta::exceptions::NotImplementedException.new \n";
			popPrefix();
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
	public Object visitAssignment(Assignment node) {
		String left = this.accept(node.getTarget()).toString();
		String right = this.accept(node.getValue()).toString();
		
		// Patch that adds the 'function' keyword in case the assigned value is a function
		if(node.getValue() instanceof LambdaExpression)
			right = "function " + right;
		
		String op = "";//(node.isIsCast())?"?":":";
		return left + " " + op + "= " + right + ";";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Block)
	 * compiler ready
	 */
	public Object visitBlock(Block node) {
		String result = "{";
		alreadyPrefixed = false;
		pushPrefix();
		result += ppCRSeparatedNode(node.getStatement());
		
		popPrefix();
		Iterator it = node.getRescueBlock().iterator();
		while(it.hasNext()) {
			result += getPrefix() + this.accept((Rescue)it.next()) + "\n";
		}
		result += getPrefix() + "}";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Rescue)
	 */
	public Object visitRescue(Rescue node) {
		String result = "rescue";
		if (node.getExceptionName() != null) {
			result += "(" + node.getExceptionName() + " : " + this.accept(node.getExceptionType()) + ")";
		}
		result += "\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getBody());
		popPrefix();
		return result;
	}
	

	public String ppCRSeparatedNode(EList expressions) {
		String result = "";
		int expNb = expressions.size();
		for(int i=0; i<expNb; i++) {
			if((i==0) && (alreadyPrefixed) && (!prefix.equals(prefixTab))) {
				result += this.accept((EObject)expressions.get(i)) + "\n";
			}
			else if((i==0) && (!alreadyPrefixed)) {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept((EObject)expressions.get(i)) + "\n";
			}
			else {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept((EObject)expressions.get(i)) + "\n";
			}
		}

		if(expNb > 0) alreadyPrefixed = false;
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.BooleanLiteral)
	 */
	public Object visitBooleanLiteral(BooleanLiteral node) {
		return ""+node.isValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.CallSuperOperation)
	 */
	public Object visitCallSuperOperation(CallSuperOperation node) {
		String result = "super(";
		result += ppComaSeparatedNodes(node.getParameters());
		result += ")";
		return result;
	}
	
	public String ppComaSeparatedNodes(EList expressions) {
		String result = "";
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			EObject o = (EObject)it.next();
			result += this.accept(o);
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		String qname = NamedElementHelper.getMangledQualifiedName(node.getTypeDefinition(), NamedElementHelper.simplePointSeparator);
		String name = KMTHelper.getMangledIdentifier(node.getTypeDefinition().getName());
		if(qname == null || name == null){
			internalLog.error("Problem visiting a Class node with TypeDefinition name == null" );
			return "";
		}
		String result = ppTypeName(qname, name);
		if (node.getTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getTypeParamBinding()) + ">";
		}
		return result;
	}
	
	public Object visitModelType(ModelType node) {
		String qname = NamedElementHelper.getMangledQualifiedName(node);
		String name = KMTHelper.getMangledIdentifier(node.getName());
		String result = ppTypeName(qname, name);
//		if (node.getTypeParamBinding().size() > 0) {
//			result += "<" + ppComaSeparatedNodes(node.getTypeParamBinding()) + ">";
//		}
		result += "\n" + getPrefix() + "{\n";
		pushPrefix();

		Iterator included = node.getIncludedTypeDefinition().iterator();
		while (included.hasNext()) {
			TypeDefinition tdef = (TypeDefinition) included.next();
			result += NamedElementHelper.getMangledQualifiedName(tdef);
			if (included.hasNext()) {
				result += ", ";
			}
		}
		popPrefix();
		result += getPrefix() + "}\n";
		return result;
	}
	
	/**
	 * 
	 * @param qname the qualified name of the type
	 * @param name the name of the type
	 * @return a String. 
	 * FIXED : test of qname.startsWith was not good
	 * examples : if rootpackage is "a" and qname="a1" the test considers that
	 * the type (identified by qname) belongs to current root package
	 */
	protected String ppTypeName(String qname, String name) {
		String result = "";
		if (qname.equals(current_pname + NamedElementHelper.simplePointSeparator + name)) result += name;
		else {
			for(int i=0; i<usings.size(); i++) {
				if (qname.equals(usings.get(i) + NamedElementHelper.simplePointSeparator + name)) {
					result += name;
					break;
				}
			}
			if (qname.startsWith(root_pname + NamedElementHelper.simplePointSeparator))
			{
				result += qname.substring(root_pname.length() + 2);
			}
		}
		if (result.equals("")) result += qname;
		
		if( result.equals("kermeta.standard.String") ) {
			result = "String";
		}
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariableBinding)
	 */
	public Object visitTypeVariableBinding(TypeVariableBinding node) {
		return this.accept(node.getType());
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		//setParent(node);

		typedef = false;
		String result = "";

		result += ppTags(node.getTag());
		
		if(! alreadyPrefixed) result += getPrefix();
		
		if (node.isIsAbstract()) result += "abstract ";
		result += "class " + KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		if (node.getSuperType().size() > 0) {
			result += " inherits ";
			result += ppComaSeparatedNodes(node.getSuperType());
		}
		result += "\n" + getPrefix() + "{\n";

		alreadyPrefixed = false;
		
		pushPrefix();
		result += ppCRSeparatedNode(node.getInv());
		result += ppCRSeparatedNode(node.getOwnedAttribute());
		result += ppCRSeparatedNode(node.getOwnedOperation());
		popPrefix();

		result += getPrefix() + "}";		
		
		typedef = true;
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node) {
		setParent(node);
		if (typedef == true) {
			typedef = false;
			String result = "alias " + node.getName() + " : " + this.accept(node.getInstanceType()) + ";";
			typedef = true;
			return result;
		}
		else {
			String qname = NamedElementHelper.getMangledQualifiedName(node, NamedElementHelper.simplePointSeparator);
			String name = KMTHelper.getMangledIdentifier(node.getName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	public String ppTypeVariableDeclaration(EList tparams) {
		String result = "";
		Iterator it = tparams.iterator();
		while (it.hasNext()) {
			TypeVariable node = (TypeVariable)it.next();
			result += KMTHelper.getMangledIdentifier(node.getName());
			if (node.getSupertype() != null) result += " : " + this.accept(node.getSupertype());
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	/** Prettyprint the annotations */
	public String ppTags(EList tagList) {
		String result = "";
	    
		int tagNb = tagList.size();
		for(int i=0; i<tagNb; i++) {
			if((i==0) && (alreadyPrefixed)) {
				result += this.accept((EObject)tagList.get(i)) + "\n";
			}
			else if((i==0) && (!alreadyPrefixed)) {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept((EObject)tagList.get(i)) + "\n";
			}
			else {
				result += getPrefix() + this.accept((EObject)tagList.get(i)) + "\n";
			}
		}
		if(tagNb > 0) alreadyPrefixed = false;
	    return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 * compiler ready
	 */
	public Object visitConditional(Conditional node) {
		String result = "if( " + this.accept(node.getCondition()) + ") {\n";
		pushPrefix(); 
		// Both type of ThenBody and ElseBody are "Block" (see also KMT2KMPrimitiveExpressionBuilder)
		// And block textual syntax is already represented by "then..else..end"
		alreadyPrefixed = false;
		if (node.getThenBody() != null) 
			result += this.ppCRSeparatedNode(((Block)node.getThenBody()).getStatement()) + "\n";
		popPrefix();
		if (node.getElseBody() != null) {
			result += getPrefix() + "} else {\n";
			pushPrefix();
			result += this.ppCRSeparatedNode(((Block)node.getElseBody()).getStatement()) + "\n";
			popPrefix();
		}
		result += getPrefix() + "}";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node) {
		if (typedef == true) {
			typedef = false;
			String result = "enumeration " + KMTHelper.getMangledIdentifier(node.getName()) + "\n";
			result += getPrefix() + "{\n";
			pushPrefix();
			alreadyPrefixed = false;
			result += ppCRSeparatedNode(node.getOwnedLiteral());
			popPrefix();
			result += getPrefix() + "}";
			typedef = true;
			return result;
		}
		else {
			String qname = NamedElementHelper.getMangledQualifiedName(node, NamedElementHelper.simplePointSeparator);
			String name = KMTHelper.getMangledIdentifier(node.getName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral node) {
		return KMTHelper.getMangledIdentifier(node.getName()) + ";";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FunctionType)
	 */
	public Object visitFunctionType(FunctionType node) {
		return "< " + this.accept(node.getLeft()) + "->" + this.accept(node.getRight()) + " >";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.IntegerLiteral)
	 */
	public Object visitIntegerLiteral(IntegerLiteral node) {
		return "" + node.getValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.JavaStaticCall)
	 */
	public Object visitJavaStaticCall(JavaStaticCall node) {
		String result = "extern " + node.getJclass() + "." + KMTHelper.getMangledIdentifier(node.getJmethod()) + "(";
		result += ppComaSeparatedNodes(node.getParameters());
		result += ")";
		return result;
	}
	/**
	 * A lambda expression is printed differently according to its use.
	 * But for now we will only authorize it to be :
	 * - a CallFeature (a parameter)
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.LambdaExpression)
	 */
	public Object visitLambdaExpression(LambdaExpression node) {
		String result = "{";
		result += ppComaSeparatedNodes(node.getParameters());
		result += " | ";
		pushPrefix();
		result += this.accept(node.getBody());
		popPrefix();
		result += "}";
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.LambdaParameter)
	 */
	public Object visitLambdaParameter(LambdaParameter node) {
		String result = KMTHelper.getMangledIdentifier(node.getName());
		if (node.getType() != null) {
			result += " : " + this.accept(node.getType());
		}
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Loop)
	 * compiler ready
	 */
	public Object visitLoop(Loop node) {
		String result = "for { " ; 
		result += this.accept(node.getInitialization()) + "\n";
		result += "; ";
		result += getPrefix() + "until " + this.accept(node.getStopCondition()) + "\n";
		result += getPrefix() +"loop\n";
		alreadyPrefixed = false;
		pushPrefix();
		// Precise type of Loop is always "Block" (see also KMT2KMPrimitiveExpressionBuilder)
		// And block textual syntax is already represented by "loop..end"
		result += this.ppCRSeparatedNode(((Block)node.getBody()).getStatement());
		popPrefix();
		result += getPrefix() +"}";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		setParent(node);
		String result = ppTags(node.getTag());
		
		if(!alreadyPrefixed) result += getPrefix();
		
		if (node.getSuperOperation() != null)
			result += "method ";
		else
			result += "operation ";
		
		result += KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		result += "(";
		result += ppComaSeparatedNodes(node.getOwnedParameter());
		result += ")";
		// Type of operation is allowed to be null..
		if(node.getType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
		else {
			result += " : kermeta::standard::~Void" ;
		}
	
		if (node.getSuperOperation() != null) {
			ClassDefinition cDef = node.getSuperOperation().getOwningClass();
			if(! NamedElementHelper.getMangledQualifiedName(cDef, NamedElementHelper.simplePointSeparator).equals("kermeta::reflection::Object"))
				result += " from " + KMTHelper.getMangledIdentifier(NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass(), NamedElementHelper.simplePointSeparator));
		}
		if (node.getRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getRaisedException());
		}
		if (node.getPre().size() != 0 || node.getPost().size() != 0){
			result += "\n";
			alreadyPrefixed = false;
			pushPrefix();
			result += ppCRSeparatedNode(node.getPre());
			result += ppCRSeparatedNode(node.getPost());
			popPrefix();
			result += getPrefix() + "is\n";
		}
		else
			result += " is\n";
		
		pushPrefix();
		alreadyPrefixed = false;
		
		if (node.getBody() != null) {
			result += getPrefix() + this.accept(node.getBody()) + "\n";
		}
		else if (node.isIsAbstract()) {
			result += getPrefix() + "abstract\n";
		}
		else {
			result += getPrefix() + "do\n";
			pushPrefix();
			result += getPrefix() + "//TODO: implement operation " + node.getName() + "\n"; 
			result += getPrefix() + "raise kermeta::exceptions::NotImplementedException.new\n";
			result += ppCRSeparatedNode(node.getPost());
			popPrefix();
			result += getPrefix() + "end\n";
		}
		popPrefix();
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Parameter)
	 */
	public Object visitParameter(Parameter node) {
		setParent(node);
		return KMTHelper.getMangledIdentifier(node.getName()) + " : " + ppTypeFromMultiplicityElement(node);
	}
	
	public String ppTypeFromMultiplicityElement(MultiplicityElement elem) {
		String result = "";
		if (elem.getUpper() != 1) {
			if (elem.isIsOrdered()) {
				if (!elem.isIsUnique()) result +="seq ";
			}
			else {
				if (elem.isIsUnique()) result +="set ";
				else result +="bag ";
			}
		}
		result += this.accept(elem.getType());
		if (elem.getLower() != 0 || elem.getUpper() != 1) {
			result += "[" + elem.getLower() + "..";
			result += (elem.getUpper()<0)?"*":""+elem.getUpper();
			result += "]";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package node) {
	    setParent(node);
		String result = ppTags(node.getTag());
		result += "package " + KMTHelper.getMangledIdentifier(node.getName()) + "\n";
		result += getPrefix() + "{\n";
		String old_cname = current_pname;
		current_pname = NamedElementHelper.getMangledQualifiedName(node, NamedElementHelper.simplePointSeparator);
		pushPrefix();
		typedef = true;
		alreadyPrefixed = false;
		result += ppCRSeparatedNode(node.getOwnedTypeDefinition());
		result += ppCRSeparatedNode(node.getNestedPackage());
		popPrefix();
		current_pname = old_cname;
		result += getPrefix() + "}\n";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ProductType)
	 */
	public Object visitProductType(ProductType node) {
		String result = "[" + ppComaSeparatedNodes(node.getType()) + "]";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {
		setParent(node);
	    String result = ppTags(node.getTag());
	    
	    if(!alreadyPrefixed) result += getPrefix();
		
	    if (node.isIsDerived()) result += "property ";
		else if (node.isIsComposite()) result += "attribute ";
		else result += "reference ";
		if (node.isIsReadOnly()) result += "readonly ";
		result += KMTHelper.getMangledIdentifier(node.getName());
		// FIXME : It should not be the role of KMTPrettyPrinter to handle this case! :
		// Type of Property should be mandatory (with a multiplicity [1..1]!).. at least
		// in framework.km, not in kermeta.ecore which would not be conform to MOF if we
		// changed there the multiplicity?
		if(node.getType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
		else {
			result += " : kermeta::standard::~Void" ;
		}
		
		if (node.getOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName());
		if (node.isIsDerived()) {
			pushPrefix();
			result += "\n" + getPrefix() + "getter is " ;
			if (node.getGetterBody() != null) result += this.accept(node.getGetterBody());
			else {
				result += getEmptyDerivedPropertyBody(node, "getter");
			}
			if (! node.isIsReadOnly()) {
				result += "\n" + getPrefix() + "setter is ";
				if (node.getSetterBody() != null) result += this.accept(node.getSetterBody());
				else {
					result += getEmptyDerivedPropertyBody(node, "getter");
				}
			}
			popPrefix();
		}
		result += "\n";
		return result;
	}
	
	protected String getEmptyDerivedPropertyBody(Property node, String body_type) {
		String result = "{\n";
		pushPrefix();
		result += getPrefix() + "//TODO: implement "+ body_type + " for derived property " + node.getName() + "\n"; 
		result += getPrefix() + "throws new NotImplementedException() \n";
		popPrefix();
		result += getPrefix() + "}";
		return result;
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Raise)
	 */
	public Object visitRaise(Raise node) {
		return "throws " + this.accept(node.getExpression());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.SelfExpression)
	 */
	public Object visitSelfExpression(SelfExpression node) {
		return "this";
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.StringLiteral)
	 */
	public Object visitStringLiteral(StringLiteral node) {
		return "\"" + node.getValue().replace("\"", "\\\"") +"\"";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeLiteral)
	 */
	public Object visitTypeLiteral(TypeLiteral node) {
		return this.accept(node.getTyperef());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.TypeReference)
	 */
	public Object visitTypeReference(TypeReference node) {
	    return ppTypeFromMultiplicityElement(node);
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ObjectTypeVariable)
	 */
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		return KMTHelper.getMangledIdentifier(node.getName());
	}
	public Object visitModelTypeVariable(ModelTypeVariable node) {
		return KMTHelper.getMangledIdentifier(node.getName());
	}
	public Object visitVirtualType(VirtualType node) {
		String result = KMTHelper.getMangledIdentifier(((ModelTypeVariable) node.getModelType()).getName());
		result += "::";
		result += KMTHelper.getMangledIdentifier(node.getName());
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.VariableDecl)
	 */
	public Object visitVariableDecl(VariableDecl node) {
		setParent(node);
//		String result = "var " + KMTHelper.getMangledIdentifier(node.getIdentifier()) + " : " + this.accept(node.getType());
//		if (node.getInitialization() != null)
//			result += " init " + this.accept(node.getInitialization());
		
		String localType = (String) this.accept(node.getType());
		
		String result = localType + " " + KMTHelper.getMangledIdentifier(node.getIdentifier());
		
		// FIXME CF-Compiler
		if (node.getInitialization() != null) {
			if(((String) this.accept(node.getInitialization())).contains(".new()")) {
				result += getCreateFactory(localType);
			} else {
				result += " = " + this.accept(node.getInitialization());
			}
		}
		else {
			result += getCreateFactory(localType);
		}
		return result + ";";
	}
	
	/**
	 * 
	 * @param localType
	 * @return
	 */
	private String getCreateFactory(String localType) {
		String text = "";
		
		if(localType.equals("String")) {
			text = " = \"\"";
			
		} else {
			String localType2 = localType.replace(".", "%");
			System.out.println();
			//String[] localType3 = localType2.split("[");
			String[] name = localType2.split("%");
			
			String allPackages_label = localType.substring(0, localType.length()-name[name.length-1].length());
			
			if(name.length>=2) {
				text = " = " + allPackages_label + CompilerUtil.upperCaseFirstLetter(name[name.length-2]) +"Factory.eINSTANCE.create" + name[name.length-1] + "()";
			}
		}

		return text;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.VoidLiteral)
	 */
	public Object visitVoidLiteral(VoidLiteral node) {
		return "null";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.VoidType)
	 */
	public Object visitVoidType(VoidType node) {
		return "Void";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.CallFeature)
	 */
	public Object visitCallFeature(CallFeature node) {
		
		//System.out.println("DEBUG-Compiler CallFeature:" + node.toString());
		
		/*
		setParent(node);
		String result = "";
		if (node.getTarget() != null) result += this.accept(node.getTarget());
		else result += "self";
		result += "." + KMTHelper.getMangledIdentifier(node.getName());
		// handle the special case where there is 1 parameter, and when This
		// parameter is a lambdaPostFix
		//	TODO : throw an exception if type is not a LambdaExpression
		if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0)))
		{
		   result+= ppComaSeparatedNodes(node.getParameters());
		}
		// the classic case : a list of parameters
		else if (node.getParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
		}
		
		return result;
		*/
		
		setParent(node);
		String result = "";
		String fName = node.getName();
		
		// Feature calls that correspond to primitive types operators have specific
		// serialization scheme. As an example, calling the feature "not" onto a boolean
		// is serialized as "not boolVariable" instead of "boolVariable.not"
		Expression tgt = node.getTarget();
		if(tgt != null) {
			
			if(fName == "not" && isBooleanTypeDef(tgt.getStaticType())) {
					result += "not (";
					result += this.accept(tgt);
					result += ")";
				}
			else if(fName == "and" && isBooleanTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " and ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "or" && isBooleanTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " or ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "plus" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " + ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "minus" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " - ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "mult" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " * ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "div" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " / ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isGreater" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " > ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isLower" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " < ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isGreaterOrEqual" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " >= ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isLowerOrEqual" && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " <= ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "equals" && (isBooleanTypeDef(tgt.getStaticType()) || isNumericalTypeDef(tgt.getStaticType()))) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " == ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName == "isNotEqual" && (isBooleanTypeDef(tgt.getStaticType()) || isNumericalTypeDef(tgt.getStaticType()))) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " != ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else {
				// Other feature calls...
				result += this.accept(tgt);
				result += "." + KMTHelper.getMangledIdentifier(node.getName());
				
				// handle the special case where there is 1 parameter, and when This
				// parameter is a lambdaPostFix
				//	TODO : throw an exception if type is not a LambdaExpression
				if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0))) {
				   result+= ppComaSeparatedNodes(node.getParameters());
				}
				// the classic case : a list of parameters
				else if (node.getParameters().size()> 0) {
					result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
				} else {
					result += "()";
				}
			}
		}
		else {
			result += KMTHelper.getMangledIdentifier(node.getName());
			
			// handle the special case where there is 1 parameter, and when This
			// parameter is a lambdaPostFix
			//	TODO : throw an exception if type is not a LambdaExpression
			if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0))) {
			   result+= ppComaSeparatedNodes(node.getParameters());
			}
			// the classic case : a list of parameters
			else if (node.getParameters().size()> 0) {
				result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
			} else {
				result += "()";
			}
		}
		return result + ";";
	}
	
	/** @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.CallResult) */
	public Object visitCallResult(CallResult node) { return "result"; }
	
	/** 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallValue(fr.irisa.triskell.kermeta.language.behavior.CallValue)
	 */
	public Object visitCallValue(CallValue node) { return "value"; }

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.CallVariable)
	 */
	public Object visitCallVariable(CallVariable node) {
		
		//System.out.println("DEBUG-Compiler CallVariable:" + node.toString());
		
		String result = KMTHelper.getMangledIdentifier(node.getName());
		
		if(result.contains("stdio")) {
			result = "// fr.irisa.triskell.kermeta.compiler.basetypes.StdIO";
		}
		
		if (node.getParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
		}
		return result;
	}
	
    /**
     * Tag is used to store comments in the source code.
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object visitTag(Tag node) {
        String result = "";
        // User can choose to add a "@kdoc" tag
        if (node.getName().equals(KMT2KMPass7.KERMETA_DOCUMENTATION) && !node.getValue().startsWith("/**"))
        {
            result = "/**" + node.getValue() + "*/";
        }
        // Or simple comment /** */ delimitor TODO also remove pretty "*" 
        else if (node.getValue().startsWith("/**"))
        {
            result = node.getValue();
        }
        else
        {
            result = "@"+node.getName()+" \""+node.getValue()+"\"";
        }
        return result;
    }
    
	protected String prefix = "";
	
	protected String getPrefix() {
		return prefix;
	}
	
	protected String prefixTab = "\t";
	protected void pushPrefix() {
		prefix = prefix + prefixTab;
	}
	
	protected void popPrefix() {
		prefix = prefix.substring(prefixTab.length());
	}
	
	/**
	 * @return Returns the imports.
	 */
	public ArrayList getImports() {
		return imports;
	}
	/**
	 * @return Returns the usings.
	 */
	public ArrayList getUsings() {
		return usings;
	}

	
	/**
	 * Get a list of tag which name is <code>name</code>
	 * Later, we will think about the relevance of having not unique tags (depends on how we handle
	 * code documentation => extern system, or integrated?)
	 */
	public Tag[] getFTagsByName(EList ftagList, String name)
	{
	    Iterator it = ftagList.iterator();
	    Tag[] result_tagArray = new Tag[10];
	    int i = 0;
	    while (it.hasNext())
	    {
	        Tag tag = (Tag)it.next();
	        if (tag.getName().equals(name))
	        {
	            result_tagArray[i] = tag;
	            i++;
	        }
	    }
	    return result_tagArray;
	}
	
	
	/**
	 * PrettyPrint a simplified version of the property
	 * (no tag, no getter and setter)
	 * with its context (ie. class)
	 * @param node
	 * @return
	 */
	public String ppSimplifiedPropertyInContext(Property node){
		String result="class "+node.getOwningClass().getName() + "{\n";
		result += "\t...\n";
		result += "\t" + ppSimplifiedProperty(node);
		result += "\n\t...\n}";
		return result;
    }
	/**
	 * PrettyPrint a simplified version of the property
	 * (no tag, no getter and setter)
	 * @param node
	 * @return
	 */
	public String ppSimplifiedProperty(Property node){
    	String result="";
    	if (node.isIsDerived()) result += "property ";
		else if (node.isIsComposite()) result += "attribute ";
		else result += "reference ";
		if (node.isIsReadOnly()) result += "readonly ";
		result += KMTHelper.getMangledIdentifier(node.getName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName());
		return result;
    }
	
	/**
	 * PrettyPrint a simplified version of the operation
	 * (no tag, no body)
	 * with its context (ie. class)
	 * @param node
	 * @return
	 */
	public String ppSimplifiedFOperationInContext(Operation node){
		String result="class "+ KMTHelper.getMangledIdentifier(node.getOwningClass().getName()) + "{\n\t...\n";
		result += "\t" + ppSimplifiedFOperation(node);
		result += "\n\t...\n}";
		return result;
    }
	/**
	 * PrettyPrint a simplified version of the operation
	 * (no tag, no body)
	 * @param node
	 * @return
	 */
	public String ppSimplifiedFOperation(Operation node){
    	String result="";
    	if (node.getSuperOperation() != null) result += "method ";
		else result += "operation ";
		result += KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		result += "(";
		result += ppComaSeparatedNodes(node.getOwnedParameter());
		result += ")";
		if(node.getType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
	
		if (node.getSuperOperation() != null) {
			result += " from " + KMTHelper.getMangledIdentifier(NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass(), NamedElementHelper.simplePointSeparator));
		}
		if (node.getRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getRaisedException());
		}
		if (node.isIsAbstract()) result += " is abstract";
		else {
			result += " is do ... end";
		}
		return result;
    }

	/**
	 * Set the printing context. Printing kermeta programs changes if we are inside a classdefinition or not.
	 * In particular, this context boolean is used when printing Enumeration or PrimitiveType : 
	 * if they are defined as type of an attribute, it is printed as "String",
	 * otherwise, it is printed as "alias String : blablab")
	 * @param typedef The typedef to set.
	 */
	public void setTypedef(boolean typedef) {
		this.typedef = typedef;
	}
	
	
	/**
	 * Tests whether the Type t corresponds to a Kermeta numerical type, which can be encoded
	 * either as the Integer/Real PrimitiveType or the Integer/Real class.
	 * @param t
	 * @return
	 */
	protected boolean isNumericalTypeDef(Type t) {
		String tName = null;
		if(t instanceof Class) {
			tName = ((Class) t).getTypeDefinition().getName();
			return tName.equals("Integer") || tName.equals("Real");
		}
		else if(t instanceof PrimitiveType) {
			tName = ((PrimitiveType) t).getName();
			return tName.equals("Integer") || tName.equals("Real");
		}
		else
			return false;
	}
	
	/**
	 * Tests whether the Type t corresponds to the Kermeta Boolean type, which can be encoded
	 * either as the Boolean PrimitiveType or the Boolean class.
	 * @param t
	 * @return
	 */
	protected boolean isBooleanTypeDef(Type t) {
		if(t instanceof Class) {
			return ((Class) t).getTypeDefinition().getName().equals("Boolean");
		}
		else if(t instanceof PrimitiveType) {
			return ((PrimitiveType) t).getName().equals("Boolean");
		}
		else
			return false;
	}
}
