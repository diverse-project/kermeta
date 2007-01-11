package fr.irisa.triskell.kermeta.kpm.actions.popup;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;

import fr.irisa.triskell.kermeta.KermetaConstants;
import fr.irisa.triskell.kermeta.KermetaIcons;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

public class SrcFolderDecorator extends LabelProvider implements ILightweightLabelDecorator {

	
	public void decorate (Object element, IDecoration decoration ) {
		
		if ( element instanceof IFolder ) {
			KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( ((IFolder) element).getProject() ); 
			Directory directory = project.getDirectory( (IFolder) element );//KermetaWorkspace.getInstance().getDirectory( (IFolder) element );
			if ( directory != null ) {
				Image image = KermetaIcons.get( KermetaConstants.KLOGO );
				ImageDescriptor overlay = ImageDescriptor.createFromImage( image );
				decoration.addOverlay(overlay, IDecoration.TOP_RIGHT);
			}
		}
		
	}
	
	
	/**
	 * Get the static instance of DemoDecorator
	 * 
	 * @return Demo decorator object
	 * 
	 */
	public static SrcFolderDecorator getDecorator() throws CoreException {
		IDecoratorManager decoratorManager = KPMPlugin.getDefault().getWorkbench().getDecoratorManager();
	
		decoratorManager.setEnabled("fr.irisa.triskell.kermeta.kpm.srcFolderDecorator", true);

		return (SrcFolderDecorator) decoratorManager.getBaseLabelProvider(
		        "fr.irisa.triskell.kermeta.kpm.srcFolderDecorator");
	}

	  public void refresh(IFolder folder) throws CoreException {
		  SrcFolderDecorator decorator = getDecorator();
		  if (decorator == null) {
			  return;
		  } else {
			  // Fire a label provider changed event to decorate the 
			  // resources whose image needs to be updated
			  fireLabelEvent( new LabelProviderChangedEvent( decorator, folder) );
	    }
	  }

	  private void fireLabelEvent(final LabelProviderChangedEvent event)
	  {
	    // We need to get the thread of execution to fire the label provider
	    // changed event , else WSWB complains of thread exception. 
	    Display.getDefault().asyncExec(new Runnable()
	    {
	      public void run()
	      {
	        fireLabelProviderChanged(event);
	      }
	    });
	  }
	   
	
}
