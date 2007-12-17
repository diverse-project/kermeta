/* $Id: KermetaSpecialIcons.java,v 1.6 2007-12-17 14:05:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaSpecialIcons.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.provider.KermetaEditPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener;


/**
 * @author Franck Fleurey
 */
public class KermetaSpecialIcons {

	final static private URL KermetaEditPluginURL = KermetaEditPlugin.getPlugin().getBaseURL();
	
    public static Image PACKAGE_GRAY = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_gray.gif").createImage();
  
    public static Image PACKAGE_BLUE_RED = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_red.gif").createImage();

    public static Image PACKAGE_BLUE_GREEN = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_green.gif").createImage();

    public static Image KERMETA_LOGO = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/kermeta_logo.gif").createImage();

    public static Image CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/constraint.png").createImage();
    
    public static Image INV_CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/inv.png").createImage();
    
    public static Image PRE_CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/pre.png").createImage();
    
    public static Image POST_CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/post.png").createImage();

    public Image CONDITIONAL = null;

    public Image BLOCK = null;

    public Image LOOP = null;
    
    public Image RESCUE_BLOCK = null;
    
    public Image VARAIBLE_DECLARATION = null;
    
    
    static private KermetaSpecialIcons instance = null;
    
    static public KermetaSpecialIcons getDefault() {
    	if ( instance == null ) {
    		instance = new KermetaSpecialIcons();
    		instance.initialize();
    	}
    	return instance;
    }
    
    private void initialize() {
    	try {
			instance.CONDITIONAL = ImageDescriptor.createFromURL( new URL(KermetaEditPluginURL, "/icons/full/obj16/Conditional.gif") ).createImage();
			instance.BLOCK = ImageDescriptor.createFromURL( new URL(KermetaEditPluginURL, "/icons/full/obj16/Block.gif") ).createImage();
			instance.LOOP = ImageDescriptor.createFromURL( new URL(KermetaEditPluginURL, "/icons/full/obj16/Loop.gif") ).createImage();
			instance.RESCUE_BLOCK = instance.BLOCK;
			instance.VARAIBLE_DECLARATION = ImageDescriptor.createFromURL( new URL(KermetaEditPluginURL, "/icons/full/obj16/VariableDecl.gif") ).createImage();
    	} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }
    
}
