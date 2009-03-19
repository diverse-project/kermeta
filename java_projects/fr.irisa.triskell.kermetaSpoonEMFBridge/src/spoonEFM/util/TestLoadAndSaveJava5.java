package spoonEFM.util;

import java.io.File;
import java.io.IOException;

import spoon.processing.Builder;
import spoon.processing.Environment;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtPackage;
import spoon.support.DefaultCoreFactory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;
import emf.spoon.factory.EMFFactory;


/**
 * @author Barais Olivier -- Projet Triskell IRISA
 */

public class TestLoadAndSaveJava5 {

	private Factory factory = null;
	

	protected void initSpoon(String outputSpoonFolder, String folderToParse, Factories f) {
		Environment env = new StandardEnvironment();
		env.setVerbose(true);

		
		//create launcher, we can choose spoon or emf-spoon launcher

		if ( f.equals(Factories.EMFFactory)){
			factory = new Factory(new EMFFactory(null), env);
			
		}
		else if ( f.equals(Factories.CtCoreFactrory)){
		 factory = new Factory(new DefaultCoreFactory(), env);
		}
		else 
			return;
		// Building
		Builder builder = new SpoonBuildingManager(factory);
//		((JavacBuilder) builder)
	//			.setDecompile(false);
			try {
				builder.addInputSource(new File(folderToParse));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				builder.build();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		for (CtPackage p : factory.Package().getAll())
			if (p.getSimpleName().equals("test"))
				p.setSimpleName("test1");
		
		
		// Processing
		ProcessingManager processing = new QueueProcessingManager(factory);

		// Printing
		JavaOutputProcessor printer = new JavaOutputProcessor(new File(
				outputSpoonFolder));
		processing.addProcessor(printer);
		processing.process();
		
		factory.getEnvironment().reportEnd();


	}



	public void process(String outputDir, String inputDir, Factories f) {
		initSpoon(outputDir, inputDir, f);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestLoadAndSaveJava5().process("..//SpoonOutput//src", "..//SpoonInput//src", Factories.EMFFactory);

	}
	
	public enum Factories {
		 CtCoreFactrory,
		 EMFFactory
		
	}
	
}

