/* $Id: KermetaConstraintChecker.java,v 1.1 2005-11-25 16:25:44 dvojtise Exp $
* Project : Kermeta IO
* File : KermetaConstraintChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 Nov. 2005
* Authors : 
* 	Didier Vojtisek <dvojtise@irisa.fr>
*/ 

package fr.irisa.triskell.kermeta.constraintchecker;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaConstraintChecker {
    
    protected KermetaUnit unit;
        
    final static public Logger internalLog = LogConfigurationHelper.getLogger("ConstrainChecker");
   
    /**
     * @param unit
     */
    public KermetaConstraintChecker(KermetaUnit unit) {
        super();
        this.unit = unit;
    }
    
    /**
     * Type check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
        
        
        Iterator it = unit.typeDefs.values().iterator();
        while(it.hasNext()) {
            FTypeDefinition td = (FTypeDefinition)it.next();
            if (td instanceof FClassDefinition) {
                checkClassDefinition((FClassDefinition)td);
            }
        }
    }
    
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public void checkClassDefinition(FClassDefinition clsdef) {
        
        /*Iterator it = clsdef.getFOwnedOperation().iterator();
        while(it.hasNext()) {
            FOperation op = (FOperation)it.next();
            checkOperation(op);
        }*/
        
    	Iterator it = clsdef.getFOwnedAttributes().iterator();
        while(it.hasNext()) {
            FProperty prop = (FProperty)it.next();
            checkOppositeProperties(prop);
        }
        
    }
    
    public void checkOppositeProperties(FProperty prop){
    	if(prop.getFOpposite() != null)
    	{
    		if(prop.getFOpposite().getFOpposite() != prop)
	    	{
	    		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
	    		unit.messages.addError("CONSTRAINT-CHECKER : opposite mismatch  : the association is illformed. " + pp.accept(prop), prop);
	    		if(prop.getFOpposite().getFOpposite() == null)
	    			unit.messages.addError("CONSTRAINT-CHECKER : opposite mismatch  : the association is illformed. " + pp.accept(prop.getFOpposite()), prop.getFOpposite());
	    	}
	    	
    	}
    	//Else: nothing to do since there are no opposite
		//
    }
}
