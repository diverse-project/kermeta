/*
 * Created on 15 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.expression;

import java.io.StringReader;
import java.util.Enumeration;
import java.util.Hashtable;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FTypeReference;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMExperessionBuilder;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ExpressionParser {

	public static FExpression parse(KermetaUnit unit, String str) {
		KermetaParser parser = new KermetaParser(new KermetaLexer(new StringReader(str.replace('\t', ' '))));
		fr.irisa.triskell.kermeta.ast.FExpression  ast_exp = null;
		try {
			ast_exp = parser.asingleExpression().getFExpression();
			
		} catch (RecognitionException e) {
			 unit.error.add(new KMUnitError("Expression Parse error : " + e, null));
			 throw new Error(e);
		} catch (TokenStreamException e) {
			 unit.error.add(new KMUnitError("Expression Parse error : " + e, null));
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
