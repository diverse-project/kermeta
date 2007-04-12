package fr.irisa.triskell.kermeta.kpm.preferences;

import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.InOutHelper;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;

public class KPMPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public ListViewer listViewer;
	
	public Button applyRequireDependencies;
	public Button generateKM;
	
	
	public KPMPreferencePage() {
		super();
		setPreferenceStore(KPMPlugin.getDefault().getPreferenceStore());
		setDescription("Configure the politics action for Kermeta Projects");
	}

	public KPMPreferencePage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public KPMPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createContents(Composite parent) {
		
		listViewer = new ListViewer(parent, SWT.SINGLE);
		
		listViewer.addSelectionChangedListener( new ProjectListSelectionChangedListener(this) );
		listViewer.setLabelProvider( new ProjectListLabelProvider() );
		
		for ( KermetaProject project : KermetaWorkspace.getInstance().getKermetaProjects() ) {
			listViewer.add(project);
		}
		
		applyRequireDependencies = new Button(parent, SWT.CHECK);
		applyRequireDependencies.setText("Apply Require Dependencies");
		
		generateKM = new Button(parent, SWT.CHECK);
		generateKM.setText("Generate a KM file for each KMT file");
	
		return parent;
	}

	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	protected void performApply() {
		try {
			boolean newValue = applyRequireDependencies.getSelection();
			IStructuredSelection selection = (IStructuredSelection) listViewer.getSelection();
			KermetaProject project = (KermetaProject) selection.getFirstElement();
			QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "applyRequireDependencies");
			project.getValue().setPersistentProperty(key, String.valueOf(newValue) );
			
			newValue = generateKM.getSelection();
			selection = (IStructuredSelection) listViewer.getSelection();
			project = (KermetaProject) selection.getFirstElement();
			key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "generateKM");
			project.getValue().setPersistentProperty(key, String.valueOf(newValue) );
			if ( newValue ) {
				Iterator<Unit> iterator = project.getKpm().getUnits().iterator();
				while ( iterator.hasNext() ) {
					
					Unit currentUnit = iterator.next();
					Dependency dependency = currentUnit.findDependency("update");
					if ( dependency != null ) {
						Out out = dependency.findOut("fr.irisa.triskell.kermeta.kpm.actions.kmt2km");
						if ( out == null ) {
							out = InOutHelper.createOutWithNameFilter(project.getKpm(), "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
							dependency.getOuts().add(out);
						}
					}
				}
				project.getProjectUnit().receiveAsynchroneEvent("open", null);	
			}
				
			else {
				Iterator<Unit> iterator = project.getKpm().getUnits().iterator();
				while ( iterator.hasNext() ) {
					
					Unit currentUnit = iterator.next();
					Dependency dependency = currentUnit.findDependency("update");
					if ( dependency != null )
						dependency.removeOut( "fr.irisa.triskell.kermeta.kpm.actions.kmt2km" );
					
				}
			}
		
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.performApply();
	}

}
