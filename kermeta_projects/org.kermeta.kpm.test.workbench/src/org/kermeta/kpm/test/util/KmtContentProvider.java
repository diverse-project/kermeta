

/*$Id: KmtContentProvider.java,v 1.1 2008-06-02 06:48:32 ftanguy Exp $
* Project : org.kermeta.kpm.test
* File : 	KmtContentProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 08
* Authors : paco
*/

package org.kermeta.kpm.test.util;

public class KmtContentProvider {

	static public String exemple1() {
		String s = "package kpmTest;";
		s += "\n";
		s += "require kermeta";
		s += "\n";
		s += "class Main {";
		s += "\n";
		s +="	operation foo() is do";
		s +="	end";
		s +="\n";
		s +="}";
		return s;
	}
	
}


