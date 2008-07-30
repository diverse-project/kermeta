package fr.irisa.triskell.osgi.introspector.activator;

import java.util.logging.Level;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorDynamic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorUtil;

public class Activator implements BundleActivator {

	private OSGiIntrospectorDynamic introspector;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		OSGiIntrospectorUtil.setContext(context);
		this.introspector = new OSGiIntrospectorDynamic(context);
		context.registerService(this.introspector.getClass().getName(),
				this.introspector, null // propriétés du service enregistré, a
										// completer peut-etre.
				);
		OSGiIntrospectorUtil.log(Level.INFO, "Introspector service register");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		OSGiIntrospectorUtil.log(Level.INFO, "Introspector service unregister");
	}

}
