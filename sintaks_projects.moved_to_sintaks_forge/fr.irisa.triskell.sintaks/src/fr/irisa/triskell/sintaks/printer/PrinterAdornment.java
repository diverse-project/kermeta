/*
 * Created on 17 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.printer;

import java.io.PrintWriter;

import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Adornment;
import sts.Rule;

public class PrinterAdornment implements IPrinter {

	public PrinterAdornment(Rule adornment, ModelSubject subject) {
		super();
		this.adornment = (Adornment) adornment;
	}
//TODO the final else is forbitten as the parser will not reconnize it
    public void print (PrintWriter output) throws PrinterSemanticException {
        output.print(IPrinter.separator);
        String text = adornment.getTerminal();
        if ("eoln".equals(text))
        	output.println();
        else if ("tab".equals(text))
        	output.print("\t");
        else output.print(text);
        output.print(IPrinter.separator);
    }
    
	private Adornment adornment;
}
