/* $Id: Compiler.java,v 1.20 2009-01-30 08:58:47 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : Compiler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher, barais
 */

package org.kermeta.compiler;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.generator.helper.model.Context;
import org.kermeta.compiler.generator.internal.actions.GenerateHelperAction;
import org.kermeta.compiler.internal.ConfigurationCreator;
import org.kermeta.compiler.util.CompilerProperties;
import org.kermeta.compiler.util.CompilerUtil;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;

public class Compiler extends org.kermeta.compiler.Generator {

	// Parameters array use by the GenModel generator
	private String[] arguments = new String[4];

	private IFile ecorefile = null;
	
	private String compiledPluginId = null;

	private String genModelPath = null;
	
	private Context compilationContext;
	
	private IProgressMonitor monitor;
	
	private Properties compilerProperties;
	
	/**
	 * @deprecated
	 */
	//private KermetaUnit kmUnit = null;
	
	/**
	 * @deprecated
	 */
	//private EcoreExporter km2ecoreGen = null;


	/**
	 * Constructor
	 * @param abosluteEcorePath
	 * @param kmUnit
	 * @param km2ecoreGen
	 */
	public Compiler(String abosluteEcorePath, IProgressMonitor monitor) {
		super();
		arguments[0] = "-ecore2GenModel";
		arguments[1] = abosluteEcorePath;
		arguments[2] = "";
		
		// Get the IFile corresponding to the generated Ecore file
		this.ecorefile = ResourceHelper.getIFile("file:/"+arguments[1]);
		
		this.monitor = monitor;
		
		initContext();
		initCompilerProperties(ecorefile.getLocation().removeFileExtension().addFileExtension("compiler.properties").toString());
	}

	/**
	 * Constructor
	 * @param ecoreFile
	 */
	public Compiler(IFile ecoreFile, IProgressMonitor monitor) {
		super();
		ecorefile = ecoreFile;
		arguments[0] = "-ecore2GenModel";
		arguments[1] = ecorefile.getLocation().toString();
		arguments[2] = "";
		
		this.monitor = monitor;
		
		initContext();
		initCompilerProperties(ecorefile.getLocation().removeFileExtension().addFileExtension("compiler.properties").toString());
	}

	/**
	 * Step 1: Generate the genmodel file from the ecore file
	 * Step 2: Launch the Java Source generation from the genmodel file
	 * Step 3: Launch the Java Source generation from the simk file
	 */
	public void run() throws IOException {

		// Generate the stub of the genmodel
		this.run(arguments);

		if(ecorefile!=null && ecorefile.exists()) {
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			genModelPath = ecorefile.getLocation().removeFileExtension().addFileExtension("genmodel").toString();
	
			// Get and load the generated genmodel file
			URI genModelURI = URI.createFileURI(genModelPath);
			Resource genModelResource = resourceSet.getResource(genModelURI, true);
	
			GenModel genModel = null;
	
			for (Iterator<EObject> it = genModelResource.getContents().iterator(); it.hasNext();) {
				EObject gm_res = it.next();
				if (gm_res instanceof GenModel) {
					genModel = (GenModel) gm_res;
				}
			}
	
			if (genModel != null) {
				// Resolve prefix settings for each GenPackage with canGenerate()==true => with a classifier in this one
				CompilerUtil.ePackageFixerAll(genModel);
				
				fixCompilerProperties(genModel);
				
				// Set parameters in GenModel
				setGenModelParameters(genModel);
				
				
				//Step1: Saving the *.genmodel before the generation of plugins
				genModelResource.save(Collections.EMPTY_MAP);
			}
			
			try {
				// Refresh the project containing the ecore file
				ecorefile.getParent().refreshLocal(1, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
	
			// Set arguments for generating plugins => model + edit, but not editor and tests
			String[] args = new String[2];
			args[0] = "-model";
			//args[1] = "-edit";
			//args[2] = genModelPath;
			args[1] = genModelPath;
			
			// Delete the old compiled sources
			ResourceHelper.deleteIProject(compiledPluginId, true);
			
			//Step 2: Generate the plugin
			this.run(args);
			
			// Set the persistence mapping maps
            ConfigurationCreator.createConfiguration(genModel, this.getCompilationContext());
			
			//Step 3: Generate the content of the simk file
			compileHelpers();
			
			fixManifestMF();
			fixBuildProperties();
		
		} else {
			throw new IOException("IOException Compiler - The compilation fails: none ecore file was found");
		}

	}
	
	private void fixManifestMF() {

		IFile manifest_file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(compiledPluginId + "/META-INF/MANIFEST.MF"));
		
		StringBuffer new_file = new StringBuffer();
		
		try {
			
			List<String> file_as_list = readStringByLine(manifest_file.getContents());
			
			for(String line : file_as_list) {
				if( line.contains("Bundle-Version:") ) {
					if( compilerProperties.containsKey(CompilerProperties.BUNDLE_VERSION) ) {
						line = "Bundle-Version: " + this.compilerProperties.getProperty(CompilerProperties.BUNDLE_VERSION);
					}
				} else {
					if( line.contains("Require-Bundle:") ) {
						line += "\n org.eclipse.emf.codegen,"
							+ "\n fr.irisa.triskell.eclipse.util,"
							+ "\n fr.irisa.triskell.kermeta.model,"
							+ "\n org.eclipse.emf.ecoretools.registration,";
						
						if( compilerProperties.containsKey(CompilerProperties.REQUIRE_BUNDLE)
								&& !compilerProperties.getProperty(CompilerProperties.REQUIRE_BUNDLE).equals("") ) {
							for(String dependency : compilerProperties.getProperty(CompilerProperties.REQUIRE_BUNDLE).replace(" ", "").split(",")) {
								line += "\n " + dependency + ",";
							}
						}
						
					}
				}
				
				new_file.append(line);
				new_file.append("\n");
			}
			
			manifest_file.delete(true, new NullProgressMonitor());
			
			IFile new_manifest_file = ResourceHelper.getOrCreateIFile(compiledPluginId + "/META-INF/MANIFEST.MF");
			new_manifest_file.create(new ByteArrayInputStream(new_file.toString().getBytes()), true, new NullProgressMonitor());
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}
	
	private void fixBuildProperties() {
		/*Properties properties = new Properties();
	    
	    try {
	        properties.load(new FileInputStream(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" + compiledPluginId + "/build.properties"));
	        properties.setProperty(CompilerProperties.SOURCE, properties.getProperty(CompilerProperties.SOURCE) + ",\\\nutil/");
	        FileOutputStream fos = new FileOutputStream("arg0");
	        properties.store(fos, "arg1");
	    } catch (FileNotFoundException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
		}*/
	}
	
	public static List<String> readStringByLine( InputStream in ){
		
		List<String> list = new ArrayList<String>();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(in));
		try {
			String thisLine;
			while ((thisLine = input.readLine()) != null) {
				list.add(thisLine);
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * Set the path of the given metamodel in Ecore
	 * @param ecorePath String representing the path of the given metamodel in Ecore
	 */
	public void setEcorePath(String ecorePath) {
		this.arguments[1] = ecorePath;
	}
	
	/**
	 * Get the path of the given metamodel in Ecore
	 * @return String representing the path of the given metamodel in Ecore
	 */
	public String getEcorePath() {
		return this.arguments[1];
	}

	/**
	 * Set generated GenModel static parameters
	 * @param genModel generated GenModel that is used to generate plugins
	 */
	private void setGenModelParameters(GenModel genModel) {
		genModel.setModelName(CodeGenUtil.capName(genModel.getModelName()));
		genModel.setModelPluginID(compilerProperties.getProperty(CompilerProperties.PLUGIN_ID));
		// Model and edit sources are generated in the same plugin and in the same source folder
		genModel.setModelDirectory("/" + compilerProperties.getProperty(CompilerProperties.PLUGIN_ID) + "/src");
		genModel.setEditDirectory("");
		// The editor and tests plugins are not generated
		genModel.setEditorDirectory("");
		genModel.setTestsDirectory("");
		// Icons will be not generated
		genModel.setCreationIcons(false);
		// Use of dynamic templates like  for the implementation of the getter/setter of derived properties
		genModel.setDynamicTemplates(true);
		genModel.setTemplateDirectory("platform:/plugin/org.kermeta.compiler.generator.emftemplates/templates");
		// Use of Java generics is enabled
		genModel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
		genModel.setContainmentProxies(true);
		genModel.setCodeFormatting(true);
		
		// IMPORTANT NOTE: the notification system of EMF MUST BE KEPT ! If the notification is suppressed,
		// then some references like 'container' are not updated.
		//genModel.setSuppressNotification(true);
		
		genModel.setColorProviders(false);
		genModel.setCreationIcons(false);
		
		if( compilerProperties.containsKey(CompilerProperties.COPYRIGHT_HEADER) ) {
			genModel.setCopyrightText(compilerProperties.getProperty(CompilerProperties.COPYRIGHT_HEADER));
		}
	}
	
	private void fixCompilerProperties(GenModel genModel) {
		
		setCompiledPluginId(genModel);
		
		if(compilerProperties==null) {
			compilerProperties = new Properties();
			compilerProperties.setProperty(CompilerProperties.PLUGIN_ID, compiledPluginId);
		} else {
			if( compilerProperties.containsKey(CompilerProperties.PLUGIN_ID)
					&& !compilerProperties.getProperty(CompilerProperties.PLUGIN_ID).equals("") ) {
				compiledPluginId = compilerProperties.getProperty(CompilerProperties.PLUGIN_ID);
			} else {
				compilerProperties.setProperty(CompilerProperties.PLUGIN_ID, compiledPluginId);
			}
		}
	}

	/**
	 * Launch the generation of the Java Source from the simk file
	 */
	private void compileHelpers() {
		GenerateHelperAction compileHelperAction = new GenerateHelperAction(this.monitor);
		
		String kmFilePath = ecorefile.getFullPath().removeFileExtension().addFileExtension("km").toString();
		
		IFile kmFile = ResourceHelper.getIFile(kmFilePath);
		
		IPath kmFilePath_forReflection = ResourcesPlugin.getWorkspace().getRoot().getFullPath().append("/" + compiledPluginId + "/config/" + kmFile.getName());
		
		genModelPath = genModelPath.replace( ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString(), "platform:/resource/" );
		genModelPath = genModelPath.replace( ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), "platform:/resource/" );
		
		IFile genModelFile = ResourceHelper.getIFile(genModelPath);
		IFile simk_file = ResourcesPlugin.getWorkspace().getRoot().getFile(genModelFile.getFullPath().removeFileExtension().addFileExtension(KCompilerConstants.SIMK_EXT));
		
		if(genModelFile.exists()) {
			this.getCompilationContext().setKmFilePathForReflection("config/" + kmFile.getName());
			compileHelperAction.generate(genModelFile, this.getCompilationContext(), simk_file);
		
			//Copying the *.km file for the reflection
			try {
				kmFile.copy(kmFilePath_forReflection, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		
		}
	}	
	
	
	/**
	 * Get the name of the future plugin 
	 * @return
	 */
	public String getCompiledPluginId() {
		return compiledPluginId;
	}

	/**
	 * Set the name of the future plugin
	 * @param genModel
	 */
	private void setCompiledPluginId(GenModel genModel) {
		compiledPluginId = "org.kermeta." + genModel.getModelName().toLowerCase() + ".compiled";
	}
	
	private void initContext() {
		this.compilationContext = new Context();
	}
	
	private void initCompilerProperties(String properties_file_path) {
		CompilerProperties prop = new CompilerProperties(properties_file_path);
		this.compilerProperties = prop.getProperties();
	}
	
	public Context getCompilationContext() {
		return compilationContext;
	}
}
