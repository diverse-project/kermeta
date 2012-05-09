package org.kermeta.language.builder.eclipse;

import org.eclipse.ui.IStartup;

public class BuilderEarlyStartup implements IStartup {

	@Override
	public void earlyStartup() {
		// simply start this bundle
		Activator.getDefault();	
	}

}
