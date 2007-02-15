package spoonemf.popup.actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.DanglingHREFException;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import spoon.processing.Builder;
import spoon.processing.Environment;
import spoon.processing.FactoryAccessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;
import spoon.support.StandardEnvironment;
import spoon.support.builder.SpoonBuildingManager;
import emf.spoon.SpoonPackage;
import emf.spoon.factory.EMFFactory;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.impl.CtClassImpl;
import emf.spoon.reflect.declaration.impl.ext.EmfClassImpl;

/**
 * @author Barais Olivier -- Projet Triskell IRISA
 */

public class Java2XMIHelper {
	private Java2XMIHelper(){
		
	}
	public static Java2XMIHelper eInstance = new Java2XMIHelper();
	/**
	 * @param args
	 */
 
	private Factory factory = null;

	private Resource resource = null;

	private ResourceSet resourceSet = new ResourceSetImpl();
	
	private  String outputSpoonFolder ="";
	
	protected void initSpoon( ) {
		Environment env = new StandardEnvironment();

		env.setVerbose(true);
		env.setDebug(true);
		factory = new Factory(new  EMFFactory(resource),  env);
	}
	
	protected void initSpoon( List<String> 		folderToParse) {
		Environment env = new StandardEnvironment();

		env.setVerbose(true);
		env.setDebug(true);

		
		 factory = new Factory(new  EMFFactory(resource),  env);
		 //factory.Method().
		// Building
		 Builder builder = new SpoonBuildingManager();

		// System.err.println("beginning to parse");
		for (String file : folderToParse){
			 
			 try {
					builder.addInputSource(new File(file));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		}
		System.err.println("beginning to parse" + folderToParse);
			
			try {
				builder.build(factory);
			} 
			catch (Exception e) {
					e.printStackTrace();
			}
			 System.err.println("end");

			
		
		factory.getEnvironment().reportEnd();
	}
	

	public void processXMIFiles(String outputSpoonFolder, String inputXMIFiles) {
		
		this.outputSpoonFolder = outputSpoonFolder;
		
		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		System.err.println("ok1");
		
		// Get the URI of the model file.
		Registry registry = resourceSet.getPackageRegistry();// new
		System.err.println("ok2");
		// EPackageRegistryImpl();
		registry.put("http://spoon", SpoonPackage.eINSTANCE);
		
		resourceSet.setPackageRegistry(registry);
		System.err.println("ok3");
	   
		
		URI fileURI = URI.createFileURI(new File(inputXMIFiles)
				.getAbsolutePath());
		//URI fileURI = URI.createURI(inputXMIFiles, true);
		
		//fileURI = this.resolveURI(inputXMIFiles, "");
		//System.out.println(fileURI);
		System.err.println("ok4" + fileURI);
		
		resource = resourceSet.getResource(fileURI, true);
		System.err.println("ok5");
		initSpoon();
		System.err.println("ok6");

		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.err.println("ok6");
		// set the factory
		this.updateFactory();
		
		System.err.println("ok7");
		
		printJavaFiles();
		
		factory.getEnvironment().reportEnd();


	}
	
	public void updateFactory(){
		for (Object o : resource.getContents()) {
			if (o instanceof FactoryAccessor) {
				((FactoryAccessor) o).setFactory(factory);
			}
			if (o instanceof CtPackage) {
				factory.Package()
						.register((CtPackage) o);
			}

		}
	}
	
	public void replaceResource(Resource resource){
		this.resource = resource;
		this.updateFactory();
	}
	
	
	
	 public URI resolveURI(String uri, String rel_path)
	    {
	    	URI u = URI.createURI(uri);
	    	if (u.isRelative()) {
	    		URIConverter c = new URIConverterImpl();
	    		
	    		u = u.resolve(c.normalize(URI.createURI(rel_path)));    			
	    	}
	    	return u;
	    }
	


	public void processJavaFolder(List<String> folderToParse, String outputXMIFiles) {
		

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File(outputXMIFiles)
				.getAbsolutePath());

		resource = resourceSet.createResource(fileURI);
		System.err.println("folder : " +folderToParse);

		initSpoon( folderToParse);
		//this.decompile(folderToParse);
		
		this.createTree();
		
		
		System.err.println("Number of elements after parsing the folder " +resource.getContents().size());
		
		this.save();

	}
	
	

	
	public void saveResource(Resource resource){
		this.replaceResource(resource);
		this.save();
	}
	
	
	public void save(){
		try {
			System.out.println("beginning saving ");

			resource.save(null);
			
		} catch (IOException e) {
			if (e instanceof IOWrappedException
					&& ((IOWrappedException) e).getWrappedException() instanceof DanglingHREFException) {
			} else
				e.printStackTrace();
		}
		System.out.println("end saving");

	}
	
	
	
	
	public void printJavaFiles(){

		System.out.println("beginning saving java code");
		// print java code

		ProcessingManager processing = new QueueProcessingManager(factory);

		// Printing
		JavaOutputProcessor printer = new JavaOutputProcessor(new File(
				outputSpoonFolder));

		printer.getProcessedElementTypes().add(EmfClassImpl.class);

		processing.addProcessor(printer);
		processing.process();

		System.out.println("end saving java code");
		
		
	}

	

	
	public void printJavaFiles(Resource resource){
		this.replaceResource(resource);
		this.printJavaFiles();
	}

	
	public Factory getFactory() {
		return factory;
	}

	public Resource getResource() {
		return resource;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	protected void createTree() {
		specScanner cst = new specScanner();

		for (spoon.reflect.declaration.CtPackage p : factory.Package().getAll()){
			//System.err.println("explore the tree");
			cst.scan(p);
//			if (p.getSimpleName().equals("test"))
	//			p.setSimpleName("test1");
		}
		
	}
	
	/**
	 * @param args
	 */
	class specScanner extends CtScanner {

		@Override
		public void enter(spoon.reflect.declaration.CtElement element) {
			super.enter(element);
			if (!resource.getContents().contains(element))
				resource.getContents().add(element);
			if (((CtElement) element).getPosition() != null) {
				resource.getContents().add(((CtElement) element).getPosition());
			}
			

		}

		@Override
		public void enterReference(CtReference e) {
			super.enterReference(e);
			resource.getContents().add(e);
			
		}
	}
	
}
