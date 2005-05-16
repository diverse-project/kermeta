/* $Id: KermetaRaisedException.java,v 1.1 2005-05-16 17:39:07 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : KermetaRaisedException.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FOperation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaRaisedException extends Error {

    protected RuntimeObject raised_object;
    
    /**
     * Constructor
     */
    public KermetaRaisedException(RuntimeObject raised_object, ExpressionInterpreter interpreter) {
        super("kermeta exception : " + raised_object + " not rescued.\n" + setContext(interpreter));
    }
    
    private static String setContext(ExpressionInterpreter interpreter) {
        String stack_trace = "------------END OF STACK TRACE------------\n";
        Iterator it = interpreter.interpreterContext.frame_stack.iterator();
        while(it.hasNext()) {
            CallFrame frame = (CallFrame)it.next();
            stack_trace = "->" + frame.toString() + "\n" + stack_trace;
        }
        return stack_trace;
    }
}
