

/*$Id: ModelcheckingStrategy.java,v 1.2 2008-02-14 07:13:42 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	ModelcheckingStrategy.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor;

public class ModelcheckingStrategy {

	final static public String NEVER_KEY = "NEVER";
	
	final static public int NEVER = 3;
	
	final static public String SAVING_TIME_KEY = "SAVING_TIME";
	
	final static public int SAVING_TIME = 2;

	final static public String INPUT_CHANGED_KEY = "INPUT_CHANGED_KEY";
	
	final static public int INPUT_CHANGED = 1;

	final static public String MODE_KEY = "MODE_KEY";
	
	static public int MODE = INPUT_CHANGED;
	
}


