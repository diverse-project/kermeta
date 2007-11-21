package org.eclipse.emf.emfatic.ui.hyperlinks;

import org.eclipse.emf.emfatic.core.lang.gen.ast.EmfaticASTNode;
import org.eclipse.emf.emfatic.ui.editor.EmfaticEditor;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;

public class EmfaticHyperlink implements IHyperlink {

    private IRegion fRegion= null;
    private EmfaticASTNode fLinkTarget= null;
    private EmfaticEditor fEditor= null;
    
    public EmfaticHyperlink(EmfaticEditor editor, IRegion region, EmfaticASTNode linkTarget) {
        
       fRegion= region;
       fLinkTarget= linkTarget;
       fEditor= editor;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.hyperlink.IHyperlink#getHyperlinkRegion()
     */
    public IRegion getHyperlinkRegion() {
        return fRegion;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.hyperlink.IHyperlink#getTypeLabel()
     */
    public String getTypeLabel() {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.hyperlink.IHyperlink#getHyperlinkText()
     */
    public String getHyperlinkText() {
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.hyperlink.IHyperlink#open()
     */
    public void open() {
        fEditor.openTarget(fLinkTarget);
    }
}
