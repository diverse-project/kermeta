package org.kermeta.trek.ui.views.nav;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class TrekViewLabelProvider extends LabelProvider {
	
	public String getText(Object obj) {
		return obj.toString();
	}
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if(obj instanceof KStaticElement){
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		else if(obj instanceof KDynamicElement){
			imageKey = ISharedImages.IMG_OBJ_FILE;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}
