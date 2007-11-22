/* $Id: Compiler.java,v 1.3 2007-11-22 13:00:25 cfaucher Exp $
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
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.kermeta.compiler.generator.helper.model.HelperModel;
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
	
	private KermetaUnit kmUnit = null;
	
	private EcoreExporter km2ecoreGen = null;
	
	private HelperModel helperModel = null;
	
	public Compiler(String abosluteEcorePath, KermetaUnit kmUnit, EcoreExporter km2ecoreGen, HelperModel helperModel) {
		super();
		arguments[0] = "-ecore2GenModel";
		arguments[1] = abosluteEcorePath;
		arguments[2] = "";
		arguments[3] = "Ckm"; // it seems this assignment is deprecated
		
		// Get the IFile corresponding to the generated Ecore file
		this.ecorefile = ResourceHelper.getIFile("file:/"+arguments[1]);
		this.kmUnit = kmUnit;
		this.km2ecoreGen = km2ecoreGen;
		this.helperModel = helperModel;
	}

	public Compiler(IFile ecoreFile) {
		super();
		ecorefile = ecoreFile;
		arguments[0] = "-ecore2GenModel";
		arguments[1] = ecorefile.getFullPath().toString();
		arguments[2] = "";
		arguments[3] = "Ckm"; // it seems this assignment is deprecated
	}

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
	
				// Saving the *.genmodel before the generation of plugins
				genModelResource.save(Collections.EMPTY_MAP);
			}
			
			try {
				// Refresh the project containing the ecore file
				ecorefile.getParent().refreshLocal(1, null);
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
			// Generate the plugins
			this.run(args);
			
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
		// The use of Java generics is enabled
		genModel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
		genModel.setCopyrightText("Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org");
	}

	/**
	 * 
	 * @return
	 */
	public String getCompiledPluginId() {
		return compiledPluginId;
	}

	/**
	 * 
	 * @param genModel
	 */
	private void setCompiledPluginId(GenModel genModel) {
		compiledPluginId = "org.kermeta.compiled."+ genModel.getModelName().toLowerCase();
	}
	
	private void compileHelpers() {
		GenerateHelperAction compileHelperAction = new GenerateHelperAction();
		
		genModelPath = genModelPath.replace( ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString(), "platform:/resource/" );
		genModelPath = genModelPath.replace( ResourcesPlugin.getWorkspace().getRoot().getLocation().toString(), "platform:/resource/" );
		
		IFile genModelFile = ResourceHelper.getIFile(genModelPath);
		if(genModelFile.exists()) {
			compileHelperAction.generate(genModelFile, this.kmUnit, this.km2ecoreGen, this.helperModel);
		}
	}

}
