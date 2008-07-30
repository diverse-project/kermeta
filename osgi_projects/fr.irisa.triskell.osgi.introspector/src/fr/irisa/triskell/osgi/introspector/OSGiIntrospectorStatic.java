package fr.irisa.triskell.osgi.introspector;

import jar.Class;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;

import manifest.BadVersionValue;
import manifest.BundleActivator;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.ManifestFactory;
import manifest.Service;
import manifest.Version;
import option.AttributEntry;
import option.ExcludeClasses;
import option.IncludeClasses;
import option.Uses;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleContext;

import fr.irisa.osgi.manifest.parser.lexer.Lexer;
import fr.irisa.osgi.manifest.parser.lexer.LexerException;
import fr.irisa.osgi.manifest.parser.node.Start;
import fr.irisa.osgi.manifest.parser.parser.Parser;
import fr.irisa.osgi.manifest.parser.parser.ParserException;
import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;

public class OSGiIntrospectorStatic {
	// TODO utilisation de Logger

	private BundleContext context;

	private Translation translation;
	private FrameworkFactory frameworkFactory;
	private ManifestFactory manifestFactory;
	private JarFactory jarFactory;

	private Framework framework;

	// private String line;

	private Map<Bundle, String> log;

	private boolean introspectionWithoutError;

	public OSGiIntrospectorStatic(BundleContext context) {
		this.context = context;
		this.frameworkFactory = FrameworkFactory.eINSTANCE;
		this.manifestFactory = ManifestFactory.eINSTANCE;
		this.jarFactory = JarFactory.eINSTANCE;

		this.framework = this.frameworkFactory.createFramework();

		this.translation = new Translation();
	}

	/**
	 * This function is used to generate a complete framework with a location.
	 * It checks only the static information.
	 */
	public void generateFramework(String DirectoryFilePath, String XMIFilePath) {
		File f = new File(DirectoryFilePath);
		if (f.isDirectory()) {
			boolean validGeneration = true;
			String[] bundlePaths = f.list();
			for (String path : bundlePaths) {
				if ((f.getAbsolutePath() + File.separator + path).equals("C:\\Program Files\\eclipse 3.3.2\\plugins\\org.eclipse.pde.ui.templates_3.3.0.v20070608-1300.jar")) {
					System.out.println();
				}
				validGeneration = validGeneration
						&& this.generateBundle(f.getAbsolutePath()
								+ File.separator + path);
				/*
				 * if (!validGeneration) { break; }
				 */
			}
			this.log = translation.getLog();
			// this.resolve();

			if (validGeneration) {
				// this.resolve();
				this.introspectionWithoutError = validGeneration
						&& this.resolve();
				this.saveModel(XMIFilePath);
			} else {
				OSGiIntrospectorUtil
						.log(Level.SEVERE,
								"The introspection failed because a bundle is unvalid with several error(s)");
				this.displayLog();
			}
		} else {
			OSGiIntrospectorUtil.log(Level.SEVERE,
					"GenerateFramework take two parameters which are String."
							+ "\n" + "The first define a directory." + "\n"
							+ "The second define a file." + "\n");
		}
	}

	private boolean generateBundle(String bundlePath) {
		java.io.File f = new java.io.File(bundlePath);
		if (!f.exists()) {
			return false;
		}
		if (f.isDirectory()) {
			return this.generateWithDirectory(f);
		} else {
			try {
				return this.generateWithJar(f);
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
	}

	/**
	 * This function is used to generate all entry representation of a bundle
	 * This function is only used when the bundle is not a JAR file but a folder
	 * 
	 * @param directory
	 * @param folder
	 */
	private void generateSystemEntries(java.io.File directory, Folder folder) {
		String[] bundlePaths = directory.list();
		for (String path : bundlePaths) {
			java.io.File tmp = new java.io.File(directory.getAbsolutePath()
					+ java.io.File.separator + path);
			SystemEntry f;
			if (tmp.isDirectory()) {
				f = jarFactory.createFolder();
				f.setFullPath(folder.getFullPath() + tmp.getName() + "/");
				f.setName(tmp.getName());
				this.generateSystemEntries(tmp, (Folder) f);
				folder.addEntry(f);
			} else if (tmp.isFile()) {
				f = jarFactory.createFile();
				f.setFullPath(folder.getFullPath() + tmp.getName());
				f.setName(tmp.getName());
				folder.addEntry(f);
			}
		}
	}

	/**
	 * This function is used to create a Bundle representation with a directory
	 * which contains all resources
	 * 
	 * @param directory
	 *            the directory which contains the resources of the bundle.
	 * @return true if the generation is OK, false else
	 */
	private boolean generateWithDirectory(java.io.File directory) {
		java.io.File manifestFileTmp = new java.io.File(directory
				.getAbsolutePath()
				+ java.io.File.separator
				+ "META-INF"
				+ java.io.File.separator
				+ "MANIFEST.MF");
		if (manifestFileTmp.isFile()) {
			Bundle bundle = frameworkFactory.createBundle();
			bundle.setLocation(directory.getAbsolutePath());

			Folder rootFolder = jarFactory.createFolder();
			rootFolder.setName("");
			rootFolder.setFullPath("");
			bundle.setFolder(rootFolder);

			Package defaultPackage = jarFactory.createPackage();
			defaultPackage.setName("");
			defaultPackage.setFullPath("");
			bundle.setPackage(defaultPackage);

			this.generateSystemEntries(directory, rootFolder);

			try {
				java.io.File manifestFile = OSGiIntrospectorUtil
						.removeEOLBlank(manifestFileTmp);
				MANIFEST manifestRepresentation = manifestFactory
						.createMANIFEST();
				this.parse(manifestRepresentation, manifestFile, bundle);
				bundle.setManifest(manifestRepresentation);
				bundle.setLocation(directory.getAbsolutePath());
				if (this.translation.isValidTranslation()) {
					framework.addBundle(bundle);
				}
				return true;
				
			} catch (ParserException e) {
				// System.out.println(e.getMessage());
				// System.out.println(e.getToken().getText());
				// System.out.println(e.getToken().getClass());
				System.err.println(bundle.getLocation());
				e.printStackTrace();
				System.err.println("This error must not appears.");
				System.err
						.println("If it appears, maybe there are errors into the grammar.");
				return false;
			} catch (LexerException e) {
				// System.out.println(e.getMessage());
				System.err.println(bundle.getLocation());
				e.printStackTrace();
				System.err.println("This error must not appears.");
				System.err
						.println("If it appears, maybe there are errors into the grammar.");
				// e.printStackTrace();
				return false;
			} catch (IOException e) {
				System.err.println(bundle.getLocation());
				e.printStackTrace();
				System.err
						.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
								+ bundle.getLocation() + ".");
				return false;
			}
		}
		return true;
	}

	/**
	 * This function is used to generate a bundle with a JAR
	 * 
	 * @param jarFile
	 *            the file which represents the JAR file
	 * @return true if the generation is valid, false else
	 * @throws IOException
	 */
	private boolean generateWithJar(java.io.File jarFile) throws IOException {
		JarFile jar = new JarFile(jarFile);
		Manifest manifest = jar.getManifest();
		if (manifest != null) {

			Bundle bundle = frameworkFactory.createBundle();
			bundle.setLocation(jarFile.getAbsolutePath());

			Folder rootFolder = jarFactory.createFolder();
			rootFolder.setName("");
			rootFolder.setFullPath("");
			bundle.setFolder(rootFolder);

			Package defaultPackage = jarFactory.createPackage();
			defaultPackage.setName("");
			defaultPackage.setFullPath("");
			bundle.setPackage(defaultPackage);

			OSGiIntrospectorUtil.listAllEntriesIntoJarFile(jar, bundle);

			// This test is used because the Manifest function
			// write(OutputStream) can return a valid value except if
			// Manifest-Version entry is not define into the Manifest file.
			if (manifest.getMainAttributes().get(
					Attributes.Name.MANIFEST_VERSION) == null) {
				manifest.getMainAttributes().put(
						Attributes.Name.MANIFEST_VERSION, "1.0");
			}

			java.io.File manifestFileTmp = java.io.File.createTempFile(
					"manifesttmp", ".mf");
			manifest.write(new FileOutputStream(manifestFileTmp));
			java.io.File manifestFile = OSGiIntrospectorUtil
					.removeEOLBlank(manifestFileTmp);
			manifestFile.deleteOnExit();
			manifestFileTmp.delete();

			MANIFEST manifestRepresentation = manifestFactory.createMANIFEST();
			try {
				this.parse(manifestRepresentation, manifestFile, bundle);
				bundle.setManifest(manifestRepresentation);
				if (this.translation.isValidTranslation()) {
					framework.addBundle(bundle);
				}
			} catch (ParserException e) {
				System.err.println(bundle.getLocation());
				e.printStackTrace();
				System.err
						.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
								+ bundle.getLocation() + ".");
				return false;
			} catch (LexerException e) {
				System.err.println(bundle.getLocation());
				e.printStackTrace();
				System.err
						.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
								+ bundle.getLocation() + ".");
				// e.printStackTrace();
				return false;
			} catch (IOException e) {
				System.err.println(bundle.getLocation());
				e.printStackTrace();
				System.err
						.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
								+ bundle.getLocation() + ".");
				return false;
			}
		}
		return true;
	}

	/**
	 * This function is used to generate the entry representation of all entries
	 * into a JAR file.
	 * 
	 * @param jar
	 * @param getAll
	 *            when it's true, we generate all entry representation like
	 *            folders, files, packages and classes, but if it's false, we
	 *            generate only packages and classes.
	 * @param rootFolder
	 * @param bundle
	 * @param isBundleCLassPath
	 */
	/*
	 * private void listJavaElementIntoJarFile(JarFile jar, Bundle bundle,
	 * boolean isBundleCLassPath) { Enumeration<JarEntry> jarEntries =
	 * jar.entries(); while (jarEntries.hasMoreElements()) { JarEntry jarEntry =
	 * jarEntries.nextElement(); // If the entry define the MANIFEST file, I do
	 * nothing if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) { if
	 * (jarEntry.getName().endsWith(".class")) { Class clazz =
	 * jarMetaModelFactory.createClass(); String[] packages =
	 * jarEntry.getName().split("/"); clazz.setName(packages[packages.length -
	 * 1]); clazz.setFullPath(jarEntry.getName().replace("/", ".") .substring(
	 * 0, jarEntry.getName().length() - ".class".length())); Package rootPackage =
	 * bundle .getRootPackage(packages[0]); if (rootPackage == null) {
	 * rootPackage = jarMetaModelFactory.createPackage();
	 * rootPackage.setFullPath(packages[0]); rootPackage.setName(packages[0]);
	 * rootPackage.setBundleClassPath(isBundleCLassPath);
	 * bundle.addPackage(rootPackage); } rootPackage.addClass(clazz); } } } }
	 */

	/**
	 * This function is used to generate the MANIFEST representation with all
	 * entry MANIFEST representation
	 * 
	 * @param manifest
	 * @param manifestFile
	 * @param bundle
	 * @throws ParserException
	 * @throws LexerException
	 * @throws IOException
	 */
	private void parse(MANIFEST manifest, java.io.File manifestFile,
			Bundle bundle)
			throws /* BadVersionException, ValidDirectiveException, */ParserException,
			LexerException, IOException {
		Parser p = new Parser(new Lexer(new PushbackReader(new FileReader(
				manifestFile), 1000)));
		Start tree = p.parse();
		this.translation.setManifest(manifest);
		this.translation.setBundle(bundle);
		tree.apply(translation);
		manifest = translation.getManifest();
	}

	private boolean resolve() {
		this.resolveFragmentHost();
		this.resolveExportPackage();
		this.resolveExportPackageExclude();
		this.resolveExportPackageInclude();
		// this.resolveActivationPolicyExclude();
		// this.resolveActivationPolicyInclude();
		this.resolveActivator();
		this.resolveExportService();

		this.resolveExportPackageUses();
		this.resolveImportPackage();
		this.resolveImportService();
		// TODO return
		return true;
	}

	/**
	 * This function is used to resolve all Fragment-Host entry into the
	 * framework.
	 */
	private void resolveFragmentHost() {
		Map<Bundle, String> fragmentHosts = this.translation
				.getFragmentHostReferences();
		Map<Bundle, String> fragmentHostsTmp = this.translation
				.getFragmentHostReferences();
		for (Bundle fragment : fragmentHosts.keySet()) {
			boolean find = false;
			List<Bundle> hostBundles = new ArrayList<Bundle>();
			for (Bundle bundle : this.framework.getBundles()) {
				if (fragmentHosts.get(fragment).equals(
						bundle.getManifest().getBundleSymbolicName()
								.getSymbolicName())) {
					hostBundles.add(bundle);
					find = true;
				}
			}
			if (!find) {
				fragmentHostsTmp.put(fragment, fragmentHosts.get(fragment));
			} else {
				boolean versionDefined = false;
				boolean minNotInclude = false;
				boolean maxNotInclude = true;
				Version minVersion = null;
				Version maxVersion = null;
				List<AttributEntry> attributs = fragment.getManifest()
						.getFragmentHost().getOptions();
				for (AttributEntry attribut : attributs) {
					if (attribut.getToken().equals("bundle-version")) {
						versionDefined = true;
						String value = attribut.getValue();
						if (value.startsWith("(")) {
							minNotInclude = true;
						}
						if (value.endsWith("]")) {
							maxNotInclude = false;
						}
						value = value.replace("(", "").replace("[", "")
								.replace(")", "").replace("]", "").replace(
										"\"", "");
						String[] versionsValue = value.split(",");
						if (versionsValue.length == 2) {
							try {
								maxVersion = this.manifestFactory
										.createVersion();
								maxVersion.setVersionValue(versionsValue[1]);
							} catch (BadVersionValue e) {
								maxVersion = null;
								this.log
										.put(
												fragment,
												this.log.get(fragment)
														+ "An attribut for Fragment-Host entry is unvalid."
														+ "\n"
														+ attribut.getValue()
														+ " is unvalid" + "\n");
							}
						}
						try {
							minVersion = this.manifestFactory.createVersion();
							minVersion.setVersionValue(versionsValue[0]);
						} catch (BadVersionValue e) {
							minVersion = null;
							this.log
									.put(
											fragment,
											this.log.get(fragment)
													+ "An attribut for Fragment-Host entry is unvalid."
													+ "\n"
													+ attribut.getValue()
													+ " is unvalid" + "\n");
						}

						break;
					}
				}
				Bundle bundleVersionMax = null;
				for (Bundle host : hostBundles) {
					Version versionHost = null;
					if (host.getManifest().getBundleVersion() == null) {
						versionHost = this.manifestFactory.createVersion();
						versionHost.setMajor(0);
						versionHost.setMinor(0);
						versionHost.setMicro(0);
					} else {
						versionHost = host.getManifest().getBundleVersion()
								.getVersion();
					}
					if (versionDefined) {
						if (versionHost.greaterThan(minVersion, minNotInclude)
								&& versionHost.lesserThan(maxVersion,
										maxNotInclude)) {
							if (bundleVersionMax == null
									|| versionHost
											.greaterThan(bundleVersionMax
													.getManifest()
													.getBundleVersion()
													.getVersion(), true/*
																		 * unused
																		 * because
																		 * it's
																		 * impossible
																		 * to
																		 * have
																		 * two
																		 * bundle
																		 * with
																		 * the
																		 * same
																		 * symbolic
																		 * name
																		 * and
																		 * the
																		 * same
																		 * version
																		 */)) {
								bundleVersionMax = host;
							}
						}
					} else if (bundleVersionMax == null
							|| versionHost
									.greaterThan(bundleVersionMax.getManifest()
											.getBundleVersion().getVersion(),
											true/*
												 * unused because it's
												 * impossible to have two bundle
												 * with the same symbolic name
												 * and the same version
												 */)) {
						bundleVersionMax = host;
					}
				}
				if (bundleVersionMax != null) {
					bundleVersionMax.addFragment(fragment);
					fragment.getManifest().getFragmentHost().setBundle(
							bundleVersionMax);
				}
			}
		}
		if (fragmentHostsTmp.size() > 0) {
			for (Bundle bundle : fragmentHostsTmp.keySet()) {
				String log = this.log.get(bundle);
				if (log == null) {
					log = bundle.getLocation() + "\n";
				}
				log += "The Fragment-Host entry is not valid :" + "\n";
				log += "\t" + fragmentHostsTmp.get(bundle) + "\n";
				this.log.put(bundle, log);
			}
		}
	}

	/**
	 * This function is used to resolve all Export-Package entry.
	 */
	private void resolveExportPackage() {
		List<ExportPackage> exportPackageMaybeUnvalid = new ArrayList<ExportPackage>();
		Map<ExportPackage, List<String>> unresolvedExportPackage = this.translation
				.getUnresolvedExportPackageValue();
		for (ExportPackage exportPackage : unresolvedExportPackage.keySet()) {
			List<String> exportPackageReference = unresolvedExportPackage
					.get(exportPackage);
			List<String> exportPackageReferenceTmp = new ArrayList<String>();
			Bundle bundle = this.translation.getUnresolvedExportPackageBundle()
					.get(exportPackage);

			// First research into local class path
			for (String reference : exportPackageReference) {
				Package _package = bundle.getPackage().getPackage(reference);
				if (_package != null) {
					exportPackage.addExportPackage(_package);
				} else {
					exportPackageReferenceTmp.add(reference);
				}
			}
			if (exportPackageReferenceTmp.size() > 0) {
				exportPackageReference = new ArrayList<String>();
				// Second research into Fragment class path
				for (String reference : exportPackageReferenceTmp) {
					boolean find = false;
					for (Bundle fragment : bundle.getFragments()) {
						Package _package = fragment.getPackage().getPackage(
								reference);
						if (_package != null) {
							exportPackage.addExportPackage(_package);
							find = true;
							break;
						}
					}
					if (!find) {
						this.log.put(bundle, this.log.get(bundle) + reference
								+ " is not a valid package." + "\n"
								+ "Maybe the folder "
								+ reference.replace(".", "/")
								+ " don't contain class file." + "\n");
						exportPackageMaybeUnvalid.add(exportPackage);
					}
				}
			}
		}
		for (ExportPackage exportPackage : exportPackageMaybeUnvalid) {
			if (exportPackage.getPackages().size() == 0) {
				this.translation.getUnresolvedExportPackageBundle().get(
						exportPackage).getManifest().removeExportPackage(
						exportPackage);
			}
		}
	}

	private void resolveExportPackageExclude() {
		Map<ExcludeClasses, List<String>> exclude = this.translation
				.getUnresolvedExportPackageExcludeValue();

		for (ExcludeClasses excludeClass : exclude.keySet()) {
			ExportPackage entry = this.translation
					.getUnresolvedExportPackageExcludeExportPackage().get(
							excludeClass);
			for (String value : exclude.get(excludeClass)) {
				List<Class> classes = new ArrayList<Class>();
				for (Package _package : entry.getPackages()) {
					classes.addAll(_package.getClassWithRegex(value));
				}
				if (classes.size() > 0) {
					for (Class clazz : classes) {
						excludeClass.addExclude(clazz);
					}
				} else {
					// TODO log
				}
			}
		}

	}

	private void resolveExportPackageInclude() {
		Map<IncludeClasses, List<String>> include = this.translation
				.getUnresolvedExportPackageIncludeValue();

		for (IncludeClasses includeClass : include.keySet()) {
			ExportPackage entry = this.translation
					.getUnresolvedExportPackageExcludeExportPackage().get(
							includeClass);
			for (String value : include.get(includeClass)) {
				List<Class> classes = new ArrayList<Class>();
				for (Package _package : entry.getPackages()) {
					classes.addAll(_package.getClassWithRegex(value));
				}
				if (classes.size() > 0) {
					for (Class clazz : classes) {
						includeClass.addInclude(clazz);
					}
				} else {
					// TODO log
				}
			}
		}
	}

	private void resolveExportPackageUses() {
		// this.translation.getUnresolvedExportPackageUsesBundle();
		// this.translation.getUnresolvedExportPackageUsesValue();
		Map<Uses, List<String>> usesValue = this.translation
				.getUnresolvedExportPackageUsesValue();
		for (Uses value : usesValue.keySet()) {
			for (String _package : usesValue.get(value)) {
				value.addPackage(_package);
			}

		}
	}

	private void resolveImportPackage() {
		Map<ImportPackage, List<String>> importPackages = this.translation
				.getImportPackageReferences();
		for (ImportPackage value : importPackages.keySet()) {
			for (String _package : importPackages.get(value)) {
				value.addPackage(_package);
			}

		}
	}

	private void resolveImportService() {
		Map<ImportService, String> importService = this.translation
				.getImportServiceReferences();
		for (ImportService value : importService.keySet()) {
			value.setService(importService.get(value));

		}
	}

	private void resolveActivator() {
		Map<BundleActivator, Bundle> bundles = this.translation
				.getUnresolvedActivatorBundle();
		Map<BundleActivator, String> activators = this.translation
				.getUnresolvedActivatorValue();

		for (BundleActivator value : activators.keySet()) {
			Class element = bundles.get(value).getPackage().getClass(
					activators.get(value));
			if (element != null) {
				value.setActivator(element);
			} else {
				this.log.put(bundles.get(value), this.log.get(bundles
						.get(value))
						+ "The activator reference "
						+ activators.get(value)
						+ " is not valid." + "\n");
				bundles.get(value).getManifest().setBundleActivator(null);
			}
		}
	}

	private void resolveExportService() {
		Map<Service, Bundle> bundles = this.translation
				.getUnresolvedExportServiceBundle();
		Map<Service, String> services = this.translation
				.getUnresolvedExportServiceValue();
		List<Service> tmp = new ArrayList<Service>();
		for (Service service : services.keySet()) {
			String serviceReference = services.get(service);
			Class element = bundles.get(service).getPackage().getClass(
					serviceReference);
			if (element != null) {
				service.setInterface(element);
				tmp.add(service);
			}
		}
		if (tmp.size() > 0) {
			for (Service service : tmp) {
				this.log.put(bundles.get(service), this.log.get(bundles
						.get(service))
						+ "The export service reference "
						+ services.get(service) + " is not valid." + "\n");
			}
		}
	}

	/**
	 * This function is used to convert a folder representation into a package
	 * representation
	 * 
	 * @param bundle
	 * @param folder
	 * @return
	 */
	/*
	 * public Package convertFolderToPackage(Bundle bundle, Folder folder) {
	 * Package _package = jarFactory.createPackage();
	 * _package.setFullPath(folder.getFullPath());
	 * _package.setName(folder.getName()); _package.setBundleClassPath(false);
	 * for (SystemEntry entry : folder.getEntries()) { if (entry instanceof
	 * Folder) { _package.addPackage(this.convertFolderToPackage(bundle,
	 * (Folder)entry)); } else if (entry instanceof File) { if
	 * (entry.getName().endsWith(".class")) { Class clazz =
	 * jarFactory.createClass(); clazz.setFullPath(entry.getFullPath());
	 * clazz.setName(entry.getName()); _package.addClass(clazz); } } } return
	 * _package; }
	 */

	/*
	 * private Package convertToJavaElement(Folder folder) { Package _package =
	 * null; for (SystemEntry entry : folder.getEntries()) { if (entry
	 * instanceof Folder) { Package tmp =
	 * this.convertToJavaElement((Folder)entry); if (tmp != null) { if (_package ==
	 * null) { _package = jarFactory.createPackage();
	 * _package.setName(folder.getName());
	 * _package.setFullPath(folder.getFullPath().replace("/", ".")); }
	 * _package.addPackage(tmp); } } else { if
	 * (entry.getFullPath().endsWith(".class")) { if (_package == null) {
	 * _package = jarFactory.createPackage();
	 * _package.setName(folder.getName());
	 * _package.setFullPath(folder.getFullPath().replace("/", ".")); } Class
	 * clazz = jarFactory.createClass();
	 * clazz.setName(entry.getName().substring(0,
	 * entry.getName().indexOf(".class")));
	 * clazz.setFullPath(entry.getFullPath().replace(".class", "").replace("/",
	 * ".")); _package.addClass(clazz); } } }
	 * 
	 * return _package; }
	 */

	/**
	 * This function is used to generate the XMI file which represent an OSGi
	 * framework.
	 * 
	 * @param XMIFilePathToSave
	 *            the path of the XMI file which will create
	 * @return true if the generation is ok, false else
	 */
	private boolean saveModel(String XMIFilePathToSave) {
		java.io.File XMIFile = new java.io.File(XMIFilePathToSave);

		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(XMIFile.getAbsolutePath());

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);

		// Add the book and writer objects to the contents.
		resource.getContents().add(framework);
		// resource.getContents().add(writer);

		// Save the contents of the resource to the file system.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			// TODO utilisation du log
			return false;
		}
		OSGiIntrospectorUtil.log(Level.INFO, "Introspection saved into "
				+ XMIFilePathToSave);
		return true;
	}

	private void displayLog() {
		for (Bundle bundle : this.log.keySet()) {
			if (!this.log.get(bundle).equals("")) {
				System.err.println(bundle.getLocation());
				System.err.println(this.log.get(bundle));
			}
		}
	}
}
