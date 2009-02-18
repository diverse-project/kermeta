package org.kermeta.uml2;

import org.eclipse.ui.plugin.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.openembedd.wizards.AbstractDemoPlugin;

/**
 * The main plugin class to be used in the desktop.
 */
public class UML2SamplesPlugin extends AbstractDemoPlugin {
	public ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.openembedd.basic.uml2cwm", path);
	}
}
