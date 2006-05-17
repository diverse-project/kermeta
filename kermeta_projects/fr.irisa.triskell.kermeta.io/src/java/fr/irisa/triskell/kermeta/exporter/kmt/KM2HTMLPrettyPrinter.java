/* $Id: KM2HTMLPrettyPrinter.java,v 1.2 2006-05-17 14:34:26 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KM2HTMLPrettyPrinter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : May 15, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 *    spierre <sebastien@type-z.org>
 *    http://www.ivy.fr/SDoc
 *    This code is an adapted *copy* of sebastien code for python document generator. (It is under GPL!)
 */
package fr.irisa.triskell.kermeta.exporter.kmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * This pretty printer visits a Kermeta model and prints in a basic layout the documentation
 * of kermeta source code.
 */
public class KM2HTMLPrettyPrinter extends KermetaOptimizedVisitor {

	protected KM2KMTPrettyPrinter codePrinter ;

	protected List<String> _path;
	
	protected List<String> _descriptions;
	
	protected Hashtable<String, String> _contents;
	
	protected String _packagesNavigation;
	
	public static final String KEY_MODULE    = "Modules";
	public static final String KEY_CLASS     = "Classes";
	public static final String KEY_ATTRIBUTE    = "Attributes";
	public static final String KEY_FUNCTION  = "Functions";
	public static final String KEY_METHOD    = "Methods";
	public static final String KEY_VALUE     = "Values";
	public static final String MOD_INHERITED = "Inherited";
	public static final String[] KEYS_ORDER = new String[] {KEY_MODULE, KEY_CLASS, KEY_METHOD, KEY_FUNCTION, KEY_VALUE};

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

	public Package rootPackage;
	public String inputFile; // the kermeta program file.
	protected KermetaUnit kmunit;
	
	/** True if a visit call must return a "signature" of the object, false in the "html" representation case */
	protected boolean _as_signature;
	
	/*
	 *  HELPER METHODS FOR HTML PRETTY PRINT.
	 * 
	 */
	public KM2HTMLPrettyPrinter()
	{
		// init
		_contents = new Hashtable<String, String>();
		_descriptions = new ArrayList<String>(); 
		codePrinter = new KM2KMTPrettyPrinter();
		inputFile ="/udd/zdrey/Workspaces/KMNewWorkspace/fr.irisa.triskell.kermeta/lib/framework.km";
		
		kmunit = (KMUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(inputFile);
		kmunit.load();
		rootPackage = kmunit.getRootPackage();
	}

	
	public static void main(String[] args)
	{
		KM2HTMLPrettyPrinter html_printer = new KM2HTMLPrettyPrinter();
		html_printer.ppKermetaFile(html_printer.rootPackage, html_printer.inputFile+".html");
	}
	
	public void ppKermetaFile(Package p, String file) {
		String html_doc = "";
		html_doc = ppHTMLAll();
		
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(new File(file)));
			w.write(html_doc);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String ppHTMLAll()
	{
		// Visit the entire kermeta model. This methods assigns _packagesNavigation, _descriptions, _contents, etc.
		ppNestedPackages(rootPackage);
		// Get the results and display them in an HTML code
		String result = "";
		result += ppHTMLHeader();
		result += ppHTMLJavaScript();
		result += ppHTMLBody(_packagesNavigation, join(_descriptions,""), join(_contents.values(),""), "");
		return result;
	}
	
	/**
	 * Helper - join the strings of list l, delimited by delimiter
	 * @param l
	 * @param delimiter
	 * @return
	 */
	public String join(Collection<String> l, String delimiter)
	{
		String result = "";
		for (String s : l) { result += s + delimiter; }
		return result.substring(0, result.length()-delimiter.length());
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
	 * Print the head tag content that contains a javascript source code and basic stylesheet data
	 * @return
	 */
	public String ppHTMLJavaScript()
	{
		 String str_uri = "file:///udd/zdrey/Workspaces/KMNewWorkspace/fr.irisa.triskell.kermeta/lib/thirdparty/header.html";
		 StringBuffer result = new StringBuffer();
		 
		 try 
		 {
			 URI _uri = URI.createURI(str_uri);
			 URIConverter converter = new URIConverterImpl();
			 
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
	
	/** This is the method that prints the whole html body*/
	public String ppHTMLBody(String packages, String descriptions, String content, String main)
	{
		String result = 
		"<body>" +  // onLoad=\"javascript:documentElement('"+ main + "');\">" +

		"<div id=\"body\">" +
		"<div id=\"header\">" +
		"<ul>" +
		"<li><a href='http://www.kermeta.org'><b>[Kermeta Website]</b></a></li>" +
		//"<li><a href='examples.html'>examples</a></li>" +
		//"<!--<li><a href='guide.html'>guide</a></li>-->" +
		"<li><a href='api.html'>api</a></li>" +
		"</ul>" +
		"</div>" +
		"<div id=\"content\">" +
		"<h1 style=\"margin:0;\">Kermeta API Documentation</h1>" +
		"<!-- body -->" +
		"<div id='modules'>" +
		"  <!-- packages-snip -->" +
		   packages +
		"  <!-- packages-snip -->" +
		"  <div id='descriptions'>" +
		
		"  <!-- descriptions-snip -->" +
		   descriptions +
		"  <!-- descriptions-snip -->" +
		"  </div>" +
		"</div>" +
		"<div id='api'><!-- main element will be displayed here --></div>" +
		"<div id='hidden'>" +
		"<!-- hidden-snip -->" +
		content +
		"<!-- hidden-snip -->" +
		"<!-- hidden nodes will be moved here -->" +
		"</div>" +
		"</div>" + // close <div id=body>
		
		"</body>" +
		ppHTMLFoot() + 
		"</html>";
		return result;
	}
	
	public String ppHTMLFoot()
	{
		return "<div align='right' style='" +
			"margin-top: 30pt; clear:both; color: #a0a0a0;'>"+
			"<small>API generated with <a href=\"http://www.ivy.fr/sdoc\">SDoc</a> for Java!</small></div>" +
			"</div>";
	}
	
	public void ppNestedPackages(Package node)
	{
		// And now print the nested packages
		Iterator<Package> it = kmunit.getAllPackages().iterator();//node.getNestedPackage().iterator();
		// this.document(node.getName(), node, 0);

		while (it.hasNext())
		{
			node = it.next();
			// Visit the packages in order to document their children
			this.accept(node);

			String this_id = String.valueOf(node.hashCode());
			// Construct the list of package names from which user will browse the code documentation
			if (this._packagesNavigation!=null)
				this._packagesNavigation += " &bull; ";
			else
				this._packagesNavigation = "API : ";
			
			this._packagesNavigation += 
			  "<a href='javascript:documentElement(\"" + this_id + "\");'>" + node.getName() + "</a>";
		}
		
	}
		
	/** Gives the Java-representation of the given object. Every "documentable"
	 *  element is a NamedElement (operation, class, attributes, packages!) */
	public String representation(NamedElement node)
	{	
		_as_signature = true; // a kind of context
		String result = (String) this.accept(node);
		return (result!=null && result!="")?"<code>" + result + "</code>":"";
	}

	/** 
	 * Gets a description for the given object. This looks for a __kdoc__ 
	 * annotation in the object, otherwise returns its type and representation.
	 * this returns a div with a title and paragraph.This is a rather long
	 * text.
	 * @param node the node that contains a doc - either classDefinition, operation, attribute.
	 * */
	public String describe(NamedElement node)
	{
		String result = null;
		String this_id = "d_" + String.valueOf(node.hashCode());
		if (this._contents.containsKey(this_id)) return this._contents.get(this_id);
		result = "<div id='" + this_id + "' class='description'>";
		result += "<h1>" + describeType(node) + "</h1>";
		result += "<div class='representation'>";
		result += this.representation(node);
		result += "</div>";
		result += "<div class='docstring'>";
		// Does this node contains annotation?
		if (node.getTag().size()>0)
			result += visitEList(node.getTag(),"");
		else
			result += "<span class='undocumented'>Undocumented</span>";
		result += "</div></div>";
		_as_signature = false;
		this._contents.put(this_id, result);
		return result;
	}
	
	/** 
	 * Document the given element, which has the given name.
	 
	 */
	public void document( String name, NamedElement node )
	{	// Add the description of the object : its Type, its signature, and the kermeta doc.
		_descriptions.add(this.describe(node));
	}

	/** Return a reader-friendly representation of the signature/name of the given object */
	public String describeType(NamedElement node)
	{
		String result = null;
		String tmpl_beg = "<span class='name'>"; 
		String tmpl_end = "</span>";
		if (node instanceof ClassDefinition) // dirty is instanceof
			result = "Class ";
		else if (node instanceof Operation)
			result = "Operation ";
		else if (node instanceof Property)
			result = "Property "; 
		else if (node instanceof Package)
			result = "Package ";
		else // hem
			result = "";
			
		result +=  tmpl_beg + node.getName() + tmpl_end;
		return result;
	}
	
	

	protected String documentFeature(NamedElement node)
	{
		String result;
		int hash_code = 0;
		// Get the id of the feature
		if (node instanceof Operation) hash_code = ((Operation)node).getOwningClass().hashCode();
		else if (node instanceof Property) hash_code = ((Property)node).getOwningClass().hashCode();
		// classdefinition -> container should be of type Package
		else 
		{
			hash_code = ((ClassDefinition)node).eContainer().hashCode();
			System.err.println("Help:" + ((ClassDefinition)node).eContainer() );
		}
		
		String this_id = String.valueOf(hash_code); // fixme : parent_id is a better name
		String child_id = String.valueOf(node.hashCode());
		
		// Set the html display of the feature as in a list
		String link = "href='javascript:documentElement(\""+ this_id + "\",\"" + child_id + "\");'";
		boolean is_documented = node.getTag().size()>0;
		result = "<span class='"+ is_documented + "'><a " + link + ">" +  node.getName() + "</a></span><br />";
		
		this.document(node.getName(), node); // level parameter not understood yet
		
		return result;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	public Object visitOperation(Operation node) {
		if (_as_signature == false)
		{	
			return documentFeature(node);
		}
		else return node.getName() + "(" + codePrinter.ppComaSeparatedNodes(node.getOwnedParameter()) + ")\n";
	}
	
	public String visitEList(EList nodes, String node_type)
	{	
		String result = "<div class='title'>" + node_type + "</div class='title'><div class='group'>" ;
		Iterator it = nodes.iterator();
		while (it.hasNext())
		{
			result += this.accept((EObject)it.next());
		}
		result+="</div>";
		return result;
	}
	
	/**
	 * ClassDefinition is a group of features (alias Operations and Properties)
	 * seb'list method readapted
	 * We just do the operations in a first iteration
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		
		// If we want to print only a signature (see method "representation")
		if (_as_signature == true)
		{
			String signature = KMTHelper.getQualifiedName(node);
			if (node.getSuperType().size() > 0) {
				signature += " inherits "
					   + codePrinter.ppComaSeparatedNodes(node.getSuperType());
			}
			return signature;
		}
		
		String this_id = String.valueOf(node.hashCode());
		String result = "";
		// Constructs the hyperlinked name of a Class with a ref to its description, and the list of associated operations
		result += "<div id='" + this_id + "' class='" + "true" + "'>";
		result += "<div class='name'><a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>";
		_as_signature = false;
		// For each operation : construct the hyper-linked-name of an operation, with a ref of its description
		result += this.visitEList(node.getOwnedOperation(), KEY_METHOD);
		_as_signature = false;
		result += this.visitEList(node.getOwnedAttribute(), KEY_ATTRIBUTE);
		result += "</div>";
		// Store the constructed content
		this._contents.put(this_id, result);
		// Returns the hyperlinked name of this class with a ref to its description
		return documentFeature(node);
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

		if (_as_signature == true) return KMTHelper.getQualifiedName(node);
		this.document(node.getName(), node);
		String this_id = String.valueOf(node.hashCode());
		
		// Construct the list of class definitions that belong to this package
		String result = "<div id='" + this_id + "' class='" + "true" + "'>";
		result += "<div class='name'><a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>";
		_as_signature = false; 
		// use this because visitor of operation can be used for two purposes : one to print the signature, one to print the documentation
		// class definition visit return the hyper-linked-name of a class, and fills its contents
		result += this.visitEList(node.getOwnedTypeDefinition(), KEY_CLASS);
		result += "</div>";
		
		this._contents.put(this_id, result);
		return result;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public Object visitProperty(Property node) {
		if (_as_signature == false)
		{	
			return documentFeature(node);
		}
		else return node.getName() + ": " + codePrinter.accept(node.getType());
	}

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTag(fr.irisa.triskell.kermeta.language.structure.Tag)
	 */
	public Object visitTag(Tag node) {
		String result = (String) codePrinter.accept(node);
		int begin_i = 0; int end_i = 0;
		if (result.startsWith("/**")) begin_i = 2;
		if (result.endsWith("*/")) end_i = result.length()-2;
		ArrayList<String> lresult = new ArrayList<String>();
		String[] lines = result.substring(begin_i, end_i).split("\\n");
		for (int i = 0; i<lines.length; i++)
		{
			String nline = lines[i].replaceFirst("\\s*\\*?(.*)", "$1");
			// nline.matches("\\s*\\*?(.*)"));
			lresult.add(nline);
		}
		return join(lresult,"\n<br>");
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


}
