

/*$Id: EcoreSelectionDialog.java,v 1.2 2007-07-23 14:33:38 bitterjug Exp $
* Project : fr.irisa.triskell.sintaks
* File : 	SyntaksModelSelectionDialog.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.ocl.ui.popup.actions;


import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;


public class EcoreSelectionDialog extends ResourceSelectionDialog {

	private ComboViewer stsFilesRegistered = null;
	
	private Text documentationOfSelectedFile;
	
	private IFile selectedEcoreFile = null;
	
	public EcoreSelectionDialog(Shell parentShell, IAdaptable rootElement, String message) {
		super(parentShell, rootElement, message);
	}

	private void initializeCombo(Composite parent) {
		stsFilesRegistered = new ComboViewer(parent, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		stsFilesRegistered.getCombo().setLayoutData(gridData);
		ISelectionChangedListener changeListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				selectedEcoreFile = (IFile) selection.getFirstElement();
			}
		};
		stsFilesRegistered.addSelectionChangedListener( changeListener );
		
		ILabelProvider labelProvider = new ILabelProvider() {

			public Image getImage(Object element) {return null;}

			public String getText(Object element) {
				return ((IFile) element).getName();
			}

			public void addListener(ILabelProviderListener listener) {}

			public void dispose() {}

			public boolean isLabelProperty(Object element, String property) {return false;}

			public void removeListener(ILabelProviderListener listener) {}

			
		};
		stsFilesRegistered.setLabelProvider(labelProvider);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Control control = super.createDialogArea(parent);
	
		/*Group group = new Group(parent, SWT.NULL);
		group.setText( "Or select one registered Sintaks File :" );
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		group.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 2;
		group.setLayoutData(gridData);
		
		initializeCombo(group);

		documentationOfSelectedFile = new Text(group, SWT.MULTI);
		//((Text) documentationOfSelectedFile.getTextControl(group)).setEditable(false);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.heightHint = 100;
		documentationOfSelectedFile.setLayoutData( gridData );
*/

		/*ISelectionChangedListener changeListener = new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				
				
				/*
				 * 
				 * Tree Selection must be forgotten.
				 * 
				 */
				
/*				
				
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				IFile file = (IFile) selection.getFirstElement();
				//documentationOfSelectedFile.setText( file.getDocumentation() );
				getOkButton().setEnabled(true);
			}
			
		};*/
		//stsFilesRegistered.addSelectionChangedListener(changeListener);
		
		//IExtensionPoint extension = Platform.getExtensionRegistry().getExtensionPoint( "fr.irisa.triskell.sintaks.stsFilesRegistration" );
		//IExtension[] extensions = extension.getExtensions();
		
		
		return control;
	}
	
	@Override
	protected void okPressed() {
		super.okPressed();
		Object[] results = getResult();
		if ( (results.length == 0) && (selectedEcoreFile != null) ) {
			ArrayList l = new ArrayList();
			l.add( selectedEcoreFile );
			setResult( l );
		}
	}
}


