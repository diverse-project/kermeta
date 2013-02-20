package org.kermeta.language.texteditor.eclipse.internal.autocompletion;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class KermetaImage {
	
	public static Image getImage(String relativePath) {
		return ImageDescriptor.createFromFile(KermetaImage.class, relativePath).createImage();
	}

}
