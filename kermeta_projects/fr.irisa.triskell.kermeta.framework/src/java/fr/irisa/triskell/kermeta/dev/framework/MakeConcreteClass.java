/* $Id: MakeConcreteClass.java,v 1.7 2007-07-20 15:08:39 ftanguy Exp $
 * Created on Feb 18, 2005
 * By zdrey
 * Description :
 * 		A visitor that transforms the classes/operations of kermeta model into concrete classes/operations
 *      (so, we do nothing, but add emptybodies to the operations)
 * Note : 
 * 		- Each concrete class inherits from abstract one
 *      - Each operation has an empty body, except if there was a concrete one that contains already a body
 * TODO : write here your TODO actions
 *    *Question : do we have to rename the package for concrete file?
 */
package fr.irisa.triskell.kermeta.dev.framework;


//import fr.irisa.triskell.kermeta.language.structure.FClass;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author zdrey
 *
 * Description : create the concrete class for the reflexion module
 */
public class MakeConcreteClass extends KermetaVisitor {

    protected KermetaUnit abstract_unit;
    protected Package impl_pkg;
    /**
     * Constructor
     */
    public MakeConcreteClass(KermetaUnit unit) {
        super();
        
        this.abstract_unit = unit;
    }
    
    /**
     * Concretize the classes : add extend <class> from abstract unit. (
     * remove all the initial inherited packs)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
     */
    public Object visit(ClassDefinition classdef) {
        
        // create the class of classdefinition
    	fr.irisa.triskell.kermeta.language.structure.Class parent_fclass = StructureFactory.eINSTANCE.createClass();
        parent_fclass.setTypeDefinition((ClassDefinition)abstract_unit.getTypeDefinitionByName(
                "kermeta::structure::"+classdef.getName()));
        
        classdef.getSuperType().add(parent_fclass);
        return super.visit(classdef);
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.FOperation)
     */
    public Object visit(Operation operation) {
        
        return super.visit(operation);
    }
}



