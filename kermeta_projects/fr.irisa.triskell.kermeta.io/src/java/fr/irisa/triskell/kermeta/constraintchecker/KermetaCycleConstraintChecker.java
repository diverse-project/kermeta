/* $Id: KermetaCycleConstraintChecker.java,v 1.10 2008-05-28 13:37:13 dvojtise Exp $
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

import org.apache.commons.logging.Log;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.directedgraph.DirectedGraphClass;
import fr.irisa.triskell.kermeta.directedgraph.Findcycle;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaCycleConstraintChecker {
    
    protected KermetaUnit unit;
    
    Hashtable<Integer, Object> nodeId2Object = new Hashtable<Integer, Object>();
    Hashtable<Object, Integer> fObject2nodeId = new Hashtable<Object, Integer>();
        
    final static public Log internalLog = LogConfigurationHelper.getLogger("CycleConstraintChecker");
   
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
			ArrayList<ArrayList<String>> reponse=new ArrayList<ArrayList<String>>();
			for (int j=0;j<allcycle.size();j++){
				ArrayList<ClassDefinition> current=(ArrayList<ClassDefinition>) allcycle.get(j);
				ArrayList<String> rep=new ArrayList<String>();
				for (int i=0;i<current.size();i++){
					rep.add( current.get(i).getName());
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
        for ( TypeDefinition td : KermetaUnitHelper.getTypeDefinitions(unit) )
            if (td instanceof ClassDefinition)
            	addNode(td);            	           
    }
    
    
    protected void addNode(Object o){
    	// get the new id for this object
    	Integer i = new Integer(nodeId2Object.size());
    	nodeId2Object.put(i, o);
    	fObject2nodeId.put(o, i);
    }
    /*
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    //public void visitClassDefinition(ClassDefinition clsdef) {
        
        /*Iterator it = clsdef.getFOwnedOperation().iterator();
        while(it.hasNext()) {
            FOperation op = (FOperation)it.next();
            checkOperation(op);
        }*/
        
    	/*Iterator it = clsdef.getOwnedAttribute().iterator();
        while(it.hasNext()) {
            Property prop = (Property)it.next();
           // checkOppositeProperties(prop);
           // buildDirectedGraphForStrictComposition();
        }*/
        
        // add the classDef to the nodes for 
    //}
    
    /**
     * check is the given property is a strict composition
     * ie. this is a composition and the multiplicity is min 1
     * @param prop
     * @return
     */
    public boolean isStrictCompositionProperties(Property prop){    	
    	if(prop.getOpposite() != null)
    	{
    		    		    		
	    	// Composition with multiplicity == 1
    		if(prop.isIsComposite()){
    			if( prop.getLower() >= 1){
    				return true;  
    			}
    		}    	
    	}
    	//Else: nothing to do since there are no opposite
		//
    	return false;
    }
    
    
}
