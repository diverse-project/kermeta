package factory.weaver;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import eu.diva.factoryinstdiva.Factory;

public class Activator implements BundleActivator{

	public static BundleContext context;
	
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		Properties props = new Properties();
		props.put("Factory", "Weaver");
		context.registerService(
				Factory.class.getName(), factory.weaver.Factory.getFact(), props);
	}

	
	public void stop(BundleContext context) throws Exception {

	}

}
