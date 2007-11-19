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
 * This class is the Entry point of the generation for a Topcased editor defined
 * by a *.editorconfigurator file<br>
 * 
 * Creation : 26 avril 2006
 * 
 * @author <a href="mailto:jacques.lescot@anyware-tech.com">Jacques LESCOT</a>
 */
public class CompilerHelperGenerator extends AbstractGenerator {
	/** ******************** */
	/** JET Template files */
	/** ******************** */
	private static final String TEST_HELPER_JAVA = "templateHelper/helper/Helper.javajet";

	private static final String RUNNER_JAVA = "templateHelper/runner/Runner.javajet";

	private static final String JAVA_LAUNCHER_LAUNCH = "templateHelper/JavaLauncher.launchjet";

	private static final String KERMETA_LAUNCHER_LAUNCH = "templateHelper/KermetaLauncher.launchjet";

	/*
	 * private static final String IMAGE_REGISTRY_JAVA =
	 * "templateEditor/ImageRegistry.javajet";
	 * 
	 * private static final String EDITOR_ACTION_BAR_CONTRIBUTOR_JAVA =
	 * "templateEditor/actions/EditorActionBarContributor.javajet";
	 * 
	 * private static final String EDITOR_JAVA =
	 * "templateEditor/editor/Editor.javajet";
	 * 
	 * private static final String MODELER_PROVIDER_JAVA =
	 * "templateEditor/providers/ModelerProvider.javajet";
	 * 
	 * private static final String MODELER_PROVIDER_ADAPTER_FACTORY_JAVA =
	 * "templateEditor/providers/ModelerProviderAdapterFactory.javajet";
	 * 
	 * private static final String NEW_DIAGRAMS_JAVA =
	 * "templateEditor/wizards/NewDiagrams.javajet";
	 * 
	 * private static final String DIAGRAMS_PAGE_JAVA =
	 * "templateEditor/wizards/DiagramsPage.javajet";
	 * 
	 * private static final String IMAGES_PROPERTIES =
	 * "templateEditor/images.propertiesjet";
	 * 
	 * private static final String BUILD_PROPERTIES =
	 * "templateEditor/build.propertiesjet";
	 * 
	 * private static final String PLUGIN_XML = "templateEditor/plugin.xmljet";
	 * 
	 * private static final String MANIFEST_MF =
	 * "templateEditor/MANIFEST.MFjet";
	 * 
	 * private static final String PREFERENCE_PAGE_JAVA =
	 * "templateEditor/preferences/PreferencePage.javajet";
	 */

	/** The GenModel object */
	private GenModel configuration;

	private KermetaUnit kmUnit;
	private EcoreExporter km2ecoreGen;
	private HelperModel helperModel;

	/**
	 * Constructor
	 * 
	 * @param conf
	 *            The editor configuration to generate
	 */
	public CompilerHelperGenerator(GenModel conf, KermetaUnit kmUnit,
			EcoreExporter km2ecoreGen, HelperModel helperModel) {
		this.configuration = conf;
		this.kmUnit = kmUnit;
		this.km2ecoreGen = km2ecoreGen;
		this.helperModel = helperModel;
	}

	/**
	 * Launch the generation for the current editor configuration
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
		// generateProviders(configuration, pathProject, monitor);
		// generateEditor(configuration, pathProject, monitor);

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
				// The editorconfigurator plugin must be released to activate
				// the
				// generation.
				// addVariable("EDITOR_CONF", "org.kermeta.compiler.helper");
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
		
		String projectName = EcoreHelper.getQualifiedName(genpack.getEcorePackage());/*"kermeta"; project.getName();*/
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

	/**
	 * Generate providers classes of the genModel (inside providers package)
	 * 
	 * @param conf
	 * @param projectPath
	 * @param monitor
	 */
	/*
	 * private void generateProviders(EditorConfiguration conf, IPath
	 * projectPath, IProgressMonitor monitor) { try { monitor.subTask("Providers
	 * generation");
	 * 
	 * for (Iterator i =
	 * conf.getGenModel().getAllGenPackagesWithClassifiers().iterator();
	 * i.hasNext();) { GenPackage genPackage = (GenPackage) i.next();
	 * 
	 * generateModelerProviderAdapterFactory(conf, genPackage, projectPath);
	 * monitor.worked(1);
	 * 
	 * for (Iterator j = genPackage.getGenClasses().iterator(); j.hasNext();) {
	 * GenClass genClass = (GenClass) j.next(); generateModelerProvider(conf,
	 * genClass, projectPath); monitor.worked(1); } } } catch (JETException e) {
	 * GeneratorPlugin.log(e); GeneratorPlugin.displayDialog(null, "JETException :
	 * an error occured during editor generation. See error logs for more
	 * details.", IStatus.ERROR); } catch (CoreException e) {
	 * GeneratorPlugin.log(e); GeneratorPlugin.displayDialog(null,
	 * "CoreException : an error occured during providers generation. See error
	 * logs for more details.", IStatus.ERROR); } }
	 * 
	 * private void generateEditor(EditorConfiguration conf, IPath projectPath,
	 * IProgressMonitor monitor) { try {
	 * 
	 * monitor.subTask("Files creation");
	 * 
	 * generatePluginClass(conf, projectPath); generateImageRegistryClass(conf,
	 * projectPath);
	 * 
	 * generatePluginXML(conf, projectPath); generateManifestMF(conf,
	 * projectPath); generateImageProperties(conf, projectPath);
	 * generateBuildProperties(conf, projectPath);
	 * 
	 * generateEditorActionBarContributorClass(conf, projectPath);
	 * generateEditorClass(conf, projectPath); generatePreferencePage(conf,
	 * projectPath);
	 * 
	 * monitor.worked(1);
	 * 
	 * generateNewDiagramsClass(conf, projectPath);
	 * generateDiagramsPageClass(conf, projectPath);
	 * 
	 * monitor.worked(1); } catch (JETException e) { GeneratorPlugin.log(e);
	 * GeneratorPlugin.displayDialog(null, "JETException : an error occured
	 * during editor generation. See error logs for more details.",
	 * IStatus.ERROR); } catch (CoreException e) { GeneratorPlugin.log(e);
	 * GeneratorPlugin.displayDialog(null, "CoreException : an error occured
	 * during editor generation. See error logs for more details.",
	 * IStatus.ERROR); } }
	 *  // ---------------------------------------- // The generations common to
	 * the same editor // ---------------------------------------- private void
	 * generatePluginClass(EditorConfiguration conf, IPath projectPath) throws
	 * JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(PLUGIN_JAVA), projectPath.append("/" + SOURCE_DIRECTORY +
	 * "/" + conf.getProjectName().replace('.', '/') + "/" + conf.getPrefix() +
	 * "Plugin.java"), conf.isForceOverwrite()); }
	 * 
	 * private void generateImageRegistryClass(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(IMAGE_REGISTRY_JAVA), projectPath.append("/" +
	 * SOURCE_DIRECTORY + "/" + conf.getProjectName().replace('.', '/') + "/" +
	 * conf.getPrefix() + "ImageRegistry.java"), conf.isForceOverwrite()); }
	 * 
	 * private void generateEditorActionBarContributorClass(EditorConfiguration
	 * conf, IPath projectPath) throws JETException, CoreException {
	 * applyTemplate(conf, getTemplateURI(EDITOR_ACTION_BAR_CONTRIBUTOR_JAVA),
	 * projectPath.append("/src/" + conf.getProjectName().replace('.', '/') +
	 * "/actions/" + conf.getPrefix() + "EditorActionBarContributor.java"),
	 * conf.isForceOverwrite()); }
	 * 
	 * private void generateEditorClass(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(EDITOR_JAVA), projectPath.append("/" + SOURCE_DIRECTORY +
	 * "/" + conf.getProjectName().replace('.', '/') + "/editor/" +
	 * conf.getPrefix() + "Editor.java"), conf.isForceOverwrite()); }
	 * 
	 * private void generateNewDiagramsClass(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(NEW_DIAGRAMS_JAVA), projectPath.append("/" +
	 * SOURCE_DIRECTORY + "/" + conf.getProjectName().replace('.', '/') +
	 * "/wizards/New" + conf.getPrefix() + "Diagrams.java"),
	 * conf.isForceOverwrite()); }
	 * 
	 * private void generateDiagramsPageClass(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(DIAGRAMS_PAGE_JAVA), projectPath.append("/" +
	 * SOURCE_DIRECTORY + "/" + conf.getProjectName().replace('.', '/') +
	 * "/wizards/" + conf.getPrefix() + "DiagramsPage.java"),
	 * conf.isForceOverwrite()); }
	 * 
	 * private void generateImageProperties(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(IMAGES_PROPERTIES), projectPath.append("/" +
	 * SOURCE_DIRECTORY + "/" + conf.getProjectName().replace('.', '/') +
	 * "/images.properties"), conf.isForceOverwrite()); }
	 * 
	 * private void generatePluginXML(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(PLUGIN_XML), projectPath.append("/plugin.xml"),
	 * conf.isForceOverwrite()); }
	 * 
	 * private void generateManifestMF(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(MANIFEST_MF), projectPath.append("/META-INF/MANIFEST.MF"),
	 * conf.isForceOverwrite()); }
	 * 
	 * private void generateBuildProperties(EditorConfiguration conf, IPath
	 * projectPath) throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(BUILD_PROPERTIES),
	 * projectPath.append("/build.properties"), conf.isForceOverwrite()); }
	 *  // --------------------------------------------------------- // Generate
	 * the classes for the providers //
	 * ---------------------------------------------------------
	 * 
	 * private void generateModelerProviderAdapterFactory(EditorConfiguration
	 * conf, GenPackage genPackage, IPath projectPath) throws JETException,
	 * CoreException { Map map = new HashMap(); map.put("genPackage",
	 * genPackage); map.put("editorConfiguration", conf); applyTemplate(map,
	 * getTemplateURI(MODELER_PROVIDER_ADAPTER_FACTORY_JAVA),
	 * projectPath.append("/" + SOURCE_DIRECTORY + "/" +
	 * conf.getProjectName().replace('.', '/') + "/providers/" +
	 * genPackage.getPrefix() + "ModelerProviderAdapterFactory.java"),
	 * conf.isForceOverwrite()); }
	 * 
	 * private void generateModelerProvider(EditorConfiguration conf, GenClass
	 * genClass, IPath projectPath) throws JETException, CoreException { Map map =
	 * new HashMap(); map.put("genClass", genClass);
	 * map.put("editorConfiguration", conf); applyTemplate(map,
	 * getTemplateURI(MODELER_PROVIDER_JAVA), projectPath.append("/" +
	 * SOURCE_DIRECTORY + "/" + conf.getProjectName().replace('.', '/') +
	 * "/providers/" + genClass.getName() + "ModelerProvider.java"),
	 * conf.isForceOverwrite()); }
	 *  // --------------------------------------------------------- // Generate
	 * the classes for the preferences //
	 * --------------------------------------------------------- private void
	 * generatePreferencePage(EditorConfiguration conf, IPath projectPath)
	 * throws JETException, CoreException { applyTemplate(conf,
	 * getTemplateURI(PREFERENCE_PAGE_JAVA), projectPath.append("/" +
	 * SOURCE_DIRECTORY + "/" + conf.getProjectName().replace('.', '/') +
	 * "/preferences/" + conf.getPrefix() + "PreferencePage.java"),
	 * conf.isForceOverwrite()); }
	 */

	// ---------------------------------------------------------
	// Generate the classes for the helpers
	// ---------------------------------------------------------
	private void generateHelpers(GenModel conf, IPath projectPath,
			IProgressMonitor monitor) {
		try {

			monitor.subTask("Files creation");

			//generateTestHelpers(conf, projectPath);
			generateRunner(conf, projectPath);
			generateLauncher(conf, projectPath);

			/*
			 * generatePluginClass(conf, projectPath);
			 * generateImageRegistryClass(conf, projectPath);
			 * 
			 * generatePluginXML(conf, projectPath); generateManifestMF(conf,
			 * projectPath); generateImageProperties(conf, projectPath);
			 * generateBuildProperties(conf, projectPath);
			 * 
			 * generateEditorActionBarContributorClass(conf, projectPath);
			 * generateEditorClass(conf, projectPath);
			 * generatePreferencePage(conf, projectPath);
			 * 
			 * monitor.worked(1);
			 * 
			 * generateNewDiagramsClass(conf, projectPath);
			 * generateDiagramsPageClass(conf, projectPath);
			 */

			monitor.worked(1);
		} catch (JETException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"JETException : an error occured during editor generation. See error logs for more details.",
							IStatus.ERROR);
		} catch (CoreException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"CoreException : an error occured during editor generation. See error logs for more details.",
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
							"JETException : an error occured during editor generation. See error logs for more details.",
							IStatus.ERROR);
		} catch (CoreException e) {
			GeneratorPlugin.log(e);
			GeneratorPlugin
					.displayDialog(
							null,
							"CoreException : an error occured during editor generation. See error logs for more details.",
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
			System.out.println("tttttttttttttttoooooooooooo");
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
					/*
					 * //for(EOperation eop : eClass.getEOperations()) { String
					 * eClassQName =
					 * EcoreHelper.getQualifiedName((ENamedElement) eClass);
					 * 
					 * TypeDefinition eClassTypeDef =
					 * kmUnit.getTypeDefinitionByQualifiedName(eClassQName);
					 * 
					 * ClassDefinition cd = (ClassDefinition) eClassTypeDef;
					 * for(Operation op : cd.getOwnedOperation()) {
					 * 
					 * if(op!=null && op instanceof Operation) { Type opType =
					 * ((Operation) op).getType(); if( opType instanceof
					 * VoidType || opType instanceof StringLiteral) { EOperation
					 * eop = (EOperation)
					 * km2ecoreGen.getKm2ecoremapping().get(op);
					 * applyTemplate(eop, getTemplateURI(RUNNER_JAVA),
					 * projectPath.append("/" + SOURCE_DIRECTORY + "/" +
					 * "kermeta" + "/runner/" +
					 * CodeGenUtil.capName(EcoreHelper.getQualifiedName((ENamedElement)
					 * eop, "__")) + "_Runner.java"), conf.isForceOverwrite()); } } }
					 */

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
		boolean res = false;
		for (EParameter eparam : eop.getEParameters()) {
			if (eparam.getEType().getName().equals("String")) {
				res = true;
			} else {
				return false;
			}
		}
		res = true;
		return res;
	}
}
