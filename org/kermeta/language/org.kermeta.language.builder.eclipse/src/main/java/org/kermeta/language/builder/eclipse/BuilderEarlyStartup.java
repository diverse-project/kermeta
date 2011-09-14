package org.kermeta.language.builder.eclipse;

import org.eclipse.ui.IStartup;
import org.kermeta.language.builder.eclipse.internal.Activator;

public class BuilderEarlyStartup implements IStartup {

	@Override
	public void earlyStartup() {
		// simply start this bundle
		Activator.getDefault();	
	}

}
