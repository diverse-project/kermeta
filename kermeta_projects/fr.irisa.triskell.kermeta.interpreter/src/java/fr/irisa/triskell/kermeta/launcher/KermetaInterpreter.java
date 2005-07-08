/* $Id: KermetaInterpreter.java,v 1.11 2005-07-08 12:21:50 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : Run.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		zdrey 		<zdrey@irisa.fr>
 * 		jpthibau	<jpthibau@irisa.fr>
 * 		dvojtise	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 * 		- refactored and renamed KermetaInterpreter
 * 		- interpreterInstance has become a static attribute of Run 
 * 		- splitted main method in smaller ones
 * TODO : remove the static attributes
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;



/**
 * Base for launcher of Kermeta interpreter. 
 * This is the basis for more complex launcher like CommandLine Launcher or Junit Launcher.
 */
public class KermetaInterpreter {
	
	/** Logger to get the error of this interpreter */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");
	
	// The entry class
	private FClass entryClass;
	// The entry Operation
	private FOperation entryOperation;
	// The parameters as a list of RuntimeObjects
	private ArrayList entryParameters;
	
	// The kermeta unit
	private KermetaUnit unit=null;
	
	// The memory of the interpreter
	RuntimeMemory memory;
	
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
	 * Constructor for a kermeta unit
	 * @param unit
	 */
	public KermetaInterpreter(String uri_unit)
	{
	    super();
	    KermetaUnitFactory.getDefaultLoader().unloadAll();
	    unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri_unit);        
	    try {
	        unit.load();
	    } catch(Throwable t) {
	        String message ="INTERPRETER INITIALIZATION ERROR : The program "+uri_unit+ " could not be loaded";
	        internalLog.error(message, t);
	        throw new Error(message, t);
	    }
	    if (unit.getAllErrors().size() > 0)
	    {
	        throw new KermetaInterpreterError(unit.getAllMessagesAsString());
	    
	    }
	    unit.typeCheck(null);
	    if (unit.getAllErrors().size() > 0)
	    {
	        throw new KermetaInterpreterError(unit.getAllMessagesAsString());
	    
	    }
	    initializeMemory();
	    initializeEntryPoint();
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
	    if (unit.getAllErrors().size() > 0) {
	        String message = "INTERPRETER INITIALIZATION ERROR : The program contains errors:\n" + unit.getAllMessagesAsString();
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
	    Iterator it = unit.rootPackage.getFTag().iterator();
	    while (it.hasNext()) {
	        FTag tag = (FTag)it.next();
	        if (tag.getFName().equals("mainClass")) 
	            main_class = tag.getFValue(); //remove the " to memorize value
	        if (tag.getFName().equals("mainOperation"))
	            main_operation = tag.getFValue(); //remove the " to memorize value
	    }
	    if (main_class != null && main_operation != null)
	        setEntryPoint(main_class, main_operation);
	}
	
	/**
	 * Set the entry point.
	 * @param class_def_qname the name of the class that contain the operation to execute
	 * @param operation_name the operation to execute
	 */
	public void setEntryPoint(String class_def_qname, String operation_name) throws KermetaInterpreterError {
	    // get the type definition
	    FTypeDefinition td = unit.typeDefinitionLookup(class_def_qname);
	    CallableOperation co = null;
	    String emessage = "";
	    // check that it exists and that it is a class
	    if (td == null || !(td instanceof FClassDefinition)) {
	        emessage = "Entry type '" + class_def_qname + "' not found or not valid";
	        internalLog.error(emessage);	        
	    }
	    // FIXME: to allow parametric types as entry types
	    else if (((FClassDefinition)td).getFTypeParameter().size() != 0) {
	        emessage = "Invalid entry type '" + class_def_qname + "', it has type parameters.";
	        internalLog.error(emessage);
	    }
	    
	    else if (emessage.equals(""))
	    {	// set entryClass
	        entryClass = InheritanceSearch.getFClassForClassDefinition((FClassDefinition)td);
	        // Search the operation
	        co = new SimpleType(entryClass).getOperationByName(operation_name);
	    
	    
	        if (co == null) 
	        {
	            emessage = "Cannot find entry operation '" + 
	        	operation_name + "' in type '" + class_def_qname+"'";
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
	}
	
	/**
	 * Set the actual parameter for the "main" method
	 * @param actual_parameters
	 */
	public void setEntryParameters(ArrayList actual_parameters) {
	    entryParameters = actual_parameters;
	}
	
	/**
	 * Create the entry object and launch the interpreter
	 */
	public void launch() {
	    // Create the expression interpreter
	    ExpressionInterpreter exp_interpreter = new ExpressionInterpreter(memory);
	    // Instanciate the first object
	    // FIXME : this should be corrected to allow generic types as entre type
	    RuntimeObject entryObject = memory.getROFactory().createObjectFromClassDefinition(memory.getRuntimeObjectForFObject(entryClass.getFClassDefinition()));
	    // Execute the operation
	    exp_interpreter.invoke(entryObject, entryOperation, entryParameters);
	}
    
	
	public FClass getEntryClass() {
        return entryClass;
    }
    public FOperation getEntryOperation() {
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
