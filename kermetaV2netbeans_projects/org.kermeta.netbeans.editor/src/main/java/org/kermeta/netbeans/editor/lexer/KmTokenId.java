/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.lexer;

import java.util.Collection;
import java.util.EnumSet;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author ffouquet
 */
public enum KmTokenId implements TokenId {

    WHITESPACE(null, "whitespace"),
    SL_COMMENT(null, "comment"),
    ML_COMMENT(null, "comment"),
    KEYWORD(null,"keyword"),
    SEPARATOR(null,"separator"),
    IDENTIFIER(null, "identifier"),
    INT_LITERAL(null, "number"),
    FLOAT_LITERAL(null, "number"),
    PLUS("+", "operator"),
    MINUS("-", "operator"),
    STAR("*", "operator"),
    SLASH("/", "operator"),
    LPAREN("(", "separator"),
    RPAREN(")", "separator"),
    ERROR(null, "error"),
    ML_COMMENT_INCOMPLETE(null, "comment"),
    STRING(null,"string");
    
    private final String fixedText;
    private final String primaryCategory;

    private KmTokenId(String fixedText, String primaryCategory) {
        this.fixedText = fixedText;
        this.primaryCategory = primaryCategory;
    }

    public String fixedText() {
        return fixedText;
    }

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }
    
    private static final Language<KmTokenId> language = new LanguageHierarchy<KmTokenId>() {

        @Override
        protected Collection<KmTokenId> createTokenIds() {
            return EnumSet.allOf(KmTokenId.class);
        }

        @Override
        protected Lexer<KmTokenId> createLexer(LexerRestartInfo<KmTokenId> lri) {
            return new KermetaLexer(lri);
        }

        @Override
        protected String mimeType() {
            return "text/x-kermeta";
        }
    }.language();

    public static Language<KmTokenId> language() {
        return language;
    }

}
