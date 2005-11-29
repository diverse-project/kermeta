/* $Id: KM2KMTPrettyPrinter.java,v 1.19 2005-11-29 14:16:44 dvojtise Exp $
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FBooleanLiteral;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FCallResult;
import fr.irisa.triskell.kermeta.behavior.FCallSuperOperation;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FConditionnal;
import fr.irisa.triskell.kermeta.behavior.FIntegerLiteral;
import fr.irisa.triskell.kermeta.behavior.FJavaStaticCall;
import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.behavior.FLoop;
import fr.irisa.triskell.kermeta.behavior.FRaise;
import fr.irisa.triskell.kermeta.behavior.FRescue;
import fr.irisa.triskell.kermeta.behavior.FSelfExpression;
import fr.irisa.triskell.kermeta.behavior.FStringLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeReference;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.behavior.FVoidLiteral;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass7;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FMultiplicityElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;



/**
 *
 */
public class KM2KMTPrettyPrinter extends KermetaVisitor {

	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	
	protected boolean typedef = true;
	
	public void ppPackage(FPackage p, File file) {
		try {
			FileWriter w = new FileWriter(file);
			w.write(ppPackage(p));
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String ppPackage(FPackage p) {
		root_pname = KMTHelper.getQualifiedName(p);
		String result = "package " + root_pname + ";\n\n";
		for(int i=0; i<imports.size();i++) result += "require \"" + imports.get(i) + "\"\n";
		if (imports.size()>0) result += "\n";
		for(int i=0; i<usings.size();i++) result += "using " + usings.get(i) + "\n";
		if (usings.size()>0) result += "\n";
		current_pname = root_pname;
		typedef = true;
		result += ppCRSeparatedNode(p.getFOwnedTypeDefinition());
		typedef = false;
		result += ppCRSeparatedNode(p.getFNestedPackage());
		
		// temporary handle of orphan tags
		//result +=
		return result;
	}
	
	public String ppPackageContents(FPackage p) {
		root_pname = KMTHelper.getQualifiedName(p);
		String result = "";
		current_pname = root_pname;
		typedef = true;
		result += ppCRSeparatedNode(p.getFOwnedTypeDefinition());
		typedef = false;
		result += ppCRSeparatedNode(p.getFNestedPackage());
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
	public Object visit(FAssignement node) {
		String left = this.accept(node.getFTarget()).toString();
		String right = this.accept(node.getFValue()).toString();
		String op = (node.isFIsCast())?"?":":";
		return left + " " + op + "= " + right;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {
		String result = "do\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFStatement());
		
		popPrefix();
		Iterator it = node.getFRescueBlock().iterator();
		while(it.hasNext()) {
			result += getPrefix() + this.accept((FRescue)it.next()) + "\n";
		}
		result += getPrefix() + "end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRescue)
	 */
	public Object visit(FRescue node) {
		String result = "rescue";
		if (node.getFExceptionName() != null) {
			result += "(" + node.getFExceptionName() + " : " + this.accept(node.getFExceptionType()) + ")";
		}
		result += "\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFBody());
		popPrefix();
		return result;
	}
	
	public String ppCRSeparatedNode(EList expressions) {
		String result = "";
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
		    
			result += getPrefix() + this.accept((EObject)it.next()) + "\n";
			
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral)
	 */
	public Object visit(FBooleanLiteral node) {
		return ""+node.isFValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallSuperOperation)
	 */
	public Object visit(FCallSuperOperation node) {
		String result = "super(";
		result += ppComaSeparatedNodes(node.getFParameters());
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
	public Object visit(FClass node) {
		String qname = KMTHelper.getQualifiedName(node.getFClassDefinition());
		String name = KMTHelper.getMangledIdentifier(node.getFClassDefinition().getFName());
		String result = ppTypeName(qname, name);
		if (node.getFTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visit(FTypeVariableBinding node) {
		return this.accept(node.getFType());
	}
	
	/** 
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		typedef = false;
		String result = "";

		result += ppTags(node.getFTag());
		
		if (node.isFIsAbstract()) result += "abstract ";
		result += "class " + KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += ">";
		}
		if (node.getFSuperType().size() > 0) {
			result += " inherits ";
			result += ppComaSeparatedNodes(node.getFSuperType());
		}
		result += "\n" + getPrefix() + "{\n";
		pushPrefix();
		result += ppCRSeparatedNode(node.getFOwnedAttributes());
		result += ppCRSeparatedNode(node.getFOwnedOperation());
		popPrefix();
		result += getPrefix() + "}";		
		
		typedef = true;
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visit(FPrimitiveType node) {
		if (typedef == true) {
			typedef = false;
			String result = "alias " + node.getFName() + " : " + this.accept(node.getFInstanceType()) + ";";
			typedef = true;
			return result;
		}
		else {
			String qname = KMTHelper.getQualifiedName(node);
			String name = KMTHelper.getMangledIdentifier(node.getFName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	public String ppTypeVariableDeclaration(EList tparams) {
		String result = "";
		Iterator it = tparams.iterator();
		while (it.hasNext()) {
			FTypeVariable node = (FTypeVariable)it.next();
			result += KMTHelper.getMangledIdentifier(node.getFName());
			if (node.getFSupertype() != null) result += " : " + this.accept(node.getFSupertype());
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
	public Object visit(FConditionnal node) {
		String result = "if " + this.accept(node.getFCondition()) + " then\n";
		pushPrefix();
		if (node.getFThenBody() != null) result += getPrefix() + this.accept(node.getFThenBody()) + "\n";
		popPrefix();
		if (node.getFElseBody() != null) {
			result += getPrefix() + "else\n";
			pushPrefix();
			result +=  getPrefix() + this.accept(node.getFElseBody()) + "\n";
			popPrefix();
		}
		result += getPrefix() + "end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration node) {
		if (typedef == true) {
			typedef = false;
			String result = "enumeration " + KMTHelper.getMangledIdentifier(node.getFName()) + "\n";
			result += getPrefix() + "{\n";
			pushPrefix();
			result += ppCRSeparatedNode(node.getFOwnedLiteral());
			popPrefix();
			result += getPrefix() + "}";
			typedef = true;
			return result;
		}
		else {
			String qname = KMTHelper.getQualifiedName(node);
			String name = KMTHelper.getMangledIdentifier(node.getFName());
			String result = ppTypeName(qname, name);
			return result;
		}
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral node) {
		return KMTHelper.getMangledIdentifier(node.getFName()) + ";";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visit(FFunctionType node) {
		return "< " + this.accept(node.getFLeft()) + "->" + this.accept(node.getFRight()) + " >";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral)
	 */
	public Object visit(FIntegerLiteral node) {
		return "" + node.getFValue();
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
		String result = "extern " + node.getFJclass() + "." + KMTHelper.getMangledIdentifier(node.getFJmethod()) + "(";
		result += ppComaSeparatedNodes(node.getFParameters());
		result += ")";
		return result;
	}
	/**
	 * A lambda expression is printed differently according to its use.
	 * But for now we will only authorize it to be :
	 * - a CallFeature (a parameter)
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaExpression)
	 */
	public Object visit(FLambdaExpression node) {
		String result = "{";
		result += ppComaSeparatedNodes(node.getFParameters());
		result += " | ";
		pushPrefix();
		result += this.accept(node.getFBody());
		popPrefix();
		result += "}";
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLambdaParameter)
	 */
	public Object visit(FLambdaParameter node) {
		String result = KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFType() != null) {
			result += " : " + this.accept(node.getFType());
		}
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLoop)
	 */
	public Object visit(FLoop node) {
		String result = "from " ; 
		result += this.accept(node.getFInitiatization()) + "\n";
		result += getPrefix() + "until " + this.accept(node.getFStopCondition()) + "\n";
		result += getPrefix() +"loop\n";
		pushPrefix();
		result += this.accept(node.getFBody());
		popPrefix();
		result += getPrefix() +"end";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		String result = ppTags(node.getFTag());
		if (node.getFSuperOperation() != null) result += "method ";
		else result += "operation ";
		result += KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += ">";
		}
		result += "(";
		result += ppComaSeparatedNodes(node.getFOwnedParameter());
		result += ")";
		if(node.getFType() != null) {
			result += " : " + ppTypeFromMultiplicityElement(node);
		}
	
		if (node.getFSuperOperation() != null) {
			result += " from " + KMTHelper.getMangledIdentifier(KMTHelper.getQualifiedName(node.getFSuperOperation().getFOwningClass()));
		}
		if (node.getFRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getFRaisedException());
		}
		if (node.getFBody() != null) {
			result += " is\n";
			pushPrefix();
			result += getPrefix() + this.accept(node.getFBody());
			popPrefix();
		}
		else if (node.isFIsAbstract()) result += " is abstract";
		else {
			result += " is do\n";
			pushPrefix();
			result += getPrefix() + "//TODO: implement operation " + node.getFName() + "\n"; 
			popPrefix();
			result += getPrefix() + "end";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visit(FParameter node) {
		return KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
	}
	
	public String ppTypeFromMultiplicityElement(FMultiplicityElement elem) {
		String result = "";
		if (elem.getFUpper() != 1) {
			if (elem.isFIsOrdered()) {
				if (!elem.isFIsUnique()) result +="seq ";
			}
			else {
				if (elem.isFIsUnique()) result +="set ";
				else result +="bag ";
			}
		}
		result += this.accept(elem.getFType());
		if (elem.getFLower() != 0 || elem.getFUpper() != 1) {
			result += "[" + elem.getFLower() + "..";
			result += (elem.getFUpper()<0)?"*":""+elem.getFUpper();
			result += "]";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage node) {
	    
		String result = ppTags(node.getFTag());
		result += "package " + KMTHelper.getMangledIdentifier(node.getFName()) + "\n";
		result += getPrefix() + "{\n";
		String old_cname = current_pname;
		current_pname = KMTHelper.getQualifiedName(node);
		pushPrefix();
		typedef = true;
		result += ppCRSeparatedNode(node.getFOwnedTypeDefinition());
		result += ppCRSeparatedNode(node.getFNestedPackage());
		popPrefix();
		current_pname = old_cname;
		result += getPrefix() + "}\n";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProductType)
	 */
	public Object visit(FProductType node) {
		String result = "[" + ppComaSeparatedNodes(node.getFType()) + "]";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty node) {
	    String result = ppTags(node.getFTag());
		if (node.isFIsDerived()) result += "property ";
		else if (node.isFIsComposite()) result += "attribute ";
		else result += "reference ";
		if (node.isFIsReadOnly()) result += "readonly ";
		result += KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getFOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getFOpposite().getFName());
		if (node.isFIsDerived()) {
			pushPrefix();
			result += "\n" + getPrefix() + "getter is " ;
			if (node.getFGetterbody() != null) result += this.accept(node.getFGetterbody());
			else {
				result += "do\n";
				pushPrefix();
				result += getPrefix() + "//TODO: implement getter for derived property " + node.getFName() + "\n"; 
				popPrefix();
				result += getPrefix() + "end";
			}
			if (! node.isFIsReadOnly()) {
				result += "\n" + getPrefix() + "setter is ";
				if (node.getFSetterbody() != null) result += this.accept(node.getFSetterbody());
				else {
					result += "do\n";
					pushPrefix();
					result += getPrefix() + "//TODO: implement setter for derived property " + node.getFName() + "\n"; 
					popPrefix();
					result += getPrefix() + "end";
				}
			}
			popPrefix();
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FRaise)
	 */
	public Object visit(FRaise node) {
		return "raise " + this.accept(node.getFExpression());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FSelfExpression)
	 */
	public Object visit(FSelfExpression node) {
		return "self";
	}

	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FStringLiteral)
	 */
	public Object visit(FStringLiteral node) {
		return "\"" + node.getFValue() +"\""; //TODO : escape characters ?
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeLiteral)
	 */
	public Object visit(FTypeLiteral node) {
		return this.accept(node.getFTyperef());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FTypeReference)
	 */
	public Object visit(FTypeReference node) {
	    return ppTypeFromMultiplicityElement(node);
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariable)
	 */
	public Object visit(FTypeVariable node) {
		return KMTHelper.getMangledIdentifier(node.getFName());
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVariableDecl)
	 */
	public Object visit(FVariableDecl node) {
		String result = "var " + KMTHelper.getMangledIdentifier(node.getFIdentifier()) + " : " + this.accept(node.getFType());
		if (node.getFInitialization() != null)
			result += " init " + this.accept(node.getFInitialization());
		return result;
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FVoidLiteral)
	 */
	public Object visit(FVoidLiteral node) {
		return "void";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visit(FVoidType node) {
		return "Void";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
	public Object visit(FCallFeature node) {
		String result = "";
		if (node.getFTarget() != null) result += this.accept(node.getFTarget());
		else result += "self";
		result += "." + KMTHelper.getMangledIdentifier(node.getFName());
		// handle the special case where there is 1 parameter, and when This
		// parameter is a lambdaPostFix
		//	TODO : throw an exception if type is not a LambdaExpression
		if (node.getFParameters().size()==1 && FLambdaExpression.class.isInstance(node.getFParameters().get(0)))
		{
		   result+= ppComaSeparatedNodes(node.getFParameters());
		}
		// the classic case : a list of parameters
		else if (node.getFParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getFParameters()) + ")";
		}
		
		return result;
	}
	
	
	/**
	 * @see kermeta.visitor.KermetaVisitor#visit(kermeta.behavior.FCallResult)
	 */
	public Object visit(FCallResult node) {
		return "result";
	}
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallVariable)
	 */
	public Object visit(FCallVariable node) {
		String result = KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFParameters().size()> 0) {
			result += "(" + ppComaSeparatedNodes(node.getFParameters()) + ")";
		}
		return result;
	}
	
    /**
     * FTag is used to store comments in the source code.
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FTag)
     */
    public Object visit(FTag node)
    {
        String result = "";
        // User can choose to add a "@kdoc" tag
        if (node.getFName().equals(KMT2KMPass7.KERMETADOC) && !node.getFValue().startsWith("/**"))
        {
            result = node.getFValue() + "\n";
        }
        // Or simple comment /** */ delimitor TODO also remove pretty "*" 
        else if (node.getFValue().startsWith("/**"))
        {
            result = node.getFValue();
        }
        else
        {
            result = "@"+node.getFName()+" \""+node.getFValue()+"\"\n";
        }
        return result;
    }
    
	protected String prefix = "";
	
	protected String getPrefix() {
		return prefix;
	}
	
	protected void pushPrefix() {
		prefix = prefix + "\t";
	}
	
	protected void popPrefix() {
		prefix = prefix.substring(1);
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
	public FTag[] getFTagsByName(EList ftagList, String name)
	{
	    
	    Iterator it = ftagList.iterator();
	    FTag[] result_tagArray = new FTag[10];
	    int i = 0;
	    while (it.hasNext())
	    {
	        FTag tag = (FTag)it.next();
	        if (tag.getFName().equals(name))
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
	public String ppSimplifiedFPropertyInContext(FProperty node){
		String result="class "+node.getFOwningClass().getFName() + "is do /*...*/ ";
		result +=ppSimplifiedFProperty(node);
		result += " /*...*/ end";
		return result;
    }
	/**
	 * PrettyPrint a simplified version of the property
	 * (no tag, no getter and setter)
	 * @param node
	 * @return
	 */
	public String ppSimplifiedFProperty(FProperty node){
    	String result="";
    	if (node.isFIsDerived()) result += "property ";
		else if (node.isFIsComposite()) result += "attribute ";
		else result += "reference ";
		if (node.isFIsReadOnly()) result += "readonly ";
		result += KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getFOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getFOpposite().getFName());
		return result;
    }
	
}

