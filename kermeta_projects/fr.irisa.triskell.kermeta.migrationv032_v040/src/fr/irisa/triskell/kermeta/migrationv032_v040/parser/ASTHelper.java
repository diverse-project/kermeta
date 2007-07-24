

/*$Id: ASTHelper.java,v 1.2 2007-07-24 13:46:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io2
* File : 	ASTHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.migrationv032_v040.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.CompUnit;


public class ASTHelper {

	public static  CompUnit parse(String file) throws RecognitionException, TokenStreamException, IOException {
		KermetaParser p;
		URI uri = URI.createURI( file );
		URIConverter converter = new URIConverterImpl();
		InputStream stream = converter.createInputStream( uri );
		p = new KermetaParser( new KermetaLexer( new StringReader( readAll(stream).replace('\t', ' ') ) ) );
		return p.compUnit();
	}
	
	public static CompUnit parseString(String content) throws RecognitionException, TokenStreamException {
		KermetaLexer lexer = new KermetaLexer( new StringReader(content.replace('\t', ' ')) );
		KermetaParser p = new KermetaParser( lexer );
		return p.compUnit();
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


