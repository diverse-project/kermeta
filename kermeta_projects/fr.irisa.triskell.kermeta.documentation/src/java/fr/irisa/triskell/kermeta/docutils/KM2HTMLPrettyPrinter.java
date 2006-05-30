/* $Id: KM2HTMLPrettyPrinter.java,v 1.1 2006-05-30 08:32:18 zdrey Exp $
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
package fr.irisa.triskell.kermeta.docutils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
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
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * This pretty printer visits a Kermeta model and prints in a basic layout the documentation
 * of kermeta source code.
 */
public class KM2HTMLPrettyPrinter extends KM2KMTPrettyPrinter {
	
	/** Contains the all the descriptions/documentations of the elements of Kermeta source (operations,
	 * classes, properties). Once this list is filled, we join it in a single string. Each
	 * description points to the @kdoc annotations (stored in the _contents attribute) 
	 * of those elements through a href link. */
	protected List<String> _descriptions;
	
	/**
	 * Contains all the @kdoc annotations of the elements of Kermeta source/
	 */
	protected Hashtable<String, String> _contents;
	
	/**
	 * Contains the list of all the packages. Each of them is a href-link to its package content.
	 */
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

	public String inputFile; // the kermeta program file.
	protected KermetaUnit kmunit;
	
	/** A context for the visitor. True if a visit call must return a "signature" 
	 *  of the object, false in the "html" representation case */
	protected boolean _as_signature;
	
	public KM2HTMLPrettyPrinter(String inputfile)
	{
		// init
		_contents = new Hashtable<String, String>();
		_descriptions = new ArrayList<String>();
		inputFile = inputfile;
		// Load the KermetaUnit for the given file (only needed to get the rootPackage :} of the km(t) file and
		// the list of its nested packages) 
		kmunit = (KMUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(inputFile);
		kmunit.load();
	}
	
	/** Pretty prints the file given as input in KM2HTMLPrettyPrinter constructor and
	 *  store it in the given output file */
	public void ppKermetaFile(String output_file) {
		// Pretty print the Kermeta file in HTML		
		String html_doc = ppHTMLAll();
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
	
	/** Prints the whole html body*/
	public String ppHTMLBody(String packages, String descriptions, String content, String main)
	{
		StringBuffer result = new StringBuffer();
		
		result.append("<body>"); // +  // onLoad=\"javascript:documentElement('"+ main + "');\">" +

		result.append("<div id=\"body\">");
		result.append("<div id=\"header\">&nbsp;");
		result.append("</div>");
		result.append("<div id=\"content\">");
		result.append("<h1 style=\"margin:0;\">Kermeta API Documentation</h1>");
		result.append("<!-- body -->");
		result.append("<div id='modules'>");
		result.append("  <!-- packages-snip -->");
		result.append(packages);
		result.append("  <!-- packages-snip -->");
		result.append("  <div id='descriptions'>");
		result.append("  <!-- descriptions-snip -->");
		result.append(descriptions);
		result.append("  <!-- descriptions-snip -->");
		result.append("  </div>");
		result.append("</div>");
		result.append("<div id='api'><!-- main element will be displayed here --></div>");
		result.append("<div id='hidden'>");
		result.append("<!-- hidden-snip -->");
		result.append(content);
		result.append("</div>");
		result.append("<!-- hidden-snip -->");
		result.append("<!-- hidden nodes will be moved here -->");
		result.append("</div>"); // close <div id=body>
		result.append("</div>");
		result.append("</body>");
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
		Iterator<Package> it = kmunit.getAllPackages().iterator();//node.getNestedPackage().iterator();
		// For each package
		while (it.hasNext())
		{
			Package node = it.next();
			String qname = KMTHelper.getQualifiedName(node); 
			// Visit the packages in order to document their children
			this.accept(node);
			// Construct the list of package names from which user will browse the code documentation
			if (this._packagesNavigation!=null) this._packagesNavigation += " &bull; ";
			else this._packagesNavigation = "API : ";
			// Get the path of the package (bla::foo)
			String path ="";
			if (qname.contains("::"))
				path = qname.substring(0, (qname.length()-node.getName().length()));
			// Get the id of this package
			String this_id = String.valueOf(node.hashCode());
			this._packagesNavigation +=
			path + "<a href='javascript:documentElement(\"" + this_id + "\");'>" + node.getName() + "</a>\n";
		}
		
	}
		
	/** Gives the Java-representation of the given object. Every "documentable"
	 *  element is a NamedElement (operation, class, attributes, packages!) */
	public String representation(NamedElement node)
	{	
		_as_signature = true;
		String result = (String) this.accept(node);
		return (result!=null && result!="")?"<code>" + result + "</code>":"";
	}

	/** 
	 * Gets a description for the given object. This looks for a <code>@kdoc</code> 
	 * annotation in the object, and returns its type and representation.
	 * this returns a div with a title and paragraph.This is a rather long
	 * text.
	 * @param node the node that contains a doc - either classDefinition, operation, attribute.
	 * */
	public String describe(NamedElement node)
	{
		String result = "";
		String this_id = "d_" + String.valueOf(node.hashCode());
		if (this._contents.containsKey(this_id)) return this._contents.get(this_id);
		result = "<div id='" + this_id + "' class='description'>";
		result += "<h1>" + this.describeType(node) + "</h1>";
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
	protected String documentFeature(NamedElement node)
	{
		String result;
		int hash_code = 0;
		// Get the id of the feature
		if (node instanceof Operation) hash_code = ((Operation)node).getOwningClass().hashCode();
		else if (node instanceof Property) hash_code = ((Property)node).getOwningClass().hashCode();
		// classdefinition -> container should be of type Package
		else if (node instanceof TypeDefinition)
			hash_code = ((TypeDefinition)node).eContainer().hashCode();
			//System.err.println("Help:" + ((ClassDefinition)node).eContainer() );
		else 
			hash_code = node.hashCode();
		
		String this_id = String.valueOf(hash_code); // fixme : parent_id is a better name
		String child_id = String.valueOf(node.hashCode());
		
		// Set the html display of the feature as in a list
		String link = "href='javascript:documentElement(\""+ this_id + "\",\"" + child_id + "\");'";
		boolean is_documented = node.getTag().size()>0;
		result = "<span class='"+ is_documented + "'><a " + link + ">" +  node.getName() + "</a></span><br />";
		
		this.document(node);
		
		return result;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	public Object visitOperation(Operation node) {
		String result = "";
		if (_as_signature == false)
			result = documentFeature(node);
		else
		{ // duplicate code with km2kmtprettyprinter
			result += (node.getSuperOperation() != null)?"method ":"operation ";
			result += KMTHelper.getMangledIdentifier(node.getName());
			if (node.getTypeParameter().size() > 0) {
				result += "&lt;";
				result += ppTypeVariableDeclaration(node.getTypeParameter());
				result += "&gt;";
			}
			result += "(";
			result += ppComaSeparatedNodes(node.getOwnedParameter());
			result += ")";
			result += node.getType() != null?(" : " + ppTypeFromMultiplicityElement(node)):" : Void";
			if (node.getSuperOperation() != null) {
				result += " from " + KMTHelper.getMangledIdentifier(KMTHelper.getQualifiedName(node.getSuperOperation().getOwningClass()));
			}
		}
		return result;
	}
	
	public String visitEList(EList nodes, String node_type)
	{	
		String result = "<div class='title'>" + node_type + "</div><div class='group'>" ;
		// First, sort the nodes, provided they are named elements. (which should always be the case in this code context)
		List<NamedElement> sortedNodes;
		if (nodes.size()>0 && nodes.get(0) instanceof NamedElement)
			sortedNodes = sortNamedElements(nodes);
		else sortedNodes = nodes;
		// Then, document them
		Iterator it = sortedNodes.iterator();
		while (it.hasNext())
		{
			EObject next = (EObject)it.next();
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
			this._contents.put(this_id,"");
			String result = "";
			// Constructs the hyperlinked name of a Class with a ref to its description, and the list of associated operations
			result += "<div id='" + this_id + "' class='" + "container" + "'>";
			result += "<div class='name'><a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>";
			result += "</div>";
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
		String signature = KMTHelper.getQualifiedName(node);
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
		String result = "";
		// Constructs the hyperlinked name of a Class with a ref to its description, and the list of associated operations
		result += "<div id='" + this_id + "' class='" + "container" + "'>";
		result += "<div class='name'><a href='javascript:describeElement(\""+ this_id + "\");'>" + node.getName() + "</a></div>";
		_as_signature = false;
		// For each operation : construct the hyper-linked-name of an operation, with a ref of its description
		result += this.visitEList(node.getOwnedOperation(), KEY_METHOD);
		_as_signature = false;
		result += this.visitEList(node.getOwnedAttribute(), KEY_ATTRIBUTE);
		result += "</div>";
		// Store the constructed content
		this._contents.put(this_id, result);
		typedef = true;
		// Returns the hyperlinked name of this class with a ref to its description
		return documentFeature(node);
	}
	
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		String qname = KMTHelper.getQualifiedName(node.getTypeDefinition());
		String name = KMTHelper.getMangledIdentifier(node.getTypeDefinition().getName());
		if(qname == null || name == null){
			internalLog.error("Problem visiting a Class node with TypeDefinition name == null" );
			return "";
		}
		String result = ppTypeName(qname, name);
		result = result.substring(0, result.length() - name.length());
		result += getClassHREFForType(node);
		if (node.getTypeParamBinding().size() > 0) {
			result += "&lt;" + ppComaSeparatedNodes(node.getTypeParamBinding()) + "&gt;";
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

		if (_as_signature == true) return KMTHelper.getQualifiedName(node);
		this.document(node);
		String this_id = String.valueOf(node.hashCode());
		// Construct the list of class definitions that belong to this package
		String result = "<div id='" + this_id + "' class='" + "root" + "'>";
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
			return documentFeature(node);
		else 
		{
			String signature = node.isIsComposite()?"attribute ":(node.isIsDerived()?"property ":"reference ");
			signature += node.getName() + ": " + ppTypeFromMultiplicityElement(node);
			signature += node.isIsReadOnly()?" readonly ":"";
			if (node.getOpposite() != null) 
				signature += "#" + KMTHelper.getMangledIdentifier(node.getOpposite().getName());
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
		ArrayList<String> lresult = new ArrayList<String>();
		String[] lines = result.substring(begin_i, end_i).split("\\n");
		for (int i = 0; i<lines.length; i++)
		{
			String nline = lines[i].replaceFirst("\\s*\\*?(.*)", "$1");
			// nline.matches("\\s*\\*?(.*)"));
			nline = html(nline);
			lresult.add(nline);
		}
		return join(lresult,"\n<br>");
	}
	
	/** Replace protected html chars ( &lt; becomes <code>&lt;</code> ) */
	public String html(String str)
	{
		String result = str.replaceAll("<", "&lt;");
		result = result.replaceAll(">", "&gt;");
		return result;
	}
	
	/** If named element's qualified name is "toto::titi" then returns "toto::" */
	public String getPathForNamedElement(NamedElement node)
	{
		String qname = KMTHelper.getQualifiedName(node);
		return ((qname.contains("::"))?qname.substring(0, (qname.length()-node.getName().length())):"");
	}
	
	/**
	 * Helper - join the strings of list l, delimited by delimiter
	 * @param l the list to join in a single string
	 * @param delimiter the delimiter
	 * @return
	 */
	public String join(Collection<String> l, String delimiter)
	{
		String result = "";
		for (String s : l) { result += s + delimiter; }
		return result.substring(0, result.length()-delimiter.length());
	}
	
	/** Sorts the given list of elements. Their type should always be NamedElement. Otherwise,
	 * raises a ClassCastException ... */
	public List<NamedElement> sortNamedElements(EList nodes)
	{
		// EList is not easily modifiable
		List<NamedElement> result = new ArrayList<NamedElement>();
		result.addAll(nodes);
		Collections.sort(result, neCmp);
		return result;
	}
	
	/** Comparator for NamedElement sorting. */
	static final Comparator neCmp = new Comparator() {
	     public int compare(Object o1, Object o2) {
	         String s1 = ((NamedElement)o1).getName();
	         String s2 = ((NamedElement)o2).getName();
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
