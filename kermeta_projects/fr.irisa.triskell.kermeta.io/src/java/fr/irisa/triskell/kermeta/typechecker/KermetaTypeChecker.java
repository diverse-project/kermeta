/* $Id: KermetaTypeChecker.java,v 1.20 2007-08-07 15:47:06 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : KermetaTypeChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.typechecker;


import java.util.ArrayList;
import java.util.Iterator;
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
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
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
    /** Attribute that is set to semantically abstract class definitions */
    public static final String IS_SEMANTICALLY_ABSTRACT = "isSemanticallyAbstract";
        
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
    	Iterator <Package> iterator = packages.iterator();
    	while ( iterator.hasNext() ) {
    		
    		Package current = iterator.next();
        	
        	Iterator <TypeDefinition> it = current.getOwnedTypeDefinition().iterator();
            // First, annotate semantically abstract class definitions
        	// Lets call this the structural-only pass, and check type parameterizations, too
        	while ( it.hasNext() ) {

        		TypeDefinition td = it.next();
        		
        		if (td instanceof ClassDefinition) {
        			ClassDefinition cdef = (ClassDefinition) td;
        			annotateSemanticallyAbstractClassDefinition(cdef);
           			// Check any parameterized supertypes
        			for (Object sup : cdef.getSuperType()) {
        				ParameterizedTypeChecker.checkType((fr.irisa.triskell.kermeta.language.structure.Type) sup, unit, context, cdef);
        			}
        			// Check property types
        			for (Object prop : cdef.getOwnedAttribute()) {
        				ParameterizedTypeChecker.checkType(((Property) prop).getType(), unit, context, (Property)prop);
        			}
        			// Check operation signatures
        			for (Object opObj : cdef.getOwnedOperation()) {
        				Operation op = (Operation) opObj;
        				if (null != op.getType()) {
        					ParameterizedTypeChecker.checkType(op.getType(), unit, context, op);
        				}
        				//Check parameter types
        				for (Object param : op.getOwnedParameter()) {
        					ParameterizedTypeChecker.checkType(((Parameter)param).getType(), unit, context, (Parameter)param);
        				}
        			}
        		} else if (td instanceof PrimitiveType) {
        			// Check aliased types
        			ParameterizedTypeChecker.checkType(((PrimitiveType)td).getInstanceType(), unit, context, (PrimitiveType)td);
        		}
        	}
            // Second, check for each class def, its operation (inc. bodies) and properties
        	// (Uses annotations set above to check operation call "new".)
        	it = current.getOwnedTypeDefinition().iterator();
        	while ( it.hasNext() )
        	{
        		TypeDefinition td = it.next();
                if (td instanceof ClassDefinition) {
                    checkClassDefinition((ClassDefinition)td);
                }
            }

        	
    	}
    }
    
    
    /**
     * Type check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {		
    	synchronized ( KermetaTypeChecker.class ) {
    		internalLog.info("Typechecking " + unit.getUri());
    		if ( ! unit.isTypeChecked() && ! unit.isErrored() ) {
    			internalOperation = true;
	    		checkPackages( unit.getInternalPackages() );
	    		/*internalOperation = false;
	    		checkPackages( unit.getExternalPackages() );*/
	    		unit.setTypeChecked( true );
	    	}
	    	
	    	for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(unit) ) {
	    		if ( ! importedUnit.isTypeChecked() ) {
	    			KermetaTypeChecker t = new KermetaTypeChecker(importedUnit);
	    			t.checkUnit();
	    		}
	    	}
	    }
    }
    
	/** 
	 * A semantically abstract class definition contains at least one abstract 
	 * operation, or does not provide a concrete implementation of an inherited
	 * operation.
	 * This method adds a transient tag to any type definition that is "semantically abstract".
	 * The tag name is "isSemanticallyAbstract"
	 * If this tag exists, its value represent a message explaining why it is abstract
	 * <pre>
	 * class A {
	 * 		operation x() is abstract
	 * 		operation y() is do end
	 * }
	 * 
	 * class B inherits A {
	 * 	 	method x() is do end
	 * }
	 * </pre>
	 * 
	 * FIXME : This method is not efficient.
	 */
	public boolean annotateSemanticallyAbstractClassDefinition(ClassDefinition typedef)
	{
		boolean foundSAbstractTag = false;
		if (typedef.isIsAbstract()) return true;
		Iterator<CallableOperation> it = InheritanceSearch.callableOperations(InheritanceSearch.getFClassForClassDefinition((ClassDefinition)typedef)).iterator();
		while (it.hasNext() && !foundSAbstractTag && !ClassDefinitionHelper.isSemanticallyAbstract(typedef))
		{
			Operation op = ((CallableOperation)it.next()).getOperation();
			if (op.isIsAbstract()) {
				/*
				 * 
				 * Maybe the class is an aspect and the operation is defined in on of its base classes.
				 * 
				 */
				for ( TypeDefinition typeDefinition : (List<TypeDefinition>) typedef.getBaseAspects() ) {
					if ( typeDefinition instanceof ClassDefinition ) {
						ClassDefinition classDefinition = (ClassDefinition) typeDefinition;
						
					}
				}
				
				foundSAbstractTag = true;
				Tag tag = StructureFactory.eINSTANCE.createTag(); 
				tag.setName(IS_SEMANTICALLY_ABSTRACT); tag.setValue(op.getName());
				//typedef.getTag().add(tag);
				typedef.getOwnedTag().add(tag);
			}
		}
		return foundSAbstractTag;
	}
	

    
    /**
     * Type check all the operations and derived properties
     * of a class definition
     * @param clsdef
     */
    public void checkClassDefinition(ClassDefinition clsdef) {
		
        Iterator<Operation> itOp = clsdef.getOwnedOperation().iterator();
        while(itOp.hasNext()) {
            Operation op = (Operation)itOp.next();
            checkOperation(op);
        }
        
        Iterator<Property> itProp = clsdef.getOwnedAttribute().iterator();
        while(itProp.hasNext()) {
            Property prop = (Property)itProp.next();
            checkDerivedProperty(prop);
        }
        
        Iterator<Constraint> itConstraint = clsdef.getInv().iterator();
        while(itConstraint.hasNext()) {
            Constraint c = (Constraint)itConstraint.next();
            checkConstraint(c);
        }
    }
    
    public void checkConstraint(Constraint c)
    { 
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
        
        Iterator<Constraint> it = op.getPre().iterator();
        while(it.hasNext()) {
            Constraint c = (Constraint)it.next();
            checkConstraint(c);
        }
        
        it = op.getPost().iterator();
        while(it.hasNext()) {
            Constraint c = (Constraint)it.next();
            checkConstraint(c);
        }
        
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
