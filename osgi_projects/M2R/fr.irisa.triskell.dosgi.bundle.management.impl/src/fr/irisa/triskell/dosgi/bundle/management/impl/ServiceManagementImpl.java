package fr.irisa.triskell.dosgi.bundle.management.impl;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import fr.irisa.triskell.dosgi.bundle.management.BundleManagement;
import fr.irisa.triskell.dosgi.bundle.management.ServiceManagement;
import fr.irisa.triskell.dosgi.bundle.management.memento.Originator;

public class ServiceManagementImpl implements ServiceManagement {
	
	private BundleContext bundleContext;

	private Map<Long, ServiceRegistration> serviceRegistrations;

	private long bundleManagementId;

	private Map<String, Object> remoteProperties;

	private Map<Long, List<String[]>> filteringServices;

	private Map<Long, List<Object[]>> mementos;

	private Map<Long, List<Object[]>> properties;

	public ServiceManagementImpl(BundleContext context) {
		this.bundleManagementId = -1;
		this.bundleContext = context;
		this.serviceRegistrations = new HashMap<Long, ServiceRegistration>();
		this.remoteProperties = new Hashtable<String, Object>();
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

	public Object getService(long id) {
		ServiceRegistration registration = serviceRegistrations.get(id);
		if (registration != null) {
			return bundleContext.getService(registration.getReference());

		} else {
			try {
				ServiceReference[] references = bundleContext
						.getServiceReferences(null, "(" + Constants.SERVICE_ID
								+ "=" + id + ")");
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

	public Object getService(String interfaceName, String filter, long bundleId) {
		Long[] serviceIds = findServiceIds(interfaceName, filter, bundleId);
		if (serviceIds.length > 0) {
			return getService(serviceIds[0]);
		}
		return null;
	}

	public void ungetService(long id) {
		ServiceRegistration registration = serviceRegistrations.get(id);
		if (registration != null) {
			bundleContext.ungetService(registration.getReference());
		} else {
			try {
				ServiceReference[] references = bundleContext
						.getServiceReferences(null, "(" + Constants.SERVICE_ID
								+ "=" + id + ")");
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

	public boolean moveService(long id, String remoteLocation, boolean reload,
			boolean remote) {
		boolean duplicate = duplicateService(id, remoteLocation, reload,
				remote);
		if (duplicate) {
			unregisterService(id);
		}
		return duplicate;
	}

	public boolean duplicateService(long id, String remoteLocation,
			boolean reload, boolean remote) {

		// get the bundle which registers the service
		ServiceRegistration registration = serviceRegistrations.get(id);
		ServiceReference reference = null;
		Bundle bundle = null;
		if (registration != null) {
			reference = registration.getReference();
			bundle = reference.getBundle();
		} else {
			try {
				ServiceReference[] references = bundleContext
						.getServiceReferences(null, "(" + Constants.SERVICE_ID
								+ "=" + id + ")");
				if (references != null) {
					// only one reference can exist
					reference = references[0];
					bundle = reference.getBundle();
				}
			} catch (InvalidSyntaxException e) {
				// must not appears
				System.err.println("duplicate(" + id + ", ...)");
			}
		}
			
			// FIXME for the moment, it only works with felix dosgi RI with this
			// filter
			String filter = "(&(osgi.remote=true) (osgi.remote.configuration.pojo.address="
					+ remoteLocation + "*))";
			Long[] remoteBundleManagerIds = findServiceIds(
					BundleManagement.class.getName(), filter, -1);

			if (remoteBundleManagerIds.length == 0) {
				System.err.println("there is no remote BundleManagement");
				return false;
			}
			BundleManagement remoteBundleManager = (BundleManagement) getService(remoteBundleManagerIds[0]);

			// install the bundle into the other platform
			BundleManagement bundleManager = getBundleManager();

			if (bundleManager == null) {
				System.err.println("there is no local BundleManagement");
				return false;
			}
			boolean duplicateBundleOK = bundleManager.duplicateBundle(bundle
					.getBundleId(), remoteLocation);

			if (duplicateBundleOK) {
				long remoteBundleId = remoteBundleManager.findBundleId(bundle
						.getSymbolicName(), (String) bundle.getHeaders().get(
						Constants.BUNDLE_VERSION));
				String[] objectClass = (String[]) reference
						.getProperty(Constants.OBJECTCLASS);

				ServiceManagement remoteManager = null;

				Long[] remoteServiceManagerIds = findServiceIds(
						ServiceManagement.class.getName(), filter, -1);
				if (remoteServiceManagerIds.length == 0) {
					System.err.println("there is no remote ServiceManagement");
					return false;
				}
				remoteManager = (ServiceManagement) getService(remoteServiceManagerIds[0]);

				// specify to the remoteServiceManagement that only the service,
				// which
				// must be duplicate, must be register into the other platform.
				List<String[]> tmp = new ArrayList<String[]>();
				tmp.add(objectClass);
				remoteManager.defineFiltering(tmp, remoteBundleId);

				// get the State of the Service if it is necessary
				Object service = bundleContext.getService(reference);
				// set memento if the restart is not true
				if (reload && service instanceof Originator) {
					Object memento = ((Originator) service).getMemento();
					remoteManager.defineMemento(objectClass, remoteBundleId,
							memento);
				}

				String[] keys = reference.getPropertyKeys();
				Map<String, Object> properties = new Hashtable<String, Object>();// new
				for (String key : keys) {
					properties.put(key, reference.getProperty(key));
				}
				if (remote) {
					for (String key : remoteManager.getRemoteProperties().keySet()) {
						Object value = remoteProperties.get(key);
						// FIXME maybe there is no key which contains address ...
						// Only work with Felix RI
						if (key.contains("address")) {
							// FIXME How define the address when there are many interface names?
							value = ((String) value) + "/" + ((String[])reference.getProperty(Constants.OBJECTCLASS))[0];
						}
						properties.put((String) key, (String) value);
					}
				}

				remoteManager.defineProperties(objectClass, remoteBundleId,
						properties);

				remoteBundleManager.start(remoteBundleId);
				remoteManager.ungetBundleManager();
			}
			// TODO create a proxy if it is necessary to use the service which
			// is
			// became remote into the local platform
			// remoteManager.unbindService(remoteBundleManager,
			// remoteManager.getBundleManagerId());
			// unbindService(bundleManager, getBundleManagerId());
			ungetBundleManager();
			return true;
	}

	public long registerBundleManagement(BundleManagement service,
			Dictionary<String, Object> properties, boolean remote) {
		bundleManagementId = registerService(BundleManagement.class.getName(),
				service, properties, remote, bundleContext.getBundle()
						.getBundleId());
		service.setServiceManager(this);
		return bundleManagementId;
	}

	public void unregisterBundleManagement() {
		ServiceRegistration registration = serviceRegistrations.get(bundleManagementId);
		if (registration != null) {
			((BundleManagement) bundleContext.getService(registration.getReference())).setServiceManager(null);
			unregisterService(bundleManagementId);
			bundleManagementId = -1;
		}
	}

	private void setRemotePropertiesBeforeRegistration(String[] interfaceNames,
			Dictionary<String, Object> properties, boolean remote) {
		if (remote) {
			/*Enumeration<String> keysTmp = remoteProperties.keys();
			while (keysTmp.hasMoreElements()) {
				String key = keysTmp.nextElement();*/
			for (String key : remoteProperties.keySet()) {
				Object value = remoteProperties.get(key);
				// FIXME maybe any properties contains address
				// it is only good for Felix RI
				if (((String) key).contains("address")) {
					// FIXME How define the address when there are many interface names?
					value = ((String) value) + "/" + interfaceNames[0];
				}
				properties.put((String) key, (String) value);
			}
		}
	}
	
	public long registerService(String interfaceName, Object service,
			Dictionary<String, Object> properties, boolean remote, long bundleId) {
		if (properties == null) {
			properties = new Hashtable<String, Object>();
		}
		/*if (remote) {
			Enumeration<String> keysTmp = remoteProperties.keys();
			while (keysTmp.hasMoreElements()) {
				String key = keysTmp.nextElement();
				Object value = remoteProperties.get(key);
				if (((String) key).contains("address")) {
					value = ((String) value) + "/" + interfaceName;
				}
				properties.put((String) key, (String) value);
			}
		}*/
		setRemotePropertiesBeforeRegistration(new String[] {interfaceName}, properties, remote);
		try {

			// TODOOK set this loops into a function or a new Class because it is
			// the same code into the other registerService function
			/*if (service instanceof Originator && mementos.containsKey(bundleId)) {
				List<Object[]> objs = mementos.get(bundleId);
				for (Object[] obj : objs) {
					if (((String[]) obj[0]).length == 1
							&& ((String[]) obj[0])[0].equals(interfaceName)) {
						((Originator) service).setMemento(obj[1]);
						break;
					}
				}
			}

			if (this.properties.containsKey(bundleId)) {
				List<Object[]> objs = this.properties.get(bundleId);
				for (Object[] obj : objs) {
					if (((String[]) obj[0]).length == 1
							&& ((String[]) obj[0])[0].equals(interfaceName)) {
						// updateProperties(id, (Properties) obj[1]);
						Map<String, Object> prop = ((Map<String, Object>) obj[1]);
						for (Object key : prop.keySet()) {
							properties.put((String) key, prop.get(key));
						}
						break;
					}
				}
			}*/
			//
			beforeRegisteringMigratedService(new String[] {interfaceName}, service, properties, remote, bundleId);

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
		if (properties == null) {
			properties = new Hashtable<String, Object>();
		}
		/*if (remote) {
			if (properties == null) {
				properties = new Hashtable<String, Object>();
			}
			Enumeration<String> keysTmp = remoteProperties.keys();
			while (keysTmp.hasMoreElements()) {
				String key = keysTmp.nextElement();
				Object value = remoteProperties.get(key);
				if (((String) key).contains("address")) {
					// TODO How define the address ?
					// value = ((String)value) + "/" + interfaceName;
				}
				properties.put((String) key, (String) value);
			}
		}*/
		setRemotePropertiesBeforeRegistration(interfaceNames, properties, remote);
		try {
			beforeRegisteringMigratedService(interfaceNames, service, properties, remote, bundleId);
			
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
	
	@SuppressWarnings("unchecked")
	private void beforeRegisteringMigratedService(String[] interfaceNames, Object service,
			Dictionary<String, Object> properties, boolean remote, long bundleId) {
		if (service instanceof Originator && mementos.containsKey(bundleId)) {
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
						((Originator) service).setMemento(obj[1]);
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
						Map<String, Object> prop = ((Map<String, Object>) obj[1]);
						for (Object key : prop.keySet()) {
							properties.put((String) key, prop.get(key));
						}
					}
					break;
				}
			}
		}
	}

	public void unregisterService(long id) {
		ServiceRegistration tmp = serviceRegistrations.get(id);
		if (tmp != null) {
			tmp.unregister();
			serviceRegistrations.remove(tmp);
			System.out.println("Service " + id + " is unregistered");
		}
	}

	public void addProperties(String interfaceName,
			Dictionary<String, Object> properties) {
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

	public void addProperties(long id, Dictionary<String, Object> properties) {
		this.setProperties(serviceRegistrations.get(id), properties);
	}

	private void setProperties(ServiceRegistration registration,
			Dictionary<String, Object> properties) {
		for (String propertyKey : registration.getReference().getPropertyKeys()) {
			properties.put(propertyKey, registration.getReference()
					.getProperty(propertyKey));
		}
		registration.setProperties(properties);
	}

	public void updateProperties(long id, Dictionary<String, Object> properties) {
		serviceRegistrations.get(id).setProperties(properties);
	}

	public void updateProperties(String interfaceName,
			Dictionary<String, Object> properties) {
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
	public void setRemoteProperties(Map<String, Object> properties) {
		this.remoteProperties = properties;

	}

	public BundleManagement getBundleManager() {
		return (BundleManagement) getService(bundleManagementId);
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

	public Dictionary<String, Object> getProperties(long id) {
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
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
		if (service instanceof Originator) {
			return ((Originator) service).setMemento(memento);
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

	public Map<String, Object> getRemoteProperties() {
		return this.remoteProperties;
	}

	public void ungetService(String interfaceName, String filter, long bundleId) {
		Long[] serviceIds = findServiceIds(interfaceName, filter, bundleId);
		if (serviceIds.length > 0) {
			ungetService(serviceIds[0]);
		}
	}
}
