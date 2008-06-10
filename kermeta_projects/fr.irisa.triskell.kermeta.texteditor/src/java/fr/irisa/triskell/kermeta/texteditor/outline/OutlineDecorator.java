

/*$Id: OutlineDecorator.java,v 1.1 2008-06-10 11:41:25 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	OutlineDecoratpr.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 juin 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.net.URL;

import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class OutlineDecorator implements ILightweightLabelDecorator {

	/**		The image reprensenting an error.		*/
	private Image _error;
	
	/**		The image representing a warning.		*/
	private Image _warning;
	
	public OutlineDecorator() {
		URL url = TexteditorPlugin.getDefault().getBundle().getEntry("icons/error.gif");
		if ( url != null )
			_error = ImageDescriptor.createFromURL(url).createImage();
		url = TexteditorPlugin.getDefault().getBundle().getEntry("icons/warning_co.gif");
		if ( url != null )
			_warning = ImageDescriptor.createFromURL(url).createImage();
	}
	
	public void addListener(ILabelProviderListener listener) {
	}

	public void dispose() {
		_error.dispose();
		_warning.dispose();
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}

	public void decorate(Object element, IDecoration decoration) {
		// Decoration only works on ModelElementOutlineItem
		if ( element instanceof ModelElementOutlineItem ) {
			// Getting the model element.
			ModelElementOutlineItem item = (ModelElementOutlineItem) element;
			// Add the proper decoration if necessary.
			if ( item.isErroneous() ) {
				OverlayIconDescriptor oid = new OverlayIconDescriptor(item.getImage(), _error);
				decoration.addOverlay( oid );
			} else if ( item.isWarned() ) {
				OverlayIconDescriptor oid = new OverlayIconDescriptor(item.getImage(), _warning);
				decoration.addOverlay( oid );				
			}
		} else if ( element instanceof PackageItem ) {
			PackageItem item = (PackageItem) element;
			// Add the proper decoration if necessary.
			if ( item.isErroneous() ) {
				OverlayIconDescriptor oid = new OverlayIconDescriptor(item.getImage(), _error);
				decoration.addOverlay( oid );
			} else if ( item.isWarned() ) {
				OverlayIconDescriptor oid = new OverlayIconDescriptor(item.getImage(), _warning);
				decoration.addOverlay( oid );				
			}		
		}
	}
	
	/**
	 * 
	 * @author paco
	 *
	 */
	private class OverlayIconDescriptor extends CompositeImageDescriptor {

		/**
		 * 
		 */
		private Image _baseImage;
		
		/**
		 * 
		 */
		private Image _overlayImage;
		
		/**
		 * 
		 * @param image
		 */
		public OverlayIconDescriptor(Image baseImage, Image overlayImage) {
			_baseImage = baseImage;
			_overlayImage = overlayImage;
		}
		
		@Override
		protected void drawCompositeImage(int width, int height) {
			// Draw the base image
			drawImage(_baseImage.getImageData(), 0, 0); 
			ImageData imageData = _overlayImage.getImageData();
            drawImage(imageData, 10, 8);
		}
		
		@Override
		protected Point getSize() {
			return new Point(16,16);
		}
		
	}
}


