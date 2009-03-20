package fr.irisa.triskell.dosgi.bundle.management;

import java.util.Dictionary;
import java.util.Properties;

public interface ServiceManagement {
	// TODO ALL javadocs
	
	public long registerService(String interfaceName, Object service, Dictionary<String, String> properties, boolean remote, long bundleId);
	
	public long registerService(String[] interfaceNames, Object service, Dictionary<String, String> properties, boolean remote, long bundleId);
	
	// TODO add register functions to specify the remote properties
	
	// TODO add functions when the service is registered with many interfaces (addProperties, unregister, updateProperties ...) => maybe not
	
	/**
	 * This function allows you to unregister a service into the platform.
	 * @param id identify the service to unregister.
	 */
	public void unregisterService(long id);
	
	// TODO add funcction to get a service define by an interface name and a filter and not an id
	public void bindService(Object attribute, long id);
	
	public void unbindService();
	
	/**
	 * This function allows you to move a service define by a interfaceName and an object to another platform
	 * @param id identify the service to move
	 * @param remoteManager a {@link ServiceManagement} on a remote host
	 * @param restart if true, the service is restart on the another platform without reload his state
	 * @param remote if true, the service will be register on the remote platform and it will be available for the other platform
	 */
	public long moveService(long id, ServiceManagement remoteManager, boolean restart, boolean remote);
	
	/**
	 * This function allows you to duplicate a service define by a interfaceName and an object to another platform
	 * After execute this function, the service is available on two platform
	 * @param id the service to duplicate
	 * @param remoteManager a {@link ServiceManagement} on a remote host
	 * @param restart if true, the service is restart on the another platform without reload his state
	 * @param remote if true, the service will be register on the remote platform and it will be available for the other platform
	 */
	public long duplicateService(long id, ServiceManagement remoteManager, boolean restart, boolean remote);
	
	/**
	 * This function allows you to add properties to all services register with the interface name <code>interfaceName</code>
	 * @param interfaceName a String which is a interface name defining a service
	 * @param properties properties to add to the services
	 */
	public void updateProperties(String interfaceName, Properties properties);
	
	/**
	 * This function allows you to add properties to the service define by the <code>interfaceName</code> and which is the <code>service</code> Object.
	 * @param id identify the service that we want update this properties
	 * @param propertiesproperties to add to the service
	 */
	public void updateProperties(long id, Properties properties);
	
	/**
	 * This function allows you to add properties to all services register with the interface name <code>interfaceName</code>
	 * @param interfaceName a String which is a interface name defining a service
	 * @param properties properties to add to the services
	 */
	public void addProperties(String interfaceName, Properties properties);
	
	/**
	 * This function allows you to add properties to the service define by the <code>interfaceName</code> and which is the <code>service</code> Object.
	 * @param id identify the service that we want to add properties
	 * @param propertiesproperties to add to the service
	 */
	public void addProperties(long id, Properties properties);
	
	/**
	 * This function allows you to get the {@link BundleManagement} service located into the same platform of the {@link ServiceManagement}
	 * @return the {@link BundleManagement}
	 */
	public long getBundleManagerId();
	
	public Long[] findServiceIds(String interfaceName, String filter, long bundleId);
	
	public Properties getProperties(long id);
	
}
