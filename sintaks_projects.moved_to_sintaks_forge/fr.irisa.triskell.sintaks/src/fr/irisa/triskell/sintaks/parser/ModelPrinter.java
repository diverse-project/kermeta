/*
 * Created on 4 f�vr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import fr.irisa.triskell.sintaks.printer.IPrinter;
import fr.irisa.triskell.sintaks.printer.PrinterAbstract;
import fr.irisa.triskell.sintaks.printer.PrinterSemanticException;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Rule;

public class ModelPrinter {

    private MetaModelParser mmParser;
    private ModelSubject subject;
    
    public ModelPrinter (MetaModelParser mmParser, ModelSubject subject) {
        this.mmParser = mmParser;
        this.subject = subject;
    }

    private PrintWriter getPrintStream (String outputFilename) {
        try {
        	if (outputFilename == null)
        		return null;
        	PrintWriter stream = new PrintWriter (new BufferedWriter(new FileWriter(outputFilename)));
            return stream;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
	        e.printStackTrace();
	        return null;
        }
    }

    public void print (String ruleFile, String outputFilename) {
        Rule startSymbol = mmParser.getStartSymbol(ruleFile);
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess()) {
        	SintaksPlugin.getDefault().debug ("startSymbol=");
        	SintaksPlugin.getDefault().debug (startSymbol.toString());
        	SintaksPlugin.getDefault().debugln ("");
        }
        
        IPrinter printer = new PrinterAbstract (startSymbol, subject);

        try {
        	PrintWriter stream = getPrintStream (outputFilename);
        	if (stream != null) {
                printer.print(stream);
                stream.flush();
                stream.close();
        	} else {
        		PrintWriter writer = new PrintWriter (SintaksPlugin.getDefault().getDebugStream());
        		printer.print(writer);
        		writer.flush();
        	}
        } catch (PrinterSemanticException e) {
            e.printStackTrace();
        }
    }
}
