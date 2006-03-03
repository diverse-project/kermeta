/* $Id: KermetaCycleConstraintChecker.java,v 1.2 2006-03-03 15:22:19 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
//import fr.irisa.triskell.kermeta.utils.KMTHelper;

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
            TypeDefinition td = (TypeDefinition)it.next();
            if (td instanceof ClassDefinition) {
            	addNode(td);
            	
                //visitClassDefinition((ClassDefinition)td);               
            }
        }
    }
    
    
    protected void addNode(fr.irisa.triskell.kermeta.language.structure.Object o){
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
    public void visitClassDefinition(ClassDefinition clsdef) {
        
        /*Iterator it = clsdef.getFOwnedOperation().iterator();
        while(it.hasNext()) {
            FOperation op = (FOperation)it.next();
            checkOperation(op);
        }*/
        
    	Iterator it = clsdef.getOwnedAttribute().iterator();
        while(it.hasNext()) {
            Property prop = (Property)it.next();
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
    public boolean isStrictCompositionProperties(Property prop){    	
    	if(prop.getOpposite() != null)
    	{
    		    		
    		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
			
	    	// Composition with multiplicity == 1
    		if(prop.getOpposite().isIsComposite()){
    			if(prop.getUpper() == 1 && prop.getLower() == 1){
    				//unit.messages.addError("CONSTRAINT-CHECKER : Composition multiplicity problem : change the multiplicity or do not use composition on the other end of the association. " + pp.ppSimplifiedPropertyInContext(prop), prop);
    				return true;  
    			}
    		}    	
    	}
    	//Else: nothing to do since there are no opposite
		//
    	return false;
    }
    
    
}
