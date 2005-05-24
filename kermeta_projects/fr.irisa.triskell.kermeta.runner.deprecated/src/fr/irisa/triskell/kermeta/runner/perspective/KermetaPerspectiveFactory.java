/* $Id: KermetaPerspectiveFactory.java,v 1.1 2005-05-24 17:07:36 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaPerspectiveFactory.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.perspective;

import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

/**
 * 
 */
public class KermetaPerspectiveFactory implements IPerspectiveFactory {

    /** (non-Javadoc)
     * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
     */
    public void createInitialLayout(IPageLayout layout) {
       defineActions(layout);
       defineLayout(layout);
    }

    /**
     * Define the available actions (atl inspired)
     * @param layout
     */
	public void defineActions(IPageLayout layout) {
        // Add "new wizards".
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");

        layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);        
	}
	
	/**
	 * Define the initial layout
	 * @param layout
	 */
	public void defineLayout(IPageLayout layout) {
        // editors are placed for free.
        String editorArea = layout.getEditorArea();
     
        // place navigator to the left (of editor area)
        IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.25, editorArea);
        left.addView(IPageLayout.ID_RES_NAV);
        
        // problem view at the bottom (of editor area)
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.75, editorArea);
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        
        // outline view to right (of editor area)
        IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float) 0.75, editorArea);
        right.addView(IPageLayout.ID_OUTLINE);
        
        // add shortcuts
        layout.addNewWizardShortcut("KermetaProjectCreator");
        
        layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);
	}
	
    
}
