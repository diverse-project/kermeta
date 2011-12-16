/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.emf.genmodel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import org.eclipse.core.runtime.IPath;
//import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
//import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

/**
 *
 * @author ffouquet
 */
public class GenModelHelper {

	
	
    private String eclipseProjectName = "emfoutput";

    public MessagingSystem logger;

	private boolean runInEclipse = false;
    
    
    //attention s'execute depuis eclipse donc faire attention au outputfilename =le projet actuel
    //et src dir
    
    
    
    public GenModelHelper(MessagingSystem logger){
    	this.logger = logger;
    }
    
    
    public GenModelHelper(MessagingSystem logger, String eclipseProject){
    	this.logger = logger;
    	this.runInEclipse  = true;
    	eclipseProjectName = eclipseProject;
    }
    
    public static boolean deleteDirectory(File path) {
        if (path.exists()) {
            File[] files = path.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    deleteDirectory(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return (path.delete());
    }

    public void createGenModel(java.net.URI ecore, File genmodel, File sourcePath, Boolean clearOutputDir) {
    	List<java.net.URI> ecoreFiles = new ArrayList<java.net.URI>();
    	ecoreFiles.add(ecore);
    	createGenModel(ecoreFiles, sourcePath, sourcePath, clearOutputDir);
    	
    }
    public void createGenModel(List<java.net.URI> ecoreFiles, File genmodel, File sourcePath, Boolean clearOutputDir) {
    	// TODO see why we don't use org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil ?
    	
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
                put("ecore", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().
                put("genmodel", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());

        //IPath ecorePath = new Path(ecorepath);
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getPackageRegistry().put("http://www.eclipse.org/emf/2002/GenModel", GenModelPackage.eINSTANCE);

        resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
       
        

        GenModel genModelModel = null;
        String modelDirectory = File.separatorChar + eclipseProjectName;
        if (runInEclipse){
        	String srcPathInProject = "src";
        	int index = sourcePath.getPath().indexOf(eclipseProjectName);
        	if(index != -1){
        		srcPathInProject = sourcePath.getPath().substring(index+eclipseProjectName.length()+1).replaceAll("\\\\", "/");
        	}
        	modelDirectory =File.separatorChar+ eclipseProjectName+File.separatorChar+srcPathInProject;
        }
        

        if (genmodel != null && genmodel.exists()) {
        	
            Resource resourceGenModel = resourceSet.getResource(URI.createFileURI(genmodel.getAbsolutePath()), true);
            genModelModel = (GenModel) resourceGenModel.getContents().get(0);
            genModelModel.setModelDirectory(modelDirectory);
            ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
            for(java.net.URI ecoreFile : ecoreFiles){
        		URI ecoreURI = URI.createFileURI(ecoreFile.toString());
    	        Resource resource = resourceSet.getResource(ecoreURI, true);
    	        ePackages.add((EPackage) resource.getContents().get(0));	// TODO maybe think about ecore models with multiple root packages ?
                genModelModel.getForeignModel().add(ecoreFile.toString());
            }
            genModelModel.initialize(ePackages);
        } else {
            if(genmodel == null){
                genmodel = new File(eclipseProjectName+".genmodel");
            }

            URI genModelURI = URI.createFileURI(genmodel.getAbsolutePath());

            logger.debug("Creating "+genModelURI, getClass().getName());

            
            Resource genModelResource = Resource.Factory.Registry.INSTANCE.getFactory(genModelURI).createResource(genModelURI);

            genModelModel = GenModelFactory.eINSTANCE.createGenModel();
            genModelResource.getContents().add(genModelModel);
            resourceSet.getResources().add(genModelResource);
            genModelModel.setModelDirectory(modelDirectory);

            ArrayList<EPackage> ePackages = new ArrayList<EPackage>();
            for(java.net.URI ecoreFile : ecoreFiles){
        		URI ecoreURI = org.eclipse.emf.common.util.URI.createURI(ecoreFile.toString());
    	        Resource resource = resourceSet.getResource(ecoreURI, true);
    	        ePackages.add((EPackage) resource.getContents().get(0));	// TODO maybe think about ecore models with multiple root packages ?
                genModelModel.getForeignModel().add(ecoreFile.toString());
            }
            genModelModel.initialize(ePackages);
            genModelModel.setModelName(genModelURI.trimFileExtension().lastSegment());
            genModelModel.setUpdateClasspath(false);
            
			genModelModel.setComplianceLevel(GenJDKLevel.JDK60_LITERAL);
			genModelModel.setRuntimeVersion(GenRuntimeVersion.EMF26); // TODO switch to 2.7 ?

            try {
                genModelResource.save(Collections.EMPTY_MAP);
            } catch (IOException e) {
                logger.error("GenModelSave Error", getClass().getName(), e);
            }
        }

        if(clearOutputDir) {
            logger.debug("Clear output directory , "+sourcePath.getAbsolutePath(), getClass().getName());
            deleteDirectory(sourcePath);
        }
        if (!runInEclipse){
        	sourcePath.mkdir();
        	EcorePlugin.getPlatformResourceMap().put("/"+eclipseProjectName, URI.createFileURI(sourcePath.getAbsolutePath() + "/")); // works only if run in standalone mode
        }
        this.generate(genModelModel);

    }

    public void generate(GenModel genModel) {
        //Generate Code
        genModel.setCanGenerate(true);
        GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
        // Create the generator and set the model-level input object.
        Generator generator = new Generator();
        generator.setInput(genModel);
        generator.requestInitialize();
        // Generator model code.
        Diagnostic d = generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
        
        logger.info(d.getMessage(), getClass().getName());
    }
}