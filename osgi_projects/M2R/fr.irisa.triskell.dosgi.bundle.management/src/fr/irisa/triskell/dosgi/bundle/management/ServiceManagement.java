package fr.irisa.triskell.dosgi.bundle.management;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Constants;

/**
 * 
 * @author Erwan Daubert
 * @version 0.5
 *
 */
public interface ServiceManagement {

	// TODO define two type of BundleManagement and ServiceManagement : one for locals actions and one for remotes actions 
	// TODO ALL javadocs
	// TODO synchronized functions ?
	// TODO add functions when the service is registered with many interfaces (addProperties, unregister, updateProperties ...) => maybe not
	
	
	/**
	 * This function allows you to register a service into the OSGi platform
	 * @param interfaceName the name of the interface on which the service will be registered
	 * @param service the service object
	 * @param properties the properties of the services
	 * @param remote true if you want to define remote properties, false else. If you want to specify your own remote properties, set false and define it into the properties attribut
	 * @param bundleId the identifier of the bundle which want to register the service.
	 * @return the identifier of the service into the platform
	 */
	public long registerService(String interfaceName, Object service, Dictionary<String, Object> properties, boolean remote, long bundleId);
	
	/**
	 * This function allows you to register a service into the OSGi platform
	 * @param interfaceNames the name of the interfaces on which the service will be registered
	 * @param service the service object
	 * @param properties the properties of the services
	 * @param remote true if you want to define remote properties, false else. If you want to specify your own remote properties, set false and define it into the properties attribut
	 * @param bundleId the identifier of the bundle which want to register the service.
	 * @return the identifier of the service into the platform
	 */
	public long registerService(String[] interfaceNames, Object service, Dictionary<String, Object> properties, boolean remote, long bundleId);
	
	/**
	 * This function allows you to unregister the service identify by the id parameter
	 * @param id the identifier of the service
	 */
	public void unregisterService(long id);
	
	/**
	 * This function allows you to get a service identify by the id parameter
	 * @param id the identifier of the service
	 * @return the service Object
	 */
	public Object getService(long id);
	
	/**
	 * This function allows you to get a service using an interface name, a filter and a bundle identifier.<br />
	 * You can use <codenull</code> for interfaceName or filter and -1 for bundleId if you don't want specify this parameters.
	 * @param interfaceName an interface name identify a type of service
	 * @param filter a LDAP filter representation
	 * @param bundleid the bundle identifier which offers the service that you want
	 * @return the service object
	 */
	public Object getService(String interfaceName, String filter, long bundleid);
	
	/**
	 * This function allows you to unget a service identify by the id parameter
	 * @param id the identifier of the service
	 */
	public void ungetService(long id);
	
	/**
	 * This function allows you to unget a service using an interface name, a filter and a bundle identifier.<br />
	 * You can use <codenull</code> for interfaceName or filter and -1 for bundleId if you don't want specify this parameters.
	 * @param interfaceName an interface name identify a type of service
	 * @param filter a LDAP filter representation
	 * @param bundleid the bundle identifier which offers the service that you want
	 */
	public void ungetService(String interfaceName, String filter, long bundleId);
	
	/**
	 * This function allows you to move a service form the local platform to another platform.<br />
	 * When you move a service, you unregister the local version of this service.
	 * @param id the identifier of the service that you want move
	 * @param remoteLocation the location of the remote platform
	 * @param reload true if if you want save the state of the local service to reload this into the remote platform, false else
	 * @param remote true if you want set the service on the remote platform as remote service
	 * @return true if the move is done, false else.
	 */
	public boolean moveService(long id, String remoteLocation, boolean reload, boolean remote);
	
	/**
	 * This function allows you to duplicate a service from a platform to another platform.
	 * @param id the identifier of the service that you want duplicate
	 * @param remoteLocation the location of the remote platform
	 * @param reload true if you want save the state of the local service to reload this into the remote platform, false else
	 * @param remote true if you want set the service on the remote platform as remote service
	 * @return true if the move is done, false else.
	 */
	public boolean duplicateService(long id, String remoteLocation, boolean reload, boolean remote);
	
	/**
	 * This function allows you to update the properties registered with the services define by the interfaceName parameter
	 * @param interfaceName an interface name which define a type of service
	 * @param properties the new values of the properties to set to the services
	 */
	public void updateProperties(String interfaceName, Dictionary<String, Object> properties);
	
	/**
	 * This function allows you to update the properties registered with the service identify by the id parameter
	 * @param id the identifier of the service
	 * @param properties the new values of the properties to set to the service
	 */
	public void updateProperties(long id, Dictionary<String, Object> properties);
	
	/**
	 * This function allows you to add properties to the services define by the interfaceName parameter
	 * @param interfaceName  an interface name which define a type of service
	 * @param properties the properties to add to the services
	 */
	public void addProperties(String interfaceName, Dictionary<String, Object> properties);
	
	/**
	 * This function allows you to add properties to the service identify by the id parameter
	 * @param id the identifier of the service
	 * @param properties the properties to add to the service
	 */
	public void addProperties(long id, Dictionary<String, Object> properties);
	
	/**
	 * This function allows you to get the {@link BundleManagement} linked to this <code>ServiceManagement</code>
	 * @return the {@link BundleManagement} linked with this <code>ServiceManagement</code>
	 */
	public BundleManagement getBundleManager();
	
	/**
	 * This function allows you to unget the {@link BundleManagement} linked with this <code>ServiceManagement</code>
	 */
	public void ungetBundleManager();
	
	/**
	 * This functions allows you to find service ids which is registered into the interfaceName parameter, which respect the filter parameter and which is registered by the bundle identify by the bundleId parameter
	 * @param interfaceName an interface name which identify a type of service
	 * @param filter a LDAP filter representation
	 * @param bundleId the identifier of the bundle which register the service that you want find
	 * @return an array of service ids
	 */
	public Long[] findServiceIds(String interfaceName, String filter, long bundleId);
	
	/**
	 * This function allows you to get the properties registered with the service identify by the idd parameter
	 * @param id the identifier of a service
	 * @return A {@link Dictionary} which contains all properties defined for a service
	 */
	public Dictionary<String, Object> getProperties(long id);
	
	/**
	 * This function allows you to define filter for the service that a bundle can register.<br/>
	 * You must use this function before start the bundle.<br />
	 * When you use this function you don't really filter the services register by a bundle but you define a list of services that the bundle can register.<br />
	 * The bundle can register all services that it want if it doesn't use the {@link #getAllowedServices(long)} and if it doesn't filter this own services.
	 * @param interfaceNames the interface names which can be register as service by the bundle
	 * @param bundleId the identifier of a bundle
	 */
	public void defineFiltering(List<String[]> interfaceNames, long bundleId);
	
	/**
	 * This function allows you to know which services you are allowed to register.
	 * But you can register all services you want because it is you who choose to take care of the result of this function.
	 * @param bundleId the identifier of a bundle
	 * @return a list of interface names which define type of service that you are allowed to register
	 */
	public List<String[]> getAllowedServices(long bundleId);
	
	/**
	 * This function is used to reload a state of a service
	 * @param serviceId the identifier of the service
	 * @param memento the object which contains all datas to reload the state of the service
	 * @return true the reload was done, false else
	 */
	public boolean setMemento(long serviceId, Object memento);
	
	/**
	 * This function allows you to define a memento use to reload the state of a service which is migrated 
	 * @param objectClass the interface names which identify a properties of a service {@link Constants#OBJECTCLASS}
	 * @param bundleId the identifier of the bundle which register the service which correspond of the memento
	 * @param memento the object which contains all datas to reload the state of the service
	 */
	public void defineMemento(String[] objectClass, long bundleId, Object memento);
	
	/**
	 * This function allows you to define all properties to set for a service which is migrated
	 * @param objectClass the interface names which identify a properties of a service {@link Constants#OBJECTCLASS}
	 * @param bundleIdthe identifier of the bundle which register the service
	 * @param properties the properties that you want register with the service
	 */
	public void defineProperties(String[] objectClass, long bundleId, Map<String, Object> properties);
	
	/**
	 * This function allows you to get the remote properties which are used to define that a service is a remote service
	 * @return a map which contains the remote properties
	 */
	public Map<String, Object> getRemoteProperties();
}
