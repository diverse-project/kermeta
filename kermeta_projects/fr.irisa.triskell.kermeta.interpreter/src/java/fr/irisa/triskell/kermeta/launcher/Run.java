package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.builder.KMBuilder;
import fr.irisa.triskell.kermeta.builder.KMMetaBuilder;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.interpreter.Interpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.KMmetaClass;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;
import junit.framework.TestCase;



public class Run extends TestCase {
	
/*	public static ResourceSet resourceSet=null;

	public static MiniMofFactory miniMofFactory=null;
	public static MiniMofJavaDriverFactory javaDriverFactory=null;
	public static MiniMofEMFDriverFactory emfDriverFactory=null;*/
	public static KermetaObjectFactory koFactory=null;
	public static KMmetaClass metametaClass=null;
	public static Interpreter theInterpreter=null;

	public static void main(String[] args) {
		if (args.length < 3)
			System.err.println("Usage : run <modelName> <typeName> <operationName> <args...>");
		else {
			//prepare the kermetaObject factory and the metametaclass to allow kermeta metamodel traversing
			koFactory=new KermetaObjectFactory();
			metametaClass=new KMmetaClass(koFactory);
			theInterpreter=new Interpreter(koFactory,metametaClass);
			String modelName=args[0];
			KermetaUnitFactory.getDefaultLoader().unloadAll();
//			KermetaUnit metabuilder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("../fr.irisa.triskell.kermeta.framework/src/kermeta/language/behavior.kmt");
			KermetaUnit metabuilder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("../fr.irisa.triskell.kermeta.interpreter/src/kermeta/interpreter.kmt");
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
				KMBuilder classesBuilder = new KMBuilder();
				
				classesBuilder.ppPackage(builder);
			}
		}
			}
	}
/*		//EMF MiniMof package and factory setup
		MiniMofPackageImpl.init();
		miniMofFactory=MiniMofFactory.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("miniMof",new XMIResourceFactoryImpl());
		resourceSet=new ResourceSetImpl();
		/*
		 * Context creation and setup
		 */
/*		MiniURIExtent evalContext=miniMofFactory.createMiniURIExtent();
		//necessary visitors
		evalContext.setModelLoader(new ModelLoader());
		evalContext.setTypeResolver(new TypesResolver());
		//FOR DEBUG ONLY
		evalContext.setTypesBrowser(new TypesBrowser());
		evalContext.setInterpreter(new Interprter());
		//ModelLoader manage context initialization through accept call in initialize()
		evalContext.initialize(Run.class);
		//necessary METAminiMof and minimof factories
		evalContext.getRegisteredFactories().put("METAminiMof",miniMofFactory);
		MiniFactory miniMofModelsFactory=miniMofFactory.createMiniFactory();
		evalContext.getRegisteredFactories().put("miniMof",miniMofModelsFactory);
		/*
		 * process arguments model,class, method and build args list if necessary
		 */
/*		miniMofModelsFactory.loadModel(args[0],evalContext);
		//Replace unresolved elements with true cooresponding elements that point to real types
		evalContext.accept(evalContext.getTypeResolver(),null);
		//FOR DEBUG ONLY
/*		File outputFile = new File("temp/model.miniMof");
		URI outputFileURI = URI.createFileURI(outputFile.getAbsolutePath());
		Resource outResource = resourceSet.createResource(outputFileURI);
		outResource.getContents().add(evalContext);
		Iterator modelsIt=evalContext.getRegisteredModels().keySet().iterator();
		while (modelsIt.hasNext())
			outResource.getContents().add(evalContext.getRegisteredModels().get(modelsIt.next()));
		try {
			if (outResource != null) {
				outResource.save(Collections.EMPTY_MAP);
				System.out.println(" => model written for debug in temp/model.miniMof"); }
		} catch (IOException e) { e.printStackTrace(); } */
/*		evalContext.accept(evalContext.getTypesBrowser(),null);
		//END DEBUG ONLY
		MiniClass mainClass=(MiniClass)evalContext.getType("miniMof:"+args[0]+":"+args[1]);
		Iterator it=mainClass.getOperations().iterator();
		boolean found=false;
		while (it.hasNext() && !found) {
			MiniOperation mainOp=(MiniOperation)it.next();
			if (mainOp.getName().equals(args[2])) {
				found=true;
				Vector arguments=new Vector();
				if (args.length>3) {//set a collection of arguments for the operation
					//assume the first parameter of mainOp is a ref(0,*) StringLiteral
					for (int i=3;i<args.length;i++) {
						MiniStringLiteral arg=miniMofFactory.createMiniStringLiteral();
						arg.setValue(args[i]);
						arguments.add(arg);
					}
				}
				Interprter.installParametersAndLocalVariables(evalContext,mainOp,arguments,null);
				System.err.println("\nSTARTING INTERPRETATION OF MAIN OPERATION...");
				System.err.println("############################################");
				mainOp.accept(evalContext.getInterpreter(),evalContext);
			}
		}
	}
}*/
}
