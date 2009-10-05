package fr.irisa.triskell.dosgi.bundle.management.impl;

import java.net.Inet4Address;
import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.dosgi.bundle.management.BundleManagement;
import fr.irisa.triskell.dosgi.bundle.management.ServiceManagement;

public class ManagementActivator implements BundleActivator {

	private ServiceManagement serviceManager;
	private BundleManagement bundleManager;
	
	private long serviceManagerId;
	private long bundleManagerId;
	
	public void start(BundleContext context) throws Exception {
		
		
		//Map<String, Object> properties = new Hashtable<String, Object>();
		/*String remoteProperties = context.getProperty("remote-properties");
		if (remoteProperties != null) {
			String[] remotePropertiesSplitted = remoteProperties.split(";");
			for (String remoteProperty : remotePropertiesSplitted) {
				String key = remoteProperty.split("=")[0];
				String value = remoteProperty.split("=")[1];
				properties.put(key, value);
			}
		}*/
		// TODO Documentation
		// TODO define attributes to store all property names.

		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();
		/*String configs = context.getProperty("service.exported.configs");
		if (configs != null) {
			String[] configsSplitted = configs.split(",");
			List<String> configsList = new ArrayList<String>();
			for (String config : configsSplitted) {
				configsList.add(config);
			}
			properties.put("service.exported.configs", configsList);
			
			String remoteProperties = context.getProperty("remote.properties");
			if (remoteProperties != null) {
				String[] remotePropertiesSplitted = remoteProperties.split(";");
				for (String remoteProperty : remotePropertiesSplitted) {
					String key = remoteProperty.split("=")[0];
					String value = remoteProperty.split("=")[1];
					
					String[] valueSplitted = value.split(",");
					List<String> valuesList = new ArrayList<String>();
					for (String valuePart : valueSplitted) {
						valuesList.add(valuePart);
					}
					
					properties.put(key, valuesList);
				}
			}
		} else {
			properties.put("service.exported.configs", Arrays.asList("org.apache.cxf.ws"));
			
		}
		// TODO define org.apache.cxf.ws.address when you choose the default values.
		
		String intents = context.getProperty("service.exported.intents");
		if (intents != null) {
			String[] intentsSplitted = intents.split(",");
			List<String> intentsList = new ArrayList<String>();
			for (String intent : intentsSplitted) {
				intentsList.add(intent);
			}
			properties.put("service.exported.intents", intentsList);
		} else {
			properties.put("service.exported.intents", Arrays.asList("SOAP", "HTTP"));
		}*/
		
		String location = context.getProperty("management.location");
		if (location == null) {
			location = Inet4Address.getLocalHost().getHostAddress();
		}
		
		String port = context.getProperty("management.port");
		int portNumber = 9000;
		if (port != null) {
			try {
				portNumber = Integer.parseInt(port);
				System.out.println(portNumber);
			} catch (NumberFormatException e) {
				System.err.println("the property management.port on the config is not a valid port number.\nWe choose to use the default port number " + portNumber);
			}
			
		}
		dictionary.put("service.exported.configs", new String[] {"org.apache.cxf.ws"/*, "pojo", "org.apache.cxf.rs"*/});
		dictionary.put("service.exported.intents", new String[] {/*"addressing", "logging", */"SOAP", "SOAP.1_1", "SOAP.1_2", "HTTP"});
		
		dictionary.put("management.location", location);
		dictionary.put("management.port", portNumber);
		
		//((ServiceManagementImpl)serviceManager).setRemoteProperties(properties);

		serviceManager = new ServiceManagementImpl(context, location, portNumber);
		bundleManager = new BundleManagementImpl(context);
		
		dictionary.put("org.apache.cxf.ws.address", "http://localhost:" + portNumber + "/" + bundleManager.getClass().getName());
		
		bundleManagerId = ((ServiceManagementImpl)serviceManager).registerBundleManagement(bundleManager, dictionary, true);
		
		dictionary.put("org.apache.cxf.ws.address", "http://localhost:" + portNumber + "/" + serviceManager.getClass().getName());
		
		serviceManagerId = serviceManager.registerService(ServiceManagement.class.getName(), serviceManager, dictionary, true, context.getBundle().getBundleId());
		

	}

	public void stop(BundleContext context) throws Exception {
		serviceManager.unregisterService(serviceManagerId);
		serviceManager.unregisterService(bundleManagerId);
	}

}
