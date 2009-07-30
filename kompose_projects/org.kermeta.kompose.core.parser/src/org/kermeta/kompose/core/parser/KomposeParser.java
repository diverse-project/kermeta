package org.kermeta.kompose.core.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import kompose.Composer;

public class KomposeParser {
		private DirectivesLexer lexer;
		private DirectivesParser parser;
		private String exception;
	public KomposeParser(InputStream is){
		try {
			this.lexer = new DirectivesLexer(new ANTLRInputStream(is));
		} catch (IOException e) {
			e.printStackTrace();
		}
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		this.parser = new DirectivesParser(tokens);
		this.exception = new String("");
	}
	public Composer dirUnit() {
		try {
			return this.parser.dirUnit();
		} catch (RecognitionException e) {
			this.exception = e.getMessage();
			return null;
		}
	}
	
	public String getException(){
		return this.exception;
	}
	
	public ArrayList<String> getErrors(){
		return this.parser.errors;
	}
}
