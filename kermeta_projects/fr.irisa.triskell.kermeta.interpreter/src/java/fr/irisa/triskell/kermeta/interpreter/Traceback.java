/* $Id: Traceback.java,v 1.11 2006-07-20 09:05:44 zdrey Exp $
 * Project   : Kermeta Interpreter
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

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class contains a set of methods that handle the stack trace created when 
 * an exception occurs.
 * notes :
 *   stacktrace : the trace of the stack of call frames that remains after an exception
 *   occured
 * TODO : cause_object a property?
 */
public class Traceback {

	final static public Logger log = LogConfigurationHelper.getLogger("KMT.INTERPRETER");
	
    ExpressionInterpreter interpreter;
    // The precise object that caused the error (usually, a block, but the developer
    // can give *quite* whatever he wants
    fr.irisa.triskell.kermeta.language.structure.Object cause_object;
    /**
     * @param cause_object the Object at the origin of the exception; can be null.
     * NOTE : Usually it is a FExpression
     * @param interpreter the interpreter
     */
    public Traceback(ExpressionInterpreter interpreter, fr.irisa.triskell.kermeta.language.structure.Object cause_object) {
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
            fr.irisa.triskell.kermeta.language.structure.Object expr = frame.getExpression();
            if (expr!=null) // The only case where this cond is false is on first invokation
                stack_trace = getContextForFObject(frame, expr) + stack_trace;
            else
            	if (frame instanceof OperationCallFrame){
            		OperationCallFrame opCallFrame = (OperationCallFrame)frame; 
            		if(opCallFrame.isOperation())
            			stack_trace = getContextForFObject(opCallFrame, opCallFrame.getOperation()) + stack_trace;
            		else
            			stack_trace = getContextForFObject(opCallFrame, opCallFrame.getProperty()) + stack_trace;
            	}
            	else {
            		// TODO : some callframes don't accept getOperation  / getExpression!! think about it                    
            		stack_trace = getContextForFObject(frame, frame.getOperation()) + stack_trace;    		        
            	}
        }
        // And the first info :
        stack_trace = "Trace: \n" + getContextForFObject(null, cause_object) + stack_trace;
        return stack_trace;
    }

    /**
     * Info : File <>, line X, in Method M
     * @param frame : the call frame. Note that it can be null
     * @param fobject : the operation or property
     * @param expr : the call expression
     * @return the info that locates the expression given in argument. Typically,
     * in a stack trace, the first element of the stack is the one given by the exception,and
     * the other ones are the elements of the callframe stack (which is, for example, 
     * composed of the Operation linked to the call frame, in the case of an OperationCallFrame)
     * TODO : with java 5, we could modify this to have the context into different formats according
     * a type as a complementary argument in this method.?
     * public <ContextType> getContextForFObject(CallFrame fram, FObject fobject, <ContextType> type)
     * With type that could be Text/AList to parse/...
     */
    public String getContextForFObject(CallFrame frame, fr.irisa.triskell.kermeta.language.structure.Object fobject)
    {
        String info = " ";
        KermetaUnit kunit = interpreter.getMemory().getUnit();
        // TODO : instead of this patch unit finder, use the Tracer tools
        // in order to get directly the URI of an elemeent
        KermetaUnit u = kunit.findUnitForModelElement(fobject);
        if (u!=null && fobject!=null) // I have not figured out why fobject given in parameters could be null
        {
            Object fo_source = u.getNodeByModelElement(fobject);
            info += getTextInfoForNode(fobject, fo_source, u, frame);
        }
        else if (frame != null) // it's in a KMUnit (which does not store a trace)
        {
            info += "    " + frame.toString() + "\n";
        }
        return info;
    }
    
    /**
     * Return the informations linked to FObject in the execution frame as
     * an array of string.
     * Same as getContextForF0bject
     * @param frame the current execution frame from which we make the traceback
     * @param fobject the "location" of the traceback (indirect cause of the raised exception)
     * @return an array with (since we call getInforForNode):
     * 		info[0] =  the URI of the file
     * 		info[1] = the line number in that file
     * 		info[2] = the name of the call frame (as a String)
     * 		info[3] = the code chunk for the object
     */
    public String[] getContextForFObjectAsArray(CallFrame frame, fr.irisa.triskell.kermeta.language.structure.Object fobject)
    {
        String[] infos = new String[4];
        Object fo_source = null;
        KermetaUnit kunit = interpreter.getMemory().getUnit();
        // TODO : instead of this patch unit finder, use the Tracer tools
        // in order to get directly the URI of an elemeent
        KermetaUnit u = kunit.findUnitForModelElement(fobject);
        if (u!=null)
            fo_source = u.getNodeByModelElement(fobject);
        infos = getInfoForNode(fobject, fo_source, u, frame);
        return infos;
    }
    
    /**
     * Get the text info for KermetaASTNode. We need the KermetaUnit that processed it, in
     * order to get the source file Uri.
     * @param node the Kermeta Node of the Object to print
     * @param unit the KemretaUnit that processed the node (in fact, a KMTUnit)
     * @return file <name of file>, line line_number, method caller
     */
    private String getTextInfoForKMTASTNode(fr.irisa.triskell.kermeta.language.structure.Object fobject, KermetaASTNode node, KermetaUnit unit, CallFrame frame)
    {
    	String[] infos = getInfoForKMTASTNodeAsArray(fobject, node, unit, frame);
        String info = "file '" + infos[0] + "'" + ", line "+ infos[1];
        if (frame != null)
            info += ", in '" + infos[2] + "'";
        info += " ( " + infos[3] + " )";
        return info;
    }
    
    /**
     * !!!We need to define precisely the format of the Text printed before writing this method!!!! 
     * @param unit
     * @param node
     * @param frame
     * @return
     */
    private String getTextInfoForKMNode(KermetaUnit unit, fr.irisa.triskell.kermeta.language.structure.Object node, CallFrame frame) {
    	return "pas de trace, pas d'chocolat\n";
    }
    
    /**
     * Return the appropriate trace textual information according to the type of
     * the given source_object.
     * @param fobject the object to traceback  
     * @param source_object the source_object (text, graphic, or model element) 
     * 		  from which the fobject (as model element) is generated
     *        (got from trace hashtables in KermetaUnits with fobject as key)
     * @param unit
     * @param frame
     * @return information according to the type of the source_object
     */
    public String getTextInfoForNode(fr.irisa.triskell.kermeta.language.structure.Object fobject, Object source_object, KermetaUnit unit, CallFrame frame)
    {
    	String info = "";
    	if (source_object instanceof KermetaASTNode)
    		info += "-> " + getTextInfoForKMTASTNode(fobject, (KermetaASTNode)source_object, unit, frame) + "\n";
    	else if (source_object instanceof fr.irisa.triskell.kermeta.language.structure.Object) // does the code come from a "compiled" repr.? // and does a trace exist for the compiled representation?
    		info += getTextInfoForKMNode(unit, (fr.irisa.triskell.kermeta.language.structure.Object)source_object, frame);
    	return info;
    }
    
    public String[] getInfoForNode(fr.irisa.triskell.kermeta.language.structure.Object fobject, Object source_object, KermetaUnit unit, CallFrame frame)
    {
    	String[] infos = new String[4];
    	if (source_object instanceof KermetaASTNode)
    		infos = getInfoForKMTASTNodeAsArray(fobject, (KermetaASTNode)source_object, unit, frame);
    	// if source_object is not a KermetaASTNode, than it would come from a km file
    	// and so, it would be equals to "fobject"!
    	// anyway, source_object could be later a object from a graphical view!
    	else if (source_object instanceof fr.irisa.triskell.kermeta.language.structure.Object || source_object == null)
    		infos = getInfoForKMNodeAsArray(fobject, (fr.irisa.triskell.kermeta.language.structure.Object)source_object, unit, frame);
    	return infos;
    }
    
    /**
     * @param fobject the Fobject concerned by the traceback
     * @param node the ASTNode corresponding to this fr.irisa.triskell.kermeta.language.structure.Object
     * @param unit the unit where this fr.irisa.triskell.kermeta.language.structure.Object was found
     * @param frame the frame in which this fr.irisa.triskell.kermeta.language.structure.Object was "used"
     * @return an array with :
     * 		info[0] =  the URI of the file
     * 		info[1] = the line number in that file
     * 		info[2] = the name of the call frame (as a String)
     * 		info[3] = the code chunk for the object
     * We made this method so that we are not obliged to regexp parse the textual information
     * when we need its such computed inforamtion chunks.
     */
    private String[] getInfoForKMTASTNodeAsArray(fr.irisa.triskell.kermeta.language.structure.Object fobject, KermetaASTNode node, KermetaUnit unit, CallFrame frame)
    {
    	String[] infos = new String[4];
    	if (unit != null)
    	{
    		infos[0] = unit.getUri();
    		infos[1] = Integer.toString(getLineNumber(node, unit.getUri()));
    	}
    	else
    	{
    		infos[0] = "unknown"; infos[1] = "1";
    	}
        infos[2] = (frame!=null)?frame.toString():":";
        infos[3] = getCodeForFObject(fobject);
        return infos;
    }
    
    private String[] getInfoForKMNodeAsArray(fr.irisa.triskell.kermeta.language.structure.Object fobject, Object source_object, KermetaUnit unit, CallFrame frame)
    {
    	String[] infos = new String[4];
    	if (unit != null)
    		infos[0] = unit.getUri();
    	else infos[0] = "unknown";
    	infos[1] = "1";
		infos[2] = (frame!=null)?frame.toString():":";
        infos[3] = getCodeForFObject(fobject);
    	return infos;
    }
    
    /**
     * Method for Kermeta text
     * @param node
     * @param unit_struri
     * @return
     */
    public static int getLineNumber(KermetaASTNode node, String unit_struri)
    {
        int linenum = 1; int c; int charcount = 0; 
        int charnum = node.getRangeStart();
        try
        {
            InputStream in = new URIConverterImpl().createInputStream(URI.createURI(unit_struri));
            while ((c = in.read()) != -1 && charcount<=charnum) {
                charcount += 1; if (c=='\n') linenum += 1;
            }
            in.close();
        } catch (IOException e) { e.printStackTrace(); }
        return linenum;
    }
    

    protected String getCodeForFObject(fr.irisa.triskell.kermeta.language.structure.Object fobject) 
    {
        KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
        String code = "";
        code = (String)pp.accept(fobject);
        // Print only the beginning of the string
        int first_nl = code.indexOf('\n');
        code = (first_nl>0)?(code.substring(0, first_nl) + " (...)"):code ;
        return code;
    }
    


}
