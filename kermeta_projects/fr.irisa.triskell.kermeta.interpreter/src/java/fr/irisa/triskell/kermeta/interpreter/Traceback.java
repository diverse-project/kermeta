/* $Id: Traceback.java,v 1.3 2005-08-31 14:43:22 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : Traceback.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Aug 24, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.interpreter;


import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * This class contains a set of methods that handle the stack trace created when 
 * an exception occurs.
 * notes :
 *   stacktrace : the trace of the stack of call frames that remains after an exception
 *   occured
 * TODO : cause_object a property?
 */
public class Traceback {

    ExpressionInterpreter interpreter;
    // The precise object that caused the error (usually, a block, but the developer
    // can give *quite* whatever he wants
    FObject cause_object;
    /**
     * @param cause_object the Object at the origin of the exception; can be null.
     * NOTE : Usually it is a FExpression
     * @param interpreter the interpreter
     */
    public Traceback(ExpressionInterpreter interpreter, FObject cause_object) {
        this.cause_object = cause_object;
        this.interpreter  = interpreter;
    }
    
    
    /**
     * Returns a textual representation of the stack trace. (Uses getTextInfoForFObject)
     * @param interpreter
     * @return a textual representation of the call frame stack.
     */
    public String getStackTrace()
    {   
        String stack_trace = "------------END OF STACK TRACE------------\n";
        Iterator it = interpreter.interpreterContext.frame_stack.iterator();
        while(it.hasNext()) {
            CallFrame frame = (CallFrame)it.next();
            // TODO : some callframes don't accept getOperation  / getExpression!! think about it
            FObject co = frame.getOperation();
            stack_trace = getContextForFObject(frame, co) + stack_trace;
        }
        // And the first info :
        stack_trace = getContextForFObject(null, cause_object) + stack_trace;
        return stack_trace;
    }

    /**
     * Info : File <>, line X, in Method M
     * @param frame : the call frame. Note that it can be null
     * @return the info that locates the expression given in argument. Typically,
     * in a stack trace, the first element of the stack is the one given by the exception,and
     * the other ones are the elements of the callframe stack (which is, for example, 
     * composed of the Operation linked to the call frame, in the case of an OperationCallFrame)
     */
    public String getContextForFObject(CallFrame frame, FObject fobject)
    {
        String info = " ";
        KermetaUnit kunit = interpreter.getMemory().getUnit();
        // TODO : instead of this patch unit finder, use the Tracer tools
        // in order to get directly the URI of an elemeent
        KermetaUnit u = kunit.findUnitForModelElement(fobject);
        if (u!=null) 
        {
            Object fo_source = u.getNodeByModelElement(fobject);
            if (fo_source instanceof KermetaASTNode)
            {
                info += "-> " + getTextInfoForKMTASTNode(fobject, (KermetaASTNode)fo_source, u, frame) + "\n";
            }
            else if (fo_source instanceof FObject) // does the code come from a "compiled" repr.? // and does a trace exist for the compiled representation?
                info += "pas de trace, pas d'chocolat\n";
        }
        else if (frame != null) // it's in a KMUnit (which does not store a trace)
        {
            info += "   " + frame.toString() + "\n";
        }
        return info;
    }
    
    /**
     * Get the text info for KermetaASTNode. We need the KermetaUnit that processed it, in
     * order to get the source file Uri.
     * @param node the Kermeta Node of the Object to print
     * @param unit the KemretaUnit that processed the node (in fact, a KMTUnit)
     * @return file <name of file>, line line_number, method caller
     */
    protected String getTextInfoForKMTASTNode(FObject fobject, KermetaASTNode node, KermetaUnit unit, CallFrame frame)
    {
        String info = "";
        info = "file '" + unit.getUri().substring(unit.getUri().lastIndexOf("/")+1) + "'";
        info += ", line "+ getKMTLineNumber(node, unit.getUri());
        if (frame != null)
            info += ", in '" + frame.toString() + "'";
        else
            info += " ( " + getCodeForFObject(fobject) + " )";
        return info;
    }
    
    protected String getCodeForFObject(FObject fobject) 
    {
        KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
        String code = "";
        code = (String)pp.accept(fobject);
        // Print only the beginning of the string
        int first_nl = code.indexOf('\n');
        code = (first_nl>0)?(code.substring(0, first_nl) + " (...)"):code ;
        return code;
    }
    /**
     * !!!We need to define precisely the format of the Text printed before writing this method!!!! 
     * @param unit
     * @param node
     * @param frame
     * @return
     */
    protected String getTextInfoForKMNode(KermetaUnit unit, FObject node, CallFrame frame)
    {
        String info = "";
        return info;
    }
    
    /**
     * Method for Kermeta text
     * @param node
     * @param unit_struri
     * @return
     */
    protected static String getKMTLineNumber(KermetaASTNode node, String unit_struri)
    {
        String line = "";
        int charnum = node.getRangeStart();
        URIConverter converter = new URIConverterImpl( ); 
        try
        {
            InputStream in = converter.createInputStream(URI.createURI(unit_struri));
            int c; int charcount = 0; int linenum = 1;
            while ((c = in.read()) != -1 && charcount<=charnum) {
                charcount += 1;
                if (c=='\n') linenum += 1;
            }
            in.close();
            line = new Integer(linenum).toString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return line;
    }
    
    
}
