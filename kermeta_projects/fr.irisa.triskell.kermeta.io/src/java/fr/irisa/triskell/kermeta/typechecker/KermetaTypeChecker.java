/* $Id: KermetaTypeChecker.java,v 1.34 2008-04-14 09:49:59 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : KermetaTypeChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2005
* Authors : 
* 		Franck Fleurey
* 		Didier Vojtisek
*/ 

package fr.irisa.triskell.kermeta.typechecker;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * @author Franck Fleurey
 * 
 * Type checker facade
 * 
 */
public class KermetaTypeChecker {
    
	final static private Logger internalLog = LogConfigurationHelper.getLogger("TypeChecker");	
	
    protected KermetaUnit unit;
   
    protected TypeCheckerContext context;
        
    private boolean internalOperation = false;
    
    public Type getTypeOfExpression(fr.irisa.triskell.kermeta.language.behavior.Expression expression) {
        return new SimpleType(expression.getStaticType());
    }
    
    
    // Some information used by testing
    public ArrayList<String> correctOperation = new ArrayList<String>();
    public ArrayList<String> wrongOperations = new ArrayList<String>();
    
    /**
     * @param unit
     */
    public KermetaTypeChecker(KermetaUnit unit) {
        super();
        this.unit = unit;
        if (unit.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object") != null)
        	TypeCheckerContext.initializeTypeChecker(unit);
        context = new TypeCheckerContext(unit);
    }
       
    
    private void checkPackages(List<Package> packages) {
    	for ( Package current : packages ) {
    		
        	// Lets call this the structural-only pass, and check type parameterizations, too
        	for ( TypeDefinition td : current.getOwnedTypeDefinition() ) {      		
        		if (td instanceof ClassDefinition) {
        			ClassDefinition cdef = (ClassDefinition) td;
           			// Check any parameterized supertypes
        			for (fr.irisa.triskell.kermeta.language.structure.Type sup : cdef.getSuperType())
        				ParameterizedTypeChecker.checkType(sup, unit, context, cdef);

        			// Check property types
        			for (Property prop : cdef.getOwnedAttribute()) {
        				if ( prop.getType() != null )
        					ParameterizedTypeChecker.checkType( prop.getType(), unit, context, prop );
        				else
        					unit.error("TYPE-CHECKER : property " + td.getName() + "." + prop.getName() + " has no type", prop);
        			}

        			// Check operation signatures
        			for ( Operation op : cdef.getOwnedOperation() ) {
        				if ( op.getType() != null )
        					ParameterizedTypeChecker.checkType(op.getType(), unit, context, op);

        				//Check parameter types
        				for ( Parameter param : op.getOwnedParameter() )
        					ParameterizedTypeChecker.checkType( param.getType(), unit, context, param );
        			}
 
        		} else if (td instanceof PrimitiveType) {
        			// Check aliased types
        			ParameterizedTypeChecker.checkType(((PrimitiveType)td).getInstanceType(), unit, context, (PrimitiveType)td);
        		}
        	}
        	
        	// Second, check for each class def, its operation (inc. bodies) and properties
        	// (Uses annotations set above to check operation call "new".)
        	for ( TypeDefinition td : current.getOwnedTypeDefinition() ) {      		
            	if (td instanceof ClassDefinition)
                    checkClassDefinition((ClassDefinition)td);
            }

    	}
    }
    
    
    /**
     * Type check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {		
   		if ( ! unit.isTypeChecked() ) {
    		internalLog.info("Typechecking " + unit.getUri());
    		if ( ! unit.isErroneous() ) {
    			internalOperation = true;
	    		checkPackages( unit.getInternalPackages() );
	    		unit.setTypeChecked( true );
	    	}
		    	
    		if ( ! unit.isErroneous() ) {
	    			
    			for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(unit) ) {
    				if ( ! importedUnit.isTypeChecked() && ! importedUnit.isErroneous() ) {
    					CallableFeaturesCache.destroyInstance();
		    			KermetaTypeChecker t = new KermetaTypeChecker(importedUnit);
		    			t.checkUnit();
		    		}
		    	}
    		}
    	}
    }
    
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param classDefinition
     */
    public void checkClassDefinition(ClassDefinition classDefinition) {
       	for ( Operation op : classDefinition.getOwnedOperation() )
            checkOperation(op);
       	
    	for ( Property prop : classDefinition.getOwnedAttribute() )
            checkDerivedProperty(prop);
    	
    	for ( Constraint c : classDefinition.getInv() )
            checkConstraint(c);
    }
    
    public void checkConstraint(Constraint c) {     	
    	if (c.eContainer() instanceof ClassDefinition)
    		context.init((ClassDefinition)c.eContainer());
    	else
    		context.init(((Operation)c.eContainer()).getOwningClass(),(Operation) c.eContainer());
    	
    	ExpressionChecker.typeCheckExpression(c.getBody(), unit, context);
        if(getTypeOfExpression(c.getBody()).isSubTypeOf(TypeCheckerContext.VoidType) || !(getTypeOfExpression(c.getBody()).isSubTypeOf(TypeCheckerContext.BooleanType))) {
        	unit.error("TYPE-CHECKER : The type of a constraint should be Boolean", c.getBody());
   		}
    }
    
    /**
     * Type check the operation given as parameter
     * @param op
     */
    public void checkOperation(Operation op) {
        
        // THIS IS JUST FOR TESTING PURPOSES
        int error_count = unit.getMessages().size();
        
        // initialize context
        context.init(op.getOwningClass(), op);
        // check the body of the operation if it is not abstract
        if (op.getBody() != null)
            ExpressionChecker.typeCheckExpression(op.getBody(), unit, context);
        
        for ( Constraint c : op.getPre() )
            checkConstraint(c);

        for ( Constraint c : op.getPost() )
            checkConstraint(c);
        
        OperationTypeVariableChecker.checkOperationTypeVariables(unit, op);
   /*  DVK  desactivate unfinished checker for (TypeVariable tv : op.getTypeParameter()){
        	checkOperationTypeParameter(op, tv);
        }
        */
        // THIS IS JUST FOR TESTING PURPOSES
        if ( internalOperation ) {
        	if (error_count != unit.getMessages().size())
        		wrongOperations.add(op.getName());
        	else 
        		correctOperation.add(op.getName());
       }
        
    }
    
    
    public void checkExpression(fr.irisa.triskell.kermeta.language.behavior.Expression expression) {
        ExpressionChecker.typeCheckExpression(expression, unit, context);
    }
    
    /**
     * Type checks the getter and setter of the derived property
     * @param op
     */
    public void checkDerivedProperty(Property op) { 
        if ( op.isIsDerived() ) {
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
