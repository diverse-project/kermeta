/* $Id: KMT2KMPass7.java,v 1.1 2005-02-25 14:41:25 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass7.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Author : zdrey
 * Description :
 *  The 7th pass to convert a KMT to KM, which consist to adding the commments 
 * in the code as annotation of the kermeta model elements
 * 
 * TODO :
 * 	1. Get the annotations associated to each operation and print it
 *  2. Get the annotations juxtaposed (no space)
 * 
 * We assume, until I don't know when, that the following rules :
 * ----------------------
 * 	class someclass1
 *  n1* whitespace
 *  c1
 *  n2* whitespace
 *  c2
 *  n3* whitespace
 *  class someclass2
 *  -----------------------
 *  n1 > n3 : // c2 belongs to the element "someclass1"
	n1 < n3 : //c1 belongs to the element "someclass1"
	
the above rules dominate the below rules :
	
	n1 > n3 and n2 > n1 : // c1 belongs to "someclass1"
	n1 > n3 and n1 > n2 : // c1 belongs to "someclass2"

	n1 < n3 and n2 < n3 : // c2 belongs to "someclass1"
	n1 < n3 and n2 > n3 : // c2 belongs to "someclass2"
 * 
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.ast.Annotations;
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
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation)  
 * 
 */
public class KMT2KMPass7 extends KMT2KMPass {

	/**
	 * 
	 */
	public KMT2KMPass7(KermetaUnit builder) {
		super(builder);
		System.out.println("Passe 7");
	}
	
	/**
	 * Check the comments defined from the following kermeta.ast rules :
	 *
	 * abstract topLevelDecl : (annotations) 
	 * 	subPackageDecl | classDecl 
	 * | enumDecl | dataTypeDecl (annotations); 
	 * 
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
	    System.out.println("Youhooooouuuuu");
	    /* left annotations, and right annotations*/
	    Annotations preAnnLst  = classDecl.getPreAnnotations();
	    Annotations postAnnLst = classDecl.getPostAnnotations();

	    /* Get the number of lines between precomment and classdeclaration 
	     * position of classDecl - position of last ann. in the list of annotations
	     * */
	    int start = classDecl.getRangeStart();
	    int fckff = classDecl.getRangeEnd();
	    int offset = classDecl.getOffset();
	    System.out.println("start range :\n"+start);
	    System.out.println("end range :\n"+fckff);
	    System.out.println("offset range :\n"+offset);
	    
	    //classDecl.
	
	    return false;
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		return super.beginVisit(operation);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.ClassDecl)
	 */
	public void endVisit(ClassDecl classDecl) {
		
		super.endVisit(classDecl);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#endVisit(metacore.ast.Operation)
	 */
	public void endVisit(Operation operation) {
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
			builder.error.add(new KMUnitError("PASS 6 : getters should only be defined for derived attributes (property).", getterBody));
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
			builder.error.add(new KMUnitError("PASS 6 : setters should only be defined for non readonly derived attributes (property).", setterBody));
		}
		return false;
	}
}
