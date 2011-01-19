/* $Id: $
* Project    : org.kermeta.utils.console.eclipse.tests
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 18 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.utils.console.eclipse.tests.tests;

import java.io.InputStream;
import java.io.PrintStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.kermeta.utils.console.eclipse.console.ConsoleFactory;
import org.kermeta.utils.console.eclipse.console.ConsoleUtility;
import org.kermeta.utils.console.eclipse.console.IConsoleUtility;



/**
 * @author mgouyett
 * This class test the use of the console thanks to a sample menu.
 */
public class ConsoleUtilTest {
	
	
	
	public void test() {
	new Job("Console product derivation") {
			public IStatus run(IProgressMonitor pm) {
				ConsoleUtility  console = (ConsoleUtility) ConsoleFactory.getInstance().getConsole();
				setStreamToConsole(console);
				// Test writeln
				console.writeln("Test writeln");
				console.writeln("");
				
				// Test prompt and read
				console.writeln("Test prompt and read");
				String answer = console.promptAndRead("answer:");
				console.writeln("answer obtained " + answer);
				console.writeln("");
				
				// Test errorln
				//console.errorln ("Test errorln");
				//console.writeln("");
				
				// Test warningln
			//	console.warningln("Test warningln");
				//console.writeln("");
				
				// Test infoln
			//	console.infoln("Test infoln");
				console.writeln("");
				
				// Test write_ok_ln
			//	console.write_ok_ln("Test write_ok_ln ");
			//	console.writeln("");
				
				return Status.OK_STATUS;
			}
		}.schedule();
		
		
	}
	
	public void setStreamToConsole (ConsoleUtility console){
		// To display outputStream on the new console
		IOConsoleOutputStream io = console.getOutputStream();
		System.setOut(new PrintStream(io));
		
		// To display inputStream on the new console
		InputStream input = console.getInputStream();
		System.setIn(input);
	}

}
