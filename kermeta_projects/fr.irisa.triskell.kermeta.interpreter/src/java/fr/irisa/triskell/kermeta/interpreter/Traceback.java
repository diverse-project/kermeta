/* $Id: Traceback.java,v 1.24 2008-05-27 13:02:11 dvojtise Exp $
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
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;

import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;

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
        StringBuffer stack_trace = new StringBuffer("Trace: \n" + getContextForFObject(null, cause_object)+"\n");
        Stack<CallFrame> s = (Stack<CallFrame>) interpreter.interpreterContext.frame_stack.clone();
        
        while ( ! s.isEmpty() ) {
        	CallFrame frame = s.pop();
        
//        for (CallFrame frame : interpreter.interpreterContext.frame_stack)
  //      {
            fr.irisa.triskell.kermeta.language.structure.Object expr = frame.getExpression();
            if (expr!=null) // The only case where this cond is false is on first invokation
                stack_trace.append(getContextForFObject(frame, expr));
            else
            	if (frame instanceof OperationCallFrame){
            		OperationCallFrame opCallFrame = (OperationCallFrame)frame; 
            		if(opCallFrame.isOperation())
            			stack_trace.append(getContextForFObject(opCallFrame, opCallFrame.getOperation()));
            		else
            			stack_trace.append(getContextForFObject(opCallFrame, opCallFrame.getProperty()));
            	}
            	else {
            		// TODO : some callframes don't accept getOperation  / getExpression!! think about it                    
            		stack_trace.append(getContextForFObject(frame, frame.getOperation()));    		        
            	}
        }
        stack_trace.append("------------END OF STACK TRACE------------\n");
        return stack_trace.toString();
    }
    
    
	/**
	 * Helper method that looks into all the imported unit to find the researched 
	 * model element
	 * @param object the model element (fr.irisa.triskell.kermeta.language.structure.FObject) that we want to find
	 * @return the KermetaUnit that contains the expected model element
	 * FIXME : not optimized at all, since getNodeByModelElement is finally called
	 * (duplicated hashtable access)
	 * wherever this method is used and whenever it returns a unit. (return result, uri?)
	 * FIXME : does not deal with unit in km format since it use the parser traces and not a reliable trace
	 * other loaders may have not filled these tables
	 */
	public KermetaUnit findUnitForModelElement(KermetaUnit kermetaUnit, fr.irisa.triskell.kermeta.language.structure.Object object)
	{
	    Object result = kermetaUnit.getNodeByModelElement(object);
	    if (result != null) 
	    	return kermetaUnit;
	    
	    List <KermetaUnit> iulist = KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit );
	    for ( KermetaUnit iu : iulist ) {	        
	        result = iu.getNodeByModelElement(object);
		    if (result != null) 
		    	return iu;
	    }
	    return null;		
	}
    
	
	/**
	 * retreives the ModelRefence (ie. a trace ref) to this object
	 * also looks into imported units's tracers
	 * @param object
	 * @return
	 */
	public ModelReference findModelReferenceToModelElement(KermetaUnit kermetaUnit, fr.irisa.triskell.kermeta.language.structure.Object object)
	{
		if ( kermetaUnit.getTracer() != null ) {
			ModelReference result = kermetaUnit.getTracer().getOneModelReference(object);
		    if (result != null) 
		    	return result;
		    // try imported unit tracer
		    List <KermetaUnit> iulist = KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit );
		    for ( KermetaUnit iu : iulist ) {	        
		        if (iu.getTracer() != null) 
		        	result = iu.getTracer().getOneModelReference(object);
			    if (result != null) 
			    	return result;
		    }
		    return result;
		}
		return null;
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
        StringBuilder info = new StringBuilder(" ");
        KermetaUnit kunit = interpreter.getMemory().getUnit();
        
        KermetaUnit u = findUnitForModelElement(kunit, fobject);
        if (u!=null && fobject!=null) // I have not figured out why fobject given in parameters could be null
        {
            Object fo_source = u.getNodeByModelElement(fobject);
            info.append(getTextInfoForNode(fobject, fo_source, u, frame));
        }
        else {
        	 // use the Tracer tools in order to get directly the URI of an element
        	ModelReference mr = findModelReferenceToModelElement(kunit, fobject);
        	if(mr != null){
        		TextReference tr = ModelReferenceHelper.getFirstTextReference(mr);
        		info.append(getTextInfoForNode(fobject, tr, u, frame));
        	}
	        else if (frame != null) // it's in a KMUnit (which does not store a trace)
	        {
	        	info.append("    " + frame.toString() + "\n");
	        }
        }
        return info.toString();
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
        ModelReference mr = findModelReferenceToModelElement(kunit, fobject);
        if(mr != null)
        	fo_source = ModelReferenceHelper.getFirstTextReference(mr);        
        infos = getInfoForNode(fobject, fo_source, kunit, frame);
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
    
    private String getTextInfoForTextReference(fr.irisa.triskell.kermeta.language.structure.Object fobject,TextReference tr, CallFrame frame)
    {
        String info = "file '" + tr.getFileURI() + "'" + ", line "+ tr.getLineBeginAt();
        if (frame != null)
            info += ", in '" + frame.toString() + "'";
        info += " ( " + getCodeForFObject(fobject) + " )";
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
     *        or a TextReference from the traceability
     * @param unit
     * @param frame
     * @return information according to the type of the source_object
     */
    public String getTextInfoForNode(fr.irisa.triskell.kermeta.language.structure.Object fobject, Object source_object, KermetaUnit unit, CallFrame frame)
    {
    	StringBuilder info = new StringBuilder("");
    	if (source_object instanceof KermetaASTNode)
    		info.append("-> " + getTextInfoForKMTASTNode(fobject, (KermetaASTNode)source_object, unit, frame) + "\n");
    	else if (source_object instanceof fr.irisa.triskell.kermeta.language.structure.Object) // does the code come from a "compiled" repr.? // and does a trace exist for the compiled representation?
    		info.append("   " + getTextInfoForKMNode(unit, (fr.irisa.triskell.kermeta.language.structure.Object)source_object, frame));
    	else if (source_object instanceof TextReference)
    		info.append("   " + getTextInfoForTextReference(fobject, (TextReference)source_object, frame)+ "\n");
    	return info.toString();
    }
    
    public String[] getInfoForNode(fr.irisa.triskell.kermeta.language.structure.Object fobject, Object source_object, KermetaUnit unit, CallFrame frame)
    {
    	String[] infos = new String[4];
    	if (source_object instanceof KermetaASTNode)
    		infos = getInfoForKMTASTNodeAsArray(fobject, (KermetaASTNode)source_object, unit, frame);
    	// if source_object is not a KermetaASTNode, then it probably comes from a km file
    	// and so, it should be equal to "fobject"!
    	// anyway, source_object could be later a object from a graphical view!
    	else if (source_object instanceof TextReference)
    		infos = getTextInfoForTextReferenceAsArray(fobject, (TextReference)source_object, frame);
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
    private String[] getTextInfoForTextReferenceAsArray(fr.irisa.triskell.kermeta.language.structure.Object fobject, TextReference textRef, CallFrame frame)
    {
    	String[] infos = new String[4];
    	infos[0] = textRef.getFileURI();
    	infos[1] = textRef.getLineBeginAt().toString();
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
