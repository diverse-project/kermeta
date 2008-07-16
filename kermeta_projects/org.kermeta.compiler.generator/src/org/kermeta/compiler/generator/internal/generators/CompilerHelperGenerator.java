/*******************************************************************************
 * Copyright (c) 2006 Anyware Technologies. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware
 * Technologies), Jacques Lescot (Anyware Technologies) - initial API and
 * implementation
 ******************************************************************************/
/*$Id: CompilerHelperGenerator.java,v 1.9 2008-07-16 13:10:30 ftanguy Exp $
* Project : org.kermeta.compiler.generator
* File : 	CompilerHelperGenerator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.generator.internal.generators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.ENamedElement;
import org.kermeta.compiler.generator.internal.GeneratorPlugin;
import org.kermeta.io.KermetaUnit;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.StaticMethod;
import org.kermeta.generator.AbstractGenerator;
import org.kermeta.generator.jet.DefaultJETEmitter;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;

/**
 * This class is the Entry point of the generation for Kermeta compiler's helpers
 * 
 */
public class CompilerHelperGenerator extends AbstractGenerator {
	/** ******************** */
	/** JET Template files */
	/** ******************** */
	private static final String TEST_HELPER_JAVA = "templateHelper/helper/Helper.javajet";

	private static final String RUNNER_JAVA = "templateHelper/runner/Runner.javajet";

	private static final String JAVA_LAUNCHER_LAUNCH = "templateHelper/JavaLauncher.launchjet";

	private static final String BASETYPES_UTILS = "templateHelper/util";
	
	// FIXME CF unused for the moment
	private static final String KERMETA_LAUNCHER_LAUNCH = "templateHelper/KermetaLauncher.launchjet";


	/** The GenModel object */
	private GenModel configuration;

	//private KermetaUnit kmUnit;
	// FIXME CF unused for the moment
	//private EcoreExporter km2ecoreGen;
	private SIMKModel simkModel;

	/**
	 * Constructor
	 * 
	 * @param conf the genmodel based on the generated Ecore
	 * @param kmUnit
	 * @param km2ecoreGen
	 * @param helperModel
	 */
	public CompilerHelperGenerator(GenModel conf, /*KermetaUnit kmUnit,*/
			/*EcoreExporter km2ecoreGen,*/ SIMKModel simkModel) {
		this.configuration = conf;
		//this.kmUnit = kmUnit;
		//this.km2ecoreGen = km2ecoreGen;
		this.simkModel = simkModel;
	}

	/**
	 * Launch the generation for the compilation
	 * 
	 * @param monitor
	 *            the monitor for the work progression
	 * @return the IProject
	 * 
	 * @throws CoreException
	 *             if the generation fails
	 */
	public IProject generate(IProgressMonitor monitor) throws CoreException {
		monitor.subTask("Project creation");
		IProject project = createEMFProject(configuration.getModelPluginID());
		monitor.worked(1);

		monitor.subTask("Package creation");
		IPath pathProject = project.getFullPath();
		generateStaticPackages(project, pathProject);
		monitor.worked(1);

		if( this.simkModel!=null ) {
			generateHelpers(this.simkModel, pathProject, monitor);
		}
		
		if( this.simkModel!=null ) {
			generateHelperModel(this.simkModel, pathProject, monitor);
		}
		
		generateBaseTypesUtils();
		
		return project;
	}

	/**
	 * @see org.kermeta.generator.AbstractGenerator#createJETEmitter(java.lang.String)
	 */
	protected JETEmitter createJETEmitter(String templateURI) {
		return new DefaultJETEmitter(templateURI) {
			public void initialize(Monitor monitor) throws JETException {
				// Further plugins must be released to activate the generation.
				addVariable("KERMETA_ECLIPSE_HELPER",
						"fr.irisa.triskell.eclipse.util");
				addVariable("KERMETA_COMPILER_GENERATOR",
						"org.kermeta.compiler.generator");
				addVariable("SIMK_MODEL",
						"org.kermeta.simk");
				addVariable("KERMETA_MODEL",
						"fr.irisa.triskell.kermeta.model");
				addVariable("ECLIPSE_CORE_RUNTIME", "org.eclipse.core.runtime");
				addVariable("ECLIPSE_OSGI", "org.eclipse.osgi");
				super.initialize(monitor);
			}
		};
	}

	/**
	 * Creates the required packages on the project
	 * 
	 * @param project
	 *            the project where generates
	 * @param pathProject
	 *            the path for the given project
	 * @throws CoreException
	 *             if the generation failed
	 */
	private void generateStaticPackages(IProject project, IPath pathProject)
			throws CoreException {
		
		for(GenPackage genpack : configuration.getAllGenPackagesWithClassifiers()) {
		
		// Please do not remove this comment, old value of the project name variable:
		// "kermeta"; project.getName();
		String projectName = EcoreHelper.getQualifiedName(genpack.getEcorePackage());
		IPath packagePath = new Path(projectName.replace('.', IPath.SEPARATOR));

		for (int i = 1; i < packagePath.segmentCount() + 1; i++) {
			IPath pathPackage = pathProject.append(IPath.SEPARATOR
					+ SOURCE_DIRECTORY
					+ IPath.SEPARATOR
					+ packagePath.removeLastSegments(packagePath.segmentCount()
							- i));
			IFolder packagefolder = ResourcesPlugin.getWorkspace().getRoot()
					.getFolder(pathPackage);
			if (!(packagefolder.exists())) {
				packagefolder.create(true, false, new NullProgressMonitor());
			}
		}

		String[] packagesUtils = { "helper", "runner" };
		for (int i = 0; i < packagesUtils.length; i++) {
			IPath pathPackage = pathProject.append(IPath.SEPARATOR
					+ SOURCE_DIRECTORY + IPath.SEPARATOR + packagePath
					+ IPath.SEPARATOR + packagesUtils[i]);
			IFolder packagefolder = ResourcesPlugin.getWorkspace().getRoot()
					.getFolder(pathPackage);
			if (!(packagefolder.exists())) {
				packagefolder.create(true, false, new NullProgressMonitor());
			}
		}
		}

		// create the icons folder
		IPath pathIcons = pathProject.append(IPath.SEPARATOR + "icons");
		IFolder iconsFolder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(pathIcons);
		if (!(iconsFolder.exists())) {
			iconsFolder.create(true, false, new NullProgressMonitor());
		}

		// create the META-INF folder
		IPath pathMetaInf = pathProject.append(IPath.SEPARATOR + "META-INF");
		IFolder metaInfFolder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(pathMetaInf);
		if (!(metaInfFolder.exists())) {
			metaInfFolder.create(true, false, new NullProgressMonitor());
		}
	}


	// ---------------------------------------------------------
	// Generate the classes for the helpers
	// ---------------------------------------------------------
	private void generateHelpers(SIMKModel simkConf, IPath projectPath,
			IProgressMonitor monitor) {
		try {

			monitor.subTask("Files creation");

			generateRunner(simkConf, projectPath);
			generateLauncher(simkConf, projectPath);

			monitor.worked(1);
		} catch (JETException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"JETException : an error occured during helper generation. See error logs for more details.",
							IStatus.ERROR);
		} catch (CoreException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"CoreException : an error occured during helper generation. See error logs for more details.",
							IStatus.ERROR);
		}
	}

	// ---------------------------------------------------------
	// Generate the classes for the helpers
	// ---------------------------------------------------------
	private void generateHelperModel(SIMKModel simkConf, IPath projectPath,
			IProgressMonitor monitor) {
		try {

			monitor.subTask("Files creation");

			generateTestHelperModel(simkConf, projectPath);

			monitor.worked(1);
		} catch (JETException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"JETException : an error occured during helper generation. See error logs for more details.",
							IStatus.ERROR);
		} catch (CoreException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"CoreException : an error occured during helper generation. See error logs for more details.",
							IStatus.ERROR);
		}
	}
	
	private void generateTestHelpers(GenModel conf, IPath projectPath)
			throws JETException, CoreException {
		for(GenPackage genpack : conf.getAllGenPackagesWithClassifiers()) {
			applyTemplate(genpack, getTemplateURI(TEST_HELPER_JAVA), projectPath
					.append("/" + SOURCE_DIRECTORY + "/" + EcoreHelper.getQualifiedName(genpack.getEcorePackage(), "/") + "/helper/"
							+ conf.getGenPackages().get(0).getPrefix()
							+ "Helper.java"), conf.isForceOverwrite());
		}
	}
	
	private void generateTestHelperModel(SIMKModel simkConf, IPath projectPath)
			throws JETException, CoreException {
		for(StaticMethod sm : simkConf.getStaticMethods()) {
			// temporarily in stand by
			/*if(sm.getUsages().contains(SMUsage.FUNCTION_TYPE) && !sm.getSMContext().getDeepestPackage().getQualifiedName().contains("kermeta")){
			applyTemplate(sm, getTemplateURI(TEST_HELPER_JAVA), projectPath
					.append("/" + SOURCE_DIRECTORY + "/" + sm.getSMContext().getDeepestPackage().getQualifiedName().replace(".", "/") + "/helper/"
							+ CodeGenUtil.capName(sm.getParentMethodFromModel().getName()) + "_" + sm.getId()
							+ "_Helper.java"), configuration.isForceOverwrite());
			}*/
		}
	}

	/**
	 * Generate the Runner classes, a Runner class is a class coming from an Operation in Kermeta might be a main method in Java
	 * 
	 * @param simkConf
	 * @param projectPath
	 * @throws JETException
	 * @throws CoreException
	 */
	private void generateRunner(SIMKModel simkConf, IPath projectPath)
			throws JETException, CoreException {
		//for (GenPackage genPackage : conf.getGenPackages()) {
		//	EPackage epackage = genPackage.getEcorePackage();

			//for (EClassifier eClassifier : epackage.getEClassifiers()) {
				//if (eClassifier instanceof EClass) {
				//	EClass eClass = (EClass) eClassifier;

					for (StaticMethod sm : simkConf.getStaticMethods()) {
						if (sm.getUsages().contains(SMUsage.RUNNER)) {
							applyTemplate(
									sm,
									getTemplateURI(RUNNER_JAVA),
									projectPath.append("/" + SOURCE_DIRECTORY + "/" + sm.getSMContext().getDeepestPackage().getQualifiedName().replace(".", "/") + "/runner/" + CodeGenUtil.capName(EcoreHelper.getQualifiedName((ENamedElement) sm.getParentMethodFromModel(), "__")) + "_Runner.java"),
									configuration.isForceOverwrite());
						}

					}

				//}
			//}
		//}

	}

	/**
	 * Generate the .launch file corresponding to the mainClass and mainOperation that are defined into the header of a Kermeta file
	 * 
	 * @param simkConf
	 * @param projectPath
	 * @throws JETException
	 * @throws CoreException
	 */
	private void generateLauncher(SIMKModel simkConf, IPath projectPath)
			throws JETException, CoreException {
		
		/*String mainClass = null;
		String mainOperation = null;
		
		for(Tag tag : this.kmUnit.getModelingUnit().getOwnedTags()) {
			if(tag.getName().equals("mainClass")) {
				mainClass = tag.getValue();
			}
			if(tag.getName().equals("mainOperation")) {
				mainOperation = tag.getValue();
			}
		}
		
		if(mainClass!=null && mainOperation!=null) {
			String[] tab_mainClass = mainClass.split("::");//mainClass.replace("::", ".")
			
			Object[] args = {conf, mainClass, mainOperation};
			applyTemplate(args, getTemplateURI(JAVA_LAUNCHER_LAUNCH), projectPath.append("/" + tab_mainClass[0] + ".launch"), conf.isForceOverwrite());
		}*/
		for (StaticMethod sm : simkConf.getStaticMethods()) {
			if (sm.getUsages().contains(SMUsage.LAUNCHER)) {
				
				String mainClass = sm.getSMContext().getSMClass().getQualifiedName();
				String mainOperation = sm.getParentMethod().getName();
				
				Object[] args = {configuration, mainClass, mainOperation};
				applyTemplate(
						args,
						getTemplateURI(JAVA_LAUNCHER_LAUNCH),
						projectPath.append("/" + sm.getSMContext().getSMClass().getQualifiedName() + ".launch"),
						configuration.isForceOverwrite());
			}

		}
	}

	/**
	 * Method from Topcased
	 * 
	 * @param relativePath
	 * @return
	 */
	private String getTemplateURI(String relativePath) {
		return getTemplateURI(GeneratorPlugin.getDefault().getBundle(),
				relativePath);
	}
	
	private void generateBaseTypesUtils() {
		URL url = GeneratorPlugin.getDefault().getBundle().getEntry( "baseTypesUtils.zip" );
		ZipInputStream zipFileStream;
		try {
			zipFileStream = new ZipInputStream(url.openStream());
			ZipEntry zipEntry = zipFileStream.getNextEntry();
			
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject( configuration.getModelPluginID() );
		
			while (zipEntry != null) {
				File file = new File(project.getLocation().toString(), zipEntry.getName());
				if ( ! zipEntry.isDirectory() ) {
					/*
					 * Copy files (and make sure parent directory exist)
					 */	
					File parentFile = file.getParentFile();
					if ( null != parentFile && ! parentFile.exists() )
						parentFile.mkdirs();

					OutputStream os = null;
					try {
						os = new FileOutputStream(file);
						byte[] buffer = new byte[102400];
						while (true) {
							int len = zipFileStream.read(buffer);
							if (zipFileStream.available() == 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != os) {
							os.close();
						}
					}
				}
				zipFileStream.closeEntry();
				zipEntry = zipFileStream.getNextEntry();
			}
		
			project.refreshLocal(IFile.DEPTH_INFINITE, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
}
