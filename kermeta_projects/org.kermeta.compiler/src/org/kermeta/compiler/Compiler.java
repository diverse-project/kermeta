/* $Id: Compiler.java,v 1.2 2007-10-18 09:38:27 cfaucher Exp $
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
import org.eclipse.core.runtime.CoreException;
//import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.util.CodeGenUtil;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import org.kermeta.compiler.util.CompilerUtil;

public class Compiler extends Generator {

	// Parameters array use by the GenModel generator
	private String[] arguments = new String[4];

	private IFile ecorefile = null;
	
	private String compiledPluginId = "";

	public Compiler(String abosluteEcorePath) {
		super();
		arguments[0] = "-ecore2GenModel";
		arguments[1] = abosluteEcorePath;
		arguments[2] = "";
		arguments[3] = "Ckm";
		
		// Get the IFile corresponding to the generated Ecore file
		ecorefile = ResourceHelper.getIFile("file:/"+arguments[1]);
	}

	public Compiler(IFile ecoreFile) {
		super();
		ecorefile = ecoreFile;
		arguments[0] = "-ecore2GenModel";
		arguments[1] = ecorefile.getFullPath().toString();
		arguments[2] = "";
		arguments[3] = "Ckm";
	}

	public void run() throws IOException {

		// Generate the stub of the genmodel
		this.run(arguments);

		if(ecorefile!=null && ecorefile.exists()) {
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			String genModelPath = ecorefile.getLocation().removeFileExtension().addFileExtension("genmodel").toString();
	
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
				
				System.out.println("Number of GenPackages: " + genModel.getGenPackages().size());
	
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
		genModel.setCopyrightText("Copyright : IRISA / INRIA / Universite de Rennes 1/nLicense   : EPL/nhttp://www.kermeta.org");
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
		compiledPluginId = "org.kermeta."+ genModel.getModelName().toLowerCase() + ".compiled";
	}

}
