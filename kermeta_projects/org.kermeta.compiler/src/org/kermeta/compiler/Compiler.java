/* $Id: Compiler.java,v 1.7 2008-06-26 09:06:30 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : Compiler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher, barais
 */

package org.kermeta.compiler;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.compiler.generator.helper.model.SimkModelHelper;
import org.kermeta.compiler.generator.internal.actions.GenerateHelperAction;
import org.kermeta.compiler.util.CompilerUtil;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;

public class Compiler extends Generator {

	// Parameters array use by the GenModel generator
	private String[] arguments = new String[4];

	private IFile ecorefile = null;
	
	private String compiledPluginId = null;

	private String genModelPath = null;
	
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
	public Compiler(String abosluteEcorePath, KermetaUnit kmUnit, EcoreExporter km2ecoreGen) {
		super();
		arguments[0] = "-ecore2GenModel";
		arguments[1] = abosluteEcorePath;
		arguments[2] = "";
		arguments[3] = "Ckm"; // it seems this assignment is deprecated
		
		// Get the IFile corresponding to the generated Ecore file
		this.ecorefile = ResourceHelper.getIFile("file:/"+arguments[1]);
		//this.kmUnit = kmUnit;
		//this.km2ecoreGen = km2ecoreGen;
	}

	/**
	 * Constructor
	 * @param ecoreFile
	 */
	public Compiler(IFile ecoreFile) {
		super();
		ecorefile = ecoreFile;
		arguments[0] = "-ecore2GenModel";
		arguments[1] = ecorefile.getFullPath().toString();
		arguments[2] = "";
		arguments[3] = "Ckm"; // it seems this assignment is deprecated
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
				CompilerUtil.ePackagePrefixFixer(genModel);
				
				setCompiledPluginId(genModel);
				
				// Set parameters in GenModel
				setGenModelParameters(genModel);
				
				// May be add the GenPackage in the list of canGenerate() Package
				//genModel.getAllUsedGenPackagesWithClassifiers().addAll(genModel.getGenPackages());

				
				for( GenPackage genpack : genModel.getGenPackages() ) {
					System.out.println("GenPackages: " + genpack.getNSName());
					if(genpack.getNSName().equals("kermeta")) {
						//genModel.getGenPackages().remove(genpack);
					}
				}
				
				//System.out.println("Number of GenPackages: " + genModel.getGenPackages().size());
	
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
			//Step 2: Generate the plugins
			this.run(args);
			
			//Step 3: Generate the content of the simk file
			compileHelpers();
		
		} else {
			throw new IOException("IOException Compiler- The compilation fails: none ecore file was found");
		}

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
		genModel.setModelPluginID(compiledPluginId);
		// Model and edit sources are generated in the same plugin and in the same source folder
		genModel.setModelDirectory("/" + compiledPluginId + "/src");
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
		genModel.setCopyrightText("Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org");
	}

	/**
	 * Launch the generation of the Java Source from the simk file
	 */
	private void compileHelpers() {
		GenerateHelperAction compileHelperAction = new GenerateHelperAction();
		
		genModelPath = genModelPath.replace( ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString(), "platform:/resource/" );
		genModelPath = genModelPath.replace( ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), "platform:/resource/" );
		
		IFile genModelFile = ResourceHelper.getIFile(genModelPath);
		IFile simk_file = ResourcesPlugin.getWorkspace().getRoot().getFile(genModelFile.getFullPath().removeFileExtension().addFileExtension(SimkModelHelper.SIMK_EXT));
		if(genModelFile.exists()) {
			compileHelperAction.generate(genModelFile, /*this.kmUnit,*/ /*this.km2ecoreGen,*/ simk_file);
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

}
