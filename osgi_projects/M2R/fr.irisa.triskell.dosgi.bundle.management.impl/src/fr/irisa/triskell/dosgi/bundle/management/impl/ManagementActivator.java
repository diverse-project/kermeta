package fr.irisa.triskell.dosgi.bundle.management.impl;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.dosgi.bundle.management.BundleManagement;
import fr.irisa.triskell.dosgi.bundle.management.ServiceManagement;

public class ManagementActivator implements BundleActivator {

	private ServiceManagement serviceManager;
	private BundleManagement bundleManager;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		serviceManager = new ServiceManagementImpl(context);
		serviceManager.registerService(ServiceManagement.class.getName(), serviceManager, null, true, context.getBundle().getBundleId());
		
		String remoteProperties = context.getProperty("remote-properties");
		Properties properties = new Properties();
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
		((ServiceManagementImpl)serviceManager).registerBundleManagement(bundleManager, null, true);
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
