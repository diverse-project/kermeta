/* $Id: SyntaxResourceBundle.java,v 1.3 2006-10-11 08:54:06 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : SyntaxResourceBundle.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 5, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ListResourceBundle;

public class SyntaxResourceBundle extends ListResourceBundle {
	
	public Object[][] getContents() {
		return contents;
	}
	static final Object[][] contents = {
		// LOCALIZE THIS
		{"comment", "//"},
		{"multilinecommentstart", "/*"},
		{"multilinecommentend", "*/"},
		{"punctuation", "(){};!&|.+-"},
		{"keywords", 
			"package class method operation is do end if while until loop init var raise rescue"}
		// END OF MATERIAL TO LOCALIZE
	};
	
	
}

