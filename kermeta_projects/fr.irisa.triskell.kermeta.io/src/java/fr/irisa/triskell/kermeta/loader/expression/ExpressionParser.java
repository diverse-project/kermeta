/* $Id: ExpressionParser.java,v 1.8 2006-04-10 17:32:03 zdrey Exp $
* Project : Kermeta (First iteration)
* File : DynamicExpressionUnit.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 févr. 2005
* Author : Franck Fleurey
*/
package fr.irisa.triskell.kermeta.loader.expression;

import java.io.StringReader;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.ast.PrimitiveExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPrimitiveExpressionBuilder;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;

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
	public static Expression parse(KermetaUnit unit, String str) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_exp = parser.asingleExpression().getFExpression();
			
		} catch (RecognitionException e) {
			 unit.messages.addMessage(new KMUnitError("Expression Parse error : " + e, null, ast_exp));
			 throw new Error(e);
		} catch (TokenStreamException e) {
			 unit.messages.addMessage(new KMUnitError("Expression Parse error : " + e, null, ast_exp));
			 throw new Error(e);
		}
		Expression result;
		if (ast_exp != null)
			result = KMT2KMExperessionBuilder.process(ast_exp, unit);
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
	public static Expression parse_operation2body(KermetaUnit unit, String str) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		fr.irisa.triskell.kermeta.ast.OperationBody  ast_op = null;
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_op = parser.operation().getOperationBody();
			// If the operation contains an expression, we parse it (otherwise, its type is OperationEmptyBody)
			if (ast_op!=null && ast_op instanceof OperationExpressionBody)
			{
				ast_exp = ((OperationExpressionBody) ast_op).getFExpression();
			}
			
		} catch (RecognitionException e) {
			 unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		} catch (TokenStreamException e) {
			 unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		}
		Expression result;
		if (ast_exp != null)
			result = KMT2KMExperessionBuilder.process(ast_exp, unit);
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
	public static Expression parse_operationbody(KermetaUnit unit, String str) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		fr.irisa.triskell.kermeta.ast.OperationBody  ast_op = null;
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_op = parser.operationBody();
			// If the operation contains an expression, we parse it (otherwise, its type is OperationEmptyBody)
			if (ast_op!=null && ast_op instanceof OperationExpressionBody)
			{
				ast_exp = ((OperationExpressionBody) ast_op).getFExpression();
			}
			
		} catch (RecognitionException e) {
			 unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		} catch (TokenStreamException e) {
			 unit.messages.addMessage(new KMUnitError("Operation Parse error : " + e, null, ast_op));
			 throw new Error(e);
		}
		Expression result;
		if (ast_exp != null)
		{
			result = KMT2KMExperessionBuilder.process(ast_exp, unit);
		}
		else 
			result = null;
		return result;
	}

}
