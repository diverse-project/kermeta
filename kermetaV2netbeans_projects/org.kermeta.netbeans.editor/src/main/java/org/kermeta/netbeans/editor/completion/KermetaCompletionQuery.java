/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.netbeans.editor.completion;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.text.Document;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;


/**
 *
 * @author ffouquet
 */
public class KermetaCompletionQuery extends AsyncCompletionQuery {

    @Override
    protected void query(CompletionResultSet crs, Document dcmnt, int i) {
        
        System.out.println(dcmnt+"---"+i);

        Collection<CompletionItem> definitions = new ArrayList<CompletionItem>();

        for(int b=0;b<10;b++){
            CompletionItem item = new KermetaCompletionItem();
            definitions.add(item);
        }

        crs.addAllItems(definitions);
        crs.finish();

    }

}
