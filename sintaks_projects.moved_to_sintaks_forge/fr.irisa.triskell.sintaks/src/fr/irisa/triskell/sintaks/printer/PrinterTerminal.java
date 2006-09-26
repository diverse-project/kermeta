/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Rule;
import sts.Terminal;

public class PrinterTerminal implements IPrinter {

	public PrinterTerminal(Rule terminal, ModelSubject subject) {
		super();
		this.terminal = (Terminal) terminal;
	}

    public void print (PrintWriter output) throws PrinterSemanticException {
        output.print(IPrinter.separator);
        output.print(terminal.getTerminal());
        output.print(IPrinter.separator);
    }
    
	private Terminal terminal;
}
