package org.kermeta.kompose.core.parser;

import java.io.InputStream;
import java.util.ArrayList;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import kompose.Composer;

public class KomposeParser {
		private DirectiveLexer lexer;
		private DirectiveParser parser;
		private String exception;
	public KomposeParser(InputStream is){
		this.lexer = new DirectiveLexer(is);
		this.parser = new DirectiveParser(lexer);
		this.exception = new String("");
	}
	public Composer dirUnit() {
		try {
			return this.parser.dirUnit();
		} catch (RecognitionException e) {
			this.exception = e.getMessage();
			return null;
		} catch (TokenStreamException e) {
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
