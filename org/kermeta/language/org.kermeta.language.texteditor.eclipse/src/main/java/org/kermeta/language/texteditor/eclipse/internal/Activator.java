/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/
package org.kermeta.language.texteditor.eclipse.internal;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.eclipse.api.EclipseMessagingSystem;
import org.osgi.framework.BundleContext;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	public enum ImageTypes {
		LocalPackage,
		ExtPackage,
		MixedPackage,
		LocalClass,
		ExtClass,
		MixedClass,
		LocalOperation,
		ExtOperation,
		MixedOperation,
		LocalInvariant,
		ExtInvariant,
		LocalPre,
		ExtPre,
		LocalPost,
		ExtPost,
		LocalAttribute,
		ExtAttribute,
		LocalReference,
		ExtReference,
		LocalDerivedProp,
		ExtDerivedProp,
		LocalEnumeration,
		ExtEnumeration,
		LocalEnumLiteral,
		ExtEnumLiteral,
		Error,
		Warning
	}
	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.language.texteditor.eclipse"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	// The IFile dirty
	public Map<IFile,String> dirtyFilesContainment = new HashMap<IFile,String>();
	public Map<ImageTypes,Image> outlineImages = new HashMap<ImageTypes,Image>();
	protected MessagingSystem messaggingSystem;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		messaggingSystem = new EclipseMessagingSystem("", "Kermeta editor console");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public MessagingSystem getMessaggingSystem() {
		return messaggingSystem;
	}
	private Image getImageFile(String name,ImageTypes type){
		URL url = Activator.getDefault().getBundle().getEntry(name); //"icons/error.gif");
		if ( url != null ){
			Image image =  ImageDescriptor.createFromURL(url).createImage();
			if (image != null){
				this.outlineImages.put(type, image);
			}
			return image;
		} else {
			return null;
		}
	}
	public Image getImage(ImageTypes name){
		Object imageObj = this.outlineImages.get(name);
		if ( imageObj != null ){
			return (Image)imageObj;
		} else {
			switch (name){
			case LocalPackage:
				return this.getImageFile("icons/red/package.png", ImageTypes.LocalPackage);
			case ExtPackage:
				return this.getImageFile("icons/blue/package.png", ImageTypes.ExtPackage);
			case MixedPackage:
				return this.getImageFile("icons/redblue/package.png", ImageTypes.MixedPackage);
			case LocalClass:
				return this.getImageFile("icons/red/class.png", ImageTypes.LocalClass);
			case ExtClass:
				return this.getImageFile("icons/blue/class.png", ImageTypes.ExtClass);
			case MixedClass:
				return this.getImageFile("icons/redblue/class.png", ImageTypes.MixedClass);
			case LocalOperation:
				return this.getImageFile("icons/red/operation.png", ImageTypes.LocalOperation);
			case ExtOperation:
				return this.getImageFile("icons/blue/operation.png", ImageTypes.ExtOperation);
			case MixedOperation:
				return this.getImageFile("icons/redblue/operation.png", ImageTypes.MixedOperation);
			case LocalInvariant:
				return this.getImageFile("icons/inv.png", ImageTypes.LocalInvariant);
			case ExtInvariant:
				return this.getImageFile("icons/inv.png", ImageTypes.ExtInvariant);
			case LocalPre:
				return this.getImageFile("icons/pre.png", ImageTypes.LocalPre);
			case ExtPre:
				return this.getImageFile("icons/pre.png", ImageTypes.ExtPre);
			case LocalPost:
				return this.getImageFile("icons/post.png", ImageTypes.LocalPost);
			case ExtPost:
				return this.getImageFile("icons/post.png", ImageTypes.ExtPost);
			case LocalReference:
				return this.getImageFile("icons/red/property.png", ImageTypes.LocalReference);
			case ExtReference:
				return this.getImageFile("icons/blue/property.png", ImageTypes.ExtReference);
			case LocalAttribute:
				return this.getImageFile("icons/red/property_contained.png", ImageTypes.LocalAttribute);
			case ExtAttribute:
				return this.getImageFile("icons/blue/property_contained.png", ImageTypes.ExtAttribute);
			case LocalDerivedProp:
				return this.getImageFile("icons/red/property_derived.png", ImageTypes.LocalDerivedProp);
			case ExtDerivedProp:
				return this.getImageFile("icons/blue/property_derived.png", ImageTypes.ExtDerivedProp);
			case LocalEnumeration:
				return this.getImageFile("icons/red/enum.png", ImageTypes.LocalEnumeration);
			case ExtEnumeration:
				return this.getImageFile("icons/blue/enum.png", ImageTypes.ExtEnumeration);
			case LocalEnumLiteral:
				return this.getImageFile("icons/red/enum.png", ImageTypes.LocalEnumLiteral);
			case ExtEnumLiteral:
				return this.getImageFile("icons/blue/enum.png", ImageTypes.ExtEnumLiteral);
			case Error:
				return this.getImageFile("icons/error.gif", ImageTypes.Error);
			case Warning:
				return this.getImageFile("icons/warning_co.gif", ImageTypes.Warning);
			}
			return null;
		}
	}

}
