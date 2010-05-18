/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.netbeans.editor.completion;

import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;

/**
 *
 * @author ffouquet
 */
public class KermetaCompletionProvider implements CompletionProvider {

    @Override
    public CompletionTask createTask(int i, JTextComponent jtc) {
        System.out.println("AutoCompletion creation");
        return new AsyncCompletionTask(new KermetaCompletionQuery(), jtc);
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        // 0 - User explicitly has to ask for completion
        System.out.println("auto completion not implemented");
        return 0;
    }

}
