/* $Id: ExpressionParser.java,v 1.15 2008-04-28 11:50:24 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : DynamicExpressionUnit.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 f�vr. 2005
* Author : Franck Fleurey
*/
package fr.irisa.triskell.kermeta.loader.expression;


import java.io.StringReader;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationBody;
import fr.irisa.triskell.kermeta.parser.gen.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaParser;

/**
 * @author Franck Fleurey
 */
public class ExpressionParser {

	/**
	 * Parses a String that represents a Kermeta expression and return the corresponding model
	 * element (which type is fr.irisa.triskell.kermeta.language.behavior.Expression)
	 * @param unit The KermetaUnit-context in which this String should be evaluated
	 * @param str A string that is supposed to be a Kermeta expression 
	 * @return the model element representing an Expression.
	 */
	public static Expression parse(LoadingContext context, KermetaUnit unit, String str, IProgressMonitor monitor) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		FExpression  ast_exp = null;
		try {
			ast_exp = parser.asingleExpression().getFExpression();
			
		} catch (RecognitionException e) {
			// unit.messages.addMessage(new KMUnitError("Expression Parse error : " + e, null, ast_exp));
			unit.error("Expression Parse error : " + e); 
			throw new Error(e);
		} catch (TokenStreamException e) {
			unit.error("Expression Parse error : " + e); 
			//unit.messages.addMessage(new KMUnitError("Expression Parse error : " + e, null, ast_exp));
			 throw new Error(e);
		}
		Expression result;
		if (ast_exp != null)
			result = KMT2KMExperessionBuilder.process(context, ast_exp, unit, monitor);
		else 
			result = null;
		return result;
	}

	/**
	 * Parses a String which is supposed to represent a Kermeta Operation, and return the model object representing
	 * the <b>Body</b> of this operation.
	 * @param unit The KermetaUnit-context in which this String should be evaluated
	 * @param str The string supposed to represent an operation. (a "firstKeyword" visitor?)
	 * @return the model element representing an Expression.
	 */
	public static Expression parse_operation2body(LoadingContext context, KermetaUnit unit, String str, IProgressMonitor monitor) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		OperationBody  ast_op = null;
		FExpression  ast_exp = null;
		try {
			ast_op = parser.operation().getOperationBody();
			// If the operation contains an expression, we parse it (otherwise, its type is OperationEmptyBody)
			if (ast_op!=null && ast_op instanceof OperationExpressionBody)
			{
				ast_exp = ((OperationExpressionBody) ast_op).getFExpression();
			}
			
		} catch (RecognitionException e) {
			 //unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			unit.error("Operation Parse error : " + e); 
			throw new Error(e);
		} catch (TokenStreamException e) {
			unit.error("Operation Parse error : " + e); 
			//unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		}
		Expression result;
		if (ast_exp != null)
			result = KMT2KMExperessionBuilder.process(context, ast_exp, unit, monitor);
		else 
			result = null;
		return result;
	}
	
	/**
	 * Parses a String which is supposed to represent a body, and return the model object representing
	 * the <b>Body</b> of this operation.
	 * @param unit The KermetaUnit-context in which this String should be evaluated
	 * @param str The string supposed to represent an operation. (a "firstKeyword" visitor?)
	 * @return the model element representing an Expression.
	 */
	public static Expression parse_operationbody(LoadingContext context, KermetaUnit unit, String str, IProgressMonitor monitor) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		OperationBody  ast_op = null;
		FExpression  ast_exp = null;
		try {
			ast_op = parser.operationBody();
			// If the operation contains an expression, we parse it (otherwise, its type is OperationEmptyBody)
			if (ast_op!=null && ast_op instanceof OperationExpressionBody)
			{
				ast_exp = ((OperationExpressionBody) ast_op).getFExpression();
			}
			
		} catch (RecognitionException e) {
			unit.error("Operation Parse error : " + e);
			//unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		} catch (TokenStreamException e) {
			unit.error("Operation Parse error : " + e); 
			//unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		}
		Expression result;
		if (ast_exp != null)
		{
			result = KMT2KMExperessionBuilder.process(context, ast_exp, unit, monitor);
		}
		else 
			result = null;
		return result;
	}

}
