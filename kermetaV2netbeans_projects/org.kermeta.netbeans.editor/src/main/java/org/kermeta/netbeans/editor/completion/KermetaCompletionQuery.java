/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.completion;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.kermeta.netbeans.editor.lexer.KmTokenId;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;

/**
 *
 * @author ffouquet
 */
public class KermetaCompletionQuery extends AsyncCompletionQuery {

    private Collection<CompletionItem> queryClassMethodOrAttribute(String attributeName) {
        Collection<CompletionItem> definitions = new ArrayList<CompletionItem>();
        System.out.println("TODO ClassMethodAttributeCompletion=" + attributeName);
        return definitions;
    }

    private Collection<CompletionItem> queryType(String beginQualifiedName) {
        Collection<CompletionItem> definitions = new ArrayList<CompletionItem>();
        System.out.println("TODO TypeCompletion=" + beginQualifiedName);
        return definitions;
    }

    private Token<KmTokenId> getNotNullToken(TokenSequence<KmTokenId> ts) {
        Token<KmTokenId> ptoken = ts.token();
        if (ptoken.text().toString().trim().isEmpty()) {
            if (ts.movePrevious()) {
                return getNotNullToken(ts);
            } else {
                return ptoken;
            }
        } else {
            return ptoken;
        }
    }

    @Override
    protected void query(CompletionResultSet crs, Document dcmnt, int caretOffset) {

        StyledDocument sd = (StyledDocument) dcmnt;
        TokenHierarchy<StyledDocument> th = TokenHierarchy.get(sd);
        TokenSequence<KmTokenId> ts = th.tokenSequence(KmTokenId.language());

        ts.move(caretOffset == 0 ? 0 : caretOffset - 1);
        ts.moveNext();



        Token<KmTokenId> firstNotNullToken = getNotNullToken(ts);
        ts.movePrevious();
        Token<KmTokenId> secondNotNullToken = getNotNullToken(ts);



        if (firstNotNullToken.text().toString().equals(".")) {
            crs.addAllItems(queryClassMethodOrAttribute(firstNotNullToken.text().toString()));
        } else {
            if (firstNotNullToken.text().toString().equals(":")) {
                crs.addAllItems(queryType(""));
            } else {
                if (secondNotNullToken.text().toString().equals(":")) {
                    crs.addAllItems(queryType(firstNotNullToken.text().toString()));
                }


            }
        }



        crs.finish();

    }
}
