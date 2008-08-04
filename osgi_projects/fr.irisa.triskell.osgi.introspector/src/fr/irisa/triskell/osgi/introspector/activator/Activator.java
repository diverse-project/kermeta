package fr.irisa.triskell.osgi.introspector.activator;

import java.util.logging.Level;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorDynamic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorStatic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorUtil;

public class Activator implements BundleActivator {

	private OSGiIntrospectorDynamic introspectorDynamic;
	private OSGiIntrospectorStatic introspectorStatic;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		OSGiIntrospectorUtil.setContext(context);
		this.introspectorDynamic = new OSGiIntrospectorDynamic(context);
		context.registerService(this.introspectorDynamic.getClass().getName(),
				this.introspectorDynamic, null );
		OSGiIntrospectorUtil.log(Level.INFO, "Dynamic Introspector service register");
		
		// TODO ne mettre que le dynamique et pas le static ??
		OSGiIntrospectorUtil.setContext(context);
		this.introspectorStatic = new OSGiIntrospectorStatic();
		context.registerService(this.introspectorStatic.getClass().getName(),
				this.introspectorStatic, null);
		OSGiIntrospectorUtil.log(Level.INFO, "Static Introspector service register");
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
