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
package org.kermeta.compiler.generator.internal.generators;

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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.kermeta.compiler.generator.helper.model.HelperMethod;
import org.kermeta.compiler.generator.helper.model.HelperModel;
import org.kermeta.compiler.generator.internal.GeneratorPlugin;
import org.kermeta.generator.AbstractGenerator;
import org.kermeta.generator.jet.DefaultJETEmitter;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.language.structure.Tag;

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

	// FIXME CF unused for the moment
	private static final String KERMETA_LAUNCHER_LAUNCH = "templateHelper/KermetaLauncher.launchjet";


	/** The GenModel object */
	private GenModel configuration;

	private KermetaUnit kmUnit;
	// FIXME CF unused for the moment
	private EcoreExporter km2ecoreGen;
	private HelperModel helperModel;

	/**
	 * Constructor
	 * 
	 * @param conf the genmodel based on the generated Ecore
	 * @param kmUnit
	 * @param km2ecoreGen
	 * @param helperModel
	 */
	public CompilerHelperGenerator(GenModel conf, KermetaUnit kmUnit,
			EcoreExporter km2ecoreGen, HelperModel helperModel) {
		this.configuration = conf;
		this.kmUnit = kmUnit;
		this.km2ecoreGen = km2ecoreGen;
		this.helperModel = helperModel;
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

		generateHelpers(configuration, pathProject, monitor);

		if(this.helperModel!=null) {
			generateHelperModel(helperModel, pathProject, monitor);
		}
		
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
	private void generateHelpers(GenModel conf, IPath projectPath,
			IProgressMonitor monitor) {
		try {

			monitor.subTask("Files creation");

			generateRunner(conf, projectPath);
			generateLauncher(conf, projectPath);

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
	private void generateHelperModel(HelperModel theHelperModel, IPath projectPath,
			IProgressMonitor monitor) {
		try {

			monitor.subTask("Files creation");

			generateTestHelperModel(theHelperModel, projectPath);

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
	
	private void generateTestHelperModel(HelperModel theHelperModel, IPath projectPath)
			throws JETException, CoreException {
		for(HelperMethod helperMethod : theHelperModel.helperMethods) {
			if(!helperMethod.getAllPackagesName().contains("kermeta")){
			applyTemplate(helperMethod, getTemplateURI(TEST_HELPER_JAVA), projectPath
					.append("/" + SOURCE_DIRECTORY + "/" + helperMethod.getAllPackagesName().replace("::", "/") + "/helper/"
							+ CodeGenUtil.capName(helperMethod.getParentMethodFromModel().getName()) + "_" + helperMethod.getId()
							+ "_Helper.java"), configuration.isForceOverwrite());
			}
		}
	}

	private void generateRunner(GenModel conf, IPath projectPath)
			throws JETException, CoreException {
		for (GenPackage genPackage : conf.getGenPackages()) {
			EPackage epackage = genPackage.getEcorePackage();

			for (EClassifier eClassifier : epackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;

					for (EOperation eop : eClass.getEOperations()) {
						if (isRunnable(eop)) {
							applyTemplate(
									eop,
									getTemplateURI(RUNNER_JAVA),
									projectPath.append("/" + SOURCE_DIRECTORY + "/" + EcoreHelper.getQualifiedName(epackage, "/") + "/runner/" + CodeGenUtil.capName(EcoreHelper.getQualifiedName((ENamedElement) eop, "__")) + "_Runner.java"),
									conf.isForceOverwrite());
						}

					}

				}
			}
		}

	}

	private void generateLauncher(GenModel conf, IPath projectPath)
			throws JETException, CoreException {
		
		String mainClass = null;
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

	/**
	 * Check if an EOperation is runnable via for the generation the main and class method
	 * @param eop
	 * @return
	 */
	private boolean isRunnable(EOperation eop) {
		for (EParameter eparam : eop.getEParameters()) {
			if (eparam.getEType().getName().equals("String")) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
}
