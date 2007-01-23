/* $Id: KMT2KMPass6.java,v 1.1 2007-01-23 15:04:12 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolProperty;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
//import fr.irisa.triskell.kermeta.language.structure.FOperation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
//import fr.irisa.triskell.kermeta.language.structure.FProperty;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Annotations;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ClassDecl;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.GetterBody;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Invariant;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Operation;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.OperationEmptyBody;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Postcondition;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Precondition;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.SetterBody;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;


/**
 * Operation and derived properties body
 * 
 */
public class KMT2KMPass6 extends KMT2KMPass {

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
		builder.current_operation.setIsAbstract(true);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationExpressionBody)
	 */
	public boolean beginVisit(OperationExpressionBody operationExpressionBody) {
		String qname = NamedElementHelper.getQualifiedName(builder.current_operation);
		if (builder.operation_bodies.containsKey(qname)) {
			builder.current_operation.setBody(ExpressionParser.parse(builder, (String)builder.operation_bodies.get(qname)));
		}
		else {
			builder.current_operation.setBody(KMT2KMExperessionBuilder.process(operationExpressionBody.getFExpression(), builder));
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
		if (builder.current_property.isIsDerived()) {
			builder.current_property.setGetterBody(KMT2KMExperessionBuilder.process(getterBody.getGetterbody(), builder));
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
			builder.current_property.setSetterBody(KMT2KMExperessionBuilder.process(setterBody.getSetterbody(), builder));
			builder.popContext();
		}
		else {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 6 : setters should only be defined for non readonly derived attributes (property).", setterBody));
		}
		return false;
	}
}
