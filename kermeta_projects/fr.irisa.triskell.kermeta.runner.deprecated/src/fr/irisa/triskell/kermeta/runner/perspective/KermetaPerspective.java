/* $Id: KermetaPerspective.java,v 1.1 2005-05-27 15:07:25 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaPerspective.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 26, 2005
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
public class KermetaPerspective implements IPerspectiveFactory {

    
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
     */
    public void createInitialLayout(IPageLayout layout) {
        System.out.println("Creation!!!");
        defineActions(layout);
        defineLayout(layout);

    }
    
    /**
     * Define the available actions (atl inspired)
     * @param layout
     */
	public void defineActions(IPageLayout layout) {
        // Add "new wizards".
     /*   layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");*/

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
         layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);
        layout.addActionSet("kermetaActionSet");
        
        layout.addNewWizardShortcut("fr.irisa.triskell.kermeta.runner.wizards.KermetaNewFileWizard");
        layout.addNewWizardShortcut("fr.irisa.triskell.kermeta.runner.wizards.KermetaNewProjectWizard");
        
	}
	
	
	/* TODO : implement an OpenPerspectiveAction, in order to let the user
	 * choose his preferred perspective
	   
	  public void run(IAction action) {
        openPerspective(IPerspectivePlugin.TEST_PERSPECTIVE_ID,
                ResourcesPlugin.getWorkspace());
}


private void openPerspective(String perspId, IAdaptable input) {
        // Get "Open Behavior" preference.
        AbstractUIPlugin plugin = (AbstractUIPlugin)Platform.getPlugin(PlatformUI.PLUGIN_ID);
        IPreferenceStore store = plugin.getPreferenceStore();
        String pref = store.getString(IWorkbenchPreferenceConstants.OPEN_NEW_PERSPECTIVE);
                        
        // Implement open behavior.
        try {
                if (pref.equals(IWorkbenchPreferenceConstants.OPEN_PERSPECTIVE_WINDOW))
                        workbench.openWorkbenchWindow(perspId, input);
                else if (pref.equals(IWorkbenchPreferenceConstants.OPEN_PERSPECTIVE_PAGE))
                        window.openPage(perspId, input);
                else if (pref.equals(IWorkbenchPreferenceConstants.OPEN_PERSPECTIVE_REPLACE)) {
                        IPerspectiveRegistry reg = workbench.getPerspectiveRegistry();
                        window.getActivePage().setPerspective(reg.findPerspectiveWithId(perspId));
                }
        } catch (WorkbenchException e) {
                e.printStackTrace();
        }
}

	 */

}
