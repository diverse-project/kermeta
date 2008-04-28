

/*$Id: ASTHelper.java,v 1.6 2008-04-28 11:50:17 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io2
* File : 	ASTHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaParser;


public class ASTHelper {

	public static  CompUnit parse(String file) throws RecognitionException, TokenStreamException, IOException {
		KermetaParser p;
		p = createParser( createLexerForFile(file) );
		return p.compUnit();
	}
	
	public static CompUnit parseString(String content) throws RecognitionException, TokenStreamException {
		KermetaLexer lexer = createLexerForString(content);
		KermetaParser p = createParser(lexer);
		return p.compUnit();
	}
	
	private static KermetaParser createParser(KermetaLexer lexer) {
		lexer.setTokenObjectClass("antlr.TokenWithIndex");
		KermetaParser parser = new KermetaParser(lexer);
	    //parser.lexer = lexer;
		return parser;
	}
	
	private static KermetaLexer createLexerForFile(String file) throws IOException {
		URI uri = URI.createURI( file );
		URIConverter converter = new URIConverterImpl();
		InputStream stream = converter.createInputStream( uri );
		KermetaLexer lexer = new KermetaLexer( stream );
		return lexer;
	}
	
	private static KermetaLexer createLexerForString(String content) {
		Reader r = new StringReader(content);
		KermetaLexer lexer = new KermetaLexer( r );
		return lexer;
	}
	
	private static String readAll(InputStream in) { 
	    StringBuffer output = new StringBuffer();
	    try
	    {
	        int c; 
	       // int charcount = 0; int linenum = 1; int c_old = -1;
	        while ((c = in.read()) != -1) {
	            output.append((char)c);
	        }
	        in.close();
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    return output.toString();
	}
	
}


