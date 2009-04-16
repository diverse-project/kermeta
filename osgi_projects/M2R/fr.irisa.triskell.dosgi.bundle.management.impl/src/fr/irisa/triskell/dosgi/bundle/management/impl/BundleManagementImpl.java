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
import fr.irisa.triskell.dosgi.bundle.management.ServiceManagement;

public class BundleManagementImpl implements BundleManagement {

	private BundleContext bundleContext;

	private ServiceManagement serviceManager;

	public BundleManagementImpl(BundleContext context) {
		this.bundleContext = context;
	}

	public BundleContext getBundleContext() {
		return bundleContext;
	}

	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

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
				// TODO Exception
				// e.printStackTrace();
			} catch (IOException e) {
				// TODO Exception
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
			// TODO Exception
			// e.printStackTrace();
		}
		return result;
	}

	
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
				// TODO Exception
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

	
	public boolean moveBundle(long bundleId, String remoteLocation) {
		boolean duplicateOK = this.duplicateBundle(bundleId, remoteLocation);
		if (duplicateOK) {
			this.uninstall(bundleId);
		}
		return duplicateOK;
	}

	
	public boolean duplicateBundle(long bundleId, String remoteLocation) {
		// TODO It must be better to test with many platform on different
		// computers
		if (bundleId > -1) {
			Bundle bundle = bundleContext.getBundle(bundleId);
			long remoteBundleId = -1;
			// FIXME for the moment, it only works with felix dosgi RI
			String filter = "(&(osgi.remote=true) (osgi.remote.configuration.pojo.address="
					+ remoteLocation + "*))";
			BundleManagement remoteManager = null;
			Long[] remoteBundleManagerIds = serviceManager.findServiceIds(
					BundleManagement.class.getName(), filter, -1);
			if (remoteBundleManagerIds.length == 0) {
				return false;
			}
			remoteManager = (BundleManagement)serviceManager.getService(remoteBundleManagerIds[0]);

			// Maybe the bundle is already available with a HTTPService
			if (new File(bundle.getLocation()).exists()) {
				remoteBundleId = remoteManager.install(bundle.getLocation());
			}
			if (remoteBundleId == -1) {
				String bundleSymbolicName = bundle.getSymbolicName();
				String version = (String) bundle.getHeaders().get(
						Constants.BUNDLE_VERSION);
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
						// TODO Exception
					} catch (IOException e) {
						// e.printStackTrace();
						// TODO Exception
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
						bundleAddress += alias;
						System.out.println(bundleAddress);
						remoteBundleId = remoteManager.install(bundleAddress);
					} catch (UnknownHostException e) {
						// e.printStackTrace();
						// TODO Exception
					}

				} catch (NamespaceException e1) {
					// e1.printStackTrace();
					// TODO Exception
				}

			}
			serviceManager.ungetService(remoteBundleManagerIds[0]);
			return true;
		}
		return false;
	}

	
	public boolean start(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).start();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// // e.printStackTrace();
			// TODO Exception
			return false;
		}
	}

	
	public boolean stop(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).stop();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// // e.printStackTrace();
			// TODO Exception
			return false;
		}
	}

	
	public boolean uninstall(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).uninstall();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// e.printStackTrace();
			// TODO Exception
			return false;
		}
	}

	
	public boolean update(long bundleId) {
		try {
			if (bundleId > -1) {
				bundleContext.getBundle(bundleId).update();
				return true;
			}
			return false;
		} catch (BundleException e) {
			// e.printStackTrace();
			// TODO Exception
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

	
	public Long[] findBundleIds() {
		Bundle[] bundles = bundleContext.getBundles();
		Long[] bundleIds = new Long[bundles.length];
		for (int i = 0; i < bundles.length; i++) {
			bundleIds[i] = bundles[i].getBundleId();
		}
		return bundleIds;
	}

	
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

		
		public String getMimeType(String name) {
			return null;
		}

		
		public URL getResource(String name) {
			try {
				return bundleContext.getDataFile(name).toURI().toURL();
			} catch (MalformedURLException e) {
				// e.printStackTrace();
				// TODO Exception
				return null;
			}
		}

		
		public boolean handleSecurity(HttpServletRequest request,
				HttpServletResponse response) throws IOException {
			return true;
		}

	}

	public ServiceManagement getServiceManager() {
		return serviceManager;
	}

	public void setServiceManager(ServiceManagement serviceManager) {
		this.serviceManager = serviceManager;
	}
}
