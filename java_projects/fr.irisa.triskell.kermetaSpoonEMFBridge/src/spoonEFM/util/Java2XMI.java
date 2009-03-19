package spoonEFM.util;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.DanglingHREFException;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import spoon.processing.Builder;
import spoon.processing.Environment;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.reference.CtReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;
import emf.spoon.factory.EMFFactory;
import emf.spoon.reflect.declaration.CtElement;

/**
 * @author Barais Olivier -- Projet Triskell IRISA
 */

public class Java2XMI {
	String test;
	public static void main(String[] args) {
//		 first : input Spoon Folder
		// second : output Spoon Folder
		//third : XMI file to save
		//new Java2XMI().process("..//spoon//src//spoon//support", "output", "XMIOutput//spoon.support.java5");
		//new Java2XMI().process("..//SpoonInput//src//test", "output", "XMIOutput//test.java5");
//		new Java2XMI().process("..//SpoonInput//src//test//bug3", "output", "XMIOutput//test.java5");
//		new Java2XMI().process("..//SpoonInput//src//test//bug2", "output", "XMIOutput//test.java5");
		new Java2XMI().process("/home/barais/workspaces/workspace_spoon/SpoonInput/src/test", "test.xmi");
//		 xmijava.processJavaFolder("/home/barais/workspaces/workspace_spoon/SpoonInput/src/test", "test.xmi");

	}

	
	private Factory factory = null;
	private Resource resource = null;
	

	protected void initSpoon( String folderToParse) {
		Environment env = new StandardEnvironment();

		env.setVerbose(true);

		
		 factory = new Factory(new EMFFactory(resource), env);

		// Building
		Builder builder = new SpoonBuildingManager(factory);
		/*((JDTBuilder) builder)
				.setDecompile(false);*/
			try {
				builder.addInputSource(new File(folderToParse));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		try {
			builder.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		factory.getEnvironment().reportEnd();
	}



	protected void createTree() {
		specScanner cst = new specScanner();

		for (CtPackage p : factory.Package().getAll()){
			cst.scan(p);
//			if (p.getSimpleName().equals("test"))
	//			p.setSimpleName("test1");
		}
		
	}

	
	

	public void process(String folderToParse, String outputXMIFiles) {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		
//		 Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(outputXMIFiles)
				.getAbsolutePath());

		resource = resourceSet.createResource(fileURI);
		initSpoon( folderToParse);

		
		
		

		//load the tree in the ressource
		createTree();

		try {
			System.out.println("beginning saving ");

			resource.save(null);
			
		} catch (IOException e) {
			if (e instanceof IOWrappedException
					&& ((IOWrappedException) e).getWrappedException() instanceof DanglingHREFException) {
				e.printStackTrace();
			} else
				e.printStackTrace();
		}
		System.out.println("end saving");

  
	}

	/**
	 * @param args
	 */
	class specScanner extends CtScanner {

		@Override
		public void enter(spoon.reflect.declaration.CtElement element) {
			super.enter(element);
			resource.getContents().add((EObject) element);
			if (((CtElement) element).getPosition() != null) {
				resource.getContents().add(((CtElement) element).getPosition());
			}
			

		}

		@Override
		public void enterReference(CtReference e) {
			super.enterReference(e);
			resource.getContents().add((EObject) e);
			
		}

	}

}
