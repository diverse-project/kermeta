package fr.irisa.triskell.kermeta.ui.provider;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.ui.DependentFileTreeItem;
import fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem;
import fr.irisa.triskell.kermeta.ui.KermetaUIPlugin;
import fr.irisa.triskell.kermeta.ui.TreeItem;


public class TreeViewerLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		if ( element instanceof FileDependencyTreeItem ) {
			ImageDescriptor id =KermetaUIPlugin.getIcon("down.png");
			return id.createImage();
		} else if ( element instanceof DependentFileTreeItem ) {
			ImageDescriptor id =KermetaUIPlugin.getIcon("up.png");
			return id.createImage();
		}
		return null;
	}

	public String getText(Object element) {
		return ((TreeItem) element).toText();
	}

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
