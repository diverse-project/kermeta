/* $Id: KermetaCycleConstraintChecker.java,v 1.1 2005-11-29 14:17:11 dvojtise Exp $
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
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaCycleConstraintChecker {
    
    protected KermetaUnit unit;
    
    Hashtable nodeId2FObject = new Hashtable();
    Hashtable fObject2nodeId = new Hashtable();
        
    final static public Logger internalLog = LogConfigurationHelper.getLogger("CycleConstraintChecker");
   
    /**
     * @param unit
     */
    public KermetaCycleConstraintChecker(KermetaUnit unit) {
        super();
        this.unit = unit;
    }
    
    public void check() {
    	internalLog.debug("Starting Cycle check");
    	// cycle check must use all imported units
        buildNode(unit);
    	ArrayList iulist = unit.getAllImportedUnits();
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        buildNode(iu);
	    }
	    
	    // update the flag indicating that all imported unit has been checked
	    unit.cycle_constraint_checked = true;
	    for (int i=0; i<iulist.size(); i++) {	        
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        iu.cycle_constraint_checked =  true;
	    }
    }
    
    
    /**
     * cycle detection need a clean list of all nodes
     */
    public void buildNode(KermetaUnit u) {
        
        
        Iterator it = u.typeDefs.values().iterator();
        while(it.hasNext()) {
            FTypeDefinition td = (FTypeDefinition)it.next();
            if (td instanceof FClassDefinition) {
            	addNode(td);
            	
                //visitClassDefinition((FClassDefinition)td);               
            }
        }
    }
    
    
    protected void addNode(FObject o){
    	// get the new id for this object
    	Integer i = new Integer(nodeId2FObject.size());
    	nodeId2FObject.put(i, o);
    	fObject2nodeId.put(o, i);
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
           // checkOppositeProperties(prop);
           // buildDirectedGraphForStrictComposition();
        }
        
        // add the classDef to the nodes for 
    }
    
    /**
     * check is the given property is a strict composition
     * ie. this is a composition and the multiplicity is 1
     * @param prop
     * @return
     */
    public boolean isStrictCompositionProperties(FProperty prop){    	
    	if(prop.getFOpposite() != null)
    	{
    		    		
    		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
			
	    	// Composition with multiplicity == 1
    		if(prop.getFOpposite().isFIsComposite()){
    			if(prop.getFUpper() == 1 && prop.getFLower() == 1){
    				//unit.messages.addError("CONSTRAINT-CHECKER : Composition multiplicity problem : change the multiplicity or do not use composition on the other end of the association. " + pp.ppSimplifiedFPropertyInContext(prop), prop);
    				return true;  
    			}
    		}    	
    	}
    	//Else: nothing to do since there are no opposite
		//
    	return false;
    }
    
    
}
