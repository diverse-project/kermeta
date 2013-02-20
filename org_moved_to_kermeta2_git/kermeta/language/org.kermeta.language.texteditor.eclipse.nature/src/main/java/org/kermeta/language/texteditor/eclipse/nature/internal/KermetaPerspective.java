package org.kermeta.language.texteditor.eclipse.nature.internal;

import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class KermetaPerspective implements IPerspectiveFactory {

    final static private String PROJECT_EXPLORER_VIEW_ID = "org.eclipse.ui.navigator.ProjectExplorer";
    
    @Override
    public void createInitialLayout(IPageLayout layout) {
        defineActions(layout);
        defineLayout(layout);

    }
    
    /**
     * Define the available actions (atl inspired)
     * @param layout
     */
	public void defineActions(IPageLayout layout) {
        layout.addShowViewShortcut( PROJECT_EXPLORER_VIEW_ID );
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        layout.addShowViewShortcut(IPageLayout.ID_EDITOR_AREA);
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
        
        // problem view at the bottom (of editor area)
        IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.75, editorArea);
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottom.addView("org.eclipse.emf.ecoretools.registration.viewregisteredpackages");
        
        
        
        // outline view to right (of editor area)
        IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float) 0.75, editorArea);
        right.addView(IPageLayout.ID_OUTLINE);
       
        
        // add shortcuts
         layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);       
	}
}
