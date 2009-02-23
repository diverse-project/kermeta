/* $Id: KM2HTMLPrettyPrinter.java,v 1.22 2009-02-23 08:10:37 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.documentation
 * File       : KM2HTMLPrettyPrinter.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : May 15, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 *    spierre <sebastien@type-z.org>
 *    http://www.ivy.fr/SDoc
 *    This code is an adapted *copy* of sebastien code for python document generator. (It is under GPL!)
 *    
 *    This is a tool used by Kermeta developers to generate doc.
 *    This code is not distributed with Kermeta.
 */
package fr.irisa.triskell.kermeta.docutils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.impl.ClassImpl;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;

/**
 * This pretty printer visits a Kermeta model and prints in a basic layout the documentation
 * of kermeta source code.
 */
public class KM2HTMLPrettyPrinter extends KM2KMTPrettyPrinter {
	
	/** Contains the all the descriptions/documentations of the elements of Kermeta source (operations,
	 * classes, properties). Once this list is filled, we join it in a single string. Each
	 * description points to the @kdoc annotations (stored in the _contents attribute) 
	 * of those elements through a href link. */
	protected List<StringBuffer> _descriptions;
	
	/**
	 * Contains all the @kdoc annotations of the elements of Kermeta source/
	 */
	protected Hashtable<String, StringBuffer> _contents;
	
	/**
	 * Contains the list of all the packages. Each of them is a href-link to its package content.
	 */
	protected String _packagesNavigation;
	
	/**
	 * contains the correspondance between the package, it points to the main package with the same name
	 */
	protected Hashtable<Integer,Integer> namedElementMainHashcode =  new Hashtable<Integer,Integer>();
	
	public static final String KEY_MODULE    = "Packages";
	public static final String KEY_CLASS     = "Classes";
	public static final String KEY_ATTRIBUTE    = "Attributes";
	public static final String KEY_FUNCTION  = "Functions";
	public static final String KEY_METHOD    = "Methods";
	public static final String KEY_INHERITED_METHOD    = "Inherited methods";
	public static final String KEY_VALUE     = "Values";
	public static final String MOD_INHERITED = "Inherited";
	public static final String[] KEYS_ORDER = new String[] {KEY_MODULE, KEY_CLASS, KEY_METHOD, KEY_FUNCTION, KEY_VALUE};
	// the list of html keywords that are interpreted by this km2html prettyprinter -> only in lower case!
	public static String[] ALLOWED_HTML_KEYWORDS;
	static {
		ALLOWED_HTML_KEYWORDS = new String[] { "pre", "code", "b", "a", "i", "img" };
	}
	
	public static Hashtable<String, String>	COMPACT; // this is unused yet - could largely reduce the output html file size 
	// "(.*)"\s*: "(.*)", -> COMPACT.put("$1", "$2");
	static {
		COMPACT = new Hashtable<String, String>();
		COMPACT.put("container", "cr");
		COMPACT.put("documented", "d");
		COMPACT.put("description", "de");
		COMPACT.put("docstring", "ds");
		COMPACT.put("group", "g");
		COMPACT.put("name", "n");
		COMPACT.put("representation","re");
		COMPACT.put("root", "ro");
		COMPACT.put("title", "t");
		COMPACT.put("undocumented","u");
		}
	//	RE_SPACES = re.compile("\s*\n\s*\n+")
	public static String compactHTMLString(String html_string)
	{
		String result = html_string;
		for (String word : COMPACT.keySet()) {
			result = result.replaceAll("class='"+ word, "class='" + COMPACT.get(word));
		}
		return result;
	}

	public String inputFile; // the kermeta program file.
	protected KermetaUnit kmunit;
	
	/** A context for the visitor. True if a visit call must return a "signature" 
	 *  of the object, false in the "html" representation case */
	protected boolean _as_signature;
	
	public KM2HTMLPrettyPrinter(String inputfile) throws KermetaIOFileNotFoundException, URIMalformedException
	{
		// init
		IOPlugin.LOCAL_USE = true;
    	//IOPlugin.FRAMEWORK_GENERATION = true;
    	@SuppressWarnings("unused")
		IOPlugin ioPlugin = IOPlugin.getDefault();
    	
		_contents = new Hashtable<String, StringBuffer>();
		_descriptions = new ArrayList<StringBuffer>();
		inputFile = inputfile;
		// Load the KermetaUnit for the given file (only needed to get the rootPackage :} of the km(t) file and
		// the list of its nested packages) 
		try {
			kmunit = LoaderPlugin.getDefault().load(inputFile, null);
			//kmunit = LoaderPlugin.getDefault().getFramework();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		}
		//kmunit = LoaderPlugin.getDefault().getFramework();
	}
	
	/** Pretty prints the file given as input in KM2HTMLPrettyPrinter constructor and
	 *  store it in the given output file */
	public void ppKermetaFile(String output_file) {
		// Pretty print the Kermeta file in HTML
		String html_doc = ppHTMLAll();
		html_doc = compactHTMLString(html_doc);
		/*for (Entry<String, String> tuple : COMPACT.entrySet()) {
			html_doc = html_doc.replaceAll("='"+tuple.getKey()+"'","='"+tuple.getValue()+"'");}*/
		// Store it in the output_file
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(new File(output_file)));
			w.write(html_doc);
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/** Pretty print the input kermeta file in HTML code. Use the sub methods ppHTML* */
	public String ppHTMLAll()
	{
		// Visit the entire kermeta model. This methods assigns _packagesNavigation, _descriptions, _contents, etc.
		ppNestedPackages();
		// Get the results and display them in an HTML code
		StringBuffer result = new StringBuffer();
		result.append(ppHTMLHeader());
		result.append(ppHTMLJavaScript());
		result.append(ppHTMLBody(_packagesNavigation, join(_descriptions,""), join(_contents.values(),""), ""));
		return result.toString();
	}
	
	/**
	 * Prints a specific html header
	 */
	public String ppHTMLHeader()
	{
		return  "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"" +
	    "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
	    "<html lang=\"fr\" xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"fr\">";
	}
	
	/**
	 * Print the head tag content that contains a javascript and basic stylesheet data
	 * @return return the &lt;head&gt; tag content with javascript and css info.
	 */
	public String ppHTMLJavaScript()
	{
		 String str_uri = "src/html/header.html";
		 StringBuffer result = new StringBuffer();
		 try 
		 {
			 URI _uri = URI.createURI(str_uri);
			 URIConverter converter = new ExtensibleURIConverterImpl();
			 
			 BufferedReader r = new BufferedReader(
					 new InputStreamReader(converter.createInputStream(_uri)));
			 
			 while (r.ready()) {
				 char[] c = {(char)r.read()};
				 String sc = (c[0]=='\t')?"    ":new String(c);
				 result.append(sc);
			 }
			 r.close();
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		return result.toString(); 
	}
	
	/** Prints the whole html body*/
	public String ppHTMLBody(String packages, String descriptions, String content, String main)
	{
		StringBuffer result = new StringBuffer();
		
		result.append("\n<body>\n"); // +  // onLoad=\"javascript:documentElement('"+ main + "');\">" +

		result.append("<div id=\"body\">\n");
		result.append("<div id=\"header\">&nbsp;");
		result.append("</div>\n");
		result.append("<div id=\"content\">\n");
		result.append("<table width=100%><tr><td><h1 style=\"margin:0;\">Kermeta API Documentation</h1></td>\n");
		Locale locale = Locale.ENGLISH;
		Date d = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		result.append("<td align=right valign=bottom >Generation date: ");
		result.append(dateFormat.format(d));
		result.append("</td></tr></table> ");
		result.append("<!-- body -->\n");
		result.append("<div id='modules'>\n");
		result.append("  <!-- packages-snip -->\n");
		result.append(packages);
		result.append("  <!-- packages-snip -->\n");
		result.append("  <div id='descriptions'>\n");
		result.append("  <!-- descriptions-snip -->\n");
		result.append(descriptions);
		result.append("  <!-- descriptions-snip -->\n");
		result.append("  </div>\n");
		result.append("</div>\n");
		result.append("<div id='api'><!-- main element will be displayed here --></div>\n");
		result.append("<div id='hidden'>\n");
		result.append("<!-- hidden-snip -->\n");
		result.append(content);
		result.append("</div>\n");
		result.append("<!-- hidden-snip -->\n");
		result.append("<!-- hidden nodes will be moved here -->\n");
		result.append("</div>\n"); // close <div id=body>
		result.append("</div>\n");
		result.append("</body>\n");
		result.append("</html>");
		return result.toString();
	}
	
	/** Prints the html foot (optional) */
	public String ppHTMLFoot()
	{
		return "<div align='right' style='" +
			"margin-top: 30pt; clear:both; color: #a0a0a0;'>"+
			"<small>API generated with <a href=\"http://www.ivy.fr/sdoc\">SDoc</a> for Java!</small></div>" +
			"</div>";
	}
	
	/** Prints the content of all the packages contained in the Kermeta source */
	public void ppNestedPackages()
	{
		// get a list of all packages qualified name (this is because it may be split into several files
		Iterator<String> itQN = kmunit.getUniquePackageQualifiedNames().iterator();//node.getNestedPackage().iterator();
		while (itQN.hasNext())
		{
			String qname = itQN.next();
		
			// first package with this name
			Package firstPackage = kmunit.getPackages(qname).get(0);
			this.accept(firstPackage);		
		
		/*	Iterator<Package> it = kmunit.getPackages(qname).iterator();
			// For each package with the same qualified name
			while (it.hasNext())
			{
				Package node = it.next();
				namedElementMainHashcode.put(node.hashCode(), firstPackage.hashCode());
				// Visit the packages in order to document their children								
				this.accept(node);
				
			}*/
			// Construct the list of package names from which user will browse the code documentation
			if (this._packagesNavigation!=null) this._packagesNavigation += " &bull; ";
			else this._packagesNavigation = "API : ";
			// Get the path of the package (bla::foo)
			String path ="";
			if (qname.contains("::"))
				path = qname.substring(0, (qname.length()-firstPackage.getName().length()));
			// Get the id of this package
			String this_id = String.valueOf(firstPackage.hashCode());
			this._packagesNavigation +=
			path + "<a href='javascript:documentElement(\"" + this_id + "\");'>" + firstPackage.getName() + "</a>\n";
		}
	}
		
	/** Gives the Java-representation of the given object. Every "documentable"
	 *  element is a NamedElement (operation, class, attributes, packages!) */
	public String representation(NamedElement node)
	{	
		_as_signature = true;
		String result = (String) this.accept(node).toString();
		return (result!=null && result!="")?"<code>" + result + "</code>":"";
	}

	/** 
	 * Gets a description for the given object. This looks for a <code>@kdoc</code> 
	 * annotation in the object, and returns its type and representation.
	 * this returns a div with a title and paragraph.This is a rather long
	 * text.
	 * @param node the node that contains a doc - either classDefinition, operation, attribute.
	 * */
	public StringBuffer describe(NamedElement node)
	{
		StringBuffer result = new StringBuffer();
		String this_id = "d_" + String.valueOf(getNamedElementMainHashcode(node));
		if (this._contents.containsKey(this_id)) return this._contents.get(this_id);
		result.append( "\n<div id='" + this_id + "' class='description'>" );
		result.append( "<h1>" + this.describeType(node) + "</h1>" );
		result.append( "<div class='representation'>" );
		result.append( this.representation(node) );
		result.append( "</div>" );
		result.append( "<div class='docstring'>" );
		// Does this node contains annotation documentation ?
		if (node instanceof Package){
			// check in the different loaded files
			boolean undocumented = true;
			Iterator<Package> itPack = kmunit.getPackages(NamedElementHelper.getQualifiedName(node)).iterator();
			while(itPack.hasNext()){
				Package weavedPack = itPack.next();
				if (weavedPack.getTag().size()>0){
					result.append( visitEList(weavedPack.getTag(),"") );
					undocumented = false;
				}				
			}
			if(undocumented)
				result.append( "<span class='undocumented'>Undocumented</span>" );
		}
		else {
			if (node.getTag().size()>0)
				result.append( visitEList(node.getTag(),"") );
			else if (node instanceof ClassDefinition && ((ClassDefinition)node).getSuperType().size()>0)
				result.append( "<span class='undocumented'>Undocumented. See also inherited classes.</span>" );
			else if (node instanceof Operation){
				boolean undocumented = true;
				Operation superOp = ((Operation)node).getSuperOperation();
				while(superOp != null){
					if(superOp.getTag().size()>0){
						result.append( "Inherited documentation from " + NamedElementHelper.getMangledQualifiedName(superOp.getOwningClass())) ;
						result.append( visitEList(superOp.getTag(),"") );
						undocumented = false;
					}
					superOp = superOp.getSuperOperation();
				}
				if(undocumented)
					result.append( "<span class='undocumented'>Undocumented</span>" );
			}
			else
				result.append( "<span class='undocumented'>Undocumented</span>" );
		}
		result.append( "</div></div>" );
		_as_signature = false;
		this._contents.put(this_id, result);
		return result;
	}	
	
	
	/** 
	 * Document the given element, which has the given name. This method simply
	 * calls the describe method and add it in the list of _descriptions.
	 */
	public void document(NamedElement node )
	{	// Add the description of the object : its Type, its signature, and the kermeta doc.
		_descriptions.add(this.describe(node));
	}

	/** Return a reader-friendly representation of the signature/name of the given object */
	public String describeType(NamedElement node)
	{
		String result = "";
		String tmpl_beg = "<span class='name'>"; 
		String tmpl_end = "</span>"; // dirty is instanceof...
		if (node instanceof ClassDefinition)  result = "Class ";
		else if (node instanceof Operation) result = "Operation ";
		else if (node instanceof Property) result = "Property "; 
		else if (node instanceof Package) result = "Package ";
		else if (node instanceof Enumeration) result = "Enumeration ";
		else if (node instanceof PrimitiveType) result = "Alias ";
		result +=  tmpl_beg + node.getName() + tmpl_end;
		return result;
	}
	
	/** Prints a href-link for the given node and document it. */
	protected StringBuffer documentFeature(NamedElement node)
	{
		StringBuffer result = new StringBuffer();
		int hash_code = 0;
		// Get the id of the feature
		if (node instanceof Operation) hash_code = getNamedElementMainHashcode(((Operation)node).getOwningClass());
		else if (node instanceof Property) hash_code = getNamedElementMainHashcode(((Property)node).getOwningClass());
		// classdefinition -> container should be of type Package
		else if (node instanceof TypeDefinition)
			hash_code = getNamedElementMainHashcode((NamedElement)((TypeDefinition)node).eContainer());
			//System.err.println("Help:" + ((ClassDefinition)node).eContainer() );
		else 
			hash_code = node.hashCode();
		
		String this_id = String.valueOf(hash_code); // fixme : parent_id is a better name
		String child_id = String.valueOf(getNamedElementMainHashcode(node));
		
		// Set the html display of the feature as in a list
		String link = "href='javascript:documentElement(\""+ this_id + "\",\"" + child_id + "\");'";
		boolean is_documented = node.getTag().size()>0;
		result.append( "<span class='"+ is_documented + "'><a " + link + ">" +  node.getName() + "</a></span><br />" );
		
		this.document(node);
		
		return result;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	public Object visitOperation(Operation node) {
		StringBuffer result = new StringBuffer();
		if (_as_signature == false)
			result.append( documentFeature(node) );
		else
		{ // duplicate code with km2kmtprettyprinter
			result.append ( (node.getSuperOperation() != null)?"method ":"operation " );
			result.append ( KMTHelper.getMangledIdentifier(node.getName()) );
			if (node.getTypeParameter().size() > 0) {
				result.append( "&lt;" );
				result.append( ppTypeVariableDeclaration(node.getTypeParameter()) );
				result.append( "&gt;" );
			}
			result.append( "(" );
			result.append( ppComaSeparatedNodes(node.getOwnedParameter()));
			result.append( ")");
			result.append( node.getType() != null?(" : " + ppTypeFromMultiplicityElement(node)):" : Void");
			if (node.getSuperOperation() != null) {
				result.append( " from " + NamedElementHelper.getMangledQualifiedName(node.getSuperOperation().getOwningClass())) ;
			}
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public String visitEList(List nodes, String node_type)
	{	
		if(nodes.isEmpty()) return "";
		String result = "<div class='title'>" + node_type + "</div><div class='group'>" ;
		// First, sort the nodes, provided they are named elements. (which should always be the case in this code context)
		List<NamedElement> sortedNodes;
		if (nodes.size()>0 && nodes.get(0) instanceof NamedElement)
			sortedNodes = sortNamedElements(nodes);
		else sortedNodes = nodes;
		// Then, document them
		Iterator<NamedElement> it = sortedNodes.iterator();
		while (it.hasNext())
		{
			EObject next = it.next();
			result += this.accept(next);
		//	if (this.accept(next)==null) System.out.println("ELIST : " + next);
		}
		result+="</div>";
		return result;
	}
	
	public Object visitEnumeration(Enumeration node)
	{
		if (_as_signature == true)
			return super.visitEnumeration(node);
		else return "";
	}
	
	/** Returns a href-link for the given type. */
	public String getClassHREFForType(Type node)
	{
		if (node instanceof ClassImpl)
		{
			TypeDefinition typedef = ((ClassImpl)node).getTypeDefinition();
			Package container = (Package)typedef.eContainer();
			return
				"<a href='javascript:documentElement(\"" + 
			container.hashCode() + "\", \""+ 
			typedef.hashCode() + "\")'>" + typedef.getName() + "</a>";
		}
		else if (node instanceof NamedElement)
			return ((NamedElement)node).getName();
		else return node.toString();
	
	}
	
	public Object visitPrimitiveType(PrimitiveType node)
	{
		if (_as_signature == true)
		{
			return super.visitPrimitiveType(node);
		}
		else
		{
			String this_id = String.valueOf(node.hashCode());
			StringBuffer result = new StringBuffer();
			// Constructs the hyperlinked name of a Class with a ref to its description, and the list of associated operations
			result.append( "<div id='" + this_id + "' class='" + "container" + "'>" );
			result.append( "<div class='name'><a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>" );
			result.append( "</div>" );
			// Store the constructed content
			this._contents.put(this_id, result);
			// Returns the hyperlinked name of this class with a ref to its description
			return documentFeature(node);
		} 
	}
	
	/**
	 * ClassDefinition is a group of features (alias Operations and Properties)
	 * seb'list method readapted
	 * We just do the operations in a first iteration
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		typedef = false;
		String signature = NamedElementHelper.getMangledQualifiedName(node);
		Package container = (Package)node.eContainer();
		// If we want to print only a signature (see method "representation")
		if (_as_signature == true)
		{	
			if (node.getTypeParameter().size() > 0) {
				signature += "&lt;";
				signature += ppTypeVariableDeclaration(node.getTypeParameter());
				signature += "&gt;";
			}
			if (node.getSuperType().size() > 0) {
				signature += " <b>inherits</b> "
					   + ppComaSeparatedNodes(node.getSuperType());
			}
			return signature;
		}
		
		String this_id = String.valueOf(node.hashCode());
		StringBuffer result = new StringBuffer();
		// Constructs the hyperlinked name of a Class with a ref to its description, and the list of associated operations
		result.append( "<div id='" + this_id + "' class='" + "container" + "'>" );
		result.append( "<div class='name'>"+ container.getName() +"::<a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>");
		_as_signature = false;
		// For each operation : construct the hyper-linked-name of an operation, with a ref of its description
		result.append( this.visitEList(node.getOwnedOperation(), KEY_METHOD));
		_as_signature = false;
		// This makes the program too slow!
/*		result += this.visitEList(kmunit.getAllOwnedOperation(), KEY_INHERITED_METHOD);
		_as_signature = false;*/
		result.append(  this.visitEList(node.getOwnedAttribute(), KEY_ATTRIBUTE));
		result.append(  "</div>" );
		// Store the constructed content
		this._contents.put(this_id, result);
		typedef = true;
		// Returns the hyperlinked name of this class with a ref to its description
		return documentFeature(node);
	}
	
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		String qname = NamedElementHelper.getMangledQualifiedName(node.getTypeDefinition());
		String name = KMTHelper.getMangledIdentifier(node.getTypeDefinition().getName());
		if(qname == null || name == null){
			internalLog.error("Problem visiting a Class node with TypeDefinition name == null" );
			return "";
		}
		StringBuffer result = new StringBuffer( ppTypeName(qname, name) );
		result = new StringBuffer( result.substring(0, result.length() - name.length()) );
		result.append( getClassHREFForType(node) );
		if (node.getTypeParamBinding().size() > 0) {
			result.append( "&lt;" + ppComaSeparatedNodes(node.getTypeParamBinding()) + "&gt;" );
		}
		return result;
	}
	
	/**
	 * 
	 * Print in a linear list, all the packages contained in kermeta framework.
	 * @param the package to parse. Should be the root package to get all the nested
	 * packages in the framework
	 * 
	 * Package is a group of ClassDefinitions.
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPackage(fr.irisa.triskell.kermeta.language.structure.Package)
	 */
	public Object visitPackage(Package node) {

		if (_as_signature == true) return NamedElementHelper.getMangledQualifiedName(node);
		this.document(node);
		String this_id = String.valueOf(getNamedElementMainHashcode(node)); // use the main package hashcode
		// Construct the list of class definitions that belong to this package
		StringBuffer result = new StringBuffer( "\n<div id='" + this_id + "' class='" + "root" + "'>" );
		result.append( "<div class='name'><a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>" );
		_as_signature = false; 
		// use this because visitor of operation can be used for two purposes : one to print the signature, one to print the documentation
		// class definition visit return the hyper-linked-name of a class, and fills its contents
		Iterator<Package> it = kmunit.getPackages(NamedElementHelper.getMangledQualifiedName(node)).iterator();
		// For each package with the same qualified name
		while (it.hasNext())
		{
			Package pack = it.next();
			// Visit the packages in order to document their children								
			result.append( this.visitEList(pack.getOwnedTypeDefinition(), KEY_CLASS) );			
			
		}
		result.append( "</div>" );
		this._contents.put(this_id, result);
		return result;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public Object visitProperty(Property node) {
		if (_as_signature == false)
			return documentFeature(node);
		else 
		{
			StringBuffer signature = new StringBuffer(node.isIsComposite()?"attribute ":(node.isIsDerived()?"property ":"reference ") );
			signature.append( node.getName() + ": " + ppTypeFromMultiplicityElement(node) );
			signature.append( node.isIsReadOnly()?" readonly ":"" );
			if (node.getOpposite() != null) 
				signature.append ( "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName()) );
			return signature;
		}
	}
	
	/**
	 * Format the annotations in a pretty way.
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTag(fr.irisa.triskell.kermeta.language.structure.Tag)
	 */
	public Object visitTag(Tag node) {
		String result = (String) super.visitTag(node);
		int begin_i = 0; int end_i = 0;
		if (result.startsWith("/**")) begin_i = 2;
		
		if (result.endsWith("*/")) end_i = result.length()-2;
		else end_i = result.lastIndexOf("*/") +2;
		ArrayList<StringBuffer> lresult = new ArrayList<StringBuffer>();
		String[] lines = result.substring(begin_i, end_i).split("\\n");
		for (int i = 0; i<lines.length; i++)
		{
			String nline = lines[i].replaceFirst("\\s*\\*?(.*)", "$1");
			// nline.matches("\\s*\\*?(.*)"));
			nline = html(nline);
			nline = fixPlatformURI(nline);
			lresult.add(new StringBuffer(nline));
		}
		result = join(lresult,"<br/>");
		return result;
	}
	/** fix platform:/plugin URI */
	protected String fixPlatformURI(String str){
		String result = str;
		result = result.replaceAll("src=\"platform:/plugin/fr\\.irisa\\.triskell\\.kermeta\\.documentation/src/figures","src=\"./figures");
		return result;
	}
	
	/** Replace protected html chars ( &lt; becomes <code>&lt;</code> ) */
	public String html(String str)
	{	String result = str;
		// first, protect allowed html keywords
		for (String k : ALLOWED_HTML_KEYWORDS) { // pre/code/b/i
			result = result.replaceAll("<" + k + ">", "--" + k + "--")
				.replaceAll("</" + k + ">", "--/" + k + "--")
				.replaceAll("<" + k + "(\\s+[^>]*)>", "--" + k + "$1--")
				.replaceAll("<" + k + "([^>]*)/>", "--" + k + "$1/--");
		}
		result = result.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		for (String k : ALLOWED_HTML_KEYWORDS) {
			result = result.replaceAll("--" + k + "--", "<" + k + ">" )
				.replaceAll("--/" + k + "--", "</" + k + ">")
				.replaceAll("--" + k + "(\\s+[^>]*)--", "<" + k + "$1>")
				.replaceAll("--" + k + "([^>]*)/--", "<" + k + "$1/>");
		}
		return result;
	}
	
	/** If named element's qualified name is "toto::titi" then returns "toto::" */
	public String getPathForNamedElement(NamedElement node)
	{
		String qname = NamedElementHelper.getMangledQualifiedName(node);
		return ((qname.contains("::"))?qname.substring(0, (qname.length()-node.getName().length())):"");
	}
	
	protected int getNamedElementMainHashcode(NamedElement node)
	{
		Integer result = namedElementMainHashcode.get(node.hashCode());
		if(result == null) return node.hashCode();
		return result;
	}
	/**
	 * Helper - join the strings of list l, delimited by delimiter
	 * @param l the list to join in a single string
	 * @param delimiter the delimiter
	 * @return
	 */
	public String join(Collection<StringBuffer> l, String delimiter)
	{
		StringBuffer result = new StringBuffer();
		for (StringBuffer s : l) { result.append( s + delimiter ); }
		return result.substring(0, result.length()-delimiter.length());
	}
	
	/** Sorts the given list of elements. Their type should always be NamedElement. Otherwise,
	 * raises a ClassCastException ... */
	public List<NamedElement> sortNamedElements(List<NamedElement> nodes)
	{
		// EList is not easily modifiable
		List<NamedElement> result = new ArrayList<NamedElement>();
		result.addAll(nodes);
		Collections.sort(result, neCmp);
		return result;
	}
	
	/** Comparator for NamedElement sorting. */
	static final Comparator<NamedElement> neCmp = new Comparator<NamedElement>() {
	     public int compare(NamedElement o1, NamedElement o2) {
	         String s1 = o1.getName();
	         String s2 = o2.getName();
	         int len1 = s1.length();
	         int len2 = s2.length();
	         for (int i=0, n=Math.min(len1, len2); i<n; i++) {
	        	 char c1 = s1.charAt(i);
	        	 char c2 = s2.charAt(i);
	        	 if (c1 != c2)
	        		 return c1 - c2;
	         }
	          return len1 - len2;
	     }
	 };
}
