/* $Id: $
 * Project    : org.kermeta.language.ecore2km
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 25 nov. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 *            Arnaud Blouin
 */
package org.kermeta.language.ecore2km.api;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.structure.ModelingUnit;


/*import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;
import org.kermeta.language.language.ecore2kmrunner.MainRunner;
import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.ecore2km.Ecore2km;
*/
public class Ecore2KMImpl  implements org.kermeta.language.ecore2km.api.Ecore2KM {

  
    
    
    

    
   
    public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init();

        org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.RichFactory.createEcore2km();
        return converter.convert(rootPackage, namespacePrefix);
    }
    
           
}