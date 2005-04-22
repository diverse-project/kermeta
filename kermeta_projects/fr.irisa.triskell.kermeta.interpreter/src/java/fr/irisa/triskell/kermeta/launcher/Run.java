/* $Id: Run.java,v 1.20 2005-04-22 16:38:35 zdrey Exp $
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
 */
package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.builder.KMBuilderPass1;
import fr.irisa.triskell.kermeta.builder.KMBuilderPass2;
import fr.irisa.triskell.kermeta.builder.KMMetaBuilder;
import fr.irisa.triskell.kermeta.error.KermetaError;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.interpreter.BaseInterpreter;
import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import junit.framework.TestCase;



/**
 * Launcher for Kermeta interpreter. 
 * It can be run from the command line or as a test case for JUnit.
 */
public class Run extends TestCase {
	
    /**
     * The runtime object factory used to create RuntimeObjects
     * */
	public static RuntimeObjectFactory koFactory=null;
	/**
	 * The correspondance table from where we get IntegerLiterals, 
	 * StringLiterals, and RealLiterals.
	 * - key type is FObject
	 * - value type is corresponding RuntimeObject
	 */
	public static Hashtable correspondanceTable=null;
	/** metametaClass : is the class  "Class"*/
	public static RuntimeObject metametaClass=null;
	/** self, void, in, out are singletons */
	public static RuntimeObject selfINSTANCE=null;
	public static RuntimeObject voidINSTANCE=null;
	public static RuntimeObject stdioINSTANCE=null;
	/** the RuntimeObject of the Interpreter */
	public static Interpreter theInterpreter=null;
	/** The kermeta unit of the interpreter.kmt file */
	public static KermetaUnit interpreterbuilder=null;
	/** The runtime object corresponding to the instance of the Interpreter */
	public static RuntimeObject interpreterInstance=null;
	/** Logger to get the error of this launcher */
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");

	/** The FClass of stdio singleton - TODO : move it somewhere else? */
	public static FClass stdioFClass = null;

	/*
	 * 
	 * M A I N 
	 * 
	 */
	
	public static void main(String[] args) {
	    
	    // Init
		RuntimeObject stdIOmetaClass=null;
		
		String mainClassValue=null;
		String mainOperationValue=null;
		String mainArgsValue=null;
		boolean isTestOperation=false; 
		
		
		if (args.length < 1)
		    internalLog.error("Usage : run <modelName> <typeName> <operationName> <args...>");
		else {
		    
			// Prepare the kermetaObject factory and the metametaclass to allow 
		    // kermeta metamodel traversing
			koFactory = new RuntimeObjectFactory();
			correspondanceTable = new Hashtable();
			String modelName = args[0];
			KermetaUnitFactory.getDefaultLoader().unloadAll();
			
			// Load the KermetaUnit for interpreter.kmt
			interpreterbuilder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(
			        "../fr.irisa.triskell.kermeta.interpreter/src/kermeta/interpreter.kmt");
			
			try {
			    interpreterbuilder.load();
			} catch(Exception e ) {if (interpreterbuilder.getError().size() == 0) e.printStackTrace();};
			
			
			// Get and check the errors of loading
			if (interpreterbuilder.getError().size() > 0)
			{
			    assertTrue(interpreterbuilder.getMessagesAsString(), false);
			}
			else
			{
			    internalLog.info("model for the interpreter loaded successfully !");
			    
			    // Set the class Class
			    FClassDefinition classdef=(FClassDefinition)interpreterbuilder.getTypeDefinitionByName("kermeta::reflection::Class");
			    koFactory.setClassClass(classdef);
			    metametaClass=koFactory.getClassClass();
			    
			    
			    // Define the RuntimeObject of the interpreter itself
			    // And initialize all the static attributes of this class
			    theInterpreter=new Interpreter(koFactory,metametaClass);
			    
			    KMMetaBuilder metaClassesBuilder = new KMMetaBuilder(interpreterbuilder);
			    //						metaClassesBuilder.ppPackage(interpreterbuilder);
			    //						KMMetaBuilder.processParametricTypes();
			    
			    // Create the void Instance (should be a singleton)
			    RuntimeObject roVoidType = (RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::reflection::VoidType");
			    voidINSTANCE=Run.koFactory.createRuntimeObject(roVoidType);
			    
			    // Create the self Instance (should be a singleton)
			    RuntimeObject roSelfType = (RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::reflection::SelfType");
			    selfINSTANCE=Run.koFactory.createRuntimeObject(roSelfType);
			    
			    KMBuilderPass1 builderPass1 = new KMBuilderPass1();
			    builderPass1.ppPackage(interpreterbuilder);
			    // Create the stdio default variable and push it in the interpreter context
			    // to ensure any program may use stdio.print(...) and stdio.read("prompt>")
			    RuntimeObject interpretermetaClass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::interpreter::Interpreter");
			    interpreterInstance=Run.koFactory.createRuntimeObject(interpretermetaClass);
			    stdIOmetaClass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::io::StdIO");
			    
			    stdioINSTANCE=Run.koFactory.createRuntimeObject(stdIOmetaClass);
			    stdioFClass=interpreterbuilder.struct_factory.createFClass();
			    stdioFClass.setFClassDefinition(((FClass)stdIOmetaClass.getData().get("kcoreObject")).getFClassDefinition());
			    
			    /*						KMBuilderPass2 builderPass2 = new KMBuilderPass2();
			     builderPass2.ppPackage(interpreterbuilder);*/
			}
			
			// Do not write again the package declaration..
			KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(modelName);
			try {
			    builder.load();
			} catch(Exception e ) {if (builder.getError().size() == 0) e.printStackTrace();};
			
			if (builder.getError().size() > 0) {
			    assertTrue(builder.getMessagesAsString(), false);
			}
			else
			{
			    internalLog.info("model "+modelName+" loaded successfully !");
			    
			    KMBuilderPass1 classesBuilderPass1 = new KMBuilderPass1();			
			    classesBuilderPass1.ppPackage(builder);
			    FPackage rootPackage=builder.rootPackage;
			    if (rootPackage.getFTag() !=null) {
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
			 
			// Is there a "testOperation" tag?
			if (isTestOperation==true)
			{
			    runTestSuite(
			            mainClassValue,
			            builder,
			            args
			    );
			}
			else
			    // Otherwise : let's execute the mainClass.mainOperation
			    runMainOperation(
			       mainClassValue, mainOperationValue, mainArgsValue, builder,
			       args);

		}
	}

	
	/**
	 * Run a test suite : all operations that begin by "test" inside the class
	 * specified by mainClassValue are executed
	 * TODO (bis but important) : create a test suite handler, but in Kermeta!! 
	 * @param mainClassValue
	 * @param builder
	 * @param stdioFClass
	 * @param args
	 */
	public static void runTestSuite(
	        String mainClassValue, 
	        KermetaUnit builder,
	        String[] args)
	{
	    // Create the RuntimeObject of main class, of its instance, and 
	    // its FClassDefinition so that we can get its operations in order to run them
	    RuntimeObject roMainClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(mainClassValue);
	    RuntimeObject roMainClassInstance=Run.koFactory.createRuntimeObject(roMainClass);
	    FClassDefinition mainClassDef=((FClass)roMainClass.getData().get("kcoreObject")).getFClassDefinition();
	    Iterator it=mainClassDef.getFOwnedOperation().iterator();
	    
	    // Get each operation which name begins by "test",
	    // and run it.
	    while (it.hasNext())
	    {
//	      We can now launch the operation found in mainOperation through the BaseInterpreter
	        FOperation mainOp = (FOperation)it.next();
	        if (mainOp.getFName().startsWith("test"))
	        {
	        // TODO : throw an exception if FOperation contains params.
	        // But this should be tested inside the Kermeta library!
	            runOperation(builder, roMainClassInstance, mainOp, new ArrayList());
	        }   
	    }
	}
	
	
	/**
	 * TODO : move testMainOperation in a special class, like "TestHandler"
	 * This method is used for a kermeta program when it does not contain the tag "testOperation".
	 * But when the tag "testOperation" is defined, it means that we have to execute all the operation prefixed by <code>test</code>.
	 * Otherwise, there should be a "mainOperation" to launch (which name is defined in the <code>mainOperation</code> tag
	 * @param mainClassValue the value of the mainClass tag
	 * @param mainOperationValue the value of the operation to run (used in special cases,
	 * and when the tag "testOperation" does not exist)
	 * @param mainArgsValue the value of the arguments list in the mainArgsValue tag (optional tag)
	 * @param builder The kermetaUnit for the main Kermeta program (usually, a kmt file)
	 * @param args The arguments given in the main java call
	 */
	public static void runMainOperation(
	        String mainClassValue, 
	        String mainOperationValue, 
	        String mainArgsValue,
	        KermetaUnit builder,
	        String[] args)
	{
	    RuntimeObject roMainClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(mainClassValue);
	    RuntimeObject roMainClassInstance=Run.koFactory.createRuntimeObject(roMainClass);
	    FClassDefinition mainClassDef=((FClass)roMainClass.getData().get("kcoreObject")).getFClassDefinition();
	    Iterator it=mainClassDef.getFOwnedOperation().iterator();
	    boolean found=false;
	    
	    // Parse the list of operations in mainClass, until we find the operation
	    while (it.hasNext() && !found)
	    {
	        FOperation mainOp=(FOperation)it.next();
	        // Have we find the operation?
	        if (mainOp.getFName().equals(mainOperationValue))
	        {
	            found=true;
	            ArrayList arguments=new ArrayList();
	            if (mainArgsValue!=null || args.length>3)
	            {//set a collection of arguments for the operation
	                internalLog.error("Arguments to main operation : TODO adapt args to operation parameters types.");
	                //TODO manage the arguments conversion to kermeta types of parameters
	                //assume the first parameter of mainOp is a ref(0,*) StringLiteral
	                for (int i=3;i<args.length;i++) {
	                    RuntimeObject arg=fr.irisa.triskell.kermeta.runtime.basetypes.String.create(args[i],koFactory);
	                    arguments.add(arg);
	                }
	            }
	            // We can now launch the operation found in mainOperation through the BaseInterpreter
	            runOperation(builder, roMainClassInstance, mainOp, arguments);
	            
	        }
	    }
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
	public static void runOperation(
	        KermetaUnit builder, 
	        RuntimeObject roMainClassInstance,
	        FOperation mainOp,
	        ArrayList arguments)
	{
	    try
	    {
	        System.err.println("\nSTARTING INTERPRETATION OF OPERATION <"+mainOp.getFName()+">");
	        
	        long elapsedTime=System.currentTimeMillis();
	        BaseInterpreter baseInterpreter=new BaseInterpreter(new InterpreterContext(),builder);
	        baseInterpreter.getInterpreterContext().pushNewCallFrame(interpreterInstance);
	        baseInterpreter.getInterpreterContext().getCurrentFrame().pushNewExpressionContext(null);
	        baseInterpreter.getInterpreterContext().getCurrentFrame().getCurrentExpressionContext().defineVariable(
	                (FType)stdioFClass, "stdio", stdioINSTANCE);
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
}
