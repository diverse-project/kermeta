/* $Id: KermetaConstraintChecker.java,v 1.2 2005-11-29 14:17:11 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaConstraintChecker {
    
    protected KermetaUnit unit;
        
    final static public Logger internalLog = LogConfigurationHelper.getLogger("ConstraintChecker");
   
    /**
     * @param unit
     */
    public KermetaConstraintChecker(KermetaUnit unit) {
        super();
        this.unit = unit;
    }
    
    /**
     * check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
        
        
        Iterator it = unit.typeDefs.values().iterator();
        while(it.hasNext()) {
            FTypeDefinition td = (FTypeDefinition)it.next();
            if (td instanceof FClassDefinition) {
                visitClassDefinition((FClassDefinition)td);

                
            }
        }
    }
    
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public void visitClassDefinition(FClassDefinition clsdef) {
        
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
        
        // add the classDef to the nodes for 
    }
    
    public void checkOppositeProperties(FProperty prop){
    	if(prop.getFOpposite() != null)
    	{
    		    		
    		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
			// opposite mismatch
    		if(prop.getFOpposite().getFOpposite() != prop)
	    	{
	    		unit.messages.addError("CONSTRAINT-CHECKER : opposite mismatch  : the association is illformed. " + pp .ppSimplifiedFPropertyInContext(prop), prop);
	    		if(prop.getFOpposite().getFOpposite() == null)
	    			unit.messages.addError("CONSTRAINT-CHECKER : opposite mismatch  : the association is illformed. " + pp.ppSimplifiedFPropertyInContext(prop.getFOpposite()), prop.getFOpposite());
	    	}
	    	// Composition multiplicity
    		if(prop.getFOpposite().isFIsComposite()){
    			if(prop.getFUpper() != 1){
    				unit.messages.addError("CONSTRAINT-CHECKER : Composition multiplicity problem : change the multiplicity or do not use composition on the other end of the association. " + pp.ppSimplifiedFPropertyInContext(prop), prop);    	    		
    			}
    		}
    		// Double Composition (association with diamond on both ends !) 
    		if(prop.getFOpposite().isFIsComposite()){
    			if(prop.isFIsComposite()){
    				// message on this end only, the other end will be checked too from the other class
    				unit.messages.addError("CONSTRAINT-CHECKER : Double composition problem (container contained by its content) : please consider splitting this association in 2 associations. " + pp.ppSimplifiedFPropertyInContext(prop), prop);    	    		
    			}
    		}
    	}
    	//Else: nothing to do since there are no opposite
		//
    }
    
    
}
