package fr.irisa.triskell.kermeta.directedgraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DirectedGraphClass implements DirectedGraphInterface {
	protected KermetaUnit unit;
	ArrayList<TypeDefinition> nodes;
	    
    final static public Logger internalLog = LoggerFactory.getLogger("CycleConstraintChecker");
   
    /**
     * @param unit
     */
    
	public DirectedGraphClass(KermetaUnit unit) {
        super();
        this.unit = unit;
        nodes=new ArrayList<TypeDefinition>();
        //construction de l'ensemble des noeuds
        buildNode();
        List<KermetaUnit> iulist = unit.getImportedKermetaUnits();
	    for (int i=0; i<iulist.size(); i++) {	      
	        KermetaUnit iu = iulist.get(i);
	        if ( ! iu.isFramework() )
	        	buildNode(iu);
	    }
    }
	
	public ArrayList<TypeDefinition> getAllNodes() {
		// On retourne une liste de toutes les classes
		return nodes;
	}

	public ArrayList<TypeDefinition> getTargetsforNode(Object node) {
		return visitClassDefinition((ClassDefinition) node);
	}
    
    /**
     * cycle detection need a clean list of all nodes
     */
    public void buildNode() {
    	for ( TypeDefinition td : KermetaUnitHelper.getInternalTypeDefinitions(unit) )
            if (td instanceof ClassDefinition)
            	nodes.add(td);
    }
    public void buildNode(KermetaUnit u) {
        for ( TypeDefinition td : KermetaUnitHelper.getInternalTypeDefinitions(unit) )
            if (td instanceof ClassDefinition)
            	nodes.add(td);
    }
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public ArrayList<TypeDefinition> visitClassDefinition(ClassDefinition clsdef) {
        ArrayList<TypeDefinition> classlist=new ArrayList<TypeDefinition>();
    	Iterator<Property> it = clsdef.getOwnedAttribute().iterator();
        while(it.hasNext()) {
            Property prop = it.next();
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
    	
    		    		
    		
	    	// Composition with multiplicity == 1
    		if(prop.isIsComposite()){
    			if( prop.getLower() >= 1){
    				// KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
    				//unit.messages.addError("CONSTRAINT-CHECKER : Composition multiplicity problem : change the multiplicity or do not use composition on the other end of the association. " + pp.ppSimplifiedPropertyInContext(prop), prop);
    				return true;  
    			}
    		}    	
   
    	//Else: nothing to do since there are no opposite
		//
    	return false;
    }

}
