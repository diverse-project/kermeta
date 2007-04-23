package fr.irisa.triskell.kermeta.kpm.preferences;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;

public class ProjectListSelectionChangedListener implements
		ISelectionChangedListener {

	private KPMPreferencePage page;

	public ProjectListSelectionChangedListener(KPMPreferencePage page) {
		this.page = page;
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		
		IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		KermetaProject project = (KermetaProject) selection.getFirstElement();
		
		try {
			
			QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "applyRequireDependencies");
			String value = project.getValue().getPersistentProperty(key);
			if ( value == null ) {
				project.getValue().setPersistentProperty(key, KPMConstants.KERMETAPROJECT_PREF_APPLYREQUIREDEPENDENCIES_DEFAULTVALUE);
				value = KPMConstants.KERMETAPROJECT_PREF_APPLYREQUIREDEPENDENCIES_DEFAULTVALUE;
			} else
				page.setApplyRequireValue(value);
			
			key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "generateKM");
			value = project.getValue().getPersistentProperty(key);
			if ( value == null ) {
				project.getValue().setPersistentProperty(key, KPMConstants.KERMETAPROJECT_PREF_GENERATEKM_DEFAULTVALUE);
				value = KPMConstants.KERMETAPROJECT_PREF_GENERATEKM_DEFAULTVALUE;
			} else
				page.setGenerateKMValue(value);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

}
