package fr.irisa.triskell.kermeta.directedgraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionSearcher;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class DirectedGraphClass implements DirectedGraphInterface {
	protected KermetaUnit unit;
	ArrayList nodes;
	    
    final static public Logger internalLog = LogConfigurationHelper.getLogger("CycleConstraintChecker");
   
    /**
     * @param unit
     */
    
	public DirectedGraphClass(KermetaUnit unit) {
        super();
        this.unit = unit;
        nodes=new ArrayList();
        //construction de l'ensemble des noeuds
        buildNode();
        List iulist = unit.getImportedKermetaUnits();
	    for (int i=0; i<iulist.size(); i++) {	      
	        KermetaUnit iu = (KermetaUnit)iulist.get(i);
	        if ( ! iu.isFramework() )
	        	buildNode(iu);
	    }
    }
	
	public ArrayList getAllNodes() {
		// On retourne une liste de toutes les classes
		return nodes;
	}

	public ArrayList getTargetsforNode(Object node) {
		return visitClassDefinition((ClassDefinition) node);
	}
    
    /**
     * cycle detection need a clean list of all nodes
     */
    public void buildNode() {        
        Iterator it = TypeDefinitionSearcher.getInternalTypesDefinition(unit).iterator();
        while(it.hasNext()) {
            TypeDefinition td = (TypeDefinition)it.next();
            if (td instanceof ClassDefinition) {
            	nodes.add(td);
            }
        }
    }
    public void buildNode(KermetaUnit u) {
        
        
        Iterator it = TypeDefinitionSearcher.getInternalTypesDefinition(unit).iterator();
        while(it.hasNext()) {
            TypeDefinition td = (TypeDefinition)it.next();
            if (td instanceof ClassDefinition) {
            	nodes.add(td);
            	
                //visitClassDefinition((ClassDefinition)td);               
            }
        }
    }
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public ArrayList visitClassDefinition(ClassDefinition clsdef) {
        ArrayList classlist=new ArrayList();
    	Iterator it = clsdef.getOwnedAttribute().iterator();
        while(it.hasNext()) {
            Property prop = (Property)it.next();
            if (isStrictCompositionProperties(prop)){
            	if (prop.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class){
            		fr.irisa.triskell.kermeta.language.structure.Class fclass=(fr.irisa.triskell.kermeta.language.structure.Class) prop.getType();
            		
            		classlist.add(fclass.getTypeDefinition() );
            	}
            }
        }
        //
        return classlist;
    }
    
    /**
     * check is the given property is a strict composition
     * ie. this is a composition and the multiplicity is min 1
     * @param prop
     * @return
     */
    public boolean isStrictCompositionProperties(Property prop){    	
    	
    		    		
    		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
			
	    	// Composition with multiplicity == 1
    		if(prop.isIsComposite()){
    			if( prop.getLower() >= 1){
    				//unit.messages.addError("CONSTRAINT-CHECKER : Composition multiplicity problem : change the multiplicity or do not use composition on the other end of the association. " + pp.ppSimplifiedPropertyInContext(prop), prop);
    				return true;  
    			}
    		}    	
   
    	//Else: nothing to do since there are no opposite
		//
    	return false;
    }

}
