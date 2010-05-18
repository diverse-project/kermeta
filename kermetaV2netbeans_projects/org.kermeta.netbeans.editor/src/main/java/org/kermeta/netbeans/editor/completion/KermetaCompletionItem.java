/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.netbeans.editor.completion;

import javax.swing.ImageIcon;
import javax.swing.text.JTextComponent;

/**
 *
 * @author ffouquet
 */
public class KermetaCompletionItem extends KermetaAstractCompletionItem {

    @Override
    public String getLeftHtmlText() {
        return "LeftText";
    }

    @Override
    public String getRightHtmlText() {
        return "RightText";
    }

    @Override
    public String getKeyword() {
        return "keyword";
    }

    @Override
    public ImageIcon getIcon() {
        return null;
    }

    @Override
    public void defaultAction(JTextComponent jtc) {
        System.out.println("action !!!");
    }

}
