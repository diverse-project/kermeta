package org.kermeta.language.loader.kmt.scala;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.loader.kmt.scala.internal.lexer.KMLexer;
import org.kermeta.language.loader.kmt.scala.internal.lexer.KMLexical;

import scala.collection.Iterator;

public class Lexer implements org.kermeta.language.loader.kmt.scala.api.Lexer{
    public List<IKToken> lex(String content) {

        List<IKToken> result = new ArrayList<IKToken>();

        KMLexer lexer = new KMLexer(content);

        while (!lexer.atEnd()) {
            Object t = lexer.nextToken();
            result.add((IKToken) t);
        }

        return result;

    }

	@Override
	public List<String> getDelimiters() {
		KMLexical lexical = new KMLexical();
		List<String> result = new ArrayList<String>();
		
		for (Object oneElement : lexical.delimiters().table()) {
			if (oneElement != null) {
				result.add(oneElement.toString());
			}
		}
		return result;
	}

	@Override
	public List<String> getReservedWords() {
		KMLexical lexical = new KMLexical();
		List<String> result = new ArrayList<String>();

		for (Object oneElement : lexical.reserved().table()) {
			if (oneElement != null) {
				result.add(oneElement.toString());
			}
		}
		return result;
	}
}
