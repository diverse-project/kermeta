package fr.irisa.triskell.kermeta.kpm.preferences;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;

public class ProjectListLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText(Object element) {
		KermetaProject project = (KermetaProject) element;
		return project.getName();
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
