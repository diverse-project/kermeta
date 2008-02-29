/* $Id: KMTDocHTMLPrettyPrinter.java,v 1.7 2008-02-29 09:56:34 dvojtise Exp $
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
		StringBuilder result = new StringBuilder();
		// add support for popups
		result.append("<SCRIPT TYPE=\"text/javascript\">\n");
		result.append("<!--\n");
		result.append("function popup(mylink, windowname){\n");
		result.append("	var w = 640/2, h = 480, cw = w/2, ch = h/2;\n");

		result.append("	if (window.screen) {\n");
		result.append("		w = Math.floor(screen.availWidth/2);\n");
		result.append("		h = screen.availHeight - 50;\n");
		//result.append("		h = Math.floor(screen.availHeight/3);\n");
		//result.append("		cw = Math.floor((screen.availWidth-w)/2);\n");
		//result.append("		ch = Math.floor((screen.availHeight-h)/2);\n");
		result.append("	}\n");
		result.append("	if (! window.focus)return true;\n");
		result.append("		var href;\n");
		result.append("		if (typeof(mylink) == 'string')\n");
		result.append("			href=mylink;\n");
		result.append("		else\n");
		result.append("			href=mylink.href;\n");
		result.append("		window.open(href, windowname, 'width='+w+',height='+h+',top=0,resizable=yes,scrollbars=yes');\n"); //height=600,
		result.append("	return false;\n");
		result.append("}\n");
		
		result.append("//-->\n");
		result.append("</SCRIPT>\n");
		
		result.append("<pre>");
		currentClassShortLevel = 0;
		mainClass =  true;
		if(node instanceof ClassDefinition)
			result.append(htmlSummary((ClassDefinition)node));
		if(node instanceof Package)
			result.append(htmlSummary((Package)node));

		if(node instanceof Operation)
			result.append(htmlSummary((Operation)node));

		if(node instanceof Property)
			result.append(htmlSummary((Property)node));
		
		if ( node instanceof Constraint )
			result.append(htmlConstraint( (Constraint) node ));
		
		mainClass =  false;
		result.append("</pre>");
		return  fixPlatformURL(fixImages(result.toString()));
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
		StringBuilder result= new StringBuilder();
		if(mainClass){
			String tags = ppTags(node.getTag());
			result.append(getPrefix() + tags);
			if(tags.length() != 0) result.append(CR) ;
		}
		if(!classFlat && currentClassShortLevel < classShortLevel) return result;
		result.append(getPrefix());
		if (node.isIsAbstract()) result.append("<b>abstract</b> ");
		result.append("<b>class</b> " + KMTHelper.getMangledIdentifier(node.getName()));
		if (node.getTypeParameter().size() > 0) {
			result.append("&lt;");
			result.append(ppTypeVariableDeclaration(node.getTypeParameter()));
			result.append("&gt;");
		}
		if (node.getSuperType().size() > 0) {
			result.append(CR + getPrefix() + "<b>inherits from</b> ");
			Iterator<Type> itSuperType = node.getSuperType().iterator();
			while(itSuperType.hasNext()){
				if(!classFlat){
					result.append(CR + getPrefix() + prefixTab + "<b>class</b> ");
					EObject o = itSuperType.next();
					result.append(this.accept(o));
				}
				else{
					result.append(CR);
					EObject o = itSuperType.next();
					if(o instanceof fr.irisa.triskell.kermeta.language.structure.Class){
						fr.irisa.triskell.kermeta.language.structure.Class aFClass = (fr.irisa.triskell.kermeta.language.structure.Class)o;
						currentClassShortLevel++;
						pushPrefix();
						boolean previousMainClass = mainClass;
						mainClass =  false;
						result.append(this.accept(aFClass.getTypeDefinition()));
						mainClass = previousMainClass;
						popPrefix();
						currentClassShortLevel--;
					}
					else {
						// not a class  => do not flatten inheritance
						result.append(getPrefix() + "<b>class</b> " + this.accept(o));
					}
				}
			}
		}
		if(currentClassShortLevel < classShortLevel){
			result.append(CR + getPrefix() + "{" + CR);
			pushPrefix();
			result.append(ppCRSeparatedNode(node.getOwnedAttribute()));
			result.append(ppCRSeparatedNode(node.getOwnedOperation()));
			popPrefix();
			result.append(getPrefix() + "}");		
		}
		
		typedef = true;
		return result.toString();
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
	 * replaces all occurences to the platfrom plugin url by the local file url 
	 * Note: maybe this can be more precise and do that only in images src ?
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
	
	/**
	 * do a little bit of magic in the image tags in order to :
	 * - shrink the image into the user screen
	 * - add a link to the full image as a popup
	 * @param text : html text to be fixed
	 * @return the fixed html
	 */
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
				// use some javascript to make sure IE can resize the image, 
				// about resizing even in IE : see http://www.svendtofte.com/code/max_width_in_ie/
				// about popup (better than target=_blank : see. http://www.htmlcodetutorial.com/linking/linking_famsupp_72.html
				// target=\"_blank\"
				String  replacement = "<a href=\"" + subMatcher.group(1) + "\" onClick=\"return popup(this, 'popup')\" >" + orig.replaceFirst("img ", "img style=\"width:expression(document.body.clientWidth - 50); \" ") + "</a>";
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
