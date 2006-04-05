/* $Id: SyntaxResourceBundle.java,v 1.1 2006-04-05 19:00:14 zdrey Exp $
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

