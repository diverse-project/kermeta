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
package org.kermeta.language.ecore2km;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.ecore2km.internal.Activator;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.util.ModelingUnit;



public class Ecore2KMImpl4Eclipse  implements org.kermeta.language.ecore2km.api.Ecore2KM {

  
    
    public Ecore2KMImpl4Eclipse(){
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
    	Activator.getDefault().reflexivityLoaderContext();    	
    }
    

    public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix) {
        
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
    
        org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.KerRichFactory.createEcore2km();
        String muName = rootPackage.getName();
        if(rootPackage.eResource() != null){ // use the resource name as name for the ModelingUnit
        	muName = rootPackage.eResource().getURI().lastSegment();
        }
        ModelingUnit mu = new ModelingUnit(muName,new ArrayList<Metamodel>());
        mu.getMetamodels().addAll(converter.convert(rootPackage, namespacePrefix));
        
        return mu;
    }
    
           
}
