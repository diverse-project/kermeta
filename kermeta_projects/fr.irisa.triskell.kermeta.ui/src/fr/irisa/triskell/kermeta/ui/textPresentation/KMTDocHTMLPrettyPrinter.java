/* $Id: KMTDocHTMLPrettyPrinter.java,v 1.5 2008-02-28 17:54:42 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.ui.textPresentation;

import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;

/**
 * Create a HTML presentation of the given Kermeta object for use in a documentation
 * DVK : this class can really be improved for example :
 * 	the fact that it inherit from KM2KMTPrettyPrinter is not really pertinent since each object has its 
 * own presentation depending on the context in which it is called. a simplier structure is probably better
 * in this situation  
 */
public class KMTDocHTMLPrettyPrinter extends KM2KMTPrettyPrinter{
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
		MODE = DEFINITION_MODE;
		String result = "<pre>";
		currentClassShortLevel = 0;
		mainClass =  true;
		if(node instanceof ClassDefinition)
			result += htmlSummary((ClassDefinition)node);
		if(node instanceof Package)
			result += htmlSummary((Package)node);

		if(node instanceof Operation)
			result += htmlSummary((Operation)node);

		if(node instanceof Property)
			result += htmlSummary((Property)node);
		
		if ( node instanceof Constraint )
			result += htmlConstraint( (Constraint) node );
		
		mainClass =  false;
		result+="</pre>";
		return  fixPlatformURL(fixImages(result));
	}
	
	
	public String htmlSummary(Package node) {
		StringBuffer result= new StringBuffer("");
		result.append("<b>package</b> " + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("\n") ;
		String tags = ppTags(node.getTag());
		result.append(getPrefix() + tags);
		if(tags.compareTo("")!=0) result.append("\n") ;
		return result.toString();
	}
		
	/**
	 * Pretty print a summary for an operation.
	 * 
	 * @param o
	 * @return
	 */
	private String ppOperationSummary(Operation o) {
		String result = (String) accept(o);
		result += "\n\n";
		return result;
	}
	
	/**
	 * Pretty print the summary for a list of operations.
	 * 
	 * @param l
	 * @return
	 */
	private String ppOperationSummaries(List<Operation> l) {
		String result = "";
		for ( Operation o : l )
			result += ppOperationSummary(o);
		return result;
	}
	
	/**
	 * Pretty print a summary for a property.
	 * 
	 * @param o
	 * @return
	 */
	private String ppPropertySummary(Property p) {
		//String result = ppTags(p.getTag());
		String result = (String) accept(p);
		result += "\n\n";
		return result;
	}
	
	/**
	 * Pretty print the summary for a list of properties.
	 * 
	 * @param l
	 * @return
	 */
	private String ppPropertySummaries(List<Property> l) {
		String result = "";
		for ( Property p : l )
			result += ppPropertySummary(p);
		return result;
	}
		
	public String htmlSummary(ClassDefinition node) {
		DOC_VIEW = false;
		printBody = false;
		Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext(node);
		String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(node);
		
		String tags = "";
		String operations = "";
		String properties = "";
		String supertypes = "";
		
		for ( TypeDefinition td : context ) {
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) td;
				if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals(qualifiedName) ) {
					for ( Type t : cd.getSuperType() )
						supertypes += "\n\t<b>class</b> " + accept(t);
					pushPrefix();
					tags +=	ppTags(cd.getOwnedTags());
					operations += ppOperationSummaries(cd.getOwnedOperation());
					properties += ppPropertySummaries(cd.getOwnedAttribute());
					popPrefix();
				}
			}
		}
		
		String result = tags;
		
		if ( node.isIsAbstract() ) 
			result += "<b>abstract</b> ";
		
		result += "<b>class</b> " + KMTHelper.getMangledIdentifier(node.getName());
		
		if (node.getTypeParameter().size() > 0) {
			result += "&lt;";
			result += ppTypeVariableDeclaration(node.getTypeParameter());
			result += "&gt;";
		}
		
		if ( ! supertypes.equals("") )
			result += " inherits from " + supertypes;
		
		result += " {\n\n\n";
		
		result += properties;
		result += operations;
		
		result += "}";
		
		return result;
	}
	
	public String htmlConstraint(Constraint constraint) {
		return (String) accept(constraint);
	}
	
	public String htmlSummary(Operation node) {
		DOC_VIEW = true;
		printBody = false;
		StringBuffer result= new StringBuffer("");
		result.append("<b>operation</b> " + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("\n") ;
		String tags = ppTags(node.getTag());
		result.append(getPrefix() + tags);
		if(tags.compareTo("")!=0) result.append("\n") ;
		return result.toString();
	}
	
	public String htmlSummary(Property node) {
		DOC_VIEW = true;
		printBody = false;
		StringBuffer result= new StringBuffer("");
		result.append(ppSimplifiedProperty(node));
		/*result.append("<b>Property </b> " + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("\n") ;
		String tags = ppTags(node.getTag());
		result.append(getPrefix() + tags);
		if(tags.compareTo("")!=0) result.append("\n") ;*/
		return result.toString();
	}
	
	protected EList<Operation> getOperationsNotIn(ClassDefinition node, Vector<String> knownOperationNames)
	{
		EList<Operation> el =  new BasicEList<Operation>();
		for(Operation o : node.getOwnedOperation()){
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

	/**
	 * replace the platfrom plugin url by the local file url 
	 * 
	 */
	public String fixPlatformURL(String text){
		String result;
		
		StringBuffer myStringBuffer = new StringBuffer();
		Pattern myPattern = Pattern.compile("platform:/plugin/[^/]*/");
		Matcher myMatcher = myPattern.matcher(text);
		while (myMatcher.find()) {
			try {
				URL url = new URL(myMatcher.group());				
				String  replacement = FileLocator.resolve(url).toString();
			    myMatcher.appendReplacement(myStringBuffer, replacement);
			} catch (Exception e) {
			    myMatcher.appendReplacement(myStringBuffer, myMatcher.group());					
			}
		}
		myMatcher.appendTail(myStringBuffer);
	
		result = myStringBuffer.toString();
		
		return result;
	}
	
	public String fixImages(String text){
		String result;
		
		StringBuffer myStringBuffer = new StringBuffer();
		Pattern myPattern = Pattern.compile("<img.*>");
		Matcher myMatcher = myPattern.matcher(text);
		while (myMatcher.find()) {
			try {
				String orig =myMatcher.group();
				Pattern subPattern = Pattern.compile("src=\"(.*)\"");
				Matcher subMatcher = subPattern.matcher(orig);
				subMatcher.find();
				String  replacement = "<a href=\"" + subMatcher.group(1) + "\" target=\"display_images\">" + orig.replaceFirst("img ", "img style=\"width:expression(document.body.clientWidth - 50); \" ") + "</a>";
			    myMatcher.appendReplacement(myStringBuffer, replacement);
			} catch (Exception e) {
			    myMatcher.appendReplacement(myStringBuffer, myMatcher.group());					
			}
		}
		myMatcher.appendTail(myStringBuffer);
	
		result = myStringBuffer.toString();
		
		return result;
		
	}
	
	/**
	 * Constructor
	 */
	public KMTDocHTMLPrettyPrinter() {
		super();
		prefixTab = "   ";
	}

}
