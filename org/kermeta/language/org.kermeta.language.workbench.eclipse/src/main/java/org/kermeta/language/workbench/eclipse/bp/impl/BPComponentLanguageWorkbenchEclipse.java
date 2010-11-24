/*$Id: $
* Project : org.kermeta.language.workbench.eclipse
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.workbench.eclipse.bp.impl;

import java.io.IOException;
import java.io.InputStream;

import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bundle responsible for 
 * - making sure that Kermeta components of the platform are provisioned
 * - instantiating component instances according to the platform definition
 * - connecting ports
 * It uses an ART2 model to define this platform
 * This bundle is automatically started thanks to blueprint 
 */
public class BPComponentLanguageWorkbenchEclipse {

	/**
	 * Since we are starting kermeta platform we cannot send log to the logger we are instantiating, use slf4j instead
	 */
	final static public Logger internalLog = LoggerFactory.getLogger(BPComponentLanguageWorkbenchEclipse.class.getName());
	private org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService art2ModelHandlerService = null;
    
	private Bundle bundle = null;

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void setArt2ModelHandlerService(Art2ModelHandlerService art2ModelHandlerService) {
        this.art2ModelHandlerService = art2ModelHandlerService;
    }

    public void init() {
        try {
        	String art2FileLocation = "ART2-INF/kermetaWorkbench4Eclipse.art2";
            internalLog.debug( "Updating art runtime from " +art2FileLocation +" ...");
            //FOUND XMI IN META-INF
            InputStream model = bundle.getResource(art2FileLocation).openStream();

            //LOAD XMI
            ContainerRoot root = Art2XmiHelper.loadStream(model);

            //INIT ART2 CORE WITH NEW MODEL
            art2ModelHandlerService.updateModel(root);
            internalLog.debug( "Art runtime updated.");


        } catch (Exception ex) {
            internalLog.error( "failed to init BPComponentLanguageWorkbenchEclipse", ex);
        }
    }

    public void destroy() {
    	art2ModelHandlerService.updateModel(Art2Factory.eINSTANCE.createContainerRoot());
    }
}
