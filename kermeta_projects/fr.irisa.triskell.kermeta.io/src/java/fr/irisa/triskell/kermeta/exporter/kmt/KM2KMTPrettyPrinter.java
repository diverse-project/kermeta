/* $Id: KM2KMTPrettyPrinter.java,v 1.32 2006-06-21 12:01:09 zdrey Exp $
 * Project   : Kermeta.io
 * File      : KM2KMTPrettyPrinter.java
 * License   : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 *  Zoe Drey 		zdrey@irisa.fr
 *  Didier Vojtisek	zdrey@irisa.fr
 * Description :
 * 	Prints a kermeta model into a human-readable form (which is KMT)
 * 
 * 
*/
package fr.irisa.triskell.kermeta.exporter.kmt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
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
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass7;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;



/**
 * PrettyPrinter that prints a Kermeta program in its concrete syntax. 
 */
public class KM2KMTPrettyPrinter extends KermetaOptimizedVisitor {

	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	
	/** If the visitor (i.e This printer:)) is currently visiting a typedefinition, this
	 *  boolean is set to true (this allows the visitor to print differently some things
	 *  according to the context inside which it is (i.e typeDefintion or not typeDefinition) */
	protected boolean typedef = true;
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KM2KMT");
	
	
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
		root_pname = KMTHelper.getQualifiedName(p);
		String result = "package " + root_pname + ";\n\n";
		for(int i=0; i<imports.size();i++) result += "require \"" + imports.get(i) + "\"\n";
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
	
	public String ppPackageContents(Package p) {
		root_pname = KMTHelper.getQualifiedName(p);
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
		String result = node.getStereotype().toString();
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
		String op = (node.isIsCast())?"?":":";
		return left + " " + op + "= " + right;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Block)
	 */
	public Object visitBlock(Block node) {
		String result = "do\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getStatement());
		
		popPrefix();
		Iterator it = node.getRescueBlock().iterator();
		while(it.hasNext()) {
			result += getPrefix() + this.accept((Rescue)it.next()) + "\n";
		}
		result += getPrefix() + "end";
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
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
		    EObject next = (EObject)it.next();
			result += getPrefix() + this.accept(next) + "\n";
		}
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
		String qname = KMTHelper.getQualifiedName(node.getTypeDefinition());
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
		String qname = KMTHelper.getQualifiedName(node.getTypeDefinition());
		String name = KMTHelper.getMangledIdentifier(node.getTypeDefinition().getName());
		String result = ppTypeName(qname, name);
		if (node.getTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getTypeParamBinding()) + ">";
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
			String qname = KMTHelper.getQualifiedName(node);
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
	public String ppTags(EList tagList)
	{
	    String result = "";
	    for (int i=0; i< tagList.size(); i++)
	    {
	        result += this.accept((EObject)tagList.get(i));
	    }
	    return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 */
	public Object visitConditional(Conditional node) {
		String result = "if " + this.accept(node.getCondition()) + " then\n";
		pushPrefix();
		if (node.getThenBody() != null) result += getPrefix() + this.accept(node.getThenBody()) + "\n";
		popPrefix();
		if (node.getElseBody() != null) {
			result += getPrefix() + "else\n";
			pushPrefix();
			result +=  getPrefix() + this.accept(node.getElseBody()) + "\n";
			popPrefix();
		}
		result += getPrefix() + "end";
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
			result += ppCRSeparatedNode(node.getOwnedLiteral());
			popPrefix();
			result += getPrefix() + "}";
			typedef = true;
			return result;
		}
		else {
			String qname = KMTHelper.getQualifiedName(node);
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
	 */
	public Object visitLoop(Loop node) {
		String result = "from " ; 
		result += this.accept(node.getInitialization()) + "\n";
		result += getPrefix() + "until " + this.accept(node.getStopCondition()) + "\n";
		result += getPrefix() +"loop\n";
		pushPrefix();
		result += this.accept(node.getBody());
		popPrefix();
		result += getPrefix() +"end";
		return result;
	}
	
	public Object visitModelTypeDefinition(ModelTypeDefinition node) {
		String result = ppTags(node.getTag());
		result += "modeltype " + KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += ">";
		}
		result += "\n" + getPrefix() + "{\n";
		String old_cname = current_pname;
		current_pname = KMTHelper.getQualifiedName(node);
		pushPrefix();
		typedef = true;
		result += ppCRSeparatedNode(node.getOwnedTypeDefinition());
		typedef = false;
		popPrefix();
		current_pname = old_cname;
		result += getPrefix() + "}\n";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		setParent(node);
		String result = ppTags(node.getTag());
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
		// Type of operation is allowed to be null..
		if(node.getType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
		else {
			result += " : kermeta::standard::~Void" ;
		}
	
		if (node.getSuperOperation() != null) {
			result += " from " + KMTHelper.getMangledIdentifier(KMTHelper.getQualifiedName(node.getSuperOperation().getOwningClass()));
		}
		if (node.getRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getRaisedException());
		} 
		if (node.getBody() != null) {
			result += " is\n";
			pushPrefix();
			result += ppCRSeparatedNode(node.getPre());
			result += getPrefix() + this.accept(node.getBody());
			result += "\n" + ppCRSeparatedNode(node.getPost());
			popPrefix();
		}
		else if (node.isIsAbstract()) result += " is abstract";
		else {
			result += " is\n";
			result += ppCRSeparatedNode(node.getPre());
			result += getPrefix() + "do\n";
			pushPrefix();
			result += getPrefix() + "//TODO: implement operation " + node.getName() + "\n"; 
			result += getPrefix() + "raise kermeta::exceptions::NotImplementedException.new \n";
			result += ppCRSeparatedNode(node.getPost());
			popPrefix();
			result += getPrefix() + "end";
		}
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
		current_pname = KMTHelper.getQualifiedName(node);
		pushPrefix();
		typedef = true;
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
		return "\"" + node.getValue() +"\""; //TODO : escape characters ?
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.TypeVariable)
	 */
	public Object visitTypeVariable(TypeVariable node) {
		return KMTHelper.getMangledIdentifier(node.getName());
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
		if (node.getParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getParameters()) + ")";
		}
		return result;
	}
	
    /**
     * Tag is used to store comments in the source code.
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object visitTag(Tag node)
    {
        String result = "";
        // User can choose to add a "@kdoc" tag
        if (node.getName().equals(KMT2KMPass7.KERMETADOC) && !node.getValue().startsWith("/**"))
        {
            result = "/**" + node.getValue() + "*/\n";
        }
        // Or simple comment /** */ delimitor TODO also remove pretty "*" 
        else if (node.getValue().startsWith("/**"))
        {
            result = node.getValue();
        }
        else
        {
            result = "@"+node.getName()+" \""+node.getValue()+"\"\n";
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
			result += " from " + KMTHelper.getMangledIdentifier(KMTHelper.getQualifiedName(node.getSuperOperation().getOwningClass()));
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
	
	
	
}

