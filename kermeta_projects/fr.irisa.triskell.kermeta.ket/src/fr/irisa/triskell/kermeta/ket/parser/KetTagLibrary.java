/* $Id: KetTagLibrary.java,v 1.2 2007-07-26 12:25:39 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.ket
 * File       : KetTagLibrary.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 Jul. 2007
 * Authors : 
 *        Olivier Barais <barais@irisa.fr>
 * Description : 
 *   First iteration of a template engine for Kermeta
 */

package fr.irisa.triskell.kermeta.ket.parser;

import org.eclipse.jet.taglib.TagDefinition;
import org.eclipse.jet.taglib.TagLibrary;

public class KetTagLibrary implements TagLibrary {

	public String getDefaultPrefix() {
		
		return "ket";
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return "description of ket";
	}

	public String getLibraryId() {
		// TODO Auto-generated method stub
		return "ket";
	}

	public String getLibraryName() {
		// TODO Auto-generated method stub
		return null;
	}

	public TagDefinition getTagDefinition(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getTagNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasTag(String tagNCName) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDeprecated() {
		// TODO Auto-generated method stub
		return false;
	}

}
