package fr.irisa.triskell.kermeta.kpm.actions.popup;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.internal.OverlayIcon;
import org.eclipse.swt.graphics.Device;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.util.Activator;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;



public class SRCFolderDecorator extends LabelProvider implements ILabelDecorator
{

  /**
   * Get the static instance of SRCFolderDecorator
   * 
   * @return Demo decorator object
   * 
   */
  public static SRCFolderDecorator getSRCFolderDecorator() throws CoreException {
    IDecoratorManager decoratorManager =
      Activator.getDefault().getWorkbench().getDecoratorManager();

    decoratorManager.setEnabled("fr.irisa.triskell.kermeta.kpm.decorator", true);
    
    if (decoratorManager.getEnabled("fr.irisa.triskell.kermeta.kpm.decorator"))
    {
      return (SRCFolderDecorator) decoratorManager.getLabelDecorator("fr.irisa.triskell.kermeta.kpm.decorator");
    }
    return null;
  }


  public Image decorateImage(Image baseImage, Object object)  {
	  
	  if ( object instanceof IFolder ) {
		
		  IFolder folder = (IFolder) object;
		  
		  Directory directory = KermetaWorkspace.getInstance().getDirectory( folder );
		  if ( directory.isSource() ) {
			  System.out.println("source");
			   // Overlay custom image over base image 
			   Image image;
			   
			   ImageDescriptor base = ImageDescriptor.createFromImage(baseImage);
			   
			   //java.net.URI uri = new java.net.URI("file:/plugin/fr.irisa.triskell.kermeta.kpm/images/kermeta.png");
			   
			//   uri.
			   
			   Path path = new Path("/fr.irisa.triskell.kermeta.kpm/images/kermeta.png");
			   
			  // IFile file = IResourceHelper.getAbsolutePath() + 
			   
	//		   String path = "/images/kermeta.png";
			   //Image overlayImage = new Image( Activator.getDefault().getWorkbench().getDisplay(), path);
			   //ImageDescriptor overlay = ImageDescriptor.createFromImage ( overlayImage );
			   
			   //OverlayIcon overlayIcon = new OverlayIcon(base, overlay, new Point(5,5) );
			
			   //image = overlayIcon.createImage();
			   //return image;
		  }
	  }
	  return null;
  }

  public String decorateText(String label, Object obj) {
	  return null;
  }


  public void refresh(IFolder folder) throws CoreException {
	  SRCFolderDecorator decorator = getSRCFolderDecorator();
	  if (decorator == null) {
		  return;
	  } else {
		  // Fire a label provider changed event to decorate the 
		  // resources whose image needs to be updated
		  fireLabelEvent( new LabelProviderChangedEvent( decorator, folder) );
    }
  }

  /**
   * Fire a Label Change event so that the label decorators are
   * automatically refreshed.
   * 
   * @param event LabelProviderChangedEvent
   */
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
