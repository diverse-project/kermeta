package org.openembedd.logo.csm.tutorial;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.openembedd.wizards.AbstractDemoPlugin;

/**
 * The main plugin class to be used in the desktop.
 */
public class LogoCSMDemoPlugin extends AbstractDemoPlugin
{
	public ImageDescriptor getImageDescriptor(String path)
	{
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.openembedd.logo.csm.tutorial", path);
	}
}
