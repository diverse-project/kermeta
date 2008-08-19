package fr.irisa.triskell.osgi.introspector.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorDynamic;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorStatic;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtilDynamic;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtilStatic;

/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * @see BundleActivator This class is the {@link BundleActivator} of the OSGi
 *      Introspector bundle.
 */
public class Activator implements BundleActivator {

	private OSGiIntrospectorDynamic introspectorDynamic;
	private OSGiIntrospectorStatic introspectorStatic;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		OSGiIntrospectorUtil util = new OSGiIntrospectorUtilDynamic(context);
		this.introspectorDynamic = new OSGiIntrospectorDynamic(context, util);
		context.registerService(this.introspectorDynamic.getClass().getName(),
				this.introspectorDynamic, null);
		System.out.println("Dynamic Introspector service registered");

		util = new OSGiIntrospectorUtilStatic();
		this.introspectorStatic = new OSGiIntrospectorStatic(util);
		context.registerService(this.introspectorStatic.getClass().getName(),
				this.introspectorStatic, null);
		System.out.println("Static Introspector service registered");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Introspector services unregistered");
	}
}
