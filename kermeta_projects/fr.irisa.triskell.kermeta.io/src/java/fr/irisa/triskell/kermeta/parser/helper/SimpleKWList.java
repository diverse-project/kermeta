/*
 * Created on 9 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.parser.helper;

import java.util.Hashtable;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class SimpleKWList {

	protected static SimpleKWList instance = null;
	public static SimpleKWList getInstance() {
		if (instance==null) instance = new SimpleKWList();
		return instance;
	}

	protected Hashtable<String,String> keywords;
	
	/**
	 * 
	 */
	protected SimpleKWList() {
		super();
		keywords = new Hashtable<String,String>();
		addKeyword("aspect");
		addKeyword("package");
		addKeyword("require");
		addKeyword("includeFilter");
		addKeyword("excludeFilter");
		addKeyword("using");
		addKeyword("inherits");
		addKeyword("class");
		addKeyword("abstract");
		addKeyword("Self");
		addKeyword("Void");
		addKeyword("attribute");
		addKeyword("reference");
		addKeyword("property");
		addKeyword("readonly");
		addKeyword("getter");
		addKeyword("is");
		addKeyword("setter");
		addKeyword("raises");
		addKeyword("select");
		addKeyword("operation");
		addKeyword("method");
		addKeyword("bag");
		addKeyword("set");
		addKeyword("seq");
		addKeyword("oset");
		addKeyword("alias");
		addKeyword("enumeration");
		addKeyword("and");
		addKeyword("or");
		addKeyword("not");
		addKeyword("self");
		addKeyword("super");
		addKeyword("result");
		addKeyword("do");
		addKeyword("end");
		addKeyword("function");
		addKeyword("rescue");
		addKeyword("from");
		addKeyword("until");
		addKeyword("loop");
		addKeyword("if");
		addKeyword("then");
		addKeyword("else");
		addKeyword("raise");
		addKeyword("var");
		addKeyword("init");
		addKeyword("extern");
		addKeyword("true");
		addKeyword("false");
		addKeyword("void");
		addKeyword("value");
		addKeyword("inv");
		addKeyword("@pre");
		addKeyword("pre");
		addKeyword("post");
	}

	public void addKeyword(String kw) {
		keywords.put(kw, kw);
	}
	
	public boolean isKeyword(String kw) {
		return keywords.containsKey(kw);
	}
	
	/**
	 * @return Returns the keywords.
	 */
	public Hashtable<String,String> getKeywords() {
		return keywords;
	}
}
