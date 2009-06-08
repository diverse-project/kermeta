/* $Id: KM2KMTPrettyPrinter.java,v 1.18 2008-05-28 13:37:12 dvojtise Exp $
 * Project   : Kermeta.io
 * File      : KM2KMTPrettyPrinter.java
 * License   : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 *  Didier Vojtisek	dvojtise@irisa.fr
 * 
 */
package org.kermeta.io.printer;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.model.internal.TagHelper;

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
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;

import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;




/**
 * PrettyPrinter that prints a Kermeta program in its concrete syntax. 
 * ie. Prints a kermeta model into a human-readable form (which is KMT)
 */
public class KM2KMTPrettyPrinter extends KermetaOptimizedVisitor {

	
	static final private String MODEL_TYPE_KW = "modeltype";
	
	static final protected int TYPE_MODE = 0;
	
	static final protected int DEFINITION_MODE = 1;
	
	static protected int MODE = DEFINITION_MODE;
	
	static protected boolean DOC_VIEW = true;
	
	static protected boolean printBody = true;
	
	protected ArrayList<String> usings = new ArrayList<String>();
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
	
	final static public Log internalLog = LogConfigurationHelper.getLogger("KM2KMT");
	
	private StringBuffer content = new StringBuffer("");
	private boolean operationPrinting = false;
	
	private void print(String text) {
		content.append(text);
	}
	
	public String getContent() {
		return content.toString();
	}
	
	/**
	 * Create a new PrettyPrinter
	 * Use a new one whenever you whish to make sure that several prettyprint doesn't conflict with each other
	 */
	public KM2KMTPrettyPrinter() {
	}
	
	public KM2KMTPrettyPrinter(boolean operationPrinting) {
		this.operationPrinting  = operationPrinting;
	}
	
	private ModelingUnit modelingUnit = null;
	
	public void ppCompilationUnit(ModelingUnit compilationUnit) {
		this.modelingUnit = compilationUnit;
		
		content.append(ppTags( modelingUnit.getOwnedTags() ));
		
		Iterator <Package> iterator = compilationUnit.getPackages().iterator();
		while ( iterator.hasNext() ) {
			//print ( ppPackage(iterator.next()) );
			ppPackage( iterator.next() );
		}
	}
	
	private void printRequires(ModelingUnit modelingUnit) {
		Iterator <Require> iterator = modelingUnit.getRequires().iterator();
		while ( iterator.hasNext() ) {
			Require require = iterator.next();
			String tags = ppTags( require );
			print( tags + "require \"" + require.getUri() + "\"\n" );
		}
	}
	
	private void printUsings(ModelingUnit modelingUnit) {
		Iterator <Using> iterator = modelingUnit.getUsings().iterator();
		while ( iterator.hasNext() ) {
			Using using = iterator.next();
			boolean print = true;
			for ( Package p : modelingUnit.getPackages() )
				if ( NamedElementHelper.getQualifiedName(p).equals( using.getQualifiedName() ) )
					print = false;
			if ( print ) {
				String tags = ppTags( using );
				print( tags + "using " + using.getQualifiedName() + "\n" );		
			}
		}
	}
	
	public void ppPackage(Package p) {
			
		root_pname = p.getName();//NamedElementHelper.getMangledQualifiedName(p);

		String tags = ppTags( p );
		print ( tags );
		
		// Print uri like a tag into kmt file, because we have not for the moment a dedicated concrete syntax
		if( p.getUri() != null && !p.getUri().equals("") ) {
			print("@uri \"" + p.getUri() + "\"\n");
		}
		
		boolean printBraket = false;
		if ( p.eContainer() instanceof ModelingUnit)
			print( "package " + root_pname + ";\n\n" );
		else {
			print( "package " + root_pname + " {\n\n");
			printBraket = true;
			pushPrefix();
		}
		
		printRequires(modelingUnit);
		printUsings(modelingUnit);
		
		/*if ( p.getOwnedTypeDefinition().isEmpty() && ! p.getNestedPackage().isEmpty() ) {
			Iterator <Package> iterator = p.getNestedPackage().iterator();
			while ( iterator.hasNext() ) {
				
				Package current = iterator.next();
				ppPackage( current );
				
			}
						
		}*/
		
		/*for(int i=0; i<imports.size();i++)
			result += "require \"" + imports.get(i) + "\"\n";
		if (imports.size()>0) result += "\n";
		for(int i=0; i<usings.size();i++) result += "using " + usings.get(i) + "\n";
		if (usings.size()>0) result += "\n";*/
		
		current_pname = root_pname;
		typedef = true;
		print( ppCRSeparatedNode(p.getOwnedTypeDefinition()) );
		typedef = false;
		print ( ppCRSeparatedNode(p.getNestedPackage()) );
		
		if ( printBraket ) {
			print("}\n");
			popPrefix();
		}
		
	}
	
	
	/*public void ppPackage(Package p, File file) {
		try {
			FileWriter w = new FileWriter(file);
			w.write(ppPackage(p));
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	
	// It seems that this method is never called !!!!
	public String ppPackageContents(Package p) {
		root_pname = NamedElementHelper.getMangledQualifiedName(p);
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
		String result = ppTags(node);
		
		if(alreadyPrefixed)
			result += node.getStereotype().toString();
		else
			result += getPrefix() + node.getStereotype().toString();

		result += node.getName()!=null ? " "+node.getName():"";
		result += " is\n";
		if (node.getBody() != null && DOC_VIEW) {
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
	
	@Override
	public Object visitObject(fr.irisa.triskell.kermeta.language.structure.Object node) {
		return ppTags(node);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
	public Object visitAssignment(Assignment node) {
		String result = "";
		String left = this.accept(node.getTarget()).toString();
		
		String right = this.accept(node.getValue()).toString();
		
		// Patch that adds the 'function' keyword in case the assigned value is a function
		if(node.getValue() instanceof LambdaExpression)
			right = "function " + right;
		
		String op = (node.isIsCast())?"?":":";
		result += left + " " + op + "= " + right;
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Block)
	 */
	public Object visitBlock(Block node) {
		StringBuilder result = new StringBuilder("do\n");
		alreadyPrefixed = false;
		pushPrefix();
		result.append(ppCRSeparatedNode(node.getStatement()));
		
		popPrefix();
		for(Rescue r : node.getRescueBlock()){
			result.append(getPrefix());
			result.append(this.accept(r));
			result.append("\n");
		}
		result.append(getPrefix());
		result.append("end");
		return result.toString();
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
				EObject o = (EObject)expressions.get(i);
				String temp = (String) this.accept(o);
				if ( o instanceof ModelType )
					temp = MODEL_TYPE_KW + " " + temp;
				result += getPrefix() + temp + "\n";
			}
			else {
				alreadyPrefixed = true;
				EObject o = (EObject)expressions.get(i);
				String temp = (String) this.accept(o);
				if ( o instanceof ModelType )
					temp = MODEL_TYPE_KW + " " + temp;
				result += getPrefix() + temp + "\n";
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
		String qname = NamedElementHelper.getMangledQualifiedName(node.getTypeDefinition());
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

		if ( MODE == DEFINITION_MODE ) {
			result += "\n" + getPrefix() + "{\n";
			pushPrefix();
	
			Iterator<TypeDefinition> included = node.getIncludedTypeDefinition().iterator();
			while (included.hasNext()) {
				TypeDefinition tdef = included.next();
				result += NamedElementHelper.getMangledQualifiedName(tdef);
				if (included.hasNext()) {
					result += ", ";
				}
			}
			popPrefix();
			result += getPrefix() + "}\n";
		}
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
		if (qname.equals(current_pname + "::" + name)) result += name;
		else {
			for(int i=0; i<usings.size(); i++) {
				if (qname.equals(usings.get(i) + "::" + name)) {
					result += name;
					break;
				}
			}
			if (qname.startsWith(root_pname+"::"))
			{
				result += qname.substring(root_pname.length() + 2);
			}
		}
		if (result.equals("")) result += qname;
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariableBinding)
	 */
	public Object visitTypeVariableBinding(TypeVariableBinding node) {
		MODE = TYPE_MODE;
		Object result =  this.accept(node.getType());
		MODE = DEFINITION_MODE;
		return result;
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		//setParent(node);

		typedef = false;
		String result = "";
		
		if (node.isIsAspect()) {
			result += "aspect ";
		}

		result += ppTags(node);
		
		if(! alreadyPrefixed) 
			result += getPrefix();
		
		if (node.isIsAbstract()) result += "abstract ";
		result += "class " + KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			MODE = TYPE_MODE;
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
			MODE = DEFINITION_MODE;
		}
		// We do not want to print inherits Object
		if ( node.getSuperType().size() == 1 ) {
			Type type = node.getSuperType().get(0);
			if ( type instanceof Class ) {
				TypeDefinition typeDefinition = ((Class) type).getTypeDefinition();
				if ( typeDefinition instanceof ClassDefinition ) {
					String qualifiedName = NamedElementHelper.getQualifiedName( ((ClassDefinition) typeDefinition) );
					if ( ! qualifiedName.equals("kermeta::language::structure::Object") ) {
						result += " inherits ";
						result += ppComaSeparatedNodes(node.getSuperType());
					}
				}
			}
		} else if (node.getSuperType().size() > 0) {
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
			if ( ! operationPrinting ) {
				typedef = false;
				String result = "alias " + node.getName() + " : " + this.accept(node.getInstanceType()) + ";";
				typedef = true;
				return result;
			} else {
				return this.accept(node.getInstanceType());
			}
		}
		else {
			String qname = NamedElementHelper.getMangledQualifiedName(node);
			String name = KMTHelper.getMangledIdentifier(node.getName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	public String ppTypeVariableDeclaration(EList<TypeVariable> tparams) {
		String result = "";
		Iterator<TypeVariable> it = tparams.iterator();
		while (it.hasNext()) {
			TypeVariable node = it.next();
			result += KMTHelper.getMangledIdentifier(node.getName());
			if (node.getSupertype() != null) result += " : " + this.accept(node.getSupertype());
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	
	public String ppTags(fr.irisa.triskell.kermeta.language.structure.Object node) {
		String result = "";
		Iterator <Tag> iterator = node.getTag().iterator();
		while ( iterator.hasNext() ) {
			result += accept( iterator.next() ) + "\n";
		}
		/*iterator = node.getOwnedTag().iterator();
		while ( iterator.hasNext() ) {
			result += accept( iterator.next() ) + "\n";
		}*/
		if ( (node.getTag().size() > 0) /*|| (node.getOwnedTag().size() > 0)*/ )
			alreadyPrefixed = false;
		return result;
	}
	
	
	
	/** Prettyprint the annotations */
	public String ppTags(EList<Tag> tagList) {
		String result = "";
	    
		int tagNb = tagList.size();
		for(int i=0; i<tagNb; i++) {
			if((i==0) && (alreadyPrefixed)) {
				result += this.accept(tagList.get(i)) + "\n";
			}
			else if((i==0) && (!alreadyPrefixed)) {
				alreadyPrefixed = true;
				result += getPrefix() + this.accept(tagList.get(i)) + "\n";
			}
			else {
				result += getPrefix() + this.accept(tagList.get(i)) + "\n";
			}
		}
		if(tagNb > 0) alreadyPrefixed = false;
	    return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 */
	public Object visitConditional(Conditional node) {
		String result = "if " + this.accept(node.getCondition()) + " then\n";
		pushPrefix(); 
		// Both type of ThenBody and ElseBody are generally "Block" (see also KMT2KMPrimitiveExpressionBuilder)
		// And block textual syntax is already represented by "then..else..end"
		alreadyPrefixed = false;
		if (node.getThenBody() != null) {
			if(node.getThenBody() instanceof Block)
				result += this.ppCRSeparatedNode(((Block)node.getThenBody()).getStatement()) + "\n";
			else
				result += this.accept(node.getThenBody());
		}
		popPrefix();
		if (node.getElseBody() != null) {
			result += getPrefix() + "else\n";
			pushPrefix();
			if(node.getThenBody() instanceof Block)
				result += this.ppCRSeparatedNode(((Block)node.getElseBody()).getStatement()) + "\n";
			else
				result += this.accept(node.getElseBody());
			popPrefix();
		}
		result += getPrefix() + "end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node) {
		if (typedef == true && ! operationPrinting) {
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
			String qname = NamedElementHelper.getMangledQualifiedName(node);
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
		StringBuilder result = new StringBuilder("");
		if(node.eContainer() instanceof CallFeature){
			CallFeature cf = (CallFeature) node.eContainer();
			if(cf.getParameters().size()>1){
				// if the lambda expresion is in a call with multiple parameter then we must use the complete syntax (using the "function" keyword)
				result.append("function");
			}
		}
		if(node.eContainer() instanceof VariableDecl){
			// if the lambda expresion is in a variable declaration then we must use the complete syntax (using the "function" keyword)
			result.append("function");
			
		}
		result.append("{");
		result.append(ppComaSeparatedNodes(node.getParameters()));
		result.append(" | ");
		pushPrefix();
		result.append(this.accept(node.getBody()));
		popPrefix();
		result.append("}");
		return result.toString();
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
	 */
	public Object visitLoop(Loop node) {
		String result = "from " ; 
		result += this.accept(node.getInitialization()) + "\n";
		result += getPrefix() + "until " + this.accept(node.getStopCondition()) + "\n";
		result += getPrefix() +"loop\n";
		alreadyPrefixed = false;
		pushPrefix();
		// Precise type of Loop is always "Block" (see also KMT2KMPrimitiveExpressionBuilder)
		// And block textual syntax is already represented by "loop..end"
		result += this.ppCRSeparatedNode(((Block)node.getBody()).getStatement());
		popPrefix();
		result += getPrefix() +"end";
		return result;
	}
	
//	public Object visitModelTypeDefinition(ModelTypeDefinition node) {
//		String result = ppTags(node.getTag());
//		result += "modeltype " + KMTHelper.getMangledIdentifier(node.getName());
//		if (node.getTypeParameter().size() > 0) {
//			result += "<";
//			result += ppTypeVariableDeclaration(node.getTypeParameter());
//			result += ">";
//		}
//		result += "\n" + getPrefix() + "{\n";
//		String old_cname = current_pname;
//		current_pname = NamedElementHelper.getMangledQualifiedName(node);
//		pushPrefix();
//		typedef = true;
//		result += ppCRSeparatedNode(node.getOwnedTypeDefinition());
//		typedef = false;
//		popPrefix();
//		current_pname = old_cname;
//		result += getPrefix() + "}\n";
//		return result;
//	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		setParent(node);
		String result = "";
		if ( DOC_VIEW )
			result = ppTags(node);
		
		if(!alreadyPrefixed) 
			result += getPrefix();
		
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
			result += " : Void" ;
		}
	
		if (node.getSuperOperation() != null) {
			ClassDefinition cDef = node.getSuperOperation().getOwningClass();
			if(! NamedElementHelper.getMangledQualifiedName(cDef).equals("kermeta::reflection::Object"))
				result += " from " + KMTHelper.getMangledIdentifier(NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass()));
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
		
		if (node.getBody() != null && printBody) {
			result += getPrefix() + this.accept(node.getBody()) + "\n";
		}
		else if (node.isIsAbstract()) {
			result += getPrefix() + "abstract\n";
		}
		else if ( DOC_VIEW ) {
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
		MODE = TYPE_MODE;
		String result = KMTHelper.getMangledIdentifier(node.getName()) + " : " + ppTypeFromMultiplicityElement(node);
		MODE = DEFINITION_MODE;
		return result;
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
		String result = ppTags(node);
		result += "package " + KMTHelper.getMangledIdentifier(node.getName()) + "\n";
		result += getPrefix() + "{\n";
		String old_cname = current_pname;
		current_pname = NamedElementHelper.getMangledQualifiedName(node);
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
		String result = "";
		if ( DOC_VIEW )
			result = ppTags(node);
	    
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
			MODE = TYPE_MODE;
			result += " : " + ppTypeFromMultiplicityElement(node);
			MODE = DEFINITION_MODE;
		}
		else {
			result += " : kermeta::standard::~Void" ;
		}
		
		if (node.getOpposite() != null) 
			result += "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName());
		
		if (node.isIsDerived() && printBody) {
			pushPrefix();
			result += "\n" + getPrefix() + "getter is " ;
			if (node.getGetterBody() != null) result += this.accept(node.getGetterBody());
			else {
				result += getEmptyDerivedPropertyBody(node, "getter");
			}
			// no setter for readonly or multiplicity > 1
			if (! node.isIsReadOnly() && node.getUpper() == 1) {
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
		String result = "do\n";
		pushPrefix();
		result += getPrefix() + "//TODO: implement "+ body_type + " for derived property " + node.getName() + "\n"; 
		result += getPrefix() + "raise kermeta::exceptions::NotImplementedException.new \n";
		popPrefix();
		result += getPrefix() + "end";
		return result;
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Raise)
	 */
	public Object visitRaise(Raise node) {
		return "raise " + this.accept(node.getExpression());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.SelfExpression)
	 */
	public Object visitSelfExpression(SelfExpression node) {
		return "self";
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.StringLiteral)
	 */
	public Object visitStringLiteral(StringLiteral node) {
		String value = "\"";
		/*
		 * 
		 * We must be carefull about special characters.
		 * 
		 */
		int size = node.getValue().length();
		for ( int i = 0; i < size; i++ ) {
			char c = node.getValue().charAt(i);
			switch (c) {
			case '\n' :
				value += "\\n";
				break;
			case '"' :
				value += "\\\"";
				break;
			case '\t' :
				value += "\\t";
				break;
			case '\r' :
				value += "\\r";
				break;
			case '\\' :
				value += "\\\\";
				break;
			default :
				value += c;
				break;
			}
		}
		
		value += "\"";
		return value;	
//		return "\"" + node.getValue().replace("\"", "\\\"") +"\"";
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
		MODE = TYPE_MODE;
	    Object result = ppTypeFromMultiplicityElement(node);
	    MODE = DEFINITION_MODE;
	    return result;
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
		String result = "var " + KMTHelper.getMangledIdentifier(node.getIdentifier()) + " : " + this.accept(node.getType());
		if (node.getInitialization() != null)
			result += " init " + this.accept(node.getInitialization());
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.VoidLiteral)
	 */
	public Object visitVoidLiteral(VoidLiteral node) {
		return "void";
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
			
			if(fName.equals("not") && isBooleanTypeDef(tgt.getStaticType())) {
					//result += "(not (";
					result += this.accept(tgt);
					result += ".~not";
					//result += ")";
				}
			else if(fName.equals("and") && isBooleanTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " and ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("or") && isBooleanTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " or ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("plus") && (isNumericalTypeDef(tgt.getStaticType()) || isStringTypeDef(tgt.getStaticType()))) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " + ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("minus") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " - ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("mult") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " * ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("div") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " / ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("isGreater") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " > ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("isLower") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " < ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("isGreaterOrEqual") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " >= ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			else if(fName.equals("isLowerOrEqual") && isNumericalTypeDef(tgt.getStaticType())) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " <= ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
				if ( ! (node.eContainer() instanceof Block) )
					result = "(" + result + ")";
			}
			/*else if(fName.equals("equals") && (isBooleanTypeDef(tgt.getStaticType()) || isNumericalTypeDef(tgt.getStaticType()))) {
				result += "(";
				result += this.accept(tgt);
				result += ")";
				result += " == ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += ")";
			}
			else if(fName.equals("isNotEqual") && (isBooleanTypeDef(tgt.getStaticType()) || isNumericalTypeDef(tgt.getStaticType()))) {
				result += "((";
				result += this.accept(tgt);
				result += ")";
				result += " != ";
				result += "(";
				result += ppComaSeparatedNodes(node.getParameters());
				result += "))";
			}*/
			else {
				// Other feature calls...
				result += this.accept(tgt);
				result += "." + KMTHelper.getMangledIdentifier(node.getName());
				
				// handle when the feature is postfixed with @pre
				if (node.isIsAtpre()){
					if(node.getStaticProperty() != null){
						result += "@pre";
					}else{
						result += " /* only properties can be postfixed with @pre */";
					}
				}
				
				// handle the special case where there is 1 parameter, and when This
				// parameter is a lambdaPostFix
				//	TODO : throw an exception if type is not a LambdaExpression
				if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0))) {
				   result+= ppComaSeparatedNodes(node.getParameters());
				}
				// the classic case : a list of parameters
				else if (node.getParameters().size()> 0) {
					result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
				}
			}
		}
		else {
			result += KMTHelper.getMangledIdentifier(node.getName());
			
			// handle when the feature is postfixed with @pre
			if (node.isIsAtpre()){
				if(node.getStaticProperty() != null){
					result += "@pre";
				}else{
					result += " /* only properties can be postfixed with @pre */";
				}
			}
			
			// handle the special case where there is 1 parameter, and when This
			// parameter is a lambdaPostFix
			//	TODO : throw an exception if type is not a LambdaExpression
			if (node.getParameters().size()==1 && LambdaExpression.class.isInstance(node.getParameters().get(0))) {
			   result+= ppComaSeparatedNodes(node.getParameters());
			}
			// the classic case : a list of parameters
			else if (node.getParameters().size()> 0) {
				result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
			}
		}
		return result;
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
		String result = KMTHelper.getMangledIdentifier(node.getName());
		
		// handle when the variable is postfixed with @pre
		if(node.isIsAtpre()){
			result+="@pre";
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
        if ( node.getName() == null ) {
        	result = node.getValue();
        } else {
        	
        	if ( node.getName().equals(TagHelper.KERMETA_DOCUMENTATION) )
        		if ( ! node.getValue().startsWith("/**") )
        			result = "/**" + node.getValue() + "*/";
        		else
        			result = node.getValue();
        	else
        		result = "@"+node.getName()+" \""+node.getValue()+"\"";
        }
        return result;
    }
    
	protected String prefix = "";
	
	protected String getPrefix() {
		return prefix;
	}
	
	protected String prefixTab = "\t";
	public void pushPrefix() {
		prefix = prefix + prefixTab;
	}
	
	public void popPrefix() {
		prefix = prefix.substring(prefixTab.length());
	}
	
	/**
	 * @return Returns the usings.
	 */
	public ArrayList<String> getUsings() {
		return usings;
	}

	
	/**
	 * Get a list of tag which name is <code>name</code>
	 * Later, we will think about the relevance of having not unique tags (depends on how we handle
	 * code documentation => extern system, or integrated?)
	 */
	public Tag[] getFTagsByName(EList<Tag> ftagList, String name)
	{
	    Iterator<Tag> it = ftagList.iterator();
	    Tag[] result_tagArray = new Tag[10];
	    int i = 0;
	    while (it.hasNext())
	    {
	        Tag tag = it.next();
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
			result += " from " + KMTHelper.getMangledIdentifier(NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass()));
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
	
	/**
	 * Tests whether the Type t corresponds to the Kermeta String type, which can be encoded
	 * either as the String PrimitiveType or the String class.
	 * @param t
	 * @return
	 */
	protected boolean isStringTypeDef(Type t) {
		if(t instanceof Class) {
			return ((Class) t).getTypeDefinition().getName().equals("String");
		}
		else if(t instanceof PrimitiveType) {
			return ((PrimitiveType) t).getName().equals("String");
		}
		else
			return false;
	}
}
