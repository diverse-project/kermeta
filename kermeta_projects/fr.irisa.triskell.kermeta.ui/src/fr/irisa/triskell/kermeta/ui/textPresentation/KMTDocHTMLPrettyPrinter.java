/* $Id: KMTDocHTMLPrettyPrinter.java,v 1.10 2008-04-30 14:16:44 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : TNHintHTMLPrettyPrinter.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 1 janv. 2006
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.ui.textPresentation;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;
import fr.irisa.triskell.string.EscapeChars;


/**
 * Create a HTML presentation of the given Kermeta object for use in a documentation
 * DVK : this class can really be improved for example :
 * 	the fact that it inherit from KM2KMTPrettyPrinter is not really pertinent since each object has its 
 * own presentation depending on the context in which it is called. a simplier structure is probably better
 * in this situation  
 */
public class KMTDocHTMLPrettyPrinter {//extends KM2KMTPrettyPrinter{
	public final static String KERMETA_DOCUMENTATION = "documentation";
		
	
	public String CR = "\n";
	public String GT = "&gt;";
	public String LT = "&lt;";
	
	
	protected KM2KMTPrettyPrinter kmtPP = new KM2KMTPrettyPrinter(); // sometimes we can reuse a full code pretty print
		
	public String getHTMLDoc(EObject node)
	{
		//MODE = DEFINITION_MODE;
		StringBuilder result = new StringBuilder();
		// add style support
		// some help for colors ? => http://www.w3schools.com/css/css_colornames.asp
		result.append("<style type=\"text/css\">");
		result.append("h1 {color: black; font-size: medium;}"); // H1 is used for main title  (class and operation name 
		result.append("h2 {color: black; font-size: small;}");	// H2 is used for subtitle like list of sub components like attribute and operation
		result.append("h3 {color: black; font-size: x-small;}"); // H3 is used for subtitle (for ex: parameters, return type, inheritance ...)
		result.append(".nodename {text-decoration: underline;}"); // special decoration for node name (ie. package, class, operation that is being displayed
		result.append(".documentation { border: 1px solid grey; background-color: LightYellow ; }");
		result.append(".reference {vertical-align: super; font-size: 75%;}");
		result.append("</style>");
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
		if(node instanceof ClassDefinition)
			result.append(htmlDocumentation((ClassDefinition)node));
		else if(node instanceof Package)
			result.append(htmlDocumentation((Package)node));

		else if(node instanceof Operation)
			result.append(htmlDocumentation((Operation)node));

		else if(node instanceof Property)
			result.append(htmlDocumentation((Property)node));
		
		else if ( node instanceof Constraint )
			result.append(htmlDocumentation( (Constraint) node ));
		
		else if ( node instanceof Enumeration)
			result.append(htmlDocumentation( (Enumeration) node ));
		
		else if ( node instanceof PrimitiveType)
			result.append(htmlDocumentation( (PrimitiveType) node ));
		
		else 
			return null;  // not supported type ...
		
		result.append("</pre>");
		return  fixPlatformURL(fixImages(result.toString()));
	}
	
	
	
	public String htmlDocumentation(Package node) {
		String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(node);
			
		StringBuffer result= new StringBuffer("");
		result.append("<H1>package <strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("</strong></H1>") ;
		if(node.eContainer() != null && node.eContainer() instanceof NamedElement){
			result.append("<H3>Container</H3>");
			result.append("\t"+KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.eContainer()));
		}
		// collect data from the various aspects that constitute this Package
		List<Package> packages = new ArrayList<Package>(); // all packages that constitutes the definition of this qualified name
		Hashtable<KermetaUnit,String> aspectUnitsReferences = new Hashtable<KermetaUnit,String>(); 
		Hashtable<String, KermetaUnit> aspectReferencesUnits = new Hashtable<String, KermetaUnit>();
		
		packages.add(node);
		aspectUnitsReferences.put(KermetaUnitHelper.getKermetaUnitFromObject(node), "[1]");
		aspectReferencesUnits.put("[1]", KermetaUnitHelper.getKermetaUnitFromObject(node) );
		KermetaUnitHelper.getKermetaUnitFromObject(node).getExternalPackages();
		for ( Package externalPackage : KermetaUnitHelper.getKermetaUnitFromObject(node).getExternalPackages() ) {
			if ( KermetaModelHelper.NamedElement.qualifiedName(externalPackage).equals(qualifiedName) ) {
				if(!packages.contains(externalPackage)){
					packages.add(externalPackage);
					String refId = "["+(aspectUnitsReferences.size()+1)+"]";
					aspectUnitsReferences.put(KermetaUnitHelper.getKermetaUnitFromObject(externalPackage), refId);
					aspectReferencesUnits.put(refId, KermetaUnitHelper.getKermetaUnitFromObject(externalPackage) );
				}
			}
		}
		StringBuilder tags = new StringBuilder("");
		StringBuilder subpackages = new StringBuilder("");
		StringBuilder ownedclasses = new StringBuilder("");
		for(Package pack :packages){
			KermetaUnit currentUnit  = KermetaUnitHelper.getKermetaUnitFromObject(pack);
			if(pack.getTag().size()>0){
				tags.append("<div class=\"documentation\" title=\""+currentUnit.getUri()+"\">");
				for(Tag tag : pack.getOwnedTags()){							
					tags.append(ppTag(tag));
				}
				tags.append("</div>");
			}
			if(pack.getNestedPackage().size()>0){
				for(Package p : pack.getNestedPackage()){
					subpackages.append("\t" + htmlSummary(p)+ " " + createAspectReference(currentUnit,aspectUnitsReferences) + "\n");
				}
			}
			if(pack.getOwnedTypeDefinition().size()>0){
				for(TypeDefinition td : pack.getOwnedTypeDefinition()){
					ownedclasses.append("\t" + htmlSummary(td)+ " " + createAspectReference(currentUnit,aspectUnitsReferences) +"\n");
				}
			}
		}
		
		if(tags.toString().compareTo("")!=0){			
			result.append( tags);
		}
		if(subpackages.toString().compareTo("")!=0){
			result.append("<H2>List of subpackages</H2>");			
			result.append( subpackages);
		}

		if(ownedclasses.toString().compareTo("")!=0){
			result.append("<H2>List of Classes defined in the Package</H2>");			
			result.append( ownedclasses);
		}
		
		// add the origin of the aspects (ie. a legend for each of the operations/properties/invariants)
		result.append("\n<H2><A name=\"aspectFiles\">The package is defined in the following files</A></H2>");
		List<String> sorted = new ArrayList<String>(aspectUnitsReferences.values());
		Collections.sort(sorted);
		for( String ref : sorted){		
			result.append("\t" + ref + " " + aspectReferencesUnits.get(ref).getUri()+"\n");
		}
		
		return result.toString();
	}
	
	protected String ppTags(EList<Tag> tagList) {
		String result = "";
	    
		int tagNb = tagList.size();
		for(int i=0; i<tagNb; i++) {
			result +=  ppTag(tagList.get(i)) + "\n";			
		}
	    return result;
	}
    /**
     * Tag is used to store comments in the source code.
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object ppTag(Tag node) {
        String result = "";
        // User can choose to add a "@kdoc" tag
        if ( node.getName() == null ) {
        	result = node.getValue();
        } else {
        	
        	if ( node.getName().equals(KERMETA_DOCUMENTATION) )
        		if ( ! node.getValue().startsWith("/**") )
        			result = node.getValue();
        		else{
        			result =  node.getValue() ;  // need to clean the comment
        		}
        	else
        		result = "@"+node.getName()+" \""+node.getValue()+"\"";
        }
        return result;
    }
    /**
	 * Main html doc for Enumeration
	 * @param node
	 * @return
	 */
	public String htmlDocumentation(PrimitiveType node){
		StringBuilder result = new StringBuilder("<H1>");
		result.append("alias <strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("</strong></H1>");
		if(node.eContainer() != null && node.eContainer() instanceof NamedElement){
			result.append("<H2>Container</H2>\tpackage ");
			result.append(KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.eContainer()));
		}
		result.append("<H2>Redirect to</H2>\t");
		result.append(EscapeChars.forHTML((String)kmtPP.accept(node.getInstanceType())).toString()); //KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.getInstanceType().
		if(node.getOwnedTags().size()>0){
			result.append(" \n<div class=\"documentation\" >");
			for(Tag tag : node.getOwnedTags()){							
				result.append(ppTag(tag));
			}
			result.append("</div>");
		}
		result.append("\n<H2><A name=\"aspectFiles\">The feature is defined in the following file</A></H2>");		
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(node);
		result.append("\t[1] " + unit.getUri()+"\n");
		return result.toString();
	}
    /**
	 * Main html doc for Enumeration
	 * @param node
	 * @return
	 */
	public String htmlDocumentation(Enumeration node){
		StringBuilder result = new StringBuilder("<H1>");
		result.append("enumeration <strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("</strong></H1>");
		if(node.eContainer() != null && node.eContainer() instanceof NamedElement){
			result.append("<H2>Container</H2>");
			result.append(KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.eContainer()));
		}
		result.append("<H2>Literal values</H2><UL>");
		for(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral elit :node.getOwnedLiteral()){
			result.append("<LI>"+KMTHelper.getMangledIdentifier(elit.getName())+"</LI>");
		}
		result.append("</UL>");
		
		if(node.getOwnedTags().size()>0){
			result.append(" \n<div class=\"documentation\" >");
			for(Tag tag : node.getOwnedTags()){							
				result.append(ppTag(tag));
			}
			result.append("</div>");
		}
		result.append("\n<H2><A name=\"aspectFiles\">The feature is defined in the following file</A></H2>");		
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(node);
		result.append("\t[1] " + unit.getUri()+"\n");
		return result.toString();
	}
		
	/**
	 * Main html doc for ClassDefinition
	 * @param node
	 * @return
	 */
	public String htmlDocumentation(ClassDefinition node) {
		Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext(node);
		String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(node);
		//KermetaModelHelper.ClassDefinition.getAllOperations(cd)
		StringBuilder tags = new StringBuilder("");
		StringBuilder operations = new StringBuilder("");
		StringBuilder properties = new StringBuilder("");
		StringBuilder invariants = new StringBuilder("");
		StringBuilder inheritedOperations = new StringBuilder("");
		StringBuilder inheritedProperties = new StringBuilder("");
		StringBuilder inheritedInvariants = new StringBuilder("");
		String supertypes = "";
		Hashtable<KermetaUnit,String> aspectUnitsReferences = new Hashtable<KermetaUnit,String>(); 
		Hashtable<String, KermetaUnit> aspectReferencesUnits = new Hashtable<String, KermetaUnit>();
		//KermetaModelHelper.ClassDefinition.
		
		// collect data from the various aspects that constitute this classdefinition
		for ( TypeDefinition td : context ) {
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) td;
				if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals(qualifiedName) ) {
					// this is either the class itself or an aspect
					for ( Type t : cd.getSuperType() )
						supertypes += "\t " + EscapeChars.forHTML((String)kmtPP.accept(t)).toString() +"\n";
					if(cd.getOwnedTags().size() > 0){
						KermetaUnit tagUnit = KermetaUnitHelper.getKermetaUnitFromObject(cd.getOwnedTags().get(0));
						if(!aspectUnitsReferences.containsKey(tagUnit)){
							aspectUnitsReferences.put(tagUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(tagUnit), tagUnit);
						}
						tags.append(" \n<div class=\"documentation\" title=\""+tagUnit.getUri()+"\">");
						for(Tag tag : cd.getOwnedTags()){							
							tags.append(ppTag(tag));
						}
						tags.append("</div>");
					}
					for(Constraint inv : cd.getInv()){
						KermetaUnit invUnit = KermetaUnitHelper.getKermetaUnitFromObject(inv);
						if(!aspectUnitsReferences.containsKey(invUnit)){
							aspectUnitsReferences.put(invUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(invUnit), invUnit);
						}
						invariants.append("\t"+htmlSummary(inv) + " " + createAspectReference(invUnit,aspectUnitsReferences) +"\n");
					}
					for(Property prop :cd.getOwnedAttribute()){
						KermetaUnit propertyUnit = KermetaUnitHelper.getKermetaUnitFromObject(prop);
						if(!aspectUnitsReferences.containsKey(propertyUnit)){
							aspectUnitsReferences.put(propertyUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(propertyUnit), propertyUnit);
						}
						properties.append("\t"+htmlSummary(prop) + " " + createAspectReference(propertyUnit,aspectUnitsReferences) +"\n");
					}
					for(Operation op :cd.getOwnedOperation()){
						KermetaUnit operationUnit = KermetaUnitHelper.getKermetaUnitFromObject(op);
						if(!aspectUnitsReferences.containsKey(operationUnit)){
							aspectUnitsReferences.put(operationUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(operationUnit), operationUnit);
						}
						operations.append("\t"+htmlSummary(op) + " " + createAspectReference(operationUnit,aspectUnitsReferences)+"\n");
					}
				}
				else{ // this classdefinition is one of the inherited class
					for(Constraint inv : cd.getInv()){
						KermetaUnit invUnit = KermetaUnitHelper.getKermetaUnitFromObject(inv);
						if(!aspectUnitsReferences.containsKey(invUnit)){
							aspectUnitsReferences.put(invUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(invUnit), invUnit);
						}
						inheritedInvariants.append("\t"+htmlSummary(inv) + " " + createAspectReference(invUnit,aspectUnitsReferences) +"\n");
					}
					for(Property prop :cd.getOwnedAttribute()){
						KermetaUnit propertyUnit = KermetaUnitHelper.getKermetaUnitFromObject(prop);
						if(!aspectUnitsReferences.containsKey(propertyUnit)){
							aspectUnitsReferences.put(propertyUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(propertyUnit), propertyUnit);
						}
						inheritedProperties.append("\t"+htmlSummary(prop) + " " + createAspectReference(propertyUnit,aspectUnitsReferences) +"\n");
					}
					for(Operation op :cd.getOwnedOperation()){
						KermetaUnit operationUnit = KermetaUnitHelper.getKermetaUnitFromObject(op);
						if(!aspectUnitsReferences.containsKey(operationUnit)){
							aspectUnitsReferences.put(operationUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
							aspectReferencesUnits.put(aspectUnitsReferences.get(operationUnit), operationUnit);
						}
						inheritedOperations.append("\t"+htmlSummary(op) + " " + createAspectReference(operationUnit,aspectUnitsReferences)+"\n");
					}
				}
			}
		}
		
		StringBuilder result = new StringBuilder("<H1>");
		
		if ( node.isIsAbstract() ) 
			result.append("abstract ");
		
		result.append("class <strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()));
		
		if (node.getTypeParameter().size() > 0) {
			result.append(LT);
			result.append(EscapeChars.forHTML(kmtPP.ppTypeVariableDeclaration(node.getTypeParameter())));
			result.append(GT);
		}
		result.append("</strong></H1>");
		if(node.eContainer() != null && node.eContainer() instanceof NamedElement){
			result.append("<H3>Container</H3>");
			result.append("\tpackage "+KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.eContainer()));
		}
		if ( ! supertypes.equals("") )
			result.append("<H3>inherits from </H3>" + supertypes);
		
		if (!tags.equals("")){ 
			result.append(tags);
		}
		result.append(" \n");
		if (!properties.toString().equals("")) {
			result.append("<H2>List of properties of this class</H2>");
			result.append(properties);
		}
		if (!operations.toString().equals("")){
			result.append("<H2>List of operations of this class</H2>");
			result.append(operations);
		}
		if (!invariants.toString().equals("")){
			result.append("<H2>List of invariants</H2>");
			result.append(invariants);
		}
		if (!properties.toString().equals("")) {
			result.append("<H2>List of inherited properties of this class</H2>");
			result.append(inheritedProperties);
		}
		if (!operations.toString().equals("")){
			result.append("<H2>List of inherited operations of this class</H2>");
			result.append(inheritedOperations);
		}
		if (!invariants.toString().equals("")){
			result.append("<H2>List of inherited invariants</H2>");
			result.append(inheritedInvariants);
		}
		
		// add the origin of the aspects (ie. a legend for each of the operations/properties/invariants)
		result.append("\n<H2><A name=\"aspectFiles\">The class is defined in the following files</A></H2>");
		List<String> sorted = new ArrayList<String>(aspectUnitsReferences.values());
		Collections.sort(sorted);
		for( String ref : sorted){		
			result.append("\t" + ref + " " + aspectReferencesUnits.get(ref).getUri()+"\n");
		}
		
		return result.toString();
	}
	
	protected String createAspectReference(KermetaUnit unit, Hashtable<KermetaUnit,String> aspectUnitsReferences){
		return " <A title=\""+unit.getUri()+"\" class=reference>" +aspectUnitsReferences.get(unit) + "</A>";
	}
	
	/**
	 * HTML documentation for Constraint
	 * @param constraint
	 * @return
	 */
	public String htmlDocumentation(Constraint constraint) {
		return  EscapeChars.forHTML((String)kmtPP.accept(constraint));
	}
	/**
	 * HTML documentation for Operation
	 * @param node
	 * @return
	 */
	public String htmlDocumentation(Operation node) {
		Hashtable<KermetaUnit,String> aspectUnitsReferences = new Hashtable<KermetaUnit,String>(); 
		Hashtable<String, KermetaUnit> aspectReferencesUnits = new Hashtable<String, KermetaUnit>();
		KermetaUnit nodeUnit = KermetaUnitHelper.getKermetaUnitFromObject(node);
		if(!aspectUnitsReferences.containsKey(nodeUnit)){
			aspectUnitsReferences.put(nodeUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
			aspectReferencesUnits.put(aspectUnitsReferences.get(nodeUnit), nodeUnit);
		}
		StringBuilder result= new StringBuilder("<H1>");
		if (node.isIsAbstract()) result.append("abstract ");
		if (node.getSuperOperation() != null) result.append("method ");
		else result.append("operation ");
		result.append("<strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()) + "</strong>");
		if (node.getTypeParameter().size() > 0) {
			result.append(LT);
			result.append(EscapeChars.forHTML(kmtPP.ppTypeVariableDeclaration(node.getTypeParameter())));
			result.append(GT);
		}
		result.append("</H1>");
		result.append("<H3>Parameters :</H3>");
		if(node.getOwnedParameter().size()>0){
			kmtPP.pushPrefix();
			result.append(EscapeChars.forHTML(kmtPP.ppCRSeparatedNode(node.getOwnedParameter())));
			kmtPP.popPrefix();
		}
		else result.append("\t<em>none</em>\n");
			
		result.append("<H3>Return type : </H3>\t");
		if(node.getType() != null) {
			result.append( EscapeChars.forHTML(kmtPP.ppTypeFromMultiplicityElement(node)));
		}
		else result.append("<em>Void</em>");
		if(node.eContainer() != null && node.eContainer() instanceof NamedElement){
			result.append("<H3>Container</H3>");
			result.append("\tclass "+KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.eContainer()));
		}
		if (node.getSuperOperation() != null) {
			result.append("\n<H3>Redefines operation from :</H3>\tclass " + NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass()));
		}
		if (node.getRaisedException().size() > 0) {
			result.append("\n<H3>Raises excetions :</H3>\n");
			kmtPP.pushPrefix();
			result.append(EscapeChars.forHTML(kmtPP.ppCRSeparatedNode(node.getRaisedException())));
			kmtPP.popPrefix();
		}
		result.append("\n") ;		
		String tags = ppTags(node.getTag());
		if(!tags.equals("")) result.append("<div class=\"documentation\">" +tags + "</div>\n") ;
		List<Constraint> allPreconditions = KermetaModelHelper.Operation.getAllPreconditions(node);
		if(!allPreconditions.isEmpty()){
			result.append("<H3>Preconditions :</H3>");			
			for(Constraint c : allPreconditions){
				KermetaUnit preUnit = KermetaUnitHelper.getKermetaUnitFromObject(c);
				if(!aspectUnitsReferences.containsKey(preUnit)){
					aspectUnitsReferences.put(preUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
					aspectReferencesUnits.put(aspectUnitsReferences.get(preUnit), preUnit);
				}
				result.append("\t"+htmlSummary(c) + " " + createAspectReference(preUnit,aspectUnitsReferences) +"\n");
			}
		}
		List<Constraint> allPostconditions = KermetaModelHelper.Operation.getAllPostconditions(node); 
		if(!allPostconditions.isEmpty()){
			result.append("<H3>Postconditions :</H3>");			
			for(Constraint c : allPostconditions){
				KermetaUnit postUnit = KermetaUnitHelper.getKermetaUnitFromObject(c);
				if(!aspectUnitsReferences.containsKey(postUnit)){
					aspectUnitsReferences.put(postUnit,"["+ (aspectUnitsReferences.size()+1) +"]");
					aspectReferencesUnits.put(aspectUnitsReferences.get(postUnit), postUnit);
				}
				result.append("\t"+htmlSummary(c) + " " + createAspectReference(postUnit,aspectUnitsReferences) +"\n");
			}
		}
		// add the origin of the aspects (ie. a legend for each of the operations/properties/invariants)
		result.append("\n<H2><A name=\"aspectFiles\">The operation is defined from the following files</A></H2>");
		List<String> sorted = new ArrayList<String>(aspectUnitsReferences.values());
		Collections.sort(sorted);
		for( String ref : sorted){		
			result.append("\t" + ref + " " + aspectReferencesUnits.get(ref).getUri()+"\n");
		}
		return result.toString();
	}
	
	/**
	 * Summary version of the Operation
	 * @param node
	 * @return
	 */
	public String htmlSummary(Operation node) {
		StringBuffer result= new StringBuffer("");
		if (node.isIsAbstract()) result.append("<b>abstract</b> ");
		if (node.getSuperOperation() != null) result.append("<b>method</b> ");
		else result.append("<b>operation</b> ");
		result.append("<strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()) + "</strong>");
		if (node.getTypeParameter().size() > 0) {
			result.append(LT);
			result.append(EscapeChars.forHTML(kmtPP.ppTypeVariableDeclaration(node.getTypeParameter())));
			result.append(GT);
		}
		result.append("(");
		result.append(EscapeChars.forHTML(kmtPP.ppComaSeparatedNodes(node.getOwnedParameter())));
		result.append(")");
		if(node.getType() != null) {
			result.append(" : " + EscapeChars.forHTML(kmtPP.ppTypeFromMultiplicityElement(node)));
		}
	
		if (node.getSuperOperation() != null) {
			result.append(" <b>from</b> " + NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass()));
		}
		
		return result.toString();
	}

	public String htmlDocumentation(Property node) {
		StringBuffer result= new StringBuffer("<H1 title=\""+ kmtPP.ppSimplifiedProperty(node) +"\">");
		if (node.isIsDerived()) result.append("property ");
		else if (node.isIsComposite()) result.append("attribute ");
		else result.append("reference ");
		result.append("<strong class=nodename>" +KMTHelper.getMangledIdentifier(node.getName()) + "</strong>");
		//result.append("<b>Property </b> " + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("</H1>") ;
		if(node.eContainer() != null && node.eContainer() instanceof NamedElement){
			result.append("<H3>Container</H3>");
			result.append("\tclass "+KermetaModelHelper.NamedElement.qualifiedName((NamedElement)node.eContainer()));
		}
		result.append("<H2>Type</H2>");
		//result.append(kmtPP.accept(node.getType()));
		result.append("\t"+EscapeChars.forHTML(kmtPP.ppTypeFromMultiplicityElement(node)));
		result.append("<H2>multiplicity </H2>\t[");
		result.append(node.getLower());
		result.append("..");
		result.append(node.getUpper() == -1 ? "*": node.getUpper());
		result.append("]");
		if(node.isIsReadOnly()) result.append("This feature is <b>readonly</b>\n");
		if (node.getOpposite() != null) result.append("<H2>Opposite</H2>\t"+ KMTHelper.getMangledIdentifier(node.getOpposite().getName()));
		String tags = ppTags(node.getTag());
		if(tags.compareTo("")!=0){
			result.append("<div class=\"documentation\">" );
			result.append( tags);
			result.append("</div>\n") ;
		}
		result.append("\n<H2><A name=\"aspectFiles\">The feature is defined in the following file</A></H2>");		
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(node);
		result.append("\t[1] " + unit.getUri()+"\n");
		return result.toString();
	}
	
	/**
	 * Summary version of a Property
	 * @param node
	 * @return
	 */
	public String htmlSummary(Property node) {
		StringBuffer result= new StringBuffer("");
		result.append(ppSimplifiedProperty(node));
		
		return result.toString();
	}

	/**
	 * Summary version of a Constraint
	 * @param node
	 * @return
	 */
	public String htmlSummary(Constraint node) {
		StringBuffer result= new StringBuffer("");
		result.append(node.getName());
		
		return result.toString();
	}
	
	/**
	 * Summary version of a Package
	 * @param node
	 * @return
	 */
	public String htmlSummary(Package node) {
		StringBuffer result= new StringBuffer("");
		result.append("package <strong class=nodename>" + KMTHelper.getMangledIdentifier(node.getName()));
		result.append("</strong>");
		
		return result.toString();
	}
	
	/**
	 * Summary version of a ClassDefinition
	 * @param node
	 * @return
	 */
	public String htmlSummary(ClassDefinition node) {
		StringBuffer result= new StringBuffer("");
		if ( node.isIsAbstract() ) 
			result.append("abstract ");
		result.append("class <strong>" + KMTHelper.getMangledIdentifier(node.getName()));
		if (node.getTypeParameter().size() > 0) {
			result.append(LT);
			result.append(EscapeChars.forHTML(kmtPP.ppTypeVariableDeclaration(node.getTypeParameter())));
			result.append(GT);
		}
		result.append("</strong>");
		
		return result.toString();
	}
	/**
	 * Summary version of a TypeDefinition
	 * @param node
	 * @return
	 */
	public String htmlSummary(TypeDefinition node) {
		
		StringBuffer result = new StringBuffer("");
		if(node instanceof ClassDefinition) result.append(htmlSummary((ClassDefinition)node));
		else{
			// default if this is not a class
			result.append("<strong >" + KMTHelper.getMangledIdentifier(node.getName()));
			result.append("</strong>");
		}
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
/*	public Object visit(ClassDefinition node) {
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
*/
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#ppSimplifiedProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public String ppSimplifiedProperty(Property node) {
		String result = "";		
		if (node.isIsDerived()) result += "<b>property</b> ";
		else if (node.isIsComposite()) result += "<b>attribute</b> ";
		else result += "<b>reference</b> ";
		if (node.isIsReadOnly()) result += "<b>readonly</b> ";
		result += KMTHelper.getMangledIdentifier(node.getName()) + " : " + EscapeChars.forHTML(kmtPP.ppTypeFromMultiplicityElement(node));
		if (node.getOpposite() != null) result += "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName());
		return result;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter#visit(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
/*	public Object visit(Operation node) {
		//return super.visit(node);
		String result = "";
		if(mainClass){
			//result = ppTags(node.getTag());
			String tags = ppTags(node.getTag());
			result = tags;
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
			result += " <b>from</b> " + NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass());
		}
		if (node.getRaisedException().size() > 0) {
			result += " <b>raises</b> " + ppComaSeparatedNodes(node.getRaisedException());
		}
		
		return result;
	}
*/
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
	}

}
