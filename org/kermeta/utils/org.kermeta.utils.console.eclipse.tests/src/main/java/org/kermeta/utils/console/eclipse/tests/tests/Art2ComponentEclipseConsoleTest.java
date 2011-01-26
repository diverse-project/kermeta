/* $Id: $
* Project    : org.kermeta.utils.console.eclipse.tests
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 25 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.utils.console.eclipse.tests.tests;

import org.kermeta.utils.console.eclipse.art2.impl.Art2ComponentEclipseConsole;

/**
 * @author mgouyett
 * This class permits to test the Art2Component for the Eclipse console
 */
public class Art2ComponentEclipseConsoleTest {
	
	private Art2ComponentEclipseConsole component;
	
	public Art2ComponentEclipseConsoleTest () {
		component = new Art2ComponentEclipseConsole();
	}
	
	public Art2ComponentEclipseConsole getComponent() {
		return component;
	}
	
	public void testWrite(){
		getComponent().write("Test write");
	}
	
	public void testWriteln(){
		getComponent().writeln("Test writeln");
	}

}
