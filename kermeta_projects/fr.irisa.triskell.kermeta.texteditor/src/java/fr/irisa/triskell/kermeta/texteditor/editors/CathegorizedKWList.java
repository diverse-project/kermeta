/*
 * Created on 9 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * @author Franck Fleurey IRISA / University of rennes 1 Distributed under the
 *         terms of the GPL license
 */
public class CathegorizedKWList {

	protected static CathegorizedKWList instance = null;

	public static CathegorizedKWList getInstance() {
		if (instance == null)
			instance = new CathegorizedKWList();
		return instance;
	}

	public ArrayList structKW;
	public ArrayList controlKW;
	public ArrayList typeKW;
	public ArrayList literalKW;
	public ArrayList operatorKW;
	public ArrayList specialKW;

	public ArrayList getNonSpacialKW() {
		ArrayList result = new ArrayList();
		result.addAll(structKW);
		result.addAll(controlKW);
		result.addAll(typeKW);
		result.addAll(operatorKW);
		result.addAll(literalKW);
		return result;
	}
	
	/**
	 *  
	 */
	protected CathegorizedKWList() {
		super();
		structKW = new ArrayList();
		controlKW = new ArrayList();
		typeKW = new ArrayList();
		literalKW = new ArrayList();
		operatorKW = new ArrayList();
		specialKW = new ArrayList();
		
		addKeyword("package", structKW);
		addKeyword("require", specialKW);
		addKeyword("using", specialKW);
		addKeyword("inherits", structKW);
		addKeyword("class", structKW);
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

	}

	public void addKeyword(String kw, ArrayList l) {
		l.add(kw);
	}
}