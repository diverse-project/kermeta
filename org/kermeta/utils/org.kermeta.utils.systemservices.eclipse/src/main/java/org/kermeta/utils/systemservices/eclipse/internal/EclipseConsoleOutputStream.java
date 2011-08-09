/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 9 août 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.eclipse.internal;


import java.io.IOException;
import java.io.OutputStream;

import org.kermeta.utils.systemservices.eclipse.internal.console.ConsoleIO;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.ErrorMessage;

/**
 * Stream dedicated to redirecting OutputStream to a ConsoleIO
 * (Note: we cannot simply use the ConsoleIO outputstream since it may change over time (generally due to color changes)
 * It is buffered in order to minimize 
 */
public class EclipseConsoleOutputStream extends OutputStream {

	

	ConsoleIO consoleIO;
	Boolean isErrStream = false;
	public EclipseConsoleOutputStream(ConsoleIO consoleIO) {
		this.consoleIO = consoleIO;
	}
	public EclipseConsoleOutputStream(ConsoleIO consoleIO, Boolean isErrStream) {
		this.consoleIO = consoleIO;
		this.isErrStream = isErrStream;
	}

	@Override
	public void write(int b) throws IOException {
		// TODO maybe find a more efficient way ?
		byte[] bytes = {new Integer(b).byteValue()};
		
		String s = new String(bytes); 
		if(isErrStream){
			consoleIO.print(new ErrorMessage(s));
		}
		else{
			consoleIO.print(s);
		}
	}

	@Override
	public void write(byte[] b) throws IOException {
		String s = new String(b);
		 
		if(isErrStream){
			consoleIO.print(new ErrorMessage(s));
		}
		else{
			consoleIO.print(s);
		}
	}
	

}
