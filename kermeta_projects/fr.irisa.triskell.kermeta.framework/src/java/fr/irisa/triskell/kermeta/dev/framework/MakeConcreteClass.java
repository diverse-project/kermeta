/* $Id: MakeConcreteClass.java,v 1.1 2005-02-21 09:12:23 zdrey Exp $
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

    protected KermetaUnit unit;
    protected FPackage impl_pkg;
    /**
     * Constructor
     */
    public MakeConcreteClass(KermetaUnit unit) {
        super();
        impl_pkg = unit.struct_factory.createFPackage();
        impl_pkg.setFName("impl");
        
        this.unit = unit;
    }
    
    /**
     * Create a sub package
     * @return
     */
/*    public Object visit(FPackage pkg)
    {
        if (pkg.getFNestedPackage()==null)
        {
            impl_pkg.setFNestingPackage(pkg);
        }
        return super.visit(pkg);
    }
*/    
    /**
     * Concretize the classes : change the name of classes (KM<class>) and add extend <class>. (
     * remove all the initial inherited packs)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FClassDefinition)
     */
    public Object visit(FClassDefinition classdef) {
        
        // create the class of classdefinition
        FClass parent_fclass = unit.struct_factory.createFClass();
        parent_fclass.setFName(unit.getQualifiedName(classdef));
        
        if (classdef.isFIsAbstract() == false)
            classdef.setFIsAbstract(false);
        else 
            System.out.println(classdef.getFName()+"is Abstract!");
        
        System.out.println(unit.getQualifiedName(classdef));
       //FClassDefinition cClassdef = unit.struct_factory.createFClassDefinition();
       
        
        //if (classdef.getFSuperType()!=null)
        //{	classdef.getFSuperType().add(parent_fclass); }
        //classdef.g
        return super.visit(classdef);
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FOperation)
     */
    public Object visit(FOperation operation) {
        
    	if (operation.isFIsAbstract() == true)
    		operation.setFIsAbstract(true);
    	else
    	{
    	    operation.setFIsAbstract(false);
    	    // set a body, even empty
    	    // create a comment tag?
    	    if (operation.getFBody() == null)
    	    {  
    	        FTag tagComment = unit.struct_factory.createFTag();
        	    
        	    tagComment.setFName("comment");
        	    tagComment.setFValue("Implement this method");
        	    // TODO : add this comment in the body of this operation
        	    
    	        operation.setFBody(null);
    	    }
    	    
    	}
        return null;
    }
}



