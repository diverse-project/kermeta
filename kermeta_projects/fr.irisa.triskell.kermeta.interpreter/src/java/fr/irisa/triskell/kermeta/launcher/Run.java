package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.builder.KMBuilderPass1;
import fr.irisa.triskell.kermeta.builder.KMBuilderPass2;
import fr.irisa.triskell.kermeta.builder.KMMetaBuilder;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import junit.framework.TestCase;



public class Run extends TestCase {
	
/*	public static ResourceSet resourceSet=null;

	public static MiniMofFactory miniMofFactory=null;
	public static MiniMofJavaDriverFactory javaDriverFactory=null;
	public static MiniMofEMFDriverFactory emfDriverFactory=null;*/
	public static RuntimeObjectFactory koFactory=null;
	public static RuntimeObject metametaClass=null;
	public static RuntimeObject selfINSTANCE=null;
	public static RuntimeObject voidINSTANCE=null;
	public static Interpreter theInterpreter=null;

	public static void main(String[] args) {
		if (args.length < 3)
			System.err.println("Usage : run <modelName> <typeName> <operationName> <args...>");
		else {
			//prepare the kermetaObject factory and the metametaclass to allow kermeta metamodel traversing
			koFactory=new RuntimeObjectFactory();
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
				KermetaUnit interpreterbuilder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("../fr.irisa.triskell.kermeta.interpreter/src/kermeta/interpreter.kmt");
				try {
					interpreterbuilder.load();
					} catch(Exception e ) {if (interpreterbuilder.getError().size() == 0) e.printStackTrace();};
					
					if (interpreterbuilder.getError().size() > 0) {
						assertTrue(interpreterbuilder.getMessagesAsString(), false);
					}
					else {
						System.out.println("model for the interpreter loaded successfully !");
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
/*				KMBuilderPass2 classesBuilderPass2 = new KMBuilderPass2();			
				classesBuilderPass2.ppPackage(builder);*/
		}
	}
		/*
		 * Context setup
		 */
		//TODO ?
		/* 
		 * mainClass : class where the first operation to call is registered
		 */ 
		RuntimeObject mainClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(args[1]);
		RuntimeObject mainClassInstance=Run.koFactory.createRuntimeObject(mainClass);
		FClassDefinition mainClassDef=(FClassDefinition)mainClass.getData().get("kcoreObject");
		Iterator it=mainClassDef.getFOwnedOperation().iterator();
		boolean found=false;
		while (it.hasNext() && !found) {
			FOperation mainOp=(FOperation)it.next();
			if (mainOp.getFName().equals(args[2])) {
				found=true;
				List arguments=new ArrayList();
				if (args.length>3) {//set a collection of arguments for the operation
					//assume the first parameter of mainOp is a ref(0,*) StringLiteral
					for (int i=3;i<args.length;i++) {
						RuntimeObject arg=fr.irisa.triskell.kermeta.runtime.basetypes.String.create(args[i],koFactory);
						arguments.add(arg);
					}
				}
				System.err.println("\nSTARTING INTERPRETATION OF MAIN OPERATION...");
				System.err.println("############################################");
			}
		}
	}
}

