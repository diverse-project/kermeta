/* $Id: MakeConcreteClass.java,v 1.2 2005-02-21 10:05:25 zdrey Exp $
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

import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author zdrey
 *
 * Description : create the concrete class for the reflexion module
 */
public class MakeConcreteClass extends KermetaVisitor {

    protected KermetaUnit abstract_unit;
    protected FPackage impl_pkg;
    /**
     * Constructor
     */
    public MakeConcreteClass(KermetaUnit unit) {
        super();
        
        this.abstract_unit = unit;
    }
    
    /**
     * Concretize the classes : add extend <class>. (
     * remove all the initial inherited packs)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FClassDefinition)
     */
    public Object visit(FClassDefinition classdef) {
        
        // create the class of classdefinition
        FClass parent_fclass = abstract_unit.struct_factory.createFClass();
        System.out.println(classdef.getFName());
        parent_fclass.setFClassDefinition((FClassDefinition)abstract_unit.getTypeDefinitionByName(
                "kermeta::structure::"+classdef.getFName()));
        
       //FClassDefinition cClassdef = unit.struct_factory.createFClassDefinition();
       classdef.getFSuperType().add(parent_fclass);
        return super.visit(classdef);
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FOperation)
     */
    public Object visit(FOperation operation) {
        
        return null;
    }
}



