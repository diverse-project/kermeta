/* $Id: KTNHintHTMLPrettyPrinter.java,v 1.8 2008-01-04 15:05:46 dvojtise Exp $
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
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

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
		if(node instanceof ClassDefinition)
			result += htmlSummary((ClassDefinition)node);
		mainClass =  false;
		result+="</pre>";
		return  result;
	}
	
	
	public String htmlSummary(ClassDefinition node) {
		String result="";
		if(mainClass){
			String tags = ppTags(node.getTag());
			result = getPrefix() + tags;
			if(tags.compareTo("")!=0) result += "\n" ;
		}
		if(!classFlat && classShortLevel < 1) return result;
		result += getPrefix();
		if (node.isIsAbstract()) result += "<b>abstract</b> ";
		result += "<b>class</b> " + KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "&lt;";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += "&gt;";
		}
		result += "\n" ;
		if (node.getSuperType().size() > 0) {
			Vector<String> knowOperationNames = new Vector<String>();

			// fill the knownOperationName list with those of the current node we don't care of the resulting list 
			// EList e = getOperationsNotIn(node, knowOperationNames);
			if(!classFlat)
			{ // shows only the the directly inherited classes

				result += " <b>inherits from</b>";
				Iterator itSuperType = node.getSuperType().iterator();
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
				Iterator itSuperType = node.getSuperType().iterator();
				while(itSuperType.hasNext()){
					result += CR;
					EObject o = (EObject)itSuperType.next();
					result += getPrefix() + "<b>class</b> " + this.accept(o);
					if(classShortLevel > 1 && o instanceof ClassDefinition){
						ClassDefinition superNode = (ClassDefinition)o;
						pushPrefix();
						result += ppCRSeparatedNode(superNode.getOwnedAttribute());
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
			result += ppCRSeparatedNode(node.getOwnedAttribute());
			// show operations with tags
			result += ppCRSeparatedNode(node.getOwnedOperation());
			popPrefix();
			result += getPrefix() + "}";		
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	protected EList getOperationsNotIn(ClassDefinition node, Vector<String> knownOperationNames)
	{
			EList el =  new BasicEList();
		Iterator it = node.getOwnedOperation().iterator();
		while(it.hasNext()){
			Operation o = (Operation)it.next();
			if(!(knownOperationNames.contains(o.getName())))
			{
				knownOperationNames.add(o.getName());
				el.add(o);
			}
		}
		return el;
	}
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#visit(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
	 */
	public Object visit(ClassDefinition node) {
		typedef = false;
		String result="";
		if(mainClass){
			String tags = ppTags(node.getTag());
			result = getPrefix() + tags;
			if(tags.length() != 0) result += CR ;
		}
		if(!classFlat && currentClassShortLevel < classShortLevel) return result;
		result += getPrefix();
		if (node.isIsAbstract()) result += "<b>abstract</b> ";
		result += "<b>class</b> " + KMTHelper.getMangledIdentifier(node.getName());
		if (node.getTypeParameter().size() > 0) {
			result += "&lt;";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += "&gt;";
		}
		if (node.getSuperType().size() > 0) {
			result += CR + getPrefix() + "<b>inherits from</b> ";
			Iterator itSuperType = node.getSuperType().iterator();
			while(itSuperType.hasNext()){
				if(!classFlat){
					result += CR + getPrefix() + prefixTab + "<b>class</b> ";
					EObject o = (EObject)itSuperType.next();
					result += this.accept(o);
				}
				else{
					result += CR;
					EObject o = (EObject)itSuperType.next();
					if(o instanceof fr.irisa.triskell.kermeta.language.structure.Class){
						fr.irisa.triskell.kermeta.language.structure.Class aFClass = (fr.irisa.triskell.kermeta.language.structure.Class)o;
						currentClassShortLevel++;
						pushPrefix();
						boolean previousMainClass = mainClass;
						mainClass =  false;
						result += this.accept(aFClass.getTypeDefinition());
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
			result += ppCRSeparatedNode(node.getOwnedAttribute());
			result += ppCRSeparatedNode(node.getOwnedOperation());
			popPrefix();
			result += getPrefix() + "}";		
		}
		
		typedef = true;
		return result;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#ppSimplifiedProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public String ppSimplifiedProperty(Property node) {
		//return super.ppSimplifiedProperty(node);
		String result = "";
		if(mainClass){
			String tags = ppTags(node.getTag());
			result = getPrefix() + tags;
			if(tags.length() != 0) result += CR ;
		}
		if (node.isIsDerived()) result += "<b>property</b> ";
		else if (node.isIsComposite()) result += "<b>attribute</b> ";
		else result += "<b>reference</b> ";
		if (node.isIsReadOnly()) result += "<b>readonly</b> ";
		result += KMTHelper.getMangledIdentifier(node.getName()) + " : " + ppTypeFromMultiplicityElement(node);
		if (node.getOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName());
		return result;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#visit(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	public Object visit(Operation node) {
		//return super.visit(node);
		String result = "";
		if(mainClass){
			//result = ppTags(node.getTag());
			String tags = ppTags(node.getTag());
			result = getPrefix() + tags;
			if(tags.length() != 0) result += CR ;
		}
		if (node.isIsAbstract()) result += "<b>abstract</b> ";
		if (node.getSuperOperation() != null) result += "<b>method</b> ";
		else result += "<b>operation</b> ";
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
			result += " from " + NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass());
		}
		if (node.getRaisedException().size() > 0) {
			result += " raises " + ppComaSeparatedNodes(node.getRaisedException());
		}
		
		return result;
	}

	public KTNHintHTMLPrettyPrinter() {
		super();
		prefixTab = "   ";
	}

}
