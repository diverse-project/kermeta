package fr.irisa.triskell.kermeta.parser;

import java.io.Reader;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import fr.irisa.triskell.kermeta.ast.CompUnit;

import com.ibm.eclipse.ldt.core.parser.IParser;
import com.ibm.eclipse.ldt.core.parser.ParseContext;
import com.ibm.eclipse.ldt.core.parser.ParseError;
import com.ibm.eclipse.ldt.core.parser.ParseMessage;

/**
 *
 * @generated by Gymnast from kermeta.ast on 20 d�c. 2006 11:43:08
 */
public class KermetaParserDriver implements IParser {

	public ParseContext parse(Reader input) {
		KermetaLexer lexer = new KermetaLexer(input);
		lexer.setColumn(0);
		lexer.setTabSize(1);

		KermetaParser parser = new KermetaParser(lexer);
		ParseContext parseContext = new ParseContext();
		parser.setParseContext(parseContext);
		
		CompUnit compUnit = parseCompUnit(parser, parseContext);
	
		if (parseContext.getMessageCount() == 0) {
			System.out.println("Parse OK!");
		}
		else {
			ParseMessage[] msgs = parseContext.getMessages();
			for (int i = 0; i < msgs.length; i++) {
				System.err.println(msgs[i].getMessage());
			}
		}
		
		return parseContext;
	}
	
	private CompUnit parseCompUnit(KermetaParser parser, ParseContext parseContext) {
	    try {
	        CompUnit compUnit = parser.compUnit();
	        parseContext.setParseRoot(compUnit);
	        return compUnit;
	    }
	    catch (RecognitionException rex) {
	        parseContext.addParseMessage(new ParseError(rex));
	    }
	    catch (TokenStreamException tex) {
	        parseContext.addParseMessage(new ParseError(tex));
	    }
	    catch (Exception ex) {
	        parseContext.addParseMessage(new ParseError(ex.getMessage(), 1));
	    }
	    return null;
	}

}