/* $Id: KermetaRaisedException.java,v 1.4 2005-08-23 18:43:45 zdrey Exp $
* Project : Kermeta (First iteration)
* File : KermetaRaisedException.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaRaisedException extends Error {

    protected RuntimeObject raised_object;
    
    /**
     * Constructor 
     * @deprecated developer should use the other constructor
     */
    public KermetaRaisedException(RuntimeObject raised_object, ExpressionInterpreter interpreter) {
        super("kermeta exception : " + raised_object + " not rescued.\n" + setContext(interpreter, null ));
        this.raised_object = raised_object;
    }
    
    /**
     * 
     * @param raised_object
     * @param cause_object the FExpression where the error occured
     */
    public KermetaRaisedException(RuntimeObject raised_object, RuntimeObject cause_object, ExpressionInterpreter interpreter) {
        super("Unrescued kermeta exception : " + raised_object
                + "\n"
                + setCauseExpression(interpreter, raised_object, cause_object) 
                + setContext(interpreter, cause_object));
        this.raised_object = raised_object;
        
        
    }
    
    private static String setCauseExpression(ExpressionInterpreter interpreter, RuntimeObject raised_object, RuntimeObject cause_object)
    {
        String exp_str = "";
        RuntimeMemory memory = raised_object.getFactory().getMemory();
        // Class of the raised_object
        FClass fc = (FClass)raised_object.getMetaclass().getData().get("kcoreObject");
        FClassDefinition exception_cd = (FClassDefinition)memory.getUnit().getTypeDefinitionByName("kermeta::exceptions::RuntimeError");
        // Is the raised_object an kermeta::exceptions::RuntimeError?
        if (cause_object!=null && memory.getUnit().isSuperClass(exception_cd, fc.getFClassDefinition()))
        {
            FProperty fexp_prop = memory.getUnit().findPropertyByName(fc.getFClassDefinition(), "expression");
            RuntimeObject expression_property = memory.getRuntimeObjectForFObject(fexp_prop);
            RuntimeObject expression_value = cause_object;
            // Set the "expression" property
            fr.irisa.triskell.kermeta.runtime.language.Object.set(raised_object, expression_property, expression_value);
        }
        else if (cause_object!=null)
        {   // pretty print the error code
            // TODO : Check if we interprete a KermetaText or another representation
            KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
            exp_str = (String)pp.accept((FObject)cause_object.getData().get("kcoreObject"));
            // Print only the beginning of the string
            int first_nl = exp_str.indexOf('\n');
            exp_str = (first_nl>0)?(exp_str.substring(0, first_nl) + " (...)"):exp_str;
            exp_str = getTextInfo(interpreter, cause_object) + ", "
            		  + exp_str + "\n";
        }
        // If raised object is not an exception, we do nothing.
        return exp_str;
    }
    
    private static String setContext(ExpressionInterpreter interpreter, RuntimeObject cause_object) {
        String stack_trace = "------------END OF STACK TRACE------------\n";
        Iterator it = interpreter.interpreterContext.frame_stack.iterator();
        while(it.hasNext()) {
            CallFrame frame = (CallFrame)it.next();
            stack_trace = "->" + frame.toString() + "\n" + stack_trace;
        }
        return stack_trace;
    }
    
    private static String getTextInfo(ExpressionInterpreter interpreter, RuntimeObject cause_object)
    {
        String line = ""; String file = "";
        FObject fo = (FObject)cause_object.getData().get("kcoreObject");
        // TODO : Check if we interprete a KermetaText or another representation
        // NOTE : For now, only the Text representation (and the "model" one) exists.
        KermetaUnit kunit = interpreter.getMemory().getUnit();
        KermetaUnit u = interpreter.getMemory().getUnit().findUnitForModelElement(fo);
        if (u!=null) 
        {
            Object fo_source = u.getNodeByModelElement(fo);
            if (fo_source instanceof KermetaASTNode)
            {
                KermetaASTNode fo_ast = (KermetaASTNode)u.getNodeByModelElement(fo);
                file = "file '" + u.getUri().substring(u.getUri().lastIndexOf("/")+1) + "', ";
                line = "line "+new Integer(fo_ast.getRangeStart()).toString() + ", ";
            }
        }
        return file+line;
    }
    
    private static String getLineNumber(KermetaASTNode node, String unit_struri)
    {
        String line = "";
        URIConverter converter = new URIConverterImpl( ); 
        try
        {
            InputStream in = converter.createInputStream(URI.createURI(unit_struri));
            // todo...
        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return line;
    }
    
    
}
