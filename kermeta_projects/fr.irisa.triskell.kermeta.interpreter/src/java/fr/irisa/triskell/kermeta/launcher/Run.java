/* $Id: Run.java,v 1.26 2005-05-12 08:21:36 zdrey Exp $
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
 * 		- interpreterInstance has become a static attribute of Run 
 * 		- splitted main method in smaller ones
 * TODO : remove the static attributes
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.builder.KMBuilderPass1;
import fr.irisa.triskell.kermeta.builder.KMMetaBuilder;
import fr.irisa.triskell.kermeta.builder.RuntimeLoader;
import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaError;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.BaseInterpreter;
import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;



/**
 * Base for launcher of Kermeta interpreter. 
 * This is the basis for more complex launcher like CommandLine Launcher or Junit Launcher.
 */
public class Run {
	

	/** metametaClass : is the class  "Class"*/
	public static RuntimeObject metametaClass=null;
	
	/** The runtime object corresponding to the instance of the Interpreter */
	public RuntimeObject interpreterInstance;
	/** Logger to get the error of this launcher */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");


	protected String mainClassValue=null;
	protected String mainOperationValue=null;
	protected String mainArgsValue=null;
	protected boolean isTestOperation=false; 
	
	
	public KermetaUnit builder;
	public RuntimeLoader runtimeLoader;
	
	protected boolean isInterpreterInitialized=false;
	protected String[] args;
	
	public Run(String[] theargs)
	{
	    super();
	    // Init the loader. It also *initializes* the runtime memory of the execution process.
		runtimeLoader = new RuntimeLoader();
	    args = theargs;
	}
	
	
	
	
	/**
	 * Run the operation specified by <code>mainOp</code>, in class RuntimeObject
	 * representation (roMainClassInstance), and with the given arguments;
	 * builder is the KermetaUnit of the KermetaProgram containing the definition
	 * of this operation 
	 * @param builder the KermetaUnit of the Kermeta program being executed
	 * @param roMainClassInstance the RuntimeObject of the instance containing the <code>mainOp</code>
	 * @param mainOp the operation to be executed
	 * @param arguments the arguments of the operation <code>mainOp</code>
	 */
	public void runOperation(
	        KermetaUnit builder, 
	        RuntimeObject roMainClassInstance,
	        FOperation mainOp,
	        ArrayList arguments)
	{
	    if (!isInterpreterInitialized)
	    {
	        initializeInterpreter(args);
	    }
	    try
	    {
	        System.err.println("\nSTARTING INTERPRETATION OF OPERATION <"+mainOp.getFName()+">"+roMainClassInstance);
	        
	        
	        long elapsedTime=System.currentTimeMillis();
	        RuntimeMemory runtimeMemory = runtimeLoader.getRuntimeMemory();
	        BaseInterpreter baseInterpreter=new BaseInterpreter(new InterpreterContext(),builder, runtimeMemory);
	        baseInterpreter.getInterpreterContext().pushNewCallFrame(interpreterInstance, mainOp);
	        baseInterpreter.getInterpreterContext().getCurrentFrame().pushNewExpressionContext(null);
	        // FIXME : here, stdioFClass is null
	        baseInterpreter.getInterpreterContext().getCurrentFrame().getCurrentExpressionContext().defineVariable(
	                (FType)runtimeMemory.stdioFClass, "stdio", runtimeMemory.stdioINSTANCE);
	                //(FType)stdioFClass, "stdio", runtimeMemory.stdioINSTANCE);
	        Object result=baseInterpreter.invoke(roMainClassInstance,mainOp,arguments);
	        elapsedTime=System.currentTimeMillis()-elapsedTime;
	        long minutes=elapsedTime/60000;
	        long seconds=(elapsedTime - 60000*minutes)/1000;
	        long hundredth=(elapsedTime - 60000*minutes - 1000*seconds)/10;
	        System.out.println("RESULT : "+result+"; ElapsedTime : "+minutes+"mn "+seconds+"s "+hundredth+"'");
	    }
	    
	    catch (KermetaError e)
	    {
	        // log the problem on the error logger
	        internalLog.error(e);
	        for(int i = 0; i < e.getCause().getStackTrace().length; i++)
	        {
	            internalLog.error(e.getCause().getStackTrace()[i]);
	        }
	        // do not catch it, so the junit testsuite will be able to detect it.
	        throw e;
	    }
	}
	
	
	
	
	public void initializeInterpreter(String[] args)
	{
	   
	    if (args.length < 1){
		    internalLog.error("Usage : run <modelName> <typeName> <operationName> <args...>");
		    
		    throw new KermetaInterpreterError("Usage : run <modelName> <typeName> <operationName> <args...>");
		}
	    
		// Prepare the kermetaObject factory and the metametaclass to allow 
	    // kermeta metamodel traversing

		RuntimeObjectFactory roFactory = runtimeLoader.getRuntimeMemory().getROFactory(); 
		String modelName = args[0];
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		
		// Do not write again the package declaration..
		// We now load the Kermeta program itself (Kermeta program is the source code
		// that contains the classes that we want to execute)
		builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(modelName);
		try
		{
		    builder.load();
		}
		catch(Exception e ) 
		{
		    if (builder.getError().size() == 0) e.printStackTrace();
		}
		
		if (builder.getError().size() > 0) {
		    throw new KermetaInterpreterError(builder.getAllMessagesAsString());
		}
		else
		{
		    internalLog.info("Model of '"+modelName+"' loaded successfully !");

		    // Initialize the runtime memory
		    this.initializeRuntimeLoader(builder, runtimeLoader.getRuntimeMemory());
		    
		    // Load the runtime representation of the source file to execut
		    runtimeLoader.loadKermetaUnit(builder);

		    FPackage rootPackage=builder.rootPackage;
		    
		    // Get the tags used to execute an operation
		    if (rootPackage.getFTag() !=null) {
		        isTestOperation=false;
		        Iterator tagsIt=rootPackage.getFTag().iterator();
		        while(tagsIt.hasNext()) {
		            FTag tag=(FTag)tagsIt.next();
		            // is there a tag "testOperation" -- we don't care about its value!!
		            if (tag.getFName().equals("testOperation"))
		                isTestOperation=true;
		            if (tag.getFName().equals("mainClass"))
		                mainClassValue=tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
		            if (!isTestOperation && tag.getFName().equals("mainOperation"))
		                mainOperationValue=tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
		            if (!isTestOperation && tag.getFName().equals("mainArgs"))
		                mainArgsValue=tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
		        }
		    }
		    
		    if (mainClassValue==null)
		        if (args.length>1)
		            mainClassValue=args[1];
		        else internalLog.error("You should provide a mainClass argument to launch this program !");
		    if (mainOperationValue==null && !isTestOperation)
		        if (args.length>2)
		            mainOperationValue=args[2];
		        else internalLog.error(
		             "You should provide a mainOperation " +
		             "argument to launch this program, or add the tag 'testOperation'" +
		             "in your test !"
		        );
		    /*				KMBuilderPass2 classesBuilderPass2 = new KMBuilderPass2();			
		     classesBuilderPass2.ppPackage(builder);*/
		}
		isInterpreterInitialized = true;

	}

	/**
	 * - Construct the runtimeLoader
	 * - Check the 
	 */
	public void initializeRuntimeLoader(KermetaUnit unit, RuntimeMemory memory)
	{
	    
	    // Set the class Class
	    FClass fclass=unit.struct_factory.createFClass();
		fclass.setFClassDefinition(
		  (FClassDefinition)unit.getTypeDefinitionByName("kermeta::language::structure::Class"));
	    memory.getROFactory().setClassClassFromFClass(fclass);
	    
	    // Create the KMMetaBuilder. "Implicitly" builds the memory of the 
	    // interpreter execution by filling the classDefTable hashtable of the
	    // (for now static) RuntimeObjectFactory
	    runtimeLoader.loadClassDefinitions(unit);
	    
	    // Create the singletons Void, Self, Boolean, Stdio
        runtimeLoader.loadSingletonInstances(unit);
	    
	    // Construct the RuntimeObject representation of the source code
	    runtimeLoader.loadKermetaUnit(unit);
	    
	    // Create the stdio default variable and push it in the interpreter context
	    // to ensure any program may use stdio.print(...) and stdio.read("prompt>")
	    RuntimeObject interpretermetaClass=(RuntimeObject)memory.getROFactory().getClassDefTable().get("kermeta::interpreter::Interpreter");
	    interpreterInstance=memory.getROFactory().createRuntimeObject(interpretermetaClass);
	}
	
}
