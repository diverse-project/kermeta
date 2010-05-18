/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.lexer;

import java.util.HashMap;
import java.util.Map;
import org.kermeta.language.LexicalWords;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.*;
import scala.collection.Iterator;

/**
 *
 * @author ffouquet
 */
public final class KermetaLexer implements Lexer<KmTokenId> {

    private static final int EOF = LexerInput.EOF;
    private static final Map<String, KmTokenId> keywords = new HashMap<String, KmTokenId>();
    private static final Map<String, KmTokenId> delimiters = new HashMap<String, KmTokenId>();

    static {
        LexicalWords lexicalWords = new org.kermeta.language.LexicalWords();

        Iterator iterKeyword = lexicalWords.keywords().iterator();
        while (iterKeyword.hasNext()) {
            String keyword = iterKeyword.next().toString();
            keywords.put(keyword, KmTokenId.KEYWORD);
        }
        Iterator iterDelimiter = lexicalWords.delimiters().iterator();
        while (iterDelimiter.hasNext()) {
            String keyword = iterDelimiter.next().toString();
            delimiters.put(keyword, KmTokenId.SEPARATOR);
        }
    }
    private LexerInput input;
    private TokenFactory<KmTokenId> tokenFactory;

    KermetaLexer(LexerRestartInfo<KmTokenId> info) {
        this.input = info.input();
        this.tokenFactory = info.tokenFactory();
        assert (info.state() == null); // passed argument always null
    }

    @Override
    public Token<KmTokenId> nextToken() {
        while (true) {
            int ch = input.read();
            switch (ch) {
                case '+':
                    return token(KmTokenId.PLUS);

                case '-':
                    return token(KmTokenId.MINUS);

                case '*':
                    return token(KmTokenId.STAR);

                case '/':
                    switch (input.read()) {
                        case '/': // in single-line comment
                            while (true) {
                                switch (input.read()) {
                                    case '\r':
                                        input.consumeNewline();
                                    case '\n':
                                    case EOF:
                                        return token(KmTokenId.SL_COMMENT);
                                }
                            }
                        case '*': // in multi-line comment
                            while (true) {
                                ch = input.read();
                                while (ch == '*') {
                                    ch = input.read();
                                    if (ch == '/') {
                                        return token(KmTokenId.ML_COMMENT);
                                    } else if (ch == EOF) {
                                        return token(KmTokenId.ML_COMMENT_INCOMPLETE);
                                    }
                                }
                                if (ch == EOF) {
                                    return token(KmTokenId.ML_COMMENT_INCOMPLETE);
                                }
                            }
                    }
                    input.backup(1);
                    return token(KmTokenId.SLASH);

                case '(':
                    return token(KmTokenId.LPAREN);

                case ')':
                    return token(KmTokenId.RPAREN);


                case '"': {
                    while (true) {
                        ch = input.read();
                        if (ch == EOF || ch == '"') {
                            //input.backup(1); // backup the extra char (or EOF)
                            // Check for keywords
                            //CharSequence s = input.readText();
                            //return token(KmTokenId.KEYWORD);
                            return token(KmTokenId.STRING);
                        }
                        //ch = input.read(); // read next char
                    }
                }

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                    return finishIntOrFloatLiteral(ch);

                case EOF:
                    return null;

                default:

                    if (Character.isWhitespace((char) ch)) {
                        ch = input.read();
                        while (ch != EOF && Character.isWhitespace((char) ch)) {
                            ch = input.read();
                        }
                        input.backup(1);
                        return token(KmTokenId.WHITESPACE);
                    }
                    if (Character.isLetterOrDigit((char) ch)) { // identifier or keyword
                        while (true) {
                            if (ch == EOF || !Character.isLetterOrDigit((char) ch)) {
                                input.backup(1); // backup the extra char (or EOF)
                                // Check for keywords

                                String textread = input.readText().toString();
                                //System.out.println(textread);

                                KmTokenId id = keywords.get(textread);
                                if (id == null) {
                                    id = KmTokenId.IDENTIFIER;
                                }
                                return token(id);
                            }
                            ch = input.read(); // read next char
                        }
                    } else {
                        while (true) {
                            if (ch == EOF || Character.isLetterOrDigit(ch) || Character.isWhitespace((char) ch)) {
                                input.backup(1); // backup the extra char (or EOF)
                                // Check for keywords
                                KmTokenId id = delimiters.get(input.readText());
                                //System.out.println(input.readText());
                                if (id == null) {
                                    id = KmTokenId.ERROR;
                                }
                                return token(id);
                            }
                            ch = input.read(); // read next char
                        }
                    }
                //return token(KmTokenId.ERROR);
            }
        }
    }

    public Object state() {
        return null;
    }

    private Token<KmTokenId> finishIntOrFloatLiteral(int ch) {
        boolean floatLiteral = false;
        boolean inExponent = false;
        while (true) {
            switch (ch) {
                case '.':
                    if (floatLiteral) {
                        return token(KmTokenId.FLOAT_LITERAL);
                    } else {
                        floatLiteral = true;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                case 'e':
                case 'E': // exponent part
                    if (inExponent) {
                        return token(KmTokenId.FLOAT_LITERAL);
                    } else {
                        floatLiteral = true;
                        inExponent = true;
                    }
                    break;
                default:
                    input.backup(1);
                    return token(floatLiteral ? KmTokenId.FLOAT_LITERAL
                            : KmTokenId.INT_LITERAL);
            }
            ch = input.read();
        }
    }

    private Token<KmTokenId> token(KmTokenId id) {
        return (id.fixedText() != null)
                ? tokenFactory.getFlyweightToken(id, id.fixedText())
                : tokenFactory.createToken(id);
    }

    @Override
    public void release() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
