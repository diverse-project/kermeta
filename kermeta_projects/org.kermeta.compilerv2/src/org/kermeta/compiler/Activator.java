package org.kermeta.compiler;

import java.util.Properties;

import org.eclipse.core.runtime.Plugin;
import org.kermeta.compiler.service.CompilerService;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		Properties props = new Properties();
        context.registerService(
            CompilerService.class.getName(), new CompilerServiceImpl(), props);
        
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		super.stop(context);
	}
	
	

}
