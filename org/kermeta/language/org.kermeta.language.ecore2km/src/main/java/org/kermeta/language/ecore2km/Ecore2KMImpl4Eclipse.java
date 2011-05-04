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

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.structure.ModelingUnit;



public class Ecore2KMImpl4Eclipse  implements org.kermeta.language.ecore2km.api.Ecore2KM {

  
    
    public Ecore2KMImpl4Eclipse(){
    	//org.kermeta.language.ecore2km.internal.Init4Eclipse.init();
    	//((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE).setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory$.MODULE$);
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
    	//org.kermeta.language.language.ecore2kmrunner.MainRunner.init();
    }
    

    
   
    public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
    	/*org.eclipse.emf.ecore.impl.EcorePackageImpl pack =  new org.eclipse.emf.ecore.impl.EcorePackageImpl();// with org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.EPackageAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.DefaultObjectImplementation
    	org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack);
    	pack.setEFactoryInstance(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory$.MODULE$);
    	java.lang.reflect.Field f = 
     	var f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField("ecoreFactory")
    	f.setAccessible(true);
    	*/
    	//org.kermeta.language.ecore2km.internal.Init4Eclipse.init();
    	//((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE).setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.KerRichFactory$.MODULE$);
    	org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
    	//org.kermeta.language.language.ecore2kmrunner.MainRunner.init();

        org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.KerRichFactory.createEcore2km();
        return converter.convert(rootPackage, namespacePrefix);
    }
    
           
}
