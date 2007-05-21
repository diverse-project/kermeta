

/*$Id: SintaksModelSelectionDialog.java,v 1.2 2007-05-21 11:34:05 ftanguy Exp $
* Project : fr.irisa.triskell.sintaks
* File : 	SyntaksModelSelectionDialog.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 07
* Authors : paco
*/

package fr.irisa.triskell.sintaks.ui;


import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;


public class SintaksModelSelectionDialog extends ResourceSelectionDialog {

	private ComboViewer stsFilesRegistered = null;
	
	private Text documentationOfSelectedFile;
	
	private SintaksFile selectedSintaksFile = null;
	
	public SintaksModelSelectionDialog(Shell parentShell, IAdaptable rootElement, String message) {
		super(parentShell, rootElement, message);
	}

	private void initializeCombo(Composite parent) {
		stsFilesRegistered = new ComboViewer(parent, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		stsFilesRegistered.getCombo().setLayoutData(gridData);
		ISelectionChangedListener changeListener = new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				selectedSintaksFile = (SintaksFile) selection.getFirstElement();
			}
		};
		stsFilesRegistered.addSelectionChangedListener( changeListener );
		
		ILabelProvider labelProvider = new ILabelProvider() {

			public Image getImage(Object element) {return null;}

			public String getText(Object element) {
				return ((SintaksFile) element).getFilePath();
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
	
		Group group = new Group(parent, SWT.NULL);
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


		ISelectionChangedListener changeListener = new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				
				
				/*
				 * 
				 * Tree Selection must be forgotten.
				 * 
				 */
				
				
				
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				SintaksFile file = (SintaksFile) selection.getFirstElement();
				documentationOfSelectedFile.setText( file.getDocumentation() );
				getOkButton().setEnabled(true);
			}
			
		};
		stsFilesRegistered.addSelectionChangedListener(changeListener);
		
		IExtensionPoint extension = Platform.getExtensionRegistry().getExtensionPoint( "fr.irisa.triskell.sintaks.stsFilesRegistration" );
		IExtension[] extensions = extension.getExtensions();
		
		for ( int i=0; i<extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for ( int j=0; j<elements.length; j++ ) {
				String filePath = "platform:/plugin/fr.irisa.triskell.sintaks/" + elements[j].getAttribute( "File" );
				String documentation = elements[j].getAttribute( "Documentation" );
				stsFilesRegistered.add( new SintaksFile(filePath, documentation) );
			}
		}
		
		return control;
	}
	
	@Override
	protected void okPressed() {
		super.okPressed();
		Object[] results = getResult();
		if ( (results.length == 0) && (selectedSintaksFile != null) ) {
			ArrayList l = new ArrayList();
			l.add( selectedSintaksFile );
			setResult( l );
		}
	}
}


