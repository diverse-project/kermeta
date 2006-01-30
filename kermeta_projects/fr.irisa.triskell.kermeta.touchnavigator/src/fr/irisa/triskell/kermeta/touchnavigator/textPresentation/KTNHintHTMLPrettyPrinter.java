/* $Id: KTNHintHTMLPrettyPrinter.java,v 1.4 2006-01-30 12:43:11 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : TNHintHTMLPrettyPrinter.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 1 janv. 2006
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.touchnavigator.textPresentation;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author dvojtise
 *
 */
public class KTNHintHTMLPrettyPrinter extends KM2KMTPrettyPrinter {
	/** if 0 do not show attributes and operations
	 * if 1 show only attributes and operations of the current class
	 * if >1 also shows attributes and operations of the inherited class (if classFlat == true)
	 */
	public int classShortLevel = 2;
	/** shows or not the inherited classes */
	public boolean classFlat = true;
	
	public String CR = "\n";
	
	public int currentClassShortLevel = 0;
	
	protected boolean mainClass = false;
	

	public String getHTMLDoc(EObject node)
	{
		String result = "<pre>";
		currentClassShortLevel = 0;
		mainClass =  true;
		if(node instanceof FClassDefinition)
			result += htmlSummary((FClassDefinition)node);
		mainClass =  false;
		result+="</pre>";
		return  result;
	}
	
	
	public String htmlSummary(FClassDefinition node) {
		String result="";
		if(mainClass){
			String tags = ppTags(node.getFTag());
			result = getPrefix() + tags;
			if(tags.compareTo("")!=0) result += "\n" ;
		}
		if(!classFlat && classShortLevel < 1) return result;
		result += getPrefix();
		if (node.isFIsAbstract()) result += "<b>abstract</b> ";
		result += "<b>class</b> " + KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFTypeParameter().size() > 0) {
			result += "&lt;";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += "&gt;";
		}
		result += "\n" ;
		if (node.getFSuperType().size() > 0) {
			Vector<String> knowOperationNames = new Vector<String>();

			// fill the knownOperationName list with those of the current node we don't care of the resulting list 
			// EList e = getOperationsNotIn(node, knowOperationNames);
			if(!classFlat)
			{ // shows only the the directly inherited classes

				result += " <b>inherits from</b>";
				Iterator itSuperType = node.getFSuperType().iterator();
				while(itSuperType.hasNext()){
					result += CR;
					EObject o = (EObject)itSuperType.next();
					result += getPrefix() + "<b>class</b> " + this.accept(o);
				}
			}
			else{

				pushPrefix();
				// retreive direct super classes
				// if short level > 1
					// show attributes 
					// show operations not redefined in the current class
				result += " <b>inherits from</b>";
				Iterator itSuperType = node.getFSuperType().iterator();
				while(itSuperType.hasNext()){
					result += CR;
					EObject o = (EObject)itSuperType.next();
					result += getPrefix() + "<b>class</b> " + this.accept(o);
					if(classShortLevel > 1 && o instanceof FClassDefinition){
						FClassDefinition superNode = (FClassDefinition)o;
						pushPrefix();
						result += ppCRSeparatedNode(superNode.getFOwnedAttributes());
						EList el =  getOperationsNotIn(superNode, knowOperationNames);
						result += ppCRSeparatedNode(el);
						//result += ppCRSeparatedNode(superNode.getFOwnedOperation());
						popPrefix();
						result += getPrefix() + "}";
					}
				}
				// retreive all indirect super classes
				// if short level > 1
					// show attributes 
					// show operations not redefined in the current class or in the previously processed class

				popPrefix();
			}
		}	
		// if short level > 0 
		if(classShortLevel > 0){
			result += CR + getPrefix() + "{" + CR;
			pushPrefix();
			// show attributes with tags
			result += ppCRSeparatedNode(node.getFOwnedAttributes());
			// show operations with tags
			result += ppCRSeparatedNode(node.getFOwnedOperation());
			popPrefix();
			result += getPrefix() + "}";		
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	protected EList getOperationsNotIn(FClassDefinition node, Vector<String> knownOperationNames)
	{
			EList el =  new BasicEList();
		Iterator it = node.getFOwnedOperation().iterator();
		while(it.hasNext()){
			FOperation o = (FOperation)it.next();
			if(!(knownOperationNames.contains(o.getFName())))
			{
				knownOperationNames.add(o.getFName());
				el.add(o);
			}
		}
		return el;
	}
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#visit(fr.irisa.triskell.kermeta.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition node) {
		typedef = false;
		String result="";
		if(mainClass){
			String tags = ppTags(node.getFTag());
			result = getPrefix() + tags;
			if(tags.length() != 0) result += CR ;
		}
		if(!classFlat && currentClassShortLevel < classShortLevel) return result;
		result += getPrefix();
		if (node.isFIsAbstract()) result += "<b>abstract</b> ";
		result += "<b>class</b> " + KMTHelper.getMangledIdentifier(node.getFName());
		if (node.getFTypeParameter().size() > 0) {
			result += "&lt;";
			result += ppTypeVariableDeclaration(node.getFTypeParameter());
			result += "&gt;";
		}
		if (node.getFSuperType().size() > 0) {
			result += CR + getPrefix() + "<b>inherits from</b> ";
			Iterator itSuperType = node.getFSuperType().iterator();
			while(itSuperType.hasNext()){
				if(!classFlat){
					result += CR + getPrefix() + prefixTab + "<b>class</b> ";
					EObject o = (EObject)itSuperType.next();
					result += this.accept(o);
				}
				else{
					result += CR;
					EObject o = (EObject)itSuperType.next();
					if(o instanceof FClass){
						FClass aFClass = (FClass)o;
						currentClassShortLevel++;
						pushPrefix();
						boolean previousMainClass = mainClass;
						mainClass =  false;
						result += this.accept(aFClass.getFClassDefinition());
						mainClass = previousMainClass;
						popPrefix();
						currentClassShortLevel--;
					}
					else {
						// not a class  => do not flatten inheritance
						result += getPrefix() + "<b>class</b> " + this.accept(o);
					}
				}
			}
		}
		if(currentClassShortLevel < classShortLevel){
			result += CR + getPrefix() + "{" + CR;
			pushPrefix();
			result += ppCRSeparatedNode(node.getFOwnedAttributes());
			result += ppCRSeparatedNode(node.getFOwnedOperation());
			popPrefix();
			result += getPrefix() + "}";		
		}
		
		typedef = true;
		return result;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#ppSimplifiedFProperty(fr.irisa.triskell.kermeta.structure.FProperty)
	 */
	public String ppSimplifiedFProperty(FProperty node) {
		//return super.ppSimplifiedFProperty(node);
		String result = "";
		if(mainClass){
			String tags = ppTags(node.getFTag());
			result = getPrefix() + tags;
			if(tags.length() != 0) result += CR ;
		}
		if (node.isFIsDerived()) result += "<b>property</b> ";
		else if (node.isFIsComposite()) result += "<b>attribute</b> ";
		else result += "<b>reference</b> ";
		if (node.isFIsReadOnly()) result += "<b>readonly</b> ";
		result += KMTHelper.getMangledIdentifier(node.getFName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getFOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getFOpposite().getFName());
		return result;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#visit(fr.irisa.triskell.kermeta.structure.FOperation)
	 */
	public Object visit(FOperation node) {
		//return super.visit(node);
		String result = "";
		if(mainClass){
			//result = ppTags(node.getFTag());
			String tags = ppTags(node.getFTag());
			result = getPrefix() + tags;
			if(tags.length() != 0) result += CR ;
		}
		if (node.isFIsAbstract()) result += "<b>abstract</b> ";
		if (node.getFSuperOperation() != null) result += "<b>method</b> ";
		else result += "<b>operation</b> ";
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
		
		return result;
	}

	public KTNHintHTMLPrettyPrinter() {
		super();
		prefixTab = "   ";
	}

}
