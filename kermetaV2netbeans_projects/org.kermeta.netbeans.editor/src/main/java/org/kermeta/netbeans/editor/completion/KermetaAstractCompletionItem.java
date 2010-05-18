/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.completion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;

/**
 *
 * @author ffouquet
 */
public abstract class KermetaAstractCompletionItem implements CompletionItem {

    public void processKeyEvent(KeyEvent evt) {}

    public abstract String getLeftHtmlText();

    public abstract String getRightHtmlText();

    public abstract String getKeyword();

    public abstract ImageIcon getIcon();

    public int getPreferredWidth(Graphics g, Font defaultFont) {
        return CompletionUtilities.getPreferredWidth(getLeftHtmlText(), getRightHtmlText(), g, defaultFont);
    }

    public void render(Graphics g, Font defaultFont, Color defaultColor, Color backgroundColor, int width, int height, boolean selected) {
        CompletionUtilities.renderHtml(getIcon(), getLeftHtmlText(), getRightHtmlText(), g, defaultFont, defaultColor, width, height, selected);
    }

    public CompletionTask createDocumentationTask() {
        return null;
    }

    public CompletionTask createToolTipTask() {
        return null;
    }

    public boolean instantSubstitution(JTextComponent component) {
        return false;
    }

    public int getSortPriority() {
        return 0;
    }

    public CharSequence getSortText() {
        return getKeyword();
    }

    public CharSequence getInsertPrefix() {
        return getKeyword();
    }
}
