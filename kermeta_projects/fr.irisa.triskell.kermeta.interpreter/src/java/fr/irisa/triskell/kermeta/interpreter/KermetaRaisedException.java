/* $Id: KermetaRaisedException.java,v 1.5 2005-08-24 17:27:52 zdrey Exp $
* Project : Kermeta (First iteration)
* File : KermetaRaisedException.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
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
    // The trace handler
    protected Traceback traceback;
    
    /**
     * Constructor 
     * @deprecated developer should use the other constructor
     */
    public KermetaRaisedException(RuntimeObject raised_object, ExpressionInterpreter interpreter)
    {
        super("kermeta exception : " + raised_object + " not rescued.\n "
                	+ setContext(interpreter, null));
        
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
                + setContext(interpreter, cause_object));
        setCauseExpression(interpreter, raised_object, cause_object);
        this.raised_object = raised_object;
        
        
    }
    
    /**
     * Completes the description of the raised_object if it corresponds to a KermetaException, and
     * returns the text representation of the code chunk that was responsible of the raised error 
     * @param interpreter
     * @param raised_object
     * @param cause_object
     * @return the text representation of the code chunk that was responsible of the raised error
     */
    protected static void setCauseExpression(ExpressionInterpreter interpreter, RuntimeObject raised_object, RuntimeObject cause_object)
    {   
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
            // Set the "expression" property of the RuntimeError
            fr.irisa.triskell.kermeta.runtime.language.Object.set(raised_object, expression_property, expression_value);
        }
        // If raised object is not an exception, we do nothing.
    }
    
    /**
     * Return a human-readable representation of the stack trace of the program until the
     * exception occurrence.
     */
    protected static String setContext(ExpressionInterpreter interpreter, RuntimeObject cause_object)
    {
        String context = "";
        FObject fobject = null;
        if (cause_object.getData().containsKey("kcoreObject"))
        {
            fobject = (FObject)cause_object.getData().get("kcoreObject");
        }
        else
        {
            System.err.println("RuntimeObject with no kcore object : " + cause_object);
        }
        context = new Traceback(interpreter, fobject).getStackTrace();
        // kcoreObject can be null!
        return context;
    }

    
}
