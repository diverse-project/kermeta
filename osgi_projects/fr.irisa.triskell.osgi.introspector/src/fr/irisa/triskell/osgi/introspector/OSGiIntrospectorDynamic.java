package fr.irisa.triskell.osgi.introspector;

import jar.Class;
import jar.Folder;
import jar.JarFactory;
import jar.Package;
import jar.SystemEntry;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Properties;

import manifest.MANIFEST;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

import fr.irisa.triskell.osgi.introspector.generator.Parser;
import fr.irisa.triskell.osgi.introspector.generator.Resolver;
import fr.irisa.triskell.osgi.introspector.generator.ResolverDynamic;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;

/**
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * 
 * This class is used to generate an OSGi model of the framework which is
 * launched.<br />
 * This generation is dynamic :<br />
 * All references to {@link Bundle}, {@link Package}, {@link Class} are
 * resolved.
 * 
 */
public class OSGiIntrospectorDynamic {

	private BundleContext context;
	private OSGiIntrospectorUtil util;
	private Parser parser;
	private Framework framework;

	public OSGiIntrospectorDynamic(BundleContext context,
			OSGiIntrospectorUtil util) {
		this.context = context;
		this.util = util;
	}

	/**
	 * This function is used to launch the introspection of the OSGi application
	 * where this bundle is launched
	 * 
	 * @param XMIFilePath
	 *            a File path where we want save the result of the
	 *            introspection.
	 */
	public void introspect(String XMIFilePath, boolean systemRepresentation) {
		util.setLoggerProperties(XMIFilePath.substring(0, XMIFilePath
				.lastIndexOf(File.separator)));
		this.framework = FrameworkFactory.eINSTANCE.createFramework();
		this.parser = new Parser(util);
		for (org.osgi.framework.Bundle bundle : this.context.getBundles()) {
			// do not include this bundle in the processing
			if (!bundle.getSymbolicName().contains(
					context.getBundle().getSymbolicName())) {
				this.generateBundle(bundle, systemRepresentation);
			}
		}
		// TODO vérification du log ainsi que dans Static
		this.resolve(systemRepresentation);
		util.saveModel(XMIFilePath, this.framework);

		util.shutdownLoggers();
	}

	/**
	 * This function is used to create the {@link Bundle} representation of an
	 * OSGi {@link org.osgi.framework.Bundle} with his {@link MANIFEST}, his
	 * {@link Folder} and his {@link Package}
	 * 
	 * @param bundle
	 *            an OSGi {@link org.osgi.framework.Bundle} that you want
	 *            represent as {@link Bundle}
	 * @return true if the representation is OK, false else.
	 */
	@SuppressWarnings("unchecked")
	private boolean generateBundle(org.osgi.framework.Bundle bundle,
			boolean systemRepresentation) {

		Bundle bundleRepresentation = this.getBundleRepresentation(bundle,
				systemRepresentation);
		bundleRepresentation.setLocation(this.getBundleLocation(bundle));
		if (bundleRepresentation.getLocation() == null) {
			bundleRepresentation.setLocation(bundle.getLocation());
		}
		bundleRepresentation.setId(bundle.getBundleId());

		StringBuffer manifestStringRepresentation = new StringBuffer("");
		Dictionary<String, String> dictionary = bundle.getHeaders();
		Enumeration<String> manifestEntries = dictionary.keys();

		while (manifestEntries.hasMoreElements()) {
			String key = manifestEntries.nextElement();
			String value = dictionary.get(key);
			manifestStringRepresentation.append(key);
			manifestStringRepresentation.append(": ");
			manifestStringRepresentation.append(value);
			manifestStringRepresentation.append("\n");
		}
		// TODO gestion de systemRepresentation
		boolean valid = this.parser.parse(manifestStringRepresentation
				.toString(), bundleRepresentation);

		if (valid) {
			this.framework.addBundle(bundleRepresentation);
		}
		return valid;
	}

	/**
	 * This function create the {@link Bundle} representation of an OSGi
	 * {@link org.osgi.framework.Bundle}
	 * 
	 * @param bundle
	 *            is an OSGi {@link org.osgi.framework.Bundle}
	 * @return a {@link Bundle} which represents the OSGi
	 *         {@link org.osgi.framework.Bundle}
	 */
	private Bundle getBundleRepresentation(org.osgi.framework.Bundle bundle,
			boolean systemRepresentation) {
		Bundle systemBundleRepresentation = FrameworkFactory.eINSTANCE
				.createBundle();

		if (systemRepresentation) {
			Folder rootFolder = generateSystemEntries(bundle, "/");
			systemBundleRepresentation.setFolder(rootFolder);

			Package rootPackage = JarFactory.eINSTANCE.createPackage();
			rootPackage.setName("");
			rootPackage.setFullPath("");
			systemBundleRepresentation.setPackage(rootPackage);
		}
		return systemBundleRepresentation;
	}

	/**
	 * This function is used to generate all entry representation of a bundle
	 * 
	 * @param bundle
	 *            the OSGi {@link org.osgi.framework.Bundle} which contains all
	 *            information about the bundle
	 * @param path
	 *            a String which represents a path into the bundle. This path
	 *            must begin with "/"
	 * @return A folder which is the system representation of the bundle. This
	 *         folder contains all {@link jar.File} and all {@link Folder} which
	 *         represents an entry into the bundle.
	 */
	@SuppressWarnings("unchecked")
	private Folder generateSystemEntries(org.osgi.framework.Bundle bundle,
			String path) {
		Folder folder = JarFactory.eINSTANCE.createFolder();
		path = path.substring(1).replace("\\", "/");
		folder.setFullPath(path);
		String[] tmp = path.split("/");
		folder.setName(tmp[tmp.length - 1]);
		Enumeration<String> bundlePaths = bundle.getEntryPaths("/" + path);
		if (bundlePaths != null) {
			while (bundlePaths.hasMoreElements()) {
				String pathTmp = bundlePaths.nextElement().replace("\\", "/");
				SystemEntry f;
				if (pathTmp.endsWith("/")) {
					f = generateSystemEntries(bundle, "/" + pathTmp);
					folder.addEntry(f);
				} else {
					f = JarFactory.eINSTANCE.createFile();
					f.setFullPath(pathTmp);
					int i = folder.getFullPath().length();
					f.setName(pathTmp.substring(i));
					folder.addEntry(f);
				}
			}
		}
		return folder;
	}

	/**
	 * This function is used to locate the bundle on the file system.
	 * 
	 * @param bundle
	 *            the {@link org.osgi.framework.Bundle} object <b>When the
	 *            bundle is the SystemBundle, this function return null</b>
	 * @return a {@link String} which represents the absolute path to the bundle
	 *         location or null if the location is invalid.
	 */
	private String getBundleLocation(org.osgi.framework.Bundle bundle) {
		if (bundle.getLocation().equals(Constants.SYSTEM_BUNDLE_LOCATION)) {
			return bundle.getLocation();
		}
		StringBuilder sb = new StringBuilder(bundle.getLocation());
		if (sb.charAt(sb.length() - 1) == '/') {
			sb.setLength(sb.length() - 1);
		}

		int idx = sb.indexOf("file:");
		if (idx < 0) {
			//In equinox URL is not wellformed
			// here, the URL begin with "update@"
			if (sb.toString().startsWith("update@")) {
				sb.delete(0, 7);
				sb.insert(0, System.getProperty("osgi.install.area"));
				try {
					URL u = new URL(sb.toString());
					File f = new File(u.getFile());
					return f.getAbsolutePath();
				} catch (MalformedURLException e) {
					return null;
				}
			}
			return null;
		}

		try {
			URL url = new URL(sb.toString());
			File file = new File(url.getFile());
			if (file.exists()) {
				return file.getAbsolutePath();
			}
		} catch (MalformedURLException mue) {
			// in Equinox the URL is not wellformed, which is taken care of by
			// the code below
			if (idx >= 0) {
				sb.delete(0, idx + 5);
				sb.insert(0, System.getProperty("osgi.install.area"));
				try {
					URL u = new URL(sb.toString());
					File f = new File(u.getFile());
					return f.getAbsolutePath();
				} catch (MalformedURLException e) {
					return null;
				}
			}
		}
		return null;

	}

	/**
	 * This function is used to resolve all unresolved references like :<br/ >
	 * Require-Bundle<br/ > Fragment-Host<br/ > Export-Package<br/ >
	 * Export-Service<br/ > Import-Package<br/ > Import-Service<br/ > This
	 * function resolve many references dynamically.
	 * 
	 * @return true if the resolution is OK, false else.
	 */
	public boolean resolve(boolean systemRepresentation) {
		Resolver resolver = new ResolverDynamic(context, util,
				systemRepresentation);
		resolver.resolveRequireBundle(this.parser.getUnresolvedRequireBundle(),
				this.framework);
		resolver.resolveFragmentHost(this.framework, this.parser
				.getFragmentHostReferences());
		resolver.resolveBundleClassPath(this.parser
				.getUnresolvedBundleClassPath());
		resolver.resolveBundleNativeCode(this.parser
				.getUnresolvedBundleNativeCode());
		resolver.resolveExportPackage(this.parser.getUnresolvedExportPackage());
		resolver.resolveExportPackageExclude(this.parser
				.getUnresolvedExportPackageExclude());
		resolver.resolveExportPackageInclude(this.parser
				.getUnresolvedExportPackageInclude());
		resolver.resolveActivationPolicyExclude(this.parser
				.getUnresolvedActivationPolicyExclude());
		resolver.resolveActivationPolicyInclude(this.parser
				.getUnresolvedActivationPolicyInclude());
		resolver.resolveActivator(this.parser.getUnresolvedActivator());
		resolver.resolveImportPackage(this.parser.getUnresolvedImportPackage(),
				this.framework);
		resolver.resolveExportService(this.parser.getUnresolvedExportService());
		resolver.resolveExportPackageUses(this.parser
				.getUnresolvedExportPackageUsesValue(), this.parser
				.getUnresolvedExportPackageUsesBundle());
		resolver.resolveImportService(this.parser.getUnresolvedImportService(),
				this.parser.getServicesAvailable());
		// TODO return
		return true;
	}
}
