/* $Id: KermetaCycleConstraintChecker.java,v 1.4 2007-07-20 15:08:18 ftanguy Exp $
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
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.directedgraph.DirectedGraphClass;
import fr.irisa.triskell.kermeta.directedgraph.Findcycle;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionSearcher;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaCycleConstraintChecker {
    
    protected KermetaUnit unit;
    
    Hashtable nodeId2Object = new Hashtable();
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
    	// creation of the graph of class
    	DirectedGraphClass test=new DirectedGraphClass(unit);
    	// initialisation of the finder
		Findcycle find=new Findcycle(test);
		
		//printing the first loop if found
		/*
		if (find.findcycle()){
			ArrayList firstcycle=find.findfirstcycle();
			ArrayList reponse=new ArrayList();
			for (int i=0;i<firstcycle.size();i++){
				reponse.add(((FClassDefinition) firstcycle.get(i)).getName());
			}
			System.out.println("le premier cycle est :" + reponse.toString());
			unit.messages.addError("CONSTRAINT-CHECKER : Composition multiplicity problem : cycle of composition",null);
		}
		*/
		if (find.findcycle()){
			ArrayList allcycle=find.findallcycle();
			ArrayList reponse=new ArrayList();
			for (int j=0;j<allcycle.size();j++){
				ArrayList current=(ArrayList) allcycle.get(j);
				ArrayList rep=new ArrayList();
				for (int i=0;i<current.size();i++){
					rep.add(((ClassDefinition) current.get(i)).getName());
				}
				reponse.add(rep);
			}
			System.out.println("les cycles sont :" + reponse.toString());
			unit.error("CONSTRAINT-CHECKER : Cycle of composition : " + reponse.toString(),
					null);
	//				(ClassDefinition) ((ArrayList) allcycle.get(0)).get(0));
		}
		//System.out.println("cycle :" + find.findloop());
		
		
    }
    
    
    /**
     * cycle detection need a clean list of all nodes
     */
    public void buildNode(KermetaUnit u) {
        
        
        Iterator it = TypeDefinitionSearcher.getTypesDefinition(unit).iterator();
        while(it.hasNext()) {
            TypeDefinition td = (TypeDefinition)it.next();
            if (td instanceof ClassDefinition) {
            	addNode(td);
            	
                //visitClassDefinition((ClassDefinition)td);               
            }
        }
    }
    
    
    protected void addNode(Object o){
    	// get the new id for this object
    	Integer i = new Integer(nodeId2Object.size());
    	nodeId2Object.put(i, o);
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
     * ie. this is a composition and the multiplicity is min 1
     * @param prop
     * @return
     */
    public boolean isStrictCompositionProperties(Property prop){    	
    	if(prop.getOpposite() != null)
    	{
    		    		
    		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
			
	    	// Composition with multiplicity == 1
    		if(prop.isIsComposite()){
    			if( prop.getLower() >= 1){
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
