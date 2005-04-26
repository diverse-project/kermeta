/* $Id: KMT2KMPass6.java,v 1.4 2005-04-26 08:28:07 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.GetterBody;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.OperationEmptyBody;
import fr.irisa.triskell.kermeta.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.ast.SetterBody;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;


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
		builder.current_class = (FClassDefinition)builder.getModelElementByNode(classDecl);
		builder.pushContext();
		// add type variable
		Iterator tvs = builder.current_class.getFTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((FTypeVariable)tvs.next());
		// add attributes and operations
		Iterator it = builder.getAllOperations(builder.current_class).iterator();
		while (it.hasNext()) builder.addSymbol(new KMSymbolOperation((FOperation)it.next()));
		it = builder.getAllProperties(builder.current_class).iterator();
		while (it.hasNext()) builder.addSymbol(new KMSymbolProperty((FProperty)it.next()));
		return super.beginVisit(classDecl);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		builder.current_operation = (FOperation)builder.getModelElementByNode(operation);
		builder.pushContext();
		// add type variable
		Iterator tvs = builder.current_operation.getFTypeParameter().iterator();
		while(tvs.hasNext()) builder.addTypeVar((FTypeVariable)tvs.next());
		// add parameters
		Iterator params = builder.current_operation.getFOwnedParameter().iterator();
		while(params.hasNext()) builder.addSymbol(new KMSymbolParameter((FParameter)params.next()));
		//if (builder.current_operation.getFType() != null && !(builder.current_operation.getFType() instanceof FVoidType)) {
		//	builder.addSymbol(new MCSymbolParameter((FParameter)params.next()));
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
		builder.current_operation.setFIsAbstract(true);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationExpressionBody)
	 */
	public boolean beginVisit(OperationExpressionBody operationExpressionBody) {
		String qname = builder.getQualifiedName(builder.current_operation);
		if (builder.operation_bodies.containsKey(qname)) {
			builder.current_operation.setFBody(ExpressionParser.parse(builder, (String)builder.operation_bodies.get(qname)));
		}
		else {
			builder.current_operation.setFBody(KMT2KMExperessionBuilder.process(operationExpressionBody.getFExpression(), builder));
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.GetterBody)
	 */
	public boolean beginVisit(GetterBody getterBody) {
		if (builder.current_property.isFIsDerived()) {
			builder.current_property.setFGetterbody(KMT2KMExperessionBuilder.process(getterBody.getGetterbody(), builder));
		}
		else {
			builder.error.add(new KMTUnitLoadError("PASS 6 : getters should only be defined for derived attributes (property).", getterBody));
		}
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.SetterBody)
	 */
	public boolean beginVisit(SetterBody setterBody) {
		if (builder.current_property.isFIsDerived() && !builder.current_property.isFIsReadOnly()) {
			builder.current_property.setFSetterbody(KMT2KMExperessionBuilder.process(setterBody.getSetterbody(), builder));
		}
		else {
			builder.error.add(new KMTUnitLoadError("PASS 6 : setters should only be defined for non readonly derived attributes (property).", setterBody));
		}
		return false;
	}
}
