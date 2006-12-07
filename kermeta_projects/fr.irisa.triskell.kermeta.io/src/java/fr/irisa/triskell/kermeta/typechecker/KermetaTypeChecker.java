/* $Id: KermetaTypeChecker.java,v 1.14 2006-12-07 08:04:38 dvojtise Exp $
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
import java.util.Collection;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;

/**
 * @author Franck Fleurey
 * 
 * Type checker facade
 * 
 */
public class KermetaTypeChecker {
    
    protected KermetaUnit unit;
    protected TypeCheckerContext context;
    /** Attribute that is set to semantically abstract class definitions */
    public static final String IS_SEMANTICALLY_ABSTRACT = "isSemanticallyAbstract";
        
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
            TypeCheckerContext.initializeTypeChecker(StdLibKermetaUnitHelper.getKermetaUnit());
        context = new TypeCheckerContext(unit);
        
    }
    
    /**
     * Type check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
    	Collection<TypeDefinition> typedefs = unit.typeDefs.values();
        // First, annotate semantically abstract class definitions
    	// Lets call this the structural-only pass, and check type parameterizations, too
    	for (TypeDefinition td : typedefs)
    	{
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
    	for (TypeDefinition td : typedefs)
    	{
            if (td instanceof ClassDefinition) {
                checkClassDefinition((ClassDefinition)td);
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
		Iterator it = InheritanceSearch.callableOperations(InheritanceSearch.getFClassForClassDefinition((ClassDefinition)typedef)).iterator();
		while (it.hasNext() && !foundSAbstractTag && !ClassDefinitionHelper.isSemanticallyAbstract(typedef))
		{
			Operation op = ((CallableOperation)it.next()).getOperation();
			if (op.isIsAbstract())
			{
				foundSAbstractTag = true;
				Tag tag = StructureFactory.eINSTANCE.createTag(); 
				tag.setName(IS_SEMANTICALLY_ABSTRACT); tag.setValue(op.getName());
				typedef.getTag().add(tag);
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
        
        it = clsdef.getInv().iterator();
        while(it.hasNext()) {
            Constraint c = (Constraint)it.next();
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
           if(!getTypeOfExpression(c.getBody()).isSubTypeOf(TypeCheckerContext.BooleanType)) {
   				unit.messages.addError("TYPE-CHECKER : The type of a constraint should be Boolean", c.getBody());
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
        
        Iterator it = op.getPre().iterator();
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
