package fr.irisa.triskell.kermeta.parser;

import java.io.StringReader;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.loader.message.KMUnitParseError;

public class KermetaParserHelper {

	static public CompUnit parse(String content) throws RecognitionException, TokenStreamException {
		KermetaParser p;
		p = new KermetaParser(new KermetaLexer(new StringReader(content.replace('\t', ' '))));
		return p.compUnit();
	}
	
	static public void parse (KMTUnit unit, String content) {
		try {
			parse(content);
		} catch (Exception exception) {
		    unit.messages.addMessage(new KMUnitParseError(exception));
		}
	}
	
}
