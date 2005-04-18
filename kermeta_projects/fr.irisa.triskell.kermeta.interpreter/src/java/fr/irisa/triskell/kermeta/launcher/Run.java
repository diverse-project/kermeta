/* $Id: Run.java,v 1.18 2005-04-18 09:08:40 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import junit.framework.TestCase;



/**
 * Launcher for Kermeta interpreter. It can be run from the command line or as a test case for JUnit.
 * @author zdrey, jpthibau, dvojtise
 *
 */
public class Run extends TestCase {
	
/*	public static ResourceSet resourceSet=null;

	public static MiniMofFactory miniMofFactory=null;
	public static MiniMofJavaDriverFactory javaDriverFactory=null;
	public static MiniMofEMFDriverFactory emfDriverFactory=null;*/
	public static RuntimeObjectFactory koFactory=null;
	public static Hashtable correspondanceTable=null; //for each kcore Object gives its RuntimeObject
	public static RuntimeObject metametaClass=null;
	public static RuntimeObject selfINSTANCE=null;
	public static RuntimeObject voidINSTANCE=null;
	public static RuntimeObject inINSTANCE=null;
	public static RuntimeObject outINSTANCE=null;
	public static Interpreter theInterpreter=null;	
	public static KermetaUnit interpreterbuilder=null;
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");


	public static void main(String[] args) {
		RuntimeObject interpreterInstance=null;
		RuntimeObject stdIOmetaClass=null;
		FClass stdioFClass=null;
		RuntimeObject stdioInstance=null;

		String mainClassValue=null;
		String mainOperationValue=null;
		String mainArgsValue=null;
		if (args.length < 1)
		    internalLog.error("Usage : run <modelName> <typeName> <operationName> <args...>");
		else {
			//prepare the kermetaObject factory and the metametaclass to allow kermeta metamodel traversing
			koFactory=new RuntimeObjectFactory();
			correspondanceTable=new Hashtable();
			String modelName=args[0];
			KermetaUnitFactory.getDefaultLoader().unloadAll();
/*			KermetaUnit metabuilder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("../fr.irisa.triskell.kermeta.framework/src/kermeta/kermeta.kmt");
			try {
			metabuilder.load();
			} catch(Exception e ) {if (metabuilder.getError().size() == 0) e.printStackTrace();};
			
			if (metabuilder.getError().size() > 0) {
				assertTrue(metabuilder.getMessagesAsString(), false);
			}
			else {
				System.out.println("model kermeta metamodel loaded successfully !");
				KMMetaBuilder metaClassesBuilder = new KMMetaBuilder();
				
				metaClassesBuilder.ppPackage(metabuilder);
/*				Iterator it=koFactory.getClassDefTable().keySet().iterator();
				while(it.hasNext())
					System.out.println(it.next());
				System.out.println("***> "+koFactory.getClassDefTable().keySet().size()+" "+koFactory);*/
				interpreterbuilder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("../fr.irisa.triskell.kermeta.interpreter/src/kermeta/interpreter.kmt");
				try {
					interpreterbuilder.load();
					} catch(Exception e ) {if (interpreterbuilder.getError().size() == 0) e.printStackTrace();};
					
					if (interpreterbuilder.getError().size() > 0) {
						assertTrue(interpreterbuilder.getMessagesAsString(), false);
					}
					else {
					    internalLog.info("model for the interpreter loaded successfully !");
						FClassDefinition classdef=(FClassDefinition)interpreterbuilder.getTypeDefinitionByName("kermeta::reflection::Class");
						koFactory.setClassClass(classdef);
						metametaClass=koFactory.getClassClass();
						selfINSTANCE=new RuntimeObject("The self instance");
						voidINSTANCE=new RuntimeObject("The void instance");
						theInterpreter=new Interpreter(koFactory,metametaClass);
						KMMetaBuilder metaClassesBuilder = new KMMetaBuilder(interpreterbuilder);
//						metaClassesBuilder.ppPackage(interpreterbuilder);
//						KMMetaBuilder.processParametricTypes();
						
						KMBuilderPass1 builderPass1 = new KMBuilderPass1();
						builderPass1.ppPackage(interpreterbuilder);
						/* create the stdio default variable and push it in the interpreter context
						 * to ensure any program may use stdio.print(...) and stdio.read("prompt>")
						 */
						RuntimeObject interpretermetaClass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::interpreter::Interpreter");
						interpreterInstance=Run.koFactory.createRuntimeObject(interpretermetaClass);
						stdIOmetaClass=(RuntimeObject)Run.koFactory.getClassDefTable().get("kermeta::utils::StdIO");
						stdioInstance=Run.koFactory.createRuntimeObject(stdIOmetaClass);
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
			else {
				System.out.println("model "+modelName+" loaded successfully !");
				
				KMBuilderPass1 classesBuilderPass1 = new KMBuilderPass1();			
				classesBuilderPass1.ppPackage(builder);
				FPackage rootPackage=builder.rootPackage;
				if (rootPackage.getFTag() !=null) {
					Iterator tagsIt=rootPackage.getFTag().iterator();
					while(tagsIt.hasNext()) {
						FTag tag=(FTag)tagsIt.next();
						if (tag.getFName().equals("mainClass"))
							mainClassValue=tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
						if (tag.getFName().equals("mainOperation"))
							mainOperationValue=tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
						if (tag.getFName().equals("mainArgs"))
							mainArgsValue=tag.getFValue().substring(1,tag.getFValue().length()-1); //remove the " to memorize value
					}
				}
				if (mainClassValue==null)
					if (args.length>1)
						mainClassValue=args[1];
					else internalLog.error("You should provide a mainClass argument to launch this program !");
				if (mainOperationValue==null)
					if (args.length>2)
					mainOperationValue=args[2];
					else internalLog.error("You should provide a mainOperation argument to launch this program !");
/*				KMBuilderPass2 classesBuilderPass2 = new KMBuilderPass2();			
				classesBuilderPass2.ppPackage(builder);*/
		}
		/*
		 * Context setup
		 */
		//TODO ?
		/* 
		 * mainClass : class where the first operation to call is registered
		 */ 
		RuntimeObject mainClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(mainClassValue);
		RuntimeObject mainClassInstance=Run.koFactory.createRuntimeObject(mainClass);
		FClassDefinition mainClassDef=((FClass)mainClass.getData().get("kcoreObject")).getFClassDefinition();
		Iterator it=mainClassDef.getFOwnedOperation().iterator();
		boolean found=false;
		while (it.hasNext() && !found) {
			FOperation mainOp=(FOperation)it.next();
			if (mainOp.getFName().equals(mainOperationValue)) {
				found=true;
				ArrayList arguments=new ArrayList();
				if (mainArgsValue!=null || args.length>3) {//set a collection of arguments for the operation
				    internalLog.error("Arguments to main operation : TODO adapt args to operation parameters types.");
					//TODO manage the arguments conversion to kermeta ty^pes of parameters
					//assume the first parameter of mainOp is a ref(0,*) StringLiteral
					for (int i=3;i<args.length;i++) {
						RuntimeObject arg=fr.irisa.triskell.kermeta.runtime.basetypes.String.create(args[i],koFactory);
						arguments.add(arg);
					}
				}
				try{
				    System.err.println("\nSTARTING INTERPRETATION OF MAIN OPERATION...");
					System.err.println("############################################");
					long elapsedTime=System.currentTimeMillis();
					BaseInterpreter baseInterpreter=new BaseInterpreter(new InterpreterContext(),builder);
					baseInterpreter.getInterpreterContext().pushNewCallFrame(interpreterInstance);
					baseInterpreter.getInterpreterContext().getCurrentFrame().pushNewExpressionContext(null);
					baseInterpreter.getInterpreterContext().getCurrentFrame().getCurrentExpressionContext().defineVariable(
				            (FType)stdioFClass, "stdio", stdioInstance);
					Object result=baseInterpreter.invoke(mainClassInstance,mainOp,arguments);
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
		}
	}
}

