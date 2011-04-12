package org.kermeta.language.loader.kmt.scala;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.loader.kmt.scala.internal.lexer.KMLexer;

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
}
