package fr.irisa.triskell.dosgi.bundle.management.impl;

import java.util.Hashtable;
import java.util.Map;

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
		
		serviceManager = new ServiceManagementImpl(context);
		
		String remoteProperties = context.getProperty("remote-properties");
		Map<String, Object> properties = new Hashtable<String, Object>();
		if (remoteProperties != null) {
			String[] remotePropertiesSplitted = remoteProperties.split(";");
			for (String remoteProperty : remotePropertiesSplitted) {
				String key = remoteProperty.split("=")[0];
				String value = remoteProperty.split("=")[1];
				properties.put(key, value);
			}
		}
		
		((ServiceManagementImpl)serviceManager).setRemoteProperties(properties);

		bundleManager = new BundleManagementImpl(context);
		bundleManagerId = ((ServiceManagementImpl)serviceManager).registerBundleManagement(bundleManager, null, true);
		
		serviceManagerId = serviceManager.registerService(ServiceManagement.class.getName(), serviceManager, null, true, context.getBundle().getBundleId());
		

	}

	public void stop(BundleContext context) throws Exception {
		serviceManager.unregisterService(serviceManagerId);
		serviceManager.unregisterService(bundleManagerId);
	}

}
