/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FMultiplicityElement;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.FVoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public 
class GetTextVisitor extends KermetaOptimizedVisitor {
	
    //protected KermetaOutline outline;
	
	public GetTextVisitor(/*KermetaOutline outline*/) {
	    //this.outline = outline;
		//pp = new KM2KMTPrettyPrinter();
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject arg0) {
		return null;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visitFClassDefinition(FClassDefinition node) {
		String result = node.getFName();
		if (node.getFTypeParameter().size() > 0) {
			result += "<";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += ">";
		}
		/*
		if (node.getFSuperType().size() > 0) {
			result += " -> ";
			result += ppComaSeparatedNodes(node.getFSuperType());
		}
		*/
		return result;
	}
	
	public String ppTypeVariableDeclaration(EList tparams) {
		String result = "";
		Iterator it = tparams.iterator();
		while (it.hasNext()) {
			FTypeVariable node = (FTypeVariable)it.next();
			result += node.getFName();
			if (node.getFSupertype() != null) result += " : " + ((FClass)node.getFSupertype()).getFClassDefinition().getFName();
			if (it.hasNext()) result +=  ", ";
		}
		return result;
	}
	
	public Object visitFTypeVariable(FTypeVariable arg0) {
		return arg0.getFName();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visitFEnumeration(FEnumeration arg0) {
		return arg0.getFName();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visitFEnumerationLiteral(FEnumerationLiteral arg0) {
		return arg0.getFName();
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitFOperation(FOperation node) {
		String result = node.getFName();
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
		return result;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visitFPackage(FPackage arg0) {
		return getQualifiedName(arg0);
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visitFPrimitiveType(FPrimitiveType arg0) {
		return arg0.getFName();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visitFProperty(FProperty node) {
		String result = node.getFName() + " : " + ppTypeFromMultiplicityElement(node);
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FProductType)
	 */
	public Object visitFProductType(FProductType node) {
		String result = "[" + ppComaSeparatedNodes(node.getFType()) + "]";
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FFunctionType)
	 */
	public Object visitFFunctionType(FFunctionType node) {
		return "< " + this.accept(node.getFLeft()) + "->" + this.accept(node.getFRight()) + " >";
	}
	
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FVoidType)
	 */
	public Object visitFVoidType(FVoidType node) {
		return "Void";
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visitFClass(FClass node) {
		String result = node.getFClassDefinition().getFName();
		if (node.getFTypeParamBinding().size() > 0) {
			result += "<" + ppComaSeparatedNodes(node.getFTypeParamBinding()) + ">";
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FTypeVariableBinding)
	 */
	public Object visitFTypeVariableBinding(FTypeVariableBinding node) {
	    if (node.getFType() == null) return "!NULL!";
		return this.accept(node.getFType());
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FParameter)
	 */
	public Object visitFParameter(FParameter node) {
		return node.getFName() + " : " + ppTypeFromMultiplicityElement(node);
	}
	
	public String getQualifiedName(FNamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + element.getFName();
		else return element.getFName();
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
}

