/* $Id: KermetaPerspective.java,v 1.4 2008-02-14 07:12:54 uid21732 Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaPerspective.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 26, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.ui.perspective;

import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

import fr.irisa.triskell.kermeta.ui.views.KermetadocView;
import fr.irisa.triskell.kermeta.ui.views.ProblemDetailsView;

/**
 * Implements the Kermeta perspective.
 * It initialises it programmatically  in order have the correct views when openeing this perspective
 */
public class KermetaPerspective implements IPerspectiveFactory {

    final static private String PROJECT_EXPLORER_VIEW_ID = "org.eclipse.ui.navigator.ProjectExplorer";
    
    /* (non-Javadoc)
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
     /*   layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");*/
	    
	    // Add "show views"
        layout.addShowViewShortcut( PROJECT_EXPLORER_VIEW_ID );
        layout.addShowViewShortcut( IPageLayout.ID_RES_NAV );
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        layout.addShowViewShortcut(IPageLayout.ID_EDITOR_AREA);
        layout.addShowViewShortcut( KermetadocView.ID );
	}
	
	/**
	 * Define the initial layout
	 * @param layout
	 */
	public void defineLayout(IPageLayout layout) {
        // editors are placed for free.
        String editorArea = layout.getEditorArea();
     
        // place navigator and package explorer to the left (of editor area)
        IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.25, editorArea);
        left.addView( PROJECT_EXPLORER_VIEW_ID );
        left.addView(org.eclipse.jdt.ui.JavaUI.ID_PACKAGES);
        left.addView( IPageLayout.ID_RES_NAV );
        
        // problem view at the bottom (of editor area)
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.75, editorArea);
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottom.addView( KermetadocView.ID );
        bottom.addView( ProblemDetailsView.ID );
        bottom.addView("org.eclipse.emf.ecoretools.registration.viewregisteredpackages");
        
        
        
        // outline view to right (of editor area)
        IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float) 0.75, editorArea);
        right.addView(IPageLayout.ID_OUTLINE);
       
        
        // add shortcuts
         layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);
         
        //layout.addActionSet("kermetaActionSet");
       /* 
        layout.addNewWizardShortcut("fr.irisa.triskell.kermeta.runner.wizards.KermetaNewFileWizard");
        layout.addNewWizardShortcut("fr.irisa.triskell.kermeta.runner.wizards.KermetaNewProjectWizard");
        */
        
	}
	
	
	/* TODO : implement an OpenPerspectiveAction, in order to let the user
	 * choose his preferred perspective
	   
	  public void run(IAction action) {
        openPerspective(IPerspectivePlugin.TEST_PERSPECTIVE_ID,
                ResourcesPlugin.getWorkspace());
}
*/
}
