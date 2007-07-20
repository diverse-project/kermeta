/* $Id: KermetaRaisedException.java,v 1.16 2007-07-20 15:07:48 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : KermetaRaisedException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;


import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;

/**
 * @author Franck Fleurey
 */
@SuppressWarnings("serial")
public class KermetaRaisedException extends Error {

    public RuntimeObject raised_object;
    // The trace handler
    protected Traceback traceback;
    
    protected String contextString="";
    
    protected ExpressionInterpreter interpreter;
    
    /**
     * Constructor 
     * Developer should then use the setContext method on this object in order to fill the readable stack trace
     * If possible, developer should use the other constructor, othewise he should try to build the context later
     */
    public KermetaRaisedException(RuntimeObject raised_object, ExpressionInterpreter theInterpreter)
    {
        super("kermeta exception : " + raised_object );
        interpreter = theInterpreter;
        
        this.raised_object = raised_object;
    }
  
    /**
     * Constructor 
     * keeps an existing java exception as a cause
     * Developer should then use the setContext method on this object in order to fill the readable stack trace
     */
    public KermetaRaisedException(RuntimeObject raised_object, ExpressionInterpreter theInterpreter, Throwable t)
    {
        super("kermeta exception : " + raised_object, t );
        interpreter = theInterpreter;
        
        this.raised_object = raised_object;
    }
    
    /**
     * 
     * @param raised_object
     * @param cause_object the FExpression where the error occured
     */
    public KermetaRaisedException(RuntimeObject raised_object, RuntimeObject cause_object, ExpressionInterpreter theInterpreter) {
        super("kermeta exception : " + raised_object);
        contextString = computeContextString(theInterpreter, cause_object);
        setCauseExpression(theInterpreter, raised_object, cause_object);
        this.raised_object = raised_object;

        interpreter = theInterpreter;        
    }
    
    /**
     * changes the way the exception is printed:
     *  adds the message from the kermeta object
     *  adds the stack trace (context)
     */
    public String toString(){
    	String result = super.toString();
    	// display the atributes of the raise object
    	fr.irisa.triskell.kermeta.language.structure.Class t_target=(fr.irisa.triskell.kermeta.language.structure.Class)raised_object.getMetaclass().getData().get("kcoreObject");        	    	
    	
    	SimpleType target = new SimpleType(t_target);
    	// Since any object can be raised as an exception, its not reasonable to expect a property called message
    	// toString exists on all objects!
    	// If the target type is Exception, than there exists a property named message
	    CallableProperty cproperty = target.getPropertyByName("message");
	    
	    
	    if (cproperty != null) // it may be null if we throw object that doesn't inherit from kermeta::exceptions::Exception
	    {
	    	RuntimeObject ro_property = interpreter.memory.getRuntimeObjectForFObject(cproperty.getProperty());
	    	RuntimeObject rovalue =fr.irisa.triskell.kermeta.runtime.language.Object.get(raised_object, ro_property);    			    
	    	String message = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(rovalue);
	    	if(message.compareTo("") != 0)
	    		result += "\n" + message;
	    }
	    else // by default, we will print the toString representation of the raised object
	    {
		    CallableOperation coperation = target.getOperationByName("toString");
	    	RuntimeObject rovalue = (RuntimeObject) interpreter.invoke(raised_object, coperation.getOperation(), new ArrayList());
	    	result += fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(rovalue);
	    }
    	if(issetContextString())
    		result += "\n" + contextString;
        else {
        	result += "\n Kermeta stack context not available";
        }
    	if ( this.getCause() != null)
    	{
    		result += "\nUnderlying java exception cause : " + this.getCause().getMessage();
    	}
    	return result;
    }
    
    /**
     * checks if the context string has been set
     * @return
     */
    public boolean issetContextString()
    {
    	return contextString.compareTo("") != 0;
    }
    
    /**
     * sets the context string (the kermeta stack trace)
     * @param interpreter
     * @param cause_object
     */
    public void setContextString(ExpressionInterpreter interpreter, RuntimeObject cause_object)
    {
    	contextString=computeContextString(interpreter, cause_object);
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
        fr.irisa.triskell.kermeta.language.structure.Class fc = (fr.irisa.triskell.kermeta.language.structure.Class)raised_object.getMetaclass().getData().get("kcoreObject");
        ClassDefinition exception_cd = (ClassDefinition)memory.getUnit().getTypeDefinitionByName("kermeta::exceptions::RuntimeError");
        // Is the raised_object an kermeta::exceptions::RuntimeError?
        if (cause_object!=null && ClassDefinitionHelper.isSuperClassOf(exception_cd, (ClassDefinition) fc.getTypeDefinition()))
        {
            Property fexp_prop = ClassDefinitionHelper.findPropertyByName((ClassDefinition) fc.getTypeDefinition(), "expression");
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
    protected static String computeContextString(ExpressionInterpreter interpreter, RuntimeObject cause_object)
    {
        String context = "";
        fr.irisa.triskell.kermeta.language.structure.Object fobject = null;
        if(cause_object != null) {
	        if (cause_object.getData().containsKey("kcoreObject"))
	        {
	        	fobject = (fr.irisa.triskell.kermeta.language.structure.Object)cause_object.getData().get("kcoreObject");
		        context = new Traceback(interpreter, fobject).getStackTrace();
	        }
	        else
	        {
	            System.err.println("RuntimeObject with no kcore object : " + cause_object);
	            context += "Context not available : (internal RuntimeObject with no kcore object : " + cause_object +")";
	        }
	        
        }
        else {
        	context += "Context not available : cause_object is null";
        }
        // kcoreObject can be null!
        return context;
    }

    /**
     * Helper method that create an exception for Kermeta 
     * @param kermetaExceptionName name of the created exception
     * @param exceptionMessage message associated to the exception
     * @param interpreter
     * @param memory
     * @param javaCause 
     * @return
     */
    public static KermetaRaisedException createKermetaException(
    		String kermetaExceptionName,
    		String exceptionMessage,
    		ExpressionInterpreter interpreter, 
			RuntimeMemory memory,
			Throwable javaCause)
    {
    	if (exceptionMessage == null) exceptionMessage = "<no message>";
    	
    	RuntimeObjectFactory rofactory = memory.getROFactory();
    	
    	RuntimeObject raised_object = rofactory.createObjectFromClassName(kermetaExceptionName);
    	
    	// adds some info on this exception (in the message attribute of the exception)
    	
    	fr.irisa.triskell.kermeta.language.structure.Class t_target=(fr.irisa.triskell.kermeta.language.structure.Class)raised_object.getMetaclass().getData().get("kcoreObject");        	
    	SimpleType target = new SimpleType(t_target);
	    CallableProperty cproperty = target.getPropertyByName("message");
	    RuntimeObject ro_property = memory.getRuntimeObjectForFObject(cproperty.getProperty());
	    RuntimeObject rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(exceptionMessage, rofactory);
         
    	fr.irisa.triskell.kermeta.runtime.language.Object.set(raised_object, ro_property, rovalue);

    	return new KermetaRaisedException( raised_object, 
				interpreter,
				javaCause);
    }
    /**
     * Helper method that create an exception for Kermeta 
     * @param kermetaExceptionName name of the created exception
     * @param exceptionMessage message associated to the exception
     * @param interpreter
     * @param memory
     * @param context  used for building the stacktrace
     * @param javaCause 
     * @return
     */
    public static KermetaRaisedException createKermetaException(
    		String kermetaExceptionName,
    		String exceptionMessage,
    		ExpressionInterpreter interpreter, 
			RuntimeMemory memory,
			fr.irisa.triskell.kermeta.language.structure.Object context,
			Throwable javaCause)
    {
    	KermetaRaisedException e = createKermetaException(kermetaExceptionName,
    			exceptionMessage,
    			interpreter, 
    			memory, 
    			javaCause);
    	e.setContextString(interpreter, memory.getRuntimeObjectForFObject(context));
    	return e;
    }
    
    
}
