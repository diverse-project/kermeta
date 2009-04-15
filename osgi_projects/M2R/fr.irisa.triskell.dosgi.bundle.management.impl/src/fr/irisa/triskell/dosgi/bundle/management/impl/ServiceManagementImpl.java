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
	// TODO maybe the service registration doesn't exist for a specific service
	// so it is necessary to test when I get a service registration into serviceRegistrations
	private BundleContext bundleContext;

	private Map<Long, ServiceRegistration> serviceRegistrations;

	private long bundleManagementId;

	private Properties remoteProperties;

	private Map<Long, List<String[]>> filteringServices;

	private Map<Long, List<Object[]>> mementos;

	private Map<Long, List<Object[]>> properties;

	public ServiceManagementImpl(BundleContext context) {
		this.bundleManagementId = -1;
		this.bundleContext = context;
		this.serviceRegistrations = new HashMap<Long, ServiceRegistration>();
		this.remoteProperties = new Properties();
		this.filteringServices = new HashMap<Long, List<String[]>>();
		this.mementos = new HashMap<Long, List<Object[]>>();
		this.properties = new HashMap<Long, List<Object[]>>();
	}

	public BundleContext getBundleContext() {
		return bundleContext;
	}

	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	// TODO return a boolean or use an Exception ?
	public Object getService(long id) {
		ServiceRegistration registration = serviceRegistrations.get(id);
		if (registration != null) {
			return bundleContext.getService(registration.getReference());
			
		} else {
			try {
				ServiceReference[] references = bundleContext.getServiceReferences(null, "(" + Constants.SERVICE_ID + "=" + id + ")");
				if (references != null) {
					// only one reference can exist
					return bundleContext.getService(references[0]);
				}
			} catch (InvalidSyntaxException e) {
				// must not appears
				System.err.println("bindService(" + id + ")");
			}
		}
		return null;
	}

	
	public void ungetService(long id) {
		ServiceRegistration registration = serviceRegistrations.get(id);
		if (registration != null) {
			bundleContext.ungetService(registration.getReference());
		} else {
			try {
				ServiceReference[] references = bundleContext.getServiceReferences(null, "(" + Constants.SERVICE_ID + "=" + id + ")");
				if (references != null) {
					// only one reference can exist
					bundleContext.ungetService(references[0]);
				}
			} catch (InvalidSyntaxException e) {
				// must not appears
				System.err.println("unbindService(" + id + ")");
			}
		}
		
	}

	
	public boolean moveService(long id, String remoteLocation, boolean restart,
			boolean remote) {
		boolean duplicate = duplicateService(id, remoteLocation, restart, remote);
		if (duplicate) {
			unregisterService(id);
		}
		return duplicate;
	}

	
	public boolean duplicateService(long id, String remoteLocation,
			boolean restart, boolean remote) {

		// get the bundle which registers the service
		ServiceRegistration registration = serviceRegistrations.get(id);
		ServiceReference reference = registration.getReference();
		Bundle bundle = reference.getBundle();

		// get the remote bundle manager which can be used to move or duplicate
		// the bundle which registers the service
		BundleManagement remoteBundleManager = null;
		// remoteManager.getBundleManager(remoteBundleManager);
		// FIXME for the moment, it only works with felix dosgi RI with this filter
		String filter = "(&(osgi.remote=true) (osgi.remote.configuration.pojo.address="
				+ remoteLocation + "*))";
		Long[] remoteBundleManagerIds = findServiceIds(BundleManagement.class
				.getName(), filter, -1);

		if (remoteBundleManagerIds.length == 0) {
			System.err.println("there is no remote BundleManagement");
			return false;
		}
		remoteBundleManager = (BundleManagement)getService(remoteBundleManagerIds[0]);

		// install the bundle into the other platform
		BundleManagement bundleManager = getBundleManager();

		if (bundleManager == null) {
			System.err.println("there is no local BundleManagement");
			return false;
		}
		long remoteBundleId = bundleManager.duplicateBundle(bundle
				.getBundleId(), remoteLocation);

		String[] objectClass = (String[]) reference
				.getProperty(Constants.OBJECTCLASS);

		ServiceManagement remoteManager = null;

		Long[] remoteServiceManagerIds = findServiceIds(ServiceManagement.class
				.getName(), filter, -1);
		if (remoteServiceManagerIds.length == 0) {
			System.err.println("there is no remote ServiceManagement");
			return false;
		}
		remoteManager = (ServiceManagement)getService(remoteServiceManagerIds[0]);

		// specify to the remoteServiceManagement that only the service, which
		// must be duplicate, must be register into the other platform.
		List<String[]> tmp = new ArrayList<String[]>();
		tmp.add(objectClass);
		remoteManager.defineFiltering(tmp, remoteBundleId);

		// get the State of the Service if it is necessary
		Object service = bundleContext.getService(reference);
		// set memento if the restart is not true
		if (!restart && service instanceof Memento) {
			Object memento = ((Memento) service).getMemento();
			// remoteManager.setMemento(remoteServiceId, memento);
			remoteManager.defineMemento(objectClass, remoteBundleId, memento);
		}

		String[] keys = reference.getPropertyKeys();
		Map<String, Object> /*Properties*/ properties = new Hashtable<String, Object>();// new
		// Hashtable<String,
		// Object>();
		for (String key : keys) {
			properties.put(key, reference.getProperty(key));
		}
		if (remote) {
			// Properties properties = new Properties();
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String) key).contains("address")) {
					// TODO How define the address ?
					// value = ((String)value) + "/" + interfaceName;
				}
				properties.put((String) key, (String) value);
			}
			// remoteManager.addProperties(remoteServiceId, properties);
		}

		remoteManager.defineProperties(objectClass, remoteBundleId, properties);

		remoteBundleManager.start(remoteBundleId);
		/*
		 * if (remoteBundleManager.start(remoteBundleId)) { // TODOOK it's
		 * necessary to wait that the service is registering into the remote
		 * plat-form // maybe use a thread which wait the remoteServiceId before
		 * continue
		 * 
		 * // TODOOK create a filter with the ObjectClass property and all
		 * others properties (maybe not because these properties can be updated
		 * during execution)define for the local service.
		 * 
		 * Long[] remoteServiceIds = remoteManager.findServiceIds(null, "(" +
		 * Constants.OBJECTCLASS + "=" +
		 * registration.getReference().getProperty( Constants.OBJECTCLASS) +
		 * ")", remoteBundleId);
		 * 
		 * 
		 * 
		 * for (long remoteServiceId : remoteServiceIds) {
		 * 
		 * // change the service properties to become remote service if (remote)
		 * { Properties properties = new Properties(); for (Object key :
		 * remoteProperties.keySet()) { Object value =
		 * remoteProperties.get(key); if (((String) key).contains("address")) {
		 * value = ((String) value) + "/" + BundleManagement.class.getName(); }
		 * properties.put((String) key, (String) value); }
		 * remoteManager.addProperties(remoteServiceId, properties); }
		 * 
		 * 
		 * } }
		 */
		// TODO create a proxy if it is necessary to use the service which is
		// became remote into the local platform
		// remoteManager.unbindService(remoteBundleManager,
		// remoteManager.getBundleManagerId());
		remoteManager.ungetBundleManager();
		// unbindService(bundleManager, getBundleManagerId());
		ungetBundleManager();
		return true;
	}

	public long registerBundleManagement(BundleManagement service,
			Dictionary<String, String> properties, boolean remote) {
		// FIXME use registerService
		if (remote) {
			if (properties == null) {
				properties = new Hashtable<String, String>();
			}
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String) key).contains("address")) {
					value = ((String) value) + "/"
							+ BundleManagement.class.getName();
				}
				properties.put((String) key, (String) value);
			}
		}
		try {
			ServiceRegistration registration = bundleContext.registerService(
					BundleManagement.class.getName(), service, properties);
			long id = (Long) registration.getReference().getProperty(
					Constants.SERVICE_ID);
			serviceRegistrations.put(id, registration);
			bundleManagementId = id;
			service.setServiceManager(this);
			return id;
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}

	public void unregisterBundleManagement() {
		((BundleManagement) bundleContext.getService(serviceRegistrations.get(
				bundleManagementId).getReference())).setServiceManager(null);
		unregisterService(bundleManagementId);
		bundleManagementId = -1;
	}

	
	public long registerService(String interfaceName, Object service,
			Dictionary<String, Object> properties, boolean remote, long bundleId) {
		// FIXME prob with the updateProperties which is use after the register service so during a short time, the service is available with a bad state
		// ...
		if (properties == null) {
			properties = new Hashtable<String, Object>();
		}
		if (remote) {
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String) key).contains("address")) {
					value = ((String) value) + "/" + interfaceName;
				}
				properties.put((String) key, (String) value);
			}
		}
		try {
			
			// TODO set this loop into a function or a new Class because it is
			// the same code into the other registerService function
			if (service instanceof Memento && mementos.containsKey(bundleId)) {
				List<Object[]> objs = mementos.get(bundleId);
				for (Object[] obj : objs) {
					if (((String[]) obj[0]).length == 1
							&& ((String[]) obj[0])[0].equals(interfaceName)) {
						((Memento) service).setMemento(obj[1]);
						break;
					}
				}
			}


			if (this.properties.containsKey(bundleId)) {
				List<Object[]> objs = this.properties.get(bundleId);
				for (Object[] obj : objs) {
					if (((String[]) obj[0]).length == 1
							&& ((String[]) obj[0])[0].equals(interfaceName)) {
						//updateProperties(id, (Properties) obj[1]);
						Map<String, Object> prop = ((Map<String, Object>) obj[1]);
						for (Object key : prop.keySet()) {
							System.out.println(properties);
							System.out.println(key);
							System.out.println(prop.get(key));
							System.out.println(prop);
							properties.put((String)key, prop.get(key));
						}
						break;
					}
				}
			}
			//
			
			
			ServiceRegistration registration = bundleContext
					.getBundle(bundleId).getBundleContext().registerService(
							interfaceName, service, properties);


			long id = (Long) registration.getReference().getProperty(
					Constants.SERVICE_ID);

			serviceRegistrations.put(id, registration);
			System.out.println("Service " + interfaceName + " is registered");
			return id;
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}

	
	public long registerService(String[] interfaceNames, Object service,
			Dictionary<String, Object> properties, boolean remote, long bundleId) {
		if (remote) {
			if (properties == null) {
				properties = new Hashtable<String, Object>();
			}
			for (Object key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				if (((String) key).contains("address")) {
					// TODO How define the address ?
					// value = ((String)value) + "/" + interfaceName;
				}
				properties.put((String) key, (String) value);
			}
		}
		try {
			
			// TODO set this loop into a function or a new Class because it is
			// the same code into the other registerService function
			if (service instanceof Memento && mementos.containsKey(bundleId)) {
				List<Object[]> objs = mementos.get(bundleId);
				for (Object[] obj : objs) {
					if (((String[]) obj[0]).length == interfaceNames.length) {
						boolean isAllTheSame = true;
						for (String clazzTmp : (String[]) obj[0]) {
							boolean tmp = false;
							for (String clazz : interfaceNames) {
								if (clazz.equals(clazzTmp)) {
									tmp = true;
									break;
								}
							}
							if (!tmp) {
								isAllTheSame = false;
								break;
							}
						}
						if (isAllTheSame) {
							((Memento) service).setMemento(obj[1]);
						}
						break;
					}
				}
			}

			if (this.properties.containsKey(bundleId)) {
				List<Object[]> objs = this.properties.get(bundleId);
				for (Object[] obj : objs) {
					if (((String[]) obj[0]).length == interfaceNames.length) {
						boolean isAllTheSame = true;
						for (String clazzTmp : (String[]) obj[0]) {
							boolean tmp = false;
							for (String clazz : interfaceNames) {
								if (clazz.equals(clazzTmp)) {
									tmp = true;
									break;
								}
							}
							if (!tmp) {
								isAllTheSame = false;
								break;
							}
						}
						if (isAllTheSame) {
							//updateProperties(id, (Properties) obj[1]);
							Properties prop = ((Properties) obj[1]);
							for (Object key : prop.keySet()) {
								properties.put((String)key, prop.get(key));
							}
						}
						break;
					}
				}
			}
			
			ServiceRegistration registration = bundleContext
					.getBundle(bundleId).getBundleContext().registerService(
							interfaceNames, service, properties);

			long id = (Long) registration.getReference().getProperty(
					Constants.SERVICE_ID);

			
			serviceRegistrations.put(id, registration);
			return id;
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}

	
	public void unregisterService(long id) {
		ServiceRegistration tmp = serviceRegistrations.get(id);
		if (tmp != null) {
			tmp.unregister();
			serviceRegistrations.remove(tmp);
			System.out.println("Service " + id + " is unregistered");
		}
	}

	
	public void addProperties(String interfaceName, Properties properties) {
		for (ServiceRegistration registration : serviceRegistrations.values()) {
			String[] interfaceNames = (String[]) registration.getReference()
					.getProperty(Constants.OBJECTCLASS);
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

	
	public void addProperties(long id, Properties properties) {
		this.setProperties(serviceRegistrations.get(id), properties);
	}

	private void setProperties(ServiceRegistration registration,
			Properties properties) {
		for (String propertyKey : registration.getReference().getPropertyKeys()) {
			properties.put(propertyKey, registration.getReference()
					.getProperty(propertyKey));
		}
		registration.setProperties(properties);
	}

	
	public void updateProperties(long id, Properties properties) {
		serviceRegistrations.get(id).setProperties(properties);
	}

	
	public void updateProperties(String interfaceName, Properties properties) {
		for (ServiceRegistration registration : serviceRegistrations.values()) {
			String[] interfaceNames = (String[]) registration.getReference()
					.getProperty(Constants.OBJECTCLASS);
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
	 * 
	 * @param properties
	 */
	public void setRemoteProperties(Properties properties) {
		this.remoteProperties = properties;

	}

	
	public BundleManagement getBundleManager() {
		// return bundleManagementId;
		// return
		// (BundleManagement)bundleContext.getService(serviceRegistrations.get(bundleManagementId).getReference());
		return (BundleManagement)getService(bundleManagementId);
	}

	
	public void ungetBundleManager() {
		ungetService(bundleManagementId);

	}

	
	public Long[] findServiceIds(String interfaceName, String filter,
			long bundleId) {
		ServiceReference[] references;
		try {
			references = bundleContext.getAllServiceReferences(interfaceName,
					filter);
			if (references != null) {
				List<Long> ids = new ArrayList<Long>();
				for (ServiceReference reference : references) {
					if (bundleId <= -1
							|| (bundleId > -1 && reference.getBundle()
									.getBundleId() == bundleId)) {
						ids.add((Long) reference
								.getProperty(Constants.SERVICE_ID));
					}
				}
				Long[] serviceIds = new Long[ids.size()];
				ids.toArray(serviceIds);
				return serviceIds;
			}
		} catch (InvalidSyntaxException e) {
			System.err.print("Filter that you want use is not valid : ");
			System.err.println(filter);
		}
		return new Long[0];
	}

	
	public Properties getProperties(long id) {
		Properties properties = new Properties();
		ServiceReference reference = serviceRegistrations.get(id)
				.getReference();
		for (String key : reference.getPropertyKeys()) {
			properties.put(key, reference.getProperty(key));
		}
		return properties;
	}

	
	public void defineFiltering(List<String[]> interfaceNames, long bundleId) {
		if (filteringServices.containsKey(bundleId)) {
			interfaceNames.addAll(filteringServices.get(bundleId));
		}
		filteringServices.put(bundleId, interfaceNames);
	}

	
	public List<String[]> getAllowedServices(long bundleId) {
		return filteringServices.get(bundleId);
	}

	
	public boolean setMemento(long serviceId, Object memento) {
		ServiceRegistration registration = serviceRegistrations.get(serviceId);
		Object service = bundleContext.getService(registration.getReference());
		if (service instanceof Memento) {
			return ((Memento) service).setMemento(memento);
		}
		return false;
	}

	
	public void defineMemento(String[] objectClass, long bundleId,
			Object memento) {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] { objectClass, memento });
		if (mementos.containsKey(bundleId)) {
			list.addAll(mementos.get(bundleId));
		}
		mementos.put(bundleId, list);

	}

	
	public void defineProperties(String[] objectClass, long bundleId,
			Map<String, Object> properties) {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] { objectClass, properties });
		if (this.properties.containsKey(bundleId)) {
			list.addAll(mementos.get(bundleId));
		}
		this.properties.put(bundleId, list);
	}
}
