package org.kermeta.language.loader.kmt.scala.api;

public interface Lexer {
	
	public java.util.List<IKToken> lex(String content);

}
