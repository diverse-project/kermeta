package fr.irisa.triskell.dosgi.bundle.management.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.osgi.service.obr.RepositoryAdmin;
import org.osgi.service.obr.Requirement;
import org.osgi.service.obr.Resolver;
import org.osgi.service.packageadmin.ExportedPackage;
import org.osgi.service.packageadmin.PackageAdmin;
import org.osgi.service.packageadmin.RequiredBundle;
import org.osgi.util.tracker.ServiceTracker;

import fr.irisa.triskell.dosgi.bundle.management.BundleManagement;

public class BundleManagementImpl implements BundleManagement {

	private BundleContext bundleContext;

	public BundleManagementImpl(BundleContext context) {
		this.bundleContext = context;
	}

	public BundleContext getBundleContext() {
		return bundleContext;
	}

	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	@Override
	public long install(String location) {
		try {
			return bundleContext.installBundle(location).getBundleId();
		} catch (BundleException e) {
			if (e.getCause() instanceof MalformedURLException) {
				System.err
						.println("your location String is not a valid URL definition.");
			} else if (e.getCause() instanceof FileNotFoundException) {
				System.err.println("The file \"" + location
						+ "\" doesn't exist");
			} else {
				// With Felix, a StackTrace appears even if I handle the
				// BundleException when a bundle is already install with the
				// same Bundle-SymbolicName and the same Bundle-Version
				long bundleId = -1;
				Map<String, String> manifestEntries = getManifestEntries(location);
				if (manifestEntries.size() >= 1) {
					String symbolicName = manifestEntries
							.get(Constants.BUNDLE_SYMBOLICNAME);
					String version = manifestEntries
							.get(Constants.BUNDLE_VERSION);
					if (version == null) {
						version = "0.0.0";
					}
					bundleId = findBundleId(symbolicName, version);
				}
				if (bundleId > -1) {
					return bundleId;
				} else {
					System.err
							.println("Error(s) appears during installation.\nMaybe your JAR file is unvalid");
					// e.printStackTrace();
				}
			}
			return -1;
		}
	}

	/**
	 * This function is used to get all entries defined into the manifest of a
	 * JAR
	 * 
	 * @param location
	 *            the location URL of the JAR
	 * @return a {@link Map} which contains all entries as {@link String}
	 */
	private Map<String, String> getManifestEntries(String location) {
		Map<String, String> result = new HashMap<String, String>();
		try {
			File file = bundleContext.getDataFile(System.currentTimeMillis()
					+ ".jar");
			if (file.exists()) {
				file.delete();
			}
			try {
				file.createNewFile();
				FileOutputStream output = new FileOutputStream(file);
				InputStream input = new URL(location).openConnection()
						.getInputStream();
				byte[] bytes = new byte[1024];
				int length = 0;
				int offset = 0;
				while ((length = input.read(bytes)) > 0) {
					output.write(bytes, 0, length);
					offset += length;
				}
				input.close();
				output.flush();
				output.close();
			} catch (FileNotFoundException e) {
				// TODO
				// e.printStackTrace();
			} catch (IOException e) {
				// TODO
				// e.printStackTrace();
			}

			JarFile jarFile = new JarFile(file);
			Attributes entries = jarFile.getManifest().getMainAttributes();
			for (Object key : entries.keySet()) {
				result
						.put(((Name) key).toString(), entries.get(key)
								.toString());
			}
			jarFile.close();
			file.delete();
		} catch (IOException e) {
			// TODO
			// e.printStackTrace();
		}
		return result;
	}

	@Override
	public long install(String bundleSymbolicName, String version,
			String bundleRepositoryLocation) {
		ServiceTracker serviceTrackerRepositoryAdmin = new ServiceTracker(
				bundleContext, RepositoryAdmin.class.getName(), null);
		serviceTrackerRepositoryAdmin.open();
		RepositoryAdmin repositoryAdmin = ((RepositoryAdmin) serviceTrackerRepositoryAdmin
				.getService());
		if (repositoryAdmin != null) {
			// Add the repository if it is not null
			try {
				if (bundleRepositoryLocation != null) {
					URL url = new URL(bundleRepositoryLocation);
					repositoryAdmin.addRepository(url);
				}
			} catch (MalformedURLException e) {
				System.err
						.println("The bundleRepositoryLocation parameter must be a valid URL address");
			} catch (Exception e) {
				// e.printStackTrace();
				// TODO
			}

			String filter = this.createFilter(bundleSymbolicName, version);
			org.osgi.service.obr.Resource[] resources = repositoryAdmin
					.discoverResources(filter);
			if (resources != null && resources.length > 0) {
				Resolver resolver = repositoryAdmin.resolver();
				resolver.add(resources[0]);
				if (resolver.resolve()) {
					resolver.deploy(true);
					return findBundleId(bundleSymbolicName, version);
				} else {
					Requirement[] reqs = resolver.getUnsatisfiedRequirements();
					for (int i = 0; i < reqs.length; i++) {
						System.err.println("Unable to resolve: "
								+ reqs[i].getFilter());
					}
					return -1;
				}
			}
		}
		serviceTrackerRepositoryAdmin.close();
		return -1;
	}

	private String createFilter(String bundleSymbolicName, String version) {
		if (version == null) {
			// TODO test
			return "(&(symbolicname=" + bundleSymbolicName + "))";
		} else {
			return "(&(symbolicname=" + bundleSymbolicName + ") (version="
					+ version + "))";
		}
	}

	@Override
	public long moveBundle(long bundleId, BundleManagement remoteManager) {
		long remoteBundleId = this.duplicateBundle(bundleId, remoteManager);
		if (remoteBundleId > -1) {
			this.uninstall(bundleId);
		}
		return remoteBundleId;
	}

	@Override
	public long duplicateBundle(long bundleId, BundleManagement remoteManager) {
		// TODO Maybe it can be better to call only once the remote service
		// So it could be interesting to simply use the HTTPService even if it
		// is necessary to copy the jar on the persistent data folder
		// but maybe not ... (do two implementations)
		// TODO It must be better to test with many platform on different
		// computers
		if (bundleId > -1) {
			Bundle bundle = bundleContext.getBundle(bundleId);
			long remoteBundleId = -1;
			/*String location = (String) bundle.getHeaders().get(
					Constants.BUNDLE_UPDATELOCATION);
			if (location != null) {
				remoteBundleId = remoteManager.install(location);
				if (remoteBundleId > -1) {
					return remoteBundleId;
				}
			}

			String bundleSymbolicName = bundle.getSymbolicName();
			String version = (String) bundle.getHeaders().get(
					Constants.BUNDLE_VERSION);
			
			String bundleRepositoryLocation = null;

			ServiceTracker serviceTrackerRepositoryAdmin = new ServiceTracker(
					bundleContext, RepositoryAdmin.class.getName(), null);
			serviceTrackerRepositoryAdmin.open();
			RepositoryAdmin repositoryAdmin = ((RepositoryAdmin) serviceTrackerRepositoryAdmin
					.getService());
			if (repositoryAdmin != null) {
				String filter = this.createFilter(bundleSymbolicName, version);
				org.osgi.service.obr.Resource[] resources = repositoryAdmin
						.discoverResources(filter);
				if (resources != null && resources.length > 0) {
					for (Resource resource : resources) {
						Resolver resolver = repositoryAdmin.resolver();
						resolver.add(resource);
						if (resolver.resolve()) {
							// TODO maybe select a repository available on the
							// network
							bundleRepositoryLocation = resources[0]
									.getRepository().getURL().toExternalForm();
							remoteBundleId = remoteManager.install(
									bundleSymbolicName, version,
									bundleRepositoryLocation);
							if (remoteBundleId > -1) {
								break;
							}
						}
					}
				} else {
				}
			} else {
			}
			serviceTrackerRepositoryAdmin.close();*/

			// Maybe the bundle is already available with a HTTPService
			if (new File(bundle.getLocation()).exists()) {
				remoteBundleId = remoteManager.install(bundle.getLocation());
			}
			if (remoteBundleId == -1) {
				String bundleSymbolicName = bundle.getSymbolicName();
				String version = (String) bundle.getHeaders().get(
						Constants.BUNDLE_VERSION);
				// TODO work fine with Felix
				// need to test more with other platform
				ServiceTracker tracker = new ServiceTracker(bundleContext,
						HttpService.class.getName(), null);
				tracker.open();
				HttpService service = (HttpService) tracker.getService();
				try {
					File file = bundleContext.getDataFile(bundle.getBundleId()
							+ ".jar");
					// TODO maybe do not delete the file if it already exists
					if (file.exists()) {
						file.delete();
					}
					try {
						file.createNewFile();
						FileOutputStream output = new FileOutputStream(file);
						InputStream input = new URL(bundle.getLocation())
								.openStream();
						byte[] bytes = new byte[1024];
						int length = 0;
						int offset = 0;
						while ((length = input.read(bytes)) > 0) {
							output.write(bytes, 0, length);
							offset += length;
						}
						input.close();
						output.flush();
						output.close();
					} catch (FileNotFoundException e) {
						// e.printStackTrace();
					} catch (IOException e) {
						// e.printStackTrace();
					}
					String alias = "/" + bundleSymbolicName + "_" + version;
					service.registerResources(alias, file.getName(),
							new HttpContextImpl());

					try {
						InetAddress address = InetAddress.getLocalHost();
						String bundleAddress = "http://"
								+ address.getHostAddress();
						if (bundleContext
								.getProperty("org.osgi.service.http.port") != null) {
							bundleAddress += ":"
									+ bundleContext
											.getProperty("org.osgi.service.http.port");

						}
						bundleAddress += "/" + alias;
						remoteBundleId = remoteManager.install(bundleAddress);
					} catch (UnknownHostException e) {
						// e.printStackTrace();
					}

				} catch (NamespaceException e1) {
					//e1.printStackTrace();
				}

			}
			return remoteBundleId;
		}
		return -1;
	}

	@Override
	public boolean start(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).start();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// // e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean stop(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).stop();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// // e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean uninstall(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).uninstall();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).update();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// e.printStackTrace();
			return false;
		}
	}

	public long findBundleId(String bundleSymbolicName, String version) {
		Bundle[] bundles = bundleContext.getBundles();
		for (int i = 0; i < bundles.length; i++) {
			Object bundleSymbolicNameHeader = bundles[i].getHeaders().get(
					Constants.BUNDLE_SYMBOLICNAME);
			if (bundleSymbolicNameHeader == null) {
				System.err
						.println("In a OSGi platform, a bundle cannot have an empty "
								+ Constants.BUNDLE_SYMBOLICNAME + " :");
				System.err.println("\t" + bundles[i].getLocation());
			} else if (bundleSymbolicNameHeader.toString().equals(
					bundleSymbolicName)) {
				if (bundles[i].getHeaders().get(Constants.BUNDLE_VERSION)
						.toString().equals(version)
						|| (bundles[i].getHeaders().get(
								Constants.BUNDLE_VERSION) == null && (version == null || (version
								.equals("0.0.0"))))) {
					return bundles[i].getBundleId();
				}
			}
		}
		return -1;
	}

	@Override
	public Long[] findBundleIds() {
		Bundle[] bundles = bundleContext.getBundles();
		Long[] bundleIds = new Long[bundles.length];
		for (int i = 0; i < bundles.length; i++) {
			bundleIds[i] = bundles[i].getBundleId();
		}
		return bundleIds;
	}

	@Override
	public Long[] getBundlesUsingService(String clazz, Object service) {
		ArrayList<Long> bundleIds = new ArrayList<Long>();
		ServiceReference[] references = null;
		try {
			references = bundleContext.getServiceReferences(clazz, null);
		} catch (InvalidSyntaxException e) {
			// Never appears because any filter is used
		}
		if (references != null) {
			for (ServiceReference reference : references) {
				if (bundleContext.getService(reference).equals(service)) {
					Bundle[] bundles = reference.getUsingBundles();
					if (bundles != null) {
						for (Bundle bundle : bundles) {
							bundleIds.add(bundle.getBundleId());
						}
					}
					break;
				}
			}
		}
		Long[] array = new Long[bundleIds.size()];
		bundleIds.toArray(array);
		return array;
	}

	@Override
	public Long[] getBundlesUsingPackages(long bundleId) {
		ArrayList<Long> bundleIds = new ArrayList<Long>();
		Bundle bundle = bundleContext.getBundle(bundleId);
		PackageAdmin packageAdmin = (PackageAdmin) bundleContext
				.getService(bundleContext
						.getServiceReference(PackageAdmin.class.getName()));
		if (packageAdmin != null) {
			ExportedPackage[] exportedPackages = packageAdmin
					.getExportedPackages(bundle);
			for (ExportedPackage exportedPackage : exportedPackages) {
				Bundle[] bundles = exportedPackage.getImportingBundles();
				for (Bundle importingBundle : bundles) {
					bundleIds.add(importingBundle.getBundleId());
				}
			}
			Long[] array = new Long[bundleIds.size()];
			bundleIds.toArray(array);
			return array;
		}
		// should not appears into OSGi R4.1
		System.err.println("There is no PackageAdmin service.");
		return new Long[0];
	}

	@Override
	public Long[] getBundlesRequiringBundle(long bundleId) {
		ArrayList<Long> bundleIds = new ArrayList<Long>();
		PackageAdmin packageAdmin = (PackageAdmin) bundleContext
				.getService(bundleContext
						.getServiceReference(PackageAdmin.class.getName()));
		if (packageAdmin != null) {
			RequiredBundle[] requiredBundles = packageAdmin
					.getRequiredBundles(null);
			for (RequiredBundle requiredBundle : requiredBundles) {
				if (requiredBundle.getBundle().getBundleId() == bundleId) {
					Bundle[] bundles = requiredBundle.getRequiringBundles();
					for (Bundle requiringBundle : bundles) {
						bundleIds.add(requiringBundle.getBundleId());
					}
				}
			}
			Long[] array = new Long[bundleIds.size()];
			bundleIds.toArray(array);
			return array;
		}
		// should not appears into OSGi R4.1
		System.err.println("There is no PackageAdmin service.");
		return new Long[0];
	}

	@Override
	public Long[] getFragmentBundles(long bundleId) {
		ArrayList<Long> bundleIds = new ArrayList<Long>();
		PackageAdmin packageAdmin = (PackageAdmin) bundleContext
				.getService(bundleContext
						.getServiceReference(PackageAdmin.class.getName()));
		if (packageAdmin != null) {
			Bundle[] fragments = packageAdmin.getFragments(bundleContext
					.getBundle(bundleId));
			for (Bundle fragment : fragments) {
				bundleIds.add(fragment.getBundleId());
			}
			Long[] array = new Long[bundleIds.size()];
			bundleIds.toArray(array);
			return array;
		}
		// should not appears into OSGi R4.1
		System.err.println("There is no PackageAdmin service.");
		return new Long[0];
	}

	@Override
	public long getHostBundle(long bundleId) {
		PackageAdmin packageAdmin = (PackageAdmin) bundleContext
				.getService(bundleContext
						.getServiceReference(PackageAdmin.class.getName()));
		if (packageAdmin != null) {
			return packageAdmin.getHosts(bundleContext.getBundle(bundleId))[0]
					.getBundleId();
		}
		// should not appears into OSGi R4.1
		System.err.println("There is no PackageAdmin service.");
		return -1;
	}

	public class HttpContextImpl implements HttpContext {

		@Override
		public String getMimeType(String name) {
			return null;
		}

		@Override
		public URL getResource(String name) {
			try {
				return bundleContext.getDataFile(name).toURI().toURL();
			} catch (MalformedURLException e) {
				// e.printStackTrace();
				return null;
			}
		}

		@Override
		public boolean handleSecurity(HttpServletRequest request,
				HttpServletResponse response) throws IOException {
			return true;
		}

	}
}
