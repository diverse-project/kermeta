/* Id: OutlineDecorator.java,v 2.0.1 Apr 17, 2012 12:57:24 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : OutlineDecorator.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 17, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.net.URL;

import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.kermeta.language.texteditor.eclipse.internal.Activator;


public class OutlineDecorator implements ILightweightLabelDecorator {

	/**		The image representing an error.		*/
	private Image _error;
	
	/**		The image representing a warning.		*/
	private Image _warning;
	
	public OutlineDecorator() {
		URL url = Activator.getDefault().getBundle().getEntry("icons/error.gif");
		if ( url != null )
			_error = ImageDescriptor.createFromURL(url).createImage();
		url = Activator.getDefault().getBundle().getEntry("icons/warning_co.gif");
		if ( url != null )
			_warning = ImageDescriptor.createFromURL(url).createImage();
	}
	@Override
	public void addListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		_error.dispose();
		_warning.dispose();
		
	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if ( element instanceof OutlineItem ) {
			OverlayIconDescriptor oid = new OverlayIconDescriptor(((OutlineItem)element).getImage(),Activator.getDefault().getImage(Activator.ImageTypes.Error));
			decoration.addOverlay( oid );
		}
	}
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
