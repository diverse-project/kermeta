/* $Id: ExpressionParser.java,v 1.4 2005-09-15 12:40:33 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;

/**
 * @author Franck Fleurey
 */
public class ExpressionParser {

	public static FExpression parse(KermetaUnit unit, String str) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_exp = parser.asingleExpression().getFExpression();
			
		} catch (RecognitionException e) {
			 unit.messages.addMessage(new KMUnitError("Expression Parse error : " + e, null));
			 throw new Error(e);
		} catch (TokenStreamException e) {
			 unit.messages.addMessage(new KMUnitError("Expression Parse error : " + e, null));
			 throw new Error(e);
		}
		FExpression result;
		if (ast_exp != null)
			result = KMT2KMExperessionBuilder.process(ast_exp, unit);
		else 
			result = null;
		return result;
	}


}
