/*
 * Created on 9 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;

/**
 * @author Franck Fleurey IRISA / University of rennes 1 Distributed under the
 *         terms of the GPL license
 */
public class CathegorizedKWList {

	/*
	 * List of keywords table.
	 */
	public ArrayList <String> structKW = new ArrayList <String> ();
	public ArrayList <String> controlKW = new ArrayList <String> ();
	public ArrayList <String> typeKW = new ArrayList <String> ();
	public ArrayList <String> literalKW = new ArrayList <String> ();
	public ArrayList <String> operatorKW = new ArrayList <String> ();
	public ArrayList <String> specialKW = new ArrayList <String> ();
	public ArrayList <String> nonSpecialKW = new ArrayList <String> ();
	//////////////////////////
	//////////////////////////
	//		Constructor		//
	//////////////////////////
	//////////////////////////
	// Singleton instance
	private static CathegorizedKWList instance = null;

	// Singleton accessor
	public static CathegorizedKWList getInstance() {
		if (instance == null)
			instance = new CathegorizedKWList();
		return instance;
	}

	private CathegorizedKWList() {
		super();
		addKeyword("package", structKW);
		addKeyword("require", specialKW);
		addKeyword("includeFilter", specialKW);
		addKeyword("excludeFilter", specialKW);
		addKeyword("using", specialKW);
		addKeyword("inherits", structKW);
		addKeyword("class", structKW);
		addKeyword("@pre", operatorKW); //doesn't work properly, probably because the @ is processed firstly
		addKeyword("pre", specialKW);
		addKeyword("post", specialKW);
		addKeyword("inv", specialKW);
		addKeyword("abstract", structKW);
		//addKeyword("Self", typeKW);
		addKeyword("Void", typeKW);
		addKeyword("attribute", structKW);
		addKeyword("reference", structKW);
		addKeyword("property", structKW);
		addKeyword("readonly", structKW);
		addKeyword("getter", structKW);
		addKeyword("is", structKW);
		addKeyword("setter", structKW);
		addKeyword("raises", controlKW);
		//addKeyword("select", structKW);
		addKeyword("operation", structKW);
		addKeyword("method", structKW);
		addKeyword("bag", typeKW);
		addKeyword("set", typeKW);
		addKeyword("seq", typeKW);
		addKeyword("oset", typeKW);
		addKeyword("alias", structKW);
		addKeyword("enumeration", structKW);
		addKeyword("and", operatorKW);
		addKeyword("or", operatorKW);
		addKeyword("not", operatorKW);
		addKeyword("self", literalKW);
		addKeyword("super", literalKW);
		addKeyword("do", controlKW);
		addKeyword("end", controlKW);
		addKeyword("function", controlKW);
		addKeyword("rescue", controlKW);
		addKeyword("from", controlKW);
		addKeyword("until", controlKW);
		addKeyword("loop", controlKW);
		addKeyword("if", controlKW);
		addKeyword("then", controlKW);
		addKeyword("else", controlKW);
		addKeyword("raise", controlKW);
		addKeyword("var", controlKW);
		addKeyword("init", controlKW);
		addKeyword("extern", specialKW);
		addKeyword("true", literalKW);
		addKeyword("false", literalKW);
		addKeyword("void", literalKW);
		addKeyword("result", literalKW);
		addKeyword("value", literalKW);
		calculateNonSpecialKW();
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Constructor		//
	//////////////////////////////////
	//////////////////////////////////

	private void addKeyword(String kw, ArrayList <String> l) {
		l.add(kw);
	}
	
	private void calculateNonSpecialKW() {
		nonSpecialKW.addAll(structKW);
		nonSpecialKW.addAll(controlKW);
		nonSpecialKW.addAll(typeKW);
		nonSpecialKW.addAll(operatorKW);
		nonSpecialKW.addAll(literalKW);
	}
	
	public ArrayList <String> getNonSpecialKW() {
		return nonSpecialKW;
	}
}