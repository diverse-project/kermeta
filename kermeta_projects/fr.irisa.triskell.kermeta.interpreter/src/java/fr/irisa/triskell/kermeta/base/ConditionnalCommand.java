/* $Id: ConditionnalCommand.java,v 1.3 2005-03-15 08:20:56 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : ConditionalCommand.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 * Notes :
 * 	Those attributes are available directly (without an accessor) :
 * 		- kObject : the kermeta object currently processed 
 * 		- context : the context of the interpreter (a KermetaObject / InterpreterContext)
 */
package fr.irisa.triskell.kermeta.base;

import fr.irisa.triskell.kermeta.behavior.FConditionnal;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;

/**
 * 
 */
public class ConditionnalCommand extends ABaseCommand {
    
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.base.IBaseCommand#execute()
     */
    public void execute() {
        
        //
        FConditionnal conditional = (FConditionnal)kObject;
        FExpression cond = conditional.getFCondition();
        // cond_result is a boolean
        KermetaObject cond_result = invokeAccept("acceptKMExpressionVisitor", cond);
        if (cond == )
        //if (cond.)
        
        // 
        // TODO Auto-generated method stub

    }
}
