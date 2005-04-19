/* $Id: KermetaTypeChecker.java,v 1.1 2005-04-19 08:55:20 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : KermetaTypeChecker.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * Type checker facade
 * 
 */
public class KermetaTypeChecker {
    
    protected KermetaUnit unit;
    protected TypeCheckerContext context;

    
    // Some information used by testing
    public ArrayList correctOperation = new ArrayList();
    public ArrayList wrongOperations = new ArrayList();
    
    /**
     * @param unit
     */
    public KermetaTypeChecker(KermetaUnit unit) {
        super();
        this.unit = unit;
        context = new TypeCheckerContext(unit);
    }
    
    /**
     * Type check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
        Iterator it = unit.typeDefs.values().iterator();
        while(it.hasNext()) {
            FTypeDefinition td = (FTypeDefinition)it.next();
            if (td instanceof FClassDefinition) {
                checkClassDefinition((FClassDefinition)td);
            }
        }
    }
    
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public void checkClassDefinition(FClassDefinition clsdef) {
        
        Iterator it = clsdef.getFOwnedOperation().iterator();
        while(it.hasNext()) {
            FOperation op = (FOperation)it.next();
            checkOperation(op);
        }
        
        it = clsdef.getFOwnedAttributes().iterator();
        while(it.hasNext()) {
            FProperty prop = (FProperty)it.next();
            checkDerivedProperty(prop);
        }
        
    }
    
    /**
     * Type check the operation given as parameter
     * @param op
     */
    public void checkOperation(FOperation op) {
        
        // THIS IS JUST FOR TESTING PURPOSES
        int error_count = unit.error.size();
        
        // initialize context
        context.init(op.getFOwningClass(), op);
        // check the body of the operation if it is not abstract
        if (op.getFBody() != null)
            ExpressionChecker.typeCheckExpression(op.getFBody(), unit, context);
        
        // THIS IS JUST FOR TESTING PURPOSES
        if (error_count != unit.error.size()) wrongOperations.add(op.getFName());
        else correctOperation.add(op.getFName());
    }
    
    /**
     * Type checks the getter and setter of the derived property
     * @param op
     */
    public void checkDerivedProperty(FProperty op) {
        
        //FIXME: NOT IMPLEMENTED

    }

}
