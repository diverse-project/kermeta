/* $Id: $
* Project    : org.kermeta.utils.console.eclipse
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 25 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.utils.console.eclipse.art2.impl;

import java.io.InputStream;
import java.io.PrintStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.utils.console.eclipse.console.ConsoleFactory;
import org.kermeta.utils.console.eclipse.console.ConsoleUtility;
import org.kermeta.utils.console.eclipse.console.IConsoleUtility;

@Provides({
    @ProvidedPort(name = "console", type=PortType.SERVICE)
})

/**
 * @author mgouyett
 *  Implementation of an Eclipse console that display message and retrieve user inputs
 */
@Library(name= "org.kermeta.utils")
@ComponentType
public class Art2ComponentEclipseConsole  extends AbstractComponentType{
	
	//private static ConsoleUtility console = (ConsoleUtility) ConsoleFactory.getInstance().getConsole();
	//private static ConsoleUtility console = new ConsoleUtility("Test Kermeta", null, null, null, null, null, null);
	
	private  String input ="";
	
	public synchronized String getInput() {
		return input;
	}
	
	public synchronized void setInput(String input) {
		this.input = input;
	}
	
	@Port(name="console",method="getConsole")
	public ConsoleUtility getConsole() {
		ConsoleUtility  console = (ConsoleUtility) ConsoleFactory.getInstance().getConsole();
		setStreamToConsole(console);
		ConsolePlugin.getDefault().
		   getConsoleManager().addConsoles(new IConsole[]{ console });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
		console.activate();
		// Redirect input and output stream in the console
		//setStreamToConsole(console);
		//console.write("test");
		return console;
	}
	
	@Port(name="console",method="write")
	public void write(final String message){
		new Job("Write") {

			@Override
			protected IStatus run(IProgressMonitor arg0) {
				ConsoleUtility  console = (ConsoleUtility) ConsoleFactory.getInstance().getConsole();
				console.activate();
				setStreamToConsole(console);
				 console.write(message);
				return Status.OK_STATUS;
			}
			
		}.schedule();
		
	}
	
	@Port(name="console",method="writeln")
	public void writeln(String message){
		getConsole().writeln(message);
	}
	
	@Port(name="console",method="error")
	public void error(String message){
		getConsole().error(message);
	}
	
	@Port(name="console",method="errorln")
	public void errorln(String message){
		getConsole().errorln(message);
	}
	
	@Port(name="console",method="info")
	public void info(String message){
		getConsole().info(message);
	}
	
	@Port(name="console",method="infoln")
	public void infoln(String message){
		getConsole().infoln(message);
	}
	
	@Port(name="console",method="warning")
	public void warning(String message){
		getConsole().warning(message);
	}
	
	@Port(name="console",method="warningln")
	public void warningln(String message){
		getConsole().warningln(message);
	}
	
	@Port(name="console",method="write_ok")
	public void write_ok(String message){
		getConsole().write_ok(message);
	}
	
	@Port(name="console",method="write_ok_ln")
	public void write_ok_ln(String message){
		getConsole().write_ok_ln(message);
	}
	
	@Port(name="console",method="read")
	public String read(){
		new Job("Read") {

			@Override
			protected IStatus run(IProgressMonitor arg0) {
				String res = getConsole().read();
				setInput (res);
				return Status.OK_STATUS;
			}
			
		}.schedule();
		return getInput();
	}
	
	@Port(name="console",method="promptAndRead")
	public String promptAndRead(final String message){
		new Job("Prompt and read") {

			@Override
			protected IStatus run(IProgressMonitor arg0) {
				getConsole().write(message);
				String res = getConsole().read();
				setInput (res);
				return Status.OK_STATUS;
			}
			
		}.schedule();
		return getInput();
	}
	
	/**
	 * Set input and output stream to a given console
	 * @param console the console where input and output stream are redirected
	 */
	public void setStreamToConsole (ConsoleUtility console){
		// To display outputStream on the new console
		IOConsoleOutputStream io = console.getOutputStream();
		System.setOut(new PrintStream(io));
		
		// To display inputStream on the new console
		InputStream input = console.getInputStream();
		System.setIn(input);
	}
	
	
	
	
	
}
