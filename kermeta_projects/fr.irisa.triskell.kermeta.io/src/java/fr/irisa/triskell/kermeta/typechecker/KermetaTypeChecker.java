/* $Id: KermetaTypeChecker.java,v 1.8 2006-03-03 15:22:18 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

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
        
    public Type getTypeOfExpression(fr.irisa.triskell.kermeta.language.behavior.Expression expression) {
        return new SimpleType(expression.getStaticType());
    }
    
    
    // Some information used by testing
    public ArrayList correctOperation = new ArrayList();
    public ArrayList wrongOperations = new ArrayList();
    
    /**
     * @param unit
     */
    public KermetaTypeChecker(KermetaUnit unit) {
        super();
        this.unit = unit;
//      initialize the type checker if this is the std lib
        if (unit.typeDefinitionLookup("kermeta::language::structure::Object") != null)
            TypeCheckerContext.initializeTypeChecker(unit);
        else
            TypeCheckerContext.initializeTypeChecker(KermetaUnit.getStdLib());
        context = new TypeCheckerContext(unit);
        
    }
    
    /**
     * Type check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
        
        
        Iterator it = unit.typeDefs.values().iterator();
        while(it.hasNext()) {
            TypeDefinition td = (TypeDefinition)it.next();
            if (td instanceof ClassDefinition) {
                checkClassDefinition((ClassDefinition)td);
            }
        }
    }
    
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public void checkClassDefinition(ClassDefinition clsdef) {
        
        Iterator it = clsdef.getOwnedOperation().iterator();
        while(it.hasNext()) {
            Operation op = (Operation)it.next();
            checkOperation(op);
        }
        
        it = clsdef.getOwnedAttribute().iterator();
        while(it.hasNext()) {
            Property prop = (Property)it.next();
            checkDerivedProperty(prop);
        }
        
    }
    
    /**
     * Type check the operation given as parameter
     * @param op
     */
    public void checkOperation(Operation op) {
        
        // THIS IS JUST FOR TESTING PURPOSES
        int error_count = unit.messages.getMessages().size();
        
        // initialize context
        context.init(op.getOwningClass(), op);
        // check the body of the operation if it is not abstract
        if (op.getBody() != null)
            ExpressionChecker.typeCheckExpression(op.getBody(), unit, context);
        
        // THIS IS JUST FOR TESTING PURPOSES
        if (error_count != unit.messages.getMessages().size()) wrongOperations.add(op.getName());
        else correctOperation.add(op.getName());
    }
    
    public void checkExpression(fr.irisa.triskell.kermeta.language.behavior.Expression expression) {
        ExpressionChecker.typeCheckExpression(expression, unit, context);
    }
    
    /**
     * Type checks the getter and setter of the derived property
     * @param op
     */
    public void checkDerivedProperty(Property op)
    { 
        if (op.isIsDerived())
        {
            // initialize context (add "value")
            context.init(op.getOwningClass(), op);
            if (op.getSetterBody() != null)
                ExpressionChecker.typeCheckExpression(op.getSetterBody(), unit, context);
            if (op.getGetterBody() != null)
                ExpressionChecker.typeCheckExpression(op.getGetterBody(), unit, context);
        }
        
    }

    public TypeCheckerContext getContext() {
        return context;
    }
}
