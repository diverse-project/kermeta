/*$Id: HelperModel.java,v 1.1 2007-11-19 14:08:34 cfaucher Exp $
* Project : org.kermeta.compiler
* File : 	HelperModel.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 nov. 07
* Authors : cfaucher
*/

package org.kermeta.compiler.generator.helper.model;

import java.util.ArrayList;
import java.util.List;


public class HelperModel {

	public List<HelperMethod> helperMethods = null;
	
	public HelperModel() {
		helperMethods = new ArrayList<HelperMethod>();
	}
	
	public int getNextId() {
		return helperMethods.size()+1;
	}
}


