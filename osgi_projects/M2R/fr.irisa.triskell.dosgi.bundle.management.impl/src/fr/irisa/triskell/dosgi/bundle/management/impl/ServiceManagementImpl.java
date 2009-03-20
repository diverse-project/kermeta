package fr.irisa.triskell.dosgi.bundle.management.impl;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import fr.irisa.triskell.dosgi.bundle.management.BundleManagement;
import fr.irisa.triskell.dosgi.bundle.management.ServiceManagement;
import fr.irisa.triskell.dosgi.bundle.management.memento.Memento;

public class ServiceManagementImpl implements ServiceManagement {

	private BundleContext bundleContext;
	
	private Map<Long, ServiceRegistration> serviceRegistrations;
	
	private long bundleManagementId;
	
	private Properties remoteProperties;
	
	private Map<Long, List<String>> filteringServices;
	
	public ServiceManagementImpl(BundleContext context) {
		this.bundleManagementId = -1;
		this.bundleContext = context;
		this.serviceRegistrations = new HashMap<Long, ServiceRegistration>();
		this.remoteProperties = new Properties();
		this.filteringServices = new HashMap<Long, List<String>>();
	}
	
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	
	@Override
	public void bindService(Object attribut, long id) {
		Object service = bundleContext.getService(serviceRegistrations.get(id).getReference());
		if (service.getClass().isInstance(attribut.getClass())) {
			attribut = service;
		}
	}

	@Override
	public void unbindService() {
		// TODO Auto-generated method stub
	}

	@Override
	public long moveService(long id, ServiceManagement remoteManager, boolean restart, boolean remote) {
		long remoteId = duplicateService(id, remoteManager, restart, remote);
		if (remoteId != -1) {
			unregisterService(id);
		}
		return remoteId;
	}
	
	@Override
	public long duplicateService(long id, ServiceManagement remoteManager, boolean restart, boolean remote) {
		// TODO 
		
		// get the bundle which registers the service
		ServiceRegistration registration = serviceRegistrations.get(id);
		Bundle bundle = registration.getReference().getBundle();
		
		// get the remote bundle manager which can be used to move or duplicate the bundle which registers the service
		BundleManagement remoteBundleManager = null; 
		remoteManager.bindService(remoteBundleManager, remoteManager.getBundleManagerId());
		// TODO test if there is a remote BundleManagement
		
		// install the bundle into the other platform
		BundleManagement bundleManager = null;
		bindService(bundleManager, getBundleManagerId());
		System.out.println(bundleManager);
		long remoteBundleId = bundleManager.duplicateBundle(bundle.getBundleId(), remoteBundleManager);
		// TODO test if there is a local BundleManagement
		
		// specify to the remoteServiceManagement that only the service which must be duplicate must be register into the other platform.
		
		
		// get the State of the Service if it is necessary
		Object service = bundleContext.getService(registration.getReference());
		if (!restart && service instanceof Memento) {
			Object memento = ((Memento)service).getMemento();
			// give the Memento to the remoteServiceManagement to set the State of the service identify by the remoteServiceId
		}
		// TODO unbind remoteBundleManager and bundleManager
		return -1;
	}

	public long registerBundleManagement(Object service, Dictionary<String, String> properties, boolean remote) {
		if (remote) {
			if (properties == null) {
				properties = new Hashtable<String, String>();
			}
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String)key).contains("address")) {
					value = ((String)value) + "/" + BundleManagement.class.getName();  
				}
				properties.put((String)key, (String)value);
			}
		}
		try {
			ServiceRegistration registration = bundleContext.registerService(BundleManagement.class.getName(), service, properties);
			long id = (Long)registration.getReference().getProperty(Constants.SERVICE_ID);
			serviceRegistrations.put(id, registration);
			bundleManagementId = id;
			return id;
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}
	
	public void unregisterBundleManagement() {
		unregisterService(bundleManagementId);
		bundleManagementId = -1;
	}
	
	@Override
	public long registerService(String interfaceName, Object service,
			Dictionary<String, String> properties, boolean remote, long bundleId) {
		if (remote) {
			if (properties == null) {
				properties = new Hashtable<String, String>();
			}
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String)key).contains("address")) {
					value = ((String)value) + "/" + interfaceName;  
				}
				properties.put((String)key, (String)value);
			}
		}
		try {
			ServiceRegistration registration = bundleContext.getBundle(bundleId).getBundleContext().registerService(interfaceName, service, properties);
			long id = (Long)registration.getReference().getProperty(Constants.SERVICE_ID);
			serviceRegistrations.put(id, registration);
			System.out.println("Service " + interfaceName + " is registered");
			System.out.println(id + " : " + registration.getReference().getBundle().getBundleId());
			return id;
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}
	
	@Override
	public long registerService(String[] interfaceNames, Object service,
			Dictionary<String, String> properties, boolean remote, long bundleId) {
		if (remote) {
			if (properties == null) {
				properties = new Hashtable<String, String>();
			}
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String)key).contains("address")) {
					// TODO How define the address ?
					//value = ((String)value) + "/" + interfaceName;
				}
				properties.put((String)key, (String)value);
			}
		}
		try {
			ServiceRegistration registration = bundleContext.getBundle(bundleId).getBundleContext().registerService(interfaceNames, service, properties);
			long id = (Long)registration.getReference().getProperty(Constants.SERVICE_ID);
			serviceRegistrations.put(id, registration);
			return id;
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}

	@Override
	public void unregisterService(long id) {
		ServiceRegistration tmp = serviceRegistrations.get(id);
		/*for (ServiceRegistration registration : serviceRegistrations) {
			if (bundleContext.getService(registration.getReference()).equals(service)) {
				registration.unregister();
				tmp = registration;
				System.out.println("Service " + interfaceName + " is unregistered");
				break;
			}
		}*/
		if (tmp != null) {
			tmp.unregister();
			serviceRegistrations.remove(tmp);
		}
	}

	@Override
	public void addProperties(String interfaceName,
			Properties properties) {
		for (ServiceRegistration registration : serviceRegistrations.values()) {
			String[] interfaceNames = (String[])registration.getReference().getProperty(Constants.OBJECTCLASS);
			boolean appears = false;
			for (String name : interfaceNames) {
				if (name.equals(interfaceName)) {
					appears = true;
					break;
				}
			}
			if (appears) {
				this.setProperties(registration, properties);
			}
		}
		
	}

	/*@Override
	public void addProperties(String interfaceName, Object service,
			Properties properties) {
		for (ServiceRegistration registration : serviceRegistrations) {
			if (/*serviceRegistrations.get(registration).equals(interfaceName) 
					&& *bundleContext.getService(registration.getReference()).equals(service)) {
				this.setProperties(registration, properties);
				break;
			}
		}
	}*/
	
	@Override
	public void addProperties(long id, Properties properties) {
		this.setProperties(serviceRegistrations.get(id), properties);
	}
	
	private void setProperties(ServiceRegistration registration, Properties properties) {
		for (String propertyKey : registration.getReference().getPropertyKeys()) {
			properties.put(propertyKey, registration.getReference().getProperty(propertyKey));
		}
		registration.setProperties(properties);
	}

	/*@Override
	public void updateProperties(String interfaceName, Object service,
			Properties properties) {
		for (ServiceRegistration registration : serviceRegistrations) {
			if (/*serviceRegistrations.get(registration).equals(interfaceName)
				&& *bundleContext.getService(registration.getReference()).equals(service)) {
				registration.setProperties(properties);
				break;
			}
		}
		
	}*/
	@Override
	public void updateProperties(long id, Properties properties) {
		serviceRegistrations.get(id).setProperties(properties);
	}

	@Override
	public void updateProperties(String interfaceName,
			Properties properties) {
		for (ServiceRegistration registration : serviceRegistrations.values()) {
			/*if (serviceRegistrations.get(registration).equals(interfaceName)) {
				registration.setProperties(properties);
			}*/
			String[] interfaceNames = (String[])registration.getReference().getProperty(Constants.OBJECTCLASS);
			boolean appears = false;
			for (String name : interfaceNames) {
				if (name.equals(interfaceName)) {
					appears = true;
					break;
				}
			}
			if (appears) {
				registration.setProperties(properties);
			}
		}
		
	}
	
	/**
	 * This function allows you to define the remote specific properties
	 * @param properties
	 */
	public void setRemoteProperties(Properties properties) {
		this.remoteProperties = properties;
		
	}

	@Override
	public long getBundleManagerId() {
		return bundleManagementId;
	}

	@Override
	public Long[] findServiceIds(String interfaceName, String filter, long bundleId) {
		ServiceReference[] references;
		try {
			references = bundleContext.getAllServiceReferences(interfaceName, filter);
			List<Long> ids = new ArrayList<Long>();
			for (ServiceReference reference : references) {
				if (bundleId <= -1 || (bundleId > -1 && reference.getBundle().getBundleId() == bundleId)) {
					ids.add((Long)reference.getProperty(Constants.SERVICE_ID));
				}
			}
			Long[] serviceIds = new Long[ids.size()];
			ids.toArray(serviceIds);
			return serviceIds;
		} catch (InvalidSyntaxException e) {
			System.err.println("Filter that you want use is not valid");
		}
		return new Long[0];
	}

	@Override
	public Properties getProperties(long id) {
		Properties properties = new Properties();
		ServiceReference reference = serviceRegistrations.get(id).getReference();
		for (String key : reference.getPropertyKeys()) {
			properties.put(key, reference.getProperty(key));
		}
		return properties;
	}
	
	public List<String> defineServices(List<String> interfaceNames, long bundleId) {
		List<String> acceptableInterfaceNames = new ArrayList<String>();
		
		List<String> filters = filteringServices.get(bundleId); 
		
		
		return acceptableInterfaceNames;
	}
	
	public void defineFiltering(List<String> interfaceNames, long bundleId) {
		filteringServices.put(bundleId, interfaceNames);
	}
}
