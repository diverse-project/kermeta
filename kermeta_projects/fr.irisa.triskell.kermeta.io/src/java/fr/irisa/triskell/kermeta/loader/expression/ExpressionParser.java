/* $Id: ExpressionParser.java,v 1.6 2006-03-03 15:22:18 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;

/**
 * @author Franck Fleurey
 */
public class ExpressionParser {

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


}
