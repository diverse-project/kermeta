/* $Id: KMT2KMPass6.java,v 1.18 2007-07-27 07:12:17 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass6.java
 * Package : fr.irisa.triskell
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey
 * Description :
 *  The 6th pass to convert a KMT to KM
 * 
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.Hashtable;
import java.util.Iterator;


import org.apache.log4j.Logger;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.GetterBody;
import fr.irisa.triskell.kermeta.ast.Invariant;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.OperationEmptyBody;
import fr.irisa.triskell.kermeta.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.ast.Postcondition;
import fr.irisa.triskell.kermeta.ast.Precondition;
import fr.irisa.triskell.kermeta.ast.SetterBody;
import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TagHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


/**
 * Operation and derived properties body
 * 
 */
public class KMT2KMPass6 extends KMT2KMPass {


	/** used to say if the currentclass is an aspect, this info cannot be stored 
	 * directly in the class since the aspect comes from another kmt file
	 */
	private boolean currentClassIsAnAspect = false;

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2KMPass6");
	
	private Constraint current_constraint = null;
	
	/**
	 * Pre loaded operation bodies as strings
	 * key = operation qualified name
	 * value = body of the op as a string 
	 */
	public Hashtable<String, String> operation_bodies = new Hashtable<String, String>();
	
	
	/**
	 * 
	 */
	public KMT2KMPass6(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
		//System.out.println("Pass 6");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		context.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
		currentClassIsAnAspect = KermetaASTHelper.isAnAspect(classDecl);
		
		context.pushContext();
		// add type variable
		Iterator tvs = context.current_class.getTypeParameter().iterator();
		while(tvs.hasNext()) context.addTypeVar((TypeVariable)tvs.next());
		// add attributes and operations
		
		/*
		 * 
		 * Self Operations and those from the base classes.
		 * 
		 */
		Iterator<fr.irisa.triskell.kermeta.language.structure.Operation> itOp = ClassDefinitionHelper.getAllOperations(context.current_class).iterator(); 
		while (itOp.hasNext()) 
			context.addSymbol(new KMSymbolOperation(itOp.next()));
		
		for ( fr.irisa.triskell.kermeta.language.structure.Operation op : ClassDefinitionHelper.getAllOperations(context.current_class) )
			context.addSymbol( new KMSymbolOperation(op) );
		
		for ( Property prop : ClassDefinitionHelper.getAllProperties(context.current_class) )
			context.addSymbol( new KMSymbolProperty(prop) );
		
/*		for (TypeDefinition typeDefinition : context.current_class.getBaseAspects() ) {
	
			if ( typeDefinition instanceof ClassDefinition ) {
				ClassDefinition current = (ClassDefinition) typeDefinition;
				itOp = ClassDefinitionHelper.getAllOperations(current).iterator();
				while ( itOp.hasNext() )
					context.addSymbol( new KMSymbolOperation(itOp.next()) );
			}
		}*/
		
		/*
		 * 
		 * Self Attributes and those from the base classes.
		 * 
		 */
		Iterator<fr.irisa.triskell.kermeta.language.structure.Property> itProp = ClassDefinitionHelper.getAllProperties(context.current_class).iterator();
		while (itProp.hasNext()) 
			context.addSymbol(new KMSymbolProperty(itProp.next()));
		
		for ( TypeDefinition typeDefinition : context.current_class.getBaseAspects() ) {
			if ( typeDefinition instanceof ClassDefinition ) {
				ClassDefinition current = (ClassDefinition) typeDefinition;
				itProp = ClassDefinitionHelper.getAllProperties(current).iterator();
				while ( itProp.hasNext() )
					context.addSymbol( new KMSymbolProperty(itProp.next()) );
			}
		}
		
		return super.beginVisit(classDecl);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		context.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation)builder.getModelElementByNode(operation);
		context.pushContext();
		// add type variable
		Iterator tvs = context.current_operation.getTypeParameter().iterator();
		while(tvs.hasNext()) context.addTypeVar((TypeVariable)tvs.next());
		// add parameters
		Iterator params = context.current_operation.getOwnedParameter().iterator();
		while(params.hasNext()) context.addSymbol(new KMSymbolParameter((Parameter)params.next()));
		//if (builder.current_operation.getFType() != null && !(builder.current_operation.getFType() instanceof FVoidType)) {
		//	builder.addSymbol(new MCSymbolParameter((Parameter)params.next()));
		//}
		
		return super.beginVisit(operation);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		context.popContext();
		super.endVisit(classDecl);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		context.popContext();
		super.endVisit(operation);
	}
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationEmptyBody)
	 */
	public boolean beginVisit(OperationEmptyBody operationEmptyBody) {
		/*if(currentClassIsAnAspect){
			// this is an update of the current definition, don't change anything
			internalLog.debug("ok, body is abstract for the aspect operation " +context.current_class.getName()+"." + context.current_operation.getName() +
					" from " +builder.getUri());
		}
		else // normal behavior*/
		context.current_operation.setIsAbstract(true);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationExpressionBody)
	 */
	public boolean beginVisit(OperationExpressionBody operationExpressionBody) {
		internalLog.debug("checking operation " +context.current_class.getName()+"." + context.current_operation.getName() +
				" from " +builder.getUri());
		if(currentClassIsAnAspect){

			internalLog.debug("checking aspect operation " +context.current_class.getName()+"." + context.current_operation.getName() +
					" from " +builder.getUri());
			// this is an update of the current definition, this is valid only if the previous definition was abstract 
			// or if the overloadable tag is correctly set
			
			if(context.current_operation.isIsAbstract() || context.current_operation.getBody()==null ){
				// ok lets update the body and changes it to be concrete
				context.current_operation.setIsAbstract(false);				
			}
			else if(TagHelper.findTagFromNameAndValue(context.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true") != null) {			
				// if the previous operation is tagged with overloadable = true then we can replace it by this one
				internalLog.debug("overloading operation " +context.current_class.getName()+"." + context.current_operation.getName() +
						" with version from " +builder.getUri());
				if(!KermetaASTHelper.isOverloadable(operationExpressionBody)) {
					// change tag value to false so it is not overloadable anymore
					fr.irisa.triskell.kermeta.language.structure.Tag tag = TagHelper.findTagFromNameAndValue(context.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
					tag.setValue("false");
				}
			}
			else if(KermetaASTHelper.isOverloadable(operationExpressionBody)){
				// previous operation is not overloadable but this one is, so we can safely ignore this body a keep the original one
				return false;
			}
			else {
				// this is an error !
				builder.error("PASS 6 : Operation '"+context.current_class.getName()+"." + context.current_operation.getName() +
						"' - Operations can be weaved using aspects if only one of those operation is concrete, all other operations must be abstract or tagged as overloadable.");
				/*builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : Operation '"+builder.current_class.getName()+"." + builder.current_operation.getName() +
						"' - Operations can be weaved using aspects if only one of those operation is concrete, all other operations must be abstract or tagged as overloadable.",operationExpressionBody));
				*/
				return false;
			}
		}
		else 
			internalLog.debug("normal operation " +context.current_class.getName()+"." + context.current_operation.getName() +
					" from " +builder.getUri());
		// normal behavior
		String qname = NamedElementHelper.getQualifiedName(context.current_operation);
		if (operation_bodies.containsKey(qname)) {
			context.current_operation.setBody(ExpressionParser.parse(context, builder, (String)operation_bodies.get(qname)));
		}
		else {
			context.current_operation.setBody(KMT2KMExperessionBuilder.process(context, operationExpressionBody.getFExpression(), builder));
		}
		context.current_operation.setIsAbstract(false);
		// if the operation has a tag overloadble true, then add the info in the annotation
		// DVK : the normal tag process in pass 7 must take care that we have already added the tag to the element
		// don't add that tag if it already exist, even with a value to false
		if(KermetaASTHelper.isOverloadable(operationExpressionBody) && 
				TagHelper.findTagFromName(context.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE) == null) {
			TagHelper.createNonExistingTagFromNameAndValue(context.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Invariant)
	 */
	public boolean beginVisit(Invariant invariant) {
		
		Constraint c = StructureFactory.eINSTANCE.createConstraint();
		c.setStereotype(ConstraintType.INV_LITERAL);
		c.setBody(KMT2KMExperessionBuilder.process(context, invariant.getBody(), builder));
		c.setName(getTextForID(invariant.getName()));
		
		builder.storeTrace(c, invariant);
		current_constraint = c;
		context.current_class.getInv().add(c);
		
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Precondition)
	 */
	public boolean beginVisit(Precondition pre) {
		
		Constraint c = StructureFactory.eINSTANCE.createConstraint();
		c.setStereotype(ConstraintType.PRE_LITERAL);
		c.setBody(KMT2KMExperessionBuilder.process(context, pre.getBody(), builder));
		c.setName(getTextForID(pre.getName()));
		
		builder.storeTrace(c, pre);
		current_constraint = c;
		context.current_operation.getPre().add(c);
		
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Postcondition)
	 */
	public boolean beginVisit(Postcondition post) {
		
		Constraint c = StructureFactory.eINSTANCE.createConstraint();
		c.setStereotype(ConstraintType.POST_LITERAL);
		c.setBody(KMT2KMExperessionBuilder.process(context, post.getBody(), builder));
		c.setName(getTextForID(post.getName()));
		
		builder.storeTrace(c, post);
		current_constraint = c;
		context.current_operation.getPost().add(c);
		
		return false;
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.GetterBody)
	 */
	public boolean beginVisit(GetterBody getterBody) {
		if(TagHelper.findTagFromNameAndValue(context.current_property, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true") != null) {			
			// if the previous operation is tagged with overloadable = true then we can replace it by this one
			internalLog.debug("overloading derived property " +context.current_class.getName()+"." + context.current_property.getName() +
					" with version from " +builder.getUri());
		}
		if (context.current_property.isIsDerived()) {
			Expression e =KMT2KMExperessionBuilder.process(context, getterBody.getGetterbody(), builder);
			//builder.current_property.setGetterBody();
			ClassDefinitionHelper.getPropertyByName(context.current_class, context.current_property.getName()).setGetterBody(e);
		}
		else {
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : getters should only be defined for derived attributes (property).", getterBody));
			builder.error("PASS 6 : getters should only be defined for derived attributes (property).");
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.SetterBody)
	 */
	public boolean beginVisit(SetterBody setterBody) {
		if (context.current_property.isIsDerived() && !context.current_property.isIsReadOnly()) {
			context.pushContext();
			//builder.current_property.setSetterBody(KMT2KMExperessionBuilder.process(setterBody.getSetterbody(), builder));
		    Expression e =KMT2KMExperessionBuilder.process(context, setterBody.getSetterbody(), builder);
			ClassDefinitionHelper.getPropertyByName(context.current_class, context.current_property.getName()).setSetterBody(e);

			context.popContext();
		}
		else {
			//builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : setters should only be defined for non readonly derived attributes (property).", setterBody));
			builder.error("PASS 6 : setters should only be defined for non readonly derived attributes (property).");
		}
		return false;
	}
}
