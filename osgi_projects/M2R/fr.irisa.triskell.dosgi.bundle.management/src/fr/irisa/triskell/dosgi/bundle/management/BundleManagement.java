package fr.irisa.triskell.dosgi.bundle.management;


public interface BundleManagement {
	// TODO ALL javadocs
	// TODO synchronized functions

	/**
	 * This function allows you to start a bundle defined by this bundleId
	 * @param bundleId the identifier of a bundle to start
	 * @return <code>true</code> if the start is done, <code>false</code> else
	 */
	public boolean start(long bundleId);
	
	/**
	 * This function allows you to stop a bundle defined by this bundleId
	 * @param bundleId the identifier of a bundle to stop
	 * @return <code>true</code> if the stop is done, <code>false</code> else
	 */
	public boolean stop(long bundleId);
	
	/**
	 * This function allows you to update a bundle defined by this bundleId
	 * @param bundleId the identifier of a bundle to update
	 * @return <code>true</code> if the update is done, <code>false</code> else
	 */
	public boolean update(long bundleId);
	
	/**
	 * This function allows you to install a new bundle
	 * @param location the address where the JAR file which represents the bundle is located
	 * @return the bundleId of the bundle if this bundle was installed or -1.
	 */
	public long install(String location);
	

	/**
	 * This function allows you to install a bundle defined by this bundleSymbolicName and this version.
	 * This function search into a bundleRepository defined by the bundleRepositoryLocation
	 * @param bundleSymbolicName the bundleSymbolicName of the bundle to find and install
	 * @param version the version of the bundle to find and install
	 * @param bundleRepositoryLocation the location of the bundleRepository where the JAR file which represents the bundle must be found.<br />
	 * You can specify a <code>bundleRepositoryLocation</code> as <code>null</code> but if there is no repository available, any bundle will be installed.<br />
	 * If your repositoryLocation is not known, it's registered.
	 * @return the bundleId of the bundle if this bundle was installed or -1
	 */
	public long install(String bundleSymbolicName, String version, String bundleRepositoryLocation);
	
	/**
	 * This function allows you to uninstall a bundle defined by this bundleId.<br />
	 * When you uninstall a bundle, all <code>export-package</code> are available until packages are refresh (PackageAdmin.refreshPackages()) or the framework is relaunched
	 * @param bundleId the bundleId of the bundle to uninstall
	 * @return <code>true</code> if the bundle was uninstalled, <code>false</code> else
	 */
	public boolean uninstall(long bundleId);
	
	/**
	 * This function allows you to move a bundle defined by this bundleId to another platform when the OSGi platform is a distributed platform.<br />
	 * When you move a bundle into another platform, you move also services but the state of the services are not saved and move on the remote platform.<br />
	 * The new bundleId is defined into the other platform where the bundle is moved.
	 * @param bundleId the identifier of the bundle to move
	 * @param remoteManager a {@link BundleManagement} on a remote host
	 * @return the new bundleId of the bundle or -1
	 */
	public long moveBundle(long bundleId, String remoteLocation);
	
	/**
	 * This function allows you to duplicate a bundle and move one instance into another platform
	 * @param bundleId the identifier of the bundle to duplicate
	 * @param remoteManager a {@link BundleManagement} on a remote host
	 * @return the new bundleId of the instance of the bundle which was moved into another platform
	 */
	public long duplicateBundle(long bundleId, String remoteLocation);
	
	/**
	 * This function allows you to find a bundle identify by his <code>Bundle-SymbolicName</code> and his <code>Bundle-Version</code>
	 * @param bundleSymbolicName the value of the <code>Bundle-SymbolicName</code>
	 * @param version the value of the <code>Bundle-Version</code>
	 * @return the bundleId of the bundle
	 */
	public long findBundleId(String bundleSymbolicName, String version);
	
	/**
	 * This function allows you to get all bundleIds which represent all bundle into the platform.
	 * @return an array which contains all bundleIds
	 */
	public Long[] findBundleIds();
	
	/**
	 * This function allows you to find all bundle using a service define as clazz
	 * @param clazz the class name of the service into the ServiceRegistry
	 * @param service the object which is the service
	 * @return an array which contains all bundleIds which identify the bundles which use this service.
	 */
	public Long[] getBundlesUsingService(String clazz, Object service);
	
	/**
	 * This function allows you to find all bundle which depend of the export-package offers by the bundle identify by bundleId
	 * @param bundleId the identifier of the bundle which offers packages
	 * @return an array of the bundleIds if the bundles which depend of the export-package.
	 */
	public Long[] getBundlesUsingPackages(long bundleId);
	
	/**
	 * This function allows you to find all bundles which require the bundle define by it bundleId.<br />
	 * It's better to use <code>Import-Package</code> directive instead of <code>Require-Bundle</code>
	 * @param bundleId the identifier of the bundle
	 * @return an array which contains the bundleIds of all bundle requiring the bundle define by the bundleId parameter.
	 */
	public Long[] getBundlesRequiringBundle(long bundleId);
	
	/**
	 * This function allows you to get the bundle host of the bundle defined by the bundleId parameter
	 * @param bundleId the identifier of the bundle which is a fragment.
	 * @return the bundleId of the host bundle.
	 */
	public long getHostBundle(long bundleId);
	
	/**
	 * This function allows you to get all fragments of the bundle defined by the bundleId parameter.
	 * @param bundleId the identifier of the bundle host
	 * @return an array which contains all identifiers of all bundles which are fragments of the bundle identify by the bundleId parameter.
	 */
	public Long[] getFragmentBundles(long bundleId);
	
	public ServiceManagement getServiceManager();

	public void setServiceManager(ServiceManagement serviceManager);
	
}
