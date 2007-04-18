/* $Id: KermetaInterpreter.java,v 1.25 2007-04-18 15:22:39 ffleurey Exp $
 * Project : Kermeta.interpreter
 * File : Run.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		jpthibau	<jpthibau@irisa.fr>
 * 		dvojtise	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 * 		- refactored and renamed KermetaInterpreter
 * 		- interpreterInstance has become a static attribute of Run 
 * 		- splitted main method in smaller ones
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.ConstraintInterpreter;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.traceability.helper.Tracer;



/**
 * Base for launcher of Kermeta interpreter. 
 * This is the basis for more complex launcher like CommandLine Launcher or Junit Launcher.
 */
public class KermetaInterpreter {
	
	/** Logger to get the error of this interpreter */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");
	
	// The entry class
	private fr.irisa.triskell.kermeta.language.structure.Class entryClass;
	// The entry Operation
	private Operation entryOperation;
	// The parameters as a list of RuntimeObjects
	private ArrayList<RuntimeObject> entryParameters;
	
	// The kermeta unit
	private KermetaUnit unit=null;
	
	// The memory of the interpreter
	RuntimeMemory memory;
	
	/** If true, the launch will be preceded by a call to setUp, and followed by tearDown operationnif they exist */
	public boolean isTestSuite = false;
	
	/**
	 * Constructor for a kermeta unit
	 * @param unit
	 */
	public KermetaInterpreter(KermetaUnit unit)
	{
	    super();
	    this.unit = unit;
	    initializeMemory();
	    initializeEntryPoint();
	}

	/**
	 * Constructor for a kermeta unit, for debug mode
	 * @param unit
	 */
	public KermetaInterpreter(String uri_unit, Tracer tracer)
	{
	    super();
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();
	    unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri_unit);
	    //	  we need to set the tracer before loading the unit ;P
	    if (tracer!= null) unit.setTracer(tracer);
	    try {
	        unit.load();
	    } catch(Throwable t) {
	        String message ="INTERPRETER INITIALIZATION ERROR : The program "+uri_unit+ " could not be loaded";
	        internalLog.error(message, t);
	        throw new Error(message, t);
	    }
	    if (unit.messages.hasError())
	    {
	        throw new KermetaInterpreterError(unit.messages.getAllMessagesAsString());
	    
	    }
	    unit.typeCheck(null);
	    if (unit.messages.hasError())
	    {
	        throw new KermetaInterpreterError(unit.messages.getAllMessagesAsString());
	    
	    }
	    
	    initializeMemory();
	    initializeEntryPoint();
	}
	
	/**
	 * Constructor for a kermeta unit
	 * @param unit
	 */
	public KermetaInterpreter(String uri_unit)
	{
		this(uri_unit, null); 
	}
	


	protected void finalize() throws Throwable {
        super.finalize();
        internalLog.debug("FINALIZE INTERPRETER ...");
        // clear as much ref as possible
        entryClass = null;
        entryOperation = null;
        entryParameters = null;
        unit = null;
        memory = null;
    }
	/**
	 * Check that the KermetaUnit does not contain errors
	 * and create initialize the runtime
	 */
	private void initializeMemory() {
	    //unit.typeCheck();
	    TypeCheckerContext.initializeTypeChecker(unit);
	    if (unit.messages.hasError()) {
	        String message = "INTERPRETER INITIALIZATION ERROR : The program contains errors:\n" + unit.messages.getAllMessagesAsString();
	        internalLog.error(message);
	        
	    }
	    memory = new RuntimeMemory(unit);
	    //RuntimeMemoryLoader.load(unit, memory);
	}
	
	/**
	 * Initialize the entypoint of the program according to
	 * tags on the root_package.
	 */
	private void initializeEntryPoint() 
	{
	    String main_class = null;
	    String main_operation = null;
	    Iterator it = unit.rootPackage.getTag().iterator();
	    while (it.hasNext()) {
	        Tag tag = (Tag)it.next();
	        if (tag.getName().equals("mainClass")) 
	            main_class = tag.getValue(); //remove the " to memorize value
	        if (tag.getName().equals("mainOperation"))
	            main_operation = tag.getValue(); //remove the " to memorize value
	    }
	    if (main_class != null && main_operation != null)
	    {
	    	try 
	    	{
	    		setEntryPoint(main_class, main_operation);
	    	}
	    	catch (KermetaInterpreterError e)
	    	{
	    		unit.messages.
	    		addWarning(
	    				"class \"" + "main_class\"" +  
	    				"or operation \"" + main_operation + "\" given in @mainClass/@mainOperation tags does not seem to be valid;" +
	    				"(default launch will fail)", null);
	    	}
	    }
	}
	
	/**
	 * Set the entry point.
	 * @param class_def_qname the name of the class that contain the operation to execute
	 * @param operation_name the operation to execute
	 */
	public void setEntryPoint(String class_def_qname, String operation_name) throws KermetaInterpreterError {
	    // get the type definition
	    TypeDefinition td = unit.typeDefinitionLookup(class_def_qname);
	    CallableOperation co = null;
	    String emessage = "";
	    // check that it exists and that it is a class
	    if (td == null || !(td instanceof ClassDefinition)) {
	        emessage = "Entry @mainClass '" + class_def_qname + "' not found or not valid";
	        internalLog.error(emessage);	        
	    }
	    // FIXME: to allow parametric types as entry types
	    else if (((ClassDefinition)td).getTypeParameter().size() != 0) {
	        emessage = "Invalid entry @mainClass '" + class_def_qname + "', it has type parameters.";
	        internalLog.error(emessage);
	    }
	    
	    else if (emessage.equals(""))
	    {	// set entryClass
	        entryClass = InheritanceSearch.getFClassForClassDefinition((ClassDefinition)td);
	        // Search the operation
	        co = new SimpleType(entryClass).getOperationByName(operation_name);
	    
	    
	        if (co == null) 
	        {
	            emessage = "Cannot find entry @mainOperation '" + 
	        	operation_name + "' in @mainClass '" + class_def_qname+"'";
	        internalLog.error(emessage);
	        }
	    }
	    
	    if (!emessage.equals(""))  {
	        
	        throw new KermetaInterpreterError(emessage);
	    }
	    else  {    // set entryOperation
	        entryOperation = co.getOperation();
	    }
	}
	
	public void setKStream(KermetaIOStream stream)
	{
		memory.getROFactory().setKermetaIOStream(stream);
	    stream.setKermetaInterpreter(this);
	}
	
	public KermetaIOStream getKStream() { return memory.getROFactory().getKermetaIOStream();} 
	
	/**
	 * Set the actual parameter for the "main" method
	 * @param actual_parameters
	 */
	public void setEntryParameters(ArrayList<RuntimeObject> actual_parameters) {
	    entryParameters = actual_parameters;
	}
	
	/**
	 * Create the entry object and launch the interpreter
	 * plus, run eventual setUp and tearDown method if we this launch is a test
	 */
	public void launch() {
	    // Create the expression interpreter
		
		ExpressionInterpreter exp_interpreter = new ExpressionInterpreter(memory);
	    // FIXME : this should be corrected to allow generic types as entre type
	    RuntimeObject entryObject = memory.getROFactory().createObjectFromClassDefinition(memory.getRuntimeObjectForFObject(entryClass.getTypeDefinition()));
	    
	    if(isTestSuite) callOperation(exp_interpreter, entryObject, "setUp");
	    
	    // Execute the operation
	    exp_interpreter.invoke(entryObject, entryOperation, entryParameters);
	    
	    if(isTestSuite) callOperation(exp_interpreter, entryObject, "tearDown");	    
	}

	/** call the given operation 
	 * do nothing if the operation doesn't exist*/
	private void callOperation(ExpressionInterpreter exp_interpreter, RuntimeObject entryObject, String opName) {
		CallableOperation co = new SimpleType(entryClass).getOperationByName(opName); 
		if (co != null) {
			Operation setUpOp = co.getOperation();
			exp_interpreter.invoke(entryObject, setUpOp, null);
		}
	}
	
	/**
	 * Create the entry object and launch the interpreter with the verification of the pre and post conditions
	 */
	public void launchConstraint() {
	    // Create the expression interpreter
		
		System.err.println("launch_constraint");
		ExpressionInterpreter exp_interpreter = new ConstraintInterpreter(memory);// Instanciate the first object
	    // FIXME : this should be corrected to allow generic types as entre type
	    RuntimeObject entryObject = memory.getROFactory().createObjectFromClassDefinition(memory.getRuntimeObjectForFObject(entryClass.getTypeDefinition()));
	    // Execute the operation
	    exp_interpreter.invoke(entryObject, entryOperation, entryParameters);
	}
	
	public void launch_debug() {
	    // Create the expression interpreter
	    DebugInterpreter exp_interpreter = new DebugInterpreter(memory);
	    // Instanciate the first object
	    // FIXME : this should be corrected to allow generic types as entre type
	    RuntimeObject entryObject = memory.getROFactory().createObjectFromClassDefinition(memory.getRuntimeObjectForFObject(entryClass.getTypeDefinition()));
	    // Execute the operation
	    // exp_interpreter.invoke(entryObject, entryOperation, entryParameters);
	    exp_interpreter.initialize(entryObject, entryOperation, entryParameters);
	}
    
	
	public fr.irisa.triskell.kermeta.language.structure.Class getEntryClass() {
        return entryClass;
    }
    public Operation getEntryOperation() {
        return entryOperation;
    }
    public RuntimeMemory getMemory() {
        return memory;
    }
    public KermetaUnit getUnit() {
        return unit;
    }
    /**
     * release as much references as possible for garbage collector
     *
     */
    public void freeJavaMemory()
    {
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
	    unit = null;
	    memory.freeJavaMemory();
	    memory = null;
	    entryClass = null;
	    entryOperation = null;
	    entryParameters = null;
    }
}
