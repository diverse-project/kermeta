/* $Id: CompileFramework.java,v 1.1 2005-04-18 21:37:36 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : CompileFramework.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2005
* Author : Franck Fleurey
*/ 
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * this class is suposed to compile the standard library
 * into a big kcore model
 */
public class CompileFramework {



    public static void main(String[] args) {
        
        KermetaUnit u = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/kermeta/Standard.kmt");
        
        u.load();
        
        u.saveAllAsKM("dist/framework.km");
        
    }
}
