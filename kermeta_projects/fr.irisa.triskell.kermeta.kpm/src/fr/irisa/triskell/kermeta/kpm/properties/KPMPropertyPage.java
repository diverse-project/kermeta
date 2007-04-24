/*$Id: KPMPropertyPage.java,v 1.2 2007-04-24 13:35:40 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.properties;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.PropertyPage;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.InOutHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;

public class KPMPropertyPage extends PropertyPage {

	public ListViewer listViewer;
	
	private Button applyRequire;
	private boolean applyRequireValue;
	
	private Button generateKM;
	private boolean generateKMValue;

	private TreeViewer treeViewer;
	
	static private TreeSelection selection = null;
	
	public KPMPropertyPage() {
		super();
		setPreferenceStore(KPMPlugin.getDefault().getPreferenceStore());
		setDescription("Configure the politics action for Kermeta Projects");
	}
	
	@Override
	protected Control createContents(Composite parent) {
		
		 GridData gridData = new GridData();
		 gridData.horizontalAlignment = GridData.FILL;
		 gridData.verticalAlignment = GridData.FILL;
		// gridData.horizontalSpan = 3;
		 gridData.grabExcessHorizontalSpace = true;
		 gridData.grabExcessVerticalSpace = true;
		treeViewer = new TreeViewer(parent);
		treeViewer.getControl().setLayoutData( gridData );
		
		treeViewer.setLabelProvider( new PropertyPageLabelProvider() );
		treeViewer.setContentProvider( new PropertyPageTreeeContentProvider() );

		treeViewer.addSelectionChangedListener( new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				try {
					selection = (TreeSelection) event.getSelection();
					IResource resource = (IResource) selection.getFirstElement();
					QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "applyRequireDependencies");			
					applyRequireValue = Boolean.parseBoolean(resource.getPersistentProperty(key));
					applyRequire.setSelection( applyRequireValue );			
					
					key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "generateKM");
					generateKMValue = Boolean.parseBoolean(resource.getPersistentProperty(key));
					generateKM.setSelection( generateKMValue );
					
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		});
		
		applyRequire = new Button(parent, SWT.CHECK);
		applyRequire.setText("Apply Require Dependencies");
		
		generateKM = new Button(parent, SWT.CHECK);
		generateKM.setText("Generate a KM file for each KMT file");
		
		IResource resource = ((IResource) getElement()).getProject();
		Object[] input = new Object[1];
		input[0] = resource;
		treeViewer.setInput(input);
	
		return parent;
	}

	public void init(IWorkbench workbench) {}
	
	@Override
	public boolean performOk() {
		makeChanges();
		return true;
	}
	
	@Override
	protected void performApply() {
		makeChanges();
	}
		
	private void makeChanges() {
		if (selection == null)
			return;

		IResource resource = (IResource) selection.getFirstElement();
				
		boolean applyRequireNewValue = applyRequire.getSelection();
		boolean generateKMNewValue = generateKM.getSelection();
		
		setOptionsForResource(generateKMNewValue, applyRequireNewValue, resource);

		boolean mustChange = false;
		
		if ( (applyRequireNewValue != applyRequireValue) || (generateKMNewValue != generateKMValue) ) {
			mustChange = true;
			applyRequireValue = applyRequireNewValue;
			generateKMValue = generateKMNewValue;
		}
		
		if (mustChange) {

			KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject(resource.getProject());

			/*if (generateKMValue)
				setKMGenerationDependency(resource, project.getKpm(), true);
			else
				setKMGenerationDependency(resource, project.getKpm(), false);
*/
			if (applyRequireValue || generateKMValue) {
				HashMap args = new HashMap();
				args.put("forceOpening", true);
				project.getProjectUnit().receiveAsynchroneEvent("open", args);
			}
		}
	}

/*	private Collection<IFile> setKMGenerationDependency(IResource resource, final KPM kpm, final boolean adding) {

		final Set<IFile> files = new HashSet<IFile>();
		IResourceVisitor visitor = new IResourceVisitor() {

			public boolean visit(IResource resource) throws CoreException {
				boolean result = false;
				switch (resource.getType()) {

				case IResource.FILE:
					if (adding) {
						Unit unit = KPMHelper.getUnit(kpm, resource.getFullPath().toString());
						if (unit != null) {
							Rule rule = unit.findRule("Update KMT File");
							if (rule != null) {
								Out out = rule.findOut("fr.irisa.triskell.kermeta.kpm.actions.kmt2km");
								if (out == null) {
									out = InOutHelper.createOutWithNameFilter(
													kpm,
													"fr.irisa.triskell.kermeta.kpm.actions.kmt2km",
													"*.km");
									rule.getOuts().add(out);
								}
							}
						}
					} else {
						Unit unit = KPMHelper.getUnit(kpm, resource.getFullPath().toString());
						if (unit != null) {
							Rule rule = unit.findRule("Update KMT File");
							if (rule != null)
								rule.removeOut( "fr.irisa.triskell.kermeta.kpm.actions.kmt2km" );
						}
					}
					break;

				case IResource.FOLDER:
					result = true;
					break;

				case IResource.PROJECT:
					result = true;
					break;
				}
				return result;
			}

		};
		try {
			resource.accept(visitor);
		} catch (CoreException e) {
		}
		return files;
	}
	*/
	
	static public void setOptionsForResource(final boolean generateKMFile, final boolean applyRequire, IResource resource) {
		IResourceVisitor visitor = new IResourceVisitor() {

			public boolean visit(IResource resource) throws CoreException {
				boolean result = true;
				switch ( resource.getType() ) {
				
				case IResource.FILE :
					result = true;
					ResourceHelper.setProperty(resource, "fr.irisa.triskell.kermeta.kpm.applyRequireDependencies", applyRequire);		
					ResourceHelper.setProperty(resource, "fr.irisa.triskell.kermeta.kpm.generateKM", generateKMFile);		
					break;
				case IResource.FOLDER :
					result = true;
					ResourceHelper.setProperty(resource, "fr.irisa.triskell.kermeta.kpm.applyRequireDependencies", applyRequire);		
					ResourceHelper.setProperty(resource, "fr.irisa.triskell.kermeta.kpm.generateKM", generateKMFile);		
					break;
				case IResource.PROJECT :
					result = true;
					ResourceHelper.setProperty(resource, "fr.irisa.triskell.kermeta.kpm.applyRequireDependencies", applyRequire);		
					ResourceHelper.setProperty(resource, "fr.irisa.triskell.kermeta.kpm.generateKM", generateKMFile);		
					break;
				}
				return result;
			}
			 
		 };
		 try {
			resource.accept( visitor );
		} catch (CoreException e) {}
	}

}
