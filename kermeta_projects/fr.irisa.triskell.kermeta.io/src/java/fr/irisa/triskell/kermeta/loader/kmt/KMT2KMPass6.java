/* $Id: KMT2KMPass6.java,v 1.16 2007-05-03 14:04:54 barais Exp $
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

import java.util.Iterator;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.GetterBody;
import fr.irisa.triskell.kermeta.ast.Invariant;
import fr.irisa.triskell.kermeta.ast.KermetaASTHelper;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.OperationEmptyBody;
import fr.irisa.triskell.kermeta.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.ast.Postcondition;
import fr.irisa.triskell.kermeta.ast.Precondition;
import fr.irisa.triskell.kermeta.ast.SetterBody;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
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
	
	/**
	 * 
	 */
	public KMT2KMPass6(KermetaUnit builder) {
		super(builder);
		//System.out.println("Pass 6");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		builder.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
		currentClassIsAnAspect = KermetaASTHelper.isAnAspect(classDecl);
		
		builder.pushContext();
		// add type variable
		Iterator tvs = builder.current_class.getTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((TypeVariable)tvs.next());
		// add attributes and operations
		Iterator<fr.irisa.triskell.kermeta.language.structure.Operation> itOp = ClassDefinitionHelper.getAllOperations(builder.current_class).iterator(); 
		while (itOp.hasNext()) builder.addSymbol(new KMSymbolOperation(itOp.next()));
		Iterator<fr.irisa.triskell.kermeta.language.structure.Property> itProp = ClassDefinitionHelper.getAllProperties(builder.current_class).iterator();
		while (itProp.hasNext()) builder.addSymbol(new KMSymbolProperty(itProp.next()));
		return super.beginVisit(classDecl);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		builder.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation)builder.getModelElementByNode(operation);
		builder.pushContext();
		// add type variable
		Iterator tvs = builder.current_operation.getTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((TypeVariable)tvs.next());
		// add parameters
		Iterator params = builder.current_operation.getOwnedParameter().iterator();
		while(params.hasNext()) builder.addSymbol(new KMSymbolParameter((Parameter)params.next()));
		//if (builder.current_operation.getFType() != null && !(builder.current_operation.getFType() instanceof FVoidType)) {
		//	builder.addSymbol(new MCSymbolParameter((Parameter)params.next()));
		//}
		
		return super.beginVisit(operation);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		builder.popContext();
		super.endVisit(classDecl);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
		builder.popContext();
		super.endVisit(operation);
	}
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationEmptyBody)
	 */
	public boolean beginVisit(OperationEmptyBody operationEmptyBody) {
		if(currentClassIsAnAspect){
			// this is an update of the current definition, don't change anything
			internalLog.debug("ok, body is abstract for the aspect operation " +builder.current_class.getName()+"." + builder.current_operation.getName() +
					" from " +builder.getUri());
		}
		else // normal behavior
			builder.current_operation.setIsAbstract(true);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationExpressionBody)
	 */
	public boolean beginVisit(OperationExpressionBody operationExpressionBody) {
		internalLog.debug("checking operation " +builder.current_class.getName()+"." + builder.current_operation.getName() +
				" from " +builder.getUri());
		if(currentClassIsAnAspect){

			internalLog.debug("checking aspect operation " +builder.current_class.getName()+"." + builder.current_operation.getName() +
					" from " +builder.getUri());
			// this is an update of the current definition, this is valid only if the previous definition was abstract 
			// or if the overloadable tag is correctly set
			
			if(builder.current_operation.isIsAbstract() || builder.current_operation.getBody()==null ){
				// ok lets update the body and changes it to be concrete
				builder.current_operation.setIsAbstract(false);				
			}
			else if(TagHelper.findTagFromNameAndValue(builder.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true") != null) {			
				// if the previous operation is tagged with overloadable = true then we can replace it by this one
				internalLog.debug("overloading operation " +builder.current_class.getName()+"." + builder.current_operation.getName() +
						" with version from " +builder.getUri());
				if(!KermetaASTHelper.isOverloadable(operationExpressionBody)) {
					// change tag value to false so it is not overloadable anymore
					fr.irisa.triskell.kermeta.language.structure.Tag tag = TagHelper.findTagFromNameAndValue(builder.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
					tag.setValue("false");
				}
			}
			else if(KermetaASTHelper.isOverloadable(operationExpressionBody)){
				// previous operation is not overloadable but this one is, so we can safely ignore this body a keep the original one
				return false;
			}
			else {
				// this is an error !
				builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : Operation '"+builder.current_class.getName()+"." + builder.current_operation.getName() +
						"' - Operations can be weaved using aspects if only one of those operation is concrete, all other operations must be abstract or tagged as overloadable.",operationExpressionBody));
				
				return false;
			}
		}
		else 
			internalLog.debug("normal operation " +builder.current_class.getName()+"." + builder.current_operation.getName() +
					" from " +builder.getUri());
		// normal behavior
		String qname = NamedElementHelper.getQualifiedName(builder.current_operation);
		if (builder.operation_bodies.containsKey(qname)) {
			builder.current_operation.setBody(ExpressionParser.parse(builder, (String)builder.operation_bodies.get(qname)));
		}
		else {
			builder.current_operation.setBody(KMT2KMExperessionBuilder.process(operationExpressionBody.getFExpression(), builder));
		}
		builder.current_operation.setIsAbstract(false);
		// if the operation has a tag overloadble true, then add the info in the annotation
		// DVK : the normal tag process in pass 7 must take care that we have already added the tag to the element
		// don't add that tag if it already exist, even with a value to false
		if(KermetaASTHelper.isOverloadable(operationExpressionBody) && 
				TagHelper.findTagFromName(builder.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE) == null) {
			TagHelper.createNonExistingTagFromNameAndValue(builder.current_operation, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Invariant)
	 */
	public boolean beginVisit(Invariant invariant) {
		
		Constraint c = builder.struct_factory.createConstraint();
		c.setStereotype(ConstraintType.INV_LITERAL);
		c.setBody(KMT2KMExperessionBuilder.process(invariant.getBody(), builder));
		c.setName(getTextForID(invariant.getName()));
		
		builder.storeTrace(c, invariant);
		builder.current_constraint = c;
		builder.current_class.getInv().add(c);
		
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Precondition)
	 */
	public boolean beginVisit(Precondition pre) {
		
		Constraint c = builder.struct_factory.createConstraint();
		c.setStereotype(ConstraintType.PRE_LITERAL);
		c.setBody(KMT2KMExperessionBuilder.process(pre.getBody(), builder));
		c.setName(getTextForID(pre.getName()));
		
		builder.storeTrace(c, pre);
		builder.current_constraint = c;
		builder.current_operation.getPre().add(c);
		
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Postcondition)
	 */
	public boolean beginVisit(Postcondition post) {
		
		Constraint c = builder.struct_factory.createConstraint();
		c.setStereotype(ConstraintType.POST_LITERAL);
		c.setBody(KMT2KMExperessionBuilder.process(post.getBody(), builder));
		c.setName(getTextForID(post.getName()));
		
		builder.storeTrace(c, post);
		builder.current_constraint = c;
		builder.current_operation.getPost().add(c);
		
		return false;
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.GetterBody)
	 */
	public boolean beginVisit(GetterBody getterBody) {
		if(TagHelper.findTagFromNameAndValue(builder.current_property, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true") != null) {			
			// if the previous operation is tagged with overloadable = true then we can replace it by this one
			internalLog.debug("overloading derived property " +builder.current_class.getName()+"." + builder.current_property.getName() +
					" with version from " +builder.getUri());
		}
		if (builder.current_property.isIsDerived()) {
			Expression e =KMT2KMExperessionBuilder.process(getterBody.getGetterbody(), builder);
			//builder.current_property.setGetterBody();
			ClassDefinitionHelper.getPropertyByName(builder.current_class, builder.current_property.getName()).setGetterBody(e);
		}
		else {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : getters should only be defined for derived attributes (property).", getterBody));
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.SetterBody)
	 */
	public boolean beginVisit(SetterBody setterBody) {
		if (builder.current_property.isIsDerived() && !builder.current_property.isIsReadOnly()) {
		    builder.pushContext();
			//builder.current_property.setSetterBody(KMT2KMExperessionBuilder.process(setterBody.getSetterbody(), builder));
		    Expression e =KMT2KMExperessionBuilder.process(setterBody.getSetterbody(), builder);
			ClassDefinitionHelper.getPropertyByName(builder.current_class, builder.current_property.getName()).setSetterBody(e);

			builder.popContext();
		}
		else {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : setters should only be defined for non readonly derived attributes (property).", setterBody));
			
		}
		return false;
	}
}
