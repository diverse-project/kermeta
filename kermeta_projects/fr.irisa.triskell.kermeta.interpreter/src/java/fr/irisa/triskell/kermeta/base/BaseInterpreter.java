/* $Id: BaseInterpreter.java,v 1.2 2005-03-14 18:03:10 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : BaseCommand.java
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
 * 		 
 */
package fr.irisa.triskell.kermeta.base;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

/**
 * This is the Command handler. It is the <b>Invoker</b> in the command pattern architecture.
 * The goal of this class is to unify in one process, the handle of the basic 
 * interpreter commands which are written in Java. Those commands are used to evaluate  
 * the Conditional, Loop, Operation call, and Assignment. 
 * 
 * The interpreter.kmt visitor call the static method of this base interpreter, in each
 * of its "visit" method of a "system type" (Conditional, Loop, Assignment, OpCall), 
 * to evaluate each AST node
 * 
 */
public class BaseInterpreter {
    
    /**
     * The main method that is called on a KermetaObject to evaluate it.
     * It uses : 
     * - createCommand : to create the command that is dedicated to the execution of this object
     * - executeCommand : execute the command (method delegator)
     * @param kObject the KermetaObject to evaluate
     * @param pContext the interpreter context
     */
    public static void evaluate(KermetaObject kObject, KermetaObject pContext)
    {
        ABaseCommand command = createCommand(kObject);
        command.setInterpreterContext(pContext);
        executeCommand(command);
    }

    /**
     * Create the command associated to this object (that will evaluate this object)
     * @param kObject
     */
    public static ABaseCommand createCommand(KermetaObject kObject)
    {
        Class commandClass = null;
        
        try {
            commandClass = Class.forName(getCommandName(kObject));
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        ABaseCommand commandInstance = null;

        // instanciate the corresponding command class with java reflexion
        try {
            
            // Get the command class name corresponding to this type of KermetaObject
            commandInstance = (ABaseCommand)commandClass.newInstance();
            commandInstance.setKermetaObject(kObject);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return commandInstance;
    }
    
        
    /**
     * Execute the command pCommand
     * @param pCommand
     */
    public static void executeCommand(ABaseCommand pCommand)
    {
        pCommand.execute();
    }

    /**
     * Get the name of this object and retrieve the corresponding command class name.
     * @param kObject the object for which we want to retrieve the corresponding command.
     * @return the name of the command class for this KermetaObject
     */
    public static String getCommandName(KermetaObject kObject) 
    {
        String kName = kObject.getClass().getName();
        // 1st letter : "F"
        return kName.substring(1, kName.length())+"Command";
    }
}


