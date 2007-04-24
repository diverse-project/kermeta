package fr.irisa.triskell.kermeta.kpm.preferences;

import java.util.HashMap;
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

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.InOutHelper;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;

public class KPMPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public ListViewer listViewer;
	
	private Button generateKM;
	private boolean generateKMValue;
	
	public void setGenerateKMValue(String value) {
		generateKM.setSelection( Boolean.parseBoolean(value) );
		generateKMValue = Boolean.parseBoolean(value);
	}
	
	
	private Button applyRequire;	
	private boolean applyRequireValue;
	
	public void setApplyRequireValue(String value) {
		applyRequire.setSelection( Boolean.parseBoolean(value) );
		applyRequireValue = Boolean.parseBoolean(value);
	}
	
	
	/**
	 * 
	 * Boolean that is used when performs apply or ok to make the changes if it needs to be done.
	 * 
	 */
	private boolean changesDone = false;
	
	
	
	public KPMPreferencePage() {
		super();
		setPreferenceStore(KPMPlugin.getDefault().getPreferenceStore());
		setDescription("Configure the politics action for Kermeta Projects");
	}

	public KPMPreferencePage(String title) {
		super(title);
	}

	public KPMPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	protected Control createContents(Composite parent) {
		
		listViewer = new ListViewer(parent, SWT.SINGLE);
		
		listViewer.addSelectionChangedListener( new ProjectListSelectionChangedListener(this) );
		listViewer.setLabelProvider( new ProjectListLabelProvider() );
		
		for ( KermetaProject project : KermetaWorkspace.getInstance().getKermetaProjects() ) {
			listViewer.add(project);
		}
		
		applyRequire = new Button(parent, SWT.CHECK);
		applyRequire.setText("Apply Require Dependencies");
		
		generateKM = new Button(parent, SWT.CHECK);
		generateKM.setText("Generate a KM file for each KMT file");
	
		return parent;
	}

	public void init(IWorkbench workbench) {}
	
	private void makeChanges() {
		try {
			
			IStructuredSelection selection = (IStructuredSelection) listViewer.getSelection();			
			KermetaProject project = (KermetaProject) selection.getFirstElement();
			
			boolean applyRequireNewValue = applyRequire.getSelection();
			if ( applyRequireNewValue != applyRequireValue ) {
				QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "applyRequireDependencies");
				project.getValue().setPersistentProperty(key, String.valueOf(applyRequireNewValue) );
				applyRequireValue = applyRequireNewValue;
				changesDone = false;
			}
			
			boolean generateKMNewValue = generateKM.getSelection();
			
			if ( generateKMValue != generateKMNewValue ) {
				QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "generateKM");
				project.getValue().setPersistentProperty(key, String.valueOf(generateKMNewValue) );
				generateKMValue = generateKMNewValue;
				changesDone = false;
			}
			
			if ( ! changesDone ) {		
			
				if ( generateKMValue ) {
					Iterator<Unit> iterator = project.getKpm().getUnits().iterator();
					while ( iterator.hasNext() ) {
					
						Unit currentUnit = iterator.next();
						Rule rule = currentUnit.findRule("update");
						if ( rule != null ) {
							Out out = rule.findOut("fr.irisa.triskell.kermeta.kpm.actions.kmt2km");
							if ( out == null ) {
								out = InOutHelper.createOutWithNameFilter(project.getKpm(), "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
								rule.getOuts().add(out);
							}
						}
					}
				} else {
					Iterator<Unit> iterator = project.getKpm().getUnits().iterator();
					while ( iterator.hasNext() ) {
					
						Unit currentUnit = iterator.next();
						Rule rule = currentUnit.findRule("update");
						if ( rule != null )
							rule.removeOut( "fr.irisa.triskell.kermeta.kpm.actions.kmt2km" );	
					}
				}
		
				if ( applyRequireValue ) {
					HashMap args = new HashMap();
					args.put("forceOpening", true);
					project.getProjectUnit().receiveAsynchroneEvent("open", args);				
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		changesDone = true;
		
	}
	
	@Override
	public boolean performOk() {
		makeChanges();
		return true;
	}
	
	@Override
	protected void performApply() {
		makeChanges();
	}

}
